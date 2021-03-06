package com.homecoo.smarthome.persistence;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import com.homecoo.smarthome.domain.Schedule;

public interface ScheduleMapper {

	int deleteScheduleByScheduleId(@Param("scheduleId")Integer scheduleId);
	
	int deleteScheduleByPhoneNum(@Param("phoneNum")String phoneNum);
	
	int deleteScheduleByGatewayNo(@Param("gatewayNo")String gatewayNo);

	int insertSchedule(Schedule schedule);
	
	int updateSchedule(Schedule schedule);
	
	int deleteScheduleByThemeNo(@Param("themeNo")String themeNo);
	
	/**
	 *获取定时音乐 
	 * */
	List<Schedule> getScheduleMusic(Schedule schedule);
	
	
	List<Schedule> selectScheduleByphoneNum(@Param("phoneNum")String phoneNum);
	
	List<Schedule> selectScheduleBygatewayNo(@Param("gatewayNo")String gatewayNo);

	List<Schedule> selectScheduleByDeviceNo(@Param("deviceNo")String deviceNo);

	List<Schedule> selectScheduleByThemeNo(@Param("themeNo")String themeNo);

	List<Schedule> selectTodayAllScheduleByRiqi(Schedule schedule);
	
	List<Schedule> selectTodayAllScheduleByWeek(@Param("xingqi")String xingqi);

	List<Schedule> selectScheduleByRiQiShiJDeviceNo(Schedule schedule);
	
	List<Schedule> selectScheduleByRiQiShiJThemeNo(Schedule schedule);
	
	List<Schedule> selectScheduleByXingQiShiJDeviceNo(Schedule schedule);

	List<Schedule> selectScheduleByXingQiShiJThemeNo(Schedule schedule);
	
	
	
	/**
	 * 根据设备id 和 phonenum 查询定时任务
	 * */
	List<Schedule> getScheduleByDeviceNoAndPhoenNum(Schedule schedule);

	/**
	 * 根据情景id 和 phonenum 查询定时任务
	 * */
	List<Schedule> getScheduleByThemeNoAndPhoenNum(Schedule schedule);
	
	/**
	 * 根据手机号 和 state 获取定时任务       state=4 表示红外
	 * */
	List<Schedule> getScheduleByStateAndPhoneNum(Schedule schedule);

	/**
	 * 根据scheduleId获取到要删除的定时任务对象
	 * */
	List<Schedule> getScheduleByScheduleId(@Param("scheduleId")Integer scheduleId);
	
}