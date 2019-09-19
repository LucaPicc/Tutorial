import javax.swing.*;
public class Ventanacolores extends JFrame{
  private JLabel label1,label2,label3;
  public Ventanacolores(){
    setLayout(null);
    label1 = new JLabel("Rojo");
    label1.setBounds(10,30,300,30);
    add(label1);
    label2 = new JLabel("Amarillo");
    label2.setBounds(10,225,300,30);
    add(label2);
    label3 = new JLabel("Azul");
    label3.setBounds(10,150,300,30);
    add(label3);
  }
  public static void main(String[] ar){
    Ventanacolores vent = new Ventanacolores();
    vent.setBounds(0,0,1366,768);
    vent.setResizable(false);
    vent.setVisible(true);
  }
}
