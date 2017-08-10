
package controller;


public class controllerPorcentaje {
    
    private double valorInicial;
    private double interes;
    private int cuotas;
    private String textFieldInputResultado;

    public void setInteres(double interes) {
        this.interes = interes;
    }

    public void setCuotas(int cuotas) {
        this.cuotas = cuotas;
    }
    
    public void setValorInicial(double valorInicial) {
        this.valorInicial = valorInicial;
    }
    
    public void setTextFieldInputResultado(String input) {
        this.textFieldInputResultado = input;
    }

    public double calculo() {
        double operacion = 0;
        for(int i = 0; i < this.cuotas; i++){
            operacion = this.valorInicial * (this.interes);
            this.valorInicial += operacion;
        }
        return this.valorInicial;
    }
    
    public String resultado() {
        textFieldInputResultado += "" + calculo();
        return textFieldInputResultado;
    }
    
    public static void main(String[] args) {
        controllerPorcentaje Control = new controllerPorcentaje();
        
        //System.out.println("valor inicial:" + );
    
    }
    
}
