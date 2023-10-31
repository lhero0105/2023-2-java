package com.green.day24;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

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
