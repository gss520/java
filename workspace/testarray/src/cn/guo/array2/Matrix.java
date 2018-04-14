package cn.guo.array2;

public class Matrix {
	//输出二维数组结果
	public static void print(int[][] c){
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c.length;j++){
				System.out.print(c[i][j]+"\t");
				
			}
			System.out.println();
		}
	}
	//矩阵加法
	public static int[][] add(int[][] a,int[][] b){
		int[][] c = new int[a.length][a.length];
		for(int i=0;i<c.length;i++){
			for(int j=0;j<c.length;j++){
				c[i][j] = a[i][j]+b[i][j];
				
			}
		}
		return c;
	}
	
	public static void main(String[] args) {
		int[][] a = {
				{1,3,3},
				{2,4,9},
				{2,4,9}
		};
		int[][] b = {
				{3,4,3},
				{5,6,3},
				{5,6,3}
		};
		int[][] c = add(a,b);
		print(c);
	}
}
