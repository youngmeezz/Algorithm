//DFS->조합, 브루트포스
#include<iostream>
#include<vector>
#include<queue>
using namespace std;
bool CHECK=false;
int MIN=11;
int N,M;
bool move(int way,vector<string> v,int &G_i,int &G_j){ //0=east 1=west 3=south 2=north
	if(way==0){
		while(v[G_i][G_j+1]!='#'&&v[G_i][G_j+1]!='R'&&v[G_i][G_j+1]!='B'){
			G_j++;
			if(v[G_i][G_j]=='O'){
				return true; 
			}
		}	
	}else if(way==1){
		while(v[G_i][G_j-1]!='#'&&v[G_i][G_j-1]!='R'&&v[G_i][G_j-1]!='B'){
			G_j--;
			if(v[G_i][G_j]=='O') return true;
		}	
	}else if(way==2){
		while(v[G_i-1][G_j]!='#'&&v[G_i-1][G_j]!='R'&&v[G_i-1][G_j]!='B'){
			G_i--;
			if(v[G_i][G_j]=='O') return true;
		}	
	}else if(way==3){
		while(v[G_i+1][G_j]!='#'&&v[G_i+1][G_j]!='R'&&v[G_i+1][G_j]!='B'){
			G_i++;
			if(v[G_i][G_j]=='O') return true;
		}
	}
	return false;
}
int DFS(vector<string> v,int R_i,int R_j,int B_i,int B_j,int count){
	int pri,prj,pbi,pbj;
	bool two=false;
	if(count>10) return 0;
	count++;
	pri=R_i,prj=R_j;
	pbi=B_i,pbj=B_j;
	for(int i=0;i<4;i++){
		two=move(i,v,R_i,R_j);
		if(two){
			v[pri][prj]='.';
		}else{
			v[pri][prj]='.',v[R_i][R_j]='R';
		}
		if(move(i,v,B_i,B_j)){
			if(!two){
				v[R_i][R_j]='.';
				v[pri][prj]='R';
			}else{
				v[pri][prj]='R';
			}
			R_i=pri,R_j=prj,B_i=pbi,B_j=pbj;
			two=false;
			continue;
		}else{
			v[pbi][pbj]='.';v[B_i][B_j]='B';
		}
		if(!two){
			v[R_i][R_j]='.';
			CHECK=move(i,v,R_i,R_j);
			if(CHECK){
				v[pri][prj]='.';
			}else if(pri==B_i&&prj==B_j){
				v[R_i][R_j]='R';
			}else
				v[pri][prj]='.';v[R_i][R_j]='R';
		}
		if(CHECK||two){
			if(MIN>count) 
				MIN=count;
			return 0;
		}
		if(pri==R_i&&prj==R_j&&pbi==B_i&&pbj==B_j){

		}
		else{
			DFS(v,R_i,R_j,B_i,B_j,count);
		}
		if(pri==B_i&&prj==B_j){
			v[R_i][R_j]='.';
			v[pbi][pbj]='B';
			v[pri][prj]='R';
		}else if(R_i==pbi&&R_j==pbj){
			v[B_i][B_j]='.';
			v[pri][prj]='R';
			v[pbi][pbj]='B';
		}else{
			v[R_i][R_j]='.';
			v[pri][prj]='R';
			v[B_i][B_j]='.';
			v[pbi][pbj]='B';
		}
		R_i=pri,R_j=prj,B_i=pbi,B_j=pbj;
		two=false;
		CHECK=false;
	}
}
int main(){
	ios_base::sync_with_stdio(0);
	cin.tie(0);cout.tie(0);
	int R_i,R_j,B_i,B_j;
	string s;
	cin>>N>>M;
	vector<string> v;

	for(int i=0;i<N;i++){
		cin>>s;
		v.push_back(s);
		for(int j=0;j<M;j++){
			if(v[i][j]=='R') R_i=i,R_j=j;
			else if(v[i][j]=='B') B_i=i,B_j=j;
		}
	}
	DFS(v,R_i,R_j,B_i,B_j,0);
	if(MIN<11){
		cout<<MIN<<'\n';
	}else
		cout<<"-1\n";
	return 0;
}


