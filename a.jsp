<!-- Código en el que se muestran los comentarios guardados -->
<% 
    String query = "SELECT username, comment FROM comments";
    ResultSet rs = stmt.executeQuery(query);
    while (rs.next()) {
%>
        <p><strong><%= rs.getString("username") %>:</strong> <%= rs.getString("comment") %></p>
<%
    }
%>
