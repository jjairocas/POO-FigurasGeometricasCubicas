package FigurasGeometricasGUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MenuFigurasGUI extends JFrame {
    private JButton btnCILINDRO;
    private JButton btnESFERA;
    private JButton btnPIRAMIDE;
    private JPanel MainPanel;
    private JButton CUBOButton;
    private JButton PRISMAButton;
    private JButton SALIRButton;

    public MenuFigurasGUI() {
        setContentPane(MainPanel);
        setTitle("MENU FIGURAS");     //Titulo Ventana
        setSize(350, 150);      //Tamaño ventana
        setLocationRelativeTo(null);        //La ventana se posiciona en el centro
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);    //El boton cerrar cierra la ventana
        setResizable(false);                //La ventana no se puede cambiar de tamaño
        //setVisible(true); Se visualiza la ventana en la parte superior izquierda

        btnCILINDRO.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();                                  //Cierra la ventana menu y no queda en segundo plano
                CilindroGUI form=new CilindroGUI();
                form.setVisible(true);

            }
        });
        btnESFERA.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();                                  //Cierra la ventana menu y no queda en segundo plano
                EsferaGUI form=new EsferaGUI();
                form.setVisible(true);

            }
        });
        btnPIRAMIDE.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();                                  //Cierra la ventana menu y no queda en segundo plano
                PiramideGUI form=new PiramideGUI();
                form.setVisible(true);

            }
        });
        CUBOButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();                                  //Cierra la ventana menu y no queda en segundo plano
                CuboGUI form=new CuboGUI();
                form.setVisible(true);

            }
        });
        PRISMAButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                dispose();                                  //Cierra la ventana menu y no queda en segundo plano
                PrismaRectoGUI form=new PrismaRectoGUI();
                form.setVisible(true);


            }
        });
        SALIRButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
