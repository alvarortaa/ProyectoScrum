<%@ include file="header.jspf" %>
<%@ include file="navigation.jspf" %>

<div class="container">
    <h2>Eliminar Tarea</h2>

       <form method="post" action="/delete-task">
       <label for="taskId">ID de Tarea:</label>
        <input type="number" id="taskId" name="taskId" required>

        <button type="submit">Eliminar Tarea</button>
    </form>
</div>

<%@ include file="footer.jspf" %>
