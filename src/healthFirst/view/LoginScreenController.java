package healthFirst.view;
import healthFirst.MainApp;
import javafx.fxml.FXML;

public class LoginScreenController {
    private MainApp mainApp;

    /**
     * The constructor.
     * The constructor is called before the initialize() method.
     */
    public LoginScreenController() {
    }
    
    @FXML
    private void initialize() {
    
    }
    
    
    /**
     * Is called by the main application to give a reference back to itself.
     * 
     * @param mainApp
     */
    public void setMainApp(MainApp mainApp) {
        this.mainApp = mainApp;
        }    
    
    @FXML
    private void handleDoctor() {
        //dialogStage.close();

    	System.out.println("LoginScreen called handleDoctor, I'll call showDoctor");
      mainApp.showDoctor();
    }
    
    
    
    
    
    
    
    
}
