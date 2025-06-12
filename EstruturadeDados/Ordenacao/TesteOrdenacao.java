package Fatec.EstruturadeDados.Ordenacao;
import java.util.Scanner;

import Fatec.EstruturadeDados.Pilha.NossoVetor;

import java.util.Date;

public class TesteOrdenacao
{
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);
        int t;
        System.out.print("digite o tamanho do vetor, 0 encerra: ");
        t = scanner.nextInt();
        
        while (t > 0) 
        {
            long ini, fim;
            NossoVetor v = new NossoVetor(t);


            v.autoPreencheVetor();
            ini = new Date().getTime();
            v.quickSort(0, v.getTamanho()-1);
            fim = new Date().getTime();
            //System.out.println("vetor ordenado pelo quick: " + v);
            System.out.println("quick demorou " + (fim - ini) + " milissegundos");

            ini = new Date().getTime();
            v.quickSort(0, v.getTamanho()-1);
            fim = new Date().getTime();
            //System.out.println("vetor ordenado pelo quick: " + v);
            System.out.println("quick ordenado demorou " + (fim - ini) + " milissegundos");


            
            System.out.print("digite o novo tamanho, 0 encerra: ");
            t = scanner.nextInt();
        }
        scanner.close();
    }
}



