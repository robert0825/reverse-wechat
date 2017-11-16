package com.tencent.mm.plugin.subapp.ui.gallery;

import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory.Options;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.MenuItem;
import android.view.MenuItem.OnMenuItemClickListener;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.Gallery.LayoutParams;
import android.widget.LinearLayout.LayoutParams;
import android.widget.ProgressBar;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.c;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.g.a.ak;
import com.tencent.mm.g.a.bz;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.kb;
import com.tencent.mm.g.a.mk;
import com.tencent.mm.g.a.mm;
import com.tencent.mm.plugin.gif.MMAnimateView;
import com.tencent.mm.plugin.sns.b.l;
import com.tencent.mm.pluginsdk.m;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.sdk.platformtools.MMNativeJpeg;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.h.c;
import com.tencent.mm.ui.base.p.c;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.ui.base.u;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.c;
import com.tencent.mm.ui.tools.MMGestureGallery.f;
import com.tencent.mm.ui.widget.f;
import com.tencent.mm.ui.widget.f.a;
import com.tencent.mm.y.at;
import com.tencent.mm.y.w.b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@com.tencent.mm.ui.base.a(3)
public class GestureGalleryUI
  extends MMActivity
  implements w.b
{
  private String gmT;
  private MMGestureGallery lYd;
  private com.tencent.mm.y.w lYi;
  private List<String> lYj;
  private int lYk;
  private AdapterView.OnItemSelectedListener lYl;
  private com.tencent.mm.sdk.b.c leg;
  private volatile String pSk;
  private String pSn;
  private com.tencent.mm.sdk.b.c pSq;
  private a qtd;
  private String qte;
  private boolean qtf;
  private f qtg;
  private volatile boolean qth;
  private int qti;
  private int qtj;
  private int qtk;
  private final Set<Integer> qtl;
  private final Set<Integer> qtm;
  private int type;
  
  public GestureGalleryUI()
  {
    GMTrace.i(5823036129280L, 43385);
    this.qtf = false;
    this.gmT = null;
    this.qtl = new HashSet();
    this.qtm = new HashSet();
    this.lYj = new ArrayList();
    this.type = 0;
    this.lYk = -1;
    this.lYl = new AdapterView.OnItemSelectedListener()
    {
      public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
      {
        GMTrace.i(14310696812544L, 106623);
        GestureGalleryUI.a(GestureGalleryUI.this, paramAnonymousInt);
        GestureGalleryUI.this.sq(GestureGalleryUI.j(GestureGalleryUI.this) + 1 + " / " + GestureGalleryUI.k(GestureGalleryUI.this).size());
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GestureGalleryUI", "pos:" + paramAnonymousInt);
        GestureGalleryUI.c(GestureGalleryUI.this, GestureGalleryUI.n(GestureGalleryUI.this).c((String)GestureGalleryUI.k(GestureGalleryUI.this).get(paramAnonymousInt), GestureGalleryUI.l(GestureGalleryUI.this), paramAnonymousInt, GestureGalleryUI.m(GestureGalleryUI.this)));
        if (bg.nm(GestureGalleryUI.b(GestureGalleryUI.this))) {
          GestureGalleryUI.c(GestureGalleryUI.this, (String)GestureGalleryUI.k(GestureGalleryUI.this).get(paramAnonymousInt));
        }
        GMTrace.o(14310696812544L, 106623);
      }
      
      public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
      {
        GMTrace.i(14310831030272L, 106624);
        GMTrace.o(14310831030272L, 106624);
      }
    };
    this.leg = new com.tencent.mm.sdk.b.c() {};
    this.pSq = new com.tencent.mm.sdk.b.c() {};
    GMTrace.o(5823036129280L, 43385);
  }
  
  protected final void MP()
  {
    GMTrace.i(5823975653376L, 43392);
    String str1 = bg.nl(getIntent().getStringExtra("nowUrl"));
    this.type = getIntent().getIntExtra("type", 0);
    Object localObject = getIntent().getStringArrayExtra("urlList");
    if ((localObject == null) || (localObject.length == 0))
    {
      localObject = bg.nl(getIntent().getStringExtra("htmlData"));
      i = 0;
    }
    while (i >= 0)
    {
      int j = ((String)localObject).indexOf("weixin://viewimage/", i);
      if (j >= 0)
      {
        i = ((String)localObject).indexOf("\"", j);
        if (i >= 0)
        {
          String str2 = ((String)localObject).substring(j + 19, i);
          com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GestureGalleryUI", "start:" + j + " end:" + i + " url:" + str2);
          this.lYj.add(str2);
          continue;
          this.lYj = Arrays.asList((Object[])localObject);
        }
      }
    }
    final int i = 0;
    for (;;)
    {
      if (i < this.lYj.size())
      {
        if (str1.equals(this.lYj.get(i))) {
          this.lYk = i;
        }
      }
      else
      {
        a(new MenuItem.OnMenuItemClickListener()
        {
          public final boolean onMenuItemClick(MenuItem paramAnonymousMenuItem)
          {
            GMTrace.i(5828807491584L, 43428);
            GestureGalleryUI.this.finish();
            GMTrace.o(5828807491584L, 43428);
            return true;
          }
        });
        this.qtd = new a();
        this.lYd = ((MMGestureGallery)findViewById(R.h.bCs));
        this.lYd.setVisibility(0);
        this.lYd.setVerticalFadingEdgeEnabled(false);
        this.lYd.setHorizontalFadingEdgeEnabled(false);
        this.lYd.setAdapter(this.qtd);
        this.lYd.setSelection(this.lYk);
        this.lYd.setOnItemSelectedListener(this.lYl);
        this.lYd.xhF = new MMGestureGallery.f()
        {
          public final void alM()
          {
            GMTrace.i(19558475759616L, 145722);
            GestureGalleryUI.this.finish();
            GMTrace.o(19558475759616L, 145722);
          }
        };
        i = getIntent().getIntExtra("nevNext", 1);
        this.lYd.xhG = new MMGestureGallery.c()
        {
          public final void ayF()
          {
            GMTrace.i(19558341541888L, 145721);
            if (1 == i)
            {
              GestureGalleryUI.a(GestureGalleryUI.this);
              GMTrace.o(19558341541888L, 145721);
              return;
            }
            if (2 == i)
            {
              String[] arrayOfString = GestureGalleryUI.this.vKB.vKW.getResources().getStringArray(R.c.aMw);
              com.tencent.mm.ui.base.h.a(GestureGalleryUI.this, null, arrayOfString, "", false, new h.c()
              {
                public final void hQ(int paramAnonymous2Int)
                {
                  GMTrace.i(5828136402944L, 43423);
                  switch (paramAnonymous2Int)
                  {
                  }
                  for (;;)
                  {
                    GMTrace.o(5828136402944L, 43423);
                    return;
                    GestureGalleryUI.a(GestureGalleryUI.this, GestureGalleryUI.b(GestureGalleryUI.this));
                    GMTrace.o(5828136402944L, 43423);
                    return;
                    GestureGalleryUI localGestureGalleryUI = GestureGalleryUI.this;
                    String str = GestureGalleryUI.b(GestureGalleryUI.this);
                    if ((str == null) || (str.length() == 0))
                    {
                      GMTrace.o(5828136402944L, 43423);
                      return;
                    }
                    Intent localIntent = new Intent();
                    localIntent.putExtra("Retr_File_Name", str);
                    localIntent.putExtra("Retr_Msg_Type", 0);
                    localIntent.putExtra("Retr_Compress_Type", 0);
                    com.tencent.mm.plugin.subapp.b.hnH.l(localIntent, localGestureGalleryUI.vKB.vKW);
                  }
                }
              });
            }
            GMTrace.o(19558341541888L, 145721);
          }
        };
        GMTrace.o(5823975653376L, 43392);
        return;
      }
      i += 1;
    }
  }
  
  public final void c(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(5823170347008L, 43386);
    if (this.qtd != null)
    {
      if (paramInt == this.lYd.getSelectedItemPosition())
      {
        this.qte = paramString2;
        com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GestureGalleryUI", "onDownSucc, curFilename:%s, url:%s", new Object[] { this.qte, paramString1 });
      }
      this.qtd.notifyDataSetChanged();
    }
    GMTrace.o(5823170347008L, 43386);
  }
  
  protected final int getLayoutId()
  {
    GMTrace.i(5823841435648L, 43391);
    int i = R.i.cEr;
    GMTrace.o(5823841435648L, 43391);
    return i;
  }
  
  public void onCreate(Bundle paramBundle)
  {
    GMTrace.i(5823304564736L, 43387);
    super.onCreate(paramBundle);
    if (Build.VERSION.SDK_INT >= 21) {
      getWindow().setFlags(1024, 1024);
    }
    lc(true);
    this.qtf = getIntent().getBooleanExtra("isFromWebView", false);
    this.qth = getIntent().getBooleanExtra("shouldShowScanQrCodeMenu", false);
    this.qtk = getIntent().getIntExtra("scanQrCodeGetA8KeyScene", 0);
    paramBundle = getIntent().getIntArrayExtra("scanCodeTypes");
    int i;
    if ((paramBundle != null) && (paramBundle.length > 0))
    {
      i = 0;
      while (i < paramBundle.length)
      {
        this.qtl.add(Integer.valueOf(paramBundle[i]));
        i += 1;
      }
    }
    paramBundle = getIntent().getIntArrayExtra("scanResultCodeTypes");
    if ((paramBundle != null) && (paramBundle.length > 0))
    {
      i = 0;
      while (i < paramBundle.length)
      {
        this.qtm.add(Integer.valueOf(paramBundle[i]));
        i += 1;
      }
    }
    this.gmT = getIntent().getStringExtra("cookie");
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GestureGalleryUI", "isFromWebView: %b, cookie = %s", new Object[] { Boolean.valueOf(this.qtf), this.gmT });
    this.lYi = new com.tencent.mm.y.w(this.qtf);
    paramBundle = this.lYi;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GetPicService", "addListener :" + hashCode());
    paramBundle.gmN = this;
    com.tencent.mm.sdk.b.a.vgX.b(this.leg);
    com.tencent.mm.sdk.b.a.vgX.b(this.pSq);
    MP();
    GMTrace.o(5823304564736L, 43387);
  }
  
  public void onDestroy()
  {
    GMTrace.i(5823438782464L, 43388);
    super.onDestroy();
    com.tencent.mm.y.w localw = this.lYi;
    com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GetPicService", "removeListener :" + hashCode());
    localw.gmN = null;
    this.lYi.Ax();
    com.tencent.mm.sdk.b.a.vgX.c(this.leg);
    com.tencent.mm.sdk.b.a.vgX.c(this.pSq);
    GMTrace.o(5823438782464L, 43388);
  }
  
  public void onPause()
  {
    GMTrace.i(5823573000192L, 43389);
    super.onPause();
    GMTrace.o(5823573000192L, 43389);
  }
  
  public void onResume()
  {
    GMTrace.i(5823707217920L, 43390);
    super.onResume();
    GMTrace.o(5823707217920L, 43390);
  }
  
  protected void onStop()
  {
    GMTrace.i(14307341369344L, 106598);
    super.onStop();
    if (this.pSn != null)
    {
      ak localak = new ak();
      localak.eBA.activity = this;
      localak.eBA.eBB = this.pSn;
      com.tencent.mm.sdk.b.a.vgX.m(localak);
      this.pSn = null;
      this.qtj = 0;
      this.qti = 0;
    }
    GMTrace.o(14307341369344L, 106598);
  }
  
  final class a
    extends BaseAdapter
  {
    public a()
    {
      GMTrace.i(5825854701568L, 43406);
      GMTrace.o(5825854701568L, 43406);
    }
    
    public final int getCount()
    {
      GMTrace.i(5825988919296L, 43407);
      com.tencent.mm.sdk.platformtools.w.d("MicroMsg.GestureGalleryUI", "lstpicurl:" + GestureGalleryUI.k(GestureGalleryUI.this).size());
      int i = GestureGalleryUI.k(GestureGalleryUI.this).size();
      GMTrace.o(5825988919296L, 43407);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(5826123137024L, 43408);
      GMTrace.o(5826123137024L, 43408);
      return Integer.valueOf(paramInt);
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(5826257354752L, 43409);
      long l = paramInt;
      GMTrace.o(5826257354752L, 43409);
      return l;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(5826391572480L, 43410);
      a locala;
      View localView;
      String str;
      if (paramView == null)
      {
        locala = new a();
        localView = View.inflate(GestureGalleryUI.this, R.i.cEs, null);
        locala.lYn = ((ProgressBar)localView.findViewById(R.h.bUy));
        locala.qtq = ((MMAnimateView)localView.findViewById(R.h.image));
        localView.setTag(locala);
        localView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        str = (String)GestureGalleryUI.k(GestureGalleryUI.this).get(paramInt);
        if (!com.tencent.mm.a.e.aZ(str)) {
          break label209;
        }
        label114:
        if (bg.nm(str)) {
          break label524;
        }
        locala.lYn.setVisibility(8);
        if (str != null) {
          break label241;
        }
        paramView = null;
        label139:
        if (!o.RH(str)) {
          break label421;
        }
      }
      for (;;)
      {
        try
        {
          locala.qtq.setLayoutParams(new LinearLayout.LayoutParams(-1, -1));
          locala.qtq.setVisibility(0);
          locala.qtq.zZ(str);
          GMTrace.o(5826391572480L, 43410);
          return localView;
          locala = (a)paramView.getTag();
          localView = paramView;
          break;
          label209:
          str = GestureGalleryUI.n(GestureGalleryUI.this).c(str, GestureGalleryUI.l(GestureGalleryUI.this), paramInt, GestureGalleryUI.m(GestureGalleryUI.this));
          break label114;
          label241:
          paramView = new BitmapFactory.Options();
          paramView.inJustDecodeBounds = true;
          paramView = BitmapFactory.decodeFile(str, paramView);
          if (paramView != null)
          {
            com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GestureGalleryUI", "recycle bitmap:%s", new Object[] { paramView.toString() });
            paramView.recycle();
          }
          paramView = com.tencent.mm.sdk.platformtools.d.RD(str);
          paramViewGroup = paramView;
          if (paramView == null)
          {
            paramViewGroup = paramView;
            if (MMNativeJpeg.IsJpegFile(str))
            {
              paramViewGroup = paramView;
              if (MMNativeJpeg.isProgressive(str))
              {
                paramViewGroup = MMNativeJpeg.decodeAsBitmap(str);
                if (paramViewGroup != null) {
                  continue;
                }
                bool = true;
                com.tencent.mm.sdk.platformtools.w.i("MicroMsg.GestureGalleryUI", "Progressive jpeg, result isNull:%b", new Object[] { Boolean.valueOf(bool) });
              }
            }
          }
          paramView = paramViewGroup;
          if (paramViewGroup != null) {
            break label139;
          }
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GestureGalleryUI", "getSuitableBmp fail, temBmp is null, filePath = " + str);
          paramView = null;
          break label139;
          boolean bool = false;
          continue;
        }
        catch (Exception paramViewGroup)
        {
          com.tencent.mm.sdk.platformtools.w.e("MicroMsg.GestureGalleryUI", bg.f(paramViewGroup));
          locala.qtq.setVisibility(0);
          locala.qtq.setImageBitmap(paramView);
          continue;
        }
        label421:
        if ((paramView != null) && (!paramView.isRecycled()))
        {
          locala.qtq.setVisibility(8);
          paramViewGroup = new MultiTouchImageView(GestureGalleryUI.this, paramView.getWidth(), paramView.getHeight());
          if (Build.VERSION.SDK_INT == 20) {
            paramViewGroup.setLayerType(1, null);
          }
          for (;;)
          {
            paramViewGroup.qbc = false;
            paramViewGroup.setLayoutParams(new Gallery.LayoutParams(-1, -1));
            paramViewGroup.setImageBitmap(paramView);
            GMTrace.o(5826391572480L, 43410);
            return paramViewGroup;
            com.tencent.mm.sdk.platformtools.k.i(paramViewGroup, paramView.getWidth(), paramView.getHeight());
          }
          label524:
          locala.lYn.setVisibility(0);
          locala.qtq.setVisibility(8);
        }
      }
    }
    
    final class a
    {
      ProgressBar lYn;
      MMAnimateView qtq;
      
      a()
      {
        GMTrace.i(5827196878848L, 43416);
        GMTrace.o(5827196878848L, 43416);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\subapp\ui\gallery\GestureGalleryUI.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */