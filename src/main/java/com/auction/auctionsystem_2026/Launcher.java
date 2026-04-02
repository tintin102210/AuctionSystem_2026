package com.auction.auctionsystem_2026;

import com.auction.auctionsystem_2026.database.DBConnection;
import javafx.application.Application;

public class Launcher {
    public static void main(String[] args) {
        DBConnection.getConnection();
        Application.launch(HelloApplication.class, args);
    }
}