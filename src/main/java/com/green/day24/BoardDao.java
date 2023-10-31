package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;

public class BoardDao { // data access object
    public static int insBoard(BoardEntity entity){
        int result = 0;
        String sql1 = String.format("INSERT INTO board(title, ctnts, writer) " +
                                    "VALUES " +
                                    "('%s', '%s', '%s')"
            , entity.getTitle(), entity.getCtnts(), entity.getWriter());
        String sql = "INSERT INTO board(title, ctnts, writer) " +
                "VALUES " +
                "(?, ?, ?)";//
        System.out.println(sql);
        try {
            Connection con = Myconn.getConn();
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, entity.getTitle());
            ps.setString(2, entity.getCtnts());
            ps.setString(3, entity.getWriter());

            result = ps.executeUpdate(); // 열향 받은 행
        } catch (Exception e){
            e.printStackTrace();
        } finally {

        }

        return result;
    }
}


class MyConnTest2{
    public static void main(String[] args) {
        // title : 처음 작성
        // ctnts : 처음 작성하는 내용입니다.
        // writer : 홍길동
        // DB에 insert 해주세요.
        BoardEntity BE = new BoardEntity();
        BE.setTitle("오늘 Insert배움");
        BE.setCtnts("java를 통해 board테이블에 값 넣어봄");
        BE.setWriter("신난다");

        BoardDao.insBoard(BE);
    }
}