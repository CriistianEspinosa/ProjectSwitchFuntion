module com.example.projectswitchfunction {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.projectswitchfunction to javafx.fxml;
    exports com.example.projectswitchfunction;
}