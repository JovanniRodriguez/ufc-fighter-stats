
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
import javafx.scene.control.ScrollBar;

public class ViewAllController implements Initializable {

    @FXML
    private ScrollPane viewAllResults;
    
    @FXML
    private Text viewAllText;
    
    
    
    
    
    
    @Override
    public void initialize(URL url, ResourceBundle rb) {
        //this method simply loops through the ENTIRE fighter array and prints out all the info for each fighter, default and added.
       String s = "";
       
       
        for (int i = 0; i < Main.getAllFighters().size(); i++) {
            
        int fighterIndex = i;
        
        
        s += String.format("Fighter Name:    %s %s\n", Main.getAllFighters().get(i).getFirstName(), Main.getAllFighters().get(i).getLastName());
        s += String.format("Country:         %s\n", Main.getAllFighters().get(i).getCountry());
        s += String.format("Height:          %d'%d\"\n", Main.getAllFighters().get(i).getHeightFeet(), Main.getAllFighters().get(i).getHeightInches());
        s += String.format("Weight:          %d\n", Main.getAllFighters().get(i).getWeight());       
        s += String.format("Division:        %s\n", Main.getAllFighters().get(i).getDivision());
        s += String.format("Reach:           %d Inches\n", Main.getAllFighters().get(i).getReach());
        s += String.format("Fight Style:     %s\n", Main.getAllFighters().get(i).getStyle());
        s += String.format("Age:             %d\n", Main.getAllFighters().get(i).getAge());
        s += String.format("Record:          %d Wins | %d Losses | %d Draws | %d NC\n", Main.getAllFighters().get(i).getWins(), Main.getAllFighters().get(i).getLosses(), Main.getAllFighters().get(i).getDraws(), Main.getAllFighters().get(i).getNoContests());
        s += String.format("\n");
        
        
        }
        s += " ";
        s += "END OF STATS--------------------------------------------------------";
        System.out.println(Main.getAllFighters().size());
        viewAllText.setText(s);
      
    }    
    
}
