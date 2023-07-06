import personagens.MultiplicadorDeAtaque;
import personagens.herois.Dofer;
import personagens.herois.Heroi;
import personagens.herois.Rodan;

import java.util.InputMismatchException;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Heroi jogador;
        System.out.println("Bem-vindo a JavaCity");
        System.out.println("=--=-=-=-=-=-=-=-=-=-=-=-=-=-=");
        int opcaoHeroi = 0;
        do {
            try {
                    System.out.println("""
                            Escolha seu heroi:
                            (1) Dofer - Cavaleiro
                            (2) Ronan - Mago""");
                    opcaoHeroi = input.nextInt();
                    Heroi.verificarOpcaoHeroi(opcaoHeroi); // esse metodo lanca uma exceçãp
            }
            catch (InputMismatchException e) {
                    input.nextLine();
                    opcaoHeroi = 0;
                    System.out.println("Erro : Digite 1 ou 2 para escoler o heroi\n");
            }
            catch (IllegalArgumentException e){
                System.out.println(e.getMessage() + "\n");
                opcaoHeroi = 0;
            }
            catch (Exception e){
                input.nextLine();
                System.out.println("Erro desconhecido: digite um valor valido");
                opcaoHeroi = 0;
            }

        } while (opcaoHeroi == 0); // testando valores validos pro heroi
        if(opcaoHeroi == 1){
            jogador = new Dofer();
        }
        else{
            jogador = new Rodan();
        }


        jogador.contarHistoria();



            // esse vai ser o ultimo while
        //quando passar por ele vai dar a mensagem se o jogador ganhou o jogo...
    }


}