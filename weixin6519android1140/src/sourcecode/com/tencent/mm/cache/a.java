package com.tencent.mm.cache;

import android.graphics.Canvas;
import android.graphics.Matrix;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Stack;

public final class a
  implements d<com.tencent.mm.t.a>
{
  public Stack<com.tencent.mm.t.a> fMi;
  private Stack<com.tencent.mm.t.a> fMj;
  public Matrix fMk;
  private int fMl;
  
  public a()
  {
    GMTrace.i(19620350132224L, 146183);
    this.fMk = new Matrix();
    GMTrace.o(19620350132224L, 146183);
  }
  
  public final void a(Canvas paramCanvas, boolean paramBoolean)
  {
    GMTrace.i(19621021220864L, 146188);
    GMTrace.o(19621021220864L, 146188);
  }
  
  public final void a(com.tencent.mm.t.a parama)
  {
    GMTrace.i(19621423874048L, 146191);
    if (this.fMi != null) {
      this.fMi.push(parama);
    }
    GMTrace.o(19621423874048L, 146191);
  }
  
  public final void aI(boolean paramBoolean)
  {
    GMTrace.i(19620752785408L, 146186);
    w.i("MicroMsg.CropCache", "[onSave] size:%s", new Object[] { Integer.valueOf(this.fMi.size()) });
    if (this.fMj != null) {
      this.fMj.clear();
    }
    this.fMj = ((Stack)this.fMi.clone());
    if (paramBoolean) {
      this.fMi.clear();
    }
    GMTrace.o(19620752785408L, 146186);
  }
  
  public final int aJ(boolean paramBoolean)
  {
    GMTrace.i(19621692309504L, 146193);
    int i;
    if (paramBoolean)
    {
      if (this.fMi != null)
      {
        i = this.fMi.size();
        GMTrace.o(19621692309504L, 146193);
        return i;
      }
      GMTrace.o(19621692309504L, 146193);
      return 0;
    }
    if (this.fMj != null)
    {
      i = this.fMj.size();
      GMTrace.o(19621692309504L, 146193);
      return i;
    }
    GMTrace.o(19621692309504L, 146193);
    return 0;
  }
  
  public final void c(Canvas paramCanvas)
  {
    GMTrace.i(19621155438592L, 146189);
    GMTrace.o(19621155438592L, 146189);
  }
  
  public final void onCreate()
  {
    GMTrace.i(19620484349952L, 146184);
    w.i("MicroMsg.CropCache", "[onCreate]");
    this.fMi = new Stack();
    GMTrace.o(19620484349952L, 146184);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19620618567680L, 146185);
    if (this.fMi != null) {
      this.fMi.clear();
    }
    if (this.fMj != null) {
      this.fMj.clear();
    }
    this.fMk.reset();
    GMTrace.o(19620618567680L, 146185);
  }
  
  public final void pW()
  {
    GMTrace.i(19621826527232L, 146194);
    this.fMl += 1;
    GMTrace.o(19621826527232L, 146194);
  }
  
  public final void rS()
  {
    GMTrace.i(19620887003136L, 146187);
    w.i("MicroMsg.CropCache", "[onRestore] size:%s", new Object[] { Integer.valueOf(this.fMi.size()) });
    this.fMi.clear();
    if (this.fMj != null)
    {
      w.i("MicroMsg.CropCache", "[onRestore] %s", new Object[] { Integer.valueOf(this.fMj.size()) });
      this.fMi.addAll(this.fMj);
    }
    GMTrace.o(19620887003136L, 146187);
  }
  
  public final com.tencent.mm.t.a rT()
  {
    GMTrace.i(19621289656320L, 146190);
    if (this.fMi.size() <= 0)
    {
      w.e("MicroMsg.CropCache", "[pop]");
      GMTrace.o(19621289656320L, 146190);
      return null;
    }
    com.tencent.mm.t.a locala = (com.tencent.mm.t.a)this.fMi.pop();
    GMTrace.o(19621289656320L, 146190);
    return locala;
  }
  
  public final com.tencent.mm.t.a rU()
  {
    GMTrace.i(19621558091776L, 146192);
    if ((this.fMi != null) && (this.fMi.size() > 0))
    {
      com.tencent.mm.t.a locala = (com.tencent.mm.t.a)this.fMi.peek();
      GMTrace.o(19621558091776L, 146192);
      return locala;
    }
    GMTrace.o(19621558091776L, 146192);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\cache\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */