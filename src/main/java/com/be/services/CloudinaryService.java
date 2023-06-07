package com.be.services;

import com.cloudinary.Cloudinary;
import com.cloudinary.utils.ObjectUtils;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;
import java.util.Map;

public class CloudinaryService {
    private Cloudinary cloudinary;

    private String cloudName = "dweyqefdv";
    private String apiKey = "886292824638157";
    private String apiSecret = "g6vGm2exJecdQz5U__vujoitkDM";

    public CloudinaryService() {
        this.cloudinary = new Cloudinary(ObjectUtils.asMap(
                "cloud_name", cloudName,
                "api_key", apiKey,
                "api_secret", apiSecret,
                "secure", true));
    }

    public String upload(MultipartFile file) throws IOException {
        Map uploadResult = cloudinary.uploader().upload(file.getBytes(), ObjectUtils.emptyMap());
        return uploadResult.get("public_id").toString();
    }

    public void delete(String publicId) throws IOException {
        cloudinary.uploader().destroy(publicId, ObjectUtils.emptyMap());
    }

    public void update(String publicId, MultipartFile file) throws IOException {
        delete(publicId);
        upload(file);
    }

    public String getUrl(String publicId) {
        return cloudinary.url().generate(publicId);
    }
}
