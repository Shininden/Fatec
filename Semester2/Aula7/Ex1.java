package Semester2.Aula7;

public class Ex1
{
    public static void main(String[] args)
    {
        encaixarValores(5478, 78);
        encaixarValores(2367, 36);
        encaixarValores(1234, 34);
    }

    static void encaixarValores(int a, int b)
    {
        checkDecimalHouses(a, 4);
        checkDecimalHouses(b, 2);

        int lastPart = a % 100;

        if(lastPart == b){
            System.out.println("Encaixa");
        }
        else{
            System.out.println("Nao Encaixa");
        }


    }

    static void checkDecimalHouses(int number, int houses)
    {
        int auxilary_var = number;
        int decimalHousesNum = 0;

        while(auxilary_var > 0)
        {
            auxilary_var /= 10;
            decimalHousesNum++;
        }

        if(decimalHousesNum < houses || decimalHousesNum > houses){
            System.out.println("Error, the number does not have the correct amount of houses");
        }
    }
}