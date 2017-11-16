package com.tencent.mm.plugin.card.ui.view;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.drawable.GradientDrawable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.c;
import com.tencent.mm.plugin.card.b.d;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.k;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.protocal.c.ql;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.p;

public final class n
  extends h
{
  public n(g paramg, MMActivity paramMMActivity)
  {
    super(paramg, paramMMActivity);
    GMTrace.i(18883763240960L, 140695);
    GMTrace.o(18883763240960L, 140695);
  }
  
  private void a(Button paramButton, com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(18885105418240L, 140705);
    paramb = paramb.ajv().gjg;
    if (!com.tencent.pb.common.c.h.yp(paramb))
    {
      int i = com.tencent.mm.plugin.card.b.l.uD(paramb);
      paramButton.setText(this.iPC.getResources().getString(R.l.dco));
      paramButton.setTextColor(i);
      paramb = new GradientDrawable();
      paramb.setColor(this.iPC.getResources().getColor(R.e.aNg));
      paramb.setStroke(2, i);
      paramb.setCornerRadius(8.0F);
      paramButton.setBackground(paramb);
    }
    GMTrace.o(18885105418240L, 140705);
  }
  
  public final void a(ViewGroup paramViewGroup, final com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(18884836982784L, 140703);
    al.akD().ajM();
    paramViewGroup.findViewById(R.h.bpD).setVisibility(0);
    paramViewGroup.findViewById(R.h.bpC).setVisibility(8);
    final np localnp = paramb.ajw().tZt;
    if (localnp != null)
    {
      paramViewGroup.findViewById(R.h.bpI).setVisibility(0);
      if (!com.tencent.pb.common.c.h.yp(localnp.title))
      {
        Button localButton = (Button)paramViewGroup.findViewById(R.h.bpu);
        localButton.setText(localnp.title);
        localButton.setVisibility(0);
        a(localButton, paramb);
        localButton.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(18883629023232L, 140694);
            if ((!com.tencent.pb.common.c.h.yp(localnp.tZy)) && (!com.tencent.pb.common.c.h.yp(localnp.tZx)))
            {
              int i;
              if (n.this.iPC.getIntent() != null)
              {
                i = n.this.iPC.getIntent().getIntExtra("key_from_scene", 3);
                if (n.this.iPC.getIntent() == null) {
                  break label187;
                }
              }
              label187:
              for (int j = n.this.iPC.getIntent().getIntExtra("key_from_appbrand_type", 0);; j = 0)
              {
                com.tencent.mm.plugin.card.b.b.a(paramb.ajz(), localnp, i, j);
                com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(20), paramb.ajz(), paramb.ajA(), "", localnp.title });
                GMTrace.o(18883629023232L, 140694);
                return;
                i = 3;
                break;
              }
            }
            if (!com.tencent.pb.common.c.h.yp(localnp.url))
            {
              paramAnonymousView = com.tencent.mm.plugin.card.b.l.r(localnp.url, localnp.uaJ);
              com.tencent.mm.plugin.card.b.b.a(n.this.iPC, paramAnonymousView, 1);
              com.tencent.mm.plugin.report.service.g localg = com.tencent.mm.plugin.report.service.g.ork;
              String str1 = paramb.ajz();
              String str2 = paramb.ajA();
              if (localnp.title != null) {}
              for (paramAnonymousView = localnp.title;; paramAnonymousView = "")
              {
                localg.i(11941, new Object[] { Integer.valueOf(9), str1, str2, "", paramAnonymousView });
                GMTrace.o(18883629023232L, 140694);
                return;
              }
            }
            d.a(n.this.iPC, n.this.iPC.getString(R.l.den), true);
            GMTrace.o(18883629023232L, 140694);
          }
        });
        if (!com.tencent.pb.common.c.h.yp(localnp.jxI)) {
          ((TextView)paramViewGroup.findViewById(R.h.bpw)).setText(localnp.jxI);
        }
        paramViewGroup = (TextView)paramViewGroup.findViewById(R.h.bpH);
        if (!com.tencent.pb.common.c.h.yp(localnp.jxJ))
        {
          paramViewGroup.setText(localnp.jxJ);
          paramViewGroup.setVisibility(0);
          GMTrace.o(18884836982784L, 140703);
          return;
        }
        paramViewGroup.setVisibility(8);
      }
    }
    GMTrace.o(18884836982784L, 140703);
  }
  
  public final boolean amN()
  {
    GMTrace.i(18884568547328L, 140701);
    GMTrace.o(18884568547328L, 140701);
    return false;
  }
  
  public final boolean amO()
  {
    GMTrace.i(18884702765056L, 140702);
    GMTrace.o(18884702765056L, 140702);
    return true;
  }
  
  public final void b(final ViewGroup paramViewGroup, final com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(18884971200512L, 140704);
    w.i("MicroMsg.CardDynamicQrCodeController", "onScreenShot! ");
    final View localView1 = paramViewGroup.findViewById(R.h.bpD);
    if (localView1.getVisibility() == 0)
    {
      w.e("MicroMsg.CardDynamicQrCodeController", "code_qr_disable_layout is visible! do not show hint!");
      GMTrace.o(18884971200512L, 140704);
      return;
    }
    localView1.setVisibility(0);
    final Object localObject = paramViewGroup.findViewById(R.h.bpF);
    if (((View)localObject).getVisibility() == 0) {
      ((View)localObject).setVisibility(8);
    }
    localObject = (ImageView)paramViewGroup.findViewById(R.h.bpC);
    ((ImageView)localObject).setVisibility(8);
    final View localView2 = paramViewGroup.findViewById(R.h.bpI);
    localView2.setVisibility(0);
    ((TextView)paramViewGroup.findViewById(R.h.bpw)).setText(this.iPC.getResources().getString(R.l.dcn));
    final Button localButton = (Button)paramViewGroup.findViewById(R.h.bpu);
    localButton.setVisibility(0);
    a(localButton, paramb);
    com.tencent.mm.plugin.card.a.g localg = al.akD();
    if (paramb == null) {
      w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport do nothing return !cardInfo is null!");
    }
    for (;;)
    {
      localButton.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18885642289152L, 140709);
          localView1.setVisibility(8);
          localView2.setVisibility(8);
          localObject.setVisibility(0);
          localButton.setVisibility(8);
          n.this.jKi.d(c.jLe);
          n.this.d(paramViewGroup, paramb);
          GMTrace.o(18885642289152L, 140709);
        }
      });
      GMTrace.o(18884971200512L, 140704);
      return;
      localg.ajM();
      k localk = al.akB().tY(paramb.ajz());
      if (localk != null)
      {
        w.i("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport currentCode cardId =%s,codeId=%s", new Object[] { localk.field_card_id, localk.field_code_id });
        if (al.akB().bA(paramb.ajz(), localk.field_code_id)) {
          localg.a(paramb.ajz(), localk.field_code_id, c.jLe);
        } else {
          w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport delete failue! do not report! cardId =%s,codeId=%s", new Object[] { localk.field_card_id, localk.field_code_id });
        }
      }
      else
      {
        w.e("MicroMsg.CardDynamicQrcodeOfflineMgr", "doScreenshotReport  failue! currentCode is null!");
      }
    }
  }
  
  public final void c(ViewGroup paramViewGroup, com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(18884300111872L, 140699);
    super.c(paramViewGroup, paramb);
    d(paramViewGroup, paramb);
    GMTrace.o(18884300111872L, 140699);
  }
  
  public final void d(final ViewGroup paramViewGroup, com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(18884434329600L, 140700);
    paramb = paramb.ajv().uan;
    View localView = paramViewGroup.findViewById(R.h.bpF);
    if ((paramb != null) && (paramb.ugr))
    {
      localView.setVisibility(0);
      if (!com.tencent.pb.common.c.h.yp(paramb.ugs))
      {
        ((TextView)paramViewGroup.findViewById(R.h.bpG)).setText(paramb.ugs);
        ((ImageView)paramViewGroup.findViewById(R.h.bpE)).setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(18885373853696L, 140707);
            paramAnonymousView = (Button)paramViewGroup.findViewById(R.h.bpu);
            View localView = paramViewGroup.findViewById(R.h.bpD);
            if ((paramAnonymousView.getVisibility() == 0) && (localView.getVisibility() == 0))
            {
              GMTrace.o(18885373853696L, 140707);
              return;
            }
            if (localView.getVisibility() == 0)
            {
              if (!com.tencent.mm.plugin.card.b.l.isNetworkAvailable(n.this.iPC.vKB.vKW))
              {
                d.a(n.this.iPC, n.this.iPC.getString(R.l.dcB), false);
                GMTrace.o(18885373853696L, 140707);
                return;
              }
              localView.setVisibility(8);
              paramViewGroup.findViewById(R.h.bpC).setVisibility(0);
            }
            n.this.jKi.d(c.jLf);
            GMTrace.o(18885373853696L, 140707);
          }
        });
        GMTrace.o(18884434329600L, 140700);
      }
    }
    else
    {
      localView.setVisibility(8);
    }
    GMTrace.o(18884434329600L, 140700);
  }
  
  public final void e(ViewGroup paramViewGroup)
  {
    GMTrace.i(18884165894144L, 140698);
    paramViewGroup.findViewById(R.h.bpD).setVisibility(8);
    paramViewGroup.findViewById(R.h.bpC).setVisibility(0);
    GMTrace.o(18884165894144L, 140698);
  }
  
  public final int getLayoutId()
  {
    GMTrace.i(18883897458688L, 140696);
    int i = R.i.cqI;
    GMTrace.o(18883897458688L, 140696);
    return i;
  }
  
  public final boolean i(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(18884031676416L, 140697);
    if (!paramb.ajw().tZu)
    {
      w.e("MicroMsg.CardDynamicQrCodeController", "isCanGetAndShowCode false : is_commom_card false!ban card show!");
      GMTrace.o(18884031676416L, 140697);
      return false;
    }
    paramb = paramb.ajw().tZt;
    if ((paramb != null) && (!com.tencent.pb.common.c.h.yp(paramb.title)))
    {
      w.e("MicroMsg.CardDynamicQrCodeController", "isCanGetAndShowCode false : unavailable_qrcode_field is not null  !ban card show!");
      GMTrace.o(18884031676416L, 140697);
      return false;
    }
    GMTrace.o(18884031676416L, 140697);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */