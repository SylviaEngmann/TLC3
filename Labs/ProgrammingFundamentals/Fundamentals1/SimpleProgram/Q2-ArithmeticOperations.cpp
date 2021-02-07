#include <iostream>
#include <algorithm>

using namespace std;


int mode_func(int arr[], int num_array)
{
	int maxValue, maxCount;
	for (int x=0; x < num_array; x++)
	{
		int count = 0;
		for (int y=0; y< num_array; y++)
		{
		  if (arr[x] == arr[y])
		  {
			  count++;
		  }
		}
		if (count > maxCount)
		{
			maxCount = count;
			maxValue = arr[x];
		}
	}
	return maxValue;
}

int median_func(int arr[], int num_array)
{
	sort(arr, arr+num_array);
	if(num_array % 2!=0)
		return arr[num_array/2];

	return (arr[(num_array-1)/2] + arr[num_array/2])/2;
}

int mean_func(int a, int b, int c, int d, int e){
	int result;
	result = (a+b+c+d+e)/5;

	return result;
}

int main()
{
	int a,b,c,d,e;

	cout <<"Please enter five numbers: ";
	cin >> a >> b >> c >> d >> e;
	int array_num[] = {a,b,c,d,e};                                                                                               int n = sizeof(array_num) / sizeof(array_num[0]);                                                                    

    cout << "The mean is: " << mean_func(a,b,c,d,e) << "\n";
	cout << "The median is: " << median_func(array_num, n) << "\n";
    cout << "The mode is: " << mode_func(array_num, n) << "\n";

}