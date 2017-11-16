package com.tencent.wecall.talkroom.model;

import android.os.Handler;
import android.os.Looper;
import com.tencent.pb.common.b.a.a.am;
import com.tencent.pb.common.c.i;
import com.tencent.pb.talkroom.sdk.MultiTalkGroup;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
{
  public List<a> fIz = new LinkedList();
  Handler handler = new Handler(Looper.getMainLooper());
  
  public final void a(final int paramInt, final MultiTalkGroup paramMultiTalkGroup)
  {
    paramMultiTalkGroup = new Runnable()
    {
      public final void run()
      {
        synchronized (g.this.fIz)
        {
          Iterator localIterator = g.this.fIz.iterator();
          if (localIterator.hasNext()) {
            ((g.a)localIterator.next()).a(paramInt, paramMultiTalkGroup);
          }
        }
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramMultiTalkGroup.run();
      return;
    }
    this.handler.post(paramMultiTalkGroup);
  }
  
  public final void dl(final List<MultiTalkGroup> paramList)
  {
    paramList = new Runnable()
    {
      public final void run()
      {
        synchronized (g.this.fIz)
        {
          Iterator localIterator = g.this.fIz.iterator();
          if (localIterator.hasNext()) {
            ((g.a)localIterator.next()).dl(paramList);
          }
        }
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramList.run();
      return;
    }
    this.handler.post(paramList);
  }
  
  public final void dt(final String paramString, final int paramInt)
  {
    i.Z(new Runnable()
    {
      public final void run()
      {
        synchronized (g.this.fIz)
        {
          Iterator localIterator = g.this.fIz.iterator();
          if (localIterator.hasNext()) {
            ((g.a)localIterator.next()).dt(paramString, paramInt);
          }
        }
      }
    });
  }
  
  public final void e(final int paramInt, final Object paramObject)
  {
    paramObject = new Runnable()
    {
      public final void run()
      {
        synchronized (g.this.fIz)
        {
          Iterator localIterator = g.this.fIz.iterator();
          if (localIterator.hasNext()) {
            ((g.a)localIterator.next()).e(paramInt, paramObject);
          }
        }
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      ((Runnable)paramObject).run();
      return;
    }
    this.handler.post((Runnable)paramObject);
  }
  
  public final void g(final MultiTalkGroup paramMultiTalkGroup)
  {
    paramMultiTalkGroup = new Runnable()
    {
      public final void run()
      {
        synchronized (g.this.fIz)
        {
          Iterator localIterator = g.this.fIz.iterator();
          if (localIterator.hasNext()) {
            ((g.a)localIterator.next()).g(paramMultiTalkGroup);
          }
        }
      }
    };
    if (Looper.myLooper() == Looper.getMainLooper())
    {
      paramMultiTalkGroup.run();
      return;
    }
    this.handler.post(paramMultiTalkGroup);
  }
  
  public static abstract interface a
  {
    public abstract void Gk(int paramInt);
    
    public abstract void Gl(int paramInt);
    
    public abstract void a(int paramInt, MultiTalkGroup paramMultiTalkGroup);
    
    public abstract void aKX();
    
    public abstract void aRz();
    
    public abstract void aX(List<a.am> paramList);
    
    public abstract void b(MultiTalkGroup paramMultiTalkGroup);
    
    public abstract void bm(String paramString, boolean paramBoolean);
    
    public abstract void crt();
    
    public abstract void cru();
    
    public abstract void crv();
    
    public abstract void dl(List<MultiTalkGroup> paramList);
    
    public abstract void dt(String paramString, int paramInt);
    
    public abstract void e(int paramInt, Object paramObject);
    
    public abstract void g(MultiTalkGroup paramMultiTalkGroup);
    
    public abstract void gg(boolean paramBoolean);
    
    public abstract void onStateChanged(int paramInt);
    
    public abstract void p(MultiTalkGroup paramMultiTalkGroup);
    
    public abstract void q(MultiTalkGroup paramMultiTalkGroup);
    
    public abstract void rb(int paramInt);
    
    public abstract void y(String paramString, byte[] paramArrayOfByte);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\wecall\talkroom\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */