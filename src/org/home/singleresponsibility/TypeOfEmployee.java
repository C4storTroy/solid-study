package org.home.singleresponsibility;

public enum TypeOfEmployee {
    DEVELOPER(new TenOrTwentyPercent()),
    DBA(new FifteenOrTwentFiverPercent()),
    TESTER(new FifteenOrTwentFiverPercent());

    private CalcRules rule;

    TypeOfEmployee(CalcRules rule) {
        this.rule = rule;
    }

    public CalcRules getRule(){
        return rule;
    }
}
