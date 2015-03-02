package com.ira.exer3_priority;

import java.util.Comparator;

/**
 * Created by iryna.sribna on 02.03.2015.
 */
public class PriorityComparator implements Comparator<MagicBoxWithPriority> {
    @Override
    public int compare(MagicBoxWithPriority o1, MagicBoxWithPriority o2) {
        return o1.getPriority().compareTo(o2.getPriority());
    }
}
