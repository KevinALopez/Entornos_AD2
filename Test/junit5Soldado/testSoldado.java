package junit5Soldado;

import static org.junit.jupiter.api.Assertions.*;

import clases.Soldado;

import org.junit.jupiter.api.Test;

class testSoldado {
	
		@Test
		void testSoldadoVivoDispara() {
			
			Soldado soldado1=new Soldado(false,1);
			
			boolean resultadoEsperadoVida=false;
			boolean resultadoObtenidoVida=soldado1.isEstaMuerto();
			boolean resultadoEsperadoDispara=true;
			boolean resultadoObtenidoDispara=soldado1.puedeDisparar();
			
			assertEquals(resultadoEsperadoVida,resultadoObtenidoVida);
			assertEquals(resultadoEsperadoDispara,resultadoObtenidoDispara);
		}
		
		@Test
		void testSoldadoMuertoNoDispara() {
			
			Soldado soldado2 = new Soldado(true,0);
			
			boolean resultadoEsperadoVida=true;
			boolean resultadoObtenidoVida=soldado2.isEstaMuerto();
			boolean resultadoEsperadoDispara=false;
			boolean resultadoObtenidoDispara=soldado2.puedeDisparar();
			
			assertEquals(resultadoEsperadoVida,resultadoObtenidoVida);
			assertEquals(resultadoEsperadoDispara,resultadoObtenidoDispara);
		
		}

		@Test
		void testSoldadoAbatido() {
			
			Soldado soldado3 = new Soldado(false,5);
			Soldado soldado4 = new Soldado(false,-2);
			
			soldado3.disparar(soldado4);
			
			boolean resultadoEsperadoAbatido=true;
			boolean resultadoObtenidoAbatido=soldado4.isEstaMuerto();
			
			assertEquals(resultadoEsperadoAbatido,resultadoObtenidoAbatido);
		
		}

		@Test
		void testSoldadoNoAbatido() {
					
			Soldado soldado5 = new Soldado(true,0);
			Soldado soldado6 = new Soldado(true,3);
			
			soldado5.disparar(soldado6);
			
			boolean resultadoEsperadoNoAbatido=true;
			boolean resultadoObtenidoNoAbatido=soldado6.isEstaMuerto();
			
			assertEquals(resultadoEsperadoNoAbatido,resultadoObtenidoNoAbatido);
		
		
			
			
		}



	}
