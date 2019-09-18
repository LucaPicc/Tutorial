import java.util.Scanner;
public class Email {
  private Scanner teclado;
  private String mail;
  public Email(){
    teclado=new Scanner(System.in);
    System.out.print("Ingrese una dirección de correo: ");
    mail=teclado.nextLine();
  }
  public void verificador(){
    boolean existe=false;
    for(int i=0;i<mail.length();i++){
      if(mail.charAt(i)=='@'){
        existe=true;
      }
    }
    if(existe==true){
      System.out.print(mail+" contiene el @");
    }
    else{
      System.out.print(mail+" no contiene el @");
    }
  }
  public static void main(String[] ar){
    Email direccion = new Email();
    direccion.verificador();
  }
}
