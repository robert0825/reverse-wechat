package com.tencent.mm.plugin.profile.ui;

import android.content.Context;
import android.content.res.Resources;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.af.d;
import com.tencent.mm.kernel.h;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.k.c;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.preference.Preference;
import java.util.List;

public class BizBindWxaInfoPreference
  extends Preference
{
  private static DisplayMetrics iGo;
  private static int iKu;
  private static int iKv;
  public d huq;
  public List<WxaAttributes.WxaEntryInfo> iKn;
  private View iKo;
  private ImageView iKp;
  private TextView iKq;
  private LinearLayout iKr;
  private ViewGroup iKs;
  private View iKt;
  private TextView izE;
  private View.OnClickListener kHK;
  private volatile boolean nKZ;
  volatile boolean nLa;
  private View.OnClickListener nLb;
  
  static
  {
    GMTrace.i(6762426007552L, 50384);
    iGo = ab.getContext().getResources().getDisplayMetrics();
    iKu = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 15);
    iKv = ab.getResources().getDimensionPixelSize(R.f.aQC);
    GMTrace.o(6762426007552L, 50384);
  }
  
  public BizBindWxaInfoPreference(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(6761486483456L, 50377);
    init();
    GMTrace.o(6761486483456L, 50377);
  }
  
  public BizBindWxaInfoPreference(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(6761352265728L, 50376);
    init();
    GMTrace.o(6761352265728L, 50376);
  }
  
  private static void a(WxaAttributes.WxaEntryInfo paramWxaEntryInfo, ImageView paramImageView, TextView paramTextView)
  {
    GMTrace.i(19593640804352L, 145984);
    if (paramWxaEntryInfo == null)
    {
      GMTrace.o(19593640804352L, 145984);
      return;
    }
    String str = paramWxaEntryInfo.username;
    if (paramImageView != null)
    {
      paramImageView.setTag(str);
      b.CT().a(paramImageView, paramWxaEntryInfo.iconUrl, com.tencent.mm.modelappbrand.a.a.CS(), com.tencent.mm.modelappbrand.a.e.grO);
    }
    if (paramTextView != null) {
      paramTextView.setText(bg.nl(paramWxaEntryInfo.title));
    }
    GMTrace.o(19593640804352L, 145984);
  }
  
  private void init()
  {
    GMTrace.i(6761754918912L, 50379);
    this.kHK = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(18473728081920L, 137640);
        paramAnonymousView = paramAnonymousView.getTag();
        if ((paramAnonymousView == null) || (!(paramAnonymousView instanceof String)))
        {
          GMTrace.o(18473728081920L, 137640);
          return;
        }
        AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
        localAppBrandStatObject.scene = 1020;
        localAppBrandStatObject.eAv = BizBindWxaInfoPreference.this.huq.field_username;
        ((c)h.h(c.class)).a(BizBindWxaInfoPreference.this.mContext, (String)paramAnonymousView, null, 0, 0, null, localAppBrandStatObject, BizBindWxaInfoPreference.this.huq.field_appId);
        GMTrace.o(18473728081920L, 137640);
      }
    };
    this.nLb = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6750749065216L, 50297);
        ((com.tencent.mm.plugin.appbrand.k.e)h.h(com.tencent.mm.plugin.appbrand.k.e.class)).a(BizBindWxaInfoPreference.this.mContext, BizBindWxaInfoPreference.this.huq.field_username, BizBindWxaInfoPreference.this.huq.field_appId, BizBindWxaInfoPreference.this.iKn);
        GMTrace.o(6750749065216L, 50297);
      }
    };
    GMTrace.o(6761754918912L, 50379);
  }
  
  final void UN()
  {
    GMTrace.i(6761889136640L, 50380);
    if ((!this.nKZ) || (this.iKn == null))
    {
      GMTrace.o(6761889136640L, 50380);
      return;
    }
    if (!this.nLa)
    {
      GMTrace.o(6761889136640L, 50380);
      return;
    }
    this.nLa = false;
    if (!this.iKn.isEmpty()) {}
    for (Object localObject = (WxaAttributes.WxaEntryInfo)this.iKn.get(0);; localObject = null)
    {
      if (localObject != null) {
        a((WxaAttributes.WxaEntryInfo)localObject, this.iKp, this.izE);
      }
      this.iKq.setText(this.mContext.getString(R.l.diK, new Object[] { Integer.valueOf(this.iKn.size()) }));
      localObject = this.iKn;
      this.iKr.removeAllViews();
      if (!((List)localObject).isEmpty())
      {
        int k = ((List)localObject).size();
        int j = this.iKs.getMeasuredWidth();
        int i = j;
        if (j == 0) {
          i = iGo.widthPixels;
        }
        j = i - this.iKs.getPaddingLeft() - this.iKs.getPaddingRight();
        i = j / (iKv + iKu);
        if (i > k) {
          this.iKt.setVisibility(8);
        }
        for (;;)
        {
          j = Math.min(i, k);
          if (j <= 1) {
            break;
          }
          i = 0;
          while (i < j)
          {
            WxaAttributes.WxaEntryInfo localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)((List)localObject).get(i);
            ImageView localImageView = new ImageView(this.mContext);
            localImageView.setLayoutParams(new ViewGroup.LayoutParams(iKv + iKu, iKv));
            localImageView.setPadding(0, 0, iKu, 0);
            this.iKr.addView(localImageView);
            a(localWxaEntryInfo, localImageView, null);
            i += 1;
          }
          this.iKt.setVisibility(0);
          i = (j - this.iKt.getMeasuredWidth()) / (iKv + iKu);
        }
        w.i("MicroMsg.BizBindWxaInfoPreference", "attachItemToContainer(size : %s)", new Object[] { Integer.valueOf(((List)localObject).size()) });
      }
      if (this.iKn.size() == 1)
      {
        this.iKo.setVisibility(0);
        this.iKs.setTag(((WxaAttributes.WxaEntryInfo)this.iKn.get(0)).username);
        this.iKs.setOnClickListener(this.kHK);
        GMTrace.o(6761889136640L, 50380);
        return;
      }
      this.iKo.setVisibility(8);
      this.iKs.setTag(null);
      this.iKs.setOnClickListener(this.nLb);
      GMTrace.o(6761889136640L, 50380);
      return;
    }
  }
  
  protected final void onBindView(View paramView)
  {
    GMTrace.i(6761620701184L, 50378);
    this.iKo = paramView.findViewById(R.h.bAi);
    this.iKp = ((ImageView)paramView.findViewById(R.h.bGo));
    this.izE = ((TextView)paramView.findViewById(R.h.chI));
    this.iKq = ((TextView)paramView.findViewById(R.h.bsd));
    this.iKt = paramView.findViewById(R.h.bOn);
    this.iKr = ((LinearLayout)paramView.findViewById(R.h.brM));
    this.iKs = ((ViewGroup)paramView.findViewById(R.h.bIC));
    this.nKZ = true;
    if (this.iKn != null) {}
    for (boolean bool = true;; bool = false)
    {
      this.nLa = bool;
      UN();
      super.onBindView(paramView);
      GMTrace.o(6761620701184L, 50378);
      return;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\profile\ui\BizBindWxaInfoPreference.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */