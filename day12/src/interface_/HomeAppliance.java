package interface_;

public class HomeAppliance implements Electronic {
	String applianceName;
	String electronicType;
	int energyConsumption;
	//product code 넣어주기
	
	public HomeAppliance(String applianceName, String electronicType, int energyConsumption) {
		this.applianceName=applianceName;
		this.electronicType=electronicType;
		this.energyConsumption=energyConsumption;
	}
	
	//Abstract Method
	@Override
	public int getElectricityUse() {
		return this.energyConsumption;
	}
	
	


}
