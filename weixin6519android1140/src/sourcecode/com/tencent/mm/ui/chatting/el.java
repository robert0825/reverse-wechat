package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import android.widget.CheckBox;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.br.a;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.modelvideo.s.a.a;
import com.tencent.mm.modelvideo.s.a.b;
import com.tencent.mm.pluginsdk.model.j;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.y.at;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;

final class el
  extends ah.a
{
  private static SparseArray<String> wHd;
  public static Map<String, WeakReference<el>> wrZ;
  TextView nVM;
  ImageView pIr;
  ImageView wFt;
  TextView wHr;
  MMPinProgressBtn wHs;
  View wHt;
  ProgressBar wHu;
  ImageView wrU;
  ImageView wrV;
  TextView wsb;
  ImageView wso;
  ImageView wsp;
  View yvK;
  
  static
  {
    GMTrace.i(2406792298496L, 17932);
    wHd = new SparseArray();
    wrZ = new HashMap();
    GMTrace.o(2406792298496L, 17932);
  }
  
  public el(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2406255427584L, 17928);
    GMTrace.o(2406255427584L, 17928);
  }
  
  public static void a(el paramel, au paramau, boolean paramBoolean, int paramInt1, En_5b8fbb1e.a parama, int paramInt2)
  {
    GMTrace.i(2406523863040L, 17930);
    Object localObject1 = (String)wHd.get(paramel.hashCode());
    if (localObject1 != null) {
      wrZ.remove(localObject1);
    }
    wHd.put(paramel.hashCode(), paramau.field_imgPath);
    wrZ.put(paramau.field_imgPath, new WeakReference(paramel));
    Object localObject2 = com.tencent.mm.modelvideo.t.mw(paramau.field_imgPath);
    localObject1 = localObject2;
    if (localObject2 == null) {
      localObject1 = new r();
    }
    o.Nh();
    localObject2 = s.ml(paramau.field_imgPath);
    localObject2 = n.IZ().a((String)localObject2, a.getDensity(parama.vKB.vKW), parama.vKB.vKW, paramInt2);
    paramel.wFt.setLayoutParams(new FrameLayout.LayoutParams(0, 0));
    int i;
    int j;
    if (localObject2 == null)
    {
      i = a.fromDPToPix(parama.vKB.vKW, 85);
      j = a.V(parama.vKB.vKW, R.f.aPD);
      localObject2 = d.a(d.X(parama.vKB.vKW.getResources().getColor(R.e.aNU), i, j), paramInt2, i, j);
      at.AR();
      if (!com.tencent.mm.y.c.isSDCardAvailable())
      {
        paramel.wrU.setImageDrawable(a.b(parama.vKB.vKW, R.k.cPv));
        paramel.wrU.setBackground(new BitmapDrawable((Bitmap)localObject2));
        localObject2 = new FrameLayout.LayoutParams(i, j);
        paramel.wFt.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        if (paramel.yvK != null) {
          paramel.yvK.setLayoutParams((ViewGroup.LayoutParams)localObject2);
        }
        label318:
        if (!paramBoolean) {
          break label898;
        }
        paramel.nVM.setText(com.tencent.mm.platformtools.t.aF(((r)localObject1).gsL));
        paramel.wHr.setText(com.tencent.mm.platformtools.t.hB(((r)localObject1).hcv));
        paramInt2 = ((r)localObject1).status;
        w.i("MicroMsg.VideoItemHoder", "parseVideo from video status : " + paramInt2 + " info : " + ((r)localObject1).getFileName());
        if (paramInt2 != 199) {
          break label749;
        }
        paramel.pIr.setImageDrawable(a.b(parama.vKB.vKW, R.k.cOK));
        label427:
        if ((paramInt2 != 112) && (paramInt2 != 122) && (paramInt2 != 120)) {
          break label782;
        }
        paramel.wso.setVisibility(8);
        paramel.pIr.setVisibility(8);
        paramel.wHs.setVisibility(0);
        paramel.wHs.setProgress(com.tencent.mm.modelvideo.t.f((r)localObject1));
        w.v("MicroMsg.VideoItemHoder", "status begin");
        paramel.wHs.invalidate();
      }
    }
    for (;;)
    {
      paramel.wsp.setTag(new dr(paramau, parama.wqK, paramInt1, paramau.field_talker, 4, (byte)0));
      paramel.wsp.setOnClickListener(parama.wvd.wyW);
      paramel.wso.setTag(new dr(paramau, parama.wqK, paramInt1, paramau.field_talker, 3, (byte)0));
      paramel.wso.setOnClickListener(parama.wvd.wyW);
      paramel.wvA.setTag(new dr(paramau, parama.wqK, paramInt1, paramau.field_talker, 2, (byte)0));
      paramel.wvA.setOnClickListener(parama.wvd.wyW);
      paramel.wvA.setOnLongClickListener(parama.wvd.wyY);
      paramel.wvA.setOnTouchListener(parama.wvd.wza);
      GMTrace.o(2406523863040L, 17930);
      return;
      localObject2 = d.a((Bitmap)localObject2, paramInt2, i, j);
      paramel.wrU.setImageBitmap((Bitmap)localObject2);
      break;
      paramel.wrU.setImageBitmap((Bitmap)localObject2);
      localObject2 = new FrameLayout.LayoutParams(((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight());
      paramel.wFt.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      if (paramel.yvK == null) {
        break label318;
      }
      paramel.yvK.setLayoutParams((ViewGroup.LayoutParams)localObject2);
      break label318;
      label749:
      paramel.pIr.setImageDrawable(a.b(parama.vKB.vKW, R.k.cOK));
      paramel.nVM.setVisibility(8);
      break label427;
      label782:
      if ((paramInt2 == 113) || (paramInt2 == 198) || (((r)localObject1).Nu()))
      {
        paramel.wso.setVisibility(0);
        paramel.wsp.setVisibility(8);
        paramel.wHs.setVisibility(8);
        paramel.pIr.setVisibility(0);
        w.v("MicroMsg.VideoItemHoder", "status pause");
      }
      else
      {
        paramel.wsp.setVisibility(8);
        paramel.wso.setVisibility(8);
        paramel.wHs.setVisibility(8);
        paramel.pIr.setVisibility(0);
        w.v("MicroMsg.VideoItemHoder", "status gone");
        continue;
        label898:
        paramel.nVM.setText(com.tencent.mm.platformtools.t.aF(((r)localObject1).gsL));
        paramel.wHr.setText(com.tencent.mm.platformtools.t.hB(((r)localObject1).hcv));
        paramInt2 = ((r)localObject1).status;
        paramel.pIr.setImageDrawable(a.b(parama.vKB.vKW, R.k.cOK));
        if (paramel.wHu != null) {
          paramel.wHu.setVisibility(8);
        }
        if (paramel.yvK != null) {
          paramel.yvK.setVisibility(8);
        }
        w.v("MicroMsg.VideoItemHoder", "video status %d", new Object[] { Integer.valueOf(paramInt2) });
        if ((paramInt2 == 104) || (paramInt2 == 103))
        {
          if (com.tencent.mm.plugin.mmsight.c.qD(((r)localObject1).hcw))
          {
            if (paramel.wHu != null) {
              paramel.wHu.setVisibility(0);
            }
            if (paramel.yvK != null) {
              paramel.yvK.setVisibility(0);
            }
            paramel.wHr.setText(null);
            paramel.nVM.setText(null);
            paramel.pIr.setImageDrawable(null);
            paramel.wsp.setVisibility(8);
            paramel.wso.setVisibility(8);
            paramel.wHs.setVisibility(8);
          }
          for (;;)
          {
            w.v("MicroMsg.VideoItemHoder", "status begin");
            break;
            paramel.wHu.setVisibility(8);
            paramel.yvK.setVisibility(8);
            paramel.wso.setVisibility(8);
            paramel.pIr.setVisibility(8);
            paramel.wHs.setVisibility(0);
            paramel.wHs.setProgress(com.tencent.mm.modelvideo.t.g((r)localObject1));
          }
        }
        if ((paramInt2 == 105) || (paramInt2 == 198) || (((r)localObject1).Nu()))
        {
          paramel.wso.setVisibility(0);
          paramel.wsp.setVisibility(8);
          paramel.wHs.setVisibility(8);
          paramel.pIr.setVisibility(0);
          w.v("MicroMsg.VideoItemHoder", "status pause");
        }
        else if (paramInt2 == 106)
        {
          if (!j.Ol(paramau.field_imgPath))
          {
            com.tencent.mm.modelvideo.t.mp(paramau.field_imgPath);
          }
          else
          {
            if (paramel.wHu != null) {
              paramel.wHu.setVisibility(0);
            }
            if (paramel.yvK != null) {
              paramel.yvK.setVisibility(0);
            }
            paramel.wHr.setText(null);
            paramel.nVM.setText(null);
            paramel.pIr.setImageDrawable(null);
            paramel.wsp.setVisibility(8);
            paramel.wso.setVisibility(8);
            paramel.wHs.setVisibility(8);
          }
        }
        else
        {
          paramel.wsp.setVisibility(8);
          paramel.wso.setVisibility(8);
          paramel.wHs.setVisibility(8);
          paramel.pIr.setVisibility(0);
          w.v("MicroMsg.VideoItemHoder", "status gone");
        }
      }
    }
  }
  
  public static boolean b(s.a.a parama)
  {
    GMTrace.i(2406121209856L, 17927);
    if (parama.hcL != s.a.b.hcP)
    {
      GMTrace.o(2406121209856L, 17927);
      return false;
    }
    r localr = com.tencent.mm.modelvideo.t.mw(parama.euR);
    if (localr == null)
    {
      w.w("MicroMsg.VideoItemHoder", "update status, filename %s, videoInfo not found", new Object[] { parama.euR });
      GMTrace.o(2406121209856L, 17927);
      return false;
    }
    if ((localr.status != 112) && (localr.status != 104) && (localr.status != 103))
    {
      GMTrace.o(2406121209856L, 17927);
      return false;
    }
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(2287338520576L, 17042);
        Object localObject = (WeakReference)el.wrZ.get(this.wzN.getFileName());
        if (localObject == null)
        {
          w.w("MicroMsg.VideoItemHoder", "update status, filename %s, holder not found", new Object[] { this.wzN.getFileName() });
          GMTrace.o(2287338520576L, 17042);
          return;
        }
        localObject = (el)((WeakReference)localObject).get();
        if (localObject == null)
        {
          w.w("MicroMsg.VideoItemHoder", "update status, filename %s, holder gc!", new Object[] { this.wzN.getFileName() });
          GMTrace.o(2287338520576L, 17042);
          return;
        }
        ((el)localObject).wso.setVisibility(8);
        ((el)localObject).pIr.setVisibility(8);
        ((el)localObject).wHs.setVisibility(0);
        int i = this.wzN.status;
        w.i("MicroMsg.VideoItemHoder", "updateStatus videoStatus : " + i);
        if ((i == 112) || (i == 122) || (i == 120))
        {
          ((el)localObject).wHs.setProgress(com.tencent.mm.modelvideo.t.f(this.wzN));
          GMTrace.o(2287338520576L, 17042);
          return;
        }
        ((el)localObject).wHs.setProgress(com.tencent.mm.modelvideo.t.g(this.wzN));
        GMTrace.o(2287338520576L, 17042);
      }
    });
    GMTrace.o(2406121209856L, 17927);
    return true;
  }
  
  public final ah.a r(View paramView, boolean paramBoolean)
  {
    Object localObject2 = null;
    GMTrace.i(2406389645312L, 17929);
    super.dq(paramView);
    this.jRw = ((TextView)paramView.findViewById(R.h.boA));
    this.wrU = ((ImageView)paramView.findViewById(R.h.bnj));
    this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
    this.nVM = ((TextView)paramView.findViewById(R.h.bou));
    this.wHr = ((TextView)paramView.findViewById(R.h.bnP));
    this.pIr = ((ImageView)paramView.findViewById(R.h.box));
    this.wso = ((ImageView)paramView.findViewById(R.h.bnn));
    this.wsp = ((ImageView)paramView.findViewById(R.h.boz));
    this.wHs = ((MMPinProgressBtn)paramView.findViewById(R.h.bnr));
    this.wHt = paramView.findViewById(R.h.boH);
    this.wvA = paramView.findViewById(R.h.bne);
    int i;
    if (paramBoolean)
    {
      i = 10;
      this.type = i;
      this.wsb = ((TextView)paramView.findViewById(R.h.bmy));
      this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
      this.npf = paramView.findViewById(R.h.bnX);
      this.wFt = ((ImageView)paramView.findViewById(R.h.bnl));
      if (paramBoolean) {
        break label314;
      }
      localObject1 = (ImageView)paramView.findViewById(R.h.boy);
      label246:
      this.wrV = ((ImageView)localObject1);
      if (paramBoolean) {
        break label320;
      }
    }
    label314:
    label320:
    for (Object localObject1 = (ProgressBar)paramView.findViewById(R.h.boI);; localObject1 = null)
    {
      this.wHu = ((ProgressBar)localObject1);
      localObject1 = localObject2;
      if (!paramBoolean) {
        localObject1 = paramView.findViewById(R.h.cjA);
      }
      this.yvK = ((View)localObject1);
      GMTrace.o(2406389645312L, 17929);
      return this;
      i = 11;
      break;
      localObject1 = null;
      break label246;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\el.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */