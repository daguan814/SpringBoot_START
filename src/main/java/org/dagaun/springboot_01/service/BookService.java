package org.dagaun.springboot_01.service;

import org.dagaun.springboot_01.dao.BookDao;
import org.dagaun.springboot_01.dao.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @ClassName: BookService
 * @Description: TODO
 * @author: ´ï¹Û
 * @date: 2022/7/4  22:17
 */

@Transactional
public interface BookService {

    public boolean sava(Book book);

    public boolean delete(Integer id);

    public boolean update(Book book);

    public Book geyById(Integer id);

    public List<Book> getAll();





}
