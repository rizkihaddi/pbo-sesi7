package belajar_localClass;

// buat class public
public class LocalClass {
  // aturan penulisan inputan harus angka 0-9
  static String format = "[^0-9]";

  // aturan penulisan inputan harus angka 0-9
  // validasi number
  public static void validatePhoneNumber(String phoneNumber1) {
    final int numberLength = 12;
    class PhoneNumber {
      String formatNumber = null;

      PhoneNumber(String phoneNumber) {
        // final int numberLength = 10; jika mau di ganti panjang data
        String currentNumber = phoneNumber.replaceAll(format, "");
        if (currentNumber.length() == numberLength)
          formatNumber = currentNumber;
        else
          formatNumber = null;
      }

      public String getNumber() {
        return formatNumber;
      }

      // original number
      public void printOriginalNumber() {
        System.out.println("Original Number : " + phoneNumber1);
      }
    }
    PhoneNumber myNumber = new PhoneNumber(phoneNumber1);
    myNumber.printOriginalNumber();
    if (myNumber.getNumber() == null)
      System.out.println("Number is invalid");
    else
      System.out.println("Number : " + myNumber.getNumber());
  }

  public static void main(String[] args) {
    validatePhoneNumber("ABCDEFGHIJKL");
  }
}