package com.tencent.mm.plugin.hp.b;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.os.Build.VERSION;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.pluginsdk.i.p;
import com.tencent.mm.protocal.c.bjb;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class g
  implements com.tencent.mm.pluginsdk.b.a
{
  public g()
  {
    GMTrace.i(15366050807808L, 114486);
    GMTrace.o(15366050807808L, 114486);
  }
  
  public final boolean a(Context paramContext, final String[] paramArrayOfString)
  {
    GMTrace.i(15366185025536L, 114487);
    if (paramArrayOfString.length < 2)
    {
      w.d("MicroMsg.Tinker.TinkerBootsCommand", "no args input.");
      GMTrace.o(15366185025536L, 114487);
      return false;
    }
    paramContext = paramArrayOfString[1];
    int i;
    if (com.tencent.mm.sdk.a.b.bPq())
    {
      i = -1;
      switch (paramContext.hashCode())
      {
      }
    }
    for (;;)
    {
      switch (i)
      {
      default: 
        w.d("MicroMsg.Tinker.TinkerBootsCommand", "%s is not a debugger command.", new Object[] { paramContext });
        i = -1;
        switch (paramContext.hashCode())
        {
        default: 
          switch (i)
          {
          default: 
            w.d("MicroMsg.Tinker.TinkerBootsCommand", "%s is not a release command.", new Object[] { paramContext });
            GMTrace.o(15366185025536L, 114487);
            return false;
            if (paramContext.equals("update"))
            {
              i = 0;
              continue;
              if (paramContext.equals("show"))
              {
                i = 1;
                continue;
                if (paramContext.equals("diff"))
                {
                  i = 2;
                  continue;
                  if (paramContext.equals("down"))
                  {
                    i = 3;
                    continue;
                    if (paramContext.equals("nd"))
                    {
                      i = 4;
                      continue;
                      if (paramContext.equals("clear")) {
                        i = 5;
                      }
                    }
                  }
                }
              }
            }
            break;
          }
          break;
        }
        break;
      }
    }
    w.d("MicroMsg.Tinker.TinkerBootsCommand", "command checkout update.");
    Object localObject1 = new LinkedList();
    String str = "";
    if (paramArrayOfString.length >= 3) {}
    for (paramContext = paramArrayOfString[2];; paramContext = "tinker_id_d1ddc930233f0ec33f573e365038b6d979b6ebde")
    {
      if (paramArrayOfString.length >= 4) {
        str = paramArrayOfString[3];
      }
      Object localObject2;
      if (paramArrayOfString.length >= 5)
      {
        localObject2 = new bjb();
        ((bjb)localObject2).amf = "sdk";
        ((bjb)localObject2).value = paramArrayOfString[4];
        ((LinkedList)localObject1).add(localObject2);
      }
      for (;;)
      {
        paramArrayOfString = new StringBuilder();
        localObject2 = ((LinkedList)localObject1).iterator();
        while (((Iterator)localObject2).hasNext())
        {
          bjb localbjb = (bjb)((Iterator)localObject2).next();
          paramArrayOfString.append(localbjb.amf).append(":").append(localbjb.value).append("\n");
        }
        paramArrayOfString = new bjb();
        paramArrayOfString.amf = "sdk";
        paramArrayOfString.value = String.valueOf(Build.VERSION.SDK_INT);
        ((LinkedList)localObject1).add(paramArrayOfString);
      }
      w.d("MicroMsg.Tinker.TinkerBootsCommand", "BaseID:%s PatchID:%s %s", new Object[] { paramContext, str, paramArrayOfString.toString() });
      paramContext = new com.tencent.mm.plugin.hp.c.a(paramContext, str, (List)localObject1);
      at.wS().a(paramContext, 0);
      GMTrace.o(15366185025536L, 114487);
      return true;
      i.a(ab.getContext().getString(R.l.dxo), ab.getContext().getString(R.l.dxo), ab.getContext().getString(R.l.dDf), new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(15369137815552L, 114509);
          Toast.makeText(ab.getContext(), "OK", 0).show();
          GMTrace.o(15369137815552L, 114509);
        }
      }, ab.getContext().getString(R.l.eff), null);
      GMTrace.o(15366185025536L, 114487);
      return true;
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18995700826112L, 141529);
          Object localObject2 = com.tencent.mm.compatible.util.e.ghz + "/Download/2017-07-28_19-43-39.apk";
          Object localObject3 = com.tencent.mm.compatible.util.e.ghz + "/Download/39-50-diff.apk";
          Object localObject4 = com.tencent.mm.compatible.util.e.ghz + "/Download/new_50.apk";
          String str = "ab099f75f740be5d88e178d662a36779";
          Object localObject1 = localObject2;
          if (paramArrayOfString.length >= 3)
          {
            localObject1 = localObject2;
            if (!bg.nm(paramArrayOfString[2])) {
              localObject1 = paramArrayOfString[2];
            }
          }
          localObject2 = localObject3;
          if (paramArrayOfString.length >= 4)
          {
            localObject2 = localObject3;
            if (!bg.nm(paramArrayOfString[3])) {
              localObject2 = paramArrayOfString[3];
            }
          }
          localObject3 = localObject4;
          if (paramArrayOfString.length >= 5)
          {
            localObject3 = localObject4;
            if (!bg.nm(paramArrayOfString[4])) {
              localObject3 = paramArrayOfString[4];
            }
          }
          localObject4 = str;
          if (paramArrayOfString.length >= 6)
          {
            localObject4 = str;
            if (!bg.nm(paramArrayOfString[5])) {
              localObject4 = paramArrayOfString[5];
            }
          }
          int i;
          if (!com.tencent.mm.a.e.aZ((String)localObject3))
          {
            long l = System.currentTimeMillis();
            i = com.tencent.mm.plugin.hp.a.b.b((String)localObject1, (String)localObject2, (String)localObject3, (String)localObject4);
            w.i("MicroMsg.Tinker.TinkerBootsCommand", "merge apk use :%d retCode：%d", new Object[] { Long.valueOf((System.currentTimeMillis() - l) / 1000L), Integer.valueOf(i) });
          }
          for (;;)
          {
            if (i == 0)
            {
              w.i("MicroMsg.Tinker.TinkerBootsCommand", "show dialog for install");
              w.i("MicroMsg.Tinker.TinkerBootsCommand", "New Apk md5:%s", new Object[] { com.tencent.mm.a.g.bg((String)localObject3) });
              p.aT(ab.getContext(), (String)localObject3);
              w.i("MicroMsg.Tinker.TinkerBootsCommand", "md5 is equal.");
              GMTrace.o(18995700826112L, 141529);
              return;
            }
            w.i("MicroMsg.Tinker.TinkerBootsCommand", "merge apk failed.");
            GMTrace.o(18995700826112L, 141529);
            return;
            i = 0;
          }
        }
      });
      GMTrace.o(15366185025536L, 114487);
      return true;
      localObject1 = "";
      str = "";
      paramContext = "";
      if (paramArrayOfString.length >= 5)
      {
        localObject1 = paramArrayOfString[2];
        str = paramArrayOfString[3];
        paramContext = paramArrayOfString[4];
      }
      com.tencent.mm.sdk.f.e.post(new com.tencent.mm.plugin.hp.d.a((String)localObject1, str, paramContext), "hp_apply_download_test");
      GMTrace.o(15366185025536L, 114487);
      return true;
      if (paramArrayOfString.length >= 6) {
        bg.Sz(paramArrayOfString[5]);
      }
      GMTrace.o(15366185025536L, 114487);
      return true;
      com.tencent.mm.plugin.hp.tinker.g.af(ab.getContext(), "");
      com.tencent.mm.plugin.hp.tinker.g.bU(ab.getContext(), "");
      com.tencent.mm.plugin.hp.tinker.g.aq(ab.getContext(), 0);
      p.bJU();
      GMTrace.o(15366185025536L, 114487);
      return true;
      if (!paramContext.equals("check")) {
        break;
      }
      i = 0;
      break;
      try
      {
        com.tinkerboots.sdk.a.csM().nj(true);
        GMTrace.o(15366185025536L, 114487);
        return true;
      }
      catch (Exception paramContext)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.Tinker.TinkerBootsCommand", paramContext, "", new Object[0]);
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\hp\b\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */