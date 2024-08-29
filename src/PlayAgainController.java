import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class PlayAgainController {
    public Button plyAgain;
    public Label lblScore;
    public AnchorPane playAgainWindow;

    public void initialize(){
        playerAWeponStore p1 = new playerAWeponStore();
        playerBWeponStore p2 = new playerBWeponStore();
        if(p1.tot > p2.tot2) {
            lblScore.setText("\tPlayer A Win.!   Score : " + p1.tot);
        }else {
            lblScore.setText("\tPlayer B Win.!   Score : " + p2.tot2);
        }
    }

    public void loadMainOnAction(ActionEvent actionEvent) throws IOException {
        Stage stage = (Stage)playAgainWindow.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("Mainform.fxml"))));
        stage.centerOnScreen();
    }
}
