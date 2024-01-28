

// import java.awt.BorderLayout;
// import java.awt.Color;
// import java.awt.Dimension;
// import java.awt.Panel;

// import javax.swing.ImageIcon;
// import javax.swing.JFrame;
// import javax.swing.JPanel;

// public class first1 {
// public static void main(String []args) {
// 	JFrame frame=new JFrame();
// 	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
// 	frame.setSize(700,700);
// 	frame.setLayout(new BorderLayout());
//     ImageIcon image=new ImageIcon("")
// 	frame.setVisible(true);
// 	JPanel panel1=new JPanel();
// 	JPanel panel2=new JPanel();
// 	JPanel panel3=new JPanel();
// 	JPanel panel4=new JPanel();
// 	JPanel panel5=new JPanel();
// 	panel1.setPreferredSize(new Dimension(100,100));
// 	panel2.setPreferredSize(new Dimension(100,100));
// 	panel3.setPreferredSize(new Dimension(100,100));
// 	panel4.setPreferredSize(new Dimension(100,100));
// 	panel5.setPreferredSize(new Dimension(100,100));
// 	panel1.setBackground(Color.BLUE);
// 	panel2.setBackground(Color.yellow);
// 	panel3.setBackground(Color.green);
// 	panel4.setBackground(Color.red);
// 	panel5.setBackground(Color.cyan);
	
// 	frame.add(panel1,BorderLayout.NORTH);
// 	frame.add(panel2,BorderLayout.WEST);
// 	frame.add(panel3,BorderLayout.EAST);
// 	frame.add(panel4,BorderLayout.SOUTH);
// 	frame.add(panel5,BorderLayout.CENTER);
	
// }
// }
import javax.swing.*;
import java.awt.*;

public class first1 {
    public static void main(String[]args){
        JFrame frame=new JFrame();
        frame.setLayout(new FlowLayout(FlowLayout.CENTER,10,50));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setBackground(Color.cyan);
        JPanel panel=new JPanel();
        panel.setBackground(Color.LIGHT_GRAY);
        panel.setLayout(new FlowLayout());
        panel.setPreferredSize(new Dimension(400,400));
        frame.setSize(800,800);
//        frame.add(new Button("1"));
//        frame.add(new Button("2"));
//        frame.add(new Button("3"));
//        frame.add(new Button("4"));
//        frame.add(new Button("5"));
//        frame.add(new Button("6"));
//        frame.add(new Button("7"));
//        frame.add(new Button("8"));
//        frame.add(new Button("9"));
//        frame.add(new Button("10"));

        panel.add(new Button("1"));
        panel.add(new Button("2"));
        panel.add(new Button("3"));
        panel.add(new Button("4"));
        panel.add(new Button("5"));
        panel.add(new Button("6"));
        panel.add(new Button("7"));
        panel.add(new Button("8"));
        panel.add(new Button("9"));
        panel.add(new Button("10"));
        frame.add(panel);
        frame.setVisible(true);

    }
}

