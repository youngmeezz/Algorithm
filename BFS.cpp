//BFS�� '�͸����� Ž��'�� �� �� ���
//�ʺ� �켱 Ž���� '�ִ� ���'�� ã�� �شٴ� ������ �ִ� ���̸� �����ؾ� �� �� ���� ���
//���� �̷�ã�� �� ���� �˰����򿡼� ���
//�ʿ��� �غ��� ť�̴�. ������� �°��� ���� �������ٴ� Ư¡ ������ bfs�� ���� �ϰ� ���ִ� Ư¡�� �ִ�.
//��ó���� ���� ���(Start Node)�� ť�� �����ϸ鼭 �����մϴ�.
//���� ���� ��带 �湮 �ߴٰ� '�湮ó��'�� ���ֵ��� �մϴ�.


#include<iostream> //C++ stl library ���ű⋚���� ���� ���
#include<queue>
#include<vector>//���� �̿��ؼ� �����͸� ������ �� �ְ� ������ش�.

using namespace std;

int number =7; //�⺻������ �ٷﺻ ���� ����7��
int c[7]; //�湮 üũ�� ���� �湮 �ߴ� �ǹ̸� ���� checked�迭
vector<int> a[8]; //7+1��ŭ vector�� �� �迭 ������� �� ����� �ε����� 1���� ó�� �ɼ� �ֵ��� 1~7���� �ε����� ó���� �� �ְ� 8���� �ǹ̸� �а�

//BFS �˰�����
/*
1. ť���� �ϳ��� ��带 �����ϴ�.
2. �ش� ��忡 ����� ��� �� �湮���� ���� ��带 �湮�ϰ�, ���ʴ�� ť�� �����մϴ�.
*/
//�̸� 1,2���� �ݺ����ش�.
void bfs(int start){
    queue<int> q; //�ϳ��� ť�� ������ش�.
    q.push(start); //ť�� �������� �־��ݴϴ�.
    c[start] = true;  //�湮 ó���� ���� ���̴�.
    while(!q.empty()){ //���� �ݺ� ������ �ϸ� �ȴ�. ť�� �� ���� �ݺ�
        int x = q.front(); //ť���� �ϳ��� ������ ����x�� ����ݴϴ�.
        q.pop(); 
        printf("%d ", x);//�� ���� x�� ������ݴϴ�.
        for(int i=0;i<a[x].size();i++){ //i=0���� ���� queue���� ���� ���ҿ� ������ ���� ������ �ϳ��� �湮�ϸ鼭 
            int y = a[x][i]; //�湮�� �� ���¶�� ������
            if(!c[y]){ // �湮�� ���� ���� ���¶��
                q.push(y); //ť�� ����ָ� �˴ϴ�. 
                c[y] = true; //�� ������ �湮 ó���� ���ش�.
            }
        }
    }
}

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
    
    bfs(1);

    return 0;
}
//ť���� ���� ������ 1,2,3,4,5,6,7�̴�.
//�̷��� �Ÿ����� 4,5,6,7�� �������� Ž���ϰ� �ȴ�.
//�Ÿ��� ������ ���� Ž���� �̷������. �Ÿ��� 1�ΰ� 2,3���� Ž��
//1�� ����� ������� Ž���� �ϰ� �ȴ�.
//���� �̷��� �ʺ� �켱 Ž���� ��ü�� ū �ǹ̰� ����
//������ �ٸ� �˰����� ����ȴٴ� ���� �ٽ��Դϴ�.
//bfs�� Ž������� �ϳ��� �� �̰������� �پ��ϰ� ������ �� ���̴�.