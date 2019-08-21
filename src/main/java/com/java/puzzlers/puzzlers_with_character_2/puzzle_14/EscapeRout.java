package com.java.puzzlers.puzzlers_with_character_2.puzzle_14;

public class EscapeRout {
  public static void main(String[] args) {
    // \u0022 is the Unicode escape for double-quote (")
    System.out.println("a\u0022.length() + \u0022b".length());
  }
}
