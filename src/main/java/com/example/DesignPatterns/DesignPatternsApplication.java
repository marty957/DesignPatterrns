package com.example.DesignPatterns;

import com.example.DesignPatterns.chain.*;
import com.example.DesignPatterns.composite.Autore;
import com.example.DesignPatterns.composite.Libro;
import com.example.DesignPatterns.composite.Pagina;
import com.example.DesignPatterns.composite.Sezioni;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DesignPatternsApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesignPatternsApplication.class, args);

		Autore autore1=new Autore("leopardi");
		Autore autore2=new Autore("dante");

		Pagina p1=new Pagina("mi illumono d'immenso",1);
		Pagina p2=new Pagina("nel mezzo di cammin di nostra vita",2);
		Pagina p3= new Pagina("mi ritrovai per una selva scura, ",3);
		Pagina p4=new Pagina("che la diritta via era smarrita",4);

		Sezioni cap1=new Sezioni();
		Sezioni cap2= new Sezioni();

		cap1.addPagine(p1);
		cap1.addPagine(p2);

		cap2.addPagine(p3);
		cap2.addPagine(p4);

		Libro libro1=new Libro(10);

		libro1.addAutori(autore1);
		libro1.addAutori(autore2);

		libro1.addSezioni(cap1);
		libro1.addSezioni(cap2);
		System.out.println(libro1.getCapitoli());


		UfficialeMarina u1= new Tenente();
		UfficialeMarina u2= new Capitano(u1);
		UfficialeMarina u3= new Maggiore(u2);
		UfficialeMarina u4= new Colonnello(u3);
		UfficialeMarina u5= new Generale(u4);

         u5.salarioDistrubuzione(4000);



	}

}
