package utlity;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class Conversion {


    public static String convertCountry(String shortCountry)
    {
        String convertedCountry="";

        switch (shortCountry)
        {
            case "IN" : convertedCountry="India";break;
            case "DZ" : convertedCountry="Algeria";break;
            case "BR" : convertedCountry="Brazil";break;
            case "CN" : convertedCountry="China";break;
            case "DK" : convertedCountry="Denmark";break;
            case "DE" : convertedCountry="Germany";break;
        }
        return  convertedCountry;
    }

    public static String getGender(String genderId)
    {
        String gender = "";

        switch (genderId)
        {
            case "0" : gender="Male";break;
            case "1" : gender="Female";break;
            case "2" : gender="Other";break;
        }
        return gender;
    }

    /*  Expected :02/13/1985 - excel - MM/dd/yyyy
        Actual   :1985-02-13 - DB -   yyyy-MM-dd
    */

    public static String convertDate(String dbDateStr) throws ParseException // yyyy-MM-dd
    {
        Date date = new SimpleDateFormat("yyyy-MM-dd").parse(dbDateStr);
        //PSD


        // convert date into string

        String convertedDate = new SimpleDateFormat("MM/dd/yyyy").format(date);

        return convertedDate;
    }
}
