
package codigo;

import java.awt.Image;
import java.io.IOException;
import javax.imageio.ImageIO;

/**
 *
 * @author Virtus
 */
public class Explosion {
    Image imagenExplosion = null;
    //coordenadas de la explosion
    private int x = 0;
    private int y = 0;
    
    public Explosion(){
        try {
            imagenExplosion = ImageIO.read((getClass().getResource("/imagenes/e1.png")));
        } catch (IOException ex) {
            
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }
    
}
