//자연수 N의 1의 자리 숫자를 구하면
//10으로 나눈 나머지를 구하면 된다.
//1의 자리 숫자를 구하기 123 % 10 = 3;
//필요 없어진 1의 자리 숫자를 제거하고 1의 자리를 제거하기 위해서 10으로 나눈 몫을 계산
//123 / 10 = 12 -> 이는 123의 10의 자리와 100의 자리를 오른쪽으로 한칸 이동한 결과와 같다
//12의 1의자리를 구하면 123의 10의자리를 구한것과 같다.


//예제 123
//123 % 10 = 3 ->1의 자리 구함
//123 / 10 = 12
//12 % 10 = 2 ->10의 자리 구함
//12 / 10 = 1
//1 % 10 = 1 -> 100의 자리 구함
//1 / 10 = 0 -> 더이상 이동시킬 자리수가 없다는 사실을 알게 됨
//각 자리수 3 2 1 을 더한 6을 리턴하면 됩니다.
#include <iostream>

using namespace std;
int pretest1(int n){

    int sum = 0;
    while(n>0)
    {
        sum += n % 10;
        n /= 10;
    }
    return sum;
}
int main(){

    int n;

    scanf("%d",&n);

    printf("%d\n", pretest1(n));
    return 0;
}