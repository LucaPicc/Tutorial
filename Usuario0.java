import javax.swing.*;
import java.awt.event.*;
public class Usuario0 extends JFrame implements ActionListener{
  private JTextField text1,text2;
  private JLabel lu,ls;
  private JButton bot;
  public Usuario0(){
    setLayout(null);
    lu = new JLabel("Usuario");
    lu.setBounds(10,10,100,30);
    add(lu);
    text1 = new JTextField();
    text1.setBounds(120,10,100,30);
    add(text1);
    ls = new JLabel("Contraseña");
    ls.setBounds(10,40,100,30);
    add(ls);
    text2 = new JTextField();
    text2.setBounds(120,40,100,30);
    add(text2);
    bot = new JButton("Confirmar");
    bot.setBounds(200,100,150,20);
    add(bot);
    bot.addActionListener(this);
  }
  public void actionPerformed(ActionEvent e){
    if(e.getSource()==bot){
      if(text1.getText().equals("juan")==true && text2.getText().equals("abc123")==true){
        setTitle("Correcto");
      }
      else{
        setTitle("Incorrecto");
      }
    }
  }
  public static void main(String[] ar){
    Usuario0 usr = new Usuario0();
    usr.setBounds(0,0,500,300);
    usr.setVisible(true);
  }
}
