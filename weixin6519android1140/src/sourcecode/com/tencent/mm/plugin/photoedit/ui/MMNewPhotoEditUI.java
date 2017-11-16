package com.tencent.mm.plugin.photoedit.ui;

import android.app.Dialog;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.api.b;
import com.tencent.mm.api.j;
import com.tencent.mm.api.m;
import com.tencent.mm.api.m.a.a;
import com.tencent.mm.api.m.b;
import com.tencent.mm.api.m.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.photoedit.PhotoEditProxy;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.a;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.r;
import com.tencent.mm.ui.p;
import java.io.IOException;

@a(19)
public class MMNewPhotoEditUI
  extends MMActivity
  implements com.tencent.mm.api.e
{
  private r ihl;
  private int jtE;
  private String nHf;
  private String nHg;
  private String nHh;
  private boolean nHi;
  private boolean nHj;
  private final com.tencent.mm.remoteservice.d nHk;
  private PhotoEditProxy nHl;
  private Dialog nHm;
  private m njy;
  
  public MMNewPhotoEditUI()
  {
    GMTrace.i(19323728953344L, 143973);
    this.nHk = new com.tencent.mm.remoteservice.d(this);
    this.ihl = null;
    GMTrace.o(19323728953344L, 143973);
  }
  
  private void du(boolean paramBoolean)
  {
    GMTrace.i(19325071130624L, 143983);
    w.i("MicroMsg.MMNewPhotoEditUI", "[setProgress] isVisible:%s", new Object[] { Boolean.valueOf(paramBoolean) });
    if (paramBoolean)
    {
      this.ihl = r.b(this, getString(R.l.dvU), true, 0, null);
      GMTrace.o(19325071130624L, 143983);
      return;
    }
    if ((this.ihl != null) && (this.ihl.isShowing()))
    {
      this.ihl.dismiss();
      this.ihl = null;
    }
    GMTrace.o(19325071130624L, 143983);
  }
  
  private void st(final int paramInt)
  {
    GMTrace.i(19324936912896L, 143982);
    du(true);
    this.njy.a(new j()
    {
      public final void a(Bitmap paramAnonymousBitmap, boolean paramAnonymousBoolean)
      {
        GMTrace.i(19322789429248L, 143966);
        w.i("MicroMsg.MMNewPhotoEditUI", "[onSuccess] w:%s h:%s", new Object[] { Integer.valueOf(paramAnonymousBitmap.getWidth()), Integer.valueOf(paramAnonymousBitmap.getHeight()) });
        String str;
        try
        {
          str = com.tencent.mm.platformtools.d.nd("jpg");
          com.tencent.mm.sdk.platformtools.d.a(paramAnonymousBitmap, 100, Bitmap.CompressFormat.PNG, str, true);
          w.i("MicroMsg.MMNewPhotoEditUI", "[onSuccess] photoPath:%s", new Object[] { str });
          if (MMNewPhotoEditUI.d(MMNewPhotoEditUI.this)) {
            com.tencent.mm.platformtools.d.b(str, MMNewPhotoEditUI.this);
          }
          if ((paramInt != 0) && (!paramAnonymousBitmap.isRecycled())) {
            paramAnonymousBitmap.recycle();
          }
          MMNewPhotoEditUI.a(MMNewPhotoEditUI.this, str);
          if ((MMNewPhotoEditUI.e(MMNewPhotoEditUI.this) != 291) && (MMNewPhotoEditUI.e(MMNewPhotoEditUI.this) != 293)) {
            break label346;
          }
          if (paramInt == 0)
          {
            MMNewPhotoEditUI.b(MMNewPhotoEditUI.this, str);
            MMNewPhotoEditUI.c(MMNewPhotoEditUI.this);
            MMNewPhotoEditUI.b(MMNewPhotoEditUI.this, 1);
            GMTrace.o(19322789429248L, 143966);
            return;
          }
          if (paramInt == 1)
          {
            MMNewPhotoEditUI.c(MMNewPhotoEditUI.this, str);
            MMNewPhotoEditUI.b(MMNewPhotoEditUI.this, 2);
            Toast.makeText(MMNewPhotoEditUI.this.vKB.vKW, MMNewPhotoEditUI.this.getString(R.l.dsO), 1).show();
            MMNewPhotoEditUI.c(MMNewPhotoEditUI.this);
            MMNewPhotoEditUI.this.finish();
            GMTrace.o(19322789429248L, 143966);
            return;
          }
        }
        catch (IOException paramAnonymousBitmap)
        {
          a(paramAnonymousBitmap);
          GMTrace.o(19322789429248L, 143966);
          return;
        }
        if (paramInt == 2)
        {
          Toast.makeText(MMNewPhotoEditUI.this.vKB.vKW, MMNewPhotoEditUI.this.getString(R.l.dsg, new Object[] { com.tencent.mm.compatible.util.e.fRZ }), 1).show();
          MMNewPhotoEditUI.b(MMNewPhotoEditUI.this, 3);
          MMNewPhotoEditUI.c(MMNewPhotoEditUI.this);
          MMNewPhotoEditUI.this.finish();
          GMTrace.o(19322789429248L, 143966);
          return;
          label346:
          MMNewPhotoEditUI.d(MMNewPhotoEditUI.this, str);
        }
        GMTrace.o(19322789429248L, 143966);
      }
      
      public final void a(Exception paramAnonymousException)
      {
        GMTrace.i(19322655211520L, 143965);
        MMNewPhotoEditUI.c(MMNewPhotoEditUI.this);
        w.e("MicroMsg.MMNewPhotoEditUI", "[onFinish] %s", new Object[] { paramAnonymousException });
        Toast.makeText(MMNewPhotoEditUI.this, MMNewPhotoEditUI.this.getResources().getString(R.l.dqt), 1).show();
        MMNewPhotoEditUI.this.setResult(0);
        MMNewPhotoEditUI.this.finish();
        GMTrace.o(19322655211520L, 143965);
      }
    });
    GMTrace.o(19324936912896L, 143982);
  }
  
  protected final void MP()
  {
    GMTrace.i(19324131606528L, 143976);
    FrameLayout localFrameLayout = (FrameLayout)findViewById(R.h.content);
    this.njy = m.eqG.ou();
    Object localObject = this.njy;
    m.a.a locala = new m.a.a();
    if ((this.jtE != 291) && (this.jtE != 293)) {}
    for (boolean bool = true;; bool = false)
    {
      locala.eqI = bool;
      locala.eqK = true;
      locala.eqH = m.c.eqN;
      locala.path = this.nHf;
      ((m)localObject).a(locala.oG());
      localObject = this.njy.ad(this.vKB.vKW);
      ((b)localObject).a(this);
      localFrameLayout.addView((View)localObject, new FrameLayout.LayoutParams(-1, -1));
      ((b)localObject).eqv = new com.tencent.mm.api.l()
      {
        public final void a(com.tencent.mm.api.d paramAnonymousd)
        {
          GMTrace.i(19323057864704L, 143968);
          w.i("MicroMsg.MMNewPhotoEditUI", "[onSelectedFeature] features:%s", new Object[] { paramAnonymousd.name() });
          GMTrace.o(19323057864704L, 143968);
        }
        
        public final void a(com.tencent.mm.api.d paramAnonymousd, int paramAnonymousInt)
        {
          GMTrace.i(19323192082432L, 143969);
          w.i("MicroMsg.MMNewPhotoEditUI", "[onSelectedDetailFeature] features:%s index:%s", new Object[] { paramAnonymousd.name(), Integer.valueOf(paramAnonymousInt) });
          GMTrace.o(19323192082432L, 143969);
        }
        
        public final void ap(boolean paramAnonymousBoolean)
        {
          GMTrace.i(19323326300160L, 143970);
          if (paramAnonymousBoolean)
          {
            MMNewPhotoEditUI.this.aLs();
            GMTrace.o(19323326300160L, 143970);
            return;
          }
          MMNewPhotoEditUI.this.db(MMNewPhotoEditUI.b(MMNewPhotoEditUI.this));
          GMTrace.o(19323326300160L, 143970);
        }
      };
      GMTrace.o(19324131606528L, 143976);
      return;
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(21042655395840L, 156780);
    GMTrace.o(21042655395840L, 156780);
    return 1;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(19323863171072L, 143974);
    int i = R.i.cDe;
    GMTrace.o(19323863171072L, 143974);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(19324802695168L, 143981);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    if ((paramInt2 == -1) && (paramInt1 == 1) && (paramIntent != null))
    {
      String str = paramIntent.getStringExtra("Select_Conv_User");
      w.d("MicroMsg.MMNewPhotoEditUI", "select %s for sending imagePath:%s", new Object[] { str, this.nHh });
      this.nHm = h.a(this.vKB.vKW, getString(R.l.dNE), false, null);
      paramIntent = paramIntent.getStringExtra("custom_send_text");
      this.nHl.sendImage(paramIntent, this.nHh, this.nHl.getSelfUsername(), str);
      this.nHm.dismiss();
      if (!this.nHi) {
        FileOp.deleteFile(this.nHh);
      }
      for (;;)
      {
        finish();
        GMTrace.o(19324802695168L, 143981);
        return;
        com.tencent.mm.platformtools.d.b(this.nHh, this);
      }
    }
    if ((paramIntent == null) && (!bg.nm(this.nHh)) && (this.jtE == 291)) {
      FileOp.deleteFile(this.nHh);
    }
    GMTrace.o(19324802695168L, 143981);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(19324400041984L, 143978);
    if (!this.njy.os())
    {
      if ((this.jtE != 290) && (this.jtE != 291)) {
        break label80;
      }
      g.ork.i(13859, new Object[] { Integer.valueOf(1), Integer.valueOf(2) });
    }
    for (;;)
    {
      finish();
      GMTrace.o(19324400041984L, 143978);
      return;
      label80:
      if ((this.jtE == 4) || (this.jtE == 293)) {
        g.ork.i(13859, new Object[] { Integer.valueOf(2), Integer.valueOf(2) });
      } else {
        g.ork.i(13859, new Object[] { Integer.valueOf(0), Integer.valueOf(2) });
      }
    }
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(19323997388800L, 143975);
    super.onCreate(paramBundle);
    this.vKB.g(true, 0L);
    this.nHl = new PhotoEditProxy(this.nHk);
    this.nHk.C(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19323594735616L, 143972);
        w.i("MicroMsg.MMNewPhotoEditUI", "connected!!!");
        MMNewPhotoEditUI.a(MMNewPhotoEditUI.this);
        MMNewPhotoEditUI.this.MP();
        GMTrace.o(19323594735616L, 143972);
      }
    });
    GMTrace.o(19323997388800L, 143975);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(19324265824256L, 143977);
    super.onDestroy();
    this.njy.onDestroy();
    this.nHk.release();
    GMTrace.o(19324265824256L, 143977);
  }
  
  public final void onFinish()
  {
    GMTrace.i(19324534259712L, 143979);
    if ((this.jtE == 290) || (this.jtE == 291)) {
      g.ork.i(13859, new Object[] { Integer.valueOf(1), Integer.valueOf(1) });
    }
    while ((this.jtE == 291) || (this.jtE == 293))
    {
      com.tencent.mm.ui.tools.l locall = new com.tencent.mm.ui.tools.l(this.vKB.vKW);
      locall.qik = new p.c()
      {
        public final void a(n paramAnonymousn)
        {
          GMTrace.i(19326815961088L, 143996);
          paramAnonymousn.e(0, MMNewPhotoEditUI.this.getString(R.l.dSm));
          paramAnonymousn.e(1, MMNewPhotoEditUI.this.getString(R.l.dNH));
          paramAnonymousn.e(2, MMNewPhotoEditUI.this.getString(R.l.dUK));
          GMTrace.o(19326815961088L, 143996);
        }
      };
      locall.qil = new p.d()
      {
        public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
        {
          GMTrace.i(19322386776064L, 143963);
          MMNewPhotoEditUI.a(MMNewPhotoEditUI.this, paramAnonymousInt);
          GMTrace.o(19322386776064L, 143963);
        }
      };
      h.a(this.vKB.vKW, locall.bpI());
      GMTrace.o(19324534259712L, 143979);
      return;
      if ((this.jtE == 4) || (this.jtE == 293)) {
        g.ork.i(13859, new Object[] { Integer.valueOf(2), Integer.valueOf(1) });
      } else {
        g.ork.i(13859, new Object[] { Integer.valueOf(0), Integer.valueOf(1) });
      }
    }
    st(-1);
    GMTrace.o(19324534259712L, 143979);
  }
  
  public final void ow()
  {
    GMTrace.i(19324668477440L, 143980);
    onBackPressed();
    GMTrace.o(19324668477440L, 143980);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\photoedit\ui\MMNewPhotoEditUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */