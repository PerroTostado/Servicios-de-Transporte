
package customers;

import Booking.TransportService;

public class Passenger extends Person {
    private String passportNumber;
    private TransportService transportService;
public Passenger(){
    
}   
public Passenger(String name, int age, String passportNumber){
    this.passportNumber=passportNumber;
}
protected final void setPassportNumber(String passportNumer){
    this.passportNumber=passportNumber;
}
protected final String getPassportNumber(){
    return this.passportNumber;
}
public void addTransportService(TransportService transportService){
    this.transportService =transportService;
}
@Override
public String toString(){
    String XD = "";
    return XD;
}
}
