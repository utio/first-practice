package com.atguigu.rentcar;

import java.util.Scanner;

public class Rent {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        boolean flag = true;
        Customer customer = new Customer();

        do {
            customer.rent();
            System.out.println("是否继续选车： 0. 结束选车    1. 继续选车");
            int choice = input.nextInt();

            if (choice == 0) {
                flag = false;
            }
        } while (flag);

    }
}
