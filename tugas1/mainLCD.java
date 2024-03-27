package tugas1;


import java.util.Scanner;

public class mainLCD {
    public static void main(String[] args) {
    clsLCD LCD = new clsLCD();
    clsLCD LCD1 = new clsLCD();
    clsLCD LCD2 = new clsLCD();

    
    LCD.turnOn();
    LCD.setVolume(55);
    LCD.setBrightness(29);
    LCD.volUp();
    LCD.volUp();
    LCD.brightUp();
    LCD.brightUp();
    LCD.brightUp();
    LCD.brightUp();
    LCD.brightDown();
    LCD.setCableUP();
    LCD.setCableUP();
    LCD.setCableDown();
    
    
    LCD1.turnOff();
    LCD1.setVolume(0);
    LCD1.setBrightness(0);
    LCD1.setCableUP();
    LCD1.setCableDown();
    LCD1.setCableDown();

    
    LCD2.freeze();
    LCD2.setVolume(50);
    LCD2.setBrightness(30);
    LCD2.setCableUP();
    LCD2.setCableUP();
    LCD2.setCableUP();
    LCD2.setCableUP();


    LCD.display();
    LCD1.display();
    LCD2.display();
    
   
        
        
        
        


        
    }
    
}
