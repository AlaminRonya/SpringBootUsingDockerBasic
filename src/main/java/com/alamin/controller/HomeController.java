package com.alamin.controller;

import com.alamin.converter.DtoToUserConverter;
import com.alamin.dao.UserDao;
import com.alamin.dto.UserDto;
import com.alamin.entities.Address;
import com.alamin.entities.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.servlet.ServletContext;
import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

@Controller
public class HomeController {
    public static String uploadDir = System.getProperty("user.dir")+"/src/main/webapp/WEB-INF/resources/images";

    @Autowired
    ServletContext servletContext;
    @Autowired
    private DtoToUserConverter userConverter;
    @Autowired
    private UserDao userDao;


    @GetMapping("/")
    public String helloWorld(@ModelAttribute("userDto") UserDto userDto,
                             @RequestParam("profileImage")MultipartFile file,
                             Model model) {
//        model.addAttribute("name", "World");
        return "index";
    }

//    @PostMapping("/add")
//    public String store(@ModelAttribute("userDto") UserDto userDto) {
//        model.addAttribute("user", user);
//
//        user.setId(System.currentTimeMillis());
//        userDAO.insert(user);

//        Address address = new Address();
//        address.setName("Rajnarayanpur");

//        User user = userConverter.dtoToEntity(userDto);
//        user.setAddress(address);
//        userDao.insert(user);
//        return "user_details";
//    }
@PostMapping("/add")
public String store(@ModelAttribute("userDto") UserDto userDto,
                    @RequestParam("profileImage")MultipartFile file) throws IOException {
//        if (result.hasErrors()) {
//            return "userForm";
//        }
//
//        MultipartFile multipartFile = userDto.getProfileImage();
//        if (multipartFile != null || !multipartFile.isEmpty()) {
//
//            String fileName = servletContext.getRealPath("/") + "resources/images/" + multipartFile.getOriginalFilename();
//            try {
//                multipartFile.transferTo(new File(fileName));
//            } catch (IOException e) {
//                e.printStackTrace();
//            }
//        }
//
//        User user = userConverter.dtoToEntity(userDto);

        //Save to DB
//        redirectAttributes.addFlashAttribute("savedUser", user);

        String imageUUID;
        if (!file.isEmpty()){
            imageUUID = file.getOriginalFilename();
            Path fileNameAndPath = Paths.get(uploadDir, imageUUID);
            Files.write(fileNameAndPath, file.getBytes());
        }else {
            imageUUID="klkjh";
//            imageUUID = imgName;
        }
    System.out.println("---------->"+imageUUID);

        return "redirect:/user/userDetails";
    }

    @GetMapping("/all")
    public String getAllView(Model model) {
        model.addAttribute("users", userDao.getAll());
        return "viewAllUser";
    }

    @GetMapping("/userDetails")
    public String success() {

        return "success";
    }
}
