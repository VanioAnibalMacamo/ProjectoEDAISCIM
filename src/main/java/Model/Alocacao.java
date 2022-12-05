package Model;

import java.time.LocalDateTime;

/**
 * @author Macamo, Vanio Anibal
 * @Date 12/2/2022
 */
public class Alocacao {

    private int id;
    private Cliente cliente;
    private LocalDateTime dataRequisicao;
    private LocalDateTime dataDevolucao;
    private double preco;

    public Alocacao() {
    }

    public Alocacao(int id, Cliente cliente, LocalDateTime dataRequisicao, LocalDateTime dataDevolucao, double preco) {
        this.id = id;
        this.cliente = cliente;
        this.dataRequisicao = dataRequisicao;
        this.dataDevolucao = dataDevolucao;
        this.preco = preco;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public LocalDateTime getDataRequisicao() {
        return dataRequisicao;
    }

    public void setDataRequisicao(LocalDateTime dataRequisicao) {
        this.dataRequisicao = dataRequisicao;
    }

    public LocalDateTime getDataDevolucao() {
        return dataDevolucao;
    }

    public void setDataDevolucao(LocalDateTime dataDevolucao) {
        this.dataDevolucao = dataDevolucao;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
}
