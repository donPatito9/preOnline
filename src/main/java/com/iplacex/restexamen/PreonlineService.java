/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.iplacex.restexamen;
import java.util.ArrayList;
import java.util.List;
import javax.ws.rs.GET;
import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.POST;
import javax.ws.rs.PUT;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
/**
 *
 * @author Robinson Concha
 */

     @Path("/preonline")
public class PreonlineService {
 
private static List<Afiliado> listadoAfiliados = new ArrayList<Afiliado>();
       
      static {
               listadoAfiliados.add(new Afiliado(1,"pedro","picapiedra",40, 300.000,200.000,"Provida"));
               listadoAfiliados.add(new Afiliado(2,"pablo","marmol",40, 150.200,100.000,"Habitat"));
               listadoAfiliados.add(new Afiliado(3,"juan","pacopedro",40, 350.350,100.000,"Cuprum"));
               listadoAfiliados.add(new Afiliado(4,"jose","del campo",40, 330.200,130.000,"Capital"));
               listadoAfiliados.add(new Afiliado(1,"pedro","picapiedra",40, 300.000,200.000,"Provida"));
               listadoAfiliados.add(new Afiliado(2,"pablo","marmol",40, 150.200,100.000,"Habitat"));
               listadoAfiliados.add(new Afiliado(3,"juan","pacopedro",40, 350.350,100.000,"Cuprum"));
               listadoAfiliados.add(new Afiliado(4,"jose","del campo",40, 330.200,130.000,"Capital"));
             
       }

   @GET
   @Path("/consultarAfiliados")
   public String findAllAfiliados() {
      String salida;
      Gson gson = new GsonBuilder().create();
      Respuesta r = new Respuesta();
      r.setStatus(200);
      r.setData(listadoAfiliados);
      salida = gson.toJson(r);
      return salida;
   }
    


   @POST
   @Path("/agregarAfiliados")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public Respuesta addAfiliados(Afiliado afiliado) {
   Gson gson = new GsonBuilder().create();
   listadoAfiliados.add(afiliado);
       
   Respuesta r = new Respuesta();
   r.setStatus(200);
   r.setData(gson.toJson(afiliado));
   return r;
   }
   
   @PUT
   @Path("/modificarAfiliado")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public String updateAfiliado(Afiliado afiliado) {
       String salida;
       int i=0;
       Gson gson = new GsonBuilder().create();
       Respuesta r = new Respuesta();
       
       for(Afiliado aux : listadoAfiliados) {
           if(aux.getNombre().equals(afiliado.getNombre())){
             listadoAfiliados.get(i).setNombre(afiliado.getNombre());
             listadoAfiliados.get(i).setApellido(afiliado.getApellido());
             listadoAfiliados.get(i).setEdad(afiliado.getEdad());
             listadoAfiliados.get(i).setContribucion(afiliado.getContribucion());
             listadoAfiliados.get(i).setPension(afiliado.getPension());
             listadoAfiliados.get(i).setAfp(afiliado.getAfp());
           }
           i++;
       }
       r.setStatus(200);
       r.setData("Afiliado modificado Nombre:" + afiliado.getNombre());
       salida = gson.toJson(r);
       return salida;
   }
    @DELETE
    @Path("/eliminarAfiliado/{nombre}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
   public String deleteAfiliado(@PathParam("nombre")String nombre) {
      
       int i=0,posicion= -1;
       String salida;
       Gson gson = new GsonBuilder().create();
       Respuesta r = new Respuesta();
       
       for(Afiliado aux : listadoAfiliados) {
           if(aux.getNombre().equals(nombre)){
               posicion = i;
           }
           i++;
   }
       listadoAfiliados.remove(posicion);
       
       r.setStatus(200);
       r.setData("Afiliado eliminado Nombre:" + nombre);
       salida = gson.toJson(r);
       return salida;
   }
     

//Pensionado
 
 private static List<Pensionado> listadoPensionados = new ArrayList<Pensionado>();
       
       static {
               listadoPensionados.add(new Pensionado(1,"Jhonny","Bravo",35,0.0,"Habitat"));
               listadoPensionados.add(new Pensionado(2,"Linda","Stawert",42,0.0,"Cuprum"));
               listadoPensionados.add(new Pensionado(3,"Jorge","Curioso",50,0.0,"Capital"));
               listadoPensionados.add(new Pensionado(4,"Stan","Stone",45,0.0,"Provida"));
               listadoPensionados.add(new Pensionado(5,"Jhonny","Bravo",35,0.0,"Habitat"));
               listadoPensionados.add(new Pensionado(6,"Angela","Deivis",42,0.0,"Cuprum"));
               listadoPensionados.add(new Pensionado(7,"Phil","Collins",50,0.0,"Capital"));
               listadoPensionados.add(new Pensionado(8,"Stan","Ston",45,0.0,"Provida"));
               listadoPensionados.add(new Pensionado(9,"Jhonny","Bravo",35,0.0,"Habitat"));
               listadoPensionados.add(new Pensionado(10,"harry","Potter",42,0.0,"Cuprum"));
       }
       
   @GET
   @Path("/consultarPensionados")
   public String findAllPensionados() {
      String salida;
      Gson gson = new GsonBuilder().create();
      Respuesta r = new Respuesta();
      r.setStatus(200);
      r.setData(listadoPensionados);
      salida = gson.toJson(r);
      return salida;
   }
   @POST
   @Path("/agregarPensionados")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public Respuesta addPensionados(Pensionado pensionado) {
       Gson gson = new GsonBuilder().create();
       
       listadoPensionados.add(pensionado);
       
       Respuesta r = new Respuesta();
       r.setStatus(200);
       r.setData(gson.toJson(pensionado));
       return r;
   }
   @PUT
   @Path("/modificarPensionado")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
   public String updatePensionado(Pensionado pensionado) {
       String salida;
       int i=0;
       Gson gson = new GsonBuilder().create();
       Respuesta r = new Respuesta();
       
       for(Pensionado aux : listadoPensionados) {
           if(aux.getNombre().equals(pensionado.getNombre())){
             listadoPensionados.get(i).setNombre(pensionado.getNombre());
             listadoPensionados.get(i).setApellido(pensionado.getApellido());
             listadoPensionados.get(i).setEdad(pensionado.getEdad());
             listadoPensionados.get(i).setPension(pensionado.getPension());
             listadoPensionados.get(i).setAfp(pensionado.getAfp());
           }
           i++;
       }
       r.setStatus(200);
       r.setData("Pensionado modificado nombre:" + pensionado.getNombre());
       salida = gson.toJson(r);
       return salida;
   }
    @DELETE
    @Path("/eliminarPensionado/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
    public String deletePensionado(@PathParam("id")String id) {
      
       int i=0,posicion= -1;
       String salida;
       Gson gson = new GsonBuilder().create();
       Respuesta r = new Respuesta();
       
       for(Pensionado aux : listadoPensionados) {
           if(aux.getNombre().equals(id)){
               posicion = i;
           }
           i++;
   }
       listadoPensionados.remove(posicion);
       
       r.setStatus(200);
       r.setData("Pensionado eliminado id:" + id);
       salida = gson.toJson(r);
       return salida;
   }
//Excluidos
   private static List<Excluido> listadoExcluidos = new ArrayList<Excluido>();
       
       static {
               listadoExcluidos.add(new Excluido(1,"hola","servicesWeb","FFAA",38,0.4,"Dipreca"));
               listadoExcluidos.add(new Excluido(1,"API","SCex","FFAA",38,0.4,"Dipreca"));
               listadoExcluidos.add(new Excluido(1,"API","SCex","FFAA",38,0.4,"Dipreca"));
               listadoExcluidos.add(new Excluido(1,"hola","servicesWeb","FFAA",38,0.4,"Cooperacab"));
               listadoExcluidos.add(new Excluido(1,"hola","servicesWeb","FFAA",38,0.4,"Dipreca"));
               listadoExcluidos.add(new Excluido(1,"hola","APISCex","FFAA",38,0.4,"Dipreca"));
               listadoExcluidos.add(new Excluido(1,"Robinson","Concha","FFAA",38,0.4,"Dipreca"));
               listadoExcluidos.add(new Excluido(1,"hola","servicesWeb","FFAA",38,0.4,"Dipreca"));
       }
       

   @GET
   @Path("/consultarExcluidos")
   public String findAllExcluidos() {
      String salida;
      Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
      Respuesta r = new Respuesta();
      r.setStatus(200);
      r.setData(listadoExcluidos);
      salida = gson.toJson(r);
      return salida;
   }
   @POST
   @Path("/agregarExcluidos")
   @Consumes(MediaType.APPLICATION_JSON)
   @Produces(MediaType.APPLICATION_JSON)
   public Respuesta addExcluidos(Excluido excluido) {
       Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
       
       listadoExcluidos.add(excluido);
       
       Respuesta r = new Respuesta();
       r.setStatus(200);
       r.setData(gson.toJson(excluido));
       return r;
   }
   @PUT
   @Path("/modificarExcluido")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
   public String updateExcluido(Excluido excluido) {
       String salida;
       int i=0;
       Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
       Respuesta r = new Respuesta();
       
       for(Excluido aux : listadoExcluidos) {
           if(aux.getNombre().equals(excluido.getNombre())){
             listadoExcluidos.get(i).setNombre(excluido.getNombre());
             listadoExcluidos.get(i).setApellido(excluido.getApellido());
             listadoExcluidos.get(i).setApellido(excluido.getApellido());
             listadoExcluidos.get(i).setExclusion(excluido.getExclusion());
             listadoPensionados.get(i).setEdad(excluido.getEdad());
             listadoPensionados.get(i).setPension(excluido.getPension());
             listadoPensionados.get(i).setAfp(excluido.getAfp());
           }
           i++;
       }
       r.setStatus(200);
       r.setData("Usuario Excluido modificado id:" + excluido.getId());
       salida = gson.toJson(r);
       return salida;
   }
    @DELETE
    @Path("/eliminarExcluido/{id}")
    @Consumes(MediaType.APPLICATION_JSON)
    @Produces(MediaType.APPLICATION_JSON)
   public String deleteExcluido(@PathParam("nombre")String nombre) {
      
       int i=0,posicion= -1;
       String salida;
       Gson gson = new GsonBuilder().setDateFormat("yyyy-MM-dd").create();
       Respuesta r = new Respuesta();
       
       for(Excluido aux : listadoExcluidos) {
           if(aux.getNombre().equals("id")){
               posicion = i;
           }
           i++;
   }
       listadoExcluidos.remove(posicion);
       
       r.setStatus(200);
       r.setData("Usuario Excluido eliminado nombre:" + "id");
       salida = gson.toJson(r);
       return salida;
   }
   } 




