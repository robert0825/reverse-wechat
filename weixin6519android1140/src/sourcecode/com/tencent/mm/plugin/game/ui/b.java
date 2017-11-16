package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.a.f;
import com.tencent.mm.a.f.a;
import com.tencent.mm.br.a;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.g;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.LinkedList;

public abstract class b<T>
  extends BaseAdapter
{
  private static int lTG;
  protected LinkedList<T> lOh;
  a lTD;
  protected boolean lTE;
  private f<String, Bitmap> lTF;
  private aj lTH;
  private final j.a lTI;
  protected Context mContext;
  
  static
  {
    GMTrace.i(12769877295104L, 95143);
    lTG = 500;
    GMTrace.o(12769877295104L, 95143);
  }
  
  public b(Context paramContext)
  {
    GMTrace.i(12768400900096L, 95132);
    this.lTE = false;
    this.lTH = new aj(new aj.a()
    {
      public final boolean pM()
      {
        GMTrace.i(12698473463808L, 94611);
        b.this.notifyDataSetChanged();
        GMTrace.o(12698473463808L, 94611);
        return false;
      }
    }, false);
    this.lTI = new j.a()
    {
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(12750818377728L, 95001);
        b.a(b.this).stopTimer();
        paramAnonymousString = b.a(b.this);
        long l = b.aeX();
        paramAnonymousString.z(l, l);
        GMTrace.o(12750818377728L, 95001);
      }
    };
    this.mContext = paramContext;
    this.lOh = new LinkedList();
    this.lTF = new f(20);
    an.aWy().c(this.lTI);
    GMTrace.o(12768400900096L, 95132);
  }
  
  public void P(LinkedList<T> paramLinkedList)
  {
    GMTrace.i(12768535117824L, 95133);
    if (paramLinkedList == null)
    {
      if (this.lTD != null) {
        this.lTD.oI(this.lOh.size());
      }
      GMTrace.o(12768535117824L, 95133);
      return;
    }
    this.lOh.addAll(paramLinkedList);
    if (this.lTD != null) {
      this.lTD.oI(this.lOh.size());
    }
    super.notifyDataSetChanged();
    GMTrace.o(12768535117824L, 95133);
  }
  
  public void Q(LinkedList<T> paramLinkedList)
  {
    GMTrace.i(12768669335552L, 95134);
    if (paramLinkedList == null)
    {
      if (this.lTD != null) {
        this.lTD.oI(this.lOh.size());
      }
      GMTrace.o(12768669335552L, 95134);
      return;
    }
    this.lOh = paramLinkedList;
    if (this.lTD != null) {
      this.lTD.oI(this.lOh.size());
    }
    super.notifyDataSetChanged();
    GMTrace.o(12768669335552L, 95134);
  }
  
  public void clear()
  {
    GMTrace.i(12768937771008L, 95136);
    if (this.lOh != null) {
      this.lOh.clear();
    }
    if (this.lTF != null) {
      this.lTF.a(new f.a() {});
    }
    this.lTF = null;
    an.aWy().j(this.lTI);
    GMTrace.o(12768937771008L, 95136);
  }
  
  public int getCount()
  {
    GMTrace.i(12769206206464L, 95138);
    int i = this.lOh.size();
    GMTrace.o(12769206206464L, 95138);
    return i;
  }
  
  public Object getItem(int paramInt)
  {
    GMTrace.i(12769340424192L, 95139);
    Object localObject = this.lOh.get(paramInt);
    GMTrace.o(12769340424192L, 95139);
    return localObject;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(12769474641920L, 95140);
    long l = paramInt;
    GMTrace.o(12769474641920L, 95140);
    return l;
  }
  
  protected final void remove(int paramInt)
  {
    GMTrace.i(12768803553280L, 95135);
    if (this.lOh != null)
    {
      if ((paramInt < 0) || (paramInt > this.lOh.size() - 1))
      {
        GMTrace.o(12768803553280L, 95135);
        return;
      }
      this.lOh.remove(paramInt);
      if (this.lTD != null) {
        this.lTD.oI(this.lOh.size());
      }
      super.notifyDataSetChanged();
    }
    GMTrace.o(12768803553280L, 95135);
  }
  
  protected final Bitmap zP(String paramString)
  {
    GMTrace.i(12769071988736L, 95137);
    if (bg.nm(paramString))
    {
      GMTrace.o(12769071988736L, 95137);
      return null;
    }
    if (this.lTF.ba(paramString))
    {
      localBitmap = (Bitmap)this.lTF.get(paramString);
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        GMTrace.o(12769071988736L, 95137);
        return localBitmap;
      }
    }
    Bitmap localBitmap = g.b(paramString, 1, a.getDensity(this.mContext));
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      this.lTF.m(paramString, localBitmap);
      GMTrace.o(12769071988736L, 95137);
      return localBitmap;
    }
    GMTrace.o(12769071988736L, 95137);
    return localBitmap;
  }
  
  public static abstract interface a
  {
    public abstract void oI(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */