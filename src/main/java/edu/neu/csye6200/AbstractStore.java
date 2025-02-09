package edu.neu.csye6200;

import java.util.ArrayList;
import java.util.List;

abstract class AbstractStore {
    protected List<Item> inventory = new ArrayList<>();
    public abstract void demo();
}
