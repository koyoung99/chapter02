package com.javaex.ex10;

public class Tv {

	private int channel, volume;
	private boolean power;

	public Tv() {

	}

	public Tv(int channel, int volume, boolean power) {
		this.channel = channel;
		this.volume = volume;
		this.power = power;
	}

	public int getChannel() {
		return channel;
	}

	public void setChannel(int channel) {
		this.channel = channel;
	}

	public int getVolume() {
		return volume;
	}

	public void setVolume(int volume) {
		this.volume = volume;
	}

	public boolean isPower() {
		return power;
	}

	public void setPower(boolean power) {
		this.power = power;
	}

//	@Override
//	public String toString() {
//		return "Tv [channel=" + channel + ", volume=" + volume + ", power=" + power + "]";
//	}

	public void power(boolean on) {
		power = on;
	}

	public void volume(int volume) {
		if (volume < 0) {
			this.volume = 0;
		} else if (volume > 100) {
			this.volume = 100;
		} else {
			this.volume = volume;
		}
	}

	public void volume(boolean up) {
		if (up == true) {
			if (this.volume < 0) {
				this.volume = 0;
			} else if (this.volume > 100) {
				this.volume = 100;
			} else {
				this.volume++;
			}
		}
	}

	public void channel(boolean up) {
		if (up == true) {
			if (this.channel < 0) {
				this.channel = 0;
			} else if (this.channel > 100) {
				this.channel = 100;
			} else {
				this.channel++;
			}
		}
	}

	public void status() {
		System.out.println("채널=" + channel + ", 볼륨= " + volume + ", 전원=" + power);
	}

}
