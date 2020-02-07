package edu.fgcu.dataengineering;

import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CsvParserTest {

  /**
   * @TODO Add tests for print operations (then DB ones)
   */

  CSV csv;

  @BeforeEach
  void setUp() throws IOException, CsvValidationException {
    csv = new CSV("bookstore_report2.csv");
  }

  @Test
  void printCsv() {
  }
}