package Model;

/**
 * @author Macamo, Vanio Anibal
 * @Date 12/2/2022
 */
public class Cliente {
    private int id;
    private String nome, bi, morada, genero;

    public Cliente() {
    }

    public Cliente(int id, String nome, String bi, String morada, String genero) {
        this.id = id;
        this.nome = nome;
        this.bi = bi;
        this.morada = morada;
        this.genero = genero;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getBi() {
        return bi;
    }

    public void setBi(String bi) {
        this.bi = bi;
    }

    public String getMorada() {
        return morada;
    }

    public void setMorada(String morada) {
        this.morada = morada;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }
}
