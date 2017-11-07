import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OXGameFrame extends JFrame{
    private JButton jbtn[]=new JButton[9];
    private JPanel jpnCenter=new JPanel(new GridLayout(3,3,3,3));
    private JPanel jpnEast=new JPanel(new GridLayout(3,1,3,3));
    private JButton jbtnStart=new JButton("Start");
    private JButton jbtnRe=new JButton("Re");
    private JButton jbtnClose=new JButton("Close");
    private Container cp;
    private boolean flag=true;
    public OXGameFrame(){
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

        for(int i=0;i<9;i++){// O X 按鈕設定
            jbtn[i]=new JButton("");
            jpnCenter.add(jbtn[i]);
            jbtn[i].addActionListener(new ActionListener() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    JButton tempButton=(JButton) e.getSource();
                    if(flag){
                        tempButton.setText("O");
                        flag=false;
                    }
                    else{
                        tempButton.setText("X");
                        flag=true;
                    }
                }
            });
        }
        jbtnRe.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                for(int i=0;i<9;i++){
                    jbtn[i].setText("");
                }
            }
        });
        jbtnClose.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.exit(0);
            }
        });
    }

}
