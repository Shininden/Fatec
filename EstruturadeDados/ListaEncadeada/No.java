package Fatec.EstruturadeDados.ListaEncadeada;

public class No 
{
    private int info;
    private No proximo;

    public No(int info) { setInfo(info); }


    public int getInfo() { return info; }
    public void setInfo(int info) { this.info = info; }

    public No getProximo() { return proximo; }
    public void setProximo(No proximo) { this.proximo = proximo; } 

    @Override
    public String toString() { return "[" + info + "]"; }
}