## Database data flows

### CSVParser
- The first iteration is just reading from a csv file 
and then printing it out.
- Second iteration read the file and load into a SQLite database.
- Third iteration perform selects on DB and write it out as csv.
- Fourth iteration update DB based on csv.

### JSON (GSON) 
- First iteration, read a csv file 
and then load it into a database
- Second iteration write the results of select queries to a JSON file

### XML (SOUP)
- Extra credit if also complete JSON task with JSoup (XML).