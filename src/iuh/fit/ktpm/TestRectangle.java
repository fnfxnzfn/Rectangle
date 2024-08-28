/*
 *@ (#) TestRectangle.java     1.0    28/08/2024
 *
 *  Copyright (c) 2024 IUH.All rights reserved.All rights reserved.
 */
package iuh.fit.ktpm;

import java.util.Scanner;

/*
 *@description:
 *@author: Tran Duc Nam
 *@date: 28/08/2024
 *@version: 1.0
 */
public class TestRectangle {


        public static void main(String[] args) {


            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter width: ");
            double width = scanner.nextDouble();
            System.out.println("Enter length: ");
            double length = scanner.nextDouble();
            Rectangle rectangle = new Rectangle(length,width);
            System.out.println("Area "+ rectangle.getArea());
            System.out.println("Perimeter "+ rectangle.getPerimeter());
            System.out.println(rectangle.toString());
            scanner.close();
        }
}