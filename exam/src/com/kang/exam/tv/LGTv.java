package com.kang.exam.tv;

public class LGTv extends Tv {

	public static String model;

	public LGTv() {
	}

	public LGTv(String str) {
		model = str;
	}

	public void record() {
		System.out.println("녹화를 하고 있습니다.");
	}

	public String toString() {
		return "LGTV임 !!";
	}
	
	void showState() {
		System.out.println("!!!!!!!");
	}
}
