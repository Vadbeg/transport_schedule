package sample.logic;

public class Route {

    private String name;
    private String routeNumber;
    private String transportType;

    public void changeName(String newName) {

    }

    public void changeRouteNumber(String newRouteNumber) {

    }

    public void addTransportNode(TransportNode transportNode, int routePosition) {

    }

    public void removeTransportNode(int routePosition) {

    }

    public int getTransportNodePosition(TransportNode transportNode) {

        return 0;
    }

    public void changeTransportType(String newTransportType) {

    }

    public TransportNode getTransportNode(int routePosition){

        return new TransportNode();
    }

}
