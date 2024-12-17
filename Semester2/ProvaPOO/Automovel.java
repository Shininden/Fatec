package Semester2.ProvaPOO;

public class Automovel 
{
    String nrChassi;
    String marca;
    int anoFabricacao;
    String placa;
    double motor;

    public Automovel()
    {
        this.nrChassi = "";
        this.marca = "";
        this.anoFabricacao = 0;
        this.placa = "";
        this.motor = 0;
    }
    
    public Automovel(String chassi, String marca, int ano, String placa, double motor)
    {
        this.nrChassi = chassi;
        this.marca = marca;
        this.anoFabricacao = ano;
        this.placa = placa;
        this.motor = motor;
    }

    public Automovel(Automovel auto)
    {
        this.nrChassi = auto.getnrChassi();
        this.marca = auto.getMarca();
        this.anoFabricacao = auto.getAno();
        this.placa = auto.getPlaca();
        this.motor = auto.getMotor();
    }

    public void imprimirAutomovel()
    {
        System.out.println("NrChassi: " + nrChassi);
        System.out.println("Marca: " + marca);
        System.out.println("Ano de Fabricacao: " + anoFabricacao);
        System.out.println("Placa: " + placa);
        System.out.println("Motor: " + motor);
        System.out.println();
    }

    public void verificarDesempenhoMotor(double pot)
    {
        if(pot == 1){
            System.out.println("Motor 1.0: economia no consumo de combustível, sendo indicado para mootoristas que procuram um meio de condução para trajetos dentro da cidade");
        }
        else if(pot == 1.4){
            System.out.println("Motor 1.4: custo-beneficio similar ao proposto pelo 1.0, mas com a vantagem de ter uma potencia superior");
        }
        else if(pot == 1.6){
            System.out.println("Motor 1.6: se destaca pela forte potencia do veículo, mas sem os altos gastos de combustivel como os carro de potencia superior");
        }
        else if(pot == 1.8){
            System.out.println("Motor 1.8: nao sao carros economicos, mas sao realmente potentes. Esses motores podem ser usados ate mesmo em carros esportivos e de corrida, ja que apresentam a forçaa que esses modelos necessitam");
        }
        else if(pot == 2.0){
            System.out.println("Motor 2.0: tipo de motor mais potente para veiculos de rua. Ao investir em um carro desses sera preciso estar disposto a gastar muito dinheiro com combustivel");
        }
        else{
            System.out.println("Valor informado nao representa uma potencia valda");
        }
    }

    public String getnrChassi(){
        return this.nrChassi;
    }

    public String getMarca(){
        return this.marca;
    }

    public int getAno(){
        return this.anoFabricacao;
    }

    public String getPlaca(){
        return this.placa;
    }

    public double getMotor(){
        return this.motor;
    }
}