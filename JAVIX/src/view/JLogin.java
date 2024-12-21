package view;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JPasswordField;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JOptionPane;

public class JLogin extends JFrame {

    private static final long serialVersionUID = 1L;
    private JPanel fundo_janela;
    private JTextField campo_usuario;
    private JLabel senha;
    private JPasswordField campo_senha;

    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    JLogin frame = new JLogin();
                    frame.setVisible(true);
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });
    }

    /**
     * Create the frame.
     */
    public JLogin() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setExtendedState(JFrame.MAXIMIZED_BOTH); //
        fundo_janela = new JPanel();
        fundo_janela.setBackground(new Color(0, 103, 206));
        fundo_janela.setBorder(new EmptyBorder(5, 5, 5, 5));

        setContentPane(fundo_janela);
        fundo_janela.setLayout(null);
        
        JPanel painel = new JPanel();
        painel.setBackground(new Color(0, 0, 64));
        painel.setBounds(673, 226, 575, 490);
        fundo_janela.add(painel);
        painel.setLayout(null);
        
        JLabel usuario = new JLabel("Usuário:");
        usuario.setForeground(new Color(255, 255, 255));
        usuario.setFont(new Font("Tahoma", Font.PLAIN, 26));
        usuario.setBounds(50, 97, 101, 48);
        painel.add(usuario);
        
        campo_usuario = new JTextField();
        campo_usuario.setBounds(50, 152, 166, 30);
        painel.add(campo_usuario);
        campo_usuario.setColumns(10);
        
        senha = new JLabel("Senha:");
        senha.setForeground(new Color(255, 255, 255));
        senha.setFont(new Font("Tahoma", Font.PLAIN, 26));
        senha.setBounds(50, 220, 93, 48);
        painel.add(senha);
        
        campo_senha = new JPasswordField();
        campo_senha.setBounds(50, 272, 166, 30);
        painel.add(campo_senha);
        
        JLabel login = new JLabel("LOGIN");
        login.setForeground(new Color(255, 255, 255));
        login.setBackground(new Color(0, 0, 64));
        login.setFont(new Font("Tahoma", Font.BOLD, 20));
        login.setBounds(258, 32, 66, 19);
        painel.add(login);
        
        JButton botao = new JButton("ENTRAR");
        botao.setFont(new Font("Tahoma", Font.PLAIN, 19));
        botao.setBounds(252, 400, 110, 23);
        painel.add(botao);
        
        // Adicionando o ActionListener para verificar os campos
        botao.addActionListener(e -> {
            // Pegando os valores dos campos
            String usuarioTexto = campo_usuario.getText();
            String senhaTexto = new String(campo_senha.getPassword());

            // Verificando se algum campo está vazio
            if (usuarioTexto.isEmpty() || senhaTexto.isEmpty()) {
                // Exibe uma mensagem de erro caso algum campo esteja vazio
                JOptionPane.showMessageDialog(this, "Dados inválidos! Preencha ambos os campos.", "Erro", JOptionPane.ERROR_MESSAGE);
            } else {
                // Caso os campos estejam preenchidos, você pode fazer a lógica de login aqui
                JOptionPane.showMessageDialog(this, "Bem-vindo, " + usuarioTexto + "!", "Login realizado", JOptionPane.INFORMATION_MESSAGE);
            }
        });
    }
}