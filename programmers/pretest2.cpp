//중복없는 배열
//예 4 1 3 2
//배열의 길이 n =4
//1~4까지 숫자가 한번씩 들어있는지 확인
//return true
//예 4 1 3
//1~3까지 숫자가 한번씩 들어있는지 확인
//return false
/*
 방법1 . 첫번째 인덱스부터 마지막 인덱스까지 순회하면서 다음을 수행해 봅니다.
 1. 범위를 벗어나는 값이 있는지 확인해 보기
 2. 범위를 벗어나지 않는 값이 몇 번 등장하는지 체크하기
*/
/*
방법2 . 먼저 배열을 정렬합니다.
정렬된 배열을 순서대로 순회하면서 1부터 n까지의 숫자가 모두 있는지 확인합니다.
//->첫번째 원소부터 마지막 원소까지
//1부터n까지 숫자가 한번씩 나오는지
//없는 숫자,같은숫자 중복, 범위 벗어나는 숫자 나타나면 false 
*/
/*
#include<vector>
using namespace std;

int chk[100001] ={0}; //입력으로 들어오는 숫자가 10만 이고 그 이하 출력되는 자연수 10만 이하여서
bool solution(vector<int>arr)
{
    int n = arr.size(); //배열 길이 저장할 변수
    //배열의 각 원소 순회
    for(int i=0;i<n;++i)
    {
        //만약 배열을 벗어나는 숫자가 있다면
        if(arr[i] < 1 || arr[i] >n)
             return false;
        chk[arr[i]]++;//arr의 i번재 숫자가 check배열의 index로 들어가서 한개씩 들어가면 된다면 옳은 값이 나올 수 있게 만들어준다.
        //값이 몇번 나타났는지 갯수를 셈을 하게 된다.
    }
    //범위 벗어나는 값은 없으니까 1부터 n까지
    for(int i=1;i<=n;++i)
    {
        //체크 배열의 숫자가 1인지 확인
        if(chk[i]!= 1)
        return false;

    //1이 맞다면 true다
        return true;
    }
}
*/
/*
#include <vector>
#include <algorithm>
using namespace std;

bool solution(vector<int> arr)
{
    sort(arr.begin(),arr.end());
    for (int i = 0; i < arr.size(); ++i)
    //위에서 정렬을 시켜줬기 때문에 배열 인덱스0부터 숫자 1부터 비교를 하면 정확하게 일치하는지 확인 할 수 있다.
        if (arr[i] != i + 1)//배열에서는 0인 인덱스부터 비교가 되지만 숫자자체는 1부터 비교해야 하기 때문에 i+1를 해준것 위에 for문에서 i=0이다.
            return false;

    return true;
}
*/