/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package pog.theater;

/**
 *
 * @author krym
 */
public abstract class Audience {
    String name;
    int age;
    int seatNo;
    public Audience(String name, int age, int seatNo){
        this.age = age;
        this.name = name;
        this.seatNo = seatNo;
    }
    
    public void displayDetails(){
        System.out.print(this.name+"\t\t"+this.age);
    }
    
    public abstract double calcDisc();
}
