import java.util.Scanner;

/**
 * Created by asus on 2017/3/10.
 */
public class Switch {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("inupt A B C D:  ");
        String s = scanner.nextLine();
        System.out.println(s);
        int grade=30;
        if (grade >= 90) {
            System.out.println("A");}
        else if (grade >= 70) {
            System.out.println("B");
        }
        else if (grade >= 60) {
            System.out.println("C");
        }
        else  if (grade < 60){
            System.out.println("D");
        }
    }

      //  switch (s){
   /*         case "A":
                System.out.println("[90.100]");
                break;
            case "B":
                System.out.println("[70.80]");
                break;
            case "C":
                System.out.println("[50.70]");
                break;
            case "D":
                System.out.println("[0.50]");
                break;
        }*/
     /*   int i = 0;
        while (i <10){
            System.out.println(i);
            i++;
        }
        System.out.println("------------");
                int j = 0;
                do {
                System.out.println(j);
                j++;
                }while (j<10);
        for (int h = 0; h < 10; h++){
        System.out.println(h);}
        if(i == 5){
        System.out.println(i);
        }*/


        }

