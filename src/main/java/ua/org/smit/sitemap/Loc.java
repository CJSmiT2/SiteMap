package ua.org.smit.sitemap;

/**
 *
 * @author smit
 */
public class Loc {

    // URL-адрес страницы. Этот URL-адрес должен начинаться с префикса (например, HTTP) 
    // и заканчиваться косой чертой, если Ваш веб-сервер требует этого. 
    // Длина этого значения не должна превышать 2048 символов.
    private final String adress;

    public Loc(String domain, String url) {
        this.adress = domain + url;
    }

    public String getValue() {
        return "<loc>" + adress + "</loc>";
    }

}
