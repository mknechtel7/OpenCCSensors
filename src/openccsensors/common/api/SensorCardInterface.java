package openccsensors.common.api;

public class SensorCardInterface {

	private int id;
	private String name;
	private SensorUpgrade upgrade;
	private Class sensor;
	
	public SensorCardInterface(int id, String name, SensorUpgrade upgrade,
			Class sensor) {
		this.id = id;
		this.name = name;
		this.upgrade = upgrade;
		this.sensor = sensor;
	}

	public int getId() {
		return this.id;
	}

	public String getName() {
		return this.name;
	}

	public SensorUpgrade getSensorUpgrade() {
		return null;
	}

	public ISensor getSensor() {
		return null;
	}

}
