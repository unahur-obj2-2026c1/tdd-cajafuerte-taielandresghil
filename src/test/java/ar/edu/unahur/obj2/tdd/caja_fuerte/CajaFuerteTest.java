package ar.edu.unahur.obj2.tdd.caja_fuerte;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;
import org.junit.jupiter.api.Test;

public class CajaFuerteTest {
    @Test
    public void dadaUnaCajaFuerteNueva_cuandoSeIngresaCodigoCorrecto_entoncesSeAbre() {
        CajaFuerte caja = new CajaFuerte();

        caja.abrir("1234");

        assertTrue(caja.estaAbierta());
    }

    @Test
    public void dadaUnaCajaAbierta_cuandoSeCierraConNuevoCodigo_entoncesNoAbreConElAnterior() {
        CajaFuerte caja = new CajaFuerte();

        caja.abrir("1234");
        caja.cerrar("5873");
        caja.abrir("1234");

        assertFalse(caja.estaAbierta());
    }

    @Test
    public void dadaUnaCajaFuerte_cuandoSeCierra_entoncesNoEstaAbierta() {
        CajaFuerte caja = new CajaFuerte();
        
        caja.abrir("1234");
        caja.cerrar("1457");
        caja.abrir("1457");

        assertTrue(caja.estaAbierta());
    }

    @Test
    public void dadaUnaCajaFuerte_ConsultarSiEstaCerrada() {
        CajaFuerte caja = new CajaFuerte();

        caja.abrir("1234");
        caja.cerrar("7854");

        assertFalse(caja.estaAbierta());
    }
}
