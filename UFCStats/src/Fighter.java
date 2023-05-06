
import java.util.ArrayList;


public class Fighter {
    //Data Members:
    
    private String firstName;     //The fighter's first name
    private String lastName;     //The fighter's last name
    private String country;    //the fighter's country
    private int heightFeet;    //the fighter's height in feet
    private int heightInches; //the fighter's height in inches
    private String sex;      //the fighter's sex
    private int weight;      //the fighter's weight (this and the above data member are used to calculate the appropriate division for the fighter.
    private int reach;       //the fighter's reach/wingspan in inches
    private String style;   // the fighter's fighting style, ex: brazilian jiu jitsu, boxing, muay thai, mma, wrestling, kickboxing etc
    private int age;       //the fighter's age in years
    private int wins;    //the fighter's total number of wins
    private int losses;   //the fighter's total number of losses
    private int draws;     //the fighter's total number of draws
    private int noContests;  //The fighter's total number of no contests.
    
   
    private String division;    //what group the fighter is in based on their sex and weight.
    
    public Fighter(String firstName, String lastName, String country, int heightFeet, int heightInches, String sex, int weight, int reach, String style, int age, int wins, int losses, int draws, int noContests) {    //Creates the new fighter object
        this.firstName = firstName;
        this.lastName = lastName;
        this.country = country;
        this.heightFeet = heightFeet;
        this.heightInches = heightInches;
        this.sex = sex;
        this.weight = weight;
        this.reach = reach;
        this.style = style;
        this.age = age;
        this.wins = wins;
        this.losses = losses;
        this.draws = draws;
        this.noContests = noContests;
        
       
         if((this.sex.equalsIgnoreCase("Male")) || (this.sex.equalsIgnoreCase("M"))){     //This branch takes the male fighter's weight and sex and uses it to determine the appropriate division.
            if((this.weight <= 126)){
                this.division = "Men's Flyweight";
            }
            else if((this.weight > 126) && (this.weight <=136)){
                this.division = "Men's Bantamweight";
            }
            else if ((this.weight > 136) && (this.weight <=146)){
                this.division = "Men's Featherweight";
            }
            else if ((this.weight > 146) && (this.weight <= 156)){
                this.division = "Men's Lightweight";
            }
            else if ((this.weight > 156) && (this.weight <= 171)){
                this.division = "Men's Welterweight";
            }
            else if ((this.weight > 171) && (this.weight <= 186)){
                this.division = "Men's Middleweight";
            }
            else if ((this.weight > 186) && (this.weight <= 206)){
                this.division = "Men's Light Heavyweight";
            }
            else if ((this.weight > 206) && (this.weight <= 265)){
                this.division = "Men's Heavyweight";
            }
            else{
                this.division = "Undetermined";
            }
            
        }
        else if((this.sex.equalsIgnoreCase("Female")) || (this.sex.equalsIgnoreCase("F"))){  //This branch takes the male fighter's weight and sex and uses it to determine the appropriate division.
            if (this.weight <= 116){
                this.division = "Women's Strawweight";
            }
            else if ((this.weight > 116) && (this.weight <= 126)){
                this.division = "Women's Flyweight";
            }
            else if ((this.weight > 126) && (this.weight <= 136)){
                this.division = "Women's Bantamweight";
            }
            else if ((this.weight > 136) && (this.weight <= 146)){
                this.division = "Women's Featherweight";
            }
            else{
                this.division = "Undetermined";
            }
        }
        
        
    }
    
    
    
   
    
    
    public String getDivision(){ //returns the calculated division for the fighter.
        return division;
    }
    
    
    
   

    
    
    public String getFirstName() {    //returns the fighter's first name
        return firstName;
    }

    public void setFirstName(String firstName) {   
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    
    public int getHeightFeet() {
        return heightFeet;
    }

    public void setHeightFeet(int heightFeet) {
        this.heightFeet = heightFeet;
    }

    public int getHeightInches() {
        return heightInches;
    }

    public void setHeightInches(int heightInches) {
        this.heightInches = heightInches;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public int getReach() {
        return reach;
    }

    public void setReach(int reach) {
        this.reach = reach;
    }

    public String getStyle() {
        return style;
    }

    public void setStyle(String style) {
        this.style = style;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWins() {
        return wins;
    }

    public void setWins(int wins) {
        this.wins = wins;
    }

    public int getLosses() {
        return losses;
    }

    public void setLosses(int losses) {
        this.losses = losses;
    }

    public int getDraws() {
        return draws;
    }

    public void setDraws(int draws) {
        this.draws = draws;
    }

    public int getNoContests() {
        return noContests;
    }

    public void setNoContests(int noContests) {
        this.noContests = noContests;
    }

   
    
    

    
    
    
    @Override
    public String toString(){    //creates a string of the fighter's info to be printed out. 
        String s = "";
        
        s += String.format("Fighter Name:    %s %s\n", firstName, lastName);
        s += String.format("Country:         %s\n", country);
        s += String.format("Height:          %d'%d\"\n", heightFeet, heightInches);
        s += String.format("Sex:             %s\n", sex);
        s += String.format("Weight:          %d\n", weight);
        s += String.format("Division:        %s\n", division);
        s += String.format("Reach:           %d Inches\n", reach);
        s += String.format("Fight Style:     %s\n", style);
        s += String.format("Age:             %d\n", age);
        s += String.format("Record:          %d Wins | %d Losses | %d Draws | %d NC\n", wins, losses, draws, noContests);
        
        
        return s;
    }
    
    
}
