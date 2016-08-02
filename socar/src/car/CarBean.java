package car;

public class CarBean {
	private String zone, model, payKm, oil, option;

	public String getZone() {
		return zone;
	}

	public void setZone(String zone) {
		this.zone = zone;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public String getPayKm() {
		return payKm;
	}

	public void setPayKm(String payKm) {
		this.payKm = payKm;
	}

	public String getOil() {
		return oil;
	}

	public void setOil(String oil) {
		this.oil = oil;
	}

	public String getOption() {
		return option;
	}

	public void setOption(String option) {
		this.option = option;
	}

	@Override
	public String toString() {
		return "CarBean [zone=" + zone + ", model=" + model + ", payKm=" + payKm + ", oil=" + oil + ", option=" + option
				+ "]";
	}
}
