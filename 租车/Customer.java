package com.atguigu.rentcar;

import java.awt.dnd.Autoscroll;
import java.nio.file.attribute.AclEntryFlag;
import java.util.Arrays;
import java.util.Scanner;

/**
 * 顾客进行租车操作
 */
public class Customer {
    private static Auto[] auto = new Auto[10];   //存放客户汽车数据
    private static int AutoNumber;

    public void rent() {   //在选择车型后直接把数据传入进去，建立一个对象
        Scanner sc = new Scanner(System.in);

        String brand = "";
        String model = "";
        int seatNum = 0;

        System.out.println("**************欢迎光临秋名山租车行**************");
//        System.out.println("1. 客车 \t 2. 轿车");
//        System.out.print("请输入您要选择的车型：");
//        int autoType = sc.nextInt();

        System.out.println("1. 客车 \t 2. 轿车");
        System.out.print("请输入您要选择的车型：");
        int autoType = sc.nextInt();
        switch (autoType) {
            //将客户输入的信息保存
            case 1: //客车
            {
                System.out.print("请输入您要选择的品牌： 1. 金龙\t2. 金杯\t");
                int busBrand = sc.nextInt();
                switch (busBrand) {
                    case 1 -> brand = "金龙";
                    case 2 -> brand = "金杯";
                    default -> System.out.println("请输入正确品牌号");
                }

                System.out.print("请输入您需要的座位数： 1. 16\t2. 34\t");
                int busSeat = sc.nextInt();
                switch (busSeat) {
                    case 1 -> seatNum = 16;

                    case 2 -> seatNum = 34;

                    default -> System.out.println("请输入正确座位数");
                }
                break;
            }
            case 2: //轿车
            {
                System.out.print("请输入您要选择的品牌： 1. 别克\t2. 宝马\t");
                int carBrand = sc.nextInt();
                switch (carBrand) {
                    case 1: {  //别克
                        brand = "别克";
                        System.out.print("请输入您需要的汽车类型： 1. 林荫大道\t2. GL8\t");
                        int carModel = sc.nextInt();
                        switch (carModel) {
                            case 1 -> model = "林荫大道";
                            case 2 -> model = "GL8";
                            default -> System.out.println("请输入正确的汽车类型");
                        }
                        break;
                    }
                    case 2: {   //宝马
                        brand = "宝马";
                        System.out.print("请输入您需要的汽车类型： 1. X6\t2. 550i\t");
                        int carModel = sc.nextInt();
                        switch (carModel) {
                            case 1 -> model = "X6";

                            case 2 -> model = "550i";
                            default -> System.out.println("请输入正确的汽车类型");
                        }
                        break;
                    }
                }
                break;
            }
            default:
                System.out.println("请输入正确的车型");
                break;
        }

        AutoService service = new AutoService();
        auto[AutoNumber] = service.getAuto(auto, brand, model, seatNum);
        AutoNumber++;


        if (auto[AutoNumber - 1] == null) {
            System.out.println("暂时没有库存了,请选择另一辆");
        } else {
            System.out.print("请输入您需要租车的时间： ");
            int days = sc.nextInt();

            double price = auto[AutoNumber - 1].getPrice(days);
            System.out.println("给您分配的车牌号为：" + auto[AutoNumber - 1].getPlateNum());
            System.out.println("您应该支付的租金为：" + price);
        }

    }

}
