package grafica;

import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import main.ClienteChat;

public class Grafica {

    public static void main(String[] args) {
        usuario us = new usuario("licho","licho123");
    
        JTextField username = new JTextField();
        JTextField password = new JPasswordField();
        Object[] message = {
            "Username:", username,
            "Password:", password
        };

        int option = JOptionPane.showConfirmDialog(null, message, "Login", JOptionPane.OK_CANCEL_OPTION);
        if (option == JOptionPane.OK_OPTION) {
            if (username.getText().equals(us.getUsuario()) && password.getText().equals(us.getPassword())) {
                System.out.println("Login successful");
                ventana1 V1 = new ventana1(us);
                

            } else {
                System.out.println("login failed");
            }
        } else {
            System.out.println("Login canceled");
        }
   }
    
}


