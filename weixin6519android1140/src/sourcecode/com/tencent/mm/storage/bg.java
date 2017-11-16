package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.f;
import com.tencent.mm.bu.f.a;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;

public final class bg
  extends i<bf>
  implements f.a
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(1569676328960L, 11695);
    fTX = new String[] { i.a(bf.fTp, "VoiceTransText") };
    GMTrace.o(1569676328960L, 11695);
  }
  
  public bg(e parame)
  {
    this(parame, bf.fTp, "VoiceTransText");
    GMTrace.i(1569005240320L, 11690);
    GMTrace.o(1569005240320L, 11690);
  }
  
  private bg(e parame, c.a parama, String paramString)
  {
    super(parame, parama, paramString, null);
    GMTrace.i(1569139458048L, 11691);
    this.fTZ = parame;
    GMTrace.o(1569139458048L, 11691);
  }
  
  public final bf UE(String paramString)
  {
    GMTrace.i(14589735469056L, 108702);
    if (com.tencent.mm.sdk.platformtools.bg.nm(paramString))
    {
      GMTrace.o(14589735469056L, 108702);
      return null;
    }
    bf localbf = new bf();
    paramString = this.fTZ.a("VoiceTransText", null, "cmsgId=?", new String[] { paramString }, null, null, null, 2);
    if (paramString.moveToFirst()) {
      localbf.b(paramString);
    }
    paramString.close();
    GMTrace.o(14589735469056L, 108702);
    return localbf;
  }
  
  public final int a(f paramf)
  {
    GMTrace.i(1569273675776L, 11692);
    if (paramf != null) {
      this.fTZ = paramf;
    }
    GMTrace.o(1569273675776L, 11692);
    return 0;
  }
  
  public final boolean a(bf parambf)
  {
    GMTrace.i(1569407893504L, 11693);
    if (parambf == null)
    {
      GMTrace.o(1569407893504L, 11693);
      return false;
    }
    parambf = parambf.qL();
    if (this.fTZ.replace("VoiceTransText", "msgId", parambf) >= 0L)
    {
      GMTrace.o(1569407893504L, 11693);
      return true;
    }
    GMTrace.o(1569407893504L, 11693);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\bg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */