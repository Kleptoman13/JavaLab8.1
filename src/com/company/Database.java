package com.company;

import java.io.*;
import java.util.ArrayList;

public class Database {
    public ArrayList<Kvadrat> kvadrats;

    public Database(ArrayList list)
    {
        this.kvadrats = list;
    }

    public void serialize(String filename) throws IOException {
        try
        {
            FileOutputStream fileOut = new FileOutputStream("employeeData");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(this.kvadrats);
            out.close();
            fileOut.close();
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
        }
    }

    public void deserialize(String filename)
    {
        try
        {
            FileInputStream fileIn = new FileInputStream("listData");
            ObjectInputStream in = new ObjectInputStream(fileIn);

            this.kvadrats = (ArrayList) in.readObject();

            in.close();
            in.close();
            System.out.println(this.kvadrats);
        }
        catch (IOException ioe)
        {
            ioe.printStackTrace();
            return;
        }
        catch (ClassNotFoundException c)
        {
            System.out.println("Class not found");
            c.printStackTrace();
            return;
        }
    }

    public String toString() {
        String result = "Database: " + this.kvadrats;
        return result;
    }
}
