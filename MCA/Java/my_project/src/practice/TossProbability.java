package practice;

public class TossProbability {
	public static void main(String[] args) {
		int head = 0;
		int tail = 0;
		float percentage = 0;
		for(int i = 0; i < 25; i++) {
			int x = (int)(Math.random()*2);
			if(x == 0) tail++;
			else head++;
		}
		percentage = ((float)head/(head + tail)) * 100;
		System.out.println("Head percentage : " + percentage + " %");
		percentage = ((float)tail/(head + tail)) * 100;
		System.out.println("Tail percentage : " + percentage + " %");
	}
}
