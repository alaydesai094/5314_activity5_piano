
// This #include statement was automatically added by the Particle IDE.
#include <InternetButton.h>

#include "math.h"


InternetButton b = InternetButton();


// Global variables to store how many lights should be turned on
int numLights = 6;
bool numLightsChanged = false;


void setup() {

    // 1. Setup the Internet Button
    b.begin();

    // 2. Setup the API endpoint -- 
    // When person visits http://particle.io/..../lights, run the controlNumLights() function
    Particle.function("key", controlNumLights);

    // 3. Setup the initial state of the LEDS
    // (by default, turn on 6 lights)
  //  activateLEDS();

}

void loop(){
    
    // This loop just sits here and waits for the numLightsChanged variable to change to true
    // Once it changes to true, run the activateLEDS() function.
  
}

// Turn on your LEDS
void activateLEDS(){

    // 1. turn off all lights
    b.allLedsOff();
    
    // 2. Turn on a certain number of lights
    // howManyLights = the number of lights you want to turn on
    for(int i = 1; i <= numLights; i++) {
        //  3. Make each led BLUE
        //  Blue = (r, g, b) = (0, 0, 255)
        b.ledOn(i, 0, 0, 255);
    }
}

/*
controlNumLights() is the local function that is executed when the API function "lights" is called.
It changes how many LEDs on the Button are illuminated.
*/
int controlNumLights(String command){
   
   if(command == "A")
   {
        b.rainbow(1);
        b.playSong("C3,10,D6,10");
        b.allLedsOff();
   }
   
   else if(command == "B")
   {
        b.rainbow(1);
        b.playSong("E5,8,G5,8,D6,8");
        b.allLedsOff();
      
   }
   
     else if(command == "C")
   {
        b.rainbow(1);
        b.playSong("E5,12,G5,8,D6,12");
        //b.allLedsOff();
     
   }
   
     else if(command == "D")
   {
        // b.rainbow(8);
        b.playSong("D6,6,C6,15");
        b.allLedsOff();
     
   }
   
     else if(command == "E")
   {
        b.rainbow(1);
        b.playSong("G5,8,D6,8");
        b.allLedsOff();
   
   }
   
     else if(command == "F")
   {
        // b.rainbow(8);
        b.playSong("E5,5,G5,5");
        b.allLedsOff();
     
   }
   
     else if(command == "G")
   {
        b.rainbow(1);
        b.playSong("G4,4,D6,4");
        b.allLedsOff();
     
   }
   
     else if(command == "H")
   {
        b.rainbow(1);
        b.playSong("G5,8,D6,8");
        b.allLedsOff();
   }
   
    else if(command == "AB")
   {
        b.rainbow(1);
        b.playSong("C3,10,D6,10,E5,8,G5,8,D6,8");
        b.allLedsOff();
   }
   
   else if(command == "BC")
   {
        b.rainbow(1);
        b.playSong("E5,8,G5,8,D6,8,E5,12,G5,8,D6,12");
        b.allLedsOff();
   }
   else if(command == "CD")
   {
        b.rainbow(1);
        b.playSong("E5,8,G5,8,D6,8,E5,12,G5,8,D6,12");
        b.allLedsOff();
   }
    return 1;
}
