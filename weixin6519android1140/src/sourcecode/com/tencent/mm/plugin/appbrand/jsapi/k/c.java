package com.tencent.mm.plugin.appbrand.jsapi.k;

import com.tencent.mm.kernel.c.a;
import com.tencent.mm.ui.widget.MMWebView;
import org.json.JSONObject;

public final class c
{
  public static abstract interface a
    extends a
  {
    public abstract c.b a(c.c paramc);
  }
  
  public static abstract interface b
  {
    public abstract void cleanup();
  }
  
  public static abstract interface c
  {
    public abstract MMWebView XW();
    
    public abstract void bBP();
    
    public abstract String getAppId();
    
    public abstract void n(JSONObject paramJSONObject);
    
    public abstract void qQ(String paramString);
    
    public abstract void qR(String paramString);
    
    public abstract void qS(String paramString);
    
    public abstract void runOnUiThread(Runnable paramRunnable);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\k\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */