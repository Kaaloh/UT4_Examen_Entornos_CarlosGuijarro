
public class SumaArray {

	
	public int total;
	
	public int [] array= new int [6];
	
	
	
	public int resultado(int total, int[] array) {
		for (int i = 0; i < array.length; i++) {
			if (array[i]%10==1) {
				total = total + array[i];
			}
		}
		
		return total;
	}
}
