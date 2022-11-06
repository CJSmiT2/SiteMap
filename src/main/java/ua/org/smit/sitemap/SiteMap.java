package ua.org.smit.sitemap;

import java.util.Optional;

/**
 *
 * @author smit
 */
public class SiteMap {

    private final String XML_VERSION = "<?xml version='1.0' encoding='UTF-8'?>";
    
    private final UrlSet urlSet = new UrlSet();
    
    public void addUrl(
            Loc loc, 
            Optional<LastMod> lastMod,
            Optional<ChangeFreq> changefreq,
            Optional<Priority> priority){

        urlSet.add(loc, lastMod, changefreq, priority);
    }
    
    public String getResult(){
        StringBuilder result = new StringBuilder();
        
        result.append(XML_VERSION);
        result.append(urlSet.getResult());
        
        return result.toString();
    }
}
