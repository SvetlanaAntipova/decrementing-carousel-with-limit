package com.epam.rd.autotasks;

public class DecrementingCarousel {
    static int[] arr;
    int i=0;
    boolean circle = false;

    public DecrementingCarousel(int capacity) {
        arr = new int[capacity];
    }

    public boolean addElement(int element){
        boolean runC;
        if(element > 0 && i < arr.length && !circle){
            arr[i] = element;
            i++;
            runC = true;
        } else runC=false;
        return runC;
    }

    public CarouselRun run(){
        if (!circle ){
            circle = true;
            return new CarouselRun();
        }
        return null;
    }

}