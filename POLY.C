#include<stdio.h>
#include<conio.h>
struct poly
{
int coeff;
int exponent;
struct poly *next;
};
struct poly *p1=NULL,*p2=NULL,*psum=NULL;
void create(struct poly **p,int c,int e)
{
	struct poly *new,*temp;
	int ch;
	new=(struct poly*)malloc(sizeof(struct poly));
	new->coeff=c;
	new->exponent=e;
	new->next=NULL;
	if(*p==NULL)
		*p=new;
	else
	{
		temp=*p;
		while(temp->next!=NULL)
			temp=temp->next;
		temp->next=new;
	}

}
void print(struct poly **p)
{
	struct poly *temp=*p;
	printf("\n The list is\n");
	while(temp->next!=NULL)
	{
		printf("%dx^%d+",temp->coeff,temp->exponent);
		temp=temp->next;
	}
	printf("%dx^%d\n",temp->coeff,temp->exponent);
}
/*void sum(struct poly **p1,struct poly **p2,struct poly **p3)
{
	struct node *new,*temp1=*p1,*temp2=p2;
	new=(struct poly*)malloc(sizeof(struct poly));
	new->next=NULL;
	while(temp1!=NULL && temp2!=NULL)
	{
		while*/
void main()
{
	int coe,exp,ch;
	clrscr();
	printf("\n Create list1\n");
	do
	{
		printf("\n Enter the coefficient:  ");
		scanf("%d",&coe);
		printf("\n Enter the exponent in descending order");
		scanf("%d",&exp);
		create(&p1,coe,exp);
		printf("\n Do you want to continue, Press 1");
		scanf("%d",&ch);
	}while(ch==1);


	printf("\n Create list2\n");
	do
	{
		printf("\n Enter the coefficient:  ");
		scanf("%d",&coe);
		printf("\n Enter the exponent in descending order");
		scanf("%d",&exp);
		create(&p2,coe,exp);
		printf("\n Do you want to continue, Press 1");
		scanf("%d",&ch);
	}while(ch==1);
	printf("\n print list1\n");
	print(&p1);
	getch();
	printf("\n print list2\n");
	print(&p2);
	getch();
//	sum(&p1,&p2,&psum);
}




