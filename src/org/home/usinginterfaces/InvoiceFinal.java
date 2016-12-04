package org.home.usinginterfaces;

public class InvoiceFinal {
    private int id;
    private double valueGross;
    private double taxes;

    public InvoiceFinal(int id, double valueGross, double taxes) {
        this.id = id;
        this.valueGross = valueGross;
        this.taxes = taxes;
    }

    public InvoiceFinal(double valueGross, double taxes) {
        this(0, valueGross, taxes);
    }

    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public double getValueGross() {
        return valueGross;
    }
    public void setValueGross(double valueGross) {
        this.valueGross = valueGross;
    }
    public double getTaxes() {
        return taxes;
    }
    public void setTaxes(double taxes) {
        this.taxes = taxes;
    }

    public double getValorNet() {
        return this.valueGross - this.taxes;
    }
}
