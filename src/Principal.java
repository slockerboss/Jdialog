import com.lulu.pack1.JDialog_lulu;
import jdk.jfr.ContentType;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Principal extends JFrame {
    JDialog_lulu jDialog;
    public static void main(String[] args) {
        Principal principal = new Principal();
    }

    public Principal()
    {
        super("Ejemplos LULU: JDialog");
        this.jDialog = new JDialog_lulu(this,"a jdialog lulu example");
        this.setSize(800,600);
        this.setLocation((Toolkit.getDefaultToolkit().getScreenSize().width)/2 - getWidth()/2,(Toolkit.getDefaultToolkit().getScreenSize().height)/2 - getHeight()/2);
        build_gui(this.getContentPane());
        this.setVisible(true);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);

        //jDialog.setLocationRelativeTo(this);
    }

    public void build_gui(Container contentPane)
    {
        JPanel jp_main = new JPanel(new BorderLayout());

        JPanel jp_header = new JPanel();
        JLabel lb_enunciado = new JLabel("Esta es una aplicación practicar JAVA");
        jp_header.add(lb_enunciado);
        jp_main.add(jp_header,BorderLayout.NORTH);

        JPanel jp_body = new JPanel(new FlowLayout());
        JButton btn_show_jdialog = new JButton("show dialog");
        btn_show_jdialog.addActionListener(actionEvent -> fn_show_jdialog(contentPane));
        jp_body.add(btn_show_jdialog);

        jp_main.add(jp_body,BorderLayout.CENTER);

        contentPane.add(jp_main);
    }

    public void fn_show_jdialog(Container contentPane){

        jDialog.setVisible(true);
    }
}


