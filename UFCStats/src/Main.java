//Name: Jovanni Rodriguez
//Date: 4-28-2023
//email: Jovips1@gmail.com
//Course number: CSC 2290
//Program 5 - UFC Stats
//"I will practice academic and personal integrity and excellence of character and expect the same from others."




//NOTES FROM YESTERDAY ************************
          //*************************************
//addCharacter works fine, but not pretty.

//need to remove whitespace from ALL string values. this ignores any accidental spaces (big issue)
//maybe add nicknames?

import java.io.IOException;
import java.util.ArrayList;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.StackPane;
import javafx.stage.Stage;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.stage.Modality;




public class Main extends Application {
    
   private static ArrayList<Fighter> allFighters = new ArrayList<>(); //creates arraylist to store all of the fighter objects in
   
  
    
  
    
    private static Stage searchStage = null;      //creates the search scene/stage
    private static Stage addStage = null;         //creates add fighter scene/stage
    private static Stage viewAllStage = null;     //creates the view all stats scene/stage

    
    

    
    @Override
    public void start(Stage primaryStage) throws IOException {       //when the program is run
       Parent root = FXMLLoader.load(getClass().getResource("UFCStats.fxml"));
       primaryStage.setTitle("UFC Stats - Main Menu");     //first run the main menu scene
       primaryStage.setScene(new Scene(root));
       primaryStage.show();
        
        createSearchStage();  //adds the search scene
        createAddStage();      //adds the add fighter scene
        createViewAllStage();  //adds the view all stage
        
        
    }
    
    
    public void createSearchStage(){       //actually creates the search stage
        searchStage = new Stage();
        searchStage.setTitle("Search Fighters");
        searchStage.setAlwaysOnTop(true);
        searchStage.setResizable(false);
        searchStage.initModality(Modality.APPLICATION_MODAL);
    }
    
    public static Stage getSearchStage(){    //returns the search stage when the button is clicked
        return searchStage;
    }

    
    
    
    
    public void createAddStage(){    //actually creates the add fighter stage
        addStage = new Stage();
        addStage.setTitle("Add Fighter");
        addStage.setAlwaysOnTop(true);
        addStage.setResizable(false);
        addStage.initModality(Modality.APPLICATION_MODAL);
    }
   
    
    
    public static Stage getAddStage(){
        return addStage;       //returns the add fighter stage when the button is clicked
    }
   
    
    
    
    
    
    
    public void createViewAllStage(){     //actually creates the view all fighters stage
        viewAllStage = new Stage();
        viewAllStage.setTitle("View All Fighters");
        viewAllStage.setAlwaysOnTop(true);
        viewAllStage.setResizable(true);
        viewAllStage.initModality(Modality.APPLICATION_MODAL);
    }
    
    
    public static Stage getViewAllStage(){
        return viewAllStage;        //returns the view all fighters scene when the button is clicked
    }
    
    public static ArrayList<Fighter> getAllFighters(){     //this method allows the controllers/other classes to access the arraylist of fighter objects
        return allFighters;
    }
    
    
    public static void main(String[] args) {
        //in main, I have created 186+ fighter objects by hand (very painful, took hours, majority of the time spent on this project).
        //they are given their own accurate but not update values because it's not actually connected to a source, just me typing in the current stats for each and every fighter.
        
        // Men's Flyweights - Top 15 (I am not adding all 2000+ fighters.)
        Fighter BrandonMoreno = new Fighter("Brandon", "Moreno", "Mexico", 5, 7, "Male", 125, 70, "Brazilian Jiu Jitsu", 29, 21, 6, 2, 0);
        allFighters.add(BrandonMoreno);
        Fighter DeivesonFigueiredo = new Fighter("Deiveson", "Figueiredo", "Brazil", 5, 5, "Male", 125, 68, "Wrestling", 35, 21, 3, 1, 0);
        allFighters.add(DeivesonFigueiredo);
        Fighter AlexandrePantoja = new Fighter("Alexandre", "Pantoja", "Brazil", 5, 5, "Male", 125, 67, "Brazilian Jiu Jitsu", 33, 25, 5, 0, 0);
        allFighters.add(AlexandrePantoja);
        Fighter KaiKaraFrance = new Fighter("Kai", "Kara-France", "New Zealand", 5, 4, "Male", 125, 69, "Kickboxing", 30, 24, 10, 0, 0);
        allFighters.add(KaiKaraFrance);
        Fighter BrandonRoyval = new Fighter("Brandon", "Royval", "USA", 5, 9, "Male", 126, 68, "Muay Thai/Mixed", 30, 15, 6, 0, 0);
        allFighters.add(BrandonRoyval);
        Fighter MatheusNicolau = new Fighter("Matheus", "Nicolau", "Brazil", 5, 6, "Male", 126, 66, "Brazilian Jiu Jitsu", 30, 19, 4, 1, 0);
        allFighters.add(MatheusNicolau);
        Fighter AlexPerez = new Fighter("Alex", "Perez", "USA", 5, 6, "Male", 126, 65, "Brazilian Jiu Jitsu", 31, 24, 7, 0, 0);
        allFighters.add(AlexPerez);
        Fighter AmirAlbazi = new Fighter("Amir", "Albazi", "Iraq", 5, 5, "Male", 125, 68, "Jiu Jitsu", 29, 16, 1, 0, 0);
        allFighters.add(AmirAlbazi);
        Fighter MattSchnell = new Fighter("Matt", "Schnell", "USA", 5, 8, "Male", 126, 70, "Brazilian Jiu Jitsu", 33, 16, 7, 0, 0);
        allFighters.add(MattSchnell);
        Fighter ManelKape= new Fighter("Manel", "Kape", "Portugal", 5, 5, "Male", 125, 68, "Mixed Martial Arts", 29, 18, 6, 0, 0);
        allFighters.add(ManelKape);
        Fighter DavidDvorak = new Fighter("David", "Dvorak", "Czech Republic", 5, 5, "Male", 125, 68, "Boxing", 30, 20, 5, 0, 0);
        allFighters.add(DavidDvorak);
        Fighter TimElliot = new Fighter("Tim", "Elliot", "USA", 5, 7, "Male", 126, 66, "Brazilian Jiu Jitsu", 36, 19, 12, 1, 0);
        allFighters.add(TimElliot);
        Fighter MuhammadMokaev = new Fighter("Muhammad", "Mokaev", "England", 5, 7, "Male", 126, 70, "Wrestling", 22, 10, 0, 0, 0);
        allFighters.add(MuhammadMokaev);
        Fighter SuMudaerji = new Fighter("Su", "Mudaerji", "China", 5, 8, "Male", 125, 72, "Boxing", 27, 16, 5, 0, 0);
        allFighters.add(SuMudaerji);
        Fighter TagirUlanbekov = new Fighter("Tagir", "Ulanbekov", "Russia", 5, 7, "Male", 125, 70, "Wrestling", 31, 14, 2, 0, 0);
        allFighters.add(TagirUlanbekov);
        Fighter BrunoSilva = new Fighter("Bruno", "Silva", "Brazil", 5, 4, "Male", 126, 65, "Brazilian Jiu Jitsu", 33, 13, 5, 2, 0);
        allFighters.add(BrunoSilva);
        
        
        
        // Men's Bantamweights - Top 15
        Fighter AljamainSterling = new Fighter("Aljamain", "Sterling", "Jamaica", 5, 7, "Male", 135, 71, "Brazilian Jiu Jitsu", 33, 22, 3, 0, 0);
        allFighters.add(AljamainSterling);
        Fighter MerabDvalishvili = new Fighter("Merab", "Dvalishvili", "Georgia", 5, 6, "Male", 136, 68, "Freestyle", 32, 16, 4, 0, 0);
        allFighters.add(MerabDvalishvili);
        Fighter SeanOMalley = new Fighter("Sean", "O'Malley", "USA", 5, 11, "Male", 135, 72, "Boxing", 28, 16, 1, 0, 0);
        allFighters.add(SeanOMalley);
        Fighter CorySandhagen = new Fighter("Cory", "Sandhagen", "USA", 5, 11, "Male", 135, 70, "Boxing", 31, 16, 4, 0, 0);
        allFighters.add(CorySandhagen);
        Fighter PetrYan = new Fighter("Petr", "Yan", "Russia", 5, 7, "Male", 136, 67, "Boxing", 30, 16, 5, 0, 0);
        allFighters.add(PetrYan);
        Fighter MarlonVera = new Fighter("Marlon", "Vera", "Ecuador", 5, 8, "Male", 136, 70, "Brazilian Jiu Jitsu", 30, 20, 8, 1, 0);
        allFighters.add(MarlonVera);
        Fighter RobFont = new Fighter("Rob", "Font", "Puerto Rico", 5, 8, "Male", 135, 71, "Boxing", 35, 20, 6, 0, 0);
        allFighters.add(RobFont);
        Fighter DominickCruz = new Fighter("Dominick", "Cruz", "USA", 5, 8, "Male", 135, 68, "Wrestling", 38, 24, 4, 0, 0);
        allFighters.add(DominickCruz);
        Fighter SongYadong = new Fighter("Song", "Yadong", "China", 5, 8, "Male", 135, 67, "Boxing", 25, 19, 7, 1, 0);
        allFighters.add(SongYadong);
        Fighter PedroMunhoz = new Fighter("Pedro", "Munhoz", "Brazil", 5, 6, "Male", 136, 65, "Brazilian Jiu Jitsu", 36, 20, 7, 0, 0);
        allFighters.add(PedroMunhoz);
        Fighter RickySimon = new Fighter("Ricky", "Simon", "USA", 5, 6, "Male", 135, 69, "Boxing", 30, 20, 3, 0, 0);
        allFighters.add(RickySimon);
        Fighter UmarNurmagomedov = new Fighter("Umar", "Nurmagomedov", "Russia", 5, 8, "Male", 135, 69, "Mixed Martial Arts", 27, 16, 0, 0, 0);
        allFighters.add(UmarNurmagomedov);
        Fighter AdrianYanez = new Fighter("Adrian", "Yanez", "USA", 5, 7, "Male", 135, 70, "Boxing", 29, 16, 4, 0, 0);
        allFighters.add(AdrianYanez);
        Fighter JonathanMartinez = new Fighter("Jonathan", "Martinez", "USA", 5, 8, "Male", 135, 70, "Boxing", 29, 18, 4, 0, 0);
        allFighters.add(JonathanMartinez);
        Fighter ChrisGutierrez = new Fighter("Chris", "Gutierrez", "USA", 5, 9, "Male", 136, 67, "Boxing", 32, 19, 4, 2, 0);
        allFighters.add(ChrisGutierrez);
        Fighter SaidNurmagomedov = new Fighter("Said", "Nurmagomedov", "Russia", 5, 8, "Male", 136, 70, "Mixed Martial Arts", 31, 17, 3, 0, 0);
        allFighters.add(SaidNurmagomedov);
        
        
        
        
        //Men's Featherweights - Top 15
        Fighter AlexanderVolkanovski = new Fighter("Alexander", "Volkanovski", "Australia", 5, 6, "Male", 154, 71, "Boxing", 34, 25, 2, 0, 0);
        allFighters.add(AlexanderVolkanovski);
        Fighter YairRodriguez = new Fighter("Yair", "Rodriguez", "Mexico", 5, 11, "Male", 145, 71, "Boxing", 30, 16, 3, 0, 0);
        allFighters.add(YairRodriguez);
        Fighter MaxHolloway = new Fighter("Max", "Holloway", "USA", 5, 11, "Male", 146, 69, "Boxing", 31, 24, 7, 0, 0);
        allFighters.add(MaxHolloway);
        Fighter BrianOrtega = new Fighter("Brian", "Ortega", "USA", 5, 8, "Male", 146, 69, "Brazilian Jiu Jitsu", 32, 15, 3, 0, 0);
        allFighters.add(BrianOrtega);
        Fighter ArnoldAllen = new Fighter("Arnold", "Allen", "England", 5, 8, "Male", 146, 70, "Boxing", 29, 19, 2, 0, 0);
        allFighters.add(ArnoldAllen);
        Fighter JoshEmmett = new Fighter("Josh", "Emmett", "USA", 5, 6, "Male", 145, 70, "Boxing", 38, 18, 3, 0, 0);
        allFighters.add(JoshEmmett);
        Fighter ChanSungJung = new Fighter("Chan Sung", "Jung", "Korea", 5, 7, "Male", 145, 72, "Boxing", 36, 17, 7, 0, 0);
        allFighters.add(ChanSungJung);
        Fighter CalvinKattar = new Fighter("Calvin", "Kattar", "USA", 5, 11, "Male", 146, 72, "Boxing", 35, 23, 7, 0, 0);
        allFighters.add(CalvinKattar);
        Fighter GigaChikadze = new Fighter("Giga", "Chikadze", "Georgia", 6, 0, "Male", 146, 74, "Boxing", 34, 14, 3, 0, 0);
        allFighters.add(GigaChikadze);
        Fighter IliaTopuria = new Fighter("Ilia", "Topuria", "Georgia", 5, 7, "Male", 146, 69, "Brazilian Jiu Jitsu", 26, 13, 0, 0, 0);
        allFighters.add(IliaTopuria);
        Fighter MovsarEvloev = new Fighter("Movsar", "Evloev", "Russia", 5, 7, "Male", 146, 72, "Freestyle", 29, 16, 0, 0, 0);
        allFighters.add(MovsarEvloev);
        Fighter BryceMitchell = new Fighter("Bryce", "Mitchell", "USA", 5, 10, "Male", 146, 70, "Brazilian Jiu Jitsu", 28, 15, 2, 0, 0);
        allFighters.add(BryceMitchell);
        Fighter SodiqYusuff = new Fighter("Sodiq", "Yusuff", "Nigeria", 5, 9, "Male", 145, 71, "Boxing", 29, 13, 2, 0, 0);
        allFighters.add(SodiqYusuff);
        Fighter DanIge = new Fighter("Dan", "Ige", "USA", 5, 7, "Male", 145, 71, "Wrestling", 31, 16, 6, 0, 0);
        allFighters.add(DanIge);
        Fighter EdsonBarboza = new Fighter("Edson", "Barboza", "Brazil", 5, 11, "Male", 146, 75, "Brazilian Jiu Jitsu", 37, 23, 11, 0, 0);
        allFighters.add(EdsonBarboza);
        Fighter AlexCaceres = new Fighter("Alex", "Caceres", "USA", 5, 10, "Male", 145, 73, "Freestyle", 34, 20, 13, 0, 0);
        allFighters.add(AlexCaceres);
        
        
        
        
        
        
        //Men's Lightweight - Top 15
        Fighter IslamMakhachev = new Fighter("Islam", "Makhachev", "Russia", 5, 10, "Male", 155, 70, "Wrestling/Sambo", 31, 24, 1, 0, 0);
        allFighters.add(IslamMakhachev);
        Fighter CharlesOliveira = new Fighter("Charles", "Oliveira", "Brazil", 5, 10, "Male", 155, 74, "Brazilian Jiu Jitsu", 33, 33, 9, 0, 0);
        allFighters.add(CharlesOliveira);
        Fighter DustinPoirier = new Fighter("Dustin", "Poirier", "USA", 5, 9, "Male", 156, 72, "Brazilian Jiu Jitsu", 34, 29, 7, 0, 0);
        allFighters.add(DustinPoirier);
        Fighter JustinGaethje = new Fighter("Justin", "Gaethje", "USA", 5, 11, "Male", 155, 70, "Boxing", 34, 24, 4, 0, 0);
        allFighters.add(JustinGaethje);
        Fighter BeneilDariush = new Fighter("Beneil", "Dariush", "USA", 5, 10, "Male", 156, 72, "Boxing", 33, 22, 4, 1, 0);
        allFighters.add(BeneilDariush);
        Fighter MichaelChandler = new Fighter("Michael", "Chandler", "USA", 5, 8, "Male", 156, 71, "Boxing", 29, 21, 6, 2, 0);
        allFighters.add(MichaelChandler);
        Fighter RafaelFiziev = new Fighter("Rafael", "Fiziev", "Azerbaijan", 5, 8, "Male", 155, 71, "Muay Thai", 30, 12, 2, 0, 0);
        allFighters.add(RafaelFiziev);
        Fighter MateuszGamrot = new Fighter("Mateusz", "Gamrot", "Poland", 5, 10, "Male", 156, 70, "Wrestling", 32, 22, 2, 0, 0);
        allFighters.add(MateuszGamrot);
        Fighter ArmanTsarukyan = new Fighter("Arman", "Tsarukyan", "Armenia", 5, 7, "Male", 155, 72, "Mixed Martial Arts", 26, 19, 3, 0, 0);
        allFighters.add(ArmanTsarukyan);
        Fighter RafaelDosAnjos = new Fighter("Rafael", "Dos Anjos", "Brazil", 5, 8, "Male", 170, 70, "Brazilian Jiu Jitsu", 38, 32, 14, 0, 0);
        allFighters.add(RafaelDosAnjos);
        Fighter JalinTurner = new Fighter("Jalin", "Turner", "USA", 6, 3, "Male", 155, 77, "Boxing", 27, 13, 6, 0, 0);
        allFighters.add(JalinTurner);
        Fighter DanHooker = new Fighter("Dan", "Hooker", "New Zealand", 6, 0, "Male", 156, 75, "Boxing", 33, 22, 12, 0, 0);
        allFighters.add(DanHooker);
        Fighter DamirIsmagulov = new Fighter("Damir", "Ismagulov", "Kazakhstan", 5, 10, "Male", 156, 74, "Boxer", 32, 24, 2, 0, 0);
        allFighters.add(DamirIsmagulov);
        Fighter RenatoMoicano = new Fighter("Renato", "Moicano", "Brazil", 5, 11, "Male", 155, 72, "Brazilian Jiu Jitsu", 33, 17, 5, 1, 0);
        allFighters.add(RenatoMoicano);
        Fighter DrewDober = new Fighter("Drew", "Dober", "USA", 5, 8, "Male", 156, 70, "Brazilian Jiu Jitsu", 34, 26, 11, 0, 0);
        allFighters.add(DrewDober);
        Fighter GrantDawson = new Fighter("Grant", "Dawson", "USA", 5, 10, "Male", 157, 72, "Brazilian Jiu Jitsu", 29, 19, 1, 1, 0);
        allFighters.add(GrantDawson);
        
        
        
        
        //Men's Welterweight - Top 15
        Fighter LeonEdwards = new Fighter("Leon", "Edwards", "England", 6, 2, "Male", 170, 74, "Boxing", 31, 21, 3, 0, 0);
        allFighters.add(LeonEdwards);
        Fighter ColbyCovington = new Fighter("Colby", "Covington", "USA", 5, 11, "Male", 170, 72, "Wrestling", 35, 17, 3, 0, 0);
        allFighters.add(ColbyCovington);
        Fighter KhamzatChimaev = new Fighter("Khamzat", "Chimaev", "Sweden", 6, 2, "Male", 179, 75, "Freestyle", 28, 12, 0, 0, 0);
        allFighters.add(KhamzatChimaev);
        Fighter BelalMuhammad = new Fighter("Belal", "Muhammad", "Palestine", 5, 11, "Male", 170, 72, "Boxing", 34, 22, 3, 0, 0);
        allFighters.add(BelalMuhammad);
        Fighter GilbertBurns = new Fighter("Gilbert", "Burns", "Brazil", 5, 10, "Male", 170, 71, "Boxing", 36, 22, 5, 0, 0);
        allFighters.add(GilbertBurns);
        Fighter ShavkatRakhmonov = new Fighter("Shavkat", "Rakhmonov", "Kazakhstan", 6, 1, "Male", 170, 77, "Wrestling/Sambo", 28, 17, 0, 0, 0);
        allFighters.add(ShavkatRakhmonov);
        Fighter StephenThompson = new Fighter("Steven", "Thompson", "USA", 6, 0, "Male", 170, 75, "Kickboxing", 40, 17, 6, 1, 0);
        allFighters.add(StephenThompson);
        Fighter GeoffNeal = new Fighter("Geoff", "Neal", "USA", 5, 11, "Male", 175, 75, "Boxing", 32, 15, 5, 0, 0);
        allFighters.add(GeoffNeal);
        Fighter SeanBrady = new Fighter("Sean", "Brady", "USA", 5, 10, "Male", 171, 72, "Brazilian Jiu Jitsu", 30, 15, 1, 0, 0);
        allFighters.add(SeanBrady);
        Fighter VincenteLuque = new Fighter("Vincente", "Luque", "Brazil", 5, 11, "Male", 170, 75, "Boxing", 31, 21, 9, 1, 0);
        allFighters.add(VincenteLuque);
        Fighter NeilMagny = new Fighter("Neil", "Magny", "USA", 6, 3, "Male", 171, 80, "Mixed Martial Arts", 35, 27, 11, 0, 0);
        allFighters.add(NeilMagny);
        Fighter MichaelChiesa = new Fighter("Michael", "Chiesa", "USA", 6, 1, "Male", 170, 75, "Wrestling", 35, 18, 6, 0, 0);
        allFighters.add(MichaelChiesa);
        Fighter JackDellaMaddalena = new Fighter("Jack", "Della Maddalena", "Australia", 5, 11, "Male", 170, 73, "Mixed Martial Arts", 26, 14, 2, 0, 0);
        allFighters.add(JackDellaMaddalena);
        Fighter MichelPereira = new Fighter("Michel", "Pereira", "Brazil", 6, 1, "Male", 170, 73, "Boxing", 29, 28, 11, 0, 0);
        allFighters.add(MichelPereira);
        Fighter DanielRodriguez = new Fighter("Daniel", "Rodriguez", "USA", 6, 1, "Male", 170, 74, "Freestyle", 36, 17, 3, 0, 0);
        allFighters.add(DanielRodriguez);
        
        
        
        
        //Men's Middleweight - Top 15
        Fighter IsraelAdesanya = new Fighter("Israel", "Adesanya", "Nigeria", 6, 4, "Male", 185, 80, "Boxing", 33, 24, 2, 0, 0);
        allFighters.add(IsraelAdesanya);
        Fighter AlexPereira = new Fighter("Alex", "Pereira", "Brazil", 6, 4, "Male", 184, 79, "Kickboxing", 35, 7, 2, 0, 0);
        allFighters.add(AlexPereira);
        Fighter RobertWhittaker = new Fighter("Robert", "Whittaker", "Australia", 6, 0, "Male", 186, 73, "Boxing", 32, 25, 6, 0, 0);
        allFighters.add(RobertWhittaker);
        Fighter MarvinVettori = new Fighter("Marvin", "Vettori", "Italy", 6, 0, "Male", 186, 74, "Brazilian Jiu Jitsu", 29, 19, 6, 1, 0);
        allFighters.add(MarvinVettori);
        Fighter JaredCannonier = new Fighter("Jared", "Cannonier", "USA", 5, 11, "Male", 185, 77, "Boxing", 39, 16, 6, 0, 0);
        allFighters.add(JaredCannonier);
        Fighter PauloCosta = new Fighter("Paulo", "Costa", "Brazil", 6, 1, "Male", 185, 72, "Boxing", 32, 14, 2, 0, 0);
        allFighters.add(PauloCosta);
        Fighter DricusDuPlessis = new Fighter("Dricus", "Du Plessis", "South Africa", 6, 1, "Male", 185, 76, "Mixed Martial Arts", 29, 19, 2, 0, 0);
        allFighters.add(DricusDuPlessis);
        Fighter SeanStrickland = new Fighter("Sean", "Strickland", "USA", 6, 1, "Male", 204, 76, "Boxing", 32, 26, 5, 0, 0);
        allFighters.add(SeanStrickland);
        Fighter DerekBrunson = new Fighter("Derek", "Brunson", "USA", 6, 1, "Male", 185, 77, "Boxing", 39, 23, 9, 0, 0);
        allFighters.add(DerekBrunson);
        Fighter RomanDolidze = new Fighter("Roman", "Dolidze", "Georgia", 6, 2, "Male", 185, 76, "Mixed Martial Arts", 34, 12, 2, 0, 0);
        allFighters.add(RomanDolidze);
        Fighter JackHermansson = new Fighter("Jack", "Hermansson", "Norway", 6, 1, "Male", 186, 77, "Mixed Martial Arts", 34, 23, 8, 0, 0);
        allFighters.add(JackHermansson);
        Fighter KevinGastelum = new Fighter("Kevin", "Gastelum", "USA", 5, 9, "Male", 186, 71, "Boxing", 31, 18, 8, 0, 0);
        allFighters.add(KevinGastelum);
        Fighter NassourdineImavov = new Fighter("Nassourdine", "Imavov", "France", 6, 3, "Male", 194, 75, "Boxing", 28, 12, 4, 0, 0);
        allFighters.add(NassourdineImavov);
        Fighter BrendanAllen = new Fighter("Brendan", "Allen", "USA", 6, 2, "Male", 186, 75, "Brazilian Jiu Jitsu", 27, 21, 5, 0, 0);
        allFighters.add(BrendanAllen);
        Fighter AndreMuniz = new Fighter("Andre", "Muniz", "Brazil", 6, 1, "Male", 185, 78, "Brazilian Jiu Jitsu", 33, 23, 5, 0, 0);
        allFighters.add(AndreMuniz);
        Fighter ChrisCurtis = new Fighter("Chris", "Curtis", "USA", 5, 10, "Male", 186, 75, "Boxing", 35, 30, 10, 0, 0);
        allFighters.add(ChrisCurtis);
        
        
        
        
        //Men's Light Heavyweight - Top 15
        Fighter JamahalHill = new Fighter("Jamahal", "Hill", "USA", 6, 4, "Male", 205, 79, "Mixed Martial Arts", 31, 12, 1, 0, 0);
        allFighters.add(JamahalHill);
        Fighter JiriProchazka = new Fighter("Jiri", "Prochazka", "Czech Republic", 6, 3, "Male", 205, 80, "Boxing", 30, 29, 3, 1, 0);
        allFighters.add(JiriProchazka);
        Fighter MagomedAnkalaev = new Fighter("Magomed", "Ankalaev", "Russia", 6, 3, "Male", 205, 75, "Boxing", 30, 18, 1, 1, 0);
        allFighters.add(MagomedAnkalaev);
        Fighter JanBlachowicz = new Fighter("Jan", "Blachowicz", "Poland", 6, 2, "Male", 205, 78, "Brazilian Jiu Jitsu", 40, 29, 9, 1, 0);
        allFighters.add(JanBlachowicz);
        Fighter AleksandarRakic = new Fighter("Aleksandar", "Rakic", "Serbia", 6, 4, "Male", 205, 78, "Brazilian Jiu Jitsu", 31, 14, 3, 0, 0);
        allFighters.add(AleksandarRakic);
        Fighter AnthonySmith = new Fighter("Anthony", "Smith", "USA", 6, 4, "Male", 206, 76, "Boxing", 34, 36, 17, 0, 0);
        allFighters.add(AnthonySmith);
        Fighter NikitaKrylov = new Fighter("Nikita", "Krylov", "Ukraine", 6, 3, "Male", 213, 77, "Brazilian Jiu Jitsu", 31, 30, 9, 0, 0);
        allFighters.add(NikitaKrylov);
        Fighter JohnnyWalker = new Fighter("Johnny", "Walker", "Brazil", 6, 6, "Male", 205, 82, "Boxing", 31, 20, 7, 0, 0);
        allFighters.add(JohnnyWalker);
        Fighter VolkanOezdemir = new Fighter("Volkan", "Oezdemir", "Switzerland", 6, 2, "Male", 206, 75, "Boxing", 33, 18, 17, 0, 0);
        allFighters.add(VolkanOezdemir);
        Fighter PaulCraig = new Fighter("Paul", "Craig", "Scotland", 6, 3, "Male", 205, 76, "Brazilian Jiu Jitsu", 35, 16, 6, 1, 0);
        allFighters.add(PaulCraig);
        Fighter RyanSpann = new Fighter("Ryan", "Spann", "USA", 6, 5, "Male", 213, 79, "Brazilian Jiu Jitsu", 31, 21, 8, 0, 0);
        allFighters.add(RyanSpann);
        Fighter AzamatMurzakanov = new Fighter("Azamat", "Murzakanov", "Russia", 5, 10, "Male", 205, 71, "Boxing", 34, 13, 0, 0, 0);
        allFighters.add(AzamatMurzakanov);
        Fighter DominickReyes = new Fighter("Dominick", "Reyes", "USA", 6, 4, "Male", 205, 77, "Boxing", 33, 12, 4, 0, 0);
        allFighters.add(DominickReyes);
        Fighter JimmyCrute = new Fighter("Jimmy", "Crute", "Australia", 6, 2, "Male", 205, 74, "Mixed Martial Arts", 27, 12, 3, 1, 0);
        allFighters.add(JimmyCrute);
        Fighter KhalilRountreeJr = new Fighter("Khalil", "Rountree Jr.", "USA", 6, 1, "Male", 205, 76, "Boxing", 33, 12, 5, 0, 0);
        allFighters.add(KhalilRountreeJr);
        Fighter DustinJacoby = new Fighter("Dustin", "Jacoby", "USA", 6, 3, "Male", 206, 76, "Freestyle", 35, 18, 7, 1, 0);
        allFighters.add(DustinJacoby);
        
        
        
        
        //Men's Heavyweight - Top 15
        Fighter JonJones = new Fighter("Jon", "Jones", "USA", 6, 4, "Male", 248, 84, "Wrestling/Muay Thai", 35, 27, 1, 0, 0);
        allFighters.add(JonJones);
        Fighter CirylGane = new Fighter("Ciryl", "Gane", "France", 6, 4, "Male", 247, 81, "Boxing", 33, 11, 2, 0, 0);
        allFighters.add(CirylGane);
        Fighter SergeiPavlovich = new Fighter("Sergei", "Pavlovich", "Russia", 6, 3, "Male", 260, 84, "Boxing", 30, 18, 1, 0, 0);
        allFighters.add(SergeiPavlovich);
        Fighter StipeMiocic = new Fighter("Stipe", "Miocic", "USA", 6, 4, "Male", 234, 80, "Wrestling", 40, 20, 4, 0, 0);
        allFighters.add(StipeMiocic);
        Fighter CurtisBlaydes = new Fighter("Curtis", "Blaydes", "USA", 6, 4, "Male", 262, 80, "Wrestling/Boxing", 32, 17, 4, 0, 0);
        allFighters.add(CurtisBlaydes);
        Fighter TomAspinall = new Fighter("Tom", "Aspinall", "England", 6, 5, "Male", 251, 78, "Boxing", 30, 12, 3, 0, 0);
        allFighters.add(TomAspinall);
        Fighter TaiTuivasa = new Fighter("Tai", "Tuivasa", "Australia", 6, 2, "Male", 266, 75, "Boxing", 30, 15, 5, 0, 0);
        allFighters.add(TaiTuivasa);
        Fighter AlexanderVolkov = new Fighter("Alexander", "Volkov", "Russia", 6, 7, "Male", 258, 80, "Boxing", 34, 36, 10, 0, 0);
        allFighters.add(AlexanderVolkov);
        Fighter SergheiSpivac = new Fighter("Serghei", "Spivac", "Moldova", 6, 3, "Male", 255, 78, "Sambo", 28, 16, 3, 0, 0);
        allFighters.add(SergheiSpivac);
        Fighter JairzinhoRozenstruik = new Fighter("Jairzinho", "Rozenstruik", "Suriname", 6, 2, "Male", 261, 78, "Boxing", 35, 13, 4, 0, 0);
        allFighters.add(JairzinhoRozenstruik);
        Fighter MarcinTybura = new Fighter("Marcin", "Tybura", "Poland", 6, 3, "Male", 253, 78, "Mixed Martial Arts", 37, 24, 7, 0, 0);
        allFighters.add(MarcinTybura);
        Fighter DerrickLewis = new Fighter("Derrick", "Lewis", "USA", 6, 3, "Male", 265, 79, "Boxing", 38, 26, 11, 0, 0);
        allFighters.add(DerrickLewis);
        Fighter JailtonAlmeida = new Fighter("Jailton", "Almeida", "Brazil", 6, 3, "Male", 232, 79, "Boxing", 31, 18, 2, 0, 0);
        allFighters.add(JailtonAlmeida);
        Fighter ChrisDaukaus = new Fighter("Chris", "Daukaus", "USA", 6, 3, "Male", 242, 76, "Freestyle", 33, 12, 6, 0, 0);
        allFighters.add(ChrisDaukaus);
        Fighter BlagoyIvanov = new Fighter("Blagoy", "Ivanov", "Bulgaria", 5, 11, "Male", 256, 73, "Mixed Martial Arts", 36, 19, 5, 0, 0);
        allFighters.add(BlagoyIvanov);
        Fighter AlexandrRomanov = new Fighter("Alexandr", "Romanov", "Moldova", 6, 2, "Male", 264, 75, "Brazilian Jiu Jitsu", 32, 16, 2, 0, 0);
        allFighters.add(AlexandrRomanov);
        
        
        
        
        //Women's Strawweight - Top 15
        Fighter ZhangWeili = new Fighter("Zhang", "Weili", "China", 5, 4, "Female", 115, 63, "Muay Thai", 33, 23, 3, 0, 0);
        allFighters.add(ZhangWeili);
        Fighter CarlaEsparza = new Fighter("Carla", "Esparza", "USA", 5, 1, "Female", 115, 63, "Wrestling", 35, 20, 7, 0, 0);
        allFighters.add(CarlaEsparza);
        Fighter RoseNamajunas = new Fighter("Rose", "Namajunas", "USA", 5, 5, "Female", 115, 65, "Brazilian Jiu Jitsu", 30, 12, 5, 0, 0);
        allFighters.add(RoseNamajunas);
        Fighter AmandaLemos = new Fighter("Amanda", "Lemos", "Brazil", 5, 4, "Female", 115, 65, "Boxing", 35, 13, 2, 1, 0);
        allFighters.add(AmandaLemos);
        Fighter JessicaAndrade = new Fighter("Jessica", "Andrade", "Brazil", 5, 1, "Female", 124, 62, "Boxing", 31, 24, 10, 0, 0);
        allFighters.add(JessicaAndrade);
        Fighter MarinaRodriguez = new Fighter("Marina", "Rodriguez", "Brazil", 5, 6, "Female", 116, 65, "Muay Thai", 35, 16, 2, 2, 0);
        allFighters.add(MarinaRodriguez);
        Fighter XiaonanYan = new Fighter("Xiaonan", "Yan", "China", 5, 5, "Female", 115, 63, "Boxing", 33, 16, 3, 0, 0);
        allFighters.add(XiaonanYan);
        Fighter MackenzieDern = new Fighter("Mackenzie", "Dern", "Brazil", 5, 4, "Female", 115, 63, "Brazilian Jiu Jitsu", 33, 12, 3, 0, 0);
        allFighters.add(MackenzieDern);
        Fighter TeciaTorres = new Fighter("Tecia", "Torres", "USA", 5, 1, "Female", 115, 60, "Boxing", 33, 13, 6, 0, 0);
        allFighters.add(TeciaTorres);
        Fighter VirnaJandiroba = new Fighter("Virna", "Jandiroba", "Brazil", 5, 3, "Female", 115, 64, "Brazilian Jiu Jitsu", 34, 18, 3, 0, 0);
        allFighters.add(VirnaJandiroba);
        Fighter AmandaRibas = new Fighter("Amanda", "Ribas", "Brazil", 5, 3, "Female", 125, 66, "Judo", 29, 11, 3, 0, 0);
        allFighters.add(AmandaRibas);
        Fighter TatianaSuarez = new Fighter("Tatiana", "Suarez", "USA", 5, 5, "Female", 125, 66, "Wrestling", 32, 10, 0, 0, 0);
        allFighters.add(TatianaSuarez);
        Fighter MichelleWatersonGomez = new Fighter("Michelle", "Waterson-Gomez", "USA", 5, 3, "Female", 115, 62, "Brazilian Jiu Jitsu", 37, 18, 11, 0, 0);
        allFighters.add(MichelleWatersonGomez);
        Fighter AngelaHill = new Fighter("Angela", "Hill", "USA", 5, 3, "Female", 115, 64, "Boxing", 38, 15, 12, 0, 0);
        allFighters.add(AngelaHill);
        Fighter LuanaPinheiro = new Fighter("Luana", "Pinheiro", "Brazil", 5, 2, "Female", 116, 62, "Judo", 30, 11, 1, 0, 0);
        allFighters.add(LuanaPinheiro);
        Fighter TabathaRicci = new Fighter("Tabatha", "Ricci", "Brazil", 5, 1, "Female", 115, 61, "Judo", 28, 8, 1, 0, 0);
        allFighters.add(TabathaRicci);
        
        
        
        
        //Women's Flyweight - Top 15 
        Fighter AlexaGrasso = new Fighter("Alexa", "Grasso", "Mexico", 5, 5, "Female", 125, 66, "Boxing", 29, 16, 3, 0, 0);
        allFighters.add(AlexaGrasso);
        Fighter ValentinaShevchenko = new Fighter("Valentina", "Shevchenko", "Kyrgyzstan", 5, 5, "Female", 125, 66, "Muay Thai", 35, 23, 4, 0, 0);
        allFighters.add(ValentinaShevchenko);
        Fighter ManonFiorot = new Fighter("Manon", "Fiorot", "France", 5, 7, "Female", 125, 65, "Karate", 33, 10, 1, 0, 0);
        allFighters.add(ManonFiorot);
        Fighter TailaSantos = new Fighter("Taila", "Santos", "Brazil", 5, 6, "Female", 125, 68, "Boxing", 29, 19, 2, 0, 0);
        allFighters.add(TailaSantos);
        Fighter ErinBlanchfield = new Fighter("Erin", "Blanchfield", "USA", 5, 4, "Female", 125, 66, "Brazilian Jiu Jitsu", 23, 11, 1, 0, 0);
        allFighters.add(ErinBlanchfield);
        Fighter KatlynChookagian = new Fighter("Katlyn", "Chookagian", "USA", 5, 9, "Female", 127, 68, "Boxing", 34, 18, 5, 0, 0);
        allFighters.add(KatlynChookagian);
        Fighter LaurenMurphy = new Fighter("Lauren", "Murphy", "USA", 5, 5, "Female", 125, 67, "Mixed Martial Arts", 39, 16, 6, 0, 0);
        allFighters.add(LaurenMurphy);
        Fighter JenniferMaia = new Fighter("Jennifer", "Maia", "Brazil", 5, 4, "Female", 126, 64, "Brazilian Jiu Jitsu", 34, 21, 9, 1, 0);
        allFighters.add(JenniferMaia);
        Fighter VivianeAraujo = new Fighter("Viviane", "Araujo", "Brazil", 5, 4, "Female", 125, 68, "Brazilian Jiu Jitsu", 36, 11, 5, 0, 0);
        allFighters.add(VivianeAraujo);
        Fighter MayceeBarber = new Fighter("Maycee", "Barber", "USA", 5, 5, "Female", 125, 65, "Boxing", 24, 12, 2, 0, 0);
        allFighters.add(MayceeBarber);
        Fighter CaseyONeill = new Fighter("Casey", "O'Neill", "Australia", 5, 6, "Female", 125, 69, "Mixed Martial Arts", 25, 9, 1, 0, 0);
        allFighters.add(CaseyONeill);
        Fighter AndreaLee = new Fighter("Andrea", "Lee", "USA", 5, 6, "Female", 126, 69, "Muay Thai", 34, 13, 7, 0, 0);
        allFighters.add(AndreaLee);
        Fighter TracyCortez = new Fighter("Tracy", "Cortez", "USA", 5, 5, "Female", 125, 65, "Mixed Martial Arts", 29, 10, 1, 0, 0);
        allFighters.add(TracyCortez);
        Fighter MirandaMaverick = new Fighter("Miranda", "Maverick", "USA", 5, 3, "Female", 125, 65, "Muay Thai", 25, 13, 4, 0, 0);
        allFighters.add(MirandaMaverick);
        
        
        
        
        
        //Women's Bantamweight - Top 15
        Fighter AmandaNunes = new Fighter("Amanda", "Nunes", "Brazil", 5, 8, "Female", 135, 69, "Boxing", 34, 22, 5, 0, 0);
        allFighters.add(AmandaNunes);
        Fighter JuliannaPena = new Fighter("Julianna", "Pena", "USA", 5, 6, "Female", 134, 69, "Brazilian Jiu Jitsu", 33, 12, 5, 0, 0);
        allFighters.add(JuliannaPena);
        Fighter RaquelPennington = new Fighter("Raquel", "Pennington", "USA", 5, 7, "Female", 135, 67, "Freestyle", 34, 15, 9, 0, 0);
        allFighters.add(RaquelPennington);
        Fighter HollyHolm = new Fighter("Holly", "Holm", "USA", 5, 8, "Female", 135, 69, "Boxing", 41, 15, 6, 0, 0);
        allFighters.add(HollyHolm);
        Fighter KetlenVieira = new Fighter("Ketlen", "Vieira", "Brazil", 5, 8, "Female", 136, 68, "Brazilian Jiu Jitsu", 31, 13, 3, 0, 0);
        allFighters.add(KetlenVieira);
        Fighter IreneAldana = new Fighter("Irene", "Aldana", "Mexico", 5, 9, "Female", 138, 68, "Boxing", 35, 14, 6, 0, 0);
        allFighters.add(IreneAldana);
        Fighter YanaSantos = new Fighter("Yana", "Santos", "Russia", 5, 6, "Female", 135, 68, "Boxing", 33, 14, 7, 0, 0);
        allFighters.add(YanaSantos);
        Fighter PannieKianzad = new Fighter("Pannie", "Kianzad", "Sweden", 5, 7, "Female", 136, 66, "Boxing", 31, 17, 6, 0, 0);
        allFighters.add(PannieKianzad);
        Fighter MacyChiasson = new Fighter("Macy", "Chiasson", "USA", 5, 11, "Female", 140, 72, "Mixed Martial Arts", 31, 9, 3, 0, 0);
        allFighters.add(MacyChiasson);
        Fighter KarolRosa = new Fighter("Karol", "Rosa", "Brazil", 5, 5, "Female", 145, 67, "Muay Thai", 28, 16, 5, 0, 0);
        allFighters.add(KarolRosa);
        Fighter MayraBuenoSilva = new Fighter("Mayra", "Bueno Silva", "Brazil", 5, 6, "Female", 136, 66, "Boxing", 31, 10, 2, 1, 0);
        allFighters.add(MayraBuenoSilva);
        Fighter MieshaTate = new Fighter("Miesha", "Tate", "USA", 5, 6, "Female", 125, 63, "Brazilian Jiu Jitsu", 36, 20, 9, 0, 0);
        allFighters.add(MieshaTate);
        Fighter JuliaAvila = new Fighter("Julia", "Avila", "USA", 5, 7, "Female", 135, 68, "Mixed Martial Arts", 34, 9, 2, 0, 0);
        allFighters.add(JuliaAvila);
        Fighter NormaDumont = new Fighter("Norma", "Dumont", "Brazil", 5, 7, "Female", 146, 67, "Sanda", 32, 9, 2, 0, 0);
        allFighters.add(NormaDumont);
        Fighter JosianeNunes = new Fighter("Josiane", "Nunes", "Brazil", 5, 2, "Female", 145, 67, "Muay Thai", 29, 10, 1, 0, 0);
        allFighters.add(JosianeNunes);
        Fighter ChelseaChandler = new Fighter("Chelsea", "Chandler", "USA", 5, 8, "Female", 140, 68, "Mixed Martial Arts", 29, 5, 1, 0, 0);
        allFighters.add(ChelseaChandler);
        
        
        
        
        
        
        
        //Hall of Famers / Honorable mentions
        Fighter KhabibNurmagomedov = new Fighter("Khabib", "Nurmagomedov", "Russia", 5, 10, "Male", 155, 70, "Wrestling/Sambo", 34, 29, 0, 0, 0);
        allFighters.add(KhabibNurmagomedov);
        Fighter DanielCormier = new Fighter("daniel", "Cormier", "USA", 5, 11, "Male", 236, 72, "Wrestling", 44, 22, 3, 0, 0);
        allFighters.add(DanielCormier);
        Fighter GeorgesStPierre = new Fighter("Georges", "St-Pierre", "Canada", 5, 11, "Male", 185, 76, "Mixed Martial Arts", 41, 26, 2, 0, 0);
        allFighters.add(GeorgesStPierre);
        Fighter RashadEvans = new Fighter("Rashad", "Evans", "USA", 5, 11, "Male", 205, 75, "Boxing", 34, 29, 0, 0, 0);
        allFighters.add(RashadEvans);
        Fighter MichaelBisping = new Fighter("Michael", "Bisping", "Cyprus", 6, 1, "Male", 185, 75, "Mixed Martial Arts", 44, 30, 9, 0, 0);
        allFighters.add(MichaelBisping);
        Fighter RondaRousey = new Fighter("Ronda", "Rousey", "USA", 5, 7, "Female", 135, 66, "Judo", 36, 12, 2, 0, 0);
        allFighters.add(RondaRousey);
        Fighter UrijahFaber = new Fighter("Urijah", "Faber", "USA", 5, 6, "Male", 135, 67, "Wrestling", 35, 11, 0, 0, 0);
        allFighters.add(UrijahFaber);
        Fighter BJPenn = new Fighter("BJ", "Penn", "USA", 5, 9, "Male", 155, 70, "Brazilian Jiu Jitsu", 44, 16, 14, 2, 0);
        allFighters.add(BJPenn);
        Fighter ForrestGriffin = new Fighter("Forest", "Griffin", "USA", 6, 3, "Male", 205, 77, "Mixed Martial Arts", 43, 19, 7, 0, 0);
        allFighters.add(ForrestGriffin);
        Fighter KevinRandleman = new Fighter("Kevin", "Randleman", "USA", 5, 10, "Male", 205, 70, "Boxing", 45, 17, 16, 0, 0);
        allFighters.add(KevinRandleman);
        Fighter MattSerra = new Fighter("Matt", "Serra", "USA", 5, 6, "Male", 170, 68, "Wrestling", 48, 11, 7, 0, 0);
        allFighters.add(MattSerra);
        Fighter KazushiSakuraba = new Fighter("Kazushi", "Sakuraba", "Japan", 6, 0, "Male", 185, 71, "Wrestling", 53, 26, 17, 1, 2);
        allFighters.add(KazushiSakuraba);
        Fighter RoyceGracie = new Fighter("Royce", "Gracie", "Brazil", 6, 1, "Male", 175, 72, "Brazilian Jiu Jitsu", 56, 15, 2, 3, 0);
        allFighters.add(RoyceGracie);
        
        
        
        
        
        
        
        
        launch(args);
        
    }
    
}
