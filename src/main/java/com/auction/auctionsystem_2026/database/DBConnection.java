package com.auction.auctionsystem_2026.database;

import java.sql.Connection;
import java.sql.DriverManager;

/**
 * PROJECT: AUCTION SYSTEM 2026
 * AUTHOR: NGUYEN VIET HUNG
 * DESCRIPTION: kết nối cơ sở dữ liệu MySQL
 */
public class DBConnection {
    public static Connection getConnection() {
        Connection conn = null;
        try {
            // Địa chỉ kho dữ liệu trên máy
            String url = "jdbc:mysql://localhost:3306/auction_system_2026";

            // Tên đăng nhập mặc định
            String user = "root";

            // gõ mật khẩu MySQL của bạn vào
            String password = "123456";

            conn = DriverManager.getConnection(url, user, password);

            // Dòng này sẽ hiện ở bảng thông báo (Console) khi chạy để bạn biết là đã thông
            System.out.println(">>> [Hệ thống]: Kết nối MySQL thành công!");

        } catch (Exception e) {
            System.out.println(">>> [Lỗi]: Không thể kết nối Database. hãy kiểm tra lại mật khẩu!");
            e.printStackTrace();
        }
        return conn;
    }
}