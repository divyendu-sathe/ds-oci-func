package com.demo.fn;

public class ConcatNames {

    public String concatTwoNames(String input1) {
        String lname = input1 + "You are in OCI Function";

        System.out.println("Inside Java ConcatNames function Edited now by DS"); 
        return lname;
    }

}