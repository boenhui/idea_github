package cn.java.mapper;

import cn.java.pojo.Book;

import java.util.List;

/**
 * @Author:beh
 * @Date:2020/5/13
 * @PackageName:cn.java.mapper
 */
public interface BookMapper {
    public List<Book> findBookByName(String bookname);
}
