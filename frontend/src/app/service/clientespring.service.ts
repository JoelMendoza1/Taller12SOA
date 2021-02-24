import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { Cliente } from './Cliente';

@Injectable({
  providedIn: 'root'
})
export class ClientespringService {

  URL = "http://localhost:8080/clientes";

  constructor(private httpc: HttpClient) 
  {
  }
  getClientes(): Observable<Cliente[]> {
    return this.httpc.get<Cliente[]>(this.URL);
  }

  addClinetes(nombre:string, apellido:string, direccion:string, telefono:string, email:string)
  {
    let obj ={nombre,apellido,direccion,telefono,email}
    return this.httpc.post(this.URL,obj);
  }

  editCliente(nombre:string, apellido:string, direccion:string, telefono:string, email:string,idCliente:number)
  {
      let obj ={nombre,apellido,direccion,telefono,email}
      return this.httpc.put(`${this.URL}/${idCliente}`,obj)
  }

  deleteCliente(idCliente:number)
  { 
    return this.httpc.delete(`${this.URL}/${idCliente}`)
  }
  
}
