public class MedidasParticipante {
    private double kg;
    private double heigth;
    private String sexo;

    public double getKg(){
        return kg;
    }

    public double getHeight(){
        return heigth;
    }

    public void setKg(double kg){
        this.kg = kg;
    }

    public void setHeight(double heigth){
        this.heigth = heigth;
    }
    
    public String getSexo(){
        return this.sexo;
    }
    public void setSexo(String sexo){
        this.sexo = sexo;
    }

    public String calculateImc(double kg, double height, String sexo){

        double calculateImc = kg/(height*height);
        String returnMessage;

        try{

        if(sexo.equals("M")){
            if(calculateImc<19.1){
                returnMessage = "Abaixo do peso";
                return returnMessage;
            }
            if(calculateImc>=19.1 && calculateImc<25.8){
                returnMessage = "No peso normal";
                return returnMessage;
            }
            if(calculateImc>=25.8 && calculateImc<27.3){
                returnMessage = "Marginalmente acima do peso";
                return returnMessage;
            }
            if(calculateImc>=27.3 && calculateImc<32.3){
                returnMessage = "Acima do peso ideal";
                return returnMessage;
            }
            else{
                returnMessage = "Obeso";
                return returnMessage;
            }
        }
        else if(sexo.equals("S")){
            if(calculateImc<20.7){
                returnMessage = "Abaixo do peso";
                return returnMessage;
            }
            if(calculateImc>=20.7 && calculateImc<26.4){
                returnMessage = "No peso normal";
                return returnMessage;
            }
            if(calculateImc>=26.4 && calculateImc<27.8){
                returnMessage = "Marginalmente acima do peso";
                return returnMessage;
            }
            if(calculateImc>=27.8 && calculateImc<31.1){
                returnMessage = "Acima do peso ideal";
                return returnMessage;
            }
            else{
                returnMessage = "Obeso";
                return returnMessage;
            }
        }
        else{
            returnMessage = "Insira os dados corretamente para podermos calcular";
            return returnMessage;
        }

    }catch(Exception e){
        returnMessage = "Insira os dados de forma correta";
        return returnMessage;
    }

    }

}
