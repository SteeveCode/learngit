// majority of the code below were from Tim Buchalka's Complete Java Master class

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegEx {

	public static void main(String[] args) {
		
		String challenge1 = "I want a bike.";
		String challenge2 = "I want a ball.";
		String challenge3 = "I want a car.";
		String challenge4 = "Replace all blanks with underscores.";
		String challenge5 = "aaabccccccccdddefffg";
		String challenge6 = "abcd.135";
		String challenge7 = "abcd.135\tuvqz.7\ttzik.999\n";
		String challenge8 = "{1, 4}, {m, b}, {6, 5}, {1, u}, {k, d}";
		String challenge9 = "11111-1111";
		
		String regEx = "^([A-Z][ ]\\w{4}[ ][a][ ]\\w{4}[.]{1})";
		String regEx7 = "[a-d]{4}\\.\\d{3}\\s\\w{4}\\.7\\s\\w{4}\\.\\d{3}\\s";
		String regExGrp7 ="[a-z]+\\.(\\d+)\\s";
		
		System.out.println(challenge1.matches("^([A-Z][ ]\\w{4}[ ][a][ ]\\w{4}[.]{1})"));
		System.out.println(challenge2.matches("^([A-Z][ ]\\w{4}[ ][a][ ]\\w{4}[.]{1})"));
		System.out.println(challenge2.matches(regEx));
		
		Pattern regPattern = Pattern.compile(regEx);
		Pattern regPattern7 = Pattern.compile(regEx7);
		Pattern regPatternGrp7 = Pattern.compile(regExGrp7);
		Pattern regPatternGrp8 = Pattern.compile("\\{([a-z], [a-z])\\}");
		
		Matcher regMatcher = regPattern.matcher(challenge1);
		Matcher regMatcher7 = regPattern7.matcher(challenge7);
		System.out.println(regMatcher.matches());
		Matcher regMatcherGrp7 = regPatternGrp7.matcher(challenge7);
		Matcher regMatcherGrp8 = regPatternGrp8.matcher(challenge8);
		
		
		String new4 = challenge4.replaceAll("\\s","_");
		System.out.println(new4);
		System.out.println(challenge5.matches("^[a]{3}[a-z]{1}[a-z]{8}[a-z]{3}[e][f]{3}[g]$"));
		System.out.println(challenge5.replaceAll("^[a]{3}bc{8}d{3}ef{3}[g]$","REPLACED"));
		System.out.println(challenge5);
		System.out.println(challenge6.matches("[a-d]{4}.\\d{3}"));
		System.out.println(regMatcher7.matches());
		
		while(regMatcherGrp7.find()) {
			System.out.println(regMatcherGrp7.group(1));
		}
		
		System.out.println();// line break
		
		while(regMatcherGrp8.find()) {
			System.out.println(regMatcherGrp8.group(1));
		}
		
		System.out.println(challenge9.matches("^\\d{5}(-\\d{4})?$")); //optional characters group in bracket

	}

}
