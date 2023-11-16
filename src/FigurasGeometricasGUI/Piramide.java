package FigurasGeometricasGUI;

public class Piramide {
    private double base;
    private double altura;
    private double apotema;

    public Piramide(double base, double altura, double apotema) {
        this.base = base;
        this.altura = altura;
        this.apotema = apotema;
    }

    public double VolumenPiramide(){
        double VolPiramide=(((double) 1/3)*Math.pow(base,2)*altura);
        return VolPiramide;

    }
    public double SuperficiePiramide(){
        double AreaBase=Math.pow(base,2);
        double AreaLado=2*base*apotema;
        return AreaBase+AreaLado;

    }

}
