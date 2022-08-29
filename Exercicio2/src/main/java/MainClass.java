public class MainClass {
    public static void main(String[] args) {
        //Criando o carro 1
        Carro carro1 = new Carro();
        carro1.cor = "Vermelho";
        carro1.marca = "Fiat";
        carro1.modelo = "Picape";
        carro1.velocidadeMax = 200f;
        carro1.velocidadeAtual = 120f;
        carro1.motor.potencia = 2;
        carro1.motor.tipo = "Radial";

        //fazendo acoes com o carro 1
        carro1.ligar();
        carro1.acelerar();

        //mostrando ifos do carro1
        carro1.mostrInfo();

        //Criando o carro 2
        Carro carro2 = new Carro();
        carro2.cor = "Bramcp";
        carro2.marca = "BMW";
        carro2.modelo = "SUV";
        carro2.velocidadeMax = 260f;
        carro2.velocidadeAtual = 180f;
        carro2.motor.potencia = 3;
        carro2.motor.tipo = "V";

        //fazendo acoes com o carro 2
        carro2.ligar();
        carro2.acelerar();

        //mostrando ifos do carro1
        carro2.mostrInfo();
    }
}
