package com.tencent.mm.ui.chatting;

import android.graphics.Bitmap;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.n;
import com.tencent.mm.g.a.hr;
import com.tencent.mm.g.a.it;
import com.tencent.mm.g.a.it.b;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;

final class du
  extends ah.a
{
  LinearLayout wFK;
  TextView wFL;
  ProgressBar wFM;
  ImageView wFN;
  ProgressBar wFO;
  ImageView wFP;
  ImageView wrV;
  TextView wxX;
  
  public du(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2523695939584L, 18803);
    GMTrace.o(2523695939584L, 18803);
  }
  
  public static void a(du paramdu, au paramau, boolean paramBoolean, int paramInt, En_5b8fbb1e.a parama)
  {
    GMTrace.i(2523964375040L, 18805);
    if (paramdu == null)
    {
      GMTrace.o(2523964375040L, 18805);
      return;
    }
    paramdu.wFK.setVisibility(8);
    int i = com.tencent.mm.br.a.fromDPToPix(parama.vKB.vKW, 236);
    int j = com.tencent.mm.br.a.fromDPToPix(parama.vKB.vKW, 90);
    paramdu.wFL.setMaxLines(1);
    paramdu.wxX.setMaxLines(1);
    paramdu.wxX.setText("");
    Object localObject2;
    ImageView localImageView;
    com.tencent.mm.ao.f localf;
    int k;
    int m;
    if (com.tencent.mm.bj.d.LL("location"))
    {
      w.d("MicroMsg.LocationItemHolder", "plugin found!");
      localObject2 = new it();
      ((it)localObject2).eMp.eMj = 1;
      ((it)localObject2).eMp.eAH = paramau;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject2);
      localObject1 = ((it)localObject2).eMq.eMs;
      localObject2 = ((it)localObject2).eMq.eMt;
      if (((localObject1 == null) && (!a((String)localObject2, parama))) || ((localObject1 != null) && (((String)localObject1).equals("")) && (!a((String)localObject2, parama))) || ((localObject1 != null) && (((String)localObject1).equals("err_not_started"))))
      {
        w.d("MicroMsg.LocationItemHolder", "info error or subcore not started!");
        paramdu.wFO.setVisibility(0);
        paramdu.wFK.setVisibility(0);
        paramdu.wFL.setText("");
        paramdu.wxX.setText("");
        localImageView = paramdu.wFN;
        localf = n.IZ();
        k = R.g.aXG;
        m = R.g.aXR;
        if (!paramBoolean) {
          break label684;
        }
      }
    }
    label684:
    for (Object localObject1 = "location_backgroup_key_from";; localObject1 = "location_backgroup_key_tor")
    {
      Bitmap localBitmap = (Bitmap)localf.gHy.get(localObject1);
      if (localBitmap != null)
      {
        localObject2 = localBitmap;
        if (!localBitmap.isRecycled()) {}
      }
      else
      {
        localObject2 = com.tencent.mm.sdk.platformtools.d.t(k, m, i, j);
        localf.gHy.m(localObject1, localObject2);
      }
      localImageView.setImageBitmap((Bitmap)localObject2);
      localObject1 = new hr();
      ((hr)localObject1).eKX.eAH = paramau;
      ((hr)localObject1).eKX.w = i;
      ((hr)localObject1).eKX.h = j;
      ((hr)localObject1).eKX.eLc = R.g.aXR;
      ((hr)localObject1).eKX.eKZ = paramdu.wFN;
      ((hr)localObject1).eKX.eLb = paramdu.wFM;
      ((hr)localObject1).eKX.eLa = paramdu.wFP;
      com.tencent.mm.sdk.b.a.vgX.m((b)localObject1);
      paramdu.wvA.setTag(new dr(paramau, parama.wqK, paramInt, null, 0, (byte)0));
      paramdu.wvA.setOnClickListener(parama.wvd.wyW);
      paramdu.wvA.setOnLongClickListener(parama.wvd.wyY);
      paramdu.wvA.setOnTouchListener(parama.wvd.wza);
      GMTrace.o(2523964375040L, 18805);
      return;
      paramdu.wFO.setVisibility(8);
      paramdu.wFK.setVisibility(0);
      w.d("MicroMsg.LocationItemHolder", "location info : " + (String)localObject1);
      if (a((String)localObject2, parama))
      {
        paramdu.wFL.setVisibility(0);
        paramdu.wFL.setText((CharSequence)localObject2);
        if ((localObject1 == null) || (((String)localObject1).equals("")))
        {
          paramdu.wxX.setVisibility(8);
          break;
        }
        paramdu.wxX.setVisibility(0);
        paramdu.wxX.setText((CharSequence)localObject1);
        break;
      }
      paramdu.wFL.setMaxLines(2);
      paramdu.wFL.setText((CharSequence)localObject1);
      paramdu.wxX.setVisibility(8);
      break;
      paramdu.wFM.setVisibility(0);
      paramdu.wFK.setVisibility(8);
      break;
    }
  }
  
  private static boolean a(String paramString, En_5b8fbb1e.a parama)
  {
    GMTrace.i(2524098592768L, 18806);
    if ((paramString != null) && (!paramString.equals("")) && (!paramString.equals(parama.getString(R.l.dGL))))
    {
      GMTrace.o(2524098592768L, 18806);
      return true;
    }
    GMTrace.o(2524098592768L, 18806);
    return false;
  }
  
  public final ah.a r(View paramView, boolean paramBoolean)
  {
    GMTrace.i(2523830157312L, 18804);
    super.dq(paramView);
    this.jRw = ((TextView)paramView.findViewById(R.h.boA));
    this.wxX = ((TextView)paramView.findViewById(R.h.bnT));
    this.wFL = ((TextView)paramView.findViewById(R.h.bnV));
    this.wFK = ((LinearLayout)paramView.findViewById(R.h.bnU));
    this.wFM = ((ProgressBar)paramView.findViewById(R.h.bnQ));
    this.wvA = paramView.findViewById(R.h.bne);
    this.oGJ = ((TextView)paramView.findViewById(R.h.boF));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    this.wFN = ((ImageView)paramView.findViewById(R.h.bnS));
    this.wFO = ((ProgressBar)paramView.findViewById(R.h.bnR));
    this.wFP = ((ImageView)paramView.findViewById(R.h.bnm));
    if (paramBoolean) {}
    for (int i = 16;; i = 17)
    {
      this.type = i;
      if (!paramBoolean)
      {
        this.wsh = ((ImageView)paramView.findViewById(R.h.bow));
        this.wrV = ((ImageView)paramView.findViewById(R.h.boy));
      }
      this.wFL.setTextSize(1, 16.0F);
      this.wxX.setTextSize(1, 12.0F);
      GMTrace.o(2523830157312L, 18804);
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\du.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */