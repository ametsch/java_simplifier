/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

import java.time.Instant;

/**
 * a class to store an date and time in the United States date and time format
 */
public class DateTime {
    private byte month, day, hour, minute, second;
    private short year;

    /**
     * constructor
     * @param day {@code byte}
     * @param month {@code byte}
     * @param year {@code short}
     * @param hour {@code byte}
     * @param minute {@code byte}
     * @param second {@code byte}
     */
    public DateTime(byte day, byte month, short year, byte hour, byte minute, byte second) {
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.year = year;
    }

    /**
     * basic constructor
     */
    public DateTime(){
        this.month = 0;
        this.day = 0;
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
        this.year = 0;
    }

    /**
     * toString method
     * @return {@code java.lang.String}
     */
    @Override
    public String toString(){
        return String.format("%d/%d/%d  %d:%d:%d", this.month, this.day, this.year, this.hour, this.minute, this.second);
    }

    /**
     * returns the month
     * @return {@code byte}
     */
    public byte getMonth() {
        return month;
    }

    /**
     * a method to set the month
     * @param month {@code byte}
     */
    public void setMonth(byte month) {
        this.month = month;
    }

    /**
     * returns the day
     * @return {@code byte}
     */
    public byte getDay() {
        return day;
    }

    /**
     * a method to set the day
     * @param day {@code byte}
     */
    public void setDay(byte day) {
        this.day = day;
    }

    /**
     * returns the hour
     * @return {@code byte}
     */
    public byte getHour() {
        return hour;
    }

    /**
     * a method to set the hour
     * @param hour {@code byte}
     */
    public void setHour(byte hour) {
        this.hour = hour;
    }

    /**
     * returns the minute
     * @return {@code byte}
     */
    public byte getMinute() {
        return minute;
    }

    /**
     * a method to set the minute
     * @param minute {@code byte}
     */
    public void setMinute(byte minute) {
        this.minute = minute;
    }

    /**
     * returns the second
     * @return {@code byte}
     */
    public byte getSecond() {
        return second;
    }

    /**
     * a method to set the second
     * @param second {@code byte}
     */
    public void setSecond(byte second) {
        this.second = second;
    }

    /**
     * returns the year
     * @return {@code short}
     */
    public short getYear() {
        return year;
    }

    /**
     * a method to set the year
     * @param year {@code short}
     */
    public void setYear(short year) {
        this.year = year;
    }

    /**
     * a method to return the UNIX Timestamp of this object
     * @return {@code long} the UNIX timestamp
     */
    public long toUnixTimestamp(){
        Instant time = Instant.parse(toString());
        return time.getEpochSecond();
    }
}
