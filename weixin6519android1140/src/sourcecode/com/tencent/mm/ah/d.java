package com.tencent.mm.ah;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.x;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;

public final class d
  extends com.tencent.mm.y.af
{
  public d()
  {
    GMTrace.i(4497099194368L, 33506);
    GMTrace.o(4497099194368L, 33506);
  }
  
  public final boolean fq(int paramInt)
  {
    GMTrace.i(4497367629824L, 33508);
    if ((paramInt != 0) && (paramInt < 604176383))
    {
      GMTrace.o(4497367629824L, 33508);
      return true;
    }
    GMTrace.o(4497367629824L, 33508);
    return false;
  }
  
  public final String getTag()
  {
    GMTrace.i(4497501847552L, 33509);
    GMTrace.o(4497501847552L, 33509);
    return "MicroMsg.VerifyFlagDataTransfer";
  }
  
  public final void transfer(int paramInt)
  {
    GMTrace.i(4497233412096L, 33507);
    w.d("MicroMsg.VerifyFlagDataTransfer", "the previous version is %d", new Object[] { Integer.valueOf(paramInt) });
    if (!fq(paramInt))
    {
      w.w("MicroMsg.VerifyFlagDataTransfer", "do not need transfer");
      GMTrace.o(4497233412096L, 33507);
      return;
    }
    long l = System.currentTimeMillis();
    at.AR();
    if (bg.e((Integer)c.xh().get(86017, null)) == 3)
    {
      w.w("MicroMsg.VerifyFlagDataTransfer", "check old contact not exist");
      GMTrace.o(4497233412096L, 33507);
      return;
    }
    at.AR();
    c.yH().eZ("rcontact", "update rcontact set verifyflag=0 where verifyflag is null;");
    at.AR();
    Cursor localCursor = c.yK().b("@all.weixin.android", "", null);
    localCursor.moveToFirst();
    while (!localCursor.isAfterLast())
    {
      x localx = new x();
      localx.b(localCursor);
      at.AR();
      c.yK().c(localx.field_username, localx);
      localCursor.moveToNext();
    }
    localCursor.close();
    w.d("MicroMsg.VerifyFlagDataTransfer", "update verifyflag from the beginning to update finish use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    at.AR();
    c.xh().set(86017, Integer.valueOf(3));
    w.d("MicroMsg.VerifyFlagDataTransfer", "update verifyflag use time " + (System.currentTimeMillis() - l) + " ms");
    GMTrace.o(4497233412096L, 33507);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ah\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */