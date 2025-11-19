#include <stdio.h>

void solidSquare(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = 0; j < line; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}

void hollowSquare(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = 0; j < line; j++)
        {
            if ((i == 0 || i == line - 1) || (j == 0 || j == line - 1))
            {
                printf("*");
            }
            else
            {
                printf(" ");
            }
        }
        printf("\n");
    }
}
void numberSquare(int line)
{
    for (int i = 1; i <= line; i++)
    {
        for (int j = 1; j <= line; j++)
        {
            printf("%d ", i);
        }
        printf("\n");
    }
}

void solidRectangle(int row, int column)
{
    for (int i = 1; i <= row; i++)
    {
        for (int j = 1; j <= column; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}

int main()
{
    solidRectangle(5, 3);
    return 0;
}