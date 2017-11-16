package com.tencent.mm.ui.chatting;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.widget.CheckBox;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.a.d.b;
import com.tencent.mm.ao.f;
import com.tencent.mm.ao.n;
import com.tencent.mm.app.MMApplicationLike;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.x.f.a;

final class g
  extends ah.a
{
  public static final int wrQ;
  public TextView hqH;
  public TextView hqI;
  public int wrJ;
  public MMImageView wrM;
  public TextView wrN;
  public View wrO;
  public boolean wrP;
  
  static
  {
    GMTrace.i(2182917128192L, 16264);
    wrQ = (int)com.tencent.mm.br.a.getDensity(MMApplicationLike.applicationLike.getApplication()) * 64;
    GMTrace.o(2182917128192L, 16264);
  }
  
  public g(int paramInt)
  {
    super(paramInt);
    GMTrace.i(2182514475008L, 16261);
    this.wrJ = 0;
    GMTrace.o(2182514475008L, 16261);
  }
  
  public final void a(final Context paramContext, f.a parama, final String paramString, boolean paramBoolean)
  {
    GMTrace.i(2182782910464L, 16263);
    I(this.wvA, this.wrJ);
    Object localObject;
    switch (parama.type)
    {
    default: 
      if (parama == null) {
        break label719;
      }
      this.hqH.setText(parama.description);
      this.hqI.setText(parama.gjE);
      this.wrM.setVisibility(0);
      if (paramBoolean)
      {
        paramContext = n.Jd();
        parama = n.IZ().x(paramString, true);
        paramString = this.wrM;
        localObject = new c.a();
        ((c.a)localObject).gKH = 1;
        localObject = ((c.a)localObject).aP(wrQ, wrQ);
        ((c.a)localObject).gKR = R.k.cJr;
        ((c.a)localObject).gKZ = true;
        paramContext.a(parama, paramString, ((c.a)localObject).Jn());
        GMTrace.o(2182782910464L, 16263);
        return;
      }
      break;
    case 16: 
      this.hqH.setText(parama.description);
      this.hqI.setText(parama.gjE);
      this.wrM.setVisibility(0);
      if (paramBoolean)
      {
        paramContext = n.Jd();
        parama = n.IZ().x(paramString, true);
        paramString = this.wrM;
        localObject = new c.a();
        ((c.a)localObject).gKH = 1;
        localObject = ((c.a)localObject).aP(wrQ, wrQ);
        ((c.a)localObject).gKR = R.k.cJr;
        ((c.a)localObject).gKZ = true;
        paramContext.a(parama, paramString, ((c.a)localObject).Jn());
        GMTrace.o(2182782910464L, 16263);
        return;
      }
      this.wrM.setImageResource(R.g.aYu);
      GMTrace.o(2182782910464L, 16263);
      return;
    case 34: 
      if ((parama.title != null) && (parama.title.length() > 0))
      {
        this.hqH.setVisibility(0);
        this.hqH.setText(parama.title);
        if (!bg.nm(parama.gjN))
        {
          this.hqH.setTextColor(bg.aL(parama.gjN, paramContext.getResources().getColor(R.e.black)));
          this.hqI.setMaxLines(2);
          this.hqI.setVisibility(0);
          this.hqI.setText(parama.description);
          if (bg.nm(parama.gjO)) {
            break label619;
          }
          this.hqI.setTextColor(bg.aL(parama.gjO, paramContext.getResources().getColor(R.e.aNR)));
          label439:
          if (bg.nm(parama.gjJ)) {
            break label639;
          }
          this.wrN.setText(parama.gjJ);
        }
      }
      for (;;)
      {
        if (paramBoolean)
        {
          paramString = n.IZ().a(paramString, com.tencent.mm.br.a.getDensity(paramContext), false);
          if ((paramString != null) && (!paramString.isRecycled()))
          {
            localObject = d.a(paramString, false, paramString.getWidth() / 2);
            this.wrM.setImageBitmap((Bitmap)localObject);
          }
          if (!bg.nm(parama.gjM))
          {
            paramString = n.Jd();
            parama = parama.gjM;
            localObject = new ImageView(paramContext);
            c.a locala = new c.a();
            locala.gKC = true;
            paramString.a(parama, (ImageView)localObject, locala.Jn(), new com.tencent.mm.ao.a.c.g()
            {
              public final void a(final String paramAnonymousString, View paramAnonymousView, b paramAnonymousb)
              {
                GMTrace.i(2284519948288L, 17021);
                if (paramAnonymousb.bitmap != null)
                {
                  paramAnonymousString = paramAnonymousb.bitmap;
                  g.this.wrO.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
                  {
                    public final boolean onPreDraw()
                    {
                      GMTrace.i(2249220685824L, 16758);
                      g.this.wrO.getViewTreeObserver().removeOnPreDrawListener(this);
                      int j = g.this.wrO.getHeight();
                      int k = g.this.wrO.getWidth();
                      int i = j;
                      if (j == 0) {
                        i = com.tencent.mm.br.a.V(g.1.this.val$context, R.f.aRI);
                      }
                      j = k;
                      if (k == 0) {
                        j = com.tencent.mm.br.a.V(g.1.this.val$context, R.f.aRJ);
                      }
                      if (g.this.wrP) {}
                      for (Object localObject = d.a(paramAnonymousString, R.g.aVh, j, i);; localObject = d.a(paramAnonymousString, R.g.aVs, j, i))
                      {
                        localObject = new BitmapDrawable((Bitmap)localObject);
                        g.this.wrO.setBackgroundDrawable((Drawable)localObject);
                        GMTrace.o(2249220685824L, 16758);
                        return true;
                      }
                    }
                  });
                }
                GMTrace.o(2284519948288L, 17021);
              }
              
              public final void ku(String paramAnonymousString)
              {
                GMTrace.i(2284385730560L, 17020);
                GMTrace.o(2284385730560L, 17020);
              }
            });
            GMTrace.o(2182782910464L, 16263);
            return;
            this.hqH.setTextColor(paramContext.getResources().getColor(R.e.black));
            break;
            this.hqH.setVisibility(8);
            break;
            label619:
            this.hqI.setTextColor(paramContext.getResources().getColor(R.e.aNR));
            break label439;
            label639:
            this.wrN.setText(R.l.dfR);
            continue;
          }
          this.wrO.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              GMTrace.i(2295525801984L, 17103);
              g.this.wrO.getViewTreeObserver().removeOnPreDrawListener(this);
              int i = com.tencent.mm.br.a.fromDPToPix(paramContext, 24);
              Bitmap localBitmap = paramString;
              if (localBitmap != null)
              {
                localObject = localBitmap;
                if (!localBitmap.isRecycled()) {}
              }
              else
              {
                localObject = d.X(paramContext.getResources().getColor(R.e.aNl), i, i);
              }
              int j = ((Bitmap)localObject).getHeight();
              if (i > j)
              {
                i = j;
                localObject = d.c(d.R(Bitmap.createScaledBitmap((Bitmap)localObject, i, i, true)), 20);
                j = g.this.wrO.getHeight();
                int k = g.this.wrO.getWidth();
                i = j;
                if (j == 0) {
                  i = com.tencent.mm.br.a.V(paramContext, R.f.aRI);
                }
                j = k;
                if (k == 0) {
                  j = com.tencent.mm.br.a.V(paramContext, R.f.aRJ);
                }
                if (!g.this.wrP) {
                  break label222;
                }
              }
              label222:
              for (Object localObject = d.a((Bitmap)localObject, R.g.aVh, j, i);; localObject = d.a((Bitmap)localObject, R.g.aVs, j, i))
              {
                localObject = new BitmapDrawable((Bitmap)localObject);
                g.this.wrO.setBackgroundDrawable((Drawable)localObject);
                GMTrace.o(2295525801984L, 17103);
                return true;
                break;
              }
            }
          });
          GMTrace.o(2182782910464L, 16263);
          return;
        }
      }
      this.wrM.setImageBitmap(BitmapFactory.decodeResource(paramContext.getResources(), R.g.aYu));
      GMTrace.o(2182782910464L, 16263);
      return;
    }
    this.wrM.setImageResource(R.g.aYu);
    label719:
    GMTrace.o(2182782910464L, 16263);
  }
  
  public final g q(View paramView, boolean paramBoolean)
  {
    GMTrace.i(2182648692736L, 16262);
    super.dq(paramView);
    this.wrP = paramBoolean;
    this.jRw = ((TextView)this.lFh.findViewById(R.h.boA));
    this.lCA = ((CheckBox)paramView.findViewById(R.h.bnd));
    this.npf = this.lFh.findViewById(R.h.bnX);
    this.oGJ = ((TextView)this.lFh.findViewById(R.h.boF));
    this.wrM = ((MMImageView)this.lFh.findViewById(R.h.beN));
    this.hqH = ((TextView)this.lFh.findViewById(R.h.beO));
    this.hqI = ((TextView)this.lFh.findViewById(R.h.beM));
    this.wrN = ((TextView)this.lFh.findViewById(R.h.beK));
    this.wrO = this.lFh.findViewById(R.h.beL);
    this.wrJ = ah.ft(ab.getContext());
    GMTrace.o(2182648692736L, 16262);
    return this;
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */