package org.example.utilidades;
public enum MensajeSeguro {
    NOMBRE_LONGITUD("Señor Usuario el Nombre  debe ser maximo de 20 caracteres."),
    NOMBRE_CARACTER("Señor Usuario el Nombre NO cumple los parametros."),
    EDAD_NEGATIVA("Señor Usuario la edad NO puede ser un número negativo."),
    EDAD_MAYOR("Señor Usuario si su edad supera los 90 años, por favor comunicarse al 0180006543 Ext 2132"),
    COBERTURA_INCORRECTA("Señor Usuario solo se aceptan montos hasta de 1500 mill de pesos."),
    BENEFICIARIO_LONGITUD("Señor Usuario la longitud máxima es de  50 caracteres"),
    BENEFICIARIO_FORMATO(" Señor Usuario solo se aceptan letras"),
    FECHA_INCORRECTA("Señor Usuario Formato de fecha incorrecta, por favor digitarla bien"),
    ;

    private String MensajeSeguro;

    MensajeSeguro(String mensajeSeguro) {
        MensajeSeguro = mensajeSeguro;
    }

    public String getMensajeSeguro() {
        return MensajeSeguro;
    }

    public void setMensajeSeguro(String mensajeSeguro) {
        MensajeSeguro = mensajeSeguro;
    }
}
