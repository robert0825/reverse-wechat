package com.tencent.mm.plugin.card.model;

import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.List;

public final class l
  extends i<k>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(18907117125632L, 140869);
    fTX = new String[] { i.a(k.fTp, "CardQrCodeDataInfo") };
    GMTrace.o(18907117125632L, 140869);
  }
  
  public l(e parame)
  {
    super(parame, k.fTp, "CardQrCodeDataInfo", k.eZt);
    GMTrace.i(18906311819264L, 140863);
    this.fTZ = parame;
    GMTrace.o(18906311819264L, 140863);
  }
  
  public final boolean bA(String paramString1, String paramString2)
  {
    GMTrace.i(18906848690176L, 140867);
    k localk = new k();
    localk.field_card_id = paramString1;
    localk.field_code_id = paramString2;
    boolean bool = a(localk, new String[] { "card_id", "code_id" });
    if (!bool) {
      w.e("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData  failure! card_id = %s, code_id = %s", new Object[] { localk.field_card_id, localk.field_code_id });
    }
    for (;;)
    {
      GMTrace.o(18906848690176L, 140867);
      return bool;
      w.i("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData  success! card_id = %s, code_id = %s", new Object[] { localk.field_card_id, localk.field_code_id });
    }
  }
  
  public final boolean hB(String paramString)
  {
    GMTrace.i(18906982907904L, 140868);
    k localk = new k();
    localk.field_card_id = paramString;
    boolean bool = a(localk, new String[] { "card_id" });
    if (!bool) {
      w.e("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData by cardId  failure! card_id = %s", new Object[] { paramString });
    }
    for (;;)
    {
      GMTrace.o(18906982907904L, 140868);
      return bool;
      w.i("MicroMsg.CardQrCodeDataInfoStorage", "delete qrCodeData by cardId  success! card_id = %s", new Object[] { paramString });
    }
  }
  
  public final List<k> tW(String paramString)
  {
    GMTrace.i(18906446036992L, 140864);
    ArrayList localArrayList = new ArrayList();
    paramString = this.fTZ.rawQuery("select * from CardQrCodeDataInfo where card_id =? AND status=0", new String[] { paramString });
    for (;;)
    {
      if (paramString != null) {}
      try
      {
        if (paramString.moveToNext())
        {
          k localk = new k();
          localk.b(paramString);
          localArrayList.add(localk);
          continue;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.CardQrCodeDataInfoStorage", "getCardQrcodeByCardId error!", new Object[] { localException.getMessage() });
        if (paramString != null) {
          paramString.close();
        }
        for (;;)
        {
          GMTrace.o(18906446036992L, 140864);
          return localArrayList;
          if (paramString != null) {
            paramString.close();
          }
        }
      }
      finally
      {
        if (paramString != null) {
          paramString.close();
        }
      }
    }
  }
  
  public final k tX(String paramString)
  {
    GMTrace.i(18906580254720L, 140865);
    localCursor = this.fTZ.rawQuery("select * from CardQrCodeDataInfo where card_id =? AND status=0  limit 1", new String[] { paramString });
    if (localCursor != null) {}
    for (;;)
    {
      try
      {
        if (localCursor.getCount() > 0)
        {
          localCursor.moveToPosition(0);
          localObject1 = new k();
        }
      }
      catch (Exception localException1)
      {
        Object localObject1;
        paramString = null;
        w.e("MicroMsg.CardQrCodeDataInfoStorage", "getOneCardQrcodeByCardId error!", new Object[] { localException1.getMessage() });
        localObject2 = paramString;
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
        localObject2 = paramString;
        continue;
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
      try
      {
        ((k)localObject1).b(localCursor);
        w.i("MicroMsg.CardQrCodeDataInfoStorage", "getOneCardQrcodeByCardId  success! card_id = %s, code_id = %s ", new Object[] { paramString, ((k)localObject1).field_code_id });
        paramString = (String)localObject1;
        localObject1 = paramString;
        if (localCursor != null)
        {
          localCursor.close();
          localObject1 = paramString;
        }
        GMTrace.o(18906580254720L, 140865);
        return (k)localObject1;
      }
      catch (Exception localException2)
      {
        paramString = (String)localObject2;
        localObject2 = localException2;
        continue;
      }
      w.e("MicroMsg.CardQrCodeDataInfoStorage", "getOneCardQrcodeByCardId  is empty! card_id = %s", new Object[] { paramString });
      paramString = null;
    }
  }
  
  public final k tY(String paramString)
  {
    GMTrace.i(18906714472448L, 140866);
    localCursor = this.fTZ.rawQuery("select * from CardQrCodeDataInfo where card_id =? AND status=1  limit 1", new String[] { paramString });
    if (localCursor != null) {}
    for (;;)
    {
      try
      {
        if (localCursor.getCount() > 0)
        {
          localCursor.moveToPosition(0);
          localObject1 = new k();
        }
      }
      catch (Exception localException1)
      {
        Object localObject1;
        paramString = null;
        w.e("MicroMsg.CardQrCodeDataInfoStorage", "getCardQrcodeShowingByCardId error!", new Object[] { localException1.getMessage() });
        localObject2 = paramString;
        if (localCursor == null) {
          continue;
        }
        localCursor.close();
        localObject2 = paramString;
        continue;
      }
      finally
      {
        if (localCursor != null) {
          localCursor.close();
        }
      }
      try
      {
        ((k)localObject1).b(localCursor);
        w.i("MicroMsg.CardQrCodeDataInfoStorage", "getCardQrcodeShowingByCardId  success! card_id = %s, code_id = %s ", new Object[] { paramString, ((k)localObject1).field_code_id });
        paramString = (String)localObject1;
        localObject1 = paramString;
        if (localCursor != null)
        {
          localCursor.close();
          localObject1 = paramString;
        }
        GMTrace.o(18906714472448L, 140866);
        return (k)localObject1;
      }
      catch (Exception localException2)
      {
        paramString = (String)localObject2;
        localObject2 = localException2;
        continue;
      }
      w.e("MicroMsg.CardQrCodeDataInfoStorage", "getCardQrcodeShowingByCardId  is empty! card_id = %s", new Object[] { paramString });
      paramString = null;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\model\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */