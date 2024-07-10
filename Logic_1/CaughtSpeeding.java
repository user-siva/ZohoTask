package Logic_1;

public class CaughtSpeeding {
    public int caughtSpeeding(int speed, boolean isBirthday) {
        if (isBirthday)
            speed -= 5;
        if (speed <= 60)
            return 0;
        if (speed >= 61 && speed <= 80)
            return 1;
        if (speed > 81)
            return 2;
        return -1;
    }
}
