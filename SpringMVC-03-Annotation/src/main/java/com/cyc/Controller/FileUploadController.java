package com.cyc.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.http.HttpServletRequest;
import java.io.File;
import java.io.IOException;

@Controller
public class FileUploadController {
    //上传文件会自动绑定到MultipartFile中
    @RequestMapping(value = "/upload", method = RequestMethod.POST)
    public String upload(HttpServletRequest request, @RequestParam(value = "description",required = false) String description,
                         @RequestParam(value = "file",required = false) MultipartFile file) throws IOException {
        System.out.println(description);
        //如果文件不为空，写入上传路径
        if(!file.isEmpty()){
            //上传文件路径
            String path = request.getServletPath();
            //上传文件名
            String fileName = file.getOriginalFilename();
            File filePath = new File(path, fileName);
            //判断路径是否存在，如果不存在就创建一个
            if(!filePath.getParentFile().exists()){
                filePath.getParentFile().mkdirs();
            }
            //将上传文件保存到一个目录文件当中  该方法会抛出异常
            file.transferTo(new File(path+File.separator+fileName));
            return "hello";
        }else{
            return "hhh";
        }
    }

    @GetMapping("/uploadForm")
    public String uploadForm(){
        return "uploadForm";
    }
}
