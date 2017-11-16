package com.tencent.mm.plugin.appbrand.canvas.widget;

import android.graphics.Canvas;
import com.tencent.mm.plugin.appbrand.collector.d;
import org.json.JSONArray;

public abstract interface a
  extends b, d
{
  public abstract void TM();
  
  public abstract void TN();
  
  public abstract void a(JSONArray paramJSONArray, a parama);
  
  public abstract void b(JSONArray paramJSONArray, a parama);
  
  public abstract boolean d(Canvas paramCanvas);
  
  public abstract int getType();
  
  public abstract void i(Runnable paramRunnable);
  
  public abstract void oI(String paramString);
  
  public static abstract interface a
  {
    public abstract void TU();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\canvas\widget\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */