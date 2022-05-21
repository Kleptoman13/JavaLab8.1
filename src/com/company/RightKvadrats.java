package com.company;

import java.util.ArrayList;

public class RightKvadrats {
    public ArrayList<RightKvadrat> list;
    private double sredSquar;

    public RightKvadrats()
    {
        list = new ArrayList<>();
    }

    public void add(int x1, int y1, int x2, int y2)
    {
        this.list.add(new RightKvadrat(x1, y1, x2, y2));
    }

    public ArrayList getKvadrats()
    {
        return this.list;
    }

    public double CalculatingSredSquar()
    {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += this.list.get(i).getRightSquar();
        }
        return sredSquar = sum / list.size();
    }

    public String toString() {
        String result = "Right Kvadrats: " + this.list + System.lineSeparator();
        result += "Средная площадь Прямоугольников: " + CalculatingSredSquar() + System.lineSeparator();
        return result;
    }
}
