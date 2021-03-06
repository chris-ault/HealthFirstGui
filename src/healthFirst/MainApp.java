package healthFirst;

import java.io.IOException;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.stage.Stage;
import healthFirst.view.LoginScreenController;

public class MainApp extends Application {

    private Stage primaryStage;
    public BorderPane rootLayout;
    
	//public String user = "x";
	
    @Override
    public void start(Stage primaryStage) {
        this.primaryStage = primaryStage;
        this.primaryStage.setTitle("HealthFirst");

        initRootLayout();
        showPersonOverview();
        //showDoctor();

    }

    /**
     * Initializes the root layout.
     */
    public void initRootLayout() {
        try {
            // Load root layout from fxml file.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/RootLayout.fxml"));
            rootLayout = (BorderPane) loader.load();

            // Show the scene containing the root layout.
            Scene scene = new Scene(rootLayout);
            primaryStage.setScene(scene);
            primaryStage.show();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /**
     * Shows the person overview inside the root layout.
     */
    public void showPersonOverview() {
        try {
            // Load person overview.
            FXMLLoader loader = new FXMLLoader();
            loader.setLocation(MainApp.class.getResource("view/LoginScreen.fxml"));
            AnchorPane personOverview = (AnchorPane) loader.load();
            LoginScreenController controller = loader.getController();
            controller.setMainApp(this);
            
            // Set person overview into the center of root layout.
            rootLayout.setCenter(personOverview);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showDoctor() {
    	System.out.println("Main App called showDoctor?");
        try {
            // Load the fxml file and create a new stage for the popup.
            //initialize the loader
        	FXMLLoader loader = new FXMLLoader();
        	loader.setLocation(MainApp.class.getResource("view/DoctorView.fxml"));
        	AnchorPane page = (AnchorPane) loader.load();
            
            //We'd like it to be centered
            rootLayout.setCenter(page);
            
            // The controller needs access to the main app.
            LoginScreenController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public void showNurse() {
    	System.out.println("Called showNurse from MainApp");
        try {
            // Load the fxml file and create a new stage for the popup.
            //initialize the loader
        	FXMLLoader loader = new FXMLLoader();
        	loader.setLocation(MainApp.class.getResource("view/NurseView.fxml"));
        	AnchorPane page = (AnchorPane) loader.load();
            
            //We'd like it to be centered
            rootLayout.setCenter(page);
            
            // The controller needs access to the main app.
            LoginScreenController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showPharmacist() {
    	System.out.println("Called showNurse from MainApp");
        try {
            // Load the fxml file and create a new stage for the popup.
            //initialize the loader
        	FXMLLoader loader = new FXMLLoader();
        	loader.setLocation(MainApp.class.getResource("view/PharmacistView.fxml"));
        	AnchorPane page = (AnchorPane) loader.load();
            
            //We'd like it to be centered
            rootLayout.setCenter(page);
            
            // The controller needs access to the main app.
            LoginScreenController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    public void showAdmin() {
    	System.out.println("Called showAdmin from MainApp");
        try {
            // Load the fxml file and create a new stage for the popup.
            //initialize the loader
        	FXMLLoader loader = new FXMLLoader();
        	loader.setLocation(MainApp.class.getResource("view/AdministratorView.fxml"));
        	AnchorPane page = (AnchorPane) loader.load();
            
            //We'd like it to be centered
            rootLayout.setCenter(page);
            
            // The controller needs access to the main app.
            LoginScreenController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }    
    public void showPatientSelection() {
        try {
            // Load the fxml file and create a new stage for the popup.
            //initialize the loader
        	FXMLLoader loader = new FXMLLoader();
        	loader.setLocation(MainApp.class.getResource("view/PatientSelection.fxml"));
        	AnchorPane page = (AnchorPane) loader.load();
            
            //We'd like it to be centered
            rootLayout.setCenter(page);
            
            // The controller needs access to the main app.
            LoginScreenController controller = loader.getController();
            controller.setMainApp(this);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    
    
    /**
     * Returns the main stage.
     * @return
     */
    public Stage getPrimaryStage() {
        return primaryStage;
    }

    public static void main(String[] args) {
        launch(args);
    }
    

    
}