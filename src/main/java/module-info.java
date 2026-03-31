module com.mateicrainiceanu.lab05studentmanager {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.mateicrainiceanu.lab05studentmanager to javafx.fxml;
    exports com.mateicrainiceanu.lab05studentmanager;
}