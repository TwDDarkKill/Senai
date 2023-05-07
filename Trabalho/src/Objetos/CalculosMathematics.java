package Objetos;

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

    private void setSoma(double soma) {
        this.soma = soma;
    }

    private double getSubtrai() {
        subtrai = v1-v2;
        return subtrai;
    }

    private void setSubtrai(double subtrai) {
        this.subtrai = subtrai;
    }

    private double getMultiplica() {
        multiplica = v1*v2;
        return multiplica;
    }

    private void setMultiplica(double multiplica) {
        this.multiplica = multiplica;
    }

    private double getDivide() {
        divide = v1 / v2;
        return divide;
    }

    private void setDivide(double divide) {
        this.divide = divide;
    }

    public double Soma(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
        return getSoma();
    }

    public double Subtrai(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
        return getSubtrai();
    }

    public double Multiplica(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
        return getMultiplica();
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
