package Objetos;

public class CalculosMathematics {
    private double soma;
    private double subtrai;
    private double multiplica;
    private double divide;
    private double raiz;
    private double expo;
    private double porcen;

    private double v1, v2;

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
        subtrai = v1 - v2;
        return subtrai;
    }

    public double Subtrai(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
        return getSubtrai();
    }

    private double getMultiplica() {
        multiplica = v1 * v2;
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

    private double getRaiz() {
        raiz = Math.sqrt(v1);
        return raiz;
    }

    public double Raiz(double v1) {
        this.v1 = v1;
        return getRaiz();
    }

    private double getExpo() {
        expo = Math.pow(v1, v2);
        return expo;
    }

    public double Expo(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
        return getExpo();
    }

    private double getPorcen() {
        porcen = (v1 / 100) * v2;
        return porcen;
    }

    public double Porcen(double v1, double v2) {
        this.v1 = v1;
        this.v2 = v2;
        return getPorcen();
    }

}
