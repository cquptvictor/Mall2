package com.cqupt.zyx.Utils;

import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;
import java.util.Date;
public class FileUploadUtil {
    private static String base = "/usr/local/tomcat/webapps/Mall/";
    public static String save(MultipartFile multipartFile,String fileName ){
            int dir1 = fileName.hashCode()&0xf;
            int dir2 = fileName.hashCode()&0xf0;
            String suffix =  "upload" +File.separator+dir1+File.separator+dir2+File.separator+new Date().getTime()+".jpg";
            String path  = base + suffix;
            File file = new File(path);
            System.out.println(file.exists());
            System.out.println(file.getParentFile().getPath());
            if(!file.getParentFile().exists()) {
                file.getParentFile().mkdirs();
            }
        try {
            multipartFile.transferTo(file);
        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
        return suffix;
    }


}
