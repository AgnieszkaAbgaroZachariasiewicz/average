import java.io.*;

public class Main {

  public static double average(int[] marks) {
    int sum = 0;
    for(int i = 0; i < marks.length; i++) {
        sum += marks[i];
    }
    return sum / (double)marks.length;
  }

  public static int max(int[] marks) {
    int highestGrade = marks[0];
    for(int i = 1; i < marks.length; i++) {
        if (highestGrade < marks[i]) {
          highestGrade = marks[i];
        }
    }
    return highestGrade;
  }

  public static void main(String[] args) {
    try {
      BufferedReader in = new BufferedReader(new InputStreamReader(System.in));

      int grades_size;
      System.out.println("Podaj liczbę ocen ucznia: ");
      grades_size = Integer.parseInt(in.readLine());

      if (grades_size < 1) {
        System.out.println("Brak ocen!");
        return;
      }

      int[] grades = new int[grades_size];
      System.out.println("Wypisz kolejno oceny (rozdzielajac enterem): ");
      for(int i = 0; i < grades_size; i++) {
        grades[i] = Integer.parseInt(in.readLine());
      }
      System.out.println("Średnia ocen: " + average(grades));
      System.out.println("Najwyższa ocena to: " + max(grades));
    } catch (IOException e) {
    }
  }
}
