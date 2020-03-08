package org.academiadecodigo.apiores.models.cadets;


import org.academiadecodigo.apiores.view.Messages;

public class Ruben extends AbstractPokadet {

    public Ruben() {
        name = legendaryStatus() + Messages.WHITE_BOLD_BRIGHT+"Ruben"+Messages.ANSI_RESET+ " - Question develópper.";
    }

    private String legendaryStatus() {
        return Messages.YELLOW_BOLD_BRIGHT + "*LEGENDARY* " +Messages.ANSI_RESET;
    }
}
