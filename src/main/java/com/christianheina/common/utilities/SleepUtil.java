package com.christianheina.common.utilities;

import java.util.concurrent.TimeUnit;

/**
 * Utility class providing sleep functionality.
 * 
 * @author Christian Heina (developer@christianheina.com)
 */
public final class SleepUtil {

    private SleepUtil() {
        /* Hidden Constructor */
    }

    /**
     * Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of
     * seconds.<br>
     * Performs a Thread.sleep ignoring any {@code InterruptedException} instead returning false in the event that this
     * exception is found.
     * 
     * @param duration
     *            time to sleep in seconds
     * 
     * @return true if sleep was successful, false if sleep was unsuccessful.
     */
    public static boolean sleep(long duration) {
        return sleep(duration, TimeUnit.SECONDS);
    }

    /**
     * Causes the currently executing thread to sleep (temporarily cease execution) for the specified number of
     * time.<br>
     * Performs a Thread.sleep ignoring any {@code InterruptedException} instead returning false in the event that this
     * exception is found.
     * 
     * @param duration
     *            time to sleep
     * @param unit
     *            the unit of time to sleep
     * 
     * @return true if sleep was successful, false if sleep was unsuccessful.
     */
    public static boolean sleep(long duration, TimeUnit unit) {
        try {
            Thread.sleep(unit.toMillis(duration));
        } catch (InterruptedException e) { // NOSONAR
            // Ignore error
            return false;
        }
        return true;
    }

}
