package com.tencent.mm.plugin.base.stub;

import android.content.Context;
import android.database.Cursor;
import android.database.MatrixCursor;
import android.net.Uri;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.sdk.platformtools.w;
import java.util.HashMap;
import java.util.Map;

public final class c
  extends MMPluginProvider.a
{
  private static final Map<String, Object> jjb;
  
  static
  {
    GMTrace.i(12838462554112L, 95654);
    HashMap localHashMap = new HashMap();
    jjb = localHashMap;
    localHashMap.put("_build_info_sdk_int_", Integer.valueOf(620822528));
    jjb.put("_build_info_sdk_name_", "android 5.1.0");
    jjb.put("_wxapp_pay_entry_classname_", "com.tencent.mm.plugin.base.stub.WXPayEntryActivity");
    GMTrace.o(12838462554112L, 95654);
  }
  
  public c()
  {
    GMTrace.i(12837657247744L, 95648);
    GMTrace.o(12837657247744L, 95648);
  }
  
  public static Cursor a(String[] paramArrayOfString1, String[] paramArrayOfString2)
  {
    GMTrace.i(12838328336384L, 95653);
    paramArrayOfString2 = paramArrayOfString2[0];
    Object localObject = jjb.get(paramArrayOfString2);
    if (localObject == null)
    {
      w.w("MicroMsg.MMPluginProviderSharedPrefImpl", "not found value for key: " + paramArrayOfString2);
      GMTrace.o(12838328336384L, 95653);
      return null;
    }
    int i;
    MatrixCursor localMatrixCursor;
    if (localObject == null)
    {
      w.e("MicroMsg.SDK.PluginProvider.Resolver", "unresolve failed, null value");
      i = 0;
      localMatrixCursor = new MatrixCursor(paramArrayOfString1);
      if (localObject != null) {
        break label241;
      }
    }
    label241:
    for (paramArrayOfString1 = null;; paramArrayOfString1 = localObject.toString())
    {
      localMatrixCursor.addRow(new Object[] { Integer.valueOf(0), paramArrayOfString2, Integer.valueOf(i), paramArrayOfString1 });
      GMTrace.o(12838328336384L, 95653);
      return localMatrixCursor;
      if ((localObject instanceof Integer))
      {
        i = 1;
        break;
      }
      if ((localObject instanceof Long))
      {
        i = 2;
        break;
      }
      if ((localObject instanceof String))
      {
        i = 3;
        break;
      }
      if ((localObject instanceof Boolean))
      {
        i = 4;
        break;
      }
      if ((localObject instanceof Float))
      {
        i = 5;
        break;
      }
      if ((localObject instanceof Double))
      {
        i = 6;
        break;
      }
      w.e("MicroMsg.SDK.PluginProvider.Resolver", "unresolve failed, unknown type=" + localObject.getClass().toString());
      i = 0;
      break;
    }
  }
  
  public static Uri agI()
  {
    GMTrace.i(12837925683200L, 95650);
    GMTrace.o(12837925683200L, 95650);
    return null;
  }
  
  public static int agJ()
  {
    GMTrace.i(12838059900928L, 95651);
    GMTrace.o(12838059900928L, 95651);
    return 0;
  }
  
  public static int agK()
  {
    GMTrace.i(12838194118656L, 95652);
    GMTrace.o(12838194118656L, 95652);
    return 0;
  }
  
  public final boolean bZ(Context paramContext)
  {
    GMTrace.i(12837791465472L, 95649);
    super.bZ(paramContext);
    GMTrace.o(12837791465472L, 95649);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\base\stub\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */