package co.fx;

import org.apache.commons.lang3.StringUtils;

/**
 * This is remove the string all space in the statement*/
public class RemoveWhiteSpaceString {
	public static void main(String[] args) {
		String strr="  	this is hot os  ";
		String nospace="";
		System.out.println(strr.trim());
		String[] arr = strr.split("\\s");
		StringBuffer sb = new StringBuffer();
		for(String e:arr) {
			sb.append(e);
		}
		System.out.println(sb);
		
		for(int i=0;i<strr.length();i++) {
			if((strr.charAt(i)!=' ') && (strr.charAt(i)!='\t')) {
				nospace=nospace+strr.charAt(i);
			}
		}
		System.out.println(nospace);
		System.out.println(strr.replaceAll("\\s+",""));
		String remStr = StringUtils.deleteWhitespace(strr);
		System.out.println(remStr);
	}

}
