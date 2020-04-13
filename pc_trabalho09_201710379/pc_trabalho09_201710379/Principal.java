import java.lang.Thread;
import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import controller.Controller;
import model.Carro;

/* ***************************************************************
* Autor: Thiago Viana
* Matricula: 201710379
* Inicio: 06/10/2018
* Ultima alteracao: 29/10/2018 
* Nome: Principal
* Funcao: Startar a GUI que mostrara a interface
*************************************************************** */


public class Principal extends Application{
 
  /* ***************************************************************
  * Metodo: start
  * Funcao: Metodo que starta o programa e define o tamanho da tela
  * Parametros: Primeiro Stage
  * Retorno: Nao possui retorno
  *************************************************************** */ 
  @Override
  public void start(Stage primaryStage) throws Exception{
    Pane root = FXMLLoader.load(getClass().getResource("/view/tela.fxml"));
    Scene scene = new Scene(root,723,543);
    primaryStage.setScene(scene);

    primaryStage.show();    

    //Pai p = new Pai();
    //p.start();
  }
  public static void main (String[] args){
    launch(args);
    
  }
}
