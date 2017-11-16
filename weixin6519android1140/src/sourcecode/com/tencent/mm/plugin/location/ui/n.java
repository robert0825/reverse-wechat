package com.tencent.mm.plugin.location.ui;

import android.content.Context;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.location.model.LocationInfo;
import com.tencent.mm.plugin.p.d;
import com.tencent.mm.sdk.platformtools.w;

public final class n
  implements c
{
  public boolean eHl;
  public boolean isVisible;
  public ImageView mBT;
  public FrameLayout mBU;
  public View mBV;
  private TextView mBW;
  public TextView mBX;
  private String mwD;
  public double mwH;
  public double mwI;
  private TextView myG;
  private ProgressBar myH;
  public String myL;
  public boolean mzl;
  public View mzm;
  public d mzn;
  public String mzo;
  
  public n(d paramd, Context paramContext)
  {
    GMTrace.i(9659515666432L, 71969);
    this.eHl = false;
    this.mzl = true;
    this.mwH = 1000000.0D;
    this.mwI = 1000000.0D;
    this.isVisible = true;
    this.myL = "";
    paramContext = View.inflate(paramContext, R.i.cBg, null);
    this.mBX = ((TextView)paramContext.findViewById(R.h.bFs));
    this.mBX.setVisibility(8);
    paramContext.setVisibility(8);
    this.mBT = ((ImageView)paramContext.findViewById(R.h.bKU));
    this.mBT.setImageResource(R.g.aXE);
    this.mBU = ((FrameLayout)paramContext.findViewById(R.h.bLY));
    this.mBV = paramContext.findViewById(R.h.bKN);
    this.mzn = paramd;
    this.mzm = paramContext;
    GMTrace.o(9659515666432L, 71969);
  }
  
  public final void Bu(String paramString)
  {
    GMTrace.i(9659381448704L, 71968);
    w.d("ZItemOverlay", "popView " + this.mzm.getWidth() + " " + this.mzm.getHeight());
    this.myG = ((TextView)this.mzm.findViewById(R.h.bLm));
    this.myH = ((ProgressBar)this.mzm.findViewById(R.h.bLc));
    this.mBW = ((TextView)this.mzm.findViewById(R.h.bLf));
    this.mzm.findViewById(R.h.bLd).setVisibility(0);
    if ((paramString == null) || (paramString.equals("")))
    {
      this.myH.setVisibility(0);
      if ((this.mzo == null) || (this.mzo.equals(""))) {
        break label218;
      }
      this.mBW.setVisibility(0);
      this.mBW.setText(this.mzo);
    }
    for (;;)
    {
      if (this.mzl) {
        break label239;
      }
      GMTrace.o(9659381448704L, 71968);
      return;
      this.myH.setVisibility(8);
      this.myG.setVisibility(0);
      this.myG.setText(paramString);
      break;
      label218:
      this.mBW.setText("");
      this.mBW.setVisibility(8);
    }
    label239:
    this.mzm.setVisibility(0);
    this.mzn.updateLocaitonPinLayout(this.mzm, this.mwH, this.mwI);
    this.mzm.invalidate();
    GMTrace.o(9659381448704L, 71968);
  }
  
  public final String aKF()
  {
    GMTrace.i(9659784101888L, 71971);
    String str = this.myL;
    GMTrace.o(9659784101888L, 71971);
    return str;
  }
  
  public final void b(LocationInfo paramLocationInfo)
  {
    GMTrace.i(9659247230976L, 71967);
    this.mwH = paramLocationInfo.mwH;
    this.mwI = paramLocationInfo.mwI;
    GMTrace.o(9659247230976L, 71967);
  }
  
  public final void fJ(boolean paramBoolean)
  {
    GMTrace.i(9659113013248L, 71966);
    if ((paramBoolean) && (this.isVisible))
    {
      this.mBU.setVisibility(0);
      GMTrace.o(9659113013248L, 71966);
      return;
    }
    if (((!paramBoolean) || (this.isVisible)) && (!paramBoolean) && (this.isVisible)) {
      this.mBU.setVisibility(4);
    }
    GMTrace.o(9659113013248L, 71966);
  }
  
  public final void setText(String paramString)
  {
    GMTrace.i(9659649884160L, 71970);
    this.mwD = paramString;
    Bu(this.mwD);
    GMTrace.o(9659649884160L, 71970);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\location\ui\n.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */