package com.tencent.mm.plugin.nfc_open;

import android.content.ComponentName;
import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageManager;
import android.nfc.NfcAdapter;
import android.os.Process;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.n;
import com.tencent.mm.bu.g.d;
import com.tencent.mm.compatible.d.p;
import com.tencent.mm.kernel.h;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.aql;
import com.tencent.mm.sdk.f.e;
import com.tencent.mm.sdk.platformtools.MultiProcessSharedPreferences;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.y.aq;
import com.tencent.mm.y.at;
import com.tencent.mm.y.br;
import com.tencent.mm.y.c;
import java.util.HashMap;

public final class a
  implements aq
{
  private com.tencent.mm.plugin.nfc_open.b.a nxu;
  
  public a()
  {
    GMTrace.i(12482248704000L, 93000);
    GMTrace.o(12482248704000L, 93000);
  }
  
  private static a aUg()
  {
    GMTrace.i(12482382921728L, 93001);
    a locala2 = (a)at.AK().gZ("plugin.nfc_open");
    a locala1 = locala2;
    if (locala2 == null)
    {
      w.w("MicroMsg.SubCoreCpuCard", "[NFC]not found in MMCore, new one");
      locala1 = new a();
      at.AK().a("plugin.nfc_open", locala1);
    }
    GMTrace.o(12482382921728L, 93001);
    return locala1;
  }
  
  private static void gt(boolean paramBoolean)
  {
    GMTrace.i(12483054010368L, 93006);
    if (paramBoolean)
    {
      ab.getContext().getPackageManager().setComponentEnabledSetting(new ComponentName(ab.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 1, 1);
      GMTrace.o(12483054010368L, 93006);
      return;
    }
    ab.getContext().getPackageManager().setComponentEnabledSetting(new ComponentName(ab.getPackageName(), "com.tencent.mm.plugin.nfc_open.ui.NfcWebViewUI"), 2, 1);
    GMTrace.o(12483054010368L, 93006);
  }
  
  public final void aX(boolean paramBoolean)
  {
    int i = 1800;
    GMTrace.i(12482919792640L, 93005);
    w.i("MicroMsg.SubCoreCpuCard", "alvinluo process: %s", new Object[] { bg.r(ab.getContext(), Process.myPid()) });
    h.xw().wG();
    if (aUg().nxu == null) {
      aUg().nxu = new com.tencent.mm.plugin.nfc_open.b.a();
    }
    com.tencent.mm.plugin.nfc_open.b.a locala = aUg().nxu;
    if (NfcAdapter.getDefaultAdapter(ab.getContext()) == null) {
      w.i("MicroMsg.CpuCardConfigManager", "Nfc not support no need update");
    }
    label89:
    label193:
    while (locala.nxw == null)
    {
      i = 0;
      if (i != 0)
      {
        w.i("MicroMsg.CpuCardConfigManager", "do update cpu card config");
        at.wS().a(1561, locala);
        at.wS().a(new com.tencent.mm.plugin.nfc_open.a.b(locala.nxw.version), 0);
      }
      at.AR();
      i = ((Integer)c.xh().get(w.a.vrN, Integer.valueOf(0))).intValue();
      if (i != 0) {
        break label361;
      }
      at.AR();
      if (((Integer)c.xh().get(w.a.vrO, Integer.valueOf(0))).intValue() != 1) {
        break;
      }
      gt(true);
      w.i("MicroMsg.SubCoreCpuCard", "doNFCReport start");
      e.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(12478356389888L, 92971);
          Object localObject = MultiProcessSharedPreferences.getSharedPreferences(ab.getContext(), "system_config_prefs", 4);
          int k;
          int i;
          if (bg.aI(((SharedPreferences)localObject).getLong("NFC_REPORT_TIME", 0L)) > 86400000L)
          {
            k = com.tencent.mm.plugin.nfc.b.a.a.aUe().cV(ab.getContext());
            if (k != 0) {
              break label181;
            }
            i = 0;
            if (!com.tencent.mm.plugin.hce.a.b.aHj()) {
              break label186;
            }
          }
          label181:
          label186:
          for (int j = 1;; j = 0)
          {
            w.i("MicroMsg.SubCoreCpuCard", "alvinluo NFC report isSupportNFC: %d, isSupportHCE: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(j) });
            g.ork.i(12779, new Object[] { p.sZ(), Integer.valueOf(i), Integer.valueOf(j) });
            localObject = ((SharedPreferences)localObject).edit();
            ((SharedPreferences.Editor)localObject).putLong("NFC_REPORT_TIME", bg.Pw());
            ((SharedPreferences.Editor)localObject).commit();
            w.i("MicroMsg.SubCoreCpuCard", "doNFCReport status = " + k);
            GMTrace.o(12478356389888L, 92971);
            return;
            i = 1;
            break;
          }
        }
      }, getClass().getName());
      GMTrace.o(12482919792640L, 93005);
      return;
    }
    int j = locala.nxw.ufi;
    if (j < 1800) {}
    for (;;)
    {
      w.i("MicroMsg.CpuCardConfigManager", "now=" + bg.Pu() + ", lastUpdateTime=" + locala.nxw.lastUpdateTime + ", updateFreq=" + i + ", configUpdateFreq=" + locala.nxw.ufi);
      if (bg.Pu() - locala.nxw.lastUpdateTime <= i) {
        break;
      }
      i = 1;
      break label89;
      if (j > 604800)
      {
        i = 604800;
        continue;
        gt(false);
        break label193;
        label361:
        if (i == 1)
        {
          gt(true);
          break label193;
        }
        gt(false);
        break label193;
      }
      i = j;
    }
  }
  
  public final void aY(boolean paramBoolean)
  {
    GMTrace.i(12482785574912L, 93004);
    GMTrace.o(12482785574912L, 93004);
  }
  
  public final void eI(int paramInt)
  {
    GMTrace.i(12482651357184L, 93003);
    GMTrace.o(12482651357184L, 93003);
  }
  
  public final void onAccountRelease()
  {
    GMTrace.i(12483188228096L, 93007);
    GMTrace.o(12483188228096L, 93007);
  }
  
  public final HashMap<Integer, g.d> vH()
  {
    GMTrace.i(12482517139456L, 93002);
    GMTrace.o(12482517139456L, 93002);
    return null;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\nfc_open\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */