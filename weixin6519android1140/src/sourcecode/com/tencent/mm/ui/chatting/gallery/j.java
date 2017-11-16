package com.tencent.mm.ui.chatting.gallery;

import android.annotation.TargetApi;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Looper;
import android.support.v7.app.ActionBarActivity;
import android.util.Base64;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewStub;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.a;
import com.tencent.mm.R.h;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.k;
import com.tencent.mm.g.b.ce;
import com.tencent.mm.modelvideo.o;
import com.tencent.mm.modelvideo.r;
import com.tencent.mm.modelvideo.s;
import com.tencent.mm.plugin.report.service.g;
import com.tencent.mm.plugin.sns.a.b.c;
import com.tencent.mm.pluginsdk.ui.tools.VideoPlayerTextureView;
import com.tencent.mm.pluginsdk.ui.tools.VideoTextureView;
import com.tencent.mm.pluginsdk.ui.tools.f;
import com.tencent.mm.pluginsdk.ui.tools.f.a;
import com.tencent.mm.protocal.c.bhr;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.au;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.ui.chatting.a;
import com.tencent.mm.ui.chatting.a.a;
import com.tencent.mm.ui.chatting.a.b;
import com.tencent.mm.ui.p;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.y.at;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.m;
import java.io.File;
import java.util.HashMap;

public final class j
{
  public String eMI;
  public String eML;
  public long hcs;
  public int jP;
  public View lFh;
  public TextView lhN;
  public int pIq;
  public b wKP;
  public f wNA;
  public ImageView wNB;
  public ImageView wNC;
  public MMPinProgressBtn wND;
  public View wNE;
  public RelativeLayout wNF;
  public ImageView wNG;
  public ImageView wNH;
  public f wNI;
  public MMPinProgressBtn wNJ;
  public TextView wNK;
  public LinearLayout wNL;
  public TextView wNM;
  public TextView wNN;
  public ImageView wNO;
  public ProgressBar wNP;
  public ProgressBar wNQ;
  public LinearLayout wNR;
  public TextView wNS;
  public ImageView wNT;
  public MultiTouchImageView wNU;
  public int wNV;
  public int wNW;
  public b.b wNx;
  public HashMap<String, Boolean> wNy;
  public RelativeLayout wNz;
  
  @TargetApi(11)
  public j(b paramb, View paramView)
  {
    GMTrace.i(2409879306240L, 17955);
    this.wNy = new HashMap();
    this.pIq = 0;
    this.wNV = 0;
    this.wNW = 0;
    this.eMI = "";
    this.lFh = paramView;
    this.wKP = paramb;
    this.wNU = ((MultiTouchImageView)paramView.findViewById(R.h.image));
    this.wNQ = ((ProgressBar)paramView.findViewById(R.h.bGE));
    if ((com.tencent.mm.compatible.util.d.et(11)) && (paramView.getLayerType() != 2)) {
      paramView.setLayerType(2, null);
    }
    GMTrace.o(2409879306240L, 17955);
  }
  
  public static void M(View paramView, int paramInt)
  {
    GMTrace.i(2410013523968L, 17956);
    if (paramView != null) {
      paramView.setVisibility(paramInt);
    }
    GMTrace.o(2410013523968L, 17956);
  }
  
  public final void a(boolean paramBoolean, float paramFloat)
  {
    GMTrace.i(2410684612608L, 17961);
    w.i("MicroMsg.ImageGalleryViewHolder", "%d switch video model isVideoPlay[%b] alpha[%f]", new Object[] { Integer.valueOf(hashCode()), Boolean.valueOf(paramBoolean), Float.valueOf(paramFloat) });
    if (paramBoolean)
    {
      View localView = (View)cfU().wNI;
      localView.setAlpha(paramFloat);
      M(localView, 0);
      if (paramFloat >= 1.0D)
      {
        M(cfU().wNG, 8);
        M(cfU().wNH, 8);
      }
      GMTrace.o(2410684612608L, 17961);
      return;
    }
    M((View)cfU().wNI, 8);
    M(cfU().wNG, 0);
    M(cfU().wNH, 0);
    GMTrace.o(2410684612608L, 17961);
  }
  
  public final j cfR()
  {
    GMTrace.i(2410147741696L, 17957);
    if (this.wNL == null)
    {
      this.wNL = ((LinearLayout)((ViewStub)this.lFh.findViewById(R.h.bGH)).inflate());
      this.wNP = ((ProgressBar)this.wNL.findViewById(R.h.bvn));
      this.wNM = ((TextView)this.wNL.findViewById(R.h.bvo));
      this.wNN = ((TextView)this.wNL.findViewById(R.h.bvm));
      this.wNO = ((ImageView)this.wNL.findViewById(R.h.bvp));
    }
    GMTrace.o(2410147741696L, 17957);
    return this;
  }
  
  public final j cfS()
  {
    GMTrace.i(2410281959424L, 17958);
    if (this.wNR == null)
    {
      this.wNR = ((LinearLayout)((ViewStub)this.lFh.findViewById(R.h.bGF)).inflate());
      this.wNT = ((ImageView)this.wNR.findViewById(R.h.buT));
      this.wNS = ((TextView)this.wNR.findViewById(R.h.buU));
    }
    GMTrace.o(2410281959424L, 17958);
    return this;
  }
  
  public final j cfT()
  {
    GMTrace.i(2410416177152L, 17959);
    if (this.wNz == null)
    {
      this.wNz = ((RelativeLayout)((ViewStub)this.lFh.findViewById(R.h.ceW)).inflate());
      this.wNA = com.tencent.mm.pluginsdk.ui.tools.n.dX(this.lFh.getContext());
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -2);
      localLayoutParams.addRule(13);
      this.wNz.addView((View)this.wNA, localLayoutParams);
      ((View)this.wNA).setVisibility(8);
      this.wNE = this.wNz.findViewById(R.h.chF);
      this.wNE.setVisibility(8);
      this.lhN = ((TextView)this.wNz.findViewById(R.h.ceK));
      this.wND = ((MMPinProgressBtn)this.wNz.findViewById(R.h.ceT));
      this.wND.setVisibility(8);
      this.wNB = ((ImageView)this.wNz.findViewById(R.h.ceU));
      this.wNC = ((ImageView)this.wNz.findViewById(R.h.ckN));
      this.wNA.a(new f.a()
      {
        public final void Xq()
        {
          GMTrace.i(2463834832896L, 18357);
          GMTrace.o(2463834832896L, 18357);
        }
        
        public final int bM(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(2464237486080L, 18360);
          GMTrace.o(2464237486080L, 18360);
          return 0;
        }
        
        public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(2464371703808L, 18361);
          GMTrace.o(2464371703808L, 18361);
        }
        
        public final void onCompletion()
        {
          GMTrace.i(2464103268352L, 18359);
          j.this.wNA.start();
          j.this.wNE.post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2468129800192L, 18389);
              if ((j.this.wNE == null) || (j.this.wNE.getVisibility() == 0))
              {
                GMTrace.o(2468129800192L, 18389);
                return;
              }
              if ((j.this.wNE.getTag() != null) && ((j.this.wNE.getTag() instanceof r)))
              {
                r localr = (r)j.this.wNE.getTag();
                if ((localr.hcE != null) && (!bg.nm(localr.hcE.gkI)))
                {
                  j.this.wNE.setVisibility(8);
                  GMTrace.o(2468129800192L, 18389);
                  return;
                }
                if ((localr.hcE != null) && (!bg.nm(localr.hcE.gkL)) && (!bg.nm(localr.hcE.gkM)))
                {
                  j.this.wNE.setVisibility(8);
                  GMTrace.o(2468129800192L, 18389);
                  return;
                }
              }
              j.this.wNE.setVisibility(0);
              j.this.wNE.startAnimation(AnimationUtils.loadAnimation(j.this.wNE.getContext(), R.a.aLs));
              GMTrace.o(2468129800192L, 18389);
            }
          });
          GMTrace.o(2464103268352L, 18359);
        }
        
        public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(2463969050624L, 18358);
          j.this.wNA.stop();
          final String str = (String)((View)j.this.wNA).getTag();
          com.tencent.mm.sdk.a.b.r(Base64.encodeToString((com.tencent.mm.plugin.sight.base.d.bgi() + "[ImageGallery] on play sight error, what=" + paramAnonymousInt1 + ", extra=" + paramAnonymousInt2 + ", path=" + bg.aq(str, "")).getBytes(), 2), "FullScreenPlaySight");
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2463297961984L, 18353);
              if (bg.nm(str))
              {
                h.h(j.this.wKP.wKs, R.l.egs, R.l.dgV);
                GMTrace.o(2463297961984L, 18353);
                return;
              }
              Intent localIntent = new Intent();
              localIntent.setAction("android.intent.action.VIEW");
              localIntent.setDataAndType(Uri.fromFile(new File(str)), "video/*");
              try
              {
                j.this.wKP.wKs.startActivity(Intent.createChooser(localIntent, j.this.wKP.wKs.vKB.vKW.getString(R.l.dve)));
                GMTrace.o(2463297961984L, 18353);
                return;
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.ImageGalleryViewHolder", "startActivity fail, activity not found");
                h.h(j.this.wKP.wKs, R.l.due, R.l.duf);
                GMTrace.o(2463297961984L, 18353);
              }
            }
          });
          j.this.wNy.put(str, Boolean.valueOf(true));
          GMTrace.o(2463969050624L, 18358);
        }
      });
      this.lhN.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(final View paramAnonymousView)
        {
          GMTrace.i(2438467682304L, 18168);
          if ((paramAnonymousView.getTag() != null) && ((paramAnonymousView.getTag() instanceof au)))
          {
            au localau = (au)paramAnonymousView.getTag();
            a.a(a.a.wqm, localau);
            r localr = com.tencent.mm.modelvideo.t.mw(localau.field_imgPath);
            bhr localbhr = localr.hcE;
            Object localObject;
            if ((localbhr != null) && (!com.tencent.mm.platformtools.t.nm(localbhr.gkI)))
            {
              o.Nh();
              paramAnonymousView = s.ml(localau.field_imgPath);
              Intent localIntent = new Intent();
              localIntent.putExtra("IsAd", false);
              localIntent.putExtra("KStremVideoUrl", localbhr.gkI);
              localIntent.putExtra("KThumUrl", localbhr.gkN);
              localIntent.putExtra("KThumbPath", paramAnonymousView);
              localIntent.putExtra("KMediaId", "fakeid_" + localau.field_msgId);
              localIntent.putExtra("KMediaVideoTime", localbhr.ulk);
              localIntent.putExtra("KMediaTitle", localbhr.gkK);
              localIntent.putExtra("StreamWording", localbhr.gkL);
              localIntent.putExtra("StremWebUrl", localbhr.gkM);
              localObject = localau.field_talker;
              boolean bool = ((String)localObject).endsWith("@chatroom");
              if (bool)
              {
                paramAnonymousView = bc.gP(localau.field_content);
                localIntent.putExtra("KSta_StremVideoAduxInfo", localbhr.gkO);
                localIntent.putExtra("KSta_StremVideoPublishId", localbhr.gkP);
                localIntent.putExtra("KSta_SourceType", 1);
                if (!bool) {
                  break label409;
                }
              }
              label409:
              for (int i = a.b.wqv.value;; i = a.b.wqu.value)
              {
                localIntent.putExtra("KSta_Scene", i);
                localIntent.putExtra("KSta_FromUserName", paramAnonymousView);
                localIntent.putExtra("KSta_ChatName", (String)localObject);
                localIntent.putExtra("KSta_MsgId", localau.field_msgSvrId);
                localIntent.putExtra("KSta_SnsStatExtStr", localr.eTv);
                if (bool) {
                  localIntent.putExtra("KSta_ChatroomMembercount", m.fk((String)localObject));
                }
                com.tencent.mm.bj.d.b(j.this.wKP.wKs.vKB.vKW, "sns", ".ui.VideoAdPlayerUI", localIntent);
                GMTrace.o(2438467682304L, 18168);
                return;
                paramAnonymousView = (View)localObject;
                break;
              }
            }
            if ((localbhr != null) && (!bg.nm(localbhr.gkL)) && (!bg.nm(localbhr.gkM)))
            {
              w.i("MicroMsg.ImageGalleryViewHolder", "moreBtn click,opening " + localbhr.gkM);
              paramAnonymousView = new Intent();
              localObject = new Bundle();
              ((Bundle)localObject).putString("key_snsad_statextstr", localr.eTv);
              paramAnonymousView.putExtra("jsapiargs", (Bundle)localObject);
              paramAnonymousView.putExtra("rawUrl", localbhr.gkM);
              paramAnonymousView.putExtra("useJs", true);
              localObject = new c("", 18, 5, "", 2, -1L);
              at.wS().a((k)localObject, 0);
              new ae(Looper.getMainLooper()).post(new Runnable()
              {
                public final void run()
                {
                  GMTrace.i(2420616724480L, 18035);
                  com.tencent.mm.bj.d.b(j.this.wKP.wKs.vKB.vKW, "webview", ".ui.tools.WebViewUI", paramAnonymousView);
                  GMTrace.o(2420616724480L, 18035);
                }
              });
            }
          }
          GMTrace.o(2438467682304L, 18168);
        }
      });
    }
    GMTrace.o(2410416177152L, 17959);
    return this;
  }
  
  public final j cfU()
  {
    GMTrace.i(2410550394880L, 17960);
    if (this.wNF == null)
    {
      this.wNF = ((RelativeLayout)((ViewStub)this.lFh.findViewById(R.h.ckF)).inflate());
      this.wNG = ((ImageView)this.wNF.findViewById(R.h.cko));
      this.wNH = ((ImageView)this.wNF.findViewById(R.h.ckM));
      this.wNH.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(2433635844096L, 18132);
          if (j.this.wKP != null)
          {
            w.i("MicroMsg.ImageGalleryViewHolder", "%d video wait play on click, play video %d", new Object[] { Integer.valueOf(j.this.hashCode()), Integer.valueOf(j.this.jP) });
            j.this.wKP.Di(j.this.jP);
          }
          GMTrace.o(2433635844096L, 18132);
        }
      });
      com.tencent.mm.modelcontrol.d.Gv();
      if (!com.tencent.mm.modelcontrol.d.GC()) {
        break label249;
      }
      this.wNI = new VideoPlayerTextureView(this.lFh.getContext());
      g.ork.a(354L, 150L, 1L, false);
    }
    for (;;)
    {
      this.wNK = ((TextView)this.lFh.findViewById(R.h.bsY));
      this.wNI.hw(true);
      RelativeLayout.LayoutParams localLayoutParams = new RelativeLayout.LayoutParams(-1, -1);
      this.wNF.addView((View)this.wNI, 2, localLayoutParams);
      this.wNJ = ((MMPinProgressBtn)this.wNF.findViewById(R.h.ckj));
      this.wNJ.setVisibility(8);
      ((View)this.wNI).setVisibility(8);
      this.wNI.a(new f.a()
      {
        public final void Xq()
        {
          GMTrace.i(2439004553216L, 18172);
          if (j.this.wKP != null) {
            j.this.wKP.wKy.cfO();
          }
          GMTrace.o(2439004553216L, 18172);
        }
        
        public final int bM(final int paramAnonymousInt1, final int paramAnonymousInt2)
        {
          GMTrace.i(2439407206400L, 18175);
          w.i("MicroMsg.ImageGalleryViewHolder", "dkvideo onplaytime:%d total:%d,%d size:%d cnt:%d user:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(j.this.pIq), Integer.valueOf(paramAnonymousInt2), Integer.valueOf(j.this.wNV), Integer.valueOf(j.this.wNW), j.this.eMI });
          at.xB().A(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2483833274368L, 18506);
              g localg = g.ork;
              int j = j.this.wNV;
              if (paramAnonymousInt2 <= 0) {}
              for (int i = j.this.pIq * 1000;; i = paramAnonymousInt2)
              {
                localg.i(12084, new Object[] { Integer.valueOf(j), Integer.valueOf(i), Integer.valueOf(paramAnonymousInt1), Integer.valueOf(1), j.this.eMI, Integer.valueOf(j.this.wNW), j.this.eML, Long.valueOf(j.this.hcs) });
                GMTrace.o(2483833274368L, 18506);
                return;
              }
            }
          });
          GMTrace.o(2439407206400L, 18175);
          return 0;
        }
        
        public final void bs(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(2439541424128L, 18176);
          GMTrace.o(2439541424128L, 18176);
        }
        
        public final void onCompletion()
        {
          GMTrace.i(2439272988672L, 18174);
          af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(2427461828608L, 18086);
              j.this.wKP.wKs.mn(true);
              b localb = j.this.wKP;
              int i = j.this.jP;
              localb.wKy.Dy(i);
              ImageGalleryUI.cfC();
              j.this.wKP.wKy.cfP();
              GMTrace.o(2427461828608L, 18086);
            }
          });
          GMTrace.o(2439272988672L, 18174);
        }
        
        public final void onError(int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(2439138770944L, 18173);
          w.w("MicroMsg.ImageGalleryViewHolder", "play video error what : " + paramAnonymousInt1 + " extra: " + paramAnonymousInt2);
          if (j.this.wKP != null) {
            j.this.wKP.wKy.eu(paramAnonymousInt1, paramAnonymousInt2);
          }
          g.ork.i(12084, new Object[] { Integer.valueOf(j.this.wNV), Integer.valueOf(j.this.pIq * 1000), Integer.valueOf(0), Integer.valueOf(4), j.this.eMI, Integer.valueOf(j.this.wNW), j.this.eML, Long.valueOf(j.this.hcs) });
          GMTrace.o(2439138770944L, 18173);
        }
      });
      GMTrace.o(2410550394880L, 17960);
      return this;
      label249:
      this.wNI = new VideoTextureView(this.lFh.getContext());
      g.ork.a(354L, 151L, 1L, false);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\chatting\gallery\j.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */