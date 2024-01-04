package com.javaex.ex05;

public class SongApp {

	public static void main(String[] args) {

		Song iu = new Song();

		iu.setArtist("아이유");
		iu.setTitle("Real");
		iu.setAlbum("좋은날");
		iu.setComposer("이민수");
		iu.setTrack("3번 track");
		iu.setYear(2010);

		Song bigBang = new Song();

		bigBang.setArtist("BIGBANG");
		bigBang.setTitle("Always");
		bigBang.setAlbum("거짓말");
		bigBang.setComposer("G-DRAGON");
		bigBang.setTrack("2번 track");
		bigBang.setYear(2007);

		Song buskerBusker = new Song();

		buskerBusker.setArtist("버스커버스커");
		buskerBusker.setTitle("버스커버스커1집");
		buskerBusker.setAlbum("벚꽃엔딩");
		buskerBusker.setComposer("장범준");
		buskerBusker.setTrack("4번 track");
		buskerBusker.setYear(2012);

		IU.showInfo();
		bigBang.showInfo();
		buskerBusker.showInfo();

	}

}
