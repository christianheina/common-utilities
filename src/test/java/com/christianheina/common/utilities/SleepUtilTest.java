/*
 * Copyright 2025 Christian Heina
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.christianheina.common.utilities;

import java.util.concurrent.TimeUnit;

import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * Unit test for {@link SleepUtil}.
 * 
 * @author Christian Heina (developer@christianheina.com)
 */
public class SleepUtilTest {

    private static final double ALLOWED_SLEEP_LONGER_PERCENTAGE = 1.02;
    private static final int SMALL_NUMBER = 2;
    private static final int LARGE_NUMBER = 1000;
    private static final int SECONDS_TO_MILLIS_MULTIPLIER = 1000;

    @Test
    public void sleepNoTimeUnitTest() {
        long startTime = System.currentTimeMillis();
        boolean isSleepSuccessful = SleepUtil.sleep(SMALL_NUMBER);
        long stopTime = System.currentTimeMillis();
        Assert.assertTrue(isSleepSuccessful);
        Assert.assertTrue(stopTime - startTime >= SMALL_NUMBER * SECONDS_TO_MILLIS_MULTIPLIER);
        Assert.assertTrue(
                stopTime - startTime < SMALL_NUMBER * SECONDS_TO_MILLIS_MULTIPLIER * ALLOWED_SLEEP_LONGER_PERCENTAGE);
    }

    @Test
    public void sleepWithTimeUnitShortTest() {
        long startTime = System.currentTimeMillis();
        boolean isSleepSuccessful = SleepUtil.sleep(SMALL_NUMBER, TimeUnit.SECONDS);
        long stopTime = System.currentTimeMillis();
        Assert.assertTrue(isSleepSuccessful);
        Assert.assertTrue(stopTime - startTime >= SMALL_NUMBER * SECONDS_TO_MILLIS_MULTIPLIER);
        Assert.assertTrue(
                stopTime - startTime < SMALL_NUMBER * SECONDS_TO_MILLIS_MULTIPLIER * ALLOWED_SLEEP_LONGER_PERCENTAGE);
    }

    @Test
    public void sleepWithTimeUnitLongTest() {
        long startTime = System.currentTimeMillis();
        boolean isSleepSuccessful = SleepUtil.sleep(LARGE_NUMBER, TimeUnit.MILLISECONDS);
        long stopTime = System.currentTimeMillis();
        Assert.assertTrue(isSleepSuccessful);
        Assert.assertTrue(stopTime - startTime >= LARGE_NUMBER);
        Assert.assertTrue(stopTime - startTime < LARGE_NUMBER * ALLOWED_SLEEP_LONGER_PERCENTAGE);
    }

}
