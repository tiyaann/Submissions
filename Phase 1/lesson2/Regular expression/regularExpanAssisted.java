package demo1;

import java.util.regex.*;

public class regularExpanAssisted {

public static void main(String[] args) {

	String pattern = "[a-z]+";
	String check = "Regular Expressions";
	Pattern p = Pattern.compile(pattern);
	Matcher c = p.matcher(check);
	
	while (c.find())
      	System.out.println( check.substring( c.start(), c.end() ) );
	}
}

