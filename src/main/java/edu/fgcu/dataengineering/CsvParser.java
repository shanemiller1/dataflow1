package edu.fgcu.dataengineering;

import com.opencsv.CSVReader;
import com.opencsv.exceptions.CsvValidationException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class CsvParser {

  private List fileRows = new ArrayList();
  /* List to hold all fields from the file
  As it is a csv of only strings, we could make it a String
  But it pretty common to have to handle multiple types
      So you either use a Class or Blank Object type (like we are here)
   */

  public CsvParser(String infile) throws IOException, CsvValidationException {
    /** CsvParser - Reads csv Files using OpenCSV
     * On load, check if file exsts & then load it into fileRows
     * @param infile the file to be opened with path information
     */
    if (checkFile(infile)) {
      readCsv(infile);
    }
  }

  protected void readCsv(String csvinfile) throws IOException, CsvValidationException {
    /** readCsv: Read CSV file and load into our fileRows list
     * @param csvinfile CSV file with path information for loading
     */

    // Open a file & input stream for use with CSVReader (to create a reader object)
    FileInputStream csvStream = new FileInputStream(csvinfile);
    InputStreamReader inputStream = new InputStreamReader(csvStream,
        StandardCharsets.UTF_8);
    CSVReader reader = new CSVReader(inputStream);

    /* As reader is an Object type this will be too (not String[])
          But making it a String[] allows it to cast later
       Read the file and load each line (split by default ",") into our List
     */
    String[] nextLine;
    while ((nextLine = reader.readNext()) != null) {
      fileRows.add(nextLine);
    }

    // Close the reader
    reader.close();
  }

   protected void writeCsv(String csvoutfile) {
    // place holder for write method (we'll add later with tests)
  }

  protected void printCsv() {
    /** printCsv - Printout the Csv */

    for (Object row : fileRows) {
      /*
       So fileRows will be an Object type (which is fine we are just incrementing though it)
            So after getting each row, we will need to "cast" row to a String array (String[])
       */
      for (String fields : (String[]) row) {
          System.out.print(fields + ", ");
      }
      System.out.println("\b\b\n---------------------");
    }
  }

  private boolean checkFile(String csvfile) {
    /** checkFile - checks to ensure the file exists
     * @return false on file not found, true on found
     */
    if (!Files.exists(Paths.get(csvfile))) {
      System.out.println("File does not exist");
      return false;
      // may change this to throw an exception
    }
    return true;
  }
}
