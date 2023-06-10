package com.ruoyi.project.fcbj.controller;

import com.ruoyi.framework.web.domain.AjaxResult;
import lombok.extern.slf4j.Slf4j;
import org.apache.tomcat.util.http.fileupload.util.Streams;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.nio.charset.StandardCharsets;

@RestController
@RequestMapping("/fcbj")
@Slf4j
public class FileController {
    @Value("${file.path}")
    private String filePath;

    @PostMapping("/file/upload")
    public AjaxResult uploadFile(MultipartFile file) throws Exception {
        String fileName = file.getOriginalFilename();
        // System.out.println("上传文件开始：" + fileName);
        String[] fileNames = fileName.split("\\.");
        String fileNameFinal = "";
        long timeMillis = System.currentTimeMillis();
        if (fileNames.length > 1) {
            for (int i = 0; i < fileNames.length; i++) {
                if (i == 0) {
                    fileNameFinal = fileNames[0] + timeMillis;
                    continue;
                }
                if (i == fileNames.length - 1) {
                    fileNameFinal = fileNameFinal + "." + fileNames[fileNames.length - 1];
                    continue;
                }
                fileNameFinal += fileNames[i];
            }
        }
        String path = filePath + fileNameFinal;
        Streams.copy(file.getInputStream(), new FileOutputStream(path), true);
        // System.out.println("上传文件结束，文件路径：" + filePath);
        return AjaxResult.success(fileNameFinal);
    }

    @PostMapping("/file/download")
    public void downloadFile(@RequestParam String param, HttpServletResponse response) throws Exception {

        String filePathFinal = filePath + param;
        File file = new File(filePathFinal);
        String fileName = file.getName();
        InputStream fis;
        try {
            fis = new FileInputStream(file);
            response.reset();
            response.setCharacterEncoding("UTF-8");
            response.setContentType("application/octet-stream");
            response.setHeader("content-disposition", "attachement;fileName=" + new String(fileName.getBytes(StandardCharsets.UTF_8), StandardCharsets.ISO_8859_1));
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                response.getOutputStream().write(bytes, 0, len);
            }
            response.flushBuffer();
            fis.close();
        } catch (IOException e) {
            log.info("文件下载出错，错误信息：{}", e.getMessage());
            throw new RuntimeException("文件下载失败，请联系管理员查看系统日志。");
        }
    }
}
