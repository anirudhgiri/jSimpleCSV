![jSimpleCSV](https://i.imgur.com/ZI2PxoV.png)
# jSimpleCSV

A simple Java library for reading from and writing to CSV files.

## Usage
### Reading from a CSV file
```java
import jSimpleCSV.CSVReader;

public static void main(String args[]){
    CSVReader cr = new CSVReader();

    String[][] input = cr.toArray("input.csv");
}
```
### Writing to a CSV file
```java
import jSimpleCSV.CSVWriter;

public static void main(String args[]){
    CSVWriter cw = new CSVWriter();
    
    String[][] out = {{"Hello","World"},{"World","Hello"}};
    
    cr.toCSV(out,"output.csv");
}
```

## Contributing
Pull requests are welcome. For major changes, please open an issue first to discuss what you would like to change.

## License
[MIT](https://choosealicense.com/licenses/mit/)
