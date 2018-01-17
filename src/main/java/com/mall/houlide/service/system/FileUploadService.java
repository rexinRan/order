package com.mall.houlide.service.system;

/**
 * Created by rexin on 2018/1/15.
 */
public interface FileUploadService {

    String fileUpload(byte[] file, String name, long size);

}
