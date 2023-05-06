/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/javafx/FXMLController.java to edit this template
 */

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

/**
 * FXML Controller class
 *
 * @author jovyp
 */
public class SearchController implements Initializable {

    @FXML
    private TextField firstNameBox;
    
    @FXML
    private TextField lastNameBox;
    
    @FXML
    private Button submitSearchButton;
    
    @FXML
    private Text searchResultsText;
    
    @FXML
    private Text displayFighterName;
    
    @FXML
    private Text displayFighterCountry;
    
    @FXML
    private Text displayFighterHeight;
    
    @FXML
    private Text displayFighterWeight;
    
    @FXML
    private Text displayFighterDivision;
    
    @FXML
    private Text displayFighterReach;
    
    @FXML
    private Text displayFighterStyle;
    
    @FXML
    private Text displayFighterAge;
    
    @FXML
    private Text displayFighterRecord;
    
    
    
    
    
    
    
    String firstName;
    String lastName;
    int fighterIndex;
    
    
  public void searchSubmitted(){
      
      
      
      firstName = firstNameBox.getText();    //This is the name entered in the search field for first name.
      lastName = lastNameBox.getText();     //this is the name entered in the search field for last name.
      
      String addedFullName = firstName + " " + lastName;  //combines the entered first and last names into one full name string for simplification
      
        for (int i = 0; i < Main.getAllFighters().size(); i++) {             //traverses the entire fighter array.
            String existingFirstName = Main.getAllFighters().get(i).getFirstName();   //combines the first and last names of the fighter at index i
            String existingLastName = Main.getAllFighters().get(i).getLastName();
            String existingFullName = existingFirstName + " " + existingLastName;
            
            if(existingFullName.equalsIgnoreCase(addedFullName)){    //if the searched fighter's name is equal to the fighter's name at this index in the fighter array
                fighterIndex = i;
                break;
            }
            else{
                fighterIndex = -1;    //else
            }
            
        }
        
        if(fighterIndex == -1){      //if the searched fighter was not found
           Color redPaint = new Color(1.0, 0.0, 0.0, 1.0); 
            searchResultsText.setText(firstName + " " + lastName + " was not found.");
            searchResultsText.setFill(redPaint);
        }
        else{    //prints out the searched fighter's stats if the name was found.
            searchResultsText.setText("");
            
        addedFullName = Main.getAllFighters().get(fighterIndex).getFirstName() + " " + Main.getAllFighters().get(fighterIndex).getLastName();
        String height = String.format("%d\' %d\"", Main.getAllFighters().get(fighterIndex).getHeightFeet(), Main.getAllFighters().get(fighterIndex).getHeightInches());
        String weight = String.format("%d",Main.getAllFighters().get(fighterIndex).getWeight());
        String reach = String.format("%d\"",Main.getAllFighters().get(fighterIndex).getReach());
        String age = String.format("%d",Main.getAllFighters().get(fighterIndex).getAge());
        String record = String.format("%d Wins | %d Losses | %d Draws | %d NC\n", Main.getAllFighters().get(fighterIndex).getWins(), Main.getAllFighters().get(fighterIndex).getLosses(), Main.getAllFighters().get(fighterIndex).getDraws(), Main.getAllFighters().get(fighterIndex).getNoContests());
        
        
        displayFighterName.setText(addedFullName);
        displayFighterCountry.setText(Main.getAllFighters().get(fighterIndex).getCountry());
        displayFighterHeight.setText(height);
        displayFighterWeight.setText(weight);
        displayFighterDivision.setText(Main.getAllFighters().get(fighterIndex).getDivision());
        displayFighterReach.setText(reach);
        displayFighterStyle.setText(Main.getAllFighters().get(fighterIndex).getStyle());
        displayFighterAge.setText(age);
        displayFighterRecord.setText(record);
        
        }
      
  }
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        
    }    
    
}
