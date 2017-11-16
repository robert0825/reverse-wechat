package com.tencent.mm.plugin.card.ui;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMVerticalTextView;
import com.tencent.mm.ui.base.q;
import java.util.ArrayList;

public final class j
{
  public Bitmap hwc;
  public q hwd;
  public ImageView hwe;
  View hwf;
  View.OnClickListener hwh;
  MMActivity hyB;
  public Bitmap jBA;
  float jBI;
  boolean jER;
  Bitmap jIK;
  TextView jIL;
  TextView jIM;
  View jIN;
  ImageView jIO;
  MMVerticalTextView jIP;
  MMVerticalTextView jIQ;
  ArrayList<Bitmap> jIR;
  String jIS;
  public b jwZ;
  
  public j(MMActivity paramMMActivity)
  {
    GMTrace.i(5010884657152L, 37334);
    this.jER = true;
    this.jIK = null;
    this.hwd = null;
    this.jBI = 0.0F;
    this.jIR = new ArrayList();
    this.jIS = "";
    this.hwh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(4956123824128L, 36926);
        if ((paramAnonymousView.getId() == R.h.bTF) || (paramAnonymousView.getId() == R.h.bTD))
        {
          if ((j.this.hwd != null) && (j.this.hwd.isShowing())) {
            j.this.hwd.dismiss();
          }
          if (!j.this.jwZ.aje()) {
            j.this.alX();
          }
        }
        GMTrace.o(4956123824128L, 36926);
      }
    };
    this.hyB = paramMMActivity;
    GMTrace.o(5010884657152L, 37334);
  }
  
  private void Z(float paramFloat)
  {
    GMTrace.i(5011018874880L, 37335);
    WindowManager.LayoutParams localLayoutParams = this.hyB.getWindow().getAttributes();
    localLayoutParams.screenBrightness = paramFloat;
    this.hyB.getWindow().setAttributes(localLayoutParams);
    GMTrace.o(5011018874880L, 37335);
  }
  
  public final void alW()
  {
    GMTrace.i(5011153092608L, 37336);
    if (this.jBI < 0.8F) {
      Z(0.8F);
    }
    GMTrace.o(5011153092608L, 37336);
  }
  
  public final void alX()
  {
    GMTrace.i(5011287310336L, 37337);
    Z(this.jBI);
    GMTrace.o(5011287310336L, 37337);
  }
  
  final void alY()
  {
    GMTrace.i(5011421528064L, 37338);
    if (this.jIR.size() > 2)
    {
      int i = this.jIR.size() - 1;
      while (i > 1)
      {
        l.u((Bitmap)this.jIR.remove(i));
        i -= 1;
      }
    }
    GMTrace.o(5011421528064L, 37338);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */