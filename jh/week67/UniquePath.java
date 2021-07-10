public int uniquePath(int n, int m) {
		if(m==0 && n==0) return 0;
		if(m==1 && n==1) return 1;
		int[][] path = new int[n][m];

		for(int i = 0; i < n; i++) {
			for(int j = 0; j < m; j++) {
				if(i==0 || j == 0) path[i][j] = 1;
				else path[i][j] = path[i-1][j] + path[i][j-1];
			}
		}
		return path[n-1][m-1];
}
