package com.test;

import property.Item;

import property.LifePotion;

public class ADHero extends Hero implements AD{
    int moveSpeed = 400; // �ƶ��ٶ�

    

    @Override

    public void physicAttack() {

        System.out.println("����������");

    }

 

    public int getMoveSpeed() {

        return this.moveSpeed;

    }

 

    public int getMoveSpeed2() {

        return super.moveSpeed;

    }

 

    // ��дuseItem���������е��ø����userItem����

    public void useItem(Item i) {

        System.out.println("adhero use item");

        super.useItem(i);

    }

 

    public static void main(String[] args) {

        ADHero h = new ADHero();

 

        LifePotion lp = new LifePotion();

 

    }
  
}
