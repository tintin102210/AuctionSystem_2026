module com.auction.auctionsystem_2026 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.auction.auctionsystem_2026 to javafx.fxml;
    exports com.auction.auctionsystem_2026;
}