/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pog.theater;

/**
 *
 * @author krym
 */
public class Kid extends Audience{
    
    String parentName;
    public Kid(String name, int age, int seatNo, String parentName){
        super(name,age,seatNo);
        this.parentName = parentName;
        
    }
    
    

    public void displayDetails(){
        super.displayDetails();
        System.out.print("\t"+parentName+"\t\t\t"+ seatNo);
    }
    
    public String getParentName(){
        return parentName;
    }
    
    public double calcDisc(){
        if(age <= 2){
            return 0;
        }
        else if(age <= 12){
            return 0.80;
        }else{
            return 1;
        }
    }
}
