package com.kang.exam.tv;

public class TvTest4 {
	public static void main(String[] args) {
		LGTv lgtv = new LGTv();
		
		Tv tv = lgtv;
		
		tv = new SamsungTv();
		
		LGTv lgtv2 = (LGTv)tv;
	}
}
