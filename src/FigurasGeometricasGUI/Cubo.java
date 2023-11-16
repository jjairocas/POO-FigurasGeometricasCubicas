package FigurasGeometricasGUI;

public class Cubo {
    private double lado;

    public Cubo(double lado) {
        this.lado = lado;
    }

    public double VolumenCubo(){
        double VolCubo=Math.pow(lado,3);
        return VolCubo;
    }
    public double SuperficieCubo(){
        double SupCubo=6*lado;
        return SupCubo;

    }
}
