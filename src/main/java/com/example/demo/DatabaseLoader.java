package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DatabaseLoader implements CommandLineRunner {

	private final ProductoRepository repositoryI;
	private final VentaRepository repositoryB;
	private final DetalleVentaRepository repositoryN;

	@Autowired
	public DatabaseLoader(
		ProductoRepository repositoryI,
		VentaRepository repositoryB,
		DetalleVentaRepository repositoryN
		) {
		this.repositoryI = repositoryI;
		this.repositoryB = repositoryB;
		this.repositoryN = repositoryN;
	}

	@Override
	public void run(String... strings) throws Exception {

		this.repositoryI.save(new Producto("Manzana", 1.00));
		this.repositoryI.save(new Producto("Platano",2.00));
		this.repositoryI.save(new Producto("Pera",3.50));
		this.repositoryI.save(new Producto("Sandia",4.00));
		this.repositoryI.save(new Producto("Pitahaya",9.00));

		

		Producto fruta = new Producto("Fresa",5.00);
		this.repositoryI.save(fruta);

		Producto fruta2 = new Producto("Arandano",1.00);
		this.repositoryI.save(fruta2);

		Producto fruta3 = new Producto("Maracuyá",3.00);
		this.repositoryI.save(fruta3);

		Producto fruta4 = new Producto("Piña",2.00);
		this.repositoryI.save(fruta4);

		Venta dia1 = new Venta("Lunes");
		this.repositoryB.save(dia1);


		this.repositoryN.save(new DetalleVenta(dia1, fruta, 2));
		this.repositoryN.save(new DetalleVenta(dia1, fruta2, 1));
		
		Venta dia2 = new Venta("Martes");
		this.repositoryB.save(dia2);


		this.repositoryN.save(new DetalleVenta(dia2, fruta2, 3));
		this.repositoryN.save(new DetalleVenta(dia2, fruta3, 2));

		Venta dia3 = new Venta("Miercoles");
		this.repositoryB.save(dia3);


		this.repositoryN.save(new DetalleVenta(dia3, fruta4, 2));
		this.repositoryN.save(new DetalleVenta(dia3, fruta, 1));

		Venta dia4 = new Venta("Jueves");
		this.repositoryB.save(dia4);


		this.repositoryN.save(new DetalleVenta(dia4, fruta2, 2));
		this.repositoryN.save(new DetalleVenta(dia4, fruta, 1));

		Venta dia5 = new Venta("Viernes");
		this.repositoryB.save(dia5);


		this.repositoryN.save(new DetalleVenta(dia5, fruta4, 2));
		this.repositoryN.save(new DetalleVenta(dia5, fruta3, 1));

		Venta dia6 = new Venta("Sabado");
		this.repositoryB.save(dia6);


		this.repositoryN.save(new DetalleVenta(dia6, fruta2, 2));
		this.repositoryN.save(new DetalleVenta(dia6, fruta3, 1));




	}
}