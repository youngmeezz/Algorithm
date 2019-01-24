#include<iostream>
#include<vector>

using namespace std;

int isRange(int x, int y);
void Permutation(int depth, int idx);
void dfs(int x, int y);

int N,M;
int map[8][8];
int copymap[8][8];
int dir[4][2] = {{-1,0},{1,0},{0,-1},{0,1}};
int answer = -1;

vector<int> v;
int candidate[3];

int main(){

    cin >> N >> M;

    for(int i=0; i < N;i++)
        for(int j=0;j<M;j++)
        {
            cin >> map[i][j];
            if(map[i][j] == 0)
            v.push_back(10*i + j);
        }
        Permutation(0,0);

        cout << answer;
}

void Permutation(int depth, int idx)
{
    if(depth == 3)
    {
         for(int i=0;i<N;i++)
            for(int j=0;j<M;j++)
                copymap[i][j] = map[i][j];
            for(int i=0;i<3;i++)
               copymap[candidate[i]/10][candidate[i] % 10] = 1;

            for(int i=0;i<N;i++)
                for(int j=0;j<M;j++)
                    if(copymap[i][j] ==2)
                        dfs(i,j);
            int cnt =0;

            for(int i=0;i<N;i++)
                for(int j=0;j<M;j++)
                    if(copymap[i][j] ==0)
                        cnt++;

            if(cnt > answer)
                answer = cnt;
                return;
    }

    for(int k= idx;k<v.size();k++)
    {
        candidate[depth] = v[k];
        Permutation(depth + 1, k+1);
    }
}


void dfs(int x, int y)
{
    for(int i=0;i<4;i++)
    {
        int nx = x + dir[i][0];
        int ny = y + dir[i][1];

        if(isRange(nx,ny))
            if(copymap[nx][ny]==0)
            {
                copymap[nx][ny] = 2;
                dfs(nx,ny);
            }
    }
} 

int isRange(int x, int y)
{
    if(x<0 || x>=N || y <0 ||y >=M)
    return 0;
    return 1;
}