<%@ include file="header.jspf" %>
<%@ include file="navigation.jspf" %>

<div class="container">
    <h2>Editar Tarea</h2>

    <!-- Aquí puedes agregar tu formulario para editar tarea -->
    <form method="post" action="/edit-task">
        <!-- Campo para el ID de la tarea a editar -->
        <label for="taskId">ID de Tarea:</label>
        <input type="number" id="taskId" name="taskId" required>

        <!-- Campos editables de la tarea -->
        <label for="descripcion">Nueva Descripción:</label>
        <input type="text" id="descripcion" name="descripcion" required>

        <label for="prioridad">Nueva Prioridad:</label>
        <select id="prioridad" name="prioridad" required>
            <option value="ALTA">Alta</option>
            <option value="MEDIA">Media</option>
            <option value="BAJA">Baja</option>
        </select>

        <label for="duracion">Nueva Duración:</label>
        <input type="number" id="duracion" name="duracion" required>

        <label for="estado">Nuevo Estado:</label>
        <select id="estado" name="estado" required>
            <option value="PENDIENTE">Pendiente</option>
            <option value="EN_PROGRESO">En Progreso</option>
            <option value="COMPLETADA">Completada</option>
        </select>

        <label for="presencial">Presencial:</label>
        <input type="checkbox" id="presencial" name="presencial">

       
        <button type="submit">Editar Tarea</button>
    </form>
</div>

<%@ include file="footer.jspf" %>
