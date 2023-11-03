package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BoardDao { // data access object - 데이터와 통신하는 객체
    public static int insBoard(BoardEntity entity) { // 선언부를 클래스 객체로 지정해주므로써 구현부만 수정하면 됩니다. > 수정에 용이
        // Vo - value Object : 객체 자체가 값, 값이 변경이 안됩니다.
        // Dto - Data Transfer Object : 데이터를 옮길 때 사용하는 객체(가공이 필요하기에 setter가 있습니다.)
        // Entity - Entity : 객체와 1:1로 매칭되는 경우 (title - title .. updateAt - update_at)
        int result = 0;
        String sql1 = String.format("INSERT INTO board(title, ctnts, writer) " +
                        "VALUES " +
                        "('%s', '%s', '%s')"
                , entity.getTitle(), entity.getCtnts(), entity.getWriter());
        String sql2 = "INSERT INTO board(title, ctnts, writer) " +
                "VALUES " +
                "(?, ?, ?)"; // prepare statement : 내부에서 알아서 홑따옴표을 붙이고 빼줍니다.
        String sql = "INSERT INTO board " +
                "SET title = ?" +
                ", ctnts = ?" +
                ", writer = ?"; // 오라클에서 사용이 되는지는 모릅니다.
        System.out.println(sql);
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Myconn.getConn(); // 마리아디비의 구현된 객체에서 왔습니다.
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());

            result = ps.executeUpdate(); // 열향 받은 행
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Myconn.close(con, ps);// 리소스를 많이 잡아먹기에 꼭 닫아줍니다.(만들어진것의 역순step방식)
        }
        return result;
    }

    // 검색, 페이징
    public static int delBoard(BoardEntity entity) {
        int result = 0;
        String sqlD = "DELETE FROM board WHERE iboard = ?";// 추가 쿼리문으로 내가 삭제 하는게 맞는지 검증
        Connection con = null;
        PreparedStatement ps = null;
        try {
            con = Myconn.getConn();
            ps = con.prepareStatement(sqlD);
            ps.setInt(1, entity.getIboard());
            result = ps.executeUpdate();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Myconn.close(con, ps);
        }
        return result;
    }
    // List<BoardEntity>라도 모든 언어의 리턴타입은 하나이기에
    // 이 타입에 빼곡하게 쌓아서 주솟값 하나를 리턴합니다.
    public static List<BoardEntity> selBoardList(){ // 파라미터 x : 전부 다 사용하겠다는 의미입니다.
        List<BoardEntity> list = new ArrayList<>();
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null; // select 했을 때 결과물이 담기는 란입니다.
        String sql = "SELECT iboard, title, writer, created_at FROM board";
        try {
            con = Myconn.getConn();
            ps = con.prepareStatement(sql);
            rs = ps.executeQuery(); // select 문만 무조건 executeQuery입니다.

            while (rs.next()){ // 레코드 수만큼 반복 > 첫번째 레코드를 호출합니다 없으면 false // if (rs.next()) > 한줄이 있는지 없는지
               int iboard = rs.getInt("iboard");
               String title = rs.getString("title");
               //String ctnts = rs.getString("ctnts");
               String writer = rs.getString("writer");
               String createdAt = rs.getString("created_at");
               //String updatedAt = rs.getString("updeted_at");

               BoardEntity entity = new BoardEntity();
               entity.setIboard(iboard);
               entity.setTitle(title);
               //entity.setCtnts(ctnts);
               entity.setWriter(writer);
               entity.setCreatedAt(createdAt);
               //entity.setUpdatedAt(updatedAt);
               list.add(entity);
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Myconn.close(con, ps, rs);
        }
        return list;
    }
    public static int updBoard(BoardEntity entity){
        int result = 0;
        Connection con = null;
        PreparedStatement ps = null;
        String sql = "UPDATE board " +
                "SET title = ? " +
                ", ctnts = ? " +
                ", writer = ? " +
                ", updated_at = now() " +
                "WHERE iboard = ?";
        try{
            con = Myconn.getConn();
            ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());
            ps.setInt(4, entity.getIboard());
            result = ps.executeUpdate();
        }catch (Exception e){
            e.printStackTrace();
        }finally {
            Myconn.close(con, ps);
        }
        return result;
    }
    public static BoardEntity selBoardById(int num){
        Connection con = null;
        PreparedStatement ps = null;
        ResultSet rs = null; // select 했을 때 결과물이 담기는 란입니다.
        String sql = "SELECT iboard, title, writer, ctnts, created_at, updated_at " +
                     "FROM board WHERE iboard = ?"; // pk - 얻어오는 값은 0,1 두가지입니다
        try {
            con = Myconn.getConn();
            ps = con.prepareStatement(sql);
            ps.setInt(1, num);
            rs = ps.executeQuery(); // select 문만 무조건 executeQuery입니다. 나머지는 executeUpdate.
            if (rs.next()){ // 레코드 수만큼 반복, next() 처음엔 첫줄, 다음 다음 줄 선택 > 첫번째 레코드를 호출합니다 없으면 false // if (rs.next()) > 한줄이 있는지 없는지
                BoardEntity entity = new BoardEntity();
                String title = rs.getString("title");
                String ctnts = rs.getString("ctnts");
                String writer = rs.getString("writer");
                String createdAt = rs.getString("created_at");
                String updatedAt = rs.getString("updated_at");

                entity.setIboard(num);
                entity.setTitle(title);
                entity.setCtnts(ctnts);
                entity.setWriter(writer);
                entity.setCreatedAt(createdAt);
                entity.setUpdatedAt(updatedAt);
                return entity;
            }
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            Myconn.close(con, ps, rs);
        }
        return null;
    }

    // 종료방식 First in last out 먼저 생성한 해 부터 닫습니다.
}