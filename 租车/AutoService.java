package com.atguigu.rentcar;

import java.lang.ref.PhantomReference;

/**
 *  汽车服务类(业务逻辑类)
 *      1.初始化车辆信息 (把汽车停进车库里)
 *      2.根据用户的选择返回给用户对应的汽车(把车提给用户)
 */
public class AutoService {
    /**
     * 删除某一元素
     * @param auto 传入需要删除的数组
     * @param index 需要删除的元素的位置
     * @return 返回删除后的数组
     */
    public Auto[] delete(Auto[] auto,int index) {
        for (int i = index; i < auto.length-1; i++) {
            auto[i] = auto[i+1];
        }
        Auto[] temp = new Auto[autos.length-1];
        System.arraycopy(autos,0,temp,0,autos.length-1);
        return temp;
    }


    //初始化汽车数据
    public static Auto[] autos = new Auto[9];
    static {
        //初始化汽车
        autos[0] = new Car("京NY28588","宝马",800,"X6");
        autos[8] = new Car("京CNY3284","宝马",600,"550i");
        autos[2] = new Car("京NT37465","别克",300,"林荫大道");
        autos[3] = new Car("京NT96968","别克",600,"GL8");
        autos[1] = new Car("京NT96908","宝马",800,"X6");


        //初始化客车
        autos[4] = new Bus("京6566754", "金杯", 800, 16);
        autos[5] = new Bus("京8696997", "金龙", 800, 16);
        autos[6] = new Bus("京9696996", "金杯", 1500, 34);
        autos[7] = new Bus("京8696998", "金龙", 1500, 34);
        //autos[8] = new Bus("京8696923", "金龙", 1500, 34);
    }

    /**
     * 功能有两个：
     *      1. 找出客户输入信息对应车辆
     *      2. 区分同种车中的不同辆车
     * @param auto 客户已经选择的汽车
     * @param brand 客户输入的车的品牌
     * @param model 汽车的
     * @param seatNum 客车的座位数
     * @return 返回的是不同的车
     */
    public Auto getAuto(Auto[] auto,String brand, String model, int seatNum) {
        Auto autoReturn = null;
        abc:for (int i = 0; i < auto.length; i++) {
            //比较是否为同一辆
            for (int j = 0; j < autos.length; j++) {

                //判断不是同一辆，发给客户
                    if(autos[j] instanceof Car car){
                        if(car.getBrand().equals(brand) && car.getModel().equals(model)){
                            autoReturn = autos[j];
                            autos = delete(autos,j);
                            break abc;
                        }
                    }else if(autos[j] instanceof Bus bus){
                        if(bus.getBrand().equals(brand) && bus.getSeatNum() == seatNum){
                            autoReturn = autos[j];
                            autos = delete(autos,j);;
                            break abc;
                        }
                    }

            }
        }

        return autoReturn;

    }
}
