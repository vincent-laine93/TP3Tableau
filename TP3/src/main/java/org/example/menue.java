package org.example;

import java.util.Scanner;

public class menue
{
    public static void main(String[] args)
    {
        int choix;
        Scanner scanner = new Scanner(System.in);
        do
        {
            do
            {
                System.out.println("1 - Exercice n°1");
                System.out.println("2 - Exercice n°2");
                System.out.println("3 - Exercice n°3");
                System.out.println("4 - Exercice n°4");
                System.out.println("0 - Quitter");
                System.out.print("Votre choix : ");
                choix = scanner.nextInt();
            } while (choix > 4);

            switch (choix)
            {
                case 0:
                    System.out.println("Fin du programme");
                    break;
                case 1:
                    int[] tabExo1 = new int[] {31, 6, 177, 42, 93};
                    int max = tabExo1[0];
                    int valeurRechercher;
                    int position = -1;
                    //V1
                    System.out.println("AFFICHAGE DU TABLEAU :");
                    System.out.print("- ");
                    for (int i = 0; i < tabExo1.length; i++){
                        System.out.print(tabExo1[i] + " - ");
                    }
                    System.out.println();
                    //V2
                    System.out.println("AFFICHAGE DU TABLEAU :");
                    System.out.print("-");
                    for (int nb: tabExo1){
                        System.out.print(nb + " - ");
                    }
                    System.out.println();

                    for (int i = 1; i < tabExo1.length; i++){
                        if (tabExo1[i] > max){
                            max = tabExo1[i];
                        }
                    }
                    System.out.println("Le maximum est : "+ max);

                    do {
                        System.out.print("Valeur rechercher : ");
                        valeurRechercher = scanner.nextInt();
                    }while (valeurRechercher < 0);

                    for (int i = 0; i < tabExo1.length; i++){
                        if (tabExo1[i] == valeurRechercher){
                            position = i;
                        }
                    }
                    if (position == -1){
                        System.out.println("Valeur non trouver");
                    }
                    else {
                        System.out.println("Valeur trouver en position : "+ position);
                    }
                    break;
                case 2:
                    int[] tabExo2 = new int[] {3, 4, 17, 5, 8};
                    int[] tabPair = new int[tabExo2.length];
                    int[] tabImpair = new int[tabExo2.length];
                    int k = 0;
                    int j = 0;
                    int sommePair = 0;
                    int sommeImpair = 0;
                    for (int i = 0; i < tabExo2.length; i++){
                        if (tabExo2[i] % 2 == 0){
                            tabPair[j] = tabExo2[i];
                            sommePair += tabPair[j];
                            j++;
                        }
                        else {
                            tabImpair[k] = tabExo2[i];
                            sommeImpair += tabImpair[k];
                            k++;
                        }
                    }
                    System.out.println("Valeur Paire :");
                    for (int i = 0; i < tabImpair.length; i++){
                        System.out.print(tabPair[i] + " - ");
                    }
                    System.out.println();
                    System.out.println("Valeur Imaire :");
                    for (int i = 0; i < tabPair.length; i++){
                        System.out.print(tabImpair[i] + " - ");
                    }
                    System.out.println();
                    System.out.println("Somme paire : "+ sommePair);
                    System.out.println("Somme impaire : "+ sommeImpair);

                    break;
                case 3:
                    int[] tabExo3 = new int[] {4, 8, 7, 12};
                    int[] tab2exo3 = new int[] {3, 6};
                    int schtroumpf = 0;
                    for (int i = 0; i < tabExo3.length; i++){
                        for (int l =0; l < tab2exo3.length; l++){
                            schtroumpf = schtroumpf + tabExo3[i] * tab2exo3[l];
                        }
                    }
                    for (int i = 0; i < tabExo3.length; i++){
                        System.out.print(tabExo3[i] + " - ");
                    }
                    System.out.println();
                    for (int i = 0; i < tab2exo3.length; i++){
                        System.out.print(tab2exo3[i] + " - ");
                    }
                    System.out.println();
                    System.out.println("Le schtroumpf est de : "+ schtroumpf);

                    break;
                case 4:
                    int[][] tabExo4 = new int[4][4];
                    int[][] tab2Exo4 = new int[4][4];
                    String valeur = "";
                    String ligne = "";
                    String colonne = "";
                    String valeur1 = "";
                    String ligne1 = "";
                    String colonne1 = "";

                    // Exemple n°1

                    tabExo4[0][0] = 1;tabExo4[0][1] = 0;tabExo4[0][2] = 0;tabExo4[0][3] = 0;
                    tabExo4[1][0] = 0;tabExo4[1][1] = 3;tabExo4[1][2] = 0;tabExo4[1][3] = 6;
                    tabExo4[2][0] = 0;tabExo4[2][1] = 0;tabExo4[2][2] = 0;tabExo4[2][3] = 0;
                    tabExo4[3][0] = 0;tabExo4[3][1] = 0;tabExo4[3][2] = 0;tabExo4[3][3] = 0;

                    System.out.println("Exemples 1 :");
                    for (int i = 0; i < tabExo4.length; i++){
                        for (int l = 0; l < tabExo4.length; l++){
                            System.out.print(tabExo4[i][l] + " - ");
                            if (tabExo4[i][l] != 0){
                                valeur = valeur + tabExo4[i][l] + " - ";
                                ligne = ligne + i + " - ";
                                colonne = colonne + l + " - ";
                            }
                        }
                        System.out.println();
                    }

                    System.out.println("\nValeurs non nul : \n" + valeur);
                    System.out.println("Lignes : \n" + ligne);
                    System.out.println("Colonnes : \n" + colonne);

                    // Exemple n°2

                    tab2Exo4[0][0] = 1;tab2Exo4[0][1] = 2;tab2Exo4[0][2] = 0;tab2Exo4[0][3] = 0;
                    tab2Exo4[1][0] = 3;tab2Exo4[1][1] = 4;tab2Exo4[1][2] = 0;tab2Exo4[1][3] = 0;
                    tab2Exo4[2][0] = 5;tab2Exo4[2][1] = 6;tab2Exo4[2][2] = 0;tab2Exo4[2][3] = 0;
                    tab2Exo4[3][0] = 7;tab2Exo4[3][1] = 8;tab2Exo4[3][2] = 0;tab2Exo4[3][3] = 0;

                    System.out.println("Exemples 2 :");
                    for (int i = 0; i < tab2Exo4.length; i++){
                        for (int l = 0; l < tab2Exo4.length; l++){
                            System.out.print(tab2Exo4[i][l] + " - ");
                            if (tab2Exo4[i][l] != 0){
                                valeur = valeur + tab2Exo4[i][l] + " - ";
                                ligne = ligne + i + " - ";
                                colonne = colonne + l + " - ";
                            }
                        }
                        System.out.println();
                    }

                    System.out.println("\nValeurs non nul : \n" + valeur);
                    System.out.println("Lignes : \n" + ligne);
                    System.out.println("Colonnes : \n" + colonne);

                    break;
            }
        }while (choix != 0);
    }
}