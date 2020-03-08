package org.academiadecodigo.apiores.models.cadets;

import org.academiadecodigo.apiores.view.Messages;

public class Sara extends AbstractPokadet {

    public Sara() {
        name = legendaryStatus() + Messages.WHITE_BOLD_BRIGHT+"Sara"+Messages.ANSI_RESET+ " - The power of math!";
    }

    private String legendaryStatus() {
        return Messages.YELLOW_BOLD_BRIGHT + "*LEGENDARY* " +Messages.ANSI_RESET;
    }
}
