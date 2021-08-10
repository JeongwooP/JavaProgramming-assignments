package ch05;

public class MyTime {
	private int hour, minute;
	public MyTime(String time) {
		hour = Integer.parseInt(time.substring(0, 2));
		minute = Integer.parseInt(time.substring(3));
	}
	public MyTime(int hour, int minute) {
		this.hour = hour;
		this.minute = minute;
	}
	public MyTime forward(int hour, int minute) {
		this.hour += hour;
		this.minute += minute;
		if(this.minute >= 60) {
			this.hour++;
			this.minute = this.minute - 60;
		}
		if(this.hour >= 24) {
			this.hour = this.hour - 24;
		}
		
		return this;
		
		/*
		 * MyTime t = new MyTime(this.hour, this.minute);
		 * t.hour += hour;
		 * t.minute += minute;
		 * if(t.minute >= 60){
		 *  t.hour ++;
		 *  t.minute = t.minute - 60;
		 * }
		 * if(t.hour > 24){
		 * 	t.hour = t.hour - 24;
		 * }
		 * return t; //비슷한 코드 보기
		 */
	}
	public MyTime backward(int hour, int minute) {
		this.hour -= hour;
		this.minute -= minute;
		if(this.hour < 0) {
			this.hour += 24;
		}
		if(this.minute < 0) {
			this.hour --;
			this.minute += 60;
		}
		return this;
	}
	public String toString() {
		return this.hour + "시" + this.minute + "분";
	}
}
