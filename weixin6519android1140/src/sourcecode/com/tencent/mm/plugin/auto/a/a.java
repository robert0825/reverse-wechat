package com.tencent.mm.plugin.auto.a;

import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.support.v4.app.ag;
import android.support.v4.app.ag.a;
import android.support.v4.app.y.f;
import android.support.v4.app.y.f.a;
import android.support.v4.app.y.f.a.a;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.si;
import com.tencent.mm.g.a.si.b;
import com.tencent.mm.g.a.w.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.k.f;
import com.tencent.mm.kernel.h;
import com.tencent.mm.pluginsdk.c.d;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.x;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.util.List;

public final class a
{
  com.tencent.mm.sdk.b.c iUR;
  
  public a()
  {
    GMTrace.i(5210063765504L, 38818);
    this.iUR = new com.tencent.mm.sdk.b.c()
    {
      private static boolean a(com.tencent.mm.g.a.w paramAnonymousw)
      {
        GMTrace.i(5209795330048L, 38816);
        if ((paramAnonymousw instanceof com.tencent.mm.g.a.w)) {}
        try
        {
          w.a locala = paramAnonymousw.eAT;
          localObject1 = paramAnonymousw.eAT.username;
          paramAnonymousw = paramAnonymousw.eAT.title;
          if (a.adY()) {
            break label62;
          }
          paramAnonymousw = null;
          locala.eAU = paramAnonymousw;
        }
        catch (Throwable paramAnonymousw)
        {
          for (;;)
          {
            Object localObject1;
            Object localObject3;
            Object localObject4;
            Object localObject5;
            int i;
            Object localObject6;
            com.tencent.mm.sdk.platformtools.w.printErrStackTrace("MicroMsg.auto.AutoLogic", paramAnonymousw, "", new Object[0]);
            continue;
            continue;
            Object localObject2 = null;
            continue;
            localObject2 = paramAnonymousw;
            continue;
            i -= 1;
            continue;
            paramAnonymousw = null;
          }
        }
        GMTrace.o(5209795330048L, 38816);
        return false;
        label62:
        localObject2 = new Intent().addFlags(32).setAction("com.tencent.mm.permission.MM_AUTO_HEARD_MESSAGE").putExtra("key_username", (String)localObject1);
        localObject2 = PendingIntent.getBroadcast(ab.getContext(), ((String)localObject1).hashCode(), (Intent)localObject2, 134217728);
        localObject3 = new Intent().addFlags(32).setAction("com.tencent.mm.permission.MM_AUTO_REPLY_MESSAGE").putExtra("key_username", (String)localObject1);
        localObject4 = PendingIntent.getBroadcast(ab.getContext(), ((String)localObject1).hashCode(), (Intent)localObject3, 134217728);
        localObject3 = new ag.a("key_voice_reply_text");
        ((ag.a)localObject3).sr = ab.getContext().getString(R.l.cUm);
        localObject5 = new ag(((ag.a)localObject3).sq, ((ag.a)localObject3).sr, ((ag.a)localObject3).ss, ((ag.a)localObject3).st, ((ag.a)localObject3).mExtras);
        localObject3 = new y.f.a.a(paramAnonymousw);
        ((y.f.a.a)localObject3).rI = ((PendingIntent)localObject2);
        ((y.f.a.a)localObject3).rG = ((ag)localObject5);
        ((y.f.a.a)localObject3).rH = ((PendingIntent)localObject4);
        int j = f.dZ((String)localObject1);
        i = j;
        if (j > 10) {
          i = 10;
        }
        at.AR();
        localObject4 = com.tencent.mm.y.c.yM().bj((String)localObject1, i);
        i = ((List)localObject4).size() - 1;
        if (i >= 0)
        {
          localObject5 = (au)((List)localObject4).get(i);
          if (!s.eb(((ce)localObject5).field_talker)) {
            break label1667;
          }
          paramAnonymousw = ((ce)localObject5).field_talker;
          j = bc.gO(((ce)localObject5).field_content);
          localObject1 = paramAnonymousw;
          if (j != -1)
          {
            localObject2 = ((ce)localObject5).field_content.substring(0, j).trim();
            localObject1 = paramAnonymousw;
            if (localObject2 != null)
            {
              localObject1 = paramAnonymousw;
              if (((String)localObject2).length() > 0) {
                localObject1 = localObject2;
              }
            }
          }
          at.AR();
          localObject6 = com.tencent.mm.y.c.yK().TE((String)localObject1);
          localObject2 = r.a((x)localObject6, (String)localObject1);
          paramAnonymousw = (com.tencent.mm.g.a.w)localObject2;
          if (!s.eb((String)localObject1)) {
            break label1673;
          }
          if (!((af)localObject6).field_username.equals(localObject2))
          {
            paramAnonymousw = (com.tencent.mm.g.a.w)localObject2;
            if (!bg.nm((String)localObject2)) {
              break label1673;
            }
          }
          paramAnonymousw = ab.getContext().getString(R.l.dhh);
          break label1673;
          if (((au)localObject5).bTC()) {
            paramAnonymousw = ab.getContext().getString(R.l.dMq);
          }
          for (;;)
          {
            label462:
            localObject1 = paramAnonymousw;
            if (paramAnonymousw == null) {
              localObject1 = ab.getContext().getString(R.l.dMJ);
            }
            paramAnonymousw = (com.tencent.mm.g.a.w)localObject1;
            if (localObject2 != null) {
              paramAnonymousw = String.format("%s: %s", new Object[] { localObject2, localObject1 });
            }
            ((y.f.a.a)localObject3).rM.add(paramAnonymousw);
            if (i != 0) {
              break label1679;
            }
            ((y.f.a.a)localObject3).rK = ((ce)localObject5).field_createTime;
            break label1679;
            if (((au)localObject5).bTF())
            {
              if ((s.eb(((ce)localObject5).field_talker)) && (((ce)localObject5).field_isSend != 1))
              {
                j = bc.gO(((ce)localObject5).field_content);
                if (j != -1) {
                  paramAnonymousw = ((ce)localObject5).field_content.substring(j + 1).trim();
                } else {
                  paramAnonymousw = ((ce)localObject5).field_content;
                }
              }
              else
              {
                paramAnonymousw = ((ce)localObject5).field_content;
              }
            }
            else if (((au)localObject5).bTu())
            {
              paramAnonymousw = ab.getContext().getString(R.l.dMM);
            }
            else if (((au)localObject5).bTG())
            {
              paramAnonymousw = ab.getContext().getString(R.l.dML);
            }
            else if (((au)localObject5).bTH())
            {
              paramAnonymousw = ab.getContext().getString(R.l.dMI);
            }
            else
            {
              if (((au)localObject5).aCp())
              {
                paramAnonymousw = f.a.eS(((ce)localObject5).field_content);
                if (paramAnonymousw == null) {
                  break label1686;
                }
              }
              switch (paramAnonymousw.type)
              {
              case 5: 
                paramAnonymousw = String.format(ab.getContext().getString(R.l.dMb), new Object[] { bg.aq(paramAnonymousw.title, "") });
                break;
              case 3: 
                paramAnonymousw = String.format(ab.getContext().getString(R.l.dMe), new Object[] { bg.aq(paramAnonymousw.title, "") });
                break;
              case 6: 
                paramAnonymousw = String.format(ab.getContext().getString(R.l.dMa), new Object[] { bg.aq(paramAnonymousw.title, "") });
                break;
              case 4: 
                paramAnonymousw = String.format(ab.getContext().getString(R.l.dMi), new Object[] { bg.aq(paramAnonymousw.title, "") });
                break;
              case 2: 
                paramAnonymousw = String.format(ab.getContext().getString(R.l.dMq), new Object[0]);
                break;
              case 19: 
                paramAnonymousw = String.format(ab.getContext().getString(R.l.dMg), new Object[] { bg.aq(paramAnonymousw.title, "") });
                break;
              case 24: 
                paramAnonymousw = ab.getContext().getString(R.l.dvk);
                break;
              case 15: 
                paramAnonymousw = String.format(ab.getContext().getString(R.l.dLZ), new Object[] { bg.aq(paramAnonymousw.title, "") });
                break;
              case 10: 
                paramAnonymousw = String.format(ab.getContext().getString(R.l.dMf), new Object[] { bg.aq(paramAnonymousw.title, "") });
                break;
              case 13: 
                paramAnonymousw = String.format(ab.getContext().getString(R.l.dMd), new Object[] { bg.aq(paramAnonymousw.title, "") });
                break;
              case 20: 
                paramAnonymousw = String.format(ab.getContext().getString(R.l.dMh), new Object[] { bg.aq(paramAnonymousw.title, "") });
                break;
              case 16: 
                paramAnonymousw = String.format(ab.getContext().getString(R.l.dMl), new Object[] { bg.aq(paramAnonymousw.title, "") });
                break;
              case 8: 
                paramAnonymousw = String.format(ab.getContext().getString(R.l.dMm), new Object[] { bg.aq(paramAnonymousw.title, "") });
                continue;
                if (((au)localObject5).bTI())
                {
                  paramAnonymousw = ab.getContext().getString(R.l.dMn);
                  localObject1 = ((com.tencent.mm.plugin.emoji.b.c)h.j(com.tencent.mm.plugin.emoji.b.c.class)).getEmojiMgr();
                  if (localObject1 == null) {
                    break label1664;
                  }
                  paramAnonymousw = ((d)localObject1).vP(((ce)localObject5).field_imgPath);
                  if ((paramAnonymousw == null) || (bg.nm(((d)localObject1).vM(paramAnonymousw.GS())))) {
                    paramAnonymousw = ab.getContext().getString(R.l.dMn);
                  } else {
                    paramAnonymousw = "[" + ((d)localObject1).vM(paramAnonymousw.GS()) + "]";
                  }
                }
                else if (((au)localObject5).bTE())
                {
                  paramAnonymousw = ab.getContext().getString(R.l.dMr);
                }
                else
                {
                  if ((!((au)localObject5).bTy()) && (!((au)localObject5).bTz())) {
                    break label1467;
                  }
                  if (!((ce)localObject5).field_content.equals(au.vBl))
                  {
                    paramAnonymousw = ((ce)localObject5).field_content;
                    localObject1 = new si();
                    ((si)localObject1).eXf.eHJ = 1;
                    ((si)localObject1).eXf.content = paramAnonymousw;
                    com.tencent.mm.sdk.b.a.vgX.m((b)localObject1);
                    if (((si)localObject1).eXg.type != 3) {
                      break label1698;
                    }
                    j = 1;
                    break label1691;
                  }
                  paramAnonymousw = ab.getContext().getString(R.l.dMO);
                }
                break;
              }
            }
          }
        }
        label1467:
        label1664:
        label1667:
        label1673:
        label1679:
        label1686:
        label1691:
        label1698:
        label1701:
        for (;;)
        {
          paramAnonymousw = ab.getContext().getString(R.l.dMN);
          break label462;
          if (((au)localObject5).bTD())
          {
            at.AR();
            paramAnonymousw = com.tencent.mm.y.c.yM().Cn(((ce)localObject5).field_content);
            paramAnonymousw = String.format(ab.getContext().getString(R.l.dMl), new Object[] { paramAnonymousw.getDisplayName() });
            break label462;
          }
          if (((ce)localObject5).field_type == -1879048186)
          {
            paramAnonymousw = ab.getContext().getString(R.l.dMc);
            break label462;
            paramAnonymousw = new y.f();
            localObject1 = (String[])((y.f.a.a)localObject3).rM.toArray(new String[((y.f.a.a)localObject3).rM.size()]);
            localObject2 = ((y.f.a.a)localObject3).rN;
            localObject4 = ((y.f.a.a)localObject3).rG;
            localObject5 = ((y.f.a.a)localObject3).rH;
            localObject6 = ((y.f.a.a)localObject3).rI;
            long l = ((y.f.a.a)localObject3).rK;
            paramAnonymousw.rE = new y.f.a((String[])localObject1, (ag)localObject4, (PendingIntent)localObject5, (PendingIntent)localObject6, new String[] { localObject2 }, l);
            break;
          }
          for (;;)
          {
            if (j == 0) {
              break label1701;
            }
            break;
            j = 0;
          }
        }
      }
    };
    GMTrace.o(5210063765504L, 38818);
  }
  
  static boolean adY()
  {
    GMTrace.i(5210197983232L, 38819);
    PackageManager localPackageManager = ab.getContext().getPackageManager();
    try
    {
      localPackageManager.getPackageInfo("com.google.android.projection.gearhead", 1);
      bool = true;
    }
    catch (PackageManager.NameNotFoundException localNameNotFoundException)
    {
      for (;;)
      {
        boolean bool = false;
      }
    }
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.auto.AutoLogic", "isInstallAutoApp %b", new Object[] { Boolean.valueOf(bool) });
    GMTrace.o(5210197983232L, 38819);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\auto\a\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */