package com.robertleehoehle;

/**
 * @author Robert Hoehle
 */
public class Photo {

    private String albumId;
    private String id;
    private String title;
    private String url;
    private String thumbNailUrl;

    public Photo(String albumId, String id, String title, String url, String thumbNailUrl) {
        this.albumId = albumId;
        this.id = id;
        this.title = title;
        this.url = url;
        this.thumbNailUrl = thumbNailUrl;
    }

    // retrieves albumId from object
    public String getAlbumId() {
        return albumId;
    }

    public String getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getUrl() {
        return url;
    }

    public String getThumbNailUrl() {
        return thumbNailUrl;
    }

    public void setAlbumId(String albumId) {
        this.albumId = albumId;
    }

    public void setId(String id) {
        this.id = id;
    }

    /*
     * sets title for object
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /*
     * sets url for object
     */
    public void setUrl(String url) {
        this.url = url;
    }

    public void setThumbNailUrl(String TNurl) {
        this.thumbNailUrl = TNurl;
    }

    public String toString() {
        return "> photo-album " + albumId +
                "  |  [" + id +
                "]  |  " + "'" + title + "'";
//                "url=" + url +
//                "thumbnailUrl=" + thumbNailUrl;
    }

}
