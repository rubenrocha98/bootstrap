package org.academiadecodigo.apiores.models.cadets;

import org.academiadecodigo.apiores.view.Messages;

public class Gustavo extends AbstractPokadet {

    public Gustavo() {
        name = legendaryStatus() + Messages.WHITE_BOLD_BRIGHT+"Gustavo"+Messages.ANSI_RESET+ " - Watch out for his CHINELOS!";
    }

    private String legendaryStatus() {
        return Messages.YELLOW_BOLD_BRIGHT + "*LEGENDARY* " +Messages.ANSI_RESET;
    }
}
