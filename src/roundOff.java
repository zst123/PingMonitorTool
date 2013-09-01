
public class roundOff {

	
	public static String get(String strtime){
	     double time_d = Double.parseDouble(strtime);
	     int trimmer = 0;
	     
	     if (time_d < 10){
	    	 trimmer = 1;
	     }else if (time_d < 100){
	    	 trimmer = 2;
	     }else{
	    	 int time_i = (int) time_d;
	    	 strtime = time_i + "";
	     }
	     
		String iiii=  strtime.substring(0, strtime.length()-trimmer);
		return iiii;
		
	}
}
