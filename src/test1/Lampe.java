package test1;

public class Lampe {
    
    /**Definir la puissance de la Lampe.
     * MODIFICATION SUR LE HJAVA ADEMAGE !
     */
	public int puissance ;
    
	/**Définit l'état de la Lampe.
	 * état eteint ou allumée grâce aux opérateurs booléens true ou false
	 */
    public boolean estAllumee;
    
    /**Méthode qui allume/éteind la lampe.
     * 
     */
    public void Allumer()
    {
        this.estAllumee = true;
    }

    public void Eteindre()
    {
        this.estAllumee = false;
        
        
    }

    /** Constructeur d'objet de type Lampe.123456789
     * Lampe de puissance 100W qui est éteinte.
     *       
     */
    public Lampe() {
        this.puissance = 100;
        this.estAllumee = false;
        
    }

    /** Accesseur en mémoire de la puissance.
     * Affiche la puissance de la Lampe courante. 
     * @return
     */
    public int getPuissance() {
        return this.puissance;
    }

    /** Accesseur en mémoire de l'état de la lampe.
     * Affiche l'état de la Lampe.
     * @return
     */
    public boolean isEstAllumee() {
        return this.estAllumee;
    }
    
    
}
