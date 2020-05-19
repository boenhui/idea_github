package cn.java.controller;

import cn.java.pojo.Book;
import cn.java.service.BookService;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @Author:beh
 * @Date:2020/5/13
 * @PackageName:cn.java.controller
 */
@Controller
public class BookController {
    @Autowired
    private BookService bookService;

    @RequestMapping("findBookByName")
    @ResponseBody
    public PageInfo find(@RequestParam(defaultValue = "1",value = "pageNum") Integer pageNum, String bookname)
    {
        System.out.println(pageNum);
        PageHelper.startPage(pageNum,1);
        List<Book> bookById = bookService.findBookById(bookname);
        PageInfo pageInfo=new PageInfo<Book>(bookById,2);
       /* System.out.println("数据:"+pageInfo.getList());
        System.out.println("此页页数:"+pageInfo.getPageNum());
        System.out.println("页数:"+pageInfo.getPages());
        System.out.println("此页中的数据数量:"+pageInfo.getPageSize());
        System.out.println("上一页:"+pageInfo.getPrePage());
        System.out.println("下一页:"+pageInfo.getNextPage());
        System.out.println("页数坐标数组:"+pageInfo.getNavigatepageNums());
        System.out.println("是否是首页:"+pageInfo.isIsFirstPage());
        System.out.println("是否是尾页:"+pageInfo.isIsLastPage());

*/
        return pageInfo;
    }
}
