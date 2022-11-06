package ua.org.smit.sitemap;

/**
 *
 * @author smit
 */
public class Priority {

    // Приоритетность URL относительно других URL на Вашем сайте. 
    // Допустимый диапазон значений — от 0,0 до 1,0. Это значение не влияет на процедуру сравнения Ваших страниц со страницами 
    // на других сайтах — оно только позволяет указать поисковым системам, какие страницы, по Вашему мнению, более важны для сканеров.
    //
    // Приоритет страницы по умолчанию — 0,5.
    private final String value;

    public Priority(String value) {
        this.value = value;
//        valid(value);
    }

    private void valid(String value) {
        if (value == null) {
            throw new NullPointerException("Priority value cant be is null!");
        }
        if (value.isEmpty()) {
            throw new RuntimeException("Priority value cant be empty!");
        }
        if (!value.contains(",")) {
            throw new RuntimeException("Priority must have ','! Value = '" + value + "'");
        }
        String[] numbers = value.split(".");

        float number1 = Float.valueOf(numbers[0]);
        float number2 = Float.valueOf(numbers[1]);

        if (number1 < 0) {
            throw new RuntimeException("Out of range! Must be >=0 && <=1; Current = '" + number1 + "'");
        }
        if (number1 > 1) {
            throw new RuntimeException("Out of range! Must be >=0 && <=1; Current = '" + number1 + "'");
        }
        if (number2 < 0) {
            throw new RuntimeException("Out of range! Must be >=0 && <=10; Current = '" + number2 + "'");
        }
        if (number2 > 10) {
            throw new RuntimeException("Out of range! Must be >=0 && <=10; Current = '" + number2 + "'");
        }
    }

    public String getValue() {
        return value;
    }

}
