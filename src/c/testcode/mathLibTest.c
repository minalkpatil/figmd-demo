#include<stdio.h>
#include<mathlib/mathlib.h>


void addTest()
{
    int n1 = 18;
    int n2 = 9;

    if(27 == add(n1, n2))
    {
        printf ("SUCCESS: library function add is working \n"); 
    }
    else
    {
        printf ("FAILURE: library function add failed for integers \n");
    }
}

void subTest()
{
    int n1 = 18;
    int n2 = 9;
    int ans = sub(n1, n2);

    if(9 == ans)
    {
        printf ("SUCCESS: library function substraction is working \n");
    }
    else
    {
        printf ("FAILURE: library function substraction failed for integers. Expected 9 got %d\n", ans);
    }
}

void multTest()
{
    int n1 = 18;
    int n2 = 9;
    int ans = multiply(n1, n2);

    if(162 == ans)
    {
        printf ("SUCCESS: library function multiply is working \n");
    }
    else
    {
        printf ("FAILURE: library function multiply failed for integers Expected 162 got %d\n", ans);
    }
}

void divTest()
{
    int n1 = 18;
    int n2 = 9;
    int ans = divison(n1, n2);

    if(2 == ans)
    {
        printf ("SUCCESS: library function add is working \n");
    }
    else
    {
        printf ("FAILURE: library function add  failed for integers Expected 2 got %d\n", ans);
    }
}




int main(int argc, char * argv[])
{
    printf ("Started running unit test cases....\n");
    addTest();
    subTest();
    multTest();
    divTest();
    printf ("Unit test cases complted.... \n");
    return 0;
}
