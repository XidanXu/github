package leetcode.easy;

public class LicenseKeyFormatting {

	public String licenseKeyFormatting(String S, int K) {
        S = S.toUpperCase();
        StringBuffer resultReversed = new StringBuffer();
        S.replaceAll("-", "");
        System.out.println(S);
        for(int i = S.length() - 1 ; i >= 0; i --) {
        		
        		if((S.length() - i) % (K + 1) == 0) {
        			resultReversed.append("-");
        		}
        		resultReversed.append(S.charAt(i));
        }
        
        return resultReversed.reverse().toString();
    }
}
