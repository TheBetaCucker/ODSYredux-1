import java.awt.*;
import java.awt.event.*;
import java.lang.Math;

public class ball{
    int spin1 = 0;
    int spin2 = 0;
    boolean directionRight = true;
    double speed = 0.5;
    double x;
    double y;
    int size = 30;
    
    private ODSYRunner game;
    
    public ball(ODSYRunner in){
        game = in;
        x = game.xSize/2;
        y = game.ySize/2;
    }
    
    public void move(){
        if(directionRight){
            x = x + (speed*(Math.cos(spin1)));
            y = y + (speed*(Math.sin(spin1)));
        }
        else{
            x = x - (speed*(Math.cos(spin2)));
            y = y - (speed*(Math.sin(spin2)));
        }
    }
    
    public void keyTyped(int a){
    }
    
    public void setSpeed(int newSpeed){
        speed = newSpeed;
    }
    
    public void addSpin1(){
        spin1 = spin1 + 50;
    }
    
    public void addSpin2(){
        spin2 = spin2 + 50;
    }
    
    public void subtractSpin1(){
        spin1 = spin1 - 50;
    }
    
    public void subtractSpin2(){
        spin2 = spin2 - 50;
    }
    
    public void addSpeed(){
        speed++;
    }
    
    public void setDirection(boolean dir){
        directionRight = dir;
    }
    
    public void setPosition(int xIn, int yIn){
        x = xIn;
        y = yIn;
    }
    
    public void setSpin1(int spinIn){
        spin1 = spinIn;
    }
    
    public void setSpin2(int spinIn){
        spin1 = spinIn;
    }
    
    public int getX(){
        return (int)x;
    }
    
    public int getY(){
        return (int)y;
    }
    
    public int getSize(){
        return size;
    }
    
    public void paint(Graphics2D g) {
            g.fillOval( (int)Math.floor(x), (int)Math.floor(y), size, size);
    }

}