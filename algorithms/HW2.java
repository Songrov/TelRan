package telran.homework.algorithms;
/*
Временная сложность:

void test1(int n)
{
   if (n==1)
      return;
   for (int i=1; i<=n; i++)
       for (int j=1; j<=n; j++)
           System.out.println("*");
           break;
}
Ответ O(n)


void test2(int n)
{
   int a = 0;
   for (i = 0; i < n; i++)
      for (j = n; j > i; j--)
          a = a + i + j;

}  Ответ O(n2)-- О от n в квадрате



Level 2
Какова временная сложность?
void test3(int n)
{
   int i, j, a = 0;
   for (i = n/2; i <=n; i++)
      for (j = 2; j <=n; j=j*2)
          a=a+n/2;
}  Ответ O(log.n)



*void test4(int n)
{
   int a = 0, i = n;
   while (i > 0) {
      a += i;
      i /= 2;
   }
}  Ответ O(log.n)

 */



public class HW2 {
}
