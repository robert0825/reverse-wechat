package com.tencent.mm.plugin.exdevice.model;

import android.app.Activity;
import android.app.ProgressDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.database.Cursor;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.l;
import com.tencent.mm.a.g;
import com.tencent.mm.ad.b.c;
import com.tencent.mm.ad.k;
import com.tencent.mm.ad.n;
import com.tencent.mm.g.b.bp;
import com.tencent.mm.protocal.c.agx;
import com.tencent.mm.protocal.c.agy;
import com.tencent.mm.protocal.c.apb;
import com.tencent.mm.protocal.c.xx;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.base.h;
import com.tencent.mm.y.at;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public enum i
  implements com.tencent.mm.ad.e
{
  private ProgressDialog htG;
  private boolean kzG;
  public a kzH;
  
  static
  {
    GMTrace.i(10948140072960L, 81570);
    kzF = new i("INSTANCE");
    kzI = new i[] { kzF };
    GMTrace.o(10948140072960L, 81570);
  }
  
  private i()
  {
    GMTrace.i(10947066331136L, 81562);
    this.kzG = false;
    Object localObject = ab.getContext().getSharedPreferences("exdevice_pref", 0);
    StringBuilder localStringBuilder = new StringBuilder();
    at.AR();
    long l = ((SharedPreferences)localObject).getLong(com.tencent.mm.y.c.ww(), 0L);
    if (l != 0L)
    {
      w.i("MicroMsg.exdevice.GetBoundDeviceLogic", "this user has get bound device, last time is %d", new Object[] { Long.valueOf(l) });
      GMTrace.o(10947066331136L, 81562);
      return;
    }
    w.i("MicroMsg.exdevice.GetBoundDeviceLogic", "the user has not get bound device yet");
    GMTrace.o(10947066331136L, 81562);
  }
  
  public static void bB(long paramLong)
  {
    GMTrace.i(10947468984320L, 81565);
    w.i("MicroMsg.exdevice.GetBoundDeviceLogic", "update get bound hard device time : %d", new Object[] { Long.valueOf(paramLong) });
    SharedPreferences.Editor localEditor = ab.getContext().getSharedPreferences("exdevice_pref", 0).edit();
    StringBuilder localStringBuilder = new StringBuilder();
    at.AR();
    localEditor.putLong(com.tencent.mm.y.c.ww(), paramLong).commit();
    GMTrace.o(10947468984320L, 81565);
  }
  
  public final void a(int paramInt1, int paramInt2, final String paramString, k paramk)
  {
    GMTrace.i(10947603202048L, 81566);
    w.i("MicroMsg.exdevice.GetBoundDeviceLogic", "onSceneEnd errType = " + paramInt1 + ", errCode = " + paramInt2 + ",errMsg = " + paramString);
    this.kzG = false;
    if ((paramk == null) || (paramInt2 != 0) || (paramInt1 != 0))
    {
      w.e("MicroMsg.exdevice.GetBoundDeviceLogic", "do scene failed : %d, %d", new Object[] { Integer.valueOf(paramInt2), Integer.valueOf(paramInt1) });
      GMTrace.o(10947603202048L, 81566);
      return;
    }
    w.i("MicroMsg.exdevice.GetBoundDeviceLogic", "scene.getType() = %s", new Object[] { Integer.valueOf(paramk.getType()) });
    if (paramk.getType() == 539)
    {
      if ((paramInt1 != 0) || (paramInt2 != 0))
      {
        w.e("MicroMsg.exdevice.GetBoundDeviceLogic", "scene.getType() = %s, %s, %s", new Object[] { Integer.valueOf(paramk.getType()), Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
        if (this.kzH != null) {
          this.kzH.eb(false);
        }
        if ((this.htG != null) && (this.htG.isShowing())) {
          this.htG.dismiss();
        }
        GMTrace.o(10947603202048L, 81566);
        return;
      }
      paramString = (o)paramk;
      if ((paramString.fUa != null) && (paramString.fUa.gtD.gtK != null)) {}
      for (paramString = (xx)paramString.fUa.gtD.gtK; (paramString == null) || (paramString.upp == null); paramString = null)
      {
        if (this.kzH != null) {
          this.kzH.eb(false);
        }
        if ((this.htG != null) && (this.htG.isShowing())) {
          this.htG.dismiss();
        }
        GMTrace.o(10947603202048L, 81566);
        return;
      }
      at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(10982634029056L, 81827);
          i.bB(bg.Pv());
          Object localObject2 = ad.atR();
          Object localObject1 = new LinkedList();
          localObject2 = ((com.tencent.mm.plugin.exdevice.h.c)localObject2).Mx();
          Object localObject3;
          if ((localObject2 != null) && (((Cursor)localObject2).moveToFirst())) {
            do
            {
              localObject3 = new com.tencent.mm.plugin.exdevice.h.b();
              ((com.tencent.mm.plugin.exdevice.h.b)localObject3).b((Cursor)localObject2);
              ((List)localObject1).add(localObject3);
            } while (((Cursor)localObject2).moveToNext());
          }
          if (localObject2 != null) {
            ((Cursor)localObject2).close();
          }
          localObject1 = ((List)localObject1).iterator();
          label961:
          for (;;)
          {
            Object localObject4;
            if (((Iterator)localObject1).hasNext())
            {
              localObject2 = (com.tencent.mm.plugin.exdevice.h.b)((Iterator)localObject1).next();
              localObject3 = paramString.upp.iterator();
              do
              {
                if (!((Iterator)localObject3).hasNext()) {
                  break;
                }
                localObject4 = ((apb)((Iterator)localObject3).next()).tUt;
              } while ((!((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceType.equals(((agx)localObject4).tSz)) || (!((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceID.equals(((agx)localObject4).jhl)));
            }
            for (int i = 1;; i = 0)
            {
              if (i != 0) {
                break label961;
              }
              w.d("MicroMsg.exdevice.GetBoundDeviceLogic", "delete deviceId %s, deviceType %s ", new Object[] { ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceID, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceType });
              i.d((com.tencent.mm.plugin.exdevice.h.b)localObject2);
              ad.atR().ca(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceID, ((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceType);
              ad.auc();
              e.U(((com.tencent.mm.plugin.exdevice.h.b)localObject2).field_deviceID, false);
              break;
              localObject1 = paramString.upp.iterator();
              while (((Iterator)localObject1).hasNext())
              {
                Object localObject5 = (apb)((Iterator)localObject1).next();
                localObject2 = ((apb)localObject5).tUu;
                localObject3 = ((apb)localObject5).tUt;
                if ((localObject3 != null) && (localObject2 != null) && (!bg.nm(((agx)localObject3).jhl)))
                {
                  w.i("MicroMsg.exdevice.GetBoundDeviceLogic", "ModHardDevice deviceId = %s, deviceType = %s, BindFlag = %s", new Object[] { ((agx)localObject3).jhl, ((agx)localObject3).tSz, Integer.valueOf(((apb)localObject5).uES) });
                  localObject4 = ad.atR().wT(((agx)localObject3).jhl);
                  if (2 == ((apb)localObject5).uES)
                  {
                    w.w("MicroMsg.exdevice.GetBoundDeviceLogic", "This Device is unbind, Just leave. deviceId = %s, mac = %s, brandName = %s", new Object[] { ((agx)localObject3).jhl, ((agy)localObject2).tTU, ((agy)localObject2).uwj });
                    if (localObject4 != null)
                    {
                      i.d((com.tencent.mm.plugin.exdevice.h.b)localObject4);
                      ad.atR().ca(((com.tencent.mm.plugin.exdevice.h.b)localObject4).field_deviceID, ((com.tencent.mm.plugin.exdevice.h.b)localObject4).field_deviceType);
                      ad.auc();
                      e.U(((com.tencent.mm.plugin.exdevice.h.b)localObject4).field_deviceID, false);
                    }
                  }
                  else
                  {
                    localObject5 = new com.tencent.mm.plugin.exdevice.h.b();
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_deviceID = ((agx)localObject3).jhl;
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_deviceType = ((agx)localObject3).tSz;
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_connProto = ((agy)localObject2).uwk;
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_connStrategy = ((agy)localObject2).uwl;
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_closeStrategy = ((agy)localObject2).uwm;
                    if ((((agy)localObject2).fsJ == 2) && (localObject4 != null) && (((bp)localObject4).fsF != null)) {
                      ((agy)localObject2).gCC = ((bp)localObject4).fsF;
                    }
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).ci(((agy)localObject2).gCC);
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).cW(((agy)localObject2).uws);
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).cV(((agy)localObject2).uwr);
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).cU(((agy)localObject2).uwq);
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).dJ(((agy)localObject2).uwt);
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).cS(((agy)localObject2).lRV);
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).cT(((agy)localObject2).lPE);
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).dK(((agy)localObject2).fsJ);
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).B(((agy)localObject2).fsK);
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).cX(((agy)localObject2).fsL);
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).cY(((agy)localObject2).fsM);
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).cZ(((agy)localObject2).fsN);
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).da(((agy)localObject2).fsO);
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_url = "";
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_mac = com.tencent.mm.plugin.exdevice.j.b.xh(com.tencent.mm.plugin.exdevice.j.b.xi(((agy)localObject2).tTU));
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_md5Str = g.n(new String(((agx)localObject3).tSz + ((agx)localObject3).jhl).getBytes());
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_authKey = ((agy)localObject2).tSi;
                    ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_brandName = ((agy)localObject2).uwj;
                    if (((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_mac == 0L) {
                      ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_mac = System.currentTimeMillis();
                    }
                    boolean bool1;
                    if (localObject4 == null)
                    {
                      boolean bool2 = ad.atR().b((com.tencent.mm.sdk.e.c)localObject5);
                      bool1 = bool2;
                      if (bool2)
                      {
                        ad.auc();
                        e.U(((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_deviceID, true);
                        bool1 = bool2;
                      }
                    }
                    for (;;)
                    {
                      w.i("MicroMsg.exdevice.GetBoundDeviceLogic", "insert HardDeviceInfo %s, brandName = %s, deviceID = %s, deviceType = %s, connProto = %s, connStrategy = %s, closeStrategy = %s, mac = %s", new Object[] { Boolean.valueOf(bool1), ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_brandName, ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_deviceID, ((agx)localObject3).tSz, ((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_connProto, Integer.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_connStrategy), Integer.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_closeStrategy), Long.valueOf(((com.tencent.mm.plugin.exdevice.h.b)localObject5).field_mac) });
                      break;
                      if (ad.atR().e((com.tencent.mm.plugin.exdevice.h.b)localObject5) == 0) {
                        bool1 = false;
                      } else {
                        bool1 = true;
                      }
                    }
                  }
                }
              }
              GMTrace.o(10982634029056L, 81827);
              return;
            }
          }
        }
      });
      if (this.kzH != null) {
        this.kzH.eb(true);
      }
    }
    if ((this.htG != null) && (this.htG.isShowing())) {
      this.htG.dismiss();
    }
    GMTrace.o(10947603202048L, 81566);
  }
  
  public final void a(Context paramContext, final a parama)
  {
    GMTrace.i(10947200548864L, 81563);
    w.i("MicroMsg.exdevice.GetBoundDeviceLogic", "startGetBoundHardDevices");
    if (this.kzG)
    {
      if (this.kzH == null) {
        this.kzH = parama;
      }
      w.i("MicroMsg.exdevice.GetBoundDeviceLogic", "getting bound device now, just leave");
      GMTrace.o(10947200548864L, 81563);
      return;
    }
    final o localo = new o();
    if ((paramContext != null) && ((paramContext instanceof Activity)) && (!((Activity)paramContext).isFinishing()))
    {
      if ((this.htG != null) && (this.htG.isShowing())) {
        this.htG.dismiss();
      }
      paramContext.getString(R.l.cUG);
      this.htG = h.a(paramContext, paramContext.getString(R.l.dVv), new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(10985452601344L, 81848);
          at.wS().c(localo);
          i.a(i.this).dismiss();
          i.b(i.this);
          if (parama != null) {
            parama.eb(false);
          }
          GMTrace.o(10985452601344L, 81848);
        }
      });
    }
    this.kzH = parama;
    at.wS().a(localo, 0);
    GMTrace.o(10947200548864L, 81563);
  }
  
  public final boolean ec(boolean paramBoolean)
  {
    GMTrace.i(10947334766592L, 81564);
    if (this.kzG)
    {
      w.i("MicroMsg.exdevice.GetBoundDeviceLogic", "Getting bound device now, just leave");
      GMTrace.o(10947334766592L, 81564);
      return false;
    }
    long l1 = System.currentTimeMillis();
    SharedPreferences localSharedPreferences = ab.getContext().getSharedPreferences("exdevice_pref", 0);
    StringBuilder localStringBuilder = new StringBuilder();
    at.AR();
    long l2 = localSharedPreferences.getLong(com.tencent.mm.y.c.ww(), 0L);
    if ((!paramBoolean) && (l1 - l2 < 86400000L))
    {
      w.i("MicroMsg.exdevice.GetBoundDeviceLogic", "GetBoundHardDevices not now pp");
      GMTrace.o(10947334766592L, 81564);
      return false;
    }
    GMTrace.o(10947334766592L, 81564);
    return true;
  }
  
  public static abstract interface a
  {
    public abstract void eb(boolean paramBoolean);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\model\i.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */