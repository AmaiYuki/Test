/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
jkldjkdssdfklsdfkfdjkl
 */
package javaapplication1;

import java.io.BufferedReader;
import java.io.InputStreamReader;

/**
 *
 * @author nik
 */
public class DumpTest {
    public static void main(final String args[]) throws Exception {
    Thread.UncaughtExceptionHandler handler = new StackWindow(
        "Show Exception Stack", 400, 200);
    Thread.setDefaultUncaughtExceptionHandler(handler);
    new Thread() {
      public void run() {
        System.out.println(1 / 0);
      }
    }.start();
    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    System.out.print("Press Enter for next exception");
    br.readLine();
    new Thread() {
      public void run() {
        System.out.println(args[0]);
      }
    }.start();
    System.out.print("Press Enter to end");
    br.readLine();
    System.exit(0);
  }
}
