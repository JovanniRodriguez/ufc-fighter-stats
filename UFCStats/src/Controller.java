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

/**
 * FXML Controller class
 *
 * @author jovyp
 */
public class Controller implements Initializable {

    

    
    public void openSearchWindow(){      //This is attached to the search button, and runs the search window when clicked. 
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Search.fxml"));
            Parent root = loader.load();
            
            Main.getSearchStage().setScene(new Scene(root));
            
            Main.getSearchStage().show();
        }catch(IOException ex){
            
        }
    }
    
    
    public void openAddWindow(){     //This is attached to the add fighter button, and runs the add fighter window when clicked.
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("Add.fxml"));
            Parent root = loader.load();
             
            Main.getAddStage().setScene(new Scene(root));
            
            Main.getAddStage().show();
        }catch(IOException ex){
            
        }
    }
    
    
    public void openViewAllWindow(){     //This is attached to the view all button, and then runs the view all stats window when clicked.
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("ViewAll.fxml"));
            Parent root = loader.load();
            
            Main.getViewAllStage().setScene(new Scene(root));
            
            Main.getViewAllStage().show();
        }catch(IOException ex){
            
        }
    }
    
    
    
    
    
    public void searchButtonClicked(){ //This is what actually CALLS that opensearchwindow() method once the button is clicked
        //when the search button is clicked, this needs to
        //open the search fighter scene/window
        System.out.println("user clicked the search button");
        openSearchWindow();
    }
    
    
    public void addFighterButtonClicked(){ //This is what actually CALLS that openaddfighterwindow() method once the button is clicked.
        System.out.println("user clicked the add fighter button");
        openAddWindow();
    }
    
    
    public void viewAllButtonClicked(){ //This is what actually CALLS the openviewallwindow() method once the button is clicked.
        System.out.println("user clicked the view all button");
        openViewAllWindow();
    }
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        // TODO
    }    
    
}
