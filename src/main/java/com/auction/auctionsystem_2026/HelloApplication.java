package com.auction.auctionsystem_2026;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;
import java.io.IOException;

public class HelloApplication extends Application {
    @Override
    public void start(Stage stage) throws IOException {
        // Tải file giao diện từ thư mục resources
        FXMLLoader fxmlLoader = new FXMLLoader(HelloApplication.class.getResource("hello-view.fxml"));

        // Thiết lập kích thước 600x400 để không bị vỡ giao diện
        Scene scene = new Scene(fxmlLoader.load(), 600, 400);

        stage.setTitle("Hệ Thống Đấu Giá 2026");
        stage.setScene(scene);
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}