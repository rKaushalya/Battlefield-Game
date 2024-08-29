import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;
import javafx.stage.Window;

import java.io.IOException;

public class MainformController {
    public AnchorPane windowA;

    public void loadWeponPageOnAction(ActionEvent actionEvent) throws IOException {
         Stage stage = (Stage)windowA.getScene().getWindow();
         stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("WeponForm.fxml"))));
         stage.centerOnScreen();
    }
}
