package com.ira.exer3_priority;

/**
 * Created by iryna.sribna on 02.03.2015.
 */
public class MagicBoxWithPriority {

    private Integer priority;

    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    @Override
    public String toString() {
        return "MagicBoxWithPriority{" +
                "priority=" + priority +
                '}';
    }
}
