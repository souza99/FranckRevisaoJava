public class Inpostos {
    public double valueHour;
    public int hour;

    public int getHour() {
        return hour;
    }
    public double getValueHour() {
        return valueHour;
    }
    public void setHour(int hour) {
        this.hour = hour;
    }
    public void setValueHour(double valueHour) {
        this.valueHour = valueHour;
    }

    public Double getFgts(double value){

        return value;
    }

    public Double wadeCalculat(Double valueHour, int hour){
        double wade = valueHour*hour;
        return wade;
    }

    public Double calculateIr(Double wade){
        
        double calculatedDiscount = 0.0;
        if(wade<=900){
           return wade;
        }
        if(wade>900 && wade<=1500){
            calculatedDiscount = wade * (5/100);
            return calculatedDiscount;
        }
        if(wade>1500 && wade<=2500){
            calculatedDiscount = wade * (10/100);
            return calculatedDiscount;
        }
        else{
            calculatedDiscount = wade * (20/100);
            return calculatedDiscount;
        }
    }

    public Double calculateInss(Double wade){
        double discountInss;
        double inss = 0.1;

        discountInss = wade * inss;
        return discountInss;
    }

    public Double calculateFgts(Double wade){
        double discountFgts;
        double fgts = 0.11;

        discountFgts = wade * fgts;
        return discountFgts;
    }

    
}
