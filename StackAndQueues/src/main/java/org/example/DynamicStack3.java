package org.example;
import java.util.*;
public class DynamicStack3 extends CustomStack2 {                //here CustomStack2 is the parent class
    public DynamicStack3(){
        super(); //if u don't pass anything , use super
                 //it will call the constructor in the parent class that does not take any argument i.e. CustomStack()
    }
    public DynamicStack3(int size){
        super(size);
    }

    //in dynamicStack everything will remain the same from the parent class , except for push

    //so if you want to use push of the DynamicStack and not of the parent class Customstack then we will use @Override
    @Override
    public boolean push(int item) {
        //this takes care of the array "data" that i sfull now
        if (this.isFull()) {
            //double the array size
            int[] temp = new int[data.length * 2];

            //copy all prev items in  new data
            for (int i = 0; i < data.length; i++) {
                temp[i] = data[i];
            }
            data = temp;
        }
        //at this point we know that array is not full
        //insert item
        return super.push(item);
    }
}
