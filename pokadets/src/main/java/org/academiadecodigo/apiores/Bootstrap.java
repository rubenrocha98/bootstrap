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
        setStats(andre,107,7, 5);
        pokadetMap.put(1,andre);

        Pokadet bernardo = new Bernardo();
        bernardo.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.BERNARDO_ABILITY);
        setStats(bernardo,105, 8, 5);
        pokadetMap.put(2,bernardo);

        Pokadet bruno = new Bruno();
        bruno.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.BRUNO_ABILITY);
        setStats(bruno, 110,5,8);
        pokadetMap.put(3,bruno);

        Pokadet claudia = new Claudia();
        claudia.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.CLAUDIA_ABILITY);
        setStats(claudia,120,5,8);
        pokadetMap.put(4,claudia);

        Pokadet dutra = new Dutra();
        dutra.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.DUTRA_ABILITY);
        setStats(dutra, 105, 8,5);
        pokadetMap.put(5,dutra);

        Pokadet evandro = new Evandro();
        evandro.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.EVANDRO_ABILITY);
        setStats(evandro, 120, 4, 8);
        pokadetMap.put(6,evandro);

        Pokadet fabio = new Fabio();
        fabio.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.FABIO_ABILITY);
        setStats(fabio, 120, 7, 9);
        pokadetMap.put(7,fabio);

        Pokadet francisco = new Francisco();
        francisco.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.FRANCISCO_ABILITY);
        setStats(francisco, 110, 7, 7);
        pokadetMap.put(8,francisco);

        Pokadet gustavo = new Gustavo();
        gustavo.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.GUSTAVO_ABILITY);
        setStats(gustavo, 90,8,6);
        pokadetMap.put(9,gustavo);

        Pokadet hugo = new Hugo();
        hugo.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.HUGO_ABILITY);
        setStats(hugo,110,7,8);
        pokadetMap.put(10,hugo);

        Pokadet jaime = new Jaime();
        jaime.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.JAIME_ABILITY);
        setStats(jaime,100,8,5);
        pokadetMap.put(11,jaime);

        Pokadet julio = new Julio();
        julio.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.JULIO_ABILITY);
        setStats(julio,115,7,7);
        pokadetMap.put(12,julio);

        Pokadet miguel = new Miguel();
        miguel.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.MIGUEL_ABILITY);
        setStats(miguel,120,5,9);
        pokadetMap.put(13,miguel);

        Pokadet paulo = new Paulo();
        paulo.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.PAULO_ABILITY);
        setStats(paulo,110,7,8);
        pokadetMap.put(14,paulo);

        Pokadet pedro = new Pedro();
        pedro.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR,Ability.PEDRO_ABILITY);
        setStats(pedro,115,6,9);
        pokadetMap.put(15,pedro);

        Pokadet ruben = new Ruben();
        ruben.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR,Ability.RUBEN_ABILITY);
        setStats(ruben,100,8,6);
        pokadetMap.put(16,ruben);

        Pokadet sara = new Sara();
        sara.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR,Ability.SARA_ABILITY);
        setStats(sara,100,6,8);
        pokadetMap.put(17,sara);

        Pokadet xavier = new Xavier();
        xavier.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR,Ability.XAVIER_ABILITY);
        setStats(xavier, 110,7,7);
        pokadetMap.put(18,xavier);

        return server;
    }

    void setStats(Pokadet pokadet, int hp, int attack, int defense){
        pokadet.setHp(hp);
        pokadet.setAttack(attack);
        pokadet.setDefense(defense);
    }
}
