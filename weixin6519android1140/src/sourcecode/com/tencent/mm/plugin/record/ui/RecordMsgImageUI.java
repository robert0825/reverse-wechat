package com.tencent.mm.plugin.record.ui;

import android.app.Dialog;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Build.VERSION;
import android.os.Bundle;
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
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.R.l;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.g.a.mm.a;
import com.tencent.mm.plugin.messenger.a.d;
import com.tencent.mm.plugin.record.a.g;
import com.tencent.mm.plugin.record.a.i;
import com.tencent.mm.plugin.record.a.i.a;
import com.tencent.mm.plugin.record.a.j;
import com.tencent.mm.plugin.record.a.m;
import com.tencent.mm.plugin.record.a.s;
import com.tencent.mm.pluginsdk.model.e;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.sdk.b.b;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.ad;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.base.n;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.c;
import com.tencent.mm.ui.tools.MMGestureGallery.f;
import com.tencent.mm.ui.tools.l;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

@com.tencent.mm.ui.base.a(3)
public class RecordMsgImageUI
  extends MMActivity
  implements i.a
{
  private long eDr;
  private l iok;
  private MMGestureGallery jFH;
  private List<th> jtR;
  private p.d krF;
  private Runnable ldG;
  private Map<String, mm> lef;
  private com.tencent.mm.sdk.b.c leg;
  private j oik;
  private a oir;
  private int ois;
  private String oit;
  
  public RecordMsgImageUI()
  {
    GMTrace.i(7532164677632L, 56119);
    this.jtR = new LinkedList();
    this.ois = 0;
    this.eDr = -1L;
    this.oit = null;
    this.lef = new HashMap();
    this.krF = new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(7521964130304L, 56043);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(7521964130304L, 56043);
          return;
          RecordMsgImageUI.f(RecordMsgImageUI.this);
          GMTrace.o(7521964130304L, 56043);
          return;
          paramAnonymousMenuItem = RecordMsgImageUI.this;
          Object localObject = new cf();
          e.a((cf)localObject, paramAnonymousMenuItem.getIntent().getIntExtra("key_favorite_source_type", 1), paramAnonymousMenuItem.bbb());
          ((cf)localObject).eDv.eDC = 10;
          ((cf)localObject).eDv.activity = paramAnonymousMenuItem;
          com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
          GMTrace.o(7521964130304L, 56043);
          return;
          RecordMsgImageUI.g(RecordMsgImageUI.this);
          GMTrace.o(7521964130304L, 56043);
          return;
          paramAnonymousMenuItem = RecordMsgImageUI.h(RecordMsgImageUI.this);
          if (bg.nm(paramAnonymousMenuItem))
          {
            GMTrace.o(7521964130304L, 56043);
            return;
          }
          paramAnonymousMenuItem = (mm)RecordMsgImageUI.i(RecordMsgImageUI.this).get(paramAnonymousMenuItem);
          if (paramAnonymousMenuItem != null)
          {
            localObject = new bz();
            ((bz)localObject).eDf.activity = RecordMsgImageUI.this;
            ((bz)localObject).eDf.eBB = paramAnonymousMenuItem.eRt.result;
            ((bz)localObject).eDf.eDg = paramAnonymousMenuItem.eRt.eDg;
            ((bz)localObject).eDf.eDi = 8;
            RecordMsgImageUI.a(RecordMsgImageUI.this, (bz)localObject);
            ((bz)localObject).eDf.eDh = paramAnonymousMenuItem.eRt.eDh;
            if (RecordMsgImageUI.this.getIntent() != null) {
              ((bz)localObject).eDf.eDm = RecordMsgImageUI.this.getIntent().getBundleExtra("_stat_obj");
            }
            com.tencent.mm.sdk.b.a.vgX.m((b)localObject);
          }
        }
      }
    };
    this.ldG = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7526527533056L, 56077);
        RecordMsgImageUI.a(RecordMsgImageUI.this).notifyDataSetChanged();
        GMTrace.o(7526527533056L, 56077);
      }
    };
    this.leg = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(7532164677632L, 56119);
  }
  
  public final void a(int paramInt, g paramg)
  {
    GMTrace.i(7533104201728L, 56126);
    Iterator localIterator = this.jtR.iterator();
    while (localIterator.hasNext()) {
      if (((th)localIterator.next()).lhq.equals(paramg.field_dataId))
      {
        af.t(this.ldG);
        GMTrace.o(7533104201728L, 56126);
        return;
      }
    }
    GMTrace.o(7533104201728L, 56126);
  }
  
  protected final void bH(View paramView)
  {
    GMTrace.i(7532835766272L, 56124);
    ad.d(ad.a(getWindow(), null), this.vKB.vKI);
    ((ViewGroup)this.vKB.vKI.getParent()).removeView(this.vKB.vKI);
    ((ViewGroup)getWindow().getDecorView()).addView(this.vKB.vKI, 0);
    GMTrace.o(7532835766272L, 56124);
  }
  
  final String bbb()
  {
    GMTrace.i(7532701548544L, 56123);
    int i = this.jFH.getSelectedItemPosition();
    if (-1 == i)
    {
      w.w("MicroMsg.ShowImageUI", "error position");
      GMTrace.o(7532701548544L, 56123);
      return null;
    }
    String str = m.c(this.oir.tj(i), this.eDr);
    w.d("MicroMsg.ShowImageUI", "cur pos %d path %s", new Object[] { Integer.valueOf(i), str });
    GMTrace.o(7532701548544L, 56123);
    return str;
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(7532298895360L, 56120);
    int i = R.i.cGC;
    GMTrace.o(7532298895360L, 56120);
    return i;
  }
  
  protected void onActivityResult(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(7532969984000L, 56125);
    if ((1001 == paramInt1) && (-1 == paramInt2))
    {
      if (paramIntent == null)
      {
        localObject = null;
        if (paramIntent != null) {
          break label64;
        }
      }
      label64:
      for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
      {
        if (!bg.nm((String)localObject)) {
          break label75;
        }
        GMTrace.o(7532969984000L, 56125);
        return;
        localObject = paramIntent.getStringExtra("Select_Conv_User");
        break;
      }
      label75:
      final Object localObject = bg.g(((String)localObject).split(","));
      if (bg.cc((List)localObject))
      {
        w.w("MicroMsg.ShowImageUI", "want to send record msg, but toUser is null");
        GMTrace.o(7532969984000L, 56125);
        return;
      }
      final Runnable local10 = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7557531828224L, 56308);
          this.lea.dismiss();
          GMTrace.o(7557531828224L, 56308);
        }
      };
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(7559008223232L, 56319);
          Iterator localIterator = localObject.iterator();
          while (localIterator.hasNext())
          {
            String str = (String)localIterator.next();
            d.aOe().a(RecordMsgImageUI.this.vKB.vKW, str, RecordMsgImageUI.j(RecordMsgImageUI.this), 0, "", "");
            d.aOe().cR(paramIntent, str);
          }
          af.t(local10);
          GMTrace.o(7559008223232L, 56319);
        }
        
        public final String toString()
        {
          GMTrace.i(7559142440960L, 56320);
          String str = super.toString() + "|onActivityResult";
          GMTrace.o(7559142440960L, 56320);
          return str;
        }
      });
      GMTrace.o(7532969984000L, 56125);
      return;
    }
    super.onActivityResult(paramInt1, paramInt2, paramIntent);
    GMTrace.o(7532969984000L, 56125);
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(7532433113088L, 56121);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(1024, 1024);
    }
    this.oik = new j();
    this.eDr = getIntent().getLongExtra("message_id", -1L);
    paramBundle = getIntent().getStringExtra("record_data_id");
    Object localObject = m.Fw(getIntent().getStringExtra("record_xml"));
    if (localObject == null)
    {
      w.w("MicroMsg.ShowImageUI", "get record msg data error, empty");
      finish();
      GMTrace.o(7532433113088L, 56121);
      return;
    }
    localObject = ((com.tencent.mm.protocal.b.a.c)localObject).glr.iterator();
    while (((Iterator)localObject).hasNext())
    {
      th localth = (th)((Iterator)localObject).next();
      if (localth.aGU == 2)
      {
        this.jtR.add(localth);
        if (localth.lhq.equals(paramBundle)) {
          this.ois = (this.jtR.size() - 1);
        }
      }
    }
    if (this.jtR.isEmpty())
    {
      w.w("MicroMsg.ShowImageUI", "get image data error, empty");
      finish();
      GMTrace.o(7532433113088L, 56121);
      return;
    }
    this.jFH = ((MMGestureGallery)findViewById(R.h.bCs));
    this.jFH.setVerticalFadingEdgeEnabled(false);
    this.jFH.setHorizontalFadingEdgeEnabled(false);
    this.oir = new a((byte)0);
    this.oir.jtR = this.jtR;
    this.oir.eDr = this.eDr;
    this.oir.oik = this.oik;
    this.jFH.setAdapter(this.oir);
    this.jFH.setSelection(this.ois);
    this.jFH.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
    {
      public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(7520756170752L, 56034);
        if (m.d(RecordMsgImageUI.a(RecordMsgImageUI.this).tj(paramAnonymousInt), RecordMsgImageUI.b(RecordMsgImageUI.this)))
        {
          RecordMsgImageUI.this.sq(String.format("%d/%d", new Object[] { Integer.valueOf(paramAnonymousInt + 1), Integer.valueOf(RecordMsgImageUI.c(RecordMsgImageUI.this).size()) }));
          RecordMsgImageUI.this.lf(true);
          GMTrace.o(7520756170752L, 56034);
          return;
        }
        RecordMsgImageUI.this.lf(false);
        GMTrace.o(7520756170752L, 56034);
      }
      
      public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
      {
        GMTrace.i(7520890388480L, 56035);
        GMTrace.o(7520890388480L, 56035);
      }
    });
    this.jFH.xhF = new MMGestureGallery.f()
    {
      public final void alM()
      {
        GMTrace.i(7562497884160L, 56345);
        RecordMsgImageUI.this.finish();
        GMTrace.o(7562497884160L, 56345);
      }
    };
    this.jFH.xhG = new MMGestureGallery.c()
    {
      public final void ayF()
      {
        GMTrace.i(7556860739584L, 56303);
        RecordMsgImageUI.d(RecordMsgImageUI.this);
        GMTrace.o(7556860739584L, 56303);
      }
    };
    lc(true);
    a(new MenuItem.OnMenuItemClickListener()
    {
      public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
      {
        GMTrace.i(7528272363520L, 56090);
        RecordMsgImageUI.this.finish();
        GMTrace.o(7528272363520L, 56090);
        return true;
      }
    });
    s.baL().a(this);
    com.tencent.mm.sdk.b.a.vgX.b(this.leg);
    GMTrace.o(7532433113088L, 56121);
  }
  
  protected void onDestroy()
  {
    GMTrace.i(7532567330816L, 56122);
    s.baL().b(this);
    this.oik.destory();
    com.tencent.mm.sdk.b.a.vgX.c(this.leg);
    super.onDestroy();
    GMTrace.o(7532567330816L, 56122);
  }
  
  private static final class a
    extends BaseAdapter
  {
    long eDr;
    List<th> jtR;
    j oik;
    
    private a()
    {
      GMTrace.i(7553639514112L, 56279);
      this.jtR = new LinkedList();
      this.eDr = -1L;
      GMTrace.o(7553639514112L, 56279);
    }
    
    public final int getCount()
    {
      GMTrace.i(7553773731840L, 56280);
      int i = this.jtR.size();
      GMTrace.o(7553773731840L, 56280);
      return i;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(7554042167296L, 56282);
      long l = paramInt;
      GMTrace.o(7554042167296L, 56282);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(7554176385024L, 56283);
      j localj = this.oik;
      th localth = tj(paramInt);
      long l = this.eDr;
      Object localObject = localj.a(localth, l, false, false);
      if (localObject == null)
      {
        boolean bool = localj.a(localth, l);
        w.d("MicroMsg.RecordMsgImgService", "get image fail, try download, can retry:%B", new Object[] { Boolean.valueOf(bool) });
        m.a(localth, l, bool);
      }
      if (localObject == null)
      {
        w.w("MicroMsg.ShowImageUI", "get image fail");
        if (paramView != null)
        {
          localObject = paramView;
          if (!(paramView instanceof MultiTouchImageView)) {}
        }
        else
        {
          localObject = View.inflate(paramViewGroup.getContext(), R.i.cGD, null);
        }
        ((ImageView)((View)localObject).findViewById(R.h.bGN)).setImageResource(R.k.cLY);
        ((View)localObject).setLayoutParams(new Gallery.LayoutParams(-1, -1));
        GMTrace.o(7554176385024L, 56283);
        return (View)localObject;
      }
      paramViewGroup = paramViewGroup.getContext();
      if ((paramView == null) || (!(paramView instanceof MultiTouchImageView))) {
        paramView = new MultiTouchImageView(paramViewGroup, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
      }
      for (;;)
      {
        k.i(paramView, ((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        paramView.setImageBitmap((Bitmap)localObject);
        paramView.wgM = true;
        GMTrace.o(7554176385024L, 56283);
        return paramView;
        paramView = (MultiTouchImageView)paramView;
        paramView.eo(((Bitmap)localObject).getWidth(), ((Bitmap)localObject).getHeight());
      }
    }
    
    public final th tj(int paramInt)
    {
      GMTrace.i(7553907949568L, 56281);
      th localth = (th)this.jtR.get(paramInt);
      GMTrace.o(7553907949568L, 56281);
      return localth;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\RecordMsgImageUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */