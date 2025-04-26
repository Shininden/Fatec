package Fatec.EstruturadeDados.ListaEncadeada;

public class TesteLista 
{
    public static void main(String[] args) 
    {
        ListaLigada lista = new ListaLigada();

        System.out.println(lista);
        System.out.println("Tamanho: " + lista.length() + "\n");

        for (int i = 1; i <= 10; i++) {
            lista.insereInicio(i);
        }

        System.out.println(lista);
        System.out.println("Tamanho: " + lista.length());
        
        System.out.println();

        while (!lista.listaVazia()) 
        {
            System.out.println(lista.removeInicio() + " saiu do inicio");
            System.out.println(lista);

            System.out.println();
        }
        System.out.println("Tamanho: " + lista.length());

        for (int i = 1; i <= 10; i++) {
            lista.insereFim(i);
        }

        System.out.println(lista);

        while (!lista.listaVazia()) 
        {
            System.out.println(lista.removeFim() + " saiu do fim");
            System.out.println(lista);

            System.out.println();
        }
    }
}