package net.minestom.server.instance;

import net.minestom.server.utils.time.TimeUnit;
import org.jetbrains.annotations.NotNull;

public class Weather {

    private final Type type;
    private final int level;
    private final int duration;
    private final TimeUnit timeUnit;

    private final boolean clear;

    private Weather(Type type, int level, int duration, TimeUnit timeUnit, boolean clear) {
        this.type = type;
        this.level = level;
        this.duration = duration;
        this.timeUnit = timeUnit;
        this.clear = clear;
    }

    @NotNull
    public static Weather rain(int level, int duration, @NotNull TimeUnit timeUnit) {
        return new Weather(Type.RAIN, level, duration, timeUnit, false);
    }

    @NotNull
    public static Weather thunder(int level, int duration, @NotNull TimeUnit timeUnit) {
        return new Weather(Type.THUNDER, level, duration, timeUnit, false);
    }

    @NotNull
    public static Weather clear() {
        return new Weather(null, 0, 0, null, true);
    }

    @NotNull
    public static Weather clear(Type type) {
        return new Weather(type, 0, 0, null, true);
    }

    public Type getType() {
        return type;
    }

    public int getLevel() {
        return level;
    }

    public int getDuration() {
        return duration;
    }

    public TimeUnit getTimeUnit() {
        return timeUnit;
    }

    public boolean isClear() {
        return clear;
    }

    public enum Type {
        RAIN, THUNDER
    }

}
