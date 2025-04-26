package Fatec.EstruturadeDados.ListaEncadeada;

public class ListaLigada 
{
    private No primeiro;
    private No ultimo;

    public void insereInicio(int info)
    {
        No novo = new No(info);

        if(listaVazia()){
            ultimo = novo;
        }
        else{
            novo.setProximo(primeiro);
        }

        primeiro = novo; 
        /*no final pq, se a lista já tiver itens e o primeiro = novo tiver no começo, 
        vai perder a referencia pro resto da lista*/
    }

    public int removeInicio()
    {
        if(listaVazia()) { 
            throw new RuntimeException("falaha na remocao de inicio"); 
        }

        int aux = primeiro.getInfo();
        primeiro = primeiro.getProximo();

        if(primeiro == null){ //esvaziou a lista
            ultimo = null;
        } 

        return aux;
    }

    public void insereFim(int info)
    {
        No novo = new No(info);

        if(listaVazia()){
            primeiro = novo;
        }
        else{
            ultimo.setProximo(novo);
        }

        ultimo = novo;

        //1-2-3
    }

    public int removeFim()
    {
        if(listaVazia()){
            throw new RuntimeException("Falha na remocao do fim");
        }

        int aux = ultimo.getInfo();

        if(primeiro == ultimo) //só 1 elemento
        {
            primeiro = null;
            ultimo = null;
        }
        else
        {
            No index = primeiro;

            while (index.getProximo() != ultimo){ //procurndo o penultimo
                index = index.getProximo();
            }

            index.setProximo(null);
            ultimo = index;
        }

        return aux;
    }

    public int length()
    {
        if(listaVazia()) { return 0; }

        int cont = 0;
        No index = primeiro;

        while (index != null) 
        {
            cont++;
            index = index.getProximo();
        }

        return cont;
    }
    
    public boolean listaVazia() { return primeiro == null; }

    //o toString varre a lista do 1 -> final
    @Override
    public String toString()
    {
        if(listaVazia()) { return "lista vazia"; }

        String s = "";
        No index = primeiro;

        while (index != null) 
        {
            s += index + " -> ";
            index = index.getProximo();
        }

        return s + "\\\\";
    }
}