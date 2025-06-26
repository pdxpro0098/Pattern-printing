#include <stdio.h>

void printSolidSquare(int lines)
{
    for (int i = 0; i < lines; i++)
    {
        for (int j = 0; j < lines; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}

void printSolidRectangle(int rows, int columns)
{
    for (int i = 0; i < columns; i++)
    {
        for (int j = 0; j < rows; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}

void floydTriangle(int lines)
{
    int num = 1;
    for (int i = 0; i < lines; i++)
    {
        for (int j = 0; j <= i; j++)
        {
            printf("%d ", num);
            num++;
        }
        printf("\n");
    }
}

void rightHalfTriangle(int lines)
{
    for (int i = 0; i <= lines; i++)
    {
        for (int j = 0; j < i; j++)
        {
            printf("*");
        }
        printf("\n");
    }
}

void reverseRightHalfTriangle(int lines)
{
    for (int i = lines; i > 0; i--)
    {
        for (int j = i; j > 0; j--)
        {
            printf("*");
        }
        printf("\n");
    }
}

void leftHalfTriangle(int lines)
{
    for (int i = lines; i >= 0; i--)
    {
        for (int j = i; j > 0; j--)
        {
            printf(" ");
        }
        for (int k = lines; k > i; k--)
        {
            printf("*");
        }
        printf("\n");
    }
}

void reverseLeftHalfTriangle(int lines)
{
    for (int i = 0; i < lines; i++)
    {
        for (int j = 0; j < i; j++)
        {
            printf(" ");
        }
        for (int k = lines; k > i; k--)
        {
            printf("*");
        }
        printf("\n");
    }
}

void printPyramid(int lines)
{
    for (int i = lines; i >= 0; i--)
    {
        for (int l = i; l > 0; l--)
        {
            printf(" ");
        }
        for (int k = lines; k > i; k--)
        {
            printf("*");
        }
        for (int j = lines - 1; j > i; j--)
        {
            printf("*");
        }
        printf("\n");
    }
}
void printReversedPyramid(int lines)
{
    for (int i = 0; i < lines; i++)
    {
        for (int k = 0; k < i; k++)
        {
            printf(" ");
        }
        for (int j = lines; j > i; j--)
        {
            printf("*");
        }
        for (int l = lines - 1; l > i; l--)
        {
            printf("*");
        }

        printf("\n");
    }
}

void printDiamond(int lines)
{
    int _lines = (lines / 2) + 1;
    for (int i = 0; i < _lines; i++)
    {
        for (int j = _lines; j > i; j--)
        {
            printf(" ");
        }
        for (int j = 0; j < i; j++)
        {
            printf("*");
        }
        for (int k = 0; k < i - 1; k++)
        {
            printf("*");
        }
        printf("\n");
    }

    for (int _i = 0; _i < _lines; _i++)
    {
        for (int _k = 0; _k < _i; _k++)
        {
            printf(" ");
        }
        for (int _j = _lines; _j > _i; _j--)
        {
            printf("*");
        }
        for (int l = _lines - 1; l > _i; l--)
        {
            printf("*");
        }
        printf("\n");
    }
}

void printEmptySquare(int lines)
{
    for (int i = 0; i < lines; i++)
    {
        for (int j = 0; j < lines; j++)
        {
            if (i == 0 || i == lines - 1)
            {
                printf("*");
            }
            if (i > 0 && i < lines - 1)
            {
                if (j == 0 || j == lines - 1)
                {
                    printf("*");
                }
                else
                {
                    printf(" ");
                }
            }
        }
        printf("\n");
    }
}

void printEmptyDiamond(int lines)
{
    for (int i = 0; i < lines; i++)
    {
        for (int j = lines; j > i; j--)
        {
            printf("*");
        }
        for (int k = -1; k < i; k++)
        {
            printf(" ");
        }
        for (int k = 0; k < i; k++)
        {
            printf(" ");
        }
        for (int j = lines; j > i; j--)
        {
            printf("*");
        }
        printf("\n");
    }

    for (int i = 1; i < lines; i++)
    {
        for (int k = 0; k <= i; k++)
        {
            printf("*");
        }
        for (int j = lines - 1; j > i; j--)
        {
            printf(" ");
        }
        for (int j = lines; j > i; j--)
        {
            printf(" ");
        }
        for (int k = 0; k <= i; k++)
        {
            printf("*");
        }
        printf("\n");
    }
}

int main()
{
    floydTriangle(6);
    return 0;
}
