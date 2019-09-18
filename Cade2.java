import java.util.Scanner;
public class Cade2{
  private Scanner teclado;
  private String cadenita;
  public void carga(){
    teclado = new Scanner(System.in);
    System.out.print("Ingrese la cadena:");
    cadenita = teclado.nextLine();
  }
  public void media(){
    String cadenita2 = cadenita.substring(0, (cadenita.length())/2);
    System.out.println("la mitad de la cadena es:"+cadenita2);
  }
  public void ultimo(){
    char cadenita3 = cadenita.charAt(cadenita.length()-1);
    System.out.println("La ultima letra de la cadena es: "+cadenita3);
  }
  public void inversor(){
    System.out.print("Al revez: ");
    for(int i=cadenita.length()-1;i>=0;i--){
      System.out.print(cadenita.charAt(i)+"");
    }
    System.out.println();
  }
  public void guiones(){
    System.out.print("con guiones: ");
    for(int i=0;i<cadenita.length();i++){
      System.out.print(cadenita.charAt(i)+"-");
    }
    System.out.println();
  }


  public static void main(String[] ar){
    Cade2 lala = new Cade2();
    lala.carga();
    lala.media();
    lala.ultimo();
    lala.inversor();
    lala.guiones();
  }

}
