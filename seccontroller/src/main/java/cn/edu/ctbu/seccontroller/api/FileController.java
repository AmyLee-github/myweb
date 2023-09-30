package cn.edu.ctbu.seccontroller.api;

import cn.edu.ctbu.seccontroller.core.domain.AjaxResult;
import cn.hutool.core.io.FileUtil;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("api/file")
public class FileController {

    @PostMapping("/upload")
    public AjaxResult upload(@RequestParam("file") MultipartFile file, @RequestParam("id") Integer id) {
        try {
            String fileName = file.getOriginalFilename();
            FileUtil.writeBytes(file.getBytes(), fileName);
            return AjaxResult.success(fileName);
        } catch (Exception e) {
            return AjaxResult.error("文件写入出错：" + e.getMessage());
        }
    }
}
