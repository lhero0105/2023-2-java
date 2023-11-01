package com.green.day24;

import org.mariadb.jdbc.Driver;

import java.sql.*;

public class Myconn {
    private static final String DB_URL = "jdbc:mariadb://localhost:3306/board_ver1";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "green502";

    public static Connection getConn() {
        Connection conn = null;
        try {
            Class.forName("org.mariadb.jdbc.Driver");
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            // 인터페이스 conn 이 임플리먼트를 구현한 객체의 주솟값을 담을 수 있습니다.
            // 규격이라 생각하면 됩니다 > 인터페이스로 오라클 마리아DB 등 다 사용가능합니다.
        } catch (Exception e) {
            System.out.println("에러발생!!!");
            e.printStackTrace();
        }
        System.out.println("접속성공!!");
        return conn;
    }

    public static void close(Connection conn, PreparedStatement ps) {
        try {
            if (ps != null) {
                ps.close(); // ps null이면 error납니다
            }
/*            if (conn != null) {
                conn.close();
            } // 이렇게 되면 위에서 에러 터질 때 실행이 안됩니다.*/
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public static void close(Connection conn, PreparedStatement ps, ResultSet rs) {

        if (rs != null) {
            try {
                rs.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            close(conn, ps);

        }
    }

}
