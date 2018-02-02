package com.arnab.myinterfaces;

import java.util.ArrayList;
import java.util.List;

public class LinuxDriver implements MyDrivers{

    private String myDriverName;
    private List<String> linuxDrivers = new ArrayList<>();

    @Override
    public void driverType() {
        System.out.println("The driver type is linux");
    }

    @Override
    public void driverID() {
        System.out.println("The Id is LIN55_DRIVER");
    }

    @Override
    public List<String> listOfDriverVersions() {

        List<String> values = new ArrayList<>();

        for(int i =0; i<linuxDrivers.size(); i++)
             values.add(linuxDrivers.get(i));

        return values;
    }

    @Override
    public void updateDriverVersion(String str,int index) {

        /* implementing ArryList for linux */

        if(linuxDrivers == null) index = 0;
        /* adding a new driver version for linux */
        linuxDrivers.add(index,str);

    }

    @Override
    public void displayDriverWithVersion() {
        try {
            System.out.println("The current bersion for" + this.getClass().getName() + "is " + this.linuxDrivers.get(linuxDrivers.size() - 1));
        } catch (ArrayIndexOutOfBoundsException w)
        {
           System.out.println("No version specified");
        }
    }
}
