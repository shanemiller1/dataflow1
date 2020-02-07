package edu.fgcu.shanemiller1;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

  /**
   * first method to run in class main.
   *
   * @param args
   * @throws IOException
   * @throws CsvValidationException
   */
  public static void main(String[] args) throws IOException, CsvValidationException {
    // Literally just calls our parser right now (....and is called for tests)
    CSV csvP = new CSV("src/Data/bookstore_report2.csv");
    csvP.printCsv();
    Gson gson = new Gson();
    JsonReader jread = new JsonReader(new FileReader("src/Data/authors.json"));
    AuthorParser[] authors = gson.fromJson(jread, AuthorParser[].class);

    for (var element : authors) {
      System.out.println(element.getName());
    }
  }
}
