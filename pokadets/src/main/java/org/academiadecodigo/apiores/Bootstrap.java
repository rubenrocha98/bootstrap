package org.academiadecodigo.apiores;

import org.academiadecodigo.apiores.controllers.PokadetController;
import org.academiadecodigo.apiores.models.Ability;
import org.academiadecodigo.apiores.models.cadets.*;
import org.academiadecodigo.apiores.server.Server;
import org.academiadecodigo.apiores.services.PokadetService;
import org.graalvm.compiler.core.common.type.ArithmeticOpTable;

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
        pokadetController.setPokadetMap(getMap());
        server.setPokadetController(pokadetController);

        PokadetService pokadetService = new PokadetService();
        pokadetController.setPokadetService(pokadetService);
        pokadetService.setPokadetController(pokadetController);


        Pokadet andre = new Andre();
        andre.setAbilities();

        Pokadet bernardo = new Bernardo();
        bernardo.setAbilities();

        Pokadet bruno = new Bruno();
        bruno.setAbilities(Ability.HEADBUTT,Ability.UPPERCUT,Ability.THROW_CHAIR);

        Pokadet claudia = new Claudia();
        claudia.

        Pokadet dutra = new Dutra();


        Pokadet evandro = new Evandro();


        Pokadet fabio = new Fabio();


        Pokadet francisco = new Francisco();


        Pokadet gustavo = new Gustavo();


        Pokadet hugo = new Hugo();


        Pokadet jaime = new Jaime();


        Pokadet julio = new Julio();


        Pokadet miguel = new Miguel();


        Pokadet paulo = new Paulo();


        Pokadet pedro = new Pedro();


        Pokadet ruben = new Ruben();


        Pokadet sara = new Sara();


        Pokadet xavier = new Xavier();


        return server;
    }


    private Map<Integer, Pokadet> getMap() {
        return null;
    }

    private String[] getNames() {
        Map<Integer, Pokadet> map = getMap();
        String[] names = new String[map.size()];
        for (int i = 0; i < names.length; i++) {
            names[i] = map.get(i + 1).getName();
        }
        return names;
    }
}
