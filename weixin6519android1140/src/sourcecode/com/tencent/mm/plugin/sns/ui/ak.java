package com.tencent.mm.plugin.sns.ui;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.sight.decode.a.a;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.ui.widget.MMPinProgressBtn;

public final class ak
{
  public String eEM;
  public a oUt;
  public ImageView pIr;
  public TextView pIu;
  public biz pWB;
  public View pWC;
  public View pWD;
  public MMPinProgressBtn pWE;
  public TextView pWF;
  public boolean poX;
  public int position;
  
  public ak()
  {
    GMTrace.i(8402700861440L, 62605);
    this.poX = false;
    GMTrace.o(8402700861440L, 62605);
  }
  
  public final void a(biz parambiz, int paramInt, String paramString, boolean paramBoolean)
  {
    GMTrace.i(8402835079168L, 62606);
    this.pWB = parambiz;
    this.position = paramInt;
    this.eEM = paramString;
    this.poX = paramBoolean;
    GMTrace.o(8402835079168L, 62606);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\ak.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */