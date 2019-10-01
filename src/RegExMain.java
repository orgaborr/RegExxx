import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegExMain {
	
	public static void main(String[] args) {
		
//		String string = "I am a String. Yes, I am.";
//		System.out.println(string);
//		String yourString = string.replaceAll("I", "You");
//		System.out.println(yourString);
//		
//		
//		String alphanumeric = "abcHJDh92reklfj8329";
//		System.out.println(alphanumeric);
//		System.out.println(alphanumeric.replaceAll(".", "Y")); // '.' means any character
//		System.out.println(alphanumeric.replaceAll("^abcH", "YYY")); // ^ means the beginning of String
//		
//		System.out.println(alphanumeric.matches("^hello")); // returns false
//		System.out.println(alphanumeric.matches("^abc")); // returns false! the entire String has to match
//		System.out.println(alphanumeric.matches("abcHJDh92reklfj8329")); // return true
//		System.out.println(alphanumeric.matches("^abcHJDh92reklfj8329")); // return true
//		
//		System.out.println(alphanumeric.replaceAll("329$", "111")); // $ = end of the pattern
//		System.out.println(alphanumeric.replaceAll("[92]", "Y")); // replaces all characters in the brackets
//		System.out.println(alphanumeric.replaceAll("[2][r2]", "X")); // replaces [] only if followed by []
//		
//		System.out.println("harry".replaceAll("[Hh]arry", "Harry")); // changes all harry instances to Harry
//		
//		
//		// ------Character classes-------
//		
//		System.out.println(alphanumeric.replaceAll("[^sjfhk7463]", "X")); // 'all except'
//		System.out.println(alphanumeric.replaceAll("[a-fA-F3-8]", "Y")); // '-' range
//		System.out.println(alphanumeric.replaceAll("(?i)[a-f3-8]", "X")); // '(?I)' ignores case, (?iu) with unicode string
//		System.out.println(alphanumeric.replaceAll("\\d", "X")); // '\\d' all digits
//		System.out.println(alphanumeric.replaceAll("\\D", "X")); // '\\d' all NON-digits
//		
//		
//		String hasWhiteSpace = "I have blank and\ta tab, and also a newline\n";
//		System.out.println(hasWhiteSpace);
//		System.out.println(hasWhiteSpace.replaceAll("\\s", "")); // removes white space, '\\S' all non-white space
//		System.out.println(hasWhiteSpace.replaceAll("\t", "")); // removes only tab
//		
//		System.out.println(alphanumeric.replaceAll("\\w", "X")); // a-z, A-Z, 0-9, _
//		System.out.println(hasWhiteSpace.replaceAll("\\w", "X"));
//		System.out.println(alphanumeric.replaceAll("\\W", "X")); // capital W is the opposite
//		System.out.println(hasWhiteSpace.replaceAll("\\W", "X"));
//		
//		System.out.println(hasWhiteSpace.replaceAll("\\b", "X")); // boundaries
//		System.out.println(hasWhiteSpace.replaceAll("\\B", "X"));
//		
//		
//		// ------Quantifiers-----
//		
//		String newAlphanumeric = "hsfjjjj97497999988gfjdk";
//		System.out.println(newAlphanumeric);
//		
//		System.out.println(newAlphanumeric.replaceAll("^hsfj{4}", "YYY")); // {number} times the preceding letter
//		System.out.println(newAlphanumeric.replaceAll("^hsfj+", "YYY")); // 1 or more of preceding letter
//		System.out.println(newAlphanumeric.replaceAll("^hsfj*", "YYY")); // 0 or more of the preceding letter
//		System.out.println(newAlphanumeric.replaceAll("^hsfj{2,5}", "YYY")); // 2 to 5 j-s
//		System.out.println(newAlphanumeric.replaceAll("j+9*7", "Y"));
		
		
		// -----Matchers and Patterns-----
		
//		StringBuilder htmlText = new StringBuilder("<h1>My heading</h1>");
//		htmlText.append("<h2>Sub-heading</h2>");
//		htmlText.append("<p>This is a paragraph.</p>");
//		htmlText.append("<p>Another paragraph.</p>");
//		htmlText.append("<h2>Summary</h2>");
//		htmlText.append("<p>Summary content</p>");
//		
//		String h2Pattern = "<h2>";
//		Pattern pattern = Pattern.compile(h2Pattern); // we could add Pattern.CASE_INSENSITIVE modifier as a second parameter
//		Matcher matcher = pattern.matcher(htmlText);
//		System.out.println(matcher.matches()); // has to match the whole String
//		
//		matcher.reset(); // matcher can only be used once, so we have to reset it to use again
		int count = 0;
//		while(matcher.find()) {
//			count++;
//			System.out.println("Occurance " + count + " : " + matcher.start() + " to " + matcher.end());
//		}
//		
//		
//		// -----Groups-----
//		
//		String h2GroupPattern = "(<h2>)(.*?)(</h2>)"; // ? turns * into a lazy quantifier
//		Pattern groupPattern = Pattern.compile(h2GroupPattern);
//		Matcher groupMatcher = groupPattern.matcher(htmlText);
//		System.out.println(groupMatcher.matches());
//		groupMatcher.reset();
//		
//		while(groupMatcher.find()) {
//			System.out.println("Occurance: " + groupMatcher.group(0)); // means the whole pattern
//		}
//		groupMatcher.reset();
//		
//		while(groupMatcher.find()) {
//			System.out.println("Occurance: " + groupMatcher.group(2)); // 2 only the second group ( )
//		}
//		
//		
//		// -----Logical Operators-----
//		
//		System.out.println("harry".replaceAll("[H|h]arry", "Larry")); // | or operator
//		
//		//[^abc] means all except a, b and c
//		String tvTest = "tstvtkt";
//		//String tNotVRegExp = "t[^v]"; //has to be followed by a character except v
//		String tNotVRegExp = "t(?!v)"; // ? look ahead syntax, ! look ahead negative, can be 0 characters after
//		Pattern tNotVPattern = Pattern.compile(tNotVRegExp);
//		Matcher tNotVMatcher = tNotVPattern.matcher(tvTest);
//		
//		count = 0;
//		
//		while(tNotVMatcher.find()) {
//			System.out.println("Occurance " + count + " : " + tNotVMatcher.start() +
//					" to " + tNotVMatcher.end());
//		}
//		// t(?=v) would find ts followed by a v without including the v
//		
//		System.out.println("***************************************************************");
		
		// -----Challenges-----
		
		String challenge1 = "I want a bike.";
		String challenge2 = "I want a ball.";
		String challenge1RegEx = "^I[ ]{1}[a-z]{4}[ ]{1}a[ ]{1}[a-z]{4}.$";
		System.out.println(challenge1.matches(challenge1RegEx));
		System.out.println(challenge2.matches(challenge1RegEx));
		
		String challenge2RegEx = "I want a \\w+.";
		Pattern challenge3Pattern = Pattern.compile(challenge2RegEx);
		Matcher challenge3Matcher = challenge3Pattern.matcher(challenge1);
		System.out.println(challenge3Matcher.matches());
		//challenge3Matcher.reset();
		challenge3Matcher = challenge3Pattern.matcher(challenge2);
		System.out.println(challenge3Matcher.matches());
		
		String challenge4 = "Replace all blanks with underscores.";
		System.out.println(challenge4.replaceAll("\\s", "_"));
		
		String challenge5 = "aaabccccccccdddefffg";
		System.out.println(challenge5.matches("a+bc+d+e+f+g+"));
		System.out.println(challenge5.matches("^[a-g]+$")); // matches the complete string
		
		String challenge7 = "abcd.135";
		System.out.println(challenge7.matches("\\w+\\.\\d+")); // \\. dot literal, otherwise any character would be accepted as .
		
		String challenge8 = "abcd.135uvqz.7tzik.999";
		Pattern digitPattern = Pattern.compile("(\\d+)");
		Matcher digitMatcher = digitPattern.matcher(challenge8);
		
		while(digitMatcher.find()) {
			System.out.println(digitMatcher.group(0));
		}
		
		String challenge9 = "abcd.135\tuvqz.7\ttzik.999\n";
		Pattern pattern9 = Pattern.compile("[A-Za-z]+\\.(\\d+)\\s");
		Matcher matcher9 = pattern9.matcher(challenge9);
		
		while(matcher9.find()) {
			System.out.println(matcher9.group(1));
		}
		
		matcher9.reset();
		count = 0;
		
		while(matcher9.find()) {
			count++;
			System.out.println("Occurance " + count + " : " + matcher9.start(1) + // in () the number of the group
					" to " + (matcher9.end(1)-1)); // .end() returns the first index AFTER the group
		}
		
		String challenge11 = "{0, 2}, {0, 5}, {1, 3}, {2, 4}";
		Pattern pattern11 = Pattern.compile("\\{(\\d, \\d)\\}");
		Matcher matcher11 = pattern11.matcher(challenge11);
		
		while(matcher11.find()) {
			System.out.println(matcher11.group(1));
		}
		
		String usZip = "11111";
		Pattern zipPattern = Pattern.compile("^\\d{5}$");
		Matcher zipMatcher = zipPattern.matcher(usZip);
		
		System.out.println(zipMatcher.matches());
		
		String usZip2 = "11111-1111";
		System.out.println(usZip2.matches("^\\d{5}-\\d{4}$"));
		
		//Pattern anyUsZipPattern = Pattern.compile("^\\d{5}[-\\d{4}]*$");
		Pattern anyUsZipPattern = Pattern.compile("^\\d{5}(-\\d{4})?$");
		
		zipMatcher = anyUsZipPattern.matcher(usZip);
		Matcher zipMatcher2 = anyUsZipPattern.matcher(usZip2);
		
		System.out.println(zipMatcher.matches());
		System.out.println(zipMatcher2.matches());
		
	}
}
