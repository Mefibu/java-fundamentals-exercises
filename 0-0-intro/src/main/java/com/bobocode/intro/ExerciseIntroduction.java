// Source code is decompiled from a .class file using FernFlower decompiler.
package com.bobocode.intro;

import java.util.Base64;

public class ExerciseIntroduction {
   public ExerciseIntroduction() {
   }

   public String getWelcomeMessage() {
      return "The key to efficient learning is practice!";
   }

   public String encodeMessage(String var1) {
      return Base64.getEncoder().encodeToString(var1.getBytes());
   }
}
