package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.w;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.ArrayList;

public final class f
  extends i<w>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(6912884080640L, 51505);
    fTX = new String[] { i.a(w.fTp, "WalletKindInfo") };
    GMTrace.o(6912884080640L, 51505);
  }
  
  public f(e parame)
  {
    super(parame, w.fTp, "WalletKindInfo", null);
    GMTrace.i(6912615645184L, 51503);
    this.fTZ = parame;
    GMTrace.o(6912615645184L, 51503);
  }
  
  public final ArrayList<w> bzq()
  {
    ArrayList localArrayList = null;
    GMTrace.i(6912749862912L, 51504);
    Cursor localCursor = this.fTZ.a("select * from WalletKindInfo", null, 2);
    if (localCursor == null)
    {
      GMTrace.o(6912749862912L, 51504);
      return null;
    }
    if (localCursor.moveToFirst())
    {
      localArrayList = new ArrayList();
      do
      {
        w localw = new w();
        localw.b(localCursor);
        localArrayList.add(localw);
      } while (localCursor.moveToNext());
    }
    localCursor.close();
    GMTrace.o(6912749862912L, 51504);
    return localArrayList;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\d\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */