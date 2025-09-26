
package customers;

public class Passenger extends Person {
    private String passportNumber;
    
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
@Override
public String toString(){
    String XD = "";
    return XD;
}
}
