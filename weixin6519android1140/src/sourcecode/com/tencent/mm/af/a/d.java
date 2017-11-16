package com.tencent.mm.af.a;

import android.database.Cursor;
import android.os.Looper;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.u;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.concurrent.atomic.AtomicLong;

public final class d
  extends i<u>
{
  public static final String[] fTX;
  public com.tencent.mm.sdk.e.e fTZ;
  final k<a, d.a.b> gvy;
  private AtomicLong gyc;
  
  static
  {
    GMTrace.i(4573334863872L, 34074);
    fTX = new String[] { i.a(c.fTp, "BizChatInfo") };
    GMTrace.o(4573334863872L, 34074);
  }
  
  public d(com.tencent.mm.sdk.e.e arg1)
  {
    super(???, c.fTp, "BizChatInfo", null);
    GMTrace.i(4572126904320L, 34065);
    this.gyc = new AtomicLong(-1L);
    this.gvy = new k() {};
    this.fTZ = ???;
    ???.eZ("BizChatInfo", "CREATE INDEX IF NOT EXISTS bizChatLocalIdIndex ON BizChatInfo ( bizChatLocalId )");
    ???.eZ("BizChatInfo", "CREATE INDEX IF NOT EXISTS bizChatIdIndex ON BizChatInfo ( bizChatServId )");
    ???.eZ("BizChatInfo", "CREATE INDEX IF NOT EXISTS brandUserNameIndex ON BizChatInfo ( brandUserName )");
    synchronized (this.gyc)
    {
      Cursor localCursor = this.fTZ.a("select max(bizChatLocalId) from BizChatInfo", null, 2);
      long l1 = 0L;
      if (localCursor.moveToFirst())
      {
        long l2 = localCursor.getInt(0);
        l1 = l2;
        if (l2 > this.gyc.get())
        {
          this.gyc.set(l2);
          l1 = l2;
        }
      }
      localCursor.close();
      w.i("MicroMsg.BizChatInfoStorage", "loading new BizChat id:" + l1);
      GMTrace.o(4572126904320L, 34065);
      return;
    }
  }
  
  private long FW()
  {
    GMTrace.i(4573200646144L, 34073);
    synchronized (this.gyc)
    {
      long l = this.gyc.incrementAndGet();
      w.i("MicroMsg.BizChatInfoStorage", "incBizChatLocalId %d  ", new Object[] { Long.valueOf(l) });
      GMTrace.o(4573200646144L, 34073);
      return l;
    }
  }
  
  public final void a(a parama)
  {
    GMTrace.i(4572395339776L, 34067);
    if (this.gvy != null) {
      this.gvy.remove(parama);
    }
    GMTrace.o(4572395339776L, 34067);
  }
  
  public final void a(a parama, Looper paramLooper)
  {
    GMTrace.i(4572261122048L, 34066);
    this.gvy.a(parama, paramLooper);
    GMTrace.o(4572261122048L, 34066);
  }
  
  public final boolean a(c paramc)
  {
    GMTrace.i(4572932210688L, 34071);
    if (paramc == null)
    {
      w.w("MicroMsg.BizChatInfoStorage", "insert wrong argument");
      GMTrace.o(4572932210688L, 34071);
      return false;
    }
    if (bg.nm(paramc.field_bizChatServId))
    {
      w.e("MicroMsg.BizChatInfoStorage", "insert bizchat servid null");
      GMTrace.o(4572932210688L, 34071);
      return false;
    }
    Object localObject = jd(paramc.field_bizChatServId);
    if (localObject != null)
    {
      paramc.field_bizChatLocalId = ((c)localObject).field_bizChatLocalId;
      w.e("MicroMsg.BizChatInfoStorage", "insert bizchat servid exist");
      GMTrace.o(4572932210688L, 34071);
      return true;
    }
    paramc.field_bizChatLocalId = FW();
    boolean bool = super.b(paramc);
    if (bool)
    {
      localObject = new d.a.b();
      ((d.a.b)localObject).gxY = paramc.field_bizChatLocalId;
      ((d.a.b)localObject).eEs = paramc.field_brandUserName;
      ((d.a.b)localObject).gyi = d.a.a.gye;
      ((d.a.b)localObject).gyj = paramc;
      this.gvy.bI(localObject);
      this.gvy.doNotify();
    }
    GMTrace.o(4572932210688L, 34071);
    return bool;
  }
  
  public final boolean ac(long paramLong)
  {
    GMTrace.i(4572797992960L, 34070);
    c localc = t(paramLong);
    boolean bool = super.a(localc, new String[] { "bizChatLocalId" });
    if (bool)
    {
      d.a.b localb = new d.a.b();
      localb.gxY = localc.field_bizChatLocalId;
      localb.eEs = localc.field_brandUserName;
      localb.gyi = d.a.a.gyf;
      localb.gyj = localc;
      this.gvy.bI(localb);
      this.gvy.doNotify();
    }
    GMTrace.o(4572797992960L, 34070);
    return bool;
  }
  
  public final boolean b(c paramc)
  {
    GMTrace.i(4573066428416L, 34072);
    if (paramc == null)
    {
      w.w("MicroMsg.BizChatInfoStorage", "update wrong argument");
      GMTrace.o(4573066428416L, 34072);
      return false;
    }
    if (paramc.field_bizChatLocalId < 0L)
    {
      w.e("MicroMsg.BizChatInfoStorage", "update bizchat localid neg");
      GMTrace.o(4573066428416L, 34072);
      return false;
    }
    Object localObject = t(paramc.field_bizChatLocalId);
    if ((!bg.nm(((c)localObject).field_bizChatServId)) && (!((c)localObject).field_bizChatServId.equals(paramc.field_bizChatServId)))
    {
      w.e("MicroMsg.BizChatInfoStorage", "update bizchat servid nequal");
      GMTrace.o(4573066428416L, 34072);
      return false;
    }
    if ((paramc == null) || (bg.nm(paramc.field_chatName))) {
      w.i("MicroMsg.BizChatInfoStorage", "dealWithChatNamePY null");
    }
    for (;;)
    {
      boolean bool = super.a(paramc);
      if (bool)
      {
        e.g(paramc);
        localObject = new d.a.b();
        ((d.a.b)localObject).gxY = paramc.field_bizChatLocalId;
        ((d.a.b)localObject).eEs = paramc.field_brandUserName;
        ((d.a.b)localObject).gyi = d.a.a.gyg;
        ((d.a.b)localObject).gyj = paramc;
        this.gvy.bI(localObject);
        this.gvy.doNotify();
      }
      GMTrace.o(4573066428416L, 34072);
      return bool;
      paramc.field_chatNamePY = com.tencent.mm.platformtools.c.nb(paramc.field_chatName);
    }
  }
  
  public final c jd(String paramString)
  {
    GMTrace.i(4572663775232L, 34069);
    Object localObject2 = null;
    Object localObject1 = null;
    Object localObject3 = new StringBuilder();
    ((StringBuilder)localObject3).append("select * ");
    ((StringBuilder)localObject3).append(" from BizChatInfo");
    ((StringBuilder)localObject3).append(" where bizChatServId = '").append(paramString).append("' ");
    ((StringBuilder)localObject3).append(" limit 1");
    paramString = ((StringBuilder)localObject3).toString();
    w.d("MicroMsg.BizChatInfoStorage", "getByServId sql %s", new Object[] { paramString });
    localObject3 = rawQuery(paramString, new String[0]);
    paramString = (String)localObject2;
    if (localObject3 != null)
    {
      paramString = (String)localObject1;
      if (((Cursor)localObject3).moveToFirst())
      {
        paramString = new c();
        paramString.b((Cursor)localObject3);
      }
      ((Cursor)localObject3).close();
    }
    GMTrace.o(4572663775232L, 34069);
    return paramString;
  }
  
  public final c t(long paramLong)
  {
    GMTrace.i(4572529557504L, 34068);
    c localc = new c();
    localc.field_bizChatLocalId = paramLong;
    super.b(localc, new String[0]);
    GMTrace.o(4572529557504L, 34068);
    return localc;
  }
  
  public static abstract interface a
  {
    public abstract void a(b paramb);
    
    public static enum a
    {
      static
      {
        GMTrace.i(4582730104832L, 34144);
        gye = 1;
        gyf = 2;
        gyg = 3;
        gyh = new int[] { gye, gyf, gyg };
        GMTrace.o(4582730104832L, 34144);
      }
    }
    
    public static final class b
    {
      public String eEs;
      public long gxY;
      public int gyi;
      public c gyj;
      
      public b()
      {
        GMTrace.i(4557362954240L, 33955);
        GMTrace.o(4557362954240L, 33955);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */