import java.util.Scanner;
import java.util.InputMismatchException;

public class TestException {
    public static void main(String[] args) {
        int a, b, res;
        Scanner monScanner = new Scanner(System.in);

        try {
            System.out.println("Saisissez la première valeur");
            a = monScanner.nextInt();

            System.out.println("Saisissez la deuxième valeur");
            b = monScanner.nextInt();

            res = a / b;

            System.out.println("le résultat de " + a + " divisé par " + b + " est " + res);
        }
        catch (ArithmeticException e) {
            System.out.println("Problème dans la division");
            System.out.println("le message officiel est " + e.getMessage());
        }
        catch (InputMismatchException e) {
            System.out.println("Problème : vous devez saisir un nombre entier");
            System.out.println("le message officiel est " + e.getMessage());
        }
        finally {
            System.out.println("le bloc finally sera toujours exécuté");
            System.out.println("et c'est ici que l'on fermera par exemple les fichiers");
        }

        System.out.println("Fin du programme");

        monScanner.close();
    }
}
