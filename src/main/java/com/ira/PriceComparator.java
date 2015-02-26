package com.ira;

import java.util.Comparator;

/**
 * Created by Iryna on 2/26/15.
 */
public class PriceComparator implements Comparator<MyKeaItem> {

    @Override
    public int compare(MyKeaItem myKeaItem1, MyKeaItem myKeaItem2) {
        return (myKeaItem1.getPrice().compareTo(myKeaItem2.getPrice()));
    }
}
