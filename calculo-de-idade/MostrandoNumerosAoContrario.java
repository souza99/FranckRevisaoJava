import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

public class MostrandoNumerosAoContrario{
    public static void main(String args[]){
        
    String insertValues = JOptionPane.showInputDialog("Insira os valores desejados, separados por virgula");
    var finalList = invert(insertValues);
    System.out.println(finalList);
    }

    public static String invert(String value){
       var arrayValue = value.split(",");
       String invertedList = "";
        for(int x=arrayValue.length-1;x>0;x--){
            if(invertedList.length() == 0){
                invertedList +=arrayValue[x];
            }
            else{
                invertedList +="," + arrayValue[x];
            }
        }
        return invertedList;
    }
}