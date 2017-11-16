package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.d.a;
import com.tencent.mm.ac.n;
import com.tencent.mm.af.m.a;
import com.tencent.mm.af.m.a.a;
import com.tencent.mm.g.b.af;
import com.tencent.mm.l.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.e.m.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.preference.Preference;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.s;

public class BizInfoHeaderPreference
  extends Preference
  implements d.a, m.a.a, m.b
{
  public MMActivity ezR;
  public com.tencent.mm.storage.x iBi;
  com.tencent.mm.af.d jsU;
  private boolean kEu;
  private TextView mOE;
  private ImageView nLi;
  private ImageView nLj;
  private View nLk;
  private TextView nLl;
  public String nLm;
  
  public BizInfoHeaderPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6821616025600L, 50825);
    this.kEu = false;
    this.ezR = ((MMActivity)paramContext);
    this.kEu = false;
    GMTrace.o(6821616025600L, 50825);
  }
  
  public BizInfoHeaderPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6821750243328L, 50826);
    this.kEu = false;
    this.ezR = ((MMActivity)paramContext);
    this.kEu = false;
    GMTrace.o(6821750243328L, 50826);
  }
  
  private boolean aXB()
  {
    GMTrace.i(6822018678784L, 50828);
    if ((this.kEu) && (this.iBi != null))
    {
      GMTrace.o(6822018678784L, 50828);
      return true;
    }
    GMTrace.o(6822018678784L, 50828);
    return false;
  }
  
  final void MP()
  {
    boolean bool = true;
    GMTrace.i(6822152896512L, 50829);
    if (!aXB())
    {
      w.w("MicroMsg.BizInfoHeaderPreference", "initView : bindView = " + this.kEu + "contact = " + this.iBi);
      GMTrace.o(6822152896512L, 50829);
      return;
    }
    this.mOE.setText(h.b(this.ezR, bg.nl(this.iBi.vj()) + " ", this.mOE.getTextSize()));
    if (this.jsU == null) {
      this.jsU = com.tencent.mm.af.f.iK(this.iBi.field_username);
    }
    Object localObject1;
    Object localObject2;
    if (this.jsU != null)
    {
      this.nLm = this.jsU.field_brandIconURL;
      localObject1 = com.tencent.mm.af.m.d(this.jsU.field_username, this.jsU.field_brandIconURL, R.g.aYx);
      localObject2 = localObject1;
      if (localObject1 == null) {
        localObject2 = BitmapFactory.decodeResource(this.ezR.getResources(), R.g.aUD);
      }
      if ((localObject2 != null) && (!((Bitmap)localObject2).isRecycled())) {
        this.nLi.setImageBitmap((Bitmap)localObject2);
      }
      this.nLi.setTag(this.iBi.field_username);
      this.nLk.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6768600023040L, 50430);
          paramAnonymousView = BizInfoHeaderPreference.this.iBi.field_username;
          new com.tencent.mm.pluginsdk.ui.f(BizInfoHeaderPreference.this.ezR, paramAnonymousView, BizInfoHeaderPreference.this.nLm).bKN();
          GMTrace.o(6768600023040L, 50430);
        }
      });
      if (!a.eE(this.iBi.field_type)) {
        break label536;
      }
      if (this.jsU != null) {
        break label431;
      }
      label259:
      if (!bool) {
        break label536;
      }
      if (bg.nm(this.iBi.qQ())) {
        break label442;
      }
      this.nLl.setVisibility(0);
      this.nLl.setText(this.mContext.getString(R.l.cTa) + this.iBi.qQ());
    }
    for (;;)
    {
      if (!this.iBi.vb()) {
        break label548;
      }
      this.nLj.setVisibility(0);
      GMTrace.o(6822152896512L, 50829);
      return;
      localObject1 = b.a(this.iBi.field_username, true, -1);
      localObject2 = localObject1;
      if (localObject1 != null)
      {
        localObject2 = localObject1;
        if (!((Bitmap)localObject1).isRecycled()) {
          localObject2 = com.tencent.mm.sdk.platformtools.d.a((Bitmap)localObject1, false, ((Bitmap)localObject1).getWidth() / 2);
        }
      }
      localObject1 = localObject2;
      if (localObject2 != null) {
        break;
      }
      localObject1 = localObject2;
      if (TextUtils.isEmpty(this.nLm)) {
        break;
      }
      localObject1 = com.tencent.mm.af.m.d(this.iBi.field_username, this.nLm, R.g.aYx);
      break;
      label431:
      bool = this.jsU.EL();
      break label259;
      label442:
      if ((!com.tencent.mm.storage.x.Ts(this.iBi.field_username)) && (!s.fB(this.iBi.field_username)))
      {
        localObject1 = bg.nl(this.iBi.vl());
        this.nLl.setText(this.mContext.getString(R.l.cTa) + (String)localObject1);
        this.nLl.setVisibility(0);
      }
      else
      {
        this.nLl.setVisibility(8);
        continue;
        label536:
        this.nLl.setVisibility(8);
      }
    }
    label548:
    this.nLj.setVisibility(8);
    GMTrace.o(6822152896512L, 50829);
  }
  
  public final void a(int paramInt, com.tencent.mm.sdk.e.m paramm, Object paramObject)
  {
    GMTrace.i(6822555549696L, 50832);
    if ((paramObject == null) || (!(paramObject instanceof String)))
    {
      w.d("MicroMsg.BizInfoHeaderPreference", "onNotifyChange obj not String event:%d stg:%s obj:%s", new Object[] { Integer.valueOf(paramInt), paramm, paramObject });
      GMTrace.o(6822555549696L, 50832);
      return;
    }
    if (!aXB())
    {
      w.e("MicroMsg.BizInfoHeaderPreference", "initView : bindView = " + this.kEu + "contact = " + this.iBi);
      GMTrace.o(6822555549696L, 50832);
      return;
    }
    paramm = (String)paramObject;
    if (bg.nl(paramm).length() <= 0)
    {
      GMTrace.o(6822555549696L, 50832);
      return;
    }
    if ((this.iBi != null) && (this.iBi.field_username.equals(paramm)))
    {
      at.AR();
      this.iBi = c.yK().TE(paramm);
    }
    GMTrace.o(6822555549696L, 50832);
  }
  
  public final void ib(String paramString)
  {
    GMTrace.i(6822421331968L, 50831);
    if (!aXB())
    {
      w.e("MicroMsg.BizInfoHeaderPreference", "initView : bindView = " + this.kEu + "contact = " + this.iBi);
      GMTrace.o(6822421331968L, 50831);
      return;
    }
    if (bg.nl(paramString).length() <= 0)
    {
      w.e("MicroMsg.BizInfoHeaderPreference", "notifyChanged: user = " + paramString);
      GMTrace.o(6822421331968L, 50831);
      return;
    }
    if (paramString.equals(this.iBi.field_username)) {
      MP();
    }
    GMTrace.o(6822421331968L, 50831);
  }
  
  public final void ja(String paramString)
  {
    GMTrace.i(6822689767424L, 50833);
    if ((this.iBi != null) && (paramString != null) && (paramString.equals(this.iBi.field_username))) {
      MP();
    }
    GMTrace.o(6822689767424L, 50833);
  }
  
  public final void onBindView(View paramView)
  {
    GMTrace.i(6821884461056L, 50827);
    w.d("MicroMsg.BizInfoHeaderPreference", "onBindView");
    this.mOE = ((TextView)paramView.findViewById(R.h.bqQ));
    this.nLl = ((TextView)paramView.findViewById(R.h.brh));
    this.nLj = ((ImageView)paramView.findViewById(R.h.bhs));
    this.nLi = ((ImageView)paramView.findViewById(R.h.bqt));
    this.nLk = paramView.findViewById(R.h.bqu);
    this.kEu = true;
    MP();
    super.onBindView(paramView);
    GMTrace.o(6821884461056L, 50827);
  }
  
  public final void onDetach()
  {
    GMTrace.i(6822287114240L, 50830);
    at.AR();
    c.yK().b(this);
    n.Dh().e(this);
    com.tencent.mm.af.x.FO().b(this);
    GMTrace.o(6822287114240L, 50830);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\BizInfoHeaderPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */