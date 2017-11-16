package android.support.v7.widget;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.drawable.Drawable;

class b
  extends Drawable
{
  final ActionBarContainer Ly;
  
  public b(ActionBarContainer paramActionBarContainer)
  {
    this.Ly = paramActionBarContainer;
  }
  
  public void draw(Canvas paramCanvas)
  {
    if (this.Ly.LF) {
      if (this.Ly.LE != null) {
        this.Ly.LE.draw(paramCanvas);
      }
    }
    do
    {
      return;
      if (this.Ly.JU != null) {
        this.Ly.JU.draw(paramCanvas);
      }
    } while ((this.Ly.LD == null) || (!this.Ly.LG));
    this.Ly.LD.draw(paramCanvas);
  }
  
  public int getOpacity()
  {
    return 0;
  }
  
  public void setAlpha(int paramInt) {}
  
  public void setColorFilter(ColorFilter paramColorFilter) {}
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */