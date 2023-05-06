

import java.io.IOException;
import java.net.URL;
import javafx.fxml.FXML;

import java.util.ResourceBundle;
import javafx.fxml.Initializable;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.control.Button;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import java.util.ArrayList;
import javafx.scene.control.*;
import javafx.event.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;




public class AddController implements Initializable {
    
    //PREVENT DUPLICATE FIGHTERS!!
    //do this by checking the arraylist for the first and last name combined 
    
    
    
    
    @FXML
    private Text displayMessage;
    
    @FXML
    private TextField firstNameBoxAdd;    
    
    @FXML
    private TextField lastNameBoxAdd;    
    
    @FXML
    private TextField countryBox;    
    
    @FXML
    private TextField feetTallBox;   
    
    @FXML
    private TextField inchesTallBox;   
    
    @FXML
    private TextField sexBox;  
    
    @FXML
    private TextField weightBox;  
    
    @FXML
    private TextField reachBox;   
    
    @FXML
    private TextField fighterStyleBox;  
    
    @FXML
    private TextField ageBox;   
    
    @FXML
    private TextField winsBox;   
    
    @FXML
    private TextField lossesBox;   
    
    @FXML
    private TextField drawsBox;  
    
    @FXML
    private TextField noContestsBox;   
    
    @FXML
    private Button createNewFighterButton;
    

    
   
    
    
    String firstName;
    String lastName;
    String country;
    int heightFeet;
    int heightInches;
    String sex;
    int weight;
    int reach;
    String style;
    int age;
    int wins;
    int losses;
    int draws;
    int noContests;
    boolean validFighter;
    boolean fighterExistsAlready;
    String displayText;
    Color redPaint = new Color(1.0, 0.0, 0.0, 1.0);
    Color greenPaint = new Color(0.0, 1.0, 0.0, 1.0);
    public void addFighterSubmitted(){
       
        displayText = "";
        displayMessage.setText("");
        
        validFighter = true;
        fighterExistsAlready = false;
       
        firstName = firstNameBoxAdd.getText();
        lastName = lastNameBoxAdd.getText();
        
        
        String addedFullName = firstName + " " + lastName;
        
        for (int i = 0; i < Main.getAllFighters().size(); i++) {
            String existingFirstName = Main.getAllFighters().get(i).getFirstName();
            String existingLastName = Main.getAllFighters().get(i).getLastName();
            String existingFullName = existingFirstName + " " + existingLastName;
            
            if (existingFullName.equalsIgnoreCase(addedFullName)){
                fighterExistsAlready = true;
                break;
            }
            else{
                
            }
        }
       
        
        
        if (fighterExistsAlready == true){
            
            
            displayText = String.format("%s %s is already in the system.\n", firstName, lastName);
            displayMessage.setFill(redPaint);
            displayMessage.setText(displayText);
            
            
            
        }
        else{
        country = countryBox.getText();
        
        try{
        heightFeet = Integer.parseInt(feetTallBox.getText());
        }catch(NumberFormatException heightInchError){
            displayText = String.format("\"%s\" is not a valid measurement for Height-Feet.\n", feetTallBox.getText());
            displayMessage.setFill(redPaint);
            displayMessage.setText(displayText);
            
            
            validFighter = false;
            //make text color red
        }
        
        try{
        heightInches = Integer.parseInt(inchesTallBox.getText());
        }catch(NumberFormatException heightCmError){
            
            displayText = String.format("\"%s\" is not a valid measurement for Height-Inches.\n", inchesTallBox.getText());
            displayMessage.setFill(redPaint);
            displayMessage.setText(displayText);
            
            
            validFighter = false;
            //make text color red
        }
        sex = sexBox.getText();
        
        try{
        weight = Integer.parseInt(weightBox.getText());
        }catch(NumberFormatException weightError){
            displayText = String.format("\"%s\" is not a valid measurement for Weight-lbs.\n", weightBox.getText());
            displayMessage.setFill(redPaint);
            displayMessage.setText(displayText);
            
          
            validFighter = false;
            //make text color red
        }
        
        try{
        reach = Integer.parseInt(reachBox.getText());
        }catch(NumberFormatException reachError){
            displayText = String.format("\"%s\" is not a valid measurement for Reach-Inches.\n", reachBox.getText());
            displayMessage.setFill(redPaint);
            displayMessage.setText(displayText);
           
          
            
            validFighter = false;
            //make text color red
        }
        
        style = fighterStyleBox.getText();
        
        try{
        age = Integer.parseInt(ageBox.getText());
        }catch(NumberFormatException ageError){
            displayText = String.format("\"%s\" is not a valid Age.\n", ageBox.getText());
            displayMessage.setFill(redPaint);
            displayMessage.setText(displayText);
            
         
            validFighter = false;
            //make text color red
        }
        
        try{
        wins = Integer.parseInt(winsBox.getText());
        }catch(NumberFormatException winsError){
            displayText = String.format("\"%s\" is not a valid win count.\n", winsBox.getText());
            displayMessage.setFill(redPaint);
            displayMessage.setText(displayText);
           
            
            validFighter = false;
            //make text color red
        }
        try{
        losses = Integer.parseInt(lossesBox.getText());
        }catch(NumberFormatException lossesError){
            displayText = String.format("\"%s\" is not a valid loss count.\n", lossesBox.getText());
            displayMessage.setFill(redPaint);
            displayMessage.setText(displayText);
            
           
            validFighter = false;
            //make text color red
        }
        try{
        draws = Integer.parseInt(drawsBox.getText());
        }catch(NumberFormatException drawsError){
            displayText = String.format("\"%s\" is not a valid draws count.\n", drawsBox.getText());
            displayMessage.setFill(redPaint);
            displayMessage.setText(displayText);
            
            
            validFighter = false;
            //make text color red
        }
        
        try{
        noContests = Integer.parseInt(noContestsBox.getText());
        }catch(NumberFormatException noContestsError){
            displayText = String.format("\"%s\" is not a valid No Contests count.\n", noContestsBox.getText());
            displayMessage.setFill(redPaint);
            displayMessage.setText(displayText);
            
           
            validFighter = false;
            //make text color red
        }
        
        
        if(validFighter == true){
            
            
            Fighter newFighter = new Fighter(firstName, lastName,  country, heightFeet,  heightInches,  sex,  weight,  reach,  style,  age,  wins,  losses,  draws,  noContests);
            
           Main.getAllFighters().add(newFighter);
//            Main.allFighters.add(newFighter);
//            System.out.println(newFighter);
            displayMessage.setFill(greenPaint);
            displayText = String.format("Fighter Added Successfully\n");
            
            
            displayMessage.setText(displayText);
            
            
           

        }
        else{
//            System.out.println("Please try again."); //then highlight incorrect fields somehow
//            System.out.println();
            displayMessage.setFill(redPaint);
            displayText = String.format("Please correct the data and try again.\n");
            displayMessage.setText(displayText);
            
            
            
        }
        }
        
    }
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
