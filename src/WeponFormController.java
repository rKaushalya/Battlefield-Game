import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

import java.io.IOException;

public class WeponFormController {

    public AnchorPane weaponWindow;
    public CheckBox cbxT56B;
    public CheckBox cbxT56;
    public CheckBox cbxMultiBarrel;
    public CheckBox cbxTank;
    public CheckBox cbxBomb;
    public CheckBox cbxPistol;
    public CheckBox cbxTankB;
    public CheckBox cbxMultiBarrelB;
    public CheckBox cbxPistolB;
    public CheckBox cbxBombB;

    public void loadPlayPage(ActionEvent actionEvent) throws IOException {
        if(cbxT56.isSelected()) {
            T56 t56 = new T56();
            t56.shoot();
        } else if (cbxTank.isSelected()) {
            tank t1 = new tank();
            t1.shoot();
        } else if (cbxMultiBarrel.isSelected()) {
            multiBarrel m1 = new multiBarrel();
            m1.shoot();
        } else if (cbxPistol.isSelected()) {
            pistol p1 = new pistol();
            p1.shoot();
        } else if (cbxBomb.isSelected()) {
            bomb b1 = new bomb();
            b1.shoot();
        } else if (cbxT56B.isSelected()) {
            T56B t2 = new T56B();
            t2.shoot();
        } else if (cbxTankB.isSelected()) {
            tankB t2 = new tankB();
            t2.shoot();
        } else if (cbxMultiBarrelB.isSelected()) {
            multiBarrelB m2 = new multiBarrelB();
            m2.shoot();
        } else if (cbxPistolB.isSelected()) {
            pistolB p2 = new pistolB();
            p2.shoot();
        } else if (cbxBombB.isSelected()) {
            bombB b2 = new bombB();
            b2.shoot();
        }
        Stage stage = (Stage)weaponWindow.getScene().getWindow();
        stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("PlayAgain.fxml"))));
        stage.centerOnScreen();
    }
}
