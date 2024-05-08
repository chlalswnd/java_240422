package question06;

public class Song_1 {
	String title;
	String artist;
	int year;
	String country;


	public Song_1(String title, String artist, int year, String country) {
	this.title = title;
	this.artist = artist;
	this.year = year;
	this.country = country;
}
	public Song_1() {}
	
	void show() {
		System.out.println(year+"년 "+ country + "국적의 " + artist + "가 부른 " + title);
	}

	public static void main(String[] args) {
		Song_1 song  = new Song_1("Dancing Queen", "ABBA", 1978, "스웨덴");
		song.show();
	}
}