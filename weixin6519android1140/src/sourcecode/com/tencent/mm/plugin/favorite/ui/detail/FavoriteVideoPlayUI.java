package com.tencent.mm.plugin.favorite.ui.detail;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.Bitmap.CompressFormat;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.favorite.b.r.5;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.base.FavVideoView;
import com.tencent.mm.plugin.favorite.ui.base.FavVideoView.5;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.g.b;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.io.File;
import java.util.Iterator;
import java.util.List;

@com.tencent.mm.ui.base.a(3)
public class FavoriteVideoPlayUI
  extends MMActivity
{
  private String eIy;
  private boolean eON;
  private String gKE;
  private Bundle jFK;
  private boolean jFL;
  private com.tencent.mm.ui.tools.g jFM;
  private int jFN;
  private int jFO;
  private int jFP;
  private int jFQ;
  private View.OnClickListener lgu;
  private String lhq;
  private boolean liL;
  private View.OnLongClickListener lit;
  private int ljb;
  private String ljc;
  private RelativeLayout ljd;
  private ImageView lje;
  private FavVideoView ljf;
  private LinearLayout ljg;
  private boolean ljh;
  private int lji;
  private boolean ljj;
  
  public FavoriteVideoPlayUI()
  {
    GMTrace.i(6381247660032L, 47544);
    this.liL = true;
    this.jFL = false;
    this.jFN = 0;
    this.jFO = 0;
    this.jFP = 0;
    this.jFQ = 0;
    this.ljh = true;
    this.eON = true;
    this.ljj = false;
    this.lhq = "";
    this.lgu = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(6409299165184L, 47753);
        FavoriteVideoPlayUI.this.alL();
        GMTrace.o(6409299165184L, 47753);
      }
    };
    this.lit = new View.OnLongClickListener()
    {
      public final boolean onLongClick(View paramAnonymousView)
      {
        GMTrace.i(6391850860544L, 47623);
        paramAnonymousView.getTag();
        paramAnonymousView = new l(FavoriteVideoPlayUI.this.vKB.vKW);
        paramAnonymousView.qik = new p.c()
        {
          public final void a(n paramAnonymous2n)
          {
            GMTrace.i(6403527802880L, 47710);
            if (FavoriteVideoPlayUI.a(FavoriteVideoPlayUI.this))
            {
              if (com.tencent.mm.a.e.aZ(FavoriteVideoPlayUI.b(FavoriteVideoPlayUI.this))) {
                paramAnonymous2n.add(0, 1, 0, FavoriteVideoPlayUI.this.getString(R.l.duL));
              }
              paramAnonymous2n.add(0, 2, 0, FavoriteVideoPlayUI.this.getString(R.l.dgn));
            }
            GMTrace.o(6403527802880L, 47710);
          }
        };
        paramAnonymousView.qil = new p.d()
        {
          public final void c(MenuItem paramAnonymous2MenuItem, int paramAnonymous2Int)
          {
            GMTrace.i(6380576571392L, 47539);
            switch (paramAnonymous2MenuItem.getItemId())
            {
            }
            for (;;)
            {
              GMTrace.o(6380576571392L, 47539);
              return;
              paramAnonymous2MenuItem = new Intent();
              paramAnonymous2MenuItem.putExtra("Select_Conv_Type", 3);
              paramAnonymous2MenuItem.putExtra("select_is_ret", true);
              paramAnonymous2MenuItem.putExtra("mutil_select_is_ret", true);
              if (com.tencent.mm.a.e.aZ(FavoriteVideoPlayUI.b(FavoriteVideoPlayUI.this))) {
                paramAnonymous2MenuItem.putExtra("image_path", FavoriteVideoPlayUI.b(FavoriteVideoPlayUI.this));
              }
              for (;;)
              {
                paramAnonymous2MenuItem.putExtra("Retr_Msg_Type", 1);
                com.tencent.mm.bj.d.a(FavoriteVideoPlayUI.this.vKB.vKW, ".ui.transmit.SelectConversationUI", paramAnonymous2MenuItem, 1);
                if (FavoriteVideoPlayUI.d(FavoriteVideoPlayUI.this) != 0) {
                  break;
                }
                com.tencent.mm.plugin.report.service.g.ork.i(10651, new Object[] { Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(0) });
                GMTrace.o(6380576571392L, 47539);
                return;
                paramAnonymous2MenuItem.putExtra("image_path", FavoriteVideoPlayUI.c(FavoriteVideoPlayUI.this));
              }
              x.e(FavoriteVideoPlayUI.c(FavoriteVideoPlayUI.this), FavoriteVideoPlayUI.this);
            }
          }
        };
        paramAnonymousView.bpI();
        GMTrace.o(6391850860544L, 47623);
        return true;
      }
    };
    GMTrace.o(6381247660032L, 47544);
  }
  
  private void b(ImageView paramImageView)
  {
    GMTrace.i(16934116524032L, 126169);
    FavVideoView localFavVideoView = this.ljf;
    String str1 = this.gKE;
    boolean bool = this.ljj;
    String str2 = this.lhq;
    localFavVideoView.gKE = str1;
    if (bool)
    {
      localFavVideoView.jFJ.post(new FavVideoView.5(localFavVideoView));
      localFavVideoView.lhq = str2;
    }
    if (paramImageView != null)
    {
      if (!com.tencent.mm.a.e.aZ(this.eIy)) {
        break label104;
      }
      paramImageView.setImageBitmap(BackwardSupportUtil.b.c(this.eIy, 1.0F));
    }
    for (;;)
    {
      w.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: fullPath is not null,but not exist videoView.setVideoData(null)");
      GMTrace.o(16934116524032L, 126169);
      return;
      label104:
      paramImageView.setImageResource(R.g.aVt);
    }
  }
  
  public final void alL()
  {
    GMTrace.i(6382455619584L, 47553);
    this.ljg.setVisibility(8);
    int k = this.ljd.getWidth();
    int j = this.ljd.getHeight();
    int i = j;
    if (this.jFP != 0)
    {
      i = j;
      if (this.jFQ != 0) {
        i = (int)(k / this.jFP * this.jFQ);
      }
    }
    this.jFM.eC(k, i);
    this.jFM.p(this.jFO, this.jFN, this.jFP, this.jFQ);
    this.jFM.a(this.ljf, this.lje, new g.b()
    {
      public final void onAnimationEnd()
      {
        GMTrace.i(6391313989632L, 47619);
        new ae().post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6384066232320L, 47565);
            FavoriteVideoPlayUI.this.finish();
            FavoriteVideoPlayUI.this.overridePendingTransition(0, 0);
            GMTrace.o(6384066232320L, 47565);
          }
        });
        GMTrace.o(6391313989632L, 47619);
      }
      
      public final void onAnimationStart()
      {
        GMTrace.i(6391179771904L, 47618);
        GMTrace.o(6391179771904L, 47618);
      }
    }, null);
    GMTrace.o(6382455619584L, 47553);
  }
  
  public boolean dispatchKeyEvent(KeyEvent paramKeyEvent)
  {
    GMTrace.i(6382187184128L, 47551);
    boolean bool = super.dispatchKeyEvent(paramKeyEvent);
    GMTrace.o(6382187184128L, 47551);
    return bool;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6381516095488L, 47546);
    int i = R.i.cwO;
    GMTrace.o(6381516095488L, 47546);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6382321401856L, 47552);
    if ((paramInt1 == 1) && (-1 == paramInt2))
    {
      if (paramIntent == null)
      {
        localObject = null;
        if (paramIntent != null) {
          break label91;
        }
      }
      Runnable local3;
      label91:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        local3 = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6381113442304L, 47543);
            this.lea.dismiss();
            GMTrace.o(6381113442304L, 47543);
          }
        };
        if (!bg.nm((String)localObject)) {
          break label102;
        }
        GMTrace.o(6382321401856L, 47552);
        return;
        localObject = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
      label102:
      Object localObject = bg.g(((String)localObject).split(",")).iterator();
      label301:
      while (((Iterator)localObject).hasNext())
      {
        String str1 = (String)((Iterator)localObject).next();
        ActionBarActivity localActionBarActivity = this.vKB.vKW;
        String str2 = this.gKE;
        String str3 = this.eIy;
        paramInt1 = this.ljb;
        String str4 = this.ljc;
        if (localActionBarActivity == null) {
          w.w("MicroMsg.FavSendLogic", "want to send fav video, but context is null");
        }
        for (;;)
        {
          if (bg.nm(paramIntent)) {
            break label301;
          }
          com.tencent.mm.plugin.messenger.a.d.aOe().A(str1, paramIntent, s.go(str1));
          break;
          if (bg.nm(str1))
          {
            w.w("MicroMsg.FavSendLogic", "want to send fav video, but to user is null");
          }
          else
          {
            File localFile = new File(str2);
            if ((bg.nm(str2)) && (!localFile.exists())) {
              w.w("MicroMsg.FavSendLogic", "want to send fav video, but datapath is null or is not exist ");
            } else {
              at.xB().A(new r.5(localActionBarActivity, str1, str2, str3, paramInt1, str4, local3));
            }
          }
        }
      }
      com.tencent.mm.ui.snackbar.a.e(this, getString(R.l.dwg));
      GMTrace.o(6382321401856L, 47552);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6382321401856L, 47552);
  }
  
  public void onBackPressed()
  {
    GMTrace.i(6382589837312L, 47554);
    alL();
    GMTrace.o(6382589837312L, 47554);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6381381877760L, 47545);
    super.onCreate(paramBundle);
    this.vKB.bXF();
    if (com.tencent.mm.compatible.util.d.et(19)) {
      getWindow().setFlags(201327616, 201327616);
    }
    for (;;)
    {
      this.jFK = paramBundle;
      getWindow().addFlags(128);
      this.ljh = getIntent().getBooleanExtra("key_detail_data_valid", true);
      this.gKE = getIntent().getStringExtra("key_detail_fav_path");
      this.eIy = getIntent().getStringExtra("key_detail_fav_thumb_path");
      this.ljb = getIntent().getIntExtra("key_detail_fav_video_duration", 0);
      this.ljc = getIntent().getStringExtra("key_detail_statExtStr");
      this.lji = getIntent().getIntExtra("key_detail_fav_video_scene_from", 0);
      this.eON = getIntent().getBooleanExtra("show_share", true);
      this.ljj = getIntent().getBooleanExtra("key_detail_fav_video_show_download_status", false);
      this.lhq = getIntent().getStringExtra("key_detail_data_id");
      if (!com.tencent.mm.a.e.aZ(this.eIy))
      {
        paramBundle = com.tencent.mm.pluginsdk.model.c.Oi(this.gKE);
        if (paramBundle == null) {}
      }
      try
      {
        w.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: create thumbpath bitmap, saveBitmapToImage ");
        com.tencent.mm.pluginsdk.l.e.a(paramBundle, Bitmap.CompressFormat.JPEG, this.eIy);
        boolean bool = this.ljh;
        if (bg.nm(this.eIy))
        {
          paramBundle = "";
          if (!bg.nm(this.gKE)) {
            break label522;
          }
          str = "";
          w.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay: init data, isVideoValid: %B. thumbPath: %s, fullPath: %s", new Object[] { Boolean.valueOf(bool), paramBundle, str });
          this.ljd = ((RelativeLayout)findViewById(R.h.ckK));
          this.ljf = ((FavVideoView)findViewById(R.h.ckL));
          paramBundle = (ImageView)findViewById(R.h.ckG);
          this.lje = ((ImageView)findViewById(R.h.bCu));
          this.ljg = ((LinearLayout)findViewById(R.h.byS));
          if ((!this.ljh) && (this.ljg != null)) {
            this.ljg.setVisibility(0);
          }
          if (this.lje != null) {
            this.lje.setLayerType(2, null);
          }
          if (bg.nm(this.gKE)) {
            break label538;
          }
          if (!FileOp.aZ(this.gKE)) {
            break label530;
          }
          this.ljf.gKE = this.gKE;
          w.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  videoView.setVideoData(fullPath)");
          this.ljf.setOnClickListener(this.lgu);
          if (this.eON) {
            this.ljf.setOnLongClickListener(this.lit);
          }
          this.jFM = new com.tencent.mm.ui.tools.g(null);
          GMTrace.o(6381381877760L, 47545);
          return;
          getWindow().setFlags(1024, 1024);
        }
      }
      catch (Exception paramBundle)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.FavoriteVideoPlayUI", paramBundle, "", new Object[0]);
          continue;
          paramBundle = this.eIy;
          continue;
          label522:
          String str = this.gKE;
          continue;
          label530:
          b(paramBundle);
          continue;
          label538:
          b(paramBundle);
        }
      }
    }
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6382052966400L, 47550);
    FavVideoView localFavVideoView = this.ljf;
    w.i("MicroMsg.FavVideoView", "VideoPlay:   onDestroy()");
    localFavVideoView.jGP.stop();
    com.tencent.mm.sdk.b.a.vgX.c(localFavVideoView.lhs);
    getWindow().clearFlags(128);
    super.onDestroy();
    GMTrace.o(6382052966400L, 47550);
  }
  
  protected void onPause()
  {
    GMTrace.i(6381918748672L, 47549);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(2048, 2048);
    }
    FavVideoView localFavVideoView = this.ljf;
    w.i("MicroMsg.FavVideoView", "VideoPlay:   onPause()");
    if (localFavVideoView.jGP.isPlaying())
    {
      w.i("MicroMsg.FavVideoView", "VideoPlay: pausePlay()");
      localFavVideoView.jGP.pause();
    }
    super.onPause();
    GMTrace.o(6381918748672L, 47549);
  }
  
  protected void onResume()
  {
    GMTrace.i(6381784530944L, 47548);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().clearFlags(2048);
    }
    w.i("MicroMsg.FavoriteVideoPlayUI", "VideoPlay:  onResume,hadOnStart is %B", new Object[] { Boolean.valueOf(this.liL) });
    if (!this.liL) {
      this.ljf.onResume();
    }
    this.liL = false;
    super.onResume();
    GMTrace.o(6381784530944L, 47548);
  }
  
  public void onStart()
  {
    GMTrace.i(6381650313216L, 47547);
    Bundle localBundle = this.jFK;
    if (!this.jFL)
    {
      this.jFL = true;
      if (Build.VERSION.SDK_INT >= 12)
      {
        this.jFN = getIntent().getIntExtra("img_gallery_top", 0);
        this.jFO = getIntent().getIntExtra("img_gallery_left", 0);
        this.jFP = getIntent().getIntExtra("img_gallery_width", 0);
        this.jFQ = getIntent().getIntExtra("img_gallery_height", 0);
        this.jFM.p(this.jFO, this.jFN, this.jFP, this.jFQ);
        if (localBundle == null) {
          this.ljf.getViewTreeObserver().addOnPreDrawListener(new ViewTreeObserver.OnPreDrawListener()
          {
            public final boolean onPreDraw()
            {
              GMTrace.i(6387287457792L, 47589);
              FavoriteVideoPlayUI.e(FavoriteVideoPlayUI.this).getViewTreeObserver().removeOnPreDrawListener(this);
              FavoriteVideoPlayUI.g(FavoriteVideoPlayUI.this).a(FavoriteVideoPlayUI.e(FavoriteVideoPlayUI.this), FavoriteVideoPlayUI.f(FavoriteVideoPlayUI.this), new g.b()
              {
                public final void onAnimationEnd()
                {
                  GMTrace.i(6411715084288L, 47771);
                  GMTrace.o(6411715084288L, 47771);
                }
                
                public final void onAnimationStart()
                {
                  GMTrace.i(6411580866560L, 47770);
                  if (FavoriteVideoPlayUI.e(FavoriteVideoPlayUI.this) != null) {
                    FavoriteVideoPlayUI.e(FavoriteVideoPlayUI.this).onResume();
                  }
                  GMTrace.o(6411580866560L, 47770);
                }
              });
              GMTrace.o(6387287457792L, 47589);
              return true;
            }
          });
        }
      }
    }
    super.onStart();
    GMTrace.o(6381650313216L, 47547);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\detail\FavoriteVideoPlayUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */