package com.tencent.mm.plugin.ipcall.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.AttributeSet;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.sdk.platformtools.d;

public class IPCallRoundUrlHeadImage
  extends CdnImageView
{
  public IPCallRoundUrlHeadImage(Context paramContext, AttributeSet paramAttributeSet)
  {
    this(paramContext, paramAttributeSet, 0);
    GMTrace.i(11667815530496L, 86932);
    GMTrace.o(11667815530496L, 86932);
  }
  
  public IPCallRoundUrlHeadImage(Context paramContext, AttributeSet paramAttributeSet, int paramInt)
  {
    super(paramContext, paramAttributeSet, paramInt);
    GMTrace.i(11667949748224L, 86933);
    GMTrace.o(11667949748224L, 86933);
  }
  
  public final void z(Bitmap paramBitmap)
  {
    GMTrace.i(11668083965952L, 86934);
    if (paramBitmap != null) {
      setImageBitmap(d.a(paramBitmap, false, 0.5F * paramBitmap.getWidth()));
    }
    GMTrace.o(11668083965952L, 86934);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes4-dex2jar.jar!\com\tencent\mm\plugin\ipcall\ui\IPCallRoundUrlHeadImage.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */