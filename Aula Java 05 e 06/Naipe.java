public enum Naipe {

    COPAS("Vermelho"),
    ESPADA("Preto"),
    OURO("Vermelho"),
    PAUS("Preto");

    private String cor;

    Naipe(String cor){
        this.cor = cor;
    }

    public String getCor(){
        return this.cor;
    }
    
}