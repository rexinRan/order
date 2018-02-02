package com.mall.houlide.serviceImpl.system;

import com.mall.houlide.service.system.FileUploadService;
import com.mall.houlide.util.FastFDSUtils;
import org.springframework.stereotype.Service;

/**
 * Created by rexin on 2018/1/15.
 */
@Service("fileUploadService")

public class FileUploadServiceImpl implements FileUploadService {

    //上传图片


    @Override
    public String fileUpload(byte[] file, String name, long size) {
        return FastFDSUtils.uploaFile(file, name, size);
    }
}
