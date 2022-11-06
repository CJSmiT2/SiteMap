package ua.org.smit.sitemap;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

/**
 *
 * @author smit
 */
class UrlSet {

    private static final String URL_SET_START = "<urlset xmlns='http://www.sitemaps.org/schemas/sitemap/0.9'>";
    private static final String URL_SET_END = "</urlset>";
    
    private final List<Url> urls = new ArrayList<>();

    void add(Loc loc, 
            Optional<LastMod> lastMod, 
            Optional<ChangeFreq> changefreq, 
            Optional<Priority> priority) {
        
        Url url = new Url(loc);
        url.setChangeFreq(changefreq);
        url.setLastMod(lastMod);
        url.setLastMod(lastMod);

        urls.add(url);
    }

    String getResult() {
        StringBuilder result = new StringBuilder();
        result.append(URL_SET_START);
        
        for (Url url : urls){
            result.append(url.getValue());
        }
        
        result.append(URL_SET_END);
        return result.toString();
    }

}
