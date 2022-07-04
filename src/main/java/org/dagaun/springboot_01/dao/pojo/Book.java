package org.dagaun.springboot_01.dao.pojo;

import lombok.Data;

/**
 * @ClassName: Book
 * @Description: TODO
 * @author: ´ï¹Û
 * @date: 2022/6/30  23:23
 */

@Data
public class Book {

    private Integer id;
    private String name;
    private String type;
    private String description;

}
