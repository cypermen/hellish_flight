package com.example.runner;public abstract class Сaracter implements Unit{    private String name;    private int speed;    private int x;    private int y;    public void Caracter(String name ,int speed) {        this.name = name;        this.x = 5;        this.y = 5;        this.speed = speed;    }    @Override    public void moveRight() {        this.x+=speed;    }    @Override    public void moveLeft() {        this.x-=speed;    }    @Override    public void moveUp() {        this.y-=speed;    }    @Override    public void moveDown() {        this.y+=speed;    }    String getName(){        return this.name;    }    void  setName(String name){        this.name = name;    }}