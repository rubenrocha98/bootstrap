package org.academiadecodigo.apiores;

import org.academiadecodigo.apiores.controllers.PokadetController;
import org.academiadecodigo.apiores.models.Ability;
import org.academiadecodigo.apiores.models.cadets.*;
import org.academiadecodigo.apiores.server.Server;
import org.academiadecodigo.apiores.services.PokadetService;

import java.util.HashMap;
import java.util.Map;

public class Bootstrap {

    private Map<Integer, Pokadet> pokadetMap;

    public Bootstrap() {
        pokadetMap = new HashMap<>();
    }

    Server wire() {

        Server server = new Server();

        PokadetController pokadetController = new PokadetController();
        pokadetController.setPokadetMap(pokadetMap);
        server.setPokadetController(pokadetController);

        PokadetService pokadetService = new PokadetService();
        pokadetController.setPokadetService(pokadetService);
        pokadetService.setPokadetController(pokadetController);

        Pokadet andre = new Andre();
        andre.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.ANDRE_ABILITY);
        andre.setHp(107);
        andre.setAttack(7);
        andre.setDefense(5);
        pokadetMap.put(1,andre);

        Pokadet bernardo = new Bernardo();
        bernardo.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.BERNARDO_ABILITY);
        bernardo.setHp(105);
        bernardo.setAttack(8);
        bernardo.setDefense(5);
        pokadetMap.put(2,bernardo);

        Pokadet bruno = new Bruno();
        bruno.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.BRUNO_ABILITY);
        bruno.setHp(110);
        bruno.setAttack(5);
        bruno.setDefense(8);
        pokadetMap.put(3,bruno);

        Pokadet claudia = new Claudia();
        claudia.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.CLAUDIA_ABILITY);
        claudia.setHp(120);
        claudia.setAttack(5);
        claudia.setDefense(8);
        pokadetMap.put(4,claudia);

        Pokadet dutra = new Dutra();
        dutra.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.DUTRA_ABILITY);
        dutra.setHp(105);
        dutra.setAttack(8);
        dutra.setDefense(5);
        pokadetMap.put(5,dutra);

        Pokadet evandro = new Evandro();
        evandro.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.EVANDRO_ABILITY);
        evandro.setHp(120);
        evandro.setAttack(4);
        evandro.setDefense(8);
        pokadetMap.put(6,evandro);

        Pokadet fabio = new Fabio();
        fabio.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.FABIO_ABILITY);
        fabio.setHp(120);
        fabio.setAttack(7);
        fabio.setDefense(9);
        pokadetMap.put(7,fabio);

        Pokadet francisco = new Francisco();
        francisco.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.FRANCISCO_ABILITY);
        francisco.setHp(110);
        francisco.setAttack(7);
        francisco.setDefense(7);
        pokadetMap.put(8,francisco);

        Pokadet gustavo = new Gustavo();
        gustavo.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.GUSTAVO_ABILITY);
        gustavo.setHp(90);
        gustavo.setAttack(8);
        gustavo.setDefense(6);
        pokadetMap.put(9,gustavo);

        Pokadet hugo = new Hugo();
        hugo.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.HUGO_ABILITY);
        hugo.setHp(110);
        hugo.setAttack(7);
        hugo.setDefense(8);
        pokadetMap.put(10,hugo);

        Pokadet jaime = new Jaime();
        jaime.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.JAIME_ABILITY);
        jaime.setHp(100);
        jaime.setAttack(8);
        jaime.setDefense(5);
        pokadetMap.put(11,jaime);

        Pokadet julio = new Julio();
        julio.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.JULIO_ABILITY);
        julio.setHp(115);
        julio.setAttack(7);
        julio.setDefense(7);
        pokadetMap.put(12,julio);

        Pokadet miguel = new Miguel();
        miguel.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.MIGUEL_ABILITY);
        miguel.setHp(120);
        miguel.setAttack(5);
        miguel.setDefense(9);
        pokadetMap.put(13,miguel);

        Pokadet paulo = new Paulo();
        paulo.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.PAULO_ABILITY);
        paulo.setHp(110);
        paulo.setAttack(7);
        paulo.setDefense(8);
        pokadetMap.put(14,paulo);

        Pokadet pedro = new Pedro();
        pedro.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR,Ability.PEDRO_ABILITY);
        pedro.setHp(115);
        pedro.setAttack(6);
        pedro.setDefense(9);
        pokadetMap.put(15,pedro);

        Pokadet ruben = new Ruben();
        ruben.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR,Ability.RUBEN_ABILITY);
        ruben.setHp(100);
        ruben.setAttack(8);
        ruben.setDefense(6);
        pokadetMap.put(16,ruben);

        Pokadet sara = new Sara();
        sara.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR,Ability.SARA_ABILITY);
        sara.setHp(100);
        sara.setAttack(6);
        sara.setDefense(8);
        pokadetMap.put(17,sara);

        Pokadet xavier = new Xavier();
        xavier.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR,Ability.XAVIER_ABILITY);
        xavier.setHp(110);
        xavier.setAttack(7);
        xavier.setDefense(7);
        pokadetMap.put(18,xavier);

        return server;
    }
}
