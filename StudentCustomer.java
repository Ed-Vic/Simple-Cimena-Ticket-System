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
public class StudentCustomer extends Customer {
    
    public StudentCustomer(String first, String last, int age){
        super(first, last);
        setAge(age);
    }
    
    public void setAge(int a){
        if ((a >= 17)&& (a <= 40)){
            age = a;
        }
        else{
            age = 0;
            System.out.print("Invalid age entered. Enter age between 17 and 40");
            System.exit(0);
        }
    }
    
}
