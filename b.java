// Código que guarda el comentario en la base de datos
String username = request.getParameter("username");
String comment = request.getParameter("comment");

// Guardar el comentario en la base de datos sin ningún tipo de filtrado
String query = "INSERT INTO comments (username, comment) VALUES ('" + username + "', '" + comment + "')";
Statement stmt = connection.createStatement();
stmt.executeUpdate(query);
