package com.ira.exer2a;

import java.util.LinkedList;
import java.util.List;

/**
 * Created by iryna.sribna on 02.03.2015.
 */
public class LampMagicBoxTest {

    public static void main(String[] args) {
        List<LampAbstract> magicLamps = new LinkedList<LampAbstract>();
        magicLamps.add(new TableLamp());
        magicLamps.add(new CeilingLamp());

        LampMagicBox box = new LampMagicBox();

        System.out.println("The total price: " + box.getTotalPrice(magicLamps));
    }
}
