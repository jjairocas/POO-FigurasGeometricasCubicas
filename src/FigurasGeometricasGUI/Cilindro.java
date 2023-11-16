package FigurasGeometricasGUI;

public class Cilindro {
    private double radio;
    private double altura;

    public Cilindro(double radio, double altura) {
        this.radio = radio;
        this.altura = altura;
    }

    public double Volumen(){
        double VolumenCilindro=(Math.PI*Math.pow(radio,2)*altura);

        return VolumenCilindro;

    }

    public double Superficie(){
        double SuperficieCilindro=(2*Math.PI)*radio*altura+(2*Math.PI)*(Math.pow(radio,2));
        return SuperficieCilindro;

    }

}
