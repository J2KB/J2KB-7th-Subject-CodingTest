package 박현성.박현성2주차;
import java.util.*;
import java.io.*;
public class Baek2667 {
	static int[] dx = {1, 0 ,0, -1};
	static int[] dy = {0, 1, -1, 0};
	static int n; // 지도 크기 
	static int[][] map;
	static boolean[][] visit;
	static int total = 0;  // 총 단지 수 
	static int cnt;
	static List<Integer> cnts = new ArrayList<>(); // 각 단지에 속하는 집의 수 
	
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		n = Integer.parseInt(br.readLine());
		map = new int[n][n];
		visit = new boolean[n][n];
		
		String str;
		for(int i = 0; i < n; i++) {
			str = br.readLine();
			for(int j = 0; j < n; j++) {
				map[i][j] = Integer.parseInt(str.split("")[j]);
			}
		}
		for(int i = 0; i < n; i++) {
			for(int j = 0; j < n; j++) {
				cnt = 0;
				if(map[i][j] == 1 && !visit[i][j]) {
					total++;
					cnt++;
					dfs(i, j);
					cnts.add(cnt);
				}
			}
		}
		System.out.println(total);
		Collections.sort(cnts);
		for(int i = 0; i < cnts.size(); i++) {
			System.out.println(cnts.get(i));
		}
	}

	private static void dfs(int i, int j) {
		visit[i][j] = true;
		for(int k = 0; k < 4; k++) {
			int nx = dx[k] + i;
			int ny = dy[k] + j;
			if(nx >= 0 && nx < n && ny >= 0 && ny < n) {
				if(!visit[nx][ny] && map[nx][ny] == 1) {
					cnt++;
					dfs(nx, ny);
				}
			}
		}
	}
}
