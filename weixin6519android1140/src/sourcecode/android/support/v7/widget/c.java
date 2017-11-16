package android.support.v7.widget;

import android.graphics.Outline;
import android.graphics.drawable.Drawable;

final class c
  extends b
{
  public c(ActionBarContainer paramActionBarContainer)
  {
    super(paramActionBarContainer);
  }
  
  public final void getOutline(Outline paramOutline)
  {
    if (this.Ly.LF) {
      if (this.Ly.LE != null) {
        this.Ly.LE.getOutline(paramOutline);
      }
    }
    while (this.Ly.JU == null) {
      return;
    }
    this.Ly.JU.getOutline(paramOutline);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */