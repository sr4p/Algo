public class EightQueen {
	static int BoardSize = 8;
	static int Diagonal = (2 * BoardSize - 1);
	static int DownOffset = (BoardSize - 1);

	static int QueenCol[] = new int[BoardSize];
	static boolean ColFree[] = new boolean[BoardSize];
	static boolean UpFree[] = new boolean[Diagonal];
	static boolean DownFree[] = new boolean[Diagonal];

	static int Q = -1;
	static int Sol = 0;

	public static void main(String[] args) {
		for (int i = 0; i < BoardSize; ++i)
			ColFree[i] = true;

		for (int i = 0; i < Diagonal; ++i) {
			UpFree[i] = true;
			DownFree[i] = true;
		}

		AddQueen();
	}

	public static void AddQueen() {

		int i;

		Q++;
		
		for (i = 0; i < BoardSize; ++i) {
			
			if (ColFree[i] && UpFree[Q + i] && DownFree[Q - i + DownOffset]) {
				QueenCol[Q] = i;
				ColFree[i] = false;
				UpFree[Q + i] = false;
				DownFree[Q - i + DownOffset] = false;

				if (Q == BoardSize - 1) {
					System.out.println("Solution no: " + ++Sol);
					WriteBoard(QueenCol, BoardSize);
				} else {
					AddQueen();
				}
				
				ColFree[i] = true;
				UpFree[Q + i] = true;
				DownFree[Q - i + DownOffset] = true;
			}
		}
		Q--;
	}

	public static void WriteBoard(int[] board, int size) {
		int i, j;

		Line(size);
		for (i = 0; i < size; ++i) {
			System.out.print("|");
			for (j = 0; j < size; ++j) {
				if (j == board[i])
					System.out.print(" X |");
				else
					System.out.print("   |");
			}
			System.out.println();
			Line(size);
		}
	}

	public static void Line(int length) {
		System.out.print("+");
		for (int k = 0; k < length; ++k)
			System.out.print("---+");
		System.out.println();
	}
}
