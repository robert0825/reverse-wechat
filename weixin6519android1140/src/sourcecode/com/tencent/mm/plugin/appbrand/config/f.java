package com.tencent.mm.plugin.appbrand.config;

import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bu.g;
import com.tencent.mm.plugin.appbrand.app.e;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.af;
import java.util.Locale;

public final class f
{
  public f()
  {
    GMTrace.i(16341411037184L, 121753);
    GMTrace.o(16341411037184L, 121753);
  }
  
  public final af Uz()
  {
    GMTrace.i(16341545254912L, 121754);
    af local1 = new af()
    {
      public final boolean fq(int paramAnonymousInt)
      {
        GMTrace.i(16341142601728L, 121751);
        if ((paramAnonymousInt >= 637863936) && (paramAnonymousInt <= 637863988))
        {
          GMTrace.o(16341142601728L, 121751);
          return true;
        }
        GMTrace.o(16341142601728L, 121751);
        return false;
      }
      
      public final String getTag()
      {
        GMTrace.i(16341276819456L, 121752);
        GMTrace.o(16341276819456L, 121752);
        return "MicroMsg.AppBrandNewContactFixVersionStateTransfer";
      }
      
      public final void transfer(int paramAnonymousInt)
      {
        GMTrace.i(16341008384000L, 121750);
        if (!fq(paramAnonymousInt))
        {
          GMTrace.o(16341008384000L, 121750);
          return;
        }
        try
        {
          w.d("MicroMsg.AppBrandNewContactFixVersionStateTransfer", "doFix()");
          Object localObject = e.Sa();
          if (localObject != null)
          {
            localObject = ((e)localObject).Sb();
            e.Se();
            ((g)localObject).eZ("WxaAttributesTable", String.format(Locale.US, "update %s set %s='' where %s is null or %s=''", new Object[] { "WxaAttributesTable", "syncVersion", "versionInfo", "versionInfo" }));
            GMTrace.o(16341008384000L, 121750);
            return;
          }
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.AppBrandNewContactFixVersionStateTransfer", "doFix e = %s", new Object[] { localException });
          GMTrace.o(16341008384000L, 121750);
        }
      }
    };
    GMTrace.o(16341545254912L, 121754);
    return local1;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\config\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */