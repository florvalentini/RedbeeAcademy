package com.redbee.academy.challenge;

import java.util.ArrayList;
import java.util.List;

public class CompareArrayNumbers {

  /**
   * Method that receives two lists and returns
   * another list with de max of each index
   *
   * @param a - Some Integer Number
   * @param b - Another Integer Number
   * @return The result of a + b
   */
  public static List<Integer> max(List<Integer> a, List<Integer> b) {
    
    int maxa = a.get(0);
    int maxb = b.get(0);

    ArrayList maxis = new ArrayList();

    for (int x : a) {
      
      if (x > maxa) {
        maxa = x;
      } 
    }

    for (int x : b) {
      
      if (x > maxb) {
        maxb = x;
      } 
    }
    
    maxis.add(maxa);
    maxis.add(maxb);

    return maxis;
  }



}
