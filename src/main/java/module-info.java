module es.israeldelamo.tiledcarga {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.israeldelamo.tiledcarga to javafx.fxml;
    exports es.israeldelamo.tiledcarga;
}