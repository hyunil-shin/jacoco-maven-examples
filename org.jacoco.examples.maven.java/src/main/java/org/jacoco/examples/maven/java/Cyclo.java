package org.jacoco.examples.maven.java;

public class Cyclo {
  int t = 2000;
  boolean d = false;
	
  void baseCyclo() {                // Cyclo = 1
    highCyclo();
  }

  void highCyclo() {                // Cyclo = 10: reported!
    int x = 0, y = 2;
    boolean a = false, b = true;

    if (a && (y == 1)) { // +3
      if (y == x) {                 // +1
        while (true) {              // +1
          if (x++ < 20) {           // +1
          	for(int aa = 0; aa < 10; aa++) {
          		if(a == true) {
          			x = 10;
          		}
          	}
          	switch(y) {
          		case 1:
          			break;
          		
            }
            break;                  // +1
          }
        }
      } else if (y == t && !d) {    // +2
        x = a ? y : x;              // +1
      } else {
        x = 2;
      }
    }
  }
	

}
