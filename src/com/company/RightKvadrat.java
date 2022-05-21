package com.company;

public class RightKvadrat {
    private int AB;
    private int BC;
    private int CD;
    private int DA;
    private double diag1;
    private double diag2;
    private int perimetr;
    private double squar;
    private int x1;
    private int y1;
    private int x2;
    private int y2;

    public RightKvadrat(int x1, int y1, int x2, int y2) {
        this.setX1(x1);
        this.setY1(y1);
        this.setX2(x2);
        this.setY2(y2);
        this.setAB();
        this.setBC();
        this.setCD();
        this.setDA();
        this.setDiag1();
        this.setDiag2();
        this.setSquar();
        this.setPerimetr();
    }

    public void setAB() {
        AB = (int) Math.sqrt(Math.pow((getX1() - getX1()), 2) + Math.pow((getY2() - getY1()), 2));
        AB = AB > 0 ? AB : 1;
    }

    public int getAB() {
        return AB;
    }

    public void setBC() {
        BC = (int) Math.sqrt(Math.pow((getX2() - getX1()), 2) + Math.pow((getY2() - getY2()), 2));
        BC = BC > 0 ? BC : 1;
    }

    public int getBC() {
        return BC;
    }

    public void setCD() {
        CD = (int) Math.sqrt(Math.pow((getX2() - getX2()), 2) + Math.pow((getY2() - getY1()), 2));
        CD = CD > 0 ? CD : 1;
    }

    public int getCD() {
        return CD;
    }

    public void setDA() {
        DA = (int) Math.sqrt(Math.pow((getX2() - getX1()), 2) + Math.pow((getY1() - getY1()), 2));
        DA = DA > 0 ? DA : 1;
    }

    public int getDA() {
        return DA;
    }

    public void setDiag1() {
        diag1 = Math.sqrt(Math.pow((getX2() - getX1()), 2) + Math.pow((getY2() - getY1()), 2));
    }

    public double getRightDiag1() {
        return diag1;
    }

    public void setDiag2() {
        diag2 = Math.sqrt(Math.pow((getX1() - getX2()), 2) + Math.pow((getY1() - getY2()), 2));
    }

    public double getRightDiag2() {
        return diag2;
    }

    public void setSquar() {
        squar = getAB() * getBC();
    }

    public void setPerimetr() {
        perimetr = getAB() + getBC() + getCD() + getDA();
    }

    public int getRightPerimetr() {
        return perimetr;
    }

    public double getRightSquar() {
        return squar;
    }

    public int getX1() {
        return x1;
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getY1() {
        return y1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getX2() {
        return x2;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getY2() {
        return y2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }


    @Override
    public String toString() {
        return "Right Kvadrat{" +
                "x1=" + getX1() +
                ", y1=" + getY1() +
                ", x2=" + getX1() +
                ", y2=" + getY2() +
                ", x3=" + getX2() +
                ", y3=" + getY2() +
                ", x4=" + getX2() +
                ", y4=" + getY1() +
                ", AB=" + getAB() +
                ", BC=" + getBC() +
                ", CD=" + getCD() +
                ", CD=" + getDA() +
                ", Diagonal1=" + getRightDiag1() +
                ", Diagonal2=" + getRightDiag2() +
                ", Perimetr=" + getRightPerimetr() +
                ", Squar=" + getRightSquar() +
                '}' + System.lineSeparator();
    }
}
