package com.daguan.dao;

import com.daguan.domain.Book;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

// TODO 添加@Mapper
@Mapper
@Repository
public interface BookDao {
    @Insert("insert into book (type,name,description) values(#{type},#{name},#{description})")
    public int save(Book book);

    @Update("update book set type = #{type}, name = #{name}, description = #{description} where id = #{id}")
    public int update(Book book);

    @Delete("delete from book where id = #{id}")
    public int delete(Integer id);

    @Select("select * from book where id = #{id}")
    public Book getById(Integer id);

    @Select("select * from book")
    public List<Book> getAll();
}
