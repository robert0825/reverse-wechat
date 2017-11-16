package com.tencent.mm.cache;

import android.graphics.Canvas;
import android.graphics.PorterDuff.Mode;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.Stack;

public final class b
  implements d<com.tencent.mm.t.b>
{
  private Stack<com.tencent.mm.t.b> fMi;
  public Stack<com.tencent.mm.t.b> fMj;
  public int fMl;
  
  public b()
  {
    GMTrace.i(19614847205376L, 146142);
    GMTrace.o(19614847205376L, 146142);
  }
  
  public final void a(Canvas paramCanvas, boolean paramBoolean)
  {
    GMTrace.i(19615518294016L, 146147);
    if (paramBoolean)
    {
      paramCanvas.drawColor(0, PorterDuff.Mode.CLEAR);
      localObject = this.fMi.iterator();
      while (((Iterator)localObject).hasNext()) {
        ((com.tencent.mm.t.b)((Iterator)localObject).next()).draw(paramCanvas);
      }
      GMTrace.o(19615518294016L, 146147);
      return;
    }
    if ((this.fMi != null) && (this.fMi.size() > 0)) {}
    for (Object localObject = (com.tencent.mm.t.b)this.fMi.peek();; localObject = null)
    {
      if (localObject != null) {
        ((com.tencent.mm.t.b)localObject).draw(paramCanvas);
      }
      GMTrace.o(19615518294016L, 146147);
      return;
    }
  }
  
  public final void aI(boolean paramBoolean)
  {
    GMTrace.i(19615249858560L, 146145);
    w.i("MicroMsg.DoodleCache", "[onSave] size:%s", new Object[] { Integer.valueOf(this.fMi.size()) });
    if (this.fMj != null) {
      this.fMj.clear();
    }
    this.fMj = ((Stack)this.fMi.clone());
    if (paramBoolean) {
      this.fMi.clear();
    }
    GMTrace.o(19615249858560L, 146145);
  }
  
  public final int aJ(boolean paramBoolean)
  {
    GMTrace.i(19615786729472L, 146149);
    int i;
    if (paramBoolean)
    {
      if (this.fMi != null)
      {
        i = this.fMi.size();
        GMTrace.o(19615786729472L, 146149);
        return i;
      }
      GMTrace.o(19615786729472L, 146149);
      return 0;
    }
    if (this.fMj != null)
    {
      i = this.fMj.size();
      GMTrace.o(19615786729472L, 146149);
      return i;
    }
    GMTrace.o(19615786729472L, 146149);
    return 0;
  }
  
  public final void c(Canvas paramCanvas)
  {
    GMTrace.i(19615652511744L, 146148);
    Iterator localIterator = this.fMi.iterator();
    while (localIterator.hasNext()) {
      ((com.tencent.mm.t.b)localIterator.next()).draw(paramCanvas);
    }
    GMTrace.o(19615652511744L, 146148);
  }
  
  public final void onCreate()
  {
    GMTrace.i(19614981423104L, 146143);
    this.fMi = new Stack();
    GMTrace.o(19614981423104L, 146143);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19615115640832L, 146144);
    w.i("MicroMsg.DoodleCache", "[onDestroy]");
    if (this.fMi != null) {
      this.fMi.clear();
    }
    if (this.fMj != null) {
      this.fMj.clear();
    }
    GMTrace.o(19615115640832L, 146144);
  }
  
  public final void pW()
  {
    GMTrace.i(19615920947200L, 146150);
    this.fMl += 1;
    GMTrace.o(19615920947200L, 146150);
  }
  
  public final void rS()
  {
    GMTrace.i(19615384076288L, 146146);
    w.i("MicroMsg.DoodleCache", "[onRestore] size:%s", new Object[] { Integer.valueOf(this.fMi.size()) });
    this.fMi.clear();
    if (this.fMj != null)
    {
      w.i("MicroMsg.DoodleCache", "[onRestore] %s", new Object[] { Integer.valueOf(this.fMj.size()) });
      this.fMi.addAll(this.fMj);
    }
    GMTrace.o(19615384076288L, 146146);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\cache\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */