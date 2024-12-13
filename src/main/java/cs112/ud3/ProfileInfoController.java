package cs112.ud3;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.Node;
import javafx.scene.control.Label;
import javafx.stage.Stage;

public class ProfileInfoController {

    private String name;

    @FXML
    private Label nameLabel, weightLabel, heightLabel, quickTipLabel;

    protected void initData(String name, int weight, int height, String quickTip) {
        nameLabel.setText(name);
        weightLabel.setText(String.valueOf(weight+"lbs"));
        heightLabel.setText(String.valueOf(height+"cm"));
        quickTipLabel.setText(quickTip);
    }



    @FXML
    protected void onExitButtonClick (ActionEvent actionEvent) {
        Stage stage = (Stage) ((Node) actionEvent.getSource()).getScene().getWindow();
        stage.close();
    }
}