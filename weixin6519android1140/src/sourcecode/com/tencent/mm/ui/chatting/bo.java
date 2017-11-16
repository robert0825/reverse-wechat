package com.tencent.mm.ui.chatting;

import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelfriend.af;
import com.tencent.mm.modelfriend.m;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.a;
import com.tencent.mm.storage.au.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;

final class bo
  extends ah.b
{
  public bo()
  {
    super(9);
    GMTrace.i(2261971369984L, 16853);
    GMTrace.o(2261971369984L, 16853);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2262105587712L, 16854);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.css);
      ((View)localObject).setTag(new do(this.jHw).dx((View)localObject));
    }
    GMTrace.o(2262105587712L, 16854);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2262374023168L, 16856);
    do localdo = (do)parama;
    if (paramau.field_type == 37)
    {
      at.AR();
      parama = com.tencent.mm.y.c.yM().Cm(paramau.field_content);
      if ((parama == null) || (parama.rAP == null) || (parama.rAP.length() <= 0))
      {
        w.e("MicroMsg.ChattingItemFMessageFrom", "getView : parse verify msg failed");
        GMTrace.o(2262374023168L, 16856);
        return;
      }
      com.tencent.mm.ac.b.y(parama.rAP, parama.vBr);
      if (s.fC(parama.rAP))
      {
        localdo.wFm.setVisibility(8);
        localdo.wFn.setVisibility(8);
        localdo.wFo.setVisibility(0);
        localdo.wFl.setBackgroundColor(16777215);
        localdo.wFo.setText(parama1.getString(R.l.dye));
        switch (parama.scene)
        {
        case 14: 
        case 15: 
        case 16: 
        case 17: 
        case 19: 
        case 20: 
        case 21: 
        default: 
          label248:
          localdo.wtG.setText(R.l.dfw);
          label259:
          localdo.oIP.setText(h.b(parama1.vKB.vKW, parama.getDisplayName(), localdo.oIP.getTextSize()));
          p(localdo.hqG, parama.rAP);
          localdo.wxX.setVisibility(0);
          if ((parama.content != null) && (!parama.content.trim().equals(""))) {
            localdo.wxX.setText(parama.content);
          }
          break;
        }
      }
    }
    for (;;)
    {
      localdo.wvA.setTag(new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0));
      localdo.wvA.setOnClickListener(parama1.wvd.wyW);
      localdo.wvA.setOnLongClickListener(parama1.wvd.wyY);
      localdo.wvA.setOnTouchListener(parama1.wvd.wza);
      GMTrace.o(2262374023168L, 16856);
      return;
      localdo.wFm.setVisibility(0);
      localdo.wFn.setVisibility(0);
      localdo.wFo.setVisibility(0);
      localdo.wFl.setBackgroundResource(R.g.aZp);
      localdo.wFo.setText(parama1.getString(R.l.dyd));
      break;
      localdo.wtG.setText(R.l.dfA);
      break label259;
      localdo.wtG.setText(R.l.dfC);
      break label259;
      localdo.wtG.setText(R.l.dPd);
      break label259;
      localdo.wtG.setText(R.l.dfv);
      break label259;
      paramString = af.If().jJ(parama.rAP);
      if ((paramString.GU() != null) && (!paramString.GU().equals("")))
      {
        localdo.wFp.setVisibility(0);
        localdo.wFp.setText(parama1.getString(R.l.dfq, new Object[] { paramString.GU() }));
        break label248;
      }
      localdo.wFp.setVisibility(8);
      break label248;
      localdo.wxX.setText(parama1.getString(R.l.dfB));
      continue;
      if (paramau.field_type == 40)
      {
        at.AR();
        au.a locala = com.tencent.mm.y.c.yM().Cn(paramau.field_content);
        if ((locala == null) || (locala.rAP == null) || (locala.rAP.length() <= 0))
        {
          w.e("MicroMsg.ChattingItemFMessageFrom", "getView : parse possible friend msg failed");
          GMTrace.o(2262374023168L, 16856);
          return;
        }
        com.tencent.mm.ac.b.y(locala.rAP, locala.vBr);
        if (s.fC(locala.rAP))
        {
          localdo.wFm.setVisibility(8);
          localdo.wFn.setVisibility(8);
          localdo.wFo.setVisibility(0);
          localdo.wFl.setBackgroundColor(16777215);
          localdo.wFo.setText(parama1.getString(R.l.dye));
          label789:
          switch (locala.scene)
          {
          default: 
            w.d("MicroMsg.ChattingItemFMessageFrom", "prossible friend sceneType:%d", new Object[] { Integer.valueOf(locala.scene) });
            localdo.wtG.setText(R.l.dfr);
            localdo.wxX.setText(R.l.dfs);
            localdo.oIP.setText(h.b(parama1.vKB.vKW, locala.getDisplayName(), localdo.oIP.getTextSize()));
          }
        }
        for (;;)
        {
          p(localdo.hqG, locala.rAP);
          break;
          localdo.wFm.setVisibility(0);
          localdo.wFn.setVisibility(0);
          localdo.wFo.setVisibility(0);
          localdo.wFl.setBackgroundResource(R.g.aZp);
          localdo.wFo.setText(parama1.getString(R.l.dyd));
          break label789;
          localdo.wtG.setText(R.l.dfm);
          localdo.wxX.setText(R.l.dfn);
          paramString = locala.bUd();
          parama = paramString;
          if (paramString == null) {
            parama = locala.getDisplayName();
          }
          localdo.oIP.setText(h.b(parama1.vKB.vKW, parama, localdo.oIP.getTextSize()));
          continue;
          localdo.wtG.setText(R.l.dfp);
          paramString = m.jR(locala.vBs);
          parama = paramString;
          if (t.nm(paramString)) {
            parama = m.jR(locala.vBt);
          }
          localdo.wxX.setText(parama1.getString(R.l.dfq, new Object[] { parama }));
          localdo.oIP.setText(h.b(parama1.vKB.vKW, locala.getDisplayName(), localdo.oIP.getTextSize()));
          continue;
          localdo.wtG.setText(R.l.dfy);
          localdo.wxX.setText(R.l.dfz);
          localdo.oIP.setText(h.b(parama1.vKB.vKW, locala.getDisplayName(), localdo.oIP.getTextSize()));
          continue;
          localdo.wtG.setText(R.l.dfu);
          localdo.wxX.setText(R.l.dft);
          localdo.oIP.setText(h.b(parama1.vKB.vKW, locala.getDisplayName(), localdo.oIP.getTextSize()));
        }
      }
      w.w("MicroMsg.ChattingItemFMessageFrom", "FROM_FMESSAGE did not include this type, msgType = " + paramau.field_type);
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2262508240896L, 16857);
    GMTrace.o(2262508240896L, 16857);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2262642458624L, 16858);
    GMTrace.o(2262642458624L, 16858);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2262776676352L, 16859);
    GMTrace.o(2262776676352L, 16859);
    return false;
  }
  
  protected final boolean ccr()
  {
    GMTrace.i(2262239805440L, 16855);
    GMTrace.o(2262239805440L, 16855);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bo.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */