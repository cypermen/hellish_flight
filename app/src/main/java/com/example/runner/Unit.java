package com.example.runner;

public interface Unit {

    // Movement of unit
    public void moveRight();

    public void moveLeft();

    public void moveUp();

    public void moveDown();

    public void attack(int damage);

}
