public class Test05 {
	public static void main(String[] args) {

		int[][] arr = { 
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 1, 1, 1, 0, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 1, 0, 0, 0 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
				{ 0, 1, 1, 1, 1, 1, 1, 1, 1, 0 },
				{ 0, 0, 1, 1, 1, 1, 1, 1, 0, 0 },
				{ 0, 0, 0, 1, 1, 1, 1, 0, 0, 0 },
				{ 0, 0, 0, 0, 1, 0, 0, 0, 0, 0 },
				{ 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 }
			};
		
		for (int i = 1; i < arr.length-1; i++) {
			System.out.println();
			for (int j = 1; j < arr[i].length-1; j++)
				if (arr[i][j] != 0
					&& arr[i][j] <= arr[i-1][j]
					&& arr[i][j] <= arr[i+1][j]
					&& arr[i][j] <= arr[i][j+1]
					&& arr[i][j] <= arr[i][j-1]) {
					
					arr[i][j] = arr[i][j] + 1;
					System.out.print(arr[i][j]);
				} else {
					arr[i][j] = arr[i][j];
					System.out.print(arr[i][j]);
				}
				
		}

	}

}
