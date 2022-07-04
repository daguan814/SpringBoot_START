package org.dagaun.springboot_01.dao;

import org.apache.ibatis.annotations.*;
import org.dagaun.springboot_01.dao.pojo.Book;

import java.util.List;

/**
 * @ClassName: BookDao
 * @Description: TODO
 * @author: ´ï¹Û
 * @date: 2022/6/30  23:23
 */


@Mapper
public interface BookDao {



    @Insert("insert into book (name,type,description) values(#{name},#{type},#{description})")
    public  int save(Book book);

    @Delete("delete from book where id = #{id}")
    public int delete(Integer id);

    @Update("update book set id=#{id}, name = #{name}, type =#{type}, description=#{description},where id = #{id}")
    public int update(Book book);

    @Select("select * from book where id = #{id}")
    public Book geyById(Integer id);

    @Select("select * from book")
    public List<Book> getAll();




}
