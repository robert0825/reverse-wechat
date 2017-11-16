package com.tencent.mm.ui.chatting.b;

import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.view.MenuItem;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.rg;
import com.tencent.mm.g.a.rh;
import com.tencent.mm.g.a.rh.b;
import com.tencent.mm.g.a.ri;
import com.tencent.mm.g.b.af;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.ar;
import com.tencent.mm.sdk.platformtools.ar.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.chatting.ChattingTranslateView.a;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.HashMap;

public final class u
{
  ar wJX;
  public HashMap<Long, ChattingTranslateView.a> wJY;
  public com.tencent.mm.sdk.b.c wJZ;
  public h wtd;
  
  public u(h paramh)
  {
    GMTrace.i(19075560374272L, 142124);
    this.wJX = new ar(5, "msg-translate-update-worker");
    this.wJY = new HashMap();
    this.wJZ = new com.tencent.mm.sdk.b.c() {};
    this.wtd = paramh;
    GMTrace.o(19075560374272L, 142124);
  }
  
  public final void a(long paramLong, ChattingTranslateView.a parama)
  {
    GMTrace.i(19075694592000L, 142125);
    this.wJY.put(Long.valueOf(paramLong), parama);
    GMTrace.o(19075694592000L, 142125);
  }
  
  public final ChattingTranslateView.a aV(au paramau)
  {
    GMTrace.i(19075828809728L, 142126);
    ChattingTranslateView.a locala = (ChattingTranslateView.a)this.wJY.get(Long.valueOf(paramau.field_msgId));
    Object localObject = locala;
    if (locala == null)
    {
      if (!paramau.bTN()) {
        break label67;
      }
      if (!paramau.bTS()) {
        break label60;
      }
      localObject = ChattingTranslateView.a.wBM;
    }
    for (;;)
    {
      GMTrace.o(19075828809728L, 142126);
      return (ChattingTranslateView.a)localObject;
      label60:
      localObject = ChattingTranslateView.a.wBK;
      continue;
      label67:
      localObject = new rh();
      ((rh)localObject).eWi.id = paramau.field_msgId;
      a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      if (((rh)localObject).eWj.eWk)
      {
        localObject = ChattingTranslateView.a.wBL;
        a(paramau.field_msgId, (ChattingTranslateView.a)localObject);
      }
      else
      {
        localObject = ChattingTranslateView.a.wBK;
      }
    }
  }
  
  public final void aW(au paramau)
  {
    GMTrace.i(19075963027456L, 142127);
    if (paramau.bTN())
    {
      if (paramau.bTS())
      {
        if (paramau.bTN()) {
          paramau.dM(paramau.fwu & 0xFFFFFFEF);
        }
        a(paramau.field_msgId, ChattingTranslateView.a.wBK);
        com.tencent.mm.modelstat.b.gWv.a(paramau, false);
      }
      for (;;)
      {
        at.AR();
        com.tencent.mm.y.c.yM().a(paramau.field_msgId, paramau);
        this.wtd.bZV();
        GMTrace.o(19075963027456L, 142127);
        return;
        paramau.bTT();
        a(paramau.field_msgId, ChattingTranslateView.a.wBM);
        com.tencent.mm.modelstat.b.gWv.a(paramau, true);
      }
    }
    if (aV(paramau) == ChattingTranslateView.a.wBL)
    {
      GMTrace.o(19075963027456L, 142127);
      return;
    }
    rg localrg = new rg();
    localrg.eWf.eWh = false;
    localrg.eWf.id = paramau.field_msgId;
    localrg.eWf.eWg = paramau.field_content;
    if ((!this.wtd.ccT()) || (paramau.field_isSend == 1)) {}
    for (localrg.eWf.type = 0;; localrg.eWf.type = 1)
    {
      localrg.eWf.aEe = this.wtd.ccY().field_username;
      a.vgX.m(localrg);
      a(paramau.field_msgId, ChattingTranslateView.a.wBL);
      break;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\b\u.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */