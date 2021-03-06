package coreservlets.writefiles;

import java.io.*;
import java.nio.charset.Charset;
import java.nio.file.*;

/** Writes to file without having to make List first. Wraps
 *  the BufferedWriter in a PrintWriter.
 *  <p>
 *  From <a href="http://courses.coreservlets.com/Course-Materials/">the
 *  coreservlets.com tutorials on JSF 2, PrimeFaces, Ajax, JavaScript, jQuery, GWT, Android,
 *  Spring, Hibernate, JPA, RESTful Web Services, Hadoop, Spring MVC,
 *  servlets, JSP, Java 8 lambdas and streams (for those that know Java already), 
 *  and Java 8 programming (for those new to Java)</a>.
 */

public class WriteFile3 {
  public static void main(String[] args) {
    Charset characterSet = Charset.defaultCharset();
    int numLines = 10;
    Path path = Paths.get("output-file-3.txt");
    try (PrintWriter out = 
           new PrintWriter(Files.newBufferedWriter(path, characterSet))) {
      for(int i=0; i<numLines; i++) {
        out.printf("Number is %5.2f%n", 100 * Math.random());
      }
    } catch (IOException ioe) {
      System.err.printf("IOException: %s%n", ioe);
    }
  }
}
