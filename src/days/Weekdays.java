/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package days;

/**
 *
 * @author sivagamasrinivasan
 */
public class Weekdays 
{
    
    enum Day { MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY, SUNDAY }
    
    public void nameofDay(int dayNum){
        if (dayNum >= 1 && dayNum <=7){
            Day[] days = Day.values();
            System.out.println("The Day is: " + days[dayNum - 1]);
            
        }
        else {
            System.out.println("Invalid day number");
        }
    
  
  
}
}


