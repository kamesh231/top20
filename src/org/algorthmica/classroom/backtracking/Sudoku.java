package org.algorthmica.classroom.backtracking;

public class Sudoku {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[][] in = {
				{0,0,9,0,0,0,0,0,6},
				{0,0,0,0,3,7,0,0,4},
				{4,7,0,9,0,0,2,0,0},
				{0,0,0,5,0,6,0,7,0},
				{1,0,0,0,8,0,0,0,3},
				{0,4,0,2,0,3,0,0,0},
				{0,0,8,0,0,9,0,1,5},
				{5,0,0,6,2,0,0,0,0},
				{6,0,0,0,0,0,8,0,0}
				
		};
		sudokuSolver2(in);

	}
	//Use backtracking on top of recursion. By placing data in an array
	public static void sudokuSolver2(int[][] n) {
		auxSolver2(0,0,n);
	}
	
	private static void auxSolver2(int r,int c,int[][] n) {
		if (r == 9) {
			
				display(n);
		}
		if (n[r][c] != 0) {
			auxSolver1(c == 8 ? r + 1 : r, (c + 1)%9, n);
		} else {
			for (int d = 1; d <= 9; ++d) {
				if (isValid2(r,c,d,n))
				n[r][c] = d;
				auxSolver1(c == 8 ? r + 1 : r, (c + 1)%9, n);
			}
			n[r][c]=0;
		}
		
	}
	
	private static boolean isValid2(int r,int c, int d,int[][] n) {
		//row check
		for (int j=0;j<9;++j) {
			if (n[r][j]==d) return false;
		}
		//col check
		for (int i=0;i<9;++i) {
			if (n[i][c] ==d) return false;
		}
		
		//box check
		int startRow = r/3 *3;
		int startCol = c/3 *3;
		for (int i=0;i<3;++i) {
			for (int j=0;j<3;++j) {
				if(n[startRow+i][startCol+j]==d) {
					return false;
				}
			}
		}
		return true;
	}
	
//Using plain recursion
	public static void sudokuSolver1(int[][] n) {
		auxSolver1(0, 0, n);
	}
//This is different from n queens problem as we need to verify each and every point rather than only two points
	//That reason we have only 2 for loops in n queens rather here we have n loops to verify all points
	private static void auxSolver1(int r, int c, int[][] n) {
		if (r == 9) {
			if (isValid(n))
				display(n);
		}
		if (n[r][c] != 0) {
			auxSolver1(c == 8 ? r + 1 : r, (c + 1)%9, n);
		} else {
			for (int d = 1; d <= 9; ++d) {
				n[r][c] = d;
				auxSolver1(c == 8 ? r + 1 : r, (c + 1)%9, n);
			}
			n[r][c]=0;
		}
	}
//Row check to verify the numbers are 1 to 9 only in a row
	//Column check to verify the numbers are 1 to 9 only in a  column
	//Box check to verify the numbers are 1 to 9 in 3 X3 grid
	private static boolean isValid(int[][] n) {
		//row checking
		for (int r=0;r<9;++r) {
			if(rowDuplicateCheck(r,n))
				return false;
		}
		
		//column checks
		for (int c=0;c<9;++c) {
			if(columnDuplicateCheck(c,n))
				return false;
		}
		//Box checks
		for (int r=0;r<9;r+=3) {
			for (int c=0;c<9;c+=3) {
			 if (boxDuplicateCheck(r,c,n)) return false;	
			}
		}
		return true;
	}
	
	private static boolean rowDuplicateCheck(int r,int[][] n) {
		int[] tmp = new int[10];
		for (int j=0;j<9;j++) {
			if (tmp[n[r][j]]!=0) {
				return true;
			}
			else
				tmp[n[r][j]]=1;
		}
		return false;
	}
	
	private static boolean columnDuplicateCheck(int c,int[][] n) {
		int[] tmp = new int[10];
		for (int j=0;j<9;j++) {
			if (tmp[n[j][c]]!=0) {
				return true;
			}
			else
				tmp[n[j][c]]=1;
		}
		return false;
	}

	private static boolean boxDuplicateCheck(int r,int c,int[][] n) {
		int[] tmp = new int[10];
		
		for (int i=0;i<3;++i) {
			for (int j=0;j<3;++j) {
				if(tmp[n[r+i][c+j]]!=0) {
					return true;
				}
				else 
					tmp[n[r+i][c+j]]=1;
			}
		}
		return false;
	}
	private static void display(int[][] n) {
		for (int i = 0; i < n.length; i++) {
			for (int j = 0; j < n.length; j++) {
				System.out.print(n[i][j] + " ");
			}
			System.out.println();
		}
	}

}
