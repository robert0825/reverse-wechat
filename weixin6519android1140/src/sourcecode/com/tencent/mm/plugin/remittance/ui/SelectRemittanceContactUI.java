package com.tencent.mm.plugin.remittance.ui;

import android.content.Intent;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.g.b.af;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.wxpay.a.a;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.contact.MMBaseSelectContactUI;
import com.tencent.mm.ui.contact.m;
import com.tencent.mm.ui.contact.o;
import com.tencent.mm.ui.contact.q;
import com.tencent.mm.ui.contact.s;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

@com.tencent.mm.ui.base.a(19)
public class SelectRemittanceContactUI
  extends MMBaseSelectContactUI
{
  private int fromScene;
  private List<String> iVA;
  private View mRb;
  private List<String> ooU;
  
  public SelectRemittanceContactUI()
  {
    GMTrace.i(10832310173696L, 80707);
    GMTrace.o(10832310173696L, 80707);
  }
  
  protected final void PY()
  {
    GMTrace.i(10832578609152L, 80709);
    super.PY();
    this.fromScene = getIntent().getIntExtra("key_from_scene", 0);
    Object localObject = getIntent().getStringExtra("recent_remittance_contact_list");
    w.v("MicroMsg.SelectRemittanceContactUI", "recent list:" + (String)localObject);
    this.ooU = new ArrayList();
    if (!bg.nm((String)localObject)) {
      this.ooU = bg.g(((String)localObject).split(","));
    }
    localObject = new HashSet();
    ((HashSet)localObject).addAll(s.cgI());
    ((HashSet)localObject).addAll(s.cgJ());
    String str = getIntent().getStringExtra("Select_block_List");
    if (!bg.nm(str)) {
      ((HashSet)localObject).addAll(bg.g(str.split(",")));
    }
    this.iVA = new ArrayList();
    this.iVA.addAll((Collection)localObject);
    GMTrace.o(10832578609152L, 80709);
  }
  
  protected final boolean PZ()
  {
    GMTrace.i(10833383915520L, 80715);
    GMTrace.o(10833383915520L, 80715);
    return false;
  }
  
  protected final boolean Qa()
  {
    GMTrace.i(10833518133248L, 80716);
    GMTrace.o(10833518133248L, 80716);
    return false;
  }
  
  protected final String Qb()
  {
    GMTrace.i(10833652350976L, 80717);
    if (this.fromScene == 1)
    {
      str = getString(a.i.tgm);
      GMTrace.o(10833652350976L, 80717);
      return str;
    }
    String str = getString(a.i.sYy);
    GMTrace.o(10833652350976L, 80717);
    return str;
  }
  
  protected final o Qc()
  {
    GMTrace.i(10832712826880L, 80710);
    b localb = new b(this, this.ooU, this.iVA, this.fromScene);
    GMTrace.o(10832712826880L, 80710);
    return localb;
  }
  
  protected final m Qd()
  {
    GMTrace.i(10832847044608L, 80711);
    q localq = new q(this, this.iVA, false, this.scene);
    GMTrace.o(10832847044608L, 80711);
    return localq;
  }
  
  protected final void a(ListView paramListView, int paramInt)
  {
    GMTrace.i(10833786568704L, 80718);
    super.a(paramListView, paramInt);
    View localView;
    TextView localTextView;
    if (this.mRb == null)
    {
      localView = View.inflate(this, a.g.sOD, null);
      this.mRb = localView.findViewById(a.f.content);
      localTextView = (TextView)localView.findViewById(a.f.chy);
      if (this.fromScene != 1) {
        break label91;
      }
      localTextView.setText(a.i.tgk);
    }
    for (;;)
    {
      paramListView.addHeaderView(localView);
      this.mRb.setVisibility(paramInt);
      GMTrace.o(10833786568704L, 80718);
      return;
      label91:
      localTextView.setText(a.i.sYg);
    }
  }
  
  public final int[] aMW()
  {
    GMTrace.i(10832981262336L, 80712);
    if (this.fromScene == 1)
    {
      GMTrace.o(10832981262336L, 80712);
      return new int[] { 131072, 131075 };
    }
    GMTrace.o(10832981262336L, 80712);
    return new int[] { 131072 };
  }
  
  protected final void aMX()
  {
    GMTrace.i(10833920786432L, 80719);
    super.aMX();
    aLo();
    GMTrace.o(10833920786432L, 80719);
  }
  
  public final void hF(int paramInt)
  {
    GMTrace.i(10833115480064L, 80713);
    if (paramInt < this.nVC.getHeaderViewsCount())
    {
      w.i("MicroMsg.SelectRemittanceContactUI", "Click HeaderView position=%d", new Object[] { Integer.valueOf(paramInt) });
      w.i("MicroMsg.SelectRemittanceContactUI", "doCallSelectContactUI");
      localObject = new Intent();
      if (this.fromScene == 1)
      {
        ((Intent)localObject).putExtra("list_attr", s.q(new int[] { s.wTj, 16384, 64, 4096, 262144 }));
        ((Intent)localObject).putExtra("min_limit_num", 1);
        ((Intent)localObject).putExtra("block_contact", getIntent().getStringExtra("Select_block_List"));
        ((Intent)localObject).putExtra("titile", getString(a.i.tgn));
      }
      for (;;)
      {
        d.a(this, ".ui.contact.SelectContactUI", (Intent)localObject, 1);
        overridePendingTransition(a.a.aLG, a.a.aLt);
        GMTrace.o(10833115480064L, 80713);
        return;
        paramInt = s.q(new int[] { 16, 1, 2, 4, 16384 });
        ((Intent)localObject).putExtra("list_type", 0);
        ((Intent)localObject).putExtra("list_attr", paramInt);
        ((Intent)localObject).putExtra("titile", getString(a.i.sYx));
        ((Intent)localObject).putExtra("sub_title", getString(a.i.the));
      }
    }
    Object localObject = (com.tencent.mm.ui.contact.a.a)this.nVC.getAdapter().getItem(paramInt);
    if (localObject == null)
    {
      GMTrace.o(10833115480064L, 80713);
      return;
    }
    localObject = ((com.tencent.mm.ui.contact.a.a)localObject).iBi;
    if (localObject == null)
    {
      GMTrace.o(10833115480064L, 80713);
      return;
    }
    localObject = ((af)localObject).field_username;
    w.i("MicroMsg.SelectRemittanceContactUI", "doClickUser=%s", new Object[] { localObject });
    Intent localIntent = new Intent();
    localIntent.putExtra("Select_Conv_User", (String)localObject);
    setResult(-1, localIntent);
    finish();
    aLo();
    if ((cgy() instanceof b))
    {
      paramInt -= this.nVC.getHeaderViewsCount();
      localObject = (b)cgy();
      w.d("MicroMsg.RecentConversationAdapter", "pos: %s", new Object[] { Integer.valueOf(paramInt) });
      if (((b)localObject).ooS < 0) {
        break label481;
      }
      if (((b)localObject).ooT >= 0) {
        break label460;
      }
      paramInt = 1;
    }
    for (;;)
    {
      if (paramInt != 0) {
        g.ork.i(13721, new Object[] { Integer.valueOf(6), Integer.valueOf(1) });
      }
      GMTrace.o(10833115480064L, 80713);
      return;
      label460:
      if ((paramInt > ((b)localObject).ooS) && (paramInt < ((b)localObject).ooT)) {
        paramInt = 1;
      } else {
        label481:
        paramInt = 0;
      }
    }
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(10833249697792L, 80714);
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
      GMTrace.o(10833249697792L, 80714);
      return;
      w.i("MicroMsg.SelectRemittanceContactUI", "onActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2 + ", data = null");
    }
    w.e("MicroMsg.SelectRemittanceContactUI", "onActivityResult, unknown requestCode = " + paramInt1);
    GMTrace.o(10833249697792L, 80714);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(10832444391424L, 80708);
    super.onCreate(paramBundle);
    GMTrace.o(10832444391424L, 80708);
  }
  
  public boolean onKeyDown(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(10834055004160L, 80720);
    if (paramKeyEvent.getKeyCode() == 4)
    {
      GMTrace.o(10834055004160L, 80720);
      return true;
    }
    boolean bool = super.onKeyDown(paramInt, paramKeyEvent);
    GMTrace.o(10834055004160L, 80720);
    return bool;
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(10834189221888L, 80721);
    if (paramInt == 4) {
      aMX();
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(10834189221888L, 80721);
    return bool;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\remittance\ui\SelectRemittanceContactUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */