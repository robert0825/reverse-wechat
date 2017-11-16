package com.tencent.mapsdk.raster.model;

public abstract interface IOverlay
{
  public abstract String getId();
  
  public abstract boolean isVisible();
  
  public abstract void remove();
  
  public abstract void setVisible(boolean paramBoolean);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mapsdk\raster\model\IOverlay.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */