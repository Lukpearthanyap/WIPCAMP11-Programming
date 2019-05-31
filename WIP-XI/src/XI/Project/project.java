/*
 * Copyright (C) 2019 wipcamp11.
 *
 * This library is free software; you can redistribute it and/or
 * modify it under the terms of the GNU Lesser General Public
 * License as published by the Free Software Foundation; either
 * version 2.1 of the License, or (at your option) any later version.
 *
 * This library is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this library; if not, write to the Free Software
 * Foundation, Inc., 51 Franklin Street, Fifth Floor, Boston,
 * MA 02110-1301  USA
 */
package XI.Project;

import java.util.Scanner;

/**
 *
 * @author wipcamp11
 */
public class project {

    public static void main(String[] args) {
        int item = 0;
        int limit = 10;
        System.out.println("โกดังสินค้าของคุณ");
        System.out.println("เลือกเมนู 1,2,3");
        System.out.println("เมนูที่หนึ่งคือ Add item");
        System.out.println("เมนูที่สองคือ Remove item");
        System.out.println("เมนูที่สามคือ Check item");
        Scanner sc = new Scanner(System.in);
        int menu = sc.nextInt();
        if (menu == 1) {

            if (item > limit) {
                System.out.println("ไม่สามารถเพิ่มไอเท็มได้");
            } else {
                int amount = sc.nextInt();
                item = item + amount;
                System.out.println("โกดัง" + item);
                System.out.println("limit" + limit);
            }

        } else if (menu == 2) {
            int amount = sc.nextInt();
            if (item - amount >= 0) {
                item = item - amount;
                System.out.println("โกดัง" + item);
                System.out.println("limit" + limit);
            } else {
                System.out.println("ไม่สามารถลบไอเท็มได้");
            }

        } else if (menu == 3) {
            System.out.println("โกดัง" + item);
            System.out.println("limit" + limit);

        } else {
            System.out.println("เมนูไม่ถูกต้อง");

        }
    }
}

