package com.tencent.mm.plugin.favorite.ui;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.database.Cursor;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.AdapterView.AdapterContextMenuInfo;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.ImageButton;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.a.km;
import com.tencent.mm.plugin.favorite.b.j;
import com.tencent.mm.plugin.favorite.b.q;
import com.tencent.mm.plugin.favorite.b.r;
import com.tencent.mm.plugin.favorite.b.v;
import com.tencent.mm.plugin.favorite.b.v.c;
import com.tencent.mm.plugin.favorite.b.v.d;
import com.tencent.mm.plugin.favorite.b.x;
import com.tencent.mm.plugin.favorite.ui.a.a.a;
import com.tencent.mm.plugin.favorite.ui.base.b.a;
import com.tencent.mm.plugin.favorite.ui.base.c.a;
import com.tencent.mm.plugin.favorite.ui.c.a.b;
import com.tencent.mm.plugin.favorite.ui.c.a.c;
import com.tencent.mm.plugin.favorite.ui.post.FavPostVoiceUI;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.to;
import com.tencent.mm.protocal.c.tt;
import com.tencent.mm.protocal.c.tw;
import com.tencent.mm.protocal.c.uf;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.y.at;
import com.tencent.mm.y.s;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class FavoriteIndexUI
  extends FavBaseUI
  implements c.a, a.c
{
  private l jGV;
  private p.d jqg;
  private int lft;
  private com.tencent.mm.plugin.favorite.ui.a.b lfu;
  private com.tencent.mm.plugin.favorite.ui.base.b lfv;
  private j lfw;
  private com.tencent.mm.ad.e lfx;
  private AdapterView.OnItemLongClickListener lfy;
  private j lfz;
  private long startTime;
  
  public FavoriteIndexUI()
  {
    GMTrace.i(6357625339904L, 47368);
    this.lft = 0;
    this.startTime = 0L;
    this.lfx = new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(6442719379456L, 48002);
        w.i("MicroMsg.FavoriteIndexUI", "onUsedCapacityChanged");
        FavoriteIndexUI.this.ldB.post(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(6415070527488L, 47796);
            FavoriteIndexUI.this.ldB.ayW();
            GMTrace.o(6415070527488L, 47796);
          }
        });
        GMTrace.o(6442719379456L, 48002);
      }
    };
    this.lfy = new AdapterView.OnItemLongClickListener()
    {
      public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(6313467707392L, 47039);
        if (paramAnonymousInt < FavoriteIndexUI.this.ldv.getHeaderViewsCount())
        {
          w.w("MicroMsg.FavoriteIndexUI", "on header view long click, ignore");
          GMTrace.o(6313467707392L, 47039);
          return true;
        }
        FavoriteIndexUI.d(FavoriteIndexUI.this).a(paramAnonymousView, paramAnonymousInt, paramAnonymousLong, FavoriteIndexUI.this, FavoriteIndexUI.c(FavoriteIndexUI.this));
        GMTrace.o(6313467707392L, 47039);
        return true;
      }
    };
    this.jqg = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(6375744733184L, 47503);
        switch (FavoriteIndexUI.e(FavoriteIndexUI.this))
        {
        default: 
          GMTrace.o(6375744733184L, 47503);
          return;
        }
        if (paramAnonymousMenuItem == null)
        {
          GMTrace.o(6375744733184L, 47503);
          return;
        }
        Object localObject = (AdapterView.AdapterContextMenuInfo)paramAnonymousMenuItem.getMenuInfo();
        switch (paramAnonymousMenuItem.getItemId())
        {
        default: 
          GMTrace.o(6375744733184L, 47503);
          return;
        case 0: 
          if (((AdapterView.AdapterContextMenuInfo)localObject).position < FavoriteIndexUI.this.ldv.getHeaderViewsCount())
          {
            GMTrace.o(6375744733184L, 47503);
            return;
          }
          w.i("MicroMsg.FavoriteIndexUI", "do delete, long click info is %s", new Object[] { Integer.valueOf(((AdapterView.AdapterContextMenuInfo)localObject).position) });
          x.a(FavoriteIndexUI.a(FavoriteIndexUI.this).nE(((AdapterView.AdapterContextMenuInfo)localObject).position - FavoriteIndexUI.this.ldv.getHeaderViewsCount() - 1), null);
          GMTrace.o(6375744733184L, 47503);
          return;
        case 1: 
          FavoriteIndexUI.a(FavoriteIndexUI.this, bg.Pu());
          w.i("MicroMsg.FavoriteIndexUI", "do edit, long click info is %s", new Object[] { Integer.valueOf(((AdapterView.AdapterContextMenuInfo)localObject).position) });
          FavoriteIndexUI.a(FavoriteIndexUI.this, FavoriteIndexUI.a(FavoriteIndexUI.this).nE(((AdapterView.AdapterContextMenuInfo)localObject).position - FavoriteIndexUI.this.ldv.getHeaderViewsCount() - 1));
          FavoriteIndexUI.b(FavoriteIndexUI.this, FavoriteIndexUI.f(FavoriteIndexUI.this));
          GMTrace.o(6375744733184L, 47503);
          return;
        case 2: 
          w.i("MicroMsg.FavoriteIndexUI", "do tag, long click info is %s", new Object[] { Integer.valueOf(((AdapterView.AdapterContextMenuInfo)localObject).position) });
          paramAnonymousMenuItem = FavoriteIndexUI.a(FavoriteIndexUI.this).nE(((AdapterView.AdapterContextMenuInfo)localObject).position - FavoriteIndexUI.this.ldv.getHeaderViewsCount() - 1);
          localObject = new Intent(FavoriteIndexUI.this.vKB.vKW, FavTagEditUI.class);
          ((Intent)localObject).putExtra("key_fav_scene", 4);
          ((Intent)localObject).putExtra("key_fav_item_id", paramAnonymousMenuItem.field_localId);
          FavoriteIndexUI.this.vKB.vKW.startActivity((Intent)localObject);
          GMTrace.o(6375744733184L, 47503);
          return;
        }
        FavoriteIndexUI.a(FavoriteIndexUI.this, bg.Pu());
        w.i("MicroMsg.FavoriteIndexUI", "do transmit, long click info is %s", new Object[] { Integer.valueOf(((AdapterView.AdapterContextMenuInfo)localObject).position) });
        FavoriteIndexUI.c(FavoriteIndexUI.this, FavoriteIndexUI.a(FavoriteIndexUI.this).nE(((AdapterView.AdapterContextMenuInfo)localObject).position - FavoriteIndexUI.this.ldv.getHeaderViewsCount() - 1));
        FavoriteIndexUI.c(FavoriteIndexUI.this, FavoriteIndexUI.g(FavoriteIndexUI.this).axO());
        if (FavoriteIndexUI.g(FavoriteIndexUI.this) == null)
        {
          GMTrace.o(6375744733184L, 47503);
          return;
        }
        paramAnonymousMenuItem = new LinkedList();
        paramAnonymousMenuItem.add(FavoriteIndexUI.g(FavoriteIndexUI.this));
        if (!x.a(paramAnonymousMenuItem, FavoriteIndexUI.this, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(6334808326144L, 47198);
            FavoriteIndexUI.a(FavoriteIndexUI.this, 4106);
            GMTrace.o(6334808326144L, 47198);
          }
        }))
        {
          GMTrace.o(6375744733184L, 47503);
          return;
        }
        FavoriteIndexUI.a(FavoriteIndexUI.this, 4106);
        GMTrace.o(6375744733184L, 47503);
      }
    };
    GMTrace.o(6357625339904L, 47368);
  }
  
  private void a(final List<j> paramList, String paramString1, String paramString2)
  {
    GMTrace.i(6359504388096L, 47382);
    if ((paramList == null) || (paramList.isEmpty()))
    {
      GMTrace.o(6359504388096L, 47382);
      return;
    }
    if (bg.nm(paramString2))
    {
      GMTrace.o(6359504388096L, 47382);
      return;
    }
    boolean bool = s.eb(paramString2);
    Object localObject = new q();
    LinkedList localLinkedList = new LinkedList();
    Iterator localIterator = paramList.iterator();
    while (localIterator.hasNext())
    {
      j localj = (j)localIterator.next();
      if (!((q)localObject).g(localj))
      {
        g.ork.i(10651, new Object[] { Integer.valueOf(localj.field_type), Integer.valueOf(1), Integer.valueOf(0) });
        localLinkedList.add(localj);
        label170:
        v.d locald;
        if (bool)
        {
          paramList = v.c.lbL;
          locald = v.d.lbO;
          if (!bool) {
            break label206;
          }
        }
        label206:
        for (int i = com.tencent.mm.y.m.fk(paramString2);; i = 0)
        {
          v.a(paramList, localj, locald, i);
          break;
          paramList = v.c.lbK;
          break label170;
        }
      }
    }
    if (localLinkedList.isEmpty())
    {
      w.i("MicroMsg.FavoriteIndexUI", "after filter, nothing");
      paramList = getString(R.l.duE);
      com.tencent.mm.ui.base.h.bm(getApplicationContext(), paramList);
      GMTrace.o(6359504388096L, 47382);
      return;
    }
    paramList = com.tencent.mm.ui.base.h.a(this.vKB.vKW, getString(R.l.dtM), false, null);
    r.a(this.vKB.vKW, paramString2, paramString1, localLinkedList, new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6442987814912L, 48004);
        paramList.dismiss();
        com.tencent.mm.ui.snackbar.a.e(FavoriteIndexUI.this, FavoriteIndexUI.this.getString(R.l.dwg));
        GMTrace.o(6442987814912L, 48004);
      }
    });
    paramString2 = localLinkedList.iterator();
    for (;;)
    {
      if (!paramString2.hasNext()) {
        break label552;
      }
      localObject = (j)paramString2.next();
      if ((localObject != null) && (((j)localObject).field_type == 5))
      {
        paramList = "";
        if (((j)localObject).field_favProto.ukJ != null) {
          paramList = ((j)localObject).field_favProto.ukJ.umf;
        }
        paramString1 = paramList;
        if (((j)localObject).field_favProto.ulz != null)
        {
          paramString1 = paramList;
          if (bg.nm(paramList)) {
            paramString1 = ((j)localObject).field_favProto.ulz.gVf;
          }
        }
        if (!bg.nm(paramString1))
        {
          w.d("MicroMsg.FavoriteIndexUI", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), paramString1, Long.valueOf(this.startTime), Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(1) });
          paramList = "";
        }
      }
      try
      {
        paramString1 = URLEncoder.encode(paramString1, "UTF-8");
        paramList = paramString1;
      }
      catch (UnsupportedEncodingException paramString1)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.FavoriteIndexUI", paramString1, "", new Object[0]);
        }
      }
      g.ork.i(13378, new Object[] { paramList, Long.valueOf(this.startTime), Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(1) });
    }
    label552:
    g.ork.i(11125, new Object[] { Integer.valueOf(localLinkedList.size()), Integer.valueOf(1) });
    GMTrace.o(6359504388096L, 47382);
  }
  
  private void ayJ()
  {
    GMTrace.i(6358430646272L, 47374);
    this.lfu.a(false, null);
    this.ldv.setOnItemLongClickListener(this.lfy);
    Z(11, true);
    com.tencent.mm.plugin.favorite.ui.base.b localb = this.lfv;
    if ((localb.lgw) && (localb.lgx.getVisibility() != 8))
    {
      localb.lgx.setVisibility(8);
      localb.lgx.startAnimation(AnimationUtils.loadAnimation(localb.lgx.getContext(), R.a.aLt));
    }
    GMTrace.o(6358430646272L, 47374);
  }
  
  protected final boolean ayA()
  {
    GMTrace.i(6358967517184L, 47378);
    int i;
    switch (this.lft)
    {
    default: 
      i = com.tencent.mm.plugin.favorite.h.axB().getCount();
    }
    while (i > 0)
    {
      GMTrace.o(6358967517184L, 47378);
      return true;
      Cursor localCursor = com.tencent.mm.plugin.favorite.h.axB().rawQuery("select count(*) from FavItemInfo where type = 2", new String[0]);
      if (localCursor != null)
      {
        localCursor.moveToFirst();
        i = localCursor.getInt(0);
        localCursor.close();
      }
      else
      {
        i = 0;
      }
    }
    GMTrace.o(6358967517184L, 47378);
    return false;
  }
  
  protected final void ayB()
  {
    GMTrace.i(6359101734912L, 47379);
    switch (this.lft)
    {
    default: 
      this.ldw.setCompoundDrawablesWithIntrinsicBounds(0, R.g.aWu, 0, 0);
      this.ldw.setCompoundDrawablePadding(com.tencent.mm.br.a.fromDPToPix(this.vKB.vKW, 10));
      this.ldw.setText(R.l.dtm);
      GMTrace.o(6359101734912L, 47379);
      return;
    }
    this.ldw.setCompoundDrawablesWithIntrinsicBounds(0, R.k.cMo, 0, 0);
    this.ldw.setCompoundDrawablePadding(com.tencent.mm.br.a.fromDPToPix(this.vKB.vKW, 10));
    this.ldw.setText(R.l.dtn);
    GMTrace.o(6359101734912L, 47379);
  }
  
  protected final void ayC()
  {
    GMTrace.i(6357893775360L, 47370);
    super.ayC();
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6370778677248L, 47466);
        GMTrace.o(6370778677248L, 47466);
      }
    });
    GMTrace.o(6357893775360L, 47370);
  }
  
  public final void ayK()
  {
    GMTrace.i(6360309694464L, 47388);
    Intent localIntent = new Intent(this.vKB.vKW, FavCleanUI.class);
    localIntent.putExtra("key_enter_fav_cleanui_from", 0);
    this.vKB.vKW.startActivity(localIntent);
    GMTrace.o(6360309694464L, 47388);
  }
  
  public final com.tencent.mm.plugin.favorite.ui.a.a ayy()
  {
    GMTrace.i(6358699081728L, 47376);
    if (this.lfu == null)
    {
      localObject = this.vKB.vKW;
      this.lfu = new com.tencent.mm.plugin.favorite.ui.a.b(this.laj, false);
      this.lfu.a(new a.a()
      {
        public final void ayN()
        {
          GMTrace.i(6442450944000L, 48000);
          FavoriteIndexUI.this.ldB.ey(true);
          GMTrace.o(6442450944000L, 48000);
        }
      });
      this.lfu.lge = this;
    }
    Object localObject = this.lfu;
    GMTrace.o(6358699081728L, 47376);
    return (com.tencent.mm.plugin.favorite.ui.a.a)localObject;
  }
  
  protected final void ayz()
  {
    GMTrace.i(6358833299456L, 47377);
    this.ldB.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6341384994816L, 47247);
        FavoriteIndexUI.this.ldB.ayW();
        GMTrace.o(6341384994816L, 47247);
      }
    });
    GMTrace.o(6358833299456L, 47377);
  }
  
  public final void cv(long paramLong)
  {
    GMTrace.i(6359772823552L, 47384);
    com.tencent.mm.plugin.favorite.ui.base.b localb;
    if (this.lfu.lfX)
    {
      localb = this.lfv;
      if (this.lfu.ayT() <= 0) {
        break label82;
      }
    }
    label82:
    for (boolean bool = true;; bool = false)
    {
      if (localb.lgw)
      {
        localb.lgA.setEnabled(bool);
        localb.lgB.setEnabled(bool);
        localb.lgC.setEnabled(bool);
      }
      GMTrace.o(6359772823552L, 47384);
      return;
    }
  }
  
  protected final void initHeaderView()
  {
    GMTrace.i(6359370170368L, 47381);
    super.initHeaderView();
    this.ldB.ey(false);
    GMTrace.o(6359370170368L, 47381);
  }
  
  protected void onActivityResult(final int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(6359638605824L, 47383);
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    w.i("MicroMsg.FavoriteIndexUI", "onActivityResult reqCode: %d, retCod: %d", new Object[] { Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    if (paramInt2 != -1)
    {
      if (((this.lfz != null) && (this.lfz.field_type == 5)) || ((this.lfw != null) && (this.lfw.field_type == 5)))
      {
        localObject1 = "";
        if ((this.lfw == null) || (this.lfw.field_favProto.ulz == null)) {
          break label254;
        }
        paramIntent = this.lfw.field_favProto.ulz.gVf;
      }
      for (;;)
      {
        if (!bg.nm(paramIntent)) {
          w.d("MicroMsg.FavoriteIndexUI", "report(%s), url : %s, clickTimestamp : %d, scene : %d, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13378), paramIntent, Long.valueOf(this.startTime), Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(3) });
        }
        try
        {
          paramIntent = URLEncoder.encode(paramIntent, "UTF-8");
          g.ork.i(13378, new Object[] { paramIntent, Long.valueOf(this.startTime), Integer.valueOf(4), Integer.valueOf(1), Integer.valueOf(3) });
          GMTrace.o(6359638605824L, 47383);
          return;
          label254:
          if (this.lfz.field_favProto.ukJ != null) {
            localObject1 = this.lfz.field_favProto.ukJ.umf;
          }
          paramIntent = (Intent)localObject1;
          if (this.lfz.field_favProto.ulz != null)
          {
            paramIntent = (Intent)localObject1;
            if (bg.nm((String)localObject1)) {
              paramIntent = this.lfz.field_favProto.ulz.gVf;
            }
          }
        }
        catch (UnsupportedEncodingException paramIntent)
        {
          for (;;)
          {
            w.printErrStackTrace("MicroMsg.FavoriteIndexUI", paramIntent, "", new Object[0]);
            paramIntent = "";
          }
        }
      }
    }
    paramInt2 = 2;
    final Object localObject1 = paramIntent.getStringExtra("custom_send_text");
    switch (paramInt1)
    {
    default: 
      paramInt1 = paramInt2;
    }
    while (paramInt1 == 0)
    {
      com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(R.l.duh));
      GMTrace.o(6359638605824L, 47383);
      return;
      paramInt1 = 0;
      this.lds = true;
      continue;
      localObject1 = getApplicationContext();
      at.AR();
      paramIntent = com.tencent.mm.pluginsdk.ui.tools.k.b((Context)localObject1, paramIntent, com.tencent.mm.y.c.yU());
      if (paramIntent == null)
      {
        w.w("MicroMsg.FavoriteIndexUI", "take picture result path is null");
        GMTrace.o(6359638605824L, 47383);
        return;
      }
      localObject1 = new Intent();
      ((Intent)localObject1).putExtra("CropImageMode", 4);
      ((Intent)localObject1).putExtra("CropImage_Filter", true);
      ((Intent)localObject1).putExtra("CropImage_ImgPath", paramIntent);
      com.tencent.mm.plugin.favorite.c.hnH.a(this, (Intent)localObject1, 4099);
      paramInt1 = paramInt2;
      continue;
      paramIntent = paramIntent.getStringExtra("CropImage_OutputPath");
      if (paramIntent == null)
      {
        w.w("MicroMsg.FavoriteIndexUI", "crop picture resutl path is null");
        GMTrace.o(6359638605824L, 47383);
        return;
      }
      paramInt1 = 0;
      localObject1 = new ArrayList();
      ((ArrayList)localObject1).add(paramIntent);
      this.ldy.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6416144269312L, 47804);
          FavoriteIndexUI.this.lds = true;
          com.tencent.mm.plugin.favorite.b.m.ay(localObject1);
          GMTrace.o(6416144269312L, 47804);
        }
      });
      continue;
      paramIntent = paramIntent.getStringArrayListExtra("CropImage_OutputPath_List");
      if ((paramIntent == null) || (paramIntent.size() == 0))
      {
        w.e("MicroMsg.FavoriteIndexUI", "onActivityResult pathList is null or nil");
        GMTrace.o(6359638605824L, 47383);
        return;
      }
      paramInt1 = 0;
      this.ldy.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6413862567936L, 47787);
          FavoriteIndexUI.this.lds = true;
          com.tencent.mm.plugin.favorite.b.m.ay(paramIntent);
          GMTrace.o(6413862567936L, 47787);
        }
      });
      continue;
      final double d1 = paramIntent.getDoubleExtra("kwebmap_slat", 0.0D);
      double d2 = paramIntent.getDoubleExtra("kwebmap_lng", 0.0D);
      paramInt1 = paramIntent.getIntExtra("kwebmap_scale", 0);
      localObject1 = bg.aq(paramIntent.getStringExtra("Kwebmap_locaion"), "");
      final Object localObject2 = paramIntent.getCharSequenceExtra("kRemark");
      final Object localObject3 = paramIntent.getStringExtra("kPoiName");
      paramIntent = paramIntent.getStringArrayListExtra("kTags");
      this.ldy.post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(6371047112704L, 47468);
          FavoriteIndexUI.this.lds = true;
          double d1 = d1;
          double d2 = paramInt1;
          int i = localObject2;
          Object localObject2 = localObject3;
          Object localObject1 = paramIntent;
          String str = this.lfL;
          ArrayList localArrayList = this.lfM;
          to localto = new to();
          localto.QP((String)localObject2);
          localto.q(d1);
          localto.p(d2);
          localto.zV(i);
          localto.QQ(str);
          localObject2 = new j();
          ((j)localObject2).field_type = 6;
          ((j)localObject2).field_sourceType = 6;
          ((j)localObject2).field_favProto.b(localto);
          if ((localObject1 != null) && (!bg.nm(((CharSequence)localObject1).toString())))
          {
            ((j)localObject2).field_favProto.QV(((CharSequence)localObject1).toString());
            ((j)localObject2).field_favProto.eC(bg.Pv());
            g.ork.i(10873, new Object[] { Integer.valueOf(6) });
          }
          com.tencent.mm.plugin.favorite.b.m.f((j)localObject2);
          if ((localArrayList != null) && (!localArrayList.isEmpty()))
          {
            localObject1 = localArrayList.iterator();
            while (((Iterator)localObject1).hasNext()) {
              ((j)localObject2).xH((String)((Iterator)localObject1).next());
            }
          }
          com.tencent.mm.plugin.favorite.c.a.z((j)localObject2);
          g.ork.i(10648, new Object[] { Integer.valueOf(3), Integer.valueOf(0) });
          x.cs(((j)localObject2).field_localId);
          long l = ((j)localObject2).field_localId;
          localObject1 = com.tencent.mm.plugin.favorite.h.axB().cf(l);
          if ((localObject1 != null) && (((j)localObject1).field_favProto.ukH != null)) {
            com.tencent.mm.plugin.favorite.c.a(l, ((j)localObject1).field_favProto.ukH, "", "", new ArrayList(), FavoriteIndexUI.this.vKB.vKW);
          }
          GMTrace.o(6371047112704L, 47468);
        }
      });
      paramInt1 = 0;
      continue;
      paramIntent = paramIntent.getStringExtra("choosed_file_path");
      if (bg.nm(paramIntent))
      {
        paramInt1 = 1;
      }
      else
      {
        localObject1 = new File(paramIntent);
        if (!((File)localObject1).exists())
        {
          paramInt1 = 1;
        }
        else if (((File)localObject1).length() >= 26214400L)
        {
          paramInt1 = 3;
        }
        else
        {
          if (bg.nm(paramIntent)) {
            paramInt1 = 0;
          }
          for (;;)
          {
            if (paramInt1 == 0) {
              break label1052;
            }
            paramInt1 = 0;
            this.lds = true;
            break;
            localObject1 = new File(paramIntent);
            if (!((File)localObject1).exists())
            {
              paramInt1 = 0;
            }
            else
            {
              localObject2 = new j();
              ((j)localObject2).field_type = 8;
              ((j)localObject2).field_sourceType = 6;
              com.tencent.mm.plugin.favorite.b.m.f((j)localObject2);
              ((j)localObject2).field_favProto.QW(((File)localObject1).getName());
              localObject3 = new th();
              ((th)localObject3).Qu(paramIntent);
              ((th)localObject3).kx(true);
              ((th)localObject3).Qg(((File)localObject1).getName());
              ((th)localObject3).zR(((j)localObject2).field_type);
              ((th)localObject3).Qq(com.tencent.mm.a.e.bb(paramIntent));
              ((j)localObject2).field_favProto.ulB.add(localObject3);
              com.tencent.mm.plugin.favorite.c.a.z((j)localObject2);
              g.ork.i(10648, new Object[] { Integer.valueOf(5), Integer.valueOf(0) });
              paramInt1 = 1;
            }
          }
          label1052:
          paramInt1 = 1;
          continue;
          long l = paramIntent.getLongExtra("key_fav_result_local_id", -1L);
          if (-1L == l)
          {
            GMTrace.o(6359638605824L, 47383);
            return;
          }
          paramInt1 = this.lfu.cw(l);
          if (-1 == paramInt1)
          {
            GMTrace.o(6359638605824L, 47383);
            return;
          }
          this.ldv.removeFooterView(this.ldz);
          this.ldv.setSelection(paramInt1);
          GMTrace.o(6359638605824L, 47383);
          return;
          localObject1 = this.lfu.ex(false);
          paramIntent = paramIntent.getStringArrayExtra("key_fav_result_array");
          paramInt1 = paramInt2;
          if (!((List)localObject1).isEmpty())
          {
            paramInt1 = paramInt2;
            if (paramIntent != null)
            {
              paramInt1 = paramInt2;
              if (paramIntent.length > 0)
              {
                localObject2 = com.tencent.mm.ui.base.h.a(this.vKB.vKW, "", false, null);
                at.xB().A(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(6337761116160L, 47220);
                    x.a(localObject1, paramIntent);
                    af.t(new Runnable()
                    {
                      public final void run()
                      {
                        GMTrace.i(6414667874304L, 47793);
                        FavoriteIndexUI.4.this.lea.dismiss();
                        GMTrace.o(6414667874304L, 47793);
                      }
                      
                      public final String toString()
                      {
                        GMTrace.i(6414802092032L, 47794);
                        String str = super.toString() + "|batchAddFavTags";
                        GMTrace.o(6414802092032L, 47794);
                        return str;
                      }
                    });
                    GMTrace.o(6337761116160L, 47220);
                  }
                });
                g.ork.i(11125, new Object[] { Integer.valueOf(paramIntent.length), Integer.valueOf(2) });
                paramInt1 = paramInt2;
                continue;
                paramIntent = paramIntent.getStringExtra("Select_Conv_User");
                w.d("MicroMsg.FavoriteIndexUI", "select %s for sending", new Object[] { paramIntent });
                a(this.lfu.ex(false), (String)localObject1, paramIntent);
                paramInt1 = paramInt2;
                continue;
                paramIntent = paramIntent.getStringExtra("Select_Conv_User");
                w.d("MicroMsg.FavoriteIndexUI", "select %s for sending", new Object[] { paramIntent });
                localObject2 = new ArrayList();
                ((List)localObject2).add(this.lfz);
                a((List)localObject2, (String)localObject1, paramIntent);
                paramInt1 = paramInt2;
              }
            }
          }
        }
      }
    }
    if (1 == paramInt1)
    {
      com.tencent.mm.ui.base.h.bm(this.vKB.vKW, getString(R.l.dtt));
      GMTrace.o(6359638605824L, 47383);
      return;
    }
    if (3 == paramInt1)
    {
      Toast.makeText(this.vKB.vKW, getString(R.l.dva), 1).show();
      GMTrace.o(6359638605824L, 47383);
      return;
    }
    if (this.lfu.lfX) {
      ayJ();
    }
    GMTrace.o(6359638605824L, 47383);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(6357759557632L, 47369);
    this.ldC = this;
    w.i("MicroMsg.FavoriteIndexUI", "onCreate favoriteindex");
    super.onCreate(paramBundle);
    if (com.tencent.mm.plugin.favorite.h.axB().fTZ == null)
    {
      w.e("MicroMsg.FavoriteIndexUI", "onCreate favoriteindex, but favorite db is null ,return");
      finish();
      GMTrace.o(6357759557632L, 47369);
      return;
    }
    com.tencent.mm.plugin.favorite.h.axv().es(false);
    oM(R.l.dtO);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6371986636800L, 47475);
        if (FavoriteIndexUI.a(FavoriteIndexUI.this).lfX)
        {
          FavoriteIndexUI.b(FavoriteIndexUI.this);
          GMTrace.o(6371986636800L, 47475);
          return true;
        }
        FavoriteIndexUI.this.finish();
        GMTrace.o(6371986636800L, 47475);
        return true;
      }
    });
    this.ldv.setOnItemLongClickListener(this.lfy);
    at.wS().a(438, this.lfx);
    at.wS().a(401, this.lfx);
    this.jGV = new l(this);
    a(11, R.l.cQk, R.k.cIG, new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(6375476297728L, 47501);
        FavoriteIndexUI.h(FavoriteIndexUI.this);
        GMTrace.o(6375476297728L, 47501);
        return true;
      }
    });
    this.lfv = new com.tencent.mm.plugin.favorite.ui.base.b();
    paramBundle = this.lfv;
    View localView = findViewById(R.h.byQ);
    paramBundle.lgw = false;
    paramBundle.lgx = localView;
    this.lfv.lgD = new b.a()
    {
      public final void ayD()
      {
        GMTrace.i(6319104851968L, 47081);
        com.tencent.mm.ui.base.h.a(FavoriteIndexUI.this.vKB.vKW, FavoriteIndexUI.this.getString(R.l.dsU), "", new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(6441914073088L, 47996);
            paramAnonymous2DialogInterface = FavoriteIndexUI.a(FavoriteIndexUI.this).ex(true);
            FavoriteIndexUI.a(FavoriteIndexUI.this, paramAnonymous2DialogInterface);
            g.ork.i(11125, new Object[] { Integer.valueOf(paramAnonymous2DialogInterface.size()), Integer.valueOf(3) });
            if (FavoriteIndexUI.a(FavoriteIndexUI.this).lfX) {
              FavoriteIndexUI.b(FavoriteIndexUI.this);
            }
            GMTrace.o(6441914073088L, 47996);
          }
        }, null);
        GMTrace.o(6319104851968L, 47081);
      }
      
      public final void ayL()
      {
        GMTrace.i(6318970634240L, 47080);
        if (!x.a(FavoriteIndexUI.a(FavoriteIndexUI.this).ex(false), FavoriteIndexUI.this, new DialogInterface.OnClickListener()
        {
          public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
          {
            GMTrace.i(6464731086848L, 48166);
            FavoriteIndexUI.a(FavoriteIndexUI.this, 4105);
            GMTrace.o(6464731086848L, 48166);
          }
        }))
        {
          GMTrace.o(6318970634240L, 47080);
          return;
        }
        FavoriteIndexUI.a(FavoriteIndexUI.this, 4105);
        GMTrace.o(6318970634240L, 47080);
      }
      
      public final void ayM()
      {
        GMTrace.i(6319239069696L, 47082);
        if (FavoriteIndexUI.a(FavoriteIndexUI.this).ayT() <= 0)
        {
          GMTrace.o(6319239069696L, 47082);
          return;
        }
        if (FavoriteIndexUI.a(FavoriteIndexUI.this).ayT() > 1)
        {
          localObject = new Intent(FavoriteIndexUI.this.vKB.vKW, FavTagEditUI.class);
          ((Intent)localObject).putExtra("key_fav_scene", 3);
          FavoriteIndexUI.this.startActivityForResult((Intent)localObject, 4104);
          GMTrace.o(6319239069696L, 47082);
          return;
        }
        Object localObject = (j)FavoriteIndexUI.a(FavoriteIndexUI.this).ex(false).get(0);
        Intent localIntent = new Intent(FavoriteIndexUI.this.vKB.vKW, FavTagEditUI.class);
        localIntent.putExtra("key_fav_scene", 3);
        localIntent.putExtra("key_fav_item_id", ((j)localObject).field_localId);
        FavoriteIndexUI.this.startActivity(localIntent);
        if (FavoriteIndexUI.a(FavoriteIndexUI.this).lfX) {
          FavoriteIndexUI.b(FavoriteIndexUI.this);
        }
        GMTrace.o(6319239069696L, 47082);
      }
    };
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        ArrayList localArrayList = null;
        GMTrace.i(6320983900160L, 47095);
        long l = System.currentTimeMillis();
        Object localObject1 = com.tencent.mm.plugin.favorite.h.axB();
        Object localObject2 = "select " + com.tencent.mm.plugin.favorite.b.k.lbe + " from FavItemInfo where flag" + " =  -1 and itemStatus = 0 ";
        localObject1 = ((com.tencent.mm.plugin.favorite.b.k)localObject1).fTZ.a((String)localObject2, null, 2);
        if (localObject1 == null) {
          localArrayList = null;
        }
        while (localArrayList != null)
        {
          w.i("MicroMsg.FavoriteIndexUI", "initInvalidFavItem getInvalid favitems , size = %d,start time = %s", new Object[] { Integer.valueOf(localArrayList.size()), Long.valueOf(l) });
          if (localArrayList.size() == 0)
          {
            GMTrace.o(6320983900160L, 47095);
            return;
            if (((Cursor)localObject1).moveToFirst())
            {
              localArrayList = new ArrayList();
              do
              {
                localObject2 = new j();
                ((j)localObject2).b((Cursor)localObject1);
                localArrayList.add(localObject2);
              } while (((Cursor)localObject1).moveToNext());
            }
            ((Cursor)localObject1).close();
          }
          else
          {
            int j = localArrayList.size();
            int i = 0;
            while (i < j)
            {
              com.tencent.mm.plugin.favorite.h.axB().d((j)localArrayList.get(i));
              i += 1;
            }
            w.i("MicroMsg.FavoriteIndexUI", "initInvalidFavItem  cost time = %s", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
          }
        }
        GMTrace.o(6320983900160L, 47095);
      }
    });
    com.tencent.mm.plugin.favorite.b.c.axD().a(null);
    com.tencent.mm.pluginsdk.model.c.bJe();
    GMTrace.o(6357759557632L, 47369);
  }
  
  public void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
  {
    GMTrace.i(6358296428544L, 47373);
    q localq = new q();
    Object localObject = (AdapterView.AdapterContextMenuInfo)paramContextMenuInfo;
    localObject = this.lfu.nE(((AdapterView.AdapterContextMenuInfo)localObject).position - this.ldv.getHeaderViewsCount() - 1);
    switch (this.lft)
    {
    default: 
      super.onCreateContextMenu(paramContextMenu, paramView, paramContextMenuInfo);
      GMTrace.o(6358296428544L, 47373);
      return;
    }
    paramContextMenu.setHeaderTitle(R.l.cUG);
    boolean bool = localq.g((j)localObject);
    if (!bool) {
      paramContextMenu.add(0, 3, 0, R.l.duD);
    }
    if ((bool) && (x.s((j)localObject))) {
      paramContextMenu.add(0, 3, 0, R.l.duD);
    }
    paramContextMenu.add(0, 2, 0, R.l.dtk);
    paramContextMenu.add(0, 0, 0, R.l.dsT);
    paramContextMenu.add(0, 1, 0, R.l.duc);
    GMTrace.o(6358296428544L, 47373);
  }
  
  public boolean onCreateOptionsMenu(Menu paramMenu)
  {
    GMTrace.i(6359907041280L, 47385);
    MenuItem localMenuItem = paramMenu.add(0, 10, 0, R.l.eey);
    localMenuItem.setIcon(R.k.cIT);
    android.support.v4.view.m.a(localMenuItem, 2);
    boolean bool = super.onCreateOptionsMenu(paramMenu);
    GMTrace.o(6359907041280L, 47385);
    return bool;
  }
  
  protected void onDestroy()
  {
    GMTrace.i(6358027993088L, 47371);
    super.onDestroy();
    if (com.tencent.mm.plugin.favorite.h.axB().fTZ == null)
    {
      GMTrace.o(6358027993088L, 47371);
      return;
    }
    com.tencent.mm.plugin.favorite.h.axv().es(true);
    if (this.lfu != null) {
      this.lfu.finish();
    }
    km localkm = new km();
    localkm.eOE.type = 12;
    com.tencent.mm.sdk.b.a.vgX.m(localkm);
    at.wS().b(438, this.lfx);
    at.wS().b(401, this.lfx);
    GMTrace.o(6358027993088L, 47371);
  }
  
  public void onItemClick(AdapterView<?> paramAdapterView, View paramView, int paramInt, long paramLong)
  {
    GMTrace.i(6358564864000L, 47375);
    switch (this.lft)
    {
    }
    for (;;)
    {
      GMTrace.o(6358564864000L, 47375);
      return;
      if (this.lfu != null)
      {
        this.lfu.onItemClick(paramAdapterView, paramView, paramInt, paramLong);
        paramAdapterView = (a.b)paramView.getTag();
        if (paramAdapterView == null)
        {
          w.w("MicroMsg.FavoriteIndexUI", "on item click, holder is null..");
          GMTrace.o(6358564864000L, 47375);
          return;
        }
        if (paramAdapterView.lcn == null)
        {
          w.w("MicroMsg.FavoriteIndexUI", "on item click, info is null..");
          GMTrace.o(6358564864000L, 47375);
          return;
        }
        w.i("MicroMsg.FavoriteIndexUI", "click type is %d", new Object[] { Integer.valueOf(paramAdapterView.lcn.field_type) });
        g.ork.i(12746, new Object[] { Integer.valueOf(paramAdapterView.lcn.field_type), Integer.valueOf(0), Integer.valueOf(paramInt - 1) });
      }
    }
  }
  
  public boolean onKeyUp(int paramInt, KeyEvent paramKeyEvent)
  {
    GMTrace.i(6358162210816L, 47372);
    if ((4 == paramInt) && (this.lfu.lfX))
    {
      ayJ();
      GMTrace.o(6358162210816L, 47372);
      return true;
    }
    boolean bool = super.onKeyUp(paramInt, paramKeyEvent);
    GMTrace.o(6358162210816L, 47372);
    return bool;
  }
  
  public boolean onOptionsItemSelected(MenuItem paramMenuItem)
  {
    GMTrace.i(6360041259008L, 47386);
    if (paramMenuItem.getItemId() == 10)
    {
      paramMenuItem = new Intent(this.vKB.vKW, FavSearchUI.class);
      paramMenuItem.putExtra("key_enter_fav_search_from", 0);
      if (this.lfu.lfX)
      {
        paramMenuItem.putExtra("key_search_type", 2);
        startActivityForResult(paramMenuItem, 4103);
      }
      for (;;)
      {
        GMTrace.o(6360041259008L, 47386);
        return true;
        startActivity(paramMenuItem);
      }
    }
    boolean bool = super.onOptionsItemSelected(paramMenuItem);
    GMTrace.o(6360041259008L, 47386);
    return bool;
  }
  
  public void onRequestPermissionsResult(int paramInt, String[] paramArrayOfString, int[] paramArrayOfInt)
  {
    GMTrace.i(6360175476736L, 47387);
    w.i("MicroMsg.FavoriteIndexUI", "summerper onRequestPermissionsResult requestCode[%d],grantResults[%d] tid[%d]", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(paramArrayOfInt[0]), Long.valueOf(Thread.currentThread().getId()) });
    switch (paramInt)
    {
    }
    for (;;)
    {
      GMTrace.o(6360175476736L, 47387);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        startActivityForResult(new Intent(this, FavPostVoiceUI.class), 4102);
        overridePendingTransition(0, 0);
        GMTrace.o(6360175476736L, 47387);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dNr), "", getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6338297987072L, 47224);
          paramAnonymousDialogInterface.dismiss();
          FavoriteIndexUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(6338297987072L, 47224);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6317628456960L, 47070);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(6317628456960L, 47070);
        }
      });
      GMTrace.o(6360175476736L, 47387);
      return;
      if (paramArrayOfInt[0] == 0)
      {
        paramArrayOfString = new Intent();
        paramArrayOfString.putExtra("MMActivity.OverrideExitAnimation", R.a.aLE);
        paramArrayOfString.putExtra("MMActivity.OverrideEnterAnimation", R.a.aLs);
        paramArrayOfString.putExtra("map_view_type", 3);
        com.tencent.mm.plugin.favorite.c.hnH.a(paramArrayOfString, 4097, this);
        GMTrace.o(6360175476736L, 47387);
        return;
      }
      com.tencent.mm.ui.base.h.a(this, getString(R.l.dNq), "", getString(R.l.dFX), getString(R.l.cancel), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6321520771072L, 47099);
          paramAnonymousDialogInterface.dismiss();
          FavoriteIndexUI.this.startActivity(new Intent("android.settings.MANAGE_APPLICATIONS_SETTINGS"));
          GMTrace.o(6321520771072L, 47099);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(6375207862272L, 47499);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(6375207862272L, 47499);
        }
      });
    }
  }
  
  protected void onResume()
  {
    GMTrace.i(6359235952640L, 47380);
    long l = System.currentTimeMillis();
    super.onResume();
    this.ghS.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(6413057261568L, 47781);
        FavoriteIndexUI.this.ldB.ayW();
        GMTrace.o(6413057261568L, 47781);
      }
    });
    w.d("MicroMsg.FavoriteIndexUI", "on resume use %d ms", new Object[] { Long.valueOf(System.currentTimeMillis() - l) });
    GMTrace.o(6359235952640L, 47380);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\favorite\ui\FavoriteIndexUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */