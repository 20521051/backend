package com.be.services;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;

import org.springframework.context.annotation.Bean;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public class CloudinaryService {
    private Cloudinary cloudinary;

    public CloudinaryService(Cloudinary cloudinary) {
        this.cloudinary = cloudinary;
    }

    public CloudinaryService() {
        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name",
                "dweyqefdv",
                "api_key",
                "886292824638157",
                "api_secret",
                "g6vGm2exJecdQz5U__vujoitkDM",
                "secure", true));
    }

    public String upload(MultipartFile file) throws IOException {
        Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
        return uploadResult.get("public_id").toString();
    }

    public void delete(String publicId) throws IOException {
        String[] parts = publicId.split("/");
        cloudinary.uploader().destroy(parts[1], ObjectUtils.emptyMap());
    }

    public void update(String publicId, MultipartFile file) throws IOException {
        delete(publicId);
        upload(file);
    }

    public String getUrl(String publicId, String folderName) {
        String[] parts = publicId.split("/");
        String temp = cloudinary.url().generate(parts[1]);
        int lastIndex = temp.lastIndexOf("/");
        if (lastIndex != -1) {
            return temp.substring(0, lastIndex + 1) + folderName + "/" + temp.substring(lastIndex + 1);
        }
        return "https://res.cloudinary.com/cake-shop/image/upload/v1662910949/default-image_n5nxby.jpg";
    }
}
