package FigurasGeometricasGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CilindroGUI extends JFrame{
    private JTextField txtRadio;
    private JTextField txtAltura;
    private JButton btnCALCULAR;
    private JButton btnBORRAR;
    private JButton btnVOLVER;
    private JPanel MainPanel;
    private JLabel lbVolumen;
    private JLabel lbSuperficie;

    public CilindroGUI() {
        setContentPane(MainPanel);
        setTitle("CILINDRO");     //Titulo Ventana
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
                double Altura=0;

                try{                                                        //Excepcion por si mete un dato que no
                    Radio=Double.parseDouble(txtRadio.getText());           //es numerico
                    Altura=Double.parseDouble(txtAltura.getText());

                    Radio=Math.abs(Radio);                                  //Se aplica abs por si el dato es negativo
                    Altura=Math.abs(Altura);

                    Cilindro CalculoCilindro=new Cilindro(Radio,Altura);

                    double VolCilindro=CalculoCilindro.Volumen();
                    double SupCilindro=CalculoCilindro.Superficie();

                    lbVolumen.setText("VOLUMEN (cm3): "+String.valueOf(String.format("%.3f",VolCilindro)));
                    lbSuperficie.setText(("SUPERFICIE (cm2): "+String.valueOf(String.format("%.3f",SupCilindro))));

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
                txtRadio.setText("");
                txtAltura.setText("");
                lbVolumen.setText("");
                lbSuperficie.setText("");
            }

        });
        btnVOLVER.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();                                      //Sirve para cerrar el menu cilindro
                MenuFigurasGUI form=new MenuFigurasGUI();       //Invocar el menu de Figuras
                form.setVisible(true);

            }

        });
    }

}
