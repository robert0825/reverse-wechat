package com.tencent.mm.plugin.emoji.ui.v2;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.br.a;

public class PaddingImageView
  extends FrameLayout
{
  ImageView kve;
  ImageView kvf;
  private int kvg;
  
  public PaddingImageView(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(11472528736256L, 85477);
    init(paramContext);
    GMTrace.o(11472528736256L, 85477);
  }
  
  public PaddingImageView(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(11472662953984L, 85478);
    init(paramContext);
    GMTrace.o(11472662953984L, 85478);
  }
  
  public PaddingImageView(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11472797171712L, 85479);
    init(paramContext);
    GMTrace.o(11472797171712L, 85479);
  }
  
  private void init(Context paramContext)
  {
    GMTrace.i(11472931389440L, 85480);
    this.kvg = a.V(getContext(), R.f.aQE);
    this.kve = new ImageView(paramContext);
    this.kve.setPadding(this.kvg, this.kvg, this.kvg, this.kvg);
    this.kvf = new ImageView(paramContext);
    GMTrace.o(11472931389440L, 85480);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\emoji\ui\v2\PaddingImageView.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */