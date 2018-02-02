package com.arnab.myinterfaces;

import java.util.LinkedList;
import java.util.*;

public class WindowsDriver implements MyDrivers{

    private String myDriverName;
    private List<String> windowsDrivers = new LinkedList<String>();

    @Override
    public void driverType() {
        System.out.println(" the driver type is windows");
    }

    @Override
    public void driverID() {
        System.out.println("The Id is WIN55_DRIVER");
    }

    @Override
    public List<String> listOfDriverVersions() {

        List<String> values = new LinkedList<String>();
        Iterator myiterator = windowsDrivers.iterator();

        while(myiterator.hasNext()) {
            values.add((String) myiterator.next());
        }

        return values;

    }

    @Override
    public void updateDriverVersion(String str,int index) {

        /* implementing a linked list for the drivers */

        /* adding a new driver version for windows */
        windowsDrivers.add(str);
    }

    @Override
    public void displayDriverWithVersion() {

        try {
            myDriverName = this.windowsDrivers.get(this.windowsDrivers.size()-1);
            System.out.println("The current version"   + "is " + myDriverName); /*this.getClass().getName()*/
        } catch(IndexOutOfBoundsException e) {
            System.out.println("No version has been specified");
        }
    }


}
