Problem : You need to find and print the Factorial of this number.

Solution :
  
#include <iostream>
using namespace std;

int factorial(int n)
{
	if(n==0 || n==1)
	{
		return 1;
	}
	else
	{
		return n*factorial(n-1);
	}
}

int main()
{
	int n;
	cin>>n;
	cout<<factorial(n);
}
	
