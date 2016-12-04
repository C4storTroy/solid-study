package org.home.singleresponsibility;

import static org.home.singleresponsibility.TypeOfEmployee.DBA;
import static org.home.singleresponsibility.TypeOfEmployee.DEVELOPER;
import static org.home.singleresponsibility.TypeOfEmployee.TESTER;

public class SalaryCalc {

    public double calc(Employee employee) {
        if(DEVELOPER.equals(employee.getTypeOfEmployee())) {
            return tenOrTwentyPercent(employee);
        }

        if(DBA.equals(employee.getTypeOfEmployee()) || TESTER.equals(employee.getTypeOfEmployee())) {
            return fifteenOrTwentFiverPercent(employee);
        }

        throw new RuntimeException("Invalid employee");
    }

    private double tenOrTwentyPercent(Employee employee) {
        if(employee.getSalaryBase() > 3000.0) {
            return employee.getSalaryBase() * 0.8;
        }
        else {
            return employee.getSalaryBase() * 0.9;
        }
    }

    private double fifteenOrTwentFiverPercent(Employee employee) {
        if(employee.getSalaryBase() > 2000.0) {
            return employee.getSalaryBase() * 0.75;
        }
        else {
            return employee.getSalaryBase() * 0.85;
        }
    }


}
