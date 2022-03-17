package lab;

public class house {
	
	private int squareft;
	private double bathrooms;
	private int bedrooms;
	private int cost;
	private String address;
	private double lotsize;
	private boolean haspool;
	private String image;

public house(int squareft, double bathrooms, int bedrooms, int cost, double lotsize, String image) {
 this.squareft = squareft;
 this.bathrooms = bathrooms;
 this.bedrooms = bedrooms;
 this.cost = cost;
 this.address = address;
 this.lotsize = lotsize;
 this.haspool = haspool;
 this.image = image;
}

private int getsquareft() {return squareft;}
private double getbathrooms() {return bedrooms;}
private int getbedrooms() {return bedrooms;}
private int getcost() {return cost;}
private String getaddress() {return address;}
private double getlotsize() {return lotsize;}
private boolean getHasPool() {return haspool; }
private String getimage() {return image; }

@Override
public String toString() {
	return squareft+bathrooms+bedrooms+cost+address+lotsize+haspool+image;
}
}



