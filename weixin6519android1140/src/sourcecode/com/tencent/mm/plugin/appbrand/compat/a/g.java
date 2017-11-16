package com.tencent.mm.plugin.appbrand.compat.a;

import android.content.Intent;
import android.text.Spannable;
import com.tencent.mm.kernel.c.a;
import java.io.File;
import java.util.List;
import java.util.Map;
import java.util.Properties;

public abstract interface g
  extends a
{
  public abstract int KK();
  
  public abstract String Ko();
  
  public abstract Intent Kv();
  
  public abstract Map<String, String> Up();
  
  public abstract Spannable a(CharSequence paramCharSequence, List<String> paramList, String paramString);
  
  public abstract Spannable a(CharSequence paramCharSequence, List<String> paramList, boolean paramBoolean, String paramString);
  
  public abstract boolean aP(String paramString1, String paramString2);
  
  public abstract String n(Map<String, String> paramMap);
  
  public abstract Properties n(File paramFile);
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\compat\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */