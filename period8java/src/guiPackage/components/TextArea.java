package guiPackage.components;

import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics2D;
import java.awt.RenderingHints;

public class TextArea extends TextLabel {
	
	
	public TextArea(int x, int y, int width, int height, String text) {
		super(x, y, width, height, text);
		
	}
	
	public void update(Graphics2D g)
	{
		g.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
		g.setColor(Color.cyan);
		g.setFont(new Font(getFont(), Font.BOLD, getSize()));
		FontMetrics fm = g.getFontMetrics();
		
		if(getText() != null)
		{	
			
			String[] words = getText().split(" ");
			int pixelSum = 0;
			String newString = "";
			
			for(int i = 0; i < words.length; i++)
			{
				String word = words[i];
				
				int wordWidth = fm.stringWidth(word);
				if(pixelSum + wordWidth > getWidth())
				{
					newString += "/n";
					pixelSum = 0;
					i--;
				}
				else
				{
					newString += word;
					newString += " ";
					pixelSum += (wordWidth + 1);
				}
			}
			g.drawString(newString, 4, getHeight() - 5);
		}
	}
}