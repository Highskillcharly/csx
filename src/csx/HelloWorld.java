package csx;

import org.lwjgl.LWJGLException;
import org.lwjgl.opengl.Display;
 
public class HelloWorld {
    public static void main (String args[]){
        try {
            Display.setTitle("Hello World");
            Display.create();
            
            while(true){Thread.yield();}
            
        } catch (LWJGLException e) {
            e.printStackTrace();
        }
    }
}