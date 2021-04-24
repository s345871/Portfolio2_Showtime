package com.example.Portfolio2_Showtime.admin;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Arrays;

@Service
public class AdminServer {

    private ArrayList<Admin> savedAdmins = new ArrayList<>(Arrays.asList(
            new Admin("username","12345")
    ));


    public boolean logIn(Admin admin) {
        for(Admin element: savedAdmins){
            if(admin == element){
                return true;
            }
        }
        return false;
    }

}
