package com.tencent.mm.bl;

import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Looper;
import android.text.Editable;
import android.view.MotionEvent;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.api.i;
import com.tencent.mm.api.j;
import com.tencent.mm.api.l;
import com.tencent.mm.api.m.a;
import com.tencent.mm.bg.a.d;
import com.tencent.mm.bg.a.e;
import com.tencent.mm.bg.a.h;
import com.tencent.mm.cache.ArtistCacheManager;
import com.tencent.mm.cache.ArtistCacheManager.a;
import com.tencent.mm.d.c;
import com.tencent.mm.d.c.5;
import com.tencent.mm.d.c.7;
import com.tencent.mm.d.c.8;
import com.tencent.mm.d.c.9;
import com.tencent.mm.d.f;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.t.d.a;
import java.io.File;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;

public final class a
  implements b
{
  m.a eqF;
  public com.tencent.mm.view.a tIY;
  public HashMap<com.tencent.mm.api.d, com.tencent.mm.d.b> tIZ;
  public LinkedList<com.tencent.mm.d.b> tJa;
  private com.tencent.mm.api.e tJb;
  Bitmap tJc;
  private boolean tJd;
  com.tencent.mm.api.d tJe;
  com.tencent.mm.api.d tJf;
  public com.tencent.mm.d.b tJg;
  
  public a()
  {
    GMTrace.i(19599143731200L, 146025);
    this.tJd = true;
    this.tJe = com.tencent.mm.api.d.eqx;
    this.tJf = com.tencent.mm.api.d.eqx;
    this.tJg = null;
    GMTrace.o(19599143731200L, 146025);
  }
  
  private void bNR()
  {
    GMTrace.i(19602767609856L, 146052);
    this.tJa.clear();
    this.tIZ.clear();
    this.tIZ.put(com.tencent.mm.api.d.eqx, com.tencent.mm.d.b.evo);
    com.tencent.mm.api.d[] arrayOfd = this.tIY.bNI();
    int k = arrayOfd.length;
    int i = 0;
    Object localObject2;
    Object localObject1;
    int j;
    if (i < k)
    {
      com.tencent.mm.api.d locald = arrayOfd[i];
      localObject2 = null;
      Iterator localIterator = null;
      localObject1 = localIterator;
      switch (7.tJj[locald.ordinal()])
      {
      default: 
      case 6: 
      case 4: 
        for (localObject1 = localIterator;; localObject1 = new com.tencent.mm.d.d())
        {
          if (localObject1 != null)
          {
            if (!this.tIZ.containsKey(locald)) {
              this.tIZ.put(locald, localObject1);
            }
            if (!this.tJa.contains(localObject1))
            {
              this.tJa.add(localObject1);
              ((com.tencent.mm.d.b)localObject1).a(this, this.tIY.cky().pY(), this.tIY.cky().ckN());
            }
          }
          i += 1;
          break;
        }
      case 1: 
      case 2: 
        localIterator = this.tJa.iterator();
        while (localIterator.hasNext())
        {
          localObject1 = (com.tencent.mm.d.b)localIterator.next();
          if (((com.tencent.mm.d.b)localObject1).pN() == com.tencent.mm.d.a.eve) {
            j = 1;
          }
        }
      }
    }
    while (j == 0)
    {
      localObject1 = new com.tencent.mm.d.e();
      ((com.tencent.mm.d.e)localObject1).ewu = new a();
      break;
      localObject1 = new f();
      break;
      localObject1 = new c();
      break;
      Collections.sort(this.tJa, new Comparator() {});
      w.i("MicroMsg.DrawingPresenter", "[addArtists] count:%s", new Object[] { Integer.valueOf(this.tIZ.size() - 1) });
      GMTrace.o(19602767609856L, 146052);
      return;
      j = 0;
      localObject1 = localObject2;
    }
  }
  
  public final boolean E(MotionEvent paramMotionEvent)
  {
    boolean bool3 = false;
    boolean bool2 = false;
    GMTrace.i(19602364956672L, 146049);
    boolean bool1 = bool2;
    Object localObject;
    if (bNN().pN() != com.tencent.mm.d.a.evf)
    {
      if (bNN().pN() == com.tencent.mm.d.a.evg) {
        bool1 = bool2;
      }
    }
    else
    {
      if (bool1) {
        break label228;
      }
      this.tJg = ((com.tencent.mm.d.b)this.tIZ.get(this.tIY.ckx().clc()));
      localObject = this.tJa.iterator();
      while (((Iterator)localObject).hasNext())
      {
        com.tencent.mm.d.b localb = (com.tencent.mm.d.b)((Iterator)localObject).next();
        if ((localb.pN() != com.tencent.mm.d.a.eve) && (localb.q(paramMotionEvent))) {
          bool1 = true;
        }
      }
    }
    label228:
    for (;;)
    {
      GMTrace.o(19602364956672L, 146049);
      return bool1;
      localObject = null;
      if (this.tIZ.containsKey(com.tencent.mm.api.d.eqz)) {
        localObject = (com.tencent.mm.d.b)this.tIZ.get(com.tencent.mm.api.d.eqz);
      }
      for (;;)
      {
        bool2 = bool3;
        if (localObject != null) {
          bool2 = ((com.tencent.mm.d.b)localObject).q(paramMotionEvent);
        }
        bool1 = bool2;
        if (!bool2) {
          break;
        }
        this.tJg = ((com.tencent.mm.d.b)localObject);
        bool1 = bool2;
        break;
        if (this.tIZ.containsKey(com.tencent.mm.api.d.eqA)) {
          localObject = (com.tencent.mm.d.b)this.tIZ.get(com.tencent.mm.api.d.eqA);
        }
      }
    }
  }
  
  public final com.tencent.mm.cache.d a(com.tencent.mm.d.a parama)
  {
    GMTrace.i(19602633392128L, 146051);
    parama = ArtistCacheManager.rR().a(parama);
    GMTrace.o(19602633392128L, 146051);
    return parama;
  }
  
  public final void a(Editable paramEditable, int paramInt)
  {
    GMTrace.i(19600485908480L, 146035);
    ku(false);
    this.tIY.an(true);
    Object localObject = bNN();
    EditText localEditText;
    if (((com.tencent.mm.d.b)localObject).pN() == com.tencent.mm.d.a.eve)
    {
      localObject = (com.tencent.mm.d.e)localObject;
      localEditText = (EditText)this.tIY.ckB().findViewById(a.e.gei);
      if ((localEditText.getTag() == null) || (!(localEditText.getTag() instanceof com.tencent.mm.t.e))) {
        break label119;
      }
      ((com.tencent.mm.d.e)localObject).a((com.tencent.mm.t.e)localEditText.getTag(), h.a(this.tIY.getContext(), paramEditable), paramInt);
    }
    for (;;)
    {
      localEditText.setTag(null);
      GMTrace.o(19600485908480L, 146035);
      return;
      label119:
      ((com.tencent.mm.d.e)localObject).a(h.a(this.tIY.getContext(), paramEditable), paramInt);
    }
  }
  
  public final void a(com.tencent.mm.api.e parame)
  {
    GMTrace.i(19599814819840L, 146030);
    this.tJb = parame;
    GMTrace.o(19599814819840L, 146030);
  }
  
  public final void a(j paramj, boolean paramBoolean)
  {
    GMTrace.i(19601425432576L, 146042);
    com.tencent.mm.sdk.f.e.post(new b(paramj, paramBoolean), "onFinalGenerate");
    GMTrace.o(19601425432576L, 146042);
  }
  
  public final void a(m.a parama)
  {
    GMTrace.i(19599412166656L, 146027);
    this.eqF = parama;
    this.tIZ = new HashMap();
    this.tJa = new LinkedList();
    String str = parama.path;
    int i;
    if ((bg.nm(str)) || (!new File(str).exists()))
    {
      w.w("MicroMsg.DrawingPresenter", "[checkImage] path:%s", new Object[] { str });
      i = 0;
    }
    for (;;)
    {
      if (i != 0) {
        this.tJc = com.tencent.mm.sdk.platformtools.d.a(bg.aq(parama.path, ""), 1280, 1280, true, false, 0);
      }
      bNR();
      GMTrace.o(19599412166656L, 146027);
      return;
      BitmapFactory.Options localOptions = new BitmapFactory.Options();
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeFile(str, localOptions);
      if ((localOptions.outWidth <= 0) || (localOptions.outHeight <= 0))
      {
        w.e("MicroMsg.DrawingPresenter", "[checkImage] image err! w:%s h:%s path:%s", new Object[] { Integer.valueOf(localOptions.outWidth), Integer.valueOf(localOptions.outHeight), str });
        i = 0;
      }
      else
      {
        i = 1;
      }
    }
  }
  
  public final void a(com.tencent.mm.view.a parama)
  {
    GMTrace.i(19599277948928L, 146026);
    this.tIY = parama;
    GMTrace.o(19599277948928L, 146026);
  }
  
  public final void am(boolean paramBoolean)
  {
    GMTrace.i(19599949037568L, 146031);
    this.tJd = paramBoolean;
    GMTrace.o(19599949037568L, 146031);
  }
  
  public final <T extends com.tencent.mm.d.b> T b(com.tencent.mm.api.d paramd)
  {
    GMTrace.i(19602096521216L, 146047);
    paramd = (com.tencent.mm.d.b)this.tIZ.get(paramd);
    GMTrace.o(19602096521216L, 146047);
    return paramd;
  }
  
  public final com.tencent.mm.api.d[] bNI()
  {
    GMTrace.i(19599546384384L, 146028);
    com.tencent.mm.api.d[] arrayOfd = this.tIY.bNI();
    GMTrace.o(19599546384384L, 146028);
    return arrayOfd;
  }
  
  public final l bNJ()
  {
    GMTrace.i(19599680602112L, 146029);
    l local1 = new l()
    {
      public final void a(com.tencent.mm.api.d paramAnonymousd)
      {
        GMTrace.i(19609075843072L, 146099);
        w.i("MicroMsg.DrawingPresenter", "[onSelectedFeature] features:%s", new Object[] { paramAnonymousd });
        if (a.this.tIY.eqv != null) {
          a.this.tIY.eqv.a(paramAnonymousd);
        }
        if (paramAnonymousd == com.tencent.mm.api.d.eqD) {
          a.this.tIY.ckz().setVisibility(8);
        }
        com.tencent.mm.d.b localb = (com.tencent.mm.d.b)a.this.tIZ.get(paramAnonymousd);
        if (localb == null)
        {
          GMTrace.o(19609075843072L, 146099);
          return;
        }
        if ((localb.evm) && (!localb.isAlive())) {
          localb.pQ();
        }
        if (localb.pN() != com.tencent.mm.d.a.evb) {
          localb.av(false);
        }
        localb.pR();
        a.this.tJg = localb;
        switch (a.7.tJj[paramAnonymousd.ordinal()])
        {
        default: 
        case 1: 
        case 2: 
          for (;;)
          {
            a.this.tJf = paramAnonymousd;
            GMTrace.o(19609075843072L, 146099);
            return;
            ((EditText)a.this.tIY.ckB().findViewById(a.e.gei)).setTextColor(com.tencent.mm.view.footer.a.xBe[2]);
            a.this.ku(true);
            a.this.tIY.an(false);
            continue;
            a.this.tIY.ao(false);
            a.this.tIY.an(false);
            a.this.tIY.mP(false);
          }
        }
        a.this.tJe = a.this.tJf;
        GMTrace.o(19609075843072L, 146099);
      }
      
      public final void a(com.tencent.mm.api.d paramAnonymousd, int paramAnonymousInt)
      {
        GMTrace.i(19609210060800L, 146100);
        w.i("MicroMsg.DrawingPresenter", "[onSelectedDetailFeature] features:%s index:%s", new Object[] { paramAnonymousd, Integer.valueOf(paramAnonymousInt) });
        if (a.this.tIY.eqv != null) {
          a.this.tIY.eqv.a(paramAnonymousd, paramAnonymousInt);
        }
        a.this.tJg = ((com.tencent.mm.d.b)a.this.tIZ.get(paramAnonymousd));
        if (a.this.bNN().pN() == com.tencent.mm.d.a.evb)
        {
          GMTrace.o(19609210060800L, 146100);
          return;
        }
        if (a.this.tIY.ckz().getVisibility() == 8) {
          a.this.tIY.ckz().setVisibility(0);
        }
        switch (a.7.tJj[paramAnonymousd.ordinal()])
        {
        }
        for (;;)
        {
          GMTrace.o(19609210060800L, 146100);
          return;
          paramAnonymousd = (com.tencent.mm.d.d)a.this.bNN();
          if (paramAnonymousInt != -1)
          {
            a.this.tIY.ckx();
            paramAnonymousd.rz = com.tencent.mm.view.footer.a.getColor(paramAnonymousInt);
            GMTrace.o(19609210060800L, 146100);
            return;
          }
          paramAnonymousd.pW();
          GMTrace.o(19609210060800L, 146100);
          return;
          paramAnonymousd = (f)a.this.bNN();
          if (paramAnonymousInt == 0)
          {
            paramAnonymousd.ewB = d.a.fWK;
            GMTrace.o(19609210060800L, 146100);
            return;
          }
          if (1 == paramAnonymousInt)
          {
            paramAnonymousd.ewB = d.a.fWL;
            GMTrace.o(19609210060800L, 146100);
            return;
          }
          paramAnonymousd.pW();
          GMTrace.o(19609210060800L, 146100);
          return;
          paramAnonymousd = (c)a.this.bNN();
          Object localObject;
          float f1;
          if (paramAnonymousInt == 0)
          {
            paramAnonymousd.evW += 1;
            paramAnonymousd.evG.cancel();
            if (paramAnonymousd.evU != null) {
              paramAnonymousd.evU.cancel();
            }
            localObject = new Matrix();
            ((Matrix)localObject).postRotate(-90.0F, paramAnonymousd.eqa.centerX(), paramAnonymousd.eqa.centerY());
            if (paramAnonymousd.evV.isEmpty()) {
              paramAnonymousd.evV.set(paramAnonymousd.eqa);
            }
            RectF localRectF = new RectF(paramAnonymousd.evV);
            ((Matrix)localObject).mapRect(localRectF);
            f1 = 1.0F * paramAnonymousd.evC.width() / localRectF.width();
            float f2 = 1.0F * paramAnonymousd.evC.height() / localRectF.height();
            if (f1 < f2) {}
            for (;;)
            {
              ((Matrix)localObject).postScale(f1, f1, paramAnonymousd.eqa.centerX(), paramAnonymousd.eqa.centerY());
              localRectF.set(paramAnonymousd.evV);
              ((Matrix)localObject).mapRect(localRectF);
              paramAnonymousd.evV.set((int)localRectF.left, (int)localRectF.top, (int)localRectF.right, (int)localRectF.bottom);
              f2 = paramAnonymousd.eqa.centerX();
              float f3 = paramAnonymousd.eqa.centerY();
              localObject = ValueAnimator.ofPropertyValuesHolder(new PropertyValuesHolder[] { PropertyValuesHolder.ofInt("rotation", new int[] { 0, -90 }), PropertyValuesHolder.ofInt("deltaX", new int[] { 0, paramAnonymousd.evC.centerX() - (int)f2 }), PropertyValuesHolder.ofInt("deltaY", new int[] { 0, paramAnonymousd.evC.centerY() - (int)f3 }) });
              ((ValueAnimator)localObject).addUpdateListener(new c.8(paramAnonymousd, f2, f3, f1));
              ((ValueAnimator)localObject).addListener(new c.9(paramAnonymousd));
              ((ValueAnimator)localObject).setDuration(200L);
              ((ValueAnimator)localObject).start();
              GMTrace.o(19609210060800L, 146100);
              return;
              f1 = f2;
            }
          }
          if (1 == paramAnonymousInt)
          {
            w.i("MicroMsg.CropArtist", "[cancel]");
            paramAnonymousd.evG.cancel();
            if (paramAnonymousd.evU != null) {
              paramAnonymousd.evU.cancel();
            }
            paramAnonymousd.evi.bNL().cky().xAv = paramAnonymousd.evi.bNL().cky().xAw;
            localObject = ((com.tencent.mm.cache.a)paramAnonymousd.pP()).rT();
            f1 = 0.0F;
            if (localObject != null) {
              f1 = paramAnonymousd.getRotation() - paramAnonymousd.a(((com.tencent.mm.t.a)localObject).mMatrix);
            }
            if ((localObject != null) && (!((com.tencent.mm.t.a)localObject).fWo.isEmpty())) {
              paramAnonymousd.evi.bNL().cky().m(((com.tencent.mm.t.a)localObject).fWo);
            }
            paramAnonymousd.evi.bNL().cky().a(null, f1, true);
            paramAnonymousd.evi.bNL().ckA().setVisibility(0);
            a.this.tJg = ((com.tencent.mm.d.b)a.this.tIZ.get(a.this.tJe));
            a.this.tIY.ckx().c(a.this.tJe);
            GMTrace.o(19609210060800L, 146100);
            return;
          }
          if (2 == paramAnonymousInt)
          {
            w.i("MicroMsg.CropArtist", "[doCrop]");
            if (paramAnonymousd.evU != null) {
              paramAnonymousd.evU.cancel();
            }
            if (!paramAnonymousd.evG.eqi)
            {
              if (!paramAnonymousd.evG.eqj)
              {
                paramAnonymousd.evG.cancel();
                paramAnonymousd.evG.play();
              }
              paramAnonymousd.evG.eqe = new c.5(paramAnonymousd);
            }
            for (;;)
            {
              a.this.tJg = ((com.tencent.mm.d.b)a.this.tIZ.get(a.this.tJe));
              a.this.tIY.ckx().c(a.this.tJe);
              GMTrace.o(19609210060800L, 146100);
              return;
              paramAnonymousd.evG.eqe = null;
              paramAnonymousd.qe();
            }
          }
          if (3 == paramAnonymousInt)
          {
            w.i("MicroMsg.CropArtist", "[reset]");
            paramAnonymousd.evX = true;
            paramAnonymousd.evG.cancel();
            if (paramAnonymousd.evU != null) {
              paramAnonymousd.evU.cancel();
            }
            paramAnonymousd.evV.setEmpty();
            paramAnonymousd.qd();
            paramAnonymousd.evM = false;
            paramAnonymousd.evi.bNL().cky().xAv = paramAnonymousd.eqa;
            paramAnonymousd.evi.bNL().cky().a(new c.7(paramAnonymousd), paramAnonymousd.getRotation(), true);
          }
        }
      }
      
      public final void ap(boolean paramAnonymousBoolean)
      {
        GMTrace.i(19609344278528L, 146101);
        GMTrace.o(19609344278528L, 146101);
      }
    };
    GMTrace.o(19599680602112L, 146029);
    return local1;
  }
  
  public final void bNK()
  {
    GMTrace.i(19600620126208L, 146036);
    this.tIY.an(true);
    ku(false);
    GMTrace.o(19600620126208L, 146036);
  }
  
  public final com.tencent.mm.view.a bNL()
  {
    GMTrace.i(19600754343936L, 146037);
    com.tencent.mm.view.a locala = this.tIY;
    GMTrace.o(19600754343936L, 146037);
    return locala;
  }
  
  public final m.a bNM()
  {
    GMTrace.i(19601022779392L, 146039);
    m.a locala = this.eqF;
    GMTrace.o(19601022779392L, 146039);
    return locala;
  }
  
  public final <T extends com.tencent.mm.d.b> T bNN()
  {
    GMTrace.i(19601156997120L, 146040);
    if (this.tJg != null)
    {
      localb = this.tJg;
      GMTrace.o(19601156997120L, 146040);
      return localb;
    }
    w.e("MicroMsg.DrawingPresenter", "[getCurArtist] is null!");
    com.tencent.mm.d.b localb = com.tencent.mm.d.b.evo;
    GMTrace.o(19601156997120L, 146040);
    return localb;
  }
  
  public final float bNO()
  {
    GMTrace.i(19601291214848L, 146041);
    com.tencent.mm.view.b.a locala = this.tIY.cky();
    if (locala.ckM())
    {
      float f = locala.fWu;
      GMTrace.o(19601291214848L, 146041);
      return f;
    }
    GMTrace.o(19601291214848L, 146041);
    return 1.0F;
  }
  
  public final Bitmap bNP()
  {
    GMTrace.i(19601828085760L, 146045);
    Bitmap localBitmap = this.tJc;
    GMTrace.o(19601828085760L, 146045);
    return localBitmap;
  }
  
  public final boolean bNQ()
  {
    GMTrace.i(19601962303488L, 146046);
    if ((bNN().pN() != com.tencent.mm.d.a.evf) && (this.tJd))
    {
      GMTrace.o(19601962303488L, 146046);
      return true;
    }
    GMTrace.o(19601962303488L, 146046);
    return false;
  }
  
  public final void c(i parami)
  {
    GMTrace.i(19602230738944L, 146048);
    ((com.tencent.mm.d.e)b(com.tencent.mm.api.d.eqA)).b(parami);
    GMTrace.o(19602230738944L, 146048);
  }
  
  public final Context getContext()
  {
    GMTrace.i(19600888561664L, 146038);
    Context localContext = this.tIY.getContext();
    GMTrace.o(19600888561664L, 146038);
    return localContext;
  }
  
  public final void ku(boolean paramBoolean)
  {
    GMTrace.i(19602901827584L, 146053);
    if (paramBoolean)
    {
      localAnimation = AnimationUtils.loadAnimation(this.tIY.getContext(), com.tencent.mm.bg.a.a.aLG);
      localAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19603438698496L, 146057);
          a.this.tIY.ckB().setVisibility(0);
          paramAnonymousAnimation = (EditText)a.this.tIY.ckB().findViewById(a.e.gei);
          paramAnonymousAnimation.requestFocus();
          paramAnonymousAnimation.setSelection(paramAnonymousAnimation.length());
          a.this.tIY.eqv.ap(true);
          a.this.tIY.ckA().post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19599009513472L, 146024);
              a.this.tIY.ckA().setVisibility(0);
              GMTrace.o(19599009513472L, 146024);
            }
          });
          GMTrace.o(19603438698496L, 146057);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19603572916224L, 146058);
          GMTrace.o(19603572916224L, 146058);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19603304480768L, 146056);
          GMTrace.o(19603304480768L, 146056);
        }
      });
      this.tIY.ckB().startAnimation(localAnimation);
      GMTrace.o(19602901827584L, 146053);
      return;
    }
    Animation localAnimation = AnimationUtils.loadAnimation(this.tIY.getContext(), com.tencent.mm.bg.a.a.aLE);
    localAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(19610686455808L, 146111);
        ((EditText)a.this.tIY.ckB().findViewById(a.e.gei)).setText("");
        a.this.tIY.ckB().setVisibility(8);
        GMTrace.o(19610686455808L, 146111);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(19610820673536L, 146112);
        GMTrace.o(19610820673536L, 146112);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(19610552238080L, 146110);
        a.this.tIY.eqv.ap(false);
        GMTrace.o(19610552238080L, 146110);
      }
    });
    this.tIY.ckB().startAnimation(localAnimation);
    GMTrace.o(19602901827584L, 146053);
  }
  
  public final void kv(boolean paramBoolean)
  {
    GMTrace.i(19603036045312L, 146054);
    if (paramBoolean)
    {
      localAnimation = AnimationUtils.loadAnimation(this.tIY.getContext(), com.tencent.mm.bg.a.a.aLG);
      localAnimation.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19610149584896L, 146107);
          a.this.tIY.ckC().setVisibility(0);
          GMTrace.o(19610149584896L, 146107);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19610283802624L, 146108);
          GMTrace.o(19610283802624L, 146108);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(19610015367168L, 146106);
          GMTrace.o(19610015367168L, 146106);
        }
      });
      this.tIY.ckC().startAnimation(localAnimation);
      GMTrace.o(19603036045312L, 146054);
      return;
    }
    this.tIY.ckC().setAlpha(0.82F);
    Animation localAnimation = AnimationUtils.loadAnimation(this.tIY.getContext(), com.tencent.mm.bg.a.a.aLE);
    localAnimation.setAnimationListener(new Animation.AnimationListener()
    {
      public final void onAnimationEnd(Animation paramAnonymousAnimation)
      {
        GMTrace.i(19607867883520L, 146090);
        a.this.tIY.ckC().setVisibility(8);
        GMTrace.o(19607867883520L, 146090);
      }
      
      public final void onAnimationRepeat(Animation paramAnonymousAnimation)
      {
        GMTrace.i(19608002101248L, 146091);
        GMTrace.o(19608002101248L, 146091);
      }
      
      public final void onAnimationStart(Animation paramAnonymousAnimation)
      {
        GMTrace.i(19607733665792L, 146089);
        GMTrace.o(19607733665792L, 146089);
      }
    });
    this.tIY.ckC().startAnimation(localAnimation);
    GMTrace.o(19603036045312L, 146054);
  }
  
  public final void onAttachedToWindow()
  {
    GMTrace.i(19601693868032L, 146044);
    w.i("MicroMsg.DrawingPresenter", "[onAttachedToWindow]");
    Iterator localIterator = this.tJa.iterator();
    label134:
    while (localIterator.hasNext())
    {
      com.tencent.mm.d.b localb = (com.tencent.mm.d.b)localIterator.next();
      ArtistCacheManager localArtistCacheManager = ArtistCacheManager.rR();
      com.tencent.mm.d.a locala = localb.pN();
      if ((ArtistCacheManager.fMc.containsKey(localArtistCacheManager.fMe)) && (((ArtistCacheManager.a)ArtistCacheManager.fMc.get(localArtistCacheManager.fMe)).fMh.containsKey(locala))) {}
      for (int i = 1;; i = 0)
      {
        if (i == 0) {
          break label134;
        }
        localb.pQ();
        localb.au(true);
        w.i("MicroMsg.DrawingPresenter", "[onAttachedToWindow] %s is revert onAlive!", new Object[] { localb.pN() });
        break;
      }
    }
    if (this.tIY.cky().ckM())
    {
      this.tIY.cky().ckO();
      this.tIY.cky().invalidate();
    }
    GMTrace.o(19601693868032L, 146044);
  }
  
  public final void onDestroy()
  {
    GMTrace.i(19601559650304L, 146043);
    Iterator localIterator = this.tJa.iterator();
    while (localIterator.hasNext()) {
      ((com.tencent.mm.d.b)localIterator.next()).onDestroy();
    }
    this.tJa.clear();
    this.tIZ.clear();
    GMTrace.o(19601559650304L, 146043);
  }
  
  public final void onDraw(Canvas paramCanvas)
  {
    GMTrace.i(19602499174400L, 146050);
    Iterator localIterator = this.tJa.iterator();
    while (localIterator.hasNext())
    {
      com.tencent.mm.d.b localb = (com.tencent.mm.d.b)localIterator.next();
      if (localb.isAlive()) {
        if (bNN().pN() == localb.pN())
        {
          localb.onDraw(paramCanvas);
        }
        else
        {
          paramCanvas.save();
          paramCanvas.clipRect(this.tIY.cky().ckN());
          localb.b(paramCanvas);
          paramCanvas.restore();
        }
      }
    }
    GMTrace.o(19602499174400L, 146050);
  }
  
  public final void onFinish()
  {
    GMTrace.i(19600351690752L, 146034);
    if (this.tJb != null) {
      this.tJb.onFinish();
    }
    GMTrace.o(19600351690752L, 146034);
  }
  
  public final boolean os()
  {
    GMTrace.i(19600217473024L, 146033);
    if (this.tIY.ckB().getVisibility() == 0)
    {
      ku(false);
      this.tIY.an(true);
      GMTrace.o(19600217473024L, 146033);
      return true;
    }
    if ((this.tIY.ckD() != null) && (this.tIY.ckD().getVisibility() == 0))
    {
      this.tIY.mP(true);
      this.tIY.an(true);
      GMTrace.o(19600217473024L, 146033);
      return true;
    }
    GMTrace.o(19600217473024L, 146033);
    return false;
  }
  
  public final void ow()
  {
    GMTrace.i(19600083255296L, 146032);
    if (this.tJb != null) {
      this.tJb.ow();
    }
    GMTrace.o(19600083255296L, 146032);
  }
  
  final class a
    implements com.tencent.mm.w.a
  {
    View tJk;
    TextView tJl;
    ImageView tJm;
    
    a()
    {
      GMTrace.i(19608136318976L, 146092);
      this.tJk = a.this.tIY.ckC();
      this.tJl = ((TextView)this.tJk.findViewById(a.e.tlj));
      this.tJm = ((ImageView)this.tJk.findViewById(a.e.tli));
      GMTrace.o(19608136318976L, 146092);
    }
    
    public final void L(float paramFloat)
    {
      GMTrace.i(19608270536704L, 146093);
      w.i("MicroMsg.DrawingPresenter", "[onReach] distance:%s", new Object[] { Float.valueOf(paramFloat) });
      this.tJl.setText(a.this.tIY.getContext().getString(a.h.tlI));
      this.tJm.setImageResource(a.d.tlg);
      GMTrace.o(19608270536704L, 146093);
    }
    
    public final void a(com.tencent.mm.t.e parame)
    {
      GMTrace.i(19608807407616L, 146097);
      EditText localEditText = (EditText)a.this.tIY.ckB().findViewById(a.e.gei);
      localEditText.setText(parame.fWR);
      localEditText.setTextColor(parame.rz);
      localEditText.setTag(parame);
      a.this.ku(true);
      GMTrace.o(19608807407616L, 146097);
    }
    
    public final void onHide()
    {
      GMTrace.i(19608673189888L, 146096);
      a.this.kv(false);
      GMTrace.o(19608673189888L, 146096);
    }
    
    public final void onShow()
    {
      GMTrace.i(19608538972160L, 146095);
      a.this.kv(true);
      GMTrace.o(19608538972160L, 146095);
    }
    
    public final void yb()
    {
      GMTrace.i(19608404754432L, 146094);
      w.i("MicroMsg.DrawingPresenter", "[onUnReach]");
      this.tJm.setImageResource(a.d.tlf);
      this.tJl.setText(a.this.tIY.getContext().getString(a.h.tlJ));
      GMTrace.o(19608404754432L, 146094);
    }
  }
  
  final class b
    implements Runnable
  {
    j tJn;
    boolean tJo;
    
    b(j paramj, boolean paramBoolean)
    {
      GMTrace.i(19603707133952L, 146059);
      this.tJn = paramj;
      this.tJo = paramBoolean;
      GMTrace.o(19603707133952L, 146059);
    }
    
    private static Bitmap a(Bitmap paramBitmap, Rect paramRect, float paramFloat, BitmapFactory.Options paramOptions, Matrix paramMatrix)
    {
      GMTrace.i(19603975569408L, 146061);
      for (;;)
      {
        try
        {
          if ((paramBitmap.getWidth() - paramRect.width() <= 9) && (paramBitmap.getHeight() - paramRect.height() <= 9)) {
            continue;
          }
          localBitmap = Bitmap.createBitmap(paramBitmap, paramRect.left, paramRect.top, paramRect.width(), paramRect.height(), paramMatrix, true);
          paramBitmap = localBitmap;
        }
        catch (OutOfMemoryError localOutOfMemoryError)
        {
          Bitmap localBitmap;
          w.printErrStackTrace("MicroMsg.DrawingPresenter", localOutOfMemoryError, "", new Object[0]);
          float f1 = 1920.0F / paramOptions.outHeight;
          float f2 = 1920.0F / paramOptions.outWidth;
          if (f1 <= f2) {
            continue;
          }
          paramMatrix.reset();
          paramMatrix.postScale(f1, f1, 0.0F, 0.0F);
          paramMatrix.postRotate(-paramFloat);
          if ((paramBitmap.getWidth() - paramRect.width() <= 9) && (paramBitmap.getHeight() - paramRect.height() <= 9)) {
            continue;
          }
          paramBitmap = Bitmap.createBitmap(paramBitmap, paramRect.left, paramRect.top, paramRect.width(), paramRect.height(), paramMatrix, true);
          continue;
          f1 = f2;
          continue;
          paramBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), paramMatrix, true);
          continue;
        }
        GMTrace.o(19603975569408L, 146061);
        return paramBitmap;
        localBitmap = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), paramMatrix, true);
        paramBitmap = localBitmap;
      }
    }
    
    public final void run()
    {
      GMTrace.i(19603841351680L, 146060);
      Object localObject4;
      try
      {
        if (Looper.myLooper() == null) {
          Looper.prepare();
        }
        Iterator localIterator1 = a.this.tJa.iterator();
        while (localIterator1.hasNext()) {
          ((com.tencent.mm.d.b)localIterator1.next()).pS();
        }
        Iterator localIterator2;
        Object localObject3;
        int i;
        int j;
        Object localObject1;
        Bitmap localBitmap1;
        localOptions = new BitmapFactory.Options();
      }
      catch (Exception localException1)
      {
        this.tJn.a(localException1);
        try
        {
          localIterator2 = a.this.tJa.iterator();
          while (localIterator2.hasNext()) {
            ((com.tencent.mm.d.b)localIterator2.next()).onFinish();
          }
          localObject3 = null;
        }
        catch (Exception localException2)
        {
          GMTrace.o(19603841351680L, 146060);
          return;
        }
        if (!a.this.tIY.cky().ckM())
        {
          i = a.this.tIY.cky().ckN().width();
          j = a.this.tIY.cky().ckN().height();
          localObject1 = localObject3;
          if (i <= 0) {
            break label816;
          }
          localObject1 = localObject3;
          if (j <= 0) {
            break label816;
          }
          localObject1 = Bitmap.createBitmap(i, j, Bitmap.Config.ARGB_8888);
          break label816;
        }
        while (localObject1 == null)
        {
          this.tJn.a(new NullPointerException("bitmap is null!"));
          try
          {
            localObject1 = a.this.tJa.iterator();
            while (((Iterator)localObject1).hasNext()) {
              ((com.tencent.mm.d.b)((Iterator)localObject1).next()).onFinish();
            }
            localBitmap1 = a.this.tJc;
          }
          catch (Exception localException3)
          {
            GMTrace.o(19603841351680L, 146060);
            return;
          }
          continue;
          a.this.onDestroy();
          GMTrace.o(19603841351680L, 146060);
          return;
        }
        localObject3 = new Canvas(localBitmap1);
        localObject4 = a.this.tJa.iterator();
        while (((Iterator)localObject4).hasNext()) {
          ((com.tencent.mm.d.b)((Iterator)localObject4).next()).pP().c((Canvas)localObject3);
        }
      }
      finally
      {
        try
        {
          localObject3 = a.this.tJa.iterator();
          while (((Iterator)localObject3).hasNext()) {
            ((com.tencent.mm.d.b)((Iterator)localObject3).next()).onFinish();
          }
          throw localBitmap2;
        }
        catch (Exception localException5) {}
      }
      label400:
      BitmapFactory.Options localOptions;
      localOptions.inJustDecodeBounds = true;
      BitmapFactory.decodeFile(a.this.eqF.path, localOptions);
      float f1 = localOptions.outHeight * 1.0F / localBitmap2.getHeight();
      float f2 = localOptions.outWidth * 1.0F / localBitmap2.getWidth();
      if (f1 > f2) {
        break label819;
      }
      for (;;)
      {
        f1 = a.this.tIY.cky().a(a.this.tIY.cky().pY());
        localObject4 = new Matrix();
        ((Matrix)localObject4).postScale(f2, f2, 0.0F, 0.0F);
        ((Matrix)localObject4).postRotate(-f1);
        Rect localRect = new Rect(a.this.tIY.cky().ckN());
        w.i("MicroMsg.DrawingPresenter", "[saveEditPhoto] clipRectF:%s w:%s h:%s", new Object[] { localRect, Integer.valueOf(localBitmap2.getWidth()), Integer.valueOf(localBitmap2.getHeight()) });
        if (localRect.left < 0) {
          localRect.left = 0;
        }
        if (localRect.top < 0) {
          localRect.top = 0;
        }
        if (localRect.bottom < 0) {
          localRect.bottom = 0;
        }
        if (localRect.right < 0) {
          localRect.right = 0;
        }
        if (localRect.bottom > localBitmap2.getHeight()) {
          localRect.bottom = localBitmap2.getHeight();
        }
        if (localRect.right > localBitmap2.getWidth()) {
          localRect.right = localBitmap2.getWidth();
        }
        Object localObject2 = a(localBitmap2, localRect, f1, localOptions, (Matrix)localObject4);
        this.tJn.a((Bitmap)localObject2, this.tJo);
        try
        {
          localObject2 = a.this.tJa.iterator();
          while (((Iterator)localObject2).hasNext()) {
            ((com.tencent.mm.d.b)((Iterator)localObject2).next()).onFinish();
          }
          f1 = f2;
        }
        catch (Exception localException4)
        {
          GMTrace.o(19603841351680L, 146060);
          return;
        }
        break label819;
        a.this.onDestroy();
        GMTrace.o(19603841351680L, 146060);
        return;
        a.this.onDestroy();
        GMTrace.o(19603841351680L, 146060);
        return;
        a.this.onDestroy();
        break label400;
        label816:
        break;
        label819:
        f2 = f1;
        if (f1 == 0.0F) {
          f2 = 1.0F;
        }
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\bl\a.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */