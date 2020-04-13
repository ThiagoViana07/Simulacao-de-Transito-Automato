package model;
import controller.Controller;
import javafx.application.Platform;

public class Carro extends Thread{
  Controller tela;
  public int velocidade = 5; // Velocidade base dos carros
  private int id; // ID de cada thread
  private int especial, verdeEspecial;
  public double coordenadaX, coordenadaY, rotacao; // Variaveis que receberao a posicao correspondente

  public void run(){
    while(true){    
      try{       
        tela.percurso(this); // Chama o metodo percurso para iniciar a thread
      }catch(Exception ex){}  
    }
  }
  
  public void setTela(Controller tela){
    this.tela = tela;
  }

  public void setVelocidade(int velocidade){
    System.out.println(velocidade);
    try{
      
      if(velocidade == 0){ // Se velocidade for igual a 0, suspende a thread para parar o carro
        System.out.println("PAROU");
        suspend();
        System.out.println("SUPENDEU");
      }else{ // se nao volta a thread reiniciar de onde parou
        resume(); 
        this.velocidade = 105 - (velocidade);
      }
     }catch(Exception e){} 
  }

  public void setId(int id){
    this.id = id;

  }

  public int getid(){
    return id;
  }  

  public void setEspecial(int especial){
    this.especial = especial;
  }

  public int getEspecial(){
    if(especial == -1 || especial == 0 || especial == 1){
      especial++;
    }else{
      especial = 0;
    }
    return especial;
    
  }
  public void setVerdeEspecial(int verdeEspecial){
    this.verdeEspecial = verdeEspecial;
  }

  public int getVerdeEspecial(){
    return verdeEspecial;
  }
}