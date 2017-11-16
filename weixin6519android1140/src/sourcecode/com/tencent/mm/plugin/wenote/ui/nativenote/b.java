package com.tencent.mm.plugin.wenote.ui.nativenote;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageButton;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.compatible.b.b.a;
import com.tencent.mm.e.b.j;
import com.tencent.mm.modelcontrol.VideoTransPara;
import com.tencent.mm.plugin.mmsight.SightParams;
import com.tencent.mm.plugin.wenote.model.k.1;
import com.tencent.mm.plugin.wenote.model.k.2;
import com.tencent.mm.plugin.wenote.model.nativenote.manager.c;
import com.tencent.mm.plugin.wenote.model.nativenote.spans.t;
import com.tencent.mm.pluginsdk.ui.tools.FileExplorerUI;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;

public final class b
  implements com.tencent.mm.plugin.wenote.model.b.a, com.tencent.mm.plugin.wenote.model.nativenote.b.b
{
  View hwB;
  public String scA;
  ImageButton siN;
  LinearLayout siO;
  ImageButton siP;
  ImageButton siQ;
  ImageButton siR;
  public ImageButton siS;
  LinearLayout siT;
  public LinearLayout siU;
  public LinearLayout siV;
  LinearLayout siW;
  public LinearLayout siX;
  public boolean siY;
  public b siZ;
  public boolean sja;
  public boolean sjb;
  public boolean sjc;
  public boolean sjd;
  
  public b()
  {
    GMTrace.i(17172889862144L, 127948);
    this.siY = false;
    this.scA = "";
    this.sja = false;
    this.sjb = false;
    this.sjc = false;
    this.sjd = false;
    this.siZ = this;
    GMTrace.o(17172889862144L, 127948);
  }
  
  public static void b(com.tencent.mm.plugin.wenote.model.nativenote.b.a parama)
  {
    GMTrace.i(20587254644736L, 153387);
    parama.d(true, 50L);
    parama.P(1, 0L);
    GMTrace.o(20587254644736L, 153387);
  }
  
  public static <V, C extends com.tencent.mm.plugin.wenote.model.nativenote.spans.g<V>> void b(t<V, C> paramt, V paramV)
  {
    GMTrace.i(20586449338368L, 153381);
    if (com.tencent.mm.plugin.wenote.model.nativenote.manager.k.bHX() != null) {
      com.tencent.mm.plugin.wenote.model.nativenote.manager.k.bHX().b(paramt, paramV);
    }
    GMTrace.o(20586449338368L, 153381);
  }
  
  public final void a(com.tencent.mm.plugin.wenote.model.nativenote.b.a parama)
  {
    GMTrace.i(17629230137344L, 131348);
    this.siS.setImageResource(R.g.bcg);
    if (!this.siY)
    {
      GMTrace.o(17629230137344L, 131348);
      return;
    }
    this.siY = false;
    Object localObject = com.tencent.mm.plugin.wenote.model.k.bGQ();
    if ((((com.tencent.mm.plugin.wenote.model.k)localObject).jsG) && (!((com.tencent.mm.plugin.wenote.model.k)localObject).jsH)) {
      ((com.tencent.mm.plugin.wenote.model.k)localObject).azk();
    }
    localObject = com.tencent.mm.plugin.wenote.model.k.bGQ();
    if (com.tencent.mm.a.e.aZ(((com.tencent.mm.plugin.wenote.model.k)localObject).path)) {}
    int i;
    int j;
    int k;
    com.tencent.mm.plugin.wenote.model.a.b localb;
    for (localObject = ((com.tencent.mm.plugin.wenote.model.k)localObject).path;; localObject = "")
    {
      i = (int)com.tencent.mm.plugin.wenote.model.k.bGQ().duration;
      j = (int)com.tencent.mm.bf.b.aD(i);
      k = c.bHo().bHt();
      localb = c.bHo().yD(k);
      if (com.tencent.mm.a.e.aZ((String)localObject)) {
        break;
      }
      w.e("MicroMsg.WNNoteFootPannel", "voicePath not exist, remove data from datalist and ui");
      c.bHo().Q(k, false);
      if (parama != null) {
        parama.yy(k);
      }
      parama = new com.tencent.mm.plugin.wenote.model.a.h();
      parama.content = "";
      parama.scH = true;
      parama.scN = false;
      c.bHo().a(k, parama);
      c.bHo().dN(k - 1, k + 1);
      GMTrace.o(17629230137344L, 131348);
      return;
    }
    if ((k != -1) && (localb != null) && (localb.getType() == 4))
    {
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).scV = Boolean.valueOf(false);
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).type = 4;
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).sdf = true;
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).sdv = "";
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).length = i;
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).sdu = com.tencent.mm.bf.b.t(ab.getContext(), j).toString();
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).sdc = (com.tencent.mm.bf.a.Op() + "/fav_fileicon_recording.png");
      ((com.tencent.mm.plugin.wenote.model.a.k)localb).eOR = ((String)localObject);
      parama = c.bHo();
      if (parama.sdU != null) {
        parama.sdU.yw(k);
      }
    }
    GMTrace.o(17629230137344L, 131348);
  }
  
  public final void bGV()
  {
    GMTrace.i(17173024079872L, 127949);
    a(null);
    GMTrace.o(17173024079872L, 127949);
  }
  
  public final void bGW()
  {
    GMTrace.i(20586315120640L, 153380);
    com.tencent.mm.ui.base.h.a(this.siS.getContext(), this.siS.getContext().getString(R.l.dLR), "", true, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20581214846976L, 153342);
        b.this.a(null);
        GMTrace.o(20581214846976L, 153342);
      }
    }, new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(20581751717888L, 153346);
        GMTrace.o(20581751717888L, 153346);
      }
    });
    GMTrace.o(20586315120640L, 153380);
  }
  
  public final int bIF()
  {
    GMTrace.i(20587388862464L, 153388);
    if ((this.hwB == null) || (this.hwB.getVisibility() == 8))
    {
      GMTrace.o(20587388862464L, 153388);
      return 0;
    }
    if (this.siO.getVisibility() == 0)
    {
      GMTrace.o(20587388862464L, 153388);
      return 3;
    }
    GMTrace.o(20587388862464L, 153388);
    return 1;
  }
  
  public final void jM(boolean paramBoolean)
  {
    GMTrace.i(20586583556096L, 153382);
    this.sja = paramBoolean;
    this.siT.setPressed(paramBoolean);
    GMTrace.o(20586583556096L, 153382);
  }
  
  public final void jN(boolean paramBoolean)
  {
    GMTrace.i(20586717773824L, 153383);
    this.sjb = paramBoolean;
    this.siU.setPressed(paramBoolean);
    GMTrace.o(20586717773824L, 153383);
  }
  
  public final void jO(boolean paramBoolean)
  {
    GMTrace.i(20586851991552L, 153384);
    this.sjc = paramBoolean;
    this.siV.setPressed(paramBoolean);
    GMTrace.o(20586851991552L, 153384);
  }
  
  public final void jP(boolean paramBoolean)
  {
    GMTrace.i(20586986209280L, 153385);
    this.sjd = paramBoolean;
    this.siX.setPressed(paramBoolean);
    GMTrace.o(20586986209280L, 153385);
  }
  
  public final void l(final View paramView, final boolean paramBoolean)
  {
    GMTrace.i(20587120427008L, 153386);
    paramView.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(20580946411520L, 153340);
        paramView.setPressed(paramBoolean);
        GMTrace.o(20580946411520L, 153340);
      }
    }, 100L);
    GMTrace.o(20587120427008L, 153386);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\wenote\ui\nativenote\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */