package com.arnab.myinterfaces;

import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class DriverTest {


    public static void main(String[] args) {


      WindowsDriver windriver = new WindowsDriver();
      LinuxDriver lindriver = new LinuxDriver();
      MyDrivers mydriver = lindriver;

      int myChoice = 0;
      boolean isLinux = true;
      boolean choice = true;
      int lindex=0,windex=0;

        Scanner scan = new Scanner(System.in);

        do {

            System.out.println("enter your choice");
            myChoice = scan.nextInt();

            switch(myChoice){

                case 1:
                        if(isLinux) {
                            System.out.println("Switching to windows");
                            mydriver = windriver;
                            isLinux = !isLinux;
                        }
                        else {
                            System.out.println("Switching to Linux");
                            mydriver = lindriver;
                            isLinux = !isLinux;
                        }
                        break;
                case 2:
                    System.out.println("enter the version");
                    String version = scan.next();

                    if (isLinux)
                        mydriver.updateDriverVersion(version, lindex++);
                    else
                        mydriver.updateDriverVersion(version, windex++);
                    break;

                case 3:
                    mydriver.driverType();
                    break;

                case 4:
                    mydriver.driverID();
                    break;

                case 5:
                    mydriver.displayDriverWithVersion();
                    break;
                case 6:
                    System.out.println("1. Switch Driver");
                    System.out.println("2. update version");
                    System.out.println("3. Display Driver Type");
                    System.out.println("4. Display Driver ID");
                    System.out.println("5. Display Driver Version");
                    System.out.println("6. Display Menu");
                    System.out.println("7. Display Versions");
                    System.out.println("8. Quit");
                    break;

                case 7:
                    List<String> ver = mydriver.listOfDriverVersions();
                    Iterator ite = ver.iterator();
                    while(ite.hasNext()) {
                        System.out.print(ite.next()+"  ");

                    } System.out.println();
                    break;

                case 8:
                    System.out.println("Quitting menu");
                    choice = false;
            }  /* end of switch statement */

        } while (choice);


    }
}
