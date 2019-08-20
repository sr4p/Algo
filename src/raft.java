import java.util.ArrayList;
import java.util.Scanner;

public class raft {
	static int row;
	static int col;
	static int arr[][];
	static int ar[][];
	
	ArrayList<String> va = new ArrayList<>();
	public static boolean ra(int x,int y) {
		int count = 0;
		if (x < 0 || x >= row || y < 0 || y >= col)
			return false;
		
		if(count == 6)
			return false;
		
		if()
		
		count ++;
		
		
		
		if (ra(x - 1, y))
			return true;
		if (ra(x + 1, y))
			return true;
		if (ra(x, y - 1))
			return true;
		if (ra(x, y + 1))
			return true;
		
		
		
		return false;
		
	}
	
	
	
	
	
	public static void main(String[] args) {
		
		Scanner kb = new Scanner(System.in);

		arr = new int[5][5];
		ar = new int[5][5];

		for (int i = 0; i < row; i++)
			for (int j = 0; j < col; j++)
				arr[i][j] = kb.nextInt();
		
		
		
	}

}
