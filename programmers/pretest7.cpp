#include <string>
#include <vector>
#include <set>
#include <algorithm>

using namespace std;

int pretest7(vector<string> strs, string t)
{
    //vector�� �ִ� �ܾ� �������� ������ Ž��
    set<string> str_set(strs.begin(), strs.end());

    //���Ѵ븦 ��Ÿ����INF ����
    const int INF = 987654321;

    //dp�迭 ����
    int dp[20002];

    //���ڿ��� ���̸� ��Ÿ���� len
    int len = t.length();

    for (int i = 0; i < len; i++)
        //dp�迭 ���Ѵ�� �ʱ�ȭ
        dp[i] = INF;
    //dp�� ���ڿ��� ������
    //���ڿ��� ���̰� len�̹Ƿ� ���ڿ��� ������ index�� len-1�� �˴ϴ�.
    dp[len] = 0;

    //���ڿ��� ���� ������� ������� ��ȸ�Ѵ�.
    for (int i = len - 1; i >= 0; i--)
    {
        //i�� ���� ����Ű�� index���� �Ѱ����� 5���� �̾���� ���ڿ��� �̾������ ���� ���� �ϳ� ����
        string tmp = "";

        //���̰� 1~5�� ���ڿ��� �����ϱ� ���� for�� �̶� i+j�� ����Ű�� ��ġ�� ���ڿ� ��ü ��ġ�� ���ڿ� ���̺��� ũ�� �ȵ�
        for (int j = 0; i + j < len && j < 5; j++)
        {
            tmp += t[i + j]; //for���������� �̾���� ���ڿ� ���� �� �ִ�.
            //���� ������� ���ڿ��� �־��� �ܾ� ������ �ִ��� Ȯ���ϱ� ����
            //���ԵǾ� �ִٸ� i+j+1�� ��ġ���� �־��� �ܾ������� �̿��ؼ� ����� �ִ��� Ȯ���ؾ��մϴ�. ���Ѵ밡 �ƴ϶��
            if (str_set.find(tmp) != str_set.end() && dp[i + j + 1] != INF)
                //dp[i]�� ����
                dp[i] = min(dp[i], dp[i + j + 1] + 1);
        }
    }
    //dp[0]�� ���Ѵ�� �־��� �ܾ��� ����� ��� -1 ��� �ƴ϶�� dp[0] ��ü ��� ����
    if (dp[0] == INF)
        return -1;
    return dp[0];
}
