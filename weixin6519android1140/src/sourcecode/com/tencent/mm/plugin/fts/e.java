package com.tencent.mm.plugin.fts;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;

public final class e
  implements com.tencent.mm.plugin.fts.a.h
{
  public e()
  {
    GMTrace.i(18511711698944L, 137923);
    GMTrace.o(18511711698944L, 137923);
  }
  
  public final Cursor g(String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(18511845916672L, 137924);
    com.tencent.mm.kernel.h.xz();
    paramString = com.tencent.mm.kernel.h.xy().fYW.a(paramString, paramArrayOfString, 2);
    GMTrace.o(18511845916672L, 137924);
    return paramString;
  }
  
  public final Cursor rawQuery(String paramString, String[] paramArrayOfString)
  {
    GMTrace.i(18511980134400L, 137925);
    com.tencent.mm.kernel.h.xz();
    paramString = com.tencent.mm.kernel.h.xy().fYW.a(paramString, paramArrayOfString, 0);
    GMTrace.o(18511980134400L, 137925);
    return paramString;
  }
  
  public final x yM(String paramString)
  {
    GMTrace.i(18512114352128L, 137926);
    x localx2 = ((com.tencent.mm.plugin.messenger.foundation.a.h)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.foundation.a.h.class)).yK().Tz(paramString);
    x localx1 = localx2;
    if (localx2 == null)
    {
      localx1 = new x();
      com.tencent.mm.kernel.h.xz();
      paramString = com.tencent.mm.kernel.h.xy().fYW.a("SELECT ROWID, username, alias, conRemark, nickname, verifyFlag, type, lvbuff, contactLabelIds FROM rcontact WHERE username = ? AND deleteFlag=0;", new String[] { paramString }, 2);
      if (paramString.moveToNext())
      {
        localx1.fTq = paramString.getLong(0);
        localx1.setUsername(paramString.getString(1));
        localx1.ci(paramString.getString(2));
        localx1.cj(paramString.getString(3));
        localx1.cl(paramString.getString(4));
        localx1.dk(paramString.getInt(5));
        localx1.setType(paramString.getInt(6));
        localx1.u(paramString.getBlob(7));
        localx1.cs(paramString.getString(8));
        localx1.dm(0);
      }
      paramString.close();
    }
    GMTrace.o(18512114352128L, 137926);
    return localx1;
  }
  
  public final boolean yN(String paramString)
  {
    GMTrace.i(18512248569856L, 137927);
    String str = String.format("SELECT 1 FROM rconversation WHERE username = ?", new Object[0]);
    com.tencent.mm.kernel.h.xz();
    paramString = com.tencent.mm.kernel.h.xy().fYW.a(str, new String[] { paramString }, 2);
    try
    {
      boolean bool = paramString.moveToNext();
      if (paramString != null) {
        paramString.close();
      }
      GMTrace.o(18512248569856L, 137927);
      return bool;
    }
    finally
    {
      if (paramString != null) {
        paramString.close();
      }
    }
  }
  
  public final long yO(String paramString)
  {
    GMTrace.i(18512382787584L, 137928);
    com.tencent.mm.kernel.h.xz();
    paramString = com.tencent.mm.kernel.h.xy().fYW.a("SELECT conversationTime FROM rconversation WHERE username=?;", new String[] { paramString }, 2);
    long l2 = 0L;
    long l1 = l2;
    if (paramString != null)
    {
      l1 = l2;
      if (paramString.moveToFirst()) {
        l1 = paramString.getLong(0);
      }
    }
    if (paramString != null) {
      paramString.close();
    }
    GMTrace.o(18512382787584L, 137928);
    return l1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\fts\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */