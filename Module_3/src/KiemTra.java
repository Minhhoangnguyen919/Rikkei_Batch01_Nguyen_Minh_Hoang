import java.util.regex.Pattern;

public class KiemTra {
    String EMAIL_PATTERN =
            "^[a-zA-Z][\\w-]+@([\\w]+\\.[\\w]+|[\\w]+\\.[\\w]{2,}\\.[\\w]{2,})$";
    String MADONHANG="^(DH)(-)\\d{4}$";
    public boolean validate(String email) {
        return Pattern.matches(EMAIL_PATTERN,email);
    }
    public  boolean isNumeric(String str) {
        return str.matches("-?\\d+(\\.\\d+)?");
    }
    public boolean isMADH(String maDH){
        return maDH.matches(MADONHANG);
    }
}
