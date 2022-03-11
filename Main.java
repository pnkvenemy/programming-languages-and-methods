                                package com.company;import
                            java.util.Arrays;import java.util.
                        Scanner;import static com.company.Vector.*
                    ;public class Main {public static void main(String[]
                 args) {Scanner scanner = new Scanner(System.in);  int n =
            scanner.nextInt();int m =                   scanner.nextInt();int i, j;
            Vector[] vectors =                                  new Vector[m];for(i = 0;
          i < m; i++){int[]                                             coordinates = new
            int[n];for (j =  0;                                  j < n; j++){coordinates[
            j] = scanner.nextInt();}                      vectors[i]=new Vector(coordinates)
                ;}Arrays.sort(vectors);for(j = 0; j < m; j++){printVector(vectors[j]);}}}



