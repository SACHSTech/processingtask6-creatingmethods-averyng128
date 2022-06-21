/**
 * Name: Processing Task - 6
 * Purpose: Create methods
 * Author: A. Ng
 */

import processing.core.PApplet;

public class Sketch extends PApplet {
	
	
  /**
   * Called once at the beginning of execution, put your size all in this method
   */
  public void settings() {
    size(400, 400);
  }
  
  public void setup() {
    background(255);
  }

  public void draw() {

    // Draws UnknownShape
    intDrawUnknownShape(200, 100);

    // Draws house 
    intDrawHouse(30, 200, 30, 50, 100);

    //Draws sun
    intSun(0);
 
    }  

   /**
   * draws the sun
   * 
   * @param UnknownShapeX: x coordinate of UnknownShape
   * @param UnknownShapeY: y coordinate of UnknownShape
   * 
   */
  public void intDrawUnknownShape(int intUnknownShapeX, int intUnknownShapeY) {

    stroke(0);
    translate(intUnknownShapeX, intUnknownShapeY);
    
    for (int i = 0; i <= 8; i += 1) {
      
      fill(0, 0, 0);
      ellipse(0, 0, width/10, height/3);  
      }
      fill(0, 0, 0);
      ellipse(0, 0, width/6, height/6);
    
    }

  /**
   * Draws the house
   * 
   * @param intR: Red value for rgb 
   * @param intG: Green value for rgb 
   * @param intB: Blue value for rgb 
   * @param intHouseX: x coordinate for house and roof
   * @param intHouseY: y coordinate for house and roof
   * 
   */
  public void intDrawHouse(int intR, int intG, int intB, int intHouseX, int intHouseY) {

    // draw house body
    fill(intR, intG, intB);
		rect(intHouseX, intHouseY, 150, 125);
  
    // draw house roof
    fill(intR, intG, intB);
    triangle(intHouseX - 35, intHouseY, intHouseX + 180, intHouseY, intHouseX + 70, intHouseY - 70);
    }  

  /**
   * draws the sun
   * 
   * @param intSunX: x coordinate of sun
   * 
   */
  public void intSun(int intSunX) {
    intSunX = intReturnSun(intSunX);
    fill(255, 255, 0);
    ellipse(intSunX, 50, width/6, height/6);
    }  
  

  /**
   * takes the value of intReturnSunX and returns it 50 to the right
   * 
   * @param intReturnSunX: x value of sun
   * 
   */
  public int intReturnSun(int intReturnSunX) {
    intReturnSunX = intReturnSunX + 50;
    // return value of intSunX and intSunY
    return intReturnSunX;
    } 

}