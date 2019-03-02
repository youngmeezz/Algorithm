//cpp������ ���� ���� ��ŷ�� �� �ִ� ��ǻ�Ͱ����� ans�� ���� �ű⿡ �ε������� ��ǻ�� ��ȣ���� �װ��� ����ϵ��� ��Ÿ�� �־���.
#include <iostream>
#include <algorithm>
#include <vector>
using namespace std;
 
int N,M;
vector<int> graph[10001];
vector<int> visited; //�湮 ����
vector<int> hacking; //������ ��ǻ�� ��ȣ���� ��ŷ�� �� �ִ� ��ǻ�� ����
 
int ans=0; //���� ���� ��ŷ�� �� �ִ� ��ǻ�� ����
 
void dfs(int node){
    
    hacking[node]++;
    ans=max(ans,hacking[node]);
    
    for(int i=0;i<graph[node].size();i++){
        
        int next_node=graph[node][i];
        if(!visited[next_node]){
            visited[next_node]++;
            dfs(next_node);
        }
    }
}
int main(){
    
    scanf("%d %d",&N,&M);
    
    int s,e;
    for(int i=0;i<M;i++){
        scanf("%d %d",&s,&e);
        graph[s].push_back(e);
    }
    
    hacking=vector<int> (N+1,0);
    
    for(int i=1;i<=N;i++){
        visited=vector<int> (N+1,0); //�湮 �ʱ�ȭ
        
        visited[i]++;
        dfs(i);
    }
    
    for(int i=1;i<=N;i++){

       //���� ���� ��ŷ�� �� �ִ� ��ǻ�Ͱ����� ans�� ���� 
       //�ű⿡ �ε������� ��ǻ�� ��ȣ���� ��ǻ�Ͱ����� ����ũ��(ex 1���� (1,3,4,5)4���� ��ŷ�� �� �����ϱ�)�װ��� ����ϵ��� ��Ÿ�� �־���.
        if(hacking[i]==ans){
            printf("%d ",i);
        }
    }
    return 0;
}