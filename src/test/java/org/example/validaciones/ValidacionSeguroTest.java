package org.example.validaciones;

import org.example.utilidades.MensajeSeguro;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class ValidacionSeguroTest {
    private ValidacionSeguro validacionSeguro;

    @BeforeEach
    public void prepararPruebas(){
        this.validacionSeguro = new ValidacionSeguro();
    }
    @Test
    public void ValidarNombreCorrecto(){
        String nombrePrueba = "camila";
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarNombreAsegurado(nombrePrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void ValidarNombreIncorrectoTipoCaracteres(){
        String nombrePrueba = "luz karina de las mercedes jose";
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarNombreAsegurado(nombrePrueba));
        Assertions.assertEquals(MensajeSeguro.NOMBRE_LONGITUD.getMensajeSeguro(),resultado.getMessage());
    }
    @Test
    public void ValidarEdadCorrecto(){
        Integer edadPrueba = 30;
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarEdad(edadPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void ValidarEdadNegativa(){
        Integer edadPrueba = -5;
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarEdad(edadPrueba));
        Assertions.assertEquals(MensajeSeguro.EDAD_NEGATIVA.getMensajeSeguro(),resultado.getMessage());
    }
    @Test
    public void ValidarEdadMayor(){
        Integer edadPrueba = 95;
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarEdad(edadPrueba));
        Assertions.assertEquals(MensajeSeguro.EDAD_MAYOR.getMensajeSeguro(),resultado.getMessage());
    }
    @Test
    public void ValidarMontoCorrecto(){
        Integer montoPrueba = 100;
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarMonto(montoPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void ValidarMontoIncorrecto(){
        Integer montoPrueba = -50;
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarMonto(montoPrueba));
        Assertions.assertEquals(MensajeSeguro.COBERTURA_INCORRECTA.getMensajeSeguro(),resultado.getMessage());
    }
    @Test

    public void ValidarFechaCorrecta(){
        String fechaPrueba= "10/10/2023";
        Boolean resultado = Assertions.assertDoesNotThrow(()->this.validacionSeguro.validarFecha(fechaPrueba));
        Assertions.assertTrue(resultado);
    }
    @Test
    public void ValidarFehcaIncorrecta(){
        String fechaPrueba= "444/02/2011";
        Exception resultado = Assertions.assertThrows(Exception.class,()->this.validacionSeguro.validarFecha(fechaPrueba));
        Assertions.assertEquals(MensajeSeguro.FECHA_INCORRECTA.getMensajeSeguro(),resultado.getMessage());
    }

}