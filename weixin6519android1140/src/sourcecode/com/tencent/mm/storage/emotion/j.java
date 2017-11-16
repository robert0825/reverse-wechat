package com.tencent.mm.storage.emotion;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class j
  extends com.tencent.mm.sdk.e.i<i>
  implements f.a
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(1547798839296L, 11532);
    fTX = new String[] { com.tencent.mm.sdk.e.i.a(i.fTp, "EmotionDetailInfo") };
    GMTrace.o(1547798839296L, 11532);
  }
  
  public j(e parame)
  {
    super(parame, i.fTp, "EmotionDetailInfo", null);
    GMTrace.i(1547261968384L, 11528);
    this.fTZ = parame;
    GMTrace.o(1547261968384L, 11528);
  }
  
  public final i UP(String paramString)
  {
    Object localObject2 = null;
    GMTrace.i(1547664621568L, 11531);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.emoji.EmotionDetailInfoStorage", "getEmotionDetailRespnseByPID failed. productID is null.");
      GMTrace.o(1547664621568L, 11531);
      return null;
    }
    Cursor localCursor = this.fTZ.a("EmotionDetailInfo", new String[] { "content", "lan" }, "productID=?", new String[] { paramString }, null, null, null, 2);
    Object localObject1 = localObject2;
    if (localCursor != null)
    {
      localObject1 = localObject2;
      if (localCursor.moveToFirst())
      {
        localObject1 = new i();
        ((i)localObject1).field_content = localCursor.getBlob(0);
        ((i)localObject1).field_lan = localCursor.getString(1);
        ((i)localObject1).field_productID = paramString;
      }
    }
    if (localCursor != null) {
      localCursor.close();
    }
    GMTrace.o(1547664621568L, 11531);
    return (i)localObject1;
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(1547530403840L, 11530);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(1547530403840L, 11530);
    return 0;
  }
  
  public final String getTableName()
  {
    GMTrace.i(1547396186112L, 11529);
    GMTrace.o(1547396186112L, 11529);
    return "EmotionDetailInfo";
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */