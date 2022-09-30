/* Maisoon Amina Rahman */

//imports the API for NoSuchElementException
import java.util.NoSuchElementException;

/* a class that contains the methods for arrays and Strings */
public class HW2 {
  
  /* a method that gives the average of the elements in an array */ 
  public static double average(double[] array) {
    if (array.length == 0) {
      throw new NoSuchElementException();
    }
    // a variable that stores the current element in the array
    double element = 0.0;
    for (int index = 0; index < array.length; index = index + 1 ) {
      element = element + array[index];
    }
    return element/array.length;
  }
  
  /* a method that returns the average of the elements of a two-dimensional array */
  public static double average1(double[][] array1) {
    if ((array1.length == 0) || (array1[0].length == 0)) {
      throw new NoSuchElementException();
    }
    // a variable that stores the current element is the array
    double element = 0.0;
    double num = 0.0;
    for (int index1 = 0; index1 < array1.length; index1 = index1 + 1) {
      for (int index2 = 0; index2 < array1[index1].length; index2 = index2 + 1) {
        num = num + 1;
        element = element + array1[index1][index2];
      }
    }
    return element/num;
  }
  
  /* a method that counts the number of words in a string */
  public static int countWords(String s) {
    int numWords = 0;
    int firstWord = 0;
    for (int index = 0; index < s.length()-1; index = index + 1) {
      if (s.charAt(1)!= ' ') {
        firstWord = 1;
        if (s.charAt(index) == ' ') {
          numWords = numWords + 1;
        }
      }
    }
    return numWords + firstWord;
  }
  
  /* a method that cuts up a String to our desired length, while keeping the words intact */
  public static String truncate(String s, int length) {
    StringBuilder builder = new StringBuilder();
    if (s.length() <= length) {
      return s;
    }
    else {
      for (int index = 0; index < length; index = index + 1) {
        builder.append(s.charAt(index));
      }
    }
    return builder.toString();
  }
}


      