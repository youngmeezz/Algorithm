#include<iostream>

using namespace std;
int main(int argc, const char * argv[]){

    for(int test = 1;test<=10;test++){
        cin>>test;
        int A[100][100]; //�켱 100x100����� ������༭ �ʱ�ȭ�� ����� �Ѵ�.
        int goal;
        for(int i=0;i<100;i++){
            for(int j=0;j<100;j++){
                cin>>A[i][j];
                if(A[i][j] == 2){ //2�� �������� ������ �ǹ��ϱ� ������ goal������ �ǰ� �װŸ� �������迭 j�� �־��ش�?
                    goal = j;
                }
            }
        }
        //goal = A[99][j]
        //�켱 �� ������ ������ ����� ������ ��������
        int x,y; //int�ڷ����� x,y �� x,y�ĸ� ���� ���θ� ǥ���ҋ� x,y�� ����.
        int answer = -1;//int �ڷ����� ���� ã�� ������ -1�� �ϴ� ������
        int count =0;//���� ������ int���� ���°� ���� �� ���ڸ� ���ĸ� ���� ������ ��ٸ� Ÿ�� ���� ���� ���� ���ߵǴµ� ������ 1�εΰ� ���� ���� ���� ���� 2�� ������ �Ǽ�
        int mini = 1000000;//�ּ� �迭 ����1000x1000�� ������ �����ϱ� 1000000

//� ������ Ÿ���� ��� ���� � �ڷᱸ���� ������� ���� ���Ѵ�.
        for(int i=99;i>=0;i--){ //�켱 100x100�� �迭���� �ϳ��� �����ذ��鼭 � ���� ������ �����غ��� 
            y=0;//y=0���� �״ϱ� ó�� ������ 1������ �����ϴϱ�  (�� ����)
            x=i;//x�� �ϳ��� �پ�鼭 ���� �ٲ�� �Ǵ°Ű� ��ٸ��� �������� ��(����)�� ���ؾ���
            count =0;//���� ���°��� 0���� ����
            if(A[y][x] ==1){
                while(y!=99){ //99������ �Ȱ��� ���(�� ������)
                    if(x>0 && A[y][x-1] ==1){
                        while(x>0 && A[y][x-1] !=0){
                            x-=1;
                            count +=1;
                        }
                    }
                else if(x<99 && A[y][x+1] ==1){
                    while(x<99 && A[y][x+1] !=0){
                        x+=1;//�̰� ���� �Ȱ� ���̸� �����ִ� ��쵵 �ֳ�? �̰� Ȥ�� ��ٸ� Ÿ�� �ʱ�ȭ ���ؼ� �����ִ°ǰ�
                        count +=1;
                    }
                }
                y+=1;   //1���̾��ٰ� ���� ���������� ��ȭ(2��,3��....)
                count +=1;//������ �ϳ��� ����� �ϴ°� ������ �̵��ϸ鼭 ��ٸ� �̵��� 1�� ������� �ϴϱ�
                }
                if(count < mini){
                    mini = count;
                    answer = i;
                }
            }
        }
        cout<<"#"<<test<<" "<<answer<<"\n";
    }
    return 0;
}

    //�������� �ùķ��̼�
    //��ٸ� Ÿ�� �ùķ��̼� �������?
    //static int map[][];
    //static 
    //�ùķ��̼��� �� �� ���س����� ���� �� �ִ��� �˾ƺ���
    //�ڹ� ���� c++Ǯ�̰� ���Ƽ� c++�� Ǯ���