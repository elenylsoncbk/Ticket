package oo.Composicao.Desafio.teste;
import java.util.ArrayList;
import java.util.Scanner;
public class Trabalho1 {

    public static void main(String[] args) {
        final double valor = 4.0;
        boolean status = false;
        Scanner entrada = new Scanner(System.in);
        String comand;
        ArrayList<Double> cValor = new ArrayList<>();
        ArrayList<Boolean> cStatus = new ArrayList<>();
        do {
            System.out.println();
            System.out.println("      -MENU-      ");
            System.out.print("""
                   1 - Para Adicionar:
                   2 - Para Consultar Saldo:
                   3 - Para Pagar:
                   4 - Para Sair:
                   """);
            comand = entrada.nextLine().trim();
            double valorFinal = 0;
            switch (comand) {
                case "1" -> {
                    cValor.add(valor);
                    cStatus.add(status);
                    System.out.println("Ticket Gerado! ");
                }
                case "2" -> {
                    for (boolean c : cStatus) {
                        if (c) {
                            valorFinal += 4;
                        }
                        }
                    System.out.println(valorFinal);
                    }

                case "3" -> {
                    int ty = 0;
                    for (boolean d : cStatus) {
                        if (d) {
                            System.out.println(ty + " - Foi Pago => " + cValor.get(ty));
                        } else {
                            System.out.println(ty + " - Não Foi Pago ");
                        }
                        ty++;
                        }
                    try {
                        System.out.println();
                        System.out.println("informe qual deseja concluir: ");
                        int subConcluidas = entrada.nextInt();
                        if (subConcluidas > cStatus.size() - 1) {
                            System.out.println("Indice Invalido!");
                        } else {
                            cStatus.set(subConcluidas, true);
                        }
                        System.out.println("----------------\n");
                        entrada.nextLine();
                    } catch (Exception e) {
                        System.out.println("Indice Invalido!");
                        System.out.println("----------------\n");
                    }
                }
                case "4" -> System.out.println("FINAL");
                default -> System.out.println("invalido");
            }
        }while (!comand.equalsIgnoreCase("4"));
        entrada.close();
    }
}
