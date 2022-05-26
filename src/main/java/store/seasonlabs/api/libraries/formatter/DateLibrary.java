package store.seasonlabs.api.libraries.formatter;

import lombok.NoArgsConstructor;
import lombok.AccessLevel;
import lombok.NoArgsConstructor;

import java.text.SimpleDateFormat;
import java.util.GregorianCalendar;
import java.util.Locale;

@NoArgsConstructor
public class DateLibrary {

    private static final Locale LOCALE;

    private static final GregorianCalendar GREGORIAN_CALENDAR;
    private static final SimpleDateFormat SIMPLE_DATE_FORMAT;

    static {
        LOCALE = new Locale("pt", "BR");

        GREGORIAN_CALENDAR = new GregorianCalendar();
        SIMPLE_DATE_FORMAT = new SimpleDateFormat("dd/MM/yyyy 'às' HH:mm:ss", LOCALE);
    }

    public static String getCurrentDateTime() {
        return SIMPLE_DATE_FORMAT.format(GREGORIAN_CALENDAR.getTime());
    }
}