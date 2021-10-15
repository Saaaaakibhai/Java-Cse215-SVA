package LAB05;

public class Task05 {

	public static void main(String[] args) {
		
		int[] count = {0,0,0,0,0,0,0,0,0,0};
		for (int i = 1; i <= 100; i++) {
			int rnum = (int) (Math.random()*(9-0+1)+0);
			switch(rnum) {
			case 0:
				count[0]++;
				break;
			case 1:
				count[1]++;
				break;
			case 2:
				count[2]++;
				break;
			case 3:
				count[3]++;
				break;
			case 4:
				count[4]++;
				break;
			case 5:
				count[5]++;
				break;
			case 6:
				count[6]++;
				break;
			case 7:
				count[7]++;
				break;
			case 8:
				count[8]++;
				break;
			case 9:
				count[9]++;
				break;
			}
		}
		
		//int sum = 0;
		for (int i = 0; i < count.length; i++) {
			//sum += count[i];
			System.out.println(i+"s: "+count[i]);
		}
		//System.out.println(sum);
	}

}
