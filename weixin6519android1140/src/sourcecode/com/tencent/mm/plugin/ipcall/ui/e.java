package com.tencent.mm.plugin.ipcall.ui;

import android.content.Intent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.ipcall.a.g.d;
import com.tencent.mm.plugin.ipcall.a.g.k;
import com.tencent.mm.plugin.ipcall.a.g.m;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.afn;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.y.at;
import java.util.ArrayList;

public final class e
{
  ListView moo;
  public h mop;
  View moq;
  public IPCallAddressUI mor;
  boolean mos;
  public TextView mot;
  public TextView mou;
  public LinearLayout mov;
  public TextView mow;
  public ImageView mox;
  
  public e(IPCallAddressUI paramIPCallAddressUI, ListView paramListView, View paramView)
  {
    GMTrace.i(11638824501248L, 86716);
    this.mos = false;
    this.mot = null;
    this.mou = null;
    this.mov = null;
    this.mow = null;
    this.mox = null;
    this.moo = paramListView;
    this.mor = paramIPCallAddressUI;
    this.moq = paramView;
    GMTrace.o(11638824501248L, 86716);
  }
  
  public final void aJf()
  {
    GMTrace.i(15069429628928L, 112276);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(11727139766272L, 87374);
        at.AR();
        if (((Boolean)com.tencent.mm.y.c.xh().get(w.a.vrY, Boolean.valueOf(false))).booleanValue()) {
          e.this.mox.setVisibility(0);
        }
        String str2;
        for (;;)
        {
          at.AR();
          String str1 = (String)com.tencent.mm.y.c.xh().get(w.a.vsa, "");
          at.AR();
          str2 = (String)com.tencent.mm.y.c.xh().get(w.a.vsb, "");
          if (bg.nm(str1)) {
            break;
          }
          e.this.mow.setText(str1);
          e.this.mov.setVisibility(0);
          GMTrace.o(11727139766272L, 87374);
          return;
          e.this.mox.setVisibility(8);
        }
        if (!bg.nm(str2))
        {
          e.this.mow.setText(str2);
          e.this.mov.setVisibility(0);
          GMTrace.o(11727139766272L, 87374);
          return;
        }
        e.this.mow.setText("");
        e.this.mov.setVisibility(8);
        GMTrace.o(11727139766272L, 87374);
      }
    });
    GMTrace.o(15069429628928L, 112276);
  }
  
  public final void aJg()
  {
    GMTrace.i(11638958718976L, 86717);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(15073724596224L, 112308);
        afn localafn = com.tencent.mm.plugin.ipcall.b.c.aJI();
        if (localafn != null)
        {
          e.this.mot.setText(localafn.uvh);
          if (!bg.nm(localafn.uvp))
          {
            e.this.mou.setText(localafn.uvp);
            e.this.mou.setVisibility(0);
            GMTrace.o(15073724596224L, 112308);
            return;
          }
          e.this.mou.setText("");
          e.this.mou.setVisibility(8);
          GMTrace.o(15073724596224L, 112308);
          return;
        }
        e.this.mot.setText("");
        e.this.mou.setText("");
        e.this.mou.setVisibility(8);
        GMTrace.o(15073724596224L, 112308);
      }
    });
    GMTrace.o(11638958718976L, 86717);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */