public class MoradorEncapsulado {
    private static int contador = 1;
    private int codigoSequencial;
    private String nome, cpf, celular, dataNascimento, codigoAcesso;
    private char sexo;
    private int bloco, apto;

    public MoradorEncapsulado() {
        this.codigoSequencial = contador++;
    }

    public int getCodigoSequencial() { return codigoSequencial; }
    public String getNome() { return nome; }
    public void setNome(String nome) { this.nome = nome; }
    public String getCPF() { return cpf; }
    public void setCPF(String cpf) { this.cpf = cpf; }
    public String getCelular() { return celular; }
    public void set(String celular ) { this.celular = celular ; }
    public String getDataNasciment() { return dataNascimento ; }
    public void set(String dataNascimento) { this.dataNascimento = dataNascimento ; }
    public String getCodigoAcesso() { return codigoAcesso; }
    public void set(String codigoAcesso ) { this.codigoAcesso = codigoAcesso; }
    public char getSexo() { return sexo; }
    public int bloco() { return bloco; }
    public int apto() { return apto; }

    
}
