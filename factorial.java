#include <stdio.h>

int fact(int n)
{
	if(n == 0) 
		return 1;
	else 
		return n*fact(n-1);
}

int main(void)
{
	printf("1!=%d\n",fact(1));
	printf("2!=%d\n",fact(2));
	printf("3!=%d\n",fact(3));
	printf("4!=%d\n",fact(4));
	//printf("fact(5)=%d\n",fact(5));
	return 0;
}

