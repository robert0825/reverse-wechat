package com.tencent.mm.plugin.luckymoney.ui;

import android.content.Intent;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.a.a;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.contact.q;
import com.tencent.mm.ui.contact.t;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

public class SelectLuckyMoneyContactUI
  extends MMBaseSelectContactUI
{
  private List<String> iVA;
  private View mRb;
  
  public SelectLuckyMoneyContactUI()
  {
    GMTrace.i(9791988563968L, 72956);
    GMTrace.o(9791988563968L, 72956);
  }
  
  protected final void PY()
  {
    GMTrace.i(9792122781696L, 72957);
    super.PY();
    HashSet localHashSet = new HashSet();
    localHashSet.addAll(com.tencent.mm.ui.contact.s.cgI());
    localHashSet.addAll(com.tencent.mm.ui.contact.s.cgJ());
    String str = getIntent().getStringExtra("Select_block_List");
    if (!bg.nm(str)) {
      localHashSet.addAll(bg.g(str.split(",")));
    }
    this.iVA = new ArrayList();
    this.iVA.addAll(localHashSet);
    GMTrace.o(9792122781696L, 72957);
  }
  
  protected final boolean PZ()
  {
    GMTrace.i(9792391217152L, 72959);
    GMTrace.o(9792391217152L, 72959);
    return false;
  }
  
  protected final boolean Qa()
  {
    GMTrace.i(9792525434880L, 72960);
    GMTrace.o(9792525434880L, 72960);
    return false;
  }
  
  protected final String Qb()
  {
    GMTrace.i(9792659652608L, 72961);
    String str = getString(a.i.sVb);
    GMTrace.o(9792659652608L, 72961);
    return str;
  }
  
  protected final o Qc()
  {
    GMTrace.i(9792793870336L, 72962);
    t localt = new t(this, this.iVA);
    GMTrace.o(9792793870336L, 72962);
    return localt;
  }
  
  protected final com.tencent.mm.ui.contact.m Qd()
  {
    GMTrace.i(9792928088064L, 72963);
    q localq = new q(this, this.iVA, false, this.scene);
    GMTrace.o(9792928088064L, 72963);
    return localq;
  }
  
  protected final void a(ListView paramListView, int paramInt)
  {
    GMTrace.i(9793196523520L, 72965);
    super.a(paramListView, paramInt);
    if (this.mRb == null)
    {
      View localView = View.inflate(this, a.g.sOD, null);
      this.mRb = localView.findViewById(a.f.content);
      ((TextView)localView.findViewById(a.f.chy)).setText(a.i.sUx);
      paramListView.addHeaderView(localView);
    }
    this.mRb.setVisibility(paramInt);
    GMTrace.o(9793196523520L, 72965);
  }
  
  public final int[] aMW()
  {
    GMTrace.i(9793062305792L, 72964);
    GMTrace.o(9793062305792L, 72964);
    return new int[] { 131072 };
  }
  
  protected final void aMX()
  {
    GMTrace.i(9793330741248L, 72966);
    super.aMX();
    aLo();
    GMTrace.o(9793330741248L, 72966);
  }
  
  public final void hF(int paramInt)
  {
    GMTrace.i(9792256999424L, 72958);
    if (paramInt < this.nVC.getHeaderViewsCount())
    {
      w.i("MicroMsg.SelectRemittanceContactUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
      w.i("MicroMsg.SelectRemittanceContactUI", "doCallSelectContactUI");
      paramInt = getIntent().getIntExtra("key_friends_num", 0);
      localObject = new Intent();
      int i = com.tencent.mm.ui.contact.s.q(new int[] { 16, 1, 2, 4, 16384, 64, 65536, 131072 });
      ((Intent)localObject).putExtra("list_type", 0);
      ((Intent)localObject).putExtra("list_attr", i);
      ((Intent)localObject).putExtra("max_limit_num", paramInt);
      ((Intent)localObject).putExtra("titile", getString(a.i.sVa, new Object[] { Integer.valueOf(paramInt) }));
      ((Intent)localObject).putExtra("sub_title", getString(a.i.tib));
      d.a(this, ".ui.contact.SelectContactUI", (Intent)localObject, 1);
      overridePendingTransition(a.a.aLG, a.a.aLt);
      GMTrace.o(9792256999424L, 72958);
      return;
    }
    Object localObject = (a)this.nVC.getAdapter().getItem(paramInt);
    if (localObject == null)
    {
      GMTrace.o(9792256999424L, 72958);
      return;
    }
    localObject = ((a)localObject).iBi;
    if (localObject == null)
    {
      GMTrace.o(9792256999424L, 72958);
      return;
    }
    String str = ((af)localObject).field_username;
    w.i("MicroMsg.SelectRemittanceContactUI", "doClickUser=%s", new Object[] { str });
    final Intent localIntent = new Intent();
    localIntent.putExtra("Select_Conv_User", str);
    localObject = null;
    if (com.tencent.mm.y.s.eb(str)) {
      localObject = getString(a.i.tgj, new Object[] { Integer.valueOf(com.tencent.mm.y.m.fk(str)) });
    }
    ((com.tencent.mm.pluginsdk.h)com.tencent.mm.kernel.h.h(com.tencent.mm.pluginsdk.h.class)).a(this.vKB, str, getString(a.i.dSl), str, (String)localObject, getString(a.i.cUs), new o.a()
    {
      public final void a(boolean paramAnonymousBoolean, String paramAnonymousString, int paramAnonymousInt)
      {
        GMTrace.i(9788767338496L, 72932);
        if (paramAnonymousBoolean)
        {
          SelectLuckyMoneyContactUI.this.setResult(-1, localIntent);
          SelectLuckyMoneyContactUI.this.finish();
        }
        GMTrace.o(9788767338496L, 72932);
      }
    });
    GMTrace.o(9792256999424L, 72958);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(9793599176704L, 72968);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramIntent != null) {
      w.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = " + paramIntent.toString());
    }
    while (paramInt1 == 1)
    {
      if (paramInt2 == -1)
      {
        w.i("MicroMsg.SelectRemittanceContactUI", "getIntent = " + getIntent());
        setResult(-1, paramIntent);
        finish();
      }
      GMTrace.o(9793599176704L, 72968);
      return;
      w.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = null");
    }
    w.e("MicroMsg.SelectRemittanceContactUI", "onActivityResult, unknown requestCode = " + paramInt1);
    GMTrace.o(9793599176704L, 72968);
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(9793464958976L, 72967);
    if (paramInt == 4) {
      aMX();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(9793464958976L, 72967);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\luckymoney\ui\SelectLuckyMoneyContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */