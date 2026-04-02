package com.auction.auctionsystem_2026.views;

import com.auction.auctionsystem_2026.database.DBConnection;
import javafx.fxml.FXML;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class HelloController {
    @FXML private TextField txtUsername;
    @FXML private PasswordField txtPassword;

    @FXML
    protected void onLoginClick() {
        String user = txtUsername.getText();
        String pass = txtPassword.getText();

        try {
            // Sử dụng file kết nối DB của Hưng [cite: 141]
            Connection conn = DBConnection.getConnection();

            // Câu lệnh SQL kiểm tra tài khoản và vai trò [cite: 32, 130]
            String sql = "SELECT * FROM users WHERE username = ? AND password = ?";
            PreparedStatement pstmt = conn.prepareStatement(sql);
            pstmt.setString(1, user);
            pstmt.setString(2, pass);

            ResultSet rs = pstmt.executeQuery();

            if (rs.next()) {
                String role = rs.getString("role");
                System.out.println(">>> [Hệ thống]: Đăng nhập thành công!");
                System.out.println(">>> Chào mừng " + role + ": " + user);
                // Sau này sẽ code chuyển màn hình tại đây [cite: 64]
            } else {
                System.out.println(">>> [Lỗi]: Sai tài khoản hoặc mật khẩu!");
            }
        } catch (Exception e) {
            System.out.println(">>> [Lỗi]: Không thể kết nối Database!");
            e.printStackTrace();
        }
    }
}