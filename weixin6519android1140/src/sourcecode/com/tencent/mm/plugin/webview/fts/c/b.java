package com.tencent.mm.plugin.webview.fts.c;

import android.content.Context;
import android.os.Looper;
import android.text.TextUtils;
import android.view.View;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.plugin.webview.fts.ui.FtsVideoWrapper;
import com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView;
import com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoView.a;
import com.tencent.mm.plugin.webview.fts.ui.FtsWebVideoViewControlBar;
import com.tencent.mm.plugin.webview.fts.ui.b.4;
import com.tencent.mm.plugin.webview.fts.ui.b.5;
import com.tencent.mm.sdk.platformtools.aj;
import com.tencent.mm.sdk.platformtools.ay;
import com.tencent.mm.sdk.platformtools.bb;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.widget.MMWebView;
import java.lang.ref.WeakReference;
import org.json.JSONException;
import org.json.JSONObject;

public final class b
  implements e
{
  private Context context;
  public com.tencent.mm.plugin.webview.ui.tools.jsapi.d rBw;
  private b rDJ;
  public com.tencent.mm.plugin.webview.fts.ui.b rDN;
  private ay<FtsWebVideoView> yvz;
  
  public b(Context paramContext, MMWebView paramMMWebView, b paramb)
  {
    GMTrace.i(20491557404672L, 152674);
    this.yvz = new ay(3);
    this.context = paramContext;
    this.rDJ = paramb;
    this.rDN = new com.tencent.mm.plugin.webview.fts.ui.b(paramMMWebView, paramb);
    GMTrace.o(20491557404672L, 152674);
  }
  
  public final void aA(int paramInt, String paramString)
  {
    GMTrace.i(20492094275584L, 152678);
    w.i("FtsVideoPlayerMgr", "op player id %d,type %s", new Object[] { Integer.valueOf(paramInt), paramString });
    FtsWebVideoView localFtsWebVideoView = (FtsWebVideoView)this.rDN.jr(paramInt);
    if (localFtsWebVideoView != null)
    {
      paramInt = -1;
      switch (paramString.hashCode())
      {
      }
      for (;;)
      {
        switch (paramInt)
        {
        default: 
          w.i("FtsVideoPlayerMgr", "unknown op type %s", new Object[] { paramString });
          GMTrace.o(20492094275584L, 152678);
          return;
          if (paramString.equals("play"))
          {
            paramInt = 0;
            continue;
            if (paramString.equals("pause"))
            {
              paramInt = 1;
              continue;
              if (paramString.equals("stop"))
              {
                paramInt = 2;
                continue;
                if (paramString.equals("setMute"))
                {
                  paramInt = 3;
                  continue;
                  if (paramString.equals("setUnMute")) {
                    paramInt = 4;
                  }
                }
              }
            }
          }
          break;
        }
      }
      localFtsWebVideoView.start(false);
      GMTrace.o(20492094275584L, 152678);
      return;
      localFtsWebVideoView.pause();
      GMTrace.o(20492094275584L, 152678);
      return;
      localFtsWebVideoView.stop();
      GMTrace.o(20492094275584L, 152678);
      return;
      localFtsWebVideoView.setMute(true);
      GMTrace.o(20492094275584L, 152678);
      return;
      localFtsWebVideoView.setMute(false);
      GMTrace.o(20492094275584L, 152678);
      return;
    }
    w.i("FtsVideoPlayerMgr", "can not find player by id %d", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(20492094275584L, 152678);
  }
  
  public final void t(final int paramInt, final String paramString1, String paramString2)
  {
    GMTrace.i(20491691622400L, 152675);
    w.i("FtsVideoPlayerMgr", "insert player id %d,viewProps %s,videoProps %s", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
    for (;;)
    {
      try
      {
        if ((TextUtils.isEmpty(paramString1)) || (TextUtils.isEmpty(paramString2)))
        {
          w.e("FtsVideoPlayerMgr", "insert args invalid");
          GMTrace.o(20491691622400L, 152675);
          return;
        }
        JSONObject localJSONObject = new JSONObject(paramString1);
        paramString2 = new JSONObject(paramString2);
        paramString1 = (FtsWebVideoView)this.yvz.bE();
        if (paramString1 == null)
        {
          paramString1 = new FtsWebVideoView(this.context, paramString2.optBoolean("autoPlay"));
          w.i("MicroMsg.FtsWebVideoView", "setIsShowBasicControls isShowBasicControls=%b", new Object[] { Boolean.valueOf(true) });
          paramString1.ilV = true;
          paramString1.rDr = paramString2.optInt("fileSize");
          paramString1.setMute(paramString2.optBoolean("isMute"));
          paramString1.qO(paramString2.optString("coverUrl"));
          paramString1.ilU = paramInt;
          paramString1.setAutoPlay(paramString2.optBoolean("autoPlay"));
          paramString1.ch(c.W(paramString2), paramString2.optInt("durationSec"));
          paramString1.rDo = new FtsWebVideoView.a()
          {
            public final void WU()
            {
              GMTrace.i(20494107541504L, 152693);
              FtsWebVideoView localFtsWebVideoView = paramString1;
              w.i("MicroMsg.FtsWebVideoView", "onExitFullScreen");
              if (localFtsWebVideoView.rDg.imq) {
                localFtsWebVideoView.rDg.WT();
              }
              localFtsWebVideoView.cn(false);
              GMTrace.o(20494107541504L, 152693);
            }
          }
          {
            public final void WT()
            {
              GMTrace.i(20492899581952L, 152684);
              com.tencent.mm.plugin.webview.fts.ui.b localb = b.this.rDN;
              b.5 local5 = new b.5(localb, Boolean.valueOf(false), paramInt);
              if (Thread.currentThread() == Looper.getMainLooper().getThread())
              {
                ((Boolean)local5.b(null)).booleanValue();
                GMTrace.o(20492899581952L, 152684);
                return;
              }
              ((Boolean)local5.b(localb.mHandler)).booleanValue();
              GMTrace.o(20492899581952L, 152684);
            }
            
            public final boolean isFullScreen()
            {
              GMTrace.i(20493033799680L, 152685);
              boolean bool = b.this.rDN.jt(paramInt);
              GMTrace.o(20493033799680L, 152685);
              return bool;
            }
            
            public final void jq(boolean paramAnonymousBoolean)
            {
              GMTrace.i(20492765364224L, 152683);
              com.tencent.mm.plugin.webview.fts.ui.b localb = b.this.rDN;
              b.4 local4 = new b.4(localb, Boolean.valueOf(false), paramInt, this.rDR, paramAnonymousBoolean);
              if (Thread.currentThread() == Looper.getMainLooper().getThread())
              {
                ((Boolean)local4.b(null)).booleanValue();
                GMTrace.o(20492765364224L, 152683);
                return;
              }
              ((Boolean)local4.b(localb.mHandler)).booleanValue();
              GMTrace.o(20492765364224L, 152683);
            }
          };
          paramString2 = new a()
          {
            public final void WU()
            {
              GMTrace.i(20494778630144L, 152698);
              com.tencent.mm.plugin.webview.fts.ui.b localb = b.this.rDN;
              Object localObject1 = localb.xr(localb.iwz);
              float[] arrayOfFloat = localb.iww;
              if ((localObject1 == null) || (((com.tencent.mm.plugin.webview.fts.ui.b.a)localObject1).iwG == null) || (arrayOfFloat == null))
              {
                GMTrace.o(20494778630144L, 152698);
                return;
              }
              localObject1 = (View)((com.tencent.mm.plugin.webview.fts.ui.b.a)localObject1).iwG.get();
              if (localObject1 != null)
              {
                if (localb.iwz != localb.iwv)
                {
                  Object localObject2 = localb.xr(localb.iwv);
                  if ((localObject2 != null) && (((com.tencent.mm.plugin.webview.fts.ui.b.a)localObject2).iwG != null))
                  {
                    localObject2 = (View)((com.tencent.mm.plugin.webview.fts.ui.b.a)localObject2).iwG.get();
                    if (localObject2 != null) {
                      localb.a(localb.iwv, arrayOfFloat, ((View)localObject2).getVisibility());
                    }
                  }
                }
                int i = localb.iwz;
                localb.iwv = -1;
                localb.iwz = -1;
                if (localb.rDI != null)
                {
                  localb.rDI.WU();
                  localb.rDI = null;
                }
                localb.a(i, arrayOfFloat, ((View)localObject1).getVisibility());
              }
              GMTrace.o(20494778630144L, 152698);
            }
            
            public final void Wb()
            {
              GMTrace.i(20494510194688L, 152696);
              FtsWebVideoView localFtsWebVideoView = paramString1;
              w.i("MicroMsg.FtsWebVideoView", "onUIPause");
              localFtsWebVideoView.rDf.MR();
              GMTrace.o(20494510194688L, 152696);
            }
            
            public final void Wz()
            {
              GMTrace.i(20494375976960L, 152695);
              FtsWebVideoView localFtsWebVideoView = paramString1;
              w.i("MicroMsg.FtsWebVideoView", "onUIResume");
              localFtsWebVideoView.rDf.MS();
              GMTrace.o(20494375976960L, 152695);
            }
            
            public final boolean Yb()
            {
              GMTrace.i(20494912847872L, 152699);
              if (paramString1.Xg())
              {
                paramString1.jp(false);
                GMTrace.o(20494912847872L, 152699);
                return true;
              }
              GMTrace.o(20494912847872L, 152699);
              return false;
            }
            
            public final void bBZ()
            {
              GMTrace.i(20495047065600L, 152700);
              FtsWebVideoView localFtsWebVideoView = paramString1;
              if ((!localFtsWebVideoView.jGN) && (localFtsWebVideoView.bBR() == 0)) {
                localFtsWebVideoView.setMute(true);
              }
              GMTrace.o(20495047065600L, 152700);
            }
            
            public final void bCa()
            {
              GMTrace.i(20495181283328L, 152701);
              FtsWebVideoView localFtsWebVideoView = paramString1;
              if ((localFtsWebVideoView.jGN) && (localFtsWebVideoView.bBR() > 0)) {
                localFtsWebVideoView.setMute(false);
              }
              GMTrace.o(20495181283328L, 152701);
            }
            
            public final void onDestroy()
            {
              GMTrace.i(20494644412416L, 152697);
              FtsWebVideoView localFtsWebVideoView = paramString1;
              w.i("MicroMsg.FtsWebVideoView", "onUIDestroy");
              w.i("MicroMsg.FtsWebVideoView", "clean");
              localFtsWebVideoView.stop();
              localFtsWebVideoView.rDf.XJ();
              FtsWebVideoViewControlBar localFtsWebVideoViewControlBar = localFtsWebVideoView.rDg;
              if (localFtsWebVideoViewControlBar.imp != null) {
                localFtsWebVideoViewControlBar.imp.stopTimer();
              }
              if (localFtsWebVideoViewControlBar.imo != null) {
                localFtsWebVideoViewControlBar.imo.stopTimer();
              }
              try
              {
                localFtsWebVideoView.getContext().unregisterReceiver(localFtsWebVideoView.rDv);
                GMTrace.o(20494644412416L, 152697);
                return;
              }
              catch (Exception localException)
              {
                GMTrace.o(20494644412416L, 152697);
              }
            }
          };
          paramString1.rDq = paramString2;
          this.rDJ.a(paramString2);
          paramString1.rDp = new d(paramString1, this.rDJ, this.rBw);
          paramString2 = this.rDN;
          paramString1 = new com.tencent.mm.plugin.webview.fts.ui.b.1(paramString2, Boolean.valueOf(false), paramString1, paramInt, 0, c.a(localJSONObject, this.context), c.j(localJSONObject));
          if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
            break;
          }
          ((Boolean)paramString1.b(null)).booleanValue();
          GMTrace.o(20491691622400L, 152675);
          return;
        }
      }
      catch (JSONException paramString1)
      {
        w.e("FtsVideoPlayerMgr", "", new Object[] { paramString1 });
        GMTrace.o(20491691622400L, 152675);
        return;
      }
      paramString1.stop();
    }
    ((Boolean)paramString1.b(paramString2.mHandler)).booleanValue();
    GMTrace.o(20491691622400L, 152675);
  }
  
  public final void u(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(20491825840128L, 152676);
    w.i("FtsVideoPlayerMgr", "update player id %d,viewProps %s,videoProps %s", new Object[] { Integer.valueOf(paramInt), paramString1, paramString2 });
    try
    {
      Object localObject;
      if (!TextUtils.isEmpty(paramString1))
      {
        localObject = new JSONObject(paramString1);
        paramString1 = this.rDN;
        localObject = new com.tencent.mm.plugin.webview.fts.ui.b.3(paramString1, Boolean.valueOf(false), paramInt, c.a((JSONObject)localObject, this.context), c.j((JSONObject)localObject));
        if (Thread.currentThread() != Looper.getMainLooper().getThread()) {
          break label173;
        }
        ((Boolean)((bb)localObject).b(null)).booleanValue();
      }
      for (;;)
      {
        if (TextUtils.isEmpty(paramString2)) {
          break label318;
        }
        paramString1 = new JSONObject(paramString2);
        paramString2 = (FtsWebVideoView)this.rDN.jr(paramInt);
        if (paramString2 != null) {
          break;
        }
        w.i("FtsVideoPlayerMgr", "can not find video View by id %d", new Object[] { Integer.valueOf(paramInt) });
        GMTrace.o(20491825840128L, 152676);
        return;
        label173:
        ((Boolean)((bb)localObject).b(paramString1.mHandler)).booleanValue();
      }
      if (!paramString1.has("autoPlay")) {
        break label238;
      }
    }
    catch (JSONException paramString1)
    {
      w.e("FtsVideoPlayerMgr", "", new Object[] { paramString1 });
      GMTrace.o(20491825840128L, 152676);
      return;
    }
    paramString2.setAutoPlay(paramString1.optBoolean("autoPlay"));
    label238:
    if (paramString1.has("coverUrl")) {
      paramString2.qO(paramString1.optString("coverUrl"));
    }
    if (paramString1.has("durationSec")) {
      FtsWebVideoView.setDuration(paramString1.optInt("durationSec"));
    }
    if (paramString1.has("playUrl")) {
      paramString2.ch(c.W(paramString1), paramString1.optInt("durationSec"));
    }
    if (paramString1.has("isMute")) {
      paramString2.setMute(paramString1.optBoolean("isMute"));
    }
    label318:
    GMTrace.o(20491825840128L, 152676);
  }
  
  public final void xs(int paramInt)
  {
    GMTrace.i(20491960057856L, 152677);
    w.i("FtsVideoPlayerMgr", "remove palyer id %d", new Object[] { Integer.valueOf(paramInt) });
    FtsWebVideoView localFtsWebVideoView = (FtsWebVideoView)this.rDN.jr(paramInt);
    if (localFtsWebVideoView == null) {
      w.w("FtsVideoPlayerMgr", "can not find player by id %d", new Object[] { Integer.valueOf(paramInt) });
    }
    com.tencent.mm.plugin.webview.fts.ui.b localb = this.rDN;
    com.tencent.mm.plugin.webview.fts.ui.b.2 local2 = new com.tencent.mm.plugin.webview.fts.ui.b.2(localb, Boolean.valueOf(false), paramInt);
    if (Thread.currentThread() == Looper.getMainLooper().getThread()) {
      ((Boolean)local2.b(null)).booleanValue();
    }
    for (;;)
    {
      if (localFtsWebVideoView != null)
      {
        localFtsWebVideoView.stop();
        localFtsWebVideoView.rDp.clean();
        localFtsWebVideoView.rDp = null;
        localFtsWebVideoView.setVisibility(0);
        localFtsWebVideoView.rDs = false;
        this.yvz.i(localFtsWebVideoView);
      }
      GMTrace.o(20491960057856L, 152677);
      return;
      ((Boolean)local2.b(localb.mHandler)).booleanValue();
    }
  }
  
  public static abstract interface a
  {
    public abstract void WU();
    
    public abstract void Wb();
    
    public abstract void Wz();
    
    public abstract boolean Yb();
    
    public abstract void bBZ();
    
    public abstract void bCa();
    
    public abstract void onDestroy();
  }
  
  public static abstract interface b
  {
    public abstract void a(b.a parama);
    
    public abstract void bCb();
    
    public abstract void j(View paramView, boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\webview\fts\c\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */