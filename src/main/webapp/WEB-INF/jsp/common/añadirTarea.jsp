<%@ include file="header.jspf" %>
<%@ include file="navigation.jspf" %>

<div class="container">
    <h2>A�adir Tarea</h2>

    <!-- Formulario para a�adir tarea -->
    <form method="post" action="/add-task">
        <!-- Campos del formulario -->
        <label for="id">ID:</label>
        <input type="number" id="id" name="id" required>

        <label for="descripcion">Descripci�n:</label>
        <input type="text" id="descripcion" name="descripcion" required>

        <label for="prioridad">Prioridad:</label>
        <select id="prioridad" name="prioridad" required>
            <option value="ALTA">Alta</option>
            <option value="MEDIA">Media</option>
            <option value="BAJA">Baja</option>
        </select>

        <label for="duracion">Duraci�n:</label>
        <input type="number" id="duracion" name="duracion" required>

        <label for="estado">Estado:</label>
        <select id="estado" name="estado" required>
            <option value="PENDIENTE">Pendiente</option>
            <option value="EN_PROGRESO">En Progreso</option>
            <option value="COMPLETADA">Completada</option>
        </select>

        <label for="presencial">Presencial:</label>
        <input type="checkbox" id="presencial" name="presencial">

        

        <button type="submit">A�adir Tarea</button>
    </form>
</div>

<%@ include file="footer.jspf" %></html>