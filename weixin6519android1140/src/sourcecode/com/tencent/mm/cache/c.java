package com.tencent.mm.cache;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.t.e;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Stack;

public final class c
  implements d<com.tencent.mm.t.c>
{
  public Stack<com.tencent.mm.t.c> fMi;
  public Stack<com.tencent.mm.t.c> fMj;
  private int fMl;
  
  public c()
  {
    GMTrace.i(19618068430848L, 146166);
    GMTrace.o(19618068430848L, 146166);
  }
  
  public final void a(Canvas paramCanvas, boolean paramBoolean)
  {
    GMTrace.i(19618739519488L, 146171);
    if (paramBoolean)
    {
      paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
      localObject = this.fMi.iterator();
      while (((Iterator)localObject).hasNext())
      {
        com.tencent.mm.t.c localc = (com.tencent.mm.t.c)((Iterator)localObject).next();
        if (!localc.fWv) {
          localc.draw(paramCanvas);
        }
      }
      GMTrace.o(19618739519488L, 146171);
      return;
    }
    Object localObject = rW();
    if ((localObject != null) && (!((com.tencent.mm.t.c)localObject).fWv)) {
      ((com.tencent.mm.t.c)localObject).draw(paramCanvas);
    }
    GMTrace.o(19618739519488L, 146171);
  }
  
  public final void a(com.tencent.mm.t.c paramc)
  {
    GMTrace.i(19619276390400L, 146175);
    if (this.fMi != null) {
      this.fMi.push(paramc);
    }
    GMTrace.o(19619276390400L, 146175);
  }
  
  public final void aI(boolean paramBoolean)
  {
    GMTrace.i(19618471084032L, 146169);
    w.i("MicroMsg.EmojiAndTextCache", "[onSave] size:%s isExit:%s", new Object[] { Integer.valueOf(this.fMi.size()), Boolean.valueOf(paramBoolean) });
    if (this.fMj != null) {
      this.fMj.clear();
    }
    this.fMj = new Stack();
    Iterator localIterator = this.fMi.iterator();
    com.tencent.mm.t.c localc;
    while (localIterator.hasNext())
    {
      localc = (com.tencent.mm.t.c)localIterator.next();
      this.fMj.push(localc.we());
    }
    w.i("MicroMsg.EmojiAndTextCache", "[onSave] mLastStack size:%s", new Object[] { Integer.valueOf(this.fMj.size()) });
    if (paramBoolean)
    {
      this.fMi.clear();
      localIterator = this.fMj.iterator();
      while (localIterator.hasNext())
      {
        localc = (com.tencent.mm.t.c)localIterator.next();
        w.d("MicroMsg.EmojiItem", "[recycleBitmap]");
        if ((localc.fWs != null) && (!localc.fWs.isRecycled())) {
          localc.fWs.recycle();
        }
      }
    }
    GMTrace.o(19618471084032L, 146169);
  }
  
  public final int aJ(boolean paramBoolean)
  {
    GMTrace.i(19619410608128L, 146176);
    int i;
    if (paramBoolean)
    {
      if (this.fMi != null)
      {
        i = this.fMi.size();
        GMTrace.o(19619410608128L, 146176);
        return i;
      }
      GMTrace.o(19619410608128L, 146176);
      return 0;
    }
    if (this.fMj != null)
    {
      i = this.fMj.size();
      GMTrace.o(19619410608128L, 146176);
      return i;
    }
    GMTrace.o(19619410608128L, 146176);
    return 0;
  }
  
  public final void b(com.tencent.mm.t.c paramc)
  {
    GMTrace.i(19619679043584L, 146178);
    if (paramc == null)
    {
      GMTrace.o(19619679043584L, 146178);
      return;
    }
    int i = this.fMi.indexOf(paramc);
    this.fMi.remove(i);
    this.fMi.push(paramc);
    GMTrace.o(19619679043584L, 146178);
  }
  
  public final void c(Canvas paramCanvas)
  {
    GMTrace.i(19618873737216L, 146172);
    Iterator localIterator = this.fMi.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.t.c localc = (com.tencent.mm.t.c)localIterator.next();
      localc.setSelected(false);
      localc.draw(paramCanvas);
    }
    GMTrace.o(19618873737216L, 146172);
  }
  
  public final void onCreate()
  {
    GMTrace.i(19618202648576L, 146167);
    w.i("MicroMsg.EmojiAndTextCache", "[onCreate]");
    this.fMi = new Stack();
    GMTrace.o(19618202648576L, 146167);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19618336866304L, 146168);
    w.i("MicroMsg.EmojiAndTextCache", "[onDestroy]");
    Iterator localIterator;
    if (this.fMi != null)
    {
      localIterator = this.fMi.iterator();
      while (localIterator.hasNext()) {
        ((com.tencent.mm.t.c)localIterator.next()).clear();
      }
      this.fMi.clear();
    }
    if (this.fMj != null)
    {
      localIterator = this.fMj.iterator();
      while (localIterator.hasNext()) {
        ((com.tencent.mm.t.c)localIterator.next()).clear();
      }
      this.fMj.clear();
    }
    GMTrace.o(19618336866304L, 146168);
  }
  
  public final void pW()
  {
    GMTrace.i(19619544825856L, 146177);
    this.fMl += 1;
    GMTrace.o(19619544825856L, 146177);
  }
  
  public final void rS()
  {
    GMTrace.i(19618605301760L, 146170);
    w.i("MicroMsg.EmojiAndTextCache", "[onRestore] size:%s isExit:%s", new Object[] { Integer.valueOf(this.fMi.size()), Boolean.valueOf(false) });
    this.fMi.clear();
    if (this.fMj != null)
    {
      w.i("MicroMsg.EmojiAndTextCache", "[onRestore] %s", new Object[] { Integer.valueOf(this.fMj.size()) });
      this.fMi.addAll(this.fMj);
    }
    w.i("MicroMsg.EmojiAndTextCache", "[onRestore] mCurStack size:%s ", new Object[] { Integer.valueOf(this.fMi.size()) });
    Iterator localIterator = this.fMi.iterator();
    while (localIterator.hasNext()) {
      ((com.tencent.mm.t.c)localIterator.next()).vZ();
    }
    GMTrace.o(19618605301760L, 146170);
  }
  
  public final com.tencent.mm.t.c rV()
  {
    GMTrace.i(19619007954944L, 146173);
    com.tencent.mm.t.c localc = (com.tencent.mm.t.c)this.fMi.pop();
    GMTrace.o(19619007954944L, 146173);
    return localc;
  }
  
  public final com.tencent.mm.t.c rW()
  {
    GMTrace.i(19619142172672L, 146174);
    if ((this.fMi != null) && (this.fMi.size() > 0))
    {
      com.tencent.mm.t.c localc = (com.tencent.mm.t.c)this.fMi.peek();
      GMTrace.o(19619142172672L, 146174);
      return localc;
    }
    GMTrace.o(19619142172672L, 146174);
    return null;
  }
  
  public final ListIterator<com.tencent.mm.t.c> rX()
  {
    GMTrace.i(19619813261312L, 146179);
    ListIterator localListIterator = this.fMi.listIterator(this.fMi.size());
    GMTrace.o(19619813261312L, 146179);
    return localListIterator;
  }
  
  public final int[] rY()
  {
    GMTrace.i(19619947479040L, 146180);
    int[] arrayOfInt = new int[2];
    if (this.fMj != null)
    {
      Iterator localIterator = this.fMj.iterator();
      while (localIterator.hasNext()) {
        if (((com.tencent.mm.t.c)localIterator.next() instanceof e)) {
          arrayOfInt[1] += 1;
        } else {
          arrayOfInt[0] += 1;
        }
      }
    }
    GMTrace.o(19619947479040L, 146180);
    return arrayOfInt;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\cache\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */