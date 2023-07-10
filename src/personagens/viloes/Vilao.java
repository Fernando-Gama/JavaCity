package personagens.viloes;

import personagens.AtaquePadrao;
import personagens.Personagem;
import personagens.PoderEspecial;

public abstract class Vilao extends Personagem implements AcoesViloes {
    public Vilao(String nome, Integer vida, Integer mana, AtaquePadrao ataquePadrao, PoderEspecial poderEspecial1) {
        super(nome, vida, mana, ataquePadrao, poderEspecial1);
    }

    @Override
    public void tomadadeDecisao(Personagem personagem) {
        if(mana < poderEspecial1.getCusto()){
            ataquePadrao(personagem);
        }
        else{
            poderEspecial1(personagem);
        }
    }
}
