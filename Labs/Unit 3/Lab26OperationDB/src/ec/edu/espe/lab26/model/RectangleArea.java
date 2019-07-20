/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.lab26.model;

/**
 *
 * @author Jhony Naranjo
 */
public class RectangleArea {
    private float base;
    private float heigt;
    private float area;
    private int id;

    public RectangleArea() {
    }

    public float getBase() {
        return base;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    public void setBase(float base) {
        this.base = base;
    }

    public float getHeigt() {
        return heigt;
    }

    public void setHeigt(float heigt) {
        this.heigt = heigt;
    }

    public float getArea() {
        return area;
    }

    public void setArea(float area) {
        this.area = area;
    }

}
