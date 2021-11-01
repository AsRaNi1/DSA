#include <iostream>
using namespace std;

void Tail_Recurssion(int x)
{
	if(x>-5)
	{
		cout<<x<<" ";
	}
	Tail_Recurssion(x-1);
}

int main()
{
	Tail_Recurssion(5);
}
