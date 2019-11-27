package com.example.runner;

public class Wizard extends Сaracter {

    private int damage;
    private int health;

    public void Wizard(String name, int speed,int damage) {
        super.Caracter(name, speed);
        this.damage = damage;
    }

    @Override
    public void attack(int damage) {
        this.health-=damage;
    }
}
