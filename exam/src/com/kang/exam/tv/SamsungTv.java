package com.kang.exam.tv;

public class SamsungTv extends Tv {
	void channelUp() {
		setChannel(channel + 5);
	}

	public String toString() {
		return String.format("%stv의 채널 : %d, 볼륨 : %d", "삼성", channel, volume);
	}
}
