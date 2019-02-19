public class App {

    public static void main(String[] args){
        Vehicle v1=CreateFactory.createVehicle("car");
        v1.changeTyres();
        Vehicle v2=CreateFactory.createVehicle("bike");
        v2.changeTyres();
    }
}
