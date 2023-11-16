package FigurasGeometricasGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PiramideGUI extends JFrame{
    private JTextField txtBase;
    private JTextField txtAltura;
    private JTextField txtApotema;
    private JButton btnCALCULAR;
    private JButton btnBORRAR;
    private JButton btnVOLVERAMENU;
    private JPanel MainPanel;
    private JLabel lbVolumen;
    private JLabel lbSuperficie;

    public PiramideGUI() {
        setContentPane(MainPanel);
        setTitle("PIRAMIDE");     //Titulo Ventana
        setSize(350, 200);      //Tamaño ventana
        setLocationRelativeTo(null);        //La ventana se posiciona en el centro
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    //El boton cerrar cierra la ventana
        setResizable(false);                //La ventana no se puede cambiar de tamaño
        //setVisible(true); Se visualiza la ventana en la parte superior izquierda


        btnCALCULAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double Base=0;
                double Altura=0;
                double Apotema=0;
                boolean error=false;

                try{
                    Base=Double.parseDouble(txtBase.getText());
                    Altura=Double.parseDouble(txtAltura.getText());
                    Apotema=Double.parseDouble(txtApotema.getText());

                    Base=Math.abs(Base);
                    Altura=Math.abs(Altura);
                    Apotema=Math.abs(Apotema);

                    Piramide CalcularPiramide=new Piramide(Base,Altura,Apotema);
                    double VolPiramide=CalcularPiramide.VolumenPiramide();
                    double SupPiramide=CalcularPiramide.SuperficiePiramide();

                    lbVolumen.setText("VOLUMEN (cm3): "+String.valueOf(String.format("%.3f",VolPiramide)));
                    lbSuperficie.setText("SUPERFICIE (cm2): "+String.valueOf(String.format("%.3f",SupPiramide)));

                }
                catch (Exception exception){
                    error=true;

                }
                finally {
                    if(error){
                        JOptionPane.showMessageDialog(null, "El dato que ingresaste es " +
                                        "incorrecto debe ser numerico", "Datos Incorrectos",
                                JOptionPane.ERROR_MESSAGE);

                        txtBase.setText("");
                        txtAltura.setText("");
                        txtApotema.setText("");
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
                txtAltura.setText("");
                txtApotema.setText("");
                lbVolumen.setText("");
                lbSuperficie.setText("");
            }
        });
        btnVOLVERAMENU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();                                      //Sirve para cerrar el menu piramide
                MenuFigurasGUI form=new MenuFigurasGUI();       //Invocar el menu de Figuras
                form.setVisible(true);

            }
        });
    }

}
