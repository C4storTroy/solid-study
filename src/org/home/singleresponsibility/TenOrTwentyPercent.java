package org.home.singleresponsibility;

public class TenOrTwentyPercent implements CalcRules{

    @Override
    public double calc(Employee employee) {
        if(employee.getSalaryBase() > 3000.0) {
            return employee.getSalaryBase() * 0.8;
        }
        else {
            return employee.getSalaryBase() * 0.9;
        }
    }
}
