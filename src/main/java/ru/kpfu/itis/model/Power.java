package ru.kpfu.itis.model;

/**
 * Created by Dr.Raim on 31-May-17.
 */
public class Power {
    private double base;
    private double pow;
    private double result;

    public double getResult() {
        result = Math.pow(base,pow);
        return result;
    }

    public void setResult(double result) {
        this.result = result;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getPow() {
        return pow;
    }

    public void setPow(double pow) {
        this.pow = pow;
    }

    public Power() {
    }

    public Power(double base, double pow) {
        this.base = base;
        this.pow = pow;
    }
}
