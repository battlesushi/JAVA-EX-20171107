import javax.swing.*;
import java.awt.*;

public class MainFrame extends JFrame{
    private JButton jbtn[]=new JButton[9];
    private JPanel jpnCenter=new JPanel(new GridLayout(3,3,3,3));
    private JPanel jpnEast=new JPanel(new GridLayout(3,1,3,3));
    private JButton jbtnStart=new JButton("Start");
    private JButton jbtnRe=new JButton("Re");
    private JButton jbtnClose=new JButton("Close");
    private Container cp;
    public MainFrame(){
        init();
    }
    private void init(){
        this.setBounds(200,200,500,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        cp=this.getContentPane();
        cp.setLayout(new BorderLayout(3,3));
        cp.add(jpnEast, BorderLayout.EAST);
        cp.add(jpnCenter, BorderLayout.CENTER);
        jpnEast.add(jbtnStart);
        jpnEast.add(jbtnRe);
        jpnEast.add(jbtnClose);

        for(int i=0;i<9;i++){
            jbtn[i].set
        }



    }

}
