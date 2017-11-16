package com.tencent.mm.plugin.game.d;

import android.content.Context;
import android.content.res.AssetManager;
import android.graphics.Bitmap;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.a.f;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.ao.n;
import com.tencent.mm.pluginsdk.model.app.an;
import com.tencent.mm.pluginsdk.model.app.i;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.w;
import java.io.File;
import java.lang.ref.WeakReference;

public class e
{
  private static final String mdQ;
  private static e mdR;
  public f<String, Bitmap> lTF;
  public f<String, Bitmap> mag;
  private ColorDrawable mdS;
  private Bitmap mdT;
  private Bitmap mdU;
  
  static
  {
    GMTrace.i(12571771928576L, 93667);
    mdQ = com.tencent.mm.loader.stub.a.ghz + "Game/Image/";
    GMTrace.o(12571771928576L, 93667);
  }
  
  private e()
  {
    GMTrace.i(12570563969024L, 93658);
    this.lTF = new f(6);
    this.mag = new f(15);
    this.mdS = new ColorDrawable(android.support.v4.content.a.c(ab.getContext(), R.e.aNK));
    try
    {
      this.mdT = BackwardSupportUtil.b.a(ab.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.br.a.getDensity(null));
      if ((this.mdT != null) && (!this.mdT.isRecycled())) {
        this.mdU = d.a(this.mdT, false, 0.5F * this.mdT.getWidth());
      }
      an.aWy().c(new j.a()
      {
        public final void a(String paramAnonymousString, l paramAnonymousl)
        {
          GMTrace.i(12575932678144L, 93698);
          if (e.this.lTF.ba(paramAnonymousString))
          {
            paramAnonymousl = com.tencent.mm.pluginsdk.model.app.g.b(paramAnonymousString, 1, com.tencent.mm.br.a.getDensity(null));
            e.this.lTF.m(paramAnonymousString, paramAnonymousl);
          }
          GMTrace.o(12575932678144L, 93698);
        }
      });
      GMTrace.o(12570563969024L, 93658);
      return;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.i("MicroMsg.GameImageUtil", localException.getMessage());
      }
    }
  }
  
  public static e aGQ()
  {
    GMTrace.i(12570429751296L, 93657);
    if (mdR == null) {}
    try
    {
      if (mdR == null) {
        mdR = new e();
      }
      e locale = mdR;
      GMTrace.o(12570429751296L, 93657);
      return locale;
    }
    finally {}
  }
  
  public static Bitmap y(Bitmap paramBitmap)
  {
    GMTrace.i(16083712999424L, 119833);
    if ((paramBitmap != null) && (!paramBitmap.isRecycled()))
    {
      if (paramBitmap.getHeight() > paramBitmap.getWidth()) {}
      for (int i = paramBitmap.getWidth();; i = paramBitmap.getHeight())
      {
        paramBitmap = d.a(paramBitmap, i, i, false);
        GMTrace.o(16083712999424L, 119833);
        return paramBitmap;
      }
    }
    GMTrace.o(16083712999424L, 119833);
    return paramBitmap;
  }
  
  public final void a(final ImageView paramImageView, final String paramString, final float paramFloat)
  {
    GMTrace.i(17973498609664L, 133913);
    if ((paramImageView == null) || (bg.nm(paramString)))
    {
      GMTrace.o(17973498609664L, 133913);
      return;
    }
    if (this.lTF.ba(paramString))
    {
      localBitmap = (Bitmap)this.lTF.get(paramString);
      if ((localBitmap != null) && (!localBitmap.isRecycled()))
      {
        paramImageView.setImageBitmap(localBitmap);
        GMTrace.o(17973498609664L, 133913);
        return;
      }
    }
    Bitmap localBitmap = com.tencent.mm.pluginsdk.model.app.g.b(paramString, 1, paramFloat);
    if ((localBitmap != null) && (!localBitmap.isRecycled()))
    {
      paramImageView.setImageBitmap(localBitmap);
      this.lTF.put(paramString, localBitmap);
      GMTrace.o(17973498609664L, 133913);
      return;
    }
    paramImageView.setImageResource(R.g.aWS);
    paramImageView = new WeakReference(paramImageView);
    an.aWy().c(new j.a()
    {
      public final void a(String paramAnonymousString, l paramAnonymousl)
      {
        GMTrace.i(12572040364032L, 93669);
        if (paramString.equals(paramAnonymousString))
        {
          paramAnonymousString = com.tencent.mm.pluginsdk.model.app.g.b(paramString, 1, paramFloat);
          if (paramAnonymousString != null)
          {
            if ((paramImageView != null) && (paramImageView.get() != null)) {
              ((ImageView)paramImageView.get()).setImageBitmap(paramAnonymousString);
            }
            e.this.lTF.put(paramString, paramAnonymousString);
            an.aWy().j(this);
          }
        }
        GMTrace.o(12572040364032L, 93669);
      }
    });
    GMTrace.o(17973498609664L, 133913);
  }
  
  public final void a(ImageView paramImageView, String paramString, a parama)
  {
    GMTrace.i(12570832404480L, 93660);
    a(paramImageView, paramString, parama, null);
    GMTrace.o(12570832404480L, 93660);
  }
  
  public final void a(final ImageView paramImageView, String paramString, a parama, final b paramb)
  {
    GMTrace.i(12570966622208L, 93661);
    if (bg.nm(paramString))
    {
      GMTrace.o(12570966622208L, 93661);
      return;
    }
    final a locala = parama;
    if (parama == null) {
      locala = new e.a.a().aGR();
    }
    int i;
    if ((!locala.gKA) || (locala.med)) {
      i = 0;
    }
    while (i != 0)
    {
      GMTrace.o(12570966622208L, 93661);
      return;
      if (this.mag.ba(paramString))
      {
        parama = (Bitmap)this.mag.get(paramString);
        if ((parama != null) && (!parama.isRecycled()))
        {
          if (paramImageView != null) {
            paramImageView.setImageBitmap(parama);
          }
          if (paramb != null) {
            paramb.x(parama);
          }
          i = 1;
          continue;
        }
      }
      i = 0;
    }
    parama = new c.a();
    boolean bool;
    String str;
    File localFile2;
    if (!locala.med)
    {
      bool = true;
      parama.gKA = bool;
      str = mdQ;
      File localFile1 = new File(str);
      if (!localFile1.exists())
      {
        if (!localFile1.getParentFile().exists())
        {
          localFile2 = localFile1.getParentFile();
          File localFile3 = new File(localFile2.getAbsolutePath() + System.currentTimeMillis());
          if (!localFile3.mkdir()) {
            break label426;
          }
          localFile3.renameTo(localFile2);
        }
        if ((!localFile1.mkdir()) || (!localFile1.isDirectory())) {
          w.e("MicroMsg.GameImageUtil", "mkdir error. %s", new Object[] { str });
        }
      }
      label291:
      str = mdQ + com.tencent.mm.a.g.n(paramString.getBytes());
      parama.gKC = locala.gKC;
      if (locala.med) {
        break label449;
      }
      parama.gKE = str;
      label342:
      parama.gKZ = locala.gKZ;
      parama.gKY = false;
      if ((paramImageView != null) && (locala.mec))
      {
        if (locala.mee != 0) {
          break label463;
        }
        paramImageView.setImageDrawable(this.mdS);
      }
    }
    for (;;)
    {
      parama = parama.Jn();
      n.Jd().a(paramString, null, parama, new com.tencent.mm.ao.a.c.g()
      {
        public final void a(String paramAnonymousString, final View paramAnonymousView, com.tencent.mm.ao.a.d.b paramAnonymousb)
        {
          GMTrace.i(12572443017216L, 93672);
          if ((paramAnonymousb != null) && (paramAnonymousb.bitmap != null))
          {
            paramAnonymousb = paramAnonymousb.bitmap;
            paramAnonymousView = paramAnonymousb;
            if (locala.meb) {
              paramAnonymousView = e.y(paramAnonymousb);
            }
            if (locala.gKA) {
              e.this.mag.m(paramAnonymousString, paramAnonymousView);
            }
            af.t(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(12570027098112L, 93654);
                if (e.2.this.igs != null) {
                  e.2.this.igs.setImageBitmap(paramAnonymousView);
                }
                GMTrace.o(12570027098112L, 93654);
              }
            });
            if (paramb != null) {
              paramb.x(paramAnonymousView);
            }
          }
          GMTrace.o(12572443017216L, 93672);
        }
        
        public final void ku(String paramAnonymousString)
        {
          GMTrace.i(12572308799488L, 93671);
          GMTrace.o(12572308799488L, 93671);
        }
      });
      GMTrace.o(12570966622208L, 93661);
      return;
      bool = false;
      break;
      label426:
      w.e("MicroMsg.GameImageUtil", "mkdir error, %s", new Object[] { localFile2.getAbsolutePath() });
      break label291;
      label449:
      parama.gKC = false;
      com.tencent.mm.pluginsdk.j.a.e.a.OS(str);
      break label342;
      label463:
      paramImageView.setImageResource(locala.mee);
    }
  }
  
  public final void g(ImageView paramImageView, String paramString)
  {
    GMTrace.i(12570698186752L, 93659);
    a(paramImageView, paramString, null, null);
    GMTrace.o(12570698186752L, 93659);
  }
  
  public final Bitmap h(ImageView paramImageView, String paramString)
  {
    GMTrace.i(12571100839936L, 93662);
    paramString = com.tencent.mm.ac.b.a(paramString, false, -1);
    if (((paramString != null) && (!paramString.isRecycled())) || ((this.mdT == null) || (this.mdT.isRecycled()))) {}
    try
    {
      this.mdT = BackwardSupportUtil.b.a(ab.getContext().getAssets().open("avatar/default_nor_avatar.png"), com.tencent.mm.br.a.getDensity(null));
      if ((this.mdT != null) && (!this.mdT.isRecycled()) && (paramImageView != null)) {
        paramImageView.setImageBitmap(this.mdT);
      }
      paramImageView = this.mdT;
      GMTrace.o(12571100839936L, 93662);
      return paramImageView;
      if (paramImageView != null) {
        paramImageView.setImageBitmap(paramString);
      }
      GMTrace.o(12571100839936L, 93662);
      return paramString;
    }
    catch (Exception paramString)
    {
      for (;;) {}
    }
  }
  
  public final Bitmap i(ImageView paramImageView, String paramString)
  {
    GMTrace.i(12571235057664L, 93663);
    paramString = com.tencent.mm.ac.b.a(paramString, false, -1);
    if ((paramString != null) && (!paramString.isRecycled())) {}
    for (paramString = d.a(paramString, false, 0.5F * paramString.getWidth());; paramString = this.mdU)
    {
      if ((paramString != null) && (!paramString.isRecycled()) && (paramImageView != null)) {
        paramImageView.setImageBitmap(paramString);
      }
      GMTrace.o(12571235057664L, 93663);
      return paramString;
    }
  }
  
  public static final class a
  {
    public final boolean gKA;
    public final boolean gKC;
    final boolean gKZ;
    final boolean meb;
    final boolean mec;
    public final boolean med;
    final int mee;
    
    public a(a parama)
    {
      GMTrace.i(12570161315840L, 93655);
      this.gKA = parama.gKA;
      this.gKC = parama.gKC;
      this.gKZ = parama.gKZ;
      this.meb = parama.meb;
      this.mec = parama.mec;
      this.med = parama.med;
      this.mee = parama.mee;
      GMTrace.o(12570161315840L, 93655);
    }
    
    public static final class a
    {
      public boolean gKA;
      public boolean gKC;
      public boolean gKZ;
      public boolean meb;
      public boolean mec;
      public boolean med;
      public int mee;
      
      public a()
      {
        GMTrace.i(12576335331328L, 93701);
        this.gKA = true;
        this.gKC = true;
        this.gKZ = false;
        this.meb = false;
        this.mec = true;
        this.med = false;
        this.mee = 0;
        GMTrace.o(12576335331328L, 93701);
      }
      
      public final e.a aGR()
      {
        GMTrace.i(12576469549056L, 93702);
        e.a locala = new e.a(this);
        GMTrace.o(12576469549056L, 93702);
        return locala;
      }
    }
  }
  
  public static abstract class b
  {
    public b()
    {
      GMTrace.i(12572577234944L, 93673);
      GMTrace.o(12572577234944L, 93673);
    }
    
    public abstract void x(Bitmap paramBitmap);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\d\e.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */