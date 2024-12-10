package cs112.ud3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.io.IOException;

public class ProfileController {

     User Profile1 = new Legs("Weston", 160, 182);
     User Profile2 = new Arms("Leighton", 140, 162);


    @FXML
    protected void onProfileButtonClick1() throws IOException {
        String userName = Profile1.getName();
        int userLevel = Profile1.getWeight();
        int userHeight = Profile1.getHeight();
        String catchPhrase = Profile1.catchPhrase();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(HelloApplication.class.getResource("profile-info.fxml"));
        Parent eventViewParent = loader.load();

        ProfileInfoController profileInfoController = loader.getController();
        profileInfoController.initData(userName, userLevel, userHeight, catchPhrase);

        Stage popupStage = new Stage();

        popupStage.initModality(Modality.APPLICATION_MODAL); //locks screen to current popup window

        popupStage.setScene(new Scene(eventViewParent));

        popupStage.show();
    }

    @FXML
    protected void onProfileButtonClick2() throws IOException {
        String userName = Profile2.getName();
        int userLevel = Profile2.getWeight();
        int userHeight = Profile2.getHeight();
        String catchPhrase = Profile2.catchPhrase();

        FXMLLoader loader = new FXMLLoader();
        loader.setLocation(HelloApplication.class.getResource("profile-info.fxml"));
        Parent eventViewParent = loader.load();

        ProfileInfoController profileInfoController = loader.getController();
        profileInfoController.initData(userName, userLevel, userHeight, catchPhrase);

        Stage popupStage = new Stage();

        popupStage.initModality(Modality.APPLICATION_MODAL); //locks screen to current popup window

        popupStage.setScene(new Scene(eventViewParent));

        popupStage.show();
    }

    @FXML
    protected void onExitButtonClick (ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }

}