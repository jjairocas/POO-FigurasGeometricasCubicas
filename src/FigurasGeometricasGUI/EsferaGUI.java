package FigurasGeometricasGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class EsferaGUI extends JFrame{
    private JTextField txtRadio;
    private JButton btnCALCULAR;
    private JButton btnBORRAR;
    private JButton btnVOLVERAMENU;
    private JPanel MainPanel;
    private JLabel lbVolumen;
    private JLabel lbSuperficie;

    public EsferaGUI() {
        setContentPane(MainPanel);
        setTitle("ESFERA");     //Titulo Ventana
        setSize(350, 200);      //Tamaño ventana
        setLocationRelativeTo(null);        //La ventana se posiciona en el centro
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    //El boton cerrar cierra la ventana
        setResizable(false);                //La ventana no se puede cambiar de tamaño
        //setVisible(true); Se visualiza la ventana en la parte superior izquierda


        btnCALCULAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                boolean error=false;
                double Radio=0;

                try{
                    Radio=Double.parseDouble(txtRadio.getText());
                    Radio=Math.abs(Radio);
                    Esfera CalcularEsfera=new Esfera(Radio);

                    double VolumenEsfera=CalcularEsfera.VolumenEsfera();
                    double SuperficieEsfera=CalcularEsfera.SuperficieEsfera();

                    lbVolumen.setText("VOLUMEN (cm3): "+String.valueOf(String.format("%.3f",VolumenEsfera)));
                    lbSuperficie.setText("SUPERFICIE (cm2): "+String.valueOf(String.format("%.3f",SuperficieEsfera)));

                }
                catch (Exception exception){
                    error=true;

                }
                finally {
                    if(error == true){
                        JOptionPane.showMessageDialog(null, "El dato que ingresaste es " +
                                        "incorrecto debe ser numerico", "Datos Incorrectos",
                                JOptionPane.ERROR_MESSAGE);

                        txtRadio.setText("");
                        lbVolumen.setText("");
                        lbSuperficie.setText("");

                    }
                }
            }

        });
        btnBORRAR.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                txtRadio.setText("");
                lbVolumen.setText("");
                lbSuperficie.setText("");

            }
        });
        btnVOLVERAMENU.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();                                      //Sirve para cerrar el menu esfera
                MenuFigurasGUI form=new MenuFigurasGUI();       //Invocar el menu de Figuras
                form.setVisible(true);

            }
        });
    }
}