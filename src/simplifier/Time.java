/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier;

public class Time {
    private Time(){}

    public static void sleepMillis(long i) throws InterruptedException {
        Thread.sleep(i);
    }
    public static void sleep(long i) throws InterruptedException {
        sleepMillis(i*1000l);
    }
    public static void sleepMin(int i) throws InterruptedException {
        sleep(i*60l);
    }
    public static void sleepHour(int i) throws InterruptedException {
        sleepMin(i*60);
    }
    public static void sleepDay(int i) throws InterruptedException {
        sleepHour(i*24);
    }


}
