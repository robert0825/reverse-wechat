package com.tencent.mm.storage;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.messenger.foundation.a.a.g;
import com.tencent.mm.plugin.messenger.foundation.a.a.g.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.e.k;
import com.tencent.mm.sdk.platformtools.w;

public final class bc
  extends i<bb>
  implements g
{
  public static final String[] fTX;
  private e fTZ;
  private final k<g.a, bb> vBU;
  
  static
  {
    GMTrace.i(13203803209728L, 98376);
    fTX = new String[] { i.a(bb.fTp, "Stranger") };
    GMTrace.o(13203803209728L, 98376);
  }
  
  public bc(e parame)
  {
    super(parame, bb.fTp, "Stranger", null);
    GMTrace.i(13203132121088L, 98371);
    this.vBU = new k() {};
    this.fTZ = parame;
    GMTrace.o(13203132121088L, 98371);
  }
  
  private void b(bb parambb)
  {
    GMTrace.i(13202729467904L, 98368);
    if (this.vBU.bI(parambb)) {
      this.vBU.doNotify();
    }
    GMTrace.o(13202729467904L, 98368);
  }
  
  public final bb CC(String paramString)
  {
    GMTrace.i(13203266338816L, 98372);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(13203266338816L, 98372);
      return null;
    }
    bb localbb = new bb();
    paramString = this.fTZ.a("Stranger", null, "encryptUsername = ?", new String[] { paramString }, null, null, null, 2);
    if (paramString.moveToFirst()) {
      localbb.b(paramString);
    }
    paramString.close();
    GMTrace.o(13203266338816L, 98372);
    return localbb;
  }
  
  public final int CD(String paramString)
  {
    GMTrace.i(13203400556544L, 98373);
    int i = this.fTZ.delete("Stranger", "(encryptUsername=?)", new String[] { paramString });
    if (i > 0) {
      doNotify();
    }
    w.i("MicroMsg.StrangerStorage", "delByEncryptUsername:" + paramString + " result:" + i);
    GMTrace.o(13203400556544L, 98373);
    return i;
  }
  
  public final void a(g.a parama)
  {
    GMTrace.i(13202863685632L, 98369);
    this.vBU.a(parama, null);
    GMTrace.o(13202863685632L, 98369);
  }
  
  public final void b(g.a parama)
  {
    GMTrace.i(13202997903360L, 98370);
    this.vBU.remove(parama);
    GMTrace.o(13202997903360L, 98370);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\storage\bc.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */