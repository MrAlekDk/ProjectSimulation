package demo;

public class ProcessSim {

    public ProcessSim(){

    }

    public void runSimulation(Process p){

        State test = new State("Planning",2,1,3,0.8);
        double[] fanget = test.runState(1.0);
        System.out.println(fanget[0]);
        System.out.println(fanget[1]);
        System.out.println(fanget[2]);
    }
}
