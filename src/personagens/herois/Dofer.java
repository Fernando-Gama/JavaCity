package personagens.herois;

import itens.Item;
import personagens.PoderEspecial;
import personagens.viloes.Vilao;

import java.util.ArrayList;

public final class Dofer extends Heroi {

    public Dofer() {
        super("Dofer", 100, 0, 10, new PoderEspecial("Espada Flamejante",30,65), new ArrayList<Item>(), new PoderEspecial("Transmutaçãp de mana", 25, 80));
    }

    @Override
    public void contarHistoria() {
        System.out.print("""
                Respeitado coronel da Guarda Real de Java City e estrategista do rei, Dofer, estava mais um dia na guarda das muralhas
                fazendo sua patrulha diária quando, com um som ensurdecedor, uma luz verde em forma de garra, rapidamente se materializando,
                emana das sombras e mata seu irmão e parceiro de armas Mikelos. Ao vê-lo Dofer utiliza seu famoso ataque espada flamejante e
                parte para cima da garra que, para sua surpresa, superou sua extrema velocidade e ataca-o antes que pudesse sequer arranhá-la,
                o cavaleiro foi ao chão e, fechando os olhos, viu por alguns instantes a garra voltando para as sombras e espairecer lentamente.
                Semanas após o ocorrido, Dofer encontra-se no hospital e, ao abrir seus olhos, começa a sentir uma dor latente em seu peito, ele
                olha para baixo e vê um buraco onde seu coração deveria estar. Dofer gritou e gritou até que o médico de plantão chega tentando
                acalmá-lo e explicá-lo um pouco mais sobre o seu estado ao chegar no hospital. O médico contou que em seu peito havia um buraco de
                aproximadamente um palmo de largura, sob intensas hemorragias, seu coração estava batendo exposto, quase como se quisesse desprender-se
                do corpo do cavaleiro. Além disso, em seu coração havia uma substância verde, acídica, corroendo sua carne, que o doutor nunca
                vira antes, mas que suspeitava ser algum tipo de magia negra. Infelizmente, a única solução para salvá-lo foi retirar seu coração
                infectado e realizar um tratamento intensivo de materialização de mana — energia mágica que todos os seres humanos compartilham,
                ainda que em níveis diferentes, e que pode ser transferida para outro corpo —, com os magos renomados da cidade tentando um procedimento
                arriscado de criar um proto-coração com sua já existente mana e com a energia doada pelos humildes habitantes de Javacity, mas apesar
                do êxito no tratamento, o médico o avisou que ele nunca mais teria o mesmo vigor, as mesmas forças e a mesma mana em seu corpo que antes.
                Desde esse dia, Dofer treinou ininterruptamente por dois anos, em dias quentes e noites chuvosas, ultrapassando a fadiga de cada
                músculo em seu corpo para partir em busca do assassino de seu irmão. Após cinco anos de uma jornada incansável por respostas,
                o cavaleiro, ao retornar para Java City ouviu boatos de que ao Sul da cidade, nos subterrâneos da Floresta Sombria de Sonfejer habitava
                um mago negro que realizava experimentos que emanavam longínquas e estranhas luzes verdes, o herói sentiu sua espinha arrepiar,
                ele sabia o que tinha que fazer.""");
    }
    @Override
    public void poderEspecial1(Vilao vilao) {
        if (mana >= 65){
            int dano = 30;
            diminuirMana(65);
            vilao.diminiurVida(dano);
        }
        else{
            System.out.println("Mana insuficiente");
        }
    }
    public void poderEspecial2() {
        String nome = "Transmutação de mana";
        String descricao = "Transmutação de mana regenera 25 de vida";
        System.out.println();
        if (mana >= 80){
            diminuirMana(80);
            aumentarVida(25);

            //this.forcaAtaque = 5;
            System.out.println(descricao);
        }
        else{
            System.out.println("Mana insuficiente");
        }
    }

    @Override
    public void ataquePadrao(Vilao vilao){
        String nome = "Ataque de Espada";
        vilao.diminiurVida(forcaAtaque);
    }

}
