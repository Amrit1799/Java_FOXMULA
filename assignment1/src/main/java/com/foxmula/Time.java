package com.foxmula;

public class Time {
    private int hour,min,sec;
    Time(int hour,int min,int sec)    //parameterised constructor
    {
        this.hour=hour;
        this.min=min;
        this.sec=sec;
    }
    Time()                  // default constructor
    {
        hour=0;
        min=0;
        sec=0;
    }
    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMin() {
        return min;
    }

    public void setMin(int min) {
        this.min = min;
    }

    public int getSec() {
        return sec;
    }

    public void setSec(int sec) {
        this.sec = sec;
    }
// public add finction
    Time add(Time t1)
    {
        Time t=new Time();
        t.sec = this.sec+t1.sec;
        if(t.sec>=60)
        {
            t.min=t.min+1;
            t.sec=t.sec-60;
        }
        t.min=this.min+t1.min;
        if(t.min>=60)
        {
            t.hour=t.hour+1;
            t.min=t.min-60;
        }
        t.hour=this.hour+t1.hour+1;

        return t;
    }

    // display 

    void display(String str)
    {
        System.out.println(str+"-"+hour+":"+min+":"+sec);
    }

    public static void main(String args[]) {
        Time t1=new Time(10,59,65);
        Time t2=new Time(5,15,6);
        Time t3=t1.add(t2);
        t1.display("Time 1");
        t2.display("Time 2");
        t3.display("Added");
    }
}
