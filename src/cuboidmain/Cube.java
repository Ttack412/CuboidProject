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
public class Cube<T extends Number> {
    private T length;
    private T width;
    private T height;

    public Cube(T length, T width, T height) {
        this.length = length;
        this.width = width;
        this.height = height;
    }

    public Cube() {
        
    }
    
    public T getLength() {
        return length;
    }

    public void setLength(T length) {
        this.length = length;
    }

    public T getWidth() {
        return width;
    }

    public void setWidth(T width) {
        this.width = width;
    }

    public T getHeight() {
        return height;
    }

    public void setHeight(T height) {
        this.height = height;
    }

    @Override
    public String toString() {
        return "Cube's length = " + length + ", width = " + width + ", height = " + height;
    }
}
