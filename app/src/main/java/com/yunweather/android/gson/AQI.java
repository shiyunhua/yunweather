package com.yunweather.android.gson;

/**
 * Created by Wilson on 2017/10/15.
 */

public class AQI {
	public AQICity city;

	public class AQICity{
		public String aqi;
		public String pm25;
	}
}
