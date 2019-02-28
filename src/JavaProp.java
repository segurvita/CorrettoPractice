import java.util.*;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class JavaProp {
  public static void main(String[] args) {

    List<String> list = new ArrayList<String>();
    list.add("java.version");
    list.add("java.vendor");
    list.add("java.vendor.url");
    list.add("java.specification.name");
    list.add("java.specification.version");
    list.add("java.specification.vendor");
    list.add("java.vm.name");
    list.add("java.vm.version");
    list.add("java.vm.vendor");
    list.add("java.vm.specification.name");
    list.add("java.vm.specification.version");
    list.add("java.vm.specification.vendor");
    list.add("java.compiler");
    list.add("java.home");
    list.add("java.library.path");

    list.stream().map(e -> e + "\t" + System.getProperty(e)).forEach(System.out::println);

    try (BufferedWriter writer = new BufferedWriter(new FileWriter("/out/JavaProp.csv"))) {
      list.stream().forEach(item -> {
        try {
          writer.write(item + "," + System.getProperty(item));
          writer.newLine();
        } catch (IOException e) {
          e.printStackTrace();
        }
      });
    } catch (IOException e) {
      e.printStackTrace();
    }
  }
}