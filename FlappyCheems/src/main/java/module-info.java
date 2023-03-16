module com.example.flappycheems {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.controlsfx.controls;
    requires org.kordamp.bootstrapfx.core;

    opens com.example.flappycheems to javafx.fxml;
    exports com.example.flappycheems;
}