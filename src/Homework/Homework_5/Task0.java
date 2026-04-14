package Homework.Homework_5;

class Task0 {
    public static void main(String[] args) {
        String testString = "  abcd  ";
        String testStringEmpty = "    ";

        System.out.println(testString.length());

        System.out.println(testStringEmpty.isEmpty()); //doesn't ignore white space
        System.out.println(testStringEmpty.isBlank());//ignores white space
        System.out.println();


        String testTrimStrip = "    abcd  \u2005"; //space in unicode
        System.out.println(testTrimStrip.trim());
        System.out.println("Trimmed length: " + testTrimStrip.trim().length());
        System.out.println(testTrimStrip.strip());
        System.out.println("Stripped length: " + testTrimStrip.strip().length());
        System.out.println();

        System.out.println("test string of stripLeading and stripTrailing: " + testString);
        System.out.println(testString.stripLeading()); // removes the leading whitespace
        System.out.println(testString.stripTrailing()); // removes the trailing whitespace
        System.out.println();

        String s = "abcd\uD83D\uDC0E";
        System.out.println("Test string of charAt and codePointAt: " + s);
        System.out.println("char at index 5: " + s.charAt(5)); // UTF-16
        System.out.println("codePointAt at index 5: " + s.codePointAt(5)); // Unicode
        System.out.println();

        System.out.println("Test string of substring: " + s);
        System.out.println(s.substring(2)); // substring beginning with index as param
        System.out.println();

        String s1 = "abcdc";
        System.out.println("Test string for indexOf('c'): " + s1);
        System.out.println(s1.indexOf('c')); //returns first index of given char

        System.out.println("Test string for lastIndexOf('c'): " + s1);
        System.out.println(s1.lastIndexOf('c'));
        System.out.println();

        System.out.println("Test string for contains(\"cd\") and (\"cf\"): " + s1);
        System.out.println(s1.contains("cd"));
        System.out.println(s1.contains("cf"));
        System.out.println();

        System.out.println("Test string for startsWith(\"ab\") and endsWith(\"dc\"): " + s1);
        System.out.println(s1.startsWith("ab"));
        System.out.println(s1.endsWith("dc"));
        System.out.println();

        String eq1 = "abcd";
        String eq2 = "abcd";
        String eq3 = new String("abcd");
        System.out.println("test string1: " + eq1);
        System.out.println("test string2: " + eq2);
        System.out.println("test string3: " + eq3);


        System.out.println("eq1.equals(eq2)");
        System.out.println(eq1.equals(eq2));
        System.out.println("eq1.equals(eq3)");
        System.out.println(eq1.equals(eq3));
        System.out.println("eq1==eq2");
        System.out.println(eq1==eq2);
        System.out.println("eq1==eq3");
        System.out.println(eq1==eq3);
        System.out.println();


        String upperCase = "ABCD";
        String lowerCase = "abcd";
        System.out.println("s1 = " + upperCase + "; s2 = " + lowerCase);
        System.out.println("equalsIgnoreCase test");
        System.out.println(upperCase.equalsIgnoreCase(lowerCase));
        System.out.println("equals test");
        System.out.println(upperCase.equals(lowerCase));
        System.out.println();

        String myStr1 = "Hello";
        String myStr2 = "Hello";
        System.out.println("compareTo: " + myStr1 + " and " + myStr2);
        System.out.println(myStr1.compareTo(myStr2)); //result 0 because they're equal
        System.out.println("compareToIgnoreCase for s1 = " + upperCase + "; s2 = " + lowerCase);
        System.out.println(upperCase.compareToIgnoreCase(lowerCase));
    }
}

// length, isEmpty, isBlank, trim, strip, stripLeading, stripTrailing
// charAt, codePointAt, substring, indexOf, lastIndexOf, contains, startsWith, endsWith
// equals, equalsIgnoreCase, compareTo (Collator)