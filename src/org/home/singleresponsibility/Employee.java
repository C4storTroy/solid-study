package org.home.singleresponsibility;

import java.util.Calendar;

public class Employee {

    private int id;
    private String name;
    private TypeOfEmployee typeOfEmployee;
    private Calendar startDay;
    private double salaryBase;
    public int getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public TypeOfEmployee getTypeOfEmployee() {
        return typeOfEmployee;
    }
    public Calendar getStartDay() {
        return startDay;
    }
    public double getSalaryBase() {
        return salaryBase;
    }
    public void setId(int id) {
        this.id = id;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setCargo(TypeOfEmployee typeOfEmployee) {
        this.typeOfEmployee = typeOfEmployee;
    }
    public void setDataDeAdmissao(Calendar startDay) {
        this.startDay = startDay;
    }
    public void setSalaryBase(double salaryBase) {
        this.salaryBase = salaryBase;
    }
}
