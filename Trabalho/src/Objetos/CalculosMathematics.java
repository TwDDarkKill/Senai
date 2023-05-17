package Objetos;
import java.math.BigDecimal;

public class CalculosMathematics {
    private double soma;
    private double subtrai;
    private double multiplica;
    private double divide;

    private double v1,v2;

    private double getSoma() {
        soma = v1 + v2;
        return soma;
    }
    public double Soma(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
        return getSoma();
    }
    private double getSubtrai() {
        subtrai = v1-v2;
        return subtrai;
    }
    public double Subtrai(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
        return getSubtrai();
    }
    private double getMultiplica() {
        multiplica = v1*v2;
        return multiplica;
    }
    public double Multiplica(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
        return getMultiplica();
    }
    private double getDivide() {
        divide = v1 / v2;
        return divide;
    }
    public double Divide(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
        if (v2 == 0) {
            throw new ArithmeticException("Não é possível realizar uma divisão por zero!");
        }
        return getDivide();
    }
}
