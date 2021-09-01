package demo;

import java.util.List;

public class Process {

    private String name;
    private int nrOfStates;
    private List<State> listOfStates;

    public Process(String name,int nrOfStates,List<State> listOfStates){
        this.name=name;
        this.nrOfStates=nrOfStates;
        this.listOfStates = listOfStates;
    }


    public int getNrOfStates(){
        return this.nrOfStates;
    }

}
