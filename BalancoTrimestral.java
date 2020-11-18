class BalancoTrimestral {

    public static void main (String[] args) {

        int gastosJaneiro = 15000;
        int gastosFevereiro = 23000;
        int gastosMarco = 17000;
        int gastosTrimeste = gastosJaneiro + gastosFevereiro + gastosMarco;
        int medialMensal = gastosTrimeste / 3 ;

        System.out.println(gastosTrimeste);
        System.out.println("Valor da media mensal de gastos é " + medialMensal);
    }
}