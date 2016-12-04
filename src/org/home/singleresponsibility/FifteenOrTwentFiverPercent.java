package org.home.singleresponsibility;

public class FifteenOrTwentFiverPercent implements CalcRules {


    @Override
    public double calc(Employee employee) {
        if(employee.getSalaryBase() > 2000.0) {
            return employee.getSalaryBase() * 0.75;
        }
        else {
            return employee.getSalaryBase() * 0.85;
        }
    }
}
