package com.company;

import javafx.print.PaperSource;

import java.time.Period;

public class Main {

    public static void main(String[] args) {
	    Person p1=new Person("Misha","Sergeevich","Retin");
	    Person p2=new Person("","2","");
	    Person p3=new Person("","3","");
	    Person p4=new Person("Lira","Andreevna","Levina");
	    p1.say();
	    p2.say();
	    p3.say();
	    p4.say();
    }
}
