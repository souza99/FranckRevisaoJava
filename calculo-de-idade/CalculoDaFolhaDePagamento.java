import javax.swing.JOptionPane;

public class CalculoDaFolhaDePagamento{
    
    public static void main(String[] args){
        Inpostos calculoDeImposto = new Inpostos();
        calculoDeImposto.setHour(Integer.parseInt(JOptionPane.showInputDialog("Digite o valor total de horas trabalhadas do mes:")));
        calculoDeImposto.setValueHour(Double.parseDouble(JOptionPane.showInputDialog("Digite o valor da sua hora de trabalho:")));
        var wade = calculoDeImposto.wadeCalculat(calculoDeImposto.getValueHour(), calculoDeImposto.getHour());
        var ir = calculoDeImposto.calculateIr(wade);
        var inss = calculoDeImposto.calculateInss(wade);
        var fgts = calculoDeImposto.calculateFgts(wade);
        var freeWade = wade - (ir + inss + fgts);

        System.out.print("Seu salário liquido é de:" + freeWade);
    
    }



}