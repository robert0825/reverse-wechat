package com.tencent.mm.plugin.wallet_core.d;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.wallet_core.model.ab;
import com.tencent.mm.protocal.c.ass;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.platformtools.w;

public final class i
  extends com.tencent.mm.sdk.e.i<ab>
{
  public static final String[] fTX;
  private e fTZ;
  
  static
  {
    GMTrace.i(6913420951552L, 51509);
    fTX = new String[] { com.tencent.mm.sdk.e.i.a(ab.fTp, "WalletRegionGreyAreaList") };
    GMTrace.o(6913420951552L, 51509);
  }
  
  public i(e parame)
  {
    super(parame, ab.fTp, "WalletRegionGreyAreaList", null);
    GMTrace.i(6913018298368L, 51506);
    this.fTZ = parame;
    GMTrace.o(6913018298368L, 51506);
  }
  
  public final void a(int paramInt, ass paramass)
  {
    GMTrace.i(6913152516096L, 51507);
    ab localab = new ab();
    localab.field_wallet_region = paramInt;
    try
    {
      localab.field_wallet_grey_item_buf = paramass.toByteArray();
      super.a(localab);
      GMTrace.o(6913152516096L, 51507);
      return;
    }
    catch (Exception paramass)
    {
      for (;;)
      {
        w.e("MicroMsg.WalletRegionGreyItemStg", "setWalletRegionGreyItem error " + paramass.getMessage());
      }
    }
  }
  
  public final ab wS(int paramInt)
  {
    GMTrace.i(6913286733824L, 51508);
    Object localObject = "select * from WalletRegionGreyAreaList where wallet_region = " + paramInt;
    Cursor localCursor = this.fTZ.a((String)localObject, null, 2);
    w.i("MicroMsg.WalletRegionGreyItemStg", "getWalletRegionGreyItem " + (String)localObject);
    if (localCursor == null)
    {
      localObject = new ab();
      GMTrace.o(6913286733824L, 51508);
      return (ab)localObject;
    }
    localObject = new ab();
    if (localCursor.moveToNext())
    {
      localObject = new ab();
      ((ab)localObject).b(localCursor);
    }
    w.i("MicroMsg.WalletRegionGreyItemStg", "get grey item ");
    localCursor.close();
    GMTrace.o(6913286733824L, 51508);
    return (ab)localObject;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\wallet_core\d\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */