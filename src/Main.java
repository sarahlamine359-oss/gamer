import java.util.Random;
import java.util.Scanner;


public class Main {


    public static void main(String[] args) {

        // Création de l'objet Scanner pour lire les entrées utilisateur
        Scanner scanner = new Scanner(System.in);

        // Création de l'objet Random pour générer un nombre aléatoire
        Random random = new Random();

        // Génération d'un nombre entre 1 et 100
        int nombreSecret = random.nextInt(100) + 1;


        int essais = 0;
        int maximumEssais = 10;
        boolean trouve = false;


        System.out.println(" Jeu de Devinettes ");
        System.out.println("Vous avez 10 essais pour trouver le nombre secret.");


        while (!trouve && essais < maximumEssais) {

            // Demande à l'utilisateur de saisir un nombre
            System.out.print("Devinez un nombre entre 1 et 100 : ");


            int proposition = scanner.nextInt();

            // Incrémentation du nombre d'essais
            essais++;

            // Vérification de la réponse
            if (proposition == nombreSecret) {

                System.out.println(
                        "Bravo ! Vous avez trouvé le bon nombre en "
                                + essais + " essais."
                );

                trouve = true;

            } else if (proposition < nombreSecret) {


                System.out.println("Le nombre secret est plus grand.");

            } else {


                System.out.println("Le nombre secret est plus petit.");
            }
        }

        // Message de défaite après 10 essais
        if (!trouve) {

            System.out.println(
                    "Vous avez perdu ! Le nombre secret était : "
                            + nombreSecret
            );
        }


        scanner.close();
    }
}