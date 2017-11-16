package com.tencent.mm.plugin.appbrand.widget;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.af.m;
import com.tencent.mm.modelappbrand.a.b;
import com.tencent.mm.modelappbrand.a.e;
import com.tencent.mm.plugin.appbrand.config.WxaAttributes.WxaEntryInfo;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;
import com.tencent.mm.plugin.appbrand.o.i;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.LinkedList;
import java.util.List;

public class WxaBindBizInfoView
  extends LinearLayout
{
  private static int iKu;
  private static int iKv;
  public List<WxaAttributes.WxaEntryInfo> iKn;
  private View iKo;
  private ImageView iKp;
  private TextView iKq;
  private LinearLayout iKr;
  private ViewGroup iKs;
  private View iKt;
  private TextView izE;
  
  static
  {
    GMTrace.i(15417053544448L, 114866);
    iKu = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 15);
    iKv = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 30);
    GMTrace.o(15417053544448L, 114866);
  }
  
  public WxaBindBizInfoView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(15416382455808L, 114861);
    init();
    GMTrace.o(15416382455808L, 114861);
  }
  
  public WxaBindBizInfoView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(15416248238080L, 114860);
    init();
    GMTrace.o(15416248238080L, 114860);
  }
  
  private static void a(WxaAttributes.WxaEntryInfo paramWxaEntryInfo, ImageView paramImageView, TextView paramTextView)
  {
    GMTrace.i(17274761117696L, 128707);
    if (paramWxaEntryInfo == null)
    {
      GMTrace.o(17274761117696L, 128707);
      return;
    }
    Object localObject = paramWxaEntryInfo.username;
    if (paramImageView != null)
    {
      paramImageView.setTag(localObject);
      localObject = m.iY(paramWxaEntryInfo.username);
      if ((localObject == null) || (((Bitmap)localObject).isRecycled())) {
        break label83;
      }
      paramImageView.setImageBitmap((Bitmap)localObject);
    }
    for (;;)
    {
      if (paramTextView != null) {
        paramTextView.setText(bg.nl(paramWxaEntryInfo.title));
      }
      GMTrace.o(17274761117696L, 128707);
      return;
      label83:
      b.CT().a(paramImageView, paramWxaEntryInfo.iconUrl, com.tencent.mm.modelappbrand.a.a.CS(), e.grO);
    }
  }
  
  private void init()
  {
    GMTrace.i(15416516673536L, 114862);
    this.iKn = new LinkedList();
    View localView = View.inflate(getContext(), o.g.hDb, this);
    this.iKo = localView.findViewById(o.f.bAi);
    this.iKp = ((ImageView)localView.findViewById(o.f.bGo));
    this.izE = ((TextView)localView.findViewById(o.f.chI));
    this.iKq = ((TextView)localView.findViewById(o.f.bsd));
    this.iKt = localView.findViewById(o.f.bOn);
    this.iKr = ((LinearLayout)localView.findViewById(o.f.brM));
    this.iKs = ((ViewGroup)localView.findViewById(o.f.bIC));
    GMTrace.o(15416516673536L, 114862);
  }
  
  public final void cJ(boolean paramBoolean)
  {
    GMTrace.i(15416650891264L, 114863);
    if (this.iKs.getMeasuredWidth() == 0)
    {
      if (paramBoolean) {
        getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
        {
          public final boolean onPreDraw()
          {
            GMTrace.i(15436917768192L, 115014);
            WxaBindBizInfoView.this.getViewTreeObserver().removeOnPreDrawListener(this);
            WxaBindBizInfoView.a(WxaBindBizInfoView.this);
            GMTrace.o(15436917768192L, 115014);
            return true;
          }
        });
      }
      GMTrace.o(15416650891264L, 114863);
      return;
    }
    Object localObject = null;
    int j;
    int k;
    int i;
    if (this.iKn.isEmpty())
    {
      setVisibility(8);
      if (localObject != null) {
        a((WxaAttributes.WxaEntryInfo)localObject, this.iKp, this.izE);
      }
      this.iKq.setText(getContext().getString(o.i.diK, new Object[] { Integer.valueOf(this.iKn.size()) }));
      localObject = this.iKn;
      this.iKr.removeAllViews();
      if (((List)localObject).isEmpty()) {
        break label382;
      }
      j = ((List)localObject).size();
      k = this.iKs.getMeasuredWidth() - this.iKs.getPaddingLeft() - this.iKs.getPaddingRight();
      i = k / (iKv + iKu);
      if (i <= j) {
        break label326;
      }
      this.iKt.setVisibility(8);
    }
    for (;;)
    {
      j = Math.min(i, j);
      if (j <= 1) {
        break label356;
      }
      i = 0;
      while (i < j)
      {
        WxaAttributes.WxaEntryInfo localWxaEntryInfo = (WxaAttributes.WxaEntryInfo)((List)localObject).get(i);
        ImageView localImageView = new ImageView(getContext());
        localImageView.setLayoutParams(new ViewGroup.LayoutParams(iKv + iKu, iKv));
        localImageView.setPadding(0, 0, iKu, 0);
        this.iKr.addView(localImageView);
        a(localWxaEntryInfo, localImageView, null);
        i += 1;
      }
      setVisibility(0);
      localObject = (WxaAttributes.WxaEntryInfo)this.iKn.get(0);
      break;
      label326:
      this.iKt.setVisibility(0);
      i = (k - this.iKt.getMeasuredWidth()) / (iKv + iKu);
    }
    label356:
    w.i("MicroMsg.WxaBindBizInfoView", "attachItemToContainer(size : %s)", new Object[] { Integer.valueOf(((List)localObject).size()) });
    label382:
    if (this.iKn.size() == 1)
    {
      this.iKo.setVisibility(0);
      this.iKs.setTag(((WxaAttributes.WxaEntryInfo)this.iKn.get(0)).username);
      GMTrace.o(15416650891264L, 114863);
      return;
    }
    this.iKo.setVisibility(8);
    this.iKs.setTag(null);
    GMTrace.o(15416650891264L, 114863);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\widget\WxaBindBizInfoView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */