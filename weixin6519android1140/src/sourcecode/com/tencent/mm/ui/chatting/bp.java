package com.tencent.mm.ui.chatting;

import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.StateListDrawable;
import android.view.ContextMenu;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.k;
import com.tencent.mm.pluginsdk.model.app.l;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.u;
import com.tencent.mm.x.f.a;
import com.tencent.mm.y.bc;

public final class bp
  extends ah
{
  private En_5b8fbb1e.a wvE;
  
  public bp()
  {
    super(52);
    GMTrace.i(2224658841600L, 16575);
    GMTrace.o(2224658841600L, 16575);
  }
  
  public final View a(LayoutInflater paramLayoutInflater, View paramView)
  {
    GMTrace.i(2224793059328L, 16576);
    Object localObject;
    if ((paramView != null) && (paramView.getTag() != null) && ((paramView.getTag() instanceof a)))
    {
      localObject = paramView;
      if (((a)paramView.getTag()).type == this.jHw) {}
    }
    else
    {
      localObject = new bj(paramLayoutInflater, R.i.csD);
      ((View)localObject).setTag(new a(this.jHw).ds((View)localObject));
    }
    GMTrace.o(2224793059328L, 16576);
    return (View)localObject;
  }
  
  public final void a(ah.a parama, int paramInt, En_5b8fbb1e.a parama1, au paramau, String paramString)
  {
    GMTrace.i(2224927277056L, 16577);
    this.wvE = parama1;
    a locala = (a)parama;
    Object localObject1 = an.bJI().er(paramau.field_msgId);
    Object localObject2 = paramau.field_content;
    if ((localObject1 != null) && (localObject2 != null)) {
      paramString = f.a.C((String)localObject2, paramau.field_reserved);
    }
    for (;;)
    {
      dr localdr = new dr(paramau, parama1.wqK, paramInt, null, 0, (byte)0);
      HardDeviceChattingItemView localHardDeviceChattingItemView = (HardDeviceChattingItemView)parama.wvA;
      int j;
      int k;
      int i;
      if ((paramString != null) && ((paramString.showType == 1) || (paramString.gjp == 1))) {
        if (t.nm(paramString.gjk))
        {
          localObject2 = paramString.gjg;
          Object localObject3 = paramString.gjh;
          if (!bg.nm((String)localObject2))
          {
            localObject1 = localObject3;
            paramau = (au)localObject2;
            if (!bg.nm((String)localObject3)) {}
          }
          else
          {
            w.e("MicroMsg.HardDeviceChattingItemView", "color is null or highlight color is null, color = %s, highlight color = %s", new Object[] { localObject2, localObject3 });
            paramau = "#ffffff";
            localObject1 = "#ffffff";
          }
          localObject2 = new StateListDrawable();
          localObject3 = new ColorDrawable(Color.parseColor((String)localObject1));
          ((StateListDrawable)localObject2).addState(new int[] { 16842919 }, (Drawable)localObject3);
          localObject1 = new ColorDrawable(Color.parseColor((String)localObject1));
          ((StateListDrawable)localObject2).addState(new int[] { 16842908 }, (Drawable)localObject1);
          localObject1 = new ColorDrawable(Color.parseColor(paramau));
          ((StateListDrawable)localObject2).addState(new int[] { 16842766 }, (Drawable)localObject1);
          paramau = new ColorDrawable(Color.parseColor(paramau));
          ((StateListDrawable)localObject2).addState(new int[0], paramau);
          localHardDeviceChattingItemView.setBackgroundDrawable((Drawable)localObject2);
          paramString.gjk = "#ffffff";
          paramau = paramString.gji;
          localObject1 = paramString.gjj;
          j = R.e.white;
          k = R.e.white;
          i = k;
          paramInt = j;
          if (!t.nm(paramau))
          {
            i = k;
            paramInt = j;
            if (!t.nm((String)localObject1)) {
              paramInt = j;
            }
          }
        }
      }
      try
      {
        i = Color.parseColor(paramau);
        paramInt = i;
        j = Color.parseColor((String)localObject1);
        paramInt = i;
        i = j;
        paramau = new StateListDrawable();
        localObject1 = new ColorDrawable(i);
        paramau.addState(new int[] { 16842919 }, (Drawable)localObject1);
        localObject1 = new ColorDrawable(i);
        paramau.addState(new int[] { 16842908 }, (Drawable)localObject1);
        localObject1 = new ColorDrawable(paramInt);
        paramau.addState(new int[] { 16842766 }, (Drawable)localObject1);
        localObject1 = new ColorDrawable(paramInt);
        paramau.addState(new int[0], (Drawable)localObject1);
        locala.wxq.setBackgroundDrawable(paramau);
        paramau = paramString.gjk;
        if (locala != null)
        {
          i = R.e.white;
          paramInt = i;
          if (t.nm(paramau)) {}
        }
      }
      catch (IllegalArgumentException paramau)
      {
        try
        {
          paramInt = Color.parseColor(paramau);
          locala.wxn.setTextColor(paramInt);
          locala.wxo.setTextColor(paramInt);
          locala.wxl.setTextColor(paramInt);
          locala.wxm.setTextColor(paramInt);
          locala.wxp.setTextColor(paramInt);
          locala.wxn.setText(paramString.gjc);
          locala.wxo.setText(paramString.gja);
          locala.wxl.setText(paramString.gje);
          locala.wxm.setText(paramString.gjd);
          locala.wxp.setText(paramString.gjf);
          if (!t.nm(paramString.gjl))
          {
            locala.wxr.setVisibility(0);
            a.b.o(locala.wxr, paramString.gjl);
            parama.wvA.setOnLongClickListener(parama1.wvd.wyY);
            parama.wvA.setOnTouchListener(parama1.wvd.wza);
            parama.wvA.setTag(localdr);
            parama.wvA.setOnClickListener(parama1.wvd.wyW);
            GMTrace.o(2224927277056L, 16577);
            return;
            if (localObject1 == null) {}
            for (boolean bool = true;; bool = false)
            {
              w.e("MicroMsg.ChattingItemHardDeviceMsg", "amessage:%b, %s, %d, %s", new Object[] { Boolean.valueOf(bool), localObject2, Long.valueOf(paramau.field_msgId), paramString });
              paramString = null;
              break;
            }
            paramau = paramau;
            w.w("MicroMsg.ChattingItemHardDeviceMsg", "hy: line color given color is incorrect. use default");
            i = k;
          }
        }
        catch (IllegalArgumentException paramau)
        {
          for (;;)
          {
            w.w("MicroMsg.ChattingItemHardDeviceMsg", "hy: given color is incorrect.use default");
            paramInt = i;
            continue;
            locala.wxr.setVisibility(8);
          }
        }
      }
    }
  }
  
  public final boolean a(ContextMenu paramContextMenu, View paramView, au paramau)
  {
    GMTrace.i(2225061494784L, 16578);
    paramContextMenu.add(((dr)paramView.getTag()).position, 100, 0, this.wvE.getString(R.l.dgd));
    GMTrace.o(2225061494784L, 16578);
    return false;
  }
  
  public final boolean a(MenuItem paramMenuItem, En_5b8fbb1e.a parama, au paramau)
  {
    GMTrace.i(2225195712512L, 16579);
    switch (paramMenuItem.getItemId())
    {
    }
    for (;;)
    {
      GMTrace.o(2225195712512L, 16579);
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
    GMTrace.i(2225329930240L, 16580);
    String str = paramau.field_content;
    paramView = f.a.C(str, paramau.field_reserved);
    if (paramView == null)
    {
      w.i("MicroMsg.ChattingItemHardDeviceMsg", "onItemClick, content is null.");
      GMTrace.o(2225329930240L, 16580);
      return false;
    }
    w.d("MicroMsg.ChattingItemHardDeviceMsg", "onItemClick, url is (%s).", new Object[] { paramView.url });
    if (!t.nm(paramView.url))
    {
      paramau = new Intent();
      paramau.putExtra("rawUrl", paramView.url);
      com.tencent.mm.bj.d.b(parama.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramau);
      GMTrace.o(2225329930240L, 16580);
      return true;
    }
    int i;
    if (!t.nm(paramView.gjb))
    {
      i = paramView.gjr;
      if (System.currentTimeMillis() - i * 1000L >= 2592000000L)
      {
        i = 1;
        if (i != 0) {
          break label333;
        }
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
        com.tencent.mm.bj.d.b(parama.vKB.vKW, "exdevice", ".ui.ExdeviceRankInfoUI", localIntent);
        com.tencent.mm.plugin.sport.b.d.nU(28);
      }
    }
    for (;;)
    {
      GMTrace.o(2225329930240L, 16580);
      return true;
      i = 0;
      break;
      label333:
      com.tencent.mm.bj.d.x(parama.vKB.vKW, "exdevice", ".ui.ExdeviceExpireUI");
    }
  }
  
  final class a
    extends ah.a
  {
    protected TextView wxl;
    protected TextView wxm;
    protected TextView wxn;
    protected TextView wxo;
    protected TextView wxp;
    protected TextView wxq;
    protected ImageView wxr;
    
    public a(int paramInt)
    {
      super();
      GMTrace.i(2230430203904L, 16618);
      GMTrace.o(2230430203904L, 16618);
    }
    
    public final a ds(View paramView)
    {
      GMTrace.i(2230564421632L, 16619);
      super.dq(paramView);
      this.wxl = ((TextView)paramView.findViewById(R.h.cfV));
      this.wxn = ((TextView)paramView.findViewById(R.h.bWm));
      this.wxm = ((TextView)paramView.findViewById(R.h.cfW));
      this.wxo = ((TextView)paramView.findViewById(R.h.bWn));
      this.wxp = ((TextView)paramView.findViewById(R.h.ckW));
      this.wxq = ((TextView)paramView.findViewById(R.h.bFL));
      this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
      this.wxr = ((ImageView)paramView.findViewById(R.h.ckS));
      GMTrace.o(2230564421632L, 16619);
      return this;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\bp.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */