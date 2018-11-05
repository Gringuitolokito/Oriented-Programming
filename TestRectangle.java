/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Gringuitolokito
 */
public class TestRectangle {

    public static void main(String[] args) {
        RectangleFromSimpleGeometricObject rectangle = new RectangleFromSimpleGeometricObject(2, 4);
        
        System.out.println("\nA rectangle " + rectangle.toString());
        
        System.out.println("The area is " + rectangle.getArea());
        
        System.out.println("The perimeter is "
                + rectangle.getPerimeter());
    }

}
