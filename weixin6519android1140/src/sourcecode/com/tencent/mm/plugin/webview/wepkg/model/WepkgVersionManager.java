package com.tencent.mm.plugin.webview.wepkg.model;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.ad.b;
import com.tencent.mm.ad.b.a;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.u;
import com.tencent.mm.bm.a;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessService;
import com.tencent.mm.plugin.webview.wepkg.ipc.WepkgMainProcessTask;
import com.tencent.mm.plugin.webview.wepkg.utils.WepkgRunCgi.1;
import com.tencent.mm.plugin.webview.wepkg.utils.WepkgRunCgi.RemoteCgiTask;
import com.tencent.mm.plugin.webview.wepkg.utils.WepkgRunCgi.a;
import com.tencent.mm.plugin.webview.wepkg.utils.d;
import com.tencent.mm.protocal.c.atu;
import com.tencent.mm.protocal.c.bto;
import com.tencent.mm.protocal.c.btp;
import com.tencent.mm.protocal.c.btq;
import com.tencent.mm.protocal.c.btr;
import com.tencent.mm.protocal.c.bts;
import com.tencent.mm.protocal.c.btt;
import com.tencent.mm.protocal.c.btu;
import com.tencent.mm.protocal.c.btv;
import com.tencent.mm.protocal.c.mw;
import com.tencent.mm.protocal.c.mx;
import com.tencent.mm.protocal.c.ne;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class WepkgVersionManager
{
  private static void F(String paramString1, String paramString2, int paramInt)
  {
    GMTrace.i(15171703537664L, 113038);
    w.i("MicroMsg.Wepkg.WepkgVersionManager", "pkgId = " + paramString1 + ", version = " + paramString2);
    LinkedList localLinkedList = new LinkedList();
    ne localne = new ne();
    localne.udZ = paramString1;
    localne.jhO = paramString2;
    localne.tOG = paramInt;
    localLinkedList.add(localne);
    ar(localLinkedList);
    GMTrace.o(15171703537664L, 113038);
  }
  
  private static void ar(LinkedList<ne> paramLinkedList)
  {
    GMTrace.i(15171837755392L, 113039);
    if (paramLinkedList.size() == 0)
    {
      GMTrace.o(15171837755392L, 113039);
      return;
    }
    WepkgNetSceneProcessTask localWepkgNetSceneProcessTask = new WepkgNetSceneProcessTask();
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      ne localne = (ne)paramLinkedList.next();
      WepkgVersionManager.WepkgNetSceneProcessTask.WepkgCheckReq localWepkgCheckReq = new WepkgVersionManager.WepkgNetSceneProcessTask.WepkgCheckReq();
      localWepkgCheckReq.rYG = localne.udZ;
      localWepkgCheckReq.version = localne.jhO;
      localWepkgCheckReq.scene = localne.tOG;
      localWepkgNetSceneProcessTask.rZi.add(localWepkgCheckReq);
    }
    if (ab.bPY())
    {
      d.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15188614971392L, 113164);
          this.rZh.RY();
          GMTrace.o(15188614971392L, 113164);
        }
      });
      GMTrace.o(15171837755392L, 113039);
      return;
    }
    WepkgMainProcessService.a(localWepkgNetSceneProcessTask);
    GMTrace.o(15171837755392L, 113039);
  }
  
  public static void cv(String paramString, int paramInt)
  {
    GMTrace.i(15171569319936L, 113037);
    if (bg.nm(paramString))
    {
      GMTrace.o(15171569319936L, 113037);
      return;
    }
    Object localObject = h.MY(paramString);
    if (localObject == null)
    {
      F(paramString, "", paramInt);
      GMTrace.o(15171569319936L, 113037);
      return;
    }
    long l1 = ((WepkgVersion)localObject).rZb;
    long l2 = d.abz();
    if (l2 >= l1)
    {
      F(paramString, ((WepkgVersion)localObject).version, paramInt);
      localObject = new WepkgCrossProcessTask();
      ((WepkgCrossProcessTask)localObject).nJ = 3003;
      ((WepkgCrossProcessTask)localObject).rYm.rYG = paramString;
      if (ab.bPY())
      {
        d.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(15186064834560L, 113145);
            this.rZg.RY();
            GMTrace.o(15186064834560L, 113145);
          }
        });
        GMTrace.o(15171569319936L, 113037);
        return;
      }
      WepkgMainProcessService.a((WepkgMainProcessTask)localObject);
      GMTrace.o(15171569319936L, 113037);
      return;
    }
    w.i("MicroMsg.Wepkg.WepkgVersionManager", "currTime[%s]s < nextCheckTime[%s]s, no net request", new Object[] { Long.valueOf(l2), Long.valueOf(l1) });
    GMTrace.o(15171569319936L, 113037);
  }
  
  public static final class WepkgNetSceneProcessTask
    extends BaseWepkgProcessTask
  {
    public static final Parcelable.Creator<WepkgNetSceneProcessTask> CREATOR;
    public List<WepkgCheckReq> rZi;
    
    static
    {
      GMTrace.i(15184320004096L, 113132);
      CREATOR = new Parcelable.Creator() {};
      GMTrace.o(15184320004096L, 113132);
    }
    
    public WepkgNetSceneProcessTask()
    {
      GMTrace.i(15183246262272L, 113124);
      this.rZi = new ArrayList();
      GMTrace.o(15183246262272L, 113124);
    }
    
    public WepkgNetSceneProcessTask(Parcel paramParcel)
    {
      GMTrace.i(15183380480000L, 113125);
      f(paramParcel);
      GMTrace.o(15183380480000L, 113125);
    }
    
    public final void RY()
    {
      GMTrace.i(15183514697728L, 113126);
      if (bg.cc(this.rZi))
      {
        GMTrace.o(15183514697728L, 113126);
        return;
      }
      Object localObject1 = new b.a();
      ((b.a)localObject1).gtE = 1313;
      ((b.a)localObject1).gtH = 0;
      ((b.a)localObject1).gtI = 0;
      ((b.a)localObject1).uri = "/cgi-bin/mmgame-bin/checkwepkgversion";
      Object localObject2 = new mw();
      Object localObject3 = this.rZi.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        WepkgCheckReq localWepkgCheckReq = (WepkgCheckReq)((Iterator)localObject3).next();
        ne localne = new ne();
        localne.udZ = localWepkgCheckReq.rYG;
        localne.jhO = localWepkgCheckReq.version;
        localne.tOG = localWepkgCheckReq.scene;
        ((mw)localObject2).udC.add(localne);
      }
      ((b.a)localObject1).gtF = ((a)localObject2);
      ((b.a)localObject1).gtG = new mx();
      localObject1 = ((b.a)localObject1).DA();
      localObject2 = new WepkgRunCgi.a()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, final String paramAnonymousString, b paramAnonymousb)
        {
          GMTrace.i(15172911497216L, 113047);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0) || (paramAnonymousb.gtD.gtK == null))
          {
            w.e("MicroMsg.Wepkg.WepkgVersionManager", "check wepkg version, cgi failed, errType = %d, errCode = %d, errMsg = %s, rr.resp = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString, paramAnonymousb.gtD.gtK });
            GMTrace.o(15172911497216L, 113047);
            return;
          }
          try
          {
            paramAnonymousString = (mx)paramAnonymousb.gtD.gtK;
            d.xB().A(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(15188346535936L, 113162);
                Object localObject1 = paramAnonymousString;
                Object localObject2;
                Object localObject3;
                if (localObject1 != null)
                {
                  if (bg.cc(((mx)localObject1).udD))
                  {
                    w.e("MicroMsg.Wepkg.WepkgManager", "response.PkgList.size() is empty");
                    GMTrace.o(15188346535936L, 113162);
                    return;
                  }
                  localObject1 = (atu)((mx)localObject1).udD.get(0);
                  if (localObject1 != null)
                  {
                    localObject2 = ((atu)localObject1).udZ;
                    localObject3 = ((atu)localObject1).uJm;
                    Object localObject4 = ((atu)localObject1).uJo;
                    if (!bg.nm((String)localObject2))
                    {
                      if ((localObject4 != null) && (((btp)localObject4).vcp))
                      {
                        g.MU((String)localObject2);
                        GMTrace.o(15188346535936L, 113162);
                        return;
                      }
                      if ((localObject3 == null) || (((btt)localObject3).vcw == null))
                      {
                        GMTrace.o(15188346535936L, 113162);
                        return;
                      }
                      if (bg.nm(((btt)localObject3).vcw.vcq))
                      {
                        localObject1 = new WepkgCrossProcessTask();
                        ((WepkgCrossProcessTask)localObject1).nJ = 2004;
                        ((WepkgCrossProcessTask)localObject1).rYm.rYG = ((String)localObject2);
                        if (ab.bPY())
                        {
                          d.xB().A(new h.6((WepkgCrossProcessTask)localObject1, null));
                          GMTrace.o(15188346535936L, 113162);
                          return;
                        }
                        ((WepkgCrossProcessTask)localObject1).hYr = new h.7(null, (WepkgCrossProcessTask)localObject1);
                        ((WepkgCrossProcessTask)localObject1).VM();
                        WepkgMainProcessService.a((WepkgMainProcessTask)localObject1);
                        GMTrace.o(15188346535936L, 113162);
                        return;
                      }
                      boolean bool = ((btt)localObject3).vcw.vcr;
                      long l1 = ((btt)localObject3).vcw.vcs;
                      long l2 = ((btt)localObject3).vcw.vct;
                      localObject3 = new WepkgCrossProcessTask();
                      ((WepkgCrossProcessTask)localObject3).nJ = 3004;
                      ((WepkgCrossProcessTask)localObject3).rYm.rYG = ((String)localObject2);
                      ((WepkgCrossProcessTask)localObject3).rYm.rYW = bool;
                      ((WepkgCrossProcessTask)localObject3).rYm.rYX = l1;
                      ((WepkgCrossProcessTask)localObject3).rYm.rYY = l2;
                      if (ab.bPY())
                      {
                        ((WepkgCrossProcessTask)localObject3).RY();
                        localObject3 = new WepkgCrossProcessTask();
                        ((WepkgCrossProcessTask)localObject3).nJ = 3009;
                        ((WepkgCrossProcessTask)localObject3).rYm.rYG = ((String)localObject2);
                        if (!ab.bPY()) {
                          break label481;
                        }
                        ((WepkgCrossProcessTask)localObject3).RY();
                        label384:
                        localObject3 = new WepkgCrossProcessTask();
                        ((WepkgCrossProcessTask)localObject3).nJ = 4006;
                        ((WepkgCrossProcessTask)localObject3).rYo.rYG = ((String)localObject2);
                        if (!ab.bPY()) {
                          break label490;
                        }
                        ((WepkgCrossProcessTask)localObject3).RY();
                      }
                      for (;;)
                      {
                        localObject2 = i.bGp();
                        if ((localObject1 != null) && (((atu)localObject1).uJn != null)) {
                          break label499;
                        }
                        w.i("MicroMsg.Wepkg.WepkgUpdater", "dont need to update wepkg");
                        if (localObject1 != null) {
                          ((i)localObject2).aL(((atu)localObject1).udZ, false);
                        }
                        GMTrace.o(15188346535936L, 113162);
                        return;
                        WepkgMainProcessService.b((WepkgMainProcessTask)localObject3);
                        break;
                        label481:
                        WepkgMainProcessService.b((WepkgMainProcessTask)localObject3);
                        break label384;
                        label490:
                        WepkgMainProcessService.b((WepkgMainProcessTask)localObject3);
                      }
                      label499:
                      localObject3 = ((atu)localObject1).uJn.vcA;
                      localObject4 = ((atu)localObject1).uJn.vcB;
                      if ((localObject3 == null) && (localObject4 == null))
                      {
                        w.i("MicroMsg.Wepkg.WepkgUpdater", "bigPackage is null and preloadFiles is null");
                        g.MU(((atu)localObject1).udZ);
                        GMTrace.o(15188346535936L, 113162);
                        return;
                      }
                      localObject3 = new WepkgCrossProcessTask();
                      ((WepkgCrossProcessTask)localObject3).nJ = 2002;
                      localObject4 = ((WepkgCrossProcessTask)localObject3).rYm;
                      Object localObject6;
                      Object localObject5;
                      if (localObject1 != null)
                      {
                        ((WepkgVersion)localObject4).rYG = ((atu)localObject1).udZ;
                        localObject6 = ((atu)localObject1).uJm;
                        localObject5 = ((atu)localObject1).uJn;
                        if (localObject6 != null)
                        {
                          ((WepkgVersion)localObject4).appId = ((btt)localObject6).lQa;
                          localObject6 = ((btt)localObject6).vcw;
                          if (localObject6 != null)
                          {
                            ((WepkgVersion)localObject4).version = ((btq)localObject6).vcq;
                            ((WepkgVersion)localObject4).rYW = ((btq)localObject6).vcr;
                            ((WepkgVersion)localObject4).rYX = ((btq)localObject6).vcs;
                            ((WepkgVersion)localObject4).rYY = ((btq)localObject6).vct;
                          }
                        }
                        if (localObject5 != null)
                        {
                          ((WepkgVersion)localObject4).eYR = ((btv)localObject5).vcz;
                          ((WepkgVersion)localObject4).charset = ((btv)localObject5).vbh;
                          localObject6 = ((btv)localObject5).vcA;
                          if ((localObject6 == null) || (((bto)localObject6).vco == null) || (bg.nm(((bto)localObject6).vco.tVH))) {
                            break label1071;
                          }
                          ((WepkgVersion)localObject4).eDW = ((bto)localObject6).vco.ugy;
                          ((WepkgVersion)localObject4).downloadUrl = ((bto)localObject6).vco.tVH;
                          ((WepkgVersion)localObject4).rZa = ((bto)localObject6).vco.vcv;
                          ((WepkgVersion)localObject4).rYt = ((bto)localObject6).vco.vcu;
                          ((WepkgVersion)localObject4).rZc = false;
                          localObject5 = ((btv)localObject5).vcB;
                          if (localObject5 != null) {
                            ((WepkgVersion)localObject4).rZe = ((btu)localObject5).vcy;
                          }
                          if ((localObject5 == null) || (bg.cc(((btu)localObject5).vcx)) || (!((btu)localObject5).vcy)) {
                            break label1080;
                          }
                        }
                      }
                      label1071:
                      label1080:
                      for (((WepkgVersion)localObject4).rZd = false;; ((WepkgVersion)localObject4).rZd = true)
                      {
                        ((WepkgVersion)localObject4).rZf = 0;
                        localObject5 = ((atu)localObject1).uJn.vcB;
                        if ((localObject5 == null) || (bg.cc(((btu)localObject5).vcx))) {
                          break label1096;
                        }
                        localObject4 = new ArrayList();
                        localObject5 = ((btu)localObject5).vcx.iterator();
                        while (((Iterator)localObject5).hasNext())
                        {
                          Object localObject7 = (bts)((Iterator)localObject5).next();
                          localObject6 = new WepkgPreloadFile();
                          String str1 = ((atu)localObject1).udZ;
                          String str2 = ((atu)localObject1).uJm.vcw.vcq;
                          if (localObject7 != null)
                          {
                            ((WepkgPreloadFile)localObject6).amf = d.ex(str1, ((bts)localObject7).umC);
                            ((WepkgPreloadFile)localObject6).rYG = str1;
                            ((WepkgPreloadFile)localObject6).version = str2;
                            ((WepkgPreloadFile)localObject6).rYr = ((bts)localObject7).umC;
                            ((WepkgPreloadFile)localObject6).mimeType = ((bts)localObject7).umE;
                            localObject7 = ((bts)localObject7).vco;
                            if (localObject7 != null)
                            {
                              ((WepkgPreloadFile)localObject6).eDW = ((btr)localObject7).ugy;
                              ((WepkgPreloadFile)localObject6).downloadUrl = ((btr)localObject7).tVH;
                              ((WepkgPreloadFile)localObject6).size = ((btr)localObject7).vcv;
                              ((WepkgPreloadFile)localObject6).rYt = ((btr)localObject7).vcu;
                            }
                            ((WepkgPreloadFile)localObject6).rYH = false;
                          }
                          ((List)localObject4).add(localObject6);
                        }
                        ((WepkgVersion)localObject4).rZc = true;
                        break;
                      }
                      ((WepkgCrossProcessTask)localObject3).rYp = ((List)localObject4);
                      label1096:
                      if (!ab.bPY()) {
                        break label1127;
                      }
                      ((WepkgCrossProcessTask)localObject3).RY();
                    }
                  }
                }
                for (;;)
                {
                  ((i)localObject2).aL(((atu)localObject1).udZ, false);
                  GMTrace.o(15188346535936L, 113162);
                  return;
                  label1127:
                  WepkgMainProcessService.b((WepkgMainProcessTask)localObject3);
                }
              }
            });
            GMTrace.o(15172911497216L, 113047);
            return;
          }
          catch (Exception paramAnonymousString)
          {
            w.e("MicroMsg.Wepkg.WepkgVersionManager", "get checkwepkgversion error");
            GMTrace.o(15172911497216L, 113047);
          }
        }
      };
      if (ab.bPY())
      {
        u.a((b)localObject1, new WepkgRunCgi.1((WepkgRunCgi.a)localObject2));
        GMTrace.o(15183514697728L, 113126);
        return;
      }
      localObject3 = new WepkgRunCgi.RemoteCgiTask();
      d.aR(localObject3);
      ((WepkgRunCgi.RemoteCgiTask)localObject3).rZy = ((b)localObject1);
      ((WepkgRunCgi.RemoteCgiTask)localObject3).rZz = ((WepkgRunCgi.a)localObject2);
      ((WepkgRunCgi.RemoteCgiTask)localObject3).rZw = 1;
      WepkgMainProcessService.a((WepkgMainProcessTask)localObject3);
      GMTrace.o(15183514697728L, 113126);
    }
    
    public final void VK()
    {
      GMTrace.i(15183648915456L, 113127);
      GMTrace.o(15183648915456L, 113127);
    }
    
    public final void j(Parcel paramParcel)
    {
      GMTrace.i(15183783133184L, 113128);
      if (this.rZi == null) {
        this.rZi = new ArrayList();
      }
      paramParcel.readList(this.rZi, WepkgCheckReq.class.getClassLoader());
      GMTrace.o(15183783133184L, 113128);
    }
    
    public final void v(Parcel paramParcel, int paramInt)
    {
      GMTrace.i(15183917350912L, 113129);
      paramParcel.writeList(this.rZi);
      GMTrace.o(15183917350912L, 113129);
    }
    
    private static class WepkgCheckReq
      implements Parcelable
    {
      public static final Parcelable.Creator<WepkgCheckReq> CREATOR;
      public String rYG;
      public int scene;
      public String version;
      
      static
      {
        GMTrace.i(15190359801856L, 113177);
        CREATOR = new Parcelable.Creator() {};
        GMTrace.o(15190359801856L, 113177);
      }
      
      public WepkgCheckReq()
      {
        GMTrace.i(15188749189120L, 113165);
        GMTrace.o(15188749189120L, 113165);
      }
      
      public WepkgCheckReq(Parcel paramParcel)
      {
        GMTrace.i(15188883406848L, 113166);
        this.rYG = paramParcel.readString();
        this.version = paramParcel.readString();
        this.scene = paramParcel.readInt();
        GMTrace.o(15188883406848L, 113166);
      }
      
      public int describeContents()
      {
        GMTrace.i(15189017624576L, 113167);
        GMTrace.o(15189017624576L, 113167);
        return 0;
      }
      
      public void writeToParcel(Parcel paramParcel, int paramInt)
      {
        GMTrace.i(15189151842304L, 113168);
        paramParcel.writeString(this.rYG);
        paramParcel.writeString(this.version);
        paramParcel.writeInt(this.scene);
        GMTrace.o(15189151842304L, 113168);
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\wepkg\model\WepkgVersionManager.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */