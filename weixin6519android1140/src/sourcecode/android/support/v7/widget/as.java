package android.support.v7.widget;

import android.support.v4.e.a;
import android.support.v4.e.e;
import android.support.v4.e.i.a;
import android.support.v4.e.i.b;

final class as
{
  final a<RecyclerView.t, a> Zs = new a();
  final e<RecyclerView.t> Zt = new e();
  
  final void a(long paramLong, RecyclerView.t paramt)
  {
    this.Zt.put(paramLong, paramt);
  }
  
  final void a(b paramb)
  {
    int i = this.Zs.size() - 1;
    if (i >= 0)
    {
      RecyclerView.t localt = (RecyclerView.t)this.Zs.keyAt(i);
      a locala = (a)this.Zs.removeAt(i);
      if ((locala.flags & 0x3) == 3) {
        paramb.i(localt);
      }
      for (;;)
      {
        a.a(locala);
        i -= 1;
        break;
        if ((locala.flags & 0x1) != 0)
        {
          if (locala.Zu == null) {
            paramb.i(localt);
          } else {
            paramb.a(localt, locala.Zu, locala.Zv);
          }
        }
        else if ((locala.flags & 0xE) == 14) {
          paramb.b(localt, locala.Zu, locala.Zv);
        } else if ((locala.flags & 0xC) == 12) {
          paramb.c(localt, locala.Zu, locala.Zv);
        } else if ((locala.flags & 0x4) != 0) {
          paramb.a(localt, locala.Zu, null);
        } else if ((locala.flags & 0x8) != 0) {
          paramb.b(localt, locala.Zu, locala.Zv);
        } else {
          int j = locala.flags;
        }
      }
    }
  }
  
  final void b(RecyclerView.t paramt, RecyclerView.e.c paramc)
  {
    a locala2 = (a)this.Zs.get(paramt);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = a.hc();
      this.Zs.put(paramt, locala1);
    }
    locala1.Zu = paramc;
    locala1.flags |= 0x4;
  }
  
  final RecyclerView.e.c c(RecyclerView.t paramt, int paramInt)
  {
    Object localObject2 = null;
    int i = this.Zs.indexOfKey(paramt);
    Object localObject1;
    if (i < 0) {
      localObject1 = localObject2;
    }
    a locala;
    do
    {
      do
      {
        return (RecyclerView.e.c)localObject1;
        locala = (a)this.Zs.valueAt(i);
        localObject1 = localObject2;
      } while (locala == null);
      localObject1 = localObject2;
    } while ((locala.flags & paramInt) == 0);
    locala.flags &= (paramInt ^ 0xFFFFFFFF);
    if (paramInt == 4) {}
    for (paramt = locala.Zu;; paramt = locala.Zv)
    {
      localObject1 = paramt;
      if ((locala.flags & 0xC) != 0) {
        break;
      }
      this.Zs.removeAt(i);
      a.a(locala);
      return paramt;
      if (paramInt != 8) {
        break label129;
      }
    }
    label129:
    throw new IllegalArgumentException("Must provide flag PRE or POST");
  }
  
  final void c(RecyclerView.t paramt, RecyclerView.e.c paramc)
  {
    a locala2 = (a)this.Zs.get(paramt);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = a.hc();
      this.Zs.put(paramt, locala1);
    }
    locala1.Zv = paramc;
    locala1.flags |= 0x8;
  }
  
  final void clear()
  {
    this.Zs.clear();
    e locale = this.Zt;
    int j = locale.mSize;
    Object[] arrayOfObject = locale.vm;
    int i = 0;
    while (i < j)
    {
      arrayOfObject[i] = null;
      i += 1;
    }
    locale.mSize = 0;
    locale.vk = false;
  }
  
  final boolean u(RecyclerView.t paramt)
  {
    paramt = (a)this.Zs.get(paramt);
    return (paramt != null) && ((paramt.flags & 0x1) != 0);
  }
  
  final void v(RecyclerView.t paramt)
  {
    a locala2 = (a)this.Zs.get(paramt);
    a locala1 = locala2;
    if (locala2 == null)
    {
      locala1 = a.hc();
      this.Zs.put(paramt, locala1);
    }
    locala1.flags |= 0x1;
  }
  
  final void w(RecyclerView.t paramt)
  {
    paramt = (a)this.Zs.get(paramt);
    if (paramt == null) {
      return;
    }
    paramt.flags &= 0xFFFFFFFE;
  }
  
  final void x(RecyclerView.t paramt)
  {
    int i = this.Zt.size() - 1;
    for (;;)
    {
      if (i >= 0)
      {
        if (paramt != this.Zt.valueAt(i)) {
          break label78;
        }
        e locale = this.Zt;
        if (locale.vm[i] != e.vj)
        {
          locale.vm[i] = e.vj;
          locale.vk = true;
        }
      }
      paramt = (a)this.Zs.remove(paramt);
      if (paramt != null) {
        a.a(paramt);
      }
      return;
      label78:
      i -= 1;
    }
  }
  
  static final class a
  {
    static i.a<a> Zw = new i.b(20);
    RecyclerView.e.c Zu;
    RecyclerView.e.c Zv;
    int flags;
    
    static void a(a parama)
    {
      parama.flags = 0;
      parama.Zu = null;
      parama.Zv = null;
      Zw.i(parama);
    }
    
    static a hc()
    {
      a locala2 = (a)Zw.bE();
      a locala1 = locala2;
      if (locala2 == null) {
        locala1 = new a();
      }
      return locala1;
    }
    
    static void hd()
    {
      while (Zw.bE() != null) {}
    }
  }
  
  static abstract interface b
  {
    public abstract void a(RecyclerView.t paramt, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2);
    
    public abstract void b(RecyclerView.t paramt, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2);
    
    public abstract void c(RecyclerView.t paramt, RecyclerView.e.c paramc1, RecyclerView.e.c paramc2);
    
    public abstract void i(RecyclerView.t paramt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\android\support\v7\widget\as.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */