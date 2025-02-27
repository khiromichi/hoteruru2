package com.example.samuraitravel22;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TestMySQLConnection {
    public static void main(String[] args) {
        String url = "jdbc:mysql://127.0.0.1:3306/samuraitravel22_db";
        String user = "root";
        String password = "Hiro_11924869"; // 設定したパスワードに変更

        try {
            Connection conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("✅ MySQL 接続成功！");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}

