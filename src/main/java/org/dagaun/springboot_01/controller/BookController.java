package org.dagaun.springboot_01.controller;

import org.dagaun.springboot_01.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @ClassName: BookController
 * @Description: TODO
 * @author: ´ï¹Û
 * @date: 2022/7/4  23:09
 */

@RestController
@RequestMapping("/books")
public class BookController {
    @Autowired
    private BookService bookService;


}
