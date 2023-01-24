/*
    Write a program to copy the contents of two files to one file.
 */
package fileoprn;

import java.io.*;
import java.util.Scanner;

public class FileCopy {
    public static void main(String[] args) {
        Scanner ip = new Scanner(System.in), file1 = null, file2 = null;
        PrintWriter file3 = null;

        System.out.print("Enter name of the first source file: ");
        String filename1 = ip.nextLine();
        System.out.print("Enter name of the second source file: ");
        String filename2 = ip.nextLine();
        System.out.print("Enter name of the destination file: ");
        String filename3 = ip.nextLine();

        try {
            file1 = new Scanner(new File(filename1));
            file2 = new Scanner(new File(filename2));
            file3 = new PrintWriter(new File(filename3));

            while(file1.hasNextLine())
                  file3.println(file1.nextLine());

            while(file2.hasNextLine())
                  file3.println(file2.nextLine());

            System.out.println("File copy completed.");
        }
        catch (FileNotFoundException ex) {
              System.err.println(ex);
        }
        finally
        {
              if (file1 != null)  file1.close();
              if (file2 != null)  file2.close();
              if (file3 != null)  file3.close();
        }
        ip.close();
    }
}

