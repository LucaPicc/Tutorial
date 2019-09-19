import javax.swing.*;
import java.awt.event.*;
public class Botones extends JFrame implements ActionListener{
  private JButton boton1,boton2;
  public Botones(){
    setLayout(null);
    boton1 = new JButton("Varon");
    boton1.setBounds(10,100,90,30);
    add(boton1);
    boton1.addActionListener(this);
    boton2 = new JButton("Mujer");
    boton2.setBounds(110,100,90,30);
    add(boton2);
    boton2.addActionListener(this);

  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource() == boton1){
      setTitle("Varon");
    }
    if(e.getSource() == boton2){
      setTitle("Mujer");
    }
  }
  public static void main(String[] ar){
    Botones bot = new Botones();
    bot.setBounds(0,0,350,200);
    bot.setVisible(true);
  }
}
