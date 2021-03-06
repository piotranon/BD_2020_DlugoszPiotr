package controllers;

/**
 * Sample Skeleton for 'menu.fxml' Controller Class
 */

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.stage.Stage;

public class menu {

    public Stage stage;

    @FXML // ResourceBundle that was given to the FXMLLoader
    private ResourceBundle resources;

    @FXML // URL location of the FXML file that was given to the FXMLLoader
    private URL location;

    @FXML
    void ksiazki(ActionEvent event) throws IOException{
        render.booksLogged();
    }

    @FXML
    void logout(ActionEvent event) throws IOException {
        render.books();
    }

    @FXML
    void klienci(ActionEvent event) throws IOException {
        render.customers();
    }

    @FXML
    void zwrot(ActionEvent event) throws IOException {
        render.returnBook();
    }

    @FXML // This method is called by the FXMLLoader when initialization is complete
    void initialize() {

    }
}
