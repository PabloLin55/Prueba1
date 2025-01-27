package src;

import java.util.Arrays;
import java.util.Scanner;

public class programame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-->0) {
            int numero = sc.nextInt();
            if (numero == 6174) {
                System.out.println(0);
            }
            int resultado = numero;
            int contador = 0;
            String numeroLetra = String.valueOf(numero);
            String[] digitos = numeroLetra.split("");
            StringBuilder numMayor = new StringBuilder();
            StringBuilder numMenor = new StringBuilder();
            Arrays.sort(digitos);
            boolean todoIgual = false;
            for (int i = 0; i < digitos.length - 1; i++) {
                if (digitos[i].equals(digitos[i + 1])) {
                    todoIgual = true;
                }
            }
            if (todoIgual) {
                System.out.println(8);
            }
            while (resultado != 6174 && !todoIgual) {
                for (int i = 0; i < digitos.length; i++) {
                    numMenor.append(digitos[i]);
                }

                for (int i = digitos.length - 1; i >= 0; i--) {
                    numMayor.append(digitos[i]);
                }

                resultado = Integer.parseInt(numMayor.toString()) - Integer.parseInt(numMenor.toString());
                contador++;

                numeroLetra = String.valueOf(resultado);
                if (numeroLetra.length() != 4) {
                    Arrays.fill(digitos, "0");
                    for (int i = 0; i < numeroLetra.length(); i++) {
                        digitos[i] = Character.toString(numeroLetra.charAt(i));
                    }
                }
                else {digitos = numeroLetra.split("");}
                numMayor = new StringBuilder();
                numMenor = new StringBuilder();
                Arrays.sort(digitos);

            }
            if (!todoIgual) {
                System.out.println(contador);
            }
        }
    }
}
