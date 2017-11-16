package com.tencent.mm.ui;

import android.content.Context;
import android.database.Cursor;
import android.os.Looper;
import android.widget.BaseAdapter;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.e.m;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;
import junit.framework.Assert;

public abstract class o<T>
  extends BaseAdapter
  implements j.a, m.b
{
  public Context context;
  public int count;
  private ae ohR;
  private Cursor vDD;
  public T vKs;
  public Map<Integer, T> vKt;
  public a vKu;
  private int vKv;
  private int vKw;
  private int vKx;
  private Runnable vKy;
  
  public o(Context paramContext, T paramT)
  {
    GMTrace.i(1598667358208L, 11911);
    this.vDD = null;
    this.vKt = null;
    this.ohR = new ae(Looper.getMainLooper());
    this.vKv = 0;
    this.vKw = 0;
    this.vKx = 0;
    this.vKy = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2534030704640L, 18880);
        if (o.a(o.this) != 0)
        {
          w.v("MicroMsg.MListAdapter", "ashutest:: onResetCursorJobRun, current AbsListViewScrollType %d, post resetCursorJob, retryTimes %d", new Object[] { Integer.valueOf(o.a(o.this)), Integer.valueOf(o.b(o.this)) });
          o.d(o.this).removeCallbacks(o.c(o.this));
          if (20 > o.e(o.this))
          {
            o.d(o.this).postDelayed(o.c(o.this), 100L);
            GMTrace.o(2534030704640L, 18880);
            return;
          }
          w.w("MicroMsg.MListAdapter", "ashutest:: onResetCursorJobRun, current AbsListViewScrollType %d, do resetCursorJob, retryTimes %d", new Object[] { Integer.valueOf(o.a(o.this)), Integer.valueOf(o.e(o.this)) });
        }
        w.d("MicroMsg.MListAdapter", "ashutest:: do resetCursorJob");
        o.f(o.this);
        o.g(o.this);
        GMTrace.o(2534030704640L, 18880);
      }
    };
    this.vKs = paramT;
    this.context = paramContext;
    this.count = -1;
    GMTrace.o(1598667358208L, 11911);
  }
  
  private void bXk()
  {
    GMTrace.i(1600412188672L, 11924);
    w.v("MicroMsg.MListAdapter", "ashutest:: on UI, directly call resetCursor Job");
    if (this.vKu != null) {
      this.vKu.QD();
    }
    aJe();
    QF();
    if (this.vKu != null) {
      this.vKu.QC();
    }
    GMTrace.o(1600412188672L, 11924);
  }
  
  public abstract void QF();
  
  public abstract void QG();
  
  public abstract T a(T paramT, Cursor paramCursor);
  
  public void a(int paramInt, m paramm, Object paramObject)
  {
    GMTrace.i(1600143753216L, 11922);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      w.d("MicroMsg.MListAdapter", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(1600143753216L, 11922);
      return;
    }
    a((String)paramObject, null);
    GMTrace.o(1600143753216L, 11922);
  }
  
  public void a(String paramString, l paraml)
  {
    GMTrace.i(1600277970944L, 11923);
    bXk();
    GMTrace.o(1600277970944L, 11923);
  }
  
  public int aGD()
  {
    GMTrace.i(1600814841856L, 11927);
    GMTrace.o(1600814841856L, 11927);
    return 0;
  }
  
  public T aGE()
  {
    GMTrace.i(1600949059584L, 11928);
    Object localObject = this.vKs;
    GMTrace.o(1600949059584L, 11928);
    return (T)localObject;
  }
  
  public void aJe()
  {
    GMTrace.i(1599606882304L, 11918);
    if (this.vKt != null) {
      this.vKt.clear();
    }
    if (this.vDD != null) {
      this.vDD.close();
    }
    this.count = -1;
    GMTrace.o(1599606882304L, 11918);
  }
  
  public final int asx()
  {
    GMTrace.i(1599875317760L, 11920);
    if (this.count < 0) {
      this.count = getCursor().getCount();
    }
    int i = this.count;
    GMTrace.o(1599875317760L, 11920);
    return i;
  }
  
  public int getCount()
  {
    GMTrace.i(1599741100032L, 11919);
    if (this.count < 0) {
      this.count = getCursor().getCount();
    }
    int i = this.count;
    int j = aGD();
    GMTrace.o(1599741100032L, 11919);
    return i + j;
  }
  
  public final Cursor getCursor()
  {
    GMTrace.i(1599070011392L, 11914);
    if ((this.vDD == null) || (this.vDD.isClosed()))
    {
      QG();
      Assert.assertNotNull(this.vDD);
    }
    Cursor localCursor = this.vDD;
    GMTrace.o(1599070011392L, 11914);
    return localCursor;
  }
  
  public T getItem(int paramInt)
  {
    GMTrace.i(1600546406400L, 11925);
    if (oR(paramInt))
    {
      localObject = aGE();
      GMTrace.o(1600546406400L, 11925);
      return (T)localObject;
    }
    if (this.vKt != null)
    {
      localObject = this.vKt.get(Integer.valueOf(paramInt));
      if (localObject != null)
      {
        GMTrace.o(1600546406400L, 11925);
        return (T)localObject;
      }
    }
    if ((paramInt < 0) || (!getCursor().moveToPosition(paramInt)))
    {
      GMTrace.o(1600546406400L, 11925);
      return null;
    }
    if (this.vKt == null)
    {
      localObject = a(this.vKs, getCursor());
      GMTrace.o(1600546406400L, 11925);
      return (T)localObject;
    }
    Object localObject = a(null, getCursor());
    this.vKt.put(Integer.valueOf(paramInt), localObject);
    GMTrace.o(1600546406400L, 11925);
    return (T)localObject;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(1600009535488L, 11921);
    GMTrace.o(1600009535488L, 11921);
    return 0L;
  }
  
  public final void lb(boolean paramBoolean)
  {
    GMTrace.i(1599472664576L, 11917);
    if (!paramBoolean)
    {
      if (this.vKt != null)
      {
        this.vKt.clear();
        this.vKt = null;
        GMTrace.o(1599472664576L, 11917);
      }
    }
    else if (this.vKt == null) {
      this.vKt = new HashMap();
    }
    GMTrace.o(1599472664576L, 11917);
  }
  
  public boolean oR(int paramInt)
  {
    GMTrace.i(1600680624128L, 11926);
    if ((paramInt >= this.count) && (paramInt < this.count + aGD()))
    {
      GMTrace.o(1600680624128L, 11926);
      return true;
    }
    GMTrace.o(1600680624128L, 11926);
    return false;
  }
  
  public final void setCursor(Cursor paramCursor)
  {
    GMTrace.i(1599204229120L, 11915);
    this.vDD = paramCursor;
    this.count = -1;
    GMTrace.o(1599204229120L, 11915);
  }
  
  public static abstract interface a
  {
    public abstract void QC();
    
    public abstract void QD();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\o.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */