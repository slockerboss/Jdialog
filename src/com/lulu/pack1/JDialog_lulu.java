package com.lulu.pack1;
import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JDialog_lulu extends JDialog {
    public JDialog_lulu(Container contentPane, String jd_title){
        super();
        this.setTitle(jd_title);
        this.setSize(400,200);
        this.setLocationRelativeTo(contentPane.getParent());
        this.build_gui(this.getContentPane());
    }
    public void build_gui(Container contentPane)
    {   BorderLayout borderLayout = new BorderLayout(30,30);

        JPanel jp_main = new JPanel(borderLayout);
            JLabel lb_enunciado = new JLabel("Hola! este es un JDialog, bien hecho Mr. John Doe");
            jp_main.add(lb_enunciado, BorderLayout.NORTH);

        JPanel jp_body = new JPanel(new GridLayout(2,1,2,2));
            JTextArea ta_body1 = new JTextArea("Pues aquí esta el texto my friend");
            jp_body.add(ta_body1);
            JPanel jp_body2 = new JPanel(new FlowLayout());
                JButton btn_close_jdialog = new JButton("close this JDialog");
                    btn_close_jdialog.setAlignmentY(Component.BOTTOM_ALIGNMENT);
                    btn_close_jdialog.setSize(100,100);
                    btn_close_jdialog.addActionListener(new ActionListener() {
                        @Override
                        public void actionPerformed(ActionEvent actionEvent) {
                          dispose();
                        }
                    });
                jp_body2.add(btn_close_jdialog);
                jp_body2.setBackground(Color.green                );

        jp_body.add(jp_body2);

            jp_main.add(jp_body,BorderLayout.CENTER);
        contentPane.add(jp_main);

    }
}
