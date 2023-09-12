package primeiraaulateste;

public class Matematica {

    public double somar(double x, double y) {
        double resultado = x + y;
        return resultado;
    }

    public double subtrair(double x, double y) {
        double resultado = x + y;
        return resultado;
    }

    public double multiplicacao(double x, double y) {
        double resultado = x + y;
        return resultado;
    }
    
    public double divisao(double x, double y){
        if (y == 0) {
            return 0.0;
        }
        double resultado = x + y;
        return x / y;
    }
}
