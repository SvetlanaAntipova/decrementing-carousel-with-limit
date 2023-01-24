package com.epam.rd.autotasks;

public class CarouselRun {
    
    int limit=-1;
    int position = 0;

    public CarouselRun() {}

    public CarouselRun(int limit) {
        this.limit=limit;
    }


    public int next () {
        while (DecrementingCarousel.arr[position] == 0 && !isFinished()) {
            position = carouselReposit(position);
        }
        int element = DecrementingCarousel.arr[position];

        if (!isFinished()) {
            int nextElement = element;
            if(limit!= -1) {
                nextElement--;
                limit--;
            } else
                nextElement --;

            DecrementingCarousel.arr[position] = nextElement;
            position = carouselReposit(position);
        } else element = -1;
        return element;
    }

    public int carouselReposit ( int position){
        if (position + 1 == DecrementingCarousel.arr.length) {
            position = 0;
          
        } else position++;
        return position;
    }
    public boolean isFinished () {
        boolean result;
        if(limit==0){return true;}
        int j = 0;
        for (int i = 0; i <= DecrementingCarousel.arr.length - 1; i++) {
            if (DecrementingCarousel.arr[i] <= 0) {
                j++;
            }
        }
        if (j == DecrementingCarousel.arr.length) {
            result = true;
        } else result = false;
        return result;
    }
}