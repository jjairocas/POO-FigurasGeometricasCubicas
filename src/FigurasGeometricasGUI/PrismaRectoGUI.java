package FigurasGeometricasGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PrismaRectoGUI extends JFrame{
    private JTextField txtBase;
    private JTextField txtLado;
    private JTextField txtAltura;
    private JButton btnCALCULAR;
    private JButton btnBORRAR;
    private JButton btnVOLVERAMENU;
    private JLabel lbVolumen;
    private JLabel lbSuperficie;
    private JPanel MainPanel;

    public PrismaRectoGUI() {
        setContentPane(MainPanel);
        setTitle("PRISMA RECTO");     //Titulo Ventana
        setSize(350, 200);      //Tamaño ventana
        setLocationRelativeTo(null);        //La ventana se posiciona en el centro
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    //El boton cerrar cierra la ventana
        setResizable(false);                //La ventana no se puede cambiar de tamaño
        //setVisible(true); Se visualiza la ventana en la parte superior izquierda

        btnCALCULAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double Base=0;
                double Lado=0;
                double Altura=0;
                boolean error=false;

                try{
                    Base=Double.parseDouble(txtBase.getText());
                    Lado=Double.parseDouble(txtLado.getText());
                    Altura=Double.parseDouble(txtAltura.getText());

                    Base=Math.abs(Base);
                    Lado=Math.abs(Lado);
                    Altura=Math.abs(Altura);

                    Prisma CalcPrismaRecto=new Prisma(Base,Lado,Altura);
                    double VolPrismaRecto=CalcPrismaRecto.VolumenPrismaRecto();
                    double SupPrismaRecto=CalcPrismaRecto.SuperficiePrismaRecto();

                    lbVolumen.setText("VOLUMEN (cm3): "+String.valueOf(String.format("%.3f",VolPrismaRecto)));
                    lbSuperficie.setText("SUPERFICIE (cm2): "+String.valueOf(String.format("%.3f",SupPrismaRecto)));


                }
                catch (Exception exception){
                    error=true;

                }
                finally {
                    if(error == true){
                        JOptionPane.showMessageDialog(null, "El dato que ingresaste es " +
                                        "incorrecto debe ser numerico", "Datos Incorrectos",
                                JOptionPane.ERROR_MESSAGE);
                        txtBase.setText("");
                        txtLado.setText("");
                        txtAltura.setText("");
                        lbVolumen.setText("");
                        lbSuperficie.setText("");

                    }
                }
            }
        });
        btnBORRAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtBase.setText("");
                txtLado.setText("");
                txtAltura.setText("");
                lbVolumen.setText("");
                lbSuperficie.setText("");

            }
        });
        btnVOLVERAMENU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();                                  //Cierra la ventana Prisma Recto y no queda en segundo plano
                MenuFigurasGUI form=new MenuFigurasGUI();   //Invocar el menu de Figuras
                form.setVisible(true);

            }
        });
    }
}
