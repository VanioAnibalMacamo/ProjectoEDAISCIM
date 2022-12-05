package Model;

/**
 * @author Macamo, Vanio Anibal
 * @Date 12/2/2022
 */
public class Marca {
    private int id;
    private String designacao;

    public Marca() {

    }

    public Marca(int id, String designacao) {
        this.id = id;
        this.designacao = designacao;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getDesignacao() {
        return designacao;
    }

    public void setDesignacao(String designacao) {
        this.designacao = designacao;
    }
}
