/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaprototype;

/**
 *
 * @author Edidiong 
 */
public abstract class Customer {
    protected String firstName;
    protected String lastName;
    protected int age;
    
    public Customer(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    public abstract void setAge(int a);//{
        //age = ((a >= 3 && a<= 100) ? a : 0);
//        boolean counter = true;
//        while(counter){
//            if ((a >= 3) && (a <= 100)){
//                age = a;
//                counter = false;
//            }
//            else{
//                a = 0;
//                System.out.print("Invalid age entered. Enter age between 3 and 100");
//                
//            }
//        }
        
    //}
    
    public int getAge(){
        return age;
    }
    
    public void setFirstName(String name){
        firstName = name;
    }
    
    public String getFirstName(){
        return firstName;
    }
    
    public void setLastName(String name){
        lastName = name;
    }
    
    public String getLastName(){
        return lastName;
    }
}
