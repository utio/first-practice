package com.atguigu.rentcar;

import java.nio.file.attribute.AclEntryFlag;
import java.util.Objects;
import java.util.Scanner;

/**
 *  已经继承的属性：车牌号，品牌、日租金
 */

public class Bus extends Auto{
    private int seatNum;

    @Override
    public String toString() {
        return "Bus{" +
                "seatNum=" + seatNum +
                "} " + super.toString();
    }

    @Override
    public double getPrice(int days) {
            //根据租车时间计算折扣
            if(days >= 150){
                return (this.getRentPrice()*days)*0.6;
            }else if(days >= 30){
                return (this.getRentPrice()*days)*0.7;
            }else if(days >= 7){
                return (this.getRentPrice()*days)*0.8;
            }else if(days >= 3){
                return (this.getRentPrice()*days)*0.9;
            }else{
                return (this.getRentPrice()*days);
            }
    }


    public int getSeatNum() {
        return seatNum;
    }

    public void seatSetNum(int setNum) {
        this.seatNum = setNum;
    }

    public Bus(String plateNum, String brand, double rentPrice, int setNum) {
        super(plateNum, brand, rentPrice);
        this.seatNum = setNum;
    }

    public Bus() {
    }
}
