package com.atguigu.rentcar;

import com.sun.source.tree.NewArrayTree;

import java.nio.file.attribute.AclEntryFlag;
import java.util.Objects;
import java.util.Scanner;

/**
 *  已经继承的属性：车牌号，品牌、日租金
 *
 */
public class Car extends Auto{
    private String model;

    //客车和轿车的计算方式不同，分开写
    @Override
    public double getPrice(int days) {
            //计算折扣后的价格
            if(days > 150){
                return (this.getRentPrice()*days)*0.7;
            }else if(days > 30){
                return (this.getRentPrice()*days)*0.8;
            }else if(days > 7){
                return (this.getRentPrice()*days)*0.9;
            }else{
                return (this.getRentPrice()*days);
            }
    }


    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Car() {

    }

    public Car(String plateNum, String brand, double rentPrice, String model) {
        super(plateNum, brand, rentPrice);
        this.model = model;
    }
}
