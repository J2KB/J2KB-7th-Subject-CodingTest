package 박현성.박현성3주차;

import java.util.*;
import java.io.*;

public class Baek1012 {
	static int[] dx = {0, 1, -1, 0};
	static int[] dy = {1, 0, 0, -1};
	static int[][] map;
	static boolean[][] visit;
	static int cnt, M, N, K;
	static Queue<int[]> que = new LinkedList<int[]>();
	
	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		int test = Integer.parseInt(br.readLine());
		
		for(int c = 0 ; c < test; c++) {
			StringTokenizer st = new StringTokenizer(br.readLine());
			M = Integer.parseInt(st.nextToken());
			N = Integer.parseInt(st.nextToken());
			K = Integer.parseInt(st.nextToken());
			
			map = new int[M][N];
			visit = new boolean[M][N];
			cnt = 0;
			
			for(int i = 0; i < K; i++) {
				st = new StringTokenizer(br.readLine());
				map[Integer.parseInt(st.nextToken())][Integer.parseInt(st.nextToken())] = 1;
			}
			
			for(int i = 0; i < M; i++) {
				for(int j = 0; j < N; j++) {
					if(map[i][j] == 1 && !visit[i][j]) {
						BFS(i, j);
						cnt++;
					}
				}
			}
			System.out.println(cnt);
		}
	}

	private static void BFS(int i, int j) {
		que.add(new int[] {i, j});
		
		while(!que.isEmpty()) {
			i = que.peek()[0];
			j = que.peek()[1];
			visit[i][j] = true;
			
			que.poll();
			for(int k = 0; k < 4; k++) {
				int nx = dx[k] + i;
				int ny = dy[k] + j;
				
				if(nx >= 0 && nx < M && ny >= 0 && ny < N) {
					if(map[nx][ny] == 1 && !visit[nx][ny]) {
						que.add(new int[] {nx, ny});
						visit[nx][ny] = true;
					}
				}
				
			}
				
		}
	}
}
