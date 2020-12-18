package relogio;

public class Contador {

    
    private int max;
    private int valorHorasAtual;
    public Contador(int max){
        this.max = max;
    }
    public void incrementar(){
        this.valorHorasAtual++;
        if(this.valorHorasAtual == this.max){
            this.valorHorasAtual = 0;
        }
    }

    public int getMax() {
        return max;
    }
    private void setMax(int max) {
        this.max = max;
    }
    public int getValorHorasAtual() {
        return valorHorasAtual;
    }
    private void setValorHorasAtual(int valorHorasAtual) {
        this.valorHorasAtual = valorHorasAtual;
    }  
}




