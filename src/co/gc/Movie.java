package co.gc;

public class Movie {
private String title;
private String category;

public Movie(String title, String category)
{
this.title = title;
this.category = category;
}

public Movie()
{
	title ="No title entered";
	category = "No category entered";
}

public void setTitle(String title)
{
	this.title = title;
}

public String getTitle()
{
	return title;
}

public void setCategory(String category)
{
	this.category = category;
}

public String getCategory()
{
	return category;
}

@Override
public String toString()
{
	return String.format("%s, %s", category, title);
}


	
	
}
