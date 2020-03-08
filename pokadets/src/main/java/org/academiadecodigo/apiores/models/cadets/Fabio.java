package org.academiadecodigo.apiores.models.cadets;

import org.academiadecodigo.apiores.view.Messages;

public class Fabio extends AbstractPokadet {

    public Fabio() {
        name = legendaryStatus() + Messages.WHITE_BOLD_BRIGHT+"Fábio"+Messages.ANSI_RESET+ " - Let there always be a cold one on the fridge.";
    }

    private String legendaryStatus() {
        return Messages.YELLOW_BOLD_BRIGHT + "*LEGENDARY* " +Messages.ANSI_RESET;
    }
}
