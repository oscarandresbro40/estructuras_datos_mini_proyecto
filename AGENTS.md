# Proyecto de Estructura de Datos

Este proyecto Java gestiona países, personas e inscripciones de un congreso y compara cuatro colecciones. Conserva la implementación de ArrayList como referencia y respeta las firmas y los validadores de la base.

## Ramas y alcance

- Trabaja en la rama de la estructura asignada, por ejemplo `feat/hashset` o `feat/hashmap`.
- Revisa `git status` antes de editar. Conserva los cambios de otros integrantes y evita reformatear secciones ajenas a la tarea.
- Si varias alternativas comparten un archivo, como `Operaciones.java`, edita solo el bloque de la estructura asignada.

## Marcadores de inicio y fin

Delimita todo bloque de código nuevo de una estructura con comentarios en español. Usa el nombre de la estructura y el del método o tarea en ambos marcadores. Por ejemplo:

```java
//**** INICIO: HashSet - buscarPersona ****//
// Aquí va el bloque de implementación.
//**** FIN: HashSet - buscarPersona ****//
```

- En un método compartido, coloca los marcadores alrededor del bloque de tu estructura.
- Si agregas un método auxiliar completo, delimita el método completo. Aplica la misma regla a otros bloques nuevos de la tarea, incluso si están en otro archivo.
- Sustituye `HashSet` y `buscarPersona` por los nombres correspondientes. El comentario central del ejemplo solo indica dónde va el código.
- Mantén los marcadores al actualizar un bloque existente para que el equipo pueda ubicar el aporte al revisar o resolver un merge.

## Verificación y commits

- Compila todos los fuentes y comprueba los escenarios del enunciado que correspondan a la tarea. Indica qué verificaste y qué quedó pendiente.
- Haz un commit local por cada tarea completada y verificada. Incluye los marcadores en el mismo commit y menciona la estructura y el nombre del método o tarea en el mensaje.
- Ejemplos: `feat(hashset): implementar registrarInscripcion` y `feat(hashmap): implementar cancelarInscripcion`.
- Revisa el diff antes del commit y comunica su hash al terminar. Haz push solo cuando te lo pidan.

## Registro de IA

Cuando la asistencia de IA influya en un entregable, conserva el prompt y los seguimientos pertinentes, los datos proporcionados, la respuesta, lo que se incorporó y la evidencia de verificación.
