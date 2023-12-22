/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pog.theater;

/**
 *
 * @author krym
 */
public class Adult extends Audience {
   
    public Adult(String name, int age, int seatNo){
        super(name,age,seatNo);
    }
    
    
    public void displayDetails(){
        super.displayDetails();
        System.out.print("\t"+"-"+"\t\t"+seatNo);
    }
    
    public double calcDisc(){
        if(age >= 60){
            return 0.8;
        }
        else{
            return 1;
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSeatNo() {
        return seatNo;
    }

    public void setSeatNo(int seatNo) {
        this.seatNo = seatNo;
    }
    
    
}
