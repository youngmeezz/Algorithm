package baekjoon;


import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
public class baekjoon15683{
    static int n,m;
    static int[][] arr;
    static List<Pair> list = new ArrayList<>();
    public static void main(String[] args) throws IOException{
     
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt(); //���� ũ��
        m = sc.nextInt(); //���� ũ��
        arr = new int[n][m];
        copy = new int[n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
                if(arr[i][j]>0&&arr[i][j]<6)
                    list.add(new Pair(i,j,arr[i][j],0));
                    }
                }
                //cctv�����鼭 ��� ��츦 ���캸��
                result = 10;
                solve(0);
                System.out.println(result);
            }
            static int[][] copy;
            private static void init(){
                for(int i=0;i<n;i++){
                    for(int j=0;j<m;j++)
                        copy[i][j] = arr[i][j];
                }
            }

            //�� �� �� ��
            static int[][] dir = {{0,1},{1,0},{0,-1},{-1,0}};
            private static void check(Pair t){
                int tx = t.x,ty = t.y;
                switch(t.n){
                    case 1: //����
                        while(true)
                        {
                            tx = tx+dir[t.r][0];
                            ty = ty+dir[t.r][1];
                            if(tx<0 || ty<0 || tx>=n || ty>=m) break; 
                            //���ÿ��� �ٲ��ֱ�
                            if(copy[tx][ty]==0) copy[tx][ty] =-1;
                            //�� ���� ��� ����
                            else if(copy[tx][ty]==6) break;
                        }
                        break;
                    case 2 : //����
                        for(int i=0;i<3;i+=2){
                            tx = t.x;ty = t.y;
                            while(true){
                                tx = tx+dir[(t.r+i)%4][0];
                                ty = ty+dir[(t.r+1)%4][1];
                                if(tx<0 || ty<0 || tx>=n || ty>=m)break;
                                //���ñ��� �ٲ��ֱ�
                                if(copy[tx][ty]==0)copy[tx][ty] = -1;
                                //�� ���� ��� ����
                                else if(copy[tx][ty]==6) break;
                            }
                        }
                        break;
                    case 3: //��
                        for(int i=0;i<2;i++){
                            tx = t.x;
                            ty = t.y;
                            while(true){
                                tx = tx+dir[(t.r+i)%4][0];
                                ty = tx+dir[(t.r+i)%4][1];
                                if(tx<0 || ty<0 || tx>=n || ty>=m)break;
                                //���� ���� �ٲ��ֱ�
                                if(copy[tx][ty]==0)copy[tx][ty]=-1;
                                //���� ���� ��� ����
                                else if(copy[tx][ty]==6)break;
                            }
                        }
                        break;
                    case 4: //��
                        for(int i=0;i<3;i++){
                            tx = t.x;
                            ty = t.y;
                            while(true){
                                tx = tx+dir[(t.r+i)%4][0];
                                ty = ty+dir[(t.r+i)%4][1];
                                if(tx<0 || ty<0 || tx>=n || ty>=m) break;
                                //���ñ��� �ٲ��ֱ�
                                if(copy[tx][ty]==0) copy[tx][ty]=-1;
                                //���� ���� ��� ����
                                else if(copy[tx][ty]==6)break;
                            }
                        }
                        break;
                    case 5: //+
                        for(int i=0;i<4;i++){
                            tx = t.x;
                            ty = t.y;
                            while(true){
                                tx = tx+dir[(t.r+i)%4][0];
                                ty = ty+dir[(t.r+i)%4][1];
                                if(tx<0 || ty<0 || tx>=n || ty>=m) break;
                                //���ñ��� �ٲ��ֱ�
                                if(copy[tx][ty]==0) copy[tx][ty]=-1;
                                //�� ������� ����
                                else if(copy[tx][ty]==6) break;
                            }
                        }
                        break;
                }
            }
            static int result;
            private static void solve(int idx){
                //idx�� ���� �����ϸ� ������ ����� ���� �ľ�
                if(idx>=list.size()){
                    //copy�迭 �ʱ�ȭ
                    init();
                    for(Pair t:list)
                        check(t);
                    int cnt=0;
                    for(int i=0;i<n;i++){
                        for(int j=0;j<m;j++)
                            if(copy[i][j]==0)cnt++;
                    }
                    result = Math.min(result,cnt);
                    return;
                }
                //������ 0 1 2 3 ���� ����
                for(int i=0;i<=3;i++){
                    list.get(idx).r = i;
                    solve(idx+1);
                }
            }
            static class Pair{
                private int x,y,n,r;
                Pair(int x,int y, int n, int r){
                    this.x = x;
                    this.y = y;
                    this.n = n;
                    this.r = r;

                }
            }
        }
*/
/*
static int n, m, ans = Integer.MAX_VALUE;
static int[][] map;
static ArrayList<Node> list = new ArrayList<Node>();
 
private void solve() {
    n = sc.nextInt();
    m = sc.nextInt();
    map = new int[n][m];
 
    for (int i = 0; i < n; i++) {
        for (int j = 0; j < m; j++) {
            int v = sc.nextInt();
            map[i][j] = v;
            if (1 <= v && v <= 5) {
                list.add(new Node(i, j, v));
            }
        }
    }
    search(0, map);
    System.out.println(ans);
}
 
public static void search(int cctvIndex, int[][] prev) {
    int[][] visited = new int[n][m];
    if (cctvIndex == list.size()) {
        int temp = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                if (prev[i][j] == 0) {
                    temp++;
                }
            }
        }
        if (temp < ans) {
            ans = temp;
        }
    } else {
        Node node = list.get(cctvIndex);
        int idx = node.idx;
        int x = node.x;
        int y = node.y;
 
        switch (idx) {
            case 1:
                for (int k = 0; k < 4; k++) {
                    for (int i = 0; i < n; i++) {
                        visited[i] = Arrays.copyOf(prev[i], m);
                    }
                    detect(visited, y, x, k);
                    search(cctvIndex + 1, visited);
                }
                break;
            case 2:
                for (int k = 0; k < 2; k++) {
                    for (int i = 0; i < n; i++) {
                        visited[i] = Arrays.copyOf(prev[i], m);
                    }
                    detect(visited, y, x, k);
                    detect(visited, y, x, k + 2);
                    search(cctvIndex + 1, visited);
                }
                break;
            case 3:
                for (int k = 0; k < 4; k++) {
                    for (int i = 0; i < n; i++) {
                        visited[i] = Arrays.copyOf(prev[i], m);
                    }
                    detect(visited, y, x, k);
                    detect(visited, y, x, (k + 1) % 4);
                    search(cctvIndex + 1, visited);
                }
                break;
            case 4:
                for (int k = 0; k < 4; k++) {
                    for (int i = 0; i < n; i++) {
                        visited[i] = Arrays.copyOf(prev[i], m);
                    }
                    detect(visited, y, x, k);
                    detect(visited, y, x, (k + 1) % 4);
                    detect(visited, y, x, (k + 2) % 4);
                    search(cctvIndex + 1, visited);
                }
                break;
            case 5:
                for (int i = 0; i < n; i++) {
                    visited[i] = Arrays.copyOf(prev[i], m);
                }
                detect(visited, y, x, 0);
                detect(visited, y, x, 1);
                detect(visited, y, x, 2);
                detect(visited, y, x, 3);
                search(cctvIndex + 1, visited);
                break;
        }
    }
}
 
public static void detect(int[][] visited, int i, int j, int direction) {
    switch (direction) {
        case 0:
            for (int k = j; k >= 0; k--) {
                if (map[i][k] == 6) {
                    break;
                }
                visited[i][k] = 7;
            }
            break;
        case 1:
            for (int k = i; k >= 0; k--) {
                if (map[k][j] == 6) {
                    break;
                }
                visited[k][j] = 7;
            }
            break;
        case 2:
            for (int k = j; k < m; k++) {
                if (map[i][k] == 6) {
                    break;
                }
                visited[i][k] = 7;
            }
            break;
        case 3:
            for (int k = i; k < n; k++) {
                if (map[k][j] == 6) {
                    break;
                }
                visited[k][j] = 7;
            }
            break;
    }
}
 
public static class Node {
    int x;
    int y;
    int idx;
 
    Node(int y, int x, int idx) {
        this.x = x;
        this.y = y;
        this.idx = idx;
    }
}
*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
 
class baekjoon15683 {
    static int N;
    static int M;
    static int[][] arr;
    static int[][] temp;
    static ArrayList<Dot> list;
    static int size;
    static int[] output;
    static int count;
    static int result;
 
    public static void main(String[] args) throws Exception {
 
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String[] str = br.readLine().split(" ");
        N = Integer.parseInt(str[0]);
        M = Integer.parseInt(str[1]);
        arr = new int[N][M];
        temp = new int[N][M];
        list = new ArrayList<Dot>();
        count = 0;
        result = Integer.MAX_VALUE;
        for (int i = 0; i < N; i++) {
            str = br.readLine().split(" ");
            for (int j = 0; j < M; j++) {
                arr[i][j] = Integer.parseInt(str[j]);
                temp[i][j] = arr[i][j];
                if (arr[i][j] != 6 && arr[i][j] != 0) {
                    //cctv �϶� ����Ʈ�� �����Ѵ�.
                    list.add(new Dot(i, j));
                }
 
            }
        }
        
        //------�Էº�------//
        size = list.size();    //cctv ����
        output = new int[size];    //��� ������ ������� �迭
        
        //cctv�� �������� ������
        if (size == 0) {
            Check();
            result = count;
        }
        //cctv�� �����Ҷ�
        else {
            for (int i = 0; i < 4; i++) {
                //cctv ���� ��� ���� ����� ���ش�.
                output[0] = i + 1;
                allCase(i, 0);
            }
        }
        System.out.println(result);
 
    }
    //allCase �Լ��� cctv�� �����ϴ� ��� ����� ���� ����� ���� ����Ѵ�.
    public static void allCase(int start, int depth) {
        if (depth == size - 1) {
            for (int i = 0; i < size; i++) {
                Dot d = list.get(i);
                // 1���� N���� cctv�� ��� ������.
                Watch(d, arr[d.x][d.y], output[i]);
 
            }
            Check(); //�簢���밡 �󸶳� �ִ��� üũ
            result = Math.min(result, count);    //�簢���밡 �ּ��϶� ����
            Reset();    //�����ϴ� ��� �ʱ�ȭ
            return;
        }
 
        for (int i = 0; i < 4; i++) {
            //������ ����� ���� ���
            output[depth + 1] = i + 1;
            allCase(i, depth + 1);
        }
 
    }
    
    //Wacth �Լ��� cctv�� ������ ������ ���� �����ϴ� ��ġ�� �����ش�.
    public static void Watch(Dot d, int num, int dir) {
        if (num == 1) {
            if (dir == 1) {
                Move(d, 1);
            } else if (dir == 2) {
                Move(d, 2);
            } else if (dir == 3) {
                Move(d, 3);
            } else if (dir == 4) {
                Move(d, 4);
            }
 
        } else if (num == 2) {
            if (dir == 1) {
                Move(d, 1);
                Move(d, 3);
            } else if (dir == 2) {
                Move(d, 2);
                Move(d, 4);
            } else if (dir == 3) {
                Move(d, 1);
                Move(d, 3);
            } else if (dir == 4) {
                Move(d, 2);
                Move(d, 4);
            }
        } else if (num == 3) {
            if (dir == 1) {
                Move(d, 1);
                Move(d, 2);
            } else if (dir == 2) {
                Move(d, 2);
                Move(d, 3);
            } else if (dir == 3) {
                Move(d, 3);
                Move(d, 4);
            } else if (dir == 4) {
                Move(d, 4);
                Move(d, 1);
            }
        } else if (num == 4) {
            if (dir == 1) {
                Move(d, 1);
                Move(d, 2);
                Move(d, 3);
            } else if (dir == 2) {
                Move(d, 2);
                Move(d, 3);
                Move(d, 4);
            } else if (dir == 3) {
                Move(d, 3);
                Move(d, 4);
                Move(d, 1);
            } else if (dir == 4) {
                Move(d, 4);
                Move(d, 1);
                Move(d, 2);
            }
        } else if (num == 5) {
            Move(d, 1);
            Move(d, 2);
            Move(d, 3);
            Move(d, 4);
        }
 
    }
    
    
    //Move �Լ��� DFS�� ���� �� ������ �����Ѵ�.
    //2���� �迭�� ���� �ٲ��ش�.
    public static void Move(Dot d, int dir) {
 
        int currentX = d.x;
        int currentY = d.y;
        int nextX = currentX;
        int nextY = currentY;
 
        if (dir == 1) {
            nextX = currentX - 1;
            nextY = currentY;
        } else if (dir == 2) {
            nextX = currentX;
            nextY = currentY + 1;
        } else if (dir == 3) {
            nextX = currentX + 1;
            nextY = currentY;
        } else if (dir == 4) {
            nextX = currentX;
            nextY = currentY - 1;
        }
        //���� ��ġ�� ���� ���� ���� ����
        if (nextX < 0 || nextY < 0 || nextX >= N || nextY >= M) {
            return;
        }
        //���� ��ġ�� ���̶�� ����
        if (arr[nextX][nextY] == 6) {
            return;
        }
        //���� ��ġ�� 0�϶��� 1�� �ٲ����� ������ ���ڴ� �ٲ��� �ʰ� �Ѿ��.
        //���ڸ� �ٲٰ� �Ǹ� ���� list�� ����Ҷ� ������ �����.
        //��Ȯ���� Move �Լ��� num���� �ٲ�Ƿ� �ٲ��� �ʰ� �Ѿ��.
        if (arr[nextX][nextY] == 0) {
            arr[nextX][nextY] = 1;
        }
        Move(new Dot(nextX, nextY), dir);
 
    }
    
    //�簢���밡 �󸶳� �ִ��� üũ�ϴ� �Լ�
    public static void Check() {
        count = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                if (arr[i][j] == 0) {
                    count++;
                }
            }
        }
    }
    //2���� �迭�� �ʱ�ȭ �ϴ� �Լ�
    public static void Reset() {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < M; j++) {
                arr[i][j] = temp[i][j];
            }
        }
    }
}
 
class Dot {
    int x;
    int y;
 
    Dot(int x, int y) {
        this.x = x;
        this.y = y;
    }
}
