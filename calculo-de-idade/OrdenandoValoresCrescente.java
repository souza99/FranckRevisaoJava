import java.util.Arrays;
import java.util.List;

import javax.swing.JOptionPane;

public class OrdenandoValoresCrescente{

    public static void main(String[] args){

           
    String insertValues = JOptionPane.showInputDialog("Insira 3 valores desejados, separados por ");
    var finalList = order(insertValues);
    System.out.println(finalList); 

    }

    public static int[] order(String valores){
        var valorList = valores.split(",");
        if(valorList.length>3){
        System.out.println("Digite apenas 3 valores");
        }
        if(valorList.length<2){
            System.out.println("Valores insuficientes para a ordenação");
        }
        else{
            int[] value = Arrays.stream(valorList).mapToInt(Integer::parseInt).toArray(); 
            int temp = 0;
            for(int x=0; x<value.length; x++){
                for(int w=0; w<value.length; w++){
                    if(value[x]<value[w]){
                        temp = value[x];
                        value[x] = value[w];
                        value[w] = temp;
                    }
                }
            }
            return value;
        }
        return null;
    }


}