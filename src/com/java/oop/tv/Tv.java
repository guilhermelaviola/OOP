package com.java.oop.tv;

public class Tv {
	
	public int sound;
	public int channel;
	public boolean on;
	
	public void turnTvOn() {
		if (!this.on) {
			this.on = true;
			this.channel = 1;
			this.sound = 30;
		} else {
			this.on = false;
		}
	}
	
	public void displayInfo() {
		if (on) {
			System.out.println("Channel: " + this.channel + " | Sound : " + this.sound);
		}
	}
	
	public void displaySound() {
		if (on) {
			System.out.println("Sound: " + sound);
		}
	}
	
	public void displayChannel() {
		if (on) {
			System.out.println("Channel: " + channel);
		}
	}
	
	public void switchChannelDown() {
		if (on) {
			channel = channel - 1;
			displayChannel();
		}
	}
	
	public void switchChannelUp() {
		// It'll only work if the TV is on
		if (on) {
			// Maximum is 99
			if (channel < 99) {
				channel = channel + 1;
				displayChannel();
			}
		}
	}
	
	public void decreaseSound() {
		sound = sound - 1;
		displaySound();
	}
	
	public void increaseSound() {
		sound = sound + 1;
		displaySound();
	}
	
	public void switchChannel(int channel) {
		if (this.on) {
			if (this.channel != channel) {
				if (this.channel > channel) {
					for (int i = this.channel; i > channel; i--) {
						switchChannelDown();
					}
				} else {
					do {
						switchChannelUp();
					} while (this.channel < channel);
						/*
						 * int i = this.channel;
						* 	while(i < channel) {
						*	switchChannelUp();
						*	i++;
						*}
						*/
				}
			}
		}
	}
}
