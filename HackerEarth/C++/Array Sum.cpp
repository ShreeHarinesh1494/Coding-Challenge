Problem : Print the sum of the elements in the array. 

Solution :
  
#include <iostream>
using namespace std;
int main() {
	int n;
	cin>>n;
	long a[n];
	for(int i=0;i<n;i++)
	{
		cin>>a[i];
	}
	long sum=0;
	for(int i=0;i<n;i++)
	{
		sum+=a[i];
	}
	cout<<sum;
}
