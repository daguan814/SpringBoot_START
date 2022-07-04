package org.dagaun.springboot_01.service.impl;

import org.dagaun.springboot_01.dao.BookDao;
import org.dagaun.springboot_01.dao.pojo.Book;
import org.dagaun.springboot_01.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @ClassName: BookServiceImpl
 * @Description: TODO
 * @author: 达观
 * @date: 2022/7/4  22:18
 */

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookDao bookDao;

    @Override
    public boolean sava(Book book) {
        return bookDao.save(book) > 0;  //此处返回的是修改的行数是否大于 0
    }

    @Override
    public boolean delete(Integer id) {
        return bookDao.delete(id) > 0;
    }

    @Override
    public boolean update(Book book) {
        return bookDao.update(book) > 0;
    }

    @Override
    public Book geyById(Integer id) {
        if (id <= 0 || id >= 100){

        }
        return bookDao.geyById(id);
    }

    @Override
    public List<Book> getAll() {
        return bookDao.getAll();
    }
}
