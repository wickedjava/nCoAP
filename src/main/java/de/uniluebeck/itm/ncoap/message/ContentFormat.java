package de.uniluebeck.itm.ncoap.message;

/**
 * Created with IntelliJ IDEA.
 * User: olli
 * Date: 03.11.13
 * Time: 15:56
 * To change this template use File | Settings | File Templates.
 */
public abstract class ContentFormat {
    public static final long    UNKNOWN             = -1;
    public static final long    TEXT_PLAIN_UTF8     = 0;
    public static final long    APP_LINK_FORMAT     = 40;
    public static final long    APP_XML             = 41;
    public static final long    APP_OCTET_STREAM    = 42;
    public static final long    APP_EXI             = 47;
    public static final long    APP_JSON            = 50;
    public static final long    APP_RDF_XML         = 201;
    public static final long    APP_TURTLE          = 202;
    public static final long    APP_N3              = 203;
    public static final long    APP_SHDT            = 205;
}