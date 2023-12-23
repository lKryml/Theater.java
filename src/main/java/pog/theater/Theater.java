/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package pog.theater;
import java.util.*;
/**
 *
 * @author krym
 */
public class Theater {

    public static void main(String[] args) {
        
        ArrayList<Movie> movies = new ArrayList();
        Scanner input = new Scanner(System.in);      
        int choice;
        
        boolean startLoop = true;
        while(startLoop){
        System.out.print("=============== Menu ===============\n[1] Add Movie\n[2] Add Audience\n[3] Display Movies\n[4] Display Audiences\n[5] Exit\n====================================\n\nSelect task: ");
        choice = input.nextInt();
        switch(choice){
            case 1 : System.out.println("<<< Add Movie >>>"); 
            movies.add(new Movie());
            break;
            case 2 : if(!movies.isEmpty()){
                boolean addAud = true;
                while(addAud == true){System.out.println("<<< Add Audience >>>");
                    int i = 0;
                    for(Movie movie : movies){
                        System.out.println(i+1+") "+movie.getTitle()+" ( "+movie.getDate()+" "+movie.getTime()+" )");
                        i++;
                    }
                    System.out.print("Select Movie: ");
                    int mov = input.nextInt();
                    if(mov >0 && mov <=i){
                    Movie selectedMov = movies.get(mov-1);
                    
                    System.out.print("--- Enter Audience Info ---\nName: ");
                    input.nextLine();
                    String name = input.nextLine();
                    
                    System.out.print("Age: ");
                    
                    int age = input.nextInt();
                    if(age <= 2){
                        System.out.print("Parent Name: ");
                        input.nextLine();
                        String parentName = input.nextLine();
                        Boolean loop = true;
                    while(loop){
                    System.out.print("SeatNo: ");
                    int seatNo = input.nextInt();
                    if(selectedMov.seat.get(seatNo)){
                        System.out.println("Seat taken choose another please");
                    }else{
                        selectedMov.seat.set(seatNo, true);
                        selectedMov.addAudience(new Kid(name,age,seatNo,parentName));
                        loop=false;
                        System.out.print("Press 'Y' to Continue>>> ");
                        input.nextLine();
                        
                        String in = input.nextLine();
                        
                        if(!in.equalsIgnoreCase("y")){
                            addAud = false;
                        }
                    }
                    }
                    
                    }else{
                    Boolean loop = true;
                    while(loop){
                    System.out.print("SeatNo: ");
                    int seatNo = input.nextInt();
                    if(selectedMov.seat.get(seatNo)){
                        System.out.println("Seat taken choose another please");
                    }else{
                        selectedMov.seat.set(seatNo, true);
                        
                        selectedMov.addAudience(new Adult(name,age,seatNo));
                        loop=false;
                        System.out.print("Press 'Y' to Continue ");
                        input.nextLine();
                        
                        String in = input.nextLine();
                        
                        if(!in.equalsIgnoreCase("y")){
                             
                            addAud = false;
                        }
                        
                    }
                    }
                    
                    }
                    }
                    else{
                        System.out.println("Movie does not exist");
                    }
            }}else{
                System.out.println("No Movies Available add one first");
                    }
            break;
            case 3 : if(!movies.isEmpty()){
                    for(Movie movie : movies){
               movie.displayinfomovie();
                    System.out.println();}
            }else{
                       System.out.println("There are no movies, please add some first");
                       };
                break;
            
            case 4: 
                System.out.println("<<< Movie(s) and Audience(s) Info >>>");
                System.out.println("Number of Movies: "+ movies.size()+"\n");
                
                int i = 1;
                if(!movies.isEmpty()){
                    for(Movie movie : movies){
               System.out.println("Movie #"+i);
                        movie.displayinfomovie();
                        
                        System.out.println("\nNumber of Audience: "+movie.numAudience+"\nNumber of Adults: "+movie.numAdults+"\nNumber of Kids: "+ movie.numKids+"\n");
                      movie.displayInfoAudience();
                    
                    i++;
                    }}else{
                       System.out.println("There are no movies/audiences, please add some first");
                       };
                    break;
            case 5: System.out.println("Thank you"); startLoop = false; break;
            default : System.out.println("Choose a valid Number"); break;
        }
    }
  }
}

 /* 
System.out.println("No\tName\t\tAge\tParent Name\t\tSeat No\tTicket(USD)");
                    for(Audience aud : movie.audienceList){
                        aud.displayDetails();
                        System.out.print("\t"+movie.price * aud.calcDisc());
                        
                        System.out.print("test");
                    }
                    System.out.println("done");
*/
