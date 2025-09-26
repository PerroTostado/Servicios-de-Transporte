
package Booking;

public class Bus extends TransportService {
    
    private String busCompany;
    private String boardingPoint;
    
    public Bus(){
        super();
    }
    
    public Bus(int id, String origin, String destination, double price, String busCompany, String boardingPoint){
        
        super(id, origin, destination, price);
        this.boardingPoint = boardingPoint;
        this.busCompany = busCompany;
       
    }
    
    public final void setBusCompany(String busCompany){
        this.busCompany = busCompany;
    }
    
    public final void setBoardingPoint(String boardingPoint){
        this.boardingPoint = boardingPoint;
    }
    
    public String getBusCompany(){
        return this.busCompany;
    }
    
    public String getBoardingPoint(){
        return this.boardingPoint;
    }
    @Override
    public  String getServiceInformation(){
        return "hola";
    }
    @Override
     public  String getLuggageInformation(){
         return "adios";
     }
     
     @Override
     
     public String toString(){
         String mess = super.toString() + "\n" + "Company: \t" + this.getBusCompany()
                 + "\n" + "Boarding point: \t" + this.getBoardingPoint() + "\n"
                 + this.getServiceInformation() + "\n" + this.getLuggageInformation();
         return mess;
     }
    
    
    
}
