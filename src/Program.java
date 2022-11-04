import java.util.Scanner;

public class Program {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Witam Cię wojowniku! Rozpocznij TERAZ swoją przygodę. Czy chcesz stworzyć sowjego bohatera? " +
                "jeżeli TAK wpisz true jeśli NIE wpisz false");
        boolean a=sc.nextBoolean();
                do {
            if (a==true){
            System.out.println("Wybierz imię swojego bohatera");
            String name = sc.next();
            System.out.println("Wybierz klasę swojego bohatera");
            String clas = sc.next();
            System.out.println("Wpisz punkty siły");
            double force = sc.nextDouble();
            System.out.println("Wpisz punkty many");
            double mana = sc.nextDouble();
            double power=(mana+force)/2;
            System.out.println("Nick: "+name+"; Klasa: "+clas+"; Uderzenie "+power+" punktów");
            System.out.println("Czy chcesz dodać kolejnego bohatera? jesli tak to wpisz true w przeciwnym wypadku wpisz false");
            a = sc.nextBoolean();
        }
        } while (a==true);
            ;
            System.out.println("KONIEC!");

    }
}
