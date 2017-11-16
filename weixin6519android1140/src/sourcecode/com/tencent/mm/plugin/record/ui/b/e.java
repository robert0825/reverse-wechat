package com.tencent.mm.plugin.record.ui.b;

import android.content.Context;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.g.a.ft;
import com.tencent.mm.g.a.ft.b;
import com.tencent.mm.modelvoice.q;
import com.tencent.mm.plugin.record.a.c;
import com.tencent.mm.plugin.record.a.d;
import com.tencent.mm.plugin.record.a.r;
import com.tencent.mm.plugin.record.a.r.a;
import com.tencent.mm.plugin.record.ui.RecordVoiceBaseView;
import com.tencent.mm.plugin.record.ui.h.b;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.Iterator;
import java.util.List;

public final class e
  implements h.b
{
  RecordVoiceBaseView oiO;
  private r oix;
  
  public e()
  {
    GMTrace.i(7546123321344L, 56223);
    this.oix = new r();
    GMTrace.o(7546123321344L, 56223);
  }
  
  public final void a(View paramView, int paramInt, com.tencent.mm.plugin.record.ui.a.b paramb)
  {
    GMTrace.i(7546391756800L, 56225);
    Object localObject = paramView.findViewById(R.h.bwP);
    this.oiO = ((RecordVoiceBaseView)paramView.findViewById(R.h.clw));
    if (paramb.aGU == 0)
    {
      this.oiO.setVisibility(8);
      ((View)localObject).setVisibility(0);
      GMTrace.o(7546391756800L, 56225);
      return;
    }
    if (paramb.aGU == 1)
    {
      ((View)localObject).setVisibility(8);
      this.oiO.setVisibility(0);
      paramView = d.a(paramb);
      ft localft = new ft();
      localft.eIo.type = 17;
      localft.eIo.eIq = paramb.eIc;
      a.vgX.m(localft);
      paramInt = localft.eIp.ret;
      if (!com.tencent.mm.a.e.aZ(paramView))
      {
        if (!bg.nm(paramb.eIc.ujt)) {
          break label262;
        }
        ((View)localObject).setVisibility(0);
        this.oiO.setVisibility(8);
      }
    }
    for (;;)
    {
      localObject = this.oiO;
      int i = paramb.eIc.duration;
      ((RecordVoiceBaseView)localObject).path = bg.aq(paramView, "");
      ((RecordVoiceBaseView)localObject).eIv = paramInt;
      if (((RecordVoiceBaseView)localObject).duration != i)
      {
        ((RecordVoiceBaseView)localObject).duration = i;
        ((RecordVoiceBaseView)localObject).setText((int)q.aD(i) + "''");
      }
      GMTrace.o(7546391756800L, 56225);
      return;
      label262:
      w.d("MicroMsg.VoiceViewWrapper", "restart voice %s, url %s", new Object[] { Long.valueOf(paramb.ohE.field_localId), paramb.eIc.ujt });
      localObject = new ft();
      ((ft)localObject).eIo.type = 16;
      ((ft)localObject).eIo.eDp = paramb.ohE.field_localId;
      a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    }
  }
  
  public final View cZ(Context paramContext)
  {
    GMTrace.i(7546257539072L, 56224);
    paramContext = View.inflate(paramContext, R.i.cEE, null);
    RecordVoiceBaseView localRecordVoiceBaseView = (RecordVoiceBaseView)paramContext.findViewById(R.h.clw);
    localRecordVoiceBaseView.oix = this.oix;
    r localr = localRecordVoiceBaseView.oix;
    Iterator localIterator = localr.fIz.iterator();
    do
    {
      if (!localIterator.hasNext()) {
        break;
      }
    } while (localRecordVoiceBaseView != (r.a)localIterator.next());
    for (;;)
    {
      GMTrace.o(7546257539072L, 56224);
      return paramContext;
      localr.fIz.add(localRecordVoiceBaseView);
    }
  }
  
  public final void destroy()
  {
    GMTrace.i(7546525974528L, 56226);
    r localr = this.oix;
    localr.ahO();
    localr.ahM();
    r.jrf = null;
    localr.fIz.clear();
    GMTrace.o(7546525974528L, 56226);
  }
  
  public final void pause()
  {
    GMTrace.i(7546660192256L, 56227);
    if ((this.oix != null) && (this.oix.fIz.size() > 0))
    {
      Iterator localIterator = this.oix.fIz.iterator();
      while (localIterator.hasNext()) {
        ((r.a)localIterator.next()).onFinish();
      }
    }
    GMTrace.o(7546660192256L, 56227);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\b\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */