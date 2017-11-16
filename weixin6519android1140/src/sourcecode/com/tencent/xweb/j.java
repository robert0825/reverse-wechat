package com.tencent.xweb;

import android.net.Uri;
import java.util.Map;

public abstract interface j
{
  public abstract String getMethod();
  
  public abstract Map<String, String> getRequestHeaders();
  
  public abstract Uri getUrl();
  
  public abstract boolean hasGesture();
  
  public abstract boolean isForMainFrame();
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\xweb\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */