module com.example.chessgame {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.almasb.fxgl.all;

    opens com.example.chessgame to javafx.fxml;
    exports com.example.chessgame;
}