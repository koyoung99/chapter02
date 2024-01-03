package com.javaex.ex05;

public class Song {

	// 필드
	private String title, artist, album, composer, track;
	private int year;

	// 생성자
	// 메소드
	public void setTitle(String title) {
		this.title = title;
	}

	public void setArtist(String artist) {
		this.artist = artist;
	}

	public void setAlbum(String album) {
		this.album = album;
	}

	public void setComposer(String composer) {
		this.composer = composer;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public void setTrack(String track) {
		this.track = track;
	}

	public String getTitle() {
		return this.title;
	}

	public String getArtist() {
		return this.artist;
	}

	public String getAlbum() {
		return this.album;
	}

	public String getComposer() {
		return this.composer;
	}

	public int getYear() {
		return this.year;
	}

	public String getTrack() {
		return this.track;
	}

	public void showInfo() {
		System.out.println(this.artist + ", " + this.album + " (" + this.title + ", " + this.year + ", " + this.track
				+ ", " + this.composer + " 작곡)");
	}
}
