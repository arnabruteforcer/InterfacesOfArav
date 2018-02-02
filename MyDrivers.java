package com.arnab.myinterfaces;

import java.util.List;

public interface MyDrivers {

     void driverType();

     void driverID();

     List<String> listOfDriverVersions();

     void updateDriverVersion(String str,int index);

     void displayDriverWithVersion();


}
