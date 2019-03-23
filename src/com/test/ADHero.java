package com.test;

import property.Item;

import property.LifePotion;

public class ADHero extends Hero implements AD{
    int moveSpeed = 400; // 移动速度

    

    @Override

    public void physicAttack() {

        System.out.println("进行物理攻击");

    }

 

    public int getMoveSpeed() {

        return this.moveSpeed;

    }

 

    public int getMoveSpeed2() {

        return super.moveSpeed;

    }

 

    // 重写useItem，并在其中调用父类的userItem方法

    public void useItem(Item i) {

        System.out.println("adhero use item");

        super.useItem(i);

    }

 

    public static void main(String[] args) {

        ADHero h = new ADHero();

 

        LifePotion lp = new LifePotion();

 

    }
  
}
