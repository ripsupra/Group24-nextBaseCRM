package com.nextBaseCRM.test.Ramiz;


import java.util.ArrayList;
import java.util.Arrays;

public class AC_G24_118 extends Utility {

    public static void main(String[] args){

        AC_G24_118 driver = new AC_G24_118();

        ArrayList<String> userName = new ArrayList<String>();
        userName.addAll(Arrays.asList(
                "helpdesk47@cybertekschool.com",
                "helpdesk48@cybertekschool.com",
                "marketing47@cybertekschool.com",
                "marketing48@cybertekschool.com",
                "hr47@cybertekschool.com",
                "hr48@cybertekschool.com"
        ));

for( String each: userName){
    driver.highPriority(each);


}



    }


}


