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

void hollowRectangle(int row, int column)
{
    for (int i = 0; i < row; i++)
    {
        for (int j = 0; j < column; j++)
        {
            if ((i == 0 || i == row - 1) || (j == 0 || j == column - 1))
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

void rightHalfTriangle(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = 0; j < i + 1; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}

void leftHalfTriangle(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = line; j > i; j--)
        {
            printf(" ");
        }
        for (int j = 0; j < i + 1; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}

void invertedRightHalfTriangle(int line)
{
    for (int i = line; i >= 0; i--)
    {
        for (int j = i - 1; j >= 0; j--)
        {
            printf("*");
        }
        printf("\n");
    }
}

void invertedLeftHalfTriangle(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = 0; j < i + 1; j++)
        {
            printf(" ");
        }
        for (int j = line; j > i; j--)
        {
            printf("*");
        }
        printf("\n");
    }
}

void floydTriangle(int line)
{
    int n = 1;
    for (int i = 0; i < line; i++)
    {
        for (int j = 0; j < i + 1; j++)
        {
            printf("%d ", n++);
        }
        printf("\n");
    }
}

int __factorial(int num)
{
    if (num <= 1)
    {
        return 1;
    }
    return num * __factorial(num - 1);
}

int __nCr(int n, int r)
{
    return __factorial(n) / (__factorial(r) * __factorial(n - r));
}

void pascalTriangle(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = line; j > i; j--)
        {
            printf(" ");
        }
        for (int k = 0; k <= i; k++)
        {
            printf("%d ", __nCr(i, k));
        }
        printf("\n");
    }
}

void binaryTriangle(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = 0; j < i + 1; j++)
        {
            if ((i + j) % 2 == 0)
            {
                printf("0");
            }
            else
            {
                printf("1");
            }
        }
        printf("\n");
    }
}

void pyramid(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = line; j > i; j--)
        {
            printf(" ");
        }
        for (int j = 0; j < i + 1; j++)
        {
            printf("*");
        }
        for (int j = 1; j < i + 1; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}

void invertedPyramid(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }
        for (int j = line; j > i; j--)
        {
            printf("*");
        }
        for (int j = line - 1; j > i; j--)
        {
            printf("*");
        }
        printf("\n");
    }
}

void hollowPyramid(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = line; j > i; j--)
        {
            printf(" ");
        }
        printf("*");

        for (int j = 1; j < i * 2 + 1; j++)
        {
            if (j == i * 2 || i == line - 1)
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

void invertedHollowPyramid(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = 0; j < 2 * i + 1; j++)
        {
            printf(" ");
        }
        for (int k = 0; k < 2 * (line - i) - 1; k++)
        {
            if (k == 0 || k == 2 * (line - i) - 2 || i == 0)
                printf("* ");
            else
                printf("  ");
        }
        printf("\n");
    }
}

void diamond(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = line; j > i; j--)
        {
            printf(" ");
        }
        for (int j = 0; j < i; j++)
        {
            printf("*");
        }
        for (int j = 1; j < i; j++)
        {
            printf("*");
        }
        printf("\n");
    }
    for (int i = 0; i < line; i++)
    {
        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }
        for (int j = line; j > i; j--)
        {
            printf("*");
        }
        for (int j = line - 1; j > i; j--)
        {
            printf("*");
        }
        printf("\n");
    }
}

int main()
{
    diamond(5);
    return 0;
}
