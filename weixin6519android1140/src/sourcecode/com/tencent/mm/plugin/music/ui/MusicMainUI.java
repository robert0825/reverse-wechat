package com.tencent.mm.plugin.music.ui;

import android.content.Intent;
import android.graphics.PorterDuff.Mode;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Looper;
import android.support.v4.view.ViewPager.e;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.fu;
import com.tencent.mm.g.a.fu.a;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.g.a.jn.a;
import com.tencent.mm.plugin.music.a.d;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.t;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.mogic.WxViewPager;
import com.tencent.mm.ui.p;
import com.tencent.mm.y.at;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;
import java.util.Timer;
import java.util.TimerTask;

@com.tencent.mm.ui.base.a(19)
public class MusicMainUI
  extends MMActivity
  implements ViewPager.e, com.tencent.mm.ad.e
{
  private ae fLm;
  private com.tencent.mm.sdk.b.c ian;
  private long jrk;
  private int mode;
  private com.tencent.mm.plugin.music.a.f.c.a nqF;
  private boolean nru;
  private CheckBox nsZ;
  private ImageButton nta;
  private ImageButton ntb;
  private MusicViewPager ntc;
  private com.tencent.mm.pluginsdk.l.c ntd;
  private b nte;
  private boolean ntf;
  private int ntg;
  private Timer nth;
  private int nti;
  private int scene;
  
  public MusicMainUI()
  {
    GMTrace.i(4875324751872L, 36324);
    this.ntg = 0;
    this.ian = new com.tencent.mm.sdk.b.c() {};
    this.fLm = new ae(Looper.getMainLooper());
    this.nti = -1;
    this.nqF = new com.tencent.mm.plugin.music.a.f.c.a()
    {
      public final void bP(int paramAnonymousInt1, int paramAnonymousInt2)
      {
        GMTrace.i(15030640705536L, 111987);
        if ((MusicMainUI.l(MusicMainUI.this) == 1) && (!MusicMainUI.m(MusicMainUI.this)))
        {
          float f = MusicMainUI.this.getIntent().getFloatExtra("key_offset", 0.0F);
          long l = MusicMainUI.this.getIntent().getLongExtra("music_player_beg_time", 0L);
          l = (f * 1000.0F + (float)(System.currentTimeMillis() - l));
          if (l >= 0L) {
            MusicMainUI.h(MusicMainUI.this).B(MusicMainUI.i(MusicMainUI.this).xI, l + 200L);
          }
          GMTrace.o(15030640705536L, 111987);
          return;
        }
        if ((paramAnonymousInt1 >= 0) && (paramAnonymousInt2 > 0)) {
          MusicMainUI.h(MusicMainUI.this).B(MusicMainUI.i(MusicMainUI.this).xI, paramAnonymousInt1);
        }
        GMTrace.o(15030640705536L, 111987);
      }
    };
    GMTrace.o(4875324751872L, 36324);
  }
  
  public static void aTA()
  {
    GMTrace.i(4877606453248L, 36341);
    com.tencent.mm.plugin.music.a.h.aSs().aSk().a(null);
    GMTrace.o(4877606453248L, 36341);
  }
  
  private void aTx()
  {
    GMTrace.i(4875995840512L, 36329);
    com.tencent.mm.plugin.music.a.h.aSs();
    this.nte.count = 200000;
    this.nte.notifyDataSetChanged();
    if (com.tencent.mm.plugin.music.a.h.aSs().aSm())
    {
      this.ntc.CR = true;
      GMTrace.o(4875995840512L, 36329);
      return;
    }
    this.ntc.CR = false;
    GMTrace.o(4875995840512L, 36329);
  }
  
  private void aTy()
  {
    GMTrace.i(4876130058240L, 36330);
    if (this.nth != null) {
      this.nth.cancel();
    }
    this.nth = null;
    GMTrace.o(4876130058240L, 36330);
  }
  
  private void h(com.tencent.mm.at.a parama)
  {
    GMTrace.i(4876935364608L, 36336);
    if ((com.tencent.mm.plugin.music.a.g.b(parama)) && (!this.nru))
    {
      this.nsZ.setVisibility(0);
      this.ntb.setVisibility(0);
      GMTrace.o(4876935364608L, 36336);
      return;
    }
    this.nsZ.setVisibility(8);
    this.ntb.setVisibility(8);
    GMTrace.o(4876935364608L, 36336);
  }
  
  public final void V(int paramInt)
  {
    GMTrace.i(4877069582336L, 36337);
    w.i("MicroMsg.Music.MusicMainUI", "onPageSelected %d", new Object[] { Integer.valueOf(paramInt) });
    if (com.tencent.mm.plugin.music.a.h.aSs().aSm()) {
      this.ntc.CR = false;
    }
    this.fLm.removeCallbacksAndMessages(null);
    this.fLm.postDelayed(new a(paramInt), 500L);
    if (this.nti == -1) {
      this.nti = paramInt;
    }
    if (this.nti != paramInt)
    {
      this.nti = paramInt;
      com.tencent.mm.plugin.music.a.f.npT = true;
      com.tencent.mm.plugin.report.service.g.ork.a(285L, 3L, 1L, false);
      com.tencent.mm.plugin.music.a.f.cz(1, this.scene);
    }
    GMTrace.o(4877069582336L, 36337);
  }
  
  public final void W(int paramInt)
  {
    GMTrace.i(4877203800064L, 36338);
    GMTrace.o(4877203800064L, 36338);
  }
  
  public final void a(int paramInt1, float paramFloat, int paramInt2)
  {
    GMTrace.i(4876801146880L, 36335);
    GMTrace.o(4876801146880L, 36335);
  }
  
  public final void a(int paramInt1, int paramInt2, String paramString, com.tencent.mm.ad.k paramk)
  {
    GMTrace.i(4875593187328L, 36326);
    GMTrace.o(4875593187328L, 36326);
  }
  
  public final void aTz()
  {
    GMTrace.i(4877472235520L, 36340);
    com.tencent.mm.plugin.music.a.h.aSs().aSk().a(this.nqF);
    GMTrace.o(4877472235520L, 36340);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(4876666929152L, 36334);
    int i = R.i.cCH;
    GMTrace.o(4876666929152L, 36334);
    return i;
  }
  
  public final void i(com.tencent.mm.at.a parama)
  {
    GMTrace.i(4877740670976L, 36342);
    com.tencent.mm.at.a locala = com.tencent.mm.plugin.music.a.h.aSs().aSi();
    if (locala == null)
    {
      GMTrace.o(4877740670976L, 36342);
      return;
    }
    if ((locala.a(parama)) && (this.ntb != null) && (this.nta != null) && (this.nsZ != null) && (this.ntb.getBackground() != null) && (this.nta.getBackground() != null) && (this.nsZ.getBackground() != null))
    {
      if (parama.JL())
      {
        int i = parama.field_songLyricColor;
        this.ntb.getBackground().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        this.nta.getBackground().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        this.nsZ.getBackground().setColorFilter(i, PorterDuff.Mode.MULTIPLY);
        GMTrace.o(4877740670976L, 36342);
        return;
      }
      this.ntb.getBackground().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
      this.nta.getBackground().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
      this.nsZ.getBackground().setColorFilter(-1, PorterDuff.Mode.MULTIPLY);
    }
    GMTrace.o(4877740670976L, 36342);
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(4877338017792L, 36339);
    if ((-1 == paramInt2) && (1 == paramInt1))
    {
      com.tencent.mm.plugin.music.a.g.a(com.tencent.mm.plugin.music.a.h.aSs().aSj(), paramIntent, this);
      GMTrace.o(4877338017792L, 36339);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(4877338017792L, 36339);
  }
  
  public void onClickBack(View paramView)
  {
    GMTrace.i(4876398493696L, 36332);
    finish();
    GMTrace.o(4876398493696L, 36332);
  }
  
  public void onClickSend(View paramView)
  {
    GMTrace.i(4876532711424L, 36333);
    final Object localObject2 = com.tencent.mm.plugin.music.a.h.aSs().aSj();
    w.i("MicroMsg.Music.MusicMainUI", "MusicType:%d, SongWebUrl ", new Object[] { Integer.valueOf(((apv)localObject2).uFq), ((apv)localObject2).uFy });
    final String str1;
    Object localObject1;
    final String str2;
    Object localObject3;
    if (((apv)localObject2).uFq == 11)
    {
      paramView = new fu();
      com.tencent.mm.sdk.b.a.vgX.m(paramView);
      str1 = paramView.eIG.appId;
      localObject1 = paramView.eIG.eEs;
      str2 = paramView.eIG.eIH;
      final int i = paramView.eIG.eII;
      paramView = (View)localObject1;
      if (TextUtils.isEmpty((CharSequence)localObject1)) {
        paramView = "";
      }
      w.i("MicroMsg.Music.MusicMainUI", "from app brand, appId:%s, brandName:%s, pkgType:%d, appUserName:%s", new Object[] { str1, paramView, Integer.valueOf(i), str2 });
      paramView = getString(R.l.dBm, new Object[] { paramView });
      if (!TextUtils.isEmpty(((apv)localObject2).uFy))
      {
        ArrayList localArrayList = new ArrayList();
        localObject1 = getString(R.l.eln);
        localObject3 = getString(R.l.elo);
        String str3 = getString(R.l.dfl);
        localArrayList.add(Integer.valueOf(0));
        localArrayList.add(Integer.valueOf(1));
        localArrayList.add(Integer.valueOf(2));
        localArrayList.add(Integer.valueOf(3));
        localObject2 = new h.c()
        {
          public final void hQ(int paramAnonymousInt)
          {
            GMTrace.i(4870358695936L, 36287);
            switch (paramAnonymousInt)
            {
            }
            for (;;)
            {
              GMTrace.o(4870358695936L, 36287);
              return;
              com.tencent.mm.plugin.music.a.g.z(MusicMainUI.this);
              com.tencent.mm.plugin.music.a.f.rj(MusicMainUI.g(MusicMainUI.this));
              com.tencent.mm.plugin.music.a.f.rm(2);
              GMTrace.o(4870358695936L, 36287);
              return;
              com.tencent.mm.plugin.music.a.g.c(localObject2, MusicMainUI.this);
              com.tencent.mm.plugin.music.a.f.rk(MusicMainUI.g(MusicMainUI.this));
              com.tencent.mm.plugin.music.a.f.rm(1);
              GMTrace.o(4870358695936L, 36287);
              return;
              com.tencent.mm.plugin.music.a.g.a(localObject2, MusicMainUI.this);
              com.tencent.mm.plugin.music.a.f.rm(3);
              GMTrace.o(4870358695936L, 36287);
              return;
              com.tencent.mm.plugin.music.a.g.C(str1, str2, i);
            }
          }
        };
        com.tencent.mm.ui.base.h.a(this, "", new String[] { localObject1, localObject3, str3, paramView }, "", (h.c)localObject2);
        GMTrace.o(4876532711424L, 36333);
        return;
      }
      new ArrayList().add(Integer.valueOf(0));
      localObject1 = new h.c()
      {
        public final void hQ(int paramAnonymousInt)
        {
          GMTrace.i(15030238052352L, 111984);
          switch (paramAnonymousInt)
          {
          }
          for (;;)
          {
            GMTrace.o(15030238052352L, 111984);
            return;
            com.tencent.mm.plugin.music.a.g.C(str1, str2, i);
          }
        }
      };
      com.tencent.mm.ui.base.h.a(this, "", new String[] { paramView }, "", (h.c)localObject1);
      GMTrace.o(4876532711424L, 36333);
      return;
    }
    if (!TextUtils.isEmpty(((apv)localObject2).uFy))
    {
      localObject3 = new ArrayList();
      paramView = getString(R.l.eln);
      localObject1 = getString(R.l.elo);
      str1 = getString(R.l.dfl);
      str2 = getString(R.l.dsP);
      ((List)localObject3).add(Integer.valueOf(0));
      ((List)localObject3).add(Integer.valueOf(1));
      ((List)localObject3).add(Integer.valueOf(2));
      ((List)localObject3).add(Integer.valueOf(3));
      localObject2 = new h.c()
      {
        public final void hQ(int paramAnonymousInt)
        {
          GMTrace.i(15029835399168L, 111981);
          switch (paramAnonymousInt)
          {
          }
          for (;;)
          {
            GMTrace.o(15029835399168L, 111981);
            return;
            com.tencent.mm.plugin.music.a.g.z(MusicMainUI.this);
            com.tencent.mm.plugin.music.a.f.rj(MusicMainUI.g(MusicMainUI.this));
            com.tencent.mm.plugin.music.a.f.rm(2);
            GMTrace.o(15029835399168L, 111981);
            return;
            com.tencent.mm.plugin.music.a.g.c(localObject2, MusicMainUI.this);
            com.tencent.mm.plugin.music.a.f.rk(MusicMainUI.g(MusicMainUI.this));
            com.tencent.mm.plugin.music.a.f.rm(1);
            GMTrace.o(15029835399168L, 111981);
            return;
            com.tencent.mm.plugin.music.a.g.a(localObject2, MusicMainUI.this);
            com.tencent.mm.plugin.music.a.f.rm(3);
            GMTrace.o(15029835399168L, 111981);
            return;
            com.tencent.mm.plugin.music.a.g.b(localObject2, MusicMainUI.this);
            com.tencent.mm.plugin.music.a.f.rm(4);
          }
        }
      };
      com.tencent.mm.ui.base.h.a(this, "", new String[] { paramView, localObject1, str1, str2 }, "", (h.c)localObject2);
    }
    GMTrace.o(4876532711424L, 36333);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(4875458969600L, 36325);
    super.onCreate(paramBundle);
    this.vKB.bXF();
    this.mode = getIntent().getIntExtra("key_mode", 2);
    this.scene = getIntent().getIntExtra("key_scene", 0);
    this.nru = getIntent().getBooleanExtra("KGlobalShakeMusic", false);
    this.ntc = ((MusicViewPager)findViewById(R.h.ckU));
    this.nte = new b(this, this.scene, this.nru);
    this.ntc.a(this.nte);
    this.ntc.b(this);
    this.ntc.setSystemUiVisibility(4096);
    this.nta = ((ImageButton)findViewById(R.h.bfv));
    this.ntb = ((ImageButton)findViewById(R.h.ccc));
    this.nsZ = ((CheckBox)findViewById(R.h.bPf));
    paramBundle = this.nsZ;
    if (!com.tencent.mm.plugin.music.a.h.aSs().aSk().JQ()) {}
    int i;
    for (boolean bool = true;; bool = false)
    {
      paramBundle.setChecked(bool);
      this.ntd = new com.tencent.mm.pluginsdk.l.c(this);
      this.nsZ.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(4871164002304L, 36293);
          MusicMainUI.a(MusicMainUI.this);
          if (MusicMainUI.b(MusicMainUI.this).isChecked())
          {
            com.tencent.mm.at.b.so();
            MusicMainUI.b(MusicMainUI.this).setChecked(true);
            MusicMainUI.aTA();
            GMTrace.o(4871164002304L, 36293);
            return;
          }
          MusicMainUI.c(MusicMainUI.this);
          if (com.tencent.mm.plugin.music.a.h.aSs().aSk().JR()) {
            com.tencent.mm.plugin.music.a.h.aSs().aSk().resume();
          }
          for (;;)
          {
            MusicMainUI.this.aTz();
            MusicMainUI.b(MusicMainUI.this).setChecked(false);
            GMTrace.o(4871164002304L, 36293);
            return;
            com.tencent.mm.plugin.music.a.h.aSs().e(null);
          }
        }
      });
      com.tencent.mm.sdk.b.a.vgX.b(this.ian);
      if (!this.ntd.bKz()) {
        w.w("MicroMsg.Music.MusicMainUI", "not support shake");
      }
      aTx();
      this.ntc.Y(100000 + com.tencent.mm.plugin.music.a.h.aSs().npJ);
      aTz();
      i = this.scene;
      paramBundle = com.tencent.mm.plugin.music.a.h.aSs().aSi();
      if (paramBundle != null)
      {
        w.v("MicroMsg.Music.MusicReportUtil", "kvReportEnterMusicUI: %d, %d, %s, %s, %s, %s, %s, %s", new Object[] { Integer.valueOf(13041), Integer.valueOf(i), paramBundle.field_musicId, paramBundle.field_songName, paramBundle.field_songAlbum, Integer.valueOf(paramBundle.field_songId), paramBundle.field_songSinger, paramBundle.field_appId });
        com.tencent.mm.plugin.report.service.g.ork.i(13041, new Object[] { Integer.valueOf(i), paramBundle.field_musicId, paramBundle.field_songName, paramBundle.field_songAlbum, Integer.valueOf(paramBundle.field_songId), paramBundle.field_songSinger, paramBundle.field_appId });
      }
      com.tencent.mm.plugin.report.service.g.ork.a(285L, 1L, 1L, false);
      paramBundle = com.tencent.mm.plugin.music.a.h.aSs().aSi();
      if (paramBundle != null) {
        break;
      }
      finish();
      GMTrace.o(4875458969600L, 36325);
      return;
    }
    if ((this.scene == 4) && (com.tencent.mm.plugin.music.a.h.aSs().mode == 2))
    {
      at.AR();
      i = com.tencent.mm.y.c.xh().getInt(83, 0);
      if (i < 3)
      {
        Toast.makeText(this, R.l.dyD, 0).show();
        at.AR();
        com.tencent.mm.y.c.xh().set(83, Integer.valueOf(i + 1));
      }
    }
    h(paramBundle);
    if (this.mode == 1)
    {
      if (this.nth == null) {
        this.nth = new Timer();
      }
      this.nth.schedule(new TimerTask()
      {
        public final void run()
        {
          GMTrace.i(4870627131392L, 36289);
          MusicMainUI.k(MusicMainUI.this).bP(0, 0);
          GMTrace.o(4870627131392L, 36289);
        }
      }, 0L, 500L);
    }
    GMTrace.o(4875458969600L, 36325);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(4876264275968L, 36331);
    super.onDestroy();
    if (this.ntd != null) {
      this.ntd.aFd();
    }
    if (this.nte != null)
    {
      localObject = this.nte;
      ((b)localObject).npF.removeCallbacksAndMessages(null);
      localObject = ((b)localObject).nsH;
      ((d)localObject).npF.removeCallbacksAndMessages(null);
      ((d)localObject).fKi.clear();
    }
    aTy();
    com.tencent.mm.sdk.b.a.vgX.c(this.ian);
    aTA();
    if (!com.tencent.mm.plugin.music.a.h.aSs().aSk().JQ()) {
      com.tencent.mm.plugin.music.a.h.aSs().aSk().ahO();
    }
    Object localObject = com.tencent.mm.plugin.music.a.h.aSs();
    if ((!((com.tencent.mm.plugin.music.a.e)localObject).npL.JQ()) && (!((com.tencent.mm.plugin.music.a.e)localObject).npM.JQ()))
    {
      w.i("MicroMsg.Music.MusicPlayerManager", "really exit music");
      ((com.tencent.mm.plugin.music.a.e)localObject).mode = 1;
    }
    GMTrace.o(4876264275968L, 36331);
  }
  
  protected void onPause()
  {
    GMTrace.i(4875861622784L, 36328);
    super.onPause();
    if (this.ntd != null) {
      this.ntd.aFd();
    }
    GMTrace.o(4875861622784L, 36328);
  }
  
  protected void onResume()
  {
    GMTrace.i(4875727405056L, 36327);
    super.onResume();
    com.tencent.mm.at.a locala = com.tencent.mm.plugin.music.a.h.aSs().aSi();
    if (locala != null) {
      switch (locala.field_musicType)
      {
      }
    }
    for (int i = 0; i != 0; i = 1)
    {
      if (this.nru) {
        break label173;
      }
      if ((this.ntd != null) && (this.ntd.bKz()) && (!this.ntd.bKx())) {
        this.ntd.a(new b());
      }
      this.jrk = bg.Pw();
      GMTrace.o(4875727405056L, 36327);
      return;
    }
    w.i("MicroMsg.Music.MusicMainUI", "no need to shake music");
    com.tencent.mm.plugin.music.a.h.aSs().mode = 1;
    label173:
    GMTrace.o(4875727405056L, 36327);
  }
  
  private final class a
    implements Runnable
  {
    int position;
    
    public a(int paramInt)
    {
      GMTrace.i(4875056316416L, 36322);
      this.position = paramInt;
      GMTrace.o(4875056316416L, 36322);
    }
    
    public final void run()
    {
      GMTrace.i(4875190534144L, 36323);
      Object localObject = com.tencent.mm.plugin.music.a.h.aSs();
      int i = this.position;
      if (((com.tencent.mm.plugin.music.a.e)localObject).npK.size() != 0)
      {
        int j = (i - 100000) % ((com.tencent.mm.plugin.music.a.e)localObject).npK.size();
        i = j;
        if (j < 0) {
          i = j + ((com.tencent.mm.plugin.music.a.e)localObject).npK.size();
        }
        if (i != ((com.tencent.mm.plugin.music.a.e)localObject).npJ)
        {
          ((com.tencent.mm.plugin.music.a.e)localObject).npJ = i;
          ((com.tencent.mm.plugin.music.a.e)localObject).e(null);
        }
      }
      localObject = com.tencent.mm.plugin.music.a.h.aSs().aSi();
      if (localObject == null)
      {
        GMTrace.o(4875190534144L, 36323);
        return;
      }
      if (((com.tencent.mm.at.a)localObject).JL()) {
        MusicMainUI.this.i((com.tencent.mm.at.a)localObject);
      }
      if (com.tencent.mm.plugin.music.a.h.aSs().aSm()) {
        MusicMainUI.i(MusicMainUI.this).CR = true;
      }
      MusicMainUI.a(MusicMainUI.this, (com.tencent.mm.at.a)localObject);
      GMTrace.o(4875190534144L, 36323);
    }
  }
  
  private final class b
    extends com.tencent.mm.pluginsdk.l.c.a
  {
    public b()
    {
      GMTrace.i(4869150736384L, 36278);
      GMTrace.o(4869150736384L, 36278);
    }
    
    public final void aTB()
    {
      GMTrace.i(4869284954112L, 36279);
      w.i("MicroMsg.Music.MusicMainUI", "shake %b", new Object[] { Boolean.valueOf(true) });
      long l = bg.aI(MusicMainUI.d(MusicMainUI.this));
      if (l < 1200L)
      {
        w.i("MicroMsg.Music.MusicMainUI", "tryStartShake delay too short:" + l);
        GMTrace.o(4869284954112L, 36279);
        return;
      }
      w.w("MicroMsg.Music.MusicMainUI", "tryStartShake delay too enough:" + l);
      MusicMainUI.a(MusicMainUI.this, bg.Pw());
      MusicMainUI.e(MusicMainUI.this);
      if (MusicMainUI.f(MusicMainUI.this) % 2 == 0)
      {
        Object localObject = com.tencent.mm.plugin.music.a.h.aSs();
        int i = MusicMainUI.g(MusicMainUI.this);
        com.tencent.mm.plugin.report.service.g.ork.a(285L, 2L, 1L, false);
        if (((com.tencent.mm.plugin.music.a.e)localObject).mode == 1)
        {
          if (((com.tencent.mm.plugin.music.a.e)localObject).npP)
          {
            w.i("MicroMsg.Music.MusicPlayerManager", "already running get list");
            GMTrace.o(4869284954112L, 36279);
            return;
          }
          ((com.tencent.mm.plugin.music.a.e)localObject).mode = 2;
          if (((com.tencent.mm.plugin.music.a.e)localObject).npK.size() <= 1) {
            ((com.tencent.mm.plugin.music.a.e)localObject).aSl();
          }
          for (;;)
          {
            com.tencent.mm.plugin.music.a.f.J(1, 2, i);
            GMTrace.o(4869284954112L, 36279);
            return;
            localObject = new jn();
            ((jn)localObject).eNp.action = 5;
            com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          }
        }
        ((com.tencent.mm.plugin.music.a.e)localObject).mode = 1;
        localObject = new jn();
        ((jn)localObject).eNp.action = 5;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        com.tencent.mm.plugin.music.a.f.J(2, 1, i);
      }
      GMTrace.o(4869284954112L, 36279);
    }
    
    public final void onRelease()
    {
      GMTrace.i(4869419171840L, 36280);
      GMTrace.o(4869419171840L, 36280);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\ui\MusicMainUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */