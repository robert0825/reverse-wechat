package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.e;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.bj.d;
import com.tencent.mm.kernel.b;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ae;
import com.tencent.mm.plugin.sns.storage.t;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.o;
import com.tencent.mm.ui.o.a;
import com.tencent.mm.y.q;

public class SnsTagPartlyUI
  extends MMActivity
  implements e
{
  protected r hsU;
  private ListView juD;
  private a qge;
  private View.OnClickListener qgf;
  
  public SnsTagPartlyUI()
  {
    GMTrace.i(8618791403520L, 64215);
    this.hsU = null;
    this.qgf = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8552353628160L, 63720);
        if (SnsTagPartlyUI.a(SnsTagPartlyUI.this) == null)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SnsTagPartlyUI", "The adapter is null..");
          GMTrace.o(8552353628160L, 63720);
          return;
        }
        paramAnonymousView = paramAnonymousView.getTag();
        if (paramAnonymousView == null)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SnsTagPartlyUI", "The tag is null..");
          GMTrace.o(8552353628160L, 63720);
          return;
        }
        if (!(paramAnonymousView instanceof Integer))
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.SnsTagPartlyUI", "The tag is not a instance of Integer.");
          GMTrace.o(8552353628160L, 63720);
          return;
        }
        paramAnonymousView = (com.tencent.mm.plugin.sns.storage.s)SnsTagPartlyUI.a(SnsTagPartlyUI.this).getItem(((Integer)paramAnonymousView).intValue());
        SnsTagPartlyUI.this.hsU = com.tencent.mm.ui.base.h.a(SnsTagPartlyUI.this, null, true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
          {
            GMTrace.i(8336263086080L, 62110);
            GMTrace.o(8336263086080L, 62110);
          }
        });
        com.tencent.mm.kernel.h.xz();
        com.tencent.mm.kernel.h.xx().fYr.a(new com.tencent.mm.plugin.sns.model.w(paramAnonymousView.field_tagId, paramAnonymousView.field_tagName), 0);
        GMTrace.o(8552353628160L, 63720);
      }
    };
    GMTrace.o(8618791403520L, 64215);
  }
  
  protected final void MP()
  {
    GMTrace.i(8619328274432L, 64219);
    oM(i.j.pih);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8644024336384L, 64403);
        SnsTagPartlyUI.this.finish();
        GMTrace.o(8644024336384L, 64403);
        return true;
      }
    });
    this.juD = ((ListView)findViewById(i.f.pdX));
    this.juD.setOnItemClickListener(new AdapterView.OnItemClickListener()
    {
      public final void onItemClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(8677578768384L, 64653);
        if (paramAnonymousInt < SnsTagPartlyUI.a(SnsTagPartlyUI.this).getCount() - 1)
        {
          paramAnonymousAdapterView = new Intent();
          paramAnonymousView = (com.tencent.mm.plugin.sns.storage.s)SnsTagPartlyUI.a(SnsTagPartlyUI.this).getItem(paramAnonymousInt);
          if (paramAnonymousView == null)
          {
            GMTrace.o(8677578768384L, 64653);
            return;
          }
          paramAnonymousAdapterView.putExtra("k_sns_tag_id", paramAnonymousView.field_tagId);
          paramAnonymousAdapterView.setClass(SnsTagPartlyUI.this, SnsTagDetailUI.class);
          SnsTagPartlyUI.this.startActivity(paramAnonymousAdapterView);
          GMTrace.o(8677578768384L, 64653);
          return;
        }
        paramAnonymousAdapterView = new Intent();
        paramAnonymousView = q.zE();
        paramAnonymousAdapterView.putExtra("titile", SnsTagPartlyUI.this.getString(i.j.phK));
        paramAnonymousAdapterView.putExtra("list_type", 1);
        paramAnonymousAdapterView.putExtra("list_attr", com.tencent.mm.ui.contact.s.q(new int[] { com.tencent.mm.ui.contact.s.wTk, 1024 }));
        paramAnonymousAdapterView.putExtra("block_contact", paramAnonymousView);
        d.a(SnsTagPartlyUI.this, ".ui.contact.SelectContactUI", paramAnonymousAdapterView, 1);
        GMTrace.o(8677578768384L, 64653);
      }
    });
    this.qge = new a(this);
    View localView = View.inflate(this, i.g.pgr, null);
    this.juD.addFooterView(localView);
    this.juD.setAdapter(this.qge);
    a(0, getString(i.j.pkI), new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(8395453104128L, 62551);
        paramAnonymousMenuItem = SnsTagPartlyUI.a(SnsTagPartlyUI.this);
        boolean bool;
        SnsTagPartlyUI localSnsTagPartlyUI;
        if (!SnsTagPartlyUI.a(SnsTagPartlyUI.this).qgi)
        {
          bool = true;
          paramAnonymousMenuItem.qgi = bool;
          localSnsTagPartlyUI = SnsTagPartlyUI.this;
          if (!SnsTagPartlyUI.a(SnsTagPartlyUI.this).qgi) {
            break label96;
          }
        }
        label96:
        for (paramAnonymousMenuItem = SnsTagPartlyUI.this.getString(i.j.cTh);; paramAnonymousMenuItem = SnsTagPartlyUI.this.getString(i.j.pkI))
        {
          localSnsTagPartlyUI.aH(0, paramAnonymousMenuItem);
          SnsTagPartlyUI.a(SnsTagPartlyUI.this).notifyDataSetChanged();
          GMTrace.o(8395453104128L, 62551);
          return true;
          bool = false;
          break;
        }
      }
    });
    this.qge.vKu = new o.a()
    {
      public final void QC()
      {
        boolean bool = true;
        GMTrace.i(8515577970688L, 63446);
        SnsTagPartlyUI localSnsTagPartlyUI = SnsTagPartlyUI.this;
        if (SnsTagPartlyUI.a(SnsTagPartlyUI.this).getCount() > 1) {}
        for (;;)
        {
          localSnsTagPartlyUI.lf(bool);
          GMTrace.o(8515577970688L, 63446);
          return;
          bool = false;
        }
      }
      
      public final void QD()
      {
        GMTrace.i(8515443752960L, 63445);
        GMTrace.o(8515443752960L, 63445);
      }
    };
    GMTrace.o(8619328274432L, 64219);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, k paramk)
  {
    GMTrace.i(8619730927616L, 64222);
    com.tencent.mm.sdk.platformtools.w.i("MicroMsg.SnsTagPartlyUI", "onSceneEnd: errType = " + paramInt1 + " errCode = " + paramInt2 + " errMsg = " + paramString);
    if (this.hsU != null)
    {
      this.hsU.dismiss();
      this.hsU = null;
    }
    if (this.qge != null) {
      this.qge.a("", null);
    }
    GMTrace.o(8619730927616L, 64222);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(8619462492160L, 64220);
    int i = i.g.pgs;
    GMTrace.o(8619462492160L, 64220);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(8619596709888L, 64221);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if (paramInt2 != -1)
    {
      GMTrace.o(8619596709888L, 64221);
      return;
    }
    switch (paramInt1)
    {
    }
    for (;;)
    {
      GMTrace.o(8619596709888L, 64221);
      return;
      if (paramIntent == null)
      {
        GMTrace.o(8619596709888L, 64221);
        return;
      }
      String str = paramIntent.getStringExtra("Select_Contact");
      paramIntent = paramIntent.getStringExtra("Select_room_name");
      if (str == null)
      {
        GMTrace.o(8619596709888L, 64221);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("k_sns_tag_id", 0);
      localIntent.putExtra("k_sns_tag_name", bg.aq(paramIntent, ""));
      localIntent.putExtra("k_sns_tag_list", str);
      localIntent.setClass(this, SnsTagDetailUI.class);
      startActivity(localIntent);
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(8618925621248L, 64216);
    super.onCreate(paramBundle);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(292, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.a(290, this);
    MP();
    GMTrace.o(8618925621248L, 64216);
  }
  
  public void onDestroy()
  {
    GMTrace.i(8619059838976L, 64217);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(292, this);
    com.tencent.mm.kernel.h.xz();
    com.tencent.mm.kernel.h.xx().fYr.b(290, this);
    if (this.qge != null) {
      this.qge.aJe();
    }
    super.onDestroy();
    GMTrace.o(8619059838976L, 64217);
  }
  
  public void onResume()
  {
    GMTrace.i(8619194056704L, 64218);
    super.onResume();
    if (this.qge != null) {
      this.qge.a("", null);
    }
    GMTrace.o(8619194056704L, 64218);
  }
  
  final class a
    extends o<com.tencent.mm.plugin.sns.storage.s>
  {
    private Context context;
    public boolean qgi;
    
    public a(Context paramContext)
    {
      super(new com.tencent.mm.plugin.sns.storage.s());
      GMTrace.i(8582552616960L, 63945);
      this.qgi = false;
      this.context = paramContext;
      GMTrace.o(8582552616960L, 63945);
    }
    
    public final void QF()
    {
      GMTrace.i(8582821052416L, 63947);
      setCursor(ae.bjj().getCursor());
      notifyDataSetChanged();
      GMTrace.o(8582821052416L, 63947);
    }
    
    protected final void QG()
    {
      GMTrace.i(8582955270144L, 63948);
      aJe();
      QF();
      GMTrace.o(8582955270144L, 63948);
    }
    
    protected final int aGD()
    {
      GMTrace.i(8583089487872L, 63949);
      GMTrace.o(8583089487872L, 63949);
      return 1;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(8582686834688L, 63946);
      int i;
      if (paramView == null)
      {
        paramViewGroup = new a();
        paramView = View.inflate(this.context, i.g.peY, null);
        paramViewGroup.qgj = ((TextView)paramView.findViewById(i.f.pek));
        paramViewGroup.qgk = ((TextView)paramView.findViewById(i.f.pdU));
        paramViewGroup.jUq = ((Button)paramView.findViewById(i.f.aVV));
        paramView.setTag(paramViewGroup);
        if (oR(paramInt)) {
          break label239;
        }
        Object localObject = (com.tencent.mm.plugin.sns.storage.s)getItem(paramInt);
        paramViewGroup.qgj.setText(((com.tencent.mm.plugin.sns.storage.s)localObject).field_tagName);
        paramViewGroup.qgk.setVisibility(0);
        paramViewGroup.qgk.setText(" (" + ((com.tencent.mm.plugin.sns.storage.s)localObject).field_count + ") ");
        localObject = paramViewGroup.jUq;
        if (!this.qgi) {
          break label232;
        }
        i = 0;
        label179:
        ((Button)localObject).setVisibility(i);
        paramViewGroup.jUq.setOnClickListener(SnsTagPartlyUI.b(SnsTagPartlyUI.this));
        paramViewGroup.jUq.setTag(Integer.valueOf(paramInt));
      }
      for (;;)
      {
        GMTrace.o(8582686834688L, 63946);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        break;
        label232:
        i = 8;
        break label179;
        label239:
        paramViewGroup.qgj.setText(i.j.plo);
        paramViewGroup.qgk.setVisibility(8);
        paramViewGroup.jUq.setVisibility(8);
      }
    }
    
    final class a
    {
      Button jUq;
      TextView qgj;
      TextView qgk;
      
      a()
      {
        GMTrace.i(8471957209088L, 63121);
        GMTrace.o(8471957209088L, 63121);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsTagPartlyUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */