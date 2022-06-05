module com.example.localchat {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;
    requires sqlite.jdbc;
    requires org.apache.commons.io;


    opens com.example.localchat to javafx.fxml;
    exports com.example.localchat;
}