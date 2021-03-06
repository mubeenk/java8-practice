package coreservlets.java7;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;

/** Reads one line at a time, rather than using Files.readAllLines
 *  as in ReadFile1. 
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class ReadFile2 {
  public static void main(String[] args) {
    String file = "input-file.txt";
    Charset characterSet = Charset.defaultCharset();
    Path path = Paths.get(file);
    try(BufferedReader reader = 
          Files.newBufferedReader(path, characterSet)) {
      System.out.printf("Lines from %s:%n", file);
      String line;
      while ((line = reader.readLine()) != null) {
        System.out.println(line);
      }
    } catch (IOException ioe) {
      System.err.printf("IOException: %s%n", ioe);
    }
  }
}
