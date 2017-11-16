package com.tencent.mm.plugin.wenote.a;

import android.content.Context;
import android.os.Bundle;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bf.a;
import com.tencent.mm.g.a.km;
import com.tencent.mm.g.a.km.a;
import com.tencent.mm.plugin.wenote.model.f;
import com.tencent.mm.plugin.wenote.model.g.1;
import com.tencent.mm.plugin.wenote.model.h;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c.1;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import org.json.JSONException;

public final class b
  extends com.tencent.mm.sdk.b.c<km>
{
  public b()
  {
    GMTrace.i(5664390774784L, 42203);
    this.vhf = km.class.getName().hashCode();
    GMTrace.o(5664390774784L, 42203);
  }
  
  private static boolean a(km paramkm)
  {
    GMTrace.i(5664524992512L, 42204);
    Object localObject;
    com.tencent.mm.plugin.wenote.model.g localg;
    Context localContext;
    tt localtt;
    boolean bool;
    long l;
    switch (paramkm.eOE.type)
    {
    case 1: 
    case 4: 
    case 5: 
    case 6: 
    default: 
    case 0: 
    case 2: 
      for (;;)
      {
        GMTrace.o(5664524992512L, 42204);
        return false;
        com.tencent.mm.plugin.wenote.model.b.bGM().sbA.b(paramkm);
        continue;
        if (paramkm.eOE.eOL == 4) {
          break;
        }
        com.tencent.mm.plugin.report.service.g.ork.i(14789, new Object[] { Integer.valueOf(1) });
        w.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_FAV");
        localObject = new com.tencent.mm.plugin.wenote.model.g();
        com.tencent.mm.plugin.wenote.model.b.bGM().sbA = ((com.tencent.mm.plugin.wenote.model.c)localObject);
        if ((paramkm.eOE.field_favProto != null) && (paramkm.eOE.field_favProto.ulz != null)) {
          ((com.tencent.mm.plugin.wenote.model.g)localObject).sca = paramkm.eOE.field_favProto.ulz.eDi;
        }
        if (paramkm.eOE.eOJ != null) {
          ((com.tencent.mm.plugin.wenote.model.g)localObject).scb = paramkm.eOE.eOJ.getLong("edittime", 0L);
        }
        ((com.tencent.mm.plugin.wenote.model.g)localObject).a(paramkm.eOE.field_localId, paramkm.eOE.context, Boolean.valueOf(paramkm.eOE.eON), 0, 0);
      }
      com.tencent.mm.plugin.report.service.g.ork.i(14789, new Object[] { Integer.valueOf(4) });
      w.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_SNS");
      localg = new com.tencent.mm.plugin.wenote.model.g();
      com.tencent.mm.plugin.wenote.model.b.bGM().sbA = localg;
      localContext = paramkm.eOE.context;
      localtt = paramkm.eOE.field_favProto;
      Bundle localBundle = paramkm.eOE.eOJ;
      bool = paramkm.eOE.eON;
      if (localBundle != null)
      {
        localObject = localBundle.getString("noteauthor", "");
        paramkm = localBundle.getString("noteeditor", "");
        l = localBundle.getLong("edittime", 0L);
        localg.sbT = localBundle.getString("snslocalid");
        localg.sbU = localBundle.getString("notexml", "");
        localg.scc = localBundle.getString("snsthumbpath", "");
        localg.scd = localBundle.getString("snsnotelinkxml", "");
      }
      break;
    }
    for (;;)
    {
      localg.eOS = System.currentTimeMillis();
      localg.eON = bool;
      localg.sbL = false;
      localg.sbZ = ((String)localObject + ";" + paramkm + ";" + l);
      localg.L(localContext, 4);
      at.xB().A(new g.1(localg, localtt));
      break;
      w.i("MicroMsg.NotifyWNNoteOperationListener", "do OPEN_NOTE_FROM_ADD");
      localObject = new com.tencent.mm.plugin.wenote.model.g();
      ((com.tencent.mm.plugin.wenote.model.g)localObject).eOS = paramkm.eOE.field_localId;
      com.tencent.mm.plugin.wenote.model.b.bGM().sbA = ((com.tencent.mm.plugin.wenote.model.c)localObject);
      paramkm = paramkm.eOE.context;
      ((com.tencent.mm.plugin.wenote.model.g)localObject).sbL = true;
      if (!com.tencent.mm.pluginsdk.model.c.tmH) {
        break;
      }
      ((com.tencent.mm.plugin.wenote.model.g)localObject).L(paramkm, 2);
      break;
      paramkm.eOF.path = a.Oq();
      break;
      switch (paramkm.eOE.eOK)
      {
      default: 
        break;
      case 2: 
        h.aa(paramkm.eOE.eOM);
        break;
      case 4: 
        h.k(paramkm.eOE.context, paramkm.eOE.path, paramkm.eOE.eOL);
        break;
      case 5: 
        h.NC(paramkm.eOE.path);
        break;
      case 3: 
        try
        {
          h.ND(paramkm.eOE.eOH);
        }
        catch (JSONException paramkm)
        {
          w.printErrStackTrace("MicroMsg.NotifyWNNoteOperationListener", paramkm, "", new Object[0]);
        }
        break;
        h.aJ(paramkm.eOE.context, paramkm.eOE.path);
        break;
        f.s(paramkm.eOE.field_localId, paramkm.eOE.path);
        break;
        f.Z(paramkm.eOE.eOM);
        break;
        paramkm = com.tencent.mm.plugin.wenote.model.nativenote.manager.c.bHo();
        at.xB().h(new c.1(paramkm), 700L);
        break;
        paramkm = "";
        localObject = "";
        l = 0L;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */