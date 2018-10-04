package com.fernandopaniagua.supercarreras2;

import java.awt.image.BufferedImage;

public class Car {
    private String nombre;
    private BufferedImage sprite;
    private float speed;
    private float xPos;
    private float yPos;

    public Car(String nombre, BufferedImage sprite, float speed, float xPos, float yPos) {
        this.nombre = nombre;
        this.sprite = sprite;
        this.speed = speed;
        this.xPos = xPos;
        this.yPos = yPos;
    }
    
    public void arrancar() {
        System.out.println("ARRANCANDO " + nombre);
    }
            
    
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public BufferedImage getSprite() {
        return sprite;
    }

    public void setSprite(BufferedImage sprite) {
        this.sprite = sprite;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getxPos() {
        return xPos;
    }

    public void setxPos(float xPos) {
        this.xPos = xPos;
    }

    public float getyPos() {
        return yPos;
    }

    public void setyPos(float yPos) {
        this.yPos = yPos;
    }

    
    
    
    
    
    
}
