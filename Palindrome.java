public class Palindrome{
    public static boolean is_palindrome(String s)
    {
     boolean is_palaindrome = false;
     int i;
      for (i = 0; i <= s.length()-1; i++) {
        if (s.charAt(i)==s.charAt(s.length()-1-i))
        {
        return true;
        }
      }
      return false;

}
}
