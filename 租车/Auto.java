package com.atguigu.rentcar;

import java.util.Objects;

/**
 *  汽车类属性：
 *      车牌号，品牌、日租金
 *  方法：
 *      计算租金
 */
public class Auto {
    private String plateNum;
    private String brand;
    private double rentPrice;

    @Override
    public boolean equals(Object object) {
        if (this == object) return true;
        if (object == null || getClass() != object.getClass()) return false;
        Auto auto = (Auto) object;
        return Objects.equals(plateNum, auto.plateNum);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(plateNum);
    }

    public double getPrice(int days){
        return 0;
    }


    @Override
    public String toString() {
        return "Car{" +
                "plateNum='" + plateNum + '\'' +
                ", brand='" + brand + '\'' +
                ", rentPrice=" + rentPrice +
                '}';
    }

    public String getPlateNum() {
        return plateNum;
    }

    public void setPlateNum(String plateNum) {
        this.plateNum = plateNum;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getRentPrice() {
        return rentPrice;
    }

    public void setRentPrice(double rentPrice) {
        this.rentPrice = rentPrice;
    }

    public Auto(String plateNum, String brand, double rentPrice) {
        this.plateNum = plateNum;
        this.brand = brand;
        this.rentPrice = rentPrice;
    }

    public Auto() {
    }
}
