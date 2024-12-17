package Semester2.ProvaPOO;

import java.util.Scanner;

public class TestaAutomovel 
{
    public static void main(String[] args) 
    {
        Scanner sc = new Scanner(System.in);
        
        Automovel auto1 = new Automovel();

        System.out.print("Digite o nr Chassi: ");
        String nrChassi = sc.nextLine();

        System.out.print("Digite a marca: ");
        String marca = sc.nextLine();

        System.out.print("Digite o ano de fabricacao: ");
        int ano = sc.nextInt();

        sc.nextLine();

        System.out.print("Digite a placa: ");
        String placa = sc.nextLine();

        System.out.print("Digite o motor: ");
        double motor = sc.nextDouble();

        Automovel auto2 = new Automovel(nrChassi, marca, ano, placa, motor);

        Automovel auto3 = new Automovel(auto2);

        System.out.println();
        auto1.imprimirAutomovel();
        auto2.imprimirAutomovel();
        auto3.imprimirAutomovel();

        auto2.verificarDesempenhoMotor(motor);
        sc.close();
    }
}