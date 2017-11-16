package com.tencent.mm.plugin.shake.c.b;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface.OnCancelListener;
import android.content.res.Resources;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.KeyEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.R.m;
import com.tencent.mm.a.g;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.g.a.os;
import com.tencent.mm.g.a.os.b;
import com.tencent.mm.g.a.ot;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.k;
import com.tencent.mm.y.at;

public final class a
  extends k
{
  private static final String jzw;
  private View.OnClickListener hwh;
  private View jBw;
  private ImageView jCf;
  private Button jCg;
  private String jwL;
  private ProgressBar ktM;
  private ImageView mGV;
  private Resources mResources;
  private TextView oNA;
  private View oNB;
  private ImageView oNC;
  private boolean oND;
  public boolean oNE;
  private boolean oNF;
  private int oNG;
  private os.b oNH;
  private int oNI;
  private b oNJ;
  private com.tencent.mm.sdk.b.c oNK;
  private com.tencent.mm.plugin.shake.c.a.e oNn;
  private View oNq;
  private TextView oNr;
  private TextView oNs;
  private TextView oNt;
  private TextView oNu;
  private View oNv;
  private View oNw;
  private View oNx;
  private TextView oNy;
  private TextView oNz;
  private TextView ooX;
  
  static
  {
    GMTrace.i(6527813419008L, 48636);
    jzw = com.tencent.mm.compatible.util.e.ghz + "card";
    GMTrace.o(6527813419008L, 48636);
  }
  
  private a(Context paramContext)
  {
    super(paramContext, R.m.emf);
    GMTrace.i(6524592193536L, 48612);
    this.oNE = false;
    this.oNF = false;
    this.oNG = 0;
    this.jwL = "";
    this.oNI = a.oNN;
    this.oNK = new com.tencent.mm.sdk.b.c() {};
    this.hwh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6528350289920L, 48640);
        if (paramAnonymousView.getId() == R.h.bjy)
        {
          a.this.dismiss();
          if (a.a(a.this) != null) {
            a.a(a.this).bfy();
          }
          w.i("MicroMsg.ShakeCardDialog", "close ShakeCardDialog");
          GMTrace.o(6528350289920L, 48640);
          return;
        }
        if (paramAnonymousView.getId() == R.h.biO)
        {
          if (a.b(a.this) == a.a.oNN)
          {
            a.a(a.this, a.a.oNO);
            a.b(a.this, 0);
            a.c(a.this);
            a.d(a.this);
            GMTrace.o(6528350289920L, 48640);
            return;
          }
          if (a.b(a.this) != a.a.oNO)
          {
            if (a.b(a.this) == a.a.oNQ)
            {
              a.d(a.this);
              GMTrace.o(6528350289920L, 48640);
              return;
            }
            if (a.b(a.this) == a.a.oNP)
            {
              com.tencent.mm.sdk.b.a.vgX.b(a.e(a.this));
              a.f(a.this);
            }
          }
        }
        GMTrace.o(6528350289920L, 48640);
      }
    };
    w.i("MicroMsg.ShakeCardDialog", "init shake card dialog");
    this.mResources = paramContext.getResources();
    setCanceledOnTouchOutside(true);
    getWindow().setSoftInputMode(2);
    this.jBw = View.inflate(paramContext, R.i.cdh, null);
    this.oNq = this.jBw.findViewById(R.h.cdh);
    this.oNr = ((TextView)this.jBw.findViewById(R.h.blR));
    this.oNs = ((TextView)this.jBw.findViewById(R.h.blE));
    this.oNt = ((TextView)this.jBw.findViewById(R.h.bjL));
    this.mGV = ((ImageView)this.jBw.findViewById(R.h.bjy));
    this.jCg = ((Button)this.jBw.findViewById(R.h.biO));
    this.oNu = ((TextView)this.jBw.findViewById(R.h.biU));
    this.ktM = ((ProgressBar)this.jBw.findViewById(R.h.bll));
    this.mGV.setOnClickListener(this.hwh);
    this.jCg.setOnClickListener(this.hwh);
    this.oNv = this.jBw.findViewById(R.h.bji);
    this.oNw = this.jBw.findViewById(R.h.coD);
    this.oNx = this.jBw.findViewById(R.h.blS);
    this.jCf = ((ImageView)this.jBw.findViewById(R.h.bkO));
    this.oNy = ((TextView)this.jBw.findViewById(R.h.blL));
    this.oNz = ((TextView)this.jBw.findViewById(R.h.bjo));
    this.oNA = ((TextView)this.jBw.findViewById(R.h.blJ));
    this.oNB = this.jBw.findViewById(R.h.blo);
    this.oNC = ((ImageView)this.jBw.findViewById(R.h.bYC));
    this.ooX = ((TextView)this.jBw.findViewById(R.h.bYB));
    this.oNG = com.tencent.mm.plugin.shake.c.c.a.bfA();
    GMTrace.o(6524592193536L, 48612);
  }
  
  public static a a(Context paramContext, com.tencent.mm.plugin.shake.c.a.e parame, DialogInterface.OnCancelListener paramOnCancelListener, b paramb)
  {
    GMTrace.i(6525665935360L, 48620);
    if (((paramContext instanceof Activity)) && (((Activity)paramContext).isFinishing()))
    {
      GMTrace.o(6525665935360L, 48620);
      return null;
    }
    a locala = new a(paramContext);
    locala.setOnCancelListener(paramOnCancelListener);
    locala.setCancelable(true);
    locala.oNn = parame;
    if (locala.oNn == null) {
      w.e("MicroMsg.ShakeCardDialog", "updateView() mCardItem == null");
    }
    for (;;)
    {
      locala.oNJ = paramb;
      locala.show();
      h.a(paramContext, locala);
      GMTrace.o(6525665935360L, 48620);
      return locala;
      if (TextUtils.isEmpty(locala.oNn.title)) {
        locala.oNr.setText(locala.oNn.title);
      }
      w.i("MicroMsg.ShakeCardDialog", "updateView() action_type is has card");
      locala.oNI = a.oNN;
      locala.bfv();
      locala.bfx();
      if (locala.oNG == 0)
      {
        locala.oNq.setBackgroundResource(R.g.aZU);
        locala.oNw.setBackgroundResource(R.g.aZV);
        locala.oNr.setTextColor(locala.mResources.getColor(R.e.black));
        locala.oNs.setTextColor(locala.mResources.getColor(R.e.aOy));
        locala.oNt.setTextColor(locala.mResources.getColor(R.e.aOy));
        locala.ooX.setTextColor(locala.getContext().getResources().getColor(R.e.black));
        locala.jCg.setBackgroundResource(R.g.aUF);
        locala.jCg.setTextColor(locala.getContext().getResources().getColor(R.e.white));
        locala.oNu.setTextColor(locala.getContext().getResources().getColor(R.e.aOA));
      }
    }
  }
  
  private void bfv()
  {
    GMTrace.i(6525263282176L, 48617);
    if (this.oNI == a.oNP)
    {
      this.oNv.setVisibility(8);
      this.oNB.setVisibility(0);
      GMTrace.o(6525263282176L, 48617);
      return;
    }
    if ((this.oNI == a.oNN) || (this.oNI == a.oNO) || (this.oNI == a.oNQ))
    {
      this.oNv.setVisibility(0);
      this.oNB.setVisibility(8);
    }
    GMTrace.o(6525263282176L, 48617);
  }
  
  private void bfw()
  {
    GMTrace.i(6525397499904L, 48618);
    if ((this.oNI == a.oNN) || (this.oNI == a.oNQ))
    {
      if (TextUtils.isEmpty(this.oNn.oMX))
      {
        this.jCg.setText(R.l.dcd);
        GMTrace.o(6525397499904L, 48618);
        return;
      }
      this.jCg.setText(this.oNn.oMX);
      GMTrace.o(6525397499904L, 48618);
      return;
    }
    if (this.oNI == a.oNO)
    {
      this.jCg.setText("");
      GMTrace.o(6525397499904L, 48618);
      return;
    }
    if (this.oNI == a.oNP) {
      this.jCg.setText(R.l.ebx);
    }
    GMTrace.o(6525397499904L, 48618);
  }
  
  private void bfx()
  {
    GMTrace.i(6525531717632L, 48619);
    int i = getContext().getResources().getDimensionPixelOffset(R.f.aSN);
    Object localObject1 = new ShapeDrawable(new RoundRectShape(new float[] { i, i, i, i, 0.0F, 0.0F, 0.0F, 0.0F }, null, null));
    ((ShapeDrawable)localObject1).getPaint().setColor(com.tencent.mm.plugin.shake.c.c.a.uD(this.oNn.gjg));
    this.oNx.setBackgroundDrawable((Drawable)localObject1);
    bfw();
    if (!TextUtils.isEmpty(this.oNn.oMV)) {
      this.oNr.setText(this.oNn.oMV);
    }
    if (!TextUtils.isEmpty(this.oNn.oMZ))
    {
      this.oNs.setText(this.oNn.oMZ);
      this.oNs.setVisibility(0);
    }
    if (!TextUtils.isEmpty(this.oNn.oMW))
    {
      this.oNt.setText(this.oNn.oMW);
      this.oNt.setVisibility(0);
    }
    String str;
    int j;
    if (!TextUtils.isEmpty(this.oNn.jxH))
    {
      i = getContext().getResources().getDimensionPixelSize(R.f.aSM);
      localObject1 = this.jCf;
      str = this.oNn.jxH;
      j = R.k.cOG;
      if ((localObject1 != null) && (!TextUtils.isEmpty(str))) {
        break label392;
      }
    }
    for (;;)
    {
      if (!TextUtils.isEmpty(this.oNn.title)) {
        this.oNy.setText(this.oNn.title);
      }
      if (!TextUtils.isEmpty(this.oNn.jyT)) {
        this.oNz.setText(this.oNn.jyT);
      }
      if (this.oNn.jxM > 0) {
        this.oNA.setText(getContext().getString(R.l.dek, new Object[] { com.tencent.mm.plugin.shake.c.c.a.ax(this.oNn.jxM) }));
      }
      if (this.oNI != a.oNQ) {
        break;
      }
      this.oNu.setVisibility(0);
      GMTrace.o(6525531717632L, 48619);
      return;
      label392:
      if (!TextUtils.isEmpty(str))
      {
        Object localObject2 = new c.a();
        ((c.a)localObject2).gKF = com.tencent.mm.compatible.util.e.ghz;
        com.tencent.mm.ao.n.Je();
        ((c.a)localObject2).gKX = null;
        ((c.a)localObject2).gKE = String.format("%s/%s", new Object[] { jzw, g.n(str.getBytes()) });
        ((c.a)localObject2).gKC = true;
        ((c.a)localObject2).gKZ = true;
        ((c.a)localObject2).gKA = true;
        ((c.a)localObject2).gKJ = i;
        ((c.a)localObject2).gKI = i;
        ((c.a)localObject2).gKR = j;
        localObject2 = ((c.a)localObject2).Jn();
        com.tencent.mm.ao.n.Jd().a(str, (ImageView)localObject1, (com.tencent.mm.ao.a.a.c)localObject2);
      }
      else
      {
        ((ImageView)localObject1).setImageResource(j);
      }
    }
    this.oNu.setVisibility(8);
    GMTrace.o(6525531717632L, 48619);
  }
  
  public final void dismiss()
  {
    GMTrace.i(6525129064448L, 48616);
    try
    {
      if (this.oNJ != null) {
        this.oNJ.bfy();
      }
      if ((this.oNI != a.oNP) && (!this.oNF))
      {
        this.oNF = true;
        w.i("MicroMsg.ShakeCardDialog", "ShakeCardDialog card is not cancel accepte");
        at.wS().a(new com.tencent.mm.plugin.shake.c.a.a(this.oNn.jxF, this.oNn.eTK), 0);
      }
      com.tencent.mm.sdk.b.a.vgX.c(this.oNK);
      w.i("MicroMsg.ShakeCardDialog", "dismiss ShakeCardDialog");
      super.dismiss();
      GMTrace.o(6525129064448L, 48616);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ShakeCardDialog", "dismiss exception, e = " + localException.getMessage());
      GMTrace.o(6525129064448L, 48616);
    }
  }
  
  protected final void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6524860628992L, 48614);
    super.onCreate(paramBundle);
    setContentView(this.jBw);
    GMTrace.o(6524860628992L, 48614);
  }
  
  public final boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6524726411264L, 48613);
    if (paramInt == 4)
    {
      w.i("MicroMsg.ShakeCardDialog", "back key in shake card dialog");
      dismiss();
      if (this.oNJ != null) {
        this.oNJ.bfy();
      }
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6524726411264L, 48613);
    return bool;
  }
  
  public final void setCancelable(boolean paramBoolean)
  {
    GMTrace.i(6524994846720L, 48615);
    super.setCancelable(paramBoolean);
    this.oND = paramBoolean;
    setCanceledOnTouchOutside(this.oND);
    GMTrace.o(6524994846720L, 48615);
  }
  
  private static enum a
  {
    static
    {
      GMTrace.i(6528618725376L, 48642);
      oNN = 1;
      oNO = 2;
      oNP = 3;
      oNQ = 4;
      oNR = new int[] { oNN, oNO, oNP, oNQ };
      GMTrace.o(6528618725376L, 48642);
    }
  }
  
  public static abstract interface b
  {
    public abstract void bfy();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\shake\c\b\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */