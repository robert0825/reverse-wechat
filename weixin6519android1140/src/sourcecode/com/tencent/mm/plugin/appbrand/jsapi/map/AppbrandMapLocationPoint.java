package com.tencent.mm.plugin.appbrand.jsapi.map;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.appbrand.o.f;
import com.tencent.mm.plugin.appbrand.o.g;

public class AppbrandMapLocationPoint
  extends LinearLayout
{
  ImageView ign;
  double igo;
  double igp;
  double igq;
  double igr;
  private Context mContext;
  
  public AppbrandMapLocationPoint(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(10445092028416L, 77822);
    this.igo = -1.0D;
    this.igp = -1.0D;
    this.igq = -1.0D;
    this.igr = -1.0D;
    this.mContext = paramContext;
    init();
    GMTrace.o(10445092028416L, 77822);
  }
  
  public AppbrandMapLocationPoint(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(10444957810688L, 77821);
    this.igo = -1.0D;
    this.igp = -1.0D;
    this.igq = -1.0D;
    this.igr = -1.0D;
    this.mContext = paramContext;
    init();
    GMTrace.o(10444957810688L, 77821);
  }
  
  private void init()
  {
    GMTrace.i(10445226246144L, 77823);
    this.ign = ((ImageView)View.inflate(this.mContext, o.g.hCU, this).findViewById(o.f.hCC));
    this.ign.requestFocus();
    GMTrace.o(10445226246144L, 77823);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\appbrand\jsapi\map\AppbrandMapLocationPoint.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */