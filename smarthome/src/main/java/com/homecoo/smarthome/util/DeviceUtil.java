package com.homecoo.smarthome.util;

import com.homecoo.smarthome.domain.Device;
import com.homecoo.smarthome.domain.DeviceDto;
import com.homecoo.smarthome.domain.DeviceDtoApp;
import com.sun.jdi.ShortValue;
import com.sun.star.uno.IFieldDescription;

/**
 * @author xiaobai
 * */
public class DeviceUtil {
	
	/**
	 * APP传过来的 device 实体类  转换为  服务器的deviceDto实体类
	 * @param:deviceDtoApp DeviceDtoApp
	 * @return:deviceDto DeviceDto
	 * */
	public static DeviceDto DeviceDtoappToDeviceDto(DeviceDtoApp deviceDtoApp){
		
		DeviceDto deviceDto=new DeviceDto();
		Device device=new Device();
		try {
		device.setDeviceId(null);
		device.setDeviceNo(deviceDtoApp.getDeviceNo());
		device.setDeviceTypeId(deviceDtoApp.getDeviceTypeId());
		device.setDeviceTypeName(deviceDtoApp.getDeviceTypeName());
		device.setDeviceCategoryId(deviceDtoApp.getDeviceCategoryId());
		device.setDeviceCategoryName(deviceDtoApp.getDeviceCategoryName());
		device.setDeviceName(deviceDtoApp.getDeviceName());
		device.setGatewayNo(deviceDtoApp.getGatewayNo());
		device.setSpaceNo(deviceDtoApp.getSpaceNo());
		device.setSpaceTypeId(String.valueOf(deviceDtoApp.getSpaceTypeId()));
		device.setPhoneNum(deviceDtoApp.getPhoneNum());
		device.setCreateTime(null);
		device.setCreateBy(null);
		device.setUpdateBy(null);
		device.setUpdateBy(null);
		deviceDto.setDevice(device);
		deviceDto.setDeviceState(deviceDtoApp.getDeviceStateCmd());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return deviceDto;
		
	}

	/**
	 *device  deviceState   转App 需要的DeviceDtoApp
	 * @param deviceState String
	 * @param device DEVICE
	 * @return:deviceDtoApp  DeviceDtoApp
	 * */
	public static DeviceDtoApp GetDeviceDtoApp(Device device,String deviceState){
		
		DeviceDtoApp deviceDtoApp=new DeviceDtoApp();
		deviceDtoApp.setDeviceStateCmd(deviceState);
		deviceDtoApp.setDeviceId(device.getDeviceId());
		deviceDtoApp.setDeviceNo(device.getDeviceNo());
		deviceDtoApp.setDeviceTypeId(device.getDeviceTypeId());
		deviceDtoApp.setDeviceTypeName(device.getDeviceTypeName());
		deviceDtoApp.setDeviceCategoryId(device.getDeviceCategoryId());
		deviceDtoApp.setDeviceCategoryName(device.getDeviceCategoryName());
		deviceDtoApp.setDeviceName(device.getDeviceName());
		deviceDtoApp.setGatewayNo(device.getGatewayNo());
		deviceDtoApp.setSpaceNo(device.getSpaceNo());
		deviceDtoApp.setSpaceTypeId(Integer.valueOf(device.getSpaceTypeId()));
		deviceDtoApp.setPhoneNum(device.getPhoneNum());
		
		
		return deviceDtoApp;
		
	}
	
	
}
