package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.sdk.platformtools.w;

public enum h
{
  static
  {
    GMTrace.i(10569914515456L, 78752);
    hRj = new h[0];
    GMTrace.o(10569914515456L, 78752);
  }
  
  public static int pl(String paramString)
  {
    GMTrace.i(10569780297728L, 78751);
    WxaAttributes localWxaAttributes = e.Se().e(paramString, new String[] { "dynamicInfo" });
    if (localWxaAttributes == null)
    {
      i = -1;
      w.i("MicroMsg.AppServiceSettingMMManager", "readAppFileStorageMaxSizeInBytes, appId = %s, MaxLocalstorageSize = %d", new Object[] { paramString, Integer.valueOf(i) });
      if (localWxaAttributes == null) {
        break label95;
      }
    }
    label95:
    for (int i = localWxaAttributes.UE().hRR.hRT;; i = 5)
    {
      GMTrace.o(10569780297728L, 78751);
      return i * 1048576;
      i = localWxaAttributes.UE().hRR.hRT;
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */