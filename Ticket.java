/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaprototype;
import java.util.Calendar;

/**
 *
 * @author Edidiong
 */
public class Ticket {
    
    private final double STANDARD_PRICE;
    private final double STUDENT_PRICE;
    private final double CHILD_PRICE;
    private final double OAP_PRICE;
    private double ticketPrice;
    //private WeekDay day;
    private int discount;
    
    Calendar weekDay =  Calendar.getInstance();
    //int day = Calendar.get(WEDNESDAY);
    
    
    public Ticket(){
        STANDARD_PRICE = 8.0;
        STUDENT_PRICE = 6.0;
        CHILD_PRICE = 4.0;
        OAP_PRICE= 6.0;
        //day = new WeekDay();
        //String [] days_Of_Week = {"Sunday","Monday","Tuesday","Wednesday","Thursady","Friday","Saturday"};
        //int[] days = {1,2,3,4,5,6,7};
        discount = 0;
    }
    
    public double getStandardPrice(){
        return STANDARD_PRICE;
    }
    
    public double getStudentPrice(){
        return STUDENT_PRICE;
    }
    
    public double getChildPrice(){
        return CHILD_PRICE;
    }
    
    public double getOAPPRICE(){
        return OAP_PRICE;
    }
    public double purchaseTicket(double price, int age, int quantity, String day){
        // purchaseDay represents day of the week in intergers, with Sunday = 1, Monday = 2, etc.
        int customerAge = age;
        
        if (quantity <= 0){
            System.out.print("Enter a valid number of tickets to purchase");
        }
        else{
            
             if (day.equals("Wednesday")){
                 discount = quantity * 2;
                 ticketPrice = (price * quantity) - discount;

             }
             else{
                 ticketPrice = price * quantity;
             }
            
        }
        
        return ticketPrice;
    }// end method purchaseTicket
}// end class Ticket
