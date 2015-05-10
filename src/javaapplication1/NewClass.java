/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Baldrick
 */
public class NewClass {
    public static void main(String[] args){
        System.out.println("This is a test about class, interface, etc.");
        System.out.println("Test the fist class: Bat");
        Bat bat1 = new Bat();
        System.out.println(bat1.name);
        System.out.printf("The %s has %d wings.\n",bat1.name,bat1.getwingnum());
        bat1.setwingnum(2);
        bat1.setwingnum(4);
        System.out.println("Test the second class: Jet");
        Jet jet1 = new Jet();
        System.out.println(jet1.name);
        System.out.printf("The %s has %d wings.\n",jet1.name,jet1.getwingnum());
        jet1.setwingnum(4);
        System.out.println(jet1.getwingnum());
        System.out.println("Test the third class: Bird");
        Bird bird1 = new Bird();
        System.out.println(bird1.name);
        System.out.println(bird1.getwingnum());
        bird1.setwingnum(2);
        System.out.println(bird1.getwingnum());
}   
}

abstract class Flythings implements Flyable{
    String name;
    static Boolean flyability = true;
}

interface Flyable{
    abstract void fly();
    abstract int getwingnum();
}

class Bat extends Flythings{
    final String name = "bat";
    private int wingnum = 2;
    
    

    public void fly(){
        System.out.println("The Bat is flying.");
    }

    public int getwingnum(){
        return wingnum;
    }
    
    public void setwingnum(int n){
        if (n == 2){
            wingnum = 2;
            System.out.println("The bat has 2 wings.");
        }else{
            System.out.println("The bat always has 2 wings.");
        }
    }
}

class Jet extends Flythings {
    final String name = "Jet";
    private int wingnum = 2;
    
    public void fly(){
        System.out.println("The Jet is flying.");
    }
    
    public int getwingnum(){
        return wingnum;
    }
    
    public void setwingnum(int n){
        if (n == 2){
            wingnum = 2;
            System.out.println("The Jet has 2 wings now.");
        }else{
            if (n ==4){
                wingnum = 4;
                System.out.println("The Jet has 4 wings now.");
            }else{
                System.out.printf("The Jet cannot has %d wings.\n", n);
            }
        }
    }
}

class Bird extends Flythings{
    final String name = "Bird";
    private int wingnum = 2;
    
    public void fly(){
            System.out.println("The Bird is flying.");
    }
    
    public int getwingnum(){
            return wingnum;
    }
    
    public void setwingnum(int n){
        if(n == 2){
            wingnum = 2;
            System.out.println("The Bird has 2 wings.");
        }else{
            System.out.println("The Bird always has 2 wings.");
        }
    }
}