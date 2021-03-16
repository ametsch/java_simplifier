/*
 * Copyright (c) 2021. Aaron Metsch
 */

package simplifier.types;

public class Address {
    private String street, city, state_province, unitNum;
    private int zip;
    private long buildingNum;

    //apt constructor:
    public Address(long buildingNum, String street, String city, String state_province, int zip, String unitNum) {
        this.street = street;
        this.city = city;
        this.state_province = state_province;
        this.unitNum = unitNum;
        this.zip = zip;
        this.buildingNum = buildingNum;
    }

    //house constructor:
    public Address(long buildingNum, String street, String city, String state_province, int zip) {
        this.street = street;
        this.city = city;
        this.state_province = state_province;
        this.unitNum = null;
        this.zip = zip;
        this.buildingNum = buildingNum;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getState_province() {
        return state_province;
    }

    public void setState_province(String state_province) {
        this.state_province = state_province;
    }

    public String getUnitNum() {
        return unitNum;
    }

    public void setUnitNum(String unitNum) {
        this.unitNum = unitNum;
    }

    public int getZip() {
        return zip;
    }

    public void setZip(int zip) {
        this.zip = zip;
    }

    public long getBuildingNum() {
        return buildingNum;
    }

    public void setBuildingNum(long buildingNum) {
        this.buildingNum = buildingNum;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.buildingNum);
        sb.append(" ");
        sb.append(this.street);
        sb.append(", ");
        sb.append(this.city);
        sb.append(", ");
        sb.append(this.state_province);
        sb.append(", ");
        sb.append(this.zip);
        if (this.unitNum != null){
            sb.append(", ");
            sb.append(this.unitNum);
        }
        return sb.toString();
    }
}