package com.tencent.mm.plugin.card.ui.view;

import android.content.Intent;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.d.a.a.t;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.a.o;
import com.tencent.mm.plugin.card.a.i.b;
import com.tencent.mm.plugin.card.b.c;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.b.p;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.ui.MMActivity;

public abstract class h
  implements ab
{
  protected MMActivity iPC;
  protected g jKi;
  
  public h(g paramg, MMActivity paramMMActivity)
  {
    GMTrace.i(18895977054208L, 140786);
    this.jKi = paramg;
    this.iPC = paramMMActivity;
    GMTrace.o(18895977054208L, 140786);
  }
  
  public abstract boolean amN();
  
  public abstract boolean amO();
  
  public void c(ViewGroup paramViewGroup, final com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(18896111271936L, 140787);
    Object localObject1;
    Object localObject2;
    if (amN())
    {
      localObject1 = (TextView)paramViewGroup.findViewById(R.h.bpJ);
      localObject2 = this.jKi.code;
      if ((!paramb.ajp()) && ((com.tencent.pb.common.c.h.yp((String)localObject2)) || (((String)localObject2).length() > 40))) {
        break label302;
      }
      ((TextView)localObject1).setText(m.uL((String)localObject2));
      if (paramb.ajk())
      {
        ((TextView)localObject1).setVisibility(0);
        ((TextView)localObject1).setOnLongClickListener(new View.OnLongClickListener()
        {
          public final boolean onLongClick(View paramAnonymousView)
          {
            GMTrace.i(18890608345088L, 140746);
            if (paramAnonymousView.getId() == R.h.bpJ)
            {
              p.H(h.this.iPC, paramb.ajw().code);
              com.tencent.mm.ui.base.h.bm(h.this.iPC, o.getString(R.l.cSq));
            }
            GMTrace.o(18890608345088L, 140746);
            return false;
          }
        });
        this.jKi.d(c.jLj);
      }
    }
    else
    {
      if (!amO()) {
        break label330;
      }
      localObject1 = (RelativeLayout)paramViewGroup.findViewById(R.h.bpx);
      if ((paramb == null) || (paramb.ajv() == null) || (paramb.ajv().uam == null)) {
        break label324;
      }
      paramViewGroup.findViewById(R.h.bpv).setVisibility(8);
      ((RelativeLayout)localObject1).setVisibility(0);
      localObject2 = paramb.ajv().uam;
      TextView localTextView = (TextView)paramViewGroup.findViewById(R.h.bpz);
      localTextView.setText(((np)localObject2).title);
      String str = paramb.ajv().gjg;
      if (!com.tencent.pb.common.c.h.yp(str)) {
        localTextView.setTextColor(l.uD(str));
      }
      paramViewGroup = (TextView)paramViewGroup.findViewById(R.h.bpy);
      localObject2 = ((np)localObject2).jxJ;
      if (TextUtils.isEmpty((CharSequence)localObject2)) {
        break label311;
      }
      if (paramViewGroup != null)
      {
        paramViewGroup.setText((CharSequence)localObject2);
        paramViewGroup.setVisibility(0);
      }
    }
    for (;;)
    {
      ((RelativeLayout)localObject1).setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(18892487393280L, 140760);
          if (paramb.ajo())
          {
            paramAnonymousView = new i.b();
            com.tencent.mm.plugin.card.b.b.a(h.this.jKi.iPC, paramAnonymousView.jxv, paramAnonymousView.jxw, false, paramb);
          }
          for (;;)
          {
            t.finish();
            GMTrace.o(18892487393280L, 140760);
            return;
            paramAnonymousView = paramb.ajv().uam;
            if ((paramAnonymousView != null) && (!com.tencent.pb.common.c.h.yp(paramAnonymousView.tZy)) && (!com.tencent.pb.common.c.h.yp(paramAnonymousView.tZx)))
            {
              int i;
              if (h.this.iPC.getIntent() != null)
              {
                i = h.this.iPC.getIntent().getIntExtra("key_from_scene", 3);
                label133:
                if (h.this.iPC.getIntent() == null) {
                  break label244;
                }
              }
              label244:
              for (int j = h.this.iPC.getIntent().getIntExtra("key_from_appbrand_type", 0);; j = 0)
              {
                com.tencent.mm.plugin.card.b.b.a(paramb.ajz(), paramAnonymousView, i, j);
                com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(20), paramb.ajz(), paramb.ajA(), "", paramAnonymousView.title });
                break;
                i = 3;
                break label133;
              }
            }
            if ((paramAnonymousView != null) && (!TextUtils.isEmpty(paramAnonymousView.url)))
            {
              String str = l.r(paramAnonymousView.url, paramAnonymousView.uaJ);
              com.tencent.mm.plugin.card.b.b.a(h.this.jKi.iPC, str, 1);
              com.tencent.mm.plugin.report.service.g.ork.i(11941, new Object[] { Integer.valueOf(9), paramb.ajz(), paramb.ajA(), "", paramAnonymousView.title });
              if (l.a(paramAnonymousView, paramb.ajz()))
              {
                str = paramb.ajz();
                paramAnonymousView = paramAnonymousView.title;
                l.uJ(str);
                com.tencent.mm.plugin.card.b.b.a(h.this.jKi.iPC, paramb.ajv().jyT);
              }
            }
          }
        }
      });
      GMTrace.o(18896111271936L, 140787);
      return;
      ((TextView)localObject1).setVisibility(8);
      break;
      label302:
      ((TextView)localObject1).setVisibility(8);
      break;
      label311:
      if (paramViewGroup != null) {
        paramViewGroup.setVisibility(8);
      }
    }
    label324:
    ((RelativeLayout)localObject1).setVisibility(8);
    label330:
    GMTrace.o(18896111271936L, 140787);
  }
  
  public void e(ViewGroup paramViewGroup)
  {
    GMTrace.i(18896648142848L, 140791);
    GMTrace.o(18896648142848L, 140791);
  }
  
  public boolean i(com.tencent.mm.plugin.card.base.b paramb)
  {
    GMTrace.i(18896513925120L, 140790);
    GMTrace.o(18896513925120L, 140790);
    return true;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */