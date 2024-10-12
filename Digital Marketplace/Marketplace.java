package de.uni_hannover.task2;
import java.util.Scanner;
import de.uni_hannover.task2.auth.*;
import de.uni_hannover.task2.offerings.*;

/**
 * This class represents a digital marketplace.
 * 
 * Items are offered on this marketplace by user,
 * which can be added to this marketplace.
 * 
 * @author Kevin Schumann
 * @version 03/05/2023
 */
public class Marketplace {
    // users of this marketplace
    private User[] users;
    // An Array that contains all CATEGORIES so that we can access to every Category  
    Category[] theCategories=Category.values();


    /**
     * gibt uns die Possiblitität um mit der rep die Category zugreifen 
     * return Category that we are looking for
    */ 
    public Category searchCategory(String rep){
        for(Category cat :theCategories ){
            if(cat.getRepr().equals(rep)){
                return cat;
            }

        }
        return Category.CLOTHES;   //only to be compiled but it will never be done (erreicht)
    }

    /**
     * Constructs a marketplace object with 
     * maximum 10 users.
     * 
     * @author Kevin Schumann
     */
    public Marketplace() {
        this.users = new User[10];
    }

    /**
     * Returns a string representation of the marketplace
     * 
     * @author Kevin Schumann
     * @return String representation of the item.
     */
    public String str() {
        String res = "";
        
        for(int i = 0; i < this.users.length; i++) {
            if(this.users[i] == null) {
                continue;
            }
            
            res += this.users[i].str();
            res += "\n\n";
        }

        return res;
    }

    /**
     * Removes an user with all offered items from the 
     * marketplace.
     * 
     * @author Kevin Schumann
     * @param user User that shall be removed
     * @return False if user could not be found, else true.
     */
    public boolean removeUser(User user) {
        for (int i = 0; i < this.users.length; i++) {
            if(user == this.users[i]) {
                this.users[i] = null;
                return true;
            }
        }

        return false;
    }

    /**
     * Adds an user to the marketplace.
     * 
     * @author Kevin Schumann
     * @param user User that shall be added.
     * @return False if user limit has been reached, else true.
     */
    public boolean addUser(User user) {
        for (int i = 0; i < this.users.length; i++) {
            if(this.users[i] == null) {
                this.users[i] = user;
                return true;
            }
            
        }

        return false;
    }

    /**
     * Returns string of all items that belong to as the given category.
     * Iff category is null all items will be printed like
     * in the str() function.
     * 
     * @author Kevin Schumann
     * @param category Category that shall be printed. Can be null. If null all items will be printed.
     * @return String of all the items that belong to the given category.
     */
    public String filterMarket(Category category) {
        if(category == null) {
            return this.str();
        }

        String res = "";
        for (int i = 0; i < users.length; i++) {
            if(this.users[i] == null) {
                continue;
            }

            Item[] items = this.users[i].getItems();
            for (int j = 0; j < items.length; j++) {
                if (items[j] == null) {
                    continue;
                }

                if (category.isSameCategory(items[j])) {
                    res += items[j].str();
                    res+="\n";                                      // muss hinzugefügt werden 
                }
            }

            res += "\n";
        }

        return res;
    }

    /**
     * Returns the User that habe this User name und passwort .
     * If we given parrametres are false than we System will close 
     * 
     * 
     * @author Mohamed Aziz Ennabli
     * @return the User
     */

    public User login() {
        Scanner scanner = new Scanner(System.in);
        int try1 = 0;

        while (try1 <3) {
            System.out.println("geben Sie bitte Benutzername ein:");
            String username = scanner.nextLine();
            System.out.println("geben Sie bitte Passwort ein:");
            String password = scanner.nextLine();

            for (int i=0;i< users.length;i++) { 
                // Users has 10 users but we have to fix that the user kann be null 
                if(users[i]!=null){
                    if ((users[i].getUsername().equals(username)) && (users[i].getPassword().equals(password))) {
                        System.out.println("wir haben den benutzer gefunden hier ist es ");
                        return users[i]; // Anmeldung erfolgreich
                
                    }
                }
                
            }

            System.out.println("leider nicht gefunden versuchen sie Noch einmal");
            try1 ++ ;
        }

        System.out.println("Maximale Anzahl von Anmeldeversuchen erreicht und benutzer nicht gefunden  ");
        System.exit(0); // Programm beenden
        return null;   // wir ergeben null nur weil die methode hat ein ruckgabe von typ String 
    }



    // gleich cli() aber ohne Parametre
    public void cli(){
        cli2(this.login());
    }


    /**
     * Give the Users a lot of Possibilities that he can use 
     * 
     * Returns is always linked to choices of the USER 
     * The User can close the Methode if he uses the Choice 5
     * He kann also add Items
     * remouve Items 
     * Show the Market 
     * edit some details about some Items like Name or Description or Category
     * 
     * @author Mohamed Aziz Ennabli
     */

    public void cli2(User MyUser){
        Scanner scanner = new Scanner(System.in);
        while(true){
            System.out.println("Wählen Sie aus den folgenden Optionen:\n");
            System.out.println("1. Item hinzufügen\n");
            System.out.println("2. Item entfernen\n");
            System.out.println("3. Item that you want his details \n");
            System.out.println("4. Marketplace anssehen\n");
            System.out.println("5. Programm beenden\n");
            String Wahl = scanner.nextLine();
            switch(Wahl){
                case "1":
                    //System.out.println("give the name of the user that will add the Item");
                    //String newUser = scanner.nextLine();
                    System.out.println("give the name of the Item ");
                    String newName = scanner.nextLine();
                    System.out.println("give the Price of the Item ");
                    float newPrice = (float) Double.parseDouble(scanner.nextLine());                       
                    System.out.println("give the Description of the Item ");
                    String newDescription = scanner.nextLine();
                    System.out.println("give the Category of the Item ");
                    String newCategory = scanner.nextLine();
                    for (int i=0;i< users.length;i++) { 
                        if(users[i]!=null){
                            if (users[i].getUsername().equals(MyUser.getUsername())){
                                users[i].addItem(new Item(newName,newPrice,users[i],newDescription,searchCategory(newCategory)));
                            }
                        }
                    }
                    break;       

                case "2":
                    System.out.println("give the name of the Item that you want to  remove");
                    String newItemName = scanner.nextLine();
                    for (int j=0;j< users.length;j++) { 
                        if((users[j]!=null)&&users[j]== MyUser ){
                            Item[] list=users[j].getItems();     
                            for(int k=0;k<list.length;k++){
                                // if there is no Item or not a lot of Items there will be null in the list 
                                if(list[k]!=null &&list[k].getName().equals(newItemName)){
                                    users[j].removeItem(list[k]);
                                }
                            }
                        }
                            
                    }
                    break;


                    


                case "3":
                //System.out.println("give the Name of the User who is selling this thing");
                //String newNameUser3 = scanner.nextLine();
                System.out.println("give the name of the Item");
                String newItemName3 = scanner.nextLine();
                System.out.println("what do you want to change");
                System.out.println("1  the Name of the Item");
                System.out.println("2  the Description of the Item");
                System.out.println("3  the Category of the Item");
                String wahl3 = scanner.nextLine();
                System.out.println("give the new Name or description or Category");

                // this variable have new name or the new category or the description
                String wahl31 = scanner.nextLine();
                if(wahl3.equals("1")){
                    for (int a=0;a< users.length;a++) { 
                        if((users[a]!=null) && users[a].getUsername().equals(MyUser.getUsername())){
                            Item[] list3=users[a].getItems();    
                            for(int k=0;k<list3.length;k++){
                                if(list3[k]!=null){
                                    if(list3[k].getName().equals(newItemName3)){
                                        list3[k].setName(wahl31,users[a]);
                                    }
                                }
                            }
                        }
                            
                    }
                    break;


                }else if(wahl3.equals("2")){
                    for (int a=0;a< users.length;a++) { 
                        if((users[a]!=null) && users[a].getUsername().equals(MyUser.getUsername())){
                            Item[] list3=users[a].getItems();      
                            for(int k=0;k<list3.length;k++){
                                if((list3[k]!=null)&&(list3[k].getName().equals(newItemName3))){
                                    list3[k].setDescription(wahl31,users[a]);
                                }
                            }
                        }
                            
                    }
                    break;


                }else{
                    for (int a=0;a< users.length;a++) { 
                        if((users[a]!=null) && users[a].getUsername().equals(MyUser.getUsername())){
                            Item[] list3=users[a].getItems();     
                            for(int k=0;k<list3.length;k++){
                                
                                if((list3[k]!=null)&&(list3[k].getName().equals(newItemName3))){
                                    list3[k].setCategory(searchCategory(wahl31),users[a]);
                                }
                            }
                        }
                            
                    }
                    break;

                }

                    
                    
                    


                case "4":
                    int number= 2;
                    System.out.println("what Category do you want to see");
                    System.out.println("1"+"   "+"All"+"\n\n");
                    for(Category cat:Category.values()){
                        System.out.println(number+"   "+cat.getRepr()+"\n\n");
                        number+=1;

                    }
                    System.out.println("X"+"      end program");
                    String newCategory2 = scanner.nextLine();
                    if(newCategory2.equals("2")){
                        /*for (int j=0;j< users.length;j++) { 
                            if(users[j]!=null){
                                Item[]list=users[j].getItems();    // initalisation ta3list hia ili m9al9etny nthabet kifech na3malha na3mel initialisation bi Ra9m ba3d nzidha 
                                for(int k=0;k<list.length;k++){
                                    if(list[k].getCategory().isSameCategory(new Item("new",11.01f,users[j],"AAAA",Category.FURNITURE))){   // nzid nthabatha bithabt eny 9arentou m3a oblect eny sna3tou just bech najam n9aren Category
                                        System.out.println(list[k].str());  // print lil Item
                                        System.out.println("\n\n");
                                    }
                                }
                            }
                            
                        }*/
                        

                        System.out.println(this.filterMarket(Category.FURNITURE));
                        break;
                    }else if(newCategory2.equals("3")) {
                        /*for (int j=0;j< users.length;j++) { 
                            if(users[j]!=null){
                                Item[]list=users[j].getItems();    // initalisation ta3list hia ili m9al9etny nthabet kifech na3malha na3mel initialisation bi Ra9m ba3d nzidha 
                                for(int k=0;k<list.length;k++){
                                    if(list[k].getCategory().isSameCategory(new Item("new",11.01f,users[j],"EEE",Category.ELECTRONICS))){   // nzid nthabatha bithabt eny 9arentou m3a oblect eny sna3tou just bech najam n9aren Category
                                        System.out.println(list[k].str());  // print lil Item
                                        System.out.println("\n\n");
                                    }
                                }
                            }
                            
                        }*/
                        
                        System.out.println(this.filterMarket(Category.ELECTRONICS));
                        break;
                    }else if(newCategory2.equals("4")) {
                        /*for (int j=0;j< users.length;j++) { 
                            if(users[j]!=null){
                                Item[]list=users[j].getItems();    // initalisation ta3list hia ili m9al9etny nthabet kifech na3malha na3mel initialisation bi Ra9m ba3d nzidha 
                                for(int k=0;k<list.length;k++){
                                    if(list[k].getCategory().isSameCategory(new Item("new",11.01f,users[j],"Alpha",Category.SERVICES))){   // nzid nthabatha bithabt eny 9arentou m3a oblect eny sna3tou just bech najam n9aren Category
                                        System.out.println(list[k].str());  // print lil Item
                                        System.out.println("\n\n");
                                    }
                                }
                            }
                            
                        }*/
                        
                        System.out.println(this.filterMarket(Category.SERVICES));
                        break;
                    }else if(newCategory2.equals("5")) {
                        /*for (int j=0;j< users.length;j++) { 
                            if(users[j]!=null){
                                Item[]list=users[j].getItems();    // initalisation ta3list hia ili m9al9etny nthabet kifech na3malha na3mel initialisation bi Ra9m ba3d nzidha 
                                for(int k=0;k<list.length;k++){
                                    if(list[k].getCategory().isSameCategory(new Item("new",11.01f,users[j],"Alpha",Category.CLOTHES))){   // nzid nthabatha bithabt eny 9arentou m3a oblect eny sna3tou just bech najam n9aren Category
                                        System.out.println(list[k].str());  // print lil Item
                                        System.out.println("\n\n");
                                    }
                                }
                            }
                            
                        }*/
                        System.out.println(this.filterMarket(Category.CLOTHES));
                        break;
                    }else if(newCategory2.equals("6")) {
                        /*for (int j=0;j< users.length;j++) { 
                            if(users[j]!=null){
                                Item[]list=users[j].getItems();    // initalisation ta3list hia ili m9al9etny nthabet kifech na3malha na3mel initialisation bi Ra9m ba3d nzidha 
                                for(int k=0;k<list.length;k++){
                                    if(list[k].getCategory().isSameCategory(new Item("new",11.01f,users[j],"Alpha",Category.ANIMALS))){   // nzid nthabatha bithabt eny 9arentou m3a oblect eny sna3tou just bech najam n9aren Category
                                        System.out.println(list[k].str());  // print lil Item
                                        System.out.println("\n\n");
                                    }
                                }
                            }
                            
                        }*/
                        System.out.println(this.filterMarket(Category.ANIMALS));
                        break;
                    }else if(newCategory2.equals("1")) {
                        /*for (int j=0;j< users.length;j++) { 
                            if(users[j]!=null){
                                Item[]list=users[j].getItems();    // initalisation ta3list hia ili m9al9etny nthabet kifech na3malha na3mel initialisation bi Ra9m ba3d nzidha 
                                for(int k=0;k<list.length;k++){
                                    System.out.println(list[k].str());  // print lil Item
                                    System.out.println("\n\n");
                                }
                            }
                            
                        } */
                        
                       
                        System.out.println(this.str());
                        break;
                    }else{
                        System.exit(0);
                    }

                default:
                    System.exit(0);

            }

        }
        
    }
    

    public static void main(String[] args) {
        // Main Methode darf auch in Main-Klasse sein.
        Marketplace market = new Marketplace();

        User first = new User("Max", "1234");
        User second = new User("Maxine", "4321");

        Item one = new Item(
            "Sandalen",
            10,
            first,
            "Neue Sandalen schwarz. Festpreis!",
            Category.CLOTHES
        );

        Item two = new Item(
            "Hut",
            100,
            second,
            "Toller Hut. Keine Anfragen, wie 'was letzter Preis'.",
            Category.FURNITURE
        );
        Item three = new Item(
            "Game",
            100.11f,
            first,
            "the best Game in the word RDR2",
            Category.FURNITURE
        );

        
        first.addItem(one);
        second.addItem(two);
        first.addItem(three);
        
        market.addUser(first);
        market.addUser(second);
        
        market.cli();
        System.out.println(market.filterMarket(Category.CLOTHES));
        System.out.println("\n");
        System.out.println(market.filterMarket(Category.ELECTRONICS));
        System.out.println("\n");
        System.out.println(market.filterMarket(null));
        System.out.println("\n");
        
    }
}

