import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import controlP5.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class elevatorProject extends PApplet {

//By Logan Powers
//R11446104
//Fall 2019


ControlP5 cp5;

int c1,c2;

float n,n1;
Textlabel text;

public void setup() {
  
  noStroke();
  cp5 = new ControlP5(this);
  
  //text
 text = cp5.addTextlabel("label")
                  .setText("Elevator")
                   .setPosition(300,50)
                   .setColorValue(0xffffffff)
                   .setFont(createFont("Georgia",20))
                  ;
  text.setText("Elevator");
  
  //slider
   cp5.addSlider("Current Level")
 .setRange(0,10)
 .setPosition(350,100)
 .setValue(0)
 .setSize(100,580)
 .setColorValue(0xffff88ff)
 .setColorLabel(0xffdddddd);
  
  //left side buttons
  //creates button with name "2" displayed on it 
  cp5.addButton("2")
     .setPosition(200,100)
     .setSize(100,100)
     ;
  
  cp5.addButton("4")
     .setPosition(200,220)
     .setSize(100,100)
     ;
     
  cp5.addButton("6")
     .setPosition(200,340)
     .setSize(100,100)
     ;
     
  cp5.addButton("8")
     .setPosition(200,460)
     .setSize(100,100)
     ;
     
 cp5.addButton("10")
     .setPosition(200,580)
     .setSize(100,100)
     ;
     
  //right side buttons
  
  cp5.addButton("1")
     .setPosition(50,100)
     .setSize(100,100)
     ;
  
  cp5.addButton("3")
     .setPosition(50,220)
     .setSize(100,100)
     ;
     
  cp5.addButton("5")
     .setPosition(50,340)
     .setSize(100,100)
     ;
     
  cp5.addButton("7")
     .setPosition(50,460)
     .setSize(100,100)
     ;
     
 cp5.addButton("9")
     .setPosition(50,580)
     .setSize(100,100)
     ;
   
 //Door open and close, toggle and bang
 
  cp5.addBang("Open")
 .setPosition(50,700)
 .setSize(100,100);
 
  cp5.addBang("Close")
 .setPosition(200,700)
 .setSize(100,100);
 
  cp5.addToggle("Door status check")
 .setValue(false)
 .setPosition(500,100)
 .setSize(100,100); 
}

public void draw() {
  background(0xff000000); 
}

public void controlEvent(ControlEvent theEvent) {
   if(theEvent.getController().getName()=="0") {
 cp5.getController("Current Level").setValue(0); 
 }
   if(theEvent.getController().getName()=="1") {
 cp5.getController("Current Level").setValue(1); 
 }
 if(theEvent.getController().getName()=="4") {
 cp5.getController("Current Level").setValue(4); 
}
 if(theEvent.getController().getName()=="6") {
 cp5.getController("Current Level").setValue(6); 
}
 if(theEvent.getController().getName()=="8") {
 cp5.getController("Current Level").setValue(8); 
}
 if(theEvent.getController().getName()=="10") {
 cp5.getController("Current Level").setValue(10); 
}
 if(theEvent.getController().getName()=="2") {
 cp5.getController("Current Level").setValue(2); 
}
 if(theEvent.getController().getName()=="3") {
 cp5.getController("Current Level").setValue(3); 
}
 if(theEvent.getController().getName()=="5") {
 cp5.getController("Current Level").setValue(5); 
}
 if(theEvent.getController().getName()=="7") {
 cp5.getController("Current Level").setValue(7); 
}
 if(theEvent.getController().getName()=="9") {
 cp5.getController("Current Level").setValue(9); 
}
if(theEvent.getController().getName()=="Open") {
 cp5.getController("Door status check").setValue(1); 
 }
 if(theEvent.getController().getName()=="Close") {
 cp5.getController("Door status check").setValue(0); 
 }
}
  public void settings() {  size(700,850); }
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "--present", "--window-color=#666666", "--stop-color=#cccccc", "elevatorProject" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
