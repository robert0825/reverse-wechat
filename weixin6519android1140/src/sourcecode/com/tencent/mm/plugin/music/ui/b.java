package com.tencent.mm.plugin.music.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.LinearGradient;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.PaintDrawable;
import android.graphics.drawable.ShapeDrawable.ShaderFactory;
import android.graphics.drawable.shapes.RectShape;
import android.os.Looper;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.Transformation;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.ao.a.a.c.a;
import com.tencent.mm.at.c;
import com.tencent.mm.plugin.music.a.d.a;
import com.tencent.mm.plugin.music.a.d.b;
import com.tencent.mm.plugin.music.a.h;
import com.tencent.mm.pluginsdk.ui.applet.CdnImageView;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.y.at;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map.Entry;
import java.util.Set;

public final class b
  extends com.tencent.mm.ui.base.e
  implements d.a
{
  int count;
  ae npF;
  public boolean nru;
  public final int nsE;
  public final int nsF;
  public HashMap<Integer, View> nsG;
  public com.tencent.mm.plugin.music.a.d nsH;
  public int nsI;
  public int scene;
  
  public b(Context paramContext, int paramInt, boolean paramBoolean)
  {
    super(paramContext);
    GMTrace.i(4873311485952L, 36309);
    this.nsE = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 26);
    this.nsF = com.tencent.mm.br.a.fromDPToPix(ab.getContext(), 260);
    this.npF = new ae(Looper.getMainLooper());
    this.nsG = new HashMap();
    this.nsH = new com.tencent.mm.plugin.music.a.d();
    this.nsH.npD = this;
    this.scene = paramInt;
    this.nru = paramBoolean;
    GMTrace.o(4873311485952L, 36309);
  }
  
  public final void B(final int paramInt, final long paramLong)
  {
    GMTrace.i(4873982574592L, 36314);
    af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(4868479647744L, 36273);
        View localView = (View)b.this.nsG.get(Integer.valueOf(paramInt));
        if (localView != null) {
          ((b.a)localView.getTag()).nsS.cU(paramLong);
        }
        GMTrace.o(4868479647744L, 36273);
      }
    });
    GMTrace.o(4873982574592L, 36314);
  }
  
  public final View a(View paramView, ViewGroup paramViewGroup, int paramInt)
  {
    GMTrace.i(4873579921408L, 36311);
    if (paramView == null)
    {
      paramView = LayoutInflater.from(this.context).inflate(R.i.cCG, paramViewGroup, false);
      paramViewGroup = new a();
      paramViewGroup.nsL = ((MusicItemLayout)paramView.findViewById(R.h.bPd));
      paramViewGroup.nsQ = ((TextView)paramView.findViewById(R.h.bPe));
      paramViewGroup.nsS = ((LyricView)paramView.findViewById(R.h.bLD));
      paramViewGroup.nsM = paramView.findViewById(R.h.bdC);
      paramViewGroup.nsN = paramView.findViewById(R.h.bdD);
      paramViewGroup.nsO = paramView.findViewById(R.h.bdE);
      paramViewGroup.nsP = ((CdnImageView)paramView.findViewById(R.h.bdB));
      paramViewGroup.nsR = ((TextView)paramView.findViewById(R.h.bPg));
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      Object localObject = h.aSs().npK;
      int j = (paramInt - 100000) % ((List)localObject).size();
      int i = j;
      if (j < 0) {
        i = j + ((List)localObject).size();
      }
      w.d("MicroMsg.Music.MusicMainAdapter", "play music index %d", new Object[] { Integer.valueOf(i) });
      localObject = h.aSt().DO((String)((List)localObject).get(i));
      this.nsG.put(Integer.valueOf(paramInt), paramView);
      paramViewGroup.h((com.tencent.mm.at.a)localObject, false);
      GMTrace.o(4873579921408L, 36311);
      return paramView;
      paramViewGroup = (a)paramView.getTag();
    }
  }
  
  public final void a(com.tencent.mm.at.a parama, int[] paramArrayOfInt)
  {
    GMTrace.i(4874116792320L, 36315);
    Iterator localIterator = this.nsG.entrySet().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)((View)((Map.Entry)localIterator.next()).getValue()).getTag();
      if (locala.eNq.field_musicId.equals(parama.field_musicId))
      {
        w.i("MicroMsg.Music.MusicMainAdapter", "onColorReady: %s", new Object[] { locala.eNq.field_songName });
        int i = paramArrayOfInt[0];
        int j = paramArrayOfInt[1];
        locala.nsL.setBackgroundColor(i);
        Object localObject = locala.nsS;
        ((LyricView)localObject).nsp.setColor(j);
        ((LyricView)localObject).nsp.setAlpha(255);
        ((LyricView)localObject).nsq.setColor(j);
        ((LyricView)localObject).nsq.setAlpha(127);
        locala.nsP.setBackgroundColor(i);
        localObject = new b.a.1(locala, i);
        PaintDrawable localPaintDrawable = new PaintDrawable();
        localPaintDrawable.setShape(new RectShape());
        localPaintDrawable.setShaderFactory((ShapeDrawable.ShaderFactory)localObject);
        locala.nsN.setBackgroundDrawable(localPaintDrawable);
        localObject = new b.a.2(locala, i & 0xFFFFFF | 0x55000000);
        localPaintDrawable = new PaintDrawable();
        localPaintDrawable.setShape(new RectShape());
        localPaintDrawable.setShaderFactory((ShapeDrawable.ShaderFactory)localObject);
        locala.nsO.setBackgroundDrawable(localPaintDrawable);
        locala.nsQ.setTextColor(j);
        locala.nsR.setTextColor(j);
        ((MusicMainUI)this.context).i(parama);
      }
    }
    GMTrace.o(4874116792320L, 36315);
  }
  
  public final int aTs()
  {
    GMTrace.i(4873848356864L, 36313);
    int i = h.aSs().npK.size();
    GMTrace.o(4873848356864L, 36313);
    return i;
  }
  
  public final int getCount()
  {
    GMTrace.i(4873445703680L, 36310);
    int i = this.count;
    GMTrace.o(4873445703680L, 36310);
    return i;
  }
  
  public final void rG(int paramInt)
  {
    GMTrace.i(4873714139136L, 36312);
    this.nsG.remove(Integer.valueOf(paramInt));
    GMTrace.o(4873714139136L, 36312);
  }
  
  public final class a
  {
    com.tencent.mm.at.a eNq;
    private int mode;
    MusicItemLayout nsL;
    View nsM;
    View nsN;
    View nsO;
    CdnImageView nsP;
    TextView nsQ;
    TextView nsR;
    LyricView nsS;
    public boolean nsT;
    private Animation.AnimationListener nsU;
    
    public a()
    {
      GMTrace.i(4882035638272L, 36374);
      this.mode = 1;
      this.nsU = new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(4874519445504L, 36318);
          b.a.this.nsT = false;
          GMTrace.o(4874519445504L, 36318);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(4874653663232L, 36319);
          GMTrace.o(4874653663232L, 36319);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(4874385227776L, 36317);
          GMTrace.o(4874385227776L, 36317);
        }
      };
      GMTrace.o(4882035638272L, 36374);
    }
    
    public final boolean aTt()
    {
      GMTrace.i(4882304073728L, 36376);
      if (this.mode == 2)
      {
        GMTrace.o(4882304073728L, 36376);
        return true;
      }
      GMTrace.o(4882304073728L, 36376);
      return false;
    }
    
    public final void aTu()
    {
      GMTrace.i(4882438291456L, 36377);
      if ((this.nsT) || (this.mode == 1))
      {
        GMTrace.o(4882438291456L, 36377);
        return;
      }
      com.tencent.mm.plugin.music.a.f.cz(3, b.this.scene);
      if (b.this.nsI == 0)
      {
        b.this.nsI = this.nsM.getMeasuredHeight();
        localObject = new LinearLayout.LayoutParams(-1, b.this.nsI);
        ((LinearLayout.LayoutParams)localObject).weight = 0.0F;
        this.nsM.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      com.tencent.mm.plugin.music.a.f.npU = true;
      com.tencent.mm.plugin.music.a.f.aSq();
      this.mode = 1;
      this.nsT = true;
      Object localObject = new a(this.nsS, b.this.nsE);
      ((a)localObject).setDuration(500L);
      ((a)localObject).setAnimationListener(this.nsU);
      this.nsS.startAnimation((Animation)localObject);
      GMTrace.o(4882438291456L, 36377);
    }
    
    public final void aTv()
    {
      GMTrace.i(4882572509184L, 36378);
      if ((this.nsT) || (this.mode == 2))
      {
        GMTrace.o(4882572509184L, 36378);
        return;
      }
      com.tencent.mm.plugin.music.a.f.cz(2, b.this.scene);
      if (b.this.nsI == 0)
      {
        b.this.nsI = this.nsM.getMeasuredHeight();
        localObject = new LinearLayout.LayoutParams(-1, b.this.nsI);
        ((LinearLayout.LayoutParams)localObject).weight = 0.0F;
        this.nsM.setLayoutParams((ViewGroup.LayoutParams)localObject);
      }
      com.tencent.mm.plugin.music.a.f.npU = true;
      com.tencent.mm.plugin.music.a.f.aSq();
      this.mode = 2;
      this.nsT = true;
      Object localObject = new a(this.nsS, b.this.nsF);
      ((a)localObject).setDuration(500L);
      ((a)localObject).setAnimationListener(this.nsU);
      this.nsS.startAnimation((Animation)localObject);
      GMTrace.o(4882572509184L, 36378);
    }
    
    public final void aTw()
    {
      GMTrace.i(4882706726912L, 36379);
      com.tencent.mm.plugin.music.a.f.npU = true;
      com.tencent.mm.plugin.music.a.f.aSq();
      if (this.mode == 1)
      {
        aTv();
        GMTrace.o(4882706726912L, 36379);
        return;
      }
      aTu();
      GMTrace.o(4882706726912L, 36379);
    }
    
    public final void h(com.tencent.mm.at.a parama, boolean paramBoolean)
    {
      GMTrace.i(4882169856000L, 36375);
      Object localObject1;
      boolean bool;
      label167:
      Object localObject2;
      label240:
      com.tencent.mm.plugin.music.a.d locald;
      CdnImageView localCdnImageView;
      Context localContext;
      if (parama != null)
      {
        w.i("MicroMsg.Music.MusicMainAdapter", "updateView %s", new Object[] { parama.field_songName });
        this.eNq = parama;
        if (bg.nm(parama.field_songHAlbumUrl))
        {
          localObject1 = h.aSs();
          bool = b.this.nru;
          if (parama != null)
          {
            if (((com.tencent.mm.plugin.music.a.e)localObject1).npO != null)
            {
              at.wS().c(((com.tencent.mm.plugin.music.a.e)localObject1).npO);
              ((com.tencent.mm.plugin.music.a.e)localObject1).npO = null;
            }
            if (parama.field_songId > 0) {
              break label445;
            }
            w.e("MicroMsg.Music.MusicPlayerManager", "can't get songId ");
            com.tencent.mm.plugin.report.service.g.ork.A(10911, "1");
          }
        }
        this.nsL.setTag(this);
        if (((!com.tencent.mm.plugin.music.a.g.b(parama)) || (b.this.scene == 3)) && (!bg.nm(parama.field_songSinger)))
        {
          this.nsR.setText(parama.field_songSinger);
          this.nsR.setVisibility(0);
          this.nsQ.setText(parama.field_songName);
          this.nsQ.setTag(parama.field_songName);
          localObject2 = this.nsS;
          localObject1 = h.aSt();
          bool = b.this.nru;
          if (((com.tencent.mm.plugin.music.a.g.a)localObject1).nsn.get(parama.field_musicId) == null) {
            break label487;
          }
          localObject1 = (com.tencent.mm.plugin.music.a.a)((com.tencent.mm.plugin.music.a.g.a)localObject1).nsn.get(parama.field_musicId);
          ((LyricView)localObject2).nso = ((com.tencent.mm.plugin.music.a.a)localObject1);
          ((LyricView)localObject2).invalidate();
          if ((!com.tencent.mm.plugin.music.a.g.b(parama)) || (b.this.nru)) {
            this.nsS.cU(1L);
          }
          aTu();
          locald = b.this.nsH;
          localCdnImageView = this.nsP;
          localContext = b.this.context;
          bool = b.this.nru;
          if (paramBoolean) {
            locald.fKi.remove(parama.field_musicId);
          }
          localObject1 = (Bitmap)locald.fKi.get(parama.field_musicId);
          if ((localObject1 == null) || (((Bitmap)localObject1).isRecycled())) {
            break label509;
          }
          w.i("MicroMsg.Music.MusicImageLoader", "hit cache %s", new Object[] { parama.field_musicId });
          localCdnImageView.setImageBitmap((Bitmap)localObject1);
          if (!parama.JL()) {
            break label499;
          }
          localObject1 = new int[2];
          localObject1[0] = parama.field_songBgColor;
          localObject1[1] = parama.field_songLyricColor;
        }
        for (;;)
        {
          if (locald.npD != null) {
            locald.npD.a(parama, (int[])localObject1);
          }
          GMTrace.o(4882169856000L, 36375);
          return;
          label445:
          ((com.tencent.mm.plugin.music.a.e)localObject1).npO = new com.tencent.mm.plugin.music.a.d.b(parama, bool);
          at.wS().a(((com.tencent.mm.plugin.music.a.e)localObject1).npO, 0);
          break;
          this.nsR.setVisibility(8);
          break label167;
          label487:
          localObject1 = ((com.tencent.mm.plugin.music.a.g.a)localObject1).g(parama, bool);
          break label240;
          label499:
          localObject1 = c.o((Bitmap)localObject1);
        }
        label509:
        localObject1 = null;
        localObject2 = null;
        w.i("MicroMsg.Music.MusicImageLoader", "no hit cache %s %s %s %s", new Object[] { parama.field_musicId, parama.field_songHAlbumUrl, parama.field_songAlbumUrl, parama.field_songAlbumLocalPath });
        localCdnImageView.setTag(parama);
        if (!parama.JM()) {
          break label754;
        }
        localObject1 = new c.a();
        ((c.a)localObject1).gKE = com.tencent.mm.plugin.music.a.g.c(parama, true);
        ((c.a)localObject1).gKC = true;
        ((c.a)localObject1).gKA = true;
        ((c.a)localObject1).gKR = R.g.aVU;
        if (bool)
        {
          ((c.a)localObject1).gKM = true;
          ((c.a)localObject1).gKN = 10;
        }
        com.tencent.mm.ao.n.Jd().a(parama.field_songHAlbumUrl, localCdnImageView, ((c.a)localObject1).Jn(), locald.npE);
        localObject1 = localObject2;
      }
      for (;;)
      {
        if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
        {
          locald.a(parama, (Bitmap)localObject1);
          localCdnImageView.setImageBitmap((Bitmap)localObject1);
          localObject2 = c.o((Bitmap)localObject1);
          localObject1 = parama;
          if (!parama.e((int[])localObject2)) {
            localObject1 = h.aSt().K(parama.field_musicId, localObject2[0], localObject2[1]);
          }
          if ((locald.npD != null) && (localObject1 != null)) {
            locald.npD.a((com.tencent.mm.at.a)localObject1, (int[])localObject2);
          }
        }
        GMTrace.o(4882169856000L, 36375);
        return;
        label754:
        switch (parama.field_musicType)
        {
        case 2: 
        case 3: 
        default: 
          localObject1 = localObject2;
          break;
        case 0: 
        case 5: 
        case 7: 
        case 10: 
        case 11: 
        case 4: 
        case 6: 
          for (;;)
          {
            localObject2 = localObject1;
            if (localObject1 == null) {
              localObject2 = com.tencent.mm.ao.n.IZ().a(parama.field_songAlbumLocalPath, com.tencent.mm.br.a.getDensity(localContext), false);
            }
            if (localObject2 == null) {
              break label968;
            }
            localObject1 = com.tencent.mm.sdk.platformtools.d.c((Bitmap)localObject2, 10);
            break;
            localObject1 = new c.a();
            ((c.a)localObject1).gKE = com.tencent.mm.plugin.music.a.g.c(parama, false);
            ((c.a)localObject1).gKC = true;
            ((c.a)localObject1).gKA = true;
            if (bool)
            {
              ((c.a)localObject1).gKM = true;
              ((c.a)localObject1).gKN = 10;
            }
            com.tencent.mm.ao.n.Jd().a(parama.field_songAlbumUrl, localCdnImageView, ((c.a)localObject1).Jn(), locald.npE);
            localObject1 = localObject2;
            break;
            localObject1 = com.tencent.mm.ao.n.IZ().a(parama.field_songAlbumLocalPath, com.tencent.mm.br.a.getDensity(localContext));
          }
          localCdnImageView.setImageResource(R.g.aVU);
          if ((!parama.JL()) && (locald.npD != null)) {
            locald.npD.a(parama, new int[] { -16777216, -1 });
          }
          w.i("MicroMsg.Music.MusicImageLoader", "field_songAlbumUrl:%s", new Object[] { parama.field_songAlbumUrl });
          localObject1 = localObject2;
          if (!TextUtils.isEmpty(parama.field_songAlbumUrl))
          {
            localObject1 = new c.a();
            ((c.a)localObject1).gKE = com.tencent.mm.plugin.music.a.g.c(parama, true);
            ((c.a)localObject1).gKC = true;
            ((c.a)localObject1).gKA = true;
            if (bool)
            {
              ((c.a)localObject1).gKM = true;
              ((c.a)localObject1).gKN = 10;
            }
            com.tencent.mm.ao.n.Jd().a(parama.field_songAlbumUrl, localCdnImageView, ((c.a)localObject1).Jn(), locald.npE);
            localObject1 = localObject2;
          }
          break;
        case 1: 
        case 8: 
        case 9: 
          label968:
          anu localanu = new anu();
          localanu.mmR = parama.field_songMediaId;
          localanu.uCO = parama.field_songAlbumUrl;
          localanu.uCP = parama.field_songAlbumType;
          localanu.lPM = localanu.uCO;
          localObject1 = localObject2;
          if (com.tencent.mm.plugin.sns.b.n.poO != null)
          {
            localObject1 = com.tencent.mm.plugin.sns.b.n.poO.b(localanu);
            if (localObject1 != null)
            {
              localObject1 = com.tencent.mm.sdk.platformtools.d.c((Bitmap)localObject1, 10);
            }
            else
            {
              localCdnImageView.setImageResource(R.g.aVU);
              if ((!parama.JL()) && (locald.npD != null)) {
                locald.npD.a(parama, new int[] { -16777216, -1 });
              }
              com.tencent.mm.plugin.sns.b.n.poO.cq(localCdnImageView);
              com.tencent.mm.plugin.sns.b.n.poO.a(localanu, localCdnImageView, localContext.hashCode(), an.vBh);
              locald.npF.removeCallbacksAndMessages(null);
              locald.npF.postDelayed(new d.b(locald, parama), 1000L);
            }
          }
          break;
        }
      }
    }
    
    public final class a
      extends Animation
    {
      final int lhd;
      final int nsY;
      View view;
      
      public a(View paramView, int paramInt)
      {
        GMTrace.i(4871566655488L, 36296);
        this.view = paramView;
        this.lhd = paramInt;
        this.nsY = paramView.getHeight();
        GMTrace.o(4871566655488L, 36296);
      }
      
      protected final void applyTransformation(float paramFloat, Transformation paramTransformation)
      {
        GMTrace.i(4871700873216L, 36297);
        int i = (int)(this.nsY + (this.lhd - this.nsY) * paramFloat);
        this.view.getLayoutParams().height = i;
        this.view.requestLayout();
        GMTrace.o(4871700873216L, 36297);
      }
      
      public final void initialize(int paramInt1, int paramInt2, int paramInt3, int paramInt4)
      {
        GMTrace.i(4871835090944L, 36298);
        super.initialize(paramInt1, paramInt2, paramInt3, paramInt4);
        GMTrace.o(4871835090944L, 36298);
      }
      
      public final boolean willChangeBounds()
      {
        GMTrace.i(4871969308672L, 36299);
        GMTrace.o(4871969308672L, 36299);
        return true;
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\music\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */