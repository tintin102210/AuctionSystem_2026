module com.auction.auctionsystem_2026 {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    // Cho phép JavaFX truy cập vào package views của Hưng
    opens com.auction.auctionsystem_2026.views to javafx.fxml;

    exports com.auction.auctionsystem_2026;
}