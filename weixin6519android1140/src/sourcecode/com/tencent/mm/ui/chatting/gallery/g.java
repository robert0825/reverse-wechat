package com.tencent.mm.ui.chatting.gallery;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import java.util.ArrayList;
import java.util.Iterator;

public final class g
{
  public ArrayList<au> wKD;
  public boolean wMe;
  ArrayList<b> wMf;
  
  public g()
  {
    GMTrace.i(2471485243392L, 18414);
    this.wKD = new ArrayList();
    this.wMe = false;
    this.wMf = new ArrayList();
    GMTrace.o(2471485243392L, 18414);
  }
  
  private void cfn()
  {
    GMTrace.i(2472424767488L, 18421);
    Iterator localIterator = this.wMf.iterator();
    while (localIterator.hasNext()) {
      ((b)localIterator.next()).cfm();
    }
    GMTrace.o(2472424767488L, 18421);
  }
  
  private au fh(long paramLong)
  {
    GMTrace.i(2471753678848L, 18416);
    Iterator localIterator = this.wKD.iterator();
    while (localIterator.hasNext())
    {
      au localau = (au)localIterator.next();
      if (localau.field_msgId == paramLong)
      {
        GMTrace.o(2471753678848L, 18416);
        return localau;
      }
    }
    GMTrace.o(2471753678848L, 18416);
    return null;
  }
  
  public final void a(b paramb)
  {
    GMTrace.i(14964739801088L, 111496);
    if (paramb == null)
    {
      GMTrace.o(14964739801088L, 111496);
      return;
    }
    this.wMf.remove(paramb);
    this.wMf.add(paramb);
    GMTrace.o(14964739801088L, 111496);
  }
  
  public final void bn(au paramau)
  {
    GMTrace.i(2471619461120L, 18415);
    if (paramau == null)
    {
      GMTrace.o(2471619461120L, 18415);
      return;
    }
    w.i("MicroMsg.ImageGallerySelectedHandle", "add : %s", new Object[] { Long.valueOf(paramau.field_msgId) });
    this.wKD.remove(paramau);
    this.wKD.remove(fh(paramau.field_msgId));
    this.wKD.add(paramau);
    cfn();
    GMTrace.o(2471619461120L, 18415);
  }
  
  public final void bo(au paramau)
  {
    GMTrace.i(2471887896576L, 18417);
    if (paramau == null)
    {
      GMTrace.o(2471887896576L, 18417);
      return;
    }
    w.i("MicroMsg.ImageGallerySelectedHandle", "remove : %s", new Object[] { Long.valueOf(paramau.field_msgId) });
    this.wKD.remove(paramau);
    this.wKD.remove(fh(paramau.field_msgId));
    cfn();
    GMTrace.o(2471887896576L, 18417);
  }
  
  public final boolean bp(au paramau)
  {
    GMTrace.i(2472290549760L, 18420);
    if (paramau == null)
    {
      GMTrace.o(2472290549760L, 18420);
      return false;
    }
    Iterator localIterator = this.wKD.iterator();
    while (localIterator.hasNext()) {
      if (((au)localIterator.next()).field_msgId == paramau.field_msgId)
      {
        GMTrace.o(2472290549760L, 18420);
        return true;
      }
    }
    GMTrace.o(2472290549760L, 18420);
    return false;
  }
  
  public final void clear()
  {
    GMTrace.i(2472022114304L, 18418);
    w.i("MicroMsg.ImageGallerySelectedHandle", "clear..");
    this.wKD.clear();
    Iterator localIterator = this.wMf.iterator();
    while (localIterator.hasNext()) {
      ((b)localIterator.next()).clear();
    }
    GMTrace.o(2472022114304L, 18418);
  }
  
  public final void detach()
  {
    GMTrace.i(2472156332032L, 18419);
    this.wMf.clear();
    clear();
    this.wMe = false;
    GMTrace.o(2472156332032L, 18419);
  }
  
  private static final class a
  {
    public static final g wMg;
    
    static
    {
      GMTrace.i(2470679937024L, 18408);
      wMg = new g();
      GMTrace.o(2470679937024L, 18408);
    }
  }
  
  public static abstract interface b
  {
    public abstract void cfm();
    
    public abstract void clear();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */