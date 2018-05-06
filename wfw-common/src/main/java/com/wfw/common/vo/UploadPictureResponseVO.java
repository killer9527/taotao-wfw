package com.wfw.common.vo;

/**
 * Created by killer9527 on 2018/5/1.
 */
public class UploadPictureResponseVO {
    /**
     * 上传图片返回值，成功：0	失败：1
     */
    private Integer error;
    /**
     * 回显图片使用的url
     */
    private String url;
    /**
     * 错误时的错误消息
     */
    private String message;

    /**
     * 正确上传时的构造函数
     * @param error
     * @param url
     */
    public UploadPictureResponseVO(Integer error, String url) {
        this.error = error;
        this.url = url;
    }

    /**
     * 上传失败时的构造函数
     * @param error
     * @param url
     * @param message
     */
    public UploadPictureResponseVO(Integer error, String url, String message) {
        this.error = error;
        this.url = url;
        this.message = message;
    }

    public Integer getError() {
        return error;
    }

    public void setError(Integer error) {
        this.error = error;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
