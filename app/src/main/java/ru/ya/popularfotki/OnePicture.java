package ru.ya.popularfotki;

/**
 * Created by vanya on 17.01.15.
 */
public class OnePicture {
    private String URLS;
    private String URLXL;
    private String yandexId;
    private String Path;
    private Boolean alreadyLoad;

    public void setAlreadyLoad(Boolean alreadyLoad) {
        this.alreadyLoad = alreadyLoad;
    }

    public String getURLXL() {
        return URLXL;
    }

    public String getPath() {
        return Path;
    }

    public String getURLS() {
        return URLS;
    }

    public void setPath(String path) {
        this.Path = path;
    }

    public String getHttpXL() {
        return URLXL;
    }

    public String getYandexId() {
        return yandexId;
    }

    public Boolean getAlreadyLoad() {
        return alreadyLoad;
    }

    public OnePicture(String URLS, String URLXL, String yandexId) {
        this.URLS = URLS;
        this.URLXL = URLXL;
        this.yandexId = yandexId;
    }
}
