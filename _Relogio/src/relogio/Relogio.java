package relogio;

public class Relogio {
    private String formatoRelogio;
    private String amPm;
    private Contador contadorHoras;
    private Contador contadorMinutos = new Contador(60);
    public Relogio(String formato){
        this.formatoRelogio = formato;
        if("12Horas".equals(formato)){
            this.contadorHoras = new Contador(12);
            this.amPm = "a.m.";
        }
        else{
            this.contadorHoras = new Contador(24);
        }
    }
    public void setFormato(String formato){
        this.formatoRelogio = formato;
    }
    public String getFormatoRelogio(){
        return this.formatoRelogio;
    }
    private void setAmPm(String amPm){
        this.amPm = amPm;
    }
    public String getAmPm(){
        return this.amPm;
    }
    public int getHora(){
        return this.contadorHoras.getValorHorasAtual();
    }    
    public int getMinutos(){
        return this.contadorMinutos.getValorHorasAtual();
    }   

    public void ticTac(){
        this.contadorMinutos.incrementar();
        if(this.contadorMinutos.getValorHorasAtual() == 0){
            atualizarHoras();
        }
    }
    public void atualizarHoras(){
        if("12Horas".equals((this.formatoRelogio))){
            this.contadorHoras.incrementar();
            if(contadorHoras.getValorHorasAtual() == 0){
                if("a.m.".equals(amPm)){
                    setAmPm("p.m.");
                }
                else{
                    setAmPm("a.m.");
                }
            }
        }
        else{
            this.contadorHoras.incrementar();
        }
    }
    
}









