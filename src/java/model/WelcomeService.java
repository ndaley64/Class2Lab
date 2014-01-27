package model;

import java.util.Calendar;

/**
 *
 * @author Nathaniel
 */
public class WelcomeService {
    private Calendar now = Calendar.getInstance();
    private String currentTimePeriod;
    
    public String getCurrentTimePeriod(){
        now = Calendar.getInstance();
        int currentHour = now.get(Calendar.HOUR_OF_DAY);
        
        if(currentHour < 12){
            currentTimePeriod = "morning";
        }else if(currentHour >= 12 && currentHour < 18){
            currentTimePeriod = "afternoon";
        }else{
            currentTimePeriod = "evening";
        }

        return currentTimePeriod;
    }
    
    public String getWelcomeMessage(String name){
        String welcomeMessage = "Good " + this.getCurrentTimePeriod() + ", " + name + ". Welcome!";
        
        return welcomeMessage;
    }
}
