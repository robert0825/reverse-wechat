package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Color;
import android.text.TextUtils.TruncateAt;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.au;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.f;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.c;

public final class bq
  extends ah
{
  public bq()
  {
    super(57);
    GMTrace.i(2145873035264L, 15988);
    GMTrace.o(2145873035264L, 15988);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2146007252992L, 15989);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof a)))
    {
      localObject = paramView;
      if (((a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csC);
      ((View)localObject).setTag(new a(this.jHw).dt((View)localObject));
    }
    GMTrace.o(2146007252992L, 15989);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2146141470720L, 15990);
    a locala = (a)parama;
    f localf = an.bJI().er(paramau.field_msgId);
    String str = paramau.field_content;
    if ((localf != null) && (str != null))
    {
      paramString = f.a.C(str, paramau.field_reserved);
      paramau = new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0);
      if ((paramString != null) && ((paramString.showType == 2) || (paramString.gjp == 2) || (paramString.gjp == 4)))
      {
        a.b.o(locala.gDc, paramString.gjt);
        locala.wxt.J(parama1.getResources().getDimension(R.f.aQF));
        locala.wxt.setTextColor(Color.parseColor("#BF000000"));
        locala.wxt.setEllipsize(TextUtils.TruncateAt.END);
        locala.wxt.cag();
        locala.wxt.whw = true;
        locala.wxt.setText(h.a(parama1.vKB.vKW, paramString.gjs));
      }
      parama.wvA.setOnLongClickListener(parama1.wvd.wyY);
      parama.wvA.setOnTouchListener(parama1.wvd.wza);
      parama.wvA.setTag(paramau);
      parama.wvA.setOnClickListener(parama1.wvd.wyW);
      GMTrace.o(2146141470720L, 15990);
      return;
    }
    if (localf == null) {}
    for (boolean bool = true;; bool = false)
    {
      w.e("MicrMsg.ChattingItemHardDeviceMsgLike", "amessage:%b, %s, %d, %s", new Object[] { Boolean.valueOf(bool), str, Long.valueOf(paramau.field_msgId), paramString });
      paramString = null;
      break;
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2146275688448L, 15991);
    paramContextMenu.add(((dr)paramView.getTag()).position, 100, 0, paramView.getContext().getString(R.l.dgd));
    GMTrace.o(2146275688448L, 15991);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2146409906176L, 15992);
    switch (paramMenuItem.getItemId())
    {
    }
    for (;;)
    {
      GMTrace.o(2146409906176L, 15992);
      return false;
      parama = paramau.field_content;
      paramMenuItem = null;
      if (parama != null) {
        paramMenuItem = f.a.eS(parama);
      }
      if (paramMenuItem != null) {
        l.es(paramau.field_msgId);
      }
      bc.S(paramau.field_msgId);
    }
  }
  
  public final boolean a(View paramView, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2146544123904L, 15993);
    w.i("MicrMsg.ChattingItemHardDeviceMsgLike", "hy: user clicked on the like item");
    if (paramau == null)
    {
      w.i("MicrMsg.ChattingItemHardDeviceMsgLike", "onItemClick, msg is null.");
      GMTrace.o(2146544123904L, 15993);
      return false;
    }
    String str = paramau.field_content;
    paramView = f.a.C(str, paramau.field_reserved);
    if (paramView == null)
    {
      w.i("MicrMsg.ChattingItemHardDeviceMsgLike", "onItemClick, content is null.");
      GMTrace.o(2146544123904L, 15993);
      return false;
    }
    w.d("MicrMsg.ChattingItemHardDeviceMsgLike", "onItemClick, url is (%s).", new Object[] { paramView.url });
    if (!t.nm(paramView.url))
    {
      paramau = new Intent();
      paramau.putExtra("rawUrl", paramView.url);
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramau);
      GMTrace.o(2146544123904L, 15993);
      return true;
    }
    at.AR();
    if (c.yK().TE(paramView.gjt).va()) {
      w.i("MicrMsg.ChattingItemHardDeviceMsgLike", "we run black user");
    }
    for (;;)
    {
      GMTrace.o(2146544123904L, 15993);
      return false;
      if (paramView.showType == 2)
      {
        if (!t.nm(paramView.gjb))
        {
          Intent localIntent = new Intent();
          localIntent.putExtra("key_rank_info", str);
          localIntent.putExtra("key_rank_semi", paramau.field_reserved);
          localIntent.putExtra("key_rank_title", paramView.gjm);
          localIntent.putExtra("key_champion_info", paramView.gjn);
          localIntent.putExtra("key_champion_coverimg", paramView.gjn);
          localIntent.putExtra("rank_id", paramView.gjb);
          localIntent.putExtra("app_username", paramView.appName);
          localIntent.putExtra("device_type", paramView.gjq);
          localIntent.putExtra("key_champioin_username", paramView.gjl);
          localIntent.putExtra("locate_to_username", paramView.gjt);
          com.tencent.mm.bj.d.b(parama.vKB.vKW, "exdevice", ".ui.ExdeviceRankInfoUI", localIntent);
        }
        for (;;)
        {
          com.tencent.mm.plugin.sport.b.d.nU(30);
          break;
          paramau = new Intent();
          paramau.putExtra("key_is_latest", true);
          paramau.putExtra("app_username", paramView.appName);
          paramau.putExtra("device_type", paramView.gjq);
          paramau.putExtra("locate_to_username", paramView.gjt);
          com.tencent.mm.bj.d.b(parama.vKB.vKW, "exdevice", ".ui.ExdeviceRankInfoUI", paramau);
        }
      }
      if (paramView.showType == 4)
      {
        paramau = new Intent();
        paramau.putExtra("username", paramView.gjt);
        paramau.putExtra("app_username", "gh_43f2581f6fd6");
        com.tencent.mm.bj.d.b(parama.vKB.vKW, "exdevice", ".ui.ExdeviceProfileUI", paramau);
        com.tencent.mm.plugin.sport.b.d.nU(29);
      }
    }
  }
  
  final class a
    extends ah.a
  {
    protected ImageView gDc;
    protected NoMeasuredTextView wxt;
    
    public a(int paramInt)
    {
      super();
      GMTrace.i(2222511357952L, 16559);
      GMTrace.o(2222511357952L, 16559);
    }
    
    public final a dt(View paramView)
    {
      GMTrace.i(2222645575680L, 16560);
      super.dq(paramView);
      this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
      this.gDc = ((ImageView)paramView.findViewById(R.h.bKa));
      this.wxt = ((NoMeasuredTextView)paramView.findViewById(R.h.chw));
      GMTrace.o(2222645575680L, 16560);
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bq.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */