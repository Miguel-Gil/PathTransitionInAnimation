module es.ieslosmontecillos.pathtransitioninanimation {
    requires javafx.controls;
    requires javafx.fxml;


    opens es.ieslosmontecillos.pathtransitioninanimation to javafx.fxml;
    exports es.ieslosmontecillos.pathtransitioninanimation;
}