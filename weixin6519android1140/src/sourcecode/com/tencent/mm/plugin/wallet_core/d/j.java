package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.ae;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class j
  extends i<ae>
{
  public static final String[] fTX;
  public e fTZ;
  private List<Object> gEV;
  
  static
  {
    GMTrace.i(6915031564288L, 51521);
    fTX = new String[] { i.a(ae.fTp, "WalletUserInfo") };
    GMTrace.o(6915031564288L, 51521);
  }
  
  public j(e parame)
  {
    super(parame, ae.fTp, "WalletUserInfo", null);
    GMTrace.i(6914226257920L, 51515);
    this.gEV = new LinkedList();
    this.fTZ = parame;
    GMTrace.o(6914226257920L, 51515);
  }
  
  public final boolean a(ae paramae)
  {
    GMTrace.i(6914494693376L, 51517);
    if (super.b(paramae))
    {
      paramae = this.gEV.iterator();
      while (paramae.hasNext()) {
        paramae.next();
      }
      GMTrace.o(6914494693376L, 51517);
      return true;
    }
    GMTrace.o(6914494693376L, 51517);
    return false;
  }
  
  public final ae bzr()
  {
    GMTrace.i(6914360475648L, 51516);
    ae localae = new ae();
    Cursor localCursor = this.fTZ.a("select * from WalletUserInfo", null, 2);
    localae.field_is_reg = -1;
    if (localCursor == null)
    {
      GMTrace.o(6914360475648L, 51516);
      return localae;
    }
    if (localCursor.moveToNext()) {
      localae.b(localCursor);
    }
    localCursor.close();
    GMTrace.o(6914360475648L, 51516);
    return localae;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\d\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */