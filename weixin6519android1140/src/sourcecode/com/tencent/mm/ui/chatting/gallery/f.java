package com.tencent.mm.ui.chatting.gallery;

import android.graphics.Bitmap;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f.b;
import com.tencent.mm.sdk.platformtools.ar;
import java.util.HashMap;
import java.util.LinkedList;

public final class f
{
  private ar gxv;
  protected com.tencent.mm.a.f<String, Bitmap> lEb;
  public boolean lEe;
  public LinkedList<String> sp;
  protected HashMap<String, Long> wMb;
  private int xl;
  
  public f()
  {
    GMTrace.i(2408671346688L, 17946);
    this.lEb = new com.tencent.mm.a.f(4, new f.b() {});
    this.wMb = new HashMap();
    this.sp = new LinkedList();
    this.gxv = new ar(1, "chatting-image-gallery-preload-loader");
    this.lEe = false;
    this.xl = 0;
    GMTrace.o(2408671346688L, 17946);
  }
  
  public final void aDz()
  {
    GMTrace.i(2408805564416L, 17947);
    this.lEb.a(new com.tencent.mm.a.f.a() {});
    GMTrace.o(2408805564416L, 17947);
  }
  
  private static final class a
  {
    public static f wMd;
    
    static
    {
      GMTrace.i(2444775915520L, 18215);
      wMd = new f();
      GMTrace.o(2444775915520L, 18215);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */