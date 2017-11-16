package com.tencent.mm.plugin.nfc_open.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.k;
import com.tencent.mm.g.a.k.a;
import com.tencent.mm.plugin.nfc.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public final class a
  extends com.tencent.mm.sdk.b.c<k>
{
  public a()
  {
    GMTrace.i(12477819518976L, 92967);
    this.vhf = k.class.getName().hashCode();
    GMTrace.o(12477819518976L, 92967);
  }
  
  private static boolean a(k paramk)
  {
    GMTrace.i(12477953736704L, 92968);
    if (!(paramk instanceof k))
    {
      GMTrace.o(12477953736704L, 92968);
      return false;
    }
    if (paramk.eAh == null)
    {
      GMTrace.o(12477953736704L, 92968);
      return false;
    }
    int i = paramk.eAh.actionCode;
    Object localObject1 = paramk.eAh.context;
    Bundle localBundle = new Bundle();
    switch (i)
    {
    }
    boolean bool1;
    boolean bool2;
    for (;;)
    {
      paramk.eAi.eAm = localBundle;
      GMTrace.o(12477953736704L, 92968);
      return false;
      localBundle.putString("id", com.tencent.mm.plugin.nfc.c.a.byteArrayToHexString(com.tencent.mm.plugin.nfc.b.a.a.aUe().nxj));
      continue;
      localBundle.putString("info", com.tencent.mm.plugin.nfc.b.a.a.aUe().getInfo());
      continue;
      localBundle.putInt("status", com.tencent.mm.plugin.nfc.b.a.a.aUe().cU((Context)localObject1));
      continue;
      localBundle.putInt("status", com.tencent.mm.plugin.nfc.b.a.a.aUe().cV((Context)localObject1));
      continue;
      localObject1 = paramk.eAh.eAj;
      if (bg.nm((String)localObject1))
      {
        w.e("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu is null");
      }
      else
      {
        try
        {
          localObject1 = new com.tencent.mm.plugin.nfc.a.a((String)localObject1);
          localBundle.putString("result", com.tencent.mm.plugin.nfc.b.a.a.aUe().a((com.tencent.mm.plugin.nfc.a.a)localObject1).toString());
        }
        catch (Exception localException1)
        {
          w.e("MicroMsg.ApduEngineFuncListener", "alex: exec nfc command exception");
          w.printErrStackTrace("MicroMsg.ApduEngineFuncListener", localException1, "", new Object[0]);
          localBundle.putString("result", null);
        }
        continue;
        try
        {
          String str = paramk.eAh.eAj;
          bool1 = paramk.eAh.eAk;
          bool2 = paramk.eAh.eAl;
          if (!bg.nm(str)) {
            break;
          }
          w.e("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu is null");
        }
        catch (Exception localException2)
        {
          w.e("MicroMsg.ApduEngineFuncListener", "alex: exec nfc command exception");
          w.printErrStackTrace("MicroMsg.ApduEngineFuncListener", localException2, "", new Object[0]);
          localBundle.putString("result", null);
        }
      }
    }
    Object localObject3 = localException2.split("\\|");
    Object localObject2 = new ArrayList();
    int j = localObject3.length;
    i = 0;
    for (;;)
    {
      Object localObject4;
      if (i < j)
      {
        localObject4 = localObject3[i];
        if (bg.nm((String)localObject4))
        {
          w.w("MicroMsg.ApduEngineFuncListener", "[NFC] batch transceive apduStr is null");
        }
        else
        {
          localObject4 = ((String)localObject4).split(":");
          if ((localObject4 == null) || (localObject4.length < 2))
          {
            w.w("MicroMsg.ApduEngineFuncListener", "[NFC] transceive apdu's size is wrong");
          }
          else
          {
            int k = bg.getInt(localObject4[0], 0);
            ((List)localObject2).add(new com.tencent.mm.plugin.nfc.b.a(k, String.valueOf(k), new com.tencent.mm.plugin.nfc.a.a(localObject4[1])));
          }
        }
      }
      else
      {
        com.tencent.mm.plugin.nfc.b.a.a.aUe().a((List)localObject2, bool1, bool2);
        localObject3 = new StringBuilder();
        localObject2 = ((List)localObject2).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          localObject4 = (com.tencent.mm.plugin.nfc.b.a)((Iterator)localObject2).next();
          if (((com.tencent.mm.plugin.nfc.b.a)localObject4).nxh == null) {
            break;
          }
          ((StringBuilder)localObject3).append(((com.tencent.mm.plugin.nfc.b.a)localObject4).id);
          ((StringBuilder)localObject3).append(":");
          ((StringBuilder)localObject3).append(((com.tencent.mm.plugin.nfc.b.a)localObject4).nxh.toString());
          ((StringBuilder)localObject3).append("|");
        }
        localBundle.putString("result", ((StringBuilder)localObject3).toString());
        break;
      }
      i += 1;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc_open\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */