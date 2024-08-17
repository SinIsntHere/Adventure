import java.util.*;
//Lab4 Question 2
public class Adventure {
    public static void main(String[] args) throws InterruptedException {
        Scanner sc = new Scanner(System.in);
        //Intro

        String[] arr = {"Greeting", "lonely", "soul.", "What", "brings", "you", "here?"};
        slowDia(arr);

        System.out.println("Options: ");
        System.out.println("1.I'm not sure");
        System.out.println("2.I'm in search of an adventure");
        System.out.println("3.Nothing");
        String response = sc.next();

        if(response.equals("I'm not sure")) {
            String[] r1 = {};
            slowDia(r1);
        }else if(response.equals("1")) {
            String[] r1Alt = {};
            slowDia(r1Alt);
        }else if(response.equals("I'm in search of an adventure")) {
            String[] r2 = {};
            slowDia(r2);
        }else if(response.equals("2")) {
            String[] r2Alt = {};
            slowDia(r2Alt);
        }else if(response.equals("Nothing")) {
            String[] r3 = {};
            slowDia(r3);
        }else if(response.equals("3")) {
            String[] r3Alt = {};
            slowDia(r3Alt);
        }
    }
    //Methods
    public static void slowDia(String[] arr) throws InterruptedException {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length(); j++) {
                System.out.print(arr[i].charAt(j));
                Thread.sleep(200);
            }
            System.out.print(" ");
        }
    }
}