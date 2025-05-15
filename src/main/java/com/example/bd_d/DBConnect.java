package com.example.bd_d;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnect {
    private static final String URL = "jdbc:postgresql://localhost:5432/postgres"; // Ganti 'dbmu' sesuai database kamu
    private static final String USER = "postgres"; // Ganti user kamu
    private static final String PASSWORD = "admin"; // Ganti password kamu

    public static Connection connect() {
        try {
            Connection conn = DriverManager.getConnection(URL, USER, PASSWORD);
            System.out.println("✅ Berhasil terhubung ke database PostgreSQL!");
            return conn;
        } catch (SQLException e) {
            System.out.println("❌ Gagal koneksi ke database: " + e.getMessage());
            return null;
        }
    }
}
