/**
 *  Gets a command-line argument n (int), and prints an n-by-n damka board.
 */
public class DamkaBoard {
	public static void main(String[] args) {
		int n = Integer.parseInt(args[0]);
		for (int row = 0; row < n; row++ ){ 
			for (int col = 0; col < n; col++){
				System.out.print(row % 2 == 0 ? "* " : " *");
			}
			System.out.println("");

		}
	}
}
