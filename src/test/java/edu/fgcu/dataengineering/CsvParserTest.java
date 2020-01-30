package edu.fgcu.dataengineering;

import static org.junit.jupiter.api.Assertions.*;

import com.opencsv.exceptions.CsvValidationException;
import java.io.IOException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class CsvParserTest {

  /**
   * @TODO Add tests for print operations (then DB ones)
   */

  CsvParser csv;

  @BeforeEach
  void setUp() throws IOException, CsvValidationException {
    csv = new CsvParser("bookstore_report2.csv");
  }

  @Test
  void printCsv() {
  }
}