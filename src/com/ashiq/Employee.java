package com.ashiq;

public class Employee {
    int eid;
    String ename;
    String eaddress;

    //Methods
    public Employee() {
        System.out.println("--Employee constructed--");
    }

    public int getEid() {
        return eid;
    }

    public void setEid(int eid) {
        this.eid = eid;
    }

    public String getEname() {
        return ename;
    }

    public void setEname(String ename) {
        this.ename = ename;
    }

    public String getEaddress() {
        return eaddress;
    }

    public void setEaddress(String eaddress) {
        this.eaddress = eaddress;
    }

    @Override
    public String toString() {
        return "com.ashiq.Employee{" +
                "eid=" + eid +
                ", ename='" + ename + '\'' +
                ", eaddress='" + eaddress + '\'' +
                '}';
    }
}
