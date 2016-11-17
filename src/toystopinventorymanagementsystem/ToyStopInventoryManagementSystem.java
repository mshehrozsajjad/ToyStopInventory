package toystopinventorymanagementsystem;

import java.time.LocalDateTime;
import java.util.*;
import java.util.List;
import java.util.Random;
import javax.swing.JOptionPane;
import java.util.Scanner;
import java.io.*;
/*
 *
 * @author Fahad Satti
 */
public class ToyStopInventoryManagementSystem implements java.io.Serializable{
    ToyStopService tsService = new ToyStopService();
    public void init(){
        
        tsService.initEmployees();
        tsService.initStores();
        tsService.initToys();
       
        System.out.println("Init complete");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        ToyStopInventoryManagementSystem tsims = new ToyStopInventoryManagementSystem();
        //tsims.init();
        
        //load previous data
       tsims.loadData(); //Load Data if exsists
        
        tsims.showMenu();
      //  tsims.printAll();
        
    }

    private void loadData() {
         try {
         FileInputStream fileIn = new FileInputStream("ToyStopService.ser");
         ObjectInputStream in = new ObjectInputStream(fileIn);
         this.tsService = (ToyStopService) in.readObject();
         in.close();
         fileIn.close();
          System.out.println("Data Successfully Loaded from ToyStopService.ser");
      }catch(IOException i) {
        System.out.println("ToyStopService.ser File not found.");
        init();
         return;
      }catch(ClassNotFoundException c) {
         System.out.println("ToyStopService class not found");
         
         return;
      }
    }

    private void showMenu() {
        int choice = 1;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("+---------------------------------------------------+");
        System.out.println("|                                                   |");
        System.out.println("|  Welcome to Toy Stop Inventory Management System  |");
        System.out.println("|                                                   |");
        System.out.println("+---------------------------------------------------+");
        while(choice != 0){
        System.out.println("\n******************* MENU ************************");
        System.out.println("Enter 0 to Exit");
        System.out.println("Enter 1 to show all data");
        System.out.println("Enter 2 to add a new Store");
        System.out.println("Enter 3 to add a new Employee");
        System.out.println("Enter 4 to add a new Toy");
        System.out.println("Enter 5 to save state");
        
        choice = scanner.nextInt();
        if(choice == 1){
            printAll();
        }
        else if(choice == 2){
          addStore();
        }
        else if(choice == 3){
            addEmployee();
        }
        else if(choice == 4){
            addToy();
        }
        else if(choice == 5){
             saveState();
        }
        }
        
    }
     private void saveState() {
          try {
         FileOutputStream fileOut =
         new FileOutputStream("ToyStopService.ser");
         ObjectOutputStream out = new ObjectOutputStream(fileOut);
         out.writeObject(this.tsService);
         out.close();
         fileOut.close();
         System.out.printf("Serialized data is saved in ToyStopService.ser");
         }catch(IOException i) {
         i.printStackTrace();
      }
    }
     private void printAll() {
        System.out.println(this.tsService.stores);
    }
     private void addToy() {
         System.out.println("\nToy ID: "+this.tsService.addToy()+" created.");
    }
     private void addStore() {
        System.out.println("\nStore ID: "+this.tsService.addStore()+" created.");
    }
    private void addEmployee() {
        System.out.println("\nEmployee ID: "+this.tsService.addEmployee()+" created.");
    }
    
}
