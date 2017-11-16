package com.tencent.mm.pluginsdk.a;

import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.modelsimple.u;
import com.tencent.mm.modelsimple.u.a;
import com.tencent.mm.network.q;
import com.tencent.mm.protocal.c.anh;
import com.tencent.mm.protocal.c.ani;
import com.tencent.mm.protocal.c.bdz;
import com.tencent.mm.protocal.c.bhs;
import com.tencent.mm.protocal.c.bki;
import com.tencent.mm.protocal.c.du;
import com.tencent.mm.protocal.i.d;
import com.tencent.mm.protocal.i.e;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
{
  public static u.a a(u paramu)
  {
    GMTrace.i(839129235456L, 6252);
    Bundle localBundle = new Bundle();
    localBundle.putInt("kscene_type", 73);
    paramu = a(paramu, localBundle);
    GMTrace.o(839129235456L, 6252);
    return paramu;
  }
  
  private static u.a a(u paramu, Bundle paramBundle)
  {
    GMTrace.i(839263453184L, 6253);
    if (paramu == null)
    {
      GMTrace.o(839263453184L, 6253);
      return null;
    }
    if (((i.e)paramu.guL.AZ()).tKc.uVc == null)
    {
      GMTrace.o(839263453184L, 6253);
      return null;
    }
    Object localObject = ((i.e)paramu.guL.AZ()).tKc.uVc.tSl;
    if ((localObject != null) && (((bdz)localObject).uPQ != null) && (((bdz)localObject).uPQ.size() > 0))
    {
      u.a locala = new u.a();
      localObject = ((bdz)localObject).uPQ.iterator();
      while (((Iterator)localObject).hasNext())
      {
        bhs localbhs = (bhs)((Iterator)localObject).next();
        if (localbhs.oqG == 19) {
          locala.eEU = localbhs.uTC;
        } else if (localbhs.oqG == 20) {
          locala.gUJ = localbhs.uTC;
        } else if (localbhs.oqG == 21) {
          locala.eLQ = localbhs.uTC;
        }
      }
      locala.gUK = paramBundle;
      locala.type = 0;
      if (!bg.nm(locala.eEU))
      {
        locala.username = ((i.d)paramu.guL.DC()).tJZ.uCi.jhi;
        GMTrace.o(839263453184L, 6253);
        return locala;
      }
    }
    GMTrace.o(839263453184L, 6253);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\pluginsdk\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */