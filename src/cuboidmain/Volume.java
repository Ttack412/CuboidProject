
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ttackett
 */
package cuboidmain;

public class Volume<T extends Cube> {
    
    private double volume;
   
    public double getVolume(T cube){
        volume = cube.getHeight().doubleValue() * cube.getWidth().doubleValue() * cube.getWidth().doubleValue();
        return volume;
    }   
}
