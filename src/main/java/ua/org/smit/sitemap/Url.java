package ua.org.smit.sitemap;

import java.util.Optional;
import ua.org.smit.common.model.time.Time;

/**
 *
 * @author smit
 */
class Url {

    // Родительский тег для каждой записи URL-адреса. Остальные теги являются дочерними для этого тега.
    private static final String TAG_OPEN = "<url>";
    private static final String TAG_CLOSE = "</url>";

    private final Loc loc;
    private Optional<LastMod> lastMod = Optional.empty();
    private Optional<ChangeFreq> changefreq = Optional.empty();
    private Optional<Priority> priority = Optional.empty();

    public Url(Loc loc) {
        this.loc = loc;
    }

    public void setLastModAsNow() {
        LastMod item = new LastMod(new Time());
        lastMod = Optional.of(item);
    }

    void setChangeFreq(Optional<ChangeFreq> changefreq) {
        this.changefreq = changefreq;
    }

    void setPriority(Optional<Priority> priority) {
        this.priority = priority;
    }

    void setLastMod(Optional<LastMod> lastMod) {
        this.lastMod = lastMod;
    }

    String getValue() {
        StringBuilder value = new StringBuilder();

        value.append(TAG_OPEN);

        value.append(loc.getValue());

        if (lastMod.isPresent()) {
            value.append("<lastmod>" + lastMod.get().getYYYYmmDD() + "</lastmod>");
        }

        if (changefreq.isPresent()) {
            value.append("<changefreq>" + changefreq.get().name() + "</changefreq>");
        }
        if (priority.isPresent()) {
            value.append("<priority>" + priority.get().getValue() + "</priority>");
        }

        value.append(TAG_CLOSE);
        value.append('\n');
        return value.toString();
    }

}
