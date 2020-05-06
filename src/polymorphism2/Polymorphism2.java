/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package polymorphism2;

/**
 *
 * @author PC
 */
public class Polymorphism2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Circle c = new Circle();
        Print a  = new Print();
        a.printShape(c);
       
      
        
        Shape r =new  Rectangle();
        r.Draw();
        
        Traiangle t = new Traiangle();
        t.Draw();
        
    }
    
}
