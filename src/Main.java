import java.awt.*;

public class Main {
    public static void main(String[] args) {
        // Первая команда
        System.out.println("Teams Warface");
        System.out.println("Score");

        double a = 4;
        double b = 5;
        double c = 3;
        double d = 6;
        double e = 2;

        double Warface = (a + b + c + d + e);
        System.out.println(Warface);

        System.out.println("Average teams Warface");
        System.out.println((a + b + c + d + e)/5);


        System.out.println(" ");

        // Вторая команда
        System.out.println("Teams Blacwood");
        System.out.println("Score");

        double a1 = 7d;
        double b1 = 8d;
        double c1 = 5d;
        double d1 = 8d;
        double e1 = 4d;

        double Blacwood = (a1 + b1 + c1 + d1 + e1);
        System.out.println(Blacwood);

        System.out.println("Average teams Blacwood");
        System.out.println((a1 + b1 + c1 + d1 + e1)/5);

        // Подсчет
        System.out.println(" ");
        System.out.println("Victory:" + " " + "team Blacwood" + " " + Blacwood + " " + "score");
    }
}
