/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaprototype;
//import java.util.Calendar;
/**
 *
 * @author Edidiong Asifa
 */
public class CinemaPrototype {

    /**
     * @param args the command line arguments
     */
    
   
    
    public static void main(String[] args) {
        
         double price;
         double payable;
         double totalPrice;
         boolean transaction = true;
         Ticket ticket = new Ticket();
         //String[] day_Of_Purchase = {"Sunday","Monday","Tuesday","Wednesday","Thursady","Friday","Saturday"};
         //int[] days = {1,2,3,4,5,6,7};
        //WeekDay day = new WeekDay();
        //System.out.println(day.getWeekDay());
        
        //Calendar day = Calendar.getInstance();
        //System.out.println(day);
        //WeekDay week = new WeekDay();
        
        //Calendar weekDay = week.get(day);
        
        Customer standardCustomer = new StandardCustomer("Eddy", "Smith", 37);
        Customer studentCustomer = new StudentCustomer("Caroline", "John", 25);
        Customer childCustomer = new ChildCustomer("Victoria","Michaels", 5);
        Customer oapCustomer = new OAPCustomer ("Bob","Michaels", 67);
        
        Customer [] customers = {standardCustomer, studentCustomer, childCustomer, oapCustomer};
        
        totalPrice = 0.0;
        payable = 0.0;
        while(transaction){
            for (Customer currentCustomer : customers){
                if (currentCustomer == null){
                    System.out.print("Customer Type not selected");
                    transaction = false;
                }
                else{
                    if (currentCustomer instanceof StudentCustomer){
                        StudentCustomer cust = (StudentCustomer) currentCustomer;
                        int age = cust.getAge();
                        price = ticket.getStudentPrice();
                        payable = ticket.purchaseTicket(price, age, 1, "Wednesday");
                    }
                    else{
                        if (currentCustomer instanceof ChildCustomer){
                            ChildCustomer cust = (ChildCustomer) currentCustomer;
                            int age = cust.getAge();
                            price = ticket.getChildPrice();
                            payable = ticket.purchaseTicket(price, age, 1, "Wednesday" );
                        }
                        else{
                            if (currentCustomer instanceof StandardCustomer){
                            StandardCustomer cust = (StandardCustomer) currentCustomer;
                            int age = cust.getAge();
                            price = ticket.getStandardPrice();
                            payable = ticket.purchaseTicket(price, age, 1, "Wednesday");
                            }
                            else{
                                if(currentCustomer instanceof OAPCustomer){
                                    OAPCustomer cust = (OAPCustomer) currentCustomer;
                                    int age = cust.getAge();
                                    price = ticket.getOAPPRICE();
                                    payable = ticket.purchaseTicket(price, age, 1, "Wednesday");
                                }
                            }

                        }
                    }
                }
                totalPrice = totalPrice + payable;
            }// end for loop
            transaction = false;    
        }// end while
        
        System.out.println("The total cost of tickets for this movie is " + "£" + totalPrice);
        // TODO code application logic here
    }// end method Main
    
}// end of class CinemaPrototype
