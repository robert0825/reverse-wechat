package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.animation.AlphaAnimation;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.widget.MMTextView;
import com.tencent.mm.x.f.a;
import java.net.URLDecoder;

final class an
  extends ah.c
{
  private En_5b8fbb1e.a wvE;
  
  public an()
  {
    super(67);
    GMTrace.i(2216337342464L, 16513);
    GMTrace.o(2216337342464L, 16513);
  }
  
  private static String VV(String paramString)
  {
    GMTrace.i(2216605777920L, 16515);
    try
    {
      paramString = f.a.eS(paramString);
      if (paramString != null)
      {
        paramString = URLDecoder.decode(paramString.content, "UTF-8");
        GMTrace.o(2216605777920L, 16515);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChattingItemTextTo", "getMsgContent error: %s", new Object[] { paramString.getMessage() });
      GMTrace.o(2216605777920L, 16515);
    }
    return "";
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2216471560192L, 16514);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csZ);
      ((View)localObject).setTag(new w(this.jHw).r((View)localObject, false));
    }
    GMTrace.o(2216471560192L, 16514);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    int i = 8;
    GMTrace.i(2216739995648L, 16516);
    this.wvE = parama1;
    parama = (w)parama;
    if (ccs())
    {
      if (parama.nWt != null) {
        parama.nWt.setVisibility(8);
      }
      if ((paramau.field_status == 1) || (paramau.field_status == 5))
      {
        if (parama.wrV != null) {
          parama.wrV.setVisibility(8);
        }
        parama.wtD.setBackgroundResource(R.g.aVL);
        paramau.vBn = true;
      }
    }
    while (parama.nWt == null) {
      for (;;)
      {
        paramString = VV(paramau.field_content);
        if (bg.nm(paramString)) {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChattingItemTextTo", "[carl] text to, content is null! why?? localid : %s, svrid : %s", new Object[] { Long.valueOf(paramau.field_msgId), Long.valueOf(paramau.field_msgSvrId) });
        }
        parama.wtE.ma(true);
        parama.wtD.setMinWidth(0);
        parama.wtD.setText(paramString);
        paramString = parama.wtD;
        i = paramau.field_type;
        String str = parama1.cci();
        if (i != 301989937) {
          h.a(paramString, str);
        }
        paramString.getText();
        paramString = dr.a(paramau, parama1.wqK, paramInt);
        parama.wtD.setTag(paramString);
        parama.wtD.setOnClickListener(parama1.wvd.wyW);
        parama.wtD.setOnLongClickListener(parama1.wvd.wyY);
        parama.wtD.xrM = parama1.wvd.wzc;
        a(paramInt, parama, paramau, parama1.wvd.gtf, parama1.wqK, parama1.wvd.wyW);
        GMTrace.o(2216739995648L, 16516);
        return;
        parama.wtD.setBackgroundResource(R.g.aVK);
        if (parama.wrV != null) {
          if (a(parama1.wvd, paramau.field_msgId))
          {
            if (paramau.vBn)
            {
              paramString = new AlphaAnimation(0.5F, 1.0F);
              paramString.setDuration(300L);
              parama.wtD.startAnimation(paramString);
              paramau.vBn = false;
            }
            parama.wrV.setVisibility(0);
          }
          else
          {
            parama.wrV.setVisibility(8);
          }
        }
      }
    }
    paramString = parama.nWt;
    if (paramau.field_status >= 2) {}
    for (;;)
    {
      paramString.setVisibility(i);
      break;
      i = 0;
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2216874213376L, 16517);
    paramContextMenu.add(((dr)paramView.getTag()).position, 100, 0, paramView.getContext().getString(R.l.dgd));
    GMTrace.o(2216874213376L, 16517);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2217008431104L, 16518);
    GMTrace.o(2217008431104L, 16518);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2217142648832L, 16519);
    GMTrace.o(2217142648832L, 16519);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\an.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */