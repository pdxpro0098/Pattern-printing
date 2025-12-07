#include <iostream>

using namespace std;

void solidSquare(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = 0; j < line; j++)
        {
            cout << "*";
        }
        cout << "\n";
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
                cout << "*";
            }
            else
            {
                cout << " ";
            }
        }
        cout << "\n";
    }
}

void numberSquare(int line)
{
    for (int i = 1; i <= line; i++)
    {
        for (int j = 1; j <= line; j++)
        {
            cout << i << " ";
        }
        cout << "\n";
    }
}

void solidRectangle(int row, int column)
{
    for (int i = 1; i <= row; i++)
    {
        for (int j = 1; j <= column; j++)
        {
            cout << "*";
        }
        cout << "\n";
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
                cout << "*";
            }
            else
            {
                cout << " ";
            }
        }
        cout << "\n";
    }
}

void rightHalfTriangle(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = 0; j < i + 1; j++)
        {
            cout << "*";
        }
        cout << endl;
    }
}

void leftHalfTriangle(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = line; j > i; j--)
        {
            cout << " ";
        }
        for (int j = 0; j < i + 1; j++)
        {
            cout << "*";
        }

        cout << endl;
    }
}

void invertedRightHalfTriangle(int line)
{
    for (int i = line; i >= 0; i--)
    {
        for (int j = i - 1; j >= 0; j--)
        {
            cout << "*";
        }
        cout << endl;
    }
}

void invertedLeftHalfTriangle(int line)
{
    for (int i = 0; i < line; i++)
    {
        for (int j = 0; j < i + 1; j++)
        {
            cout << " ";
        }
        for (int j = line; j > i; j--)
        {
            cout << "*";
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
            cout << n++ << " ";
        }
        cout << "\n";
    }
}

void pascalTriangle(int line)
{
    auto factorial = [](int num)
    {
        int n = 1;
        for (int i = 1; i <= num; i++)
        {
            n *= i;
        }
        return n;
    };

    auto nCr = [factorial](int n, int r)
    {
        return factorial(n) / (factorial(r) * factorial(n - r));
    };

    for (int i = 0; i < line; i++)
    {
        for (int j = line; j > i; j--)
        {
            cout << " ";
        }
        for (int k = 0; k <= i; k++)
        {
            cout << nCr(i, k);
        }
        cout << "\n";
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
                cout << "0";
            }
            else
            {
                cout << "1";
            }
        }
       cout <<"\n";
    }
}

int main()
{
    pascalTriangle(6);

    return 0;
}