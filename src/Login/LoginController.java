package Login;

import baseDeDonnee.LoginDao;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import java.io.IOException;
import java.net.URL;
import java.sql.SQLException;
import java.util.ResourceBundle;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class LoginController implements Initializable {

    @FXML
    private JFXTextField username;
    @FXML
    private JFXPasswordField password;
    
    @FXML
    void loginAction(ActionEvent event) throws SQLException {
        String user = username.getText();
        String pass = password.getText();
        System.out.println("user : "+user +"  password : "+ pass);
        
        boolean isFounded = new LoginDao().checkLogin(user, pass);
        
        if(isFounded) {
            Parent mainView = null;
            try {
                mainView = FXMLLoader.load(getClass().getResource("/gestion_commerciale/client/FXMLDocument.fxml"));
            } catch(IOException ioe) {
                ioe.printStackTrace();
            }
            
            Stage mStage = (Stage) username.getScene().getWindow();
           //load main fenetre
            mStage.setScene(new Scene(mainView));
        } else {
            // Error msg
            System.out.println("Error !");
        }
   }
    @FXML

    void cancelBtn(ActionEvent event) {
        System.exit(0);
    }
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        
    }

}
