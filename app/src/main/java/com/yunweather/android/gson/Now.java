package com.yunweather.android.gson;

import com.google.gson.annotations.SerializedName;

/**
 * Created by Wilson on 2017/10/15.
 */

public class Now {
	@SerializedName("tmp")
	public String temperature;

	@SerializedName("cond")
	public More more;

	public class More{
		@SerializedName("txt")
		public String info;
	}
}
