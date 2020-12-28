package entities;

public final class OutsourcedEmployee extends Employee {

	
	private Double additionalCharge;

	
	
	public OutsourcedEmployee() {

		super();
	}

	public OutsourcedEmployee(String name, Integer hours, Double valuePerHour, Double additionalCharge) {

		super(name, hours, valuePerHour);
		this.additionalCharge = additionalCharge;

	}

	public Double getadditionalCharge() {

		return this.additionalCharge;
	}

	public void setadditionalCharge(Double additionalCharge) {

		this.additionalCharge = additionalCharge;

	}

	@Override
	public Double paymant() {
		
		return this.getHours() * this.getValuePerHour() + this.getadditionalCharge() * 1.1  ; 
		
	
	}
	
	
	
}
