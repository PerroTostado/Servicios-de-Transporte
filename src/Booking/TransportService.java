
package Booking;

public class TransportService {
    private int id;
    private String origin;
    private String destination;
    private double price;
    
    //Constructores
    public TransportService(){
        this.id = 0;
        this.origin = "";
        this.destination = "";
        this.price = 0.0;
    }
    
    public TransportService(int id, String origin, String destination, double price){
        this.id = id;
        this.origin = origin;
        this.destination = destination;
        this.price = price;
    }
    
    //Métodos Set
    public final void setId(int id){
        this.id = id;
    }
    
    public final void setOrigin(String origin){
        this.origin = origin;
    }
    
    public final void setDestination(String destination){
        this.destination = destination;
    }
    
    public final void setPrice(double price){
        this.price = price;
    }
    
    //Métodos Get
    
    public int getId(){
        return this.id;
    }
    
    public String getOrigin(){
        return this.origin;
    }
    
    public int getDestination(){
        return this.id;
    }
    
}
