/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package FiltradoClientesPorAtributo_Ejercicio3;

/**
 *
 * @author HP
 */
public class principioSolid {
    /*
    En este código el principio solid que identifique fue el de ->abierto para la extensión pero cerrada para la modificación. 
    ¿Por qué? -> en el código teniamos una clase que creaba metodos para cada dato del cliente
    // (filtro para cada uno) si en un futuro se dea filtrar con mas datos, habría que modificar el código, y se extendería mucho más.
    Solución -> se creó una interfaz de filtro con un método vacio con parametros tipo objeto de cliente.
    las clases futuras que filtran solo deben implementar la interfaz y llenar el método con el dato que necesiten del objeto tipo cliente.
    */
}
