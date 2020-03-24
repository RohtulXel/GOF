package command.memento;

import command.TextFile;

public class Snapshot {

    private TextFile textFile;

    public Snapshot(TextFile textFile) {
        //almost memento :) in classic perspective it way to restore state of ordinato object, but you create new one
        this.textFile = new TextFile(textFile.getContext());
    }

    public TextFile restore(){
        return textFile;
    }



}
