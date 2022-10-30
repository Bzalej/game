import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Witam Cię wojowniku! Rozpocznij TERAZ swoją przygodę. Stwórz bohatera na miarę swojej zajebistości!!!");
        System.out.println("Wybierz imię swojego bohatera");
        String name= sc.nextLine();
        System.out.println("Wybierz klasę swojego bohatera");
        String clas=sc.nextLine();
        System.out.println("Wpisz punkty siły");
        int force=sc.nextInt();
        System.out.println("Wpisz punkty many");
        int mana=sc.nextInt();
        System.out.println("Jeżeli jest to nowa postać wpisz true, jeżeli jest to stara postać wpisz false");
        boolean player=sc.nextBoolean();

        Hero character1=new Hero(name, clas, force, mana, player);
        double power=(force+mana)/2;
        System.out.println("Zmień imię postaci");
        character1.changeName(sc.next());
        System.out.println("Zmień klasę postaci");
        character1.changeClas(sc.next());
        System.out.println("Zmiana: nowa postać wpisz true, jeżeli jest to stara postać wpisz false");
        character1.changePlayer(sc.nextBoolean());
        System.out.println("Uderzenie postaci wyniesie: "+power+" punktów");
        System.out.println("Nick: "+character1.vievname()+" Klasa: "+character1.vievclas()+" Nowa postać w grze: "+character1.vievPlayer()+" Uderzenie "+power+" punktów");

    }
}
