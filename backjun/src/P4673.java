import java.util.ArrayList;

public class P4673 {

	public int selfNum(int num) {
		int newNum = 0;
		String strNum = Integer.toString(num);
		String[] split = strNum.split("");
		
		for (int i = 0; i < split.length; i++) {
			newNum += Integer.parseInt(split[i]);
		}
		
		newNum += num;
		
		return newNum;
	}
	
	public void solution() {
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for (int i = 1; i <= 10000; i++) {
			arr.add(i);
		}
		
		for (int i = 1; i <= arr.size(); i++) {
			if (arr.contains(selfNum(i))) {
				arr.remove(selfNum(i) - 1);
				arr.add(0, selfNum(i) - 1);
			}
		}
		
		arr.forEach(System.out::println);
	}
	
	public static void main(String[] args) {
		P4673 p = new P4673();
		p.solution();
		
		
	}
}
