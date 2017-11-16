package com.tencent.mm.plugin.favorite.ui.detail;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.app.WorkerProfile;
import com.tencent.mm.plugin.favorite.b.ai;
import com.tencent.mm.plugin.favorite.b.b;
import com.tencent.mm.plugin.favorite.b.b.a;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.r.2;
import com.tencent.mm.plugin.favorite.b.r.3;
import com.tencent.mm.plugin.favorite.b.v;
import com.tencent.mm.plugin.favorite.b.v.a;
import com.tencent.mm.plugin.favorite.b.v.b;
import com.tencent.mm.plugin.favorite.b.v.c;
import com.tencent.mm.plugin.favorite.b.v.d;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.FavTagEditUI;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tk;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMImageView;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.ac;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.io.File;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavoriteFileDetailUI
  extends MMActivity
  implements b.a, j.a
{
  private long eDp;
  private th eIc;
  private boolean eON;
  private ae ghS;
  private TextView iuc;
  private com.tencent.mm.pluginsdk.ui.tools.f jGP;
  private TextView jUm;
  private ProgressBar jeL;
  private j lcn;
  private com.tencent.mm.plugin.favorite.b.q lfc;
  private Button lhG;
  private Button lhH;
  private Button lhI;
  private MMImageView lhJ;
  private TextView lhK;
  private View lhL;
  private View lhM;
  private TextView lhN;
  private ImageView lhO;
  private TextView lhP;
  private boolean lhQ;
  private boolean lhR;
  private String lhS;
  private String lhT;
  private boolean lhU;
  private boolean lhV;
  private boolean lhW;
  
  public FavoriteFileDetailUI()
  {
    GMTrace.i(6403930456064L, 47713);
    this.jGP = null;
    this.lfc = new com.tencent.mm.plugin.favorite.b.q();
    this.lhQ = false;
    this.lhR = false;
    this.eON = true;
    this.lhU = false;
    this.lhV = false;
    this.lhW = false;
    GMTrace.o(6403930456064L, 47713);
  }
  
  private void a(final float paramFloat, final String paramString)
  {
    GMTrace.i(6405943721984L, 47728);
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6412520390656L, 47777);
        FavoriteFileDetailUI.q(FavoriteFileDetailUI.this).setProgress((int)paramFloat);
        FavoriteFileDetailUI.r(FavoriteFileDetailUI.this).setText(paramString);
        GMTrace.o(6412520390656L, 47777);
      }
    });
    GMTrace.o(6405943721984L, 47728);
  }
  
  private void aza()
  {
    GMTrace.i(6404333109248L, 47716);
    this.lhT = getIntent().getStringExtra("key_detail_data_id");
    Iterator localIterator = this.lcn.field_favProto.ulB.iterator();
    while (localIterator.hasNext())
    {
      th localth = (th)localIterator.next();
      if (localth.lhq.equals(this.lhT)) {
        this.eIc = localth;
      }
    }
    if (this.eIc == null) {
      this.eIc = x.n(this.lcn);
    }
    GMTrace.o(6404333109248L, 47716);
  }
  
  private void azb()
  {
    GMTrace.i(6404869980160L, 47720);
    this.lhJ.setVisibility(8);
    this.jUm.setVisibility(8);
    this.lhI.setVisibility(8);
    this.lhG.setVisibility(8);
    this.lhH.setVisibility(8);
    this.lhL.setVisibility(8);
    this.iuc.setVisibility(8);
    this.lhO.setVisibility(0);
    this.lhP.setVisibility(0);
    if (this.eIc.aGU == 4)
    {
      this.iuc.setGravity(17);
      this.iuc.setText(R.l.duk);
      GMTrace.o(6404869980160L, 47720);
      return;
    }
    this.iuc.setGravity(17);
    this.iuc.setText(R.l.duj);
    if (this.eIc.ukB == 2)
    {
      this.lhP.setText(R.l.dsX);
      GMTrace.o(6404869980160L, 47720);
      return;
    }
    this.lhP.setText(R.l.dsY);
    GMTrace.o(6404869980160L, 47720);
  }
  
  private void azc()
  {
    GMTrace.i(6405004197888L, 47721);
    this.lhI.setVisibility(8);
    this.lhG.setVisibility(8);
    this.lhH.setVisibility(8);
    this.iuc.setVisibility(8);
    this.lhL.setVisibility(0);
    com.tencent.mm.plugin.favorite.b.a locala = com.tencent.mm.plugin.favorite.h.axw().xE(this.eIc.lhq);
    int j;
    int i;
    int k;
    if (locala != null)
    {
      j = (int)locala.getProgress();
      i = locala.field_offset;
      k = locala.field_totalLen;
    }
    while ((this.lcn.axJ()) && (bg.nm(this.eIc.ujt)))
    {
      a(j, getString(R.l.dvd, new Object[] { x.ab(i), x.ab(k) }));
      GMTrace.o(6405004197888L, 47721);
      return;
      k = (int)this.eIc.ujO;
      j = 0;
      i = 0;
    }
    a(j, getString(R.l.dth, new Object[] { x.ab(i), x.ab(k) }));
    GMTrace.o(6405004197888L, 47721);
  }
  
  private void azd()
  {
    GMTrace.i(6405138415616L, 47722);
    this.lhL.setVisibility(8);
    this.lhH.setVisibility(8);
    if (bg.nm(this.eIc.ujA))
    {
      this.lhG.setVisibility(8);
      this.lhI.setVisibility(0);
      localObject = com.tencent.mm.plugin.favorite.h.axw().xE(this.eIc.lhq);
      if ((localObject == null) || (((com.tencent.mm.plugin.favorite.b.a)localObject).field_offset <= 0)) {
        break label143;
      }
      localObject = this.lhI;
      if (!this.lcn.axK()) {
        break label136;
      }
    }
    label136:
    for (int i = R.l.dtW;; i = R.l.dtV)
    {
      ((Button)localObject).setText(i);
      this.iuc.setVisibility(8);
      GMTrace.o(6405138415616L, 47722);
      return;
      this.lhG.setVisibility(0);
      break;
    }
    label143:
    Object localObject = this.lhI;
    if (this.lcn.axK()) {}
    for (i = R.l.dtX;; i = R.l.dtT)
    {
      ((Button)localObject).setText(i);
      break;
    }
  }
  
  private void aze()
  {
    GMTrace.i(6406212157440L, 47730);
    if (this.lhU)
    {
      GMTrace.o(6406212157440L, 47730);
      return;
    }
    this.lhU = true;
    Intent localIntent = new Intent();
    localIntent.putExtra("key_detail_fav_path", x.g(this.eIc));
    localIntent.putExtra("key_detail_fav_thumb_path", x.h(this.eIc));
    localIntent.putExtra("key_detail_fav_video_duration", this.eIc.duration);
    localIntent.putExtra("key_detail_statExtStr", this.eIc.eTv);
    com.tencent.mm.bj.d.b(this, "favorite", ".ui.detail.FavoriteVideoPlayUI", localIntent);
    finish();
    GMTrace.o(6406212157440L, 47730);
  }
  
  private void eB(boolean paramBoolean)
  {
    GMTrace.i(6404735762432L, 47719);
    boolean bool = x.d(this.eIc);
    w.i("MicroMsg.FavoriteFileDetailUI", "init status, info type %d, exist:%B path:%s", new Object[] { Integer.valueOf(this.lcn.field_itemStatus), Boolean.valueOf(bool), x.g(this.eIc) });
    if (this.eIc.ukB != 0)
    {
      azb();
      GMTrace.o(6404735762432L, 47719);
      return;
    }
    int i;
    if ((this.lcn.isDone()) || (bool) || (!bg.nm(this.eIc.ujt)))
    {
      if (bool)
      {
        if ((getType() == 15) && (this.eIc.ukt != null) && (!bg.nm(this.eIc.ukt.gkI)) && (!bg.nm(this.eIc.ukt.gkM)))
        {
          this.lhV = true;
          this.lhJ.setVisibility(8);
          this.lhL.setVisibility(8);
          this.lhI.setVisibility(8);
          this.lhG.setVisibility(8);
          this.lhH.setVisibility(8);
          this.iuc.setVisibility(8);
          String str = x.g(this.eIc);
          w.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.tB() + " initView: fullpath:" + str);
          ViewGroup localViewGroup = (ViewGroup)findViewById(R.h.ckd);
          this.jGP = com.tencent.mm.pluginsdk.ui.tools.n.dX(this.vKB.vKW);
          RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
          localLayoutParams.addRule(13);
          localViewGroup.addView((View)this.jGP, 0, localLayoutParams);
          this.jGP.a(new f.a()
          {
            public final void Xq()
            {
              GMTrace.i(6399367053312L, 47679);
              w.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.tB() + " onPrepared");
              FavoriteFileDetailUI.m(FavoriteFileDetailUI.this).ci(true);
              FavoriteFileDetailUI.m(FavoriteFileDetailUI.this).start();
              GMTrace.o(6399367053312L, 47679);
            }
            
            public final int bM(int paramAnonymousInt1, int paramAnonymousInt2)
            {
              GMTrace.i(6399769706496L, 47682);
              GMTrace.o(6399769706496L, 47682);
              return 0;
            }
            
            public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
            {
              GMTrace.i(6399903924224L, 47683);
              GMTrace.o(6399903924224L, 47683);
            }
            
            public final void onCompletion()
            {
              GMTrace.i(6399635488768L, 47681);
              GMTrace.o(6399635488768L, 47681);
            }
            
            public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
            {
              GMTrace.i(6399501271040L, 47680);
              FavoriteFileDetailUI.m(FavoriteFileDetailUI.this).stop();
              if (FavoriteFileDetailUI.n(FavoriteFileDetailUI.this))
              {
                GMTrace.o(6399501271040L, 47680);
                return;
              }
              FavoriteFileDetailUI.o(FavoriteFileDetailUI.this);
              af.t(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(6391582425088L, 47621);
                  com.tencent.mm.ui.base.h.h(FavoriteFileDetailUI.this.vKB.vKW, R.l.egs, R.l.dgV);
                  Bitmap localBitmap = com.tencent.mm.plugin.favorite.c.g.a(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this), FavoriteFileDetailUI.b(FavoriteFileDetailUI.this));
                  ImageView localImageView = (ImageView)FavoriteFileDetailUI.this.findViewById(R.h.ckO);
                  if (localImageView != null)
                  {
                    localImageView.setImageBitmap(localBitmap);
                    localImageView.setVisibility(0);
                  }
                  GMTrace.o(6391582425088L, 47621);
                }
              });
              GMTrace.o(6399501271040L, 47680);
            }
          });
          w.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.tB() + " initView :" + str);
          if (str != null)
          {
            this.jGP.stop();
            this.jGP.setVideoPath(str);
          }
          w.d("MicroMsg.FavoriteFileDetailUI", com.tencent.mm.compatible.util.g.tB() + " initView");
          if (at.pD() != null) {
            at.pD().ri();
          }
          com.tencent.mm.plugin.report.service.g.ork.i(11444, new Object[] { Integer.valueOf(4) });
        }
        if ((getType() == 15) || (getType() == 4))
        {
          if (!this.lhV)
          {
            this.lhL.setVisibility(8);
            this.lhI.setVisibility(8);
            this.lhG.setVisibility(8);
            this.lhH.setVisibility(0);
            this.lhH.setText(R.l.dtU);
            this.iuc.setVisibility(8);
            aze();
          }
          at.xB().A(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(6388092764160L, 47595);
              x.t(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this));
              GMTrace.o(6388092764160L, 47595);
            }
          });
          GMTrace.o(6404735762432L, 47719);
          return;
        }
        if ((x.d(this.eIc)) && (x.e(this.eIc))) {}
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label663;
          }
          this.lhL.setVisibility(8);
          this.lhI.setVisibility(8);
          this.lhG.setVisibility(0);
          this.lhH.setVisibility(8);
          this.iuc.setVisibility(8);
          this.lhG.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(View paramAnonymousView)
            {
              GMTrace.i(6393461473280L, 47635);
              FavoriteFileDetailUI.p(FavoriteFileDetailUI.this);
              GMTrace.o(6393461473280L, 47635);
            }
          });
          break;
        }
        label663:
        this.lhL.setVisibility(8);
        this.lhI.setVisibility(8);
        if (bg.nm(this.eIc.ujA)) {
          this.lhG.setVisibility(8);
        }
        for (;;)
        {
          this.lhH.setVisibility(0);
          this.iuc.setVisibility(0);
          break;
          this.lhG.setVisibility(0);
        }
      }
      if (bg.nm(this.eIc.ujt))
      {
        azb();
        GMTrace.o(6404735762432L, 47719);
        return;
      }
      w.w("MicroMsg.FavoriteFileDetailUI", "? info is done, source file not exist, cdn data url is not null");
      azd();
      GMTrace.o(6404735762432L, 47719);
      return;
    }
    if (this.lcn.axL())
    {
      if (bg.nm(this.eIc.ujt))
      {
        azb();
        if (paramBoolean)
        {
          i = getType();
          if ((4 == i) || (15 == i)) {}
          for (i = R.l.duB;; i = R.l.duw)
          {
            com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(i));
            GMTrace.o(6404735762432L, 47719);
            return;
          }
        }
      }
      else
      {
        azd();
        if (paramBoolean)
        {
          com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(R.l.dnk));
          GMTrace.o(6404735762432L, 47719);
        }
      }
    }
    else if (this.lcn.axK())
    {
      azd();
      if (paramBoolean)
      {
        com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(R.l.efu));
        GMTrace.o(6404735762432L, 47719);
      }
    }
    else
    {
      if ((this.lcn.isDownloading()) || (this.lcn.axJ()))
      {
        azc();
        GMTrace.o(6404735762432L, 47719);
        return;
      }
      w.w("MicroMsg.FavoriteFileDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
      azd();
    }
    GMTrace.o(6404735762432L, 47719);
  }
  
  private int getType()
  {
    GMTrace.i(6404601544704L, 47718);
    if (this.eIc == null)
    {
      w.w("MicroMsg.FavoriteFileDetailUI", "get type but data item is null");
      GMTrace.o(6404601544704L, 47718);
      return 8;
    }
    if (this.eIc.aGU == 0)
    {
      w.w("MicroMsg.FavoriteFileDetailUI", "get data type, but data item type is 0, info type %d", new Object[] { Integer.valueOf(this.lcn.field_type) });
      if (4 == this.lcn.field_type)
      {
        GMTrace.o(6404601544704L, 47718);
        return 4;
      }
      if (16 == this.lcn.field_type)
      {
        if ((this.eIc != null) && (this.eIc.ukt != null))
        {
          if (!bg.nm(this.eIc.ukt.gkI))
          {
            GMTrace.o(6404601544704L, 47718);
            return 15;
          }
          if (!bg.nm(this.eIc.ukt.gkM))
          {
            GMTrace.o(6404601544704L, 47718);
            return 15;
          }
        }
        GMTrace.o(6404601544704L, 47718);
        return 4;
      }
      GMTrace.o(6404601544704L, 47718);
      return 8;
    }
    if (this.eIc.aGU == 15)
    {
      if ((this.eIc != null) && (this.eIc.ukt != null))
      {
        if (!bg.nm(this.eIc.ukt.gkI))
        {
          GMTrace.o(6404601544704L, 47718);
          return 15;
        }
        if (!bg.nm(this.eIc.ukt.gkM))
        {
          GMTrace.o(6404601544704L, 47718);
          return 15;
        }
      }
      GMTrace.o(6404601544704L, 47718);
      return 4;
    }
    int i = this.eIc.aGU;
    GMTrace.o(6404601544704L, 47718);
    return i;
  }
  
  protected final int Qf()
  {
    GMTrace.i(6404198891520L, 47715);
    GMTrace.o(6404198891520L, 47715);
    return 1;
  }
  
  public final void a(String paramString, l paraml)
  {
    boolean bool2 = false;
    GMTrace.i(6406077939712L, 47729);
    w.i("MicroMsg.FavoriteFileDetailUI", "on favitem change, notifyId:%s, curId:%d", new Object[] { paramString, Long.valueOf(this.lcn.field_localId) });
    paramString = com.tencent.mm.plugin.favorite.h.axB().cf(this.lcn.field_localId);
    if ((paramString == null) && (!this.lhR))
    {
      w.w("MicroMsg.FavoriteFileDetailUI", "error, on notify change, cannot find info");
      finish();
      GMTrace.o(6406077939712L, 47729);
      return;
    }
    if (!this.lhR) {
      this.lcn = paramString;
    }
    aza();
    paramString = com.tencent.mm.plugin.favorite.h.axw().xE(this.eIc.lhq);
    boolean bool1;
    if (paramString == null) {
      bool1 = bool2;
    }
    while (bool1)
    {
      GMTrace.o(6406077939712L, 47729);
      return;
      if (paramString.field_status == 1)
      {
        bool1 = true;
      }
      else
      {
        bool1 = bool2;
        if (this.eIc.aGU != 8)
        {
          bool1 = bool2;
          if (!this.lhW)
          {
            if ((paramString.field_status == 4) && (com.tencent.mm.plugin.favorite.h.axw().xE(this.eIc.lhq).field_extFlag != 0))
            {
              x.a(this.lcn, this.eIc, true);
              this.lhW = true;
            }
            w.i("MicroMsg.FavoriteFileDetailUI", "FavoriteFileDetail download, check retry, return %B", new Object[] { Boolean.valueOf(this.lhW) });
            bool1 = this.lhW;
          }
        }
      }
    }
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6393729908736L, 47637);
        FavoriteFileDetailUI.s(FavoriteFileDetailUI.this);
        GMTrace.o(6393729908736L, 47637);
      }
    });
    GMTrace.o(6406077939712L, 47729);
  }
  
  public final void b(com.tencent.mm.plugin.favorite.b.a parama)
  {
    GMTrace.i(6405809504256L, 47727);
    if ((parama == null) || (parama.field_dataId == null))
    {
      w.w("MicroMsg.FavoriteFileDetailUI", "on cdn status changed, item is null");
      GMTrace.o(6405809504256L, 47727);
      return;
    }
    w.d("MicroMsg.FavoriteFileDetailUI", "on cdn status changed, dataID is %s, field id is %s", new Object[] { this.eIc.lhq, parama.field_dataId });
    if (parama.field_dataId.equals(this.eIc.lhq))
    {
      if ((this.lcn.axJ()) && (bg.nm(this.eIc.ujt)))
      {
        a(parama.getProgress(), getString(R.l.dvd, new Object[] { x.ab(parama.field_offset), x.ab(parama.field_totalLen) }));
        GMTrace.o(6405809504256L, 47727);
        return;
      }
      a(parama.getProgress(), getString(R.l.dth, new Object[] { x.ab(parama.field_offset), x.ab(parama.field_totalLen) }));
      if ((this.lhR) && (com.tencent.mm.a.e.aZ(parama.field_path)))
      {
        this.lcn.field_itemStatus = 10;
        a("", null);
      }
      GMTrace.o(6405809504256L, 47727);
      return;
    }
    GMTrace.o(6405809504256L, 47727);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6404064673792L, 47714);
    int i = R.i.cwR;
    GMTrace.o(6404064673792L, 47714);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6405675286528L, 47726);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    com.tencent.mm.pluginsdk.ui.tools.a.a(this, paramInt1, paramInt2, paramIntent, true, R.l.dnn, R.l.dno, 2);
    if (paramInt2 != -1)
    {
      GMTrace.o(6405675286528L, 47726);
      return;
    }
    if (paramInt1 == 1)
    {
      Object localObject1;
      if (paramIntent == null)
      {
        localObject1 = null;
        if (paramIntent != null) {
          break label155;
        }
      }
      final Object localObject2;
      label155:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        localObject2 = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dtM), false, null);
        w.d("MicroMsg.FavoriteFileDetailUI", "do share msg, fav msg type %d", new Object[] { Integer.valueOf(getType()) });
        localObject2 = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6386213715968L, 47581);
            localObject2.dismiss();
            GMTrace.o(6386213715968L, 47581);
          }
        };
        paramInt2 = getType();
        if (!bg.nm((String)localObject1)) {
          break label166;
        }
        GMTrace.o(6405675286528L, 47726);
        return;
        localObject1 = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
      label166:
      Iterator localIterator = bg.g(((String)localObject1).split(",")).iterator();
      label246:
      label263:
      label285:
      label383:
      label391:
      label419:
      while (localIterator.hasNext())
      {
        String str = (String)localIterator.next();
        Object localObject3;
        if ((paramInt2 == 4) || (paramInt2 == 15))
        {
          localObject1 = this.vKB.vKW;
          localObject3 = this.eIc;
          if (localObject1 == null)
          {
            w.w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
            boolean bool = s.eb(str);
            if (!bool) {
              break label383;
            }
            localObject1 = v.c.lbL;
            localObject3 = this.lcn;
            v.d locald = v.d.lbP;
            if (!bool) {
              break label391;
            }
            paramInt1 = com.tencent.mm.y.m.fk(str);
            v.a((v.c)localObject1, (j)localObject3, locald, paramInt1);
          }
        }
        for (;;)
        {
          if (bg.nm(paramIntent)) {
            break label419;
          }
          com.tencent.mm.plugin.messenger.a.d.aOe().A(str, paramIntent, s.go(str));
          break;
          if (bg.nm(str))
          {
            w.w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
            break label246;
          }
          if (localObject3 == null)
          {
            w.w("MicroMsg.FavSendLogic", "want to send fav video, but dataItem is null");
            break label246;
          }
          at.xB().A(new r.3((th)localObject3, (Context)localObject1, str, (Runnable)localObject2));
          break label246;
          localObject1 = v.c.lbK;
          break label263;
          paramInt1 = 0;
          break label285;
          com.tencent.mm.plugin.favorite.b.r.a(this.vKB.vKW, str, this.lcn, this.eIc, (Runnable)localObject2);
        }
      }
      com.tencent.mm.ui.snackbar.a.e(this, getString(R.l.dwg));
    }
    GMTrace.o(6405675286528L, 47726);
  }
  
  public void onCreate(final Bundle paramBundle)
  {
    boolean bool2 = true;
    GMTrace.i(6404467326976L, 47717);
    super.onCreate(paramBundle);
    this.ghS = new ae();
    this.eDp = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.lhR = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
    this.eON = getIntent().getBooleanExtra("show_share", true);
    this.lhS = getIntent().getStringExtra("fav_note_xml");
    this.lcn = com.tencent.mm.plugin.favorite.h.axB().cf(this.eDp);
    if ((this.lhR) && (!bg.nm(this.lhS))) {
      this.lcn = x.xT(this.lhS);
    }
    if (this.lcn == null)
    {
      w.w("MicroMsg.FavoriteFileDetailUI", "error, cannot find download info");
      finish();
      GMTrace.o(6404467326976L, 47717);
      return;
    }
    v.j(this.lcn);
    aza();
    this.lhG = ((Button)findViewById(R.h.bTM));
    this.lhH = ((Button)findViewById(R.h.bSs));
    this.lhI = ((Button)findViewById(R.h.buO));
    this.lhJ = ((MMImageView)findViewById(R.h.bGr));
    this.jUm = ((TextView)findViewById(R.h.bPp));
    this.iuc = ((TextView)findViewById(R.h.chF));
    this.lhM = findViewById(R.h.bvg);
    this.lhL = findViewById(R.h.bvc);
    this.jeL = ((ProgressBar)findViewById(R.h.bvb));
    this.lhK = ((TextView)findViewById(R.h.bvd));
    this.lhN = ((TextView)findViewById(R.h.ceK));
    this.lhO = ((ImageView)findViewById(R.h.byU));
    this.lhP = ((TextView)findViewById(R.h.byV));
    final int i = getType();
    label386:
    tk localtk;
    label423:
    final boolean bool3;
    final boolean bool1;
    if (4 == i)
    {
      oM(R.l.dve);
      if (this.eIc.aGU != 4) {
        break label645;
      }
      this.lhJ.setImageResource(R.k.cJo);
      this.jUm.setText(this.eIc.title);
      localtk = this.eIc.ukt;
      if (localtk != null) {
        break label665;
      }
      this.lhN.setVisibility(8);
      a(new MenuItem.OnMenuItemClickListener()
      {
        public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
        {
          GMTrace.i(6409567600640L, 47755);
          v.a(v.a.lbA, FavoriteFileDetailUI.b(FavoriteFileDetailUI.this));
          FavoriteFileDetailUI.this.finish();
          GMTrace.o(6409567600640L, 47755);
          return true;
        }
      });
      this.lhH.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6392924602368L, 47631);
          paramAnonymousView = x.g(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this));
          if (4 == FavoriteFileDetailUI.c(FavoriteFileDetailUI.this))
          {
            FavoriteFileDetailUI.d(FavoriteFileDetailUI.this);
            FavoriteFileDetailUI.e(FavoriteFileDetailUI.this);
            GMTrace.o(6392924602368L, 47631);
            return;
          }
          FavoriteFileDetailUI.a(FavoriteFileDetailUI.this, paramAnonymousView);
          GMTrace.o(6392924602368L, 47631);
        }
      });
      paramBundle = this.eIc.ujA;
      if (!bg.nm(paramBundle)) {
        this.lhG.setOnClickListener(new View.OnClickListener()
        {
          public final void onClick(View paramAnonymousView)
          {
            GMTrace.i(6394266779648L, 47641);
            w.d("MicroMsg.FavoriteFileDetailUI", "start video preview, fav id %d, fav local id %d", new Object[] { Integer.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_id), Long.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_localId) });
            paramAnonymousView = new Intent();
            paramAnonymousView.putExtra("rawUrl", paramBundle);
            paramAnonymousView.putExtra("is_favorite_item", true);
            paramAnonymousView.putExtra("fav_local_id", FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_localId);
            paramAnonymousView.putExtra("geta8key_scene", 14);
            com.tencent.mm.plugin.favorite.c.j(paramAnonymousView, FavoriteFileDetailUI.this.vKB.vKW);
            GMTrace.o(6394266779648L, 47641);
          }
        });
      }
      this.lhI.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6409836036096L, 47757);
          w.i("MicroMsg.FavoriteFileDetailUI", "click item favid %d, localid %d, itemstatus %d", new Object[] { Integer.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_id), Long.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_localId), Integer.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_itemStatus) });
          if (!com.tencent.mm.compatible.util.f.ty())
          {
            com.tencent.mm.ui.base.h.h(FavoriteFileDetailUI.this.vKB.vKW, R.l.dug, R.l.dsQ);
            GMTrace.o(6409836036096L, 47757);
            return;
          }
          if ((FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).axK()) || (bg.nm(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).ujt))) {
            x.l(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this));
          }
          for (;;)
          {
            FavoriteFileDetailUI.g(FavoriteFileDetailUI.this);
            GMTrace.o(6409836036096L, 47757);
            return;
            if (!FavoriteFileDetailUI.f(FavoriteFileDetailUI.this))
            {
              x.a(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this), FavoriteFileDetailUI.a(FavoriteFileDetailUI.this), true);
            }
            else
            {
              FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_itemStatus = 7;
              x.a(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this), 18);
            }
          }
        }
      });
      this.lhM.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6388361199616L, 47597);
          if (FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).isDownloading())
          {
            x.f(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this));
            FavoriteFileDetailUI.h(FavoriteFileDetailUI.this).setText(R.l.dtV);
          }
          for (;;)
          {
            FavoriteFileDetailUI.i(FavoriteFileDetailUI.this);
            GMTrace.o(6388361199616L, 47597);
            return;
            x.o(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this));
            FavoriteFileDetailUI.h(FavoriteFileDetailUI.this).setText(R.l.dtW);
          }
        }
      });
      if (this.eON)
      {
        bool3 = getIntent().getBooleanExtra("key_detail_can_delete", true);
        i = getType();
        if (i != 8) {
          break label958;
        }
        bool1 = this.lcn.axH();
      }
    }
    for (;;)
    {
      if ((bool1) || (bool3)) {
        a(0, R.l.eex, R.g.aXV, new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(6392656166912L, 47629);
            if (bool1)
            {
              FavoriteFileDetailUI.j(FavoriteFileDetailUI.this);
              if ((!com.tencent.mm.plugin.favorite.b.q.b(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this))) && (FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).ukB == 0)) {}
            }
            else if (!bool3)
            {
              GMTrace.o(6392656166912L, 47629);
              return false;
            }
            paramAnonymousMenuItem = new com.tencent.mm.ui.widget.f(FavoriteFileDetailUI.this.vKB.vKW, com.tencent.mm.ui.widget.f.xpQ, false);
            paramAnonymousMenuItem.qik = new p.c()
            {
              public final void a(com.tencent.mm.ui.base.n paramAnonymous2n)
              {
                GMTrace.i(6385676845056L, 47577);
                if (FavoriteFileDetailUI.13.this.lid)
                {
                  FavoriteFileDetailUI.j(FavoriteFileDetailUI.this);
                  if ((!com.tencent.mm.plugin.favorite.b.q.b(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this))) && (FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).ukB == 0))
                  {
                    if (FavoriteFileDetailUI.13.this.val$type != 8) {
                      break label155;
                    }
                    paramAnonymous2n.e(0, FavoriteFileDetailUI.this.getString(R.l.duL));
                  }
                }
                for (;;)
                {
                  if (FavoriteFileDetailUI.13.this.lie)
                  {
                    paramAnonymous2n.e(3, FavoriteFileDetailUI.this.getString(R.l.dtk));
                    paramAnonymous2n.e(2, FavoriteFileDetailUI.this.vKB.vKW.getString(R.l.cSt));
                  }
                  GMTrace.o(6385676845056L, 47577);
                  return;
                  label155:
                  if (FavoriteFileDetailUI.13.this.val$type == 15)
                  {
                    paramAnonymous2n.e(0, FavoriteFileDetailUI.this.getString(R.l.duL));
                    paramAnonymous2n.e(4, FavoriteFileDetailUI.this.getString(R.l.dgn));
                  }
                  else if (FavoriteFileDetailUI.13.this.val$type == 4)
                  {
                    paramAnonymous2n.e(0, FavoriteFileDetailUI.this.getString(R.l.duL));
                    paramAnonymous2n.e(4, FavoriteFileDetailUI.this.getString(R.l.dgn));
                  }
                  else
                  {
                    paramAnonymous2n.e(0, FavoriteFileDetailUI.this.getString(R.l.duL));
                    if ((FavoriteFileDetailUI.13.this.lie) && (FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).axI())) {
                      paramAnonymous2n.e(1, FavoriteFileDetailUI.this.getString(R.l.dun));
                    }
                  }
                }
              }
            };
            paramAnonymousMenuItem.qil = new p.d()
            {
              public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
              {
                GMTrace.i(6397219569664L, 47663);
                switch (paramAnonymous2MenuItem.getItemId())
                {
                }
                for (;;)
                {
                  GMTrace.o(6397219569664L, 47663);
                  return;
                  if (FavoriteFileDetailUI.c(FavoriteFileDetailUI.this) == 8)
                  {
                    paramAnonymous2MenuItem = x.g(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this));
                    if (!com.tencent.mm.a.e.aZ(paramAnonymous2MenuItem))
                    {
                      w.e("MicroMsg.FavoriteFileDetailUI", "share file failed, file not exists");
                      Toast.makeText(FavoriteFileDetailUI.this, FavoriteFileDetailUI.this.getString(R.l.duJ), 1).show();
                      GMTrace.o(6397219569664L, 47663);
                      return;
                    }
                    if (new File(paramAnonymous2MenuItem).length() > 10485760L)
                    {
                      w.e("MicroMsg.FavoriteFileDetailUI", "share file failed, file too large");
                      Toast.makeText(FavoriteFileDetailUI.this, FavoriteFileDetailUI.this.getString(R.l.duK), 1).show();
                      GMTrace.o(6397219569664L, 47663);
                      return;
                    }
                  }
                  paramAnonymous2MenuItem = FavoriteFileDetailUI.this;
                  FavoriteFileDetailUI.b(FavoriteFileDetailUI.this);
                  FavoriteFileDetailUI.k(paramAnonymous2MenuItem);
                  GMTrace.o(6397219569664L, 47663);
                  return;
                  final Object localObject = com.tencent.mm.ui.base.h.a(FavoriteFileDetailUI.this.vKB.vKW, FavoriteFileDetailUI.this.getString(R.l.dtM), false, null);
                  paramAnonymous2MenuItem = FavoriteFileDetailUI.this.vKB.vKW;
                  j localj = FavoriteFileDetailUI.b(FavoriteFileDetailUI.this);
                  localObject = new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(6399098617856L, 47677);
                      localObject.dismiss();
                      GMTrace.o(6399098617856L, 47677);
                    }
                  };
                  LinkedList localLinkedList = new LinkedList();
                  localLinkedList.add(Integer.valueOf(localj.field_id));
                  paramAnonymous2MenuItem = new ai("", localLinkedList, new r.2(localj, paramAnonymous2MenuItem, (Runnable)localObject));
                  at.wS().a(paramAnonymous2MenuItem, 0);
                  GMTrace.o(6397219569664L, 47663);
                  return;
                  com.tencent.mm.ui.base.h.a(FavoriteFileDetailUI.this.vKB.vKW, FavoriteFileDetailUI.this.getString(R.l.cSu), "", new DialogInterface.OnClickListener()
                  {
                    public final void onClick(final DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                    {
                      GMTrace.i(6390911336448L, 47616);
                      paramAnonymous3DialogInterface = com.tencent.mm.ui.base.h.a(FavoriteFileDetailUI.this.vKB.vKW, FavoriteFileDetailUI.this.getString(R.l.cSu), false, null);
                      x.a(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_localId, new Runnable()
                      {
                        public final void run()
                        {
                          GMTrace.i(6383797796864L, 47563);
                          paramAnonymous3DialogInterface.dismiss();
                          w.d("MicroMsg.FavoriteFileDetailUI", "do del fav file, local id %d, fav id %d", new Object[] { Long.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_localId), Integer.valueOf(FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_id) });
                          FavoriteFileDetailUI.this.finish();
                          GMTrace.o(6383797796864L, 47563);
                        }
                      });
                      GMTrace.o(6390911336448L, 47616);
                    }
                  }, null);
                  GMTrace.o(6397219569664L, 47663);
                  return;
                  paramAnonymous2MenuItem = new Intent(FavoriteFileDetailUI.this.vKB.vKW, FavTagEditUI.class);
                  paramAnonymous2MenuItem.putExtra("key_fav_scene", 2);
                  paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_localId);
                  FavoriteFileDetailUI.this.vKB.vKW.startActivity(paramAnonymous2MenuItem);
                  GMTrace.o(6397219569664L, 47663);
                  return;
                  FavoriteFileDetailUI.l(FavoriteFileDetailUI.this);
                }
              }
            };
            paramAnonymousMenuItem.bFk();
            GMTrace.o(6392656166912L, 47629);
            return true;
          }
        });
      }
      eB(false);
      GMTrace.o(6404467326976L, 47717);
      return;
      if (15 == i)
      {
        oM(R.l.dve);
        findViewById(R.h.ckd).setBackgroundResource(R.e.black);
        this.jUm.setVisibility(8);
        break;
      }
      oM(R.l.dtK);
      break;
      label645:
      this.lhJ.setImageResource(com.tencent.mm.pluginsdk.model.q.Oo(this.eIc.ujI));
      break label386;
      label665:
      if (bg.nm(localtk.gkI))
      {
        w.i("MicroMsg.FavoriteFileDetailUI", " there is no attachurl, show more info btn");
        paramBundle = localtk.gkL;
        localObject = localtk.gkM;
        if ((!bg.nm(paramBundle)) && (!bg.nm((String)localObject)))
        {
          this.lhN.setText(paramBundle);
          this.lhN.setVisibility(0);
          this.lhN.setOnClickListener(new View.OnClickListener()
          {
            public final void onClick(final View paramAnonymousView)
            {
              GMTrace.i(6393193037824L, 47633);
              paramAnonymousView = new Intent();
              Object localObject = new Bundle();
              ((Bundle)localObject).putString("key_snsad_statextstr", FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).eTv);
              paramAnonymousView.putExtra("jsapiargs", (Bundle)localObject);
              paramAnonymousView.putExtra("rawUrl", localObject);
              paramAnonymousView.putExtra("useJs", true);
              localObject = new com.tencent.mm.plugin.sns.a.b.c("", "");
              at.wS().a((com.tencent.mm.ad.k)localObject, 0);
              new ae(Looper.getMainLooper()).post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(6394535215104L, 47643);
                  WorkerProfile.pz().etF.j(paramAnonymousView, FavoriteFileDetailUI.this);
                  FavoriteFileDetailUI.this.finish();
                  GMTrace.o(6394535215104L, 47643);
                }
              });
              GMTrace.o(6393193037824L, 47633);
            }
          });
          break label423;
        }
        this.lhN.setVisibility(8);
        break label423;
      }
      final Object localObject = getResources().getString(R.l.edf);
      paramBundle = (Bundle)localObject;
      if (localtk.ulk / 60 > 0) {
        paramBundle = (String)localObject + getResources().getString(R.l.edh, new Object[] { Integer.valueOf(localtk.ulk / 60) });
      }
      localObject = paramBundle;
      if (localtk.ulk % 60 > 0) {
        localObject = paramBundle + getResources().getString(R.l.edi, new Object[] { Integer.valueOf(localtk.ulk % 60) });
      }
      paramBundle = (String)localObject + getResources().getString(R.l.edg);
      this.lhN.setText(paramBundle);
      this.lhN.setVisibility(0);
      this.lhN.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(6386750586880L, 47585);
          v.a(v.a.lby, FavoriteFileDetailUI.b(FavoriteFileDetailUI.this));
          paramAnonymousView = FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).ukt;
          String str = x.h(FavoriteFileDetailUI.a(FavoriteFileDetailUI.this));
          Intent localIntent = new Intent();
          localIntent.putExtra("IsAd", false);
          localIntent.putExtra("KStremVideoUrl", paramAnonymousView.gkI);
          localIntent.putExtra("StreamWording", paramAnonymousView.gkL);
          localIntent.putExtra("StremWebUrl", paramAnonymousView.gkM);
          localIntent.putExtra("KBlockFav", true);
          localIntent.putExtra("KThumUrl", paramAnonymousView.gkN);
          localIntent.putExtra("KThumbPath", str);
          localIntent.putExtra("KMediaId", "fakeid_" + FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_id);
          localIntent.putExtra("KMediaVideoTime", paramAnonymousView.ulk);
          localIntent.putExtra("KMediaTitle", FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).title);
          localIntent.putExtra("KSta_StremVideoAduxInfo", paramAnonymousView.gkO);
          localIntent.putExtra("KSta_StremVideoPublishId", paramAnonymousView.gkP);
          localIntent.putExtra("KSta_SourceType", 1);
          localIntent.putExtra("KSta_Scene", v.b.lbI.value);
          localIntent.putExtra("KSta_FromUserName", FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_fromUser);
          localIntent.putExtra("KSta_FavID", FavoriteFileDetailUI.b(FavoriteFileDetailUI.this).field_id);
          localIntent.putExtra("KSta_SnsStatExtStr", FavoriteFileDetailUI.a(FavoriteFileDetailUI.this).eTv);
          com.tencent.mm.bj.d.b(FavoriteFileDetailUI.this, "sns", ".ui.VideoAdPlayerUI", localIntent);
          GMTrace.o(6386750586880L, 47585);
        }
      });
      break label423;
      label958:
      if (i == 15)
      {
        paramBundle = com.tencent.mm.k.g.ut().getValue("SIGHTCannotTransmitForFav");
        if ((this.lcn.axH()) && (bg.Sy(paramBundle) == 0)) {
          bool1 = true;
        } else {
          bool1 = false;
        }
      }
      else
      {
        bool1 = bool2;
        if (!this.lcn.axI())
        {
          bool1 = bool2;
          if (!this.lcn.axH()) {
            bool1 = false;
          }
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6405272633344L, 47723);
    if (this.jGP != null)
    {
      this.jGP.a(null);
      this.jGP.stop();
      this.jGP.onDetach();
      if (at.pD() != null) {
        at.pD().rh();
      }
    }
    super.onDestroy();
    GMTrace.o(6405272633344L, 47723);
  }
  
  protected void onPause()
  {
    GMTrace.i(6405541068800L, 47725);
    super.onPause();
    com.tencent.mm.plugin.favorite.h.axB().j(this);
    com.tencent.mm.plugin.favorite.h.axw().b(this);
    if (this.jGP != null) {
      this.jGP.stop();
    }
    GMTrace.o(6405541068800L, 47725);
  }
  
  protected void onResume()
  {
    GMTrace.i(6405406851072L, 47724);
    super.onResume();
    com.tencent.mm.plugin.favorite.h.axB().c(this);
    com.tencent.mm.plugin.favorite.h.axw().a(this);
    if (this.jGP != null) {
      this.jGP.start();
    }
    GMTrace.o(6405406851072L, 47724);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\detail\FavoriteFileDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */