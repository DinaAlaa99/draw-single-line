import java.applet.*;
import java.awt.*;
import java.awt.event.*;

public class DrawSingleLine extends Applet{
	
	int x1;
	int y1;
	int x2;
	int y2;
	
    
	

	public void init(){
	   
			
        this.requestFocus();
		this.addMouseListener(new MouseAdapter() {
	
		public void mousePressed(MouseEvent e) { 
		    
		    x1=e.getX();
			y1=e.getY();
			x2=e.getX();
			y2=e.getY();
			repaint(); 
			
		}
	    public void mouseReleased(MouseEvent e) { 
		    
			
			 x2=e.getX();
			 y2=e.getY();
			 repaint();
			
			   
		}
		});
		this.addMouseMotionListener(new MouseAdapter(){
	    public void mouseDragged(MouseEvent e) { 
		    
		    x2=e.getX();
			y2=e.getY();
			repaint(); 
		} 
	    });
	}	
		
	
	public void paint (Graphics g){
		 g.drawLine(x1,y1,x2,y2);
	
	}	
}