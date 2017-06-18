/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cinemaprototype;
import java.util.Calendar;

/**
 *
 * @author UserPC
 */
public class WeekDay extends Calendar {
    private int weekDay = get(DAY_OF_WEEK);
    
    public int getWeekDay(){
        return weekDay;
    }
    
    public int getLeastMaximum(int d){
        
        return d;
    }
    
    public int getGreatestMinimum(int d){
        return d;
    }
    
    public int getMaximum(int d){
        return d;
    }
    
    public int getMinimum(int d){
        return d;
    }
    
    public void roll (int d, boolean x){
        
    }
    
    public void add(int d, int c){}
        
    
    
    protected void computeFields(){}
    
    
    protected void computeTime(){}
}
