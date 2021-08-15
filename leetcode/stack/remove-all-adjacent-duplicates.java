class Solution {
    public String removeDuplicates(String s) {
        //Stack<String> s = new Stack<String>();
         // Store the String without
  // duplicate elements
  Stack<Character> st =
        new Stack<Character>();
 
  // Store the index of str
  int i = 0;
 
  // Traverse the String str
  while (i < s.length())
  {
    // Checks if stack is empty
    // or top of the stack is not
    // equal to current character
    if (st.isEmpty() ||
        s.charAt(i) != st.peek())
    {
      st.add(s.charAt(i));
      i++;
    }
 
    // If top element of the stack is
    // equal to the current character
    else
    {
      st.pop();
      i++;
    }
  }
 
  // If stack is empty
  if (st.isEmpty())
  {
    return ("");
  }
 
  // If stack is not Empty
  else
  {
    String short_String = "";
    while (!st.isEmpty())
    {
      short_String = st.peek() +
                     short_String;
      st.pop();
    }
    return (short_String);
  }
        
    }
}