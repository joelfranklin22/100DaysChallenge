#include<stdio.h>
#include<conio.h>

struct digit1
{
	int data;
	struct digit1 *next;
};
typedef struct digit1 digit;
digit *dig[10];
int n,rad[10];
void init()
{
	int i;
	for(i=0;i<10;i++)
	      dig[i]=NULL;
}
int lendig()
{
	int big=rad[0],i,len=0,div,temp;
	for(i=1;i<n;i++)
		if(big<rad[i])
			big=rad[i];
	printf("\nThe biggest number is %d\n",big);
	temp=big;
	for(div=10;temp>0;div*=10)
	{
		len++;
		temp=big/div;
	}
	printf("\nThe length is %d\n",len);
	return len;
}
void create(digit **dig,int val)
{

  digit *new,*temp;
  new=(digit*)malloc(sizeof(digit));
  new->data=val;
  new->next=NULL;
  if(*dig==NULL)
      *dig=new;
  else
  {
	temp=*dig;
	while(temp->next!=NULL)
		temp=temp->next;
	temp->next=new;
  }
}
void main()
{
	int i,big,temp,div,pos,j,len,rem;
	clrscr();

	printf("\n Enter the total values to sort: ");
	scanf("%d",&n);
	printf("\n Enter the elements\n");
	for(i=0;i<n;i++)
		scanf("%d",&rad[i]);
	len=lendig();div=1;
	for(j=1;j<=len;j++)
	{

		init();
		for(i=0;i<n;i++)
		{
		temp=rad[i];
		temp=temp/div;
		pos=temp%10;
		create(&dig[pos],rad[i]);
		}
		pos=0;
		for(i=0;i<10;i++)
		{
			while(dig[i]!=NULL)
			{
				rad[pos]=dig[i]->data;
				pos++;
				dig[i]=dig[i]->next;
			}
		}
		printf("\n The Sorted list is after %dth position\n",div);
		for(i=0;i<n;i++)
			printf("%d\t",rad[i]);
		div=div*10;
	}
	getch();

}