<%@ include file="header.jspf" %>
<%@ include file="navigation.jspf" %>

<div class="container">
    <h2>Ver Lista de Tareas</h2>

     <form method="post" action="/view-tasks">
                <label for="taskId">Filtrar por ID:</label>
        <input type="text" id="taskId" name="taskId">

        
        <label for="nombre">Filtrar por Nombre:</label>
        <input type="text" id="nombre" name="nombre">

        <button type="submit">Ver Lista de Tareas</button>
    </form>

    <c:if test="${not empty tareas}">
        <h3>Lista de Tareas</h3>
        <table class="table">
            <thead>
                <tr>
                    <th>ID</th>
                    <th>Descripción</th>
                   
                </tr>
            </thead>
            <tbody>
                <c:forEach var="tarea" items="${tareas}">
                    <tr>
                        <td>${tarea.id}</td>
                        <td>${tarea.descripcion}</td>
                       </tr>
                </c:forEach>
            </tbody>
        </table>
    </c:if>
</div>

<%@ include file="footer.jspf" %>