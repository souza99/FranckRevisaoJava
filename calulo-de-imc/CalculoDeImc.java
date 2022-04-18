import javax.swing.JOptionPane;

public class CalculoDeImc{

    public static void main(String[] args){
        MedidasParticipante medidas = new MedidasParticipante();
        medidas.setKg(Double.parseDouble(JOptionPane.showInputDialog("Insira seu peso em Kg: ")));
        medidas.setHeight(Double.parseDouble(JOptionPane.showInputDialog("Insira sua altura em Metros: ")));
        medidas.setSexo(JOptionPane.showInputDialog("Insira H para homes ou M para mulher").toUpperCase());
        String valuePrint = medidas.calculateImc(medidas.getKg(), medidas.getHeight(), medidas.getSexo());

        System.out.println(valuePrint);
    }

}