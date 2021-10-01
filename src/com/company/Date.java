package com.company;

// Exercise 11.3
// Write a class definition for Date,
public class Date {
    // an object type that contains three integers: year, month, and day.
    public int year;
    public int month;
    public int day;

// This class should provide two constructors.
    public Date(){      //constructor initialize a default date
        this.year = 0;
        this.month = 0;
        this.day = 0;
    }

    public Date(int y, int m, int d){   //constructor take parameters
        this.year = y;
        this.month = m;
        this.day = d;
    }
    public String toString(){
        return String.format("%02d-%02d-%02d\n",
                this.year,this.month,this.day);
    }

}
// Exercise 3 END