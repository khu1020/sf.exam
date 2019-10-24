package com.kang.exam.tv;

// private, default, protected, public
//사용자 정의 클래스
public class Tv {
	protected int channel;
	protected int volume;

	Tv() {
	}

	Tv(int channel, int volume) {
		setChannel(channel);
		setVolume(volume);
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
		if (channel > 300) {
			this.channel = 300;
		} else if (channel < 1) {
			this.channel = 1;
		}
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
		if (volume > 20) {
			this.volume = 20;
		} else if (volume < 0) {
			this.volume = 0;
		}
	}

	void showState() {
		System.out.printf("channel : %d, volume: %d \n", channel, volume);
	}

	void channelUp() {
		channel++;
	}

	void channelDown() {
		channel--;
	}

	void volumeUp() {
		volume++;
	}

	void volumeDown() {
		volume--;
	}

}
