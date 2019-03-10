import org.apache.commons.lang3.StringUtils;

public class RegularUtils {

    private static final String EMAIL_PATTERN =
            "^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@"
                    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

    public static boolean validEmail(String str) {
        if(StringUtils.isBlank(str))
            return false;
        return str.matches(EMAIL_PATTERN);
    }

    private static final String HTTP_URL_PATTERN =
            "\\b(https?)://[-a-zA-Z0-9+&@#/%?=~_|!:,.;]*[-a-zA-Z0-9+&@#/%=~_|]";

    public static boolean validHttpUrl(String str) {
        if(StringUtils.isBlank(str))
            return false;
        return str.matches(HTTP_URL_PATTERN);
    }

}