/* This Source Code Form is subject to the terms of the Mozilla Public
 * License, v. 2.0. If a copy of the MPL was not distributed with this
 * file, You can obtain one at https://mozilla.org/MPL/2.0/. */


/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

/**
 * a class to store an date and time in the United States date and time format
 */
public class DateTime {
    private byte month, day, hour, minute, second;
    private short year;

    /**
     * constructor
     * @param day byte
     * @param month byte
     * @param year short
     * @param hour byte
     * @param minute byte
     * @param second byte
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
     * @return java.lang.String
     */
    @Override
    public String toString(){
        return String.format("%d/%d/%d  %d:%d:%d", this.month, this.day, this.year, this.hour, this.minute, this.second);
    }

    /**
     * returns the month
     * @return byte
     */
    public byte getMonth() {
        return month;
    }

    /**
     * a method to set the month
     * @param month byte
     */
    public void setMonth(byte month) {
        this.month = month;
    }

    /**
     * returns the day
     * @return byte
     */
    public byte getDay() {
        return day;
    }

    /**
     * a method to set the day
     * @param day byte
     */
    public void setDay(byte day) {
        this.day = day;
    }

    /**
     * returns the hour
     * @return byte
     */
    public byte getHour() {
        return hour;
    }

    /**
     * a method to set the hour
     * @param hour byte
     */
    public void setHour(byte hour) {
        this.hour = hour;
    }

    /**
     * returns the minute
     * @return byte
     */
    public byte getMinute() {
        return minute;
    }

    /**
     * a method to set the minute
     * @param minute byte
     */
    public void setMinute(byte minute) {
        this.minute = minute;
    }

    /**
     * returns the second
     * @return byte
     */
    public byte getSecond() {
        return second;
    }

    /**
     * a method to set the second
     * @param second byte
     */
    public void setSecond(byte second) {
        this.second = second;
    }

    /**
     * returns the year
     * @return short
     */
    public short getYear() {
        return year;
    }

    /**
     * a method to set the year
     * @param year short
     */
    public void setYear(short year) {
        this.year = year;
    }
}
