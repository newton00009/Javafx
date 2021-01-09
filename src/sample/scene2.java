package sample;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import java.io.IOException;

public class scene2 {


    public void mainpage(MouseEvent event) throws IOException {
        Parent loginp = FXMLLoader.load(getClass().getResource("scene1.fxml"));
        Scene login = new Scene(loginp);
        Stage logwin = (Stage) ((Node) event.getSource()).getScene().getWindow();
        logwin.setScene(login);
        logwin.show();
    }

}