package com.company;

import java.io.IOException;
import java.util.Random;

public class Main {

    public static void main(String[] args) throws IOException {
        Random random = new Random();
        final int numbersKvadrats = 5;
        final int numbersRightKvadrats = 5;
        Kvadrats kvadrats = new Kvadrats();
        RightKvadrats rightkvadrats = new RightKvadrats();

        for (int i = 0; i < numbersKvadrats; i++) {
            kvadrats.add(random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1);
        }

        for (int i = 0; i < numbersRightKvadrats; i++) {
            rightkvadrats.add(random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1, random.nextInt(10)+1);
        }

//        Database db = new Database(kvadrats.getKvadrats());

//        db.serialize("db_s.txt");
//
//        db.deserialize("db_s.txt");

        System.out.println(kvadrats);
        System.out.println(rightkvadrats);
//
        //kvadrats.CalculatingSredSquar();

//        System.out.println(db);
    }
}
