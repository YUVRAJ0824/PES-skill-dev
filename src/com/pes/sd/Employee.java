package com.pes.sd;

public class Employee {
//excute file is the main class file

    //private int id=1;= for imp for data here so
     private int id=1;
    private String name="xyz";
    private float salary=400f;
// hard var values in irl
    void display()
    {
       System.out.println("Emp info: "+id+" "+name+" "+salary);
    }
    public Employee()
    { //this. = keyword which is used to refer of current class
       this.id=1;
        this.name="mno";
        this.salary=700;

    }

}
