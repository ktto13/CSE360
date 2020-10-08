package cse360assignment02;
/**
 * AddingMachine is a class that can add and subtract
 * and retain the commands in a string returned by toString()
 *
 * @author  Jamison Kellen
 * @version 2.0
 * @since   2020-10-7
 */
public class AddingMachine {
  /**
   * @serial total is the running total of the values of all hitherto used
   * operations in AddingMachine.
   * @serial saved is the saved string that toString() appends.
   */
  private int total;
  private String saved;
  /**
   *  This is the default constructor
   */
  public AddingMachine() {
    saved = "0";
    total = 0; //not needed - included for clarity
  }
  /**
   * getTotal returns the current total
   *
   * @see total
   */
  public int getTotal() {
    return total;
  }
  /**
   * add adds the parameter value to the variable total
   *
   * @param value this is the integer that will be added to toal
   */
  public void add(int value) {
    saved += " + " + value;
    total = total + value;
  }
  /**
   * subtract subtracts the parameter value from the variable total
   *
   * @param value this is the integer that will be subtracted from total
   */
  public void subtract(int value) {
    saved += " - " + value;
    total = total - value;
  }
  /**
   * toString keeps a history of the transactions made starting at
   * the intial 0 value.
   *
   * @return string This returns a string with each opperation seperated by a space
   */
  public String toString() {
    return saved;
  }
  /**
   * clear clears AddingMachine.
   */
  public void clear() {
    total = 0;
    saved = "0";
  }
}
