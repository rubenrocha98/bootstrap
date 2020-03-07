package org.academiadecodigo.apiores.view.scanner;

import org.academiadecodigo.apiores.models.cadets.Pokadet;
import org.academiadecodigo.apiores.view.Messages;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public abstract class Scanners {

    public static MenuInputScanner getMenu(Pokadet pokadet) {
        MenuInputScanner menuInputScanner = new MenuInputScanner(Messages.abilitiesMenu(pokadet));
        menuInputScanner.setMessage(Messages.getStats(pokadet) + Messages.ABILITY_TO_USE);
        menuInputScanner.setError("");
        return null;
    }

    public static MenuInputScanner getTrainersMenu() {
        MenuInputScanner trainersMenu = new MenuInputScanner(Messages.TRAINERS_MENU);
        trainersMenu.setMessage(Messages.CHOOSE_TRAINER);
        return trainersMenu;
    }
}
