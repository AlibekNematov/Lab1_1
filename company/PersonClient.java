package com.company;

import java.util.Scanner;

public final class PersonClient extends AbstractPerson{

    Scanner in = new Scanner(System.in);
    String name = in.nextLine();

    public PersonClient(String n)
    {
        name = n;
    }

    @Override
    public String think(){
        th = "Я клиент компании";
        return th;
    }

    @Override
    public String getName(int n)
    { return name;}

    public String service()
    {
        String s1;
        s1 = "1) massage\n 2) fitness room";
        return s1;
    }

    public float price(int a)
    {
        float p1, p2;
        p1 = 10;
        p2 = 1000;
        if(a == 1)
        {

            return p1;
        }
        else
        {
            return p2;
        }
    }
}