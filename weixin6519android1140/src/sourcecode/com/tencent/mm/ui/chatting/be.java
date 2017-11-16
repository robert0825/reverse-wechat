package com.tencent.mm.ui.chatting;

import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Looper;
import android.util.DisplayMetrics;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnHoverListener;
import android.view.View.OnTouchListener;
import android.view.Window;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.g.a.si;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.aj.a;
import com.tencent.mm.sdk.platformtools.w;

public final class be
{
  public static b wwd;
  
  static
  {
    GMTrace.i(2300089204736L, 17137);
    wwd = new b();
    GMTrace.o(2300089204736L, 17137);
  }
  
  public static void dismiss()
  {
    GMTrace.i(2299820769280L, 17135);
    try
    {
      if (wwd != null) {
        wwd.dismiss();
      }
      GMTrace.o(2299820769280L, 17135);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.ChattingItemAvatarOnHoverHelper", "exception in dismiss, %s", new Object[] { localException.getMessage() });
      GMTrace.o(2299820769280L, 17135);
    }
  }
  
  public static void dr(View paramView)
  {
    GMTrace.i(2299686551552L, 17134);
    Object localObject = wwd;
    if ((paramView == null) || (localObject == null))
    {
      w.w("MicroMsg.OnHoverCompatibleHelper", "view or callback is null.");
      GMTrace.o(2299686551552L, 17134);
      return;
    }
    if (Build.VERSION.SDK_INT >= 14)
    {
      dz localdz = dz.cev();
      if ((Build.VERSION.SDK_INT >= 14) && (localdz.wGC == null)) {
        localdz.wGC = new dz.a((dz.b)localObject);
      }
      localObject = localdz.wGC;
      if ((localObject != null) && (Build.VERSION.SDK_INT >= 14) && ((localObject instanceof View.OnHoverListener))) {
        paramView.setOnHoverListener((View.OnHoverListener)localObject);
      }
    }
    GMTrace.o(2299686551552L, 17134);
  }
  
  public static void n(Context paramContext, String paramString, int paramInt)
  {
    GMTrace.i(16016604135424L, 119333);
    si localsi = new si();
    localsi.eXf.eHJ = 5;
    localsi.eXf.eDs = paramString;
    localsi.eXf.context = paramContext;
    localsi.eXf.eXa = paramInt;
    a.vgX.m(localsi);
    g.ork.i(11033, new Object[] { Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(0) });
    GMTrace.o(16016604135424L, 119333);
  }
  
  public static final class a
    implements View.OnTouchListener
  {
    private int rz;
    
    public a()
    {
      this(Color.argb(255, 136, 136, 136));
      GMTrace.i(2162247598080L, 16110);
      GMTrace.o(2162247598080L, 16110);
    }
    
    private a(int paramInt)
    {
      GMTrace.i(2162381815808L, 16111);
      this.rz = paramInt;
      GMTrace.o(2162381815808L, 16111);
    }
    
    public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      GMTrace.i(2162516033536L, 16112);
      int i = paramMotionEvent.getAction();
      if ((paramView instanceof ImageView))
      {
        paramView = ((ImageView)paramView).getDrawable();
        if (paramView != null)
        {
          if (i != 0) {
            break label67;
          }
          paramView.setColorFilter(this.rz, PorterDuff.Mode.MULTIPLY);
        }
      }
      for (;;)
      {
        GMTrace.o(2162516033536L, 16112);
        return false;
        paramView = paramView.getBackground();
        break;
        label67:
        if ((i == 3) || (i == 1)) {
          paramView.clearColorFilter();
        }
      }
    }
  }
  
  public static final class b
    implements View.OnClickListener, View.OnTouchListener, dz.b
  {
    public View Hw;
    private aj htb;
    private int iDc;
    public com.tencent.mm.ui.base.q wwe;
    private View wwf;
    private View wwg;
    private int wwh;
    private int wwi;
    public int wwj;
    public int wwk;
    private int wwl;
    private boolean wwm;
    public be.a wwn;
    private View.OnTouchListener wwo;
    public View wwp;
    private int wwq;
    private aj.a wwr;
    
    public b()
    {
      GMTrace.i(2202915569664L, 16413);
      this.wwn = new be.a();
      this.wwo = new View.OnTouchListener()
      {
        public final boolean onTouch(View paramAnonymousView, MotionEvent paramAnonymousMotionEvent)
        {
          GMTrace.i(2142920245248L, 15966);
          if (be.b.this.wwn != null) {
            be.b.this.wwn.onTouch(be.b.this.Hw, paramAnonymousMotionEvent);
          }
          GMTrace.o(2142920245248L, 15966);
          return false;
        }
      };
      this.wwq = 300;
      this.wwr = new aj.a()
      {
        public final boolean pM()
        {
          GMTrace.i(2297136414720L, 17115);
          if ((be.b.this.wwp != null) && (be.b.this.wwe != null)) {
            be.b.this.wwe.showAsDropDown(be.b.this.wwp, be.b.this.wwj, be.b.this.wwk);
          }
          GMTrace.o(2297136414720L, 17115);
          return false;
        }
      };
      GMTrace.o(2202915569664L, 16413);
    }
    
    public final void dismiss()
    {
      GMTrace.i(2203049787392L, 16414);
      if (this.wwe != null) {
        this.wwe.dismiss();
      }
      GMTrace.o(2203049787392L, 16414);
    }
    
    public final boolean e(View paramView, MotionEvent paramMotionEvent)
    {
      GMTrace.i(2203184005120L, 16415);
      Object localObject1 = paramView.getTag();
      if ((localObject1 == null) || (!(localObject1 instanceof dr)))
      {
        w.i("MicroMsg.ChattingItemAvatarOnHoverHelper", "The Tag of the View is not a instance of ItemDataTag or is null.");
        GMTrace.o(2203184005120L, 16415);
        return false;
      }
      localObject1 = (dr)paramView.getTag();
      Object localObject2 = ((dr)localObject1).userName;
      Object localObject3 = com.tencent.mm.y.q.zE();
      if ((t.nm((String)localObject3)) || (((String)localObject3).equals(localObject2))) {
        w.v("MicroMsg.ChattingItemAvatarOnHoverHelper", "Can't talk to self and self username can't be null.");
      }
      for (int i = 0; i == 0; i = 1)
      {
        GMTrace.o(2203184005120L, 16415);
        return false;
      }
      localObject2 = paramView.getContext();
      if (this.wwe == null)
      {
        localObject3 = ((Context)localObject2).getResources();
        float f = ((Resources)localObject3).getDimension(R.f.aQx);
        this.wwh = ((int)(((Resources)localObject3).getDimension(R.f.aPv) * 2.0F + f));
        this.Hw = View.inflate((Context)localObject2, R.i.crZ, null);
        this.wwf = this.Hw.findViewById(R.h.cka);
        this.wwg = this.Hw.findViewById(R.h.bfc);
        this.wwg.setOnClickListener(this);
        this.wwf.setOnClickListener(this);
        this.wwg.setOnTouchListener(this.wwo);
        this.wwf.setOnTouchListener(this.wwo);
        this.wwe = new com.tencent.mm.ui.base.q(this.Hw, -2, this.wwh, false);
        this.wwe.setOutsideTouchable(true);
        localObject3 = new Rect();
        if ((localObject2 instanceof Activity)) {
          ((Activity)localObject2).getWindow().getDecorView().getWindowVisibleDisplayFrame((Rect)localObject3);
        }
        this.iDc = ((Rect)localObject3).top;
        localObject3 = ((Context)localObject2).getResources().getDisplayMetrics();
        if (((DisplayMetrics)localObject3).widthPixels > ((DisplayMetrics)localObject3).heightPixels)
        {
          this.wwi = ((Context)localObject2).getResources().getDimensionPixelSize(R.f.aPM);
          this.wwe.setBackgroundDrawable(new ColorDrawable(16777215));
          this.wwl = 0;
          this.htb = new aj(Looper.getMainLooper(), this.wwr, false);
          w.i("MicroMsg.ChattingItemAvatarOnHoverHelper", "Create a new PopupWindow.");
        }
      }
      else
      {
        localObject2 = this.wwe;
        switch (paramMotionEvent.getAction())
        {
        }
      }
      do
      {
        for (;;)
        {
          GMTrace.o(2203184005120L, 16415);
          return true;
          this.wwi = ((Context)localObject2).getResources().getDimensionPixelSize(R.f.aPN);
          break;
          this.wwm = false;
          this.wwp = null;
        }
        this.wwp = paramView;
        paramView.setOnTouchListener(this);
        if (((com.tencent.mm.ui.base.q)localObject2).isShowing()) {
          ((com.tencent.mm.ui.base.q)localObject2).dismiss();
        }
      } while (this.wwm);
      this.wwg.setTag(localObject1);
      this.wwf.setTag(localObject1);
      this.wwg.setVisibility(0);
      this.wwf.setVisibility(8);
      paramMotionEvent = new int[2];
      paramView.getLocationInWindow(paramMotionEvent);
      i = paramMotionEvent[1];
      paramView.getWidth();
      int j = paramView.getHeight();
      this.wwk = this.wwl;
      if (i > this.iDc + this.wwi + this.wwh) {
        this.wwk = (-j - this.wwh - this.wwl);
      }
      this.wwj = 0;
      if (this.wwk >= 0) {
        this.Hw.setBackgroundResource(R.g.aVE);
      }
      for (;;)
      {
        paramView = this.htb;
        long l = this.wwq;
        paramView.z(l, l);
        break;
        this.Hw.setBackgroundResource(R.g.aVF);
      }
    }
    
    public final void onClick(View paramView)
    {
      GMTrace.i(2203452440576L, 16417);
      dr localdr = (dr)paramView.getTag();
      if (paramView == this.wwg) {
        be.n(paramView.getContext(), localdr.userName, 3);
      }
      for (;;)
      {
        dismiss();
        GMTrace.o(2203452440576L, 16417);
        return;
        be.n(paramView.getContext(), localdr.userName, 2);
      }
    }
    
    public final boolean onTouch(View paramView, MotionEvent paramMotionEvent)
    {
      GMTrace.i(2203318222848L, 16416);
      switch (paramMotionEvent.getAction())
      {
      }
      for (;;)
      {
        GMTrace.o(2203318222848L, 16416);
        return false;
        this.wwm = true;
        dismiss();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\be.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */