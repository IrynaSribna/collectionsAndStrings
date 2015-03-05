package com.ira.exer2;

/**
 * Created by iryna.sribna on 04.03.2015.
 */
public class MyMagicBox<S1 extends Furniture, S2 extends Furniture, S3 extends Furniture> {

    private S1 slot1;
    private S2 slot2;
    private S3 slot3;


    public Double getTotalPrice() {
        return slot1.getPrice() + slot2.getPrice() + slot3.getPrice();
    }

    public S1 getSlot1() {
        return slot1;
    }

    public void setSlot1(S1 slot1) {
        this.slot1 = slot1;
    }

    public S2 getSlot2() {
        return slot2;
    }

    public void setSlot2(S2 slot2) {
        this.slot2 = slot2;
    }

    public S3 getSlot3() {
        return slot3;
    }

    public void setSlot3(S3 slot3) {
        this.slot3 = slot3;
    }


    public static void main(String[] args) {

        MyMagicBox<BeanBag, Chair, MyLamp> magicBox = new MyMagicBox<>();

        magicBox.getSlot1();
    }

}
