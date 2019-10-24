package com.kang.exam.tv;

public class TvTest {
	
	public static void main(String[] args) {
		//객체화, 인스턴스
		Tv tv1 = new Tv(301, 25); //주소값 (레퍼런스 변수, 참조 변수)
		
		Tv tv2 = new Tv();
		tv2.setChannel(0);
		tv2.setVolume(-1);
		
		tv1.showState();
		tv2.showState();
		
		int volume = tv1.getVolume();
		System.out.println("tv1의 볼륨 : " + volume);
		
	}
}
