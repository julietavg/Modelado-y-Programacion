
/**
 *
 *  Clase Main
 *
 * @version 1.0 Marzo 2022
 * @author Castellanos Palacios Gerardo 318341945
 * @author Vargas Gutierrez Julieta 318341945
 * @since Modelado y Programacion 2022-2
 *
 */

public class Main {

    public static void main(String[] args) {

    //**  Servicios  */
    Memeflix memeflix = new Memeflix();
    HVOMax hvo = new HVOMax();
    Spootify spootify = new Spootify();
    ThisneyPlus thisney = new ThisneyPlus();
    Momazon momazon =  new Momazon();

    //** Usuarios */
    Usuario Alicia = new Usuario("Alicia", 15000);
    Usuario Bob = new Usuario("Bob", 2400);
    Usuario Cesar = new Usuario("Cesar",5000);
    Usuario Diego = new Usuario("Diego",9000);
    Usuario Erika = new Usuario("Erika",10000);
    Usuario Fausto = new Usuario("Fausto",5000);

    /** Base de datos */
    memeflix.llenaBD();
    hvo.llenaBD();
    spootify.llenaBD();
    thisney.llenaBD();
    momazon.llenaBD();

    System.out.println(" \n " + "\t" + "  Enero\n" + "\n");

    /// Alicia
    System.out.println("\t" + "Pagos de Alicia\n ");


    //**  Suscripción de y pago de netflix  */
    memeflix.registrar(Alicia);
    Alicia.suscribirse(memeflix);
    memeflix.asigna4Dispositivos(Alicia);

    //**  Suscripción de y pago de hvo max */
    hvo.registrar(Alicia);
    Alicia.suscribirse(hvo);
    hvo.asigna(Alicia);

    //**  Suscripción de y pago de Thisney + */
    thisney.registrar(Alicia);
    Alicia.suscribirse(thisney);
    thisney.asigna(Alicia);

    //**  Suscripción de y pago de spootify */
    spootify.registrar(Alicia);
    Alicia.suscribirse(spootify);
    spootify.spootifyPremium(Alicia);

    //**  Suscripción de y pago de momazon */
    momazon.registrar(Alicia);
    Alicia.suscribirse(momazon);
    momazon.momazonPremium(Alicia);


    /// Bob
    System.out.println("\t" + "Pagos de Bob\n ");

    //**  Suscripción de y pago de netflix  */
    memeflix.registrar(Bob);
    Bob.suscribirse(memeflix);
    memeflix.asigna4Dispositivos(Bob);

    //**  Suscripción de y pago de hvo max */
    hvo.registrar(Bob);
    Bob.suscribirse(hvo);
    hvo.asigna(Bob);

    //**  Suscripción de y pago de Thisney + */
    thisney.registrar(Bob);
    Bob.suscribirse(thisney);
    thisney.asigna(Bob);

    //**  Suscripción de y pago de spootify */
    spootify.registrar(Bob);
    Bob.suscribirse(spootify);
    spootify.spootifyPremium(Bob);

    //**  Suscripción de y pago de momazon */
    momazon.registrar(Bob);
    Bob.suscribirse(momazon);
    momazon.momazonPremium(Bob);


    /// Cesar
    System.out.println("\t" + "Pagos de Cesar\n ");

    //**  Suscripción de y pago de hvo max */
    hvo.registrar(Cesar);
    Cesar.suscribirse(hvo);
    hvo.asigna(Cesar);

    //**  Suscripción de y pago de Thisney + */
    thisney.registrar(Cesar);
    Cesar.suscribirse(thisney);
    thisney.asigna(Cesar);


     /// Diego
    System.out.println("\t" + "Pagos de Diego\n ");

     //**  Suscripción de y pago de hvo max */
    hvo.registrar(Diego);
    Diego.suscribirse(hvo);
    hvo.asigna(Diego);

     //**  Suscripción de y pago de spootify */
    spootify.registrar(Diego);
    Diego.suscribirse(spootify);
    spootify.spootifyNormal(Diego);


    //**  Suscripción de y pago de momazon */
    momazon.registrar(Diego);
    Diego.suscribirse(momazon);
    momazon.momazonPremium(Diego);


     /// Erika
    System.out.println("\t" + "Pagos de Erika\n ");


    //**  Suscripción de y pago de netflix  */
    memeflix.registrar(Erika);
    Erika.suscribirse(memeflix);
    memeflix.asigna4Dispositivos(Erika);

    //**  Suscripción de y pago de spootify */
    spootify.registrar(Erika);
    Erika.suscribirse(spootify);
    spootify.spootifyNormal(Erika);

    //**  Suscripción de y pago de hvo max */
    hvo.registrar(Erika);
    Erika.suscribirse(hvo);
    hvo.asigna(Erika);

     /// Fausto
    System.out.println("\t" + "Pagos de Fausto\n ");

    //**  Suscripción de y pago de Thisney + */
    thisney.registrar(Fausto);
    Fausto.suscribirse(thisney);
    thisney.asigna(Fausto);

    //**  Suscripción de y pago de hvo max */
    hvo.registrar(Fausto);
    Fausto.suscribirse(hvo);
    hvo.asigna(Fausto);


     //Recomendaciones

    System.out.println("\t" + "Recomendaciones \n ");

    memeflix.actualizar();
    hvo.actualizar();
    thisney.actualizar();
    spootify.actualizar();
    momazon.actualizar();



    System.out.println(" \n " + "\t" + " Febrero\n" + "\n");

    //Alicia
    System.out.println("\t" + "Pagos de Alicia\n ");

    memeflix.asigna4Dispositivos(Alicia);
    hvo.asigna(Alicia);
    thisney.asigna(Alicia);
    spootify.spootifyPremium(Alicia);
    momazon.momazonPremium(Alicia);


     /// Bob
    System.out.println("\t" + "Pagos de Bob\n ");

    memeflix.asigna4Dispositivos(Bob);
    hvo.asigna(Bob);
    thisney.asigna(Bob);
    spootify.spootifyPremium(Bob);
    momazon.momazonPremium(Bob);

    /// Cesar
    System.out.println("\t" + "Pagos de Cesar\n ");

    hvo.asigna(Cesar);
    thisney.asigna(Cesar);


     /// Diego
    System.out.println("\t" + "Pagos de Diego\n ");

    hvo.asigna(Diego);
    spootify.spootifyNormal(Diego);
    momazon.momazonPremium(Diego);

     /// Erika
    System.out.println("\t" + "Pagos de Erika\n ");

    memeflix.asigna4Dispositivos(Erika);
    spootify.spootifyNormal(Erika);
    hvo.asigna(Erika);

    //Fausto
    System.out.println("\t" + "Pagos de Fausto\n ");

    thisney.asigna(Fausto);
    hvo.asigna(Fausto);


     // Recomendaciones

    System.out.println("\t" + "Recomendaciones \n ");

    memeflix.actualizar();
    hvo.actualizar();
    thisney.actualizar();
    spootify.actualizar();
    momazon.actualizar();


    System.out.println(" \n " + "\t" + " Marzo\n" + "\n");

    //Alicia
    System.out.println("\t" + "Pagos de Alicia \n ");
    memeflix.asigna4Dispositivos(Alicia);
    hvo.asigna(Alicia);
    thisney.asigna(Alicia);
    spootify.spootifyPremium(Alicia);
    momazon.momazonPremium(Alicia);

    // Bob
    System.out.println("\t" + "Pagos de Bob\n ");
    memeflix.asigna4Dispositivos(Bob);
    hvo.asigna(Bob);
    thisney.asigna(Bob);
    spootify.spootifyPremium(Bob);
    momazon.momazonPremium(Bob);

    /// Cesar
    System.out.println("\t" + "Pagos de Cesar\n ");
    hvo.asigna(Cesar);
    thisney.asigna(Cesar);

     /// Diego
    System.out.println("\t" + "Pagos de Diego\n ");
    hvo.asigna(Diego);
    spootify.spootifyNormal(Diego);
    momazon.momazonPremium(Diego);

    /// Erika
    System.out.println("\t" + "Pagos de Erika\n ");

    hvo.cancelar(Erika);
    memeflix.asigna4Dispositivos(Erika);
    spootify.spootifyNormal(Erika);

    //**  Suscripción de y pago de Thisney + */
    thisney.registrar(Erika);
    Erika.suscribirse(thisney);
    thisney.asigna(Erika);

    //Fausto
    System.out.println("\t" + "Pagos de Fausto\n ");

    thisney.asigna(Fausto);
    hvo.asigna(Fausto);

    // Recomendaciones

    System.out.println("\t" + "Recomendaciones \n ");

    memeflix.actualizar();
    hvo.actualizar();
    thisney.actualizar();
    spootify.actualizar();
    momazon.actualizar();


    System.out.println(" \n " + "\t" + "   Abril\n" + "\n");

    //Alicia
    System.out.println("\t" + "Pagos de Alicia \n ");
    memeflix.asigna4Dispositivos(Alicia);
    hvo.asigna(Alicia);
    thisney.asigna(Alicia);
    spootify.spootifyPremium(Alicia);
    momazon.momazonPremium(Alicia);

    // Bob
    System.out.println("\t" + "Pagos de Bob \n ");
    spootify.spootifyPremium(Bob);
    thisney.cancelar(Bob);
    hvo.cancelar(Bob);
    memeflix.cancelar(Bob);
    momazon.cancelar(Bob);

    /// Cesar
    System.out.println("\n" + "\t" + "Pagos de Cesar\n ");
    hvo.asigna(Cesar);
    thisney.asigna(Cesar);

    /// Diego
    System.out.println("\t" + "Pagos de Diego\n ");
    hvo.asigna(Diego);
    spootify.spootifyNormal(Diego);
    momazon.momazonPremium(Diego);

     /// Erika
    System.out.println("\t" + "Pagos de Erika\n ");

    memeflix.asigna4Dispositivos(Erika);
    spootify.spootifyNormal(Erika);
    thisney.asigna(Erika);

     //Fausto
    System.out.println("\t" + "Pagos de Fausto\n ");

    thisney.cancelar(Fausto);
    hvo.cancelar(Fausto);

     //**  Suscripción de y pago de netflix  */
    memeflix.registrar(Fausto);
    Fausto.suscribirse(memeflix);
    memeflix.asigna1Dispositivo(Fausto);


    // Recomendaciones

    System.out.println("\t" + "Recomendaciones \n ");

    memeflix.actualizar();
    hvo.actualizar();
    thisney.actualizar();
    spootify.actualizar();
    momazon.actualizar();


    System.out.println(" \n " + "\t" + " Mayo\n" + "\n");

    //Alicia
    System.out.println("\t" + "Pagos de Alicia \n ");
    memeflix.asigna4Dispositivos(Alicia);
    hvo.asigna(Alicia);
    thisney.asigna(Alicia);
    spootify.spootifyPremium(Alicia);
    momazon.momazonPremium(Alicia);

    //Bob
    System.out.println("\t" + "Pagos de Bob \n ");
    spootify.spootifyPremium(Bob);

    /// Cesar
    System.out.println("\t" + "Pagos de Cesar\n ");
    hvo.asigna(Cesar);
    thisney.asigna(Cesar);

    /// Diego
    System.out.println("\t" + "Pagos de Diego\n ");
    hvo.asigna(Diego);
    spootify.spootifyNormal(Diego);
    momazon.momazonPremium(Diego);

    /// Erika
    System.out.println("\t" + "Pagos de Erika\n ");
    memeflix.asigna4Dispositivos(Erika);
    spootify.spootifyNormal(Erika);
    thisney.asigna(Erika);



     //Fausto
    System.out.println("\t" + "Pagos de Fausto\n ");

    memeflix.asigna1Dispositivo(Fausto);

    //**  Suscripción de y pago de hvo max */
    hvo.registrar(Fausto);
    Fausto.suscribirse(hvo);
    hvo.asigna(Fausto);

    //**  Suscripción de y pago de Thisney + */
    thisney.registrar(Fausto);
    Fausto.suscribirse(thisney);
    thisney.asigna(Fausto);

     // Recomendaciones

    System.out.println("\t" + "Recomendaciones \n ");

    memeflix.actualizar();
    hvo.actualizar();
    thisney.actualizar();
    spootify.actualizar();
    momazon.actualizar();


    System.out.println(" \n " + "\t" + " Junio\n" + "\n");

    //Alicia
    System.out.println("\t" + "Pagos de Alicia \n ");
    memeflix.asigna4Dispositivos(Alicia);
    hvo.asigna(Alicia);
    thisney.asigna(Alicia);
    spootify.spootifyPremium(Alicia);
    momazon.momazonPremium(Alicia);

    //Bob
    System.out.println("\t" + "Pagos de Bob \n ");
    spootify.spootifyPremium(Bob);

    /// Cesar
    System.out.println("\t" + "Pagos de Cesar\n ");
    hvo.asigna(Cesar);
    thisney.asigna(Cesar);

    /// Diego
    System.out.println("\t" + "Pagos de Diego\n ");

    hvo.asigna(Diego);
    spootify.spootifyNormal(Diego);
    momazon.momazonPremium(Diego);

    //**  Suscripción de y pago de Thisney + */
    thisney.registrar(Diego);
    Diego.suscribirse(thisney);
    thisney.asigna(Diego);

     /// Erika
    System.out.println("\t" + "Pagos de Erika\n ");
    memeflix.cancelar(Erika);
    spootify.cancelar(Erika);
    thisney.cancelar(Erika);

    //Fausto
    System.out.println("\t" + "Pagos de Fausto\n ");
    memeflix.cancelar(Fausto);
    thisney.cancelar(Fausto);
    hvo.cancelar(Fausto);

     // Recomendaciones

    System.out.println("\t" + "Recomendaciones \n ");

    memeflix.actualizar();
    hvo.actualizar();
    thisney.actualizar();
    spootify.actualizar();
    momazon.actualizar();


   System.out.println(" \n " + "\t" + " Julio \n" + "\n");

    //Alicia
    System.out.println("\t" + "Pagos de Alicia \n ");
    memeflix.asigna4Dispositivos(Alicia);
    hvo.asigna(Alicia);
    thisney.asigna(Alicia);
    spootify.spootifyPremium(Alicia);
    momazon.momazonPremium(Alicia);

    //Bob
    System.out.println("\t" + "Pagos de Bob \n ");
    spootify.spootifyPremium(Bob);

    /// Cesar
    System.out.println("\t" + "Pagos de Cesar\n ");
    hvo.asigna(Cesar);
    thisney.asigna(Cesar);

    /// Suscripcion y pago
    spootify.registrar(Cesar);
    Cesar.suscribirse(spootify);
    spootify.spootifyPremium(Cesar);

    /// Diego
    System.out.println("\t" + "Pagos de Diego\n ");

    hvo.asigna(Diego);
    thisney.asigna(Diego);


    //**  Suscripción de y pago de netflix  */
    memeflix.registrar(Diego);
    Diego.suscribirse(memeflix);
    memeflix.asigna1Dispositivo(Diego);


    //* Cambio de versión de Spootify*/

    spootify.spootifyPremium(Diego);

    //* Cancela suscripcion de momazon*/
    momazon.cancelar(Diego);


    // Recomendaciones

    System.out.println("\t" + "Recomendaciones \n ");

    memeflix.actualizar();
    hvo.actualizar();
    thisney.actualizar();
    spootify.actualizar();
    momazon.actualizar();


     System.out.println(" \n " + "\t" + " Agosto \n" + "\n");

    //Alicia
    System.out.println("\t" + "Pagos de Alicia \n ");

    memeflix.asigna4Dispositivos(Alicia);
    hvo.asigna(Alicia);
    thisney.asigna(Alicia);
    spootify.spootifyPremium(Alicia);
    momazon.momazonPremium(Alicia);

    //Bob
    System.out.println("\t" + "Pagos de Bob \n ");
    spootify.spootifyPremium(Bob);

    /// Cesar
    System.out.println("\t" + "Pagos de Cesar\n ");

    hvo.asigna(Cesar);
    thisney.asigna(Cesar);
    spootify.spootifyPremium(Cesar);


    /// Diego
    System.out.println("\t" + "Pagos de Diego\n ");

    hvo.asigna(Diego);
    thisney.asigna(Diego);
    memeflix.asigna1Dispositivo(Diego);
    spootify.spootifyPremium(Diego);

     // Recomendaciones

    System.out.println("\t" + "Recomendaciones \n ");

    memeflix.actualizar();
    hvo.actualizar();
    thisney.actualizar();
    spootify.actualizar();
    momazon.actualizar();


    System.out.println(" \n " + "\t" + " Septiembre \n" + "\n");

    //Alicia
    System.out.println("\t" + "Pagos de Alicia \n ");

    memeflix.asigna4Dispositivos(Alicia);
    hvo.asigna(Alicia);
    thisney.asigna(Alicia);
    spootify.spootifyPremium(Alicia);
    momazon.momazonPremium(Alicia);

    //Bob
    System.out.println("\t" + "Pagos de Bob \n ");
    spootify.spootifyPremium(Bob);

    /// Cesar
    System.out.println("\t" + "Pagos de Cesar\n ");

    hvo.asigna(Cesar);
    thisney.asigna(Cesar);
    spootify.spootifyPremium(Cesar);


    /// Diego
    System.out.println("\t" + "Pagos de Diego\n ");

    hvo.asigna(Diego);
    thisney.asigna(Diego);
    memeflix.asigna1Dispositivo(Diego);
    spootify.spootifyPremium(Diego);


    // Recomendaciones

    System.out.println("\t" + "Recomendaciones \n ");

    memeflix.actualizar();
    hvo.actualizar();
    thisney.actualizar();
    spootify.actualizar();
    momazon.actualizar();


    System.out.println(" \n " + "\t" + " Octubre \n" + "\n");

     //Alicia
    System.out.println("\t" + "Pagos de Alicia \n ");

    memeflix.asigna4Dispositivos(Alicia);
    hvo.asigna(Alicia);
    thisney.asigna(Alicia);
    spootify.spootifyPremium(Alicia);
    momazon.momazonPremium(Alicia);

    //Bob
    System.out.println("\t" + "Pagos de Bob \n ");
    spootify.spootifyPremium(Bob);

    /// Cesar
    System.out.println("\t" + "Pagos de Cesar\n ");

    hvo.asigna(Cesar);
    thisney.asigna(Cesar);
    spootify.spootifyPremium(Cesar);


    /// Diego
    System.out.println("\t" + "Pagos de Diego\n ");

    hvo.asigna(Diego);
    thisney.asigna(Diego);
    memeflix.asigna1Dispositivo(Diego);
    spootify.spootifyPremium(Diego);

    /// Erika
    System.out.println("\t" + "Pagos de Erika\n ");

    //**  Suscripción de y pago de momazon */
    momazon.registrar(Erika);
    Erika.suscribirse(momazon);
    momazon.momazonPremium(Erika);

    //* Suscripción de y pago de HVO */
    hvo.registrar(Erika);
    Erika.suscribirse(hvo);
    hvo.asigna(Erika);

    //**  Suscripción de y pago de Thisney + */
    thisney.registrar(Erika);
    Erika.suscribirse(thisney);
    thisney.asigna(Erika);

    // Recomendaciones

    System.out.println("\t" + "Recomendaciones \n ");

    memeflix.actualizar();
    hvo.actualizar();
    thisney.actualizar();
    spootify.actualizar();
    momazon.actualizar();


    System.out.println(" \n " + "\t" + " Noviembre \n" + "\n");

     //Alicia
    System.out.println("\t" + "Pagos de Alicia \n ");

    memeflix.asigna4Dispositivos(Alicia);
    hvo.asigna(Alicia);
    thisney.asigna(Alicia);
    spootify.spootifyPremium(Alicia);
    momazon.momazonPremium(Alicia);

    //Bob
    System.out.println("\t" + "Pagos de Bob \n ");
    spootify.spootifyPremium(Bob);

    /// Cesar
    System.out.println("\t" + "Pagos de Cesar\n ");

    hvo.asigna(Cesar);
    thisney.asigna(Cesar);
    spootify.spootifyPremium(Cesar);


    /// Diego
    System.out.println("\t" + "Pagos de Diego\n ");

    hvo.asigna(Diego);
    thisney.asigna(Diego);
    memeflix.asigna1Dispositivo(Diego);
    spootify.spootifyPremium(Diego);

    /// Erika
    System.out.println("\t" + "Pagos de Erika\n ");

    momazon.momazonPremium(Erika);
    hvo.asigna(Erika);
    thisney.asigna(Erika);


   // Recomendaciones

    System.out.println("\t" + "Recomendaciones \n ");

    memeflix.actualizar();
    hvo.actualizar();
    thisney.actualizar();
    spootify.actualizar();
    momazon.actualizar();


    System.out.println(" \n " + "\t" + " Diciembre \n" + "\n");

     //Alicia
    System.out.println("\t" + "Pagos de Alicia \n ");

    memeflix.asigna4Dispositivos(Alicia);
    hvo.asigna(Alicia);
    thisney.asigna(Alicia);
    spootify.spootifyPremium(Alicia);
    momazon.momazonPremium(Alicia);

    //Bob
    System.out.println("\t" + "Pagos de Bob \n ");
    spootify.spootifyPremium(Bob);

    /// Cesar
    System.out.println("\t" + "Pagos de Cesar\n ");

    hvo.asigna(Cesar);
    thisney.asigna(Cesar);
    spootify.spootifyPremium(Cesar);


    /// Diego
    System.out.println("\t" + "Pagos de Diego\n ");

    hvo.asigna(Diego);
    thisney.asigna(Diego);
    memeflix.asigna1Dispositivo(Diego);
    spootify.spootifyPremium(Diego);

     /// Erika
    System.out.println("\t" + "Pagos de Erika\n ");

    momazon.momazonPremium(Erika);
    hvo.asigna(Erika);
    thisney.asigna(Erika);



    // Recomendaciones
    System.out.println("\t" + "Recomendaciones \n ");

    memeflix.actualizar();
    hvo.actualizar();
    thisney.actualizar();
    spootify.actualizar();
    momazon.actualizar();



    }
}
