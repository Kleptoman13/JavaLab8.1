package com.company;

public class Kvadrat extends RightKvadrat{
    private int AB;
    private int BC;
    private int CD;
    private int DA;
    private double diag1;
    private double diag2;
    private double perimetr;
    private double polperimetr;
    private double squar;
    private int x1;
    private int y1;
    private int x2;
    private int y2;
    private int x3;
    private int y3;
    private int x4;
    private int y4;

    public Kvadrat(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        super(x1, y1, x2, y2);
        this.setX3(x3);
        this.setY3(y3);
        this.setX4(x4);
        this.setY4(y4);
        this.setAB();
        this.setBC();
        this.setCD();
        this.setDA();
        this.setDiag1();
        this.setDiag2();
        this.setPerimetr();
        this.setPolperimetr();
        this.setSquar();
    }

    public void setX1(int x1) {
        this.x1 = x1;
    }

    public int getX1() {
        return x1;
    }

    public void setY1(int y1) {
        this.y1 = y1;
    }

    public int getY1() {
        return y1;
    }

    public void setX2(int x2) {
        this.x2 = x2;
    }

    public int getX2() {
        return x2;
    }

    public void setY2(int y2) {
        this.y2 = y2;
    }

    public int getY2() {
        return y2;
    }

    public void setX3(int x3) {
        this.x3 = x3;
    }

    public int getX3() {
        return x3;
    }

    public void setY3(int y3) {
        this.y3 = y3;
    }

    public int getY3() {
        return y3;
    }

    public void setX4(int x4) {
        this.x4 = x4;
    }

    public int getX4() {
        return x4;
    }

    public void setY4(int y4) {
        this.y4 = y4;
    }

    public int getY4() {
        return y4;
    }

    public void setAB()
    {
        AB = (int)Math.sqrt(Math.pow((getX2() - getX1()), 2) + Math.pow((getY2() - getY1()), 2));
        AB = AB > 0 ? AB : 1;
    }

    public int getAB() {
        return AB;
    }

    public void setBC()
    {
        BC = (int)Math.sqrt(Math.pow((getX3() - getX2()), 2) + Math.pow((getY3() - getY2()), 2));
        BC = BC > 0 ? BC : 1;
    }

    public int getBC() {
        return BC;
    }

    public void setCD()
    {
        CD = (int)Math.sqrt(Math.pow((getX4() - getX3()), 2) + Math.pow((getY4() - getY3()), 2));
        CD = CD > 0 ? CD : 1;
    }

    public int getCD() {
        return CD;
    }

    public void setDA()
    {
        DA = (int)Math.sqrt(Math.pow((getX1() - getX4()), 2) + Math.pow((getY1() - getY4()), 2));
        DA = DA > 0 ? DA : 1;
    }

    public int getDA() {
        return DA;
    }

    public void setDiag1()
    {
        diag1 = Math.sqrt(Math.pow((getX3() - getX1()), 2) + Math.pow((getY3() - getY1()), 2));
    }

    public double getDiag1() {
        return diag1;
    }

    public void setDiag2()
    {
        diag2 = Math.sqrt(Math.pow((getX4() - getX2()), 2) + Math.pow((getY4() - getY2()), 2));
    }

    public double getDiag2() {
        return diag2;
    }

    public void setPerimetr()
    {
        perimetr = getAB()+getBC()+getCD()+getDA();
    }

    public double getPerimetr() {
        return perimetr;
    }

    public void setPolperimetr()
    {
        polperimetr = getPerimetr()/2;
    }

    public double getPolperimetr()
    {
        return polperimetr;
    }

    public void setSquar() {
        squar = Math.sqrt((getPolperimetr()-getAB())*(getPolperimetr()-getBC())*(getPolperimetr()-getCD())*(getPolperimetr()-getDA()));
    }

    public double getSquar() {
        return squar;
    }

    @Override
    public String toString() {
        return "Kvadrat{" +
                "x1=" + getX1() +
                ", y1=" + getY1() +
                ", x2=" + getX2() +
                ", y2=" + getY2() +
                ", x3=" + getX3() +
                ", y3=" + getY3() +
                ", x4=" + getX4() +
                ", y4=" + getY4() +
                ", AB=" + getAB() +
                ", BC=" + getBC() +
                ", CD=" + getCD() +
                ", CD=" + getDA() +
                ", Diagonal1=" + getDiag1() +
                ", Diagonal2=" + getDiag2() +
                ", Perimetr=" + getPerimetr() +
                ", Squar=" + getSquar() +
                '}' + System.lineSeparator();
    }
}
