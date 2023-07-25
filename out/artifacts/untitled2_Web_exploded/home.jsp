<%@ page import="java.util.List" %>
<%@ page import="models.Item" %>
<%@ page contentType="text/html;charset=UTF-8"
         language="java" %>
<html>
<head>
    <title>Title 2</title>
</head>
<body>

<table>
    <thead>
        <th>id</th>
        <th>name</th>
        <th>description</th>
        <th>price</th>
    </thead>

    <%
        List<Item> items = (List<Item>) request.getAttribute("items");
        for (Item item : items){

    %>

    <tr>
        <td><%=item.getId()%></td>
        <td><%=item.getName()%></td>
        <td><%=item.getDescription()%></td>
        <td><%=item.getPrice()%></td>
    </tr>

    <%
        }
    %>

    <tbody>
        <tr>
            <td>

            </td>
        </tr>
    </tbody>
</table>

</body>
</html>
