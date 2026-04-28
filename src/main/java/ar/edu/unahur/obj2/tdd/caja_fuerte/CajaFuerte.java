package ar.edu.unahur.obj2.tdd.caja_fuerte;


public class CajaFuerte {
    private String codigo = "1234";
    private Boolean abierta = Boolean.TRUE;

    public void abrir(String intento) {
        if (intento.equals(codigo)) {
            abierta = Boolean.TRUE;
        } else {
            abierta = Boolean.FALSE;
        }
    }

    public Boolean estaAbierta(){
            return abierta;
    }

    public void cerrar(String nuevoCodigo) {
    if (this.estaAbierta()) {
        codigo = nuevoCodigo;
        abierta = Boolean.FALSE;
    }
    }
}
