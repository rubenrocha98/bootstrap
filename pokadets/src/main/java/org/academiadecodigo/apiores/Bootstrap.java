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

        Pokadet[] pokadets = createPokadets();
        addToMap(pokadetMap, pokadets);
        setPokadetsStats(pokadetMap);
        addPokeAbilities(pokadetMap);

        return server;
    }

    public Pokadet[] createPokadets() {
        Pokadet andre = new Andre();
        Pokadet bernardo = new Bernardo();
        Pokadet bruno = new Bruno();
        Pokadet claudia = new Claudia();
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
        Pokadet[] pokadets = {andre, bernardo, bruno, claudia, dutra, evandro, fabio, francisco, gustavo, hugo,
                jaime, julio, miguel, paulo, pedro, ruben, sara, xavier};
        return pokadets;
    }

    private void addToMap(Map<Integer, Pokadet> map, Pokadet[] pokadets) {
        for (int i = 0; i < pokadets.length; i++) {
            map.put(i+1, pokadets[i]);
        }
    }

    public static void addPokeAbilities(Map<Integer,Pokadet> map){
        map.get(1).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.CIGAR, Ability.ANDRE_ABILITY);
        map.get(2).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.BERNARDO_ABILITY);
        map.get(3).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.BRUNO_ABILITY);
        map.get(4).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.CLAUDIA_ABILITY);
        map.get(5).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.DUTRA_ABILITY);
        map.get(6).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.EVANDRO_ABILITY);
        map.get(7).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.FABIO_ABILITY);
        map.get(8).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.FRANCISCO_ABILITY);
        map.get(9).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.GUSTAVO_ABILITY);
        map.get(10).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.HUGO_ABILITY);
        map.get(11).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.JAIME_ABILITY);
        map.get(12).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.JULIO_ABILITY);
        map.get(13).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.MIGUEL_ABILITY);
        map.get(14).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.PAULO_ABILITY);
        map.get(15).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.PEDRO_ABILITY);
        map.get(16).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.RUBEN_ABILITY);
        map.get(17).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.SARA_ABILITY);
        map.get(18).setAbilities(Ability.HEADBUTT, Ability.UPPERCUT, Ability.THROW_CHAIR, Ability.XAVIER_ABILITY);
    }

    public static void setPokadetsStats(Map<Integer, Pokadet> map) {
        map.get(1).setStats(107, 7, 5, 5);
        map.get(2).setStats(105, 8, 5, 5);
        map.get(3).setStats(110, 5, 8, 5);
        map.get(4).setStats(120, 5, 8, 5);
        map.get(5).setStats(105, 8, 5, 5);
        map.get(6).setStats(120, 4, 8, 5);
        map.get(7).setStats(120, 7, 9, 5);
        map.get(8).setStats(110, 7, 7, 5);
        map.get(9).setStats(105, 8, 6, 5);
        map.get(10).setStats(110, 7, 8, 5);
        map.get(11).setStats(100, 8, 5, 5);
        map.get(12).setStats(115, 7, 9, 5);
        map.get(13).setStats(120, 5, 9, 5);
        map.get(14).setStats(110, 7, 8, 5);
        map.get(15).setStats(115, 6, 9, 5);
        map.get(16).setStats(100, 8, 6, 5);
        map.get(17).setStats(100, 6, 8, 5);
        map.get(18).setStats(110, 7, 7, 5);

    }
}
