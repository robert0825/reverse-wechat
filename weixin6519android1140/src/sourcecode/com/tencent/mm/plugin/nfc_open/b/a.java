package com.tencent.mm.plugin.nfc_open.b;

import android.content.ComponentName;
import android.content.Context;
import android.content.pm.PackageManager;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.protocal.c.aql;
import com.tencent.mm.protocal.c.jl;
import com.tencent.mm.protocal.c.nj;
import com.tencent.mm.protocal.c.og;
import com.tencent.mm.protocal.c.oh;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.LinkedList;

public final class a
  implements e
{
  public aql nxw;
  
  public a()
  {
    GMTrace.i(12478490607616L, 92972);
    init();
    GMTrace.o(12478490607616L, 92972);
  }
  
  private void a(aql paramaql)
  {
    GMTrace.i(12478759043072L, 92974);
    if (!at.AU())
    {
      w.i("MicroMsg.CpuCardConfigManager", "setConfig account not ready");
      GMTrace.o(12478759043072L, 92974);
      return;
    }
    if (paramaql != null)
    {
      w.i("MicroMsg.CpuCardConfigManager", "setConfig config");
      this.nxw = paramaql;
      try
      {
        paramaql = new String(this.nxw.toByteArray(), "ISO-8859-1");
        at.AR();
        c.xh().a(w.a.vrI, paramaql);
        GMTrace.o(12478759043072L, 92974);
        return;
      }
      catch (UnsupportedEncodingException paramaql)
      {
        w.w("MicroMsg.CpuCardConfigManager", "save config exp, " + paramaql.getLocalizedMessage());
        GMTrace.o(12478759043072L, 92974);
        return;
      }
      catch (IOException paramaql)
      {
        w.w("MicroMsg.CpuCardConfigManager", "save config exp, " + paramaql.getLocalizedMessage());
      }
    }
    GMTrace.o(12478759043072L, 92974);
  }
  
  private aql aUh()
  {
    GMTrace.i(12478893260800L, 92975);
    if (this.nxw == null) {
      init();
    }
    aql localaql = this.nxw;
    GMTrace.o(12478893260800L, 92975);
    return localaql;
  }
  
  private void init()
  {
    GMTrace.i(12478624825344L, 92973);
    this.nxw = new aql();
    at.AR();
    String str = String.valueOf(c.xh().get(w.a.vrI, null));
    if (bg.nm(str))
    {
      this.nxw.ufh = new LinkedList();
      this.nxw.lastUpdateTime = 0L;
      this.nxw.ufi = 86400;
      this.nxw.version = 0;
      GMTrace.o(12478624825344L, 92973);
      return;
    }
    try
    {
      this.nxw.aD(str.getBytes("ISO-8859-1"));
      GMTrace.o(12478624825344L, 92973);
      return;
    }
    catch (Exception localException)
    {
      w.w("MicroMsg.CpuCardConfigManager", "parseConfig exp, " + localException.getLocalizedMessage());
      this.nxw.ufh = new LinkedList();
      this.nxw.lastUpdateTime = 0L;
      this.nxw.ufi = 86400;
      this.nxw.version = 0;
      GMTrace.o(12478624825344L, 92973);
    }
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(12479027478528L, 92976);
    at.wS().b(1561, this);
    if ((paramk instanceof com.tencent.mm.plugin.nfc_open.a.b))
    {
      paramString = aUh();
      paramString.lastUpdateTime = bg.Pu();
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramk = (og)((com.tencent.mm.plugin.nfc_open.a.b)paramk).fUa.gtD.gtK;
        if (paramk != null)
        {
          paramString.ufi = paramk.ufi;
          paramString.ufj = paramk.ufj;
          at.AR();
          if (((Integer)c.xh().get(w.a.vrN, Integer.valueOf(0))).intValue() == 0)
          {
            if (paramk.ufj != 1) {
              break label237;
            }
            ab.getContext().getPackageManager().setComponentEnabledSetting(new ComponentName(ab.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
          }
          for (;;)
          {
            at.AR();
            c.xh().a(w.a.vrO, Integer.valueOf(paramk.ufj));
            at.AR();
            c.xh().a(w.a.vrR, paramk.rcG);
            if (paramString.version != paramk.version) {
              break;
            }
            w.i("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd no config change return version = " + paramk.version);
            a(paramString);
            GMTrace.o(12479027478528L, 92976);
            return;
            label237:
            ab.getContext().getPackageManager().setComponentEnabledSetting(new ComponentName(ab.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
          }
          paramString.version = paramk.version;
          if ((paramk.ufh != null) && (!paramk.ufh.isEmpty())) {
            if (paramString.ufh == null)
            {
              paramString.ufh = new LinkedList();
              paramInt1 = 0;
            }
          }
          for (;;)
          {
            if (paramInt1 < paramk.ufh.size())
            {
              jl localjl = new jl();
              localjl.tMl = ((jl)paramk.ufh.get(paramInt1)).tMl;
              localjl.tYW = ((jl)paramk.ufh.get(paramInt1)).tYW;
              w.d("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd sflag=" + bg.e(Integer.valueOf(localjl.tYW)) + ", url=" + bg.nl(localjl.tMl));
              if (localjl.tYV == null)
              {
                localjl.tYV = new LinkedList();
                label441:
                paramInt2 = 0;
              }
              for (;;)
              {
                if (paramInt2 >= ((jl)paramk.ufh.get(paramInt1)).tYV.size()) {
                  break label737;
                }
                oh localoh = new oh();
                if (localoh.ufk == null) {
                  localoh.ufk = new LinkedList();
                }
                for (;;)
                {
                  int i = 0;
                  while (i < ((oh)((jl)paramk.ufh.get(paramInt1)).tYV.get(paramInt2)).ufk.size())
                  {
                    nj localnj = new nj();
                    localnj.ueh = ((nj)((oh)((jl)paramk.ufh.get(paramInt1)).tYV.get(paramInt2)).ufk.get(i)).ueh;
                    localnj.mIY = ((nj)((oh)((jl)paramk.ufh.get(paramInt1)).tYV.get(paramInt2)).ufk.get(i)).mIY;
                    w.d("MicroMsg.CpuCardConfigManager", "nfc-onSceneEnd cmd=" + bg.nl(localnj.ueh) + ", answer=" + bg.nl(localnj.mIY));
                    localoh.ufk.add(localnj);
                    i += 1;
                  }
                  paramString.ufh.clear();
                  break;
                  localjl.tYV.clear();
                  break label441;
                  localoh.ufk.clear();
                }
                localjl.tYV.add(localoh);
                paramInt2 += 1;
              }
              label737:
              paramString.ufh.add(localjl);
              paramInt1 += 1;
              continue;
              paramString.ufh.clear();
            }
          }
        }
      }
      a(paramString);
    }
    GMTrace.o(12479027478528L, 92976);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc_open\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */