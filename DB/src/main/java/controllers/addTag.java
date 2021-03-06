package controllers;

import entity.Ksiazki;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;
import org.hibernate.procedure.ProcedureCall;

import javax.persistence.ParameterMode;

public class addTag {

    @FXML
    private Button close;

    @FXML
    private TextField tag;

    @FXML
    void add(ActionEvent event) {
        boolean er=false;
        boolean validData = true;
        try {

        if(tag.getText().isEmpty())
            validData = false;

        if(!validData)
            return;

        if(!db.session.getTransaction().isActive())
            db.session.beginTransaction();
        ProcedureCall call = db.session.createStoredProcedureCall("Dodawanie.Tag");
        call.registerParameter(1, String.class, ParameterMode.IN);
        call.setParameter(1,tag.getText());



            call.executeUpdate();
        }catch (Exception e)
        {
            Alert alert = new Alert(Alert.AlertType.ERROR);
            alert.setTitle("Błąd");
            alert.setHeaderText("Błąd podczas dodawania");
            alert.setContentText("Wystąpił błąd podczas dodawania.");
            alert.showAndWait();
            close(event);
        }
        db.session.getTransaction().commit();

        if(!er)
            close(event);
    }

    @FXML
    void close(ActionEvent event) {
        ((Stage)close.getScene().getWindow()).close();
    }

}
