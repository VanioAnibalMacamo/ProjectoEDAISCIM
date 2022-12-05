package Controller;

import DAO.MarcaDAO;
import Model.Marca;
import org.zkoss.zk.ui.Component;
import org.zkoss.zk.ui.select.SelectorComposer;
import org.zkoss.zk.ui.select.annotation.Listen;
import org.zkoss.zk.ui.select.annotation.Wire;
import org.zkoss.zk.ui.select.annotation.WireVariable;
import org.zkoss.zk.ui.util.Notification;
import org.zkoss.zul.Button;
import org.zkoss.zul.Textbox;

import javax.xml.soap.Text;

/**
 * @author Macamo, Vanio Anibal
 * @Date 12/2/2022
 */
public class MarcaController  extends SelectorComposer<Component> {

    @Wire
    Textbox txtMarca;
    @Wire
    Button btnCadastrar;

    @WireVariable
    MarcaDAO marcaDAO = new MarcaDAO();
    @Listen("onCreate = #criarMarcaForm")
    public void onCreate(){
        Notification.show("Yes");
    }
    @Listen("onClick = #btnCadastrar")
    public  void cadastrar(){
        Marca marca = new Marca();
        marca.setId(10);
        marca.setDesignacao(txtMarca.getText());
        boolean verificar = marcaDAO.guardar(marca);
        if(verificar == true){
            Notification.show("Marca Inserida com Sucesso!");
        }else{
            Notification.show("Falha na Insercao!");
        }

    }
}
