package com.company;

public class Main {

    public static void main(String[] args) {
        User u = new User ();
        u.name = "uppp";
        System.out.println(u);

        User u2 = new User();
        u2.name = "uppp";
        System.out.println(u == u2); // false всегда
        //Если
        User u3 = u;
        System.out.println(u == u3); // True, потому что сравнивет ссылку (объекты)

        System.out.println(u.equals(u2));// true

        Demonable d = u;
        Hummanable h = u;
        d.kill(u2);

    }
}
