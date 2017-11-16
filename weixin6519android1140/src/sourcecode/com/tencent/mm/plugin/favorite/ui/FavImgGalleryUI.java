package com.tencent.mm.plugin.favorite.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Matrix;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.util.SparseBooleanArray;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.a.e;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.g.a.mm.a;
import com.tencent.mm.plugin.favorite.b.b;
import com.tencent.mm.plugin.favorite.b.b.a;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.q;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.c;
import com.tencent.mm.ui.tools.MMGestureGallery.f;
import com.tencent.mm.ui.tools.l;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class FavImgGalleryUI
  extends MMActivity
  implements AdapterView.OnItemSelectedListener, b.a
{
  private boolean eON;
  private ArrayList<com.tencent.mm.plugin.favorite.ui.base.d> iBZ;
  private l iok;
  private MMGestureGallery jFH;
  private p.d krF;
  private int led;
  private a lee;
  private Map<String, mm> lef;
  private com.tencent.mm.sdk.b.c leg;
  
  public FavImgGalleryUI()
  {
    GMTrace.i(6338700640256L, 47227);
    this.led = 0;
    this.eON = true;
    this.lef = new HashMap();
    this.krF = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(6440035024896L, 47982);
        Object localObject1 = FavImgGalleryUI.d(FavImgGalleryUI.this).nD(FavImgGalleryUI.c(FavImgGalleryUI.this));
        if (localObject1 == null)
        {
          GMTrace.o(6440035024896L, 47982);
          return;
        }
        Object localObject2 = x.g(((com.tencent.mm.plugin.favorite.ui.base.d)localObject1).eIc);
        if (!e.aZ((String)localObject2))
        {
          w.w("MicroMsg.FavImgGalleryUI", "file not exists");
          GMTrace.o(6440035024896L, 47982);
          return;
        }
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(6440035024896L, 47982);
          return;
          com.tencent.mm.plugin.report.service.g.ork.i(10651, new Object[] { Integer.valueOf(2), Integer.valueOf(1), Integer.valueOf(0) });
          if (o.RH((String)localObject2))
          {
            paramAnonymousMenuItem = new Intent();
            paramAnonymousMenuItem.putExtra("Select_Conv_Type", 3);
            paramAnonymousMenuItem.putExtra("select_is_ret", true);
            com.tencent.mm.bj.d.a(FavImgGalleryUI.this, ".ui.transmit.SelectConversationUI", paramAnonymousMenuItem, 1);
            GMTrace.o(6440035024896L, 47982);
            return;
          }
          com.tencent.mm.plugin.favorite.c.d((String)localObject2, FavImgGalleryUI.this);
          GMTrace.o(6440035024896L, 47982);
          return;
          com.tencent.mm.plugin.favorite.c.c((String)localObject2, FavImgGalleryUI.this);
          com.tencent.mm.plugin.report.service.g.ork.i(10651, new Object[] { Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(0) });
          GMTrace.o(6440035024896L, 47982);
          return;
          com.tencent.mm.plugin.favorite.c.a((String)localObject2, FavImgGalleryUI.this.getString(R.l.duF), FavImgGalleryUI.this);
          GMTrace.o(6440035024896L, 47982);
          return;
          localObject2 = (mm)FavImgGalleryUI.e(FavImgGalleryUI.this).get(localObject2);
          if (localObject2 != null)
          {
            paramAnonymousMenuItem = new bz();
            paramAnonymousMenuItem.eDf.activity = FavImgGalleryUI.this;
            paramAnonymousMenuItem.eDf.eBB = ((mm)localObject2).eRt.result;
            paramAnonymousMenuItem.eDf.eDg = ((mm)localObject2).eRt.eDg;
            paramAnonymousMenuItem.eDf.eDi = 7;
            if ((localObject1 != null) && (((com.tencent.mm.plugin.favorite.ui.base.d)localObject1).eIc != null))
            {
              paramAnonymousMenuItem.eDf.imagePath = ((com.tencent.mm.plugin.favorite.ui.base.d)localObject1).eIc.ujt;
              paramAnonymousMenuItem.eDf.eDl = ((com.tencent.mm.plugin.favorite.ui.base.d)localObject1).eIc.ujv;
            }
            paramAnonymousMenuItem.eDf.eDh = ((mm)localObject2).eRt.eDh;
            localObject1 = new Bundle(1);
            ((Bundle)localObject1).putInt("stat_scene", 5);
            paramAnonymousMenuItem.eDf.eDm = ((Bundle)localObject1);
            com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousMenuItem);
          }
        }
      }
    };
    this.leg = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(6338700640256L, 47227);
  }
  
  private void ayE()
  {
    GMTrace.i(6339103293440L, 47230);
    long l = getIntent().getLongExtra("key_detail_info_id", -1L);
    String str = getIntent().getStringExtra("key_detail_data_id");
    boolean bool2 = getIntent().getBooleanExtra("fav_open_from_wnnote", false);
    Object localObject = getIntent().getStringExtra("fav_note_xml");
    ArrayList localArrayList = new ArrayList();
    j localj = com.tencent.mm.plugin.favorite.h.axB().cf(l);
    boolean bool1;
    if (localj != null)
    {
      bool1 = true;
      w.i("MicroMsg.FavImgGalleryUI", "show one fav info, local id is %d, get from db ok ? %B", new Object[] { Long.valueOf(l), Boolean.valueOf(bool1) });
      if ((!bool2) || (bg.nm((String)localObject))) {
        break label429;
      }
      localj = x.xT((String)localObject);
    }
    label172:
    label206:
    label426:
    label429:
    for (;;)
    {
      if (localj != null) {
        localArrayList.add(localj);
      }
      this.iBZ.clear();
      final int i = -1;
      int m = localArrayList.size();
      int k = 0;
      int j;
      if (k < m)
      {
        localj = (j)localArrayList.get(k);
        int n = localj.field_favProto.ulB.size();
        j = 0;
        if (j < n)
        {
          localObject = (th)localj.field_favProto.ulB.get(j);
          if (((((th)localObject).aGU == 8) && (!o.RH(x.g((th)localObject)))) || ((((th)localObject).aGU != 2) && (((th)localObject).aGU != 8))) {
            break label426;
          }
          com.tencent.mm.plugin.favorite.ui.base.d locald = new com.tencent.mm.plugin.favorite.ui.base.d(localj, (th)localObject);
          this.iBZ.add(locald);
          if ((str == null) || (!str.equals(((th)localObject).lhq))) {
            break label426;
          }
          i = this.iBZ.size() - 1;
        }
      }
      for (;;)
      {
        j += 1;
        break label206;
        bool1 = false;
        break;
        j = i;
        if (str == null)
        {
          j = i;
          if (localj.field_localId == l) {
            j = this.iBZ.size() - 1;
          }
        }
        k += 1;
        i = j;
        break label172;
        getIntent().removeExtra("key_detail_info_id");
        getIntent().removeExtra("key_detail_data_id");
        this.lee.notifyDataSetChanged();
        this.jFH.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6321789206528L, 47101);
            if (i != -1)
            {
              w.d("MicroMsg.FavImgGalleryUI", "match selection %d", new Object[] { Integer.valueOf(i) });
              FavImgGalleryUI.f(FavImgGalleryUI.this).setSelection(i);
              FavImgGalleryUI.a(FavImgGalleryUI.this, i);
              GMTrace.o(6321789206528L, 47101);
              return;
            }
            if ((FavImgGalleryUI.c(FavImgGalleryUI.this) - 1 >= 0) && (FavImgGalleryUI.c(FavImgGalleryUI.this) - 1 < FavImgGalleryUI.g(FavImgGalleryUI.this).size()))
            {
              w.d("MicroMsg.FavImgGalleryUI", "adjust selection %d, list size %d", new Object[] { Integer.valueOf(FavImgGalleryUI.c(FavImgGalleryUI.this) - 1), Integer.valueOf(FavImgGalleryUI.g(FavImgGalleryUI.this).size()) });
              FavImgGalleryUI.f(FavImgGalleryUI.this).setSelection(FavImgGalleryUI.c(FavImgGalleryUI.this) - 1);
              FavImgGalleryUI.a(FavImgGalleryUI.this, FavImgGalleryUI.c(FavImgGalleryUI.this) - 1);
              GMTrace.o(6321789206528L, 47101);
              return;
            }
            if (FavImgGalleryUI.g(FavImgGalleryUI.this).size() > 0)
            {
              w.d("MicroMsg.FavImgGalleryUI", "adjust selection fail, set selection 0, list size %d", new Object[] { Integer.valueOf(FavImgGalleryUI.g(FavImgGalleryUI.this).size()) });
              FavImgGalleryUI.f(FavImgGalleryUI.this).setSelection(0);
              FavImgGalleryUI.a(FavImgGalleryUI.this, 0);
              GMTrace.o(6321789206528L, 47101);
              return;
            }
            w.w("MicroMsg.FavImgGalleryUI", "data list size %d, empty, finish", new Object[] { Integer.valueOf(FavImgGalleryUI.g(FavImgGalleryUI.this).size()) });
            FavImgGalleryUI.this.finish();
            GMTrace.o(6321789206528L, 47101);
          }
        });
        GMTrace.o(6339103293440L, 47230);
        return;
      }
    }
  }
  
  public final void b(final com.tencent.mm.plugin.favorite.b.a parama)
  {
    GMTrace.i(6339908599808L, 47236);
    if (parama != null)
    {
      w.v("MicroMsg.FavImgGalleryUI", "on cdn status changed, status:%d", new Object[] { Integer.valueOf(parama.field_status) });
      com.tencent.mm.plugin.favorite.ui.base.d locald = this.lee.nD(this.led);
      if ((locald != null) && (bg.aq(parama.field_dataId, "").equals(locald.eIc.lhq))) {
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6442182508544L, 47998);
            Object localObject = FavImgGalleryUI.f(FavImgGalleryUI.this).getSelectedView();
            if (localObject == null)
            {
              GMTrace.o(6442182508544L, 47998);
              return;
            }
            localObject = (FavImgGalleryUI.b)((View)localObject).getTag();
            if (parama.field_totalLen > 0) {}
            for (int i = parama.field_offset * 100 / parama.field_totalLen - 1;; i = 0)
            {
              int j = i;
              if (i < 0) {
                j = 0;
              }
              ((FavImgGalleryUI.b)localObject).jeL.setProgress(j);
              ((FavImgGalleryUI.b)localObject).leo.setText(FavImgGalleryUI.this.getString(R.l.dwS, new Object[] { Integer.valueOf(j) }));
              if ((j >= 100) || (parama.isFinished())) {
                FavImgGalleryUI.d(FavImgGalleryUI.this).notifyDataSetChanged();
              }
              GMTrace.o(6442182508544L, 47998);
              return;
            }
          }
        });
      }
    }
    GMTrace.o(6339908599808L, 47236);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(6338834857984L, 47228);
    int i = R.i.cwt;
    GMTrace.o(6338834857984L, 47228);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, Intent paramIntent)
  {
    GMTrace.i(6340042817536L, 47237);
    if (1 == paramInt1)
    {
      if (-1 != paramInt2)
      {
        GMTrace.o(6340042817536L, 47237);
        return;
      }
      com.tencent.mm.plugin.favorite.ui.base.d locald = this.lee.nD(this.led);
      if (locald == null)
      {
        w.i("MicroMsg.FavImgGalleryUI", "dataItem is null.");
        GMTrace.o(6340042817536L, 47237);
        return;
      }
      new q();
      if (q.h(locald.lgN))
      {
        com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(R.l.cPM));
        GMTrace.o(6340042817536L, 47237);
        return;
      }
      String str = paramIntent.getStringExtra("Select_Conv_User");
      w.d("MicroMsg.FavImgGalleryUI", "select %s for sending", new Object[] { str });
      final com.tencent.mm.ui.base.r localr = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dtM), false, null);
      com.tencent.mm.plugin.favorite.b.r.a(this.vKB.vKW, str, locald.lgN, locald.eIc, new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6440571895808L, 47986);
          localr.dismiss();
          com.tencent.mm.ui.snackbar.a.e(FavImgGalleryUI.this, FavImgGalleryUI.this.getString(R.l.dwg));
          GMTrace.o(6440571895808L, 47986);
        }
      });
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(6340042817536L, 47237);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6338969075712L, 47229);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(1024, 1024);
    }
    this.eON = getIntent().getBooleanExtra("show_share", true);
    this.jFH = ((MMGestureGallery)findViewById(R.h.bCs));
    this.jFH.setVerticalFadingEdgeEnabled(false);
    this.jFH.setHorizontalFadingEdgeEnabled(false);
    this.jFH.setOnItemSelectedListener(this);
    this.jFH.xhF = new MMGestureGallery.f()
    {
      public final void alM()
      {
        GMTrace.i(6313736142848L, 47041);
        FavImgGalleryUI.this.finish();
        GMTrace.o(6313736142848L, 47041);
      }
    };
    if (this.eON) {
      this.jFH.xhG = new MMGestureGallery.c()
      {
        public final void ayF()
        {
          GMTrace.i(6464999522304L, 48168);
          if ((!FavImgGalleryUI.this.isFinishing()) && (!FavImgGalleryUI.this.vKD)) {
            FavImgGalleryUI.a(FavImgGalleryUI.this);
          }
          GMTrace.o(6464999522304L, 48168);
        }
      };
    }
    lc(true);
    this.iBZ = new ArrayList();
    this.lee = new a((byte)0);
    this.jFH.setAdapter(this.lee);
    ayE();
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6363262484480L, 47410);
        FavImgGalleryUI.this.finish();
        GMTrace.o(6363262484480L, 47410);
        return true;
      }
    });
    com.tencent.mm.sdk.b.a.vgX.b(this.leg);
    GMTrace.o(6338969075712L, 47229);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6339237511168L, 47231);
    com.tencent.mm.sdk.b.a.vgX.c(this.leg);
    super.onDestroy();
    GMTrace.o(6339237511168L, 47231);
  }
  
  public void onItemSelected(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(6339640164352L, 47234);
    this.led = paramInt;
    w.d("MicroMsg.FavImgGalleryUI", "pos:" + paramInt);
    if ((paramView instanceof MultiTouchImageView)) {
      ((MultiTouchImageView)paramView).caC();
    }
    GMTrace.o(6339640164352L, 47234);
  }
  
  public void onNothingSelected(AdapterView<?> paramAdapterView)
  {
    GMTrace.i(6339774382080L, 47235);
    GMTrace.o(6339774382080L, 47235);
  }
  
  protected void onPause()
  {
    GMTrace.i(6339505946624L, 47233);
    super.onPause();
    com.tencent.mm.plugin.favorite.h.axw().b(this);
    GMTrace.o(6339505946624L, 47233);
  }
  
  protected void onResume()
  {
    GMTrace.i(6339371728896L, 47232);
    super.onResume();
    com.tencent.mm.plugin.favorite.h.axw().a(this);
    GMTrace.o(6339371728896L, 47232);
  }
  
  private final class a
    extends BaseAdapter
  {
    SparseBooleanArray lek;
    
    private a()
    {
      GMTrace.i(6416546922496L, 47807);
      this.lek = new SparseBooleanArray();
      GMTrace.o(6416546922496L, 47807);
    }
    
    private Bitmap a(com.tencent.mm.plugin.favorite.ui.base.d paramd)
    {
      GMTrace.i(6417352228864L, 47813);
      if (paramd != null)
      {
        paramd = com.tencent.mm.plugin.favorite.c.g.a(paramd.eIc, paramd.lgN);
        if (paramd != null)
        {
          GMTrace.o(6417352228864L, 47813);
          return paramd;
        }
      }
      paramd = com.tencent.mm.compatible.f.a.decodeResource(FavImgGalleryUI.this.getResources(), R.k.cLY);
      GMTrace.o(6417352228864L, 47813);
      return paramd;
    }
    
    private void a(FavImgGalleryUI.b paramb, Bitmap paramBitmap, String paramString)
    {
      GMTrace.i(6417218011136L, 47812);
      paramb.jeL.setVisibility(8);
      paramb.leo.setVisibility(8);
      paramb.len.setVisibility(8);
      paramb.lel.setVisibility(0);
      paramb.lep.setVisibility(8);
      b(paramb, paramBitmap, paramString);
      GMTrace.o(6417218011136L, 47812);
    }
    
    private void b(FavImgGalleryUI.b paramb, Bitmap paramBitmap, String paramString)
    {
      GMTrace.i(6417486446592L, 47814);
      com.tencent.mm.sdk.platformtools.k.i(paramb.lem, paramBitmap.getWidth(), paramBitmap.getHeight());
      int i = paramb.lem.getWidth();
      int j = paramb.lem.getHeight();
      Object localObject = new Matrix();
      ((Matrix)localObject).reset();
      float f1 = paramBitmap.getWidth() / paramBitmap.getHeight();
      float f2 = paramBitmap.getHeight() / paramBitmap.getWidth();
      w.v("MicroMsg.FavImgGalleryUI", "whDiv is " + f1 + " hwDiv is " + f2);
      if ((f2 >= 2.0F) && (paramBitmap.getHeight() >= 480))
      {
        f1 = paramBitmap.getWidth() / i;
        f2 = i / paramBitmap.getWidth();
        if (f1 > 1.0D)
        {
          ((Matrix)localObject).postScale(f2, f2);
          paramBitmap.getHeight();
          ((Matrix)localObject).postTranslate((i - f2 * paramBitmap.getWidth()) / 2.0F, 0.0F);
        }
      }
      for (;;)
      {
        paramb.lem.setImageMatrix((Matrix)localObject);
        paramb.lem.eo(paramBitmap.getWidth(), paramBitmap.getHeight());
        paramb.lem.wgM = true;
        if (!bg.nm(paramString)) {
          break label537;
        }
        paramb.lem.setImageBitmap(paramBitmap);
        GMTrace.o(6417486446592L, 47814);
        return;
        ((Matrix)localObject).postScale(1.0F, 1.0F);
        ((Matrix)localObject).postTranslate((i - paramBitmap.getWidth()) / 2, 0.0F);
        continue;
        if ((f1 < 2.0F) || (paramBitmap.getWidth() < 480)) {
          break;
        }
        f1 = paramBitmap.getHeight() / 480.0F;
        f2 = 480.0F / paramBitmap.getHeight();
        if (f1 > 1.0D)
        {
          ((Matrix)localObject).postScale(f1, f2);
          ((Matrix)localObject).postTranslate(0.0F, (j - 480) / 2);
        }
        else
        {
          ((Matrix)localObject).postScale(1.0F, 1.0F);
          f1 = (j - paramBitmap.getHeight()) / 2;
          w.d("MicroMsg.FavImgGalleryUI", " offsety " + f1);
          ((Matrix)localObject).postTranslate(0.0F, f1);
        }
      }
      f1 = i / paramBitmap.getWidth();
      f2 = j / paramBitmap.getHeight();
      label438:
      float f3;
      if (f1 < f2)
      {
        f2 = paramBitmap.getWidth() / i;
        f3 = paramBitmap.getHeight() / j;
        if (f2 <= f3) {
          break label530;
        }
        label468:
        if (f2 <= 1.0D) {
          break label709;
        }
        ((Matrix)localObject).postScale(f1, f1);
      }
      for (;;)
      {
        ((Matrix)localObject).postTranslate((i - paramBitmap.getWidth() * f1) / 2.0F, (j - f1 * paramBitmap.getHeight()) / 2.0F);
        break;
        f1 = f2;
        break label438;
        label530:
        f2 = f3;
        break label468;
        try
        {
          label537:
          paramString = new com.tencent.mm.plugin.gif.c(paramString);
          localObject = paramb.lem;
          ((MultiTouchImageView)localObject).wgT = true;
          ((MultiTouchImageView)localObject).wgU = paramString;
          ((MultiTouchImageView)localObject).setImageDrawable(((MultiTouchImageView)localObject).wgU);
          localObject = paramb.lem;
          i = com.tencent.mm.br.a.ef(FavImgGalleryUI.this.vKB.vKW);
          ((MultiTouchImageView)localObject).kKE = com.tencent.mm.br.a.eg(FavImgGalleryUI.this.vKB.vKW);
          ((MultiTouchImageView)localObject).kKD = i;
          paramb.lem.eo(paramString.getIntrinsicWidth(), paramString.getIntrinsicHeight());
          paramString = paramb.lem;
          if ((paramString.wgT) && (paramString.wgU != null)) {
            ((com.tencent.mm.ui.f.b.a)paramString.wgU).start();
          }
          paramb.lem.caF();
          GMTrace.o(6417486446592L, 47814);
          return;
        }
        catch (Exception paramString)
        {
          w.e("MicroMsg.FavImgGalleryUI", bg.f(paramString));
          paramb.lem.setImageBitmap(paramBitmap);
          GMTrace.o(6417486446592L, 47814);
          return;
        }
        label709:
        f1 = 1.0F;
      }
    }
    
    public final int getCount()
    {
      GMTrace.i(6416681140224L, 47808);
      int i = FavImgGalleryUI.g(FavImgGalleryUI.this).size();
      GMTrace.o(6416681140224L, 47808);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(6416949575680L, 47810);
      long l = paramInt;
      GMTrace.o(6416949575680L, 47810);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(6417083793408L, 47811);
      com.tencent.mm.plugin.favorite.ui.base.d locald;
      Object localObject;
      if (paramView == null)
      {
        paramViewGroup = new FavImgGalleryUI.b(FavImgGalleryUI.this);
        paramView = View.inflate(FavImgGalleryUI.this.vKB.vKW, R.i.cws, null);
        paramViewGroup.lel = paramView.findViewById(R.h.bGG);
        paramViewGroup.lem = ((MultiTouchImageView)paramView.findViewById(R.h.image));
        paramViewGroup.jeL = ((ProgressBar)paramView.findViewById(R.h.bvn));
        paramViewGroup.len = ((ImageView)paramView.findViewById(R.h.che));
        paramViewGroup.leo = ((TextView)paramView.findViewById(R.h.bvo));
        paramViewGroup.lep = ((LinearLayout)paramView.findViewById(R.h.byS));
        paramViewGroup.leq = ((TextView)paramView.findViewById(R.h.byT));
        paramViewGroup.leq.setText(R.l.dsZ);
        paramView.setTag(paramViewGroup);
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        locald = nD(paramInt);
        boolean bool = this.lek.get(paramInt, true);
        this.lek.put(paramInt, false);
        localObject = com.tencent.mm.plugin.favorite.c.g.a(locald.eIc, locald.lgN, bool);
        if (locald.lgN != null) {
          w.i("MicroMsg.FavImgGalleryUI", "index %d item favid %d, localid %d, itemStatus %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(locald.lgN.field_id), Long.valueOf(locald.lgN.field_localId), Integer.valueOf(locald.lgN.field_itemStatus) });
        }
        if (locald.eIc != null) {
          w.i("MicroMsg.FavImgGalleryUI", "item dataId %s, item data url %s, key %s, fullsize %d, thumb url %s, key %s, thumb size %d", new Object[] { locald.eIc.lhq, locald.eIc.ujt, locald.eIc.ujv, Long.valueOf(locald.eIc.ujO), locald.eIc.giD, locald.eIc.ujp, Long.valueOf(locald.eIc.ujZ) });
        }
        if (localObject != null) {
          break label811;
        }
        FavImgGalleryUI.this.lf(false);
        w.w("MicroMsg.FavImgGalleryUI", "get big image fail");
        b localb = com.tencent.mm.plugin.favorite.h.axw();
        if (locald.eIc == null) {
          break label574;
        }
        localObject = locald.eIc.lhq;
        label428:
        localObject = localb.xE((String)localObject);
        if (localObject != null) {
          break label653;
        }
        paramViewGroup.lep.setVisibility(8);
        if ((locald.lgN == null) || (locald.lgN.field_id >= 0)) {
          break label582;
        }
        paramViewGroup.jeL.setVisibility(0);
        paramViewGroup.leo.setVisibility(0);
        paramViewGroup.len.setVisibility(0);
        paramViewGroup.lel.setVisibility(8);
        paramViewGroup.len.setImageBitmap(a(locald));
        paramViewGroup.jeL.setProgress(0);
        paramViewGroup.leo.setText(FavImgGalleryUI.this.getString(R.l.dwS, new Object[] { Integer.valueOf(0) }));
      }
      for (;;)
      {
        GMTrace.o(6417083793408L, 47811);
        return paramView;
        paramViewGroup = (FavImgGalleryUI.b)paramView.getTag();
        break;
        label574:
        localObject = "";
        break label428;
        label582:
        paramViewGroup.jeL.setVisibility(8);
        paramViewGroup.leo.setVisibility(8);
        paramViewGroup.len.setVisibility(8);
        paramViewGroup.lel.setVisibility(0);
        if (locald.eIc.ukB != 0) {
          paramViewGroup.lep.setVisibility(0);
        }
        b(paramViewGroup, a(locald), "");
      }
      label653:
      w.i("MicroMsg.FavImgGalleryUI", "fav cdnInfo status %d", new Object[] { Integer.valueOf(((com.tencent.mm.plugin.favorite.b.a)localObject).field_status) });
      paramViewGroup.jeL.setVisibility(0);
      paramViewGroup.leo.setVisibility(0);
      paramViewGroup.len.setVisibility(0);
      paramViewGroup.lel.setVisibility(8);
      paramViewGroup.len.setImageBitmap(a(locald));
      if (((com.tencent.mm.plugin.favorite.b.a)localObject).field_totalLen > 0) {}
      for (paramInt = ((com.tencent.mm.plugin.favorite.b.a)localObject).field_offset * 100 / ((com.tencent.mm.plugin.favorite.b.a)localObject).field_totalLen - 1;; paramInt = 0)
      {
        int i = paramInt;
        if (paramInt < 0) {
          i = 0;
        }
        paramViewGroup.jeL.setProgress(i);
        paramViewGroup.leo.setText(FavImgGalleryUI.this.getString(R.l.dwS, new Object[] { Integer.valueOf(i) }));
        GMTrace.o(6417083793408L, 47811);
        return paramView;
      }
      label811:
      FavImgGalleryUI.this.lf(true);
      if (o.RH(x.g(locald.eIc))) {
        a(paramViewGroup, (Bitmap)localObject, x.g(locald.eIc));
      }
      for (;;)
      {
        GMTrace.o(6417083793408L, 47811);
        return paramView;
        a(paramViewGroup, (Bitmap)localObject, "");
      }
    }
    
    public final com.tencent.mm.plugin.favorite.ui.base.d nD(int paramInt)
    {
      GMTrace.i(6416815357952L, 47809);
      if (paramInt >= FavImgGalleryUI.g(FavImgGalleryUI.this).size())
      {
        w.w("MicroMsg.FavImgGalleryUI", "get item fail, position %d error", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(6416815357952L, 47809);
        return null;
      }
      com.tencent.mm.plugin.favorite.ui.base.d locald = (com.tencent.mm.plugin.favorite.ui.base.d)FavImgGalleryUI.g(FavImgGalleryUI.this).get(paramInt);
      GMTrace.o(6416815357952L, 47809);
      return locald;
    }
  }
  
  private final class b
  {
    ProgressBar jeL;
    View lel;
    MultiTouchImageView lem;
    ImageView len;
    TextView leo;
    LinearLayout lep;
    TextView leq;
    
    public b()
    {
      GMTrace.i(6341519212544L, 47248);
      GMTrace.o(6341519212544L, 47248);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\FavImgGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */