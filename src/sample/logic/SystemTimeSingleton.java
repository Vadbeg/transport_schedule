package sample.logic;

import java.time.LocalDateTime;


public final class SystemTimeSingleton {

    private static SystemTimeSingleton instance;
    public LocalDateTime localDateTime;

    public static SystemTimeSingleton getInstance(){
        if (instance == null) {
            instance = new SystemTimeSingleton();
        }

        return instance;
    }

    public void changeSystemTime(LocalDateTime newTime) {

    }

    public LocalDateTime getLocalDateTime() {
        return this.localDateTime;
    }

}
