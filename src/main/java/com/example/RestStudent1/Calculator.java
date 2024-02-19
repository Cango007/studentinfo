package com.example.RestStudent1;

public class Calculator {


    public Integer cal(int a,int b,String c)
    {
        int d=0;
        switch (c)
        {
            case "ADD": d= a+b; break;
            case "SUB": d= a-b; break;
            default: throw  new RuntimeException("No Values ")
        }
        return  d;
    }

}
