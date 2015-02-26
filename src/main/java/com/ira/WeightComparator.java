package com.ira;

import java.util.Comparator;

/**
 * Created by Iryna on 2/26/15.
 */
public class WeightComparator implements Comparator<MyKeaItem> {

    @Override
    public int compare(MyKeaItem myKeaItem1, MyKeaItem myKeaItem2) {
        return (myKeaItem1.getWeight().compareTo(myKeaItem2.getWeight()));
    }
}
