public class Q39RemoveDuplicate {
    
    public static void main(String[] args){
        String s ="programming";

        StringBuilder sb = new StringBuilder();

        for(char ch : s.toCharArray()){
            if(sb.indexOf(String.valueOf(ch)) ==-1){
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}
/*
Haan, logic bilkul correct hai 👍 Bas ek spelling mistake hai.

Tumne likha:

StringBuilde sb = new StringBuilder();

StringBuilde ❌

Correct:

StringBuilder sb = new StringBuilder();
Correct code
public class Q39RemoveDuplicate {

    public static void main(String[] args) {

        String s = "programming";

        StringBuilder sb = new StringBuilder();

        for (char ch : s.toCharArray()) {

            if (sb.indexOf(String.valueOf(ch)) == -1) {
                sb.append(ch);
            }
        }

        System.out.println(sb);
    }
}
Output
progamin
Tumhe bas ye flow yaad rakhna hai:
String
  ↓
toCharArray()
  ↓
one character at a time
  ↓
check: already in StringBuilder?
  ↓
NO → append()
YES → skip

For example:

programming
↓
p → add
r → add
o → add
g → add
r → skip
a → add
m → add
m → skip
i → add
n → add
g → skip
↓
progamin

Interview mein agar pooche "How did you remove duplicates?", simply say:

"I traversed the string character by character and used a StringBuilder to store unique characters. Before adding each character, I checked whether it was already present using indexOf(). If it returned -1, I appended the character."

String.valueOf(ch) i dont undestnad this one

Yes, this one is confusing initially. Let's understand only String.valueOf(ch).

First: ch is a char

In your loop:

for(char ch : s.toCharArray())

ch represents one character.

For example:

ch = 'p';

Notice the single quotes → 'p' is a char.

What does String.valueOf(ch) do?

It simply converts that character into a String.

char ch = 'p';

String.valueOf(ch);

Result:

"p"

So:

'p'   →   "p"
char      String

That's it. ❤️

But WHY do we need to convert it?

Because this:

sb.indexOf(...)

is looking for a String inside the StringBuilder.

So we have:

char ch = 'p';

But we want to do:

sb.indexOf("p")

Therefore:

String.valueOf(ch)

converts:

'p' → "p"

So this:

sb.indexOf(String.valueOf(ch))

is basically:

sb.indexOf("p")

when ch = 'p'.

See the complete flow

Suppose:

String s = "programming";

First loop:

ch = 'p'

Then:

String.valueOf(ch)

becomes:

"p"

Then:

sb.indexOf("p")

Since sb is empty:

""

p isn't found → returns -1.

Therefore:

if(-1 == -1)

is true.

So:

sb.append('p');

Now:

sb = "p"

Next character:

ch = 'r'

String.valueOf(ch):

'r' → "r"

Then:

sb.indexOf("r")

r isn't present → -1 → add it.

Just remember this
String.valueOf(ch)

means:

"Convert this value into a String."

For your code:

char 'p'  →  String "p"
char 'r'  →  String "r"
char 'o'  →  String "o"

Important: Don't confuse it with toString(). For a primitive char, String.valueOf(ch) is the simple way to convert it to a String. */