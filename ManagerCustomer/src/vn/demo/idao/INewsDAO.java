package vn.demo.idao;

import java.beans.Statement;
import java.util.ArrayList;

import vn.demo.bo.News;

public interface INewsDAO {
	public void addNews(News n, Statement s);
	public void deleteNewsByName(String Named, Statement s);
	public void findNewsByName(String Namef, Statement s);
	public void getNews(Statement s);
	public void updateNewsByName(String NameU, Statement s);
}
