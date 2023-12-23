/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pog.theater;
import java.util.*;
import java.util.Scanner;
/**
 *
 * @author krym
 */
public class Movie implements Time, Date{
 String title;
 ArrayList<Boolean> seat;
 double price;
 int numKids;
 int numAdults;
 int numAudience;
 int hallNo;
 ArrayList<Audience> audienceList = new ArrayList();
 int hour,minute;
 int day,month,year;
 
 
 
 
 public Movie(){
     seat = new ArrayList<>(Collections.nCopies(100,false));
     readInput();
     
 }
 
 public void getDateTime(){
     
 }
 
 public void readInput(){
     Scanner input = new Scanner(System.in);
     System.out.println("Enter movie title:");
     this.title = input.nextLine();
     System.out.println("Enter Hall Number:");
     this.hallNo = input.nextInt();
     System.out.println("Enter Ticket Price:");
     this.price = input.nextDouble();
     System.out.println("Enter The Time of the Movie");
     readTime();
     System.out.println("Enter The Date of the Movie");
     readDate();
     
    
     
 }

    
 
 public void addAudience(Audience person){
     audienceList.add(person);
     if(person instanceof Kid){
         numKids++;
         
     }else{
         numAdults++;
     }
     numAudience++;
 }
 
 
 public void displayinfomovie(){
     System.out.println("Title: "+ title +"\n"+ "Hall: "+hallNo+"\n"+ "Price: "+ price);
     dispDate();
     dispTime();
     System.out.println("Price: "+ price);
 }
 public void displayInfoAudience(){
     int i = 1;
     int ticketTotal = 0;
     System.out.println("No\tName\t\tAge\tParent Name\t\tSeat No\tTicket");
     for(Audience person : audienceList){
         System.out.print(i+".\t");
         person.displayDetails();
         System.out.println("\t"+price*person.calcDisc());
         ticketTotal += price*person.calcDisc();
         i++;
     }
     System.out.println("\nTotal ticket price = "+ticketTotal+"\n");
     
 }

    
    public void dispTime() {
        System.out.println("Time: "+hour+":"+minute);
    }

    public String getTime(){
        return hour+":"+minute;
    }
    public void readTime() {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Hour:");
        this.hour = read.nextInt();
        System.out.println("Enter Minute:");
        this.minute = read.nextInt();
    }

    
    public void dispDate() {
        System.out.println("Date: "+month+"-"+day+"-"+year);
    }
    
    public String getDate(){
        return month+"-"+day+"-"+year;
    }
    
    public void readDate() {
        Scanner read = new Scanner(System.in);
        System.out.println("Enter Day:");
        this.day = read.nextInt();
        System.out.println("Enter Month:");
        this.month = read.nextInt();
        System.out.println("Enter Year:");
        this.year = read.nextInt();
    }
 
    public String getTitle() {
        return title;
    }
    
 
 
}
