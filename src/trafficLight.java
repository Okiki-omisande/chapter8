public enum trafficLight{
        RED("Stop for 5 minutes"),
        YELLOW("Ready to go in 5 minutes"),
        GREEN("You can now move");

     private final String parameter;

    trafficLight(String parameter){
        this.parameter = parameter;
    }

    public String getParameter() {
        return parameter;
    }
}
