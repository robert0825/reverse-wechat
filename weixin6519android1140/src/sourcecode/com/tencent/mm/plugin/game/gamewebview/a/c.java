package com.tencent.mm.plugin.game.gamewebview.a;

import android.content.Context;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.plugin.game.model.ah.a;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.protocal.c.vg;
import com.tencent.mm.protocal.d;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.v;

public final class c
{
  public static void z(Context paramContext, int paramInt)
  {
    GMTrace.i(16938545709056L, 126202);
    paramContext = ah.a.h(12909, new Object[] { Integer.valueOf(5), Integer.valueOf(5), Integer.valueOf(1), Integer.valueOf(6), Integer.valueOf(0), null, Integer.valueOf(paramInt), Integer.valueOf(0), null, Integer.valueOf(bg.getInt(null, 0)), Integer.valueOf(ai.getNetworkType(paramContext)), null });
    b.a locala = new b.a();
    locala.uri = "/cgi-bin/micromsg-bin/gamereportkv";
    locala.gtE = 427;
    locala.gtH = 0;
    locala.gtI = 0;
    vg localvg = new vg();
    localvg.tWD = d.tJw;
    localvg.tWE = d.tJv;
    localvg.tWF = d.tJy;
    localvg.tWG = d.tJz;
    localvg.tWH = v.bPK();
    localvg.oqP = paramContext.gXq;
    localvg.tWI = paramContext.lOu;
    locala.gtF = localvg;
    GMTrace.o(16938545709056L, 126202);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\gamewebview\a\c.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */