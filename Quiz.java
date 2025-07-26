// Quiz 
import java.io.*;
import java.util.*;
import java.lang.*;
class Display{
  public void showScore(int score) {
    if (score < 0) {
      // Ensure score does not go below zero
      System.out.println("Your score is negative (" + score + ").");
      System.out.println("Better luck next time!");
    }
    else if (score >= 0 && score < 20) {
      System.out.println("Your score is: " + score + ". Keep trying, you can improve!");
    } else if (score >= 20 && score < 35) {
      System.out.println("Your score is: " + score + ". Good job, but there's room for improvement!");
    } else {
      System.out.println("Your score is: " + score + ". Excellent work!");
    }
  }

  public void selectTopic() {
    Scanner sc = new Scanner(System.in);
    System.out.println("Select a topic for the quiz:");
    System.out.println("1. Java");
    System.out.println("2. Python");
    System.out.println("3. C++");
    System.out.println("4. Exit");
    int choice = sc.nextInt();
    
    switch (choice) {
      case 1:
        JavaQuiz javaQuiz = new JavaQuiz();
        javaQuiz.startQuiz();
        break;
      case 2:
        PythonQuiz pythonQuiz = new PythonQuiz();
        pythonQuiz.startQuiz();
        break;
      case 3:
        CppQuiz cppQuiz = new CppQuiz();
        cppQuiz.startQuiz();
        break;
      case 4:
        System.out.println("Exiting the quiz. Thank you!");
        System.exit(0);
      default:
        System.out.println("Invalid choice! Please select a valid topic.");
    }
  }

}
class JavaQuiz extends Display {
  Display d = new Display();
  int score =0;
  public void startQuiz() {
    System.out.println("🧠Starting Java Quiz...");
    System.out.println("____________________________________________");
    System.out.println("⚡1. Output of a/0 and a/0.0 in java(let a is a integer)?");
    System.out.println("a)Runtime error for both\n b)Infinity and NaN\n c)Runtime error & Infinity\n d)ArithmeticException & Infinity");
    displayCorrectAnswer(1);
    System.out.println("____________________________________________");
    System.out.println("⚡2.  What is the correct way to get the length of an array in Java? ");
    System.out.println("a)array.length\nb)array.size()\nc)array.length()\nd)None of the above");
    displayCorrectAnswer(2);
    System.out.println("____________________________________________");
    System.out.println("⚡3.  What does == and .equals() do when comparing strings in java?");
    System.out.println("a)Both compare values\n b)== compares reference, .equals() compares value\n c)== compares value, .equals() compares object\n d)Both are same in all cases");
    displayCorrectAnswer(3);
    System.out.println("____________________________________________");
    System.out.println("⚡4. What is the main difference between StringBuilder and StringBuffer?");
    System.out.println("a)No difference\n b)StringBuilder is faster\n c)StringBuffer is synchronized, StringBuilder is not\n d)Both b & c");
    displayCorrectAnswer(4);
    System.out.println("____________________________________________");
    System.out.println("⚡5. Which of the following is true about abstract classes and interfaces?");
    System.out.println("a)Both Cannot be instantiated\nb)Abstract classes can have constructors, interfaces cannot\nc)Interfaces can extend multiple interfaces, abstract classes cannot\nd)All of the above");
    displayCorrectAnswer(5);
    System.out.println("____________________________________________");
    d.showScore(score);
    System.out.println("____________________________________________");
    System.out.println("If you want attempt the quiz again or python quiz or C++ quiz select the topic again");
    d.selectTopic();
  }
  public void displayCorrectAnswer(int j) {
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter correct answer (a-d): ");
    String res = sc.nextLine();
    switch (j) {
      case 1:
        if (res.equalsIgnoreCase("d")) {
          System.out.println("⭐ Correct Answer!");
          System.out.println("Reason: a/0 throws ArithmeticException, while a/0.0 results in Infinity because of IEEE 754.");
          score +=10;
        } else {
          System.out.println("❌Wrong Answer! Correct answer is d) ArithmeticException & Infinity");
          System.out.println("Reason: a/0 throws ArithmeticException, while a/0.0 results in Infinity because of IEEE 754.");
          score -= 5;
        }
        break;
      case 2:
        if (res.equalsIgnoreCase("a")) {
          System.out.println("⭐ Correct Answer!");
          System.out.println("Reason: In Java, the length of an array is accessed using the 'length' property, not a method.");
          score +=10;
        } else {
          System.out.println("❌Wrong Answer! Correct answer is a) array.length");
          System.out.println("Reason: In Java, the length of an array is accessed using the 'length' property, not a method.");
           score -= 5;
        }
        break;
      case 3:
        if (res.equalsIgnoreCase("b")) {
          System.out.println("⭐ Correct Answer!");
          System.out.println("Reason: In Java, '==' compares references (memory addresses), while '.equals()' compares the actual content of the strings.");
          score +=10;
        } else {
          System.out.println("❌Wrong Answer! Correct answer is b) == compares reference, .equals() compares value");
          System.out.println("Reason: In Java, '==' compares references (memory addresses), while '.equals()' compares the actual content of the strings.");
           score -= 5;
        }
        break;
      case 4:
        if (res.equalsIgnoreCase("c")) {
          System.out.println("⭐Correct Answer!");
          System.out.println("Reason: StringBuffer is synchronized (thread-safe), while StringBuilder is not synchronized (not thread-safe).");
        score +=10;
        } else {
          System.out.println("❌Wrong Answer! Correct answer is c) StringBuffer is synchronized, StringBuilder is not");
          System.out.println("Reason: StringBuffer is synchronized (thread-safe), while StringBuilder is not synchronized (not thread-safe).");
           score -= 5;
        }
        break;
      case 5:
        if (res.equalsIgnoreCase("d")) {
          System.out.println("⭐ Correct Answer!");
          System.out.println("Reason: Abstract classes cannot be instantiated, can have constructors, and can extend only one class. Interfaces cannot have constructors and can extend multiple interfaces.");
          score +=10;
        } else {
          System.out.println("❌Wrong Answer! Correct answer is d) All of the above");
          System.out.println("Reason: Abstract classes cannot be instantiated, can have constructors, and can extend only one class. Interfaces cannot have constructors and can extend multiple interfaces.");
          score -= 5;
        }
        break;
      default:
        System.out.println("Invalid question number.");
    }
    d.showScore(score);
    //sc.close();
  }
}

class PythonQuiz extends Display {
  Display d = new Display();
  int score =0;
  public void startQuiz() {
    System.out.println("🧠Starting Python Quiz...");
    System.out.println("____________________________________________");
    System.out.println("⚡1. What is the output of print(type([])) in Python?");
    System.out.println("a) <class 'list'>\n b) <class 'tuple'>\n c) <class 'dict'>\n d) <class 'set'>");
    displayCorrectAnswer(1);
    System.out.println("____________________________________________");
    System.out.println("⚡2. What will be the output 8 >> 2?");
    System.out.println("a) 2\n b) 4\n c) 8\n d) 16");
    displayCorrectAnswer(2);
    System.out.println("____________________________________________");
    System.out.println("⚡3. Output print(0.1 + 0.2 == 0.3)");
    System.out.println("a) True\n b) False\n c) Error\n d) None of the above");
    displayCorrectAnswer(3);
    System.out.println("____________________________________________");
    System.out.println("⚡4. Output of this set operation: a={1,2,3}, b={2,3,4} a&b");
    System.out.println("a) {2,3}\n b) {1,2}\n c) {1,4}\n d) {2,4}");
    displayCorrectAnswer(4);
    System.out.println("____________________________________________");
    System.out.println("⚡5. Output of this expression: '5' * 3");
    System.out.println("a) 15\n b) '555'\n c) Error\n d) None of the above");
    displayCorrectAnswer(5);
    System.out.println("____________________________________________");
    d.showScore(score);
    System.out.println("____________________________________________");
    System.out.println("If you want attempt the quiz again or python quiz or C++ quiz select the topic again");
    d.selectTopic();
  }
  public void displayCorrectAnswer(int j){
    Scanner sc = new Scanner(System.in);
    System.out.println("Enter correct option [a-d]:");
    String res = sc.nextLine();
    switch (j) {
      case 1:
        if (res.equalsIgnoreCase("a")) {
          score += 10;
          System.out.println("⭐ Correct Answer!");
          System.out.println("Reason: In Python, type([]) returns <class 'list'>.");
        } else {
          score -=5;
          System.out.println("❌Wrong Answer! Correct answer is a) <class 'list'>");
        }
        break;
      case 2:
        if (res.equalsIgnoreCase("a")) {
          score += 10;
          System.out.println("⭐ Correct Answer!");
          System.out.println("Reason: In Python, 8 >> 2 results in 2.(8/4 =2)");
        } else {
          score -= 5;
          System.out.println("❌Wrong Answer! Correct answer is a) 2");
          System.out.println("Reason: In Python, 8 >> 2 results in 2.(8/4 =2)");
        }
        break;
      case 3:
        if (res.equalsIgnoreCase("b")) {
          score += 10;
          System.out.println("⭐ Correct Answer!");
          System.out.println("Reason: Due to floating-point arithmetic precision issues, 0.1 + 0.2 != 0.3., o/p:0.3000000000000004");
        } else {
          score -= 5;
          System.out.println("❌Wrong Answer! Correct answer is b) False");
          System.out.println("Reason: Due to floating-point arithmetic precision issues, 0.1 + 0.2 != 0.3., o/p:0.3000000000000004");
        }
        break;
      case 4:
        if (res.equalsIgnoreCase("a")) {
          score += 10;
          System.out.println("⭐ Correct Answer!");
          System.out.println("Reason: The intersection of sets a and b is {2,3}.");
        } else {
          score -= 5;
          System.out.println("❌Wrong Answer! Correct answer is a) {2,3}");
          System.out.println("Reason: The intersection of sets a and b is {2,3}.");
        }
        break;
      case 5:
        if (res.equalsIgnoreCase("b")) {
          score += 10;
          System.out.println("⭐ Correct Answer!");
          System.out.println("Reason: In Python, the expression '5' * 3 results in '555'.");
        } else {
          score -= 5;
          System.out.println("❌Wrong Answer! Correct answer is b) '555'");
          System.out.println("Reason: In Python, the expression '5' * 3 results in '555'.");
        }
        break;
      default:
        System.out.println("Invalid question number.");
    }
    d.showScore(score);
   // sc.close();
  }
}

class CppQuiz extends Display {
  Display d = new Display();
  int score =0;
  public void startQuiz() {
    System.out.println("🧠Starting C++ Quiz...");
    System.out.println("____________________________________________");
    System.out.println("⚡1. What is the default access specifier for class members in C++?");
    System.out.println("a) public\nb) private\nc) protected\nd) Default");
    displayCorrectAnswer(1);
    System.out.println("____________________________________________");
    System.out.println("⚡2. Which is the correct order of destructor calling in inheritance?");
    System.out.println("a) Child → Parent\nb) Parent → Child\nc) Random\nd) Not applicable");
    displayCorrectAnswer(2);
    System.out.println("____________________________________________");
    System.out.println("⚡3. Which of the following is used for runtime polymorphism?");
    System.out.println("a) Function overloading\nb) Templates\nc) Virtual functions\nd) Operator overloading");
    displayCorrectAnswer(3);
    System.out.println("____________________________________________");
    System.out.println("⚡4. What is the output of the following code snippet? {\n  int x = 10;\n  cout << x++ << ' ' << ++x;\n  return 0;\n}");
    System.out.println("a) 10 12\nb) 11 11\nc) 10 11\nd) Compilation error");
    displayCorrectAnswer(4);
    System.out.println("____________________________________________");
    System.out.println("⚡5. Which of the following is not a valid C++ identifier?");
    System.out.println("a) _myVar\nb) myVar1\nc) 1stVar\nd) my_var");
    displayCorrectAnswer(5);
    System.out.println("____________________________________________");
    d.showScore(score); // Assuming score is managed in Display class
    System.out.println("If you want attempt the quiz again or python quiz or C++ quiz select the topic again");
    d.selectTopic();
  }
  public void displayCorrectAnswer(int j) {
      Scanner sc = new Scanner(System.in);
      System.out.print("Enter correct option [a-d]: ");
      String res = sc.nextLine();
      switch (j) {
          case 1:
              if (res.equalsIgnoreCase("b")) {
                  System.out.println("⭐ Correct Answer!");
                  System.out.println("Reason: The default access specifier for class members in C++ is private.");
                  score +=10;
              } else {
                  System.out.println("❌Wrong Answer! Correct answer is b) private");
                  System.out.println("Reason: The default access specifier for class members in C++ is private.");
                  score -= 5;
              }
              break;
          case 2:
              if (res.equalsIgnoreCase("a")) {
                  System.out.println("⭐ Correct Answer!");
                  System.out.println("Reason: In C++, destructors are called in the reverse order of constructors(bottom-up), so Child → Parent.");
                  score +=10;
              } else {
                  System.out.println("❌Wrong Answer! Correct answer is a) Child → Parent");
                  System.out.println("Reason: In C++, destructors are called in the reverse order of constructors(bottom-up), so Child → Parent.");
                  score -= 5;
              }
              break;
          case 3:
              if (res.equalsIgnoreCase("c")) {
                  System.out.println("⭐ Correct Answer!");
                  System.out.println("Reason: Virtual functions are used for runtime polymorphism in C++.");
                  score +=10;
              } else {
                  System.out.println("❌Wrong Answer! Correct answer is c) Virtual functions");
                  System.out.println("Reason: Virtual functions are used for runtime polymorphism in C++.");
                  score -= 5;
              }
              break;
          case 4:
              if (res.equalsIgnoreCase("c")) {
                  System.out.println("⭐ Correct Answer!");
                  System.out.println("Reason: Because x++ returns 10 and then increments x to 11, and ++x increments it to 12 before printing.");
                  score +=10;
              } else {
                  System.out.println("❌Wrong Answer! Correct answer is c) 10 12");
                  System.out.println("Reason: Because x++ returns 10 and then increments x to 11, and ++x increments it to 12 before printing.");
                  score -= 5;
              }
              break;
          case 5:
              if (res.equalsIgnoreCase("c")) {
                  System.out.println("⭐ Correct Answer!");
                  System.out.println("Reason: '1stVar' is not a valid C++ identifier because it starts with a digit.");
                  score +=10;
              } else {
                  System.out.println("❌Wrong Answer! Correct answer is c) 1stVar");
                  System.out.println("Reason: '1stVar' is not a valid C++ identifier because it starts with a digit.");
                  score -= 5;
              }
              break;
          default:
              System.out.println("Invalid question number.");
      }
  d.showScore(score);
  //sc.close();
}
}
public class Quiz extends Display {
  public static void main(String[] args) throws IOException {
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    Display ds = new Display();
    System.out.println("____________________________________________");
    System.out.println("Welcome to the Quiz Application!");
    System.out.println("This quiz will test your knowledge on various programming languages.");
    System.out.print("Enter your name: ");
    String name = br.readLine();
    System.out.println("_____________________________");
    System.out.println("Hello, " + name + " Let's get started.");
    System.out.println("📚Before we begin, please read the instructions carefully.");
    System.out.println("______INSTRUCTIONS______");
    System.out.println("i) In this quiz, you will be asked 5 questions with 4 options each");
    System.out.println("ii) Each question carries 10 marks for correct answer and -5 marks for wrong answer");
    System.out.println("iii) You can select a topic from Java, Python, or C++");
    System.out.println("iv) Once quiz started, you cannot exit the quiz at any time.");
    System.out.println("Good luck!");
    System.out.println("____________________________________________");
    System.out.println("Are you ready? (yes/no)");
    String ready = br.readLine();
    if (ready.equalsIgnoreCase("yes")) {
      System.out.println("____________________________________________");
      System.out.println("Great! Let's begin.🔥");
      ds.selectTopic();
    } else {
      System.out.println("You chose not to participate in the quiz.");
      System.out.println("Exiting the Quiz.");
      System.out.println("Thank you " + name + " Have a great day :)🫶");
      System.out.println("___________________________");
      System.exit(0);
    }
    System.out.println("____________________________________________");
    System.out.println("If you want to attempt the quiz again select the topic again:(enter 4 to exit)");
    ds.selectTopic();
  }
}
