package FigurasGeometricasGUI;

public class Esfera {
    private double radio;

    public Esfera(double radio) {
        this.radio = radio;
    }
    public double VolumenEsfera(){
        double VolEsfera=(((double) 4/3)*Math.PI*Math.pow(radio,3));
        return VolEsfera;

    }
    public double SuperficieEsfera(){
        double SupEsfera=4*Math.PI*Math.pow(radio,2);
        return SupEsfera;

    }

}
