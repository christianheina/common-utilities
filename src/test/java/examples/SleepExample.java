/*
 * Copyright 2024 Christian Heina
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

package examples;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import com.christianheina.common.utilities.SleepUtil;

/**
 * Example class using interpft interpolation
 * 
 * @author Christian Heina (developer@christianheina.com)
 */
public class SleepExample {

    private static final int SLEEP_DURATION = 10;

    public static void main(String[] args) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        System.out.println(dateFormat.format(new Date()) + " Example of sleep");
        System.out.println(dateFormat.format(new Date()) + " Sleeping for " + SLEEP_DURATION + " seconds");
        SleepUtil.sleep(SLEEP_DURATION, TimeUnit.SECONDS);
        System.out.println(dateFormat.format(new Date()) + " Finished Sleeping");
    }

}
