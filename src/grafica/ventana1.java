package grafica;



import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JCheckBox;
import javax.swing.JOptionPane;
import main.ClienteChat;

public class ventana1 extends JFrame {

    private JTextArea jta;
    private JTextField jtf;
    private JButton jb;
    private JButton jb2;
    private JButton jb3;
    private JCheckBox jc;
    private ClienteChat cha;
    private usuario us;

    public ventana1(usuario us) {
        setTitle("Primera Ventana");
        setSize(500, 500);
        setLayout(null);
        
        this.us = us;


        jta = new JTextArea();
        jta.setBounds(70, 20, 350, 300);
       

        jta.setEditable(false);

        jc = new JCheckBox("Agregar al final?",true);
        jc.setBounds(100, 325, 200, 30);
        jc.isSelected();
        

        jtf = new JTextField();
        jtf.setBounds(80, 365, 340, 30);

        jb = new JButton();
        jb.setText("Enviar");
        jb.setBounds(320, 420, 100, 50);
        jb.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println(jtf.getText());
                final String usuario = us.getUsuario();
                final String text = jtf.getText();
                cha.EnviarMensaje(usuario, text);
                jtf.setText("");
                /*
                String i = jtf.getText();
                String a = jta.getText();
                if (jc.isSelected()) {                   
                    jta.append(i);
                    jta.append("\n");
                    jtf.setText("");
                } else {
                    jta.setText(i+"\n"+a);
                    jtf.setText("");
                }
*/
            }

        });

        jb2 = new JButton();
        jb2.setText("Borrar");
        jb2.setBounds(200, 420, 100, 50);
        jb2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int op = JOptionPane.showConfirmDialog(rootPane, "Esta seguro?","Advertencia",JOptionPane.YES_NO_CANCEL_OPTION);
                if (op==JOptionPane.YES_OPTION){
                    jtf.setText("");
                    jta.setText("");
                }
            }
        });
        
        jb3 = new JButton();
        jb3.setText("Salir");
        jb3.setBounds(80, 420, 100, 50);
        jb3.addActionListener( new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
                
            }
        });
                
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        add(jta);
        add(jc);
        add(jtf);
        add(jb);
        add(jb2);
        add(jb3);

        setVisible(true);
        
                
       cha= new ClienteChat("192.168.61.11", "2000", jta);
        cha.conectar();
    }

    public JTextArea getJta() {
        return jta;
    }
    
    

    

}
