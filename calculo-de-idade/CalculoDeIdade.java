import java.security.MessageDigest;

import javax.swing.JOptionPane;

public class CalculoDeIdade{
    public static void main(String[] args){

       int idade = Integer.parseInt(JOptionPane.showInputDialog("Digite sua idade: "));

       try{
           if( idade>0 && idade <= 12){
               System.out.println("Você é uma cirança!");
           }
           if(idade>=13 && idade<=17){
               System.out.println("Você é adolecente!");
           }
           if(idade>=18 && idade<=59){
               System.out.println("Você é adulto!");
           }
           if(idade>=60 && idade<=110){
               System.out.println("Você é idoso!");
           }
           else{
               System.out.println("Idade inválidade, insira novamente a sua idade!");
           }
       }catch(Exception e){
           System.out.println("Insira uma idade válida, dessa forma: 23");
       }




    }
}