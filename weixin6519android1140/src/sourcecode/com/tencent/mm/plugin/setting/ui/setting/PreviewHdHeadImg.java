package com.tencent.mm.plugin.setting.ui.setting;

import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Matrix;
import android.os.Bundle;
import android.os.Looper;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.ac.b;
import com.tencent.mm.ac.d;
import com.tencent.mm.ac.e;
import com.tencent.mm.ac.e.b;
import com.tencent.mm.g.a.rc;
import com.tencent.mm.pluginsdk.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.model.o;
import com.tencent.mm.pluginsdk.ui.GetHdHeadImageGalleryView;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.y.as;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.q;

public class PreviewHdHeadImg
  extends MMActivity
{
  private GetHdHeadImageGalleryView mQl;
  private final int oGU;
  private final int oGV;
  private e oGW;
  private String oGX;
  private String username;
  
  public PreviewHdHeadImg()
  {
    GMTrace.i(4678293127168L, 34856);
    this.oGU = 1;
    this.oGV = 2;
    GMTrace.o(4678293127168L, 34856);
  }
  
  private void beh()
  {
    GMTrace.i(4678829998080L, 34860);
    at.AR();
    if (!c.isSDCardAvailable())
    {
      u.fo(this.vKB.vKW);
      d(com.tencent.mm.ac.n.Dh().ba(this.vKB.vKW), null);
      GMTrace.o(4678829998080L, 34860);
      return;
    }
    Bitmap localBitmap2 = b.a(this.username, true, -1);
    final Bitmap localBitmap1 = localBitmap2;
    if (localBitmap2 == null) {
      localBitmap1 = BitmapFactory.decodeResource(getResources(), R.g.aVS);
    }
    if ((localBitmap1 != null) && (!localBitmap1.isRecycled()))
    {
      w.i("MicroMsg.PreviewHdHeadImg", "The avatar of %s is in the cache", new Object[] { this.username });
      this.mQl.setThumbImage(localBitmap1);
    }
    for (;;)
    {
      com.tencent.mm.ac.n.Dh();
      localBitmap2 = d.hY(this.username);
      if ((localBitmap2 == null) || (localBitmap2.isRecycled())) {
        break;
      }
      w.i("MicroMsg.PreviewHdHeadImg", "The HDAvatar of %s is already exists", new Object[] { this.username });
      com.tencent.mm.ac.n.Dh();
      d(localBitmap2, d.t(this.username, true));
      com.tencent.mm.ac.n.Dh();
      localBitmap1 = d.hY(this.username);
      com.tencent.mm.ac.n.Dh().d(this.username, localBitmap1);
      GMTrace.o(4678829998080L, 34860);
      return;
      w.i("MicroMsg.PreviewHdHeadImg", "The avatar of %s is not in the cache, use default avatar", new Object[] { this.username });
    }
    this.oGW = new e();
    this.oGW.a(this.username, new e.b()
    {
      public final int aN(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(4709163204608L, 35086);
        PreviewHdHeadImg.c(PreviewHdHeadImg.this).Dl();
        w.i("MicroMsg.PreviewHdHeadImg", "onSceneEnd: errType=%d, errCode=%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          com.tencent.mm.ac.n.Dh();
          Bitmap localBitmap = d.hY(PreviewHdHeadImg.a(PreviewHdHeadImg.this));
          if (localBitmap != null)
          {
            PreviewHdHeadImg localPreviewHdHeadImg = PreviewHdHeadImg.this;
            com.tencent.mm.ac.n.Dh();
            PreviewHdHeadImg.a(localPreviewHdHeadImg, localBitmap, d.t(PreviewHdHeadImg.a(PreviewHdHeadImg.this), true));
          }
          for (;;)
          {
            GMTrace.o(4709163204608L, 35086);
            return 0;
            PreviewHdHeadImg.a(PreviewHdHeadImg.this, localBitmap1, null);
          }
        }
        PreviewHdHeadImg.a(PreviewHdHeadImg.this, localBitmap1, null);
        GMTrace.o(4709163204608L, 35086);
        return 0;
      }
    });
    GMTrace.o(4678829998080L, 34860);
  }
  
  private void d(Bitmap paramBitmap, String paramString)
  {
    GMTrace.i(4678964215808L, 34861);
    if (paramBitmap == null)
    {
      GMTrace.o(4678964215808L, 34861);
      return;
    }
    for (;;)
    {
      try
      {
        if (paramBitmap.getWidth() < 480)
        {
          float f = 480.0F / paramBitmap.getWidth();
          localObject = new Matrix();
          ((Matrix)localObject).postScale(f, f);
          localObject = Bitmap.createBitmap(paramBitmap, 0, 0, paramBitmap.getWidth(), paramBitmap.getHeight(), (Matrix)localObject, true);
          w.d("MicroMsg.PreviewHdHeadImg", "dkhdbm old[%d %d] new[%d %d]", new Object[] { Integer.valueOf(paramBitmap.getWidth()), Integer.valueOf(paramBitmap.getHeight()), Integer.valueOf(((Bitmap)localObject).getWidth()), Integer.valueOf(((Bitmap)localObject).getHeight()) });
          this.mQl.L((Bitmap)localObject);
          this.mQl.oGX = paramString;
          this.oGX = paramString;
          GMTrace.o(4678964215808L, 34861);
          return;
        }
      }
      catch (Exception paramBitmap)
      {
        w.printErrStackTrace("MicroMsg.PreviewHdHeadImg", paramBitmap, "", new Object[0]);
        GMTrace.o(4678964215808L, 34861);
        return;
      }
      Object localObject = paramBitmap;
    }
  }
  
  protected final void MP()
  {
    GMTrace.i(4678695780352L, 34859);
    oM(R.l.dYx);
    this.username = q.zE();
    this.mQl = ((GetHdHeadImageGalleryView)findViewById(R.h.bCs));
    this.mQl.username = this.username;
    beh();
    a(0, R.g.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4637088284672L, 34549);
        paramAnonymousMenuItem = new f(PreviewHdHeadImg.this, f.xpQ, false);
        paramAnonymousMenuItem.qik = new p.c()
        {
          public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
          {
            GMTrace.i(4714129260544L, 35123);
            paramAnonymous2n.em(1, R.l.dYy);
            if (b.a(PreviewHdHeadImg.a(PreviewHdHeadImg.this), true, -1) != null) {
              paramAnonymous2n.em(2, R.l.dBi);
            }
            GMTrace.o(4714129260544L, 35123);
          }
        };
        paramAnonymousMenuItem.qil = new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(4677622038528L, 34851);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(4677622038528L, 34851);
              return;
              com.tencent.mm.plugin.c.a.hnI.d(PreviewHdHeadImg.this);
              GMTrace.o(4677622038528L, 34851);
              return;
              PreviewHdHeadImg.b(PreviewHdHeadImg.this);
            }
          }
        };
        paramAnonymousMenuItem.bFk();
        GMTrace.o(4637088284672L, 34549);
        return true;
      }
    });
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(4719900622848L, 35166);
        PreviewHdHeadImg.this.finish();
        GMTrace.o(4719900622848L, 35166);
        return true;
      }
    });
    GMTrace.o(4678695780352L, 34859);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4678561562624L, 34858);
    int i = R.i.czC;
    GMTrace.o(4678561562624L, 34858);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4679098433536L, 34862);
    w.i("MicroMsg.PreviewHdHeadImg", "onAcvityResult requestCode:%d, resultCode:%d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      if ((paramInt1 == 2) || (paramInt1 == 4)) {
        new ae(Looper.getMainLooper()).post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(4621116375040L, 34430);
            rc localrc = new rc();
            localrc.eVX.eVZ = true;
            com.tencent.mm.sdk.b.a.vgX.m(localrc);
            GMTrace.o(4621116375040L, 34430);
          }
        });
      }
      GMTrace.o(4679098433536L, 34862);
      return;
    }
    switch (paramInt1)
    {
    case 3: 
    default: 
      GMTrace.o(4679098433536L, 34862);
      return;
    case 2: 
      if (paramIntent == null)
      {
        GMTrace.o(4679098433536L, 34862);
        return;
      }
      Intent localIntent = new Intent();
      localIntent.putExtra("CropImageMode", 1);
      localIntent.putExtra("CropImage_Filter", true);
      com.tencent.mm.ac.n.Dh();
      localIntent.putExtra("CropImage_OutputPath", d.t(q.zE() + ".crop", true));
      localIntent.putExtra("CropImage_ImgPath", null);
      m localm = com.tencent.mm.plugin.setting.a.hnH;
      at.AR();
      localm.a(this, paramIntent, localIntent, c.yU(), 4, null);
      GMTrace.o(4679098433536L, 34862);
      return;
    }
    new ae(Looper.getMainLooper()).post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4617089843200L, 34400);
        rc localrc = new rc();
        localrc.eVX.eVZ = true;
        com.tencent.mm.sdk.b.a.vgX.m(localrc);
        GMTrace.o(4617089843200L, 34400);
      }
    });
    if (paramIntent == null)
    {
      GMTrace.o(4679098433536L, 34862);
      return;
    }
    paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
    if (paramIntent == null)
    {
      w.e("MicroMsg.PreviewHdHeadImg", "crop picture failed");
      GMTrace.o(4679098433536L, 34862);
      return;
    }
    new o(this.vKB.vKW, paramIntent).b(1, new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4680037957632L, 34869);
        w.d("MicroMsg.PreviewHdHeadImg", "updateHeadImg hasUin:%b user:%s", new Object[] { Boolean.valueOf(at.AU()), q.zE() });
        if (at.AU())
        {
          String str = b.hQ(q.zE());
          as.gnb.gM(str);
        }
        PreviewHdHeadImg.d(PreviewHdHeadImg.this);
        GMTrace.o(4680037957632L, 34869);
      }
    });
    GMTrace.o(4679098433536L, 34862);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4678427344896L, 34857);
    super.onCreate(paramBundle);
    MP();
    GMTrace.o(4678427344896L, 34857);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\setting\ui\setting\PreviewHdHeadImg.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */