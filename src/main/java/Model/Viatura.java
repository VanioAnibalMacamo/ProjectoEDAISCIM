package Model;


import java.time.LocalDateTime;

/**
 * @author Macamo, Vanio Anibal
 * @Date 12/2/2022
 */


public class Viatura {
    private  int id;
    private Marca marca;
    private String matricula;
    private int num_Acentos;
    private LocalDateTime anoLancamento;
    private boolean status;
    private Alocacao alocacao;

    public Viatura() {
    }

    public Viatura(int id, Marca marca, String matricula, int num_Acentos, LocalDateTime anoLancamento, boolean status, Alocacao alocacao) {
        this.id = id;
        this.marca = marca;
        this.matricula = matricula;
        this.num_Acentos = num_Acentos;
        this.anoLancamento = anoLancamento;
        this.status = status;
        this.alocacao = alocacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public int getNum_Acentos() {
        return num_Acentos;
    }

    public void setNum_Acentos(int num_Acentos) {
        this.num_Acentos = num_Acentos;
    }

    public LocalDateTime getAnoLancamento() {
        return anoLancamento;
    }

    public void setAnoLancamento(LocalDateTime anoLancamento) {
        this.anoLancamento = anoLancamento;
    }

    public boolean isStatus() {
        return status;
    }

    public void setStatus(boolean status) {
        this.status = status;
    }

    public Alocacao getAlocacao() {
        return alocacao;
    }

    public void setAlocacao(Alocacao alocacao) {
        this.alocacao = alocacao;
    }
}
