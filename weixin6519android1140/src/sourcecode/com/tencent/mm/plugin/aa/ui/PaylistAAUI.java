package com.tencent.mm.plugin.aa.ui;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.text.SpannableStringBuilder;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioGroup;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.aa.a.c.g.d;
import com.tencent.mm.plugin.wallet_core.id_verify.util.RealnameGuideHelper;
import com.tencent.mm.plugin.wxpay.a.c;
import com.tencent.mm.plugin.wxpay.a.e;
import com.tencent.mm.plugin.wxpay.a.f;
import com.tencent.mm.plugin.wxpay.a.g;
import com.tencent.mm.plugin.wxpay.a.i;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.k;
import com.tencent.mm.protocal.c.o;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.i;
import com.tencent.mm.ui.base.i.a;
import com.tencent.mm.ui.base.j.1;
import com.tencent.mm.ui.base.j.2;
import com.tencent.mm.ui.base.j.a;
import com.tencent.mm.ui.base.j.b;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.f.c.b;
import com.tencent.mm.ui.p;
import com.tencent.mm.v.a.d;
import com.tencent.mm.v.a.k;
import com.tencent.mm.vending.g.c;
import com.tencent.mm.vending.g.d.a;
import com.tencent.mm.wallet_core.ui.e;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.List;

public class PaylistAAUI
  extends BaseAAPresenterActivity
{
  private String eCV;
  private View hqY;
  private Dialog hqr;
  private String hsA;
  private String hsB;
  private String hsC;
  private String hsD;
  private int hsE;
  private String hsF;
  private long hsG;
  private com.tencent.mm.plugin.aa.a.c.g hsp;
  private com.tencent.mm.plugin.aa.a.c.f hsq;
  private LinearLayout hsr;
  private LinearLayout hss;
  private LinearLayout hst;
  private TextView hsu;
  private Button hsv;
  private TextView hsw;
  private TextView hsx;
  private TextView hsy;
  private TextView hsz;
  private String title;
  
  public PaylistAAUI()
  {
    GMTrace.i(5605469192192L, 41764);
    this.hsp = ((com.tencent.mm.plugin.aa.a.c.g)m(com.tencent.mm.plugin.aa.a.c.g.class));
    this.hsq = ((com.tencent.mm.plugin.aa.a.c.f)p(com.tencent.mm.plugin.aa.a.c.f.class));
    this.hqr = null;
    GMTrace.o(5605469192192L, 41764);
  }
  
  private void Qq()
  {
    GMTrace.i(5605737627648L, 41766);
    this.hqr = com.tencent.mm.wallet_core.ui.g.a(this, false, null);
    this.hqY.setVisibility(4);
    g.d locald = this.hsp.hpV;
    com.tencent.mm.vending.g.g.ckp().a(locald).d(new com.tencent.mm.vending.c.a() {}).a(new d.a()
    {
      public final void aH(Object paramAnonymousObject)
      {
        GMTrace.i(5637681446912L, 42004);
        w.i("MicroMsg.PaylistAAUI", "onInterrupt: %s", new Object[] { paramAnonymousObject });
        PaylistAAUI localPaylistAAUI = PaylistAAUI.this;
        if (paramAnonymousObject == null) {}
        for (paramAnonymousObject = "";; paramAnonymousObject = paramAnonymousObject.toString())
        {
          PaylistAAUI.a(localPaylistAAUI, (String)paramAnonymousObject);
          GMTrace.o(5637681446912L, 42004);
          return;
        }
      }
    });
    GMTrace.o(5605737627648L, 41766);
  }
  
  private void a(LinearLayout paramLinearLayout, com.tencent.mm.protocal.c.t paramt, boolean paramBoolean)
  {
    GMTrace.i(5606408716288L, 41771);
    LinearLayout localLinearLayout = (LinearLayout)getLayoutInflater().inflate(a.g.sNG, paramLinearLayout, false);
    Object localObject1 = (ImageView)localLinearLayout.findViewById(a.f.sDZ);
    TextView localTextView1 = (TextView)localLinearLayout.findViewById(a.f.sEa);
    TextView localTextView2 = (TextView)localLinearLayout.findViewById(a.f.sEb);
    Object localObject2 = localLinearLayout.findViewById(a.f.divider);
    if (paramBoolean) {
      ((View)localObject2).setVisibility(8);
    }
    for (;;)
    {
      a.b.a((ImageView)localObject1, paramt.tMv);
      localObject1 = this.vKB.vKW;
      Object localObject3 = this.hsq;
      localObject2 = paramt.tMv;
      localObject3 = ((com.tencent.mm.vending.app.a)localObject3).xwP.getStringExtra("chatroom");
      localTextView1.setText(com.tencent.mm.pluginsdk.ui.d.h.b((Context)localObject1, ((com.tencent.mm.plugin.messenger.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.messenger.a.a.class)).F((String)localObject2, (String)localObject3), localTextView1.getTextSize()));
      if (paramt.tMx != com.tencent.mm.plugin.aa.a.a.hon) {
        break;
      }
      localTextView2.setText(getString(a.i.sWK, new Object[] { Double.valueOf(paramt.tMi / 100.0D) }));
      localTextView2.setTextColor(getResources().getColor(a.c.smA));
      localTextView2.setVisibility(0);
      paramLinearLayout.addView(localLinearLayout);
      GMTrace.o(5606408716288L, 41771);
      return;
      ((View)localObject2).setVisibility(0);
    }
    if (paramt.tMx == com.tencent.mm.plugin.aa.a.a.hom)
    {
      localTextView2.setText(getString(a.i.sWC, new Object[] { Double.valueOf(paramt.tMi / 100.0D) }));
      localTextView2.setTextColor(getResources().getColor(a.c.smB));
      localTextView2.setVisibility(0);
      paramLinearLayout.addView(localLinearLayout);
      GMTrace.o(5606408716288L, 41771);
      return;
    }
    localTextView2.setVisibility(8);
    paramLinearLayout.addView(localLinearLayout);
    GMTrace.o(5606408716288L, 41771);
  }
  
  private void a(List<com.tencent.mm.protocal.c.t> paramList, String paramString, boolean paramBoolean)
  {
    GMTrace.i(5606140280832L, 41769);
    ((TextView)findViewById(a.f.sEf)).setText(paramString);
    paramString = this.hsy;
    int i;
    label59:
    com.tencent.mm.protocal.c.t localt;
    if (paramBoolean)
    {
      i = 0;
      paramString.setVisibility(i);
      paramString = (LinearLayout)findViewById(a.f.sEg);
      paramString.removeAllViews();
      i = 0;
      if (i >= paramList.size()) {
        break label127;
      }
      localt = (com.tencent.mm.protocal.c.t)paramList.get(i);
      if (i < paramList.size() - 1) {
        break label122;
      }
    }
    label122:
    for (paramBoolean = true;; paramBoolean = false)
    {
      a(paramString, localt, paramBoolean);
      i += 1;
      break label59;
      i = 8;
      break;
    }
    label127:
    GMTrace.o(5606140280832L, 41769);
  }
  
  private void d(List<com.tencent.mm.protocal.c.t> paramList, String paramString)
  {
    GMTrace.i(5606274498560L, 41770);
    ((TextView)findViewById(a.f.sDP)).setText(paramString);
    paramString = (LinearLayout)findViewById(a.f.sDQ);
    paramString.removeAllViews();
    int i = 0;
    if (i < paramList.size())
    {
      com.tencent.mm.protocal.c.t localt = (com.tencent.mm.protocal.c.t)paramList.get(i);
      if (i >= paramList.size() - 1) {}
      for (boolean bool = true;; bool = false)
      {
        a(paramString, localt, bool);
        i += 1;
        break;
      }
    }
    GMTrace.o(5606274498560L, 41770);
  }
  
  private static boolean w(int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(5606006063104L, 41768);
    if ((paramInt1 == com.tencent.mm.plugin.aa.a.a.hog) && (paramInt2 != com.tencent.mm.plugin.aa.a.a.hok) && (paramInt3 == com.tencent.mm.plugin.aa.a.a.hoc))
    {
      GMTrace.o(5606006063104L, 41768);
      return true;
    }
    GMTrace.o(5606006063104L, 41768);
    return false;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5606542934016L, 41772);
    int i = a.g.sNH;
    GMTrace.o(5606542934016L, 41772);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(5606677151744L, 41773);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    Object localObject;
    if (paramInt1 == 233)
    {
      if (paramInt2 == -1)
      {
        w.i("MicroMsg.PaylistAAUI", "pay success, payMsgId: %s", new Object[] { this.hsB });
        localObject = (RealnameGuideHelper)paramIntent.getParcelableExtra("key_realname_guide_helper");
        if (localObject != null)
        {
          w.i("MicroMsg.PaylistAAUI", "do realname guide");
          Intent localIntent = new Intent();
          localIntent.putExtra("key_realname_guide_helper", (Parcelable)localObject);
          d.b(this, "wallet_core", ".id_verify.RealnameDialogActivity", localIntent);
        }
        com.tencent.mm.plugin.aa.a.h.nt(this.hsC);
        finish();
        localObject = this.hsp.hpX;
        com.tencent.mm.vending.g.g.a(this.hsB, this.hsD, this.hsF).a((com.tencent.mm.vending.c.a)localObject).d(new com.tencent.mm.vending.c.a() {});
        paramIntent = paramIntent.getStringExtra("key_trans_id");
        localObject = this.hsp.hpY;
        com.tencent.mm.vending.g.g.a(Long.valueOf(this.hsG), this.eCV, paramIntent).a((com.tencent.mm.vending.c.a)localObject);
        com.tencent.mm.plugin.report.service.g.ork.a(407L, 12L, 1L, false);
        GMTrace.o(5606677151744L, 41773);
      }
    }
    else if ((paramInt1 == 222) && (paramInt2 == -1))
    {
      paramIntent = paramIntent.getStringExtra("Select_Conv_User");
      w.i("MicroMsg.PaylistAAUI", "select chatroom：%s", new Object[] { paramIntent });
      if (!bg.nm(paramIntent))
      {
        localObject = new Intent(this.vKB.vKW, LaunchAAUI.class);
        ((Intent)localObject).putExtra("enter_scene", 3);
        ((Intent)localObject).putExtra("chatroom_name", paramIntent);
        startActivity((Intent)localObject);
      }
    }
    GMTrace.o(5606677151744L, 41773);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5605603409920L, 41765);
    super.onCreate(paramBundle);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(5630836342784L, 41953);
        PaylistAAUI.this.finish();
        GMTrace.o(5630836342784L, 41953);
        return false;
      }
    });
    oM(a.i.sTX);
    this.hsC = getIntent().getStringExtra("chatroom");
    this.hsr = ((LinearLayout)findViewById(a.f.sEc));
    this.hss = ((LinearLayout)findViewById(a.f.sDV));
    this.hst = ((LinearLayout)findViewById(a.f.sDO));
    this.hsw = ((TextView)findViewById(a.f.sEd));
    this.hsx = ((TextView)findViewById(a.f.sDS));
    this.hqY = findViewById(a.f.bZh);
    this.hsy = ((TextView)findViewById(a.f.sEe));
    this.hsy.setClickable(true);
    this.hsy.setOnTouchListener(new k(this));
    paramBundle = new SpannableStringBuilder(getString(a.i.sWN));
    paramBundle.setSpan(new a(new a.a()
    {
      public final void PT()
      {
        GMTrace.i(5610032594944L, 41798);
        int i = a.i.sYK;
        if (!s.eb(PaylistAAUI.a(PaylistAAUI.this))) {
          i = a.i.sYL;
        }
        for (;;)
        {
          j.b localb = new j.b(PaylistAAUI.this);
          Object localObject1 = PaylistAAUI.this.getString(a.i.sYM);
          int j = com.tencent.mm.br.a.fromDPToPix(localb.mContext, (int)(20.0F * com.tencent.mm.br.a.dZ(localb.mContext)));
          if (!bg.nm((String)localObject1))
          {
            localObject1 = (SpannableString)b.a(localb.mContext, ((String)localObject1).toString(), j);
            localb.twQ.O((CharSequence)localObject1);
          }
          localObject1 = com.tencent.mm.ui.v.fb(PaylistAAUI.this).inflate(a.g.sOH, null);
          Object localObject2 = (ImageView)((View)localObject1).findViewById(a.f.image);
          Object localObject3 = (TextView)((View)localObject1).findViewById(a.f.text);
          ((ImageView)localObject2).setImageResource(a.e.soK);
          ((TextView)localObject3).setText(i);
          localb.twQ.dg((View)localObject1);
          i = a.i.cUs;
          localb.wbp = localb.mContext.getResources().getString(i);
          localb.wbq = PaylistAAUI.this.getString(a.i.cSk);
          localb.wbs = false;
          j.a local1 = new j.a()
          {
            public final void Qr()
            {
              GMTrace.i(20959306186752L, 156159);
              GMTrace.o(20959306186752L, 156159);
            }
          };
          j.a local2 = new j.a()
          {
            public final void Qr()
            {
              GMTrace.i(20959171969024L, 156158);
              PaylistAAUI.b(PaylistAAUI.this);
              GMTrace.o(20959171969024L, 156158);
            }
          };
          localb.oaD = localb.twQ.aax();
          if (localb.wbt != null) {
            localb.wbt.setTag(localb.oaD);
          }
          Context localContext = localb.mContext;
          i locali = localb.oaD;
          localObject2 = localb.wbp;
          localObject3 = localb.wbq;
          boolean bool = localb.wbs;
          if (!bg.nm((String)localObject2))
          {
            localObject1 = localObject2;
            if (((String)localObject2).length() != 0) {}
          }
          else
          {
            localObject1 = localContext.getResources().getString(a.k.cTM);
          }
          if (!bg.nm((String)localObject3))
          {
            localObject2 = localObject3;
            if (((String)localObject3).length() != 0) {}
          }
          else
          {
            localObject2 = localContext.getResources().getString(a.k.cSk);
          }
          locali.a((CharSequence)localObject1, true, new j.1(local2, locali));
          if (!bool) {
            locali.b((CharSequence)localObject2, true, new j.2(local1));
          }
          if (localb.wbr) {
            localb.oaD.BM(localb.mContext.getResources().getColor(a.d.aNQ));
          }
          localb.oaD.show();
          com.tencent.mm.plugin.report.service.g.ork.i(13721, new Object[] { Integer.valueOf(4), Integer.valueOf(7) });
          GMTrace.o(5610032594944L, 41798);
          return;
        }
      }
    }), 0, paramBundle.length(), 18);
    this.hsy.setText(paramBundle);
    ((TextView)findViewById(a.f.sDT)).setText(com.tencent.mm.wallet_core.c.t.clX());
    this.hsz = ((TextView)findViewById(a.f.sDR));
    Qq();
    GMTrace.o(5605603409920L, 41765);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5605871845376L, 41767);
    super.onDestroy();
    GMTrace.o(5605871845376L, 41767);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\aa\ui\PaylistAAUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */