//���� �켱 Ž���� �ʺ�켱 Ž���� ���������� �͸������� �� ��� Ž���ҋ� �ַ� ���˴ϴ�.
//�ʺ� �켱 Ž�������� Queue�� ��� �Ǿ��ٸ�
//���� �켱 Ž�������� Stack�� ����ϸ� �˴ϴ�.
//���Ҿ� ������ ������� �ʾƵ� ������ �����ϴٴ� Ư¡�� �ֽ��ϴ�.
//��ǻ�� ������ �׻� ������ ������ ����ϱ� �����Դϴ�.
//��ǻ�� ��ü�� �����������̶�� �ؼ� ���� ������ ���Ǳ� ������ ���� �̿������ʰ� ����Լ������ε� ���̿켱 Ž���� �����ϴ�.

//����Լ��� ���� ������ stack�̶�� ��ǻ�� ���� ó�� ���� �ְ��� �ݺ��ϴ� �����̱⋚���� ����ϸ� ����.
#include<iostream>
#include<vector>

using namespace std;

//����� ������ 7��
int number = 7;
//�湮ó���� ���� check�迭7��
int c[7];
//vector���� �� index 8��ŭ �迭�� ũ�⸦ ������־
vector<int> a[8];

//�� 7���� ��尡 ���� ������ ��带 ������ �ֵ��� ����� �־���.
void dfs(int x){
    if(c[x]) return; //���� �� ��带 �湮�ߴٸ� �̷��� return���༭ �ٷ� �Լ��� ���� �� �ֵ��� ���ش�.
    c[x] = true;//�� ��带 ó�� �湮�ϴ� �Ŷ�� �̷��� �湮 ó���� ���ָ� �ȴ�.
    cout << x << ' '; //���� �� ��带 ����� �� �ְ� ���ָ� �ȴ�.
    //���� ��带 �ϳ��� �湮�� �ϸ鼭 
    for(int i=0;i<a[x].size();i++){
        //���� ��带 ������� �ؼ� dfs�� �����ϸ� �ȴ�.
        int y = a[x][i];
        dfs(y); //����ؼ� �ڱ�� ������ ��带 �ݺ��Ѵ�.dfs�� �����ϸ鼭 ���̿켱Ž���� �������� ����ϰ� ��.
    }
}
//DFS�� ������ ���� ������ �˰����� ���� �۵� �մϴ�.
/*
1. ������ �ֻ�� ��带 Ȯ���մϴ�.(���� �������� ���� ���)
2. �ֻ�� ��忡�� �湮���� ���� ���� ��尡 ������ �� ��带 ���ÿ� �ְ� �湮ó�� �մϴ�.
3. �湮���� ���� ������尡 ������ ���ÿ��� �ֻ�� ��带 �N�ϴ�.
���� ��� �߿��� ���� ���� (����) ���ڰ� �ִ� ���� �ۼ�
*/
//����������̴� �����������̶� ���� �����̱⋚���� �ְ� ������ ���� �ǹ�
/*
void dfs(int x){
    if(c[x]) return;
    c[x] = true;
    cout << x << ' ';
    for(int i=0;i<a[x].size();i++){
        int y = a[x][i];
        dfs(y);
    }
}
*/
int main(void){
    a[1].push_back(2);
    a[2].push_back(1);

    a[1].push_back(3);
    a[3].push_back(1);

    a[2].push_back(3);
    a[3].push_back(2);

    a[2].push_back(4);
    a[4].push_back(2);
    
    a[2].push_back(5);
    a[5].push_back(2);

    a[3].push_back(6);
    a[6].push_back(3);

    a[3].push_back(7);
    a[7].push_back(3);

    a[4].push_back(5);
    a[5].push_back(4);

    a[6].push_back(7);
    a[7].push_back(6);
    
    dfs(1);
//������,�Ϻ���ȹ,
    return 0;
}
//�� dfs�� ������ �׷��� �˰������� Ȱ���� �� �ִ�
//�� ��ü�δ� ū �ǹ̰� ���� DFS�� Ȱ���ؼ� ������ �ذ��ϰ��� �ϴ� �Ϳ� �־����� �ξ��� �ִ�.
//�۵� ������ �����ϰ� �˾Ƶ���
//���� ������ ���� ������� �ʰ� ����Լ��� �̿��� �����ϰ� �Լ��� ������ �� �ֵ�.
//���ÿ��� ���� ������  1,2,3,6,7,4,5�̴�.(3,6,7)���� ���� (2,4,5)���߿� ����.