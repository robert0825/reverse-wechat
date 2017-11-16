package com.tencent.mm.storage.emotion;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.protocal.c.aae;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.IOException;

public final class l
  extends i<k>
  implements f.a
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(1548335710208L, 11536);
    fTX = new String[] { i.a(k.fTp, "EmotionRewardInfo") };
    GMTrace.o(1548335710208L, 11536);
  }
  
  public l(e parame)
  {
    super(parame, k.fTp, "EmotionRewardInfo", null);
    GMTrace.i(1547933057024L, 11533);
    this.fTZ = parame;
    GMTrace.o(1547933057024L, 11533);
  }
  
  public final aae UQ(String paramString)
  {
    Object localObject = null;
    GMTrace.i(1548201492480L, 11535);
    if (bg.nm(paramString))
    {
      w.w("MicroMsg.emoji.EmotionRewardInfoStorage", "getEmotionRewardResponseByPID failed. productID is null.");
      GMTrace.o(1548201492480L, 11535);
      return null;
    }
    Cursor localCursor = this.fTZ.a("EmotionRewardInfo", new String[] { "content" }, "productID=?", new String[] { paramString }, null, null, null, 2);
    paramString = (String)localObject;
    if (localCursor != null)
    {
      paramString = (String)localObject;
      if (!localCursor.moveToFirst()) {}
    }
    try
    {
      paramString = new aae();
      paramString.aD(localCursor.getBlob(0));
      if (localCursor != null) {
        localCursor.close();
      }
      GMTrace.o(1548201492480L, 11535);
      return paramString;
    }
    catch (IOException paramString)
    {
      for (;;)
      {
        w.e("MicroMsg.emoji.EmotionRewardInfoStorage", "exception:%s", new Object[] { bg.f(paramString) });
        paramString = (String)localObject;
      }
    }
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(1548067274752L, 11534);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(1548067274752L, 11534);
    return 0;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\emotion\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */