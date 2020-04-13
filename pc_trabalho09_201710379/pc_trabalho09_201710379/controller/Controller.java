package controller;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.stage.Stage;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.scene.image.ImageView;
import javafx.scene.image.Image;
import javafx.scene.control.Slider;
import javafx.application.Platform;
import model.Carro;
import java.util.concurrent.Semaphore;
import javafx.scene.control.Button;
/* ***************************************************************
  * Metodo: Controller
  * Funcao: Classe principal que implementa a GUI
  * Parametros: Nao possui retorno
  * Retorno: Nao possui retorno
  *************************************************************** */
public class Controller implements Initializable{
  @FXML
  public ImageView carroAmareloID, carroAzulID, carroVerdeID, carroPretoID, carroVermelhoID; // Imagem dos carros

  @FXML
  public Slider velCarroPretoID, velCarroAzulID, velCarroAmareloID, velCarroVermelhoID, velCarroVerdeID;// ID dos sliders de cada carro
  
  Carro carroPreto, carroAzul, carroAmarelo, carroVermelho,carroVerde; // Thrread correspondente ao carro
  
  @FXML
  Button startID; // Botao que inicia a animacao
  
  public Semaphore s1,s2,s3,s4,s5,s6,s7,s8,s9,s10,s11,s12,s13,s14,s15,s16,s17,s18,s19,s20,s21,s22,s23,s24; // Semafaros correspondentes as regioes criticas

  public Controller(){
    //instanciacao das ImageView
    carroVermelhoID = new ImageView();
    carroAmareloID = new ImageView();
    carroPretoID = new ImageView();
    carroVerdeID = new ImageView();
    carroAmareloID = new ImageView();
    //instanciacao do ID de velocidade
    velCarroPretoID= new Slider();
    //instanciacao das threads
    carroPreto = new Carro();
    carroAzul = new Carro();
    carroAmarelo = new Carro();
    carroVermelho = new Carro();
    carroVerde = new Carro();
    // Instanciacao dos semafaros
    s1 = new Semaphore(1);
    s2 = new Semaphore(1);
 		s3 = new Semaphore(1);
 		s4 = new Semaphore(1);
 		s5 = new Semaphore(1);
 		s6 = new Semaphore(1);
 		s7 = new Semaphore(1);
 		s8 = new Semaphore(1);
 		s9 = new Semaphore(0);
 		s10 = new Semaphore(1);
 		s11 = new Semaphore(0);
 		s12 = new Semaphore(1);
 		s13 = new Semaphore(1);
 		s14 = new Semaphore(1);
 		s15 = new Semaphore(1);
 		s16 = new Semaphore(1);
  	s17 = new Semaphore(1);
  	s18 = new Semaphore(1);
  	s19 = new Semaphore(0);
  	s20 = new Semaphore(1);
  	s21 = new Semaphore(1);
  	s22 = new Semaphore(1);
  	s23 = new Semaphore(1);
  	s24 = new Semaphore(1);
  }// fim metodo


  public void initialize(URL url, ResourceBundle rb){
    
  }//fim metodo
  //Reta 1 carro preto
   /* ***************************************************************
  * Metodo: percursoXDireita
  * Funcao: Faz o carro andar na posicao X a direta
  * Parametros: Primeiro Stage
  * Retorno: Nao possui retorno
  *************************************************************** */ 
  // Metodos que fazem os carrinhos andarem de acordo o seu trajeto.Nome do metodo auto-explicativo
  public void percursoXDireita(ImageView imagem, Carro carro){
  	carro.coordenadaX = imagem.getLayoutX();
  	for(int i = 0; i < 25; i++ ){
  		carro.coordenadaX++;
	    
	    // System.out.println("Coordenada X = " + imagem.getLayoutX());
			try{
	    	carro.sleep(carro.velocidade);
	    }catch(InterruptedException e){}  
	    Platform.runLater(()->{
	    	imagem.setLayoutX(carro.coordenadaX);
	    });      
	  }//Fim for			
 	}	
 	public void percursoXDireita2(ImageView imagem,Carro carro){
 		carro.coordenadaX = imagem.getLayoutX();
  	for(int i = 0; i < 19; i++ ){
  		carro.coordenadaX++;
	    
	    // System.out.println("Coordenada X = " + imagem.getLayoutX());
			try{
	    	carro.sleep(carro.velocidade);
	    }catch(InterruptedException e){}  
	    Platform.runLater(()->{
	    	imagem.setLayoutX(carro.coordenadaX);
	    });      
	  }//Fim for			
 	}

 	public void percursoXEsquerda(ImageView imagem, Carro carro){
 		carro.coordenadaX = imagem.getLayoutX();
 		for(int i = 0; i < 25; i++ ){
  		carro.coordenadaX--;
	    
	    // System.out.println("Coordenada X = " + imagem.getLayoutX());
			try{
	    	carro.sleep(carro.velocidade);
	    }catch(InterruptedException e){} 
	    Platform.runLater(()->{
	    	imagem.setLayoutX(carro.coordenadaX);
	    });       
	  }//Fim for	
 	}

 	public void percursoYBaixo(ImageView imagem, Carro carro){
 		carro.coordenadaY = imagem.getLayoutY();
 		for(int i = 0; i < 25; i++ ){
  		carro.coordenadaY++;
	    
	    // System.out.println("Coordenada X = " + imagem.getLayoutX());
			try{
	    	carro.sleep(carro.velocidade);
	    }catch(InterruptedException e){}
	    Platform.runLater(()->{
	    	imagem.setLayoutY(carro.coordenadaY);
	    });        
	  }//Fim for	
 	}
 	public void percursoYBaixo2(ImageView imagem, Carro carro){
 		carro.coordenadaY = imagem.getLayoutY();
 		for(int i = 0; i < 15; i++ ){
  		carro.coordenadaY++;
	    
	    // System.out.println("Coordenada X = " + imagem.getLayoutX());
			try{
	    	carro.sleep(carro.velocidade);
	    }catch(InterruptedException e){}
	    Platform.runLater(()->{
	    	imagem.setLayoutY(carro.coordenadaY);
	    });        
	  }//Fim for	
 	}

 	public void percursoYCima(ImageView imagem, Carro carro){
 		carro.coordenadaY = imagem.getLayoutY();
 		for(int i = 0; i < 25; i++ ){
  		carro.coordenadaY--;
	    
	    // System.out.println("Coordenada X = " + imagem.getLayoutX());
			try{
	    	carro.sleep(carro.velocidade);
	    }catch(InterruptedException e){}
	    Platform.runLater(()->{
	    	imagem.setLayoutY(carro.coordenadaY);
	    });        
	  }//Fim for	
 	}

 	public void curvaXDireitaCima(ImageView imagem, Carro carro, int distancia){
 		carro.coordenadaX = imagem.getLayoutX();
    carro.coordenadaY = imagem.getLayoutY();
    carro.rotacao = imagem.getRotate();
          //while(imagem.getLayoutX() > 260 && imagem.getLayoutY() > 211){
    for(int i = 0; i <=distancia; i++){
    	carro.coordenadaX --;
	   	carro.coordenadaY --;
	    carro.rotacao+=2;  
			try{
	     	carro.sleep(carro.velocidade);
	    }catch(InterruptedException e){} 
	    Platform.runLater(()->{
	     	imagem.setLayoutX(carro.coordenadaX);
	     	imagem.setLayoutY(carro.coordenadaY);
	      imagem.setRotate(carro.rotacao);
	    });

    }//Fim for
 	}

 	public void curvaXDireitaBaixo(ImageView imagem, Carro carro, int distancia){
 		carro.coordenadaX = imagem.getLayoutX();
    carro.coordenadaY = imagem.getLayoutY();
    carro.rotacao = imagem.getRotate();
 			for(int i=0; i<=distancia; i++){ 
		    carro.coordenadaX ++;
		    carro.coordenadaY ++;
		    carro.rotacao+=2;  
		    
		    //System.out.println(i);
				try{
		      carro.sleep(carro.velocidade);
		    }catch(InterruptedException e){} 
		    Platform.runLater(()->{
		      imagem.setLayoutX(carro.coordenadaX);
		      imagem.setLayoutY(carro.coordenadaY);
		      imagem.setRotate(carro.rotacao);
		    	System.out.println(imagem.getRotate());
		    });
			}//fim FOR
 	}

 	public void curvaXEsquerdaBaixo(ImageView imagem, Carro carro, int distancia){
 		carro.coordenadaX = imagem.getLayoutX();
    carro.coordenadaY = imagem.getLayoutY();
    carro.rotacao = imagem.getRotate();
 			for(int i=0; i<=distancia; i++){ 
		    carro.coordenadaX --;
		    carro.coordenadaY ++;
		    carro.rotacao-=2;
				try{
		      carro.sleep(carro.velocidade);
		    }catch(InterruptedException e){} 
		    Platform.runLater(()->{
		      imagem.setLayoutX(carro.coordenadaX);
		      imagem.setLayoutY(carro.coordenadaY);
		      imagem.setRotate(carro.rotacao);
		    });
 			}
 	}

 	public void curvaXEsquerdaCima(ImageView imagem, Carro carro, int distancia){
 		carro.coordenadaX = imagem.getLayoutX();
    carro.coordenadaY = imagem.getLayoutY();
    carro.rotacao = imagem.getRotate();
 			for(int i=0; i<=distancia; i++){ 
		    carro.coordenadaX ++;
		    carro.coordenadaY --;
		    carro.rotacao-=2;
				try{
		      carro.sleep(carro.velocidade);
		    }catch(InterruptedException e){} 
		    Platform.runLater(()->{
		      imagem.setLayoutX(carro.coordenadaX);
		      imagem.setLayoutY(carro.coordenadaY);
		      imagem.setRotate(carro.rotacao);
		    });
 			}	
 	}

 	public void curvaYEsquerdaBaixo(ImageView imagem, Carro carro, int distancia){
 		carro.coordenadaX = imagem.getLayoutX();
    carro.coordenadaY = imagem.getLayoutY();
    carro.rotacao = imagem.getRotate();
		for(int i = 0; i <=distancia; i++){
        //while (imagem.getLayoutX() > 613 && imagem.getLayoutY() < 266){
	    carro.coordenadaX --;
	    carro.coordenadaY ++;
	    carro.rotacao+=2 ;  
			
			try{
	      carro.sleep(carro.velocidade);
	    }catch(InterruptedException e){}    
	    Platform.runLater(()->{
	      imagem.setLayoutX(carro.coordenadaX);
	      imagem.setLayoutY(carro.coordenadaY);
	      imagem.setRotate(carro.rotacao);
	    });
    }//fim for 	
 	}

 	public void curvaYDireitaCima(ImageView imagem, Carro carro,int distancia){
 		carro.coordenadaX = imagem.getLayoutX();
    carro.coordenadaY = imagem.getLayoutY();
    carro.rotacao = imagem.getRotate();
		for(int i = 0; i <=distancia; i++){
        //while (imagem.getLayoutX() > 613 && imagem.getLayoutY() < 266){
	    carro.coordenadaX ++;
	    carro.coordenadaY --;
	    carro.rotacao+=2 ;  
			
			try{
	      carro.sleep(carro.velocidade);
	    }catch(InterruptedException e){}    
	    Platform.runLater(()->{
	      imagem.setLayoutX(carro.coordenadaX);
	      imagem.setLayoutY(carro.coordenadaY);
	      imagem.setRotate(carro.rotacao);
	    });
    }//fim for 	
 	} 

 	public void curvaYDireitaBaixo(ImageView imagem, Carro carro,int distancia){
		carro.coordenadaX = imagem.getLayoutX();
    carro.coordenadaY = imagem.getLayoutY();
    carro.rotacao = imagem.getRotate();
		for(int i = 0; i <=distancia; i++){
        //while (imagem.getLayoutX() > 613 && imagem.getLayoutY() < 266){
	    carro.coordenadaX ++;
	    carro.coordenadaY ++;
	    carro.rotacao-=2 ;  
			
			try{
	      carro.sleep(carro.velocidade);
	    }catch(InterruptedException e){}    
	    Platform.runLater(()->{
	      imagem.setLayoutX(carro.coordenadaX);
	      imagem.setLayoutY(carro.coordenadaY);
	      imagem.setRotate(carro.rotacao);
	    });
    }//fim for 	
 	}
 	/* ***************************************************************
  * Metodo: stard
  * Funcao: Metodo que aciona o botao que quando clicado, starta as threads
  * Parametros: Nao possui parametros
  * Retorno: Nao possui retorno
  *************************************************************** */
 	@FXML
 	public void start(){
 		startID.setDisable(true); // Desativar o botao de start quando clicado
 		carroPreto.setTela(this);
    carroPreto.setId(0); // ID do carro
    carroPreto.start(); // Starta a thread

    carroAzul.setTela(this);
    carroAzul.setId(1);
   	carroAzul.start();

    carroAmarelo.setTela(this);
  	carroAmarelo.setId(2);
  	carroAmarelo.start();

  	carroVermelho.setTela(this);
  	carroVermelho.setId(3);
  	carroVermelho.setEspecial(-1);
  	carroVermelho.start();

  	carroVerde.setTela(this);
  	carroVerde.setId(4);
  	carroVerde.start();
 	}
 	/* ***************************************************************
  * Metodo: percurso
  * Funcao: Metodo que chama os percursos correspondentes de acordo o seu ID
  * Parametros: Carro c
  * Retorno: Nao possui retorno
  *************************************************************** */
  public void percurso(Carro c){
    switch(c.getid()){
      case 0: // caso 0, chama o percurso do carro preto
      	percursoCarroPreto();
      	try{
      		Thread.sleep(10);
      	}catch(InterruptedException e){}
      	carroPretoID.setLayoutX(327);
      	carroPretoID.setLayoutY(13);
      break;
      
      case 1:
        percursoCarroAzul(); 
        try{
      		Thread.sleep(10);
      	}catch(InterruptedException e){} 
      	carroAzulID.setLayoutX(534);
      	carroAzulID.setLayoutY(71);
      break;

     	case 2:  
      	percursoCarroAmarelo();
      	try{
      		Thread.sleep(10);
      	}catch(InterruptedException e){}
      	//Platform.runLater(()->{
	  			carroAmareloID.setLayoutX(662); // Seta os layouts para as posicoes inicias, para que possa ser reiniciado a animacao
	    		carroAmareloID.setLayoutY(71);
	    //carroAmareloID.setRotate(180);
	  		//});

      break;	
      //default: System.out.println("ERRO");  

      case 3:
      	percursoCarroVermelho();
      	try{
      		Thread.sleep(10);
      	}catch(InterruptedException e){}
      	carroVermelhoID.setLayoutX(75);
      	carroVermelhoID.setLayoutY(18);
     
      break;

      case 4:
      	percursoCarroVerde();
      	try{
      		Thread.sleep(10);
      	}catch(InterruptedException e){}
      	carroVerdeID.setLayoutX(587);
      	carroVerdeID.setLayoutY(190);
      	carroVerdeID.setRotate(-90);
      break;	
    }
  }
/*

*/
	/* ***************************************************************
  * Metodo: percursoCarroPreto
  * Funcao: percurso do carro preto Chama os percursos menores para formar o percurso total do carro preto
  * Parametros: Nao possui parametros
  * Retorno: Nao possui retorno
  *************************************************************** */
  // Os metodos subsequentes fazem o mesmo, alterando apenas qual o carro correpondente
	public void percursoCarroPreto(){
		try{
			s11.release();
			s11.acquire();
			s13.acquire();	
				percursoXDireita(carroPretoID, carroPreto);	
				
				percursoXDireita(carroPretoID, carroPreto);	
			s9.acquire();	
				percursoXDireita(carroPretoID, carroPreto);	
				percursoXDireita(carroPretoID, carroPreto);	
				percursoXDireita(carroPretoID, carroPreto);	
				percursoXDireita(carroPretoID, carroPreto);	
				percursoXDireita(carroPretoID, carroPreto);	
				percursoXDireita(carroPretoID, carroPreto);	
				percursoXDireita(carroPretoID, carroPreto);	
				percursoXDireita(carroPretoID, carroPreto);	
			s11.release();	
				percursoXDireita(carroPretoID, carroPreto);	
				percursoXDireita(carroPretoID, carroPreto);	
				//percursoXDireita(carroPretoID, carroPreto);	
				curvaXDireitaBaixo(carroPretoID, carroPreto, 45);
				
				percursoYBaixo(carroPretoID, carroPreto);
				percursoYBaixo(carroPretoID, carroPreto);
				percursoYBaixo(carroPretoID, carroPreto);
				percursoYBaixo(carroPretoID, carroPreto);
			
				percursoYBaixo(carroPretoID, carroPreto);
				
				percursoYBaixo(carroPretoID, carroPreto);
			s13.release();		
				percursoYBaixo(carroPretoID, carroPreto);
			s2.acquire();
				curvaYEsquerdaBaixo(carroPretoID, carroPreto,43);
			
			s9.release();	
				System.out.println(carroPretoID.getRotate());
				
				percursoXEsquerda(carroPretoID,carroPreto);
			s15.acquire();
			s12.acquire();	
				percursoXEsquerda(carroPretoID,carroPreto);
				percursoXEsquerda(carroPretoID,carroPreto);
				percursoXEsquerda(carroPretoID,carroPreto);
				
				percursoXEsquerda(carroPretoID,carroPreto);
				
				percursoXEsquerda(carroPretoID,carroPreto);
			s12.release();	
			
				percursoXEsquerda(carroPretoID,carroPreto);
			s10.acquire();	
				
				percursoXEsquerda(carroPretoID,carroPreto);
				percursoXEsquerda(carroPretoID,carroPreto);
				percursoXEsquerda(carroPretoID,carroPreto);
			s15.release();		
				percursoXEsquerda(carroPretoID,carroPreto);			
			s10.release();	
				percursoXEsquerda(carroPretoID,carroPreto);
			//s2.release();
			//s1.acquire();
			s11.acquire();	
				curvaXDireitaCima(carroPretoID, carroPreto,44);
			s14.acquire();	
				System.out.println(carroPretoID.getRotate());
				percursoYCima(carroPretoID,carroPreto);		
				
				percursoYCima(carroPretoID,carroPreto);
				percursoYCima(carroPretoID,carroPreto);
				
				percursoYCima(carroPretoID,carroPreto);
				percursoYCima(carroPretoID,carroPreto);
				
				percursoYCima(carroPretoID,carroPreto);
				percursoYCima(carroPretoID,carroPreto);
			
				curvaYDireitaCima(carroPretoID, carroPreto,44);
			s14.release();
			s2.release();
		}catch(InterruptedException e){}	
	}
	
	public void percursoCarroAmarelo(){
		try{
			System.out.println("Y inicial = " + carroAmareloID.getLayoutY());
			s19.release();
			s19.acquire();
			s9.release();
			s9.acquire();
				percursoYBaixo(carroAmareloID, carroAmarelo);
				percursoYBaixo(carroAmareloID, carroAmarelo);
				percursoYBaixo(carroAmareloID, carroAmarelo);
				percursoYBaixo(carroAmareloID, carroAmarelo);
				percursoYBaixo(carroAmareloID, carroAmarelo);
				percursoYBaixo(carroAmareloID, carroAmarelo);
			s5.acquire();
			s19.release();
				percursoYBaixo(carroAmareloID, carroAmarelo);	
				percursoYBaixo(carroAmareloID, carroAmarelo);
				
				percursoYBaixo(carroAmareloID, carroAmarelo);
					
				percursoYBaixo(carroAmareloID, carroAmarelo);
			s9.release();
			
				percursoYBaixo(carroAmareloID, carroAmarelo);
				percursoYBaixo(carroAmareloID, carroAmarelo);
				percursoYBaixo(carroAmareloID, carroAmarelo);
				curvaYEsquerdaBaixo(carroAmareloID, carroAmarelo,45);
				percursoXEsquerda(carroAmareloID, carroAmarelo);
			s8.acquire();		
				percursoXEsquerda(carroAmareloID, carroAmarelo);
				percursoXEsquerda(carroAmareloID, carroAmarelo);
				percursoXEsquerda(carroAmareloID, carroAmarelo);
				percursoXEsquerda(carroAmareloID, carroAmarelo);	
				percursoXEsquerda(carroAmareloID, carroAmarelo);
				percursoXEsquerda(carroAmareloID, carroAmarelo);			
			s20.acquire();	
				curvaXDireitaCima(carroAmareloID, carroAmarelo,43);
			s8.release();
			s5.release();
			
				percursoYCima(carroAmareloID, carroAmarelo);
				percursoYCima(carroAmareloID, carroAmarelo);
			s10.acquire();
			s6.acquire();
				percursoYCima(carroAmareloID, carroAmarelo);
				
				percursoYCima(carroAmareloID, carroAmarelo);
				percursoYCima(carroAmareloID, carroAmarelo);
				percursoYCima(carroAmareloID, carroAmarelo);
				
				percursoYCima(carroAmareloID, carroAmarelo);
			s6.release();
			s10.release();
			s20.release();	
				percursoYCima(carroAmareloID, carroAmarelo);
				percursoYCima(carroAmareloID, carroAmarelo);
		
			s19.acquire();	
			percursoYCima(carroAmareloID, carroAmarelo);
			percursoYCima(carroAmareloID, carroAmarelo);
			percursoYCima(carroAmareloID, carroAmarelo);
			percursoYCima(carroAmareloID, carroAmarelo);
			//percursoYCima(carroAmareloID, carroAmarelo);
			//percursoYCima(carroAmareloID, carroAmarelo);
			
			s9.acquire();	
			s7.acquire();	
				curvaYDireitaCima(carroAmareloID, carroAmarelo,43);
				percursoXDireita(carroAmareloID, carroAmarelo);
				percursoXDireita(carroAmareloID, carroAmarelo);
				percursoXDireita(carroAmareloID, carroAmarelo);
				percursoXDireita(carroAmareloID, carroAmarelo);
				percursoXDireita(carroAmareloID, carroAmarelo);
			s7.release();
				percursoXDireita(carroAmareloID, carroAmarelo);
				percursoXDireita(carroAmareloID, carroAmarelo);
				curvaXDireitaBaixo(carroAmareloID, carroAmarelo, 45);	
			//s9.release();
		//s19.release();		
			System.out.println(carroAmareloID.getLayoutY());
		}catch(InterruptedException e){}	
	}

	public void percursoCarroAzul(){
		try{
			System.out.println("X inicial = " + carroAzulID.getLayoutX());
			System.out.println("Y inicial = " + carroAzulID.getLayoutY());
			percursoYBaixo(carroAzulID, carroAzul);
			percursoYBaixo(carroAzulID, carroAzul);
			s22.acquire();
				percursoYBaixo(carroAzulID, carroAzul);
			
				percursoYBaixo(carroAzulID, carroAzul);
				percursoYBaixo(carroAzulID, carroAzul);
				percursoYBaixo(carroAzulID, carroAzul);
			
			s12.acquire();
			s4.acquire();
				percursoYBaixo(carroAzulID, carroAzul);
				percursoYBaixo(carroAzulID, carroAzul);
				
				percursoYBaixo(carroAzulID, carroAzul);
				
				percursoYBaixo(carroAzulID, carroAzul);
			s4.release();
			s12.release();
			s22.release();
			percursoYBaixo(carroAzulID, carroAzul);
			percursoYBaixo(carroAzulID, carroAzul);
			percursoYBaixo(carroAzulID, carroAzul);
			s3.acquire();
			s8.acquire();	
				curvaYEsquerdaBaixo(carroAzulID, carroAzul,45);
				percursoXEsquerda(carroAzulID, carroAzul);
				percursoXEsquerda(carroAzulID, carroAzul);
				percursoXEsquerda(carroAzulID, carroAzul);
				percursoXEsquerda(carroAzulID, carroAzul);
				percursoXEsquerda(carroAzulID, carroAzul);	
			s8.release();	
				percursoXEsquerda(carroAzulID, carroAzul);
				percursoXEsquerda(carroAzulID, carroAzul);			
			s3.release();
			s23.acquire();
				curvaXDireitaCima(carroAzulID, carroAzul,43);
				percursoYCima(carroAzulID, carroAzul);
				percursoYCima(carroAzulID, carroAzul);
				percursoYCima(carroAzulID, carroAzul);
			s1.acquire();
			s11.acquire();		
				percursoYCima(carroAzulID, carroAzul);
			s23.release();	
				percursoYCima(carroAzulID, carroAzul);
			
				percursoYCima(carroAzulID, carroAzul);
				
				percursoYCima(carroAzulID, carroAzul);
			s24.acquire();	
				percursoYCima(carroAzulID, carroAzul);
				
				percursoYCima(carroAzulID, carroAzul);
				percursoYCima(carroAzulID, carroAzul);
				percursoYCima(carroAzulID, carroAzul);
				percursoYCima(carroAzulID, carroAzul);
				percursoYCima(carroAzulID, carroAzul);
			s24.release();			
			//percursoYCima(carroAzulID, carroAzul);
			//percursoYCima(carroAzulID, carroAzul);
			curvaYDireitaCima(carroAzulID, carroAzul,43);
			s1.release();
			s21.acquire();
			percursoXDireita(carroAzulID, carroAzul);
			
			s7.acquire();
				percursoXDireita(carroAzulID, carroAzul);
				percursoXDireita(carroAzulID, carroAzul);
				percursoXDireita(carroAzulID, carroAzul);
				percursoXDireita(carroAzulID, carroAzul);
				
				percursoXDireita(carroAzulID, carroAzul);
			
				percursoXDireita(carroAzulID, carroAzul);
				curvaXDireitaBaixo(carroAzulID, carroAzul, 45);
			s21.release();	
			s7.release();
			s11.release();
		}catch(InterruptedException e){}
	}

	public void percursoCarroVermelho(){
		try{
			System.out.println("X inicial Vermelho = " + carroVermelhoID.getLayoutX());
			System.out.println("Y inicial Vermelho = " + carroVermelhoID.getLayoutY());

			percursoXDireita(carroVermelhoID, carroVermelho);
			percursoXDireita(carroVermelhoID, carroVermelho);
			percursoXDireita(carroVermelhoID, carroVermelho);
			percursoXDireita(carroVermelhoID, carroVermelho);
			percursoXDireita(carroVermelhoID, carroVermelho);
			percursoXDireita(carroVermelhoID, carroVermelho);
			//percursoXDireita(carroVermelhoID, carroVermelho);

			s1.acquire();
			s2.acquire();
				curvaXDireitaBaixo(carroVermelhoID, carroVermelho,45);
				System.out.println("AQUIII" + carroVermelhoID.getLayoutX());
				System.out.println("AQUIII" + carroVermelhoID.getLayoutY());
			s18.acquire();		
				percursoYBaixo(carroVermelhoID, carroVermelho);
				percursoYBaixo(carroVermelhoID, carroVermelho);
				percursoYBaixo(carroVermelhoID, carroVermelho);
				percursoYBaixo(carroVermelhoID, carroVermelho);
				percursoYBaixo(carroVermelhoID, carroVermelho);
				percursoYBaixo(carroVermelhoID, carroVermelho);
				percursoYBaixo(carroVermelhoID, carroVermelho);
			s18.release();		
				curvaYDireitaBaixo(carroVermelhoID, carroVermelho,45);
						
			s1.release();	
			percursoXDireita(carroVermelhoID, carroVermelho);
			s6.acquire();
			s17.acquire();	
				percursoXDireita(carroVermelhoID, carroVermelho);
				
				percursoXDireita(carroVermelhoID, carroVermelho);
				percursoXDireita(carroVermelhoID, carroVermelho);
				percursoXDireita(carroVermelhoID, carroVermelho);
			s6.release();	
				percursoXDireita(carroVermelhoID, carroVermelho);
			s4.acquire();
				percursoXDireita(carroVermelhoID, carroVermelho);
				percursoXDireita(carroVermelhoID, carroVermelho);
				percursoXDireita(carroVermelhoID, carroVermelho);
				percursoXDireita(carroVermelhoID, carroVermelho);
			
				percursoXDireita(carroVermelhoID, carroVermelho);
			s17.release();
			s4.release();
				percursoXDireita(carroVermelhoID, carroVermelho);
			
			s5.acquire();			
				curvaXDireitaBaixo(carroVermelhoID, carroVermelho,45);
			s2.release();	
				percursoYBaixo(carroVermelhoID, carroVermelho);
				percursoYBaixo(carroVermelhoID, carroVermelho);
				percursoYBaixo(carroVermelhoID, carroVermelho);
				curvaYEsquerdaBaixo(carroVermelhoID, carroVermelho,43);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
			s3.acquire();
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
			s5.release();	
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
			s16.acquire();	
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
			s3.release();
				
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				percursoXEsquerda(carroVermelhoID, carroVermelho);
				curvaXDireitaCima(carroVermelhoID, carroVermelho,45);
		
				percursoYCima(carroVermelhoID, carroVermelho);
				percursoYCima(carroVermelhoID, carroVermelho);
				percursoYCima(carroVermelhoID, carroVermelho);
				percursoYCima(carroVermelhoID, carroVermelho);
			
				percursoYCima(carroVermelhoID, carroVermelho);
				percursoYCima(carroVermelhoID, carroVermelho);
			s16.release();	
			percursoYCima(carroVermelhoID, carroVermelho);
			percursoYCima(carroVermelhoID, carroVermelho);
			percursoYCima(carroVermelhoID, carroVermelho);
			percursoYCima(carroVermelhoID, carroVermelho);
			percursoYCima(carroVermelhoID, carroVermelho);
			percursoYCima(carroVermelhoID, carroVermelho);
			percursoYCima(carroVermelhoID, carroVermelho);
			percursoYCima(carroVermelhoID, carroVermelho);
			curvaYDireitaCima(carroVermelhoID, carroVermelho, 43);
		}catch(InterruptedException e){}
	}

	public void percursoCarroVerde(){
		try{
			s22.acquire();	
			curvaXEsquerdaBaixo(carroVerdeID, carroVerde, 43);
			s15.acquire();
			s17.acquire();
			
				curvaYEsquerdaBaixo(carroVerdeID, carroVerde, 43);
			s22.release();
				percursoXEsquerda(carroVerdeID, carroVerde);
			s20.acquire();	
				percursoXEsquerda(carroVerdeID, carroVerde);
				
				curvaXEsquerdaBaixo(carroVerdeID, carroVerde, 43);
			s17.release();
			s15.release();

				curvaYEsquerdaBaixo(carroVerdeID, carroVerde, 43);
				percursoXEsquerda(carroVerdeID, carroVerde);
			s20.release();
			s23.acquire();
				percursoXEsquerda(carroVerdeID, carroVerde);
				
				curvaXEsquerdaBaixo(carroVerdeID, carroVerde, 43);
			s16.acquire();
				curvaYEsquerdaBaixo(carroVerdeID, carroVerde, 43);
			s23.release();	
				percursoXEsquerda(carroVerdeID, carroVerde);
				
				percursoXEsquerda(carroVerdeID, carroVerde);
				percursoXEsquerda(carroVerdeID, carroVerde);
				percursoXEsquerda(carroVerdeID, carroVerde);
				percursoXEsquerda(carroVerdeID, carroVerde);
				percursoXEsquerda(carroVerdeID, carroVerde);
				//percursoXEsquerda(carroVerdeID, carroVerde);
				curvaXDireitaCima(carroVerdeID, carroVerde, 43);
				percursoYCima(carroVerdeID, carroVerde);
				percursoYCima(carroVerdeID, carroVerde);
				percursoYCima(carroVerdeID, carroVerde);
				percursoYCima(carroVerdeID, carroVerde);
				
				curvaYDireitaCima(carroVerdeID, carroVerde, 44);
			s16.release();
			percursoXDireita(carroVerdeID, carroVerde);	
			curvaXEsquerdaCima(carroVerdeID, carroVerde, 43);
			curvaYDireitaCima(carroVerdeID, carroVerde, 43);
			
			percursoXDireita(carroVerdeID, carroVerde); //
			s24.acquire();
			s18.acquire();
				percursoXDireita2(carroVerdeID, carroVerde);//
			
			s14.acquire();
				curvaXEsquerdaCima(carroVerdeID, carroVerde, 43);
				curvaYDireitaCima(carroVerdeID, carroVerde, 43);
			s24.release();
			s14.release();
			s18.release();
				percursoXDireita(carroVerdeID, carroVerde);
			s19.acquire();
				percursoXDireita2(carroVerdeID, carroVerde);
			s13.acquire();
			s21.acquire();		
				curvaXEsquerdaCima(carroVerdeID, carroVerde, 43);
			;
			
				curvaYDireitaCima(carroVerdeID, carroVerde, 43);
				percursoXDireita(carroVerdeID, carroVerde);
				percursoXDireita(carroVerdeID, carroVerde);
				percursoXDireita(carroVerdeID, carroVerde);
				percursoXDireita(carroVerdeID, carroVerde);
				percursoXDireita(carroVerdeID, carroVerde);
			s21.release();	
				percursoXDireita(carroVerdeID, carroVerde);
				percursoXDireita2(carroVerdeID, carroVerde);
				
				curvaXDireitaBaixo(carroVerdeID, carroVerde, 44);
				percursoYBaixo(carroVerdeID, carroVerde);
				percursoYBaixo(carroVerdeID, carroVerde);
				percursoYBaixo(carroVerdeID, carroVerde);
				percursoYBaixo2(carroVerdeID, carroVerde);
				curvaYEsquerdaBaixo(carroVerdeID, carroVerde, 43);
				s13.release();
				percursoXEsquerda(carroVerdeID, carroVerde);
			s19.release();
			//percursoXEsquerda(carroVerdeID, carroVerde);
		}catch(InterruptedException e){}
	}
	  /* ***************************************************************
  * Metodo: slidePreto
  * Funcao: Seta o valor que o usuario escolheu no slider
  * Parametros: Sem parametros
  * Retorno: Sem retorno
  *************************************************************** */ 
  @FXML
  public void sliderPreto(){
    carroPreto.setVelocidade((int)velCarroPretoID.getValue());

  } 
  @FXML
  public void sliderAmarelo(){
  	carroAmarelo.setVelocidade((int)velCarroAmareloID.getValue());
  }
  @FXML
  public void sliderAzul(){
    carroAzul.setVelocidade((int)velCarroAzulID.getValue());
  }
  @FXML
  public void sliderVermelho(){
    carroVermelho.setVelocidade((int)velCarroVermelhoID.getValue());
  }
  @FXML
  public void sliderVerde(){
    carroVerde.setVelocidade((int)velCarroVerdeID.getValue());
  }
}