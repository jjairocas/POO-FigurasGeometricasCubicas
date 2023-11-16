package FigurasGeometricasGUI;

public class Prisma {
    private double base;
    private double lado;
    private double altura;


    public Prisma(double base, double lado, double altura) {
        this.base = base;
        this.lado = lado;
        this.altura = altura;

    }


    public double VolumenPrismaRecto(){
        double VolPrismaRecto=base*lado*altura;
        return VolPrismaRecto;

    }
    public double SuperficiePrismaRecto(){
        double SupPrismaRecto=2*(base*lado)+((2*base+2*lado)*altura);
        return SupPrismaRecto;

    }

}
