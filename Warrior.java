package com.dmdev.oop.lesson15;

public class Warrior extends Hero{
    public Warrior(String name, int damage) {
        super(name, damage);
    }

    @Override
    public void attackEnemy(Enemy enemy){
        System.out.println(getName()+" is swinging his sword to " + enemy.getName());
        enemy.takeDamage(getDamage());
    }
}
