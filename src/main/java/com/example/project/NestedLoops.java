package com.example.project;

/*
1.Manually test first in the Runner class.
2.Run ./gradlew test to run automated tests.
3.Once you have completed the challenges, push to your repository.
4.Submit at turninterminal.netlify.app
*/

public class NestedLoops {
               /*
return the string below for given height=5
*
**
***
****
*****  
           */
public static String starStaircase(int height){
    String answer = "";
for (int i = 1; i < height + 1; i++) {
  for (int j = 1; j <= i; j++) {
    answer += ("*");
  }
  if (i != height) {
  answer += "\n";
  }
}
    return answer;
}
          /*
return the string below for given height=5
*****
****
***
**
*
           */

public static String starStaircaseReverse(int height){
        String answer = "";
    for (int i = height; i > 0; i--) {
  for (int j = i; j > 0; j--) {
    answer += "*";
  }
  if (i != 1) {
  answer += "\n";
  }
}
    return answer;
}
            /*

width=5 height=5
*****
*   *
*   *
*   *
*****
          */
    public static String emptyBox(int width, int height) {
        String answer = "";
        if (width < 2 || height < 2) {
            return "";
        }
        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (i == 1 || i == height || j == 1 || j == width) {
                    answer += "*";
                } else {
                    answer += " ";
                }
            }
            if (i != height) {
                answer += "\n";
            }
        }
        return answer;
    }
                    /*
return the string below for word="HELLO" rows=5                    
HELLO
ELLOH
LLOHE
LOHEL
OHELL

  i will provide a hint for this one if you get stuck.. use modulo
                */
    public static String repeatRectangle(String word, int rows){
        String answer = "";
        int length = word.length();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < length; j++) {
                answer += word.charAt((i + j) % length);
            }
            if (i != rows - 1) {
                answer += "\n";
            }
        }
        return answer;
    }

}