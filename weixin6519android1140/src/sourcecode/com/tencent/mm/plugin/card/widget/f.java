package com.tencent.mm.plugin.card.widget;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.protocal.c.jp;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.protocal.c.np;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.LinkedList;

public final class f
  extends a
{
  protected TextView hqH;
  private View jMm;
  private ImageView jMn;
  private TextView jMo;
  private TextView jMp;
  private View jMq;
  private TextView jMr;
  private TextView jMs;
  private ImageView jMt;
  private TextView jMu;
  public ArrayList<jp> jxf;
  
  public f(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(4887135911936L, 36412);
    GMTrace.o(4887135911936L, 36412);
  }
  
  protected final void ane()
  {
    GMTrace.i(4887270129664L, 36413);
    this.hqH = ((TextView)and().findViewById(R.h.blL));
    this.jMm = and().findViewById(R.h.bjm);
    this.jMn = ((ImageView)and().findViewById(R.h.chi));
    this.jMo = ((TextView)and().findViewById(R.h.chh));
    this.jMp = ((TextView)and().findViewById(R.h.chg));
    this.jMq = and().findViewById(R.h.chk);
    this.jMr = ((TextView)and().findViewById(R.h.chm));
    this.jMs = ((TextView)and().findViewById(R.h.chl));
    this.jMt = ((ImageView)and().findViewById(R.h.chj));
    this.jMu = ((TextView)and().findViewById(R.h.chf));
    GMTrace.o(4887270129664L, 36413);
  }
  
  protected final void anf()
  {
    GMTrace.i(4887404347392L, 36414);
    label132:
    label213:
    Object localObject;
    StringBuilder localStringBuilder;
    np localnp1;
    if ((this.jwZ.ajv().uak != null) && (!TextUtils.isEmpty(this.jwZ.ajv().uak.title)))
    {
      this.jLK.setText(this.jwZ.ajv().uak.title);
      if ((this.jwZ.ajv().uak == null) || (TextUtils.isEmpty(this.jwZ.ajv().uak.jxI))) {
        break label615;
      }
      this.hqH.setText(this.jwZ.ajv().uak.jxI);
      this.hqH.setVisibility(0);
      w.i("MicroMsg.CardWidgetTicket", "updateContentView()");
      if (bg.nm(this.jwZ.ajv().tZQ)) {
        break label637;
      }
      int i = this.mContext.getResources().getDimensionPixelSize(R.f.aRz);
      m.a(this.mContext, this.jMn, this.jwZ.ajv().tZQ, i, R.g.aUZ, l.uD(this.jwZ.ajv().gjg));
      localObject = new StringBuilder();
      localStringBuilder = new StringBuilder();
      if ((this.jwZ.ajv().tZI == null) || (this.jwZ.ajv().tZI.size() < 2)) {
        break label665;
      }
      w.i("MicroMsg.CardWidgetTicket", "primary_fields length is >= 2");
      localnp1 = (np)this.jwZ.ajv().tZI.get(0);
      np localnp2 = (np)this.jwZ.ajv().tZI.get(1);
      ((StringBuilder)localObject).append(localnp1.title).append(" - ").append(localnp2.title);
      if ((!TextUtils.isEmpty(localnp1.jxJ)) && (!TextUtils.isEmpty(localnp2.jxJ)))
      {
        localStringBuilder.append(localnp1.jxJ).append(" ").append(localnp1.jxI);
        localStringBuilder.append(" - ");
        localStringBuilder.append(localnp2.jxJ).append(" ").append(localnp2.jxI);
      }
      label410:
      if (TextUtils.isEmpty(((StringBuilder)localObject).toString())) {
        break label751;
      }
      this.jMo.setText(((StringBuilder)localObject).toString());
      label431:
      if (TextUtils.isEmpty(localStringBuilder.toString())) {
        break label764;
      }
      w.i("MicroMsg.CardWidgetTicket", "sub_title_builder is not empty!");
      this.jMp.setText(localStringBuilder.toString());
      this.jMp.setVisibility(0);
      label467:
      w.e("MicroMsg.CardWidgetTicket", "updateShopView(), shop_count:" + this.jwZ.ajv().tZM);
      if (this.jwZ.ajv().tZM > 0) {
        break label832;
      }
      this.jMq.setVisibility(8);
      this.jMu.setVisibility(8);
    }
    for (;;)
    {
      if (!this.jwZ.aju()) {
        break label1214;
      }
      this.jMm.setVisibility(8);
      GMTrace.o(4887404347392L, 36414);
      return;
      if (!TextUtils.isEmpty(this.jwZ.ajv().jyT))
      {
        this.jLK.setText(this.jwZ.ajv().jyT);
        break;
      }
      this.jLK.setText("");
      break;
      label615:
      this.hqH.setText("");
      this.hqH.setVisibility(8);
      break label132;
      label637:
      m.a(this.jMn, R.g.aUZ, l.uD(this.jwZ.ajv().gjg));
      break label213;
      label665:
      if ((this.jwZ.ajv().tZI == null) || (this.jwZ.ajv().tZI.size() != 1)) {
        break label410;
      }
      w.i("MicroMsg.CardWidgetTicket", "primary_fields length is == 1");
      localnp1 = (np)this.jwZ.ajv().tZI.get(0);
      ((StringBuilder)localObject).append(localnp1.title);
      localStringBuilder.append(localnp1.jxI);
      break label410;
      label751:
      this.jMo.setText("");
      break label431;
      label764:
      if (!TextUtils.isEmpty(this.jwZ.ajv().tZY))
      {
        w.i("MicroMsg.CardWidgetTicket", "primary_sub_title is not empty!");
        this.jMp.setText(this.jwZ.ajv().tZY);
        this.jMp.setVisibility(0);
        break label467;
      }
      this.jMp.setVisibility(8);
      break label467;
      label832:
      this.jMq.setVisibility(0);
      this.jMq.setOnClickListener(this.hwh);
      m.a(this.jMt, R.g.aVa, l.uD(this.jwZ.ajv().gjg));
      localStringBuilder = null;
      localObject = localStringBuilder;
      if (this.jxf != null)
      {
        localObject = localStringBuilder;
        if (this.jxf.size() > 0) {
          localObject = (jp)this.jxf.get(0);
        }
      }
      if ((this.jwZ.ajv().tZM == 1) && (localObject != null))
      {
        this.jMr.setText(((jp)localObject).name);
        this.jMs.setText(this.mContext.getString(R.l.ddP, new Object[] { l.d(this.mContext, ((jp)localObject).tZw), ((jp)localObject).gEy }));
        this.jMu.setVisibility(8);
        this.jMq.setTag(((jp)localObject).name);
      }
      else if ((this.jwZ.ajv().tZM > 1) && (localObject != null))
      {
        this.jMr.setText(((jp)localObject).name);
        this.jMs.setText(this.mContext.getString(R.l.ddP, new Object[] { l.d(this.mContext, ((jp)localObject).tZw), ((jp)localObject).gEy }));
        this.jMu.setVisibility(0);
        this.jMu.setOnClickListener(this.hwh);
        this.jMq.setTag(((jp)localObject).name);
      }
      else if (this.jwZ.ajv().tZM > 0)
      {
        this.jMr.setText(R.l.dch);
        this.jMs.setText(this.mContext.getString(R.l.dej, new Object[] { Integer.valueOf(this.jwZ.ajv().tZM) }));
        this.jMu.setVisibility(8);
        this.jMu.setOnClickListener(null);
        this.jMq.setTag(this.mContext.getString(R.l.dch));
      }
    }
    label1214:
    this.jMm.setVisibility(0);
    GMTrace.o(4887404347392L, 36414);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\widget\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */