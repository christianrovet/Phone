package models;

public class IPhone extends Phone implements Ringable {
    public IPhone(String versionNumber, int batteryPercentage, String carrier, String ringTone) {
        super(versionNumber, batteryPercentage, carrier, ringTone);
    }
	@Override
    public String ring() {
        // your code here
		return this.getRingTone();
    }
    @Override
    public String unlock() {
        // your code here
    	return "Unlock";
    }
    @Override
    public void displayInfo() {
        // your code here
    	System.out.println("Iphone Version number: " + this.getVersionNumber() + " Carrier: " + this.getCarrier());
    }
}
