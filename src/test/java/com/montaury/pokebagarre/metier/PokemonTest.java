package com.montaury.pokebagarre.metier;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


class PokemonTest {

    @Test
    void devrait_etre_vainqueur_s_il_a_une_meilleure_attaque() {
        // GIVEN
        var premier = new Pokemon("Pikachu", "urlImage", new Stats(12,15));
        var second = new Pokemon("Rondoudou", "urlImage2", new Stats(13,15));
        // WHEN
        var estVainqueur = second.estVainqueurContre(premier);
        // THEN
        assertThat(estVainqueur).isTrue();
    }

    @Test
    void devrait_etre_vainqueur_s_il_a_une_meilleure_defense_et_une_meme_attaque() {
        // GIVEN
        var premier = new Pokemon("Pikachu", "urlImage", new Stats(13,15));
        var second = new Pokemon("Rondoudou", "urlImage2", new Stats(13,16));
        // WHEN
        var estVainqueur = second.estVainqueurContre(premier);
        // THEN
        assertThat(estVainqueur).isTrue();
    }

    @Test
    void devrait_etre_vainqueur_s_il_est_renseigne_en_premier() {
        // GIVEN
        var premier = new Pokemon("Pikachu", "urlImage", new Stats(13,15));
        var second = new Pokemon("Rondoudou", "urlImage2", new Stats(13,15));
        // WHEN
        var estVainqueur = premier.estVainqueurContre(second);
        // THEN
        assertThat(estVainqueur).isTrue();
    }
}

