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

int main()
{
    solidRectangle(5,3);
    return 0;
}