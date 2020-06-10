public class TimeTest{
	
	public static void main(String[] args) {
		Time1 time = new Time1();
		time.setTime(19,23,43);
		
		
		
	}
	
	
	
}


class Time1 {
	
	private int hour;
	private int minute;
	private int second;
	
	public void setTime(int h, int m, int s) {
		
		if((h>=0 && h<24) && (m>=0 && m<60) && (s>=0 && s<60)) {
			hour = h;
			minute = m;
			second = s;
			}
		System.out.printf("%02d:%02d:%02d%s",(h==0||h==12)?12:h%12,m,s,(h<12)?" AM":" PM");
	}

}
