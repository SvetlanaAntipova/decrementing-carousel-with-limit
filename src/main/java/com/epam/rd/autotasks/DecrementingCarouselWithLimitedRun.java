package com.epam.rd.autotasks;

public class DecrementingCarouselWithLimitedRun extends DecrementingCarousel{
    int limit;
    public DecrementingCarouselWithLimitedRun(final int capacity, final int actionLimit) {
        super(capacity);
        limit=actionLimit;
    }

    @Override
    public CarouselRun run() {
        if (!circle ){
            circle = true;
            return new CarouselRun(limit);
        }
        return super.run();
    }
}
