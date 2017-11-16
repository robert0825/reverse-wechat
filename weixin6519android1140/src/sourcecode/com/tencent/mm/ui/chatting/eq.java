package com.tencent.mm.ui.chatting;

import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.si;
import com.tencent.mm.g.a.si.b;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.storage.au;

final class eq
  extends ah.a
{
  View wHE;
  TextView wxX;
  
  public eq(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2400081412096L, 17882);
    this.wHE = null;
    GMTrace.o(2400081412096L, 17882);
  }
  
  public static void a(eq parameq, au paramau, boolean paramBoolean, int paramInt, En_5b8fbb1e.a parama)
  {
    GMTrace.i(2400349847552L, 17884);
    if (parameq == null)
    {
      GMTrace.o(2400349847552L, 17884);
      return;
    }
    Object localObject;
    int i;
    if (parameq.wsh != null)
    {
      localObject = parameq.wsh;
      if (paramau.field_status == 6)
      {
        i = 8;
        ((ImageView)localObject).setVisibility(i);
      }
    }
    else
    {
      parameq.wvA.setTag(new dr(paramau, parama.wqK, paramInt, null, 0, (byte)0));
      parameq.wvA.setOnClickListener(parama.wvd.wyW);
      parameq.wvA.setOnLongClickListener(parama.wvd.wyY);
      parameq.wvA.setOnTouchListener(parama.wvd.wza);
      parama = paramau.fwv;
      if (bg.nm(parama)) {
        break label171;
      }
      parameq.wxX.setText(parama);
    }
    for (;;)
    {
      if (parameq.wHE != null) {
        break label201;
      }
      GMTrace.o(2400349847552L, 17884);
      return;
      i = 0;
      break;
      label171:
      if (paramBoolean) {
        parameq.wxX.setText(R.l.ehs);
      } else {
        parameq.wxX.setText(R.l.eht);
      }
    }
    label201:
    if (!paramau.field_content.equals(au.vBl))
    {
      parama = paramau.field_content;
      localObject = new si();
      ((si)localObject).eXf.eHJ = 1;
      ((si)localObject).eXf.content = parama;
      a.vgX.m((b)localObject);
      if (((si)localObject).eXg.type != 3) {
        break label299;
      }
      paramInt = 1;
    }
    while (paramInt != 0) {
      if (paramBoolean)
      {
        parameq.wHE.setBackgroundResource(R.k.cPC);
        GMTrace.o(2400349847552L, 17884);
        return;
        label299:
        paramInt = 0;
      }
      else
      {
        parameq.wHE.setBackgroundResource(R.k.cPD);
        GMTrace.o(2400349847552L, 17884);
        return;
      }
    }
    if (!paramau.field_content.equals(au.vBm))
    {
      paramau = paramau.field_content;
      parama = new si();
      parama.eXf.eHJ = 1;
      parama.eXf.content = paramau;
      a.vgX.m(parama);
      if (parama.eXg.type != 2) {
        break label420;
      }
      paramInt = 1;
    }
    while (paramInt != 0) {
      if (paramBoolean)
      {
        parameq.wHE.setBackgroundResource(R.k.cPA);
        GMTrace.o(2400349847552L, 17884);
        return;
        label420:
        paramInt = 0;
      }
      else
      {
        parameq.wHE.setBackgroundResource(R.k.cPB);
      }
    }
    GMTrace.o(2400349847552L, 17884);
  }
  
  public final ah.a dx(View paramView)
  {
    GMTrace.i(2400215629824L, 17883);
    super.dq(paramView);
    if ((this.type == 24) || (this.type == 43) || (this.type == 27) || (this.type == 28))
    {
      this.jRw = ((TextView)paramView.findViewById(R.h.boA));
      this.wxX = ((TextView)paramView.findViewById(R.h.bpa));
      this.wvA = paramView.findViewById(R.h.bne);
      this.wHE = paramView.findViewById(R.h.boZ);
    }
    if (this.type == 24) {
      this.wsh = ((ImageView)paramView.findViewById(R.h.bow));
    }
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = paramView.findViewById(R.h.bnX);
    GMTrace.o(2400215629824L, 17883);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\eq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */