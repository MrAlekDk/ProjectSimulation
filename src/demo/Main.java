package demo;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        ProcessSim ps = new ProcessSim();

        List<State> list = new ArrayList<>();

        list.add(new State("Communication",1,3,1,1.0));
        list.add(new State("Planning",2,1,2,0.8));
        list.add(new State("Modelling",1,3,2,0.8));
        list.add(new State("Deployment",1,1,0,1));

        ps.runSimulation(new Process("UP",5,list));

    }
}
