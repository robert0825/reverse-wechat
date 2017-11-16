package com.tencent.mm.plugin.p;

import android.graphics.Point;
import android.view.View;
import android.view.View.OnTouchListener;
import java.util.Collection;
import java.util.Set;

public abstract interface d
{
  public abstract void addLocationPin(View paramView);
  
  public abstract void addView(View paramView, double paramDouble1, double paramDouble2);
  
  public abstract void addView(View paramView, double paramDouble1, double paramDouble2, int paramInt);
  
  public abstract void addView(View paramView, double paramDouble1, double paramDouble2, String paramString);
  
  public abstract Collection<View> getChilds();
  
  public abstract b getIController();
  
  public abstract int getMapCenterX();
  
  public abstract int getMapCenterY();
  
  public abstract Point getPointByGeoPoint(double paramDouble1, double paramDouble2);
  
  public abstract Set<String> getTags();
  
  public abstract View getViewByItag(String paramString);
  
  public abstract int getZoom();
  
  public abstract int getZoomLevel();
  
  public abstract void invalidate();
  
  public abstract void removeView(View paramView);
  
  public abstract View removeViewByTag(String paramString);
  
  public abstract void setBuiltInZoomControls(boolean paramBoolean);
  
  public abstract void setMapViewOnTouchListener(View.OnTouchListener paramOnTouchListener);
  
  public abstract void updateLocaitonPinLayout(View paramView, double paramDouble1, double paramDouble2);
  
  public abstract void updateViewLayout(View paramView, double paramDouble1, double paramDouble2);
  
  public abstract void updateViewLayout(View paramView, double paramDouble1, double paramDouble2, int paramInt);
  
  public abstract void zoomToSpan(double paramDouble1, double paramDouble2, double paramDouble3, double paramDouble4);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\p\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */