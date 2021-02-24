package com.example.demoSOA.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="producto")
public class Producto {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idProducto;
	@Column(name="producto", nullable=false, length=20)
	private String producto;
	@Column(name="catidad", nullable=false, length=20)
	private Integer cantidad;
	@Column(name="precio", nullable=false, length=20)
	private Double precio;
	@Column(name="detalle", nullable=false, length=60)
	private String detalle;
	
	//GET AND SET	
		public Integer getIdProducto() {
			return idProducto;
		}
		public void setIdProducto(Integer idProducto) {
			this.idProducto = idProducto;
		}
		public String getProducto() {
			return producto;
		}
		public void setProducto(String producto) {
			this.producto = producto;
		}
		public Integer getCantidad() {
			return cantidad;
		}
		public void setApellido(Integer cantidad) {
			this.cantidad = cantidad;
		}
		public Double getPrecio() {
			return precio;
		}
		public void setPrecio(Double precio) {
			this.precio = precio;
		}
		public String getDetalle() {
			return detalle;
		}
		public void setDetalle(String detalle) {
			this.detalle = detalle;
		}
		
}
