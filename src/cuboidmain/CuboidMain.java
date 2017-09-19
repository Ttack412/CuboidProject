/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cuboidmain;

/**
 *
 * @author ttackett
 */
public class CuboidMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {  
        
        
        Volume volume = new Volume();
        Cube<Integer> CubeOne = new Cube(1,2,3);
        Cube<Double> CubeTwo = new Cube();
        
        CubeTwo.setHeight(2.5);
        CubeTwo.setLength(2.5);
        CubeTwo.setWidth(2.5);
        
        System.out.println(CubeOne);
        System.out.println(CubeTwo);
        
        System.out.println("");
        
        System.out.println("Cube One's volume is " + volume.getVolume(CubeOne));
        
        System.out.println("");
        
        System.out.println("Cube Two's volume is " + volume.getVolume(CubeTwo));
    } 
}
