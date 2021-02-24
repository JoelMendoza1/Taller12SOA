import { Component } from '@angular/core';
import { FormControl, FormGroup } from '@angular/forms';
import { Cliente } from './service/Cliente';
import { ClientespringService } from './service/clientespring.service';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  
  title = "Consumo de un Backend con Spring"
  clientes: Cliente[]=[];
  myFormCliente!: FormGroup ;

  constructor(public servc:ClientespringService)
  {
  }
  ngOnInit(){
    this.obtenerClientes()
    this.myFormCliente = new FormGroup({
      nombre: new FormControl(''),
      apellido: new FormControl(''),
      direccion: new FormControl(''),
      telefono: new FormControl(''),
      email: new FormControl('')
    });
  }

  obtenerClientes(){
    this.servc.getClientes().subscribe(r=>{
      console.table(r);
      return this.clientes=r
    })
  }

  ingresarDatos(){
    
    let nombre = this.myFormCliente.value.nombre;
    let apellido = this.myFormCliente.value.apellido
    let direccion = this.myFormCliente.value.direccion
    let telefono = this.myFormCliente.value.telefono
    let email = this.myFormCliente.value.email

    this.servc.addClinetes(nombre,apellido,direccion,telefono,email)
    .subscribe(r =>{
      this.obtenerClientes()
      this.myFormCliente = new FormGroup({
        nombre: new FormControl(''),
        apellido: new FormControl(''),
        direccion: new FormControl(''),
        telefono: new FormControl(''),
        email: new FormControl('')
      });
    })
  }
  eliminarCliente(id:number)
  {
    if (!confirm("ALERTA!! va a proceder a eliminar este registro, si desea eliminarlo de click en ACEPTAR\n de lo contrario de click en CANCELAR.")) {
      return false;
      }
      else {
        
        this.servc.deleteCliente(id).subscribe((r)=>{
          console.log("Datos eliminados")
          this.obtenerClientes()
        })
      return true;
      }
  }
  
  editarCliente(){

  }

}
