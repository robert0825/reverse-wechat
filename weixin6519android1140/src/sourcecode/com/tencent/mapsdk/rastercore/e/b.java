package com.tencent.mapsdk.rastercore.e;

import android.graphics.Canvas;

public abstract interface b
{
  public abstract boolean checkInBounds();
  
  public abstract void destroy();
  
  public abstract void draw(Canvas paramCanvas);
  
  public abstract boolean equalsRemote(b paramb);
  
  public abstract String getId();
  
  public abstract float getZIndex();
  
  public abstract int hashCodeRemote();
  
  public abstract boolean isVisible();
  
  public abstract void remove();
  
  public abstract void setVisible(boolean paramBoolean);
  
  public abstract void setZIndex(float paramFloat);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\rastercore\e\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */