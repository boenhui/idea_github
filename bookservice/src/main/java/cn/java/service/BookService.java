package cn.java.service;

import cn.java.dao.BookDao;
import cn.java.pojo.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author:beh
 * @Date:2020/5/13
 * @PackageName:cn.java.service
 */
@Service
public class BookService {

    @Autowired
    private BookDao bookDao;

    public List<Book> findBookById(String boookname)
    {
        return bookDao.findBookByName(boookname);
    }
}
