
import java.util.Scanner;

public class quiz implements quizint{
    public static void main(String [] args){
        
         Scanner scannerdaentrada = new Scanner(System.in);
          Scanner scannerdaprimeirapergunta = new Scanner(System.in);
              Scanner scannerdasegundapergunta = new Scanner(System.in);
                Scanner scannerdaterceirapergunta = new Scanner(System.in);
                Scanner scannerdaquartapergunta = new Scanner(System.in);
                Scanner scannerdaquintapergunta = new Scanner(System.in);
                Scanner scannerdasextapergunta = new Scanner(System.in);
                Scanner scannerdasetimapergunta = new Scanner(System.in);
                Scanner scannerdaoitavapergunta = new Scanner(System.in);
                Scanner scannerdanonapergunta = new Scanner(System.in);
                Scanner scannerdadecimapergunta = new Scanner(System.in);
                Scanner scannerdasaida = new Scanner(System.in);
        System.out.println(comeco);
                

       int numero = scannerdaentrada.nextInt();
        
        switch(numero){

        case 1: 
                    System.out.println("Voce saiu");
                    break;
          case 2: 

        System.out.println("Leo Rassi, O BRABO ");
                break;
                
               
        case 3:
        
     System.out.println("Quem descobriu o Brasil? \n 1- Pedro Álvares Cabral \n 2- Floriano Peixoto \n 3- Marechal Deodoro da Fonseca \n 4- Thais Carla");
        int numero2 = scannerdaprimeirapergunta.nextInt();
      

            
            switch(numero2){
                
                case 1:
                    System.out.println("Você acertou  ");
                    break;
                case 2:
                    System.out.println("Voce errou ");
                    break;
                case 3: 
                System.out.println("Voce errou  ");
                    break;
                case 4: 
                System.out.println("Voce errou ");
                break;
                 default:
                        System.out.println("Comando desconhecido");
                }

                System.out.println(" Em qual continente fica a Coréia do Sul, México e França? \n 1- Asia, América Central e Europa \n 2- Europa, América Central e Europa \n 3- Asia, América do Sul e Europa \n 4- Nordeste, Centro Oeste e Sul ");
                int numero3 = scannerdasegundapergunta.nextInt();
                switch(numero3){

                case 1: 
                System.out.println("Voce acertou ");
                        break;
                case 2:

                    System.out.println("Voce errou ");
                        break;
                case 3: 
                System.out.println("Voce errou ");
                    break;
                case 4: 

                System.out.println("Voce errou");
                    break;
                    default:
                        System.out.println("Comando desconhecido");
                        

                }

                
                System.out.println("Quem é o homem mais Rico do mundo? \n 1- Celso Portiolli \n 2-Elon Musk \n 3- Cristiano Ronaldo \n 4- Deus");    
                    int numero4 = scannerdaterceirapergunta.nextInt();
                    switch(numero4){
                        case 1:
                            System.out.println("Voce errou");
                                break;
                        case 2: 

                            System.out.println("Voce acertou");
                                break;
                        case 3: 

                            System.out.println("Voce pensou demais em.. mas voce errou");
                                break;
                        case 4: 

                            System.out.println("OWWWNN QUE FOFO VOU ATE CONSIDERAR >..<");
                             break;
                              default:
                                 System.out.println("Comando desconhecido");
                    }

                        System.out.println(" A trompa de um elefante tem mais de 40 mil músculos \n 1- Verdadeiro \n 2- Falso ");
                        int numero5 = scannerdaquartapergunta.nextInt();

                            switch(numero5){
                                case 1: 
                                System.out.println("Voce acertou");
                                break;
                                case 2: 
                                System.out.println("Voce errou");
                                break;
                                default:
                                    System.out.println("Comando desconhecido");
                            }
                            
                            System.out.println("Maior orgão do corpo humano é o figado \n 1-Verdadeiro \n 2- Falso");
                            int numero6 = scannerdaquintapergunta.nextInt();

                            switch(numero6){

                                case 1:
                                    System.out.println("Voce errou");
                                    break;

                                    case 2:
                                        System.out.println("Voce acertou");
                                        break;
                                        default:
                                            System.out.println("Comando desconhecido");
                                            
                            }

                                System.out.println(" Covid 19 significa COrona VIrus Disease(doença) 2019, ano que surgiu \n 1- Verdadeiro \n 2-Falso");
                                int numero7 = scannerdasextapergunta.nextInt();

                                switch(numero7){
                                        case 1:

                                            System.out.println("Voce acertou");
                                            break;
                                     case 2: 
                                             System.out.println("Voce errou");
                                             break;
                                          default:
                                                System.out.println("Comando desconhecido");

                                }

                                System.out.println(" O mercúrio é o único metal líquido à temperatura ambiente (25°C). Todos os outros são sólidos ou gases \n 1- Verdadeiro 2-Falso");
                                    int numero8 = scannerdasetimapergunta.nextInt();

                                    switch(numero8){
                                         
                                         case 1:

                                            System.out.println("Voce acertou");
                                            break;
                                     case 2: 
                                             System.out.println("Voce errou");
                                             break;
                                          default:
                                                System.out.println("Comando desconhecido");
                                    }

                                    System.out.println("Qual orgão consome mais energia? \n 1-pulmão  \n 2- Cérebro \n 3-Figado \n 4-Pele ");
                                    int numero9 = scannerdaoitavapergunta.nextInt();

                                    switch(numero9){

                                        case 1:

                                            System.out.println("Voce ja viu alguem consumir energia no pulmão?, mas voce errou");
                                            break;

                                        case 2:

                                            System.out.println("Inteligente voce em... Voce acertou");
                                            break;
                                        case 3:
                                            System.out.println("Voce acha que o figado é o responsavel pela energia gasta?. Voce errou");
                                            break;
                                            case 4:
                                                System.out.println("Boa tentativa, a pele so defende a sua beleza kakakakakak, voce errou");
                                                break;
                                                default:
                                                    System.out.println("Comando desconhecido");
                                                
                                    }

                                    System.out.println("Quantos anos tem o nosso universo, aproximadamente? \n 1- 7.2 Bilhões \n 2- 10.5 Bilhões \n 3- 13.8 Bilhões \n 4- 17.4 Bilhões");
                                    int numero10 = scannerdanonapergunta.nextInt();
                                    
                                    switch(numero10){
                                        case 1:
                                            System.out.println("Voce errou");
                                            break;
                                        case 2: 
                                         System.out.println("Voce errou");
                                         break;
                                         case 3:
                                            System.out.println("NOSSSSAAAAAAA TU PENSA MUITO EM, Voce acertou");
                                            break;
                                        case 4:
                                            System.out.println("Voce errou");
                                             break;
                                                default:
                                                    System.out.println("Comando desconhecido");

                                    }

                                    System.out.println("Um elétron carrega uma carga positiva. Verdadeiro ou falso? \n 1-Verdadeiro \n 2- Falso");
                                    int numero11 = scannerdadecimapergunta.nextInt();

                                    switch(numero11){
                                        
                                        case 1:
                                            System.out.println("Voce errou");
                                            break;

                                        case 2:

                                            System.out.println("Voce acertou ");
                                            break;
                                            default:
                                                System.out.println("Comando desconhecido");
                                    }

                                    System.out.println("OBRIGADO POR JOGAR O MEU QUIZ >..< AGORA APERTE O BOTÃO PRA SAIR! \n 1-Sair ");
                                    int numero12 = scannerdasaida.nextInt();

                                    switch(numero12){

                                        case 1:
                                            System.out.println("Voce saiu");
                                            break;
                                            default:
                                                System.out.println("COMO VOCE CONSEGUE ERRAR MANO?");
                                    }


                }
              

    }
}