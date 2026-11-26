import java.util.*;

/** ArrayList ya funciona. Implementen las cinco operaciones para las otras tres estructuras elegidas. */
public final class Operaciones {
    private Operaciones() {}
    private static UnsupportedOperationException pendiente(Estado e,String metodo) {
        return new UnsupportedOperationException("TODO: "+metodo+" para "+e.tipo);
    }
    public static Persona buscarPersona(Estado e,String id) {
        if(e.tipo==Estado.Tipo.ArrayList) {
            for(Persona p:e.personas.lista)if(p.id.equals(id))return p;
            return null;
        }
        if(e.tipo==Estado.Tipo.HashSet) {
            // Recorremos el conjunto para devolver la Persona almacenada con todos sus datos;
            // contains solo indica si existe un elemento equivalente.
            for(Persona p:e.personas.conjunto)if(p.id.equals(id))return p;
            return null;
        }
        // TODO: resolver con la estructura activa elegida. Devolver null si no existe.
        throw pendiente(e,"buscarPersona");
    }
    public static boolean corregirPais(Estado e,String idPersona,String codigoPais) {
        if(e.tipo==Estado.Tipo.ArrayList) {
            boolean existePais=false;
            for(Pais p:e.paises.lista)if(p.id.equals(codigoPais)){existePais=true;break;}
            if(!existePais)return false;
            for(int i=0;i<e.personas.lista.size();i++) {
                Persona p=e.personas.lista.get(i);
                if(p.id.equals(idPersona)) {
                    if(p.codigoPais.equals(codigoPais))return false;
                    e.personas.lista.set(i,new Persona(p.id,p.nombre,codigoPais));return true;
                }
            }
            return false;
        }
        // TODO: validar país/persona y reemplazar la persona manteniendo su identidad.
        throw pendiente(e,"corregirPais");
    }
    public static boolean registrarInscripcion(Estado e,String codigo,String idPersona,String actividad) {
        if(e.tipo==Estado.Tipo.ArrayList) {
            if(codigo==null || codigo.trim().isEmpty() || !Datos.ACTIVIDADES.contains(actividad))return false;
            if(buscarPersona(e,idPersona)==null)return false;
            for(Inscripcion i:e.inscripciones.lista)
                if(i.id.equals(codigo) || (i.idPersona.equals(idPersona) && i.actividad.equals(actividad)))return false;
            e.inscripciones.lista.add(new Inscripcion(codigo,idPersona,actividad));return true;
        }
        // TODO: validar persona, código único, actividad válida y combinación persona/actividad única.
        // Agregar solo la inscripción: no duplicar Persona ni Pais.
        throw pendiente(e,"registrarInscripcion");
    }
    public static boolean cancelarInscripcion(Estado e,String codigo) {
        if(e.tipo==Estado.Tipo.ArrayList) {
            Iterator<Inscripcion> it=e.inscripciones.lista.iterator();
            while(it.hasNext())if(it.next().id.equals(codigo)){it.remove();return true;}
            return false;
        }
        // TODO: eliminar solo la inscripción. Conservar persona y país, aun sin otras inscripciones.
        throw pendiente(e,"cancelarInscripcion");
    }
    public static Map<String,Integer> contarPersonasPorPais(Estado e) {
        if(e.tipo==Estado.Tipo.ArrayList) {
            Map<String,Integer> resultado=new TreeMap<>();
            for(Pais pais:e.paises.lista)resultado.put(pais.id,0);
            for(Persona persona:e.personas.lista)
                resultado.put(persona.codigoPais,resultado.get(persona.codigoPais)+1);
            return resultado;
        }
        // TODO: contar PERSONAS únicas por país; incluir quienes no tengan inscripción.
        // El mapa devuelto es un resultado auxiliar, no reemplaza las colecciones activas.
        throw pendiente(e,"contarPersonasPorPais");
    }
}
