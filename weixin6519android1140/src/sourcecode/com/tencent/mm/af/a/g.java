package com.tencent.mm.af.a;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.b.v;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class g
  extends i<v>
{
  public static final String[] fTX;
  private e fTZ;
  private final k<a, g.a.b> gvy;
  
  static
  {
    GMTrace.i(4563671187456L, 34002);
    fTX = new String[] { i.a(f.fTp, "BizChatMyUserInfo") };
    GMTrace.o(4563671187456L, 34002);
  }
  
  public g(e parame)
  {
    super(parame, f.fTp, "BizChatMyUserInfo", null);
    GMTrace.i(4562865881088L, 33996);
    this.gvy = new k() {};
    this.fTZ = parame;
    parame.eZ("BizChatMyUserInfo", "CREATE INDEX IF NOT EXISTS bizChatbrandUserNameIndex ON BizChatMyUserInfo ( brandUserName )");
    GMTrace.o(4562865881088L, 33996);
  }
  
  public final boolean a(f paramf)
  {
    GMTrace.i(4563268534272L, 33999);
    w.d("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage insert");
    boolean bool = super.b(paramf);
    if (bool)
    {
      g.a.b localb = new g.a.b();
      localb.eEs = paramf.field_brandUserName;
      localb.gyv = g.a.a.gyr;
      localb.gyw = paramf;
      this.gvy.bI(localb);
      this.gvy.doNotify();
    }
    for (;;)
    {
      GMTrace.o(4563268534272L, 33999);
      return bool;
      w.w("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage insert fail");
    }
  }
  
  public final boolean b(f paramf)
  {
    GMTrace.i(4563402752000L, 34000);
    w.d("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage update");
    if (paramf == null)
    {
      w.w("MicroMsg.BizChatMyUserInfoStorage", "update wrong argument");
      GMTrace.o(4563402752000L, 34000);
      return false;
    }
    boolean bool = super.a(paramf);
    if (bool)
    {
      g.a.b localb = new g.a.b();
      localb.eEs = paramf.field_brandUserName;
      localb.gyv = g.a.a.gyt;
      localb.gyw = paramf;
      this.gvy.bI(localb);
      this.gvy.doNotify();
    }
    for (;;)
    {
      GMTrace.o(4563402752000L, 34000);
      return bool;
      w.w("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage update fail");
    }
  }
  
  public final int getCount()
  {
    int i = 0;
    GMTrace.i(4563536969728L, 34001);
    w.d("MicroMsg.BizChatMyUserInfoStorage", "BizChatMyUserInfoStorage getCount");
    Cursor localCursor = this.fTZ.a("SELECT COUNT(*) FROM BizChatMyUserInfo", null, 2);
    if (localCursor.moveToFirst()) {
      i = localCursor.getInt(0);
    }
    localCursor.close();
    GMTrace.o(4563536969728L, 34001);
    return i;
  }
  
  public final f jn(String paramString)
  {
    GMTrace.i(4563000098816L, 33997);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.BizChatMyUserInfoStorage", "get： wrong argument");
      GMTrace.o(4563000098816L, 33997);
      return null;
    }
    f localf = new f();
    localf.field_brandUserName = paramString;
    super.b(localf, new String[0]);
    GMTrace.o(4563000098816L, 33997);
    return localf;
  }
  
  public final boolean jo(String paramString)
  {
    GMTrace.i(4563134316544L, 33998);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.BizChatMyUserInfoStorage", "delete wrong argument");
      GMTrace.o(4563134316544L, 33998);
      return false;
    }
    f localf = new f();
    localf.field_brandUserName = paramString;
    boolean bool = super.a(localf, new String[] { "brandUserName" });
    if (bool)
    {
      paramString = new g.a.b();
      paramString.eEs = localf.field_brandUserName;
      paramString.gyv = g.a.a.gys;
      paramString.gyw = localf;
      this.gvy.bI(paramString);
      this.gvy.doNotify();
    }
    GMTrace.o(4563134316544L, 33998);
    return bool;
  }
  
  public static abstract interface a
  {
    public static enum a
    {
      static
      {
        GMTrace.i(4579374661632L, 34119);
        gyr = 1;
        gys = 2;
        gyt = 3;
        gyu = new int[] { gyr, gys, gyt };
        GMTrace.o(4579374661632L, 34119);
      }
    }
    
    public static final class b
    {
      public String eEs;
      public int gyv;
      public f gyw;
      
      public b()
      {
        GMTrace.i(4582461669376L, 34142);
        GMTrace.o(4582461669376L, 34142);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\af\a\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */