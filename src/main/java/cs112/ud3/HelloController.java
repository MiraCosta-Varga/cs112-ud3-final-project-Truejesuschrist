package cs112.ud3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.stage.Stage;

import java.io.IOException;

public class HelloController {

    @FXML
    protected void onStartButtonClick(ActionEvent actionEvent) throws IOException {

        Parent profileView = FXMLLoader.load(HelloApplication.class.getResource("profile-view.fxml"));
        Scene profileViewScene = new Scene(profileView);

        Stage window = (Stage) ((Node)actionEvent.getSource()).getScene().getWindow();

        window.setScene(profileViewScene);
        window.show();
    }
}