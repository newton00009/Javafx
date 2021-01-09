package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.awt.event.ActionEvent;
import java.io.IOException;

public class Controller {
    @FXML
    void loginpage(javafx.event.ActionEvent event) throws IOException
    {
        Parent loginp = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        Scene login = new Scene(loginp);
        Stage logwin = (Stage)((Node) event.getSource()).getScene().getWindow();
        logwin.setScene(login);
        logwin.show();
    }
    @FXML
    void loginpage1(MouseEvent event) throws IOException
    {
        Parent loginp = FXMLLoader.load(getClass().getResource("scene2.fxml"));
        Scene login = new Scene(loginp);
        Stage logwin = (Stage)((Node) event.getSource()).getScene().getWindow();
        logwin.setScene(login);
        logwin.show();
    }
    @FXML
    void signuppage()
    {

    }



}
