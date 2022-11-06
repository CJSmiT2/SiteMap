package ua.org.smit.sitemap;

import java.sql.Timestamp;
import ua.org.smit.common.model.time.Time;



/**
 *
 * @author smit
 */
public class LastMod extends Time {

    // Дата последнего изменения файла. Эта дата должна быть в формате W3C Datetime. 
    // Этот формат позволяет при необходимости опустить сегмент времени и использовать формат ГГГГ-ММ-ДД.
    // Обратите внимание, что этот тег не имеет отношения к заголовку "If-Modified-Since (304)", 
    // который может вернуть сервер, поэтому поисковые системы могут по-разному использовать информацию из этих двух источников.
    
    public LastMod(long time) {
        super(time);
    }

    public LastMod(Timestamp time) {
        super(time);
    }

    public LastMod() {
    }

}
