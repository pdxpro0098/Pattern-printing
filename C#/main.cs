using System;

class Program{

    public static void solidSquare(int line)
    {
        for (int i = 0; i < line; i++)
        {
            for (int j = 0; j < line; j++)
            {
                Console.Write("*");
            }
        Console.WriteLine("");
        }
    } 

    static void Main(string[] args){
        solidSquare(5);
    }
}
