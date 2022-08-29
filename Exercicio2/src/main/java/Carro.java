public class Carro {
    String cor;
    String marca;
    String modelo;
    double velocidadeMax;
    double velocidadeAtual;
    Motor motor = new Motor();

    public void ligar(){
        System.out.println("O carro modelo "+modelo+" ligou!");
    }

    public void acelerar(){
        System.out.println("O carro modelo "+modelo+" esta acelerando!");
    }

    public void mostrInfo(){
        System.out.println("---- Informacao do carro ----");
        System.out.println("Cor do carro: "+ cor);
        System.out.println("Marca: "+ marca);
        System.out.println("Modelo: "+ modelo);
        System.out.println("Velocidade Max: " + velocidadeMax);
        System.out.println("Velocidade Atual: " + velocidadeAtual);
        System.out.println();
        motor.mostraInfo();
    }
}
