
package Booking;

public class Flight extends TransportService {
    private String airline;
    private String seatClass;
    
    //Constructores
    public Flight(){
        super();
    }
    
    public Flight(int id, String origin, String destination, double price, String airline, String seatClass){
        super();
        this.airline = airline;
        this.seatClass = seatClass;
    }
    
    //Métodos Set
    public final void setAirline(String airline){
        this.airline = airline;
    }
    
    public final void setSeatClass(String seatClass){
        this.seatClass = seatClass;
    }
    
    //Métodos Get
    public String getAirline(){
        return this.airline;
    }
    
    public String getSeatClass(){
        return this.seatClass;
    }
    
    //Métodos abstractos
    @Override
    public String getServiceInformation(){
        return "It´s flying";
    }
    
    @Override
    public String getLuggageInformation(){
        return "Have a suitcase";
    }
    
    @Override
    public String toString(){
        return "Airline: " + this.getAirline() + 
               "\tSeat Class: " + this.getSeatClass() + "\t";
    }
}
