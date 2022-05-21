package com.company;

import java.util.ArrayList;

public class Kvadrats {
    public ArrayList<Kvadrat> list;
    private double sredSquar;

    public Kvadrats()
    {
        list = new ArrayList<>();
    }

    public void add(int x1, int y1, int x2, int y2, int x3, int y3, int x4, int y4)
    {
        this.list.add(new Kvadrat(x1, y1, x2, y2, x3, y3, x4, y4));
    }


    public ArrayList getKvadrats()
    {
        return this.list;
    }

    public double CalculatingSredSquar()
    {
        double sum = 0;
        for (int i = 0; i < list.size(); i++) {
            sum += this.list.get(i).getSquar();
        }
        return sredSquar = sum / list.size();
    }

    public int CountOfKvadrats()
    {
        int count = 0;
        for (int i = 0; i < list.size(); i++) {

            if (sredSquar > this.list.get(i).getSquar()) {
                count++;
            }
        }
        return count;
    }

    public String toString() {
        String result = "Kvadrats: " + this.list + System.lineSeparator();
        result += "Средная площадь четыреугольников: " + CalculatingSredSquar() + System.lineSeparator();
        result += "Количество четыреугольников, у которых площадь меньше средней площади четыреугольников: " + CountOfKvadrats()+ System.lineSeparator();
        return result;
    }
}
