package com.tencent.mm.ui.applet;

import android.graphics.Bitmap;
import android.os.Looper;
import android.os.MessageQueue;
import android.os.MessageQueue.IdleHandler;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.MotionEvent;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;

public final class b
{
  public int direction;
  private GestureDetector mHA;
  private MessageQueue.IdleHandler vIH;
  public a vXA;
  private int vXx;
  private c vXy;
  public LinkedList<String> vXz;
  
  public b(a parama)
  {
    GMTrace.i(1845225324544L, 13748);
    this.direction = 0;
    this.mHA = new GestureDetector(new GestureDetector.OnGestureListener()
    {
      public final boolean onDown(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1848580767744L, 13773);
        GMTrace.o(1848580767744L, 13773);
        return false;
      }
      
      public final boolean onFling(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(1849251856384L, 13778);
        GMTrace.o(1849251856384L, 13778);
        return false;
      }
      
      public final void onLongPress(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1849117638656L, 13777);
        GMTrace.o(1849117638656L, 13777);
      }
      
      public final boolean onScroll(MotionEvent paramAnonymousMotionEvent1, MotionEvent paramAnonymousMotionEvent2, float paramAnonymousFloat1, float paramAnonymousFloat2)
      {
        GMTrace.i(1848983420928L, 13776);
        paramAnonymousMotionEvent1 = b.this;
        if (paramAnonymousFloat2 >= 0.0F) {}
        for (int i = 0;; i = 1)
        {
          paramAnonymousMotionEvent1.direction = i;
          GMTrace.o(1848983420928L, 13776);
          return false;
        }
      }
      
      public final void onShowPress(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1848714985472L, 13774);
        GMTrace.o(1848714985472L, 13774);
      }
      
      public final boolean onSingleTapUp(MotionEvent paramAnonymousMotionEvent)
      {
        GMTrace.i(1848849203200L, 13775);
        GMTrace.o(1848849203200L, 13775);
        return false;
      }
    });
    this.vXA = parama;
    this.vXx = 15;
    this.vXy = new c(40);
    this.vXz = new LinkedList();
    this.vIH = new MessageQueue.IdleHandler()
    {
      public final boolean queueIdle()
      {
        GMTrace.i(1847775461376L, 13767);
        while (b.this.vXz.size() > 0)
        {
          String str = (String)b.this.vXz.removeFirst();
          b.this.vXA.jP(str);
        }
        GMTrace.o(1847775461376L, 13767);
        return true;
      }
    };
    Looper.myQueue().addIdleHandler(this.vIH);
    GMTrace.o(1845225324544L, 13748);
  }
  
  public final void a(int paramInt, b paramb)
  {
    GMTrace.i(1845359542272L, 13749);
    if (paramb == null)
    {
      w.e("MicroMsg.EarlyGetHeadImg", "earlyGet, getter is null, no early get headimg will be performed");
      GMTrace.o(1845359542272L, 13749);
      return;
    }
    if (this.vXx <= 0)
    {
      w.e("MicroMsg.EarlyGetHeadImg", "earlyGet fail, threshold is invalid");
      GMTrace.o(1845359542272L, 13749);
      return;
    }
    int j = paramb.Hk();
    int i = 1;
    if (i <= this.vXx)
    {
      String str;
      if (this.direction == 1)
      {
        if (paramInt - i < 0)
        {
          GMTrace.o(1845359542272L, 13749);
          return;
        }
        str = paramb.gc(paramInt - i);
        if ((str != null) && (str.length() != 0) && (!this.vXy.contains(str)))
        {
          this.vXy.LD(str);
          this.vXz.add(str);
        }
      }
      for (;;)
      {
        i += 1;
        break;
        if (paramInt + i >= j)
        {
          GMTrace.o(1845359542272L, 13749);
          return;
        }
        str = paramb.gc(paramInt + i);
        if ((str != null) && (str.length() != 0) && (!this.vXy.contains(str)))
        {
          this.vXy.LD(str);
          this.vXz.add(str);
        }
      }
    }
    GMTrace.o(1845359542272L, 13749);
  }
  
  public final void detach()
  {
    GMTrace.i(1845627977728L, 13751);
    if (this.vIH != null) {
      Looper.myQueue().removeIdleHandler(this.vIH);
    }
    GMTrace.o(1845627977728L, 13751);
  }
  
  public final void onTouchEvent(MotionEvent paramMotionEvent)
  {
    GMTrace.i(1845493760000L, 13750);
    if (this.mHA != null) {
      this.mHA.onTouchEvent(paramMotionEvent);
    }
    GMTrace.o(1845493760000L, 13750);
  }
  
  public static abstract interface a
  {
    public abstract Bitmap jP(String paramString);
  }
  
  public static abstract interface b
  {
    public abstract int Hk();
    
    public abstract String gc(int paramInt);
  }
  
  private final class c
  {
    private LinkedList<String> fMv;
    private int maxSize;
    
    public c(int paramInt)
    {
      GMTrace.i(1852741517312L, 13804);
      this.fMv = null;
      this.maxSize = 40;
      this.fMv = new LinkedList();
      GMTrace.o(1852741517312L, 13804);
    }
    
    final void LD(String paramString)
    {
      GMTrace.i(1852875735040L, 13805);
      if (this.fMv.contains(paramString))
      {
        GMTrace.o(1852875735040L, 13805);
        return;
      }
      this.fMv.add(paramString);
      if (this.fMv.size() >= this.maxSize) {
        this.fMv.removeFirst();
      }
      GMTrace.o(1852875735040L, 13805);
    }
    
    final boolean contains(String paramString)
    {
      GMTrace.i(1853009952768L, 13806);
      boolean bool = this.fMv.contains(paramString);
      GMTrace.o(1853009952768L, 13806);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\applet\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */