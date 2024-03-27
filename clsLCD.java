package tugas1;
import java.util.Scanner;
public class clsLCD {
  private String status;
  private int volume;
  private int brightness;
  private String cable;
  private int typeCable;
  
  
public clsLCD() {
    this.status = "";
    this.volume = 50;
    this.brightness = 30;
    this.cable = "";



}


public void turnOff(){
    this.status = "off";
    
}

public void turnOn(){
    this.status = "on";
}

public void freeze(){
    this.status = "freeze";
}

public void volUp() {
    int temp = volume;
    temp++;
    this.volume = temp;
}

public void volDown(){
    int temp = volume;
    temp--;
    this.volume = temp;
}

public void brightUp(){
    int temp = brightness;
    temp++;
    this.brightness = temp;
}

public void brightDown(){
    int temp = brightness;
    temp--;
    this.brightness = temp;
}

public void setStatus(String status){
    this.status = status;
}

public void setVolume(int volume) {
    this.volume = volume;
}

public void setBrightness(int brightness) {
    this.brightness = brightness;
}

public void setCableUP() {
    this.typeCable++;
    setCable();
    check();
}

public void setCableDown() {
    this.typeCable--;
    setCable();
    check();
}

public void check(){
    if(typeCable < 1) {
        typeCable = 4;
    }
    // else if (typeCable > 4) {
    //     System.out.println("invalid type");
    // }
}

public void setCable(){
    
    
    switch (typeCable) {
        
        case 1 :
        cable = "VGA";
        
            break;

        case 2 :
        cable = "DVI";
            break;

        case 3 :
        cable = "HDMI";
            break;

        case  4 :
        cable = "DisplayPort" ;
            break;

            default:
            
            
    }
}




public void display() {
    System.out.println("---------------------------");
    System.out.println("Welcome to the LCD control panel!");
    System.out.println("LCD status\t: " + this.status);
    System.out.println("Volume\t\t: " + this.volume);
    System.out.println("Brightness\t: " + this.brightness);
    System.out.println("Cable type\t: " + this.cable); 
}
}






