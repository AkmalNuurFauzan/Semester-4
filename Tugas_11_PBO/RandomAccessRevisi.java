/**
 *
 * @author Akmal N.F
 */
import java.io.*;

class RandomAccessRevisi {
    public static void main(String[] args) {
        String bookList[] = {"Satu", "Dua", "Tiga"};
        int yearList[] = {1920, 1230, 1940};
        try {
            RandomAccessFile books = new RandomAccessFile("books.txt", "rw");

            // Writing book titles and their years to the file
            for (int i = 0; i < 3; i++) {
                books.writeUTF(bookList[i]); // Write book title
                books.writeInt(yearList[i]); // Write publication year
            }

            books.seek(0); // Move file pointer to the beginning of the file

            // Reading and printing the book titles and their years
            System.out.println(books.readUTF() + " " + books.readInt());
            System.out.println(books.readUTF() + " " + books.readInt());

            books.close(); // Close the RandomAccessFile
        } catch (IOException e) {
            System.out.println("Indeks melebihi batas");
        }
        System.out.println("test");
    }
}

