package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

public class MyconnTest {
    public static void main(String[] args) {
        Connection conn = Myconn.getConn();
        String sql = "INSERT INTO country (country_id, country) VALUES (111, '동하나라')";

        try {
            PreparedStatement ps = conn.prepareStatement(sql);
            int result = ps.executeUpdate();
            System.out.println("result : " + result);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
class MyConnTest2 {
    public static void main(String[] args) {
        // title : 처음 작성
        // ctnts : 처음 작성하는 내용입니다.
        // writer : 홍길동
        // DB에 insert 해주세요.
        BoardEntity BE = new BoardEntity();
        BE.setTitle("추가!!");
        BE.setCtnts("11월 02일 글 씀");
        BE.setWriter("홍길동");

        int row = BoardDao.insBoard(BE);
    }
}

class MyConnTest3 {
    public static void main(String[] args) {
        BoardEntity entity = new BoardEntity();
        entity.setIboard(1);
        int row = BoardDao.delBoard(entity);
        System.out.println("row : " + row);
    }
}

class MyConnTest4{
    public static void main(String[] args){
        BoardEntity entity = new BoardEntity();
        entity.setIboard(4);
        entity.setTitle("수정 제목");
        entity.setCtnts("수정 내용");
        entity.setWriter("수정자");

        int row = BoardDao.updBoard(entity);
        System.out.println("row : " + row);
    }
}

class MyConnTest5{
    public static void main(String[] args) {
        List<BoardEntity> list = BoardDao.selBoardList();
        for (BoardEntity entity : list) {
            System.out.println(entity); // iboard : 값, title : 값, ctnts : 값, writer : 값, createdAr : 값
        }
    }
}

class MyConnTest6{
    public static void main(String[] args) {
/*        BoardEntity param = new BoardEntity();
        param.setIboard(2);*/

        BoardEntity result = BoardDao.selBoardById(5);
        System.out.println(result);
    }
}