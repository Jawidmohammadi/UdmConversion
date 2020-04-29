public class BarkingDog {

  public static void main(String[] args) {
    System.out.println(shouldWakeUp(true, 1));//true
    System.out.println(shouldWakeUp(false, 7));//false
    System.out.println(shouldWakeUp(true, 8));//false
    System.out.println(shouldWakeUp(true, 23));//true
  }
  public static boolean shouldWakeUp(boolean barking, int hourOfDay) {
//    if (barking && hourOfDay >= 0 && hourOfDay < 8) {
//      return true;
//    }
//    else if (barking && hourOfDay > 22 && hourOfDay < 24){
//      return true;
//    }
//    else if (barking && hourOfDay > 8 && hourOfDay <= 22) {
//      return false;
//    }
//    else if (barking && hourOfDay < 0 || hourOfDay > 23){
//      return false;
//    }
//    return false;
//  }


    // above is my code

    if ((barking == true) && (hourOfDay >= 0 && hourOfDay < 8)){
      return true;
    } else if ((barking == true) && (hourOfDay > 22 && hourOfDay < 24)){
      return true;
    }
    return false;
  }
}
