package com.homecoo.smarthome.domain;


public class DeviceDto {
	
	private Device device;
	
	private String deviceState;

	public Device getDevice() {
		return device;
	}

	public void setDevice(Device device) {
		this.device = device;
	}

	public String getDeviceState() {
		return deviceState;
	}

	public void setDeviceState(String deviceState) {
		this.deviceState = deviceState;
	}

	@Override
	public String toString() {
		return "DeviceDto [device=" + device + ", deviceState=" + deviceState
				+ "]";
	}
    
}