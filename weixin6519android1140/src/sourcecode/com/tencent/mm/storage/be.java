package com.tencent.mm.storage;

import android.content.ContentValues;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.e.c.a;
import com.tencent.mm.sdk.e.e;
import com.tencent.mm.sdk.e.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;

public final class be
  extends i<bd>
{
  public static final String[] fTX;
  public e fTZ;
  
  static
  {
    GMTrace.i(1580682182656L, 11777);
    fTX = new String[] { i.a(bd.fTp, "UserOpenIdInApp") };
    GMTrace.o(1580682182656L, 11777);
  }
  
  public be(e parame)
  {
    super(parame, bd.fTp, "UserOpenIdInApp", null);
    GMTrace.i(1580145311744L, 11773);
    this.fTZ = parame;
    parame.eZ("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppAppIdUsernameIndex ON UserOpenIdInApp ( appId,username )");
    parame.eZ("UserOpenIdInApp", "CREATE INDEX IF NOT EXISTS userOpenIdInAppOpenIdIndex ON UserOpenIdInApp ( openId )");
    GMTrace.o(1580145311744L, 11773);
  }
  
  public final bd UC(String paramString)
  {
    GMTrace.i(1580279529472L, 11774);
    if ((paramString == null) || (paramString.length() <= 0))
    {
      GMTrace.o(1580279529472L, 11774);
      return null;
    }
    Cursor localCursor = this.fTZ.a("UserOpenIdInApp", null, "openId=?", new String[] { bg.nk(paramString) }, null, null, null, 2);
    if (!localCursor.moveToFirst())
    {
      w.w("MicroMsg.scanner.UserOpenIdInAppStorage", "get null with openId:" + paramString);
      localCursor.close();
      GMTrace.o(1580279529472L, 11774);
      return null;
    }
    paramString = new bd();
    paramString.b(localCursor);
    localCursor.close();
    GMTrace.o(1580279529472L, 11774);
    return paramString;
  }
  
  public final boolean a(bd parambd)
  {
    GMTrace.i(1580413747200L, 11775);
    if ((parambd == null) || (bg.nm(parambd.field_appId)) || (bg.nm(parambd.field_openId)) || (bg.nm(parambd.field_username)))
    {
      w.w("MicroMsg.scanner.UserOpenIdInAppStorage", "wrong argument");
      GMTrace.o(1580413747200L, 11775);
      return false;
    }
    ContentValues localContentValues = parambd.qL();
    if (this.fTZ.replace("UserOpenIdInApp", bd.fTp.vms, localContentValues) > 0L) {}
    for (boolean bool = true;; bool = false)
    {
      w.d("MicroMsg.scanner.UserOpenIdInAppStorage", "replace: appId=%s, username=%s, ret=%s ", new Object[] { parambd.field_appId, parambd.field_username, Boolean.valueOf(bool) });
      GMTrace.o(1580413747200L, 11775);
      return bool;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\storage\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */