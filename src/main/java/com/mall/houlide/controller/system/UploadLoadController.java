package com.mall.houlide.controller.system;

import com.mall.houlide.service.system.FileUploadService;
import com.mall.houlide.serviceImpl.system.web.Constants;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * 上传图片
 * Created by rexin on 2018/1/15.
 */
@Controller
public class UploadLoadController {

    @Autowired
    private FileUploadService fileUploadService;


    //上传图片
    @RequestMapping(value = "fileUpload.do")
    public void fileUpload(@RequestParam(required = false) MultipartFile files, HttpServletResponse response) throws IOException {
        String path = fileUploadService.fileUpload(files.getBytes(), files.getOriginalFilename(), files.getSize());
        String url = Constants.FILE_URL + path;

        JSONObject jsonObject = new JSONObject();
        jsonObject.put("url", url);
        jsonObject.put("path", path);

        response.setContentType("application/json,chatset=UTF-8");
        response.getWriter().write(jsonObject.toString());


    }

}
