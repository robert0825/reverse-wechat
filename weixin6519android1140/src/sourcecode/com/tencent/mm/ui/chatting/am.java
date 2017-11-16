package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.widget.MMTextView;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;
import java.net.URLDecoder;

final class am
  extends ah.b
{
  private En_5b8fbb1e.a wvE;
  
  public am()
  {
    super(66);
    GMTrace.i(2150302220288L, 16021);
    GMTrace.o(2150302220288L, 16021);
  }
  
  private static String VV(String paramString)
  {
    GMTrace.i(2150704873472L, 16024);
    try
    {
      paramString = f.a.eS(paramString);
      if (paramString != null)
      {
        paramString = URLDecoder.decode(paramString.content, "UTF-8");
        GMTrace.o(2150704873472L, 16024);
        return paramString;
      }
    }
    catch (Exception paramString)
    {
      com.tencent.mm.sdk.platformtools.w.e("MicroMsg.ChattingItemTextFrom", "getMsgContent error: %s", new Object[] { paramString.getMessage() });
      GMTrace.o(2150704873472L, 16024);
    }
    return "";
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2150436438016L, 16022);
    Object localObject;
    if (paramView != null)
    {
      localObject = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csw);
      ((View)localObject).setTag(new w(this.jHw).r((View)localObject, true));
    }
    GMTrace.o(2150436438016L, 16022);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2150839091200L, 16025);
    this.wvE = parama1;
    w localw = (w)parama;
    paramString = paramau.field_content;
    parama = parama1.wvd.eDs;
    localw.wtE.ma(true);
    int i;
    if ((parama1.wqK) && (!parama1.txk))
    {
      i = bc.gO(paramString);
      if (i != -1)
      {
        String str = paramString.substring(0, i).trim();
        if ((str != null) && (str.length() > 0))
        {
          parama = str;
          paramString = paramString.substring(i + 1).trim();
        }
      }
    }
    for (;;)
    {
      paramString = VV(paramString);
      a(localw, parama1, paramau, parama);
      a(localw, parama1, parama, paramau);
      localw.wtD.setText(paramString);
      parama = localw.wtD;
      i = paramau.field_type;
      paramString = parama1.cci();
      if (i != 301989937) {
        h.a(parama, paramString);
      }
      parama.getText();
      parama = dr.a(paramau, parama1.wqK, paramInt);
      localw.wtD.setTag(parama);
      localw.wtD.setOnClickListener(parama1.wvd.wyW);
      localw.wtD.setOnLongClickListener(parama1.wvd.wyY);
      localw.wtD.xrM = parama1.wvd.wzc;
      GMTrace.o(2150839091200L, 16025);
      return;
      break;
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2151107526656L, 16027);
    paramContextMenu.add(((dr)paramView.getTag()).position, 100, 0, paramView.getContext().getString(R.l.dgd));
    GMTrace.o(2151107526656L, 16027);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2151241744384L, 16028);
    GMTrace.o(2151241744384L, 16028);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2151375962112L, 16029);
    GMTrace.o(2151375962112L, 16029);
    return false;
  }
  
  protected final boolean a(En_5b8fbb1e.a parama)
  {
    GMTrace.i(2150570655744L, 16023);
    boolean bool = parama.wqK;
    GMTrace.o(2150570655744L, 16023);
    return bool;
  }
  
  protected final boolean ccr()
  {
    GMTrace.i(2150973308928L, 16026);
    GMTrace.o(2150973308928L, 16026);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\am.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */