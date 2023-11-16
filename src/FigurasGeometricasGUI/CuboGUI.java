package FigurasGeometricasGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CuboGUI extends JFrame {
    private JTextField txtLado;
    private JButton btnCALCULAR;
    private JButton btnBORRAR;
    private JButton btnVOLVERAMENU;
    private JPanel MainPanel;
    private JLabel lbVolumen;
    private JLabel lbSuperficie;

    public CuboGUI() {
        setContentPane(MainPanel);
        setTitle("CUBO");     //Titulo Ventana
        setSize(350, 200);      //Tamaño ventana
        setLocationRelativeTo(null);        //La ventana se posiciona en el centro
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    //El boton cerrar cierra la ventana
        setResizable(false);                //La ventana no se puede cambiar de tamaño
        //setVisible(true); Se visualiza la ventana en la parte superior izquierda


        btnCALCULAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double Lado=0;
                boolean error=false;

                try{
                    Lado=Double.parseDouble(txtLado.getText());
                    Lado=Math.abs(Lado);
                    Cubo CalculoCubo=new Cubo(Lado);

                    double VolCubo=CalculoCubo.VolumenCubo();
                    double SupCubo=CalculoCubo.SuperficieCubo();

                    lbVolumen.setText("VOLUMEN (cm3): "+String.valueOf(String.format("%.3f",VolCubo)));
                    lbSuperficie.setText("SUPERFICIE (cm2): "+String.valueOf(String.format("%.3f",SupCubo)));

                }
                catch (Exception exception){
                    error=true;

                }
                finally {
                    if(error == true){
                        JOptionPane.showMessageDialog(null, "El dato que ingresaste es " +
                                        "incorrecto debe ser numerico", "Datos Incorrectos",
                                JOptionPane.ERROR_MESSAGE);

                        txtLado.setText("");
                        lbVolumen.setText("");
                        lbSuperficie.setText("");

                    }

                }
            }
        });
        btnBORRAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtLado.setText("");
                lbVolumen.setText("");
                lbSuperficie.setText("");

            }
        });
        btnVOLVERAMENU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();                                      //Sirve para cerrar el menu cubo
                MenuFigurasGUI form=new MenuFigurasGUI();       //Invocar el menu de Figuras
                form.setVisible(true);

            }
        });
    }
}
