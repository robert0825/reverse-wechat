package com.tencent.mm.ui.contact.a;

import android.content.Context;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.selectcontact.a.c;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.x;

public abstract class a
{
  public static final int lzt;
  public static final TextPaint lzu;
  public static final int lzv;
  public static final TextPaint lzw;
  public String eCK;
  public String eQb;
  public x iBi;
  public final int jHw;
  public boolean jug;
  public int lAd;
  public int lAe;
  public int lzY;
  public final int position;
  public int scene;
  public boolean wSC;
  public boolean wSD;
  public boolean wUG;
  boolean wUH;
  public boolean wUI;
  public boolean wUJ;
  
  static
  {
    GMTrace.i(1776774283264L, 13238);
    lzt = com.tencent.mm.br.a.V(ab.getContext(), a.c.aQF);
    lzv = com.tencent.mm.br.a.V(ab.getContext(), a.c.aQo);
    lzu = new TextPaint();
    lzw = new TextPaint();
    lzu.setTextSize(lzt);
    lzw.setTextSize(lzv);
    GMTrace.o(1776774283264L, 13238);
  }
  
  public a(int paramInt1, int paramInt2)
  {
    GMTrace.i(1775968976896L, 13232);
    this.jHw = paramInt1;
    this.position = paramInt2;
    w.i("MicroMsg.BaseContactDataItem", "Create BaseContactDataItem viewType=%d | position=%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    GMTrace.o(1775968976896L, 13232);
  }
  
  public abstract b PV();
  
  public abstract a PW();
  
  public boolean aCH()
  {
    GMTrace.i(1776640065536L, 13237);
    GMTrace.o(1776640065536L, 13237);
    return false;
  }
  
  public abstract void bz(Context paramContext);
  
  public final void ci(int paramInt1, int paramInt2)
  {
    GMTrace.i(1776505847808L, 13236);
    this.lAd = paramInt1;
    this.lAe = paramInt2;
    GMTrace.o(1776505847808L, 13236);
  }
  
  public class a
  {
    public a()
    {
      GMTrace.i(1771808227328L, 13201);
      GMTrace.o(1771808227328L, 13201);
    }
  }
  
  public abstract class b
  {
    public b()
    {
      GMTrace.i(1773418840064L, 13213);
      GMTrace.o(1773418840064L, 13213);
    }
    
    public abstract boolean PX();
    
    public abstract View a(Context paramContext, ViewGroup paramViewGroup);
    
    public abstract void a(Context paramContext, a.a parama, a parama1, boolean paramBoolean1, boolean paramBoolean2);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */