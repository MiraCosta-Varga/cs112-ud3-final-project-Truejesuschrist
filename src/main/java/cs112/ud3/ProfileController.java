package cs112.ud3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.stage.Modality;
import javafx.stage.Stage;


import java.io.IOException;

public class ProfileController{

    public TextField txtInputName1;
    public TextField txtInputName2;
    public TextField txtInputWeight1;
    public TextField txtInputWeight2;
    public TextField txtInputHeight1;
    public TextField txtInputHeight2;

    User Profile1 = new Legs("Weston", 160, 182);

    User Profile2 = new Arms("Leighton", 140, 162);
    @FXML
    protected void onProfileButtonClick1() throws IOException {
        System.out.println(Profile1);

        String userName = Profile1.getName();

        System.out.println(Profile1);
        int userLevel = Profile1.getWeight();
        int userHeight = Profile1.getHeight();
        String catchPhrase = Profile1.List();

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
        String catchPhrase = Profile2.List();

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
    @FXML
    protected void onButtonClick(ActionEvent actionEvent) throws IOException {
        Profile1.setAll(txtInputName1.getText(),Integer.parseInt(txtInputWeight1.getText()),Integer.parseInt(txtInputHeight1.getText()));
        Profile2.setAll(txtInputName2.getText(),Integer.parseInt(txtInputWeight2.getText()),Integer.parseInt(txtInputHeight2.getText()));
    }

}