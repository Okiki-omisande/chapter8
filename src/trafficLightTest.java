public class trafficLightTest {
    public static void main(String[] args) {
        for (trafficLight traffic : trafficLight.values()){
            System.out.printf("%-10s%-45s%n", traffic,traffic.getParameter());
        }
    }
}
