package com.tencent.mm.plugin.card.sharecard.ui;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.Window;
import android.view.WindowManager.LayoutParams;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.plugin.card.a.c;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.b.p;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.model.al;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.q;

public final class a
{
  private final String TAG;
  Bitmap hwc;
  View.OnClickListener hwh;
  public MMActivity iPC;
  Bitmap jBA;
  TextView jBB;
  TextView jBC;
  public CheckBox jBD;
  String jBE;
  int jBF;
  boolean jBG;
  public a jBH;
  float jBI;
  private View.OnLongClickListener jBJ;
  View jBw;
  private View jBx;
  private View jBy;
  private View jBz;
  public b jwZ;
  
  public a(MMActivity paramMMActivity, View paramView)
  {
    GMTrace.i(5091683729408L, 37936);
    this.TAG = "MicroMsg.CardConsumeCodeController";
    this.jBF = 1;
    this.jBG = false;
    this.jBI = 0.0F;
    this.hwh = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(5085107060736L, 37887);
        if (paramAnonymousView.getId() == R.h.bRY) {
          if (a.this.jBD.isChecked())
          {
            if (a.this.jBH != null)
            {
              a.this.jBH.lL(1);
              GMTrace.o(5085107060736L, 37887);
            }
          }
          else if (a.this.jBH != null) {
            a.this.jBH.lL(0);
          }
        }
        GMTrace.o(5085107060736L, 37887);
      }
    };
    this.jBJ = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(5090878423040L, 37930);
        if (paramAnonymousView.getId() == R.h.bpJ)
        {
          p.H(a.this.iPC, a.this.jwZ.ajw().code);
          com.tencent.mm.ui.base.h.bm(a.this.iPC, a.this.iPC.getString(R.l.cSq));
        }
        GMTrace.o(5090878423040L, 37930);
        return false;
      }
    };
    this.iPC = paramMMActivity;
    this.jBw = paramView;
    GMTrace.o(5091683729408L, 37936);
  }
  
  private void a(ImageView paramImageView, Bitmap paramBitmap)
  {
    GMTrace.i(5092086382592L, 37939);
    if ((paramImageView == null) || (paramBitmap == null) || (paramBitmap.isRecycled()))
    {
      GMTrace.o(5092086382592L, 37939);
      return;
    }
    paramImageView.setImageBitmap(paramBitmap);
    if (this.jBF != 1)
    {
      paramImageView.setAlpha(10);
      GMTrace.o(5092086382592L, 37939);
      return;
    }
    paramImageView.setAlpha(255);
    GMTrace.o(5092086382592L, 37939);
  }
  
  private void cg(View paramView)
  {
    GMTrace.i(5092220600320L, 37940);
    paramView = (Button)paramView.findViewById(R.h.bpB);
    if (this.jBF == 1) {
      paramView.setVisibility(8);
    }
    for (;;)
    {
      if (this.jBF == -1) {
        paramView.setText(R.l.dcZ);
      }
      GMTrace.o(5092220600320L, 37940);
      return;
      paramView.setVisibility(0);
    }
  }
  
  final void Y(float paramFloat)
  {
    GMTrace.i(5091817947136L, 37937);
    WindowManager.LayoutParams localLayoutParams = this.iPC.getWindow().getAttributes();
    localLayoutParams.screenBrightness = paramFloat;
    this.iPC.getWindow().setAttributes(localLayoutParams);
    GMTrace.o(5091817947136L, 37937);
  }
  
  public final void akN()
  {
    GMTrace.i(5091952164864L, 37938);
    w.i("MicroMsg.CardConsumeCodeController", "doUpdate()");
    if (!this.jBG)
    {
      w.i("MicroMsg.CardConsumeCodeController", "doUpdate() not ready show!");
      GMTrace.o(5091952164864L, 37938);
      return;
    }
    Object localObject1;
    Object localObject2;
    if (!bg.nm(this.jwZ.ajw().tZs))
    {
      localObject1 = this.jwZ.ajw().tZs;
      w.i("MicroMsg.CardConsumeCodeController", "code:%s from sign_number", new Object[] { localObject1 });
      switch (this.jwZ.ajw().tZf)
      {
      default: 
        if (!bg.nm(this.jwZ.ajv().jWE)) {
          if (this.jwZ.ajv().uam != null)
          {
            this.jBC.setText(this.jwZ.ajv().jWE);
            this.jBC.setVisibility(0);
            this.jBB.setVisibility(8);
            if (this.jBx != null)
            {
              localObject1 = (ImageView)this.jBx.findViewById(R.h.bpC);
              localObject2 = ((ImageView)localObject1).getLayoutParams();
              ((ViewGroup.LayoutParams)localObject2).height = com.tencent.mm.br.a.fromDPToPix(this.iPC, 180);
              ((ViewGroup.LayoutParams)localObject2).width = com.tencent.mm.br.a.fromDPToPix(this.iPC, 180);
              ((ImageView)localObject1).setLayoutParams((ViewGroup.LayoutParams)localObject2);
            }
          }
        }
        break;
      }
    }
    for (;;)
    {
      if ((!this.jwZ.ajb()) || (TextUtils.isEmpty(this.jwZ.ajB())) || (this.jwZ.ajB().equals(q.zE()))) {
        break label1215;
      }
      this.jBD.setVisibility(0);
      localObject1 = " " + this.iPC.getString(R.l.dcp, new Object[] { l.uG(this.jwZ.ajB()) });
      this.jBD.setText(com.tencent.mm.pluginsdk.ui.d.h.g(this.iPC, (CharSequence)localObject1, this.iPC.getResources().getDimensionPixelOffset(R.f.aQP)));
      GMTrace.o(5091952164864L, 37938);
      return;
      if (this.jwZ.ajp())
      {
        localObject1 = al.akA().getCode();
        w.i("MicroMsg.CardConsumeCodeController", "code:%s from dynamic code", new Object[] { localObject1 });
        break;
      }
      localObject1 = this.jwZ.ajw().code;
      w.i("MicroMsg.CardConsumeCodeController", "code:%s from dataInfo", new Object[] { localObject1 });
      break;
      if (this.jBx == null) {
        this.jBx = ((ViewStub)this.jBw.findViewById(R.h.bjD)).inflate();
      }
      Object localObject3 = this.jBx;
      localObject2 = (ImageView)((View)localObject3).findViewById(R.h.bpC);
      localObject3 = (TextView)((View)localObject3).findViewById(R.h.bpJ);
      if (!this.jwZ.ajc()) {
        ((TextView)localObject3).setTextColor(l.uD(this.jwZ.ajv().gjg));
      }
      if (((String)localObject1).length() <= 40)
      {
        ((TextView)localObject3).setText(m.uL((String)localObject1));
        if (this.jwZ.ajl())
        {
          ((TextView)localObject3).setVisibility(0);
          ((TextView)localObject3).setOnLongClickListener(this.jBJ);
          label585:
          if (this.jBF != 1) {
            ((TextView)localObject3).setVisibility(4);
          }
        }
      }
      try
      {
        l.u(this.hwc);
        if (!TextUtils.isEmpty((CharSequence)localObject1))
        {
          this.hwc = com.tencent.mm.bo.a.a.b(this.iPC, (String)localObject1, 0, 3);
          a((ImageView)localObject2, this.hwc);
        }
        for (;;)
        {
          cg(this.jBx);
          break;
          ((TextView)localObject3).setVisibility(8);
          break label585;
          ((TextView)localObject3).setVisibility(8);
          break label585;
          this.hwc = null;
          ((ImageView)localObject2).setImageBitmap(this.hwc);
        }
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.CardConsumeCodeController", localException1, "", new Object[0]);
        }
      }
      if (this.jBy == null) {
        this.jBy = ((ViewStub)this.jBw.findViewById(R.h.bjz)).inflate();
      }
      localObject3 = this.jBy;
      localObject2 = (ImageView)((View)localObject3).findViewById(R.h.bpt);
      localObject3 = (TextView)((View)localObject3).findViewById(R.h.bpJ);
      if (!this.jwZ.ajc()) {
        ((TextView)localObject3).setTextColor(l.uD(this.jwZ.ajv().gjg));
      }
      if ((!TextUtils.isEmpty(localException1)) && (localException1.length() <= 40))
      {
        ((TextView)localObject3).setText(m.uL(localException1));
        if (this.jwZ.ajl())
        {
          ((TextView)localObject3).setVisibility(0);
          ((TextView)localObject3).setOnLongClickListener(this.jBJ);
          label831:
          if (this.jBF != 1) {
            ((TextView)localObject3).setVisibility(4);
          }
        }
      }
      try
      {
        l.u(this.jBA);
        if (!TextUtils.isEmpty(localException1))
        {
          this.jBA = com.tencent.mm.bo.a.a.b(this.iPC, localException1, 5, 0);
          a((ImageView)localObject2, this.jBA);
        }
        for (;;)
        {
          cg(this.jBy);
          break;
          ((TextView)localObject3).setVisibility(8);
          break label831;
          ((TextView)localObject3).setVisibility(8);
          break label831;
          this.jBA = null;
          ((ImageView)localObject2).setImageBitmap(this.jBA);
        }
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.CardConsumeCodeController", localException2, "", new Object[0]);
        }
      }
      if (this.jBz == null) {
        this.jBz = ((ViewStub)this.jBw.findViewById(R.h.bjF)).inflate();
      }
      localObject2 = (TextView)this.jBz.findViewById(R.h.bpJ);
      ((TextView)localObject2).setText(m.uL(localException2));
      ((TextView)localObject2).setOnLongClickListener(this.jBJ);
      if (!this.jwZ.ajc()) {
        ((TextView)localObject2).setTextColor(l.uD(this.jwZ.ajv().gjg));
      }
      if (localException2.length() <= 12) {
        ((TextView)localObject2).setTextSize(1, 33.0F);
      }
      for (;;)
      {
        cg(this.jBz);
        break;
        if ((localException2.length() > 12) && (localException2.length() <= 16)) {
          ((TextView)localObject2).setTextSize(1, 30.0F);
        } else if ((localException2.length() > 16) && (localException2.length() <= 20)) {
          ((TextView)localObject2).setTextSize(1, 24.0F);
        } else if ((localException2.length() > 20) && (localException2.length() <= 40)) {
          ((TextView)localObject2).setTextSize(1, 18.0F);
        } else if (localException2.length() > 40) {
          ((TextView)localObject2).setVisibility(8);
        }
      }
      this.jBB.setText(this.jwZ.ajv().jWE);
      this.jBB.setVisibility(0);
      continue;
      this.jBB.setVisibility(8);
      this.jBC.setVisibility(8);
    }
    label1215:
    this.jBD.setChecked(false);
    this.jBD.setVisibility(8);
    GMTrace.o(5091952164864L, 37938);
  }
  
  public static abstract interface a
  {
    public abstract void lL(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\sharecard\ui\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */