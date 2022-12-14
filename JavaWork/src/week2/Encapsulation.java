package week2;

public class Encapsulation {
   
   String country;
   String nationalAnthem;
   String touristSpot;
public String getCountry() {
	return country;
}
public void setCountry(String country) {
	this.country = country;
}
public String getNationalAnthem() {
	return nationalAnthem;
}
public void setNationalAnthem(String nationalAnthem) {
	this.nationalAnthem = nationalAnthem;
}
public String getTouristSpot() {
	return touristSpot;
}
public void setTouristSpot(String touristSpot) {
	this.touristSpot = touristSpot;
}
   
public static void main(String[] args) {
	Encapsulation E = new Encapsulation();
	 
	
	E.setCountry("Jamaika");
	E.setNationalAnthem("Jumba");
	E.setTouristSpot("Usain bolt's Home");
	
	System.out.println("Country         : "+E.getCountry());
	System.out.println("National anthem : "+E.getNationalAnthem());
	System.out.println("Favourite place : "+E.getTouristSpot());
	
}
}
