import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.Image;
import java.awt.image.BufferedImage;


public class textToImage {
	
	public static Image getImage(String c, Color dd){
		BufferedImage img;
		int ch = c.length();
		int add = 5;
		
		if (ch < 3){
			img = new BufferedImage(100, 95, BufferedImage.TYPE_INT_ARGB);
		}else if (ch == 3){
			img = new BufferedImage(130, 95, BufferedImage.TYPE_INT_ARGB);
		}else if (ch == 4){
			img = new BufferedImage(160, 95, BufferedImage.TYPE_INT_ARGB);
		}else {
	        img = new BufferedImage(195, 95, BufferedImage.TYPE_INT_ARGB);
	        add = 20;
		}
        Graphics2D g2d = img.createGraphics();
        g2d.setPaint(dd);
        g2d.setFont(new Font("Lucida Grande", Font.BOLD, 70));
        
        FontMetrics fm = g2d.getFontMetrics();
        int x = img.getWidth() - fm.stringWidth(c) +add;
        int y = fm.getHeight() - 10;
        g2d.drawString(c, x, y);
        g2d.dispose();
        return img;
	}
	
}
