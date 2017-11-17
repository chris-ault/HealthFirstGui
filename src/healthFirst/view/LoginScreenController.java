package healthFirst.view;
import healthFirst.MainApp;
import javafx.fxml.FXML;

public class LoginScreenController {
	
    private MainApp mainApp;
    private String user = "Doctor";
    
	//MainApp userVar = new MainApp();

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
    private void handleUser() {
        
    	// Set User variable = doctor 
    	// show Patient Selection
    	// Patient selection sets patient variable 
    	// Patient selection then calls showUser
    	// showUser checks User Variable then 
    	
    	//System.out.println("LoginScreen called handleDoctor, I'll call showDoctor");
    	
    	//user = userVar.getUser();

    	System.out.println(user);
    	
    	if(user == "Doctor")
    		mainApp.showDoctor();
    	if(user == "Nurse")
    		mainApp.showNurse();
    	if(user == "Admin")
    		mainApp.showAdmin();
    	if(user == "Pharma")
    		mainApp.showPharmacist();	

    }    
    
    @FXML
    private void handleDoctor() {
        
    	// Set User variable = doctor 
    	// show Patient Selection
    	// Patient selection sets patient variable 
    	// Patient selection then calls showUser
    	// showUser checks User Variable then 
    	
    	user = "Doctor";
    	//mainApp.showDoctor();
    	mainApp.showPatientSelection();
    	
    }
    
    @FXML
    private void handleNurse() {
        //dialogStage.close();
    	//userVar.setUser("Nurse");

    	user = "Nurse";
    	System.out.println("handleNurse from LoginController");
      //mainApp.showNurse();
    	mainApp.showPatientSelection();
    }
    
    @FXML
    private void handlePharmacist() {
        //dialogStage.close();
    	user = "Pharma";
    	System.out.println("handlePharmacist from LoginController");
     // mainApp.showPharmacist();
    	System.out.println(user);
    	mainApp.showPatientSelection();

    }
    
    @FXML
    private void handleAdministrator() {
        //dialogStage.close();
    	user = "Admin";
    	System.out.println("handleAdmin from LoginController");
      //mainApp.showPharmacist();
    	mainApp.showPatientSelection();

    }    
    
    
    @FXML
    private void handlePatientSelect() {
        //dialogStage.close();

    	System.out.println("handlePharmacist from LoginController");
      mainApp.showPatientSelection();
    }
    
    @FXML
    private void handleUserSelect() {
        //dialogStage.close();

    	System.out.println("handlePharmacist from LoginController");
      mainApp.showPersonOverview();
    }   
    
}
