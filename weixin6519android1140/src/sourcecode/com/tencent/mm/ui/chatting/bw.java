package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.au.c;
import com.tencent.mm.y.at;

final class bw
  extends ah.b
{
  private En_5b8fbb1e.a wvE;
  
  public bw()
  {
    super(8);
    GMTrace.i(2205197271040L, 16430);
    GMTrace.o(2205197271040L, 16430);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2205331488768L, 16431);
    View localView;
    if ((paramView != null) && (paramView.getTag() != null))
    {
      localView = paramView;
      if (((ah.a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localView = paramLayoutInflater.inflate(R.i.csu, null);
      paramLayoutInflater = new dw(this.jHw);
      paramLayoutInflater.jRw = ((TextView)localView.findViewById(R.h.boA));
      paramLayoutInflater.oGJ = ((TextView)localView.findViewById(R.h.boF));
      paramLayoutInflater.wrU = ((ImageView)localView.findViewById(R.h.bnW));
      paramLayoutInflater.wFL = ((TextView)localView.findViewById(R.h.boC));
      paramLayoutInflater.wxX = ((TextView)localView.findViewById(R.h.bni));
      paramLayoutInflater.wvA = localView.findViewById(R.h.bne);
      localView.setTag(paramLayoutInflater);
    }
    GMTrace.o(2205331488768L, 16431);
    return localView;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2205465706496L, 16432);
    this.wvE = parama1;
    parama = (dw)parama;
    at.AR();
    paramString = com.tencent.mm.y.c.yM().Cl(paramau.field_content);
    parama.wFL.setText(paramString.title);
    parama.wxX.setText(paramString.content);
    a(parama, paramString.gTN);
    ImageView localImageView = parama.wrU;
    if (paramString.lgw) {}
    for (int i = 0;; i = 8)
    {
      localImageView.setVisibility(i);
      parama.wvA.setTag(new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0));
      parama.wvA.setOnClickListener(parama1.wvd.wyW);
      parama.wvA.setOnLongClickListener(parama1.wvd.wyY);
      parama.wvA.setOnTouchListener(parama1.wvd.wza);
      GMTrace.o(2205465706496L, 16432);
      return;
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2205734141952L, 16434);
    int i = ((dr)paramView.getTag()).position;
    if (!this.wvE.ceh()) {
      paramContextMenu.add(i, 100, 0, paramView.getContext().getString(R.l.dgd));
    }
    GMTrace.o(2205734141952L, 16434);
    return true;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2205868359680L, 16435);
    GMTrace.o(2205868359680L, 16435);
    return false;
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2206002577408L, 16436);
    GMTrace.o(2206002577408L, 16436);
    return false;
  }
  
  protected final boolean ccr()
  {
    GMTrace.i(2205599924224L, 16433);
    GMTrace.o(2205599924224L, 16433);
    return false;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bw.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */