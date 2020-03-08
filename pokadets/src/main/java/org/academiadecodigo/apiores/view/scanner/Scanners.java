package org.academiadecodigo.apiores.view.scanner;

import org.academiadecodigo.apiores.view.Messages;
import org.academiadecodigo.bootcamp.scanners.menu.MenuInputScanner;

public abstract class Scanners {


    public static MenuInputScanner getTrainersMenu() {
        MenuInputScanner trainersMenu = new MenuInputScanner(Messages.getTrainerInfo());
        trainersMenu.setMessage(Messages.CHOOSE_TRAINER);
        return trainersMenu;
    }
}
