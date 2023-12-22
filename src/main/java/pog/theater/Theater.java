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
        System.out.println("Hello World!");
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
            case 2 : if(!movies.isEmpty()){System.out.println("<<< Add Audience >>>");
                    int i = 0;
                    for(Movie movie : movies){
                        System.out.println(i+1+") "+movie.getTitle()+" ( "+movie.getDate()+" "+movie.getTime()+" )");
                        i++;
                    }
                    System.out.print("Select Movie: ");
                    int mov = input.nextInt();
                    if(mov >0 && mov <=i){
                    Movie selectedMov = movies.get(mov-1);
                    
                    System.out.print("--- Enter Audience Info ---\n Name: ");
                    String name = input.nextLine();
                    input.nextLine();
                    System.out.print("Age: ");
                    int age = input.nextInt();
                    input.nextLine();
                    if(age <= 2){
                        System.out.print("Parent Name: ");
                        String parentName = input.nextLine();
                    }
                    Boolean loop = true;
                    while(loop){
                    System.out.print("SeatNo: ");
                    int seatNo = input.nextInt();
                    if(selectedMov.seat.get(seatNo)){
                        System.out.print("Seat taken choose another please");
                    }else{
                        selectedMov.seat.set(seatNo, true);
                        loop=false;
                    }
                    }
                    
                    }
     
                    else{
                        System.out.println("Movie does not exist");
                    }
            }else{
                System.out.println("No Movies Available add one first");
                    };
            break;
            case 3: 
                if(!movies.isEmpty()){
                    for(Movie movie : movies){
               movie.displayinfomovie();}
            }else{
                       System.out.println("There are no movies, please add some first");
                       };
                break;
            
            case 4: System.out.println("4"); break;
            case 5: startLoop = false; break;
            default : System.out.println("Choose a valid Number"); break;
        }
    }
  }
}
