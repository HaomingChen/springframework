package facade;

import facade.subclass.Mason;

public class Client {

    public static void main(String[] args) {
        Mason mason = new Mason();
        mason.buildHouse();
    }
}
