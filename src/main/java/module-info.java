module com.example.git_event {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.git_event.Kteam to javafx.fxml;
    exports com.example.git_event.Kteam;
}