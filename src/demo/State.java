package demo;

public class State {

    private String name;
    private int nrOfIt;
    private int nrOfRunIt;
    private int nrOfInputs;
    private int nrOfOutputs;    //3
    private double procentage;
    private boolean isFinished;

    public State(String name, int nrOfIt, int nrOfInputs, int nrOfOutputs, double procentage) {
        this.name = name;
        this.nrOfIt = nrOfIt;
        this.nrOfInputs = nrOfInputs;
        this.nrOfOutputs = nrOfOutputs;
        this.procentage = procentage;

        this.nrOfRunIt=0;
        this.isFinished = false;
    }

    public double[] runState(double i){
        double[] allValues = new double[nrOfOutputs];  //0=x, 1, 2

        double x = i*procentage;
        allValues[0] = x;

        double y = i-x;
        for (int j = 1; j < allValues.length-1; j++) {
            allValues[j] = y/(nrOfOutputs-1);
        }
        nrOfRunIt++;
        if(nrOfRunIt>=nrOfIt){
            isFinished=true;
        }
        return allValues;
    }

    public boolean getIsFinished(){
        return this.isFinished;
    }

}
