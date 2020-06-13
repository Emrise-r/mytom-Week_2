package Day_4;

import java.util.Date;

public class StopWatch {
    private long startTime;
    private long endTime;

    public StopWatch() {
    }

    public long start() {
        return this.startTime = (new Date()).getTime();
    }

    public long stop() {
        return this.endTime = (new Date()).getTime();
    }

    public long getElapsedTime() {
        return this.endTime - this.startTime;
    }

    public long getStartTime() {
        return this.startTime;
    }

    public long getEndTime() {
        return this.endTime;
    }
}
