package cn.java.dao;

import cn.java.mapper.BookMapper;
import cn.java.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

/**
 * @Author:beh
 * @Date:2020/5/13
 * @PackageName:cn.java.dao
 */
@Component
public class BookDao {
    @Autowired
    private BookMapper bookMapper;

    public List<Book> findBookByName(String bookname)
    {
        return bookMapper.findBookByName(bookname);
    }
}
