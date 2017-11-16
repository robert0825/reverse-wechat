package com.tencent.mm.plugin.fts.d;

import android.graphics.Color;
import android.text.TextPaint;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.br.a;
import com.tencent.mm.sdk.platformtools.ab;

public final class d
{
  public static final class a
  {
    public static final int lzq;
    public static final int lzr;
    public static final int lzs;
    
    static
    {
      GMTrace.i(18565667225600L, 138325);
      lzq = Color.parseColor("#45C01A");
      lzr = Color.parseColor("#661AAD19");
      lzs = Color.parseColor("#801AAD19");
      GMTrace.o(18565667225600L, 138325);
    }
  }
  
  public static final class b
  {
    public static final int lzt;
    public static final TextPaint lzu;
    public static final int lzv;
    public static final TextPaint lzw;
    public static final int lzx;
    public static final TextPaint lzy;
    
    static
    {
      GMTrace.i(18561506476032L, 138294);
      lzt = a.V(ab.getContext(), j.b.aQF);
      lzu = new TextPaint();
      lzv = a.V(ab.getContext(), j.b.aQo);
      lzw = new TextPaint();
      lzx = a.V(ab.getContext(), j.b.aQP);
      lzy = new TextPaint();
      lzu.setTextSize(lzt);
      lzw.setTextSize(lzv);
      lzy.setTextSize(lzx);
      GMTrace.o(18561506476032L, 138294);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\fts\d\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */