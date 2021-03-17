/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

public class DateTime {
    private byte month, day, hour, minute, second;
    private short year;

    public DateTime(byte day, byte month, short year, byte hour, byte minute, byte second) {
        this.month = month;
        this.day = day;
        this.hour = hour;
        this.minute = minute;
        this.second = second;
        this.year = year;
    }
    public DateTime(){
        this.month = 0;
        this.day = 0;
        this.hour = 0;
        this.minute = 0;
        this.second = 0;
        this.year = 0;
    }

    @Override
    public String toString(){
        return String.format("%d/%d/%d  %d:%d:%d", this.month, this.day, this.year, this.hour, this.minute, this.second);
    }

    public byte getMonth() {
        return month;
    }

    public void setMonth(byte month) {
        this.month = month;
    }

    public byte getDay() {
        return day;
    }

    public void setDay(byte day) {
        this.day = day;
    }

    public byte getHour() {
        return hour;
    }

    public void setHour(byte hour) {
        this.hour = hour;
    }

    public byte getMinute() {
        return minute;
    }

    public void setMinute(byte minute) {
        this.minute = minute;
    }

    public byte getSecond() {
        return second;
    }

    public void setSecond(byte second) {
        this.second = second;
    }

    public short getYear() {
        return year;
    }

    public void setYear(short year) {
        this.year = year;
    }
}
