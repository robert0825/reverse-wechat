package com.tencent.mm.plugin.card.ui.view;

import android.graphics.Bitmap;
import android.view.View;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.bo.a.a;
import com.tencent.mm.plugin.card.b.c;
import com.tencent.mm.plugin.card.b.l;
import com.tencent.mm.plugin.card.b.m;
import com.tencent.mm.plugin.card.b.p;
import com.tencent.mm.plugin.card.base.b;
import com.tencent.mm.plugin.card.ui.j;
import com.tencent.mm.plugin.card.ui.n;
import com.tencent.mm.protocal.c.jm;
import com.tencent.mm.protocal.c.ju;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.q;

public abstract class g
  extends i
{
  String code;
  private Bitmap hwc;
  MMActivity iPC;
  private Bitmap jBA;
  private View.OnLongClickListener jBJ;
  private j jEQ;
  private ViewGroup jKe;
  private ab jKf;
  private ViewStub jKg;
  protected b jwZ;
  
  public g()
  {
    GMTrace.i(18887521337344L, 140723);
    this.jBJ = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(18895037530112L, 140779);
        if (paramAnonymousView.getId() == R.h.bpJ)
        {
          p.H(g.this.iPC, g.this.jwZ.ajw().code);
          com.tencent.mm.ui.base.h.bm(g.this.iPC, g.this.getString(R.l.cSq));
        }
        GMTrace.o(18895037530112L, 140779);
        return false;
      }
    };
    GMTrace.o(18887521337344L, 140723);
  }
  
  private static void a(ImageView paramImageView, Bitmap paramBitmap)
  {
    GMTrace.i(18889534603264L, 140738);
    if ((paramImageView == null) || (paramBitmap == null))
    {
      GMTrace.o(18889534603264L, 140738);
      return;
    }
    paramImageView.setImageBitmap(paramBitmap);
    GMTrace.o(18889534603264L, 140738);
  }
  
  public final void MP()
  {
    GMTrace.i(18887655555072L, 140724);
    this.iPC = this.jKl.aly();
    this.jEQ = this.jKl.alE();
    this.jwZ = this.jKl.alv();
    if (this.jwZ == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "initView failure! cardInfo is null!");
      GMTrace.o(18887655555072L, 140724);
      return;
    }
    switch (this.jwZ.ajw().tZf)
    {
    default: 
      this.jKf = amR();
    }
    while (this.jKf == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
      GMTrace.o(18887655555072L, 140724);
      return;
      this.jKf = amR();
      continue;
      this.jKf = amS();
      continue;
      this.jKf = amT();
    }
    switch (this.jwZ.ajw().tZf)
    {
    default: 
      if (this.jKg == null) {
        this.jKg = ((ViewStub)findViewById(R.h.blm));
      }
      if (this.jKg == null) {
        w.e("MicroMsg.CardBaseCodeView", "initTargetView failure! viewStub is null!");
      }
      break;
    }
    for (;;)
    {
      if (this.jKe != null) {
        break label421;
      }
      w.e("MicroMsg.CardBaseCodeView", "iniView failure! targetView is null!");
      GMTrace.o(18887655555072L, 140724);
      return;
      if (this.jKg != null) {
        break;
      }
      this.jKg = ((ViewStub)findViewById(R.h.blm));
      break;
      if (this.jKg != null) {
        break;
      }
      this.jKg = ((ViewStub)findViewById(R.h.bjh));
      break;
      if (this.jKg != null) {
        break;
      }
      this.jKg = ((ViewStub)findViewById(R.h.bjE));
      break;
      if (this.jKf == null)
      {
        w.e("MicroMsg.CardBaseCodeView", "iniView failure! codeContainer is null!");
      }
      else if (this.jKf.getLayoutId() == 0)
      {
        w.e("MicroMsg.CardBaseCodeView", "initTargetView failure! codeContainer.getLayoutId()  is 0!");
      }
      else
      {
        this.jKg.setLayoutResource(this.jKf.getLayoutId());
        if (this.jKe == null) {
          this.jKe = ((ViewGroup)this.jKg.inflate());
        }
      }
    }
    label421:
    GMTrace.o(18887655555072L, 140724);
  }
  
  public final void amM()
  {
    GMTrace.i(18888863514624L, 140733);
    if (this.jKe != null) {
      this.jKe.setVisibility(8);
    }
    GMTrace.o(18888863514624L, 140733);
  }
  
  public final void amP()
  {
    GMTrace.i(18888595079168L, 140731);
    if ((this.jKf != null) && (this.jwZ != null) && (this.jKe != null)) {
      this.jKf.a(this.jKe, this.jwZ);
    }
    GMTrace.o(18888595079168L, 140731);
  }
  
  public final void amQ()
  {
    GMTrace.i(18888729296896L, 140732);
    if ((this.jwZ != null) && (this.jKf != null) && (this.jKe != null))
    {
      this.jKf.b(this.jKe, this.jwZ);
      if ((this.jwZ.ajw().tZf == 2) && (this.jEQ != null))
      {
        j localj = this.jEQ;
        if ((localj.hwd != null) && (localj.hwd.isShowing())) {
          localj.hwd.dismiss();
        }
      }
      GMTrace.o(18888729296896L, 140732);
      return;
    }
    w.e("MicroMsg.CardBaseCodeView", "onScreenShot is error! mCardInfo or codeContainer or targetView is null ");
    GMTrace.o(18888729296896L, 140732);
  }
  
  public abstract ab amR();
  
  public abstract ab amS();
  
  public abstract ab amT();
  
  public final void d(c paramc)
  {
    int j = 1;
    GMTrace.i(18888192425984L, 140728);
    if (this.jwZ == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "updateCodeView getCode mCardInfo  is null ! cannot show code view");
      GMTrace.o(18888192425984L, 140728);
      return;
    }
    if (paramc == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "updateCodeView failure!refreshReason is null!");
      GMTrace.o(18888192425984L, 140728);
      return;
    }
    if (!this.jKf.i(this.jwZ))
    {
      w.e("MicroMsg.CardBaseCodeView", "updateCodeView failure! can not get qrcode! refreshReason = %s", new Object[] { Integer.valueOf(paramc.action) });
      amP();
      GMTrace.o(18888192425984L, 140728);
      return;
    }
    this.jKf.e(this.jKe);
    w.i("MicroMsg.CardBaseCodeView", "updateCodeView from refreshReason = %s", new Object[] { Integer.valueOf(paramc.action) });
    this.code = e(paramc);
    if (com.tencent.pb.common.c.h.yp(this.code))
    {
      w.e("MicroMsg.CardBaseCodeView", "updateCodeView getCode is empty! cannot show code view");
      GMTrace.o(18888192425984L, 140728);
      return;
    }
    switch (this.jwZ.ajw().tZf)
    {
    }
    for (;;)
    {
      GMTrace.o(18888192425984L, 140728);
      return;
      Object localObject = this.jKe;
      paramc = this.code;
      try
      {
        localObject = (ImageView)((View)localObject).findViewById(R.h.bpC);
        l.u(this.hwc);
        int i = j;
        if (this.jwZ != null)
        {
          i = j;
          if (this.jwZ.ajv() != null) {
            i = this.jwZ.ajv().uap;
          }
        }
        this.hwc = a.b(this.iPC, paramc, 0, i);
        a((ImageView)localObject, this.hwc);
        ((ImageView)localObject).setOnClickListener(this.jKl.alz());
        this.jEQ.hwc = this.hwc;
        paramc = this.jEQ;
        if ((paramc.hwd != null) && (paramc.hwd.isShowing())) {
          paramc.hwe.setImageBitmap(paramc.hwc);
        }
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      catch (Exception paramc)
      {
        w.printErrStackTrace("MicroMsg.CardBaseCodeView", paramc, "", new Object[0]);
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      localObject = this.jKe;
      paramc = this.code;
      try
      {
        localObject = (ImageView)((View)localObject).findViewById(R.h.bpt);
        l.u(this.jBA);
        if ((paramc != null) && (paramc.length() > 0)) {
          this.jBA = a.b(this.iPC, paramc, 5, 0);
        }
        a((ImageView)localObject, this.jBA);
        ((ImageView)localObject).setOnClickListener(this.jKl.alz());
        this.jEQ.jBA = this.jBA;
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      catch (Exception paramc)
      {
        w.printErrStackTrace("MicroMsg.CardBaseCodeView", paramc, "", new Object[0]);
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      localObject = this.jKe;
      paramc = this.code;
      localObject = (TextView)((View)localObject).findViewById(R.h.bpJ);
      ((TextView)localObject).setText(m.uL(paramc));
      ((TextView)localObject).setOnLongClickListener(this.jBJ);
      String str = this.jwZ.ajv().gjg;
      if (!com.tencent.pb.common.c.h.yp(str)) {
        ((TextView)localObject).setTextColor(l.uD(str));
      }
      if (paramc.length() <= 12)
      {
        ((TextView)localObject).setTextSize(1, 33.0F);
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      if ((paramc.length() > 12) && (paramc.length() <= 16))
      {
        ((TextView)localObject).setTextSize(1, 30.0F);
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      if ((paramc.length() > 16) && (paramc.length() <= 20))
      {
        ((TextView)localObject).setTextSize(1, 24.0F);
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      if ((paramc.length() > 20) && (paramc.length() <= 40))
      {
        ((TextView)localObject).setTextSize(1, 18.0F);
        GMTrace.o(18888192425984L, 140728);
        return;
      }
      if (paramc.length() > 40) {
        ((TextView)localObject).setVisibility(8);
      }
    }
  }
  
  public final void d(b paramb)
  {
    GMTrace.i(18887789772800L, 140725);
    if (paramb == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "updateCardInfo failure! mCardInfo is null!");
      GMTrace.o(18887789772800L, 140725);
      return;
    }
    this.jwZ = paramb;
    GMTrace.o(18887789772800L, 140725);
  }
  
  public final void destroy()
  {
    GMTrace.i(18887923990528L, 140726);
    super.destroy();
    this.iPC = null;
    this.jEQ = null;
    this.jwZ = null;
    this.jKe = null;
    this.jKf = null;
    l.u(this.hwc);
    l.u(this.jBA);
    GMTrace.o(18887923990528L, 140726);
  }
  
  public abstract String e(c paramc);
  
  public abstract boolean h(b paramb);
  
  public final void update()
  {
    GMTrace.i(18888058208256L, 140727);
    if (this.jwZ == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "update  failure! mCardInfo is null!");
      GMTrace.o(18888058208256L, 140727);
      return;
    }
    if (this.jKf == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "update failure! codeContainer is null!");
      GMTrace.o(18888058208256L, 140727);
      return;
    }
    if (this.jKe == null)
    {
      w.e("MicroMsg.CardBaseCodeView", "update failure! targetView is null!");
      GMTrace.o(18888058208256L, 140727);
      return;
    }
    this.jEQ.alW();
    d(c.jLj);
    this.jKf.c(this.jKe, this.jwZ);
    GMTrace.o(18888058208256L, 140727);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\card\ui\view\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */