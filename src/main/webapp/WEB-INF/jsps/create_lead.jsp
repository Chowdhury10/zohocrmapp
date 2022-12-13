<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>create lead</title>
</head>
<body>
  <h2>Lead | Create</h2>
  <hr>
  <form action="saveLead" method="post">
		<pre>
			First Name:<input type="text" name="firstName"/>
			Last Name:<input type="text" name="lastName"/>
			Email:<input type="email" name="email"/>
			Mobile:<input type="number" name="mobile"/>
			source:
				<select name="source">
					<option value="Radio">Radio</option>
					<option value="News Paper">News Paper</option>
					<option value="Trade Show">Trade Show</option>
					<option value="Website">Website</option>
				</select>
				<input type="submit" value="save"/>
		</pre>
		</form>
		<hr>
</body>
</html>