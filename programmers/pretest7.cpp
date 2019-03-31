#include <string>
#include <vector>
#include <set>
#include <algorithm>

using namespace std;

int pretest7(vector<string> strs, string t)
{
    //vector에 있는 단어 조각들을 빠르게 탐색
    set<string> str_set(strs.begin(), strs.end());

    //무한대를 나타내는INF 변수
    const int INF = 987654321;

    //dp배열 선언
    int dp[20002];

    //문자열의 길이를 나타내는 len
    int len = t.length();

    for (int i = 0; i < len; i++)
        //dp배열 무한대로 초기화
        dp[i] = INF;
    //dp의 문자열의 마지막
    //문자열의 길이가 len이므로 문자열의 마지막 index는 len-1이 됩니다.
    dp[len] = 0;

    //문자열을 뒷쪽 방향부터 순서대로 순회한다.
    for (int i = len - 1; i >= 0; i--)
    {
        //i가 현재 가르키는 index부터 한개에서 5개를 이어붙힌 문자열을 이어붙히기 위해 변수 하나 선언
        string tmp = "";

        //길이가 1~5인 문자열을 저장하기 위한 for문 이때 i+j가 가리키는 위치와 문자열 전체 위치가 문자열 길이보다 크면 안됨
        for (int j = 0; i + j < len && j < 5; j++)
        {
            tmp += t[i + j]; //for문돌떄마다 이어붙힌 문자열 더할 수 있다.
            //현재 만들어진 문자열이 주어진 단어 조각에 있는지 확인하기 위함
            //포함되어 있다면 i+j+1번 위치부터 주어진 단어조각을 이용해서 만들수 있는지 확인해야합니다. 무한대가 아니라면
            if (str_set.find(tmp) != str_set.end() && dp[i + j + 1] != INF)
                //dp[i]값 갱신
                dp[i] = min(dp[i], dp[i + j + 1] + 1);
        }
    }
    //dp[0]가 무한대면 주어진 단어들로 만들수 없어서 -1 출력 아니라면 dp[0] 자체 출력 가능
    if (dp[0] == INF)
        return -1;
    return dp[0];
}
