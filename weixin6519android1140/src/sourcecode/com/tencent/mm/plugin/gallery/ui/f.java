package com.tencent.mm.plugin.gallery.ui;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.t;
import android.support.v7.widget.a.a.a;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.plugin.gallery.model.GalleryItem.MediaItem;
import com.tencent.mm.plugin.gallery.model.GalleryItem.VideoMediaItem;
import com.tencent.mm.plugin.gallery.model.l;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;

public final class f
  extends RecyclerView.a<a>
  implements View.OnClickListener
{
  private boolean lDF;
  c lER;
  private int lES;
  public ArrayList<String> lET;
  public b lEU;
  public int lEV;
  public int lEW;
  private int lEX;
  public int lEY;
  private Drawable lEZ;
  private ArrayList<String> lEn;
  android.support.v7.widget.a.a lFa;
  public Context mContext;
  
  public f(Context paramContext, ArrayList<String> paramArrayList, int paramInt, boolean paramBoolean)
  {
    GMTrace.i(15081777659904L, 112368);
    this.lET = new ArrayList();
    this.lEV = -1;
    this.lEW = -1;
    this.lFa = new android.support.v7.widget.a.a(new a.a()
    {
      int eWq;
      
      public final void a(Canvas paramAnonymousCanvas, RecyclerView paramAnonymousRecyclerView, RecyclerView.t paramAnonymoust, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, boolean paramAnonymousBoolean)
      {
        GMTrace.i(15102715625472L, 112524);
        super.a(paramAnonymousCanvas, paramAnonymousRecyclerView, paramAnonymoust, paramAnonymousFloat1 / 1.3F, paramAnonymousFloat2 / 1.3F, paramAnonymousInt, paramAnonymousBoolean);
        GMTrace.o(15102715625472L, 112524);
      }
      
      public final boolean a(RecyclerView.t paramAnonymoust1, RecyclerView.t paramAnonymoust2)
      {
        GMTrace.i(15102044536832L, 112519);
        int i = paramAnonymoust1.gd();
        int j = paramAnonymoust2.gd();
        f.this.Q(i, j);
        if (f.this.lEU != null) {
          f.this.lEU.cj(i, j);
        }
        f.this.lEW = j;
        GMTrace.o(15102044536832L, 112519);
        return false;
      }
      
      public final void c(RecyclerView paramAnonymousRecyclerView, RecyclerView.t paramAnonymoust)
      {
        GMTrace.i(15102312972288L, 112521);
        if (paramAnonymoust != null)
        {
          super.c(paramAnonymousRecyclerView, paramAnonymoust);
          paramAnonymousRecyclerView = AnimationUtils.loadAnimation(f.this.mContext, R.a.aLy);
          paramAnonymousRecyclerView.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymous2Animation)
            {
              GMTrace.i(15099091746816L, 112497);
              com.tencent.mm.plugin.gallery.a.a.swap(f.this.lET, f.this.lEV, f.this.lEW);
              if (f.this.lEU != null)
              {
                if ((f.1.this.eWq > f.this.lEV) && (f.1.this.eWq <= f.this.lEW))
                {
                  f.this.lEU.C(f.this.lEV, f.this.lEW, f.1.this.eWq - 1);
                  GMTrace.o(15099091746816L, 112497);
                  return;
                }
                if ((f.1.this.eWq < f.this.lEV) && (f.1.this.eWq >= f.this.lEW))
                {
                  f.this.lEU.C(f.this.lEV, f.this.lEW, f.1.this.eWq + 1);
                  GMTrace.o(15099091746816L, 112497);
                  return;
                }
                if (f.this.lEV == f.1.this.eWq)
                {
                  f.this.lEU.C(f.this.lEV, f.this.lEW, f.this.lEW);
                  GMTrace.o(15099091746816L, 112497);
                  return;
                }
                f.this.lEU.C(f.this.lEV, f.this.lEW, f.1.this.eWq);
              }
              GMTrace.o(15099091746816L, 112497);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymous2Animation)
            {
              GMTrace.i(15099225964544L, 112498);
              GMTrace.o(15099225964544L, 112498);
            }
            
            public final void onAnimationStart(Animation paramAnonymous2Animation)
            {
              GMTrace.i(15098957529088L, 112496);
              GMTrace.o(15098957529088L, 112496);
            }
          });
          ((f.a)paramAnonymoust).lFh.startAnimation(paramAnonymousRecyclerView);
        }
        GMTrace.o(15102312972288L, 112521);
      }
      
      public final void e(final RecyclerView.t paramAnonymoust, final int paramAnonymousInt)
      {
        GMTrace.i(15102178754560L, 112520);
        super.e(paramAnonymoust, paramAnonymousInt);
        if (paramAnonymoust != null)
        {
          Animation localAnimation = AnimationUtils.loadAnimation(f.this.mContext, R.a.aLz);
          localAnimation.setAnimationListener(new Animation.AnimationListener()
          {
            public final void onAnimationEnd(Animation paramAnonymous2Animation)
            {
              GMTrace.i(15100568141824L, 112508);
              if (paramAnonymousInt == 2)
              {
                paramAnonymous2Animation = f.this;
                f localf = f.this;
                int i = paramAnonymoust.gd();
                localf.lEW = i;
                paramAnonymous2Animation.lEV = i;
                f.1.this.eWq = f.this.lEY;
                w.i("MicroMsg.PreviewSelectedImageAdapter", "lastVisiblePos:%s", new Object[] { Integer.valueOf(f.1.this.eWq) });
              }
              GMTrace.o(15100568141824L, 112508);
            }
            
            public final void onAnimationRepeat(Animation paramAnonymous2Animation)
            {
              GMTrace.i(15100702359552L, 112509);
              GMTrace.o(15100702359552L, 112509);
            }
            
            public final void onAnimationStart(Animation paramAnonymous2Animation)
            {
              GMTrace.i(15100433924096L, 112507);
              GMTrace.o(15100433924096L, 112507);
            }
          });
          ((f.a)paramAnonymoust).lFh.startAnimation(localAnimation);
        }
        GMTrace.o(15102178754560L, 112520);
      }
      
      public final int hf()
      {
        GMTrace.i(15102849843200L, 112525);
        GMTrace.o(15102849843200L, 112525);
        return 3342387;
      }
      
      public final boolean hh()
      {
        GMTrace.i(15102984060928L, 112526);
        GMTrace.o(15102984060928L, 112526);
        return true;
      }
      
      public final boolean hi()
      {
        GMTrace.i(15103118278656L, 112527);
        GMTrace.o(15103118278656L, 112527);
        return false;
      }
      
      public final float hl()
      {
        GMTrace.i(15102581407744L, 112523);
        GMTrace.o(15102581407744L, 112523);
        return 0.295858F;
      }
      
      public final void hm()
      {
        GMTrace.i(15102447190016L, 112522);
        GMTrace.o(15102447190016L, 112522);
      }
    });
    this.mContext = paramContext;
    this.lEn = paramArrayList;
    this.lET.addAll(paramArrayList);
    this.lES = paramInt;
    this.lDF = paramBoolean;
    this.lEZ = paramContext.getResources().getDrawable(R.g.divider);
    GMTrace.o(15081777659904L, 112368);
  }
  
  private GalleryItem.MediaItem a(int paramInt, a parama)
  {
    GMTrace.i(15082448748544L, 112373);
    if ((paramInt < 0) || (paramInt >= this.lET.size()))
    {
      w.w("MicroMsg.PreviewSelectedImageAdapter", "error position %d, imagePaths size %d", new Object[] { Integer.valueOf(paramInt), Integer.valueOf(this.lET.size()) });
      GMTrace.o(15082448748544L, 112373);
      return null;
    }
    Object localObject = (String)this.lET.get(paramInt);
    if (this.lDF)
    {
      if (this.lER.lCi == null) {
        break label330;
      }
      localObject = GalleryItem.MediaItem.a(0, 0L, (String)localObject, (String)localObject, "");
      paramInt = this.lER.lCi.indexOf(localObject);
      if (paramInt >= 0)
      {
        parama.lFi = paramInt;
        parama = (GalleryItem.MediaItem)this.lER.lCi.get(paramInt);
      }
    }
    for (;;)
    {
      GMTrace.o(15082448748544L, 112373);
      return parama;
      Iterator localIterator = com.tencent.mm.plugin.gallery.model.c.aCQ().iterator();
      for (;;)
      {
        if (localIterator.hasNext())
        {
          parama = (GalleryItem.MediaItem)localIterator.next();
          if (parama.equals(localObject))
          {
            w.i("MicroMsg.PreviewSelectedImageAdapter", "[getMediaItem] %s", new Object[] { parama.gVn });
            break;
          }
        }
      }
      parama = null;
      continue;
      if (com.tencent.mm.plugin.gallery.model.c.aCN() != null)
      {
        localObject = GalleryItem.MediaItem.a(0, 0L, (String)localObject, (String)localObject, "");
        paramInt = com.tencent.mm.plugin.gallery.model.c.aCN().indexOf(localObject);
        if (paramInt >= 0)
        {
          parama = (GalleryItem.MediaItem)com.tencent.mm.plugin.gallery.model.c.aCN().get(paramInt);
        }
        else
        {
          localIterator = com.tencent.mm.plugin.gallery.model.c.aCQ().iterator();
          for (;;)
          {
            if (localIterator.hasNext())
            {
              parama = (GalleryItem.MediaItem)localIterator.next();
              if (parama.equals(localObject))
              {
                w.i("MicroMsg.PreviewSelectedImageAdapter", "[getMediaItem] %s", new Object[] { parama.gVn });
                break;
              }
            }
          }
          parama = null;
        }
      }
      else
      {
        parama = GalleryItem.MediaItem.a(1, 0L, (String)localObject, (String)localObject, "");
        continue;
        label330:
        parama = null;
      }
    }
  }
  
  private void a(final a parama, int paramInt)
  {
    GMTrace.i(15081911877632L, 112369);
    GalleryItem.MediaItem localMediaItem = a(paramInt, parama);
    if (localMediaItem == null)
    {
      w.e("MicroMsg.PreviewSelectedImageAdapter", "get item failed");
      GMTrace.o(15081911877632L, 112369);
      return;
    }
    Object localObject = parama.lFh.getLayoutParams();
    int i = this.lES;
    ((ViewGroup.LayoutParams)localObject).width = i;
    ((ViewGroup.LayoutParams)localObject).height = i;
    c(parama.lCv, localMediaItem.gVn, paramInt);
    parama.lFh.setOnClickListener(this);
    if (this.lDF)
    {
      parama.lFh.setTag(Integer.valueOf(parama.lFi));
      if (localMediaItem.getType() != 2) {
        break label257;
      }
      parama.lCx.setVisibility(0);
      i = Math.round((float)((GalleryItem.VideoMediaItem)localMediaItem).gVq / 1000.0F);
      parama.lCy.setText(String.format(Locale.CHINA, "%d:%02d", new Object[] { Integer.valueOf(i / 60), Integer.valueOf(i % 60) }));
    }
    String str;
    for (;;)
    {
      localObject = localMediaItem.aDc();
      str = localMediaItem.gVn;
      if ((!bg.nm((String)localObject)) || (!bg.nm(str))) {
        break label269;
      }
      w.e("MicroMsg.PreviewSelectedImageAdapter", "null or nil filepath: " + paramInt);
      GMTrace.o(15081911877632L, 112369);
      return;
      parama.lFh.setTag(localMediaItem.gVn);
      break;
      label257:
      parama.lCx.setVisibility(8);
    }
    label269:
    h.a(parama.lCw, localMediaItem.getType(), (String)localObject, str, localMediaItem.lBE, this.lES, new h.a()
    {
      public final void aDu()
      {
        GMTrace.i(15092112424960L, 112445);
        w.i("MicroMsg.PreviewSelectedImageAdapter", "%s %s", new Object[] { Integer.valueOf(parama.lCw.getWidth()), Integer.valueOf(parama.lCw.getHeight()) });
        GMTrace.o(15092112424960L, 112445);
      }
    });
    if (((com.tencent.mm.plugin.gallery.model.c.aCL().aDo() == 3) || (com.tencent.mm.plugin.gallery.model.c.aCL().aDo() == 11)) && (localMediaItem != null) && (localMediaItem.mMimeType.equalsIgnoreCase("image/gif")))
    {
      parama.lCD.setVisibility(0);
      if (!localMediaItem.mMimeType.equalsIgnoreCase("edit")) {
        break label403;
      }
      parama.lCE.setVisibility(0);
    }
    for (;;)
    {
      parama.lFg.setVisibility(8);
      GMTrace.o(15081911877632L, 112369);
      return;
      parama.lCD.setVisibility(8);
      break;
      label403:
      parama.lCE.setVisibility(8);
    }
  }
  
  private void c(ImageView paramImageView, String paramString, int paramInt)
  {
    GMTrace.i(15082046095360L, 112370);
    if ((paramInt == this.lEY) && (this.lEn.contains(paramString)))
    {
      w.i("MicroMsg.PreviewSelectedImageAdapter", "show select box");
      paramImageView.setVisibility(0);
      paramImageView.setBackground(null);
      paramImageView.setImageDrawable(this.lEZ);
    }
    while (this.lEX == paramInt) {
      if ((!bg.nm(this.lER.iH(this.lEX))) && (this.lER.iH(this.lEX).equals(paramString)))
      {
        paramImageView.setVisibility(0);
        GMTrace.o(15082046095360L, 112370);
        return;
        if ((paramInt == this.lEY) && (!this.lEn.contains(paramString)))
        {
          w.i("MicroMsg.PreviewSelectedImageAdapter", "no show select box");
          paramImageView.setVisibility(0);
          paramImageView.setBackgroundColor(-1090519041);
          paramImageView.setImageDrawable(this.lEZ);
        }
        else if ((paramInt != this.lEY) && (this.lEn.contains(paramString)))
        {
          paramImageView.setVisibility(8);
          paramImageView.setBackground(null);
          paramImageView.setImageDrawable(null);
        }
        else if ((paramInt != this.lEY) && (!this.lEn.contains(paramString)))
        {
          paramImageView.setVisibility(0);
          paramImageView.setBackgroundColor(-1090519041);
          paramImageView.setImageDrawable(null);
        }
      }
      else if ((!bg.nm(this.lER.iH(this.lEX))) && (!this.lER.iH(this.lEX).equals(paramString)))
      {
        paramImageView.setVisibility(8);
      }
    }
    GMTrace.o(15082046095360L, 112370);
  }
  
  public final void ck(int paramInt1, int paramInt2)
  {
    GMTrace.i(15299881467904L, 113993);
    this.lEY = paramInt1;
    this.lEX = paramInt2;
    GMTrace.o(15299881467904L, 113993);
  }
  
  public final int getItemCount()
  {
    GMTrace.i(15082180313088L, 112371);
    int i = this.lET.size();
    GMTrace.o(15082180313088L, 112371);
    return i;
  }
  
  public final void onClick(View paramView)
  {
    GMTrace.i(15082314530816L, 112372);
    if (this.lEU != null)
    {
      if (this.lDF)
      {
        this.lEU.ow(((Integer)paramView.getTag()).intValue());
        GMTrace.o(15082314530816L, 112372);
        return;
      }
      this.lEU.ow(this.lET.indexOf(paramView.getTag()));
    }
    GMTrace.o(15082314530816L, 112372);
  }
  
  public static final class a
    extends RecyclerView.t
  {
    public ImageView lCC;
    public ImageView lCD;
    public ImageView lCE;
    public ImageView lCv;
    public ImageView lCw;
    public RelativeLayout lCx;
    public TextView lCy;
    public ImageView lFg;
    public View lFh;
    public int lFi;
    
    public a(View paramView)
    {
      super();
      GMTrace.i(15092380860416L, 112447);
      this.lFh = paramView;
      this.lCD = ((ImageView)paramView.findViewById(R.h.bFn));
      this.lCE = ((ImageView)paramView.findViewById(R.h.bvz));
      this.lFg = ((ImageView)paramView.findViewById(R.h.bxd));
      this.lCv = ((ImageView)paramView.findViewById(R.h.bMG));
      this.lCw = ((ImageView)paramView.findViewById(R.h.bMJ));
      this.lCx = ((RelativeLayout)paramView.findViewById(R.h.ckr));
      this.lCy = ((TextView)paramView.findViewById(R.h.cks));
      this.lCC = ((ImageView)paramView.findViewById(R.h.bME));
      this.lCC.setBackgroundResource(R.e.aNW);
      this.lCC.setVisibility(8);
      GMTrace.o(15092380860416L, 112447);
    }
  }
  
  public static abstract interface b
  {
    public abstract void C(int paramInt1, int paramInt2, int paramInt3);
    
    public abstract void cj(int paramInt1, int paramInt2);
    
    public abstract void ow(int paramInt);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\gallery\ui\f.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */