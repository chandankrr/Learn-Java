package com.ChandanKrr;

class Abilities {
    boolean cook, sing, dance;

    class Player_Abilities {
        static boolean playFootball = true;
    }

    class Coder_Abilities {
        static boolean coding = false;
    }

    class Teacher_Abilities {
        static boolean tech = true;
    }

    void print() {
        System.out.println(Coder_Abilities.coding);
        System.out.println(Player_Abilities.playFootball);
        System.out.println(Teacher_Abilities.tech);
    }
}


public class Question1 {
    public static void main(String[] args) {
        Abilities a1 = new Abilities();
        a1.print();
    }
}
