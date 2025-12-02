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

int main()
{

    floydTriangle(7);
    return 0;
}