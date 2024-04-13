package a3;

public class Operacao {
    private int NroFatorial   = 0;
    private int NroMinuendo   = 0;
    private int NroSubtraendo = 0;
    private int NroGenerico1  = 0;
    private int NroGenerico2  = 0;

    public int soma(int numero1, int numero2) {
        return numero1 + numero2;
    }

    public Operacao() {
        this.NroMinuendo   = 0;
        this.NroSubtraendo = 0;
        this.NroGenerico1  = 0;
        this.NroGenerico2  = 0;
    }
    public void setMinuendo(int Numero) {
        this.NroMinuendo = Numero;
    }
    public void setSubtraendo(int Numero) {
        this.NroSubtraendo = Numero;
    }
    public int subtração() {
        return NroMinuendo - NroSubtraendo;
    }
    public void setFatorial(int Numero) {
        this.NroFatorial = Numero;
    }
    private int FatorialRecursivo(int Numero) {
        if (Numero <= 1){
            return 1;
        } else {
            return Numero * FatorialRecursivo(Numero-1);
        } 
    }
    public int getFatorial() {
        return FatorialRecursivo(NroFatorial);
    }
    public int multiplicação() {
        return this.NroGenerico1 * this.NroGenerico2;
    }
    public void setNroGenerico1(int Numero) {
        this.NroGenerico1 = Numero;
    }
    public void setNroGenerico2(int Numero) {
        this.NroGenerico2 = Numero;
    }
    public int divisão() {
        return this.NroGenerico1 / this.NroGenerico2;
    }
//SOBRECARGA
    public int soma(int numero1, int numero2, int numero3) {
        return numero1 + numero2 + numero3;
    }
    public int soma(String numero1, String numero2) {
        return Integer.parseInt(numero1) + Integer.parseInt(numero2);
    }
    static public String MenssagemEstatica() {
        return "Sou um método estático. Diferente do dinâmico, não preciso ser instanciado! Bem vindo aperte ENTER para continuar";
    }
}
