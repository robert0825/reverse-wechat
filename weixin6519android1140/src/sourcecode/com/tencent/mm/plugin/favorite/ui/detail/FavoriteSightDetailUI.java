package com.tencent.mm.plugin.favorite.ui.detail;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.util.DisplayMetrics;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.bj.d;
import com.tencent.mm.plugin.favorite.b.b;
import com.tencent.mm.plugin.favorite.b.b.a;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.k;
import com.tencent.mm.plugin.favorite.b.q;
import com.tencent.mm.plugin.favorite.b.v;
import com.tencent.mm.plugin.favorite.b.v.a;
import com.tencent.mm.plugin.favorite.b.v.c;
import com.tencent.mm.plugin.favorite.b.v.d;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.c.c;
import com.tencent.mm.plugin.favorite.ui.FavTagEditUI;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailFooterView;
import com.tencent.mm.plugin.favorite.ui.base.FavDetailTitleView;
import com.tencent.mm.plugin.favorite.ui.base.FavTagEntrance;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ud;
import com.tencent.mm.sdk.e.j.a;
import com.tencent.mm.sdk.e.l;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.y.m;
import com.tencent.mm.y.s;

public class FavoriteSightDetailUI
  extends MMActivity
  implements b.a, j.a
{
  private th eIc;
  private q lfc;
  private j lfg;
  private boolean lhQ;
  private boolean lhW;
  private ImageView lhi;
  private boolean lhn;
  private FavDetailTitleView liD;
  private FavDetailFooterView liE;
  private FavTagEntrance liF;
  private View liG;
  private ImageView liH;
  private MMPinProgressBtn liI;
  private VideoPlayerTextureView liJ;
  private long liK;
  private boolean liL;
  private boolean liM;
  private Runnable yvj;
  
  public FavoriteSightDetailUI()
  {
    GMTrace.i(6376550039552L, 47509);
    this.liL = true;
    this.lhQ = false;
    this.lhn = false;
    this.lhW = false;
    this.lfc = new q();
    this.yvj = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6403796238336L, 47712);
        if ((FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).isDone()) && (x.d(FavoriteSightDetailUI.b(FavoriteSightDetailUI.this))) && (FavoriteSightDetailUI.d(FavoriteSightDetailUI.this) != null) && (FavoriteSightDetailUI.d(FavoriteSightDetailUI.this).isPlaying()))
        {
          GMTrace.o(6403796238336L, 47712);
          return;
        }
        FavoriteSightDetailUI.a(FavoriteSightDetailUI.this, true);
        GMTrace.o(6403796238336L, 47712);
      }
    };
    this.liM = false;
    GMTrace.o(6376550039552L, 47509);
  }
  
  private void azg()
  {
    GMTrace.i(6378026434560L, 47520);
    String str = x.g(this.eIc);
    if (!com.tencent.mm.a.e.aZ(str))
    {
      GMTrace.o(6378026434560L, 47520);
      return;
    }
    this.liJ.stop();
    this.liJ.setMute(true);
    this.liJ.setVideoPath(str);
    GMTrace.o(6378026434560L, 47520);
  }
  
  private void eC(boolean paramBoolean)
  {
    GMTrace.i(6377489563648L, 47516);
    if (this.lfg.isDone())
    {
      if (x.d(this.eIc))
      {
        this.liH.setVisibility(8);
        this.liI.setVisibility(8);
        azg();
        GMTrace.o(6377489563648L, 47516);
        return;
      }
      if (bg.nm(this.eIc.ujt)) {
        this.liH.setImageResource(R.k.cOK);
      }
    }
    for (;;)
    {
      this.liH.setVisibility(0);
      this.liI.setVisibility(8);
      this.lhi.setVisibility(0);
      GMTrace.o(6377489563648L, 47516);
      return;
      w.w("MicroMsg.FavoriteSightDetailUI", "? info is done, source file not exist, cdn data url is not null");
      this.liH.setImageResource(R.k.cOK);
      continue;
      if (this.lfg.axL())
      {
        if (bg.nm(this.eIc.ujt))
        {
          this.liH.setImageResource(R.k.cOK);
          if (!paramBoolean) {}
        }
        else
        {
          this.liH.setImageResource(R.k.cOK);
          if (paramBoolean) {
            com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(R.l.dnk));
          }
        }
      }
      else if (this.lfg.axK())
      {
        this.liH.setImageResource(R.k.cOK);
        if (paramBoolean) {
          com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(R.l.efu));
        }
      }
      else
      {
        if ((this.lfg.isDownloading()) || (this.lfg.axJ()))
        {
          this.liH.setVisibility(8);
          this.liI.setVisibility(0);
          com.tencent.mm.plugin.favorite.b.a locala = com.tencent.mm.plugin.favorite.h.axw().xE(this.eIc.lhq);
          if (locala != null) {
            this.liI.setProgress((int)locala.getProgress());
          }
          for (;;)
          {
            this.lhi.setVisibility(0);
            GMTrace.o(6377489563648L, 47516);
            return;
            this.liI.setProgress(0);
          }
        }
        w.w("MicroMsg.FavoriteSightDetailUI", "other status, not done, downloading, uploading, downloadfail, uploadfail");
        this.liH.setImageResource(R.k.cOK);
      }
    }
  }
  
  protected final int Qf()
  {
    GMTrace.i(6376818475008L, 47511);
    GMTrace.o(6376818475008L, 47511);
    return 1;
  }
  
  public final void a(String paramString, l paraml)
  {
    boolean bool = false;
    GMTrace.i(6377623781376L, 47517);
    w.i("MicroMsg.FavoriteSightDetailUI", "on favitem change, notifyId:%s, curId:%d", new Object[] { paramString, Long.valueOf(this.lfg.field_localId) });
    paramString = com.tencent.mm.plugin.favorite.h.axB().cf(this.lfg.field_localId);
    if (paramString == null)
    {
      w.w("MicroMsg.FavoriteSightDetailUI", "error, on notify change, cannot find info");
      finish();
      GMTrace.o(6377623781376L, 47517);
      return;
    }
    this.lfg = paramString;
    this.eIc = x.n(paramString);
    paramString = com.tencent.mm.plugin.favorite.h.axw().xE(this.eIc.lhq);
    if (paramString == null) {}
    while (bool)
    {
      GMTrace.o(6377623781376L, 47517);
      return;
      if (!this.lhW)
      {
        if ((paramString.field_status == 4) && (com.tencent.mm.plugin.favorite.h.axw().xE(this.eIc.lhq).field_extFlag != 0))
        {
          x.a(this.lfg, this.eIc, true);
          this.lhW = true;
        }
        w.i("MicroMsg.FavoriteSightDetailUI", "FavoriteFileDetail download, check retry, return %B", new Object[] { Boolean.valueOf(this.lhW) });
        bool = this.lhW;
      }
    }
    af.F(this.yvj);
    af.i(this.yvj, 500L);
    GMTrace.o(6377623781376L, 47517);
  }
  
  public final void b(com.tencent.mm.plugin.favorite.b.a parama)
  {
    GMTrace.i(6377757999104L, 47518);
    if ((parama == null) || (parama.field_dataId == null))
    {
      w.w("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, item is null");
      GMTrace.o(6377757999104L, 47518);
      return;
    }
    w.i("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, dataID is %s, field id is %s,offset is %d, total is %d,cdn status is %d, cdn type is %d (send or recieve)", new Object[] { this.eIc.lhq, parama.field_dataId, Integer.valueOf(parama.field_offset), Integer.valueOf(parama.field_totalLen), Integer.valueOf(parama.field_status), Integer.valueOf(parama.field_type) });
    if (parama.field_offset > parama.field_totalLen)
    {
      w.e("MicroMsg.FavoriteSightDetailUI", "on cdn status changed, cdn offset length > cdn total length, do cdnLengthError()");
      if (1 != parama.field_type) {
        break label225;
      }
    }
    label225:
    for (parama.field_status = 2;; parama.field_status = 4)
    {
      com.tencent.mm.plugin.favorite.h.axw().a(parama, new String[0]);
      if (parama.field_type == 0) {
        c.e(parama);
      }
      if (parama.field_type == 1) {
        c.f(parama);
      }
      if (parama.field_dataId.equals(this.eIc.lhq))
      {
        final int i = (int)parama.getProgress();
        this.liI.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6410104471552L, 47759);
            FavoriteSightDetailUI.c(FavoriteSightDetailUI.this).setProgress(i);
            GMTrace.o(6410104471552L, 47759);
          }
        });
      }
      GMTrace.o(6377757999104L, 47518);
      return;
    }
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6376684257280L, 47510);
    int i = R.i.cwT;
    GMTrace.o(6376684257280L, 47510);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6377892216832L, 47519);
    if ((paramInt1 == 1) && (-1 == paramInt2))
    {
      String str;
      label32:
      Object localObject;
      label96:
      v.d locald;
      if (paramIntent == null)
      {
        str = null;
        if (paramIntent != null) {
          break label160;
        }
        paramIntent = null;
        localObject = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6411312431104L, 47768);
            this.lea.dismiss();
            GMTrace.o(6411312431104L, 47768);
          }
        };
        com.tencent.mm.plugin.favorite.b.r.a(this.vKB.vKW, str, paramIntent, this.lfg, (Runnable)localObject);
        boolean bool = s.eb(str);
        if (!bool) {
          break label171;
        }
        paramIntent = v.c.lbL;
        localObject = this.lfg;
        locald = v.d.lbO;
        if (!bool) {
          break label178;
        }
      }
      label160:
      label171:
      label178:
      for (paramInt1 = m.fk(str);; paramInt1 = 0)
      {
        v.a(paramIntent, (j)localObject, locald, paramInt1);
        com.tencent.mm.ui.snackbar.a.e(this, getString(R.l.dwg));
        GMTrace.o(6377892216832L, 47519);
        return;
        str = paramIntent.getStringExtra("Select_Conv_User");
        break;
        paramIntent = paramIntent.getStringExtra("custom_send_text");
        break label32;
        paramIntent = v.c.lbK;
        break label96;
      }
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6377892216832L, 47519);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6376952692736L, 47512);
    com.tencent.mm.pluginsdk.e.g(this);
    super.onCreate(paramBundle);
    this.liK = getIntent().getLongExtra("key_detail_info_id", -1L);
    this.lfg = com.tencent.mm.plugin.favorite.h.axB().cf(this.liK);
    if (this.lfg == null)
    {
      w.w("MicroMsg.FavoriteSightDetailUI", "id[%d] info is null, return", new Object[] { Long.valueOf(this.liK) });
      finish();
      GMTrace.o(6376952692736L, 47512);
      return;
    }
    v.j(this.lfg);
    this.eIc = x.n(this.lfg);
    this.liD = ((FavDetailTitleView)findViewById(R.h.byN));
    this.liE = ((FavDetailFooterView)findViewById(R.h.byM));
    this.liF = ((FavTagEntrance)findViewById(R.h.bzr));
    this.liH = ((ImageView)findViewById(R.h.cfI));
    this.liI = ((MMPinProgressBtn)findViewById(R.h.ckv));
    this.liG = findViewById(R.h.bpo);
    this.liJ = ((VideoPlayerTextureView)findViewById(R.h.ckL));
    this.lhi = ((ImageView)findViewById(R.h.ckG));
    this.liF.cx(this.lfg.field_localId);
    this.liF.aC(this.lfg.field_tagProto.ulP);
    this.liD.C(this.lfg);
    this.liE.C(this.lfg);
    this.liG.setOnClickListener(new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6400709230592L, 47689);
        if ((com.tencent.mm.p.a.aR(paramAnonymousView.getContext())) || (com.tencent.mm.p.a.aP(paramAnonymousView.getContext())))
        {
          GMTrace.o(6400709230592L, 47689);
          return;
        }
        w.i("MicroMsg.FavoriteSightDetailUI", "click item favid %d, localid %d, itemstatus %d", new Object[] { Integer.valueOf(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_id), Long.valueOf(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_localId), Integer.valueOf(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_itemStatus) });
        if (FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).isDone())
        {
          if (x.d(FavoriteSightDetailUI.b(FavoriteSightDetailUI.this)))
          {
            v.a(v.a.lbx, FavoriteSightDetailUI.a(FavoriteSightDetailUI.this));
            FavoriteSightDetailUI.a(FavoriteSightDetailUI.this, true, paramAnonymousView.getContext());
            GMTrace.o(6400709230592L, 47689);
            return;
          }
          if (bg.nm(FavoriteSightDetailUI.b(FavoriteSightDetailUI.this).ujt))
          {
            FavoriteSightDetailUI.a(FavoriteSightDetailUI.this, false, paramAnonymousView.getContext());
            GMTrace.o(6400709230592L, 47689);
            return;
          }
          w.w("MicroMsg.FavoriteSightDetailUI", "? info is done, source file not exist, cdn data url is not null");
          if (!FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).axK()) {
            break label348;
          }
          x.l(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this));
        }
        for (;;)
        {
          FavoriteSightDetailUI.a(FavoriteSightDetailUI.this, false);
          GMTrace.o(6400709230592L, 47689);
          return;
          if (FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).axL())
          {
            if (!bg.nm(FavoriteSightDetailUI.b(FavoriteSightDetailUI.this).ujt)) {
              break;
            }
            FavoriteSightDetailUI.a(FavoriteSightDetailUI.this, false, paramAnonymousView.getContext());
            GMTrace.o(6400709230592L, 47689);
            return;
          }
          if ((!FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).isDownloading()) && (!FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).axJ())) {
            break;
          }
          if (FavoriteSightDetailUI.c(FavoriteSightDetailUI.this).getVisibility() == 8) {
            FavoriteSightDetailUI.a(FavoriteSightDetailUI.this, false);
          }
          GMTrace.o(6400709230592L, 47689);
          return;
          label348:
          x.m(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this));
        }
      }
    });
    this.liJ.oTm = new f.a()
    {
      public final void Xq()
      {
        GMTrace.i(6397756440576L, 47667);
        w.i("MicroMsg.FavoriteSightDetailUI", " onPrepared");
        FavoriteSightDetailUI.d(FavoriteSightDetailUI.this);
        FavoriteSightDetailUI.b(FavoriteSightDetailUI.this, FavoriteSightDetailUI.d(FavoriteSightDetailUI.this).start());
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6386482151424L, 47583);
            FavoriteSightDetailUI.e(FavoriteSightDetailUI.this).setVisibility(8);
            GMTrace.o(6386482151424L, 47583);
          }
        });
        GMTrace.o(6397756440576L, 47667);
      }
      
      public final int bM(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(6398159093760L, 47670);
        GMTrace.o(6398159093760L, 47670);
        return 0;
      }
      
      public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(6398293311488L, 47671);
        GMTrace.o(6398293311488L, 47671);
      }
      
      public final void onCompletion()
      {
        GMTrace.i(6398024876032L, 47669);
        FavoriteSightDetailUI.d(FavoriteSightDetailUI.this).o(0.0D);
        GMTrace.o(6398024876032L, 47669);
      }
      
      public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(6397890658304L, 47668);
        w.e("MicroMsg.FavoriteSightDetailUI", "VideoPlay: on play video error what %d extra %d.", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2) });
        if (paramAnonymousInt1 == -1)
        {
          FavoriteSightDetailUI.d(FavoriteSightDetailUI.this).stop();
          if (com.tencent.mm.a.e.aZ(x.g(FavoriteSightDetailUI.b(FavoriteSightDetailUI.this))))
          {
            FavoriteSightDetailUI.f(FavoriteSightDetailUI.this);
            GMTrace.o(6397890658304L, 47668);
            return;
          }
          if (com.tencent.mm.a.e.aZ(x.h(FavoriteSightDetailUI.b(FavoriteSightDetailUI.this)))) {
            FavoriteSightDetailUI.e(FavoriteSightDetailUI.this).setVisibility(0);
          }
          GMTrace.o(6397890658304L, 47668);
          return;
        }
        if (FavoriteSightDetailUI.g(FavoriteSightDetailUI.this))
        {
          onCompletion();
          GMTrace.o(6397890658304L, 47668);
          return;
        }
        FavoriteSightDetailUI.d(FavoriteSightDetailUI.this).stop();
        if (FavoriteSightDetailUI.h(FavoriteSightDetailUI.this))
        {
          GMTrace.o(6397890658304L, 47668);
          return;
        }
        FavoriteSightDetailUI.i(FavoriteSightDetailUI.this);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6403259367424L, 47708);
            com.tencent.mm.ui.base.h.h(FavoriteSightDetailUI.this.vKB.vKW, R.l.egs, R.l.dgV);
            GMTrace.o(6403259367424L, 47708);
          }
        });
        GMTrace.o(6397890658304L, 47668);
      }
    };
    sq(getString(R.l.dsW));
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6400440795136L, 47687);
        FavoriteSightDetailUI.this.finish();
        GMTrace.o(6400440795136L, 47687);
        return true;
      }
    });
    a(0, R.l.eex, R.g.aXV, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6398830182400L, 47675);
        paramAnonymousMenuItem = new f(FavoriteSightDetailUI.this.vKB.vKW, f.xpQ, false);
        paramAnonymousMenuItem.qik = new p.c()
        {
          public final void a(n paramAnonymous2n)
          {
            GMTrace.i(6398561746944L, 47673);
            if ((FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).axH()) && (!FavoriteSightDetailUI.j(FavoriteSightDetailUI.this).g(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this)))) {}
            for (int i = 1;; i = 0)
            {
              if ((i != 0) && (FavoriteSightDetailUI.b(FavoriteSightDetailUI.this).ukB == 0)) {
                paramAnonymous2n.e(0, FavoriteSightDetailUI.this.getString(R.l.duL));
              }
              paramAnonymous2n.e(3, FavoriteSightDetailUI.this.getString(R.l.dtk));
              paramAnonymous2n.e(2, FavoriteSightDetailUI.this.vKB.vKW.getString(R.l.cSt));
              GMTrace.o(6398561746944L, 47673);
              return;
            }
          }
        };
        paramAnonymousMenuItem.qil = new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(6396951134208L, 47661);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(6396951134208L, 47661);
              return;
              com.tencent.mm.plugin.report.service.g.ork.i(10651, new Object[] { Integer.valueOf(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_type), Integer.valueOf(1), Integer.valueOf(0) });
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
              paramAnonymous2MenuItem.putExtra("scene_from", 1);
              paramAnonymous2MenuItem.putExtra("mutil_select_is_ret", true);
              paramAnonymous2MenuItem.putExtra("select_fav_local_id", FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_localId);
              d.a(FavoriteSightDetailUI.this.vKB.vKW, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 1);
              GMTrace.o(6396951134208L, 47661);
              return;
              com.tencent.mm.ui.base.h.a(FavoriteSightDetailUI.this.vKB.vKW, FavoriteSightDetailUI.this.getString(R.l.cSu), "", new DialogInterface.OnClickListener()
              {
                public final void onClick(final DialogInterface paramAnonymous3DialogInterface, int paramAnonymous3Int)
                {
                  GMTrace.i(6395072086016L, 47647);
                  paramAnonymous3DialogInterface = com.tencent.mm.ui.base.h.a(FavoriteSightDetailUI.this.vKB.vKW, FavoriteSightDetailUI.this.getString(R.l.cSu), false, null);
                  x.a(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_localId, new Runnable()
                  {
                    public final void run()
                    {
                      GMTrace.i(6385945280512L, 47579);
                      paramAnonymous3DialogInterface.dismiss();
                      w.i("MicroMsg.FavoriteSightDetailUI", "do del fav file, local id %d, fav id %d", new Object[] { Long.valueOf(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_localId), Integer.valueOf(FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_id) });
                      FavoriteSightDetailUI.this.finish();
                      GMTrace.o(6385945280512L, 47579);
                    }
                  });
                  GMTrace.o(6395072086016L, 47647);
                }
              }, null);
              GMTrace.o(6396951134208L, 47661);
              return;
              paramAnonymous2MenuItem = new Intent(FavoriteSightDetailUI.this.vKB.vKW, FavTagEditUI.class);
              paramAnonymous2MenuItem.putExtra("key_fav_scene", 2);
              paramAnonymous2MenuItem.putExtra("key_fav_item_id", FavoriteSightDetailUI.a(FavoriteSightDetailUI.this).field_localId);
              FavoriteSightDetailUI.this.vKB.vKW.startActivity(paramAnonymous2MenuItem);
            }
          }
        };
        paramAnonymousMenuItem.bFk();
        GMTrace.o(6398830182400L, 47675);
        return true;
      }
    });
    if (!com.tencent.mm.a.e.aZ(x.h(this.eIc))) {
      if (!bg.nm(this.eIc.giD)) {
        x.b(this.lfg, this.eIc, true);
      }
    }
    do
    {
      eC(false);
      com.tencent.mm.plugin.favorite.h.axB().c(this.liF);
      com.tencent.mm.plugin.favorite.h.axB().c(this);
      com.tencent.mm.plugin.favorite.h.axw().a(this);
      com.tencent.mm.pluginsdk.e.h(this);
      GMTrace.o(6376952692736L, 47512);
      return;
      paramBundle = com.tencent.mm.plugin.favorite.c.g.a(this.eIc, this.lfg);
    } while (paramBundle == null);
    int i = paramBundle.getWidth();
    int j = paramBundle.getHeight();
    DisplayMetrics localDisplayMetrics;
    float f;
    ViewGroup.LayoutParams localLayoutParams;
    if (!this.liM)
    {
      this.liM = true;
      localDisplayMetrics = this.liG.getResources().getDisplayMetrics();
      f = localDisplayMetrics.density;
      localLayoutParams = this.liG.getLayoutParams();
      if (localLayoutParams != null) {
        break label522;
      }
      w.e("MicroMsg.FavoriteSightDetailUI", "setViewResize, but params is null");
    }
    for (;;)
    {
      this.lhi.setImageBitmap(paramBundle);
      this.lhi.setVisibility(0);
      break;
      label522:
      localLayoutParams.width = (localDisplayMetrics.widthPixels - (int)(f * 36.0F + 0.5F));
      localLayoutParams.height = (j * localLayoutParams.width / i);
      this.liG.setLayoutParams(localLayoutParams);
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6377086910464L, 47513);
    if (this.liJ != null)
    {
      this.liJ.oTm = null;
      this.liJ.stop();
    }
    if (this.liF != null) {
      com.tencent.mm.plugin.favorite.h.axB().j(this.liF);
    }
    com.tencent.mm.plugin.favorite.h.axB().j(this);
    com.tencent.mm.plugin.favorite.h.axw().b(this);
    super.onDestroy();
    GMTrace.o(6377086910464L, 47513);
  }
  
  protected void onPause()
  {
    GMTrace.i(6377355345920L, 47515);
    if (this.liJ != null) {
      this.liJ.stop();
    }
    super.onPause();
    GMTrace.o(6377355345920L, 47515);
  }
  
  protected void onResume()
  {
    GMTrace.i(6377221128192L, 47514);
    super.onResume();
    if (this.liJ != null)
    {
      if (this.liL) {
        break label46;
      }
      azg();
    }
    for (;;)
    {
      this.liL = false;
      GMTrace.o(6377221128192L, 47514);
      return;
      label46:
      if (!this.liJ.isPlaying()) {
        this.liJ.start();
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\detail\FavoriteSightDetailUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */