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
    Adult parent = null;
    
    public Kid(String name, int age, int seatNo,Adult parent){
        super(name,age,seatNo);
        this.parent = parent;
        
    }
    
    
    public void displayDetails(){
        super.displayDetails();
        System.out.print("\t"+parent.getName()+"\t\t"+ seatNo);
    }
    
    public String getParentName(){
        return parent.name;
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
