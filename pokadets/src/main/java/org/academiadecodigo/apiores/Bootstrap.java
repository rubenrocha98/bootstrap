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
        andre.setStats(107, 7, 5, 5);
        pokadetMap.put(1,andre);

        Pokadet bernardo = new Bernardo();
        bernardo.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.BERNARDO_ABILITY);
        bernardo.setStats(105, 8, 5, 5);
        pokadetMap.put(2,bernardo);

        Pokadet bruno = new Bruno();
        bruno.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.BRUNO_ABILITY);
        bruno.setStats(110, 5, 8, 5);
        pokadetMap.put(3,bruno);

        Pokadet claudia = new Claudia();
        claudia.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.CLAUDIA_ABILITY);
        claudia.setStats(120, 5, 8, 5);
        pokadetMap.put(4,claudia);

        Pokadet dutra = new Dutra();
        dutra.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.DUTRA_ABILITY);
        dutra.setStats(105,8, 5, 5);
        pokadetMap.put(5,dutra);

        Pokadet evandro = new Evandro();
        evandro.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.EVANDRO_ABILITY);
        evandro.setStats(120,4,8,5);
        pokadetMap.put(6,evandro);

        Pokadet fabio = new Fabio();
        fabio.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.FABIO_ABILITY);
        fabio.setStats(120,7,9,5);
        pokadetMap.put(7,fabio);

        Pokadet francisco = new Francisco();
        francisco.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.FRANCISCO_ABILITY);
        francisco.setStats(110,7,7,5);
        pokadetMap.put(8,francisco);

        Pokadet gustavo = new Gustavo();
        gustavo.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.GUSTAVO_ABILITY);
        gustavo.setStats(105, 8, 6, 5);
        pokadetMap.put(9,gustavo);

        Pokadet hugo = new Hugo();
        hugo.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.HUGO_ABILITY);
        hugo.setStats(110,7,8,5);
        pokadetMap.put(10,hugo);

        Pokadet jaime = new Jaime();
        jaime.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.JAIME_ABILITY);
        jaime.setStats(100,8,5, 5);
        pokadetMap.put(11,jaime);

        Pokadet julio = new Julio();
        julio.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.JULIO_ABILITY);
        julio.setStats(115, 7,9,5);
        pokadetMap.put(12,julio);

        Pokadet miguel = new Miguel();
        miguel.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.MIGUEL_ABILITY);
        miguel.setStats(120,5,9,5);
        pokadetMap.put(13,miguel);

        Pokadet paulo = new Paulo();
        paulo.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR, Ability.PAULO_ABILITY);
        paulo.setStats(110,7,8,5);
        pokadetMap.put(14,paulo);

        Pokadet pedro = new Pedro();
        pedro.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR,Ability.PEDRO_ABILITY);
        pedro.setStats(115,6,9,5);
        pokadetMap.put(15,pedro);

        Pokadet ruben = new Ruben();
        ruben.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR,Ability.RUBEN_ABILITY);
        ruben.setStats(100,8,6,5);
        pokadetMap.put(16,ruben);

        Pokadet sara = new Sara();
        sara.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR,Ability.SARA_ABILITY);
        sara.setStats(100,6,8,5);
        pokadetMap.put(17,sara);

        Pokadet xavier = new Xavier();
        xavier.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR,Ability.XAVIER_ABILITY);
        xavier.setStats(110,7,7,5);
        pokadetMap.put(18,xavier);

        return server;
    }
}
