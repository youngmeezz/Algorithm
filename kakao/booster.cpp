#include<iostream>
#include<vector>
#include<queue>
#include<algorithm>
#include<cstring>
#include<functional>
using namespace std;

const int MAX = 250000 + 1;

int N,Q;
vector<pair<int, int>> coord;
vector<int> ySort, xSort;
priority_queue< pair<int,pair<int,int>>, vector<pair<int,pair<int,int>>>, greater<pair<int, pair<int,int>>>> pq; //가중치 , {a,b}
int parent[MAX];
bool answer[MAX];

//Union Find
int find(int a){

    if(parent[a]<0)
        return a;
    return parent[a] = find(parent[a]);
}
void merge(int a, int b)
{
    a = find(a);
    b = find(b);

    if(a == b)
        return;

    if(parent[a]<parent[b])
        swap(a,b);
    parent[b] += parent[a];
    parent[a] = b;
}
int main(void)
{
    ios_base::sync_with_stdio(0);
    cin.tie(0);
    cin>>N>>Q;

    memset(parent, -1,sizeof(parent));
    for(int i=0;i<N;i++)
    {
        int y,x;
        cin >> y >> x;
        coord.push_back({y,x});
        ySort.push_back(i);
        xSort.push_back(i);

    }

    //ySort에 y좌표가 작은 순서대로 인덱스 저장
    sort(ySort.begin(), ySort.end(), [&](int &a, int &b){
        if(coord[a].first !=coord[b].first)
            return coord[a].first<coord[b].first;
        return coord[a].second<coord[b].second;
    });

    //xSort에 x좌표가 작은 순서대로 인덱스 저장
    sort(xSort.begin(), xSort.end(), [&](int &a, int &b){
        if(coord[a].second != coord[b].second)
            return coord[a].second<coord[b].second;
        return coord[a].first < coord[b].first;
    });

    //우선 순위 큐에 간선들을 {가중치, {a,b}} 형태로 집어 넣는다
    for(int i=0;i<N-1;i++){
        int a = ySort[i];
        int b = ySort[i+1];
        pq.push({abs(coord[a].first - coord[b].first),{a,b}});
    }
    for(int i=0;i<N-1;i++){
        int a = xSort[i];
        int b = xSort[i+1];
        pq.push({abs(coord[a].second - coord[b].second),{a,b}});
    }
    //쿼리를 {{가중치, {A,B}, 쿼리의 번호}}로 저장
    //가중치의 오름 차순으로 정렬
    vector<pair<pair<int,pair<int,int>>,int>>query;
    for(int i=0;i<Q;i++){
        int a,b,c;
        cin >> a >> b >> c;
        query.push_back({{c,{a-1,b-1}},i});
    }
    sort(query.begin(), query.end());

    for(int i = 0;i<query.size();i++){
        pair<int, pair<int,int>> temp = query[i].first;
        int c = temp.first;
        int a = temp.second.first;
        int b = temp.second.second;

        //큐에서 현재 가중치보다 작거나 같은 간선이 있으면
        //꺼내서 합쳐준다.
        while(!pq.empty())
        {
            int curC = pq.top().first;
            if(curC > c)
                break;
            merge(pq.top().second.first,pq.top().second.second);
            pq.pop();
        }
        answer[query[i].second] = (find(a) == find(b));
    }

    for(int i=0;i<Q;i++)
        if(answer[i])
            cout <<"YES\n";
        else
        {
            cout << "NO\n";
        }
        return 0;
        
    }

