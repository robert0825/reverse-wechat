package com.tencent.mm.plugin.card.ui;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.BaseAdapter;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.plugin.card.b.d;
import com.tencent.mm.plugin.card.base.CardBaseUI;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.CardInfo;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.plugin.card.model.n.a;
import com.tencent.mm.plugin.card.model.t;
import com.tencent.mm.protocal.c.bhb;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.jv;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.LinkedList;
import java.util.List;

public class CardViewUI
  extends CardBaseUI
{
  private int Zc;
  private String gjw;
  private LinkedList<jv> jDR;
  private int jFf;
  private String jJw;
  private View jJx;
  private int jtE;
  
  public CardViewUI()
  {
    GMTrace.i(4962163621888L, 36971);
    this.Zc = 1;
    this.jDR = new LinkedList();
    this.gjw = "";
    GMTrace.o(4962163621888L, 36971);
  }
  
  public final void Zp()
  {
    GMTrace.i(4962566275072L, 36974);
    super.Zp();
    if (this.jtE == 26) {
      overridePendingTransition(0, 0);
    }
    GMTrace.o(4962566275072L, 36974);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    int i = 0;
    GMTrace.i(4963640016896L, 36982);
    if ((paramk instanceof t))
    {
      du(false);
      if ((paramInt1 == 0) && (paramInt2 == 0))
      {
        paramString = ((t)paramk).jzN;
        if ((paramString != null) && (paramString.size() > 0))
        {
          if ((this.jwu instanceof g))
          {
            paramk = (g)this.jwu;
            if (paramString != null)
            {
              paramk.jCF.clear();
              paramk.jCF.addAll(paramString);
              paramk.jHA.clear();
              paramInt1 = i;
              while (paramInt1 < paramString.size())
              {
                paramk.jHA.add(new Boolean(true));
                paramInt1 += 1;
              }
            }
          }
          this.jwu.notifyDataSetChanged();
        }
        GMTrace.o(4963640016896L, 36982);
        return;
      }
      d.b(this, paramString, paramInt2);
      GMTrace.o(4963640016896L, 36982);
      return;
    }
    super.a(paramInt1, paramInt2, paramString, paramk);
    GMTrace.o(4963640016896L, 36982);
  }
  
  protected final void a(b paramb)
  {
    GMTrace.i(4963505799168L, 36981);
    if (this.Zc == 0)
    {
      al.aks().jwB = ((CardInfo)paramb);
      Intent localIntent = new Intent(this, CardDetailUI.class);
      localIntent.putExtra("key_card_id", ((CardInfo)paramb).field_card_id);
      localIntent.putExtra("key_from_scene", 51);
      localIntent.putExtra("key_from_appbrand_type", this.jFf);
      startActivity(localIntent);
      GMTrace.o(4963505799168L, 36981);
      return;
    }
    super.a(paramb);
    GMTrace.o(4963505799168L, 36981);
  }
  
  protected final void a(CardInfo paramCardInfo)
  {
    GMTrace.i(4963371581440L, 36980);
    if (this.Zc == 1)
    {
      this.jwB = paramCardInfo;
      j(this.jJw, 1, true);
      GMTrace.o(4963371581440L, 36980);
      return;
    }
    super.a(paramCardInfo);
    if (this.jwB != null) {
      com.tencent.mm.plugin.report.service.g.ork.i(11582, new Object[] { "OperGift", Integer.valueOf(4), Integer.valueOf(this.jwB.ajv().jxG), this.jwB.field_card_tp_id, this.jwB.field_card_id, this.jJw });
    }
    GMTrace.o(4963371581440L, 36980);
  }
  
  protected final void aiM()
  {
    GMTrace.i(4962700492800L, 36975);
    int i;
    if (this.Zc == 0)
    {
      oM(R.l.dem);
      at.wS().a(699, this);
      i = R.l.dbQ;
      if (this.Zc != 0) {
        break label165;
      }
      du(true);
      Object localObject = new bhb();
      ((bhb)localObject).uSV = this.gjw;
      w.i("MicroMsg.CardViewUI", "doBatchGetCardItemByTpInfo templateId:%s", new Object[] { this.gjw });
      localObject = new t(this.jDR, (bhb)localObject, this.jtE);
      at.wS().a((com.tencent.mm.ad.k)localObject, 0);
      i = R.l.dbQ;
    }
    for (;;)
    {
      findViewById(R.h.bQZ).setVisibility(8);
      ((TextView)findViewById(R.h.bRb)).setText(i);
      GMTrace.o(4962700492800L, 36975);
      return;
      if (this.Zc != 1) {
        break;
      }
      oM(R.l.dcJ);
      break;
      label165:
      if (this.Zc == 1)
      {
        this.jJx = View.inflate(this, R.i.cri, null);
        if (this.jww != null) {
          this.jww.addView(this.jJx);
        }
        i = R.l.ddS;
      }
    }
  }
  
  protected final int aiN()
  {
    GMTrace.i(4962834710528L, 36976);
    int i = n.a.jzB;
    GMTrace.o(4962834710528L, 36976);
    return i;
  }
  
  protected final BaseAdapter aiO()
  {
    GMTrace.i(4962968928256L, 36977);
    if (this.Zc == 0)
    {
      localObject = new g(getApplicationContext());
      GMTrace.o(4962968928256L, 36977);
      return (BaseAdapter)localObject;
    }
    Object localObject = super.aiO();
    GMTrace.o(4962968928256L, 36977);
    return (BaseAdapter)localObject;
  }
  
  protected final boolean aiQ()
  {
    GMTrace.i(4963103145984L, 36978);
    if (this.Zc == 1)
    {
      GMTrace.o(4963103145984L, 36978);
      return false;
    }
    boolean bool = super.aiQ();
    GMTrace.o(4963103145984L, 36978);
    return bool;
  }
  
  protected final void aiR()
  {
    GMTrace.i(19558609977344L, 145723);
    GMTrace.o(19558609977344L, 145723);
  }
  
  protected final void b(b paramb)
  {
    GMTrace.i(4963237363712L, 36979);
    if (this.Zc == 1)
    {
      a((CardInfo)paramb);
      GMTrace.o(4963237363712L, 36979);
      return;
    }
    super.b(paramb);
    GMTrace.o(4963237363712L, 36979);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4962297839616L, 36972);
    super.onCreate(paramBundle);
    paramBundle = getIntent();
    if (paramBundle == null)
    {
      w.e("MicroMsg.CardViewUI", "onCreate intent is null");
      finish();
      GMTrace.o(4962297839616L, 36972);
      return;
    }
    this.jtE = paramBundle.getIntExtra("key_previous_scene", 7);
    this.jFf = paramBundle.getIntExtra("key_from_appbrand_type", 0);
    this.Zc = paramBundle.getIntExtra("view_type", 0);
    this.jJw = paramBundle.getStringExtra("user_name");
    paramBundle = paramBundle.getStringExtra("card_list");
    this.gjw = getIntent().getStringExtra("key_template_id");
    if (this.Zc == 0)
    {
      if (TextUtils.isEmpty(paramBundle))
      {
        w.e("MicroMsg.CardViewUI", "oncreate card_list is empty");
        finish();
        GMTrace.o(4962297839616L, 36972);
        return;
      }
      paramBundle = com.tencent.mm.plugin.card.b.k.aK(paramBundle, this.jtE);
      if ((paramBundle != null) && (paramBundle.size() > 0))
      {
        this.jDR.clear();
        this.jDR.addAll(paramBundle);
      }
    }
    MP();
    GMTrace.o(4962297839616L, 36972);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4962432057344L, 36973);
    at.wS().b(699, this);
    super.onDestroy();
    GMTrace.o(4962432057344L, 36973);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\CardViewUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */