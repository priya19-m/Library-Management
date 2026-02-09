package com.wipro.book.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.wipro.book.bean.BookBean;
import com.wipro.book.util.DBUtil;

public class BookDAO {

    public int createBook(BookBean bookBean) {
        int result = 0;
        Connection con = DBUtil.getDBConnection();
        String query = "INSERT INTO BOOK_TABLE VALUES (?,?,?,?,?)";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, bookBean.getIsbn());
            ps.setString(2, bookBean.getBookName());
            ps.setString(3, String.valueOf(bookBean.getBookType()));
            ps.setInt(4, bookBean.getAuthor().getAuthorCode());
            ps.setFloat(5, bookBean.getCost());
            result = ps.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return result;
    }

    public BookBean fetchBook(String isbn) {
        BookBean bookBean = null;
        Connection con = DBUtil.getDBConnection();
        String query = "SELECT * FROM BOOK_TABLE WHERE ISBN = ?";

        try {
            PreparedStatement ps = con.prepareStatement(query);
            ps.setString(1, isbn);
            ResultSet rs = ps.executeQuery();

            if (rs.next()) {
                bookBean = new BookBean();
                bookBean.setIsbn(rs.getString("ISBN"));
                bookBean.setBookName(rs.getString("BOOK_TITLE"));
                bookBean.setBookType(rs.getString("BOOK_TYPE").charAt(0));
                bookBean.setCost(rs.getFloat("BOOK_COST"));

                int authorCode = rs.getInt("AUTHOR_CODE");
                bookBean.setAuthor(new AuthorDAO().getAuthor(authorCode));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bookBean;
    }
}
