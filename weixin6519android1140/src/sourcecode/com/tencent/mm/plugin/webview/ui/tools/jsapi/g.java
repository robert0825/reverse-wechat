package com.tencent.mm.plugin.webview.ui.tools.jsapi;

import android.app.Activity;
import android.app.DatePickerDialog.OnDateSetListener;
import android.app.ProgressDialog;
import android.app.Service;
import android.bluetooth.BluetoothAdapter;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnCancelListener;
import android.content.DialogInterface.OnClickListener;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.graphics.Color;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.location.LocationManager;
import android.net.Uri;
import android.nfc.NfcAdapter;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Looper;
import android.os.RemoteException;
import android.text.TextUtils;
import android.util.Base64;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnCreateContextMenuListener;
import android.widget.DatePicker;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mars.smc.IDKey;
import com.tencent.mm.R.a;
import com.tencent.mm.R.e;
import com.tencent.mm.R.l;
import com.tencent.mm.ad.b.b;
import com.tencent.mm.ad.u.a;
import com.tencent.mm.af.d.b;
import com.tencent.mm.af.d.b.a;
import com.tencent.mm.g.a.an;
import com.tencent.mm.g.a.an.a;
import com.tencent.mm.g.a.an.b;
import com.tencent.mm.g.a.cf;
import com.tencent.mm.g.a.cf.b;
import com.tencent.mm.g.a.cl;
import com.tencent.mm.g.a.cl.b;
import com.tencent.mm.g.a.cy;
import com.tencent.mm.g.a.cy.b;
import com.tencent.mm.g.a.cz;
import com.tencent.mm.g.a.cz.b;
import com.tencent.mm.g.a.dc;
import com.tencent.mm.g.a.dc.b;
import com.tencent.mm.g.a.dd;
import com.tencent.mm.g.a.dd.b;
import com.tencent.mm.g.a.de;
import com.tencent.mm.g.a.de.b;
import com.tencent.mm.g.a.dg;
import com.tencent.mm.g.a.dg.b;
import com.tencent.mm.g.a.dj;
import com.tencent.mm.g.a.dk;
import com.tencent.mm.g.a.dk.a;
import com.tencent.mm.g.a.dp;
import com.tencent.mm.g.a.dq;
import com.tencent.mm.g.a.dv;
import com.tencent.mm.g.a.dw;
import com.tencent.mm.g.a.dw.a;
import com.tencent.mm.g.a.dw.b;
import com.tencent.mm.g.a.dy;
import com.tencent.mm.g.a.dy.b;
import com.tencent.mm.g.a.dz;
import com.tencent.mm.g.a.dz.b;
import com.tencent.mm.g.a.ec;
import com.tencent.mm.g.a.ec.b;
import com.tencent.mm.g.a.em;
import com.tencent.mm.g.a.ez;
import com.tencent.mm.g.a.fc;
import com.tencent.mm.g.a.fc.b;
import com.tencent.mm.g.a.ff;
import com.tencent.mm.g.a.ff.b;
import com.tencent.mm.g.a.gk;
import com.tencent.mm.g.a.gl;
import com.tencent.mm.g.a.gl.b;
import com.tencent.mm.g.a.gm;
import com.tencent.mm.g.a.gn;
import com.tencent.mm.g.a.go;
import com.tencent.mm.g.a.go.b;
import com.tencent.mm.g.a.gq;
import com.tencent.mm.g.a.hh;
import com.tencent.mm.g.a.hh.a;
import com.tencent.mm.g.a.hi;
import com.tencent.mm.g.a.hi.a;
import com.tencent.mm.g.a.im;
import com.tencent.mm.g.a.im.b;
import com.tencent.mm.g.a.jm;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.g.a.jn.a;
import com.tencent.mm.g.a.kg;
import com.tencent.mm.g.a.ky;
import com.tencent.mm.g.a.ky.b;
import com.tencent.mm.g.a.ld;
import com.tencent.mm.g.a.lk;
import com.tencent.mm.g.a.lr;
import com.tencent.mm.g.a.mb;
import com.tencent.mm.g.a.mb.b;
import com.tencent.mm.g.a.ne;
import com.tencent.mm.g.a.ng;
import com.tencent.mm.g.a.ng.b;
import com.tencent.mm.g.a.oj;
import com.tencent.mm.g.a.oj.a;
import com.tencent.mm.g.a.ol;
import com.tencent.mm.g.a.oq;
import com.tencent.mm.g.a.pn;
import com.tencent.mm.g.a.qi;
import com.tencent.mm.g.a.qi.a;
import com.tencent.mm.g.a.qi.b;
import com.tencent.mm.g.a.qm;
import com.tencent.mm.g.a.sj;
import com.tencent.mm.g.a.sj.b;
import com.tencent.mm.g.a.sz;
import com.tencent.mm.g.a.tk;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.modelsns.SnsAdClick;
import com.tencent.mm.opensdk.modelmsg.WXAppExtendObject;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage;
import com.tencent.mm.opensdk.modelmsg.WXMediaMessage.IMediaObject;
import com.tencent.mm.opensdk.modelmsg.WXWebpageObject;
import com.tencent.mm.plugin.appbrand.report.AppBrandStatObject;
import com.tencent.mm.plugin.downloader.model.FileDownloadTaskInfo;
import com.tencent.mm.plugin.emoji.model.EmojiLogic;
import com.tencent.mm.plugin.webview.fts.e.e;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKFileItem;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKImageItem;
import com.tencent.mm.plugin.webview.model.WebViewJSSDKVideoItem;
import com.tencent.mm.plugin.webview.model.ad;
import com.tencent.mm.plugin.webview.model.ah;
import com.tencent.mm.plugin.webview.model.ai;
import com.tencent.mm.plugin.webview.model.ak;
import com.tencent.mm.plugin.webview.model.c.b;
import com.tencent.mm.plugin.webview.modelcache.a.b;
import com.tencent.mm.plugin.webview.modelcache.downloaderimpl.WebViewCacheDownloadHelper;
import com.tencent.mm.plugin.webview.modelcache.q.a;
import com.tencent.mm.plugin.webview.stub.WebViewStubTempUI;
import com.tencent.mm.plugin.webview.ui.tools.WebViewDownloadUI;
import com.tencent.mm.plugin.webview.ui.tools.widget.h.a;
import com.tencent.mm.pluginsdk.ui.applet.o.a;
import com.tencent.mm.pointers.PByteArray;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.pointers.PString;
import com.tencent.mm.protocal.GeneralControlWrapper;
import com.tencent.mm.protocal.JsapiPermissionWrapper;
import com.tencent.mm.protocal.MMProtocalJni;
import com.tencent.mm.protocal.c.g;
import com.tencent.mm.protocal.c.kj;
import com.tencent.mm.protocal.c.ahz;
import com.tencent.mm.protocal.c.aia;
import com.tencent.mm.protocal.c.aic;
import com.tencent.mm.protocal.c.ail;
import com.tencent.mm.protocal.c.aiv;
import com.tencent.mm.protocal.c.aiz;
import com.tencent.mm.protocal.c.aja;
import com.tencent.mm.protocal.c.ajc;
import com.tencent.mm.protocal.c.ajn;
import com.tencent.mm.protocal.c.ajr;
import com.tencent.mm.protocal.c.akr;
import com.tencent.mm.protocal.c.aks;
import com.tencent.mm.protocal.c.apv;
import com.tencent.mm.protocal.c.aqx;
import com.tencent.mm.protocal.c.awq;
import com.tencent.mm.protocal.c.bh;
import com.tencent.mm.protocal.c.bjo;
import com.tencent.mm.protocal.c.bka;
import com.tencent.mm.protocal.c.bkb;
import com.tencent.mm.protocal.c.bna;
import com.tencent.mm.protocal.c.bnd;
import com.tencent.mm.protocal.c.bqx;
import com.tencent.mm.protocal.c.bqy;
import com.tencent.mm.protocal.c.bqz;
import com.tencent.mm.protocal.c.bra;
import com.tencent.mm.protocal.c.oe;
import com.tencent.mm.protocal.c.wj;
import com.tencent.mm.protocal.c.xb;
import com.tencent.mm.protocal.c.xr;
import com.tencent.mm.protocal.c.xt;
import com.tencent.mm.sdk.platformtools.MMBitmapFactory;
import com.tencent.mm.sdk.platformtools.aa;
import com.tencent.mm.sdk.platformtools.am;
import com.tencent.mm.sdk.platformtools.o;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.ay;
import com.tencent.mm.storage.emotion.EmojiInfo;
import com.tencent.mm.storage.w.a;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.MMActivity.a;
import com.tencent.mm.ui.base.p.d;
import com.tencent.mm.y.ak.a;
import com.tencent.mm.y.ak.b;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.as;
import com.tencent.mm.y.bc;
import com.tencent.mm.y.u.b;
import com.tencent.wework.api.IWWAPI;
import com.tencent.wework.api.WWAPIFactory;
import com.tencent.wework.api.model.WWMediaLink;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.OutputStream;
import java.io.Serializable;
import java.io.UnsupportedEncodingException;
import java.lang.ref.WeakReference;
import java.net.URI;
import java.net.URLEncoder;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import org.json.JSONTokener;

public final class g
  implements MMActivity.a
{
  private static final char[] iGu;
  private static final String[] iGv;
  private static final HashSet<String> ieY;
  public static Context rSJ;
  public static int rSK;
  public static final LinkedList<Runnable> rTi;
  public static boolean rTj;
  public static a rTk;
  public Context context;
  private WXMediaMessage eLU;
  public final int eQd;
  public com.tencent.mm.modelgeo.c fJm;
  public Map<String, ahz> fJq;
  public ProgressDialog htG;
  public com.tencent.mm.modelgeo.a.a ifj;
  private com.tencent.mm.sdk.platformtools.ae ifk;
  private String juZ;
  public boolean kNw;
  public HashSet<String> lGH;
  public ProgressDialog moR;
  com.tencent.mm.sdk.b.c oQM;
  public com.tencent.mm.sdk.b.c oQN;
  public float oyX;
  public com.tencent.mm.plugin.webview.stub.e rEM;
  public i rSA;
  public HashSet<String> rSB;
  public Bundle rSC;
  private String rSD;
  public HashMap<String, String> rSE;
  public HashMap<String, String> rSF;
  public String rSG;
  public com.tencent.mm.plugin.webview.stub.e rSH;
  private com.tencent.mm.plugin.webview.stub.e rSI;
  public c rSL;
  public boolean rSM;
  public final j rSN;
  final com.tencent.mm.plugin.webview.modeltools.d rSO;
  public long rSP;
  private int rSQ;
  private int rSR;
  Map<String, String> rSS;
  public Map<String, List<aia>> rST;
  public List<ahz> rSU;
  public boolean rSV;
  public long rSW;
  LocationManager rSX;
  public String rSY;
  public String rSZ;
  public i rSz;
  public boolean rTa;
  private SensorEventListener rTb;
  public com.tencent.mm.sdk.b.c rTc;
  public i rTd;
  public com.tencent.mm.sdk.b.c rTe;
  public final Map<String, b> rTf;
  public String rTg;
  public final List<String> rTh;
  public final Map<Integer, c> rTl;
  private int rTm;
  private int rTn;
  public volatile i rTo;
  public final com.tencent.mm.sdk.b.c rTp;
  
  static
  {
    GMTrace.i(12241462099968L, 91206);
    rSK = -1;
    iGu = new char[] { 60, 62, 34, 39, 38, 32, 39 };
    iGv = new String[] { "&lt;", "&gt;", "&quot;", "&apos;", "&amp;", "&nbsp;", "&#39;" };
    HashSet localHashSet = new HashSet();
    ieY = localHashSet;
    localHashSet.add("gcj02");
    ieY.add("wgs84");
    rTi = new LinkedList();
    rTj = false;
    rTk = new a()
    {
      public final void Wd()
      {
        GMTrace.i(19449625182208L, 144911);
        q.a.rGn.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18142076076032L, 135169);
            Runnable localRunnable = (Runnable)g.rTi.pollFirst();
            if (localRunnable != null)
            {
              localRunnable.run();
              GMTrace.o(18142076076032L, 135169);
              return;
            }
            w.i("MicroMsg.MsgHandler", "authJsApiQueue processed!");
            g.rTj = false;
            GMTrace.o(18142076076032L, 135169);
          }
        });
        GMTrace.o(19449625182208L, 144911);
      }
    };
    GMTrace.o(12241462099968L, 91206);
  }
  
  g(int paramInt)
  {
    GMTrace.i(12180661469184L, 90753);
    this.htG = null;
    this.juZ = null;
    this.rSD = null;
    this.rSE = null;
    this.rSF = null;
    this.kNw = false;
    this.rSG = null;
    this.rSL = null;
    this.rSM = false;
    this.rSP = 0L;
    this.rSR = -1;
    this.rSS = new ConcurrentHashMap();
    this.fJq = new ConcurrentHashMap();
    this.rST = new ConcurrentHashMap();
    this.rSU = new CopyOnWriteArrayList();
    this.rSV = false;
    this.rSW = 0L;
    this.oQM = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(final dk paramAnonymousdk)
      {
        GMTrace.i(19451235794944L, 144923);
        String str1;
        int i;
        int j;
        double d1;
        double d2;
        String str2;
        boolean bool4;
        boolean bool1;
        boolean bool2;
        Object localObject1;
        if ((paramAnonymousdk != null) && ((paramAnonymousdk instanceof dk)))
        {
          System.currentTimeMillis();
          long l = g.this.rSW;
          if (g.rSK != -1)
          {
            g.this.rSz = g.this.yl(g.rSK).rSz;
            g.this.rEM = g.this.yl(g.rSK).rEM;
          }
          g.this.rSW = System.currentTimeMillis();
          str1 = paramAnonymousdk.eFd.eFb;
          i = paramAnonymousdk.eFd.eFe;
          j = paramAnonymousdk.eFd.eFf & 0xFFFF;
          d1 = paramAnonymousdk.eFd.eFh;
          d2 = paramAnonymousdk.eFd.eFg;
          w.i("MicroMsg.MsgHandler", "[MsgHandler][IBeaconRangeResult],iBeacon = %s", new Object[] { str1 + "," + i + "," + j + "," + d1 });
          str2 = str1 + "," + i + "," + j;
          boolean bool3 = false;
          bool4 = false;
          bool1 = false;
          bool2 = false;
          if (g.this.fJq.containsKey(str2)) {
            break label902;
          }
          paramAnonymousdk = new ahz();
          paramAnonymousdk.lOv = str1;
          paramAnonymousdk.major = i;
          paramAnonymousdk.minor = j;
          g.this.fJq.put(str2, paramAnonymousdk);
          bool1 = bool3;
          if (g.this.rST.containsKey(str1 + "," + i))
          {
            localObject1 = (List)g.this.rST.get(str1 + "," + i);
            bool1 = bool3;
            if (localObject1 != null) {
              localObject1 = ((List)localObject1).iterator();
            }
          }
        }
        for (;;)
        {
          bool1 = bool2;
          Object localObject2;
          if (((Iterator)localObject1).hasNext())
          {
            localObject2 = (aia)((Iterator)localObject1).next();
            if ((localObject2 == null) || (((aia)localObject2).uxw == null) || (((aia)localObject2).uxw.isEmpty())) {
              break label1112;
            }
            localObject2 = ((aia)localObject2).uxw.iterator();
            aic localaic;
            do
            {
              if (!((Iterator)localObject2).hasNext()) {
                break;
              }
              localaic = (aic)((Iterator)localObject2).next();
            } while ((j < localaic.uxx) || (j > localaic.uxy));
          }
          label895:
          label902:
          label1112:
          for (bool1 = true; bool1; bool1 = bool2)
          {
            bool2 = bool1;
            if (!bool1)
            {
              g.this.rSU.add(paramAnonymousdk);
              localObject1 = null;
              paramAnonymousdk = (dk)localObject1;
              if (g.this.rSz != null)
              {
                paramAnonymousdk = (dk)localObject1;
                if (g.this.rSz.nSp != null)
                {
                  paramAnonymousdk = g.this.rSz.nSp.get("url");
                  if (paramAnonymousdk == null) {
                    break label895;
                  }
                  paramAnonymousdk = paramAnonymousdk.toString();
                  paramAnonymousdk = com.tencent.mm.sdk.platformtools.bg.nl(g.this.rSL.Ms(paramAnonymousdk));
                }
              }
              bool2 = bool1;
              if (!g.this.rSV)
              {
                g.this.rSV = true;
                paramAnonymousdk = new com.tencent.mm.plugin.webview.model.h(g.this.rSU, com.tencent.mm.sdk.platformtools.bg.nl(paramAnonymousdk));
                g.this.rSU.clear();
                com.tencent.mm.y.at.wS().a(1704, new com.tencent.mm.ad.e()
                {
                  public final void a(int paramAnonymous2Int1, int paramAnonymous2Int2, String paramAnonymous2String, com.tencent.mm.ad.k paramAnonymous2k)
                  {
                    GMTrace.i(19426002862080L, 144735);
                    if ((paramAnonymous2Int1 == 0) && (paramAnonymous2Int2 == 0))
                    {
                      paramAnonymous2String = (xb)paramAnonymousdk.gMj.gtD.gtK;
                      if (paramAnonymous2String.kBk == 0)
                      {
                        paramAnonymous2String = paramAnonymous2String.uoR;
                        paramAnonymous2k = new StringBuilder();
                        Iterator localIterator = paramAnonymous2String.iterator();
                        while (localIterator.hasNext())
                        {
                          Object localObject = (aia)localIterator.next();
                          String str = ((aia)localObject).lOv + "," + ((aia)localObject).major;
                          if (g.this.rST.containsKey(str)) {
                            paramAnonymous2String = (List)g.this.rST.get(str);
                          }
                          for (;;)
                          {
                            paramAnonymous2String.add(localObject);
                            paramAnonymous2k.append("{uuid:" + ((aia)localObject).lOv + ",major:" + ((aia)localObject).major + ",minors:[");
                            paramAnonymous2String = ((aia)localObject).uxw.iterator();
                            while (paramAnonymous2String.hasNext())
                            {
                              localObject = (aic)paramAnonymous2String.next();
                              paramAnonymous2k.append(((aic)localObject).uxx + "-" + ((aic)localObject).uxy + ",");
                            }
                            paramAnonymous2String = new ArrayList();
                            g.this.rST.put(str, paramAnonymous2String);
                          }
                          paramAnonymous2k.append("]},");
                        }
                        w.d("MicroMsg.MsgHandler", "[MsgHandler][ibeacon check callback]" + paramAnonymous2k.toString());
                      }
                    }
                    com.tencent.mm.y.at.wS().b(1704, this);
                    g.this.rSV = false;
                    GMTrace.o(19426002862080L, 144735);
                  }
                });
                com.tencent.mm.y.at.wS().a(paramAnonymousdk, 0);
                bool2 = bool1;
              }
            }
            for (;;)
            {
              w.d("MicroMsg.MsgHandler", "[MsgHandler][ibeacon check and find] find:%s", new Object[] { String.valueOf(bool2) + "," + str2 });
              try
              {
                if ((g.this.rEM != null) && (bool2))
                {
                  paramAnonymousdk = new Bundle();
                  paramAnonymousdk.putString("uuid", str1);
                  paramAnonymousdk.putInt("major", i);
                  paramAnonymousdk.putInt("minor", j);
                  paramAnonymousdk.putDouble("accuracy", d2);
                  paramAnonymousdk.putDouble("rssi", d1);
                  paramAnonymousdk.putFloat("heading", g.this.oyX);
                  g.this.rEM.m(40002, paramAnonymousdk);
                }
              }
              catch (RemoteException paramAnonymousdk)
              {
                for (;;)
                {
                  w.i("MicroMsg.MsgHandler", "[MsgHandler]callback failure:%s", new Object[] { paramAnonymousdk.getMessage() });
                }
              }
              w.i("MicroMsg.MsgHandler", "[MsgHandler]result iBeacon = %s,beaconMap.size:%d", new Object[] { g.this.fJq.get(str2), Integer.valueOf(g.this.fJq.size()) });
              GMTrace.o(19451235794944L, 144923);
              return false;
              paramAnonymousdk = "";
              break;
              paramAnonymousdk = (List)g.this.rST.get(str1 + "," + i);
              bool2 = bool4;
              if (paramAnonymousdk != null)
              {
                paramAnonymousdk = paramAnonymousdk.iterator();
                do
                {
                  bool2 = bool1;
                  if (!paramAnonymousdk.hasNext()) {
                    break;
                  }
                  localObject1 = (aia)paramAnonymousdk.next();
                  bool2 = bool1;
                  if (localObject1 != null)
                  {
                    bool2 = bool1;
                    if (((aia)localObject1).uxw != null)
                    {
                      bool2 = bool1;
                      if (!((aia)localObject1).uxw.isEmpty())
                      {
                        localObject1 = ((aia)localObject1).uxw.iterator();
                        do
                        {
                          bool2 = bool1;
                          if (!((Iterator)localObject1).hasNext()) {
                            break;
                          }
                          localObject2 = (aic)((Iterator)localObject1).next();
                        } while ((j < ((aic)localObject2).uxx) || (j > ((aic)localObject2).uxy));
                        bool2 = true;
                      }
                    }
                  }
                  bool1 = bool2;
                } while (!bool2);
              }
            }
          }
          bool2 = bool1;
        }
      }
    };
    this.oQN = new com.tencent.mm.sdk.b.c() {};
    this.rSX = null;
    this.rSY = "-1000.0";
    this.rSZ = "-1000.0";
    this.rTa = false;
    this.oyX = 0.0F;
    this.rTb = new SensorEventListener()
    {
      public final void onAccuracyChanged(Sensor paramAnonymousSensor, int paramAnonymousInt)
      {
        GMTrace.i(19450430488576L, 144917);
        GMTrace.o(19450430488576L, 144917);
      }
      
      public final void onSensorChanged(SensorEvent paramAnonymousSensorEvent)
      {
        GMTrace.i(19450296270848L, 144916);
        if (paramAnonymousSensorEvent.sensor.getType() == 3) {
          g.this.oyX = paramAnonymousSensorEvent.values[0];
        }
        GMTrace.o(19450296270848L, 144916);
      }
    };
    this.fJm = null;
    this.ifj = null;
    this.rTe = new com.tencent.mm.sdk.b.c() {};
    this.rTf = new HashMap();
    this.rTh = new LinkedList();
    this.rTl = new HashMap();
    this.rTm = 0;
    this.rTn = 1000;
    this.rTo = null;
    this.rTp = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(jn paramAnonymousjn)
      {
        GMTrace.i(19438753546240L, 144830);
        String str = paramAnonymousjn.eNp.state;
        w.i("MicroMsg.MsgHandler", "backgroundAudioListener callback in, state:%s", new Object[] { str });
        boolean bool = paramAnonymousjn.eNp.eNr;
        int i = (int)(paramAnonymousjn.eNp.duration / 1000L);
        if (!bool)
        {
          w.e("MicroMsg.MsgHandler", "is not from QQMusicPlayer, don't callback!");
          GMTrace.o(19438753546240L, 144830);
          return false;
        }
        try
        {
          Bundle localBundle = new Bundle();
          localBundle.putString("background_audio_state_player_state", str);
          localBundle.putInt("background_audio_state_player_duration", i);
          if (paramAnonymousjn.eNp.eNl != null)
          {
            localBundle.putString("background_audio_state_player_src", paramAnonymousjn.eNp.eNl.uFw);
            localBundle.putString("background_audio_state_player_src_id", paramAnonymousjn.eNp.eNl.gOO);
          }
          localBundle.putInt("background_audio_state_player_err_code", paramAnonymousjn.eNp.errCode);
          str = "";
          if (!TextUtils.isEmpty(paramAnonymousjn.eNp.eAR)) {
            str = paramAnonymousjn.eNp.eAR;
          }
          localBundle.putString("background_audio_state_player_err_msg", str);
          if (g.this.rEM != null)
          {
            w.i("MicroMsg.MsgHandler", "onBackgroundAudioStateChange");
            g.this.rEM.m(2100, localBundle);
          }
          for (;;)
          {
            GMTrace.o(19438753546240L, 144830);
            return true;
            w.e("MicroMsg.MsgHandler", "backgroundAudioListener callbacker is null");
          }
          return false;
        }
        catch (Exception paramAnonymousjn)
        {
          w.e("MicroMsg.MsgHandler", paramAnonymousjn.getMessage());
          GMTrace.o(19438753546240L, 144830);
        }
      }
    };
    this.eQd = paramInt;
    this.kNw = false;
    this.rSB = new HashSet();
    this.lGH = new HashSet();
    this.rSL = new c(this.eQd);
    this.rSN = new j();
    this.rSO = new com.tencent.mm.plugin.webview.modeltools.d();
    GMTrace.o(12180661469184L, 90753);
  }
  
  private void My(String paramString)
  {
    GMTrace.i(12181332557824L, 90758);
    if (this.rSC == null) {
      this.rSC = new Bundle();
    }
    int j = com.tencent.mm.sdk.platformtools.bg.getInt(paramString, 33);
    int i = j;
    if (this.rSC.getBoolean("KFromBizSearch"))
    {
      paramString = this.rSC.getBundle("KBizSearchExtArgs");
      i = j;
      if (paramString != null) {
        i = paramString.getInt("Contact_Scene");
      }
    }
    this.rSC.putInt("Contact_Scene", i);
    GMTrace.o(12181332557824L, 90758);
  }
  
  private boolean Mz(String paramString)
  {
    GMTrace.i(12181466775552L, 90759);
    w.i("MicroMsg.MsgHandler", "getFromMenu, functionName = " + paramString);
    if (this.rSB.contains(paramString))
    {
      this.rSB.remove(paramString);
      GMTrace.o(12181466775552L, 90759);
      return true;
    }
    GMTrace.o(12181466775552L, 90759);
    return false;
  }
  
  private int Ya()
  {
    j = 0;
    GMTrace.i(12188848750592L, 90814);
    i = j;
    try
    {
      if (this.rEM != null)
      {
        Bundle localBundle = this.rEM.d(99, null);
        i = j;
        if (localBundle != null) {
          i = localBundle.getInt("geta8key_scene");
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "invokeAsResult error.%s", new Object[] { localRemoteException });
        i = j;
      }
    }
    GMTrace.o(12188848750592L, 90814);
    return i;
  }
  
  private void a(final i parami, String paramString1, final String paramString2, int paramInt1, int paramInt2, int paramInt3, final String paramString3, boolean paramBoolean)
  {
    GMTrace.i(12190325145600L, 90825);
    final c.b local55 = new c.b()
    {
      public final void b(boolean paramAnonymousBoolean, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
      {
        GMTrace.i(19432847966208L, 144786);
        w.i("MicroMsg.MsgHandler", paramString3 + " on cdn finish,  is success : %s, mediaid : %s, local id is : %s, mediaUrl : %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString2, paramAnonymousString1, paramAnonymousString3 });
        if ((!com.tencent.mm.sdk.platformtools.bg.nm(paramAnonymousString1)) && (paramAnonymousString1.equals(paramString2)))
        {
          com.tencent.mm.plugin.webview.modeltools.f.bCV().a(this);
          if (g.this.htG != null)
          {
            g.this.htG.dismiss();
            g.this.htG = null;
          }
          if (!paramAnonymousBoolean)
          {
            g.this.a(parami, paramString3 + ":fail", null);
            GMTrace.o(19432847966208L, 144786);
            return;
          }
          paramAnonymousString1 = new HashMap();
          paramAnonymousString1.put("serverId", paramAnonymousString2);
          paramAnonymousString1.put("mediaUrl", paramAnonymousString3);
          g.this.a(parami, paramString3 + ":ok", paramAnonymousString1);
        }
        GMTrace.o(19432847966208L, 144786);
      }
    };
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(paramString2);
    if (localWebViewJSSDKFileItem == null)
    {
      a(parami, paramString3 + ":fail", null);
      GMTrace.o(12190325145600L, 90825);
      return;
    }
    int i;
    Object localObject1;
    if (localWebViewJSSDKFileItem.hOs)
    {
      i = 0;
      localObject1 = new PString();
      Object localObject2 = new PInt();
      PInt localPInt = new PInt();
      long l = com.tencent.mm.ao.n.IZ().a(localWebViewJSSDKFileItem.hOo, i, 0, 0, (PString)localObject1, (PInt)localObject2, localPInt);
      localObject2 = com.tencent.mm.ao.n.IZ().b(Long.valueOf(l));
      localObject1 = localWebViewJSSDKFileItem.hOo;
      localObject2 = com.tencent.mm.ao.n.IZ().l(((com.tencent.mm.ao.d)localObject2).gGS, "", "");
      localWebViewJSSDKFileItem.hOo = ((String)localObject2);
      w.i("MicroMsg.MsgHandler", "Image Inserted: %s", new Object[] { localObject2 });
      boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCV().a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, local55);
      w.i("MicroMsg.MsgHandler", paramString3 + ", add cdn upload task result : %b", new Object[] { Boolean.valueOf(bool) });
      if (bool) {
        break label311;
      }
      a(parami, paramString3 + ":fail", null);
    }
    for (;;)
    {
      localWebViewJSSDKFileItem.hOo = ((String)localObject1);
      GMTrace.o(12190325145600L, 90825);
      return;
      i = 1;
      break;
      label311:
      if (paramBoolean)
      {
        paramString1 = this.context;
        this.context.getString(R.l.cUG);
        this.htG = com.tencent.mm.ui.base.h.a(paramString1, this.context.getString(R.l.elO), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(19428418781184L, 144753);
            com.tencent.mm.plugin.webview.modeltools.f.bCV().a(local55);
            com.tencent.mm.plugin.webview.modeltools.f.bCV();
            com.tencent.mm.plugin.webview.model.ac.oK(paramString2);
            g.this.a(parami, paramString3 + ":fail", null);
            GMTrace.o(19428418781184L, 144753);
          }
        });
      }
      else if ((this.context instanceof Activity))
      {
        ((Activity)this.context).finish();
        this.rEM = this.rSI;
      }
    }
  }
  
  private void a(String paramString1, String paramString2, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(12199586168832L, 90894);
    if (paramBundle == null)
    {
      GMTrace.o(12199586168832L, 90894);
      return;
    }
    String str1 = paramBundle.getString("share_report_pre_msg_url");
    String str2 = paramBundle.getString("share_report_pre_msg_title");
    String str3 = paramBundle.getString("share_report_pre_msg_desc");
    String str4 = paramBundle.getString("share_report_pre_msg_icon_url");
    String str5 = paramBundle.getString("share_report_pre_msg_appid");
    int i = paramBundle.getInt("share_report_from_scene", 0);
    String str6 = paramBundle.getString("share_report_biz_username");
    String str7 = paramBundle.getString("share_report_current_url");
    String str8 = paramBundle.getString("share_report_current_title");
    if ((this.eLU.mediaObject instanceof WXWebpageObject)) {}
    for (paramBundle = ((WXWebpageObject)this.eLU.mediaObject).webpageUrl;; paramBundle = "")
    {
      String str9 = this.eLU.title;
      String str10 = this.eLU.description;
      com.tencent.mm.plugin.report.service.g.ork.i(14062, new Object[] { str1, str2, str3, str4, str5, Integer.valueOf(i), str6, str7, str8, paramString1, paramBundle, str9, str10, paramString2, Integer.valueOf(paramInt) });
      GMTrace.o(12199586168832L, 90894);
      return;
    }
  }
  
  private boolean a(i parami, String paramString, long paramLong)
  {
    GMTrace.i(12196364943360L, 90870);
    String str1 = new JSONObject((String)parami.nSp.get("data")).optString("content");
    if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
    {
      a(parami, "sendEnterpriseChat:fail_params error", null);
      GMTrace.o(12196364943360L, 90870);
      return true;
    }
    Object localObject2 = com.tencent.mm.af.x.FI().t(paramLong);
    synchronized (com.tencent.mm.af.a.e.gyk)
    {
      String str2 = com.tencent.mm.af.a.e.Br();
      com.tencent.mm.af.a.e.d((com.tencent.mm.af.a.c)localObject2);
      localObject2 = new ol();
      ((ol)localObject2).eTx.eTy = paramString;
      ((ol)localObject2).eTx.content = str1;
      ((ol)localObject2).eTx.type = com.tencent.mm.y.s.go(paramString);
      ((ol)localObject2).eTx.flags = 0;
      boolean bool = com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      com.tencent.mm.af.a.e.jk(str2);
      if (!bool)
      {
        a(parami, "sendEnterpriseChat:fail", null);
        GMTrace.o(12196364943360L, 90870);
        return true;
      }
    }
    a(parami, "sendEnterpriseChat:ok", null);
    if (this.context != null) {
      com.tencent.mm.ui.base.h.bm(this.context, this.context.getResources().getString(R.l.cUy));
    }
    GMTrace.o(12196364943360L, 90870);
    return true;
  }
  
  private boolean a(i parami, boolean paramBoolean)
  {
    GMTrace.i(12182674735104L, 90768);
    Object localObject1 = parami.nSp.get("__jsapi_fw_ext_info");
    String str2 = (String)parami.nSp.get("link");
    String str1 = null;
    if ((localObject1 instanceof Bundle)) {
      str1 = ((Bundle)localObject1).getString("__jsapi_fw_ext_info_key_current_url");
    }
    Object localObject3 = this.rSL;
    int j;
    label142:
    String str3;
    if (TextUtils.isEmpty(str1))
    {
      localObject1 = null;
      if ((TextUtils.isEmpty(str2)) || (localObject1 == null) || (((c.d)localObject1).rRS == null) || (((c.d)localObject1).rRS.size() <= 0)) {
        break label682;
      }
      localObject3 = new LinkedList();
      j = str2.indexOf("://");
      if (j != -1) {
        break label315;
      }
      i = 1;
      str3 = str2.substring(i + j);
      Iterator localIterator = ((c.d)localObject1).rRS.iterator();
      label165:
      do
      {
        if (!localIterator.hasNext()) {
          break;
        }
        localObject1 = (String)localIterator.next();
        w.i("MicroMsg.MsgHandler", "now domain : %s", new Object[] { localObject1 });
      } while (TextUtils.isEmpty((CharSequence)localObject1));
      j = ((String)localObject1).indexOf("://");
      if (j != -1) {
        break label320;
      }
    }
    Object localObject2;
    label315:
    label320:
    for (int i = 1;; i = 3)
    {
      localObject2 = ((String)localObject1).substring(i + j);
      if (((String)localObject2).contains("/")) {
        break label325;
      }
      ((List)localObject3).add(localObject2);
      break label165;
      localObject2 = (c.d)((c)localObject3).lKc.get(str1);
      localObject1 = localObject2;
      if (localObject2 != null) {
        break;
      }
      localObject1 = c.zB(str1);
      localObject1 = (c.d)((c)localObject3).lKc.get(localObject1);
      break;
      i = 3;
      break label142;
    }
    label325:
    if (str3.equals(localObject2))
    {
      i = 0;
      label337:
      if ((i == 0) || (((List)localObject3).isEmpty())) {
        break label674;
      }
      localObject1 = URI.create(str2).getHost();
      w.i("MicroMsg.MsgHandler", "share domain : %s", new Object[] { localObject1 });
      if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) {
        break label674;
      }
      localObject2 = ((List)localObject3).iterator();
      while (((Iterator)localObject2).hasNext())
      {
        str2 = (String)((Iterator)localObject2).next();
        if ((((String)localObject1).equals(str2)) || (((String)localObject1).endsWith("." + str2))) {
          i = 0;
        }
      }
    }
    for (;;)
    {
      if ((i != 0) || (!paramBoolean))
      {
        try
        {
          localObject2 = this.rEM.d(84, null);
          if (localObject2 == null) {
            break label663;
          }
          localObject1 = str1;
          if (TextUtils.isEmpty(str1)) {
            localObject1 = ak.zA(((Bundle)localObject2).getString("webview_current_url"));
          }
          parami.nSp.put("img_url", "");
          parami.nSp.put("link", localObject1);
          parami.nSp.put("desc", ((Bundle)localObject2).getString("webview_current_desc"));
          parami.nSp.put("title", ((Bundle)localObject2).getString("webview_current_title"));
          GMTrace.o(12182674735104L, 90768);
          return true;
        }
        catch (RemoteException parami)
        {
          w.e("MicroMsg.MsgHandler", "invokeAsResult error : %s", new Object[] { parami });
        }
        localObject1 = localObject2;
        if (!((String)localObject2).endsWith("/")) {
          localObject1 = (String)localObject2 + "/";
        }
        if (!str3.startsWith((String)localObject1)) {
          break;
        }
        i = 0;
        break label337;
      }
      label663:
      GMTrace.o(12182674735104L, 90768);
      return false;
      label674:
      continue;
      i = 1;
      break label337;
      label682:
      i = 0;
    }
  }
  
  private boolean a(Integer paramInteger, int paramInt1, int paramInt2, String paramString, Intent paramIntent)
  {
    GMTrace.i(12185224871936L, 90787);
    paramIntent.putExtra("key_product_scene", paramInt1);
    w.e("MicroMsg.MsgHandler", "doOpenProductView, productType = %d", new Object[] { paramInteger });
    if ((this.context instanceof MMActivity))
    {
      ((MMActivity)this.context).vKC = this;
      switch (paramInteger.intValue())
      {
      default: 
        w.e("MicroMsg.MsgHandler", "doOpenProductView fail, productType = %d", new Object[] { paramInteger });
        if (paramInt1 == 8) {
          a(this.rSz, "open_product_view_with_id:fail", null);
        }
        break;
      }
    }
    for (;;)
    {
      GMTrace.o(12185224871936L, 90787);
      return true;
      switch (paramInt2)
      {
      default: 
        w.e("MicroMsg.MsgHandler", "doOpenProductView fail, productType = %d, viewType = %d", new Object[] { paramInteger, Integer.valueOf(paramInt2) });
        a(this.rSz, "open_product_view:fail", null);
        break;
      case 0: 
        com.tencent.mm.bj.d.b(this.context, "product", ".ui.MallProductUI", paramIntent);
        a(this.rSz, "open_product_view:ok", null);
        break;
      case 1: 
        paramIntent.putExtra("key_Qrcode_Url", paramString);
        paramIntent.putExtra("key_ProductUI_getProductInfoScene", 4);
        com.tencent.mm.bj.d.b(this.context, "scanner", ".ui.ProductUI", paramIntent, 10);
        continue;
        com.tencent.mm.bj.d.b(this.context, "card", ".ui.CardProductUI", paramIntent);
        a(this.rSz, "open_product_view:ok", null);
        continue;
        a(this.rSz, "open_product_view:fail", null);
      }
    }
  }
  
  private boolean a(String paramString, i parami)
  {
    GMTrace.i(12186030178304L, 90793);
    for (;;)
    {
      try
      {
        JSONArray localJSONArray = new JSONArray(paramString);
        if (localJSONArray.length() <= 0) {
          continue;
        }
        localJSONObject1 = new JSONObject();
        i = 0;
        if (i >= localJSONArray.length()) {
          continue;
        }
        str = localJSONArray.getString(i);
        localFileDownloadTaskInfo = com.tencent.mm.plugin.downloader.model.f.apJ().vv(str);
        localJSONObject2 = new JSONObject();
        switch (localFileDownloadTaskInfo.status)
        {
        }
      }
      catch (JSONException paramString)
      {
        JSONObject localJSONObject1;
        int i;
        String str;
        FileDownloadTaskInfo localFileDownloadTaskInfo;
        JSONObject localJSONObject2;
        w.e("MicroMsg.MsgHandler", paramString.getMessage());
        a(parami, "query_download_task:fail", null);
        continue;
        paramString = "default";
        continue;
        paramString = "api_not_support";
        continue;
        paramString = "downloading";
        continue;
        paramString = "default";
        continue;
        paramString = "download_pause";
        continue;
        paramString = "download_fail";
        continue;
      }
      localJSONObject2.put("download_id", localFileDownloadTaskInfo.id);
      localJSONObject2.put("state", paramString);
      if ((paramString == "downloading") && (localFileDownloadTaskInfo.eJe != 0L)) {
        localJSONObject2.put("progress", localFileDownloadTaskInfo.eJd / localFileDownloadTaskInfo.eJe * 100L);
      }
      localJSONObject1.put(str, localJSONObject2);
      i += 1;
      continue;
      if (!com.tencent.mm.a.e.aZ(localFileDownloadTaskInfo.path)) {
        continue;
      }
      paramString = "download_succ";
    }
    paramString = new HashMap();
    paramString.put("result", localJSONObject1);
    a(parami, "query_download_task:ok", paramString);
    for (;;)
    {
      GMTrace.o(12186030178304L, 90793);
      return true;
      a(parami, "query_download_task:fail", null);
    }
  }
  
  private String aP(i parami)
  {
    GMTrace.i(12188982968320L, 90815);
    Object localObject2 = null;
    Object localObject3 = bFC();
    Object localObject1;
    if (aGs() == 27) {
      localObject1 = this.rSD;
    }
    for (;;)
    {
      GMTrace.o(12188982968320L, 90815);
      return (String)localObject1;
      if ((bDx() != 8) && (bDx() != -1))
      {
        if (this.juZ != null)
        {
          localObject1 = this.juZ;
        }
        else
        {
          localObject1 = localObject2;
          if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject3))
          {
            w.i("MicroMsg.MsgHandler", "BrandUsername in H5 is null, check if it is in hardBiz chat");
            localObject3 = com.tencent.mm.af.f.iK((String)localObject3);
            localObject1 = localObject2;
            if (localObject3 != null)
            {
              localObject3 = ((com.tencent.mm.af.d)localObject3).bq(false);
              localObject1 = localObject2;
              if (localObject3 != null)
              {
                localObject1 = localObject2;
                if (((d.b)localObject3).EZ() != null)
                {
                  localObject1 = localObject2;
                  if (((d.b)localObject3).EZ().Fi())
                  {
                    localObject1 = (String)parami.nSp.get("src_username");
                    w.i("MicroMsg.MsgHandler", "HardBiz chat, key_src_username(%s)", new Object[] { (String)parami.nSp.get("src_username") });
                  }
                }
              }
            }
          }
        }
      }
      else
      {
        localObject1 = localObject2;
        if (parami != null)
        {
          localObject1 = (String)parami.nSp.get("src_username");
          w.i("MicroMsg.MsgHandler", "key_src_username(%s)", new Object[] { (String)parami.nSp.get("src_username") });
        }
      }
    }
  }
  
  private void b(final i parami, final String paramString1, final String paramString2, final int paramInt1, final int paramInt2, final int paramInt3, final String paramString3, final boolean paramBoolean)
  {
    GMTrace.i(12190459363328L, 90826);
    Object localObject = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(paramString2);
    if ((localObject == null) || (com.tencent.mm.sdk.platformtools.bg.nm(((WebViewJSSDKFileItem)localObject).hOo)) || (!com.tencent.mm.a.e.aZ(((WebViewJSSDKFileItem)localObject).hOo)))
    {
      a(parami, paramString3 + ":fail_file not exist", null);
      GMTrace.o(12190459363328L, 90826);
      return;
    }
    if (!com.tencent.mm.network.ab.bv(this.context))
    {
      localObject = com.tencent.mm.sdk.platformtools.bg.eL(com.tencent.mm.a.e.aY(((WebViewJSSDKFileItem)localObject).hOo));
      com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.eki, new Object[] { localObject }), this.context.getString(R.l.cUG), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19423050072064L, 144713);
          g.this.c(parami, paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramString3, paramBoolean);
          GMTrace.o(19423050072064L, 144713);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19454591238144L, 144948);
          g.this.a(parami, paramString3 + ":cancel", null);
          GMTrace.o(19454591238144L, 144948);
        }
      });
      GMTrace.o(12190459363328L, 90826);
      return;
    }
    c(parami, paramString1, paramString2, paramInt1, paramInt2, paramInt3, paramString3, paramBoolean);
    GMTrace.o(12190459363328L, 90826);
  }
  
  private boolean b(i parami, int paramInt)
  {
    GMTrace.i(12190056710144L, 90823);
    String str1 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("sourceType"));
    String str2 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("camera"));
    w.i("MicroMsg.MsgHandler", "doChooseVideo sourceType = %s, camera = %s, isVideoType:%d", new Object[] { str1, str2, Integer.valueOf(paramInt) });
    int k = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("maxDuration"), 60);
    if (str1.contains("album")) {}
    for (int j = 4096;; j = 0)
    {
      int i = j;
      if (str1.contains("camera"))
      {
        if (k <= 0)
        {
          a(parami, "chooseVideo:fail", null);
          GMTrace.o(12190056710144L, 90823);
          return true;
        }
        if (str2.equals("front")) {
          i = j | 0x10;
        }
      }
      else
      {
        if (i != 0) {
          break label674;
        }
        i = 4352;
      }
      label396:
      label648:
      label674:
      for (;;)
      {
        if ((i == 16) || (i == 256) || (i == 4352))
        {
          if (paramInt == 1)
          {
            bool = com.tencent.mm.pluginsdk.h.a.a((Activity)this.context, "android.permission.CAMERA", 117, "", "");
            w.d("MicroMsg.MsgHandler", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
            if (!bool)
            {
              GMTrace.o(12190056710144L, 90823);
              return true;
              i = j | 0x100;
              break;
            }
            bool = com.tencent.mm.pluginsdk.h.a.a((Activity)this.context, "android.permission.RECORD_AUDIO", 118, "", "");
            w.d("MicroMsg.MsgHandler", " checkPermission checkMicroPhone[%b]", new Object[] { Boolean.valueOf(bool) });
            if (bool) {
              break label396;
            }
            GMTrace.o(12190056710144L, 90823);
            return true;
          }
          boolean bool = com.tencent.mm.pluginsdk.h.a.a((Activity)this.context, "android.permission.CAMERA", 115, "", "");
          w.d("MicroMsg.MsgHandler", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
          if (!bool)
          {
            GMTrace.o(12190056710144L, 90823);
            return true;
          }
        }
        j = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("quality"), 1);
        if ((j != 0) && (j != 1)) {
          j = 1;
        }
        for (;;)
        {
          if (k > 60) {
            k = 60;
          }
          for (;;)
          {
            w.i("MicroMsg.MsgHandler", "doChooseVideo real scene = %d, select count = %d, video quality = %d, duration = %d", new Object[] { Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(j), Integer.valueOf(k) });
            parami = new Intent();
            parami.putExtra("key_pick_local_pic_capture", i);
            parami.putExtra("key_pick_local_pic_count", 1);
            parami.putExtra("key_pick_local_pic_query_source_type", 7);
            parami.putExtra("key_pick_local_media_quality", j);
            parami.putExtra("key_pick_local_media_duration", k);
            parami.putExtra("query_media_type", 2);
            parami.putExtra("key_pick_local_media_video_type", paramInt);
            w.i("MicroMsg.MsgHandler", "doChooseVideo: realScene: %d, count: %d, querySourceType: %d", new Object[] { Integer.valueOf(i), Integer.valueOf(1), Integer.valueOf(7) });
            if ((this.context instanceof MMActivity))
            {
              ((MMActivity)this.context).vKC = this;
              if (paramInt != 1) {
                break label648;
              }
              com.tencent.mm.bj.d.a(this.context, "webview", ".ui.tools.OpenFileChooserUI", parami, 45, false);
            }
            for (;;)
            {
              GMTrace.o(12190056710144L, 90823);
              return true;
              com.tencent.mm.bj.d.a(this.context, "webview", ".ui.tools.OpenFileChooserUI", parami, 32, false);
            }
          }
        }
      }
    }
  }
  
  private static byte[] bFB()
  {
    GMTrace.i(12186432831488L, 90796);
    try
    {
      Object localObject1 = new com.tencent.mm.sdk.platformtools.g("softtype");
      Object localObject2 = com.tencent.mm.sdk.platformtools.bg.aq((String)com.tencent.mm.compatible.d.m.sO().get("Processor"), "");
      w.d("MicroMsg.AndroidDevicesReport", "cpu %s", new Object[] { localObject2 });
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("cpu", (String)localObject2);
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("radio", com.tencent.mm.compatible.d.p.th());
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("osversion", Build.VERSION.RELEASE);
      localObject2 = com.tencent.mm.compatible.d.p.getDeviceID(com.tencent.mm.sdk.platformtools.ab.getContext());
      Object localObject3 = com.tencent.mm.compatible.d.p.tj();
      Object localObject4 = com.tencent.mm.compatible.d.p.tk();
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("deviceId", (String)localObject2);
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("imsi", (String)localObject3);
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("iccid", (String)localObject4);
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("androidid", com.tencent.mm.compatible.d.p.getAndroidId());
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("serial", com.tencent.mm.compatible.d.p.tl());
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("model", com.tencent.mm.compatible.d.p.te());
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("core_count", com.tencent.mm.compatible.d.m.sT());
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("cpuhardware", com.tencent.mm.sdk.platformtools.bg.aq((String)com.tencent.mm.compatible.d.m.sU().get("Hardware"), ""));
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("cpureversion", com.tencent.mm.sdk.platformtools.bg.aq((String)com.tencent.mm.compatible.d.m.sU().get("CPU revision"), ""));
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("cpuserial", com.tencent.mm.sdk.platformtools.bg.aq((String)com.tencent.mm.compatible.d.m.sU().get("Serial"), ""));
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("Features", com.tencent.mm.sdk.platformtools.bg.aq((String)com.tencent.mm.compatible.d.m.sU().get("Features"), ""));
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("wifi-mac", com.tencent.mm.sdk.platformtools.bg.aq(com.tencent.mm.compatible.d.p.tb(), ""));
      ((com.tencent.mm.sdk.platformtools.g)localObject1).br("bluetooth", com.tencent.mm.sdk.platformtools.bg.aq(com.tencent.mm.compatible.d.p.tc(), ""));
      if (!com.tencent.mm.sdk.platformtools.bg.nm(((com.tencent.mm.sdk.platformtools.g)localObject1).vhw))
      {
        ((com.tencent.mm.sdk.platformtools.g)localObject1).tp(((com.tencent.mm.sdk.platformtools.g)localObject1).vhw);
        ((com.tencent.mm.sdk.platformtools.g)localObject1).vhw = "";
      }
      localObject2 = ((com.tencent.mm.sdk.platformtools.g)localObject1).jae.toString();
      w.d("MicroMsg.AndroidDevicesReport", "xmlStr %s", new Object[] { localObject2 });
      w.i("MicroMsg.MsgHandler", "xml %s", new Object[] { localObject2 });
      localObject1 = new bka();
      ((bka)localObject1).uUS = com.tencent.mm.bm.b.aX(com.tencent.mm.compatible.d.p.ta().getBytes()).zL(16);
      w.i("MicroMsg.MsgHandler", com.tencent.mm.sdk.platformtools.bg.bs(((bka)localObject1).uUS.tJp));
      ((bka)localObject1).uUT = ((String)localObject2);
      localObject2 = com.tencent.mm.y.au.AX();
      localObject3 = com.tencent.mm.sdk.platformtools.bg.St(((SharedPreferences)localObject2).getString("_auth_key", ""));
      int i = ((SharedPreferences)localObject2).getInt("_auth_uin", 0);
      w.i("MicroMsg.MsgHandler", "cpan aak string:%s md5:%s uin:%d", new Object[] { com.tencent.mm.sdk.platformtools.bg.bs((byte[])localObject3), com.tencent.mm.a.g.n((byte[])localObject3), Integer.valueOf(i) });
      w.i("MicroMsg.MsgHandler", "aat len:%d", new Object[] { Integer.valueOf(localObject3.length) });
      ((bka)localObject1).uUU = com.tencent.mm.bm.b.aX((byte[])localObject3);
      ((bka)localObject1).uin = i;
      localObject3 = com.tencent.mm.protocal.ac.bOo();
      localObject2 = ((bka)localObject1).toByteArray();
      localObject4 = new PByteArray();
      localObject1 = localObject2;
      if (MMProtocalJni.rsaPublicEncrypt((byte[])localObject2, (PByteArray)localObject4, ((com.tencent.mm.protocal.ac)localObject3).tLb.getBytes(), ((com.tencent.mm.protocal.ac)localObject3).tLc.getBytes())) {
        localObject1 = ((PByteArray)localObject4).value;
      }
      w.d("MicroMsg.MsgHandler", "cpan buf string:%s ", new Object[] { com.tencent.mm.sdk.platformtools.bg.bs((byte[])localObject1) });
      localObject2 = new bkb();
      ((bkb)localObject2).uUW = ((com.tencent.mm.protocal.ac)localObject3).ver;
      ((bkb)localObject2).uUV = com.tencent.mm.protocal.d.tJC;
      ((bkb)localObject2).uUX = com.tencent.mm.protocal.d.DEVICE_TYPE;
      ((bkb)localObject2).uUY = com.tencent.mm.bm.b.aX((byte[])localObject1);
      w.i("MicroMsg.MsgHandler", "getdevice done");
      localObject1 = ((bkb)localObject2).toByteArray();
      GMTrace.o(12186432831488L, 90796);
      return (byte[])localObject1;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MsgHandler", "report error");
      w.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
      GMTrace.o(12186432831488L, 90796);
    }
    return null;
  }
  
  private String bFx()
  {
    GMTrace.i(12182808952832L, 90769);
    String str = bFw().getString("connector_local_send");
    bFw().remove("connector_local_send");
    bFw().putString("connector_local_report", str);
    GMTrace.o(12182808952832L, 90769);
    return str;
  }
  
  private boolean bq(i parami)
  {
    GMTrace.i(12192741064704L, 90843);
    WWMediaLink localWWMediaLink = new WWMediaLink();
    localWWMediaLink.thumbUrl = ((String)parami.nSp.get("img_url"));
    try
    {
      localWWMediaLink.webpageUrl = ak.zA(this.rEM.Zi());
      localWWMediaLink.title = ((String)parami.nSp.get("title"));
      localWWMediaLink.description = ((String)parami.nSp.get("desc"));
      WWAPIFactory.in(this.context).a(localWWMediaLink);
      a(parami, "shareWeWork:ok", null);
      GMTrace.o(12192741064704L, 90843);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
        localWWMediaLink.webpageUrl = ((String)parami.nSp.get("link"));
      }
    }
  }
  
  private int cG(i parami)
  {
    GMTrace.i(12200257257472L, 90899);
    int i = parami.hashCode();
    this.rTl.put(Integer.valueOf(i), new c(parami, this.rEM));
    this.kNw = false;
    try
    {
      this.rEM.bDj();
      GMTrace.o(12200257257472L, 90899);
      return i;
    }
    catch (RemoteException parami)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "blockMsg, dealNext ex = %s", new Object[] { parami.getMessage() });
      }
    }
  }
  
  private boolean dU(i parami)
  {
    int i = 1;
    GMTrace.i(15129693388800L, 112725);
    Object localObject3 = com.tencent.mm.at.b.JS();
    String str = (String)parami.nSp.get("appId");
    Object localObject2 = str;
    if (this.rSC != null)
    {
      localObject1 = str;
      if (TextUtils.isEmpty(str)) {
        localObject1 = this.rSC.getString("jsapi_args_appid");
      }
      localObject2 = localObject1;
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {}
    }
    for (Object localObject1 = this.rSL.Ms(Zi());; localObject1 = localObject2)
    {
      localObject2 = (String)parami.nSp.get("url");
      parami = null;
      if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2)) {
        parami = com.tencent.mm.plugin.webview.modelcache.p.Lv((String)localObject2);
      }
      if (localObject3 != null)
      {
        localObject2 = ((apv)localObject3).lQa;
        str = com.tencent.mm.plugin.webview.modelcache.p.Lv(((apv)localObject3).uFy);
        localObject3 = ((apv)localObject3).uFK;
        w.i("MicroMsg.MsgHandler", "app_id:%s, musicAppId:%s", new Object[] { localObject1, localObject2 });
        w.i("MicroMsg.MsgHandler", "domain: %s, songWebDomain: %s, jsWebDomain: %s， with no port", new Object[] { parami, str, localObject3 });
        if ((TextUtils.isEmpty((CharSequence)localObject1)) || (!((String)localObject1).equalsIgnoreCase((String)localObject2))) {
          break label332;
        }
      }
      label332:
      for (boolean bool2 = true;; bool2 = false)
      {
        boolean bool1 = bool2;
        if (!TextUtils.isEmpty(parami))
        {
          bool1 = bool2;
          if (parami.equalsIgnoreCase(str)) {
            bool1 = true;
          }
        }
        bool2 = bool1;
        if (!TextUtils.isEmpty(parami))
        {
          bool2 = bool1;
          if (parami.equalsIgnoreCase((String)localObject3)) {
            bool2 = true;
          }
        }
        if (bool2) {}
        for (;;)
        {
          w.i("MicroMsg.MsgHandler", "getMusicPermission hasPermmision:%d", new Object[] { Integer.valueOf(i) });
          GMTrace.o(15129693388800L, 112725);
          return bool2;
          w.e("MicroMsg.MsgHandler", "currentWrapper is null");
          bool2 = false;
          break;
          i = 0;
        }
      }
    }
  }
  
  private Bundle e(String paramString, int paramInt, Bundle paramBundle)
  {
    GMTrace.i(12193680588800L, 90850);
    try
    {
      paramBundle = this.rEM.d(paramInt, paramBundle);
      GMTrace.o(12193680588800L, 90850);
      return paramBundle;
    }
    catch (RemoteException paramBundle)
    {
      w.w("MicroMsg.MsgHandler", "[NFC] " + paramString + " callback RemoteException!" + paramBundle.toString());
      GMTrace.o(12193680588800L, 90850);
    }
    return null;
  }
  
  private boolean f(String paramString, int paramInt, Bundle paramBundle)
  {
    int i = -1;
    GMTrace.i(12193814806528L, 90851);
    paramBundle = e(paramString, paramInt, paramBundle);
    if (paramBundle != null)
    {
      paramInt = paramBundle.getInt("status", -1);
      w.i("MicroMsg.MsgHandler", "[NFC] " + paramString + " result status : " + paramInt);
      switch (paramInt)
      {
      default: 
        a(this.rSz, paramString + ":fail", null);
      }
    }
    for (;;)
    {
      GMTrace.o(12193814806528L, 90851);
      return false;
      w.w("MicroMsg.MsgHandler", "[NFC] " + paramString + " callback fail!");
      paramInt = i;
      break;
      a(this.rSz, paramString + ":nfc_not_support", null);
      continue;
      a(this.rSz, paramString + ":nfc_off", null);
      continue;
      a(this.rSz, paramString + ":disconnect", null);
      GMTrace.o(12193814806528L, 90851);
      return true;
      a(this.rSz, paramString + ":card_not_support", null);
    }
  }
  
  private static WXMediaMessage h(i parami)
  {
    GMTrace.i(12183077388288L, 90771);
    Object localObject2 = (String)parami.nSp.get("link");
    if ((localObject2 == null) || (((String)localObject2).length() == 0))
    {
      w.e("MicroMsg.MsgHandler", "convert fail, link is null");
      GMTrace.o(12183077388288L, 90771);
      return null;
    }
    Object localObject1 = ak.zA((String)localObject2);
    w.i("MicroMsg.MsgHandler", "rawurl:[%s], shareurl:[%s]", new Object[] { localObject2, localObject1 });
    localObject2 = new WXWebpageObject();
    ((WXWebpageObject)localObject2).webpageUrl = ((String)localObject1);
    ((WXWebpageObject)localObject2).extInfo = ((String)parami.nSp.get("review_data"));
    localObject1 = new WXMediaMessage();
    ((WXMediaMessage)localObject1).mediaObject = ((WXMediaMessage.IMediaObject)localObject2);
    ((WXMediaMessage)localObject1).title = ((String)parami.nSp.get("title"));
    ((WXMediaMessage)localObject1).description = ((String)parami.nSp.get("desc"));
    GMTrace.o(12183077388288L, 90771);
    return (WXMediaMessage)localObject1;
  }
  
  private boolean jF(boolean paramBoolean)
  {
    GMTrace.i(12197170249728L, 90876);
    w.e("MicroMsg.MsgHandler", "hideMenuEntry:" + paramBoolean);
    try
    {
      this.rEM.jv(paramBoolean);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      w.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
      w.e("MicroMsg.MsgHandler", "hideMenuEntry error");
      return false;
    }
    finally
    {
      w.e("MicroMsg.MsgHandler", "hideMenuEntry succ");
      GMTrace.o(12197170249728L, 90876);
    }
    return true;
  }
  
  private static void r(String paramString1, int paramInt, String paramString2)
  {
    GMTrace.i(12185895960576L, 90792);
    gq localgq = new gq();
    localgq.eJK.appId = paramString1;
    localgq.eJK.opType = 2;
    localgq.eJK.eJL = paramInt;
    localgq.eJK.eDk = paramString2;
    com.tencent.mm.sdk.b.a.vgX.m(localgq);
    GMTrace.o(12185895960576L, 90792);
  }
  
  private static String sy(String paramString)
  {
    GMTrace.i(12182272081920L, 90765);
    StringBuffer localStringBuffer = new StringBuffer();
    int m = paramString.length();
    int i = 0;
    while (i < m)
    {
      int j = 0;
      while (j < iGu.length)
      {
        String str = iGv[j];
        int k = 0;
        while ((k < str.length()) && (i + k < m) && (str.charAt(k) == paramString.charAt(i + k))) {
          k += 1;
        }
        if (k == str.length()) {
          break;
        }
        j += 1;
      }
      if (j != iGu.length)
      {
        localStringBuffer.append(iGu[j]);
        i = iGv[j].length() + i;
      }
      else
      {
        localStringBuffer.append(paramString.charAt(i));
        i += 1;
      }
    }
    paramString = localStringBuffer.toString();
    GMTrace.o(12182272081920L, 90765);
    return paramString;
  }
  
  private static String truncate(String paramString)
  {
    GMTrace.i(12184016912384L, 90778);
    if (paramString.startsWith("http://"))
    {
      paramString = paramString.substring(7);
      GMTrace.o(12184016912384L, 90778);
      return paramString;
    }
    if (paramString.startsWith("https://"))
    {
      paramString = paramString.substring(8);
      GMTrace.o(12184016912384L, 90778);
      return paramString;
    }
    GMTrace.o(12184016912384L, 90778);
    return paramString;
  }
  
  public final boolean A(i parami)
  {
    GMTrace.i(12184285347840L, 90780);
    try
    {
      Bundle localBundle = i.ac(parami.nSp);
      this.rEM.bDi();
      this.rEM.Q(localBundle);
      com.tencent.mm.sdk.b.a.vgX.m(new tk());
      a(parami, "close_window:ok", null);
      GMTrace.o(12184285347840L, 90780);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "doCloseWindow, ex = " + localException.getMessage());
      }
    }
  }
  
  public final boolean B(i parami)
  {
    GMTrace.i(16067070001152L, 119709);
    w.i("MicroMsg.MsgHandler", "hy: start soter auth");
    ((MMActivity)this.context).vKC = this;
    Object localObject = i.ac(parami.nSp);
    Intent localIntent = new Intent();
    localIntent.putExtras((Bundle)localObject);
    localIntent.putExtra("key_soter_fp_mp_scene", 0);
    String str = pi(Zi());
    localObject = str;
    if (str == null) {
      localObject = (String)parami.nSp.get("appId");
    }
    localIntent.putExtra("key_app_id", (String)localObject);
    com.tencent.mm.bj.d.b(this.context, "soter_mp", ".ui.SoterAuthenticationUI", localIntent, 38);
    GMTrace.o(16067070001152L, 119709);
    return true;
  }
  
  public final boolean C(i parami)
  {
    GMTrace.i(16067204218880L, 119710);
    w.i("MicroMsg.MsgHandler", "hy: do get soter support");
    hi localhi = new hi();
    com.tencent.mm.sdk.b.a.vgX.m(localhi);
    HashMap localHashMap = new HashMap();
    localHashMap.put("support_mode", Integer.valueOf(localhi.eKF.eKG));
    a(parami, "getSupportSoter", localHashMap);
    if (localhi.eKF.eKG == 1) {}
    for (int i = 1;; i = 0)
    {
      a(parami, 0, i);
      GMTrace.o(16067204218880L, 119710);
      return true;
    }
  }
  
  public final boolean D(i parami)
  {
    GMTrace.i(16067338436608L, 119711);
    w.i("MicroMsg.MsgHandler", "hy: start do check is support face detect");
    Object localObject = new hh();
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    boolean bool = ((hh)localObject).eKA.eKB;
    int i = ((hh)localObject).eKA.eKC;
    String str = ((hh)localObject).eKA.eKD;
    int j = ((hh)localObject).eKA.eKE;
    w.i("MicroMsg.MsgHandler", "hy: is support: %b, errCode: %d, errMsg: %s, ilbVersion: %d", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i), str, Integer.valueOf(j) });
    localObject = new HashMap();
    ((HashMap)localObject).put("err_code", String.valueOf(i));
    ((HashMap)localObject).put("err_msg", str);
    ((HashMap)localObject).put("lib_version_code", String.valueOf(j));
    a(parami, "doCheckIsSupportFaceDetect: ok", (Map)localObject);
    GMTrace.o(16067338436608L, 119711);
    return true;
  }
  
  public final boolean E(i parami)
  {
    GMTrace.i(16067472654336L, 119712);
    ((MMActivity)this.context).vKC = this;
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("k_need_signature", true);
    localBundle.putInt("k_server_scene", 3);
    localBundle.putBoolean("key_is_need_video", false);
    localBundle.putBoolean("is_check_dyncfg", false);
    localBundle.putString("k_ticket", (String)parami.nSp.get("request_ticket"));
    ng localng = new ng();
    localng.eSr.context = this.context;
    localng.eSr.eSt = 50;
    localng.eSr.extras = localBundle;
    com.tencent.mm.sdk.b.a.vgX.m(localng);
    w.i("MicroMsg.MsgHandler", "hy: start face register rsa event result: %b", new Object[] { Boolean.valueOf(localng.eSs.eSu) });
    if (!localng.eSs.eSu)
    {
      ((MMActivity)this.context).vKC = null;
      a(parami, "requestWxFaceRegisterInternal:fail", i.ac(localng.eSs.extras));
    }
    GMTrace.o(16067472654336L, 119712);
    return true;
  }
  
  public final boolean F(i parami)
  {
    GMTrace.i(20447265554432L, 152344);
    this.kNw = false;
    int i = com.tencent.mm.sdk.platformtools.bg.Sy(parami.nSp.get("voteResultIndex").toString());
    try
    {
      parami = new Bundle();
      parami.putInt("sns_landing_pages_ad_vote_index", i);
      this.rEM.m(150, parami);
      GMTrace.o(20447265554432L, 152344);
      return false;
    }
    catch (Exception parami)
    {
      for (;;) {}
    }
  }
  
  public final boolean G(i parami)
  {
    GMTrace.i(16067606872064L, 119713);
    ((MMActivity)this.context).vKC = this;
    Bundle localBundle = new Bundle();
    localBundle.putBoolean("k_need_signature", true);
    localBundle.putString("k_user_name", as.gnb.B("login_user_name", ""));
    localBundle.putInt("k_server_scene", 4);
    localBundle.putBoolean("key_is_need_video", false);
    localBundle.putBoolean("is_check_dyncfg", false);
    localBundle.putString("k_ticket", (String)parami.nSp.get("request_ticket"));
    ng localng = new ng();
    localng.eSr.context = this.context;
    localng.eSr.eSt = 51;
    localng.eSr.extras = localBundle;
    com.tencent.mm.sdk.b.a.vgX.m(localng);
    w.i("MicroMsg.MsgHandler", "hy: start face verify rsa event result: %b", new Object[] { Boolean.valueOf(localng.eSs.eSu) });
    if (!localng.eSs.eSu)
    {
      ((MMActivity)this.context).vKC = null;
      a(parami, "requestWxFaceVerifyInternal:fail", i.ac(localng.eSs.extras));
    }
    GMTrace.o(16067606872064L, 119713);
    return true;
  }
  
  public final boolean H(i parami)
  {
    GMTrace.i(12184553783296L, 90782);
    localObject2 = (String)parami.nSp.get("packageName");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2))
    {
      w.i("MicroMsg.MsgHandler", "packageName is null or nil");
      a(parami, "get_install_state:no", null);
      GMTrace.o(12184553783296L, 90782);
      return true;
    }
    k.a(parami.rUT, false, (String)localObject2, null);
    for (;;)
    {
      try
      {
        JSONArray localJSONArray = new JSONArray((String)localObject2);
        if (localJSONArray.length() <= 0) {
          continue;
        }
        localObject3 = new JSONObject();
        localJSONObject = new JSONObject();
        i = 0;
        j = 0;
        if (i >= localJSONArray.length()) {
          continue;
        }
        str2 = localJSONArray.getString(i);
        localPackageInfo = com.tencent.mm.pluginsdk.model.app.p.getPackageInfo(this.context, str2);
        if (localPackageInfo != null) {
          continue;
        }
        m = 0;
      }
      catch (Exception localException)
      {
        JSONObject localJSONObject;
        int j;
        String str2;
        PackageInfo localPackageInfo;
        int m;
        Object localObject1;
        int k;
        w.i("MicroMsg.MsgHandler", "it is not batch get install state");
        Object localObject3 = com.tencent.mm.pluginsdk.model.app.p.getPackageInfo(this.context, (String)localObject2);
        if (localObject3 != null) {
          continue;
        }
        int i = 0;
        if (localObject3 != null) {
          continue;
        }
        String str1 = "null";
        w.i("MicroMsg.MsgHandler", "doGetInstallState, packageName = " + (String)localObject2 + ", packageInfo = " + localObject3 + ", version = " + i + ", versionName = " + str1);
        if (localObject3 != null) {
          continue;
        }
        a(parami, "get_install_state:no", null);
        GMTrace.o(12184553783296L, 90782);
        return true;
        i = ((PackageInfo)localObject3).versionCode;
        continue;
        str1 = ((PackageInfo)localObject3).versionName;
        continue;
        localObject2 = new HashMap();
        ((Map)localObject2).put("versionName", str1);
        a(parami, "get_install_state:yes_" + i, (Map)localObject2);
        continue;
        if (localPackageInfo != null) {
          continue;
        }
        str1 = "null";
        continue;
      }
      w.i("MicroMsg.MsgHandler", "doGetInstallState, packageName = " + str2 + ", packageInfo = " + localPackageInfo + ", version = " + m + ", versionName = " + (String)localObject1);
      k = j;
      if (j == 0)
      {
        k = j;
        if (m > 0) {
          k = 1;
        }
      }
      ((JSONObject)localObject3).put(str2, m);
      localJSONObject.put(str2, localObject1);
      i += 1;
      j = k;
      continue;
      m = localPackageInfo.versionCode;
      continue;
      localObject1 = localPackageInfo.versionName;
    }
    localObject1 = new HashMap();
    ((HashMap)localObject1).put("result", localObject3);
    ((HashMap)localObject1).put("versionName", localJSONObject);
    if (j != 0) {
      a(parami, "get_install_state:yes", (Map)localObject1);
    }
    for (;;)
    {
      GMTrace.o(12184553783296L, 90782);
      return true;
      a(parami, "get_install_state:no", null);
    }
  }
  
  public final void I(Intent paramIntent)
  {
    GMTrace.i(12189922492416L, 90822);
    w.i("MicroMsg.MsgHandler", "chooseMediaFromAlbum");
    paramIntent.putExtra("key_pick_local_pic_capture", 4096);
    ((MMActivity)this.context).vKC = this;
    com.tencent.mm.bj.d.a(this.context, "webview", ".ui.tools.OpenFileChooserUI", paramIntent, 47, false);
    GMTrace.o(12189922492416L, 90822);
  }
  
  public final boolean I(final i parami)
  {
    GMTrace.i(16067875307520L, 119715);
    final String str = (String)parami.nSp.get("cardType");
    if ((com.tencent.mm.sdk.platformtools.bg.nm(str)) || (this.context == null))
    {
      a(parami, "scanLicence:fail", null);
      GMTrace.o(16067875307520L, 119715);
      return true;
    }
    Object localObject = new com.tencent.mm.plugin.webview.modeltools.d.a()
    {
      public final void Ij(String paramAnonymousString)
      {
        GMTrace.i(19443182731264L, 144863);
        if (!com.tencent.mm.sdk.platformtools.bg.nl(paramAnonymousString).equals(str))
        {
          GMTrace.o(19443182731264L, 144863);
          return;
        }
        HashMap localHashMap = new HashMap(1);
        localHashMap.put("cardType", paramAnonymousString);
        g.this.a(parami, "scanLicence:fail", localHashMap);
        GMTrace.o(19443182731264L, 144863);
      }
      
      public final void LC(String paramAnonymousString)
      {
        GMTrace.i(19443048513536L, 144862);
        if (!com.tencent.mm.sdk.platformtools.bg.nl(paramAnonymousString).equals(str))
        {
          GMTrace.o(19443048513536L, 144862);
          return;
        }
        HashMap localHashMap = new HashMap(1);
        localHashMap.put("cardType", paramAnonymousString);
        g.this.a(parami, "scanLicence:cancel", localHashMap);
        GMTrace.o(19443048513536L, 144862);
      }
      
      public final void a(String paramAnonymousString, JSONObject paramAnonymousJSONObject, Bitmap paramAnonymousBitmap)
      {
        GMTrace.i(19442914295808L, 144861);
        if (!com.tencent.mm.sdk.platformtools.bg.nl(paramAnonymousString).equalsIgnoreCase(str))
        {
          w.i("MicroMsg.MsgHandler", "msg.params.cardType = %s, callback type = %s, mismatch!!!", new Object[] { str, paramAnonymousString });
          GMTrace.o(19442914295808L, 144861);
          return;
        }
        if (paramAnonymousJSONObject == null)
        {
          w.e("MicroMsg.MsgHandler", "doScanLicence, type = %s, callback onSuccess but result is null", new Object[] { paramAnonymousString });
          Ij(paramAnonymousString);
          GMTrace.o(19442914295808L, 144861);
          return;
        }
        paramAnonymousBitmap = new HashMap(2);
        paramAnonymousBitmap.put("cardType", paramAnonymousString);
        paramAnonymousBitmap.put("cardInfo", paramAnonymousJSONObject);
        g.this.a(parami, "scanLicence:ok", paramAnonymousBitmap);
        GMTrace.o(19442914295808L, 144861);
      }
    };
    if (this.rSO.a(str, this.context, (com.tencent.mm.plugin.webview.modeltools.d.a)localObject))
    {
      GMTrace.o(16067875307520L, 119715);
      return true;
    }
    localObject = new HashMap(1);
    ((Map)localObject).put("cardType", str);
    a(parami, "scanLicence:type not supported", (Map)localObject);
    GMTrace.o(16067875307520L, 119715);
    return true;
  }
  
  /* Error */
  public final boolean J(i parami)
  {
    // Byte code:
    //   0: ldc2_w 2115
    //   3: ldc_w 2117
    //   6: invokestatic 401	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   13: ldc_w 1049
    //   16: invokeinterface 860 2 0
    //   21: checkcast 413	java/lang/String
    //   24: astore 9
    //   26: aload_1
    //   27: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   30: ldc_w 2119
    //   33: invokeinterface 860 2 0
    //   38: checkcast 413	java/lang/String
    //   41: iconst_1
    //   42: invokestatic 587	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   45: istore 7
    //   47: aload_1
    //   48: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   51: ldc_w 2121
    //   54: invokeinterface 860 2 0
    //   59: checkcast 413	java/lang/String
    //   62: astore 10
    //   64: ldc_w 614
    //   67: ldc_w 2123
    //   70: iconst_3
    //   71: anewarray 4	java/lang/Object
    //   74: dup
    //   75: iconst_0
    //   76: aload 9
    //   78: aastore
    //   79: dup
    //   80: iconst_1
    //   81: iload 7
    //   83: invokestatic 838	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   86: aastore
    //   87: dup
    //   88: iconst_2
    //   89: aload 10
    //   91: aastore
    //   92: invokestatic 735	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   95: aload 10
    //   97: invokestatic 869	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   100: ifeq +374 -> 474
    //   103: iconst_1
    //   104: istore_3
    //   105: iconst_1
    //   106: istore_2
    //   107: aload 10
    //   109: ifnull +356 -> 465
    //   112: new 1129	org/json/JSONArray
    //   115: dup
    //   116: aload 10
    //   118: invokespecial 1130	org/json/JSONArray:<init>	(Ljava/lang/String;)V
    //   121: astore 9
    //   123: iconst_0
    //   124: istore 6
    //   126: iload_3
    //   127: istore 4
    //   129: iload_2
    //   130: istore 5
    //   132: iload 6
    //   134: aload 9
    //   136: invokevirtual 1133	org/json/JSONArray:length	()I
    //   139: if_icmpge +76 -> 215
    //   142: aload 9
    //   144: iload 6
    //   146: invokevirtual 2126	org/json/JSONArray:get	(I)Ljava/lang/Object;
    //   149: checkcast 413	java/lang/String
    //   152: astore 10
    //   154: aload 10
    //   156: ldc_w 2128
    //   159: invokevirtual 1726	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   162: ifeq +10 -> 172
    //   165: iload_3
    //   166: istore_2
    //   167: iconst_1
    //   168: istore_3
    //   169: goto +312 -> 481
    //   172: aload 10
    //   174: ldc_w 2130
    //   177: invokevirtual 1726	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   180: istore 8
    //   182: iload 8
    //   184: ifeq +270 -> 454
    //   187: iconst_1
    //   188: istore 4
    //   190: iload_2
    //   191: istore_3
    //   192: iload 4
    //   194: istore_2
    //   195: goto +286 -> 481
    //   198: astore 9
    //   200: ldc_w 614
    //   203: ldc_w 2132
    //   206: invokestatic 1196	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   209: iload_2
    //   210: istore 5
    //   212: iload_3
    //   213: istore 4
    //   215: iload 5
    //   217: ifeq +100 -> 317
    //   220: iload 4
    //   222: ifne +95 -> 317
    //   225: bipush 8
    //   227: istore_2
    //   228: iload 7
    //   230: ifne +102 -> 332
    //   233: ldc_w 614
    //   236: ldc_w 2134
    //   239: invokestatic 2136	com/tencent/mm/sdk/platformtools/w:d	(Ljava/lang/String;Ljava/lang/String;)V
    //   242: new 1067	android/content/Intent
    //   245: dup
    //   246: invokespecial 1325	android/content/Intent:<init>	()V
    //   249: astore 9
    //   251: aload 9
    //   253: ldc_w 2138
    //   256: iload_2
    //   257: invokevirtual 1071	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   260: pop
    //   261: aload_0
    //   262: getfield 753	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   265: invokestatic 2143	com/tencent/mm/p/a:aQ	(Landroid/content/Context;)Z
    //   268: ifne +29 -> 297
    //   271: aload_0
    //   272: getfield 753	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   275: invokestatic 2145	com/tencent/mm/p/a:aP	(Landroid/content/Context;)Z
    //   278: ifne +19 -> 297
    //   281: aload_0
    //   282: getfield 753	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   285: ldc_w 1112
    //   288: ldc_w 2147
    //   291: aload 9
    //   293: iconst_0
    //   294: invokestatic 2150	com/tencent/mm/bj/d:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;Z)V
    //   297: aload_0
    //   298: aload_1
    //   299: ldc_w 2152
    //   302: aconst_null
    //   303: invokevirtual 686	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   306: ldc2_w 2115
    //   309: ldc_w 2117
    //   312: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   315: iconst_1
    //   316: ireturn
    //   317: iload 5
    //   319: ifne +130 -> 449
    //   322: iload 4
    //   324: ifeq +125 -> 449
    //   327: iconst_4
    //   328: istore_2
    //   329: goto -101 -> 228
    //   332: iload 7
    //   334: iconst_1
    //   335: if_icmpne +88 -> 423
    //   338: new 1067	android/content/Intent
    //   341: dup
    //   342: invokespecial 1325	android/content/Intent:<init>	()V
    //   345: astore_1
    //   346: aload_1
    //   347: ldc_w 2138
    //   350: iload_2
    //   351: invokevirtual 1071	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   354: pop
    //   355: aload_1
    //   356: ldc_w 2154
    //   359: iconst_1
    //   360: invokevirtual 2157	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   363: pop
    //   364: aload_1
    //   365: ldc_w 2159
    //   368: iconst_1
    //   369: invokevirtual 2157	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   372: pop
    //   373: aload_1
    //   374: ldc_w 2161
    //   377: iconst_3
    //   378: invokevirtual 1071	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   381: pop
    //   382: aload_0
    //   383: getfield 753	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   386: invokestatic 2143	com/tencent/mm/p/a:aQ	(Landroid/content/Context;)Z
    //   389: ifne -83 -> 306
    //   392: aload_0
    //   393: getfield 753	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   396: invokestatic 2145	com/tencent/mm/p/a:aP	(Landroid/content/Context;)Z
    //   399: ifne -93 -> 306
    //   402: aload_0
    //   403: getfield 753	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   406: ldc_w 1112
    //   409: ldc_w 2147
    //   412: aload_1
    //   413: aload_0
    //   414: getfield 553	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:eQd	I
    //   417: invokestatic 2165	com/tencent/mm/plugin/webview/stub/WebViewStubTempUI:a	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;I)V
    //   420: goto -114 -> 306
    //   423: ldc_w 614
    //   426: ldc_w 2167
    //   429: invokestatic 1196	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   432: aload_0
    //   433: aload_1
    //   434: ldc_w 2169
    //   437: aconst_null
    //   438: invokevirtual 686	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   441: goto -135 -> 306
    //   444: astore 9
    //   446: goto -246 -> 200
    //   449: iconst_1
    //   450: istore_2
    //   451: goto -223 -> 228
    //   454: iload_2
    //   455: istore 4
    //   457: iload_3
    //   458: istore_2
    //   459: iload 4
    //   461: istore_3
    //   462: goto +19 -> 481
    //   465: iload_3
    //   466: istore 4
    //   468: iload_2
    //   469: istore 5
    //   471: goto -256 -> 215
    //   474: iconst_0
    //   475: istore_3
    //   476: iconst_0
    //   477: istore_2
    //   478: goto -371 -> 107
    //   481: iload 6
    //   483: iconst_1
    //   484: iadd
    //   485: istore 6
    //   487: iload_3
    //   488: istore 4
    //   490: iload_2
    //   491: istore_3
    //   492: iload 4
    //   494: istore_2
    //   495: goto -369 -> 126
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	498	0	this	g
    //   0	498	1	parami	i
    //   106	389	2	i	int
    //   104	388	3	j	int
    //   127	366	4	k	int
    //   130	340	5	m	int
    //   124	362	6	n	int
    //   45	291	7	i1	int
    //   180	3	8	bool	boolean
    //   24	119	9	localObject	Object
    //   198	1	9	localException1	Exception
    //   249	43	9	localIntent	Intent
    //   444	1	9	localException2	Exception
    //   62	111	10	str	String
    // Exception table:
    //   from	to	target	type
    //   112	123	198	java/lang/Exception
    //   132	165	444	java/lang/Exception
    //   172	182	444	java/lang/Exception
  }
  
  public final boolean K(i parami)
  {
    GMTrace.i(12184822218752L, 90784);
    parami = (String)parami.nSp.get("fontSize");
    if ((parami == null) || (parami.length() == 0))
    {
      w.e("MicroMsg.MsgHandler", "doSetFontSizeCb, fontSize is null");
      this.kNw = false;
      GMTrace.o(12184822218752L, 90784);
      return false;
    }
    w.i("MicroMsg.MsgHandler", "doSetFontSizeCb, fontSize = " + parami);
    try
    {
      this.rEM.LF(parami);
      this.kNw = false;
      GMTrace.o(12184822218752L, 90784);
      return false;
    }
    catch (Exception parami)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "setFontSizeCb, ex = " + parami.getMessage());
      }
    }
  }
  
  public final boolean L(i parami)
  {
    GMTrace.i(16068009525248L, 119716);
    w.i("MicroMsg.MsgHandler", "doJumpToInstallUrl");
    parami = (String)parami.nSp.get("url");
    if (com.tencent.mm.sdk.platformtools.bg.nm(parami))
    {
      w.e("MicroMsg.MsgHandler", "jumpurl is null or nil");
      this.kNw = false;
      GMTrace.o(16068009525248L, 119716);
      return false;
    }
    parami = new Intent("android.intent.action.VIEW", Uri.parse(parami));
    parami.addFlags(268435456);
    if (com.tencent.mm.sdk.platformtools.bg.j(this.context, parami)) {
      this.context.startActivity(parami);
    }
    this.kNw = false;
    GMTrace.o(16068009525248L, 119716);
    return false;
  }
  
  public final boolean M(i parami)
  {
    GMTrace.i(16068143742976L, 119717);
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    w.i("MicroMsg.MsgHandler", "doPay");
    if ((this.context instanceof MMActivity))
    {
      com.tencent.mm.pluginsdk.wallet.f localf = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
      localf.tIM = 1;
      w.i("MicroMsg.MsgHandler", "doPay, pay channel: %s, scene: %s", new Object[] { Integer.valueOf(localf.ePN), Integer.valueOf(localf.ePL) });
      com.tencent.mm.pluginsdk.wallet.g.a((MMActivity)this.context, localf, 4, this);
      long l = com.tencent.mm.sdk.platformtools.bg.getLong((String)parami.nSp.get("message_id"), 0L);
      int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("message_index"), 0);
      com.tencent.mm.plugin.report.service.g.ork.i(10593, new Object[] { localf.ePK, localf.appId, Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(localf.ePL), localf.url });
      this.rSR = cG(parami);
    }
    GMTrace.o(16068143742976L, 119717);
    return true;
  }
  
  public final boolean MA(String paramString)
  {
    GMTrace.i(12181600993280L, 90760);
    boolean bool = this.lGH.remove(paramString);
    w.i("MicroMsg.MsgHandler", "removeInvokedJsApiFromMenu, functionName = %s, succ = %s.", new Object[] { paramString, Boolean.valueOf(bool) });
    GMTrace.o(12181600993280L, 90760);
    return bool;
  }
  
  public final boolean MB(final String paramString)
  {
    GMTrace.i(12183211606016L, 90772);
    if ((paramString == null) || (paramString.length() == 0))
    {
      w.e("MicroMsg.MsgHandler", "doProfile fail, username is null");
      this.kNw = false;
      GMTrace.o(12183211606016L, 90772);
      return false;
    }
    if (com.tencent.mm.sdk.platformtools.bg.nm(paramString))
    {
      Toast.makeText(com.tencent.mm.sdk.platformtools.ab.getContext(), this.context.getString(R.l.dxf, new Object[] { Integer.valueOf(3), Integer.valueOf(-1) }), 0).show();
      this.kNw = false;
      GMTrace.o(12183211606016L, 90772);
      return false;
    }
    if (this.rSz != null) {
      k.a(this.rSz.rUT, Mz("profile"), paramString, null);
    }
    if (!com.tencent.mm.y.at.AT())
    {
      w.e("MicroMsg.MsgHandler", "doProfile, MMCore.hasCfgDefaultUin() is false");
      this.kNw = false;
      GMTrace.o(12183211606016L, 90772);
      return false;
    }
    com.tencent.mm.y.at.AR();
    Object localObject = com.tencent.mm.y.c.yK().TE(paramString);
    if ((localObject == null) || ((int)((com.tencent.mm.l.a)localObject).fTq <= 0))
    {
      com.tencent.mm.y.at.AR();
      localObject = com.tencent.mm.y.c.yK().TB(paramString);
    }
    for (;;)
    {
      final Intent localIntent = new Intent();
      String str2 = "";
      String str1 = str2;
      if (this.rSz != null)
      {
        str1 = str2;
        if (this.rSz.nSp != null)
        {
          str1 = str2;
          if (this.rSz.nSp.get("profileReportInfo") != null) {
            str1 = (String)this.rSz.nSp.get("profileReportInfo");
          }
        }
      }
      if (!com.tencent.mm.sdk.platformtools.bg.nm(str1)) {
        localIntent.putExtra("key_add_contact_report_info", str1);
      }
      if ((this.rSC != null) && (this.rSC.getBoolean("KFromBizSearch"))) {
        localIntent.putExtra("Contact_Ext_Args", this.rSC.getBundle("KBizSearchExtArgs"));
      }
      if ((localObject != null) && ((int)((com.tencent.mm.l.a)localObject).fTq > 0))
      {
        localIntent.addFlags(268435456);
        localIntent.putExtra("Contact_User", ((com.tencent.mm.g.b.af)localObject).field_username);
        if (((com.tencent.mm.storage.x)localObject).bSA()) {
          if (this.rSC != null) {
            break label514;
          }
        }
        label514:
        for (int i = 42;; i = this.rSC.getInt("Contact_Scene", 42))
        {
          com.tencent.mm.plugin.report.service.g.ork.A(10298, ((com.tencent.mm.g.b.af)localObject).field_username + "," + i);
          localIntent.putExtra("Contact_Scene", i);
          if (com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject).field_type))
          {
            paramString = new oq();
            paramString.eTD.intent = localIntent;
            paramString.eTD.username = ((com.tencent.mm.g.b.af)localObject).field_username;
            com.tencent.mm.sdk.b.a.vgX.m(paramString);
          }
          ab(localIntent);
          a(this.rSz, "profile:ok", null);
          GMTrace.o(12183211606016L, 90772);
          return false;
        }
      }
      ak.a.gmX.a(paramString, "", new ak.b.a()
      {
        public final void r(String paramAnonymousString, boolean paramAnonymousBoolean)
        {
          GMTrace.i(19433116401664L, 144788);
          if (g.this.context == null)
          {
            w.w("MicroMsg.MsgHandler", "getNow callback, msghandler has already been detached!");
            g.this.a(g.this.rSz, "profile:fail", null);
            GMTrace.o(19433116401664L, 144788);
            return;
          }
          if (g.this.htG != null) {
            g.this.htG.dismiss();
          }
          com.tencent.mm.y.at.AR();
          com.tencent.mm.storage.x localx2 = com.tencent.mm.y.c.yK().TE(paramAnonymousString);
          com.tencent.mm.storage.x localx1;
          if (localx2 != null)
          {
            localx1 = localx2;
            if ((int)localx2.fTq > 0) {}
          }
          else
          {
            com.tencent.mm.y.at.AR();
            localx1 = com.tencent.mm.y.c.yK().TB(paramAnonymousString);
          }
          if ((localx1 == null) || ((int)localx1.fTq <= 0)) {
            paramAnonymousBoolean = false;
          }
          while (!paramAnonymousBoolean)
          {
            Toast.makeText(com.tencent.mm.sdk.platformtools.ab.getContext(), g.this.context.getString(R.l.dxf, new Object[] { Integer.valueOf(3), Integer.valueOf(-1) }), 0).show();
            g.this.a(g.this.rSz, "profile:fail", null);
            GMTrace.o(19433116401664L, 144788);
            return;
            paramAnonymousString = localx1.field_username;
          }
          com.tencent.mm.ac.b.y(paramAnonymousString, 3);
          com.tencent.mm.ac.n.Dv().hS(paramAnonymousString);
          localIntent.addFlags(268435456);
          localIntent.putExtra("Contact_User", paramAnonymousString);
          if (localx1.bSA()) {
            if (g.this.rSC != null) {
              break label354;
            }
          }
          label354:
          for (int i = 42;; i = g.this.rSC.getInt("Contact_Scene", 42))
          {
            com.tencent.mm.plugin.report.service.g.ork.A(10298, localx1.field_username + "," + i);
            localIntent.putExtra("Contact_Scene", i);
            g.this.ab(localIntent);
            g.this.a(g.this.rSz, "profile:ok", null);
            GMTrace.o(19433116401664L, 144788);
            return;
          }
        }
      });
      localObject = this.context;
      this.context.getString(R.l.cUG);
      this.htG = com.tencent.mm.ui.base.h.a((Context)localObject, this.context.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(19424123813888L, 144721);
          ak.a.gmX.gJ(paramString);
          g.this.a(g.this.rSz, "profile:cancel", null);
          GMTrace.o(19424123813888L, 144721);
        }
      });
      GMTrace.o(12183211606016L, 90772);
      return true;
    }
  }
  
  public final void Mu(String paramString)
  {
    GMTrace.i(12201330999296L, 90907);
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_json_data", paramString);
    try
    {
      if (this.rEM != null) {
        this.rEM.m(124, localBundle);
      }
      GMTrace.o(12201330999296L, 90907);
      return;
    }
    catch (RemoteException paramString)
    {
      w.w("MicroMsg.MsgHandler", "onSearchSuggestionDataReady exception" + paramString.getMessage());
      GMTrace.o(12201330999296L, 90907);
    }
  }
  
  public final boolean N(i parami)
  {
    GMTrace.i(16068277960704L, 119718);
    w.i("MicroMsg.MsgHandler", "doJumpToMall");
    String str1 = (String)parami.nSp.get("appId");
    String str2 = (String)parami.nSp.get("funcId");
    String str3 = (String)parami.nSp.get("url");
    k.a(parami.rUT, false, null, str1);
    parami = new Intent();
    parami.putExtra("key_app_id", str1);
    parami.putExtra("key_func_id", str2);
    parami.putExtra("key_url", str3);
    if ((this.context instanceof MMActivity))
    {
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.a(this.context, "mall", ".ui.MallIndexUI", parami, 5, false);
    }
    GMTrace.o(16068277960704L, 119718);
    return true;
  }
  
  public final boolean O(i parami)
  {
    GMTrace.i(12184956436480L, 90785);
    w.d("MicroMsg.MsgHandler", "hy: doGetPayResultReq");
    if ((this.context instanceof MMActivity))
    {
      com.tencent.mm.pluginsdk.wallet.f localf = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
      lk locallk = new lk();
      locallk.ePI.appId = localf.appId;
      locallk.ePI.partnerId = localf.partnerId;
      locallk.ePI.signType = localf.signType;
      locallk.ePI.nonceStr = localf.nonceStr;
      locallk.ePI.timeStamp = localf.timeStamp;
      locallk.ePI.packageExt = localf.packageExt;
      locallk.ePI.ePJ = localf.ePJ;
      locallk.ePI.url = localf.url;
      locallk.ePI.ePK = localf.ePK;
      locallk.ePI.ePL = localf.ePL;
      locallk.ePI.ePN = localf.ePN;
      locallk.ePI.ePM = localf.ePM;
      com.tencent.mm.sdk.b.a.vgX.m(locallk);
      a(21, -1, null);
    }
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    GMTrace.o(12184956436480L, 90785);
    return true;
  }
  
  public final boolean P(i parami)
  {
    GMTrace.i(12185090654208L, 90786);
    w.i("MicroMsg.MsgHandler", "doOpenProductView");
    String str1 = (String)parami.nSp.get("productInfo");
    String str2 = (String)parami.nSp.get("url");
    parami = Integer.valueOf(0);
    try
    {
      int i = new JSONObject(str1).getInt("product_type");
      parami = Integer.valueOf(i);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Intent localIntent;
        boolean bool;
        w.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
      }
    }
    localIntent = new Intent();
    localIntent.putExtra("key_product_info", str1);
    localIntent.putExtra("key_source_url", str2);
    bool = a(parami, 3, 0, null, localIntent);
    GMTrace.o(12185090654208L, 90786);
    return bool;
  }
  
  public final void Q(String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(19441572118528L, 144851);
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_json_data", paramString);
    localBundle.putInt("fts_key_is_cache_data", paramInt1);
    localBundle.putInt("fts_key_is_expired", paramInt2);
    try
    {
      if (this.rEM != null) {
        this.rEM.m(142, localBundle);
      }
      GMTrace.o(19441572118528L, 144851);
      return;
    }
    catch (Exception paramString)
    {
      GMTrace.o(19441572118528L, 144851);
    }
  }
  
  public final boolean Q(i parami)
  {
    GMTrace.i(16068412178432L, 119719);
    w.i("MicroMsg.MsgHandler", "doOpenProductViewWithPid");
    String str1 = (String)parami.nSp.get("pid");
    String str2 = (String)parami.nSp.get("url");
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("type"), 0);
    int j = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("view_type"), 0);
    parami = (String)parami.nSp.get("ext_info");
    Intent localIntent = new Intent();
    localIntent.putExtra("key_product_id", str1);
    localIntent.putExtra("key_source_url", str2);
    boolean bool = a(Integer.valueOf(i), 8, j, parami, localIntent);
    GMTrace.o(16068412178432L, 119719);
    return bool;
  }
  
  public final boolean R(i parami)
  {
    GMTrace.i(16068546396160L, 119720);
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    w.i("MicroMsg.MsgHandler", "doEditAddress");
    Intent localIntent = new Intent();
    localIntent.putExtra("req_url", (String)parami.nSp.get("url"));
    localIntent.putExtra("req_app_id", (String)parami.nSp.get("appId"));
    localIntent.putExtra("launch_from_webview", true);
    if ((this.context instanceof MMActivity))
    {
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.a(this.context, "address", ".ui.WalletSelectAddrUI", localIntent, 3, false);
    }
    GMTrace.o(16068546396160L, 119720);
    return true;
  }
  
  public final boolean S(i parami)
  {
    GMTrace.i(18148921180160L, 135220);
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    w.i("MicroMsg.MsgHandler", "doChooseInvoiceTitle");
    parami = new Intent();
    parami.putExtra("req_scene", 0);
    parami.putExtra("launch_from_webview", true);
    if ((this.context instanceof MMActivity))
    {
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.a(this.context, "address", ".ui.InvoiceListUI", parami, 56, false);
    }
    GMTrace.o(18148921180160L, 135220);
    return true;
  }
  
  public final boolean T(i parami)
  {
    GMTrace.i(16068680613888L, 119721);
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    w.i("MicroMsg.MsgHandler", "dogetBrandWCPayBindCardRequest JSOAUTH");
    if ((this.context instanceof MMActivity))
    {
      parami = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
      parami.ePM = 4;
      com.tencent.mm.pluginsdk.wallet.g.b((MMActivity)this.context, parami, 7, this);
    }
    GMTrace.o(16068680613888L, 119721);
    return true;
  }
  
  public final boolean U(i parami)
  {
    GMTrace.i(16068814831616L, 119722);
    w.i("MicroMsg.MsgHandler", "doGetTransferMoneyRequest JSOAUTH");
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    if ((this.context instanceof MMActivity))
    {
      parami = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
      Intent localIntent = new Intent();
      localIntent.putExtra("scene", 3);
      localIntent.putExtra("appId", parami.appId);
      localIntent.putExtra("timeStamp", parami.timeStamp);
      localIntent.putExtra("nonceStr", parami.nonceStr);
      localIntent.putExtra("packageExt", parami.packageExt);
      localIntent.putExtra("signtype", parami.signType);
      localIntent.putExtra("paySignature", parami.ePJ);
      localIntent.putExtra("url", parami.url);
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.b(this.context, "remittance", ".ui.RemittanceAdapterUI", localIntent, 11);
    }
    GMTrace.o(16068814831616L, 119722);
    return true;
  }
  
  public final boolean V(final i parami)
  {
    GMTrace.i(19440364158976L, 144842);
    w.i("MicroMsg.MsgHandler", "do handle wcpay buffer");
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    com.tencent.mm.pluginsdk.wallet.f localf = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
    final sj localsj = new sj();
    localsj.eXj.action = ((String)parami.nSp.get("action"));
    localsj.eXj.buffer = ((String)parami.nSp.get("buffer"));
    localsj.eXj.eXn = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("walletRegion"), 0);
    localsj.eXj.appId = localf.appId;
    localsj.eXj.eDJ = localf.timeStamp;
    localsj.eXj.nonceStr = localf.nonceStr;
    localsj.eXj.eXm = localf.ePJ;
    localsj.eXj.signType = localf.signType;
    localsj.eXj.eXl = localf.packageExt;
    localsj.eXj.url = localf.url;
    localsj.eXk.eXo = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19444256473088L, 144871);
        if (localsj.eXk.retCode == 0)
        {
          HashMap localHashMap = new HashMap();
          localHashMap.put("buffer", localsj.eXk.buffer);
          g.this.a(parami, "handleWCPayWalletBuffer:ok", localHashMap);
          GMTrace.o(19444256473088L, 144871);
          return;
        }
        if (localsj.eXk.retCode == -2)
        {
          g.this.a(parami, "handleWCPayWalletBuffer:null", null);
          GMTrace.o(19444256473088L, 144871);
          return;
        }
        g.this.a(parami, "handleWCPayWalletBuffer:fail", null);
        GMTrace.o(19444256473088L, 144871);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.m(localsj);
    GMTrace.o(19440364158976L, 144842);
    return true;
  }
  
  public final boolean W(i parami)
  {
    GMTrace.i(16068949049344L, 119723);
    w.i("MicroMsg.MsgHandler", "doOpenWCPaySpecificView");
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    if ((this.context instanceof MMActivity))
    {
      parami = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
      Intent localIntent = new Intent();
      localIntent.putExtra("appId", parami.appId);
      localIntent.putExtra("timeStamp", parami.timeStamp);
      localIntent.putExtra("nonceStr", parami.nonceStr);
      localIntent.putExtra("packageExt", parami.packageExt);
      localIntent.putExtra("signtype", parami.signType);
      localIntent.putExtra("paySignature", parami.ePJ);
      localIntent.putExtra("url", parami.url);
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.a(this.context, "wallet_index", ".ui.WalletOpenViewProxyUI", localIntent, 17, false);
    }
    GMTrace.o(16068949049344L, 119723);
    return true;
  }
  
  public final boolean X(final i parami)
  {
    GMTrace.i(19440498376704L, 144843);
    w.i("MicroMsg.MsgHandler", "do ecard jsapi check");
    final cl localcl = new cl();
    com.tencent.mm.pluginsdk.wallet.f localf = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
    localcl.eDH.appId = localf.appId;
    localcl.eDH.eDJ = localf.timeStamp;
    localcl.eDH.nonceStr = localf.nonceStr;
    localcl.eDH.packageExt = localf.packageExt;
    localcl.eDH.signature = localf.ePJ;
    localcl.eDH.signType = localf.signType;
    localcl.eDH.eDK = localf.url;
    localcl.eDH.eDL = ((String)parami.nSp.get("ecardType"));
    localcl.eDH.eDM = ((String)parami.nSp.get("openScene"));
    localcl.eDH.eDN = new WeakReference(this.context);
    localcl.eDH.eDO = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19449893617664L, 144913);
        w.i("MicroMsg.MsgHandler", "run ecard jsapi check callback");
        if (localcl.eDI.retCode == 0)
        {
          g.this.a(parami, "openECard:ok", null);
          GMTrace.o(19449893617664L, 144913);
          return;
        }
        g.this.a(parami, "openECard:fail", null);
        GMTrace.o(19449893617664L, 144913);
      }
    };
    com.tencent.mm.sdk.b.a.vgX.m(localcl);
    GMTrace.o(19440498376704L, 144843);
    return true;
  }
  
  public final boolean Y(i parami)
  {
    GMTrace.i(16069083267072L, 119724);
    w.i("MicroMsg.MsgHandler", "doJumpToWXWallet");
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    if ((this.context instanceof MMActivity))
    {
      Intent localIntent = new Intent();
      localIntent.putExtra("key_wallet_region", 1);
      com.tencent.mm.bj.d.a(this.context, "mall", ".ui.MallIndexUI", localIntent, false);
      a(parami, "jump_to_wx_wallet:ok", null);
    }
    GMTrace.o(16069083267072L, 119724);
    return true;
  }
  
  public final boolean Z(i parami)
  {
    GMTrace.i(16069217484800L, 119725);
    w.i("MicroMsg.MsgHandler", "doOpenWCPaySpecificView JSOAUTH");
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    if ((this.context instanceof MMActivity))
    {
      parami = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
      Intent localIntent = new Intent();
      localIntent.putExtra("appId", parami.appId);
      localIntent.putExtra("timeStamp", parami.timeStamp);
      localIntent.putExtra("nonceStr", parami.nonceStr);
      localIntent.putExtra("packageExt", parami.packageExt);
      localIntent.putExtra("signtype", parami.signType);
      localIntent.putExtra("paySignature", parami.ePJ);
      localIntent.putExtra("url", parami.url);
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.a(this.context, "wallet_index", ".ui.WalletSendC2CMsgUI", localIntent, 18, false);
    }
    GMTrace.o(16069217484800L, 119725);
    return true;
  }
  
  public final String Zi()
  {
    GMTrace.i(12202002087936L, 90912);
    if (this.rEM == null)
    {
      w.i("MicroMsg.MsgHandler", "getCurrentUrl, callbacker is null");
      GMTrace.o(12202002087936L, 90912);
      return null;
    }
    try
    {
      String str = this.rEM.Zi();
      GMTrace.o(12202002087936L, 90912);
      return str;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MsgHandler", "getCurrentUrl, exception = %s", new Object[] { localException });
      GMTrace.o(12202002087936L, 90912);
    }
    return null;
  }
  
  public final void a(int paramInt1, int paramInt2, final Intent paramIntent)
  {
    GMTrace.i(12199183515648L, 90891);
    w.i("MicroMsg.MsgHandler", "mmOnActivityResult, requestCode = " + paramInt1 + ", resultCode = " + paramInt2);
    final Object localObject3;
    final Object localObject2;
    if (paramInt1 == 1)
    {
      if (this.eLU == null)
      {
        w.e("MicroMsg.MsgHandler", "mmOnActivityResult fail, appmsg is null");
        a(this.rSz, "send_app_msg:fail", null);
        GMTrace.o(12199183515648L, 90891);
        return;
      }
      localObject3 = (String)this.rSz.nSp.get("appid");
      localObject1 = null;
      if (this.rSC == null) {
        break label10897;
      }
      localObject2 = (SnsAdClick)this.rSC.getParcelable("KSnsAdTag");
      localObject1 = localObject2;
      if (!TextUtils.isEmpty((CharSequence)localObject3)) {
        break label10897;
      }
    }
    for (final Object localObject1 = this.rSC.getString("jsapi_args_appid");; localObject1 = localObject3)
    {
      ??? = this.rSz.bFO().get("Internal@AsyncReport");
      this.rSz.nSp.get("link");
      switch (paramInt2)
      {
      }
      final Object localObject7;
      final Object localObject4;
      final Object localObject5;
      final Object localObject6;
      for (;;)
      {
        GMTrace.o(12199183515648L, 90891);
        return;
        if (localObject2 != null) {
          ((SnsAdClick)localObject2).gZ(8);
        }
        k.a(this.rSz.bFO(), Mz("sendAppMessage"), null, (String)localObject1);
        if ((??? != null) && ((??? instanceof Boolean)) && (((Boolean)???).booleanValue())) {
          e(this.rSz, true);
        }
        dI(1, 3);
        a(this.rSz, "send_app_msg:cancel", null);
        GMTrace.o(12199183515648L, 90891);
        return;
        if (localObject2 != null) {
          ((SnsAdClick)localObject2).gZ(7);
        }
        localObject7 = com.tencent.mm.pluginsdk.model.app.g.Et((String)localObject1);
        if (paramIntent == null) {}
        for (localObject2 = null; (localObject2 == null) || (((String)localObject2).length() == 0); localObject2 = paramIntent.getStringExtra("Select_Conv_User"))
        {
          w.e("MicroMsg.MsgHandler", "mmOnActivityResult fail, toUser is null");
          a(this.rSz, "send_app_msg:fail", null);
          GMTrace.o(12199183515648L, 90891);
          return;
        }
        localObject3 = (String)this.rSz.nSp.get("img_url");
        this.rSz.nSp.get("desc");
        localObject4 = (String)this.rSz.nSp.get("src_username");
        localObject5 = (String)this.rSz.nSp.get("src_displayname");
        localObject6 = bFy();
        k.a(this.rSz.bFO(), Mz("sendAppMessage"), (String)localObject2, (String)localObject1);
        if ((??? != null) && ((??? instanceof Boolean)) && (((Boolean)???).booleanValue())) {
          e(this.rSz, true);
        }
        ??? = ((String)localObject2).split(",");
        paramInt1 = 0;
        paramInt2 = 0;
        int j = ???.length;
        int i = 0;
        if (i < j)
        {
          if (???[i].endsWith("@chatroom")) {
            paramInt1 += 1;
          }
          for (;;)
          {
            i += 1;
            break;
            paramInt2 += 1;
          }
        }
        ??? = new HashMap();
        if ((this.rSz.nSp.get("share_callback_with_scene") != null) && (((Boolean)this.rSz.nSp.get("share_callback_with_scene")).booleanValue()))
        {
          ((Map)???).put("groupCount", Integer.valueOf(paramInt1));
          ((Map)???).put("singleCount", Integer.valueOf(paramInt2));
        }
        if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject6))
        {
          if (paramIntent == null) {}
          for (paramIntent = null;; paramIntent = paramIntent.getStringExtra("custom_send_text"))
          {
            a(null, "", (String)localObject2, (String)localObject3, (String)localObject4, (String)localObject5, paramIntent, (String)localObject6);
            if (this.context != null) {
              com.tencent.mm.ui.base.h.bj(this.context, this.context.getResources().getString(R.l.cUy));
            }
            dI(1, 1);
            a(this.rSz, "send_app_msg:ok", (Map)???);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
        }
        if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject3))
        {
          a(null, "", (String)localObject2, (String)localObject3, (String)localObject4, (String)localObject5, null, (String)localObject6);
          com.tencent.mm.ui.base.h.bj(this.context, this.context.getString(R.l.cUq));
          a(this.rSz, "send_app_msg:ok", (Map)???);
          GMTrace.o(12199183515648L, 90891);
          return;
        }
        paramIntent = com.tencent.mm.ui.base.h.a(this.context, this.context.getResources().getString(R.l.cUt), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(18143284035584L, 135178);
            com.tencent.mm.ao.n.IY().jX(localObject3);
            g.this.a(g.this.rSz, "send_app_msg:cancel", null);
            GMTrace.o(18143284035584L, 135178);
          }
        });
        com.tencent.mm.ao.n.IY().a((String)localObject3, new com.tencent.mm.ao.b.c()
        {
          public final void n(Bitmap paramAnonymousBitmap)
          {
            GMTrace.i(19427479257088L, 144746);
            if (paramIntent != null) {
              paramIntent.dismiss();
            }
            g.this.a(localObject7, localObject1, localObject2, localObject3, localObject4, localObject5, null, localObject6);
            if (g.this.context != null) {
              com.tencent.mm.ui.base.h.bm(g.this.context, g.this.context.getString(R.l.cUq));
            }
            g.this.a(g.this.rSz, "send_app_msg:ok", localObject8);
            GMTrace.o(19427479257088L, 144746);
          }
        });
      }
      if (paramInt1 == 2)
      {
        switch (paramInt2)
        {
        default: 
          a(this.rSz, "share_weibo:fail_" + paramIntent.getIntExtra("err_code", 0), null);
          w.e("MicroMsg.MsgHandler", "unknown resultCode");
          GMTrace.o(12199183515648L, 90891);
          return;
        case -1: 
          com.tencent.mm.ui.base.h.bj(this.context, this.context.getResources().getString(R.l.cUy));
          a(this.rSz, "share_weibo:ok", null);
          GMTrace.o(12199183515648L, 90891);
          return;
        case 0: 
          a(this.rSz, "share_weibo:cancel", null);
          GMTrace.o(12199183515648L, 90891);
          return;
        }
        a(this.rSz, "share_weibo:fail_" + paramIntent.getIntExtra("err_code", 0), null);
        GMTrace.o(12199183515648L, 90891);
        return;
      }
      if (paramInt1 == 3)
      {
        w.i("MicroMsg.MsgHandler", "get callback address, result code = %d", new Object[] { Integer.valueOf(paramInt2) });
        if ((paramInt2 == -1) && (paramIntent != null))
        {
          localObject1 = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("nationalCode"), "");
          localObject2 = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("userName"), "");
          localObject3 = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("telNumber"), "");
          localObject4 = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("addressPostalCode"), "");
          localObject5 = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("proviceFirstStageName"), "");
          localObject6 = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("addressCitySecondStageName"), "");
          localObject7 = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("addressCountiesThirdStageName"), "");
          paramIntent = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("addressDetailInfo"), "");
          w.i("MicroMsg.MsgHandler", "first =  " + (String)localObject5 + " ; detail =" + paramIntent + "; second = " + (String)localObject6 + " ; tel = " + (String)localObject3 + "; third = " + (String)localObject7);
          if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2))
          {
            ??? = new HashMap();
            ((Map)???).put("nationalCode", localObject1);
            ((Map)???).put("userName", localObject2);
            ((Map)???).put("telNumber", localObject3);
            ((Map)???).put("addressPostalCode", localObject4);
            ((Map)???).put("proviceFirstStageName", localObject5);
            ((Map)???).put("addressCitySecondStageName", localObject6);
            ((Map)???).put("addressCountiesThirdStageName", localObject7);
            ((Map)???).put("addressDetailInfo", paramIntent);
            a(this.rSz, "edit_address:ok", (Map)???);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
        }
        if (paramInt2 == 0)
        {
          a(this.rSz, "edit_address:cancel", null);
          GMTrace.o(12199183515648L, 90891);
          return;
        }
        a(this.rSz, "edit_address:fail", null);
        GMTrace.o(12199183515648L, 90891);
        return;
      }
      if (paramInt1 == 4)
      {
        w.i("MicroMsg.MsgHandler", "request pay, resultCode = " + paramInt2);
        if (this.rSR != -1)
        {
          w.d("MicroMsg.MsgHandler", "hy: has blocked ");
          this.rSz = yl(this.rSR).rSz;
          this.rEM = yl(this.rSR).rEM;
          this.rSR = -1;
        }
        if (paramInt2 == -1)
        {
          a(this.rSz, "get_brand_wcpay_request:ok", null);
          GMTrace.o(12199183515648L, 90891);
          return;
        }
        if (paramInt2 == 5)
        {
          localObject1 = new HashMap();
          paramInt1 = paramIntent.getIntExtra("key_jsapi_pay_err_code", 0);
          paramIntent = com.tencent.mm.sdk.platformtools.bg.nl(paramIntent.getStringExtra("key_jsapi_pay_err_msg"));
          ((Map)localObject1).put("err_code", Integer.valueOf(paramInt1));
          ((Map)localObject1).put("err_desc", paramIntent);
          w.e("MicroMsg.MsgHandler", "hy: pay jsapi failed. errCode: %d, errMsg: %s", new Object[] { Integer.valueOf(paramInt1), paramIntent });
          a(this.rSz, "get_brand_wcpay_request:fail", (Map)localObject1);
          GMTrace.o(12199183515648L, 90891);
          return;
        }
        a(this.rSz, "get_brand_wcpay_request:cancel", null);
        GMTrace.o(12199183515648L, 90891);
        return;
      }
      if (paramInt1 == 27)
      {
        w.i("MicroMsg.MsgHandler", "request ibg prepay request, resultCode = " + paramInt2);
        if (this.rSR != -1)
        {
          w.d("MicroMsg.MsgHandler", "hy: has blocked ");
          this.rSz = yl(this.rSR).rSz;
          this.rEM = yl(this.rSR).rEM;
          this.rSR = -1;
        }
        if (paramInt2 == -1) {
          if ((paramIntent != null) && (paramIntent.hasExtra("url")))
          {
            localObject1 = null;
            if (paramIntent.hasExtra("view_port_code")) {
              localObject1 = paramIntent.getStringExtra("view_port_code");
            }
          }
        }
      }
      try
      {
        this.rEM.ej(paramIntent.getStringExtra("url"), (String)localObject1);
        a(this.rSz, "get_h5_prepay_request:ok", null);
        GMTrace.o(12199183515648L, 90891);
        return;
        a(this.rSz, "get_h5_prepay_request:cancel", null);
        GMTrace.o(12199183515648L, 90891);
        return;
        if (paramInt1 == 5)
        {
          w.i("MicroMsg.MsgHandler", "request jump to mall, resultCode = " + paramInt2);
          if (paramInt2 == -1)
          {
            a(this.rSz, "jump_wcmall:ok", null);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
          a(this.rSz, "jump_wcmall:fail", null);
          GMTrace.o(12199183515648L, 90891);
          return;
        }
        if (paramInt1 == 6)
        {
          w.i("MicroMsg.MsgHandler", "request jump to product view, resultCode = " + paramInt2);
          if (paramInt2 == -1)
          {
            a(this.rSz, "open_product_view:ok", null);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
          a(this.rSz, "open_product_view:fail", null);
          GMTrace.o(12199183515648L, 90891);
          return;
        }
        if (paramInt1 == 7)
        {
          w.i("MicroMsg.MsgHandler", "request bind card, resultCode = " + paramInt2);
          if (paramInt2 == -1)
          {
            a(this.rSz, "get_brand_wcpay_bind_card_request:ok", null);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
          a(this.rSz, "get_brand_wcpay_bind_card_request:fail", null);
          GMTrace.o(12199183515648L, 90891);
          return;
        }
        if (paramInt1 == 9)
        {
          w.i("MicroMsg.MsgHandler", "request open wxcredit, resultCode = " + paramInt2);
          if (paramInt2 == -1)
          {
            a(this.rSz, "get_wcpay_create_credit_card_request:ok", null);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
          a(this.rSz, "get_wcpay_create_credit_card_request:fail", null);
          GMTrace.o(12199183515648L, 90891);
          return;
        }
        if (paramInt1 == 8)
        {
          w.i("MicroMsg.MsgHandler", "request jumpToBizProfile, resultCode = " + paramInt2);
          switch (paramInt2)
          {
          case 1: 
          default: 
            a(this.rSz, "jump_to_biz_profile:fail", null);
            w.e("MicroMsg.MsgHandler", "unknown resultCode");
            GMTrace.o(12199183515648L, 90891);
            return;
          case -1: 
            a(this.rSz, "jump_to_biz_profile:ok", null);
            GMTrace.o(12199183515648L, 90891);
            return;
          case 0: 
            a(this.rSz, "jump_to_biz_profile:cancel", null);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
          a(this.rSz, "jump_to_biz_profile:check_fail", null);
          GMTrace.o(12199183515648L, 90891);
          return;
        }
        if (paramInt1 == 10)
        {
          if (paramInt2 == 0)
          {
            w.i("MicroMsg.MsgHandler", "open scan product ui back");
            a(this.rSz, "open_scan_product_view:ok", null);
            GMTrace.o(12199183515648L, 90891);
          }
        }
        else
        {
          if (paramInt1 == 11)
          {
            w.i("MicroMsg.MsgHandler", "request transfer_money, resultCode = " + paramInt2);
            if (paramInt2 == -1)
            {
              a(this.rSz, "get_transfer_money_request:ok", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            a(this.rSz, "get_transfer_money_request:fail", null);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
          if (paramInt1 == 17)
          {
            w.i("MicroMsg.MsgHandler", "request open_wcpay_specific_view, resultCode = " + paramInt2);
            if (paramInt2 == -1)
            {
              a(this.rSz, "open_wcpay_specific_view:ok", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            a(this.rSz, "open_wcpay_specific_view:fail", null);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
          if (paramInt1 == 18)
          {
            w.i("MicroMsg.MsgHandler", "request request_wcpay_send_c2c_msg, resultCode = " + paramInt2);
            if (paramInt2 == -1)
            {
              a(this.rSz, "get_send_c2c_message_request:ok", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt2 == 0)
            {
              a(this.rSz, "get_send_c2c_message_request:cancel", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            a(this.rSz, "get_send_c2c_message_request:fail", null);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
          if (paramInt1 == 13)
          {
            w.d("MicroMsg.MsgHandler", "request choose card, resultCode = " + paramInt2);
            localObject1 = new HashMap();
            if (paramInt2 == -1)
            {
              if (paramIntent != null) {
                ((Map)localObject1).put("choose_card_info", com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("choose_card_info"), ""));
              }
              a(this.rSz, "choose_card:ok", (Map)localObject1);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt2 == 0)
            {
              a(this.rSz, "choose_card:cancel", (Map)localObject1);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            a(this.rSz, "choose_card:fail", (Map)localObject1);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
          if (paramInt1 == 36)
          {
            w.d("MicroMsg.MsgHandler", "request choose invoice, resultCode = " + paramInt2);
            localObject1 = new HashMap();
            if (paramInt2 == -1)
            {
              if (paramIntent != null) {
                ((Map)localObject1).put("choose_invoice_info", com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("choose_invoice_info"), ""));
              }
              a(this.rSz, "choose_invoice:ok", (Map)localObject1);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt2 == 0)
            {
              a(this.rSz, "choose_invoice:cancel", (Map)localObject1);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            a(this.rSz, "choose_invoice:fail", (Map)localObject1);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
          if (paramInt1 == 16)
          {
            w.d("MicroMsg.MsgHandler", "request batch add card, resultCode = " + paramInt2);
            localObject1 = new HashMap();
            if (paramIntent != null) {
              ((Map)localObject1).put("card_list", com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("card_list"), ""));
            }
            if (paramInt2 == -1)
            {
              a(this.rSz, "batch_add_card:ok", (Map)localObject1);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            paramInt1 = 2;
            if (paramIntent != null) {
              paramInt1 = paramIntent.getIntExtra("result_code", 2);
            }
            if (paramInt1 == 2)
            {
              a(this.rSz, "batch_add_card:fail", (Map)localObject1);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            a(this.rSz, "batch_add_card:cancel", (Map)localObject1);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
          if (paramInt1 == 23)
          {
            if (paramInt2 == -1)
            {
              a(this.rSz, "batch_view_card:ok", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            a(this.rSz, "batch_view_card:fail", null);
            GMTrace.o(12199183515648L, 90891);
            return;
          }
          if (paramInt1 == 15)
          {
            if ((this.rSz == null) || (com.tencent.mm.sdk.platformtools.bg.nm(this.rSz.rUU)))
            {
              w.e("MicroMsg.MsgHandler", "msg is null");
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            w.i("MicroMsg.MsgHandler", "request to scan qr code, result code = %d, function is %s", new Object[] { Integer.valueOf(paramInt2), this.rSz.rUU });
            if (this.rSz.rUU.equals("scanQRCode"))
            {
              switch (paramInt2)
              {
              default: 
                a(this.rSz, "scanQRCode:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              case -1: 
                localObject1 = new HashMap();
                if (paramIntent != null) {
                  ((HashMap)localObject1).put("resultStr", paramIntent.getStringExtra("key_scan_result"));
                }
                a(this.rSz, "scanQRCode:ok", (Map)localObject1);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "scanQRCode:cancel", null);
              GMTrace.o(12199183515648L, 90891);
            }
          }
          else
          {
            boolean bool;
            if (paramInt1 == 14)
            {
              if (paramIntent == null)
              {
                bool = false;
                w.i("MicroMsg.MsgHandler", "request to open file chooser, result code = %d, hasShowMemoryWarning = %b", new Object[] { Integer.valueOf(paramInt2), Boolean.valueOf(bool) });
                localObject1 = new HashMap();
                if (bool) {
                  ((HashMap)localObject1).put("memoryWarning", Boolean.valueOf(true));
                }
              }
              switch (paramInt2)
              {
              default: 
              case -1: 
                do
                {
                  a(this.rSz, "chooseImage:fail", (Map)localObject1);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                  bool = paramIntent.getBooleanExtra("key_pick_local_media_show_memory_warning", false);
                  break;
                  localObject2 = paramIntent.getStringExtra("key_pick_local_pic_callback_local_ids");
                  w.i("MicroMsg.MsgHandler", "localIds = %s", new Object[] { localObject2 });
                } while (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2));
                ((HashMap)localObject1).put("localIds", localObject2);
                paramIntent = paramIntent.getStringExtra("key_pick_local_pic_source_type");
                if (paramIntent != null) {
                  ((HashMap)localObject1).put("sourceType", paramIntent);
                }
                a(this.rSz, "chooseImage:ok", (Map)localObject1);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "chooseImage:cancel", (Map)localObject1);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 32)
            {
              switch (paramInt2)
              {
              default: 
                a(this.rSz, "chooseVideo:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              case 0: 
                a(this.rSz, "chooseVideo:cancel", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              paramIntent = paramIntent.getStringExtra("key_pick_local_media_local_id");
              if (!com.tencent.mm.sdk.platformtools.bg.nm(paramIntent))
              {
                localObject1 = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(paramIntent);
                if ((localObject1 != null) && ((localObject1 instanceof WebViewJSSDKVideoItem)))
                {
                  localObject1 = (WebViewJSSDKVideoItem)localObject1;
                  localObject2 = new HashMap();
                  ((HashMap)localObject2).put("localId", paramIntent);
                  ((HashMap)localObject2).put("duration", Integer.valueOf(((WebViewJSSDKVideoItem)localObject1).duration));
                  ((HashMap)localObject2).put("height", Integer.valueOf(((WebViewJSSDKVideoItem)localObject1).height));
                  ((HashMap)localObject2).put("size", Integer.valueOf(((WebViewJSSDKVideoItem)localObject1).size));
                  ((HashMap)localObject2).put("width", Integer.valueOf(((WebViewJSSDKVideoItem)localObject1).width));
                  a(this.rSz, "chooseVideo:ok", (Map)localObject2);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
              }
              a(this.rSz, "chooseVideo:fail", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 45)
            {
              switch (paramInt2)
              {
              default: 
                a(this.rSz, "recordVideo:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              case 0: 
                a(this.rSz, "recordVideo:cancel", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              localObject1 = paramIntent.getStringExtra("key_pick_local_media_local_id");
              paramIntent = paramIntent.getStringExtra("key_pick_local_media_thumb_local_id");
              w.i("MicroMsg.MsgHandler", "localId:%s", new Object[] { localObject1 });
              w.i("MicroMsg.MsgHandler", "thumbLocalId:%s", new Object[] { paramIntent });
              if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
              {
                localObject2 = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk((String)localObject1);
                if ((localObject2 != null) && ((localObject2 instanceof WebViewJSSDKVideoItem)))
                {
                  localObject2 = (WebViewJSSDKVideoItem)localObject2;
                  localObject3 = new HashMap();
                  ((HashMap)localObject3).put("localId", localObject1);
                  ((HashMap)localObject3).put("duration", Integer.valueOf(((WebViewJSSDKVideoItem)localObject2).duration));
                  ((HashMap)localObject3).put("height", Integer.valueOf(((WebViewJSSDKVideoItem)localObject2).height));
                  ((HashMap)localObject3).put("size", Integer.valueOf(((WebViewJSSDKVideoItem)localObject2).size));
                  ((HashMap)localObject3).put("width", Integer.valueOf(((WebViewJSSDKVideoItem)localObject2).width));
                  ((HashMap)localObject3).put("thumbLocalId", paramIntent);
                  a(this.rSz, "recordVideo:ok", (Map)localObject3);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
              }
              a(this.rSz, "recordVideo:fail", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 47)
            {
              switch (paramInt2)
              {
              default: 
                a(this.rSz, "chooseMedia:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              case 0: 
                a(this.rSz, "chooseMedia:cancel", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              if (paramIntent == null)
              {
                w.e("MicroMsg.MsgHandler", "mmOnActivityResult REQUEST_CHOOSE_MEDIA data is null,");
                a(this.rSz, "chooseMedia:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              paramInt1 = paramIntent.getIntExtra("key_pick_local_media_callback_type", 0);
              if (paramInt1 == 1)
              {
                localObject1 = paramIntent.getStringExtra("key_pick_local_media_local_id");
                paramIntent = paramIntent.getStringExtra("key_pick_local_media_thumb_local_id");
                w.i("MicroMsg.MsgHandler", "video localId:%s", new Object[] { localObject1 });
                w.i("MicroMsg.MsgHandler", "video thumbLocalId:%s", new Object[] { paramIntent });
                if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
                {
                  w.e("MicroMsg.MsgHandler", "mmOnActivityResult REQUEST_CHOOSE_MEDIA video localId is null");
                  a(this.rSz, "chooseMedia:fail", null);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                localObject2 = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk((String)localObject1);
                if ((localObject2 != null) && ((localObject2 instanceof WebViewJSSDKVideoItem)))
                {
                  localObject2 = (WebViewJSSDKVideoItem)localObject2;
                  paramIntent = ai.b((String)localObject1, paramIntent, ((WebViewJSSDKVideoItem)localObject2).duration, ((WebViewJSSDKVideoItem)localObject2).height, ((WebViewJSSDKVideoItem)localObject2).width, ((WebViewJSSDKVideoItem)localObject2).size);
                  w.i("MicroMsg.MsgHandler", "after parse to json data : %s", new Object[] { paramIntent });
                  localObject1 = new HashMap();
                  ((HashMap)localObject1).put("type", Integer.valueOf(1));
                  ((HashMap)localObject1).put("localIds", paramIntent);
                  a(this.rSz, "chooseMedia:ok", (Map)localObject1);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                w.e("MicroMsg.MsgHandler", "mmOnActivityResult REQUEST_CHOOSE_MEDIA nor the videoitem");
                a(this.rSz, "chooseMedia:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              if (paramInt1 == 2)
              {
                paramIntent = paramIntent.getStringExtra("key_pick_local_media_local_ids");
                w.i("MicroMsg.MsgHandler", "chooseMedia localIds:%s", new Object[] { paramIntent });
                if (com.tencent.mm.sdk.platformtools.bg.nm(paramIntent))
                {
                  w.e("MicroMsg.MsgHandler", "mmOnActivityResult REQUEST_CHOOSE_MEDIA image localIds is null");
                  a(this.rSz, "chooseMedia:fail", null);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                localObject1 = new HashMap();
                ((HashMap)localObject1).put("type", Integer.valueOf(2));
                ((HashMap)localObject1).put("localIds", paramIntent);
                a(this.rSz, "chooseMedia:ok", (Map)localObject1);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              w.e("MicroMsg.MsgHandler", "type:%d is error", new Object[] { Integer.valueOf(paramInt1) });
              a(this.rSz, "chooseMedia:fail", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 46)
            {
              switch (paramInt2)
              {
              default: 
                a(this.rSz, "previewVideo:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              case 0: 
                a(this.rSz, "previewVideo:cancel", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "previewVideo:ok", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 19)
            {
              w.i("MicroMsg.MsgHandler", "request to config exdevice wifi connection, result code = " + paramInt2);
              switch (paramInt2)
              {
              }
              for (;;)
              {
                GMTrace.o(12199183515648L, 90891);
                return;
                a(this.rSz, "configWXDeviceWiFi:ok", null);
                GMTrace.o(12199183515648L, 90891);
                return;
                localObject2 = null;
                localObject1 = localObject2;
                if (paramIntent != null)
                {
                  localObject1 = localObject2;
                  if (!paramIntent.getBooleanExtra("is_wifi_connected", true))
                  {
                    localObject1 = new HashMap();
                    ((HashMap)localObject1).put("desc", "wifi_not_connected");
                  }
                }
                a(this.rSz, "configWXDeviceWiFi:cancel", (Map)localObject1);
                GMTrace.o(12199183515648L, 90891);
                return;
                a(this.rSz, "configWXDeviceWiFi:fail", null);
              }
            }
            if (paramInt1 == 20)
            {
              w.i("MicroMsg.MsgHandler", "request request_verify_wcpay_password, resultCode = " + paramInt2);
              localObject2 = new HashMap();
              if (paramInt2 == -1)
              {
                localObject1 = "";
                if (paramIntent != null) {
                  localObject1 = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("token"), "");
                }
                if (!TextUtils.isEmpty((CharSequence)localObject1))
                {
                  ((Map)localObject2).put("token", localObject1);
                  a(this.rSz, "verifyWCPayPassword:ok", (Map)localObject2);
                  w.i("MicroMsg.MsgHandler", "checkPwdToken is valid, verifyWCPayPassword:ok");
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                w.i("MicroMsg.MsgHandler", "checkPwdToken is empty, verifyWCPayPassword:fail");
                a(this.rSz, "verifyWCPayPassword:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              w.i("MicroMsg.MsgHandler", "resultCode is canlcel, verifyWCPayPassword:fail");
              a(this.rSz, "verifyWCPayPassword:fail", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (21 == paramInt1)
            {
              w.d("MicroMsg.MsgHandler", "hy: callback to see order. directly finish");
              a(this.rSz, "see_order_ok", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 22)
            {
              w.i("MicroMsg.MsgHandler", "request get_recevie_biz_hongbao_request, resultCode = " + paramInt2);
              if (paramInt2 == -1)
              {
                a(this.rSz, "get_recevie_biz_hongbao_request:ok", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "get_recevie_biz_hongbao_request:fail", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 24)
            {
              if (paramInt2 == -1)
              {
                dI(2, 1);
                if (com.tencent.mm.sdk.platformtools.bg.getInt((String)this.rSz.nSp.get("open_from_scene"), 0) == 4) {
                  com.tencent.mm.plugin.report.service.g.ork.i(10651, new Object[] { Integer.valueOf(5), Integer.valueOf(0), Integer.valueOf(0) });
                }
                try
                {
                  if (this.rEM != null)
                  {
                    paramIntent = (String)this.rSz.nSp.get("appId");
                    if (!TextUtils.isEmpty(paramIntent)) {
                      break label10894;
                    }
                    paramIntent = (String)this.rSz.nSp.get("appid");
                    a(paramIntent, (String)this.rSz.nSp.get("img_url"), 1, this.rEM.d(85, null));
                  }
                }
                catch (RemoteException paramIntent)
                {
                  for (;;)
                  {
                    w.e("MicroMsg.MsgHandler", "invokeAsResult : %s", new Object[] { paramIntent });
                  }
                }
                a(this.rSz, "share_timeline:ok", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              dI(2, 3);
              a(this.rSz, "share_timeline:cancel", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 26)
            {
              w.d("MicroMsg.MsgHandler", "select pedometer source resultCode = " + paramInt2);
              if (paramInt2 == -1)
              {
                a(this.rSz, "selectPedometerSource:ok", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              if (paramInt2 == 0)
              {
                w.i("MicroMsg.MsgHandler", "selectPedometerSource result cancel");
                a(this.rSz, "selectPedometerSource:cancel", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              w.e("MicroMsg.MsgHandler", "selectPedometerSource result fail");
              a(this.rSz, "selectPedometerSource:fail", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 25)
            {
              w.i("MicroMsg.MsgHandler", "hy: get ibg order finish. result code: %d", new Object[] { Integer.valueOf(paramInt2) });
              if (paramInt2 == -1) {
                a(this.rSz, "get_h5_transaction_request:ok", null);
              }
              for (;;)
              {
                if ((this.rSQ != 1) || (this.rEM == null)) {
                  break label10863;
                }
                try
                {
                  this.rEM.bDi();
                  this.rEM.Q(null);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                catch (RemoteException paramIntent)
                {
                  w.printErrStackTrace("MicroMsg.MsgHandler", paramIntent, "", new Object[0]);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                a(this.rSz, "get_h5_transaction_request:cancel", null);
              }
            }
            if (paramInt1 == 28)
            {
              w.i("MicroMsg.MsgHandler", "get web pay checkout counter request finish. result code: %d", new Object[] { Integer.valueOf(paramInt2) });
              if (paramInt2 == -1)
              {
                localObject1 = new HashMap();
                localObject2 = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("token"), "");
                paramIntent = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("bind_serial"), "");
                ((Map)localObject1).put("token", localObject2);
                ((Map)localObject1).put("bind_serial", paramIntent);
                a(this.rSz, "getWebPayCheckoutCounterRequst:ok", (Map)localObject1);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "getWebPayCheckoutCounterRequst:fail", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 31)
            {
              if (paramInt2 != -1)
              {
                a(this.rSz, "openEnterpriseContact:ok", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              paramIntent = paramIntent.getBundleExtra("result_data");
              if (paramIntent != null)
              {
                paramIntent = paramIntent.getString("result");
                localObject1 = new HashMap();
                ((Map)localObject1).put("result", paramIntent);
                a(this.rSz, "openEnterpriseContact:ok", (Map)localObject1);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "openEnterpriseContact:ok", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 53)
            {
              if (paramInt2 != -1)
              {
                a(this.rSz, "selectEnterpriseContact:ok", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              paramIntent = paramIntent.getBundleExtra("result_data");
              if (paramIntent != null)
              {
                paramIntent = paramIntent.getString("result");
                localObject1 = new HashMap();
                ((Map)localObject1).put("result", paramIntent);
                a(this.rSz, "selectEnterpriseContact:ok", (Map)localObject1);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "selectEnterpriseContact:ok", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 29)
            {
              if (paramInt2 == -1) {}
              for (bool = true;; bool = false)
              {
                w.d("MicroMsg.MsgHandler", "consumedShareCard:ok(r : %b)", new Object[] { Boolean.valueOf(bool) });
                if (paramInt2 != -1) {
                  break;
                }
                a(this.rSz, "consumedShareCard:ok", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "consumedShareCard:fail", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 113)
            {
              if (paramInt2 == -1)
              {
                aQ(this.rSz);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "chooseImage:fail_android_permission_denied", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 116)
            {
              if (paramInt2 == -1)
              {
                bb(this.rSz);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "startRecord:fail_android_permission_denied", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 115)
            {
              if (paramInt2 == -1)
              {
                b(this.rSz, 0);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "chooseVideo:fail_android_permission_denied", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 117)
            {
              if (paramInt2 == -1)
              {
                b(this.rSz, 1);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "recordVideo:fail_android_permission_denied", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 118)
            {
              if (paramInt2 == -1)
              {
                b(this.rSz, 1);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "recordVideo:fail_android_permission_denied", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 119)
            {
              if (paramInt2 == -1)
              {
                aX(this.rSz);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              w.e("MicroMsg.MsgHandler", "chooseMedia:fail_android_permission_denied:CAMERA");
              a(this.rSz, "chooseMedia:fail_android_permission_denied", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 120)
            {
              if (paramInt2 == -1)
              {
                aX(this.rSz);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              w.e("MicroMsg.MsgHandler", "chooseMedia:fail_android_permission_denied:MICROPHONE");
              a(this.rSz, "chooseMedia:fail_android_permission_denied", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 30)
            {
              w.i("MicroMsg.MsgHandler", "doSelectSingleContact activtiy callback");
              localObject1 = (String)this.rSz.nSp.get("appId");
              if ((this.rSC == null) || (!TextUtils.isEmpty((CharSequence)localObject1))) {
                break label10891;
              }
              localObject1 = this.rSC.getString("jsapi_args_appid");
              paramInt1 = com.tencent.mm.sdk.platformtools.bg.getInt((String)this.rSz.nSp.get("selectMode"), 0);
              localObject2 = (String)this.rSz.nSp.get("busiId");
              w.i("MicroMsg.MsgHandler", "select single contact : appId:%s, busiId:%s, selectedMode:%d", new Object[] { localObject1, localObject2, Integer.valueOf(paramInt1) });
              switch (paramInt2)
              {
              }
              for (;;)
              {
                GMTrace.o(12199183515648L, 90891);
                return;
                a(this.rSz, "selectSingleContact:cancel", null);
                GMTrace.o(12199183515648L, 90891);
                return;
                if (paramIntent == null) {}
                for (paramIntent = null; (paramIntent == null) || (paramIntent.length() == 0); paramIntent = paramIntent.getStringExtra("Select_Conv_User"))
                {
                  w.e("MicroMsg.MsgHandler", "mmOnActivityResult,selectSingleContact fail, user is null");
                  a(this.rSz, "selectSingleContact:fail", null);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                if (paramInt1 == 0)
                {
                  paramIntent = new com.tencent.mm.plugin.webview.model.k((String)localObject1, paramIntent);
                  com.tencent.mm.y.at.wS().a(1566, new com.tencent.mm.ad.e()
                  {
                    public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
                    {
                      GMTrace.i(19437142933504L, 144818);
                      if ((g.this.htG != null) && (g.this.htG.isShowing()))
                      {
                        g.this.htG.dismiss();
                        g.this.htG = null;
                      }
                      com.tencent.mm.y.at.wS().b(1566, this);
                      if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
                      {
                        w.e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Cgi_PayIBGGetUserOpenId fail");
                        g.this.a(g.this.rSz, "selectSingleContact:fail", null);
                        GMTrace.o(19437142933504L, 144818);
                        return;
                      }
                      w.i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Cgi_PayIBGGetUserOpenId success");
                      paramAnonymousString = (com.tencent.mm.plugin.webview.model.k)paramAnonymousk;
                      if (paramAnonymousString.fUa == null)
                      {
                        paramAnonymousString = null;
                        paramAnonymousk = g.this.rSz.nSp.get("result_sign_type");
                        if (paramAnonymousk == null) {
                          break label299;
                        }
                      }
                      label299:
                      for (paramAnonymousInt1 = com.tencent.mm.sdk.platformtools.bg.getInt((String)paramAnonymousk, 0);; paramAnonymousInt1 = 0)
                      {
                        paramAnonymousk = new HashMap();
                        paramAnonymousk.put("package", paramAnonymousString.udg);
                        paramAnonymousk.put("sign", paramAnonymousString.udh);
                        if (paramAnonymousInt1 == 1) {
                          paramAnonymousk.put("signType", paramAnonymousString.udi);
                        }
                        paramAnonymousk.put("timestamp", paramAnonymousString.tUz);
                        paramAnonymousk.put("noncestr", paramAnonymousString.udf);
                        w.d("MicroMsg.MsgHandler", "select single contact : package:%s, sign:%s", new Object[] { paramAnonymousString.udg, paramAnonymousString.udh });
                        g.this.a(g.this.rSz, "selectSingleContact:ok", paramAnonymousk);
                        GMTrace.o(19437142933504L, 144818);
                        return;
                        paramAnonymousString = (ajc)paramAnonymousString.fUa.gtD.gtK;
                        break;
                      }
                    }
                  });
                  com.tencent.mm.y.at.wS().d(paramIntent);
                  localObject1 = this.context;
                  this.context.getString(R.l.cUG);
                  this.htG = com.tencent.mm.ui.base.h.a((Context)localObject1, this.context.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
                  {
                    public final void onCancel(DialogInterface paramAnonymousDialogInterface)
                    {
                      GMTrace.i(19431640006656L, 144777);
                      com.tencent.mm.y.at.wS().c(paramIntent);
                      GMTrace.o(19431640006656L, 144777);
                    }
                  });
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                if (paramInt1 == 1)
                {
                  paramIntent = new com.tencent.mm.plugin.webview.model.q((String)localObject1, (String)localObject2, paramIntent);
                  com.tencent.mm.y.at.wS().a(1177, new com.tencent.mm.ad.e()
                  {
                    public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
                    {
                      GMTrace.i(19447075045376L, 144892);
                      if ((g.this.htG != null) && (g.this.htG.isShowing()))
                      {
                        g.this.htG.dismiss();
                        g.this.htG = null;
                      }
                      com.tencent.mm.y.at.wS().b(1177, this);
                      if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
                      {
                        w.e("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid fail");
                        g.this.a(g.this.rSz, "selectSingleContact:fail", null);
                        GMTrace.o(19447075045376L, 144892);
                        return;
                      }
                      w.i("MicroMsg.MsgHandler", "mmOnActivityResult, MMFunc_Biz_Jsapi_Getuseropendid success");
                      paramAnonymousString = (com.tencent.mm.plugin.webview.model.q)paramAnonymousk;
                      paramAnonymousk = new HashMap();
                      paramAnonymousk.put("package", paramAnonymousString.rEm);
                      paramAnonymousk.put("sign", paramAnonymousString.sign);
                      paramAnonymousk.put("headImgUrl", paramAnonymousString.rEn);
                      paramAnonymousk.put("nickName", paramAnonymousString.rEo);
                      paramAnonymousk.put("friendRelation", Integer.valueOf(paramAnonymousString.rEp));
                      w.d("MicroMsg.MsgHandler", "select single contact : opnid:%s, sign:%s, nick_name:%s, friend_relation:%d", new Object[] { paramAnonymousString.rEm, paramAnonymousString.sign, paramAnonymousString.rEo, Integer.valueOf(paramAnonymousString.rEp) });
                      g.this.a(g.this.rSz, "selectSingleContact:ok", paramAnonymousk);
                      GMTrace.o(19447075045376L, 144892);
                    }
                  });
                  com.tencent.mm.y.at.wS().d(paramIntent);
                  localObject1 = this.context;
                  this.context.getString(R.l.cUG);
                  this.htG = com.tencent.mm.ui.base.h.a((Context)localObject1, this.context.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
                  {
                    public final void onCancel(DialogInterface paramAnonymousDialogInterface)
                    {
                      GMTrace.i(19434727014400L, 144800);
                      com.tencent.mm.y.at.wS().c(paramIntent);
                      GMTrace.o(19434727014400L, 144800);
                    }
                  });
                }
              }
            }
            if (paramInt1 == 34)
            {
              if (paramInt2 == -1)
              {
                a(this.rSz, "get_wcpay_realname_verify:ok", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              if (paramInt2 == 1)
              {
                a(this.rSz, "get_wcpay_realname_verify:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "get_wcpay_realname_verify:cancel", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 35)
            {
              if (paramInt2 == -1)
              {
                paramIntent = new ne();
                paramIntent.eSl.context = this.context;
                com.tencent.mm.sdk.b.a.vgX.m(paramIntent);
                try
                {
                  this.rEM.bDi();
                  this.rEM.Q(null);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                catch (RemoteException paramIntent)
                {
                  w.printErrStackTrace("MicroMsg.MsgHandler", paramIntent, "", new Object[0]);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
              }
              a(this.rSz, "selectWalletCurrency:cancel", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 37)
            {
              if (this.eLU == null)
              {
                w.e("MicroMsg.MsgHandler", "mmOnActivityResult fail, appmsg is null");
                a(this.rSz, "send_app_msg:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              localObject3 = (String)this.rSz.nSp.get("appid");
              localObject1 = null;
              if (this.rSC == null) {
                break label10880;
              }
              localObject2 = (SnsAdClick)this.rSC.getParcelable("KSnsAdTag");
              localObject1 = localObject2;
              if (!TextUtils.isEmpty((CharSequence)localObject3)) {
                break label10880;
              }
              localObject1 = this.rSC.getString("jsapi_args_appid");
              ??? = this.rSz.bFO().get("Internal@AsyncReport");
              switch (paramInt2)
              {
              }
              for (;;)
              {
                GMTrace.o(12199183515648L, 90891);
                return;
                if (localObject2 != null) {
                  ((SnsAdClick)localObject2).gZ(8);
                }
                k.a(this.rSz.bFO(), Mz("sendAppMessage"), null, (String)localObject1);
                if ((??? != null) && ((??? instanceof Boolean)) && (((Boolean)???).booleanValue())) {
                  e(this.rSz, true);
                }
                a(this.rSz, "send_app_msg:cancel", null);
                GMTrace.o(12199183515648L, 90891);
                return;
                if (localObject2 != null) {
                  ((SnsAdClick)localObject2).gZ(7);
                }
                localObject2 = com.tencent.mm.pluginsdk.model.app.g.Et((String)localObject1);
                if (paramIntent == null)
                {
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                localObject3 = paramIntent.getStringExtra("enterprise_biz_name");
                final long l = paramIntent.getLongExtra("key_biz_chat_id", -1L);
                paramIntent = paramIntent.getStringExtra("enterprise_share_append_text");
                if ((localObject3 == null) || (((String)localObject3).length() == 0))
                {
                  w.e("MicroMsg.MsgHandler", "mmOnActivityResult fail, toUser is null");
                  a(this.rSz, "send_app_msg:fail", null);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                localObject4 = (String)this.rSz.nSp.get("img_url");
                this.rSz.nSp.get("desc");
                localObject5 = (String)this.rSz.nSp.get("src_username");
                localObject6 = (String)this.rSz.nSp.get("src_displayname");
                localObject7 = bFy();
                k.a(this.rSz.bFO(), Mz("sendAppMessage"), (String)localObject3, (String)localObject1);
                if ((??? != null) && ((??? instanceof Boolean)) && (((Boolean)???).booleanValue())) {
                  e(this.rSz, true);
                }
                if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject4))
                {
                  com.tencent.mm.af.a.c localc;
                  if (l >= 0L) {
                    localc = com.tencent.mm.af.x.FI().t(l);
                  }
                  for (;;)
                  {
                    synchronized (com.tencent.mm.af.a.e.gyk)
                    {
                      String str = com.tencent.mm.af.a.e.Br();
                      com.tencent.mm.af.a.e.d(localc);
                      a((com.tencent.mm.pluginsdk.model.app.f)localObject2, (String)localObject1, (String)localObject3, (String)localObject4, (String)localObject5, (String)localObject6, paramIntent, (String)localObject7);
                      com.tencent.mm.af.a.e.jk(str);
                      com.tencent.mm.ui.base.h.bj(this.context, this.context.getString(R.l.div));
                      a(this.rSz, "send_app_msg:ok", null);
                      GMTrace.o(12199183515648L, 90891);
                      return;
                    }
                    a((com.tencent.mm.pluginsdk.model.app.f)localObject2, (String)localObject1, (String)localObject3, (String)localObject4, (String)localObject5, (String)localObject6, paramIntent, (String)localObject7);
                  }
                }
                com.tencent.mm.ao.n.IY().a((String)localObject4, new com.tencent.mm.ao.b.c()
                {
                  public final void n(Bitmap arg1)
                  {
                    GMTrace.i(19445867085824L, 144883);
                    if (g.this.moR != null) {
                      g.this.moR.dismiss();
                    }
                    com.tencent.mm.af.a.c localc;
                    if (l >= 0L) {
                      localc = com.tencent.mm.af.x.FI().t(l);
                    }
                    for (;;)
                    {
                      synchronized (com.tencent.mm.af.a.e.gyk)
                      {
                        String str = com.tencent.mm.af.a.e.Br();
                        com.tencent.mm.af.a.e.d(localc);
                        g.this.a(localObject1, localObject3, localObject4, localObject5, localObject6, paramIntent, localObject7, this.rTC);
                        com.tencent.mm.af.a.e.jk(str);
                        if (g.this.context != null) {
                          com.tencent.mm.ui.base.h.bm(g.this.context, g.this.context.getString(R.l.div));
                        }
                        g.this.a(g.this.rSz, "send_app_msg:ok", null);
                        GMTrace.o(19445867085824L, 144883);
                        return;
                      }
                      g.this.a(localObject1, localObject3, localObject4, localObject5, localObject6, paramIntent, localObject7, this.rTC);
                    }
                  }
                });
              }
            }
            if (paramInt1 == 38)
            {
              if (paramInt2 == -1)
              {
                w.i("MicroMsg.MsgHandler", "hy: soter auth ok");
                paramIntent = i.ac(paramIntent.getExtras());
                a(this.rSz, "soter_biometric_authentication:ok", paramIntent);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              if (paramInt2 == 1)
              {
                w.w("MicroMsg.MsgHandler", "hy: soter auth failed");
                a(this.rSz, "soter_biometric_authentication:fail", i.ac(paramIntent.getExtras()));
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              w.e("MicroMsg.MsgHandler", "hy: soter user cancelled");
              a(this.rSz, "soter_biometric_authentication:cancel", i.ac(paramIntent.getExtras()));
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 39)
            {
              if (paramInt2 == -1)
              {
                a(this.rSz, "unbind_bank_card:ok", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              if (paramInt2 == 1)
              {
                a(this.rSz, "unbind_bank_card:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "unbind_bank_card:cancel", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 40)
            {
              if (paramInt2 == -1)
              {
                localObject1 = new Bundle();
                if (paramIntent != null)
                {
                  localObject2 = com.tencent.mm.bc.a.b(paramIntent.getLongArrayExtra("k_outside_expose_proof_item_list"));
                  paramInt2 = ((ArrayList)localObject2).size();
                  localObject3 = new String[paramInt2];
                  localObject4 = new String[paramInt2];
                  localObject5 = new String[paramInt2];
                  localObject6 = new int[paramInt2];
                  localObject7 = new int[paramInt2];
                  paramInt1 = 0;
                  if (paramInt1 < paramInt2)
                  {
                    ??? = (com.tencent.mm.storage.au)((ArrayList)localObject2).get(paramInt1);
                    localObject3[paramInt1] = String.valueOf(((com.tencent.mm.storage.au)???).qY());
                    if (paramIntent.getBooleanExtra("k_is_group_chat", false))
                    {
                      localObject4[paramInt1] = bc.gQ(((com.tencent.mm.storage.au)???).rc());
                      localObject5[paramInt1] = bc.gP(((com.tencent.mm.storage.au)???).rc());
                      label8318:
                      if (((com.tencent.mm.storage.au)???).qZ() == 1) {
                        localObject5[paramInt1] = com.tencent.mm.y.q.zE();
                      }
                      if (localObject4[paramInt1] == null) {
                        localObject4[paramInt1] = "";
                      }
                      if (localObject5[paramInt1] == null) {
                        localObject5[paramInt1] = "";
                      }
                      if (!((com.tencent.mm.storage.au)???).aCp()) {
                        break label8418;
                      }
                      localObject6[paramInt1] = 49;
                    }
                    for (;;)
                    {
                      localObject7[paramInt1] = ((int)(((com.tencent.mm.storage.au)???).ra() / 1000L));
                      paramInt1 += 1;
                      break;
                      localObject4[paramInt1] = ((com.tencent.mm.storage.au)???).rc();
                      localObject5[paramInt1] = ((com.tencent.mm.storage.au)???).rb();
                      break label8318;
                      label8418:
                      localObject6[paramInt1] = ((com.tencent.mm.storage.au)???).getType();
                    }
                  }
                  ((Bundle)localObject1).putStringArray("msgIds", (String[])localObject3);
                  ((Bundle)localObject1).putStringArray("contents", (String[])localObject4);
                  ((Bundle)localObject1).putStringArray("senders", (String[])localObject5);
                  ((Bundle)localObject1).putIntArray("msgTypes", (int[])localObject6);
                  ((Bundle)localObject1).putIntArray("msgTimes", (int[])localObject7);
                  try
                  {
                    if (this.rEM != null) {
                      this.rEM.m(48, (Bundle)localObject1);
                    }
                    a(this.rSz, "select chat record:ok", null);
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                  catch (RemoteException paramIntent)
                  {
                    w.w("MicroMsg.MsgHandler", "onGetMsgProofItems exception" + paramIntent.getMessage());
                    a(this.rSz, "select chat record:fail", null);
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                }
                a(this.rSz, "select chat record:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "select chat record:cancel", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 41)
            {
              if (paramInt2 == -1)
              {
                a(this.rSz, "id_card_realname_verify:ok", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              if (paramInt2 == 1)
              {
                a(this.rSz, "id_card_realname_verify:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "id_card_realname_verify:cancel", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 42)
            {
              if (paramInt2 == -1)
              {
                if (paramIntent != null)
                {
                  paramIntent = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("gameRegionName"), "");
                  localObject1 = new HashMap();
                  ((HashMap)localObject1).put("gameRegionName", paramIntent);
                  a(this.rSz, "get game region:ok", (Map)localObject1);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                a(this.rSz, "get game region:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              if (paramInt2 == 1)
              {
                a(this.rSz, "get game region:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "get game region:cancel", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 43)
            {
              w.i("MicroMsg.MsgHandler", "request to open file chooser for id card image, result code = " + paramInt2);
              switch (paramInt2)
              {
              default: 
                a(this.rSz, "chooseImage:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              case -1: 
                localObject1 = new HashMap();
                localObject2 = paramIntent.getStringExtra("key_pick_local_pic_callback_local_ids");
                w.i("MicroMsg.MsgHandler", "localIds = %s", new Object[] { localObject2 });
                if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2))
                {
                  a(this.rSz, "chooseIdCard:fail", null);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                try
                {
                  localObject2 = new JSONArray((String)localObject2);
                  if (((JSONArray)localObject2).length() > 0)
                  {
                    ((HashMap)localObject1).put("localId", ((JSONArray)localObject2).get(0).toString());
                    if (paramIntent.getStringExtra("key_pick_local_pic_source_type") != null) {
                      ((HashMap)localObject1).put("sourceType", "album");
                    }
                    a(this.rSz, "chooseIdCard:ok", (Map)localObject1);
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                }
                catch (Exception paramIntent)
                {
                  w.printErrStackTrace("MicroMsg.MsgHandler", paramIntent, "", new Object[0]);
                  a(this.rSz, "chooseImage:fail", null);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                a(this.rSz, "chooseImage:fail", null);
                GMTrace.o(12199183515648L, 90891);
                return;
              }
              a(this.rSz, "chooseIdCard:cancel", null);
              GMTrace.o(12199183515648L, 90891);
              return;
            }
            if (paramInt1 == 48)
            {
              w.i("MicroMsg.MsgHandler", "alvinluo: requestWxFacePictureVerify resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
              if (paramInt2 == -1)
              {
                localObject1 = this.rSz;
                if (paramIntent != null) {}
                for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                {
                  a((i)localObject1, "requestWxFacePictureVerify:ok", i.ac(paramIntent));
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
              }
              if (paramInt2 == 1)
              {
                localObject1 = this.rSz;
                if (paramIntent != null) {}
                for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                {
                  a((i)localObject1, "requestWxFacePictureVerify:fail", i.ac(paramIntent));
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
              }
              if (paramInt2 == 0)
              {
                localObject1 = this.rSz;
                if (paramIntent != null) {}
                for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                {
                  a((i)localObject1, "requestWxFacePictureVerify:cancel", i.ac(paramIntent));
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
              }
            }
            else if (paramInt1 == 49)
            {
              w.i("MicroMsg.MsgHandler", "hy: REQUEST_FACE_DETECT_WITH_VIDEO resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
              if (paramInt2 == -1)
              {
                localObject1 = this.rSz;
                if (paramIntent != null) {}
                for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                {
                  a((i)localObject1, "requestWxFacePictureVerifyUnionVideo:ok", i.ac(paramIntent));
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
              }
              if (paramInt2 == 1)
              {
                localObject1 = this.rSz;
                if (paramIntent != null) {}
                for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                {
                  a((i)localObject1, "requestWxFacePictureVerifyUnionVideo:fail", i.ac(paramIntent));
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
              }
              if (paramInt2 == 0)
              {
                localObject1 = this.rSz;
                if (paramIntent != null) {}
                for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                {
                  a((i)localObject1, "requestWxFacePictureVerifyUnionVideo:cancel", i.ac(paramIntent));
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
              }
            }
            else
            {
              if (paramInt1 == 52)
              {
                w.i("MicroMsg.MsgHandler", "share emmotion resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
                switch (paramInt2)
                {
                default: 
                  a(this.rSz, "shareEmoticon:fail", null);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                case -1: 
                  localObject1 = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("Select_Conv_User"), "");
                  localObject2 = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("emoji_thumb_path"), "");
                  localObject3 = com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("emoji_activity_id"), "");
                  paramIntent = com.tencent.mm.plugin.emoji.model.h.arl().afO().UK((String)localObject2);
                  if (paramIntent != null) {
                    break;
                  }
                  com.tencent.mm.y.at.AR();
                  localObject4 = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", (String)localObject2);
                  if (!com.tencent.mm.a.e.aZ((String)localObject4)) {
                    break;
                  }
                  if (o.RH((String)localObject4)) {}
                  for (paramInt1 = EmojiInfo.vCw;; paramInt1 = EmojiInfo.vCv)
                  {
                    paramIntent = new EmojiInfo();
                    paramIntent.jI((String)localObject2);
                    paramIntent.AA(EmojiInfo.vCo);
                    paramIntent.setType(paramInt1);
                    paramIntent.setSize(com.tencent.mm.a.e.aY((String)localObject4));
                    paramIntent.AB(1);
                    if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject3)) {
                      paramIntent.field_activityid = ((String)localObject3);
                    }
                    paramIntent = com.tencent.mm.plugin.emoji.model.h.arl().afO().n(paramIntent);
                    localObject1 = com.tencent.mm.sdk.platformtools.bg.g(com.tencent.mm.sdk.platformtools.bg.aq((String)localObject1, "").split(",")).iterator();
                    while (((Iterator)localObject1).hasNext())
                    {
                      localObject2 = (String)((Iterator)localObject1).next();
                      if (paramIntent != null) {
                        com.tencent.mm.plugin.emoji.model.h.arh().a((String)localObject2, paramIntent, null);
                      }
                    }
                  }
                  a(this.rSz, "shareEmoticon:ok", null);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                case 0: 
                  a(this.rSz, "shareEmoticon:cancel", null);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
              }
              if (paramInt1 == 50)
              {
                w.i("MicroMsg.MsgHandler", "hy: requestWxFaceRegisterInternal resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
                if (paramInt2 == -1)
                {
                  localObject1 = this.rSz;
                  if (paramIntent != null) {}
                  for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                  {
                    a((i)localObject1, "requestWxFaceRegisterInternal:ok", i.ac(paramIntent));
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                }
                if (paramInt2 == 1)
                {
                  localObject1 = this.rSz;
                  if (paramIntent != null) {}
                  for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                  {
                    a((i)localObject1, "requestWxFaceRegisterInternal:fail", i.ac(paramIntent));
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                }
                if (paramInt2 == 0)
                {
                  localObject1 = this.rSz;
                  if (paramIntent != null) {}
                  for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                  {
                    a((i)localObject1, "requestWxFaceRegisterInternal:cancel", i.ac(paramIntent));
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                }
              }
              else if (paramInt1 == 51)
              {
                w.i("MicroMsg.MsgHandler", "hy: requestWxFaceVerifyInternal resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
                if (paramInt2 == -1)
                {
                  localObject1 = this.rSz;
                  if (paramIntent != null) {}
                  for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                  {
                    a((i)localObject1, "requestWxFaceVerifyInternal:ok", i.ac(paramIntent));
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                }
                if (paramInt2 == 1)
                {
                  localObject1 = this.rSz;
                  if (paramIntent != null) {}
                  for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                  {
                    a((i)localObject1, "requestWxFaceVerifyInternal:fail", i.ac(paramIntent));
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                }
                if (paramInt2 == 0)
                {
                  localObject1 = this.rSz;
                  if (paramIntent != null) {}
                  for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                  {
                    a((i)localObject1, "requestWxFaceVerifyInternal:cancel", i.ac(paramIntent));
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                }
              }
              else
              {
                if (paramInt1 == 54)
                {
                  if ((paramInt2 == -1) && (paramIntent != null))
                  {
                    paramIntent = paramIntent.getStringExtra("Select_Contact");
                    localObject1 = com.tencent.mm.y.r.fs(paramIntent);
                    localObject2 = new Bundle();
                    ((Bundle)localObject2).putString("username", paramIntent);
                    ((Bundle)localObject2).putString("nickname", (String)localObject1);
                    ((Bundle)localObject2).putInt("ret", 0);
                    try
                    {
                      if (this.rEM != null) {
                        this.rEM.m(128, (Bundle)localObject2);
                      }
                      a(this.rSz, "", null);
                      GMTrace.o(12199183515648L, 90891);
                      return;
                    }
                    catch (RemoteException paramIntent)
                    {
                      for (;;)
                      {
                        w.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + paramIntent.getMessage());
                      }
                    }
                  }
                  a(this.rSz, "slectContact:fail", null);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                if (paramInt1 == 55)
                {
                  w.i("MicroMsg.MsgHandler", "hy: REQUEST_SET_RESET_WALLET_PWD_REQUEST resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
                  if (paramInt2 == -1)
                  {
                    localObject1 = this.rSz;
                    if (paramIntent != null) {}
                    for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                    {
                      a((i)localObject1, "setWCPayPassword:ok", i.ac(paramIntent));
                      GMTrace.o(12199183515648L, 90891);
                      return;
                    }
                  }
                  if (paramInt2 == 0)
                  {
                    localObject1 = this.rSz;
                    if (paramIntent != null) {}
                    for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                    {
                      a((i)localObject1, "setWCPayPassword:cancel", i.ac(paramIntent));
                      GMTrace.o(12199183515648L, 90891);
                      return;
                    }
                  }
                  localObject1 = this.rSz;
                  if (paramIntent != null) {}
                  for (paramIntent = paramIntent.getExtras();; paramIntent = null)
                  {
                    a((i)localObject1, "setWCPayPassword:fail", i.ac(paramIntent));
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                }
                if (paramInt1 == 56)
                {
                  w.i("MicroMsg.MsgHandler", "request choose invoice title, resultCode = " + paramInt2);
                  localObject1 = new HashMap();
                  if (paramInt2 == -1)
                  {
                    if (paramIntent != null) {
                      ((Map)localObject1).put("choose_invoice_title_info", com.tencent.mm.sdk.platformtools.bg.aq(paramIntent.getStringExtra("choose_invoice_title_info"), ""));
                    }
                    a(this.rSz, "chooseInvoiceTitle:ok", (Map)localObject1);
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                  if (paramInt2 == 0)
                  {
                    a(this.rSz, "chooseInvoiceTitle:cancel", (Map)localObject1);
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                  a(this.rSz, "chooseInvoiceTitle:fail", (Map)localObject1);
                  GMTrace.o(12199183515648L, 90891);
                  return;
                }
                if (paramInt1 == 57)
                {
                  w.i("MicroMsg.MsgHandler", "request voice login verify, resultCode: %d", new Object[] { Integer.valueOf(paramInt2) });
                  localObject1 = new HashMap();
                  if (paramInt2 == -1)
                  {
                    ((Map)localObject1).put("err_code", Integer.valueOf(0));
                    ((Map)localObject1).put("err_msg", "verify ok");
                    if ((this.context instanceof MMActivity)) {
                      ((MMActivity)this.context).getIntent().putExtra("VoiceLoginAuthPwd", paramIntent.getStringExtra("VoiceLoginAuthPwd"));
                    }
                    a(this.rSz, "request voice login verify:ok", (Map)localObject1);
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                  if (paramInt2 == 0)
                  {
                    ((Map)localObject1).put("err_code", Integer.valueOf(1));
                    ((Map)localObject1).put("err_msg", "verify cancel");
                    a(this.rSz, "request voice login verify:cancel", (Map)localObject1);
                    GMTrace.o(12199183515648L, 90891);
                    return;
                  }
                  ((Map)localObject1).put("err_code", Integer.valueOf(2));
                  ((Map)localObject1).put("err_msg", "verify error");
                  a(this.rSz, "request voice login verify:error", (Map)localObject1);
                }
              }
            }
          }
        }
        label10863:
        GMTrace.o(12199183515648L, 90891);
        return;
      }
      catch (RemoteException paramIntent)
      {
        label10880:
        label10891:
        label10894:
        for (;;)
        {
          continue;
          continue;
          localObject2 = localObject1;
          localObject1 = localObject3;
          continue;
        }
      }
      label10897:
      localObject2 = localObject1;
    }
  }
  
  public final void a(Context paramContext, com.tencent.mm.plugin.webview.stub.e parame)
  {
    GMTrace.i(12180795686912L, 90754);
    w.i("MicroMsg.MsgHandler", "set context and callbacker");
    this.context = paramContext;
    if (this.rSL != null) {
      this.rSL.a(paramContext, parame);
    }
    this.rEM = parame;
    GMTrace.o(12180795686912L, 90754);
  }
  
  public final void a(Context paramContext, com.tencent.mm.plugin.webview.stub.e parame1, com.tencent.mm.plugin.webview.stub.e parame2)
  {
    GMTrace.i(12180929904640L, 90755);
    w.i("MicroMsg.MsgHandler", "set context, callbacker and service callbacker");
    this.context = paramContext;
    if (this.rSL != null) {
      this.rSL.a(paramContext, parame1);
    }
    this.rEM = parame1;
    this.rSI = parame2;
    GMTrace.o(12180929904640L, 90755);
  }
  
  public final void a(com.tencent.mm.plugin.webview.stub.e parame, i parami, String paramString)
  {
    Object localObject = null;
    GMTrace.i(16078478508032L, 119794);
    this.kNw = false;
    if (parami == null) {
      parami = (i)localObject;
    }
    try
    {
      for (;;)
      {
        parame.a(parami, paramString, i.ac(null), true);
        com.tencent.mm.pluginsdk.s.unlock();
        GMTrace.o(16078478508032L, 119794);
        return;
        parami = parami.rUS;
      }
    }
    catch (Exception parame)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "onHandleEnd, ex = " + parame.getMessage());
      }
    }
  }
  
  public final void a(com.tencent.mm.plugin.webview.stub.e parame, i parami, String paramString, Map<String, Object> paramMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(12199988822016L, 90897);
    if (!paramBoolean2) {
      this.kNw = false;
    }
    if (parami == null) {}
    for (parami = null;; parami = parami.rUS) {
      try
      {
        parame.a(parami, paramString, i.ac(paramMap), paramBoolean1);
        GMTrace.o(12199988822016L, 90897);
        return;
      }
      catch (Exception parame)
      {
        w.w("MicroMsg.MsgHandler", "onHandleEnd, ex = " + parame.getMessage());
        GMTrace.o(12199988822016L, 90897);
      }
    }
  }
  
  public final void a(i parami, int paramInt1, int paramInt2)
  {
    GMTrace.i(12184419565568L, 90781);
    parami = parami.rUU;
    if ((parami.equals("requireSoterBiometricAuthentication")) || (parami.equals("getSupportSoter")))
    {
      String str = pi(Zi());
      com.tencent.mm.plugin.soter.c.g localg = com.tencent.mm.plugin.soter.c.g.qpi;
      com.tencent.mm.plugin.soter.c.g.l(parami, str, paramInt1, paramInt2);
    }
    GMTrace.o(12184419565568L, 90781);
  }
  
  public final void a(i parami, String paramString, Map<String, Object> paramMap)
  {
    GMTrace.i(12199720386560L, 90895);
    a(parami, paramString, paramMap, true, true);
    GMTrace.o(12199720386560L, 90895);
  }
  
  public final void a(i parami, String paramString, Map<String, Object> paramMap, boolean paramBoolean1, boolean paramBoolean2)
  {
    GMTrace.i(12199854604288L, 90896);
    this.kNw = false;
    for (;;)
    {
      try
      {
        if (this.rEM != null)
        {
          com.tencent.mm.plugin.webview.stub.e locale = this.rEM;
          if (parami != null) {
            continue;
          }
          parami = null;
          locale.a(parami, paramString, i.ac(paramMap), paramBoolean1);
        }
      }
      catch (Exception parami)
      {
        w.w("MicroMsg.MsgHandler", "onHandleEnd, ex = " + parami.getMessage());
        continue;
      }
      if (paramBoolean2) {
        com.tencent.mm.pluginsdk.s.unlock();
      }
      GMTrace.o(12199854604288L, 90896);
      return;
      parami = parami.rUS;
    }
  }
  
  public final void a(String paramString, Intent paramIntent)
  {
    GMTrace.i(12189788274688L, 90821);
    w.i("MicroMsg.MsgHandler", "chooseMediaFromCamera");
    if (paramString.equals("front")) {}
    for (int i = 16;; i = 256)
    {
      paramIntent.putExtra("key_pick_local_pic_capture", i);
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.a(this.context, "webview", ".ui.tools.OpenFileChooserUI", paramIntent, 47, false);
      GMTrace.o(12189788274688L, 90821);
      return;
    }
  }
  
  public final void a(String paramString1, boolean paramBoolean, String paramString2, long paramLong)
  {
    GMTrace.i(12197036032000L, 90875);
    Bundle localBundle = new Bundle();
    localBundle.putString("emoji_store_json_data", paramString1);
    localBundle.putBoolean("emoji_store_new_query", paramBoolean);
    localBundle.putString("emoji_store_page_buf", paramString2);
    localBundle.putLong("emoji_store_search_id", paramLong);
    w.d("MicroMsg.MsgHandler", "cpan emoji getSearchEmotionDataCallBack:%d", new Object[] { Long.valueOf(paramLong) });
    try
    {
      if (this.rEM != null) {
        this.rEM.m(80001, localBundle);
      }
      GMTrace.o(12197036032000L, 90875);
      return;
    }
    catch (RemoteException paramString1)
    {
      w.w("MicroMsg.MsgHandler", "getSearchEmotionDataCallBack exception" + paramString1.getMessage());
      GMTrace.o(12197036032000L, 90875);
    }
  }
  
  public final boolean a(i parami, int paramInt)
  {
    GMTrace.i(20447131336704L, 152343);
    String str1 = "";
    if (parami.nSp.containsKey("canvasId")) {
      str1 = parami.nSp.get("canvasId").toString();
    }
    int i = 0;
    if (parami.nSp.containsKey("preLoad")) {
      i = com.tencent.mm.sdk.platformtools.bg.Sy(parami.nSp.get("preLoad").toString());
    }
    int j = 0;
    if (parami.nSp.containsKey("noStore")) {
      j = com.tencent.mm.sdk.platformtools.bg.Sy(parami.nSp.get("noStore").toString());
    }
    String str2 = "";
    if (parami.nSp.containsKey("extraData")) {
      str2 = parami.nSp.get("extraData").toString();
    }
    String str3 = "";
    if (parami.nSp.containsKey("adInfoXml")) {
      str3 = parami.nSp.get("adInfoXml").toString();
    }
    String str4 = "";
    if (parami.nSp.containsKey("sessionId")) {
      str4 = parami.nSp.get("sessionId").toString();
    }
    String str5 = "";
    if (parami.nSp.containsKey("adBuffer")) {
      str5 = parami.nSp.get("adBuffer").toString();
    }
    w.i("MicroMsg.MsgHandler", "doOpenCanvas canvasid %s, getCanvasSource %d, preLoad %d, noStore %d, extra %s source %d adInfoXml %s, sessionId %s, adBuffer %s", new Object[] { str1, Integer.valueOf(paramInt), Integer.valueOf(i), Integer.valueOf(j), str2, Integer.valueOf(paramInt), str3, str4, str5 });
    HashMap localHashMap = new HashMap();
    if ((com.tencent.mm.sdk.platformtools.bg.nm(str1)) || ("0".equals(str1)))
    {
      localHashMap.put("ret", Integer.valueOf(-1));
      localHashMap.put("ret_msg", "invalid page id = " + str1);
      a(parami, "doOpenCanvas:fail", localHashMap);
      GMTrace.o(20447131336704L, 152343);
      return false;
    }
    Object localObject = new ky();
    ((ky)localObject).ePd.ePf = str1;
    ((ky)localObject).ePd.ePg = i;
    ((ky)localObject).ePd.ePh = j;
    ((ky)localObject).ePd.cfz = paramInt;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    Intent localIntent;
    if (i != 1)
    {
      String str6 = ((ky)localObject).ePe.ePi;
      localIntent = new Intent();
      localObject = str6;
      if (str6 == null) {
        localObject = "";
      }
      localIntent.putExtra("sns_landing_pages_xml", (String)localObject);
      if (paramInt != 1) {
        break label680;
      }
      localIntent.putExtra("sns_landing_pages_canvasid", str1);
      localIntent.putExtra("sns_landig_pages_from_source", 15);
      localIntent.putExtra("sns_landing_pages_search_extra", str2);
      localIntent.putExtra("sns_landing_pages_sessionId", str4);
      localIntent.putExtra("sns_landing_pages_ad_buffer", str5);
    }
    for (;;)
    {
      localIntent.putExtra("sns_landing_pages_need_enter_and_exit_animation", false);
      localIntent.putExtra("sns_landing_pages_no_store", j);
      localIntent.putExtra("sns_landing_pages_ad_info", str3);
      com.tencent.mm.bj.d.b(this.context, "sns", ".ui.SnsAdNativeLandingPagesPreviewUI", localIntent);
      localHashMap.put("ret", Integer.valueOf(0));
      a(parami, "doOpenCanvas:succ", localHashMap);
      GMTrace.o(20447131336704L, 152343);
      return true;
      label680:
      localIntent.putExtra("sns_landing_pages_pageid", com.tencent.mm.sdk.platformtools.bg.Sz(str1));
      localIntent.putExtra("sns_landig_pages_from_source", 13);
      localIntent.putExtra("sns_landing_pages_extra", str2);
    }
  }
  
  public final boolean a(final i parami, final a parama)
  {
    GMTrace.i(12198780862464L, 90888);
    w.i("MicroMsg.MsgHandler", "doLogin!");
    LinkedList localLinkedList = new LinkedList();
    final Object localObject = null;
    try
    {
      String str = this.rEM.Zi();
      localObject = str;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localException.getMessage() });
      }
      com.tencent.mm.y.at.wS().a(new com.tencent.mm.jsapi.a.c((String)localObject, localLinkedList, "", "", new com.tencent.mm.jsapi.a.c.a() {}), 0);
      GMTrace.o(12198780862464L, 90888);
    }
    localObject = com.tencent.mm.sdk.platformtools.bg.nl(this.rSL.Ms((String)localObject));
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      w.e("MicroMsg.MsgHandler", "appId is null!");
      a(parami, "doLogin:fail", null);
      parama.Wd();
      GMTrace.o(12198780862464L, 90888);
      return false;
    }
    return true;
  }
  
  public final boolean a(final i parami, final JsapiPermissionWrapper paramJsapiPermissionWrapper)
  {
    GMTrace.i(12181735211008L, 90761);
    if (this.kNw) {
      w.w("MicroMsg.MsgHandler", "handleMsg, MsgHandler is busy, old msg will be overrided");
    }
    if (this.rSC != null) {
      this.rSC.setClassLoader(getClass().getClassLoader());
    }
    this.rSz = parami;
    this.kNw = true;
    int i;
    final Object localObject1;
    Object localObject2;
    if (parami.type.equals("call"))
    {
      this.rSG = parami.rUU;
      i = com.tencent.mm.plugin.webview.ui.tools.a.LT(parami.rUU);
      if (-1 != i) {
        com.tencent.mm.plugin.report.service.g.ork.a(157L, i, 1L, false);
      }
      localObject1 = com.tencent.mm.protocal.c.Qc(com.tencent.mm.sdk.platformtools.bg.nl(this.rSG));
      if (localObject1 == null)
      {
        w.e("MicroMsg.MsgHandler", "unknown function = %s", new Object[] { this.rSG });
        a(parami, "system:function_not_exist", null, true, false);
        GMTrace.o(12181735211008L, 90761);
        return true;
      }
      localObject2 = ((c.g)localObject1).getName();
      if ((!this.lGH.contains(localObject2)) && (paramJsapiPermissionWrapper.zN(((c.g)localObject1).bNV()) == 0))
      {
        w.e("MicroMsg.MsgHandler", "handleMsg access denied func: %s", new Object[] { ((c.g)localObject1).getName() });
        a(parami, "system:access_denied", null, true, false);
        GMTrace.o(12181735211008L, 90761);
        return true;
      }
    }
    c.c local1;
    c localc;
    String str2;
    String str3;
    for (;;)
    {
      try
      {
        local1 = new c.c()
        {
          public final void a(c.a.a paramAnonymousa, String paramAnonymousString, LinkedList<bnd> paramAnonymousLinkedList, int paramAnonymousInt1, int paramAnonymousInt2)
          {
            GMTrace.i(12253541695488L, 91296);
            parami.bFO().put("baseErrorCode", Integer.valueOf(paramAnonymousInt1));
            parami.bFO().put("jsapiErrorCode", Integer.valueOf(paramAnonymousInt2));
            paramAnonymousLinkedList = paramAnonymousa;
            if (g.this.MA(parami.rUU))
            {
              w.i("MicroMsg.MsgHandler", "current jsapi(%s) invoked is came from menu event.(original retCode : %s)", new Object[] { parami.rUU, paramAnonymousa });
              paramAnonymousLinkedList = c.a.a.rRM;
            }
            w.i("MicroMsg.MsgHandler", "onJSVerifyEnd, put webviewID = %d", new Object[] { Integer.valueOf(g.this.eQd) });
            parami.nSp.put("webview_instance_id", Integer.valueOf(g.this.eQd));
            if ((!com.tencent.mm.sdk.platformtools.bg.nm(localObject1.bNU())) && (!"cache".equals(localObject1.getName())) && (!"publicCache".equals(localObject1.getName())) && (!"showKeyboard".equals(localObject1.getName())) && (!"showSmileyPanel".equals(localObject1.getName()))) {
              com.tencent.mm.pluginsdk.s.lock();
            }
            boolean bool;
            if (paramAnonymousLinkedList == c.a.a.rRM)
            {
              if (parami.rUU.equals("sendAppMessage"))
              {
                jC(g.this.b(parami, paramJsapiPermissionWrapper));
                bool = true;
              }
              for (;;)
              {
                paramAnonymousa = parami.bFO().get("Internal@AsyncReport");
                if ((paramAnonymousa == null) || (!(paramAnonymousa instanceof Boolean)) || (!((Boolean)paramAnonymousa).booleanValue())) {
                  g.this.e(parami, bool);
                }
                if (!bool) {
                  g.this.a(parami, 1, paramAnonymousLinkedList.getCode());
                }
                GMTrace.o(12253541695488L, 91296);
                return;
                if (parami.rUU.equals("profile"))
                {
                  jC(g.this.o(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("shareWeibo"))
                {
                  jC(g.this.p(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("shareTimeline"))
                {
                  jC(g.this.c(parami, paramJsapiPermissionWrapper));
                  bool = true;
                }
                else if (parami.rUU.equals("adDataReport"))
                {
                  jC(g.this.q(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("streamingVideoPlay"))
                {
                  jC(g.this.r(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("addContact"))
                {
                  jC(g.this.w(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("imagePreview"))
                {
                  jC(g.this.x(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("log"))
                {
                  jC(g.this.y(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("hideOptionMenu"))
                {
                  jC(g.this.bFF());
                  bool = true;
                }
                else if (parami.rUU.equals("showOptionMenu"))
                {
                  jC(g.this.bFG());
                  bool = true;
                }
                else if (parami.rUU.equals("getNetworkType"))
                {
                  jC(g.this.z(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("closeWindow"))
                {
                  jC(g.this.A(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("getInstallState"))
                {
                  jC(g.this.H(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("scanQRCode"))
                {
                  jC(g.this.J(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("setFontSizeCallback"))
                {
                  jC(g.this.K(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("jumpToInstallUrl"))
                {
                  jC(g.this.L(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getBrandWCPayRequest"))
                {
                  jC(g.this.M(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("editAddress"))
                {
                  jC(g.this.R(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getLatestAddress"))
                {
                  jC(g.this.bFA());
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getHeadingAndPitch"))
                {
                  jC(g.this.ac(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("sendEmail"))
                {
                  jC(g.this.ad(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("addDownloadTask"))
                {
                  jC(g.this.af(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("cancelDownloadTask"))
                {
                  jC(g.this.ag(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("pauseDownloadTask"))
                {
                  jC(g.this.ah(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("resumeDownloadTask"))
                {
                  jC(g.this.e(parami, paramJsapiPermissionWrapper));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("queryDownloadTask"))
                {
                  jC(g.this.aj(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("installDownloadTask"))
                {
                  jC(g.this.ak(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openSpecificView"))
                {
                  jC(g.this.al(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("launch3rdApp"))
                {
                  jC(g.this.am(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("jumpWCMall"))
                {
                  jC(g.this.N(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("writeCommData"))
                {
                  jC(g.this.an(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openUrlByExtBrowser"))
                {
                  jC(g.this.ao(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openProductView"))
                {
                  jC(g.this.P(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openProductViewWithPid"))
                {
                  jC(g.this.Q(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getBrandWCPayBindCardRequest"))
                {
                  jC(g.this.T(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("geoLocation"))
                {
                  jC(g.this.as(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("jumpToBizProfile"))
                {
                  jC(g.this.aw(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openTimelineCheckInList"))
                {
                  jC(g.this.g(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openLocation"))
                {
                  jC(g.this.f(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("timelineCheckIn"))
                {
                  jC(g.this.e(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getBrandWCPayCreateCreditCardRequest"))
                {
                  jC(g.this.at(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("sendServiceAppMessage"))
                {
                  jC(g.this.au(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("mmsf0001"))
                {
                  jC(g.this.av(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("musicPlay"))
                {
                  jC(g.this.aB(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("connectToWiFi"))
                {
                  jC(g.this.aD(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getTransferMoneyRequest"))
                {
                  jC(g.this.U(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openWCPaySpecificView"))
                {
                  jC(g.this.W(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("chooseCard"))
                {
                  jC(g.this.ax(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("chooseInvoice"))
                {
                  jC(g.this.ay(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("batchAddCard"))
                {
                  jC(g.this.az(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("setCloseWindowConfirmDialogInfo"))
                {
                  jC(g.this.aC(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("preVerifyJSAPI"))
                {
                  jC(g.this.f(parami, paramJsapiPermissionWrapper));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("startRecord"))
                {
                  jC(g.this.bb(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("stopRecord"))
                {
                  jC(g.this.bc(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("playVoice"))
                {
                  jC(g.this.bd(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("pauseVoice"))
                {
                  jC(g.this.bf(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("stopVoice"))
                {
                  jC(g.this.be(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("uploadVoice"))
                {
                  jC(g.this.bg(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("downloadVoice"))
                {
                  jC(g.this.bh(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("chooseImage"))
                {
                  jC(g.this.aQ(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("uploadImage"))
                {
                  jC(g.this.aR(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("downloadImage"))
                {
                  jC(g.this.aS(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("hideMenuItems"))
                {
                  jC(g.this.bi(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("showMenuItems"))
                {
                  jC(g.this.bj(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("hideAllNonBaseMenuItem"))
                {
                  jC(g.this.bk(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("showAllNonBaseMenuItem"))
                {
                  jC(g.this.bl(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("checkJsApi"))
                {
                  jC(g.this.bm(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("translateVoice"))
                {
                  jC(g.this.bp(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("shareQQ"))
                {
                  jC(g.this.br(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("shareWeiboApp"))
                {
                  jC(g.this.bs(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("configWXDeviceWiFi"))
                {
                  jC(g.this.bu(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getCurrentSSID"))
                {
                  jC(g.this.aE(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getPaymentOrderRequest"))
                {
                  jC(g.this.O(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("verifyWCPayPassword"))
                {
                  jC(g.this.aa(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("startMonitoringBeacons"))
                {
                  g.this.bFz();
                  jC(g.this.a(parami, new int[0]));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("stopMonitoringBeacons"))
                {
                  g.this.bFz();
                  jC(g.this.ab(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getSendC2CMessageRequest"))
                {
                  jC(g.this.Z(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("batchViewCard"))
                {
                  jC(g.this.aA(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("connectToFreeWifi"))
                {
                  jC(g.this.bn(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("setFreeWifiOwner"))
                {
                  jC(g.this.bo(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("setPageOwner"))
                {
                  jC(g.this.bv(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getWechatVerifyTicket"))
                {
                  jC(g.this.bw(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openWXDeviceLib"))
                {
                  jC(g.this.aF(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("closeWXDeviceLib"))
                {
                  jC(g.this.aG(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("startScanWXDevice"))
                {
                  jC(g.this.aH(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("stopScanWXDevice"))
                {
                  jC(g.this.aI(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("connectWXDevice"))
                {
                  jC(g.this.aJ(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("disconnectWXDevice"))
                {
                  jC(g.this.aK(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getWXDeviceTicket"))
                {
                  jC(g.this.aL(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getWXDeviceInfos"))
                {
                  jC(g.this.aM(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("sendDataToWXDevice"))
                {
                  jC(g.this.aN(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("setSendDataDirection"))
                {
                  jC(g.this.aO(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openGameDetail"))
                {
                  jC(g.this.ap(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openGameCenter"))
                {
                  jC(g.this.aq(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("setGameDebugConfig"))
                {
                  jC(g.this.ar(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("shareQZone"))
                {
                  jC(g.this.br(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("startTempSession"))
                {
                  jC(g.this.bt(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getRecevieBizHongBaoRequest"))
                {
                  jC(g.this.by(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openMyDeviceProfile"))
                {
                  jC(g.this.bz(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("selectPedometerSource"))
                {
                  jC(g.this.bA(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getH5PrepayRequest"))
                {
                  jC(g.this.bB(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getH5TransactionRequest"))
                {
                  jC(g.this.bC(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("jumpToWXWallet"))
                {
                  jC(g.this.Y(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("scanCover"))
                {
                  jC(g.this.bx(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("nfcIsConnect"))
                {
                  jC(g.this.bD(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("nfcConnect"))
                {
                  jC(g.this.bE(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("nfcTransceive"))
                {
                  jC(g.this.bI(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("nfcBatchTransceive"))
                {
                  jC(g.this.bJ(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("nfcGetId"))
                {
                  jC(g.this.bF(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("nfcGetInfo"))
                {
                  jC(g.this.bG(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("nfcCheckState"))
                {
                  jC(g.this.bH(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("videoProxyInit"))
                {
                  jC(g.this.bK(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("videoProxyStartPlay"))
                {
                  jC(g.this.bL(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("videoProxyStopPlay"))
                {
                  jC(g.this.bM(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("videoProxySetPlayerState"))
                {
                  jC(g.this.bN(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("videoProxySetRemainTime"))
                {
                  jC(g.this.bO(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getSearchData"))
                {
                  jC(g.this.cK(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("insertSearchWAWidgetView"))
                {
                  jC(g.this.db(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("removeSearchWAWidgetView"))
                {
                  jC(g.this.dg(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("updateSearchWAWidgetView"))
                {
                  jC(g.this.dh(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getTeachSearchData"))
                {
                  jC(g.this.cH(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getSearchGuideData"))
                {
                  jC(g.this.cI(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getSearchAvatarList"))
                {
                  jC(g.this.cL(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getSearchSnsImageList"))
                {
                  jC(g.this.cM(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getSearchImageList"))
                {
                  jC(g.this.cN(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getSearchDisplayNameList"))
                {
                  jC(g.this.cO(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("startSearchItemDetailPage"))
                {
                  jC(g.this.cP(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("reportSearchStatistics"))
                {
                  jC(g.this.dn(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("reportSearchRealTimeStatistics"))
                {
                  jC(g.this.jdMethod_do(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("searchDataHasResult"))
                {
                  jC(g.this.cQ(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getSearchSuggestionData"))
                {
                  jC(g.this.cR(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openEmotionPage"))
                {
                  jC(g.this.cT(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("setSearchInputWord"))
                {
                  jC(g.this.cU(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openWeAppPage"))
                {
                  jC(g.this.dj(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("reportWeAppSearchRealtime"))
                {
                  jC(g.this.dk(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("doSearchOperation"))
                {
                  jC(g.this.cS(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("operateGameCenterMsg"))
                {
                  jC(g.this.bQ(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getWebPayCheckoutCounterRequst"))
                {
                  jC(g.this.bU(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("setSnsObjectXmlDescList"))
                {
                  jC(g.this.dl(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("clickSnsMusicPlayButton"))
                {
                  jC(g.this.dm(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("addCustomMenuItems"))
                {
                  jC(g.this.bV(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openEnterpriseChat"))
                {
                  jC(g.this.bZ(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openEnterpriseContact"))
                {
                  jC(g.this.cc(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("selectEnterpriseContact"))
                {
                  jC(g.this.cd(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("sendEnterpriseChat"))
                {
                  jC(g.this.ce(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("enterEnterpriseChat"))
                {
                  jC(g.this.ca(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getEnterpriseChat"))
                {
                  jC(g.this.cb(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("reportActionInfo"))
                {
                  jC(g.this.bS(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("showSearchOfBizHistory"))
                {
                  jC(g.this.cV(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("cache"))
                {
                  jC(g.this.bT(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("publicCache"))
                {
                  jC(g.this.bR(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("changePayActivityView"))
                {
                  jC(g.this.cf(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("scanLicence"))
                {
                  jC(g.this.I(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openWeApp"))
                {
                  jC(g.this.di(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openECard"))
                {
                  jC(g.this.X(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("enablePullDownRefresh"))
                {
                  jC(g.this.dy(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("startPullDownRefresh"))
                {
                  jC(g.this.dz(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("stopPullDownRefresh"))
                {
                  jC(g.this.dA(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("disablePullDownRefresh"))
                {
                  jC(g.this.bFL());
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("disableBounceScroll"))
                {
                  jC(g.this.dD(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("clearBounceBackground"))
                {
                  jC(g.this.dE(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("showKeyboard"))
                {
                  jC(g.this.dB(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("showSmileyPanel"))
                {
                  jC(g.this.dC(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openMapNavigateMenu"))
                {
                  jC(g.this.dH(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("setNavigationBarButtons"))
                {
                  jC(g.this.dx(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("enableFullScreen"))
                {
                  jC(g.this.dw(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("reportMiniProgramPageData"))
                {
                  jC(g.this.dr(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("setPageTitle"))
                {
                  jC(g.this.du(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("setStatusBarStyle"))
                {
                  jC(g.this.dv(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("forceUpdateWxaAttr"))
                {
                  jC(g.this.dt(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("launchMiniProgram"))
                {
                  jC(g.this.ds(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("reportIDKey"))
                {
                  jC(g.this.cg(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("quicklyAddBrandContact"))
                {
                  jC(g.this.ch(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("consumedShareCard"))
                {
                  jC(g.this.cn(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("kvReport"))
                {
                  jC(g.this.dq(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("realtimeReport"))
                {
                  jC(g.this.dG(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openUrlWithExtraWebview"))
                {
                  jC(g.this.ci(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("videoProxyPreload"))
                {
                  jC(g.this.bP(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getLocalData"))
                {
                  jC(g.this.bW(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("setLocalData"))
                {
                  jC(g.this.bX(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("clearLocalData"))
                {
                  jC(g.this.bY(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("selectSingleContact"))
                {
                  jC(g.this.cu(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("sendAppMessageToSpecifiedContact"))
                {
                  jC(g.this.cv(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("deleteAccountSuccess"))
                {
                  jC(g.this.bFH());
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("chooseVideo"))
                {
                  jC(g.this.aY(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("uploadVideo"))
                {
                  jC(g.this.ba(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("setNavigationBarColor"))
                {
                  jC(g.this.co(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openDesignerEmojiView"))
                {
                  jC(g.this.c(parami, false));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openDesignerProfile"))
                {
                  jC(g.this.d(parami, false));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openEmoticonTopicList"))
                {
                  jC(g.this.cp(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openDesignerEmojiViewLocal"))
                {
                  jC(g.this.c(parami, true));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openDesignerProfileLocal"))
                {
                  jC(g.this.d(parami, true));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openEmotionDetailViewLocal"))
                {
                  jC(g.this.cq(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openNewPage"))
                {
                  jC(g.this.cr(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getSearchEmotionData"))
                {
                  jC(g.this.cs(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("openEmotionUrl"))
                {
                  jC(g.this.ct(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("getWCPayRealnameVerify"))
                {
                  jC(g.this.cw(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("selectWalletCurrency"))
                {
                  jC(g.this.bFI());
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("operateMusicPlayer"))
                {
                  jC(g.this.dI(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getMusicPlayerState"))
                {
                  jC(g.this.dJ(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("clearWebviewCache"))
                {
                  jC(g.this.cx(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("requireSoterBiometricAuthentication"))
                {
                  jC(g.this.B(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("getSupportSoter"))
                {
                  jC(g.this.C(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("unbindBankCard"))
                {
                  jC(g.this.cy(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("setBounceBackground"))
                {
                  jC(g.this.dF(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("doExposePreparation"))
                {
                  jC(g.this.dL(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("getMsgProofItems"))
                {
                  jC(g.this.dN(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("uploadMediaFile"))
                {
                  jC(g.this.aZ(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("openSecurityView"))
                {
                  jC(g.this.dO(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("startVoipCall"))
                {
                  jC(g.this.aT(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("getOpenDeviceId"))
                {
                  jC(g.this.dP(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("getRouteUrl"))
                {
                  jC(g.this.dQ(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("idCardRealnameVerify"))
                {
                  jC(g.this.cz(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("uploadIdCardSuccess"))
                {
                  jC(g.this.cA(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("getGameCommInfo"))
                {
                  jC(g.this.cB(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("openGameRegion"))
                {
                  jC(g.this.bFJ());
                  bool = true;
                }
                else if (parami.rUU.equals("chooseIdCard"))
                {
                  jC(g.this.cC(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("showDatePickerView"))
                {
                  jC(g.this.d(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("openLuckyMoneyDetailView"))
                {
                  jC(g.this.c(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("resendRemittanceMsg"))
                {
                  jC(g.this.b(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("getLocalImgData"))
                {
                  jC(g.this.dK(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("recordVideo"))
                {
                  jC(g.this.aU(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("previewVideo"))
                {
                  jC(g.this.aV(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("uploadEncryptMediaFile"))
                {
                  jC(g.this.aW(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("openCustomWebview"))
                {
                  jC(g.this.cj(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("chooseMedia"))
                {
                  jC(g.this.aX(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("openLuckyMoneyHistory"))
                {
                  jC(g.this.dM(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("requestWxFacePictureVerify"))
                {
                  jC(g.this.b(parami, false));
                  bool = true;
                }
                else if (parami.rUU.equals("getWePkgAuthResult"))
                {
                  jC(g.this.s(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("getLocalWePkgInfo"))
                {
                  jC(g.this.t(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("openGameWebView"))
                {
                  jC(g.this.u(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("launchApplication"))
                {
                  jC(g.this.cD(parami));
                  bool = true;
                }
                else if ((parami.rUU.equals("login")) || (parami.rUU.equals("authorize")))
                {
                  jC(g.this.cE(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("requestWxFacePictureVerifyUnionVideo"))
                {
                  jC(g.this.b(parami, true));
                  bool = true;
                }
                else if (parami.rUU.equals("checkIsSupportFaceDetect"))
                {
                  jC(g.this.D(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("operateBackgroundAudio"))
                {
                  jC(g.this.dT(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("setBackgroundAudioState"))
                {
                  jC(g.this.dS(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("getBackgroundAudioState"))
                {
                  jC(g.this.dR(parami));
                  bool = true;
                }
                else if (parami.rUU.equalsIgnoreCase("addDownloadTaskStraight"))
                {
                  jC(g.this.d(parami, paramJsapiPermissionWrapper));
                  bool = true;
                }
                else if (parami.rUU.equals("setScreenOrientation"))
                {
                  jC(g.this.ck(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("addToEmoticon"))
                {
                  jC(g.this.cl(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("shareEmoticon"))
                {
                  jC(g.this.cm(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("requestWxFaceRegisterInternal"))
                {
                  jC(g.this.E(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("requestWxFaceVerifyInternal"))
                {
                  jC(g.this.G(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("openADCanvas"))
                {
                  jC(g.this.a(parami, 0));
                  bool = true;
                }
                else if (parami.rUU.equals("openSearchCanvas"))
                {
                  jC(g.this.a(parami, 1));
                  bool = true;
                }
                else if (parami.rUU.equals("opVoteAdData"))
                {
                  jC(g.this.F(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("selectContact"))
                {
                  jC(g.this.j(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("makePhoneCall"))
                {
                  jC(g.this.i(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("setWCPayPassword"))
                {
                  jC(g.this.n(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("chooseInvoiceTitle"))
                {
                  jC(g.this.S(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("showSearchActionSheet"))
                {
                  jC(g.this.m(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("cancelSearchActionSheet"))
                {
                  jC(g.this.l(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("uxSearchOpLog"))
                {
                  jC(g.this.k(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("openSearchWAWidgetLogView"))
                {
                  jC(g.this.da(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("openBizChat"))
                {
                  jC(g.this.dX(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("tapSearchWAWidgetView"))
                {
                  jC(g.this.cZ(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("getMatchContactList"))
                {
                  jC(g.this.cY(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("openSearchWebView"))
                {
                  jC(g.this.cX(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("viewTypeChange"))
                {
                  jC(g.this.cW(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("openGameUrlWithExtraWebView"))
                {
                  jC(g.this.dY(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("requestWxVoicePrintVerifyInternal"))
                {
                  jC(g.this.dV(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("closeWindowAndGoNext"))
                {
                  jC(g.this.dW(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("invokeMiniProgramAPI"))
                {
                  jC(g.this.dp(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("openGameUrlWithExtraWebView"))
                {
                  jC(g.this.dY(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("setGameData"))
                {
                  jC(g.this.dZ(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("getGameData"))
                {
                  jC(g.this.ea(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("clearGameData"))
                {
                  jC(g.this.eb(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("handleWCPayWalletBuffer"))
                {
                  jC(g.this.V(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("reportGamePageTime"))
                {
                  jC(g.this.v(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("insertVideoPlayer"))
                {
                  jC(g.this.dc(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("updateVideoPlayer"))
                {
                  jC(g.this.dd(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("removeVideoPlayer"))
                {
                  jC(g.this.de(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("operateVideoPlayer"))
                {
                  jC(g.this.df(parami));
                  bool = true;
                }
                else if (parami.rUU.equals("getSearchHistory"))
                {
                  jC(g.this.bFK());
                  bool = true;
                }
                else
                {
                  if (!parami.rUU.equals("deleteSearchHistory")) {
                    break;
                  }
                  jC(g.this.cJ(parami));
                  bool = true;
                }
              }
              w.e("MicroMsg.MsgHandler", "unknown function = " + parami.rUU);
              g.this.a(parami, "system:function_not_exist", null);
            }
            for (;;)
            {
              jC(true);
              bool = false;
              break;
              if (paramAnonymousLinkedList == c.a.a.rRP)
              {
                w.e("MicroMsg.MsgHandler", "handleMsg access denied %s", new Object[] { localObject1.getName() });
                if (parami.rUU.equalsIgnoreCase("getBrandWCPayRequest")) {
                  com.tencent.mm.plugin.report.service.g.ork.a(157L, 1L, 1L, false);
                }
                g.this.a(parami, "system:access_denied", null);
              }
              else if (paramAnonymousLinkedList == c.a.a.rRO)
              {
                g.this.a(parami, localObject1.bNU() + ":" + paramAnonymousString, null);
              }
              else
              {
                if (com.tencent.mm.sdk.platformtools.bg.nm(localObject1.bNU()))
                {
                  g.this.kNw = false;
                  jC(false);
                  g.this.e(parami, false);
                  GMTrace.o(12253541695488L, 91296);
                  return;
                }
                if (com.tencent.mm.sdk.platformtools.bg.nm(paramAnonymousString)) {
                  g.this.a(parami, localObject1.bNU() + ":fail", null);
                } else {
                  g.this.a(parami, localObject1.bNU() + ":fail_" + paramAnonymousString, null);
                }
              }
            }
          }
          
          public final boolean bFm()
          {
            GMTrace.i(12253675913216L, 91297);
            boolean bool = this.rRR;
            GMTrace.o(12253675913216L, 91297);
            return bool;
          }
        };
        localc = this.rSL;
        str2 = this.rEM.Zi();
        i = ((c.g)localObject1).bNV();
        str3 = parami.rUU;
        if (com.tencent.mm.sdk.platformtools.bg.nm(str3))
        {
          w.e("MicroMsg.webview.JSVerifyHelper", "jsapi is null, %s", new Object[] { str2 });
          local1.a(c.a.a.rRP, null, null, 0, 0);
          bool = local1.bFm();
          GMTrace.o(12181735211008L, 90761);
          return bool;
        }
        if ((paramJsapiPermissionWrapper != null) && (!com.tencent.mm.sdk.platformtools.bg.nm(str2)) && (paramJsapiPermissionWrapper.tJT != null)) {
          break;
        }
        if (paramJsapiPermissionWrapper == null) {
          break label491;
        }
        bool = true;
        w.e("MicroMsg.webview.JSVerifyHelper", "handleJSVerify invalid argument, currentUrl = %s, jsapi = %s, %s", new Object[] { str2, str3, Boolean.valueOf(bool) });
        local1.a(c.a.a.rRN, "localParameters", null, 0, 0);
        continue;
        w.e("MicroMsg.MsgHandler", "unknown type = " + parami.type);
      }
      catch (Exception paramJsapiPermissionWrapper)
      {
        w.e("MicroMsg.MsgHandler", "handleMsg excpetion %s", new Object[] { paramJsapiPermissionWrapper.getMessage() });
        w.printErrStackTrace("MicroMsg.MsgHandler", paramJsapiPermissionWrapper, "", new Object[0]);
      }
      this.kNw = false;
      GMTrace.o(12181735211008L, 90761);
      return false;
      label491:
      boolean bool = false;
    }
    int j = paramJsapiPermissionWrapper.zN(i);
    w.i("MicroMsg.webview.JSVerifyHelper", "handleJSVerify jsApi = %s, permission pos = %d, permission = %s currentUrl = %s", new Object[] { str3, Integer.valueOf(i), Integer.valueOf(j), str2 });
    paramJsapiPermissionWrapper = (String)localc.rRI.get(str2);
    if (com.tencent.mm.sdk.platformtools.bg.nm(paramJsapiPermissionWrapper))
    {
      paramJsapiPermissionWrapper = (String)parami.nSp.get("verifyAppId");
      label579:
      localObject1 = parami.rUT;
      ((Map)localObject1).put("permissionValue", Integer.valueOf(j));
      ((Map)localObject1).put("appId", paramJsapiPermissionWrapper);
      switch (j)
      {
      }
    }
    for (;;)
    {
      label648:
      local1.a(c.a.a.rRN, "unkonwPermission_" + j, null, 0, 0);
      w.e("MicroMsg.webview.JSVerifyHelper", "unknow permission");
      break;
      local1.a(c.a.a.rRM, null, null, 0, 0);
      break;
      if (str3.equals("preVerifyJSAPI"))
      {
        local1.a(c.a.a.rRM, null, null, 0, 0);
        break;
      }
      local1.a(c.a.a.rRP, null, null, 0, 0);
      break;
      local1.a(c.a.a.rRP, null, null, 0, 0);
      break;
      localObject1 = (aiv)localc.rRH.get(str3 + str2);
      if ((localObject1 != null) && (((aiv)localObject1).tSt == 1))
      {
        local1.a(c.a.a.rRM, null, null, 0, 0);
        break;
      }
      localObject1 = (String)parami.nSp.get("verifySignature");
      Object localObject3 = (String)parami.nSp.get("verifyNonceStr");
      localObject2 = (String)parami.nSp.get("verifyTimestamp");
      String str1 = (String)parami.nSp.get("verifySignType");
      String str4 = (String)parami.nSp.get("scope");
      Object localObject4 = (String)parami.nSp.get("addrSign");
      w.i("MicroMsg.webview.JSVerifyHelper", "handleJSVerify addrSign = %s, signature = %s", new Object[] { localObject4, localObject1 });
      i = 0;
      if ((com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) && (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject4)))
      {
        i = 1;
        paramJsapiPermissionWrapper = (String)parami.nSp.get("appId");
        localObject3 = (String)parami.nSp.get("addrSign");
        str1 = (String)parami.nSp.get("signType");
        localObject1 = (String)parami.nSp.get("timeStamp");
        localObject2 = (String)parami.nSp.get("nonceStr");
      }
      for (;;)
      {
        localObject4 = null;
        JSONObject localJSONObject = i.a.ad(parami.nSp);
        if (localJSONObject != null) {
          localObject4 = localJSONObject.toString().getBytes();
        }
        if (j == 4)
        {
          paramJsapiPermissionWrapper = new com.tencent.mm.plugin.webview.model.l(local1, str2, paramJsapiPermissionWrapper, str3, (String)localObject1, (String)localObject2, (String)localObject3, str1, (byte[])localObject4, i, str4, localc.rEk);
          com.tencent.mm.y.at.wS().a(1095, localc);
          com.tencent.mm.y.at.wS().a(paramJsapiPermissionWrapper, 0);
          break;
          if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) {
            break label1240;
          }
          i = 2;
          localObject4 = localObject1;
          localObject1 = localObject2;
          localObject2 = localObject3;
          localObject3 = localObject4;
          continue;
        }
        if (j != 3) {
          break label648;
        }
        paramJsapiPermissionWrapper = new com.tencent.mm.plugin.webview.model.n(local1, str2, paramJsapiPermissionWrapper, str3, (String)localObject1, (String)localObject2, (String)localObject3, str1, (byte[])localObject4, localc.rEk);
        com.tencent.mm.y.at.wS().a(1094, localc);
        com.tencent.mm.y.at.wS().a(paramJsapiPermissionWrapper, 0);
        break;
        label1240:
        localObject4 = localObject1;
        localObject1 = localObject2;
        localObject2 = localObject3;
        localObject3 = localObject4;
      }
      break label579;
    }
  }
  
  public final boolean a(final i parami, final int... paramVarArgs)
  {
    GMTrace.i(12185359089664L, 90788);
    if (rSK != -1)
    {
      this.rSz = yl(rSK).rSz;
      this.rEM = yl(rSK).rEM;
    }
    Object localObject1 = BluetoothAdapter.getDefaultAdapter();
    if (Build.VERSION.SDK_INT < 18)
    {
      a(parami, "startMonitoringBeacons:system unsupported", null);
      GMTrace.o(12185359089664L, 90788);
      return true;
    }
    label183:
    label243:
    label252:
    String str;
    if ((localObject1 != null) && (((BluetoothAdapter)localObject1).getState() != 12))
    {
      if (((BluetoothAdapter)localObject1).getState() == 10) {
        a(parami, "startMonitoringBeacons:bluetooth power off", null);
      }
    }
    else
    {
      if (paramVarArgs.length == 0)
      {
        if (!this.rSX.isProviderEnabled("gps")) {
          a(parami, "startMonitoringBeacons:location service disable", null);
        }
        paramVarArgs = (SensorManager)rSJ.getSystemService("sensor");
        paramVarArgs.registerListener(this.rTb, paramVarArgs.getDefaultSensor(3), 0);
      }
      if (this.rTa) {
        break label435;
      }
      this.rTa = true;
      a(parami, "startMonitoringBeacons:ok", null);
      if ((parami != null) && (parami.nSp != null))
      {
        localObject1 = parami.nSp.get("uuid");
        paramVarArgs = parami.nSp.get("url");
        localObject2 = parami.nSp.get("ticket");
        if (paramVarArgs == null) {
          break label447;
        }
        paramVarArgs = paramVarArgs.toString();
        if (localObject1 == null) {
          break label454;
        }
        localObject1 = localObject1.toString();
        str = com.tencent.mm.sdk.platformtools.bg.nl(this.rSL.Ms(paramVarArgs));
        if (localObject2 == null) {
          break label461;
        }
      }
    }
    label435:
    label447:
    label454:
    label461:
    for (Object localObject2 = localObject2.toString();; localObject2 = "")
    {
      com.tencent.mm.plugin.report.service.g.ork.i(12101, new Object[] { str, paramVarArgs, this.rSY, this.rSZ, localObject2 });
      new StringBuilder("{\"UUID\":\"").append((String)localObject1).append("\",\"Major\":0,\"Minor\":0").append("}");
      paramVarArgs = new com.tencent.mm.plugin.webview.model.x(paramVarArgs, str, (String)localObject2);
      com.tencent.mm.y.at.wS().a(1702, new com.tencent.mm.ad.e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(19437679804416L, 144822);
          if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
          {
            paramAnonymousString = (bna)paramVarArgs.gMj.gtD.gtK;
            if (paramAnonymousString.kBk != 0) {
              break label290;
            }
            paramAnonymousString = paramAnonymousString.uXd;
            if ((paramAnonymousString != null) && (!paramAnonymousString.isEmpty())) {
              paramAnonymousString = paramAnonymousString.iterator();
            }
            while (paramAnonymousString.hasNext())
            {
              String str = (String)paramAnonymousString.next();
              paramAnonymousk = g.this;
              BluetoothAdapter localBluetoothAdapter = BluetoothAdapter.getDefaultAdapter();
              if ((Build.VERSION.SDK_INT >= 18) && (localBluetoothAdapter != null))
              {
                com.tencent.mm.sdk.b.a.vgX.b(paramAnonymousk.oQM);
                str = com.tencent.mm.sdk.platformtools.bg.nl(str);
                paramAnonymousk.rSS.put(str, str);
                w.i("MicroMsg.MsgHandler", "[MsgHandler][doStartIBeaconRange]op=true,iBeacon = %s", new Object[] { str });
                paramAnonymousk = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).edit();
                paramAnonymousk.putBoolean("isNewScanning", true);
                paramAnonymousk.commit();
                if (com.tencent.mm.y.at.AU())
                {
                  com.tencent.mm.y.at.AR();
                  com.tencent.mm.y.c.xh().a(w.a.vsS, Boolean.valueOf(true));
                }
                paramAnonymousk = new dj();
                paramAnonymousk.eEZ.eFb = str;
                paramAnonymousk.eEZ.eEY = true;
                com.tencent.mm.sdk.b.a.vgX.m(paramAnonymousk);
                continue;
                g.this.a(parami, "startMonitoringBeacons:no uuids", null);
              }
            }
          }
          for (;;)
          {
            com.tencent.mm.y.at.wS().b(1702, this);
            GMTrace.o(19437679804416L, 144822);
            return;
            label290:
            g.this.a(parami, "startMonitoringBeacons:system error", null);
            w.i("MicroMsg.MsgHandler", "verify beacon js permission err:%s", new Object[] { paramAnonymousString.kBl });
          }
        }
      });
      com.tencent.mm.y.at.wS().a(paramVarArgs, 0);
      GMTrace.o(12185359089664L, 90788);
      return true;
      a(parami, "startMonitoringBeacons:bluetooth state unknown", null);
      break;
      a(parami, "startMonitoringBeacons:already started", null);
      break label183;
      paramVarArgs = "";
      break label243;
      localObject1 = "";
      break label252;
    }
  }
  
  public final boolean a(com.tencent.mm.pluginsdk.model.app.f paramf, String paramString1, String paramString2, String paramString3, String paramString4, String paramString5, String paramString6, String paramString7)
  {
    GMTrace.i(12199451951104L, 90893);
    if (this.eLU == null)
    {
      w.w("MicroMsg.MsgHandler", "doSendAppMsg: but appmsg is null");
      GMTrace.o(12199451951104L, 90893);
      return false;
    }
    com.tencent.mm.ao.n.IY();
    Object localObject1 = com.tencent.mm.ao.b.hC(paramString3);
    if ((localObject1 != null) && (!((Bitmap)localObject1).isRecycled()))
    {
      w.i("MicroMsg.MsgHandler", "thumb image is not null");
      localObject2 = new ByteArrayOutputStream();
      ((Bitmap)localObject1).compress(Bitmap.CompressFormat.PNG, 100, (OutputStream)localObject2);
      this.eLU.thumbData = ((ByteArrayOutputStream)localObject2).toByteArray();
    }
    localObject1 = new oj();
    ((oj)localObject1).eTm.eLU = this.eLU;
    ((oj)localObject1).eTm.appId = paramString1;
    Object localObject2 = ((oj)localObject1).eTm;
    if (paramf == null)
    {
      paramf = "";
      ((oj.a)localObject2).appName = paramf;
      ((oj)localObject1).eTm.toUser = paramString2;
      ((oj)localObject1).eTm.eTn = 2;
      if (!com.tencent.mm.sdk.platformtools.bg.nm(paramString4)) {
        break label651;
      }
      ((oj)localObject1).eTm.eTq = null;
    }
    for (;;)
    {
      try
      {
        paramf = this.rSC.getString("key_snsad_statextstr");
        ((oj)localObject1).eTm.eTv = paramf;
        ((oj)localObject1).eTm.eTr = this.rEM.bDg();
        paramString4 = this.rEM.d(18, null);
        if (paramString4 != null)
        {
          paramString5 = ((oj)localObject1).eTm;
          localObject2 = com.tencent.mm.sdk.platformtools.bg.nl(paramString4.getString("KPublisherId"));
          paramString5.eTu = ((String)localObject2);
          paramString5 = com.tencent.mm.y.u.gy((String)localObject2);
          localObject2 = com.tencent.mm.y.u.Av().p(paramString5, true);
          ((u.b)localObject2).o("sendAppMsgScene", Integer.valueOf(2));
          ((u.b)localObject2).o("preChatName", paramString4.getString("preChatName"));
          ((u.b)localObject2).o("preMsgIndex", Integer.valueOf(paramString4.getInt("preMsgIndex")));
          ((u.b)localObject2).o("prePublishId", paramString4.getString("prePublishId"));
          ((u.b)localObject2).o("preUsername", paramString4.getString("preUsername"));
          ((u.b)localObject2).o("getA8KeyScene", Integer.valueOf(paramString4.getInt("getA8KeyScene")));
          ((u.b)localObject2).o("referUrl", paramString4.getString("referUrl"));
          if (!com.tencent.mm.sdk.platformtools.bg.nm(paramf)) {
            ((u.b)localObject2).o("adExtStr", paramf);
          }
          ((oj)localObject1).eTm.eDA = paramString5;
        }
        paramf = this.rEM.Zi();
        ((oj)localObject1).eTm.eTs = paramf;
        ((oj)localObject1).eTm.eTt = this.rSL.Ms(paramf);
      }
      catch (Exception paramf)
      {
        boolean bool;
        label651:
        w.e("MicroMsg.MsgHandler", "init bunddata failed : %s", new Object[] { paramf.getMessage() });
        continue;
        i = 3;
        continue;
      }
      bool = com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      if (!com.tencent.mm.sdk.platformtools.bg.nm(paramString6))
      {
        paramf = new ol();
        paramf.eTx.eTy = paramString2;
        paramf.eTx.content = paramString6;
        paramf.eTx.type = com.tencent.mm.y.s.go(paramString2);
        paramf.eTx.flags = 0;
        com.tencent.mm.sdk.b.a.vgX.m(paramf);
      }
      if (bool) {}
      try
      {
        if (this.rEM != null)
        {
          paramf = this.rEM.d(85, null);
          if (!com.tencent.mm.y.s.eb(paramString2)) {
            continue;
          }
          i = 2;
          a(paramString1, paramString3, i, paramf);
        }
      }
      catch (RemoteException paramf)
      {
        int i;
        w.e("MicroMsg.MsgHandler", "invokeAsResult : %s", new Object[] { paramf });
        continue;
      }
      if (!com.tencent.mm.sdk.platformtools.bg.nm(paramString7)) {
        com.tencent.mm.plugin.report.service.g.ork.i(10424, new Object[] { Integer.valueOf(49), Integer.valueOf(128), paramString7 });
      }
      GMTrace.o(12199451951104L, 90893);
      return bool;
      paramf = paramf.field_appName;
      break;
      ((oj)localObject1).eTm.eTo = paramString4;
      ((oj)localObject1).eTm.eTp = paramString5;
    }
  }
  
  public final boolean aA(i parami)
  {
    GMTrace.i(16072304492544L, 119748);
    w.i("MicroMsg.MsgHandler", "doBatchViewCard JSOAUTH");
    String str = (String)parami.nSp.get("card_list");
    parami = (String)parami.nSp.get("tempalate_id");
    Intent localIntent = new Intent();
    localIntent.putExtra("card_list", str);
    localIntent.putExtra("key_template_id", parami);
    localIntent.putExtra("key_from_scene", 7);
    if ((this.context instanceof MMActivity))
    {
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.a(this.context, "card", ".ui.CardViewEntranceUI", localIntent, 23, false);
    }
    this.kNw = false;
    GMTrace.o(16072304492544L, 119748);
    return true;
  }
  
  public final boolean aB(i parami)
  {
    GMTrace.i(16072438710272L, 119749);
    String str2 = (String)parami.nSp.get("title");
    String str3 = (String)parami.nSp.get("singer");
    String str4 = (String)parami.nSp.get("epname");
    String str1 = (String)parami.nSp.get("coverImgUrl");
    String str5 = (String)parami.nSp.get("dataUrl");
    String str6 = (String)parami.nSp.get("lowbandUrl");
    String str7 = (String)parami.nSp.get("webUrl");
    String str8 = (String)parami.nSp.get("appId");
    if (str1 == null) {
      str1 = "";
    }
    for (;;)
    {
      k.a(parami.rUT, false, null, str8);
      w.i("MicroMsg.MsgHandler", "title : %s, singer : %s, epName : %s, coverImgUrl : %s, dataUrl : %s, lowbandUrl : %s, webUrl : %s, appid : %s", new Object[] { str2, str3, str4, str1, str5, str6, str7, str8 });
      if ((com.tencent.mm.sdk.platformtools.bg.nm(str2)) || (com.tencent.mm.sdk.platformtools.bg.nm(str3)) || (com.tencent.mm.sdk.platformtools.bg.nm(str4)) || (com.tencent.mm.sdk.platformtools.bg.nm(str1)) || (com.tencent.mm.sdk.platformtools.bg.nm(str6)) || (com.tencent.mm.sdk.platformtools.bg.nm(str5)) || (com.tencent.mm.sdk.platformtools.bg.nm(str7))) {
        a(parami, "playMusic:fail", null);
      }
      for (;;)
      {
        GMTrace.o(16072438710272L, 119749);
        return true;
        com.tencent.mm.at.b.JO();
        com.tencent.mm.at.a.a locala = (com.tencent.mm.at.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.at.a.a.class);
        String str9 = str5.hashCode();
        String str10 = com.tencent.mm.compatible.util.e.ghz;
        StringBuilder localStringBuilder = new StringBuilder();
        com.tencent.mm.y.at.AR();
        com.tencent.mm.at.b.b(locala.a(7, str1, str2, str3, str7, str6, str5, str9, str10, com.tencent.mm.y.c.yU() + str1.hashCode(), str4, str8));
        a(parami, "playMusic:ok", null);
      }
    }
  }
  
  public final void aC(int paramInt, String paramString)
  {
    GMTrace.i(19441437900800L, 144850);
    w.i("MicroMsg.MsgHandler", "onSearchImageListReady ret %d data %s", new Object[] { Integer.valueOf(paramInt), paramString });
    Bundle localBundle = new Bundle();
    localBundle.putInt("fts_key_ret", paramInt);
    localBundle.putString("fts_key_data", paramString);
    try
    {
      if (this.rEM != null) {
        this.rEM.m(120, localBundle);
      }
      GMTrace.o(19441437900800L, 144850);
      return;
    }
    catch (RemoteException paramString)
    {
      w.w("MicroMsg.MsgHandler", "onSearchImageListReady exception" + paramString.getMessage());
      GMTrace.o(19441437900800L, 144850);
    }
  }
  
  public final boolean aC(i parami)
  {
    GMTrace.i(12186835484672L, 90799);
    String str1 = (String)parami.nSp.get("switch");
    String str2 = (String)parami.nSp.get("title_cn");
    String str3 = (String)parami.nSp.get("title_eng");
    String str4 = (String)parami.nSp.get("ok_cn");
    String str5 = (String)parami.nSp.get("ok_eng");
    String str6 = (String)parami.nSp.get("cancel_cn");
    String str7 = (String)parami.nSp.get("cancel_eng");
    w.i("MicroMsg.MsgHandler", "doSetCloseWindowConfirmDialogInfo, switch value : %s, title_cn : %s, title_eng : %s, ok_cn : %s,  ok_eng : %s,  cancel_cn : %s,  cancel_eng : %s", new Object[] { str1, str2, str3, str4, str5, str6, str7 });
    Bundle localBundle = new Bundle();
    localBundle.putString("close_window_confirm_dialog_switch", str1);
    localBundle.putString("close_window_confirm_dialog_title_cn", str2);
    localBundle.putString("close_window_confirm_dialog_title_eng", str3);
    localBundle.putString("close_window_confirm_dialog_ok_cn", str4);
    localBundle.putString("close_window_confirm_dialog_ok_eng", str5);
    localBundle.putString("close_window_confirm_dialog_cancel_cn", str6);
    localBundle.putString("close_window_confirm_dialog_cancel_eng", str7);
    try
    {
      this.rEM.m(13, localBundle);
      a(parami, "setCloseWindowConfirmDialogInfo:ok", null);
      GMTrace.o(12186835484672L, 90799);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "doSetCloseWindowConfirmDialogInfo invoke callback failed : %s", new Object[] { localRemoteException.getMessage() });
      }
    }
  }
  
  public final boolean aD(i parami)
  {
    final boolean bool = false;
    GMTrace.i(16072572928000L, 119750);
    final String str1 = (String)parami.nSp.get("ssid");
    final String str2 = (String)parami.nSp.get("password");
    String str3 = (String)parami.nSp.get("type");
    String str4 = (String)parami.nSp.get("isHidden");
    w.d("MicroMsg.MsgHandler", "doConnectToWifi, ssid : %s, password : %s, encryptType : %s, hidessid : %s", new Object[] { str1, str2, str3, str4 });
    if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
    {
      w.e("MicroMsg.MsgHandler", "ssid is null");
      a(parami, "connecttowifi:failed_ssid_invalid", null);
      GMTrace.o(16072572928000L, 119750);
      return true;
    }
    final int i = com.tencent.mm.sdk.platformtools.bg.getInt(str3, 0);
    if ((i != 0) && (com.tencent.mm.sdk.platformtools.bg.nm(str2)))
    {
      w.e("MicroMsg.MsgHandler", "encrypt type, while the password is null");
      a(parami, "connecttowifi:failed_password_invalid", null);
      GMTrace.o(16072572928000L, 119750);
      return true;
    }
    if (com.tencent.mm.sdk.platformtools.bg.getInt(str4, 0) == 1) {
      bool = true;
    }
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19425734426624L, 144733);
        Intent localIntent = new Intent();
        localIntent.putExtra("free_wifi_ssid", str1);
        localIntent.putExtra("free_wifi_source", 3);
        localIntent.putExtra("free_wifi_passowrd", str2);
        localIntent.putExtra("free_wifi_hide_ssid", bool);
        localIntent.putExtra("free_wifi_encrypt_type", i);
        localIntent.addFlags(67108864);
        com.tencent.mm.bj.d.b(g.this.context, "freewifi", ".ui.FreeWifiEntryUI", localIntent);
        GMTrace.o(19425734426624L, 144733);
      }
    });
    a(parami, "connecttowifi:ok", null);
    GMTrace.o(16072572928000L, 119750);
    return true;
  }
  
  public final boolean aE(i parami)
  {
    GMTrace.i(12187103920128L, 90801);
    HashMap localHashMap = new HashMap();
    try
    {
      dc localdc = new dc();
      localdc.eEC.eEt = true;
      com.tencent.mm.sdk.b.a.vgX.m(localdc);
      if (localdc.eED.eEu)
      {
        localHashMap.put("currentSSID", localdc.eED.eEE);
        a(parami, "getCurrentSSID:ok", localHashMap);
      }
      for (;;)
      {
        GMTrace.o(12187103920128L, 90801);
        return true;
        localHashMap.put("err_desc", "not on wifi");
        a(parami, "getCurrentSSID:fail", localHashMap);
      }
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MsgHandler", "getCurrentSSID:fail");
      localHashMap.put("err_desc", "not on wifi");
      a(parami, "getCurrentSSID:fail", localHashMap);
      GMTrace.o(12187103920128L, 90801);
    }
  }
  
  public final boolean aF(i parami)
  {
    GMTrace.i(12187238137856L, 90802);
    int i = bDx();
    int j = aGs();
    Object localObject1 = bFC();
    w.i("MicroMsg.MsgHandler", "Key Scene(%d)", new Object[] { Integer.valueOf(j) });
    if (j == 27)
    {
      this.rSD = ((String)parami.nSp.get("brandUserName"));
      w.i("MicroMsg.MsgHandler", "BrandUserName from shake(%s)", new Object[] { this.rSD });
    }
    Object localObject3;
    do
    {
      do
      {
        do
        {
          do
          {
            localObject3 = aP(parami);
            w.i("MicroMsg.MsgHandler", "srcUsername(%s)", new Object[] { localObject3 });
            if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject3)) {
              break;
            }
            a(parami, "openWXDeviceLib:fail_UsernameError", null);
            GMTrace.o(12187238137856L, 90802);
            return true;
          } while ((i == 8) || (i == -1));
          this.juZ = ((String)parami.nSp.get("brandUserName"));
          w.i("MicroMsg.MsgHandler", "BrandUserName from H5(%s)", new Object[] { this.juZ });
        } while ((com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) || (com.tencent.mm.sdk.platformtools.bg.nm(this.juZ)));
        w.i("MicroMsg.MsgHandler", "Chat name(%s)", new Object[] { localObject1 });
        localObject3 = com.tencent.mm.af.f.iK((String)localObject1);
      } while (localObject3 == null);
      localObject3 = ((com.tencent.mm.af.d)localObject3).bq(false);
    } while ((localObject3 == null) || (((d.b)localObject3).EZ() == null) || (!((d.b)localObject3).EZ().Fi()) || (((String)localObject1).equals(this.juZ)));
    a(parami, "openWXDeviceLib:fail_UsernameError", null);
    GMTrace.o(12187238137856L, 90802);
    return true;
    com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { localObject3, "openWXDeviceLib" });
    localObject1 = "";
    if (parami.nSp.containsKey("connType")) {
      localObject1 = (String)parami.nSp.get("connType");
    }
    Object localObject4;
    Object localObject2;
    if (((String)localObject1).equalsIgnoreCase("lan"))
    {
      if (this.rSF == null) {
        this.rSF = new HashMap();
      }
      for (;;)
      {
        try
        {
          localObject1 = com.tencent.mm.plugin.webview.ui.tools.a.a.bEE();
          localObject4 = this.rEM;
          w.i("MicroMsg.webview.WebViewExDeviceLanMgr", "tryInit");
          if (((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).rNR == null)
          {
            ((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).rNR = new com.tencent.mm.plugin.webview.ui.tools.a.a.a((com.tencent.mm.plugin.webview.stub.e)localObject4, (String)localObject3);
            com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).rNR.rNW);
            com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).rNR.rNX);
            com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).rNR.rNZ);
            com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).rNR.rNY);
            com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).rNR.rOa);
          }
          localObject4 = new dv();
          ((dv)localObject4).eFz.eEt = true;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject4);
          ((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).hasInit = true;
          ((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).eEs = ((String)localObject3);
          ((com.tencent.mm.plugin.webview.ui.tools.a.a)localObject1).rNT = null;
          com.tencent.mm.pluginsdk.ui.tools.r.a(com.tencent.mm.plugin.webview.ui.tools.a.a.bEE());
          if (am.isWifi(this.context))
          {
            localObject1 = "on";
            localObject3 = new HashMap();
            ((HashMap)localObject3).put("minVersion", Integer.valueOf(1));
            ((HashMap)localObject3).put("maxVersion", Integer.valueOf(1));
            ((HashMap)localObject3).put("lanState", localObject1);
            a(parami, "openWXDeviceLib:ok", (Map)localObject3);
            GMTrace.o(12187238137856L, 90802);
            return true;
          }
        }
        catch (Exception localException1)
        {
          w.e("MicroMsg.MsgHandler", "openWXDeviceLib failed : %s", new Object[] { localException1.getMessage() });
          a(parami, "openWXDeviceLib:fail_exception", null);
          GMTrace.o(12187238137856L, 90802);
          return true;
        }
        localObject2 = "off";
      }
    }
    if (this.rSE == null) {
      this.rSE = new HashMap();
    }
    for (;;)
    {
      try
      {
        localObject2 = com.tencent.mm.plugin.webview.ui.tools.a.b.bEH();
        localObject4 = this.rEM;
        w.i("MicroMsg.webview.WebViewExDeviceMgr", "tryInit");
        if (((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).rOc == null)
        {
          ((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).rOc = new com.tencent.mm.plugin.webview.ui.tools.a.b.a((com.tencent.mm.plugin.webview.stub.e)localObject4, (String)localObject3);
          com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).rOc.rOg);
          com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).rOc.rOh);
          com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).rOc.rOi);
          com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).rOc.rNW);
          com.tencent.mm.sdk.b.a.vgX.b(((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).rOc.oQN);
        }
        localObject4 = new dp();
        ((dp)localObject4).eFs.op = 1;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject4);
        ((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).hasInit = true;
        ((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).eEs = ((String)localObject3);
        ((com.tencent.mm.plugin.webview.ui.tools.a.b)localObject2).rNT = null;
        com.tencent.mm.pluginsdk.ui.tools.r.a(com.tencent.mm.plugin.webview.ui.tools.a.b.bEH());
        localObject3 = BluetoothAdapter.getDefaultAdapter();
        if (localObject3 == null)
        {
          localObject2 = "unknow";
          boolean bool = com.tencent.mm.sdk.platformtools.ab.getContext().getPackageManager().hasSystemFeature("android.hardware.bluetooth_le");
          w.i("MicroMsg.webview.ExDeviceBluetoothUtil", "isBLESupported, ret = %b", new Object[] { Boolean.valueOf(bool) });
          localObject3 = new HashMap();
          ((HashMap)localObject3).put("minVersion", Integer.valueOf(1));
          ((HashMap)localObject3).put("maxVersion", Integer.valueOf(1));
          ((HashMap)localObject3).put("bluetoothState", localObject2);
          if (!bool) {
            break label1143;
          }
          localObject2 = "yes";
          ((HashMap)localObject3).put("isSupportBLE", localObject2);
          if (i == 1) {
            ((HashMap)localObject3).put("OS", "android");
          }
          a(parami, "openWXDeviceLib:ok", (Map)localObject3);
        }
      }
      catch (Exception localException2)
      {
        w.e("MicroMsg.MsgHandler", "openWXDeviceLib failed : %s", new Object[] { localException2.getMessage() });
        a(parami, "openWXDeviceLib:fail_exception", null);
        GMTrace.o(12187238137856L, 90802);
        return true;
      }
      String str = "unknow";
      switch (((BluetoothAdapter)localObject3).getState())
      {
      default: 
        break;
      case 10: 
        str = "off";
        break;
      case 12: 
        str = "on";
        break;
      case 11: 
        str = "resetting";
        continue;
        label1143:
        str = "no";
      }
    }
  }
  
  public final boolean aG(i parami)
  {
    GMTrace.i(12187372355584L, 90803);
    String str1 = "";
    if (parami.nSp.containsKey("connType")) {
      str1 = (String)parami.nSp.get("connType");
    }
    if (str1.equalsIgnoreCase("lan")) {}
    for (;;)
    {
      try
      {
        str1 = aP(parami);
        com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { str1, "closeWXDeviceLib" });
        com.tencent.mm.plugin.webview.ui.tools.a.a.bEE().bEF();
        a(parami, "closeWXDeviceLib:ok", null);
        GMTrace.o(12187372355584L, 90803);
        return true;
      }
      catch (Exception localException1)
      {
        w.e("MicroMsg.MsgHandler", "closeWXDeviceLib failed : %s", new Object[] { localException1.getMessage() });
        a(parami, "closeWXDeviceLib:fail_exception", null);
        GMTrace.o(12187372355584L, 90803);
        return true;
      }
      try
      {
        String str2 = aP(parami);
        com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { str2, "closeWXDeviceLib" });
        com.tencent.mm.plugin.webview.ui.tools.a.b.bEH().bEF();
      }
      catch (Exception localException2)
      {
        w.e("MicroMsg.MsgHandler", "closeWXDeviceLib failed : %s", new Object[] { localException2.getMessage() });
        a(parami, "closeWXDeviceLib:fail_exception", null);
        GMTrace.o(12187372355584L, 90803);
      }
    }
    return true;
  }
  
  public int aGs()
  {
    j = 0;
    GMTrace.i(16925123936256L, 126102);
    i = j;
    try
    {
      if (this.rEM != null)
      {
        Bundle localBundle = this.rEM.d(25, null);
        i = j;
        if (localBundle != null) {
          i = localBundle.getInt("scene");
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "invokeAsResult error.%s", new Object[] { localRemoteException });
        i = j;
      }
    }
    GMTrace.o(16925123936256L, 126102);
    return i;
  }
  
  public final void aH(String paramString, boolean paramBoolean)
  {
    GMTrace.i(12201196781568L, 90906);
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_json_data", paramString);
    localBundle.putBoolean("fts_key_new_query", paramBoolean);
    try
    {
      if (this.rEM != null) {
        this.rEM.m(119, localBundle);
      }
      GMTrace.o(12201196781568L, 90906);
      return;
    }
    catch (RemoteException paramString)
    {
      w.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + paramString.getMessage());
      GMTrace.o(12201196781568L, 90906);
    }
  }
  
  public final boolean aH(i parami)
  {
    GMTrace.i(12187506573312L, 90804);
    Object localObject = "";
    if (parami.nSp.containsKey("connType")) {
      localObject = (String)parami.nSp.get("connType");
    }
    if (((String)localObject).equalsIgnoreCase("lan")) {
      if (!com.tencent.mm.plugin.webview.ui.tools.a.a.bEE().hasInit)
      {
        w.e("MicroMsg.MsgHandler", "startScanWXDevice not init");
        a(parami, "startScanWXDevice:fail_notInit", null);
        GMTrace.o(12187506573312L, 90804);
        return true;
      }
    }
    for (;;)
    {
      try
      {
        localObject = aP(parami);
        w.i("MicroMsg.MsgHandler", "srcUsername(%s)", new Object[] { localObject });
        com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { localObject, "startScanWXDevice" });
        if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
        {
          a(parami, "startScanWXDevice:fail_UsernameError", null);
          GMTrace.o(12187506573312L, 90804);
          return true;
        }
        localObject = new em();
        ((em)localObject).eGj.eEt = true;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        com.tencent.mm.plugin.webview.ui.tools.a.a.bEE().rNV = true;
        a(parami, "startScanWXDevice:ok", null);
        GMTrace.o(12187506573312L, 90804);
        return true;
      }
      catch (Exception localException1)
      {
        w.e("MicroMsg.MsgHandler", "startScanWXDevice failed : %s", new Object[] { localException1.getMessage() });
        a(parami, "startScanWXDevice:fail_exception", null);
        GMTrace.o(12187506573312L, 90804);
        return true;
      }
      if ((com.tencent.mm.compatible.util.f.et(23)) && (!((LocationManager)this.context.getSystemService("location")).isProviderEnabled("gps")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0")) && (!Build.VERSION.RELEASE.equalsIgnoreCase("6.0.0")))
      {
        w.d("MicroMsg.MsgHandler", "Android version realse code: %s", new Object[] { Build.VERSION.RELEASE });
        w.e("MicroMsg.MsgHandler", "ScannerInThisAndroidVersionRequireGPSServiceOn");
        a(parami, "startScanWXDevice:fail_ThisAndroidVersionRequireGPSServiceOn", null);
        GMTrace.o(12187506573312L, 90804);
        return true;
      }
      if (!com.tencent.mm.plugin.webview.ui.tools.a.b.bEH().hasInit)
      {
        w.e("MicroMsg.MsgHandler", "startScanWXDevice not init");
        a(parami, "startScanWXDevice:fail_notInit", null);
        GMTrace.o(12187506573312L, 90804);
        return true;
      }
      for (;;)
      {
        String str2;
        dw localdw;
        try
        {
          String str1 = aP(parami);
          str2 = (String)parami.nSp.get("btVersion");
          w.i("MicroMsg.MsgHandler", "BtVersion(%s), srcUsername(%s)", new Object[] { str2, str1 });
          com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { str1, "startScanWXDevice" });
          if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
          {
            a(parami, "startScanWXDevice:fail_UsernameError", null);
            GMTrace.o(12187506573312L, 90804);
            return true;
          }
          localdw = new dw();
          localdw.eFA.eEt = true;
          localdw.eFA.eEs = str1;
          if (com.tencent.mm.sdk.platformtools.bg.nl(str2).equals("ble"))
          {
            localdw.eFA.eFC = 0;
            com.tencent.mm.plugin.webview.ui.tools.a.b.bEH().rOe = localdw.eFA.eFC;
            com.tencent.mm.sdk.b.a.vgX.m(localdw);
            if (!localdw.eFB.eEu) {
              break label658;
            }
            com.tencent.mm.plugin.webview.ui.tools.a.b.bEH().rNV = true;
            a(parami, "startScanWXDevice:ok", null);
          }
        }
        catch (Exception localException2)
        {
          w.e("MicroMsg.MsgHandler", "startScanWXDevice failed : %s", new Object[] { localException2.getMessage() });
          a(parami, "startScanWXDevice:fail_exception", null);
          GMTrace.o(12187506573312L, 90804);
          return true;
        }
        if (com.tencent.mm.sdk.platformtools.bg.nl(str2).equals("bc")) {
          localdw.eFA.eFC = 1;
        }
      }
      label658:
      a(parami, "startScanWXDevice:fail", null);
    }
  }
  
  public final boolean aI(i parami)
  {
    GMTrace.i(12187640791040L, 90805);
    Object localObject = "";
    if (parami.nSp.containsKey("connType")) {
      localObject = (String)parami.nSp.get("connType");
    }
    if (((String)localObject).equalsIgnoreCase("lan")) {
      if (!com.tencent.mm.plugin.webview.ui.tools.a.a.bEE().hasInit)
      {
        w.e("MicroMsg.MsgHandler", "stopScanWXDevice not init");
        a(parami, "stopScanWXDevice:fail_notInit", null);
        GMTrace.o(12187640791040L, 90805);
        return true;
      }
    }
    for (;;)
    {
      try
      {
        localObject = aP(parami);
        com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { localObject, "stopScanWXDevice" });
        if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
        {
          a(parami, "stopScanWXDevice:fail_UsernameError", null);
          GMTrace.o(12187640791040L, 90805);
          return true;
        }
        localObject = new em();
        ((em)localObject).eGj.eEt = false;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        com.tencent.mm.plugin.webview.ui.tools.a.a.bEE().rNV = false;
        a(parami, "stopScanWXDevice:ok", null);
        GMTrace.o(12187640791040L, 90805);
        return true;
      }
      catch (Exception localException1)
      {
        w.printErrStackTrace("MicroMsg.MsgHandler", localException1, "", new Object[0]);
        w.e("MicroMsg.MsgHandler", "stopScanWXDevice failed : %s", new Object[] { localException1.getMessage() });
        a(parami, "stopScanWXDevice:fail_exception", null);
        GMTrace.o(12187640791040L, 90805);
        return true;
      }
      if (!com.tencent.mm.plugin.webview.ui.tools.a.b.bEH().hasInit)
      {
        w.e("MicroMsg.MsgHandler", "stopScanWXDevice not init");
        a(parami, "stopScanWXDevice:fail_notInit", null);
        GMTrace.o(12187640791040L, 90805);
        return true;
      }
      try
      {
        String str = aP(parami);
        com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { str, "stopScanWXDevice" });
        if (com.tencent.mm.sdk.platformtools.bg.nm(str))
        {
          a(parami, "stopScanWXDevice:fail_UsernameError", null);
          GMTrace.o(12187640791040L, 90805);
          return true;
        }
        dw localdw = new dw();
        localdw.eFA.eEt = false;
        localdw.eFA.eEs = str;
        localdw.eFA.eFC = com.tencent.mm.plugin.webview.ui.tools.a.b.bEH().rOe;
        com.tencent.mm.sdk.b.a.vgX.m(localdw);
        if (localdw.eFB.eEu)
        {
          com.tencent.mm.plugin.webview.ui.tools.a.b.bEH().rNV = false;
          a(parami, "stopScanWXDevice:ok", null);
        }
      }
      catch (Exception localException2)
      {
        w.printErrStackTrace("MicroMsg.MsgHandler", localException2, "", new Object[0]);
        w.e("MicroMsg.MsgHandler", "stopScanWXDevice failed : %s", new Object[] { localException2.getMessage() });
        a(parami, "stopScanWXDevice:fail_exception", null);
        GMTrace.o(12187640791040L, 90805);
        return true;
      }
      w.e("MicroMsg.MsgHandler", "stopScanWXDevice fail");
      a(parami, "stopScanWXDevice:fail", null);
    }
  }
  
  public final boolean aJ(i parami)
  {
    GMTrace.i(12187775008768L, 90806);
    String str1 = "";
    if (parami.nSp.containsKey("connType")) {
      str1 = (String)parami.nSp.get("connType");
    }
    String str3;
    if (str1.equalsIgnoreCase("lan"))
    {
      if (!com.tencent.mm.plugin.webview.ui.tools.a.a.bEE().hasInit)
      {
        w.e("MicroMsg.MsgHandler", "connectWXDevice not init");
        a(parami, "connectWXDevice:fail_notInit", null);
        GMTrace.o(12187775008768L, 90806);
        return true;
      }
      str1 = (String)parami.nSp.get("deviceId");
      w.i("MicroMsg.MsgHandler", "doConnectWXDevice, deviceId : %s", new Object[] { str1 });
      if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
      {
        w.e("MicroMsg.MsgHandler", "deviceId is null");
        a(parami, "connectWXDevice:fail_noDeviceId", null);
        GMTrace.o(12187775008768L, 90806);
        return true;
      }
      str3 = aP(parami);
      com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { str3, "connectWXDevice" });
      if (com.tencent.mm.sdk.platformtools.bg.nm(str3))
      {
        a(parami, "connectWXDevice:fail_UsernameError", null);
        GMTrace.o(12187775008768L, 90806);
        return true;
      }
      if ((this.rSF != null) && (!this.rSF.containsKey(str3))) {
        this.rSF.put(str3, str1);
      }
    }
    for (;;)
    {
      Object localObject;
      try
      {
        localObject = new cz();
        ((cz)localObject).eEv.eEt = true;
        ((cz)localObject).eEv.eEs = str3;
        ((cz)localObject).eEv.esG = str1;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        if (((cz)localObject).eEw.eEu)
        {
          a(parami, "connectWXDevice:ok", null);
          GMTrace.o(12187775008768L, 90806);
          return true;
        }
        a(parami, "connectWXDevice:fail", null);
        continue;
        if (com.tencent.mm.plugin.webview.ui.tools.a.b.bEH().hasInit) {
          break label412;
        }
      }
      catch (Exception localException1)
      {
        w.e("MicroMsg.MsgHandler", "connectWXDevice failed : %s", new Object[] { localException1.getMessage() });
        a(parami, "connectWXDevice:fail_exception", null);
        GMTrace.o(12187775008768L, 90806);
        return true;
      }
      w.e("MicroMsg.MsgHandler", "connectWXDevice not init");
      a(parami, "connectWXDevice:fail_notInit", null);
      GMTrace.o(12187775008768L, 90806);
      return true;
      label412:
      String str2 = (String)parami.nSp.get("deviceId");
      w.i("MicroMsg.MsgHandler", "doConnectWXDevice, deviceId : %s", new Object[] { str2 });
      if (com.tencent.mm.sdk.platformtools.bg.nm(str2))
      {
        w.e("MicroMsg.MsgHandler", "deviceId is null");
        a(parami, "connectWXDevice:fail_noDeviceId", null);
        GMTrace.o(12187775008768L, 90806);
        return true;
      }
      str3 = aP(parami);
      com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { str3, "connectWXDevice" });
      if (com.tencent.mm.sdk.platformtools.bg.nm(str3))
      {
        a(parami, "connectWXDevice:fail_UsernameError", null);
        GMTrace.o(12187775008768L, 90806);
        return true;
      }
      if ((this.rSE != null) && (!this.rSE.containsValue(str2))) {
        this.rSE.put(str3, str2);
      }
      try
      {
        localObject = new cy();
        ((cy)localObject).eEq.eEt = true;
        ((cy)localObject).eEq.eEs = str3;
        ((cy)localObject).eEq.esG = str2;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        if (((cy)localObject).eEr.eEu) {
          a(parami, "connectWXDevice:ok", null);
        }
      }
      catch (Exception localException2)
      {
        w.e("MicroMsg.MsgHandler", "connectWXDevice failed : %s", new Object[] { localException2.getMessage() });
        a(parami, "connectWXDevice:fail_exception", null);
        GMTrace.o(12187775008768L, 90806);
        return true;
      }
      a(parami, "connectWXDevice:fail", null);
    }
  }
  
  public final boolean aK(i parami)
  {
    GMTrace.i(12187909226496L, 90807);
    String str1 = "";
    if (parami.nSp.containsKey("connType")) {
      str1 = (String)parami.nSp.get("connType");
    }
    String str3;
    if (str1.equalsIgnoreCase("lan"))
    {
      if (!com.tencent.mm.plugin.webview.ui.tools.a.a.bEE().hasInit)
      {
        w.e("MicroMsg.MsgHandler", "disconnectWXDevice  not init");
        a(parami, "disconnectWXDevice:fail_notInit", null);
        GMTrace.o(12187909226496L, 90807);
        return true;
      }
      str1 = (String)parami.nSp.get("deviceId");
      w.i("MicroMsg.MsgHandler", "doDisconnectWXDevice, deviceId : %s", new Object[] { str1 });
      if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
      {
        w.e("MicroMsg.MsgHandler", "deviceId is null");
        a(parami, "disconnectWXDevice:fail_noDeviceId", null);
        GMTrace.o(12187909226496L, 90807);
        return true;
      }
      str3 = aP(parami);
      com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { str3, "disconnectWXDevice" });
      if (com.tencent.mm.sdk.platformtools.bg.nm(str3))
      {
        a(parami, "disconnectWXDevice:fail_UsernameError", null);
        GMTrace.o(12187909226496L, 90807);
        return true;
      }
    }
    for (;;)
    {
      Object localObject;
      try
      {
        localObject = new cz();
        ((cz)localObject).eEv.eEt = false;
        ((cz)localObject).eEv.eEs = str3;
        ((cz)localObject).eEv.esG = str1;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        if (((cz)localObject).eEw.eEu)
        {
          a(parami, "disconnectWXDevice:ok", null);
          if ((this.rSF != null) && (this.rSF.containsKey(str3))) {
            this.rSF.remove(str3);
          }
          GMTrace.o(12187909226496L, 90807);
          return true;
        }
        a(parami, "disconnectWXDevice:fail", null);
        continue;
        if (com.tencent.mm.plugin.webview.ui.tools.a.b.bEH().hasInit) {
          break label411;
        }
      }
      catch (Exception localException1)
      {
        w.e("MicroMsg.MsgHandler", "disconnectWXDevice failed : %s", new Object[] { localException1.getMessage() });
        a(parami, "disconnectWXDevice:fail_exception", null);
        GMTrace.o(12187909226496L, 90807);
        return true;
      }
      w.e("MicroMsg.MsgHandler", "disconnectWXDevice  not init");
      a(parami, "disconnectWXDevice:fail_notInit", null);
      GMTrace.o(12187909226496L, 90807);
      return true;
      label411:
      String str2 = (String)parami.nSp.get("deviceId");
      w.i("MicroMsg.MsgHandler", "doDisconnectWXDevice, deviceId : %s", new Object[] { str2 });
      if (com.tencent.mm.sdk.platformtools.bg.nm(str2))
      {
        w.e("MicroMsg.MsgHandler", "deviceId is null");
        a(parami, "disconnectWXDevice:fail_noDeviceId", null);
        GMTrace.o(12187909226496L, 90807);
        return true;
      }
      str3 = aP(parami);
      com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { str3, "disconnectWXDevice" });
      if (com.tencent.mm.sdk.platformtools.bg.nm(str3))
      {
        a(parami, "disconnectWXDevice:fail_UsernameError", null);
        GMTrace.o(12187909226496L, 90807);
        return true;
      }
      try
      {
        localObject = new cy();
        ((cy)localObject).eEq.eEt = false;
        ((cy)localObject).eEq.eEs = str3;
        ((cy)localObject).eEq.esG = str2;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        if (((cy)localObject).eEr.eEu)
        {
          a(parami, "disconnectWXDevice:ok", null);
          if ((this.rSE == null) || (!this.rSE.containsKey(str3))) {
            continue;
          }
          this.rSE.remove(str3);
        }
      }
      catch (Exception localException2)
      {
        w.e("MicroMsg.MsgHandler", "disconnectWXDevice failed : %s", new Object[] { localException2.getMessage() });
        a(parami, "disconnectWXDevice:fail_exception", null);
        GMTrace.o(12187909226496L, 90807);
        return true;
      }
      a(parami, "disconnectWXDevice:fail", null);
    }
  }
  
  public final boolean aL(final i parami)
  {
    GMTrace.i(12188043444224L, 90808);
    if ((!com.tencent.mm.plugin.webview.ui.tools.a.b.bEH().hasInit) && (!com.tencent.mm.plugin.webview.ui.tools.a.a.bEE().hasInit))
    {
      w.e("MicroMsg.MsgHandler", "getWXDeviceTicket not init");
      a(parami, "getWXDeviceTicket:fail_notInit", null);
      GMTrace.o(12188043444224L, 90808);
      return true;
    }
    String str1 = (String)parami.nSp.get("deviceId");
    String str2 = (String)parami.nSp.get("type");
    w.i("MicroMsg.MsgHandler", "doGetWXDeviceTicket, deviceId : %s, type : %s", new Object[] { str1, str2 });
    if ((com.tencent.mm.sdk.platformtools.bg.nm(str1)) || (com.tencent.mm.sdk.platformtools.bg.nm(str2)))
    {
      w.e("MicroMsg.MsgHandler", "deviceId or type is null");
      a(parami, "getWXDeviceTicket:fail_wrongParams", null);
      GMTrace.o(12188043444224L, 90808);
      return true;
    }
    try
    {
      String str3 = aP(parami);
      com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { str3, "getWXDeviceTicket" });
      if (com.tencent.mm.sdk.platformtools.bg.nm(str3))
      {
        a(parami, "getWXDeviceTicket:fail_UsernameError", null);
        GMTrace.o(12188043444224L, 90808);
        return true;
      }
      final dg localdg = new dg();
      localdg.eEQ.type = com.tencent.mm.sdk.platformtools.bg.getInt(str2, 0);
      localdg.eEQ.eEs = str3;
      localdg.eEQ.esG = str1;
      localdg.eEQ.eES = parami.rUS;
      localdg.eDO = new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19431371571200L, 144775);
          w.i("MicroMsg.MsgHandler", "ExDeviceGetTicketEvent isOk[%s], ticket[%s]", new Object[] { Boolean.valueOf(localdg.eER.eET), localdg.eER.eEU });
          if (localdg.eER.eET)
          {
            if (!com.tencent.mm.sdk.platformtools.bg.nm(localdg.eER.eEU))
            {
              HashMap localHashMap = new HashMap();
              w.i("MicroMsg.MsgHandler", "ticket %s", new Object[] { localdg.eER.eEU });
              localHashMap.put("ticket", localdg.eER.eEU);
              g.this.a(parami, "getWXDeviceTicket:ok", localHashMap);
              GMTrace.o(19431371571200L, 144775);
              return;
            }
            g.this.a(parami, "getWXDeviceTicket:fail", null);
          }
          GMTrace.o(19431371571200L, 144775);
        }
      };
      com.tencent.mm.sdk.b.a.vgX.a(localdg, Looper.getMainLooper());
      GMTrace.o(12188043444224L, 90808);
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MsgHandler", "getWXDeviceTicket failed : %s", new Object[] { localException.getMessage() });
      a(parami, "getWXDeviceTicket:fail_exception", null);
      GMTrace.o(12188043444224L, 90808);
    }
    return true;
  }
  
  public final boolean aM(i parami)
  {
    GMTrace.i(12188177661952L, 90809);
    Object localObject1 = "";
    if (parami.nSp.containsKey("connType")) {
      localObject1 = (String)parami.nSp.get("connType");
    }
    if (((String)localObject1).equalsIgnoreCase("lan")) {
      if (!com.tencent.mm.plugin.webview.ui.tools.a.a.bEE().hasInit)
      {
        w.e("MicroMsg.MsgHandler", "getWXDeviceInfos not init");
        a(parami, "getWXDeviceInfos:fail_notInit", null);
        GMTrace.o(12188177661952L, 90809);
        return true;
      }
    }
    for (;;)
    {
      Object localObject2;
      try
      {
        localObject2 = aP(parami);
        com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { localObject2, "getWXDeviceInfos" });
        w.i("MicroMsg.MsgHandler", "doGetWXDeviceInfos, %s", new Object[] { localObject2 });
        if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2))
        {
          a(parami, "getWXDeviceInfos:fail_UsernameError", null);
          GMTrace.o(12188177661952L, 90809);
          return true;
        }
        localObject1 = new de();
        ((de)localObject1).eEI.eEs = ((String)localObject2);
        ((de)localObject1).eEI.context = this.context;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        if ((((de)localObject1).eEJ.eEu) && (((de)localObject1).eEJ.eEH != null))
        {
          localObject2 = new HashMap();
          ((Map)localObject2).put("jsapi_callback_json_special_key", "deviceInfos");
          ((Map)localObject2).put("deviceInfos", ((de)localObject1).eEJ.eEH.toString());
          a(parami, "getWXDeviceInfos:ok", (Map)localObject2);
          GMTrace.o(12188177661952L, 90809);
          return true;
        }
        a(parami, "getWXDeviceInfos:fail", null);
        continue;
        if (com.tencent.mm.plugin.webview.ui.tools.a.b.bEH().hasInit) {
          break label372;
        }
      }
      catch (Exception localException1)
      {
        w.e("MicroMsg.MsgHandler", "getWXDeviceInfos failed : %s", new Object[] { localException1.getMessage() });
        a(parami, "getWXDeviceInfos:fail_exception", null);
        GMTrace.o(12188177661952L, 90809);
        return true;
      }
      w.e("MicroMsg.MsgHandler", "getWXDeviceInfos not init");
      a(parami, "getWXDeviceInfos:fail_notInit", null);
      GMTrace.o(12188177661952L, 90809);
      return true;
      try
      {
        label372:
        localObject2 = aP(parami);
        com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { localObject2, "getWXDeviceInfos" });
        w.i("MicroMsg.MsgHandler", "doGetWXDeviceInfos, %s", new Object[] { localObject2 });
        if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2))
        {
          a(parami, "getWXDeviceInfos:fail_UsernameError", null);
          GMTrace.o(12188177661952L, 90809);
          return true;
        }
        dd localdd = new dd();
        localdd.eEF.eEs = ((String)localObject2);
        localdd.eEF.context = this.context;
        com.tencent.mm.sdk.b.a.vgX.m(localdd);
        if ((localdd.eEG.eEu) && (localdd.eEG.eEH != null))
        {
          localObject2 = new HashMap();
          ((Map)localObject2).put("jsapi_callback_json_special_key", "deviceInfos");
          ((Map)localObject2).put("deviceInfos", localdd.eEG.eEH.toString());
          a(parami, "getWXDeviceInfos:ok", (Map)localObject2);
        }
      }
      catch (Exception localException2)
      {
        w.e("MicroMsg.MsgHandler", "getWXDeviceInfos failed : %s", new Object[] { localException2.getMessage() });
        a(parami, "getWXDeviceInfos:fail_exception", null);
        GMTrace.o(12188177661952L, 90809);
        return true;
      }
      a(parami, "getWXDeviceInfos:fail", null);
    }
  }
  
  public final boolean aN(i parami)
  {
    GMTrace.i(12188311879680L, 90810);
    String str1 = "";
    if (parami.nSp.containsKey("connType")) {
      str1 = (String)parami.nSp.get("connType");
    }
    String str3;
    boolean bool;
    if (str1.equalsIgnoreCase("lan"))
    {
      if (!com.tencent.mm.plugin.webview.ui.tools.a.a.bEE().hasInit)
      {
        w.e("MicroMsg.MsgHandler", "sendDataToWXDevice not init");
        a(parami, "sendDataToWXDevice:fail_notInit", null);
        GMTrace.o(12188311879680L, 90810);
        return true;
      }
      str1 = (String)parami.nSp.get("deviceId");
      str3 = (String)parami.nSp.get("base64Data");
      if (!com.tencent.mm.sdk.platformtools.bg.nm(str3)) {}
      for (bool = true;; bool = false)
      {
        w.i("MicroMsg.MsgHandler", "doSendDataToWXDevice, deviceId : %s, has data : %s", new Object[] { str1, Boolean.valueOf(bool) });
        if ((!com.tencent.mm.sdk.platformtools.bg.nm(str1)) && (str3 != null)) {
          break;
        }
        w.e("MicroMsg.MsgHandler", "deviceId or data is null");
        a(parami, "sendDataToWXDevice:fail_wrongParams", null);
        GMTrace.o(12188311879680L, 90810);
        return true;
      }
    }
    for (;;)
    {
      String str4;
      Object localObject;
      try
      {
        str4 = aP(parami);
        com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { str4, "sendDataToWXDevice" });
        if (com.tencent.mm.sdk.platformtools.bg.nm(str4))
        {
          a(parami, "sendDataToWXDevice:fail_UsernameError", null);
          GMTrace.o(12188311879680L, 90810);
          return true;
        }
        localObject = new dz();
        ((dz)localObject).eFH.eEs = str4;
        ((dz)localObject).eFH.data = str3;
        ((dz)localObject).eFH.esG = str1;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        if (((dz)localObject).eFI.eEu)
        {
          a(parami, "sendDataToWXDevice:ok", null);
          GMTrace.o(12188311879680L, 90810);
          return true;
        }
        a(parami, "sendDataToWXDevice:fail", null);
        continue;
        if (com.tencent.mm.plugin.webview.ui.tools.a.b.bEH().hasInit) {
          break label433;
        }
      }
      catch (Exception localException1)
      {
        w.e("MicroMsg.MsgHandler", "sendDataToWXDevice failed : %s", new Object[] { localException1.getMessage() });
        a(parami, "sendDataToWXDevice:fail_exception", null);
        GMTrace.o(12188311879680L, 90810);
        return true;
      }
      w.e("MicroMsg.MsgHandler", "sendDataToWXDevice not init");
      a(parami, "sendDataToWXDevice:fail_notInit", null);
      GMTrace.o(12188311879680L, 90810);
      return true;
      label433:
      String str2 = (String)parami.nSp.get("deviceId");
      str3 = (String)parami.nSp.get("base64Data");
      if (!com.tencent.mm.sdk.platformtools.bg.nm(str3)) {}
      for (bool = true;; bool = false)
      {
        w.i("MicroMsg.MsgHandler", "doSendDataToWXDevice, deviceId : %s, has data : %s", new Object[] { str2, Boolean.valueOf(bool) });
        if ((!com.tencent.mm.sdk.platformtools.bg.nm(str2)) && (str3 != null)) {
          break;
        }
        w.e("MicroMsg.MsgHandler", "deviceId or data is null");
        a(parami, "sendDataToWXDevice:fail_wrongParams", null);
        GMTrace.o(12188311879680L, 90810);
        return true;
      }
      try
      {
        str4 = aP(parami);
        com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { str4, "sendDataToWXDevice" });
        if (com.tencent.mm.sdk.platformtools.bg.nm(str4))
        {
          a(parami, "sendDataToWXDevice:fail_UsernameError", null);
          GMTrace.o(12188311879680L, 90810);
          return true;
        }
        localObject = new dy();
        ((dy)localObject).eFF.eEs = str4;
        ((dy)localObject).eFF.data = Base64.decode(str3, 0);
        ((dy)localObject).eFF.esG = str2;
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
        if (((dy)localObject).eFG.eEu) {
          a(parami, "sendDataToWXDevice:ok", null);
        }
      }
      catch (Exception localException2)
      {
        w.e("MicroMsg.MsgHandler", "sendDataToWXDevice failed : %s", new Object[] { localException2.getMessage() });
        a(parami, "sendDataToWXDevice:fail_exception", null);
        GMTrace.o(12188311879680L, 90810);
        return true;
      }
      a(parami, "sendDataToWXDevice:fail", null);
    }
  }
  
  public final boolean aO(i parami)
  {
    GMTrace.i(12188446097408L, 90811);
    if (!com.tencent.mm.plugin.webview.ui.tools.a.b.bEH().hasInit)
    {
      w.e("MicroMsg.MsgHandler", "setSendDataDirection not init");
      a(parami, "setSendDataDirection:fail_notInit", null);
      GMTrace.o(12188446097408L, 90811);
      return true;
    }
    try
    {
      String str = (String)parami.nSp.get("deviceId");
      Object localObject = (String)parami.nSp.get("direction");
      w.i("MicroMsg.MsgHandler", "setSendDataDirection, deviceId = %s, direction = %s", new Object[] { str, localObject });
      if ((com.tencent.mm.sdk.platformtools.bg.nm(str)) || (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)))
      {
        w.e("MicroMsg.MsgHandler", "wrong args");
        a(parami, "setSendDataDirection:fail_wrongParams", null);
        GMTrace.o(12188446097408L, 90811);
        return true;
      }
      int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)localObject, 0);
      localObject = aP(parami);
      com.tencent.mm.plugin.report.service.g.ork.i(11533, new Object[] { localObject, "setSendDataDirection" });
      if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
      {
        a(parami, "setSendDataDirection:fail_UsernameError", null);
        GMTrace.o(12188446097408L, 90811);
        return true;
      }
      localObject = new ec();
      ((ec)localObject).eFR.esG = str;
      ((ec)localObject).eFR.direction = i;
      ((ec)localObject).eFR.clear = false;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
      if (((ec)localObject).eFS.eEu) {
        a(parami, "setSendDataDirection:ok", null);
      }
      for (;;)
      {
        GMTrace.o(12188446097408L, 90811);
        return true;
        a(parami, "setSendDataDirection:fail", null);
      }
      return true;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MsgHandler", "setSendDataDirection failed : %s", new Object[] { localException.getMessage() });
      a(parami, "setSendDataDirection:fail_exception", null);
      GMTrace.o(12188446097408L, 90811);
    }
  }
  
  public final boolean aQ(i parami)
  {
    GMTrace.i(12189117186048L, 90816);
    Object localObject1 = (String)parami.nSp.get("sourceType");
    w.i("MicroMsg.MsgHandler", "source Type = %s", new Object[] { localObject1 });
    int k;
    int i;
    int j;
    if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
    {
      try
      {
        localObject1 = new JSONArray((String)localObject1);
        k = 0;
        i = 0;
        j = i;
        w.e("MicroMsg.MsgHandler", "doChooseImage: sizeType parsing error");
      }
      catch (Exception localException1)
      {
        try
        {
          if (k >= ((JSONArray)localObject1).length()) {
            break label147;
          }
          if (((JSONArray)localObject1).getString(k).equals("album"))
          {
            j = i | 0x1;
          }
          else
          {
            bool = ((JSONArray)localObject1).getString(k).equals("camera");
            j = i;
            if (bool) {
              j = i | 0x2;
            }
          }
        }
        catch (Exception localException2)
        {
          for (;;)
          {
            boolean bool;
            Object localObject4;
            Object localObject2;
            continue;
            localException5 = localException2;
            localObject6 = parami;
          }
        }
        localException1 = localException1;
        i = 0;
      }
      j = i;
      label147:
      if (j == 0)
      {
        j = 3;
        w.i("MicroMsg.MsgHandler", "real scene = %d", new Object[] { Integer.valueOf(j) });
        if ((j == 2) || (j == 3))
        {
          bool = com.tencent.mm.pluginsdk.h.a.a((Activity)this.context, "android.permission.CAMERA", 113, "", "");
          w.d("MicroMsg.MsgHandler", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
          if (!bool)
          {
            GMTrace.o(12189117186048L, 90816);
            return true;
          }
        }
        k = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("count"), 0);
        localObject4 = (String)parami.nSp.get("sizeType");
        parami = Boolean.valueOf(false);
        localObject2 = Boolean.valueOf(false);
        if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject4)) {}
      }
    }
    for (;;)
    {
      try
      {
        JSONArray localJSONArray = new JSONArray((String)localObject4);
        i = 0;
        localObject4 = localObject2;
        localObject6 = parami;
        w.e("MicroMsg.MsgHandler", "doChooseImage: sizeType parsing error");
      }
      catch (Exception localException3)
      {
        try
        {
          if (i >= localJSONArray.length()) {
            break label409;
          }
          if (localJSONArray.getString(i).equals("original"))
          {
            localObject6 = Boolean.valueOf(true);
            localObject4 = localObject2;
          }
          else
          {
            localObject4 = localObject2;
            localObject6 = parami;
            if (localJSONArray.getString(i).equals("compressed"))
            {
              localObject4 = Boolean.valueOf(true);
              localObject6 = parami;
            }
          }
        }
        catch (Exception localException4)
        {
          Object localObject5;
          for (;;) {}
        }
        localException3 = localException3;
      }
      Object localObject6 = parami;
      localObject5 = localObject2;
      label409:
      if ((((Boolean)localObject6).booleanValue()) && (!((Boolean)localObject5).booleanValue()))
      {
        parami = Boolean.valueOf(true);
        i = 7;
      }
      for (;;)
      {
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("key_pick_local_pic_capture", j);
        ((Intent)localObject2).putExtra("key_pick_local_pic_count", k);
        ((Intent)localObject2).putExtra("key_pick_local_pic_query_source_type", i);
        ((Intent)localObject2).putExtra("key_pick_local_pic_send_raw", parami);
        ((Intent)localObject2).putExtra("query_media_type", 1);
        w.i("MicroMsg.MsgHandler", "doChooseImage: realScene: %d, count: %d, querySourceType: %d, sendRaw: %b", new Object[] { Integer.valueOf(j), Integer.valueOf(k), Integer.valueOf(i), parami });
        if ((this.context instanceof MMActivity))
        {
          ((MMActivity)this.context).vKC = this;
          com.tencent.mm.bj.d.a(this.context, "webview", ".ui.tools.OpenFileChooserUI", (Intent)localObject2, 14, false);
        }
        GMTrace.o(12189117186048L, 90816);
        return true;
        if ((!((Boolean)localObject6).booleanValue()) && (((Boolean)localObject5).booleanValue()))
        {
          parami = Boolean.valueOf(false);
          i = 7;
        }
        else
        {
          parami = Boolean.valueOf(false);
          i = 8;
        }
      }
      Exception localException5;
      j = 0;
      break label147;
      k += 1;
      i = j;
      break;
      i += 1;
      Object localObject3 = localException5;
      parami = (i)localObject6;
    }
  }
  
  public final boolean aR(i parami)
  {
    GMTrace.i(12189251403776L, 90817);
    String str1 = (String)parami.nSp.get("appId");
    String str2 = (String)parami.nSp.get("localId");
    Object localObject = parami.nSp.get("isShowProgressTips");
    if (localObject != null) {}
    boolean bool;
    for (;;)
    {
      try
      {
        int i = com.tencent.mm.sdk.platformtools.bg.getInt(localObject.toString(), 0);
        if (i == 1)
        {
          bool = true;
          k.a(parami.rUT, false, null, str1);
          w.i("MicroMsg.MsgHandler", "upload local image, appid = %s, localid = %s, isShowProgressTips(%s)", new Object[] { str1, str2, Boolean.valueOf(bool) });
          if ((!com.tencent.mm.sdk.platformtools.bg.nm(str1)) && (!com.tencent.mm.sdk.platformtools.bg.nm(str2))) {
            break;
          }
          w.e("MicroMsg.MsgHandler", "appId or localid is null or nil.");
          a(parami, "uploadImage:fail_missing arguments", null);
          GMTrace.o(12189251403776L, 90817);
          return true;
        }
        bool = false;
        continue;
        bool = true;
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
    }
    a(parami, str1, str2, com.tencent.mm.modelcdntran.b.MediaType_FILE, 0, 0, "uploadImage", bool);
    GMTrace.o(12189251403776L, 90817);
    return true;
  }
  
  public final boolean aS(final i parami)
  {
    GMTrace.i(12189385621504L, 90818);
    Object localObject1 = (String)parami.nSp.get("appId");
    final String str = (String)parami.nSp.get("serverId");
    Object localObject2 = parami.nSp.get("isShowProgressTips");
    if (localObject2 != null) {}
    int i;
    for (;;)
    {
      try
      {
        i = com.tencent.mm.sdk.platformtools.bg.getInt(localObject2.toString(), 0);
        if (i == 1)
        {
          i = 1;
          k.a(parami.rUT, false, null, (String)localObject1);
          w.i("MicroMsg.MsgHandler", "doDownLoadImage, appid is : %s, media id is : %s", new Object[] { localObject1, str });
          if ((!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) && (!com.tencent.mm.sdk.platformtools.bg.nm(str))) {
            break;
          }
          a(parami, "downloadImage:fail_missing arguments", null);
          GMTrace.o(12189385621504L, 90818);
          return true;
        }
        i = 0;
        continue;
        i = 1;
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
    }
    final c.b local48 = new c.b()
    {
      public final void b(boolean paramAnonymousBoolean, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
      {
        GMTrace.i(19448551440384L, 144903);
        w.i("MicroMsg.MsgHandler", "doDownLoadImage, on cdn finish, is success : %b, local id : %s, media id is : %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString1, paramAnonymousString2 });
        if ((!com.tencent.mm.sdk.platformtools.bg.nm(paramAnonymousString2)) && (paramAnonymousString2.equals(str)))
        {
          com.tencent.mm.plugin.webview.modeltools.f.bCV().a(this);
          if (g.this.htG != null)
          {
            g.this.htG.dismiss();
            g.this.htG = null;
          }
          if (!paramAnonymousBoolean)
          {
            g.this.a(parami, "downloadImage:fail", null);
            GMTrace.o(19448551440384L, 144903);
            return;
          }
          paramAnonymousString2 = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(paramAnonymousString1);
          if (((paramAnonymousString2 instanceof WebViewJSSDKImageItem)) && (com.tencent.mm.sdk.platformtools.bg.nm(paramAnonymousString2.idL))) {
            ((WebViewJSSDKImageItem)paramAnonymousString2).bCo();
          }
          paramAnonymousString2 = new HashMap();
          paramAnonymousString2.put("localId", paramAnonymousString1);
          g.this.a(parami, "downloadImage:ok", paramAnonymousString2);
        }
        GMTrace.o(19448551440384L, 144903);
      }
    };
    com.tencent.mm.plugin.webview.modeltools.f.bCV().a((String)localObject1, str, local48);
    w.i("MicroMsg.MsgHandler", "doDownLoadImage, add cdn download task result : %b", new Object[] { Boolean.valueOf(true) });
    if (i != 0)
    {
      localObject1 = this.context;
      this.context.getString(R.l.cUG);
      this.htG = com.tencent.mm.ui.base.h.a((Context)localObject1, this.context.getString(R.l.elt), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(19424929120256L, 144727);
          com.tencent.mm.plugin.webview.modeltools.f.bCV().a(local48);
          com.tencent.mm.plugin.webview.modeltools.f.bCV();
          com.tencent.mm.plugin.webview.model.ac.Lg(str);
          g.this.a(parami, "downloadImage:fail", null);
          GMTrace.o(19424929120256L, 144727);
        }
      });
    }
    GMTrace.o(12189385621504L, 90818);
    return true;
  }
  
  public final boolean aT(i parami)
  {
    GMTrace.i(16072707145728L, 119751);
    String str1 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("toUsername"));
    String str2 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("scene"));
    String str3 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("type"));
    String str4 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("allowBackCamera"));
    String str5 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("showOther"));
    String str6 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("avatarUrl"));
    String str7 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("context"));
    w.i("MicroMsg.MsgHandler", "doStartVoipCS,toUserName:" + str1 + ",scene:" + str2 + ",type:" + str3 + ",allowBackCamera:" + str4 + ",showOther:" + str5 + ",avatarUrl:" + str6 + ",voipCSContext:" + str7);
    String str8 = (String)parami.nSp.get("appId");
    if ((str8 == null) || (str8.equals("")) || (str1 == null) || (str1.equals("")))
    {
      a(parami, "startVoipCall:param invalid", null);
      GMTrace.o(16072707145728L, 119751);
      return true;
    }
    this.rTd = parami;
    com.tencent.mm.sdk.b.a.vgX.b(this.rTe);
    if (str1.equals("testacs"))
    {
      parami = new Intent();
      parami.putExtra("voipCSBizId", "gh_e8b085bb67e0");
      parami.putExtra("voipCSAppId", "wx1224160e0adcefd6");
      com.tencent.mm.bj.d.b(com.tencent.mm.sdk.platformtools.ab.getContext(), "voip_cs", ".ui.VoipCSMainUI", parami);
      GMTrace.o(16072707145728L, 119751);
      return true;
    }
    parami = new Intent();
    parami.putExtra("voipCSBizId", str1);
    parami.putExtra("voipCSScene", str2);
    parami.putExtra("voipCSType", str3);
    parami.putExtra("voipCSAppId", str8);
    parami.putExtra("voipCSAllowBackCamera", str4);
    parami.putExtra("voipCSShowOther", str5);
    parami.putExtra("voipCSAvatarUrl", str6);
    parami.putExtra("voipCSContext", str7);
    com.tencent.mm.bj.d.b(com.tencent.mm.sdk.platformtools.ab.getContext(), "voip_cs", ".ui.VoipCSMainUI", parami);
    GMTrace.o(16072707145728L, 119751);
    return true;
  }
  
  public final boolean aU(i parami)
  {
    GMTrace.i(16072841363456L, 119752);
    w.i("MicroMsg.MsgHandler", "doRecordVideo()");
    boolean bool = b(parami, 1);
    GMTrace.o(16072841363456L, 119752);
    return bool;
  }
  
  public final boolean aV(i parami)
  {
    GMTrace.i(16072975581184L, 119753);
    Object localObject = (String)parami.nSp.get("localId");
    w.i("MicroMsg.MsgHandler", "doPreviewVideo(), localId:%s", new Object[] { localObject });
    localObject = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk((String)localObject);
    if (localObject == null)
    {
      w.e("MicroMsg.MsgHandler", "the item is null");
      a(parami, "previewVideo:fail", null);
      GMTrace.o(16072975581184L, 119753);
      return true;
    }
    if (TextUtils.isEmpty(((WebViewJSSDKFileItem)localObject).hOo))
    {
      w.e("MicroMsg.MsgHandler", "the File item not exist for localId:%s", new Object[] { ((WebViewJSSDKFileItem)localObject).eHy });
      a(parami, "previewVideo:fail", null);
      GMTrace.o(16072975581184L, 119753);
      return true;
    }
    if (!new File(((WebViewJSSDKFileItem)localObject).hOo).exists())
    {
      w.e("MicroMsg.MsgHandler", "the File not exist for origFilePath:%s", new Object[] { ((WebViewJSSDKFileItem)localObject).hOo });
      a(parami, "previewVideo:fail", null);
      GMTrace.o(16072975581184L, 119753);
      return true;
    }
    parami = new Intent();
    parami.putExtra("key_video_path", ((WebViewJSSDKFileItem)localObject).hOo);
    if ((this.context instanceof MMActivity))
    {
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.b(this.context, "card", ".ui.CardGiftVideoUI", parami, 46);
    }
    GMTrace.o(16072975581184L, 119753);
    return true;
  }
  
  public final boolean aW(i parami)
  {
    GMTrace.i(12189519839232L, 90819);
    w.i("MicroMsg.MsgHandler", "doUploadEncryptMediaFile()");
    String str1 = (String)parami.nSp.get("appId");
    String str2 = (String)parami.nSp.get("localId");
    Object localObject = parami.nSp.get("isShowProgressTips");
    if (localObject != null) {}
    boolean bool;
    for (;;)
    {
      try
      {
        int i = com.tencent.mm.sdk.platformtools.bg.getInt(localObject.toString(), 0);
        if (i == 1)
        {
          bool = true;
          w.i("MicroMsg.MsgHandler", "doUploadEncryptMediaFile, appid = %s, localid = %s, isShowProgressTips(%s)", new Object[] { str1, str2, Boolean.valueOf(bool) });
          if ((!com.tencent.mm.sdk.platformtools.bg.nm(str1)) && (!com.tencent.mm.sdk.platformtools.bg.nm(str2))) {
            break;
          }
          w.e("MicroMsg.MsgHandler", "appId or localid is null");
          a(parami, "uploadEncryptMediaFile:fail_missing arguments", null);
          GMTrace.o(12189519839232L, 90819);
          return true;
        }
        bool = false;
        continue;
        bool = true;
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
    }
    k.a(parami.rUT, false, null, str1);
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(str2);
    if (localWebViewJSSDKFileItem == null)
    {
      w.e("MicroMsg.MsgHandler", "jssdk file item is null for localId:%s", new Object[] { str2 });
      a(parami, "uploadEncryptMediaFile:file_not_exist", null);
      GMTrace.o(12189519839232L, 90819);
      return true;
    }
    switch (localWebViewJSSDKFileItem.eGK)
    {
    case 2: 
    case 3: 
    default: 
      b(parami, str1, str2, com.tencent.mm.modelcdntran.b.gzg, 0, 0, "uploadEncryptMediaFile", bool);
    }
    for (;;)
    {
      GMTrace.o(12189519839232L, 90819);
      return true;
      a(parami, str1, str2, com.tencent.mm.modelcdntran.b.gzg, 0, 0, "uploadEncryptMediaFile", bool);
      continue;
      b(parami, str1, str2, com.tencent.mm.modelcdntran.b.gzg, 0, 0, "uploadEncryptMediaFile", bool);
    }
  }
  
  public final boolean aX(final i parami)
  {
    GMTrace.i(12189654056960L, 90820);
    w.i("MicroMsg.MsgHandler", "doChooseMedia()");
    boolean bool = com.tencent.mm.pluginsdk.h.a.a((Activity)this.context, "android.permission.CAMERA", 119, "", "");
    w.i("MicroMsg.MsgHandler", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
    if (!bool)
    {
      GMTrace.o(12189654056960L, 90820);
      return true;
    }
    bool = com.tencent.mm.pluginsdk.h.a.a((Activity)this.context, "android.permission.RECORD_AUDIO", 120, "", "");
    w.i("MicroMsg.MsgHandler", " checkPermission checkMicroPhone[%b]", new Object[] { Boolean.valueOf(bool) });
    if (!bool)
    {
      GMTrace.o(12189654056960L, 90820);
      return true;
    }
    Object localObject = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("sourceType"));
    String str2 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("mediaType"));
    int i = Math.min(com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("maxDuration"), 10), 10);
    final String str1 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("camera"));
    int j = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("count"), 1);
    String str3 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("sizeType"));
    w.i("MicroMsg.MsgHandler", "doChooseMedia sourceType:%s, mediaType:%s, maxDuration:%d, camera:%s, count:%d, sizeType:%s", new Object[] { localObject, str2, Integer.valueOf(i), str1, Integer.valueOf(j), str3 });
    final Intent localIntent = new Intent();
    localIntent.putExtra("key_pick_local_pic_count", j);
    if (i <= 0) {
      i = 10;
    }
    for (;;)
    {
      localIntent.putExtra("key_pick_local_media_duration", i);
      localIntent.putExtra("query_media_type", 3);
      localIntent.putExtra("key_pick_local_media_video_type", 2);
      localIntent.putExtra("key_pick_local_media_sight_type", str2);
      if ((str3.contains("original") ^ str3.contains("compressed")))
      {
        i = 7;
        localIntent.putExtra("key_pick_local_pic_query_source_type", i);
        if (!str3.contains("compressed")) {
          break label551;
        }
        bool = true;
        label426:
        localIntent.putExtra("key_pick_local_pic_send_raw", Boolean.valueOf(bool));
        if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) {
          break label635;
        }
        localObject = "album|camera";
      }
      label551:
      label635:
      for (;;)
      {
        if ((((String)localObject).contains("album")) && (((String)localObject).contains("camera")))
        {
          localObject = new com.tencent.mm.ui.tools.l(this.context);
          ((com.tencent.mm.ui.tools.l)localObject).b(null, new View.OnCreateContextMenuListener()new p.d
          {
            public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
            {
              GMTrace.i(19432042659840L, 144780);
              paramAnonymousContextMenu.add(0, 1, 0, g.this.context.getString(R.l.cSS));
              paramAnonymousContextMenu.add(0, 2, 1, g.this.context.getString(R.l.cSW));
              GMTrace.o(19432042659840L, 144780);
            }
          }, new p.d()
          {
            public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
            {
              GMTrace.i(19421036806144L, 144698);
              switch (paramAnonymousMenuItem.getItemId())
              {
              }
              for (;;)
              {
                GMTrace.o(19421036806144L, 144698);
                return;
                g.this.a(str1, localIntent);
                GMTrace.o(19421036806144L, 144698);
                return;
                g.this.I(localIntent);
              }
            }
          });
          ((com.tencent.mm.ui.tools.l)localObject).e(new DialogInterface.OnCancelListener()
          {
            public final void onCancel(DialogInterface paramAnonymousDialogInterface)
            {
              GMTrace.i(19450162053120L, 144915);
              g.this.a(parami, "doChooseMedia:cancel", null);
              GMTrace.o(19450162053120L, 144915);
            }
          });
          ((com.tencent.mm.ui.tools.l)localObject).bpI();
          GMTrace.o(12189654056960L, 90820);
          return true;
          i = 8;
          break;
          bool = false;
          break label426;
        }
        if (((String)localObject).contains("album"))
        {
          I(localIntent);
          GMTrace.o(12189654056960L, 90820);
          return true;
        }
        if (((String)localObject).contains("camera"))
        {
          a(str1, localIntent);
          GMTrace.o(12189654056960L, 90820);
          return true;
        }
        a(parami, "chooseMedia:fail_sourceType_error", null);
        GMTrace.o(12189654056960L, 90820);
        return true;
      }
    }
  }
  
  public final boolean aY(i parami)
  {
    GMTrace.i(16073109798912L, 119754);
    w.i("MicroMsg.MsgHandler", "doChooseVideo()");
    boolean bool = b(parami, 0);
    GMTrace.o(16073109798912L, 119754);
    return bool;
  }
  
  public final boolean aZ(i parami)
  {
    GMTrace.i(12190190927872L, 90824);
    String str1 = (String)parami.nSp.get("appId");
    String str2 = (String)parami.nSp.get("localId");
    Object localObject = parami.nSp.get("isShowProgressTips");
    if (localObject != null) {}
    boolean bool;
    for (;;)
    {
      try
      {
        int i = com.tencent.mm.sdk.platformtools.bg.getInt(localObject.toString(), 0);
        if (i == 1)
        {
          bool = true;
          w.i("MicroMsg.MsgHandler", "uploadMediaFile, appid = %s, localid = %s, isShowProgressTips(%s)", new Object[] { str1, str2, Boolean.valueOf(bool) });
          if ((!com.tencent.mm.sdk.platformtools.bg.nm(str1)) && (!com.tencent.mm.sdk.platformtools.bg.nm(str2))) {
            break;
          }
          w.e("MicroMsg.MsgHandler", "appId or localid is null or nil.");
          a(parami, "uploadMediaFile:fail_missing arguments", null);
          GMTrace.o(12190190927872L, 90824);
          return true;
        }
        bool = false;
        continue;
        bool = true;
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
    }
    k.a(parami.rUT, false, null, str1);
    WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(str2);
    if (localWebViewJSSDKFileItem == null)
    {
      a(parami, "uploadMediaFile:fail", null);
      GMTrace.o(12190190927872L, 90824);
      return true;
    }
    switch (localWebViewJSSDKFileItem.eGK)
    {
    case 2: 
    case 3: 
    default: 
      b(parami, str1, str2, com.tencent.mm.modelcdntran.b.gzl, 202, 2, "uploadMediaFile", bool);
    }
    for (;;)
    {
      GMTrace.o(12190190927872L, 90824);
      return true;
      a(parami, str1, str2, com.tencent.mm.modelcdntran.b.gzi, 202, 2, "uploadMediaFile", bool);
      continue;
      b(parami, str1, str2, com.tencent.mm.modelcdntran.b.gzj, 202, 2, "uploadMediaFile", bool);
    }
  }
  
  public final boolean aa(i parami)
  {
    GMTrace.i(16069351702528L, 119726);
    w.i("MicroMsg.MsgHandler", "doVerifyWCPayPassword JSOAUTH");
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    if ((this.context instanceof MMActivity))
    {
      parami = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
      Intent localIntent = new Intent();
      localIntent.putExtra("appId", parami.appId);
      localIntent.putExtra("timeStamp", parami.timeStamp);
      localIntent.putExtra("nonceStr", parami.nonceStr);
      localIntent.putExtra("packageExt", parami.packageExt);
      localIntent.putExtra("signtype", parami.signType);
      localIntent.putExtra("paySignature", parami.ePJ);
      localIntent.putExtra("url", parami.url);
      localIntent.putExtra("scene", 1);
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.a(this.context, "wallet_core", ".ui.WalletCheckPwdUI", localIntent, 20, false);
    }
    GMTrace.o(16069351702528L, 119726);
    return true;
  }
  
  public final void ab(final Intent paramIntent)
  {
    GMTrace.i(12183345823744L, 90773);
    com.tencent.mm.plugin.webview.ui.tools.d.a(paramIntent.getExtras(), "profile", ".ui.ContactInfoUI", this.rEM, new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19425197555712L, 144729);
        com.tencent.mm.plugin.webview.a.a.hnH.d(paramIntent, g.this.context);
        GMTrace.o(19425197555712L, 144729);
      }
    });
    GMTrace.o(12183345823744L, 90773);
  }
  
  public final void ab(String paramString1, String paramString2, String paramString3)
  {
    GMTrace.i(18149323833344L, 135223);
    com.tencent.mm.y.at.AR();
    String str = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", paramString1);
    EmojiInfo localEmojiInfo2 = com.tencent.mm.plugin.emoji.model.h.arl().kjy.UK(paramString1);
    EmojiInfo localEmojiInfo1 = localEmojiInfo2;
    if (localEmojiInfo2 == null)
    {
      localEmojiInfo1 = localEmojiInfo2;
      if (com.tencent.mm.a.e.aZ(str)) {
        if (!o.RH(str)) {
          break label220;
        }
      }
    }
    label220:
    for (int i = EmojiInfo.vCw;; i = EmojiInfo.vCv)
    {
      localEmojiInfo1 = new EmojiInfo();
      localEmojiInfo1.field_md5 = paramString1;
      localEmojiInfo1.field_catalog = EmojiInfo.vCo;
      localEmojiInfo1.field_type = i;
      localEmojiInfo1.field_size = com.tencent.mm.a.e.aY(str);
      localEmojiInfo1.field_temp = 1;
      localEmojiInfo1.field_thumbUrl = paramString2;
      if (!com.tencent.mm.sdk.platformtools.bg.nm(paramString3)) {
        localEmojiInfo1.field_activityid = paramString3;
      }
      com.tencent.mm.plugin.emoji.model.h.arl().kjy.n(localEmojiInfo1);
      if (localEmojiInfo1 == null) {
        break label250;
      }
      boolean bool = com.tencent.mm.plugin.emoji.model.h.arh().a(this.context, localEmojiInfo1, 18, com.tencent.mm.y.q.zE());
      w.i("MicroMsg.MsgHandler", "doAddAction %b", new Object[] { Boolean.valueOf(bool) });
      if (!bool) {
        break;
      }
      a(this.rSz, "addToEmoticon:ok", null);
      GMTrace.o(18149323833344L, 135223);
      return;
    }
    a(this.rSz, "addToEmoticon:fail", null);
    GMTrace.o(18149323833344L, 135223);
    return;
    label250:
    a(this.rSz, "addToEmoticon:fail", null);
    GMTrace.o(18149323833344L, 135223);
  }
  
  public final boolean ab(i paramVarArgs)
  {
    GMTrace.i(16069620137984L, 119728);
    if (rSK != -1)
    {
      this.rSz = yl(rSK).rSz;
      this.rEM = yl(rSK).rEM;
    }
    Object localObject;
    boolean bool;
    if (Build.VERSION.SDK_INT >= 18)
    {
      com.tencent.mm.sdk.b.a.vgX.c(this.oQM);
      localObject = this.rSS.keySet().iterator();
      if (!com.tencent.mm.y.at.AU()) {
        break label343;
      }
      com.tencent.mm.y.at.AR();
      bool = com.tencent.mm.sdk.platformtools.bg.a((Boolean)com.tencent.mm.y.c.xh().get(w.a.vsX, null), false);
    }
    for (;;)
    {
      if (((Iterator)localObject).hasNext())
      {
        String str = (String)((Iterator)localObject).next();
        dj localdj = new dj();
        w.i("MicroMsg.MsgHandler", "[MsgHandler][doStopIBeaconRange]op=false,iBeacon = %s", new Object[] { str });
        localdj.eEZ.eFb = str;
        localdj.eEZ.eEY = false;
        if (!bool) {
          com.tencent.mm.sdk.b.a.vgX.m(localdj);
        }
      }
      else
      {
        if (com.tencent.mm.y.at.AU())
        {
          com.tencent.mm.y.at.AR();
          com.tencent.mm.y.c.xh().a(w.a.vsS, Boolean.valueOf(false));
        }
        localObject = com.tencent.mm.sdk.platformtools.ab.getContext().getSharedPreferences("com.tencent.mm_exdevice_ibeacon_isNewScanning", 4).edit();
        ((SharedPreferences.Editor)localObject).putBoolean("isNewScanning", false);
        ((SharedPreferences.Editor)localObject).commit();
        this.rSS.clear();
        this.fJq.clear();
        this.rST.clear();
        this.rSU.clear();
        this.rTa = false;
        a(paramVarArgs, "stopMonitoringBeacons:ok", null);
        this.rTa = false;
        if ((rSJ != null) && (this.rTb != null)) {
          ((SensorManager)rSJ.getSystemService("sensor")).unregisterListener(this.rTb);
        }
        GMTrace.o(16069620137984L, 119728);
        return true;
        label343:
        bool = false;
      }
    }
  }
  
  public final boolean ac(i parami)
  {
    GMTrace.i(16069754355712L, 119729);
    HashMap localHashMap = new HashMap();
    if (com.tencent.mm.pluginsdk.ui.tools.e.tGq == null)
    {
      w.w("MicroMsg.MsgHandler", "HeadingPitchSensorMgr.instance == null, init here");
      com.tencent.mm.pluginsdk.ui.tools.e locale = new com.tencent.mm.pluginsdk.ui.tools.e();
      com.tencent.mm.pluginsdk.ui.tools.r.a(locale);
      com.tencent.mm.pluginsdk.ui.tools.e.tGq = locale;
      locale.dV(this.context);
      com.tencent.mm.pluginsdk.ui.tools.e.tGq = locale;
    }
    localHashMap.put("heading", Integer.valueOf(com.tencent.mm.pluginsdk.ui.tools.e.tGq.bNj()));
    localHashMap.put("pitch", Integer.valueOf(com.tencent.mm.pluginsdk.ui.tools.e.tGq.getPitch()));
    w.i("MicroMsg.MsgHandler", "doGetHeadingAndPitch, heading=[%s], pitch=[%s]", new Object[] { Integer.valueOf(com.tencent.mm.pluginsdk.ui.tools.e.tGq.bNj()), Integer.valueOf(com.tencent.mm.pluginsdk.ui.tools.e.tGq.getPitch()) });
    a(parami, "get_heading_and_pitch:ok", localHashMap);
    GMTrace.o(16069754355712L, 119729);
    return true;
  }
  
  public final boolean ad(i parami)
  {
    GMTrace.i(12185761742848L, 90791);
    k.a(parami.rUT, Mz("sendEmail"), null, null);
    String str = (String)parami.nSp.get("title");
    Object localObject1 = "";
    try
    {
      localObject2 = ak.zA(this.rEM.Zi());
      localObject1 = localObject2;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        w.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
      }
    }
    localObject2 = new Intent();
    ((Intent)localObject2).putExtra("composeType", 1);
    ((Intent)localObject2).putExtra("subject", str);
    ((Intent)localObject2).putExtra("mail_content", (String)localObject1);
    com.tencent.mm.bj.d.a(this.context, "qqmail", ".ui.ComposeUI", (Intent)localObject2, false);
    a(parami, "send_email:ok", null);
    GMTrace.o(12185761742848L, 90791);
    return true;
  }
  
  public final boolean ae(i parami)
  {
    GMTrace.i(16069888573440L, 119730);
    com.tencent.mm.plugin.report.service.g.ork.a(157L, 27L, 1L, false);
    Object localObject1 = (String)parami.nSp.get("task_name");
    String str1 = (String)parami.nSp.get("task_url");
    String str2 = (String)parami.nSp.get("alternative_url");
    long l = com.tencent.mm.sdk.platformtools.bg.getLong((String)parami.nSp.get("task_size"), 0L);
    String str3 = (String)parami.nSp.get("file_md5");
    Object localObject2 = (String)parami.nSp.get("extInfo");
    String str4 = (String)parami.nSp.get("fileType");
    String str5 = (String)parami.nSp.get("appid");
    String str6 = (String)parami.nSp.get("package_name");
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("scene"), 1000);
    w.i("MicroMsg.MsgHandler", "doAddDownloadTaskStraight, md5 = " + str3 + ", url = " + str1 + ", extinfo = " + (String)localObject2 + ", fileType = " + str4 + ", reportScene = " + i);
    if (this.rSC != null)
    {
      int j = this.rSC.getInt("key_download_restrict", 0);
      localObject3 = this.rSC.getString("key_function_id", "");
      if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject3)) {
        com.tencent.mm.plugin.report.service.g.ork.i(14596, new Object[] { localObject3, Integer.valueOf(j), Integer.valueOf(0) });
      }
      if (j == 1)
      {
        w.e("MicroMsg.MsgHandler", "not allow to download file");
        a(parami, "add_download_task_straight:fail", null);
        GMTrace.o(16069888573440L, 119730);
        return true;
      }
    }
    com.tencent.mm.y.at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      Toast.makeText(this.context, this.context.getString(R.l.dzU), 0).show();
      a(parami, "add_download_task_straight:fail_sdcard_not_ready", null);
      r(str5, com.tencent.mm.plugin.downloader.model.d.keX, (String)localObject2);
      w.i("MicroMsg.MsgHandler", "doAddDownloadTaskStraight fail, sdcard not ready");
      GMTrace.o(16069888573440L, 119730);
      return true;
    }
    if ((l > 0L) && (!com.tencent.mm.compatible.util.f.L(l)))
    {
      Toast.makeText(this.context, this.context.getString(R.l.dzT), 0).show();
      a(parami, "add_download_task_straight:fail_sdcard_has_not_enough_space", null);
      r(str5, com.tencent.mm.plugin.downloader.model.d.keX, (String)localObject2);
      w.i("MicroMsg.MsgHandler", "doAddDownloadTaskStraight fail, not enough space, require size = " + l);
      GMTrace.o(16069888573440L, 119730);
      return true;
    }
    if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
    {
      w.e("MicroMsg.MsgHandler", "doAddDownloadTaskStraight fail, url is null");
      a(parami, "add_download_task_straight:fail_invalid_url", null);
      r(str5, com.tencent.mm.plugin.downloader.model.d.DOWNLOAD_ERR_URL_INVALID, (String)localObject2);
      GMTrace.o(16069888573440L, 119730);
      return true;
    }
    Object localObject3 = new gn();
    ((gn)localObject3).eJF.url = str1;
    ((gn)localObject3).eJF.eDW = str3;
    ((gn)localObject3).eJF.extInfo = ((String)localObject2);
    ((gn)localObject3).eJF.appId = str5;
    ((gn)localObject3).eJF.scene = i;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject3);
    localObject2 = new com.tencent.mm.plugin.downloader.model.g.a();
    ((com.tencent.mm.plugin.downloader.model.g.a)localObject2).vy(str1);
    ((com.tencent.mm.plugin.downloader.model.g.a)localObject2).vz(str2);
    ((com.tencent.mm.plugin.downloader.model.g.a)localObject2).bq(l);
    ((com.tencent.mm.plugin.downloader.model.g.a)localObject2).vA((String)localObject1);
    ((com.tencent.mm.plugin.downloader.model.g.a)localObject2).vB(str3);
    ((com.tencent.mm.plugin.downloader.model.g.a)localObject2).setAppId(str5);
    ((com.tencent.mm.plugin.downloader.model.g.a)localObject2).bE(str6);
    ((com.tencent.mm.plugin.downloader.model.g.a)localObject2).dJ(true);
    ((com.tencent.mm.plugin.downloader.model.g.a)localObject2).mt(com.tencent.mm.sdk.platformtools.bg.getInt(str4, 1));
    ((com.tencent.mm.plugin.downloader.model.g.a)localObject2).lq(i);
    localObject1 = ((com.tencent.mm.plugin.downloader.model.g.a)localObject2).kfx;
    l = com.tencent.mm.plugin.downloader.model.f.apJ().a((com.tencent.mm.plugin.downloader.model.g)localObject1);
    w.i("MicroMsg.MsgHandler", "doAddDownloadTaskStraight, downloadId = " + l);
    if (l <= 0L)
    {
      w.e("MicroMsg.MsgHandler", "doAddDownloadTaskStraight fail, downloadId = " + l);
      a(parami, "add_download_task_straight:fail", null);
    }
    for (;;)
    {
      GMTrace.o(16069888573440L, 119730);
      return true;
      localObject1 = new HashMap();
      ((Map)localObject1).put("download_id", Long.valueOf(l));
      a(parami, "add_download_task_straight:ok", (Map)localObject1);
    }
  }
  
  public final boolean af(final i parami)
  {
    GMTrace.i(16070022791168L, 119731);
    String str1 = (String)parami.nSp.get("task_name");
    String str2 = (String)parami.nSp.get("task_url");
    String str3 = (String)parami.nSp.get("alternative_url");
    long l = com.tencent.mm.sdk.platformtools.bg.getLong((String)parami.nSp.get("task_size"), 0L);
    String str4 = (String)parami.nSp.get("file_md5");
    String str5 = (String)parami.nSp.get("extInfo");
    String str6 = (String)parami.nSp.get("fileType");
    String str7 = (String)parami.nSp.get("appid");
    String str8 = (String)parami.nSp.get("package_name");
    String str9 = (String)parami.nSp.get("thumb_url");
    String str10 = (String)parami.nSp.get("title");
    w.i("MicroMsg.MsgHandler", "doAddDownloadTask, md5 = " + str4 + ", url = " + str2 + ", extinfo = " + str5 + ", fileType = " + str6);
    if (this.rSC != null)
    {
      int i = this.rSC.getInt("key_download_restrict", 0);
      localObject = this.rSC.getString("key_function_id", "");
      if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) {
        com.tencent.mm.plugin.report.service.g.ork.i(14596, new Object[] { localObject, Integer.valueOf(i), Integer.valueOf(0) });
      }
      if (i == 1)
      {
        w.e("MicroMsg.MsgHandler", "not allow to download file");
        a(parami, "add_download_task:fail", null);
        GMTrace.o(16070022791168L, 119731);
        return true;
      }
    }
    if (!am.isNetworkConnected(this.context))
    {
      a(parami, "add_download_task:fail_network_not_connected", null);
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19436069191680L, 144810);
          Toast.makeText(g.this.context, g.this.context.getString(R.l.dzS), 0).show();
          GMTrace.o(19436069191680L, 144810);
        }
      });
      w.i("MicroMsg.MsgHandler", "doAddDownloadTask fail, network not ready");
      r(str7, com.tencent.mm.plugin.downloader.model.d.keW, str5);
      GMTrace.o(16070022791168L, 119731);
      return true;
    }
    com.tencent.mm.y.at.AR();
    if (!com.tencent.mm.y.c.isSDCardAvailable())
    {
      a(parami, "add_download_task:fail_sdcard_not_ready", null);
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19436337627136L, 144812);
          Toast.makeText(g.this.context, g.this.context.getString(R.l.dzU), 0).show();
          GMTrace.o(19436337627136L, 144812);
        }
      });
      r(str7, com.tencent.mm.plugin.downloader.model.d.keX, str5);
      w.i("MicroMsg.MsgHandler", "doAddDownloadTask fail, sdcard not ready");
      GMTrace.o(16070022791168L, 119731);
      return true;
    }
    if ((l > 0L) && (!com.tencent.mm.compatible.util.f.L(l)))
    {
      a(parami, "add_download_task:fail_sdcard_has_not_enough_space", null);
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19437948239872L, 144824);
          Toast.makeText(g.this.context, g.this.context.getString(R.l.dzT), 0).show();
          GMTrace.o(19437948239872L, 144824);
        }
      });
      r(str7, com.tencent.mm.plugin.downloader.model.d.keX, str5);
      w.i("MicroMsg.MsgHandler", "doAddDownloadTask fail, not enough space, require size = " + l);
      GMTrace.o(16070022791168L, 119731);
      return true;
    }
    if (com.tencent.mm.sdk.platformtools.bg.nm(str2))
    {
      w.e("MicroMsg.MsgHandler", "doAddDownloadTask fail, url is null");
      a(parami, "add_download_task:fail_invalid_url", null);
      r(str7, com.tencent.mm.plugin.downloader.model.d.DOWNLOAD_ERR_URL_INVALID, str5);
      GMTrace.o(16070022791168L, 119731);
      return true;
    }
    Object localObject = new Intent();
    ((Intent)localObject).setClass(this.context, WebViewDownloadUI.class);
    ((Intent)localObject).putExtra("task_name", str1);
    ((Intent)localObject).putExtra("task_url", str2);
    ((Intent)localObject).putExtra("alternative_url", str3);
    ((Intent)localObject).putExtra("task_size", l);
    ((Intent)localObject).putExtra("file_md5", str4);
    ((Intent)localObject).putExtra("extInfo", str5);
    ((Intent)localObject).putExtra("fileType", str6);
    ((Intent)localObject).putExtra("appid", str7);
    ((Intent)localObject).putExtra("package_name", str8);
    ((Intent)localObject).putExtra("thumb_url", str9);
    ((Intent)localObject).putExtra("title", str10);
    ((Intent)localObject).putExtra("page_url", (String)parami.nSp.get("url"));
    ((Intent)localObject).addFlags(268435456);
    this.context.startActivity((Intent)localObject);
    this.rTc = new com.tencent.mm.sdk.b.c()
    {
      private boolean a(com.tencent.mm.g.a.i paramAnonymousi)
      {
        GMTrace.i(19429224087552L, 144759);
        if (paramAnonymousi.eAd.eAe)
        {
          w.i("MicroMsg.MsgHandler", "doAddDownloadTask callback, cancel");
          g.this.a(parami, "add_download_task:cancel", null);
          GMTrace.o(19429224087552L, 144759);
          return false;
        }
        if (paramAnonymousi.eAd.eAf > 0L)
        {
          HashMap localHashMap = new HashMap();
          localHashMap.put("download_id", Long.valueOf(paramAnonymousi.eAd.eAf));
          w.i("MicroMsg.MsgHandler", "doAddDownloadTask callback, ok");
          g.this.a(parami, "add_download_task:ok", localHashMap);
        }
        for (;;)
        {
          com.tencent.mm.sdk.b.a.vgX.c(g.this.rTc);
          GMTrace.o(19429224087552L, 144759);
          return false;
          w.i("MicroMsg.MsgHandler", "doAddDownloadTask callback, failed");
          g.this.a(parami, "add_download_task:fail", null);
        }
      }
    };
    com.tencent.mm.sdk.b.a.vgX.a(this.rTc);
    GMTrace.o(16070022791168L, 119731);
    return true;
  }
  
  public final boolean ag(i parami)
  {
    GMTrace.i(16070157008896L, 119732);
    long l = com.tencent.mm.sdk.platformtools.bg.getLong((String)parami.nSp.get("download_id"), -1L);
    w.i("MicroMsg.MsgHandler", "doCancelDownloadTask, downloadId = " + l);
    if (l <= 0L)
    {
      w.e("MicroMsg.MsgHandler", "doCancelDownloadTask fail, invalid downloadId = " + l);
      a(parami, "cancel_download_task:fail", null);
      GMTrace.o(16070157008896L, 119732);
      return true;
    }
    int i = com.tencent.mm.plugin.downloader.model.f.apJ().bf(l);
    w.i("MicroMsg.MsgHandler", "doCancelDownloadTask, ret = " + i);
    if (i <= 0) {
      a(parami, "cancel_download_task:fail", null);
    }
    for (;;)
    {
      GMTrace.o(16070157008896L, 119732);
      return true;
      a(parami, "cancel_download_task:ok", null);
    }
  }
  
  public final boolean ah(i parami)
  {
    GMTrace.i(16070291226624L, 119733);
    long l = com.tencent.mm.sdk.platformtools.bg.getLong((String)parami.nSp.get("download_id"), -1L);
    w.i("MicroMsg.MsgHandler", "doCancelDownloadTask, downloadId = " + l);
    if (l <= 0L)
    {
      w.e("MicroMsg.MsgHandler", "doCancelDownloadTask fail, invalid downloadId = " + l);
      a(parami, "pause_download_task:fail", null);
      GMTrace.o(16070291226624L, 119733);
      return true;
    }
    boolean bool = com.tencent.mm.plugin.downloader.model.f.apJ().bh(l);
    w.i("MicroMsg.MsgHandler", "doCancelDownloadTask, ret = " + bool);
    if (!bool) {
      a(parami, "pause_download_task:fail", null);
    }
    for (;;)
    {
      GMTrace.o(16070291226624L, 119733);
      return true;
      a(parami, "pause_download_task:ok", null);
    }
  }
  
  public final boolean ai(i parami)
  {
    GMTrace.i(16070425444352L, 119734);
    long l = com.tencent.mm.sdk.platformtools.bg.getLong((String)parami.nSp.get("download_id"), -1L);
    w.i("MicroMsg.MsgHandler", "doResumeDownloadTask, downloadId = " + l);
    if (l <= 0L)
    {
      w.e("MicroMsg.MsgHandler", "doResumeDownloadTask fail, invalid downloadId = " + l);
      a(parami, "resume_download_task:fail", null);
      GMTrace.o(16070425444352L, 119734);
      return true;
    }
    com.tencent.mm.plugin.downloader.e.a locala = com.tencent.mm.plugin.downloader.model.e.bm(l);
    if (locala != null)
    {
      locala.field_scene = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("scene"), 1000);
      com.tencent.mm.plugin.downloader.model.e.c(locala);
    }
    boolean bool = com.tencent.mm.plugin.downloader.model.f.apJ().bi(l);
    w.i("MicroMsg.MsgHandler", "doResumeDownloadTask, ret = " + bool);
    if (!bool) {
      a(parami, "resume_download_task:fail", null);
    }
    for (;;)
    {
      GMTrace.o(16070425444352L, 119734);
      return true;
      a(parami, "resume_download_task:ok", null);
    }
  }
  
  public final boolean aj(i parami)
  {
    GMTrace.i(16070559662080L, 119735);
    long l = com.tencent.mm.sdk.platformtools.bg.getLong((String)parami.nSp.get("download_id"), -1L);
    String str = (String)parami.nSp.get("appid");
    Object localObject = (String)parami.nSp.get("appIdArray");
    w.i("MicroMsg.MsgHandler", "doQueryDownloadTask, downloadId = " + l + ",appId = " + str + ",appIds = " + (String)localObject);
    if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      boolean bool = a((String)localObject, parami);
      GMTrace.o(16070559662080L, 119735);
      return bool;
    }
    if (l > 0L)
    {
      localObject = com.tencent.mm.plugin.downloader.model.f.apJ().bg(l);
      switch (((FileDownloadTaskInfo)localObject).status)
      {
      case 0: 
      default: 
        str = "default";
      }
    }
    for (;;)
    {
      w.i("MicroMsg.MsgHandler", "doQueryDownloadTask, state = " + str);
      HashMap localHashMap = new HashMap();
      localHashMap.put("state", str);
      localHashMap.put("download_id", Long.valueOf(((FileDownloadTaskInfo)localObject).id));
      if ((str == "downloading") && (((FileDownloadTaskInfo)localObject).eJe != 0L)) {
        localHashMap.put("progress", Long.valueOf(((float)((FileDownloadTaskInfo)localObject).eJd / (float)((FileDownloadTaskInfo)localObject).eJe * 100.0F)));
      }
      a(parami, "query_download_task:ok", localHashMap);
      GMTrace.o(16070559662080L, 119735);
      return true;
      if (!com.tencent.mm.sdk.platformtools.bg.nm(str))
      {
        localObject = com.tencent.mm.plugin.downloader.model.f.apJ().vv(str);
        break;
      }
      w.e("MicroMsg.MsgHandler", "doQueryDownloadTask fail, invalid downloadId = " + l + " or appid is null");
      a(parami, "query_download_task:fail", null);
      GMTrace.o(16070559662080L, 119735);
      return true;
      w.e("MicroMsg.MsgHandler", "doQueryDownloadTask fail, api not support");
      a(parami, "query_download_task:fail_apilevel_too_low", null);
      GMTrace.o(16070559662080L, 119735);
      return true;
      str = "downloading";
      continue;
      if (com.tencent.mm.a.e.aZ(((FileDownloadTaskInfo)localObject).path))
      {
        str = "download_succ";
      }
      else
      {
        str = "default";
        continue;
        str = "download_pause";
        continue;
        str = "download_fail";
      }
    }
  }
  
  public final boolean ak(i parami)
  {
    GMTrace.i(16070693879808L, 119736);
    long l = com.tencent.mm.sdk.platformtools.bg.getLong((String)parami.nSp.get("download_id"), -1L);
    w.i("MicroMsg.MsgHandler", "doInstallDownloadTask, downloadId = " + l);
    if (l <= 0L)
    {
      w.e("MicroMsg.MsgHandler", "doInstallDownloadTask fail, invalid downloadId = " + l);
      a(parami, "install_download_task:fail", null);
      GMTrace.o(16070693879808L, 119736);
      return true;
    }
    Object localObject = com.tencent.mm.plugin.downloader.model.f.apJ().bg(l);
    if (((FileDownloadTaskInfo)localObject).status == -1)
    {
      w.e("MicroMsg.MsgHandler", "doInstallDownloadTask fail, apilevel not supported");
      a(parami, "install_download_task:fail_apilevel_too_low", null);
      GMTrace.o(16070693879808L, 119736);
      return true;
    }
    if (((FileDownloadTaskInfo)localObject).status != 3)
    {
      w.e("MicroMsg.MsgHandler", "doInstallDownloadTask fail, invalid status = " + ((FileDownloadTaskInfo)localObject).status);
      a(parami, "install_download_task:fail", null);
      GMTrace.o(16070693879808L, 119736);
      return true;
    }
    if (com.tencent.mm.a.e.aZ(((FileDownloadTaskInfo)localObject).path))
    {
      localObject = Uri.fromFile(new File(((FileDownloadTaskInfo)localObject).path));
      if (com.tencent.mm.pluginsdk.model.app.q.e(this.context, (Uri)localObject))
      {
        localObject = "install_download_task:ok";
        a(parami, (String)localObject, null);
      }
    }
    for (;;)
    {
      GMTrace.o(16070693879808L, 119736);
      return true;
      localObject = "install_download_task:fail";
      break;
      a(parami, "install_download_task:fail", null);
    }
  }
  
  public final boolean al(i parami)
  {
    GMTrace.i(16070828097536L, 119737);
    String str1 = (String)parami.nSp.get("specificview");
    if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
    {
      w.e("MicroMsg.MsgHandler", "doOpenSpecificView fail, invalid specificview");
      a(parami, "specific_view:fail", null);
      GMTrace.o(16070828097536L, 119737);
      return true;
    }
    new Intent().addFlags(268435456);
    Bundle localBundle = new Bundle();
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("webview_scene"), 0);
    String str2 = (String)parami.nSp.get("url");
    String str3 = (String)parami.nSp.get("extinfo");
    localBundle.putInt("webview_scene", i);
    localBundle.putString("url", str2);
    localBundle.putString("extinfo", str3);
    boolean bool = com.tencent.mm.plugin.webview.a.a.hnH.a(this.context, str1, new Object[] { localBundle });
    w.i("MicroMsg.MsgHandler", "doOpenSpecificView, targetView = %s, ret = %b", new Object[] { str1, Boolean.valueOf(bool) });
    if (bool) {
      a(parami, "specific_view:ok", null);
    }
    for (;;)
    {
      GMTrace.o(16070828097536L, 119737);
      return true;
      w.e("MicroMsg.MsgHandler", "doOpenSpecificView, targetView not supported in current wechat version");
      a(parami, "specific_view:not_supported", null);
    }
  }
  
  /* Error */
  public final boolean am(final i parami)
  {
    // Byte code:
    //   0: ldc2_w 5749
    //   3: ldc_w 5751
    //   6: invokestatic 401	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 578	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSC	Landroid/os/Bundle;
    //   13: ifnull +104 -> 117
    //   16: aload_0
    //   17: getfield 578	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSC	Landroid/os/Bundle;
    //   20: ldc_w 5443
    //   23: iconst_0
    //   24: invokevirtual 802	android/os/Bundle:getInt	(Ljava/lang/String;I)I
    //   27: istore_2
    //   28: aload_0
    //   29: getfield 578	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSC	Landroid/os/Bundle;
    //   32: ldc_w 5445
    //   35: ldc_w 727
    //   38: invokevirtual 5446	android/os/Bundle:getString	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   41: astore 6
    //   43: aload 6
    //   45: invokestatic 869	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   48: ifne +35 -> 83
    //   51: getstatic 833	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   54: sipush 14596
    //   57: iconst_3
    //   58: anewarray 4	java/lang/Object
    //   61: dup
    //   62: iconst_0
    //   63: aload 6
    //   65: aastore
    //   66: dup
    //   67: iconst_1
    //   68: iload_2
    //   69: invokestatic 838	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   72: aastore
    //   73: dup
    //   74: iconst_2
    //   75: iconst_1
    //   76: invokestatic 838	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   79: aastore
    //   80: invokevirtual 841	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   83: iload_2
    //   84: iconst_1
    //   85: if_icmpne +32 -> 117
    //   88: ldc_w 614
    //   91: ldc_w 5753
    //   94: invokestatic 1196	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   97: aload_0
    //   98: aload_1
    //   99: ldc_w 5755
    //   102: aconst_null
    //   103: invokevirtual 686	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   106: ldc2_w 5749
    //   109: ldc_w 5751
    //   112: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   115: iconst_1
    //   116: ireturn
    //   117: aload_1
    //   118: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   121: ldc_w 2499
    //   124: invokeinterface 860 2 0
    //   129: checkcast 413	java/lang/String
    //   132: astore 10
    //   134: aload_1
    //   135: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   138: ldc_w 5757
    //   141: invokeinterface 860 2 0
    //   146: checkcast 413	java/lang/String
    //   149: astore 9
    //   151: invokestatic 5760	com/tencent/mm/sdk/platformtools/bg:Pu	()J
    //   154: aload_0
    //   155: getfield 483	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSP	J
    //   158: lsub
    //   159: lstore 4
    //   161: ldc_w 614
    //   164: ldc_w 5762
    //   167: iconst_1
    //   168: anewarray 4	java/lang/Object
    //   171: dup
    //   172: iconst_0
    //   173: lload 4
    //   175: invokestatic 717	java/lang/Long:valueOf	(J)Ljava/lang/Long;
    //   178: aastore
    //   179: invokestatic 735	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   182: ldc_w 727
    //   185: astore 7
    //   187: aload 7
    //   189: astore 6
    //   191: lload 4
    //   193: ldc2_w 5763
    //   196: lcmp
    //   197: ifge +251 -> 448
    //   200: aload 7
    //   202: astore 6
    //   204: aload_0
    //   205: getfield 483	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSP	J
    //   208: lconst_0
    //   209: lcmp
    //   210: ifle +238 -> 448
    //   213: aload 7
    //   215: astore 6
    //   217: aload_0
    //   218: getfield 648	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rEM	Lcom/tencent/mm/plugin/webview/stub/e;
    //   221: invokeinterface 1647 1 0
    //   226: astore 8
    //   228: aload 7
    //   230: astore 6
    //   232: aload_0
    //   233: getfield 479	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSL	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/c;
    //   236: aload 8
    //   238: invokevirtual 1701	com/tencent/mm/plugin/webview/ui/tools/jsapi/c:Ms	(Ljava/lang/String;)Ljava/lang/String;
    //   241: astore 7
    //   243: aload 7
    //   245: astore 6
    //   247: aload 8
    //   249: ldc_w 5766
    //   252: invokestatic 5771	java/net/URLEncoder:encode	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   255: astore 8
    //   257: aload 7
    //   259: astore 6
    //   261: getstatic 833	com/tencent/mm/plugin/report/service/g:ork	Lcom/tencent/mm/plugin/report/service/g;
    //   264: sipush 13983
    //   267: iconst_3
    //   268: anewarray 4	java/lang/Object
    //   271: dup
    //   272: iconst_0
    //   273: iconst_5
    //   274: invokestatic 838	java/lang/Integer:valueOf	(I)Ljava/lang/Integer;
    //   277: aastore
    //   278: dup
    //   279: iconst_1
    //   280: aload 8
    //   282: aastore
    //   283: dup
    //   284: iconst_2
    //   285: ldc_w 727
    //   288: aastore
    //   289: invokevirtual 841	com/tencent/mm/plugin/report/service/g:i	(I[Ljava/lang/Object;)V
    //   292: aload 8
    //   294: astore 6
    //   296: aload 7
    //   298: astore 8
    //   300: aload 6
    //   302: astore 7
    //   304: aload 8
    //   306: astore 6
    //   308: aload_1
    //   309: getfield 2050	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:rUT	Ljava/util/Map;
    //   312: iconst_0
    //   313: aconst_null
    //   314: aload 9
    //   316: invokestatic 2055	com/tencent/mm/plugin/webview/ui/tools/jsapi/k:a	(Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;)V
    //   319: iconst_0
    //   320: istore_3
    //   321: iload_3
    //   322: istore_2
    //   323: aload 10
    //   325: invokestatic 869	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   328: ifne +10 -> 338
    //   331: aload 10
    //   333: iconst_0
    //   334: invokestatic 587	com/tencent/mm/sdk/platformtools/bg:getInt	(Ljava/lang/String;I)I
    //   337: istore_2
    //   338: ldc_w 614
    //   341: ldc_w 5773
    //   344: iconst_1
    //   345: anewarray 4	java/lang/Object
    //   348: dup
    //   349: iconst_0
    //   350: aload 10
    //   352: aastore
    //   353: invokestatic 735	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   356: iload_2
    //   357: ifne +301 -> 658
    //   360: aload_1
    //   361: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   364: ldc_w 5427
    //   367: invokeinterface 860 2 0
    //   372: checkcast 413	java/lang/String
    //   375: astore 6
    //   377: ldc_w 614
    //   380: ldc_w 5775
    //   383: iconst_2
    //   384: anewarray 4	java/lang/Object
    //   387: dup
    //   388: iconst_0
    //   389: aload 9
    //   391: aastore
    //   392: dup
    //   393: iconst_1
    //   394: aload 6
    //   396: aastore
    //   397: invokestatic 735	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   400: aload 9
    //   402: invokestatic 869	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   405: ifeq +79 -> 484
    //   408: ldc_w 614
    //   411: ldc_w 5777
    //   414: invokestatic 1196	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   417: aload_0
    //   418: aload_1
    //   419: ldc_w 5755
    //   422: aconst_null
    //   423: invokevirtual 686	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   426: ldc2_w 5749
    //   429: ldc_w 5751
    //   432: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   435: iconst_1
    //   436: ireturn
    //   437: astore 7
    //   439: ldc_w 614
    //   442: ldc_w 5779
    //   445: invokestatic 1196	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   448: ldc_w 727
    //   451: astore 7
    //   453: goto -145 -> 308
    //   456: astore 8
    //   458: ldc_w 614
    //   461: ldc_w 5781
    //   464: iconst_1
    //   465: anewarray 4	java/lang/Object
    //   468: dup
    //   469: iconst_0
    //   470: aload 8
    //   472: invokevirtual 1864	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   475: aastore
    //   476: invokestatic 661	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   479: iload_3
    //   480: istore_2
    //   481: goto -143 -> 338
    //   484: getstatic 5785	com/tencent/mm/plugin/webview/a/a:hnI	Lcom/tencent/mm/pluginsdk/l;
    //   487: invokestatic 1401	com/tencent/mm/sdk/platformtools/ab:getContext	()Landroid/content/Context;
    //   490: aload 9
    //   492: invokeinterface 5790 3 0
    //   497: ifne +41 -> 538
    //   500: ldc_w 614
    //   503: ldc_w 5792
    //   506: iconst_1
    //   507: anewarray 4	java/lang/Object
    //   510: dup
    //   511: iconst_0
    //   512: aload 9
    //   514: aastore
    //   515: invokestatic 661	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   518: aload_0
    //   519: aload_1
    //   520: ldc_w 5755
    //   523: aconst_null
    //   524: invokevirtual 686	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   527: ldc2_w 5749
    //   530: ldc_w 5751
    //   533: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   536: iconst_1
    //   537: ireturn
    //   538: new 5794	com/tencent/mm/opensdk/modelmsg/WXAppExtendObject
    //   541: dup
    //   542: invokespecial 5795	com/tencent/mm/opensdk/modelmsg/WXAppExtendObject:<init>	()V
    //   545: astore 7
    //   547: aload 7
    //   549: aload 6
    //   551: putfield 5796	com/tencent/mm/opensdk/modelmsg/WXAppExtendObject:extInfo	Ljava/lang/String;
    //   554: new 812	com/tencent/mm/opensdk/modelmsg/WXMediaMessage
    //   557: dup
    //   558: aload 7
    //   560: invokespecial 5799	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:<init>	(Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage$IMediaObject;)V
    //   563: astore 7
    //   565: aload 7
    //   567: ldc_w 5800
    //   570: putfield 5803	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:sdkVer	I
    //   573: aload 7
    //   575: aload 6
    //   577: putfield 5806	com/tencent/mm/opensdk/modelmsg/WXMediaMessage:messageExt	Ljava/lang/String;
    //   580: new 5808	com/tencent/mm/g/a/im
    //   583: dup
    //   584: invokespecial 5809	com/tencent/mm/g/a/im:<init>	()V
    //   587: astore 6
    //   589: aload 6
    //   591: getfield 5813	com/tencent/mm/g/a/im:eLS	Lcom/tencent/mm/g/a/im$a;
    //   594: aload 7
    //   596: putfield 5816	com/tencent/mm/g/a/im$a:eLU	Lcom/tencent/mm/opensdk/modelmsg/WXMediaMessage;
    //   599: aload 6
    //   601: getfield 5813	com/tencent/mm/g/a/im:eLS	Lcom/tencent/mm/g/a/im$a;
    //   604: aload 9
    //   606: putfield 5817	com/tencent/mm/g/a/im$a:appId	Ljava/lang/String;
    //   609: aload 6
    //   611: getfield 5813	com/tencent/mm/g/a/im:eLS	Lcom/tencent/mm/g/a/im$a;
    //   614: aload_0
    //   615: getfield 753	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   618: putfield 5818	com/tencent/mm/g/a/im$a:context	Landroid/content/Context;
    //   621: aload 6
    //   623: getfield 5813	com/tencent/mm/g/a/im:eLS	Lcom/tencent/mm/g/a/im$a;
    //   626: new 126	com/tencent/mm/plugin/webview/ui/tools/jsapi/g$41
    //   629: dup
    //   630: aload_0
    //   631: aload_1
    //   632: invokespecial 5819	com/tencent/mm/plugin/webview/ui/tools/jsapi/g$41:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/g;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;)V
    //   635: putfield 5823	com/tencent/mm/g/a/im$a:eLV	Lcom/tencent/mm/pluginsdk/model/app/g$c;
    //   638: getstatic 926	com/tencent/mm/sdk/b/a:vgX	Lcom/tencent/mm/sdk/b/a;
    //   641: aload 6
    //   643: invokevirtual 930	com/tencent/mm/sdk/b/a:m	(Lcom/tencent/mm/sdk/b/b;)Z
    //   646: pop
    //   647: ldc2_w 5749
    //   650: ldc_w 5751
    //   653: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   656: iconst_1
    //   657: ireturn
    //   658: iload_2
    //   659: iconst_1
    //   660: if_icmpne +404 -> 1064
    //   663: aload_1
    //   664: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   667: ldc_w 5824
    //   670: invokeinterface 860 2 0
    //   675: checkcast 413	java/lang/String
    //   678: astore 9
    //   680: aload_1
    //   681: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   684: ldc_w 2043
    //   687: invokeinterface 860 2 0
    //   692: checkcast 413	java/lang/String
    //   695: astore 10
    //   697: aload_1
    //   698: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   701: ldc_w 5826
    //   704: invokeinterface 860 2 0
    //   709: checkcast 413	java/lang/String
    //   712: astore 8
    //   714: ldc_w 614
    //   717: ldc_w 5828
    //   720: iconst_3
    //   721: anewarray 4	java/lang/Object
    //   724: dup
    //   725: iconst_0
    //   726: aload 9
    //   728: aastore
    //   729: dup
    //   730: iconst_1
    //   731: aload 10
    //   733: aastore
    //   734: dup
    //   735: iconst_2
    //   736: aload 8
    //   738: aastore
    //   739: invokestatic 735	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   742: aload 9
    //   744: invokestatic 869	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   747: ifne +11 -> 758
    //   750: aload 10
    //   752: invokestatic 869	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   755: ifeq +32 -> 787
    //   758: ldc_w 614
    //   761: ldc_w 5830
    //   764: invokestatic 1196	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   767: aload_0
    //   768: aload_1
    //   769: ldc_w 5832
    //   772: aconst_null
    //   773: invokevirtual 686	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   776: ldc2_w 5749
    //   779: ldc_w 5751
    //   782: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   785: iconst_1
    //   786: ireturn
    //   787: aload_0
    //   788: getfield 753	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   791: aload 10
    //   793: invokestatic 5833	com/tencent/mm/pluginsdk/model/app/p:n	(Landroid/content/Context;Ljava/lang/String;)Z
    //   796: ifne +32 -> 828
    //   799: ldc_w 614
    //   802: ldc_w 5835
    //   805: invokestatic 1196	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   808: aload_0
    //   809: aload_1
    //   810: ldc_w 5837
    //   813: aconst_null
    //   814: invokevirtual 686	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   817: ldc2_w 5749
    //   820: ldc_w 5751
    //   823: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   826: iconst_1
    //   827: ireturn
    //   828: aload_0
    //   829: getfield 753	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   832: aload 10
    //   834: invokestatic 5840	com/tencent/mm/pluginsdk/model/app/p:aQ	(Landroid/content/Context;Ljava/lang/String;)[Landroid/content/pm/Signature;
    //   837: astore 11
    //   839: aload 11
    //   841: ifnull +194 -> 1035
    //   844: aload 11
    //   846: iconst_0
    //   847: aaload
    //   848: ifnull +187 -> 1035
    //   851: aload 11
    //   853: iconst_0
    //   854: aaload
    //   855: invokevirtual 5843	android/content/pm/Signature:toByteArray	()[B
    //   858: invokestatic 1545	com/tencent/mm/a/g:n	([B)Ljava/lang/String;
    //   861: astore 11
    //   863: aload 11
    //   865: ifnull +170 -> 1035
    //   868: aload 11
    //   870: aload 9
    //   872: invokevirtual 1726	java/lang/String:equalsIgnoreCase	(Ljava/lang/String;)Z
    //   875: ifeq +160 -> 1035
    //   878: aload_0
    //   879: getfield 753	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   882: invokevirtual 4479	android/content/Context:getPackageManager	()Landroid/content/pm/PackageManager;
    //   885: aload 10
    //   887: invokevirtual 5847	android/content/pm/PackageManager:getLaunchIntentForPackage	(Ljava/lang/String;)Landroid/content/Intent;
    //   890: astore 9
    //   892: aload 9
    //   894: ifnull +121 -> 1015
    //   897: new 580	android/os/Bundle
    //   900: dup
    //   901: invokespecial 581	android/os/Bundle:<init>	()V
    //   904: astore 10
    //   906: aload 10
    //   908: aload 8
    //   910: invokestatic 5850	com/tencent/mm/pluginsdk/model/app/p:g	(Landroid/os/Bundle;Ljava/lang/String;)V
    //   913: aload 9
    //   915: aload 10
    //   917: invokevirtual 1874	android/content/Intent:putExtras	(Landroid/os/Bundle;)Landroid/content/Intent;
    //   920: pop
    //   921: aload 9
    //   923: ldc_w 2204
    //   926: invokevirtual 2208	android/content/Intent:addFlags	(I)Landroid/content/Intent;
    //   929: pop
    //   930: new 580	android/os/Bundle
    //   933: dup
    //   934: invokespecial 581	android/os/Bundle:<init>	()V
    //   937: astore 8
    //   939: aload 8
    //   941: ldc_w 5852
    //   944: aload 7
    //   946: invokevirtual 1634	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   949: aload 8
    //   951: ldc_w 5854
    //   954: aload 6
    //   956: invokevirtual 1634	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   959: aload_0
    //   960: getfield 753	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   963: aload 9
    //   965: aconst_null
    //   966: new 128	com/tencent/mm/plugin/webview/ui/tools/jsapi/g$42
    //   969: dup
    //   970: aload_0
    //   971: aload_1
    //   972: invokespecial 5855	com/tencent/mm/plugin/webview/ui/tools/jsapi/g$42:<init>	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/g;Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;)V
    //   975: aload 8
    //   977: invokestatic 5858	com/tencent/mm/pluginsdk/model/app/g:a	(Landroid/content/Context;Landroid/content/Intent;Ljava/lang/String;Lcom/tencent/mm/pluginsdk/model/app/g$c;Landroid/os/Bundle;)Z
    //   980: pop
    //   981: ldc2_w 5749
    //   984: ldc_w 5751
    //   987: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   990: iconst_1
    //   991: ireturn
    //   992: astore 6
    //   994: ldc_w 614
    //   997: ldc_w 5860
    //   1000: iconst_1
    //   1001: anewarray 4	java/lang/Object
    //   1004: dup
    //   1005: iconst_0
    //   1006: aload 6
    //   1008: invokevirtual 1864	java/lang/Exception:getMessage	()Ljava/lang/String;
    //   1011: aastore
    //   1012: invokestatic 661	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   1015: aload_0
    //   1016: aload_1
    //   1017: ldc_w 5755
    //   1020: aconst_null
    //   1021: invokevirtual 686	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   1024: ldc2_w 5749
    //   1027: ldc_w 5751
    //   1030: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1033: iconst_1
    //   1034: ireturn
    //   1035: ldc_w 614
    //   1038: ldc_w 5862
    //   1041: invokestatic 1196	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   1044: aload_0
    //   1045: aload_1
    //   1046: ldc_w 5864
    //   1049: aconst_null
    //   1050: invokevirtual 686	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   1053: ldc2_w 5749
    //   1056: ldc_w 5751
    //   1059: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1062: iconst_1
    //   1063: ireturn
    //   1064: aload_0
    //   1065: aload_1
    //   1066: ldc_w 5866
    //   1069: aconst_null
    //   1070: invokevirtual 686	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   1073: ldc2_w 5749
    //   1076: ldc_w 5751
    //   1079: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   1082: iconst_1
    //   1083: ireturn
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	1084	0	this	g
    //   0	1084	1	parami	i
    //   27	634	2	i	int
    //   320	160	3	j	int
    //   159	33	4	l	long
    //   41	914	6	localObject1	Object
    //   992	15	6	localException1	Exception
    //   185	118	7	localObject2	Object
    //   437	1	7	localException2	Exception
    //   451	494	7	localObject3	Object
    //   226	79	8	localObject4	Object
    //   456	15	8	localException3	Exception
    //   712	264	8	localObject5	Object
    //   149	815	9	localObject6	Object
    //   132	784	10	localObject7	Object
    //   837	32	11	localObject8	Object
    // Exception table:
    //   from	to	target	type
    //   217	228	437	java/lang/Exception
    //   232	243	437	java/lang/Exception
    //   247	257	437	java/lang/Exception
    //   261	292	437	java/lang/Exception
    //   331	338	456	java/lang/Exception
    //   878	892	992	java/lang/Exception
    //   897	981	992	java/lang/Exception
  }
  
  public final boolean an(i parami)
  {
    GMTrace.i(16070962315264L, 119738);
    String str1 = (String)parami.nSp.get("packageName");
    if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
    {
      w.e("MicroMsg.MsgHandler", "doWriteCommData fail, packageName is null");
      a(parami, "write_comm_data:fail", null);
      GMTrace.o(16070962315264L, 119738);
      return true;
    }
    String str2 = (String)parami.nSp.get("data");
    boolean bool = this.context.getSharedPreferences(com.tencent.mm.sdk.platformtools.ab.getPackageName() + "_comm_preferences", 0).edit().putString(str1, str2).commit();
    int i;
    if (str2 == null)
    {
      i = 0;
      w.i("MicroMsg.MsgHandler", "doWriteCommData, ret = %b, packageName = %s, data length = %d", new Object[] { Boolean.valueOf(bool), str1, Integer.valueOf(i) });
      if (!bool) {
        break label202;
      }
      a(parami, "write_comm_data:ok", null);
    }
    for (;;)
    {
      GMTrace.o(16070962315264L, 119738);
      return true;
      i = str2.length();
      break;
      label202:
      a(parami, "write_comm_data:fail", null);
    }
  }
  
  public final boolean ao(i parami)
  {
    GMTrace.i(12186298613760L, 90795);
    Object localObject = (String)parami.nSp.get("url");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      w.e("MicroMsg.MsgHandler", "doOpenUrlByExtBrowser fail, url is null");
      a(parami, "open_url_by_ext_browser:fail", null);
      GMTrace.o(12186298613760L, 90795);
      return true;
    }
    localObject = new Intent("android.intent.action.VIEW", Uri.parse((String)localObject));
    ((Intent)localObject).addFlags(268435456);
    try
    {
      this.context.startActivity((Intent)localObject);
      a(parami, "open_url_by_ext_browser:ok", null);
      GMTrace.o(12186298613760L, 90795);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "doOpenUrlByExtBrowser fail, e = " + localException.getMessage());
        a(parami, "open_url_by_ext_browser:fail", null);
      }
    }
  }
  
  public final boolean ap(i parami)
  {
    GMTrace.i(16071096532992L, 119739);
    Object localObject2 = (String)parami.nSp.get("gameId");
    Object localObject1 = localObject2;
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2)) {
      localObject1 = (String)parami.nSp.get("appId");
    }
    w.i("MicroMsg.MsgHandler", "openGameDetail, appid = %s", new Object[] { localObject1 });
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
    {
      a(parami, "openGameDetail:fail", null);
      GMTrace.o(16071096532992L, 119739);
      return true;
    }
    localObject2 = new gk();
    ((gk)localObject2).eJy.appId = ((String)localObject1);
    ((gk)localObject2).eJy.scene = 5;
    ((gk)localObject2).eJy.actionCode = 2;
    ((gk)localObject2).eJy.context = this.context;
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
    a(parami, "openGameDetail:ok", null);
    GMTrace.o(16071096532992L, 119739);
    return true;
  }
  
  public final boolean aq(i parami)
  {
    GMTrace.i(16071230750720L, 119740);
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("jumpView"), 0);
    int j = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("jumpType"), 0);
    String str = (String)parami.nSp.get("extInfo");
    ld localld = new ld();
    localld.ePt.ePu = i;
    localld.ePt.jumpType = j;
    localld.ePt.extraInfo = str;
    localld.ePt.context = this.context;
    com.tencent.mm.sdk.b.a.vgX.m(localld);
    a(parami, "gameCenterJump:ok", null);
    GMTrace.o(16071230750720L, 119740);
    return true;
  }
  
  public final boolean ar(i parami)
  {
    GMTrace.i(16071364968448L, 119741);
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("downloaderType"), 0);
    String str = (String)parami.nSp.get("countryCode");
    int j = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("showAllLog"), 0);
    gm localgm = new gm();
    localgm.eJC.eJD = i;
    localgm.eJC.eJE = j;
    localgm.eJC.countryCode = str;
    com.tencent.mm.sdk.b.a.vgX.m(localgm);
    a(parami, "setGameDebugConfig:ok", null);
    GMTrace.o(16071364968448L, 119741);
    return true;
  }
  
  public final boolean as(final i parami)
  {
    GMTrace.i(16071499186176L, 119742);
    String str = (String)parami.nSp.get("type");
    w.v("MicroMsg.MsgHandler", "doGeoLocation, geoType = %s", new Object[] { str });
    if ((!com.tencent.mm.sdk.platformtools.bg.nm(str)) && (!ieY.contains(str)))
    {
      w.e("MicroMsg.MsgHandler", "doGeoLocation fail, unsupported type = %s", new Object[] { str });
      a(parami, "geo_location:fail_unsupported_type", null);
      GMTrace.o(16071499186176L, 119742);
      return true;
    }
    this.fJm = com.tencent.mm.modelgeo.c.Ir();
    if (this.fJm == null)
    {
      w.e("MicroMsg.MsgHandler", "doGeoLocation fail, iGetLocation is null");
      a(parami, "geo_location:fail", null);
      GMTrace.o(16071499186176L, 119742);
      return true;
    }
    parami = (String)this.rSz.nSp.get("type");
    if (this.ifj == null) {
      this.ifj = new com.tencent.mm.modelgeo.a.a()
      {
        public final boolean a(boolean paramAnonymousBoolean, float paramAnonymousFloat1, float paramAnonymousFloat2, int paramAnonymousInt, double paramAnonymousDouble1, double paramAnonymousDouble2, double paramAnonymousDouble3)
        {
          GMTrace.i(19446806609920L, 144890);
          if (!paramAnonymousBoolean)
          {
            GMTrace.o(19446806609920L, 144890);
            return true;
          }
          w.v("MicroMsg.MsgHandler", "doGeoLocation.onGetLocation, fLongitude:%f, fLatitude:%f, locType:%d, speed:%f, accuracy:%f", new Object[] { Float.valueOf(paramAnonymousFloat1), Float.valueOf(paramAnonymousFloat2), Integer.valueOf(paramAnonymousInt), Double.valueOf(paramAnonymousDouble1), Double.valueOf(paramAnonymousDouble2) });
          if (g.this.fJm != null) {
            g.this.fJm.c(g.this.ifj);
          }
          if (g.this.ifj == null)
          {
            w.w("MicroMsg.MsgHandler", "already callback");
            GMTrace.o(19446806609920L, 144890);
            return false;
          }
          g.this.ifj = null;
          HashMap localHashMap = new HashMap();
          localHashMap.put("longitude", Float.valueOf(paramAnonymousFloat1));
          g.this.rSZ = String.valueOf(paramAnonymousFloat1);
          localHashMap.put("latitude", Float.valueOf(paramAnonymousFloat2));
          g.this.rSY = String.valueOf(paramAnonymousFloat2);
          localHashMap.put("speed", Double.valueOf(paramAnonymousDouble1));
          localHashMap.put("accuracy", Double.valueOf(paramAnonymousDouble2));
          localHashMap.put("type", parami);
          g.this.a(g.this.rSz, "geo_location:ok", localHashMap);
          GMTrace.o(19446806609920L, 144890);
          return false;
        }
      };
    }
    if (this.ifk == null) {
      this.ifk = new com.tencent.mm.sdk.platformtools.ae(Looper.getMainLooper());
    }
    this.ifk.postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18149860704256L, 135227);
        if (g.this.fJm != null) {
          g.this.fJm.c(g.this.ifj);
        }
        if (g.this.ifj == null)
        {
          w.w("MicroMsg.MsgHandler", "already callback");
          GMTrace.o(18149860704256L, 135227);
          return;
        }
        g.this.ifj = null;
        g.this.a(g.this.rSz, "geo_location:fail_timeout", null);
        GMTrace.o(18149860704256L, 135227);
      }
    }, 20000L);
    if ((com.tencent.mm.sdk.platformtools.bg.nm(parami)) || (parami.equalsIgnoreCase("gcj02"))) {
      this.fJm.b(this.ifj, false);
    }
    for (;;)
    {
      GMTrace.o(16071499186176L, 119742);
      return true;
      if (parami.equalsIgnoreCase("wgs84"))
      {
        this.fJm.a(this.ifj, false);
      }
      else
      {
        w.e("MicroMsg.MsgHandler", "startGeoLocation, should not reach here !!!!!");
        this.ifj = null;
        a(this.rSz, "geo_location:fail_unsupported_type_startgeo", null);
      }
    }
  }
  
  public final boolean at(i parami)
  {
    GMTrace.i(16071633403904L, 119743);
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    w.i("MicroMsg.MsgHandler", "doOpenWXCredit JSOAUTH");
    if ((this.context instanceof MMActivity))
    {
      parami = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
      parami.ePM = 6;
      com.tencent.mm.pluginsdk.wallet.g.b((MMActivity)this.context, parami, 9, this);
    }
    GMTrace.o(16071633403904L, 119743);
    return true;
  }
  
  public final boolean au(final i parami)
  {
    GMTrace.i(16071767621632L, 119744);
    if (this.rSC == null)
    {
      w.e("MicroMsg.MsgHandler", "doSendServiceAppMsg fail, jsapiArgs is null");
      a(parami, "send_service_app_msg:fail", null);
      GMTrace.o(16071767621632L, 119744);
      return true;
    }
    if (!this.rSC.getBoolean("isFromService", false))
    {
      w.e("MicroMsg.MsgHandler", "doSendServiceAppMsg fail, not from service");
      a(parami, "send_service_app_msg:fail", null);
      GMTrace.o(16071767621632L, 119744);
      return true;
    }
    final Object localObject = this.rSC.getString("jsapi_args_appid");
    final String str1 = this.rSC.getString("sendAppMsgToUserName");
    k.a(parami.rUT, false, null, (String)localObject);
    this.eLU = h(parami);
    if (this.eLU == null)
    {
      w.e("MicroMsg.MsgHandler", "doSendServiceAppMsg fail, appmsg is null");
      a(parami, "send_service_app_msg:fail", null);
      GMTrace.o(16071767621632L, 119744);
      return true;
    }
    localObject = com.tencent.mm.pluginsdk.model.app.g.aP((String)localObject, true);
    if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
    {
      w.e("MicroMsg.MsgHandler", "toUser is null");
      a(parami, "send_service_app_msg:fail", null);
      GMTrace.o(16071767621632L, 119744);
      return true;
    }
    final String str2 = (String)parami.nSp.get("img_url");
    com.tencent.mm.plugin.report.service.g.ork.i(10923, new Object[] { Integer.valueOf(13), ((com.tencent.mm.pluginsdk.model.app.f)localObject).field_appId, Integer.valueOf(1) });
    if (com.tencent.mm.sdk.platformtools.bg.nm(str2))
    {
      a((com.tencent.mm.pluginsdk.model.app.f)localObject, "", str1, str2, null, null, null, null);
      com.tencent.mm.ui.base.h.bm(this.context, this.context.getString(R.l.cUq));
      a(parami, "send_service_app_msg:ok", null);
      cF(parami);
    }
    for (;;)
    {
      GMTrace.o(16071767621632L, 119744);
      return true;
      final com.tencent.mm.ui.base.r localr = com.tencent.mm.ui.base.h.a(this.context, this.context.getResources().getString(R.l.cUt), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(19444793344000L, 144875);
          com.tencent.mm.ao.n.IY().jX(str2);
          g.this.a(parami, "send_service_app_msg:fail", null);
          GMTrace.o(19444793344000L, 144875);
        }
      });
      com.tencent.mm.ao.n.IY().a(str2, new com.tencent.mm.ao.b.c()
      {
        public final void n(Bitmap paramAnonymousBitmap)
        {
          GMTrace.i(19425465991168L, 144731);
          if (localr != null) {
            localr.dismiss();
          }
          g.this.a(localObject, "", str1, str2, null, null, null, null);
          g.this.a(parami, "send_service_app_msg:ok", null);
          g.this.cF(parami);
          GMTrace.o(19425465991168L, 144731);
        }
      });
    }
  }
  
  public final boolean av(i parami)
  {
    GMTrace.i(12186567049216L, 90797);
    Object localObject = "";
    try
    {
      str = this.rEM.Zi();
      localObject = str;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        String str;
        HashMap localHashMap;
        w.w("MicroMsg.MsgHandler", "JSOAUTH exception in get currentUrl" + localException1.getMessage());
      }
      a(parami, "system:access_denied", null);
      GMTrace.o(12186567049216L, 90797);
    }
    w.i("MicroMsg.MsgHandler", "currentUrl %s", new Object[] { localObject });
    if ((((String)localObject).startsWith("https://support.weixin.qq.com/security/")) || (((String)localObject).startsWith("https://support.wechat.com/security/")) || (((String)localObject).startsWith("https://weixin110.qq.com/security/")))
    {
      localObject = "";
      localHashMap = new HashMap();
      try
      {
        w.i("MicroMsg.MsgHandler", "getDeviceInfo");
        str = Base64.encodeToString(bFB(), 0);
        localObject = str;
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          w.e("MicroMsg.MsgHandler", "device info get error %s", new Object[] { localException2.getMessage() });
          w.printErrStackTrace("MicroMsg.MsgHandler", localException2, "", new Object[0]);
        }
      }
      localHashMap.put("securityInfo", localObject);
      a(parami, "mmsf0001:ok", localHashMap);
      GMTrace.o(12186567049216L, 90797);
      return true;
    }
    return true;
  }
  
  public final boolean aw(i parami)
  {
    Intent localIntent = null;
    GMTrace.i(12186701266944L, 90798);
    String str1;
    String str2;
    if ((this.context instanceof MMActivity))
    {
      str1 = (String)parami.nSp.get("tousername");
      str2 = (String)parami.nSp.get("extmsg");
      w.d("MicroMsg.MsgHandler", "doJumpToBizProfile %s, %s", new Object[] { str1, str2 });
    }
    for (;;)
    {
      try
      {
        parami = this.rEM.Zi();
        localIntent = new Intent();
        localIntent.putExtra("toUserName", str1);
        localIntent.putExtra("extInfo", str2);
        localIntent.putExtra("fromURL", parami);
        localIntent.putExtra("source", 2);
        com.tencent.mm.plugin.webview.a.a.hnH.a(localIntent, this, (MMActivity)this.context);
        GMTrace.o(12186701266944L, 90798);
        return true;
      }
      catch (RemoteException parami)
      {
        w.w("MicroMsg.MsgHandler", "JSOAUTH exception in get currentUrl" + parami.getMessage());
        parami = localIntent;
        continue;
      }
      a(parami, "jump_to_biz_profile:fail", null);
    }
  }
  
  public final boolean ax(i parami)
  {
    GMTrace.i(16071901839360L, 119745);
    w.i("MicroMsg.MsgHandler", "doChooseCard JSOAUTH");
    String str1 = (String)parami.nSp.get("app_id");
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("location_id"), 0);
    String str2 = (String)parami.nSp.get("sign_type");
    String str3 = (String)parami.nSp.get("card_sign");
    int j = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("time_stamp"), 0);
    String str4 = (String)parami.nSp.get("nonce_str");
    String str5 = (String)parami.nSp.get("card_id");
    String str6 = (String)parami.nSp.get("card_type");
    if ("INVOICE".equalsIgnoreCase(str6))
    {
      a(parami, "choose_card:fail", new HashMap());
      GMTrace.o(16071901839360L, 119745);
      return false;
    }
    int k = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("can_multi_select"), 0);
    k.a(parami.rUT, false, null, str1);
    parami = new Intent();
    parami.putExtra("app_id", str1);
    parami.putExtra("shop_id", i);
    parami.putExtra("sign_type", str2);
    parami.putExtra("card_sign", str3);
    parami.putExtra("time_stamp", j);
    parami.putExtra("nonce_str", str4);
    parami.putExtra("card_tp_id", str5);
    parami.putExtra("card_type", str6);
    parami.putExtra("can_multi_select", k);
    parami.putExtra("key_from_scene", 7);
    if ((this.context instanceof MMActivity))
    {
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.a(this.context, "card", ".ui.CardListSelectedUI", parami, 13, false);
    }
    GMTrace.o(16071901839360L, 119745);
    return true;
  }
  
  public final boolean ay(i parami)
  {
    GMTrace.i(16072036057088L, 119746);
    w.i("MicroMsg.MsgHandler", "doChooseInvoice JSOAUTH");
    String str1 = (String)parami.nSp.get("appId");
    String str2 = (String)parami.nSp.get("signType");
    String str3 = (String)parami.nSp.get("cardSign");
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("timestamp"), 0);
    parami = (String)parami.nSp.get("nonceStr");
    Intent localIntent = new Intent();
    localIntent.putExtra("app_id", str1);
    localIntent.putExtra("sign_type", str2);
    localIntent.putExtra("card_sign", str3);
    localIntent.putExtra("time_stamp", i);
    localIntent.putExtra("nonce_str", parami);
    localIntent.putExtra("can_multi_select", 1);
    localIntent.putExtra("card_type", "INVOICE");
    localIntent.putExtra("key_from_scene", 7);
    if ((this.context instanceof MMActivity))
    {
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.a(this.context, "card", ".ui.CardListSelectedUI", localIntent, 36, false);
    }
    GMTrace.o(16072036057088L, 119746);
    return true;
  }
  
  public final boolean az(i parami)
  {
    GMTrace.i(16072170274816L, 119747);
    String str1 = (String)parami.nSp.get("card_list");
    String str2 = (String)parami.nSp.get("src_username");
    String str3 = (String)parami.nSp.get("url");
    String str4 = (String)parami.nSp.get("consumedCardId");
    String str5 = (String)parami.nSp.get("tempalate_id");
    w.i("MicroMsg.MsgHandler", "doBatchAddCard consumedCardId %s", new Object[] { str4 });
    w.i("MicroMsg.MsgHandler", "doBatchAddCard %s", new Object[] { parami.nSp.toString() });
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("webview_scene"), 0);
    int j = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("stastic_scene"), 0);
    if (i == 25) {}
    for (i = 16;; i = 7)
    {
      w.i("MicroMsg.MsgHandler", "doBatchAddCard src_username is %s, scene is %d, stasticScene is %d", new Object[] { str2, Integer.valueOf(i), Integer.valueOf(j) });
      parami = new Intent();
      parami.putExtra("key_in_card_list", str1);
      parami.putExtra("key_from_scene", i);
      parami.putExtra("key_stastic_scene", j);
      parami.putExtra("src_username", str2);
      parami.putExtra("js_url", str3);
      parami.putExtra("key_consumed_card_id", str4);
      parami.putExtra("key_template_id", str5);
      if ((this.context instanceof MMActivity))
      {
        ((MMActivity)this.context).vKC = this;
        com.tencent.mm.bj.d.a(this.context, "card", ".ui.CardAddEntranceUI", parami, 16, false);
      }
      GMTrace.o(16072170274816L, 119747);
      return true;
    }
  }
  
  public final boolean b(final i parami)
  {
    GMTrace.i(16065862041600L, 119700);
    w.d("MicroMsg.MsgHandler", "doResendRemittanceMsg");
    final String str1 = (String)parami.nSp.get("transactionId");
    final String str2 = (String)parami.nSp.get("receiverName");
    if ((!com.tencent.mm.sdk.platformtools.bg.nm(str1)) && (!com.tencent.mm.sdk.platformtools.bg.nm(str2))) {
      com.tencent.mm.ui.base.h.a(this.context, R.l.edz, R.l.cUl, R.l.edA, R.l.cSk, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12250857340928L, 91276);
          paramAnonymousDialogInterface = new Intent();
          paramAnonymousDialogInterface.putExtra("transaction_id", str1);
          paramAnonymousDialogInterface.putExtra("receiver_name", str2);
          com.tencent.mm.bj.d.b(g.this.context, "remittance", ".ui.RemittanceResendMsgUI", paramAnonymousDialogInterface);
          g.this.a(parami, "doResendRemittanceMsg:ok", null);
          GMTrace.o(12250857340928L, 91276);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(12176634937344L, 90723);
          GMTrace.o(12176634937344L, 90723);
        }
      });
    }
    for (;;)
    {
      GMTrace.o(16065862041600L, 119700);
      return true;
      a(parami, "doResendRemittanceMsg:fail", null);
    }
  }
  
  public final boolean b(final i parami, final a parama)
  {
    GMTrace.i(12198915080192L, 90889);
    w.i("MicroMsg.MsgHandler", "doOauthAuthorize!");
    Object localObject = (String)parami.nSp.get("scope");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      w.e("MicroMsg.MsgHandler", "scope is null!");
      a(parami, "authorize:fail", null);
      parama.Wd();
      GMTrace.o(12198915080192L, 90889);
      return true;
    }
    try
    {
      String str1 = this.rEM.Zi();
      str1 = com.tencent.mm.sdk.platformtools.bg.nl(this.rSL.Ms(str1));
      if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
      {
        w.e("MicroMsg.MsgHandler", "appId is null!");
        a(parami, "authorize:fail", null);
        parama.Wd();
        GMTrace.o(12198915080192L, 90889);
        return false;
      }
    }
    catch (Exception localException)
    {
      final String str2;
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localException.getMessage() });
        str2 = null;
      }
      LinkedList localLinkedList = new LinkedList();
      try
      {
        localObject = new JSONArray((String)localObject);
        int i = 0;
        while (i < ((JSONArray)localObject).length())
        {
          localLinkedList.add(((JSONArray)localObject).optString(i));
          i += 1;
        }
        com.tencent.mm.y.at.wS().a(new com.tencent.mm.jsapi.a.a(str2, localLinkedList, new com.tencent.mm.jsapi.a.a.a() {}), 0);
      }
      catch (Exception parama)
      {
        w.e("MicroMsg.MsgHandler", "Exception %s", new Object[] { parama.getMessage() });
        a(parami, "authorize:fail", null);
        GMTrace.o(12198915080192L, 90889);
        return true;
      }
      GMTrace.o(12198915080192L, 90889);
    }
    return true;
  }
  
  public final boolean b(i parami, JsapiPermissionWrapper paramJsapiPermissionWrapper)
  {
    GMTrace.i(12182540517376L, 90767);
    this.eLU = h(parami);
    if (this.eLU == null)
    {
      w.e("MicroMsg.MsgHandler", "doSendAppMsg fail, appmsg is null");
      a(parami, "send_app_msg:fail", null);
      GMTrace.o(12182540517376L, 90767);
      return true;
    }
    Object localObject1 = bFw().getString("scene");
    bFw().remove("scene");
    if (!"friend".equals(localObject1)) {
      k.a(parami.rUT, Mz("sendAppMessage"), null, (String)parami.nSp.get("appid"));
    }
    w.i("MicroMsg.MsgHandler", "send appmsg scene is '%s'", new Object[] { localObject1 });
    if ("connector".equals(localObject1))
    {
      parami = bFx();
      w.i("MicroMsg.MsgHandler", "directly send to %s", new Object[] { parami });
      a(1, -1, new Intent().putExtra("Select_Conv_User", parami));
      GMTrace.o(12182540517376L, 90767);
      return true;
    }
    Object localObject2;
    if ("favorite".equals(localObject1))
    {
      w.i("MicroMsg.MsgHandler", "favorite url");
      localObject1 = new cf();
      paramJsapiPermissionWrapper = new com.tencent.mm.plugin.webview.model.b.a();
      parami = (String)this.rSz.nSp.get("link");
      localObject2 = ak.zA(parami);
      w.i("MicroMsg.MsgHandler", "rawurl:[%s], shareurl:[%s]", new Object[] { parami, localObject2 });
      paramJsapiPermissionWrapper.url = ((String)localObject2);
      paramJsapiPermissionWrapper.thumbUrl = ((String)this.rSz.nSp.get("img_url"));
      paramJsapiPermissionWrapper.title = ((String)this.rSz.nSp.get("title"));
      paramJsapiPermissionWrapper.desc = ((String)this.rSz.nSp.get("desc"));
      paramJsapiPermissionWrapper.eSd = ((String)this.rSz.nSp.get("appid"));
      if (this.rSC == null) {
        break label1755;
      }
      parami = this.rSC.getString("key_snsad_statextstr");
      paramJsapiPermissionWrapper.eTv = parami;
    }
    for (;;)
    {
      try
      {
        localObject2 = this.rEM.d(18, null);
        if (localObject2 != null)
        {
          String str = com.tencent.mm.y.u.gy(com.tencent.mm.sdk.platformtools.bg.nl(((Bundle)localObject2).getString("KPublisherId")));
          u.b localb = com.tencent.mm.y.u.Av().p(str, true);
          localb.o("sendAppMsgScene", Integer.valueOf(2));
          localb.o("preChatName", ((Bundle)localObject2).getString("preChatName"));
          localb.o("preMsgIndex", Integer.valueOf(((Bundle)localObject2).getInt("preMsgIndex")));
          localb.o("prePublishId", ((Bundle)localObject2).getString("prePublishId"));
          localb.o("preUsername", ((Bundle)localObject2).getString("preUsername"));
          localb.o("getA8KeyScene", Integer.valueOf(((Bundle)localObject2).getInt("getA8KeyScene")));
          localb.o("referUrl", ((Bundle)localObject2).getString("referUrl"));
          if (!com.tencent.mm.sdk.platformtools.bg.nm(parami)) {
            localb.o("adExtStr", parami);
          }
          ((cf)localObject1).eDv.eDA = str;
        }
      }
      catch (RemoteException parami)
      {
        w.e("MicroMsg.MsgHandler", "try to report error, %s", new Object[] { parami });
        continue;
        dI(3, 2);
        a(this.rSz, "send_fav_msg:fail", null);
      }
      if ((this.context instanceof Activity))
      {
        ((cf)localObject1).eDv.activity = ((Activity)this.context);
        ((cf)localObject1).eDv.eDC = 36;
      }
      com.tencent.mm.plugin.webview.model.b.a((cf)localObject1, paramJsapiPermissionWrapper);
      ((cf)localObject1).eDv.eDE = new com.tencent.mm.ui.snackbar.b.c()
      {
        public final void aDT()
        {
          GMTrace.i(12254212784128L, 91301);
          GMTrace.o(12254212784128L, 91301);
        }
        
        public final void onHide()
        {
          GMTrace.i(12254078566400L, 91300);
          g.this.a(g.this.rSz, "send_app_msg:ok", null);
          GMTrace.o(12254078566400L, 91300);
        }
        
        public final void onShow()
        {
          GMTrace.i(12253944348672L, 91299);
          GMTrace.o(12253944348672L, 91299);
        }
      };
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      if (((cf)localObject1).eDw.ret == 0)
      {
        dI(3, 1);
        try
        {
          parami = this.rEM.d(85, null);
          a(paramJsapiPermissionWrapper.eSd, paramJsapiPermissionWrapper.thumbUrl, 4, parami);
        }
        catch (RemoteException parami)
        {
          w.e("MicroMsg.MsgHandler", "invokeAsResult error : %s", new Object[] { parami });
        }
        break;
      }
      break;
      if ("enterprise".equals(localObject1))
      {
        paramJsapiPermissionWrapper = bFx();
        localObject1 = new HashMap();
        ((HashMap)localObject1).put("img_url", (String)parami.nSp.get("img_url"));
        ((HashMap)localObject1).put("desc", (String)parami.nSp.get("desc"));
        ((HashMap)localObject1).put("title", (String)parami.nSp.get("title"));
        ((HashMap)localObject1).put("src_username", (String)parami.nSp.get("src_username"));
        ((HashMap)localObject1).put("src_displayname", (String)parami.nSp.get("src_displayname"));
        w.i("MicroMsg.MsgHandler", "doSendAppMessage, img_url=%s, desc=%s, title=%s", new Object[] { (String)parami.nSp.get("img_url"), (String)parami.nSp.get("desc"), (String)parami.nSp.get("title") });
        if (com.tencent.mm.af.f.dL(paramJsapiPermissionWrapper))
        {
          parami = new Intent();
          parami.setClassName(this.context, "com.tencent.mm.ui.bizchat.BizChatSelectConversationUI");
          parami.putExtra("enterprise_biz_name", paramJsapiPermissionWrapper);
          parami.putExtra("biz_chat_scene", 1);
          parami.putExtra("enterprise_extra_params", (Serializable)localObject1);
          if (!(this.context instanceof MMActivity)) {
            break;
          }
          ((MMActivity)this.context).vKC = this;
          ((MMActivity)this.context).a(this, parami, 37);
          break;
        }
        if (!com.tencent.mm.af.f.iP(paramJsapiPermissionWrapper)) {
          break;
        }
        parami = new Intent();
        parami.putExtra("enterprise_biz_name", paramJsapiPermissionWrapper);
        parami.putExtra("enterprise_scene", 3);
        parami.putExtra("enterprise_extra_params", (Serializable)localObject1);
        if (!(this.context instanceof MMActivity)) {
          break;
        }
        ((MMActivity)this.context).vKC = this;
        com.tencent.mm.bj.d.b(this.context, "brandservice", ".ui.EnterpriseBizContactPlainListUI", parami, 37);
        break;
      }
      if ("wework".equals(localObject1))
      {
        bq(parami);
        break;
      }
      if ("facebook".equals(localObject1))
      {
        paramJsapiPermissionWrapper = new Intent();
        paramJsapiPermissionWrapper.putExtra("title", (String)parami.nSp.get("title"));
        paramJsapiPermissionWrapper.putExtra("digest", (String)parami.nSp.get("desc"));
        paramJsapiPermissionWrapper.putExtra("img", (String)parami.nSp.get("img_url"));
        paramJsapiPermissionWrapper.putExtra("link", (String)parami.nSp.get("link"));
        paramJsapiPermissionWrapper.setClassName(this.context, "com.tencent.mm.plugin.accountsync.ui.ShareToFacebookRedirectUI");
        this.context.startActivity(paramJsapiPermissionWrapper);
        a(parami, "shareQZone:ok", null);
        break;
      }
      if ("qq".equals(localObject1))
      {
        br(parami);
        break;
      }
      w.i("MicroMsg.MsgHandler", "select user to send");
      localObject1 = new HashMap();
      if (a(parami, paramJsapiPermissionWrapper.eS(89))) {
        this.eLU = h(parami);
      }
      if (paramJsapiPermissionWrapper.eS(290)) {
        this.rSz.nSp.put("share_callback_with_scene", Boolean.valueOf(true));
      }
      for (;;)
      {
        ((HashMap)localObject1).put("img_url", (String)parami.nSp.get("img_url"));
        ((HashMap)localObject1).put("desc", (String)parami.nSp.get("desc"));
        ((HashMap)localObject1).put("title", (String)parami.nSp.get("title"));
        ((HashMap)localObject1).put("url", (String)parami.nSp.get("url"));
        w.i("MicroMsg.MsgHandler", "doSendAppMessage, img_url=%s, desc=%s, title=%s, url=%s", new Object[] { (String)parami.nSp.get("img_url"), (String)parami.nSp.get("desc"), (String)parami.nSp.get("title"), (String)parami.nSp.get("url") });
        com.tencent.mm.plugin.report.service.g.ork.a(157L, 5L, 1L, false);
        paramJsapiPermissionWrapper = new Intent();
        paramJsapiPermissionWrapper.putExtra("Select_Conv_Type", 3);
        paramJsapiPermissionWrapper.putExtra("scene_from", 2);
        paramJsapiPermissionWrapper.putExtra("mutil_select_is_ret", true);
        paramJsapiPermissionWrapper.putExtra("webview_params", (Serializable)localObject1);
        paramJsapiPermissionWrapper.putExtra("Retr_Msg_Type", 2);
        if (!(this.context instanceof MMActivity)) {
          break;
        }
        parami.rUT.put("Internal@AsyncReport", Boolean.valueOf(true));
        if (com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("open_from_scene"), 0) == 4) {
          com.tencent.mm.plugin.report.service.g.ork.i(10651, new Object[] { Integer.valueOf(5), Integer.valueOf(1), Integer.valueOf(0) });
        }
        com.tencent.mm.bj.d.a((MMActivity)this.context, ".ui.transmit.SelectConversationUI", paramJsapiPermissionWrapper, 1, this);
        break;
        this.rSz.nSp.put("share_callback_with_scene", Boolean.valueOf(false));
      }
      label1755:
      parami = null;
    }
  }
  
  public final boolean b(i parami, boolean paramBoolean)
  {
    GMTrace.i(16067741089792L, 119714);
    ((MMActivity)this.context).vKC = this;
    int i;
    Object localObject2;
    if (paramBoolean)
    {
      i = 49;
      Bundle localBundle = new Bundle();
      localBundle.putBoolean("k_need_signature", true);
      localBundle.putString("k_user_name", com.tencent.mm.y.q.zH());
      localBundle.putInt("k_server_scene", 2);
      localBundle.putBoolean("key_is_need_video", paramBoolean);
      localBundle.putBoolean("is_check_dyncfg", false);
      localBundle.putString("key_function_name", parami.rUU);
      localBundle.putInt("key_business_type", 1);
      localObject1 = Zi();
      w.v("MicroMsg.MsgHandler", "alvinluo facedetect current url: %s", new Object[] { localObject1 });
      localObject2 = pi((String)localObject1);
      localObject1 = localObject2;
      if (localObject2 == null) {
        localObject1 = (String)parami.nSp.get("appId");
      }
      localBundle.putString("k_app_id", (String)localObject1);
      localBundle.putString("request_verify_pre_info", (String)parami.nSp.get("request_verify_pre_info"));
      localObject2 = new ng();
      ((ng)localObject2).eSr.context = this.context;
      ((ng)localObject2).eSr.eSt = i;
      ((ng)localObject2).eSr.extras = localBundle;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
      w.i("MicroMsg.MsgHandler", "start face detect event result: %b", new Object[] { Boolean.valueOf(((ng)localObject2).eSs.eSu) });
      if (!((ng)localObject2).eSs.eSu)
      {
        ((MMActivity)this.context).vKC = null;
        if (!paramBoolean) {
          break label337;
        }
      }
    }
    label337:
    for (Object localObject1 = "requestWxFacePictureVerifyUnionVideo:fail";; localObject1 = "requestWxFacePictureVerify:fail")
    {
      a(parami, (String)localObject1, i.ac(((ng)localObject2).eSs.extras));
      GMTrace.o(16067741089792L, 119714);
      return true;
      i = 48;
      break;
    }
  }
  
  public final boolean bA(i parami)
  {
    GMTrace.i(12193546371072L, 90849);
    w.d("MicroMsg.MsgHandler", "doSelectPedometerSource");
    if ((this.context != null) && ((this.context instanceof MMActivity)))
    {
      ((MMActivity)this.context).vKC = this;
      parami = new Intent();
      com.tencent.mm.bj.d.b(this.context, "exdevice", ".ui.ExdeviceAddDataSourceUI", parami, 26);
    }
    for (;;)
    {
      GMTrace.o(12193546371072L, 90849);
      return true;
      w.e("MicroMsg.MsgHandler", "context is null");
      a(parami, "selectPedometerSource:fail", null);
    }
  }
  
  public final boolean bB(i parami)
  {
    GMTrace.i(16074586193920L, 119765);
    w.i("MicroMsg.MsgHandler", "hy: doGetIbgPrepayRequest");
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    if ((this.context instanceof MMActivity))
    {
      com.tencent.mm.pluginsdk.wallet.f localf = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
      localf.tIM = 2;
      com.tencent.mm.pluginsdk.wallet.g.a((MMActivity)this.context, localf, 27, this);
      long l = com.tencent.mm.sdk.platformtools.bg.getLong((String)parami.nSp.get("message_id"), 0L);
      int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("message_index"), 0);
      com.tencent.mm.plugin.report.service.g.ork.i(10593, new Object[] { localf.ePK, localf.appId, Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(localf.ePL), localf.url });
      this.rSR = cG(parami);
    }
    GMTrace.o(16074586193920L, 119765);
    return true;
  }
  
  public final boolean bC(i parami)
  {
    GMTrace.i(16074720411648L, 119766);
    w.i("MicroMsg.MsgHandler", "hy: doGetIbgTransactionRequest");
    if ((this.context instanceof MMActivity))
    {
      com.tencent.mm.pluginsdk.wallet.f localf = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
      this.rSQ = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("closeWebAfterPayDetailBack"), 0);
      MMActivity localMMActivity = (MMActivity)this.context;
      Intent localIntent = new Intent();
      localIntent.putExtra("appId", localf.appId);
      localIntent.putExtra("timeStamp", localf.timeStamp);
      localIntent.putExtra("nonceStr", localf.nonceStr);
      localIntent.putExtra("packageExt", localf.packageExt);
      localIntent.putExtra("signtype", localf.signType);
      localIntent.putExtra("paySignature", localf.ePJ);
      localIntent.putExtra("url", localf.url);
      localMMActivity.vKC = this;
      com.tencent.mm.bj.d.a(localMMActivity, "wallet_core", ".ui.ibg.WalletIbgOrderInfoUI", localIntent, 25, true);
      long l = com.tencent.mm.sdk.platformtools.bg.getLong((String)parami.nSp.get("message_id"), 0L);
      int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("message_index"), 0);
      com.tencent.mm.plugin.report.service.g.ork.i(10593, new Object[] { localf.ePK, localf.appId, Long.valueOf(l), Integer.valueOf(i), Integer.valueOf(localf.ePL), localf.url });
    }
    GMTrace.o(16074720411648L, 119766);
    return true;
  }
  
  public final boolean bD(i parami)
  {
    GMTrace.i(16074854629376L, 119767);
    if (f("nfcIsConnect", 4001, new Bundle())) {
      a(parami, "nfcIsConnect:connect", null);
    }
    GMTrace.o(16074854629376L, 119767);
    return true;
  }
  
  public int bDx()
  {
    GMTrace.i(12188714532864L, 90813);
    j = -1;
    i = j;
    try
    {
      if (this.rEM != null)
      {
        Bundle localBundle = this.rEM.d(22, null);
        i = j;
        if (localBundle != null) {
          i = localBundle.getInt("pay_channel");
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "invokeAsResult error.%s", new Object[] { localRemoteException });
        i = j;
      }
    }
    GMTrace.o(12188714532864L, 90813);
    return i;
  }
  
  public final boolean bE(i parami)
  {
    GMTrace.i(16074988847104L, 119768);
    if (f("nfcConnect", 4002, new Bundle())) {
      a(parami, "nfcConnect:connect", null);
    }
    GMTrace.o(16074988847104L, 119768);
    return true;
  }
  
  public final boolean bF(i parami)
  {
    GMTrace.i(16075123064832L, 119769);
    Bundle localBundle = new Bundle();
    if (f("nfcGetId", 4002, localBundle))
    {
      localBundle = e("nfcGetId", 4005, localBundle);
      if (localBundle == null) {
        break label121;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("id", localBundle.getString("id"));
      w.i("MicroMsg.MsgHandler", "[NFC] nfcGetId result : " + localBundle.getString("id"));
      a(parami, "nfcGetId:ok", localHashMap);
    }
    for (;;)
    {
      GMTrace.o(16075123064832L, 119769);
      return true;
      label121:
      w.w("MicroMsg.MsgHandler", "[NFC] nfcGetId callback fail!");
      a(parami, "nfcGetId:fail", null);
    }
  }
  
  public final boolean bFA()
  {
    GMTrace.i(12185627525120L, 90790);
    w.i("MicroMsg.MsgHandler", "doGetLatestAddress JSOAUTH");
    try
    {
      String str1 = this.rEM.Zi();
      if (str1 == null)
      {
        a(this.rSz, "get_recently_used_address:" + "fail", null);
        GMTrace.o(12185627525120L, 90790);
        return true;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localException.getMessage() });
        String str2 = "";
        continue;
        final mb localmb = new mb();
        localmb.eQL.appId = ((String)this.rSz.nSp.get("appId"));
        localmb.eQL.url = str2;
        localmb.eQM.errCode = -119;
        localmb.eDO = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18133888794624L, 135108);
            w.i("MicroMsg.MsgHandler", "JSOAUTH errCode[%s], isAccept[%s]", new Object[] { Integer.valueOf(localmb.eQM.errCode), Boolean.valueOf(localmb.eQM.eQN) });
            if (localmb.eQM.errCode == -119)
            {
              GMTrace.o(18133888794624L, 135108);
              return;
            }
            if (localmb.eQM.errCode != 0)
            {
              g.this.a(g.this.rSz, this.rTH + "fail", null);
              GMTrace.o(18133888794624L, 135108);
              return;
            }
            if (!localmb.eQM.eQN)
            {
              g.this.a(g.this.rSz, this.rTH + "cancel", null);
              GMTrace.o(18133888794624L, 135108);
              return;
            }
            HashMap localHashMap = new HashMap();
            localHashMap.put("nationalCode", localmb.eQM.eQO);
            localHashMap.put("userName", localmb.eQM.userName);
            localHashMap.put("telNumber", localmb.eQM.eQP);
            localHashMap.put("addressPostalCode", localmb.eQM.eQQ);
            localHashMap.put("proviceFirstStageName", localmb.eQM.eQR);
            localHashMap.put("addressCitySecondStageName", localmb.eQM.eQS);
            localHashMap.put("addressCountiesThirdStageName", localmb.eQM.eQT);
            localHashMap.put("addressDetailInfo", localmb.eQM.eQU);
            g.this.a(g.this.rSz, this.rTH + "ok", localHashMap);
            GMTrace.o(18133888794624L, 135108);
          }
        };
        com.tencent.mm.sdk.b.a.vgX.a(localmb, Looper.getMainLooper());
      }
    }
  }
  
  public String bFC()
  {
    localObject3 = null;
    GMTrace.i(12188580315136L, 90812);
    Object localObject1 = localObject3;
    try
    {
      if (this.rEM != null)
      {
        Bundle localBundle = this.rEM.d(18, null);
        localObject1 = localObject3;
        if (localBundle != null) {
          localObject1 = localBundle.getString("preChatName");
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "invokeAsResult error.%s", new Object[] { localRemoteException });
        Object localObject2 = localObject3;
      }
    }
    GMTrace.o(12188580315136L, 90812);
    return (String)localObject1;
  }
  
  public final void bFD()
  {
    GMTrace.i(16073244016640L, 119755);
    try
    {
      this.rEM.d(12, new Bundle(0));
      this.rEM.d(11, new Bundle(0));
      GMTrace.o(16073244016640L, 119755);
      return;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MsgHandler", "clearCloseWindowConfirmDialogInfo, exception = %s", new Object[] { localException });
      GMTrace.o(16073244016640L, 119755);
    }
  }
  
  public final boolean bFE()
  {
    GMTrace.i(12190862016512L, 90829);
    if (!com.tencent.mm.sdk.platformtools.bg.nm(this.rTg)) {}
    for (boolean bool = true;; bool = false)
    {
      if (bool) {
        w.e("MicroMsg.MsgHandler", "in recording state.");
      }
      GMTrace.o(12190862016512L, 90829);
      return bool;
    }
  }
  
  public final boolean bFF()
  {
    GMTrace.i(12191801540608L, 90836);
    try
    {
      this.rEM.o(3003, null);
      this.kNw = false;
      GMTrace.o(12191801540608L, 90836);
      return false;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "doShowOptionMenu, RemoteException : %s", new Object[] { localRemoteException.getMessage() });
      }
    }
  }
  
  public final boolean bFG()
  {
    GMTrace.i(12191935758336L, 90837);
    try
    {
      this.rEM.o(3004, null);
      this.kNw = false;
      GMTrace.o(12191935758336L, 90837);
      return false;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "RemoteException : %s", new Object[] { localRemoteException.getMessage() });
      }
    }
  }
  
  public final boolean bFH()
  {
    GMTrace.i(12197438685184L, 90878);
    try
    {
      Bundle localBundle = new Bundle(1);
      localBundle.putString("place_holder", "place_holder");
      this.rEM.bDi();
      this.rEM.Q(localBundle);
      GMTrace.o(12197438685184L, 90878);
      return true;
    }
    catch (Exception localException)
    {
      for (;;) {}
    }
  }
  
  public final boolean bFI()
  {
    GMTrace.i(12197707120640L, 90880);
    w.i("MicroMsg.MsgHandler", "doSwitchWalletCurrency call");
    ((MMActivity)this.context).vKC = this;
    com.tencent.mm.bj.d.b(this.context, "wallet_core", ".ui.WalletSwitchWalletCurrencyUI", null, 35);
    GMTrace.o(12197707120640L, 90880);
    return true;
  }
  
  public final boolean bFJ()
  {
    GMTrace.i(12198378209280L, 90885);
    w.i("MicroMsg.MsgHandler", "openGameRegion call");
    if ((this.context instanceof MMActivity))
    {
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.a(this.context, "game", ".ui.GameRegionSelectUI", null, 42, false);
    }
    GMTrace.o(12198378209280L, 90885);
    return true;
  }
  
  public final boolean bFK()
  {
    GMTrace.i(20447399772160L, 152345);
    this.kNw = false;
    com.tencent.mm.plugin.webview.fts.e locale = com.tencent.mm.plugin.webview.modeltools.f.bCT();
    int i = this.eQd;
    if (locale.rCh != null) {
      ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).cancelSearchTask(locale.rCh);
    }
    w.i("MicroMsg.FTS.FTSWebViewLogic", "getSearchHistory count %d, webviewId %d", new Object[] { Integer.valueOf(20), Integer.valueOf(i) });
    com.tencent.mm.plugin.fts.a.a.f localf = new com.tencent.mm.plugin.fts.a.a.f();
    localf.eQb = "";
    localf.lwV = 20;
    localf.lwY = locale.rCi;
    locale.lwZ = ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).search(8, localf);
    locale.lwZ.lwD = Integer.valueOf(i);
    GMTrace.o(20447399772160L, 152345);
    return false;
  }
  
  public final boolean bFL()
  {
    GMTrace.i(12203210047488L, 90921);
    try
    {
      this.rEM.d(47, Bundle.EMPTY);
      a(this.rSz, "disablePullDownRefresh:ok", null);
      GMTrace.o(12203210047488L, 90921);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
        a(this.rSz, "disablePullDownRefresh:fail", null);
      }
    }
  }
  
  public final Bundle bFM()
  {
    Object localObject = null;
    GMTrace.i(12204283789312L, 90929);
    try
    {
      Bundle localBundle = this.rEM.d(33, null);
      localObject = localBundle;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
      }
    }
    w.i("MicroMsg.MsgHandler", "getWebViewIntentExtras(%s)", new Object[] { localObject });
    GMTrace.o(12204283789312L, 90929);
    return (Bundle)localObject;
  }
  
  public final Bundle bFw()
  {
    GMTrace.i(12181064122368L, 90756);
    if (this.rSC == null) {
      this.rSC = new Bundle();
    }
    Bundle localBundle = this.rSC;
    GMTrace.o(12181064122368L, 90756);
    return localBundle;
  }
  
  final String bFy()
  {
    GMTrace.i(12182943170560L, 90770);
    String str = bFw().getString("connector_local_report");
    bFw().remove("connector_local_report");
    GMTrace.o(12182943170560L, 90770);
    return str;
  }
  
  public final void bFz()
  {
    GMTrace.i(16069485920256L, 119727);
    com.tencent.mm.sdk.b.a.vgX.b(this.oQN);
    this.rSX = ((LocationManager)this.context.getSystemService("location"));
    rSK = cG(this.rSz);
    this.rSH = this.rEM;
    rSJ = this.context;
    this.rSA = this.rSz;
    GMTrace.o(16069485920256L, 119727);
  }
  
  public final boolean bG(i parami)
  {
    GMTrace.i(16075257282560L, 119770);
    Bundle localBundle = new Bundle();
    if (f("nfcGetInfo", 4002, localBundle))
    {
      localBundle = e("nfcGetInfo", 4008, localBundle);
      if (localBundle == null) {
        break label92;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("info", localBundle.getString("info"));
      a(parami, "nfcGetInfo:ok", localHashMap);
    }
    for (;;)
    {
      GMTrace.o(16075257282560L, 119770);
      return true;
      label92:
      w.w("MicroMsg.MsgHandler", "[NFC] nfcGetInfo callback fail!");
      a(parami, "nfcGetInfo:fail", null);
    }
  }
  
  public final boolean bH(final i parami)
  {
    int k = 0;
    GMTrace.i(16075391500288L, 119771);
    if (com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("isShowNfcSwitchGuide"), 1) == 1) {}
    NfcAdapter localNfcAdapter;
    for (int i = 1;; i = 0)
    {
      localNfcAdapter = NfcAdapter.getDefaultAdapter(this.context);
      if (localNfcAdapter != null) {
        break;
      }
      a(parami, "nfcCheckState:nfc_not_support", null);
      GMTrace.o(16075391500288L, 119771);
      return true;
    }
    com.tencent.mm.y.at.AR();
    int m = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vrN, Integer.valueOf(0))).intValue();
    com.tencent.mm.y.at.AR();
    int n = ((Integer)com.tencent.mm.y.c.xh().get(w.a.vrO, Integer.valueOf(0))).intValue();
    int j;
    if (m != 2)
    {
      j = k;
      if (m == 0)
      {
        j = k;
        if (n == 1) {}
      }
    }
    else
    {
      j = 1;
    }
    if (j != 0)
    {
      if (i == 0)
      {
        a(parami, "nfcCheckState:nfc_wechat_setting_off", null);
        GMTrace.o(16075391500288L, 119771);
        return true;
      }
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19439021981696L, 144832);
          com.tencent.mm.ui.base.h.a(g.this.context, g.this.context.getString(R.l.dLt), "", g.this.context.getString(R.l.dLv), g.this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(19426808168448L, 144741);
              com.tencent.mm.bj.d.x(g.this.context, "setting", ".ui.setting.SettingsAboutSystemUI");
              g.this.a(g.77.this.rTq, "nfcCheckState:nfc_wechat_setting_off", null);
              GMTrace.o(19426808168448L, 144741);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(19435934973952L, 144809);
              g.this.a(g.77.this.rTq, "nfcCheckState:nfc_wechat_setting_off", null);
              GMTrace.o(19435934973952L, 144809);
            }
          });
          GMTrace.o(19439021981696L, 144832);
        }
      });
      GMTrace.o(16075391500288L, 119771);
      return true;
    }
    if (!localNfcAdapter.isEnabled())
    {
      if (i == 0)
      {
        a(parami, "nfcCheckState:nfc_off", null);
        GMTrace.o(16075391500288L, 119771);
        return true;
      }
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19443316948992L, 144864);
          com.tencent.mm.ui.base.h.a(g.this.context, g.this.context.getString(R.l.dLu), "", g.this.context.getString(R.l.dLv), g.this.context.getString(R.l.cSk), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(19444524908544L, 144873);
              g.this.context.startActivity(new Intent("android.settings.NFC_SETTINGS"));
              g.this.a(g.78.this.rTq, "nfcCheckState:nfc_off", null);
              GMTrace.o(19444524908544L, 144873);
            }
          }, new DialogInterface.OnClickListener()
          {
            public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
            {
              GMTrace.i(19428687216640L, 144755);
              g.this.a(g.78.this.rTq, "nfcCheckState:nfc_off", null);
              GMTrace.o(19428687216640L, 144755);
            }
          });
          GMTrace.o(19443316948992L, 144864);
        }
      });
      GMTrace.o(16075391500288L, 119771);
      return true;
    }
    a(parami, "nfcCheckState:nfc_ok", null);
    GMTrace.o(16075391500288L, 119771);
    return true;
  }
  
  public final boolean bI(i parami)
  {
    GMTrace.i(16075525718016L, 119772);
    if (f("nfcTransceive", 4002, new Bundle()))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("apdu", (String)parami.nSp.get("apdu"));
      localBundle = e("nfcTransceive", 4003, localBundle);
      if (localBundle == null) {
        break label149;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("result", localBundle.getString("result"));
      w.i("MicroMsg.MsgHandler", "[NFC] nfcTransceive result : " + localBundle.getString("result"));
      a(parami, "nfcTransceive:ok", localHashMap);
    }
    for (;;)
    {
      GMTrace.o(16075525718016L, 119772);
      return true;
      label149:
      w.w("MicroMsg.MsgHandler", "[NFC] nfcGetId callback fail!");
      a(parami, "nfcTransceive:fail", null);
    }
  }
  
  public final boolean bJ(i parami)
  {
    GMTrace.i(16075659935744L, 119773);
    boolean bool;
    if (f("nfcBatchTransceive", 4002, new Bundle()))
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("apdus", (String)parami.nSp.get("apdus"));
      if (com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("breakIfFail"), 1) != 1) {
        break label185;
      }
      bool = true;
      localBundle.putBoolean("breakIfFail", bool);
      localBundle = e("nfcBatchTransceive", 4004, localBundle);
      if (localBundle == null) {
        break label190;
      }
      HashMap localHashMap = new HashMap();
      localHashMap.put("result", localBundle.getString("result"));
      w.i("MicroMsg.MsgHandler", "[NFC] nfcBatchTransceive result : " + localBundle.getString("result"));
      a(parami, "nfcBatchTransceive:ok", localHashMap);
    }
    for (;;)
    {
      GMTrace.o(16075659935744L, 119773);
      return true;
      label185:
      bool = false;
      break;
      label190:
      w.w("MicroMsg.MsgHandler", "[NFC] nfcGetId callback fail!");
      a(parami, "nfcBatchTransceive:fail", null);
    }
  }
  
  public final boolean bK(i parami)
  {
    GMTrace.i(12193949024256L, 90852);
    try
    {
      Object localObject1 = this.rEM.d(5001, null);
      if (localObject1 != null)
      {
        int i = ((Bundle)localObject1).getInt("webview_video_proxy_init");
        w.i("MicroMsg.MsgHandler", "int webview video proxy : %d", new Object[] { Integer.valueOf(i) });
        localObject1 = new HashMap();
        ((Map)localObject1).put("videoProxyInitResult", Integer.valueOf(i));
        Object localObject2;
        IDKey localIDKey;
        if (i == 0)
        {
          localObject2 = ah.bCp();
          ((ah)localObject2).rEM = this.rEM;
          ((ah)localObject2).hasInit = true;
          localObject2 = new ArrayList();
          localIDKey = new IDKey();
          localIDKey.SetID(142);
          localIDKey.SetKey(0);
          localIDKey.SetValue(1L);
          ((ArrayList)localObject2).add(localIDKey);
          localIDKey = new IDKey();
          localIDKey.SetID(142);
          localIDKey.SetKey(1);
          localIDKey.SetValue(1L);
          ((ArrayList)localObject2).add(localIDKey);
          com.tencent.mm.plugin.report.service.g.ork.b((ArrayList)localObject2, false);
          a(parami, "videoProxyInit:ok", (Map)localObject1);
        }
        for (;;)
        {
          GMTrace.o(12193949024256L, 90852);
          return false;
          localObject2 = new ArrayList();
          localIDKey = new IDKey();
          localIDKey.SetID(142);
          localIDKey.SetKey(0);
          localIDKey.SetValue(1L);
          ((ArrayList)localObject2).add(localIDKey);
          localIDKey = new IDKey();
          localIDKey.SetID(142);
          localIDKey.SetKey(2);
          localIDKey.SetValue(1L);
          ((ArrayList)localObject2).add(localIDKey);
          localIDKey = new IDKey();
          localIDKey.SetID(142);
          localIDKey.SetKey(com.tencent.mm.plugin.webview.ui.tools.a.xJ(i));
          localIDKey.SetValue(1L);
          ((ArrayList)localObject2).add(localIDKey);
          com.tencent.mm.plugin.report.service.g.ork.b((ArrayList)localObject2, false);
          a(parami, "videoProxyInit:fail", (Map)localObject1);
        }
      }
      return false;
    }
    catch (Exception localException)
    {
      w.i("MicroMsg.MsgHandler", "doinit webview proxy failed : %s", new Object[] { localException.getMessage() });
      a(parami, "videoProxyInit:fail", null);
      GMTrace.o(12193949024256L, 90852);
    }
  }
  
  public final boolean bL(i parami)
  {
    GMTrace.i(12194083241984L, 90853);
    if (!ah.bCp().hasInit)
    {
      a(parami, "videoProxyStartPlay:fail_has_not_init", null);
      GMTrace.o(12194083241984L, 90853);
      return false;
    }
    Object localObject1 = (String)parami.nSp.get("webviewVideoProxyCdnUrls");
    Object localObject2 = (String)parami.nSp.get("webviewVideoProxyFileId");
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("webviewVideoProxyFileSize"), 0);
    int j = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("webviewVideoProxyFileDuration"), 0);
    int k = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("webviewVideoProxyFileType"), 1);
    w.i("MicroMsg.MsgHandler", "cdnurls = %s, filedId = %s, fileSize = %d, fileDuration = %d, fileType = %d", new Object[] { localObject1, localObject2, Integer.valueOf(i), Integer.valueOf(j), Integer.valueOf(k) });
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
    {
      a(parami, "videoProxyStartPlay:fail_cdnurl_is_null", null);
      GMTrace.o(12194083241984L, 90853);
      return false;
    }
    ArrayList localArrayList = new ArrayList();
    try
    {
      Bundle localBundle = new Bundle();
      localBundle.putString("webview_video_proxy_cdn_urls", (String)localObject1);
      localBundle.putString("webview_video_proxy_fileId", (String)localObject2);
      localBundle.putInt("webview_video_proxy_file_size", i);
      localBundle.putInt("webview_video_proxy_file_duration", j);
      localBundle.putInt("webview_video_proxy_file_type", k);
      localObject1 = this.rEM.d(5002, localBundle);
      localObject2 = new IDKey();
      ((IDKey)localObject2).SetID(142);
      ((IDKey)localObject2).SetKey(15);
      ((IDKey)localObject2).SetValue(1L);
      localArrayList.add(localObject2);
      if (localObject1 != null)
      {
        i = ((Bundle)localObject1).getInt("webview_video_proxy_play_data_id");
        localObject1 = ((Bundle)localObject1).getString("webview_video_proxy_local_url");
        w.i("MicroMsg.MsgHandler", "invoke result palyDataId = %d, localUrl = %s", new Object[] { Integer.valueOf(i), localObject1 });
        if ((i > 0) && (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)))
        {
          com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, false);
          localObject2 = new HashMap();
          ((Map)localObject2).put("videoProxyPlayDataId", Integer.valueOf(i));
          ((Map)localObject2).put("videoProxyPlayLocalUrl", localObject1);
          a(parami, "videoProxyStartPlay:ok", (Map)localObject2);
          com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, false);
          GMTrace.o(12194083241984L, 90853);
          return false;
        }
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MsgHandler", "proxy start play failed : %s", new Object[] { localException.getMessage() });
      IDKey localIDKey = new IDKey();
      localIDKey.SetID(142);
      localIDKey.SetKey(16);
      localIDKey.SetValue(1L);
      localArrayList.add(localIDKey);
      com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, false);
      a(parami, "videoProxyStartPlay:fail", null);
      GMTrace.o(12194083241984L, 90853);
    }
    return false;
  }
  
  public final boolean bM(i parami)
  {
    GMTrace.i(12194217459712L, 90854);
    if (!ah.bCp().hasInit)
    {
      a(parami, "videoProxyStartPlay:fail_has_not_init", null);
      GMTrace.o(12194217459712L, 90854);
      return true;
    }
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("webviewVideoProxyPlaydataId"), 0);
    if (i > 0)
    {
      Bundle localBundle = new Bundle();
      localBundle.putInt("webview_video_proxy_play_data_id", i);
      try
      {
        this.rEM.d(5003, localBundle);
        a(parami, "videoProxyStopPlay:ok", null);
        GMTrace.o(12194217459712L, 90854);
        return false;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MsgHandler", "webview proxy stop play failed : %s", new Object[] { localException.getMessage() });
      }
    }
    a(parami, "videoProxyStopPlay:fail", null);
    GMTrace.o(12194217459712L, 90854);
    return false;
  }
  
  public final boolean bN(i parami)
  {
    GMTrace.i(12194351677440L, 90855);
    if (!ah.bCp().hasInit)
    {
      a(parami, "videoProxyStartPlay:fail_has_not_init", null);
      GMTrace.o(12194351677440L, 90855);
      return true;
    }
    Object localObject = (String)parami.nSp.get("webviewVideoProxyPlayState");
    w.i("MicroMsg.MsgHandler", "set player state : %s", new Object[] { localObject });
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      a(parami, "videoProxySetPlayerState:fail", null);
      GMTrace.o(12194351677440L, 90855);
      return true;
    }
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)localObject, 0);
    try
    {
      localObject = new Bundle();
      ((Bundle)localObject).putInt("webview_video_proxy_play_state", i);
      this.rEM.d(5004, (Bundle)localObject);
      a(parami, "videoProxySetPlayerState:ok", null);
      GMTrace.o(12194351677440L, 90855);
      return false;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MsgHandler", "set player state failed : %s", new Object[] { localException.getMessage() });
      a(parami, "videoProxySetPlayerState:fail", null);
      GMTrace.o(12194351677440L, 90855);
    }
    return false;
  }
  
  public final boolean bO(i parami)
  {
    GMTrace.i(12194485895168L, 90856);
    if (!ah.bCp().hasInit)
    {
      a(parami, "videoProxySetRemainTime:fail_has_not_init", null);
      GMTrace.o(12194485895168L, 90856);
      return false;
    }
    Object localObject = (String)parami.nSp.get("webviewVideoProxyPlaydataId");
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)localObject, 0);
    String str = (String)parami.nSp.get("webviewVideoProxyRemainTime");
    int j = com.tencent.mm.sdk.platformtools.bg.getInt(str, 0);
    w.i("MicroMsg.MsgHandler", "doWebviewProxySetRemainTime, id = %s, time = %s", new Object[] { localObject, str });
    try
    {
      localObject = new Bundle();
      ((Bundle)localObject).putInt("webview_video_proxy_play_data_id", i);
      ((Bundle)localObject).putInt("webview_video_proxy_play_remain_time", j);
      this.rEM.d(5006, (Bundle)localObject);
      a(parami, "videoProxySetRemainTime:ok", null);
      GMTrace.o(12194485895168L, 90856);
      return false;
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MsgHandler", "set remain time faild : %s", new Object[] { localException.getMessage() });
      a(parami, "videoProxySetRemainTime:fail", null);
      GMTrace.o(12194485895168L, 90856);
    }
    return false;
  }
  
  public final boolean bP(i parami)
  {
    GMTrace.i(12194620112896L, 90857);
    if (!ah.bCp().hasInit)
    {
      a(parami, "videoProxyPreload:fail_has_not_init", null);
      GMTrace.o(12194620112896L, 90857);
      return false;
    }
    Object localObject = (String)parami.nSp.get("webviewVideoProxyPlaydataId");
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("webviewVideoProxyPreloadTime"), 0);
    w.i("MicroMsg.MsgHandler", "doWebviewProxyPreload, playDataId = %s, duration = %d", new Object[] { localObject, Integer.valueOf(i) });
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      w.e("MicroMsg.MsgHandler", "playDataId is null or nil");
      a(parami, "videoProxyPreload:fail_invaild_play_data_id", null);
      GMTrace.o(12194620112896L, 90857);
      return false;
    }
    try
    {
      int j = com.tencent.mm.sdk.platformtools.bg.getInt((String)localObject, 0);
      localObject = new Bundle();
      ((Bundle)localObject).putInt("webview_video_proxy_play_data_id", j);
      ((Bundle)localObject).putInt("webview_video_proxy_preload_duration", i);
      i = this.rEM.d(5007, (Bundle)localObject).getInt("webview_video_proxy_pre_load_result");
      w.i("MicroMsg.MsgHandler", "preload video result = %d", new Object[] { Integer.valueOf(i) });
      if (i == 0) {
        a(parami, "videoProxyPreload:ok", null);
      }
      for (;;)
      {
        GMTrace.o(12194620112896L, 90857);
        return false;
        a(parami, "videoProxyPreload:fail", null);
      }
      return false;
    }
    catch (Exception localException)
    {
      a(parami, "videoProxyPreload:fail", null);
      GMTrace.o(12194620112896L, 90857);
    }
  }
  
  public final boolean bQ(i parami)
  {
    GMTrace.i(16075794153472L, 119774);
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("cmd"), 0);
    Object localObject = (String)parami.nSp.get("param");
    go localgo = new go();
    localgo.eJG.nJ = i;
    localgo.eJG.eJB = ((String)localObject);
    com.tencent.mm.sdk.b.a.vgX.m(localgo);
    localObject = new HashMap();
    ((Map)localObject).put("result", localgo.eJH.eJI);
    a(parami, "getGameMessages:ok", (Map)localObject);
    GMTrace.o(16075794153472L, 119774);
    return true;
  }
  
  public final boolean bR(i parami)
  {
    GMTrace.i(16075928371200L, 119775);
    a(parami, "publicCache:not in white list", null);
    GMTrace.o(16075928371200L, 119775);
    return true;
  }
  
  public final boolean bS(i parami)
  {
    GMTrace.i(12194888548352L, 90859);
    String str5 = (String)parami.nSp.get("actionKey");
    String str4 = (String)parami.nSp.get("actionValue");
    w.i("MicroMsg.MsgHandler", "doReportActionInfo, actionKey =  %s, actionValue =  %s", new Object[] { str5, str4 });
    if ((com.tencent.mm.sdk.platformtools.bg.nm(str5)) || (com.tencent.mm.sdk.platformtools.bg.nm(str4)))
    {
      w.e("MicroMsg.MsgHandler", "doReportActionInfo, actionKey or actionValue is null");
      a(parami, "reportActionInfo:fail", null);
      GMTrace.o(12194888548352L, 90859);
      return true;
    }
    if ((str5.length() <= 0) || (str5.length() > 32) || (str4.length() <= 0) || (str4.length() > 1024))
    {
      w.e("MicroMsg.MsgHandler", "doReportActionInfo, actionKey or actionValue size is bad");
      a(parami, "reportActionInfo:fail", null);
      GMTrace.o(12194888548352L, 90859);
      return true;
    }
    Object localObject5 = " ";
    String str3 = " ";
    String str2 = " ";
    String str1 = str2;
    localObject1 = str3;
    Object localObject3 = localObject5;
    int i;
    int j;
    try
    {
      localObject6 = this.rEM.d(77, null);
      str1 = str2;
      localObject1 = str3;
      localObject3 = localObject5;
      if (localObject6 != null)
      {
        str1 = str2;
        localObject1 = str3;
        localObject3 = localObject5;
        localObject5 = com.tencent.mm.sdk.platformtools.bg.nl(((Bundle)localObject6).getString("KSessionId"));
        str1 = str2;
        localObject1 = str3;
        localObject3 = localObject5;
        str3 = com.tencent.mm.sdk.platformtools.bg.nl(((Bundle)localObject6).getString("KUserAgent"));
        str1 = str2;
        localObject1 = str3;
        localObject3 = localObject5;
        str2 = com.tencent.mm.sdk.platformtools.bg.nl(((Bundle)localObject6).getString("KUrl"));
        str1 = str2;
        localObject1 = str3;
        localObject3 = localObject5;
        if (TextUtils.isEmpty(str2))
        {
          str1 = str2;
          localObject1 = str3;
          localObject3 = localObject5;
          w.e("MicroMsg.MsgHandler", "doReportActionInfo, url is empty");
          str1 = str2;
          localObject1 = str3;
          localObject3 = localObject5;
          a(parami, "reportActionInfo:fail", null);
          GMTrace.o(12194888548352L, 90859);
          return true;
        }
        str1 = str2;
        localObject1 = str3;
        localObject3 = localObject5;
        w.i("MicroMsg.MsgHandler", "doReportActionInfo, sessionId %s, userAgent %s, url %s", new Object[] { localObject5, str3, str2 });
        localObject3 = localObject5;
        localObject1 = str3;
        str1 = str2;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "get sessionId error, %s", new Object[] { localException });
      }
      w.i("MicroMsg.MsgHandler", "doReportActionInfo, appId %s", new Object[] { localObject6 });
      i = 0;
      j = 0;
      if (!am.isConnected(this.context)) {
        break label567;
      }
    }
    Object localObject6 = pi(str1);
    if (TextUtils.isEmpty((CharSequence)localObject6))
    {
      w.e("MicroMsg.MsgHandler", "doReportActionInfo, appId is empty");
      a(parami, "reportActionInfo:fail", null);
      GMTrace.o(12194888548352L, 90859);
      return true;
    }
    label567:
    long l;
    if (am.isWifi(this.context))
    {
      i = 1;
      w.i("MicroMsg.MsgHandler", "doReportActionInfo, get networkType %d", new Object[] { Integer.valueOf(i) });
      l = com.tencent.mm.sdk.platformtools.bg.Pu();
      w.d("MicroMsg.MsgHandler", "report(%s), clickTimestamp : %d, appID %s, networkType %d, userAgent %s, url : %s, sessionID : %s, actionKey : %s, actionValue : %s", new Object[] { Integer.valueOf(13379), Long.valueOf(l), localObject6, Integer.valueOf(i), localObject1, str1, localObject3, str5, str4 });
      localObject2 = "";
    }
    for (;;)
    {
      try
      {
        localObject1 = URLEncoder.encode(com.tencent.mm.sdk.platformtools.bg.nl((String)localObject1), "UTF-8");
        localObject2 = localObject1;
        str1 = URLEncoder.encode(str1, "UTF-8");
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException1)
      {
        str1 = "";
        localObject1 = "";
      }
      try
      {
        str3 = URLEncoder.encode(str5, "UTF-8");
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException2)
      {
        for (;;)
        {
          Object localObject4;
          localObject2 = localObject1;
          localObject1 = "";
        }
      }
      try
      {
        localObject2 = URLEncoder.encode(str4, "UTF-8");
        localObject5 = localObject1;
        localObject1 = localObject2;
        com.tencent.mm.plugin.report.service.g.ork.i(13379, new Object[] { Long.valueOf(l), localObject6, Integer.valueOf(i), localObject5, str1, localObject3, str3, localObject1 });
        a(parami, "reportActionInfo:ok", null);
        GMTrace.o(12194888548352L, 90859);
        return true;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException4)
      {
        localObject2 = localObject1;
        localObject1 = localUnsupportedEncodingException2;
        UnsupportedEncodingException localUnsupportedEncodingException3 = localUnsupportedEncodingException4;
        break label843;
      }
      if (am.is4G(this.context))
      {
        i = 4;
        break;
      }
      if (am.is3G(this.context))
      {
        i = 3;
        break;
      }
      i = j;
      if (!am.is2G(this.context)) {
        break;
      }
      i = 2;
      break;
      label843:
      w.printErrStackTrace("MicroMsg.MsgHandler", localUnsupportedEncodingException1, "", new Object[0]);
      localObject4 = localObject1;
      localObject1 = "";
      localObject5 = localObject2;
    }
  }
  
  public final boolean bT(i parami)
  {
    GMTrace.i(12195022766080L, 90860);
    int j = com.tencent.mm.plugin.webview.modelcache.p.a(parami);
    if (-1 == j)
    {
      a(this.rEM, parami, "cache:fail", null, true, false);
      GMTrace.o(12195022766080L, 90860);
      return true;
    }
    int i = -1;
    if (2 == j) {
      i = 2;
    }
    for (;;)
    {
      if (-1 != i) {
        com.tencent.mm.plugin.report.service.g.ork.a(238L, i, 1L, false);
      }
      w.i("MicroMsg.MsgHandler", "user not in white list");
      com.tencent.mm.plugin.webview.modelcache.m.xA(j);
      a(this.rEM, parami, "cache:not in white list", null, true, false);
      GMTrace.o(12195022766080L, 90860);
      return true;
      if (1 == j) {
        i = 1;
      }
    }
  }
  
  public final boolean bU(i parami)
  {
    GMTrace.i(16076062588928L, 119776);
    w.i("MicroMsg.MsgHandler", "doGetWebPayCheckoutCounterRequst start");
    parami = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
    Intent localIntent = new Intent();
    localIntent.putExtra("appId", parami.appId);
    localIntent.putExtra("timeStamp", parami.timeStamp);
    localIntent.putExtra("nonceStr", parami.nonceStr);
    localIntent.putExtra("packageExt", parami.packageExt);
    localIntent.putExtra("signtype", parami.signType);
    localIntent.putExtra("paySignature", parami.ePJ);
    localIntent.putExtra("url", parami.url);
    ((MMActivity)this.context).vKC = this;
    com.tencent.mm.bj.d.a(this.context, "wallet", ".pay.ui.WalletLoanRepaymentUI", localIntent, 28, false);
    GMTrace.o(16076062588928L, 119776);
    return true;
  }
  
  public final boolean bV(i parami)
  {
    GMTrace.i(12195156983808L, 90861);
    w.i("MicroMsg.MsgHandler", "doAddCustomMenuItems start");
    int i;
    if (parami.nSp.containsKey("hideMenu"))
    {
      i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("hideMenu"), 0);
      w.e("MicroMsg.MsgHandler", "doAddCustomMenuItems hideMenu=" + i);
      boolean bool;
      if (i == 1)
      {
        bool = true;
        if (!jF(bool)) {
          break label119;
        }
        a(parami, "doAddCustomMenuItems:ok", null);
      }
      for (;;)
      {
        GMTrace.o(12195156983808L, 90861);
        return true;
        bool = false;
        break;
        label119:
        a(parami, "doAddCustomMenuItems:fail", null);
      }
    }
    jF(false);
    Object localObject1 = (String)parami.nSp.get("itemList");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
    {
      w.e("MicroMsg.MsgHandler", "doAddCustomMenuItems fail: key or title must not be null");
      a(parami, "doAddCustomMenuItems:params error", null);
    }
    for (;;)
    {
      GMTrace.o(12195156983808L, 90861);
      return true;
      Object localObject2;
      ArrayList localArrayList;
      for (;;)
      {
        Object localObject3;
        try
        {
          localObject2 = new JSONArray((String)localObject1);
          localObject1 = new ArrayList();
          localArrayList = new ArrayList();
          int j = ((JSONArray)localObject2).length();
          i = 0;
          if (i >= j) {
            break;
          }
          localObject3 = ((JSONArray)localObject2).optJSONObject(i);
          String str;
          if (localObject3 != null)
          {
            str = ((JSONObject)localObject3).optString("key");
            localObject3 = ((JSONObject)localObject3).optString("title");
            if ((com.tencent.mm.sdk.platformtools.bg.nm(str)) || (com.tencent.mm.sdk.platformtools.bg.nm("title"))) {
              w.e("MicroMsg.MsgHandler", "key or title is null,ignore item: " + i);
            }
          }
          else
          {
            i += 1;
            continue;
          }
          localJSONException.add(str);
        }
        catch (JSONException localJSONException)
        {
          w.e("MicroMsg.MsgHandler", "doAddCustomMenuItems eroor, parse itemList to jsonarray error");
          a(parami, "doAddCustomMenuItems:params parse error", null);
          GMTrace.o(12195156983808L, 90861);
          return true;
        }
        localArrayList.add(localObject3);
      }
      if (localJSONException.size() > 0)
      {
        localObject2 = new Bundle();
        ((Bundle)localObject2).putStringArrayList("keys", localJSONException);
        ((Bundle)localObject2).putStringArrayList("titles", localArrayList);
        try
        {
          this.rEM.R((Bundle)localObject2);
          a(parami, "doAddCustomMenuItems:ok", null);
        }
        catch (RemoteException localRemoteException)
        {
          w.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
          w.e("MicroMsg.MsgHandler", "doAddCustomMenuItems:fail");
          a(parami, "doAddCustomMenuItems:fail", null);
        }
      }
    }
  }
  
  public final boolean bW(i parami)
  {
    GMTrace.i(12195291201536L, 90862);
    String str1 = (String)parami.nSp.get("key");
    if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
    {
      a(parami, "getLocalData:fail_key_is_null", null);
      GMTrace.o(12195291201536L, 90862);
      return true;
    }
    String str3;
    for (;;)
    {
      String str4;
      com.tencent.mm.plugin.webview.model.af localaf;
      String str5;
      try
      {
        localObject = this.rEM.Zi();
        str3 = new String(Base64.encode(str1.getBytes(), 0));
        str4 = this.rSL.Ms((String)localObject);
        localaf = com.tencent.mm.plugin.webview.modeltools.f.bCZ();
        str5 = com.tencent.mm.sdk.platformtools.bg.SP((String)localObject);
        w.i("MicroMsg.WebViewLocalDataStorage", "get value by key = %s, appid = %s, domin = %s", new Object[] { str3, str4, str5 });
        str1 = null;
        if ((com.tencent.mm.sdk.platformtools.bg.nm(str3)) || (com.tencent.mm.sdk.platformtools.bg.nm(str4)) || (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) || (com.tencent.mm.sdk.platformtools.bg.nm(str5)))
        {
          str1 = null;
          if (!com.tencent.mm.sdk.platformtools.bg.nm(str1)) {
            break;
          }
          a(parami, "getLocalData:fail", null);
          GMTrace.o(12195291201536L, 90862);
          return true;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MsgHandler", "get url failed : %s", new Object[] { localException.getMessage() });
        a(parami, "getLocalData:fail", null);
        GMTrace.o(12195291201536L, 90862);
        return true;
      }
      int i = com.tencent.mm.plugin.webview.model.af.aa(str4, str5, str3);
      localObject = "select value from WebviewLocalData where recordId = " + i;
      w.i("MicroMsg.WebViewLocalDataStorage", (String)localObject);
      localObject = localaf.rawQuery((String)localObject, new String[0]);
      if (localObject == null)
      {
        w.e("MicroMsg.WebViewLocalDataStorage", "get cursor is null");
        str2 = null;
      }
      else
      {
        if (((Cursor)localObject).moveToFirst()) {
          str2 = ((Cursor)localObject).getString(0);
        }
        ((Cursor)localObject).close();
        w.i("MicroMsg.WebViewLocalDataStorage", "get value : %s for key : %s", new Object[] { str2, str3 });
      }
    }
    String str2 = new String(Base64.decode(str2.getBytes(), 0));
    Object localObject = new HashMap();
    ((HashMap)localObject).put("data", str2);
    w.i("MicroMsg.MsgHandler", "get local data, key = %s, value = %s", new Object[] { str3, str2 });
    a(parami, "getLocalData:ok", (Map)localObject);
    GMTrace.o(12195291201536L, 90862);
    return true;
  }
  
  public final boolean bX(i parami)
  {
    GMTrace.i(12195425419264L, 90863);
    Object localObject3 = (String)parami.nSp.get("key");
    Object localObject2 = (String)parami.nSp.get("data");
    w.i("MicroMsg.MsgHandler", "set local data, key = %s, data = %s", new Object[] { localObject3, localObject2 });
    if ((com.tencent.mm.sdk.platformtools.bg.nm((String)localObject3)) || (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2)))
    {
      a(parami, "setLocalData:fail_param_should_not_null", null);
      GMTrace.o(12195425419264L, 90863);
      return true;
    }
    if ((((String)localObject3).length() > 1024) || (((String)localObject2).length() > 1024))
    {
      a(parami, "setLocalData:fail_param_lenght_too_long", null);
      GMTrace.o(12195425419264L, 90863);
      return true;
    }
    for (;;)
    {
      String str2;
      String str3;
      com.tencent.mm.plugin.webview.model.af localaf;
      String str4;
      try
      {
        String str1 = this.rEM.Zi();
        localObject3 = Base64.encode(((String)localObject3).getBytes(), 0);
        localObject2 = Base64.encode(((String)localObject2).getBytes(), 0);
        localObject3 = new String((byte[])localObject3);
        str2 = new String((byte[])localObject2);
        str3 = this.rSL.Ms(str1);
        localaf = com.tencent.mm.plugin.webview.modeltools.f.bCZ();
        str4 = com.tencent.mm.sdk.platformtools.bg.SP(str1);
        w.i("MicroMsg.WebViewLocalDataStorage", "set data, key = %s, value = %s, url = %s, appId = %s, domin = %s", new Object[] { localObject3, str2, str1, str3, str4 });
        if ((com.tencent.mm.sdk.platformtools.bg.nm((String)localObject3)) || (com.tencent.mm.sdk.platformtools.bg.nm(str1)) || (com.tencent.mm.sdk.platformtools.bg.nm(str3)) || (com.tencent.mm.sdk.platformtools.bg.nm(str4)))
        {
          str1 = "fail_params_invalid";
          w.i("MicroMsg.MsgHandler", "doSetLocalData retValue = %s", new Object[] { str1 });
          a(parami, "setLocalData:" + str1, null);
          GMTrace.o(12195425419264L, 90863);
          return true;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MsgHandler", "get url failed : %s", new Object[] { localException.getMessage() });
        a(parami, "setLocalData:fail", null);
        GMTrace.o(12195425419264L, 90863);
        return true;
      }
      int i = com.tencent.mm.plugin.webview.model.af.aa(str3, str4, (String)localObject3);
      Object localObject1 = "select count(*) from WebviewLocalData where appId = '" + str3 + "' and domin = '" + str4 + "'";
      w.i("MicroMsg.WebViewLocalDataStorage", (String)localObject1);
      localObject2 = localaf.rawQuery((String)localObject1, new String[0]);
      if (localObject2 != null)
      {
        localObject1 = localObject2;
        if (((Cursor)localObject2).moveToFirst())
        {
          int j = ((Cursor)localObject2).getInt(0);
          w.i("MicroMsg.WebViewLocalDataStorage", "now count = %d", new Object[] { Integer.valueOf(j) });
          ((Cursor)localObject2).close();
          if (j >= 5)
          {
            localObject1 = "fail_exceed_max_count";
            continue;
          }
          String str5 = "select count(*) from WebviewLocalData where recordId =" + i;
          localObject2 = localaf.rawQuery(str5, new String[0]);
          localObject1 = localObject2;
          if (localObject2 != null)
          {
            if (((Cursor)localObject2).moveToFirst())
            {
              j = ((Cursor)localObject2).getInt(0);
              w.i("MicroMsg.WebViewLocalDataStorage", "sql = %s, count = %d", new Object[] { str5, Integer.valueOf(j) });
              ((Cursor)localObject2).close();
              if (j > 0)
              {
                localObject1 = "update WebviewLocalData set value = '" + str2 + "' where recordId =" + i;
                boolean bool = localaf.eZ("WebviewLocalData", (String)localObject1);
                w.i("MicroMsg.WebViewLocalDataStorage", "sql = %s, ret = %b", new Object[] { localObject1, Boolean.valueOf(bool) });
                if (bool)
                {
                  localObject1 = "ok";
                  continue;
                }
                localObject1 = "fail";
                continue;
              }
            }
            ((Cursor)localObject2).close();
            localObject1 = localObject2;
          }
        }
        ((Cursor)localObject1).close();
      }
      else
      {
        localObject1 = new com.tencent.mm.plugin.webview.model.ae();
        ((com.tencent.mm.plugin.webview.model.ae)localObject1).field_appId = str3;
        ((com.tencent.mm.plugin.webview.model.ae)localObject1).field_domin = str4;
        ((com.tencent.mm.plugin.webview.model.ae)localObject1).field_key = ((String)localObject3);
        ((com.tencent.mm.plugin.webview.model.ae)localObject1).field_value = str2;
        ((com.tencent.mm.plugin.webview.model.ae)localObject1).field_recordId = i;
        w.i("MicroMsg.WebViewLocalDataStorage", "insert data, ret = %b", new Object[] { Boolean.valueOf(localaf.b((com.tencent.mm.sdk.e.c)localObject1)) });
        localObject1 = "ok";
      }
    }
  }
  
  public final boolean bY(i parami)
  {
    GMTrace.i(12195559636992L, 90864);
    for (;;)
    {
      com.tencent.mm.plugin.webview.model.af localaf;
      String str3;
      String str4;
      try
      {
        String str1 = this.rEM.Zi();
        localaf = com.tencent.mm.plugin.webview.modeltools.f.bCZ();
        str3 = this.rSL.Ms(str1);
        str4 = com.tencent.mm.sdk.platformtools.bg.SP(str1);
        w.i("MicroMsg.WebViewLocalDataStorage", "appid = %s, url = %s, domin = %s", new Object[] { str3, str1, str4 });
        if ((com.tencent.mm.sdk.platformtools.bg.nm(str3)) || (com.tencent.mm.sdk.platformtools.bg.nm(str1)) || (com.tencent.mm.sdk.platformtools.bg.nm(str4)))
        {
          str1 = "fail";
          w.i("MicroMsg.MsgHandler", "doClearLocalData retValue = %s", new Object[] { str1 });
          a(parami, "clearLocalData:" + str1, null);
          GMTrace.o(12195559636992L, 90864);
          return true;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MsgHandler", "get url failed : %s", new Object[] { localException.getMessage() });
        a(parami, "clearLocalData:fail", null);
        GMTrace.o(12195559636992L, 90864);
        return true;
      }
      String str2;
      if (localaf.eZ("WebviewLocalData", "delete from WebviewLocalData where appId = '" + str3 + "' and domin = '" + str4 + "'")) {
        str2 = "ok";
      } else {
        str2 = "fail";
      }
    }
  }
  
  public final boolean bZ(final i parami)
  {
    GMTrace.i(12195693854720L, 90865);
    Object localObject = (String)parami.nSp.get("useridlist");
    String str3 = (String)parami.nSp.get("chatname");
    final String str4 = (String)parami.nSp.get("chatscene");
    LinkedList localLinkedList;
    String str2;
    try
    {
      String str1 = this.rEM.Zi();
      str1 = com.tencent.mm.sdk.platformtools.bg.nl(this.rSL.Ms(str1));
      localLinkedList = new LinkedList();
      localObject = ((String)localObject).split(";");
      if ((localObject != null) && (localObject.length > 0))
      {
        int j = localObject.length;
        int i = 0;
        while (i < j)
        {
          localLinkedList.add(localObject[i]);
          i += 1;
        }
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localRemoteException.getMessage() });
        str2 = null;
      }
      a(parami, "openEnterpriseChat:fail", null);
      GMTrace.o(12195693854720L, 90865);
      return false;
    }
    com.tencent.mm.af.x.FM();
    parami = new com.tencent.mm.af.a.t(str2, str3, localLinkedList, new com.tencent.mm.af.n()
    {
      public final void a(int paramAnonymousInt, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(19422781636608L, 144711);
        if (paramAnonymousInt != 0)
        {
          g.this.a(parami, "openEnterpriseChat:fail", null);
          GMTrace.o(19422781636608L, 144711);
          return;
        }
        ail localail = ((com.tencent.mm.af.a.t)paramAnonymousk).Gc();
        if ((localail == null) || (localail.tWa == null) || (localail.tWa.ret != 0))
        {
          if ((localail != null) && (localail.tWa != null))
          {
            localObject = new HashMap();
            ((Map)localObject).put("err_code", Integer.valueOf(localail.tWa.ret));
            paramAnonymousk = "openEnterpriseChat:fail";
            if (localail.tWa.eGz != null) {
              paramAnonymousk = localail.tWa.eGz;
            }
            g.this.a(parami, paramAnonymousk, (Map)localObject);
            GMTrace.o(19422781636608L, 144711);
            return;
          }
          g.this.a(parami, "openEnterpriseChat:fail", null);
          GMTrace.o(19422781636608L, 144711);
          return;
        }
        Object localObject = localail.tVU;
        paramAnonymousk = ((com.tencent.mm.af.a.t)paramAnonymousk).gyM;
        if (paramAnonymousk == null)
        {
          g.this.a(parami, "openEnterpriseChat:fail", null);
          GMTrace.o(19422781636608L, 144711);
          return;
        }
        paramAnonymousk = com.tencent.mm.af.x.FI().jd(paramAnonymousk);
        if ((paramAnonymousk != null) && (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)))
        {
          Intent localIntent;
          if ((!com.tencent.mm.sdk.platformtools.bg.nm(str4)) && (str4.equals("long")))
          {
            localIntent = new Intent();
            localIntent.addFlags(67108864);
            localIntent.putExtra("biz_chat_need_to_jump_to_chatting_ui", true);
            localIntent.putExtra("Main_User", (String)localObject);
            localIntent.putExtra("biz_chat_chat_id", paramAnonymousk.field_bizChatLocalId);
            localIntent.putExtra("biz_chat_from_scene", 8);
            com.tencent.mm.bj.d.a(g.this.context, ".ui.LauncherUI", localIntent);
          }
          for (;;)
          {
            paramAnonymousk = new HashMap();
            if ((!com.tencent.mm.sdk.platformtools.bg.nm(localail.ufc)) && (!com.tencent.mm.sdk.platformtools.bg.nm(localail.ufd)))
            {
              paramAnonymousk.put("chat_type", localail.ufc);
              paramAnonymousk.put("chat_id", localail.ufd);
            }
            g.this.a(parami, "openEnterpriseChat:ok", paramAnonymousk);
            GMTrace.o(19422781636608L, 144711);
            return;
            localIntent = new Intent();
            localIntent.putExtra("Chat_User", (String)localObject);
            localIntent.putExtra("key_biz_chat_id", paramAnonymousk.field_bizChatLocalId);
            localIntent.putExtra("finish_direct", true);
            localIntent.putExtra("key_need_send_video", false);
            localIntent.putExtra("key_is_biz_chat", true);
            com.tencent.mm.bj.d.a(g.this.context, ".ui.chatting.En_5b8fbb1e", localIntent);
          }
        }
        g.this.a(parami, "openEnterpriseChat:fail", null);
        GMTrace.o(19422781636608L, 144711);
      }
    });
    com.tencent.mm.kernel.h.xx().fYr.a(parami, 0);
    GMTrace.o(12195693854720L, 90865);
    return true;
  }
  
  public final boolean ba(i parami)
  {
    GMTrace.i(12190727798784L, 90828);
    String str1 = (String)parami.nSp.get("appId");
    String str2 = (String)parami.nSp.get("localId");
    Object localObject = parami.nSp.get("isShowProgressTips");
    if (localObject != null) {}
    boolean bool;
    for (;;)
    {
      try
      {
        int i = com.tencent.mm.sdk.platformtools.bg.getInt(localObject.toString(), 0);
        if (i == 1)
        {
          bool = true;
          w.i("MicroMsg.MsgHandler", "upload local video, appId = %s, localId = %s, isShowProgressTips(%s)", new Object[] { str1, str2, Boolean.valueOf(bool) });
          if ((!com.tencent.mm.sdk.platformtools.bg.nm(str1)) && (!com.tencent.mm.sdk.platformtools.bg.nm(str2))) {
            break;
          }
          w.e("MicroMsg.MsgHandler", "appId or localId is null or nil.");
          a(parami, "uploadVideo:fail_missing arguments", null);
          GMTrace.o(12190727798784L, 90828);
          return true;
        }
        bool = false;
        continue;
        bool = true;
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.MsgHandler", "Exception has occurred : %s", new Object[] { localException.getMessage() });
      }
    }
    b(parami, str1, str2, com.tencent.mm.modelcdntran.b.MediaType_FILE, 0, 0, "uploadVideo", bool);
    GMTrace.o(12190727798784L, 90828);
    return true;
  }
  
  public final boolean bb(final i parami)
  {
    GMTrace.i(12190996234240L, 90830);
    if (bFE()) {
      try
      {
        this.rEM.m(2007, null);
        a(parami, "startRecord:fail_recording", null);
        GMTrace.o(12190996234240L, 90830);
        return true;
      }
      catch (Exception localException1)
      {
        for (;;)
        {
          w.e("MicroMsg.MsgHandler", "callback start record failed");
        }
      }
    }
    Object localObject = (String)parami.nSp.get("appId");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      w.e("MicroMsg.MsgHandler", "appId is null or nil.");
      a(parami, "startRecord:fail_missing arguments", null);
      GMTrace.o(12190996234240L, 90830);
      return true;
    }
    k.a(parami.rUT, false, null, (String)localObject);
    if (!com.tencent.mm.pluginsdk.h.a.aS(this.context, "android.permission.RECORD_AUDIO"))
    {
      parami = this.context;
      localObject = this.rEM;
      int i = this.eQd;
      WebViewStubTempUI.a(parami, (com.tencent.mm.plugin.webview.stub.e)localObject, new String[] { "android.permission.RECORD_AUDIO" }, i);
      GMTrace.o(12190996234240L, 90830);
      return true;
    }
    String str = ai.Lr((String)localObject);
    final WebViewJSSDKFileItem localWebViewJSSDKFileItem = WebViewJSSDKFileItem.Li(str);
    localWebViewJSSDKFileItem.appId = ((String)localObject);
    com.tencent.mm.plugin.webview.modeltools.f.bCW().b(localWebViewJSSDKFileItem);
    w.i("MicroMsg.MsgHandler", "start record appId : %s, voice file name : %s, voice file path : %s", new Object[] { localObject, str, localWebViewJSSDKFileItem.hOo });
    this.rTg = localWebViewJSSDKFileItem.eHy;
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(14399146295296L, 107282);
        final fc localfc = new fc();
        localfc.eHg.op = 1;
        localfc.eHg.filePath = localWebViewJSSDKFileItem.hOo;
        localfc.eHg.duration = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("duration"), 60);
        localfc.eHg.euZ = new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19451638448128L, 144926);
            w.i("MicroMsg.MsgHandler", "onVoiceRecordEnd, localId(%s).", new Object[] { g.63.this.rUh.eHy });
            for (;;)
            {
              try
              {
                g.this.rTg = null;
                localBundle = new Bundle();
                localBundle.putString("localId", g.63.this.rUh.eHy);
                localStringBuilder = new StringBuilder("onVoiceRecordEnd:");
                if (localfc.eHh.eHi != 2) {
                  break label197;
                }
                if (localfc.eHh.eHi != 3) {
                  break label203;
                }
              }
              catch (Exception localException)
              {
                Bundle localBundle;
                StringBuilder localStringBuilder;
                String str1;
                w.e("MicroMsg.MsgHandler", "callback stop record failed");
                GMTrace.o(19451638448128L, 144926);
                return;
              }
              localBundle.putString("recordResult", str1);
              if (g.this.rEM != null)
              {
                g.this.rEM.m(2008, localBundle);
                GMTrace.o(19451638448128L, 144926);
                return;
              }
              w.e("MicroMsg.MsgHandler", "callbacker is null");
              GMTrace.o(19451638448128L, 144926);
              return;
              label197:
              String str2 = "ok";
              continue;
              label203:
              str2 = "fail";
            }
          }
        };
        com.tencent.mm.sdk.b.a.vgX.m(localfc);
        GMTrace.o(14399146295296L, 107282);
      }
    });
    try
    {
      this.rEM.m(2007, null);
      a(parami, "startRecord:ok", null);
      GMTrace.o(12190996234240L, 90830);
      return true;
    }
    catch (Exception localException2)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "callback start record failed");
      }
    }
  }
  
  public final boolean bc(i parami)
  {
    GMTrace.i(12191130451968L, 90831);
    if (!bFE())
    {
      w.w("MicroMsg.MsgHandler", "Do not in recording state.");
      a(parami, "stopRecord:fail", null);
      GMTrace.o(12191130451968L, 90831);
      return true;
    }
    Object localObject = (String)parami.nSp.get("appId");
    w.i("MicroMsg.MsgHandler", "stop record appId : %s", new Object[] { localObject });
    k.a(parami.rUT, false, null, (String)localObject);
    final WebViewJSSDKFileItem localWebViewJSSDKFileItem = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(this.rTg);
    if ((localWebViewJSSDKFileItem == null) || (!((String)localObject).equals(localWebViewJSSDKFileItem.appId)))
    {
      w.e("MicroMsg.MsgHandler", "get jssdk file item by id failed or the appid is not corrected, appid is : %s", new Object[] { localObject });
      a(parami, "stopRecord:fail", null);
      GMTrace.o(12191130451968L, 90831);
      return true;
    }
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(18136707366912L, 135129);
        fc localfc = new fc();
        localfc.eHg.op = 2;
        localfc.eHg.filePath = localWebViewJSSDKFileItem.hOo;
        com.tencent.mm.sdk.b.a.vgX.m(localfc);
        g.this.rTg = null;
        GMTrace.o(18136707366912L, 135129);
      }
    });
    w.i("MicroMsg.MsgHandler", "stop record, file name  : %s, file path : %s, localid : %s", new Object[] { localWebViewJSSDKFileItem.euR, localWebViewJSSDKFileItem.hOo, localWebViewJSSDKFileItem.eHy });
    localObject = new HashMap();
    ((HashMap)localObject).put("localId", localWebViewJSSDKFileItem.eHy);
    try
    {
      this.rEM.m(2009, null);
      a(parami, "stopRecord:ok", (Map)localObject);
      GMTrace.o(12191130451968L, 90831);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "callback on stop record failed.");
      }
    }
  }
  
  public final boolean bd(i parami)
  {
    GMTrace.i(16073378234368L, 119756);
    final Object localObject = (String)parami.nSp.get("appId");
    final String str = (String)parami.nSp.get("localId");
    k.a(parami.rUT, false, null, (String)localObject);
    w.i("MicroMsg.MsgHandler", "doPlayVoice, appId : %s, localId : %s", new Object[] { localObject, str });
    if ((com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) || (com.tencent.mm.sdk.platformtools.bg.nm(str)))
    {
      a(parami, "playVoice:fail_missing arguments", null);
      GMTrace.o(16073378234368L, 119756);
      return true;
    }
    localObject = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(str);
    if (localObject != null)
    {
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19430297829376L, 144767);
          ez localez = new ez();
          localez.eGZ.op = 1;
          localez.eGZ.euR = localObject.euR;
          localez.eGZ.ewD = true;
          localez.eGZ.eHc = new com.tencent.mm.ad.g.a()
          {
            public final void onCompletion()
            {
              GMTrace.i(19454725455872L, 144949);
              try
              {
                Bundle localBundle = new Bundle();
                localBundle.putString("playResult", "onVoicePlayEnd:ok");
                localBundle.putString("localId", g.66.this.ieu);
                g.this.rEM.m(2002, localBundle);
                GMTrace.o(19454725455872L, 144949);
                return;
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.MsgHandler", "notify voice play end failed : %s", new Object[] { localException.getMessage() });
                GMTrace.o(19454725455872L, 144949);
              }
            }
          };
          localez.eGZ.eHd = new com.tencent.mm.ad.g.b()
          {
            public final void onError()
            {
              GMTrace.i(19454993891328L, 144951);
              try
              {
                Bundle localBundle = new Bundle();
                localBundle.putString("playResult", "onVoicePlayEnd:fail");
                localBundle.putString("localId", g.66.this.ieu);
                g.this.rEM.m(2002, localBundle);
                GMTrace.o(19454993891328L, 144951);
                return;
              }
              catch (Exception localException)
              {
                w.e("MicroMsg.MsgHandler", "notify voice play end failed : %s", new Object[] { localException.getMessage() });
                GMTrace.o(19454993891328L, 144951);
              }
            }
          };
          com.tencent.mm.sdk.b.a.vgX.m(localez);
          GMTrace.o(19430297829376L, 144767);
        }
      });
      a(parami, "playVoice:ok", null);
    }
    for (;;)
    {
      GMTrace.o(16073378234368L, 119756);
      return true;
      a(parami, "playVoice:fail_arguments error", null);
    }
  }
  
  public final boolean be(i parami)
  {
    GMTrace.i(16073512452096L, 119757);
    final Object localObject = (String)parami.nSp.get("appId");
    String str = (String)parami.nSp.get("localId");
    w.i("MicroMsg.MsgHandler", "doStopVoice, appId : %s, localId : %s", new Object[] { localObject, str });
    k.a(parami.rUT, false, null, (String)localObject);
    if ((com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) || (com.tencent.mm.sdk.platformtools.bg.nm(str)))
    {
      a(parami, "stopVoice:fail_missing arguments", null);
      GMTrace.o(16073512452096L, 119757);
      return true;
    }
    localObject = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(str);
    if (localObject != null)
    {
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19450967359488L, 144921);
          ez localez = new ez();
          localez.eGZ.op = 2;
          localez.eGZ.euR = localObject.euR;
          com.tencent.mm.sdk.b.a.vgX.m(localez);
          GMTrace.o(19450967359488L, 144921);
        }
      });
      a(parami, "stopVoice:ok", null);
    }
    for (;;)
    {
      GMTrace.o(16073512452096L, 119757);
      return true;
      a(parami, "stopVoice:fail_not playing", null);
    }
  }
  
  public final boolean bf(i parami)
  {
    GMTrace.i(16073646669824L, 119758);
    final Object localObject = (String)parami.nSp.get("appId");
    String str = (String)parami.nSp.get("localId");
    k.a(parami.rUT, false, null, (String)localObject);
    w.i("MicroMsg.MsgHandler", "doStopVoice, appId : %s, localId : %s", new Object[] { localObject, str });
    if ((com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) || (com.tencent.mm.sdk.platformtools.bg.nm(str)))
    {
      a(parami, "pauseVoice:fail_missing arguments", null);
      GMTrace.o(16073646669824L, 119758);
      return true;
    }
    localObject = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(str);
    if (localObject != null)
    {
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(19439693070336L, 144837);
          ez localez = new ez();
          localez.eGZ.op = 4;
          localez.eGZ.euR = localObject.euR;
          com.tencent.mm.sdk.b.a.vgX.m(localez);
          GMTrace.o(19439693070336L, 144837);
        }
      });
      a(parami, "pauseVoice:ok", null);
    }
    for (;;)
    {
      GMTrace.o(16073646669824L, 119758);
      return true;
      a(parami, "pauseVoice:fail_not playing", null);
    }
  }
  
  public final boolean bg(final i parami)
  {
    GMTrace.i(12191264669696L, 90832);
    Object localObject1 = (String)parami.nSp.get("appId");
    final String str = (String)parami.nSp.get("localId");
    Object localObject2 = parami.nSp.get("isShowProgressTips");
    if (localObject2 != null) {}
    boolean bool1;
    for (;;)
    {
      try
      {
        int i = com.tencent.mm.sdk.platformtools.bg.getInt(localObject2.toString(), 0);
        if (i == 1)
        {
          bool1 = true;
          k.a(parami.rUT, false, null, (String)localObject1);
          w.i("MicroMsg.MsgHandler", "doUploadVoice, appId : %s, localId : %s, isShowProgressTips(%s)", new Object[] { localObject1, str, Boolean.valueOf(bool1) });
          if ((!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) && (!com.tencent.mm.sdk.platformtools.bg.nm(str))) {
            break;
          }
          w.e("MicroMsg.MsgHandler", "appId or localId is null or nil.");
          a(parami, "uploadVoice:fail_missing arguments", null);
          GMTrace.o(12191264669696L, 90832);
          return true;
        }
        bool1 = false;
        continue;
        bool1 = true;
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
    }
    final c.b local69 = new c.b()
    {
      public final void b(boolean paramAnonymousBoolean, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
      {
        GMTrace.i(19455262326784L, 144953);
        w.i("MicroMsg.MsgHandler", "doUploadVoice, on cdn finish,  is success : %s, mediaid : %s, local id is : %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString2, paramAnonymousString1 });
        if ((!com.tencent.mm.sdk.platformtools.bg.nm(paramAnonymousString1)) && (paramAnonymousString1.equals(str)))
        {
          com.tencent.mm.plugin.webview.modeltools.f.bCV().a(this);
          if (g.this.htG != null)
          {
            g.this.htG.dismiss();
            g.this.htG = null;
          }
          if (!paramAnonymousBoolean)
          {
            g.this.a(parami, "uploadVoice:fail", null);
            GMTrace.o(19455262326784L, 144953);
            return;
          }
          paramAnonymousString1 = new HashMap();
          paramAnonymousString1.put("serverId", paramAnonymousString2);
          g.this.a(parami, "uploadVoice:ok", paramAnonymousString1);
        }
        GMTrace.o(19455262326784L, 144953);
      }
    };
    boolean bool2 = com.tencent.mm.plugin.webview.modeltools.f.bCV().b((String)localObject1, str, local69);
    w.i("MicroMsg.MsgHandler", "doUploadVoice, add cdn upload task result : %b", new Object[] { Boolean.valueOf(bool2) });
    if (!bool2) {
      a(parami, "uploadVoice:fail", null);
    }
    for (;;)
    {
      GMTrace.o(12191264669696L, 90832);
      return true;
      if (bool1)
      {
        localObject1 = this.context;
        this.context.getString(R.l.cUG);
        this.htG = com.tencent.mm.ui.base.h.a((Context)localObject1, this.context.getString(R.l.elO), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(19424660684800L, 144725);
            com.tencent.mm.plugin.webview.modeltools.f.bCV().a(local69);
            com.tencent.mm.plugin.webview.modeltools.f.bCV();
            com.tencent.mm.plugin.webview.model.ac.oK(str);
            g.this.a(parami, "uploadVoice:fail", null);
            GMTrace.o(19424660684800L, 144725);
          }
        });
      }
    }
  }
  
  public final boolean bh(final i parami)
  {
    GMTrace.i(12191398887424L, 90833);
    Object localObject1 = (String)parami.nSp.get("appId");
    final String str = (String)parami.nSp.get("serverId");
    Object localObject2 = parami.nSp.get("isShowProgressTips");
    if (localObject2 != null) {}
    boolean bool;
    for (;;)
    {
      try
      {
        int i = com.tencent.mm.sdk.platformtools.bg.getInt(localObject2.toString(), 0);
        if (i == 1)
        {
          bool = true;
          k.a(parami.rUT, false, null, (String)localObject1);
          w.i("MicroMsg.MsgHandler", "doDownloadVoice, appid is : %s, media id is : %s, isShowProgDialog(%s)", new Object[] { localObject1, str, Boolean.valueOf(bool) });
          if (!com.tencent.mm.sdk.platformtools.bg.nm(str)) {
            break;
          }
          a(parami, "downloadVoice:fail_invaild_serverId", null);
          GMTrace.o(12191398887424L, 90833);
          return true;
        }
        bool = false;
        continue;
        bool = true;
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
    }
    final c.b local72 = new c.b()
    {
      public final void b(boolean paramAnonymousBoolean, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
      {
        GMTrace.i(19420499935232L, 144694);
        w.i("MicroMsg.MsgHandler", "doDownloadVoice, on cdn finish, is success : %b, local id : %s, media id is : %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString1, paramAnonymousString2 });
        if ((!com.tencent.mm.sdk.platformtools.bg.nm(paramAnonymousString2)) && (paramAnonymousString2.equals(str)))
        {
          com.tencent.mm.plugin.webview.modeltools.f.bCV().a(this);
          if (g.this.htG != null)
          {
            g.this.htG.dismiss();
            g.this.htG = null;
          }
          if (!paramAnonymousBoolean)
          {
            g.this.a(parami, "downloadVoice:fail", null);
            GMTrace.o(19420499935232L, 144694);
            return;
          }
          paramAnonymousString2 = new HashMap();
          paramAnonymousString2.put("localId", paramAnonymousString1);
          g.this.a(parami, "downloadVoice:ok", paramAnonymousString2);
        }
        GMTrace.o(19420499935232L, 144694);
      }
    };
    com.tencent.mm.plugin.webview.modeltools.f.bCV().a((String)localObject1, str, local72);
    w.i("MicroMsg.MsgHandler", "doDownloadVoice, add cdn download task result : %b", new Object[] { Boolean.valueOf(true) });
    if (bool)
    {
      localObject1 = this.context;
      this.context.getString(R.l.cUG);
      this.htG = com.tencent.mm.ui.base.h.a((Context)localObject1, this.context.getString(R.l.elt), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(19443988037632L, 144869);
          com.tencent.mm.plugin.webview.modeltools.f.bCV().a(local72);
          com.tencent.mm.plugin.webview.modeltools.f.bCV();
          com.tencent.mm.plugin.webview.model.ac.Lg(str);
          g.this.a(parami, "downloadVoice:fail", null);
          GMTrace.o(19443988037632L, 144869);
        }
      });
    }
    GMTrace.o(12191398887424L, 90833);
    return true;
  }
  
  public final boolean bi(i parami)
  {
    GMTrace.i(12191533105152L, 90834);
    Object localObject1 = (String)parami.nSp.get("menuList");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
    {
      a(parami, "hideMenuItems:param is empty", null);
      GMTrace.o(12191533105152L, 90834);
      return true;
    }
    try
    {
      Object localObject2 = new JSONArray((String)localObject1);
      localObject1 = new ArrayList();
      int i = 0;
      while (i < ((JSONArray)localObject2).length())
      {
        ((ArrayList)localObject1).add(((JSONArray)localObject2).getString(i));
        i += 1;
      }
      localObject2 = new Bundle();
      ((Bundle)localObject2).putStringArrayList("menu_item_list", (ArrayList)localObject1);
      this.rEM.o(3001, (Bundle)localObject2);
      a(parami, "hideMenuItems:ok", null);
      GMTrace.o(12191533105152L, 90834);
      return true;
    }
    catch (JSONException localJSONException)
    {
      w.w("MicroMsg.MsgHandler", "JSONException : %s", new Object[] { localJSONException.getMessage() });
      a(parami, "hideMenuItems:param is empty", null);
      GMTrace.o(12191533105152L, 90834);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      a(parami, "hideMenuItems:param is empty", null);
      GMTrace.o(12191533105152L, 90834);
    }
    return true;
  }
  
  public final boolean bj(i parami)
  {
    GMTrace.i(12191667322880L, 90835);
    Object localObject1 = (String)parami.nSp.get("menuList");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
    {
      a(parami, "showMenuItems:param is empty", null);
      GMTrace.o(12191667322880L, 90835);
      return true;
    }
    try
    {
      Object localObject2 = new JSONArray((String)localObject1);
      localObject1 = new ArrayList();
      int i = 0;
      while (i < ((JSONArray)localObject2).length())
      {
        ((ArrayList)localObject1).add(((JSONArray)localObject2).getString(i));
        i += 1;
      }
      localObject2 = new Bundle();
      ((Bundle)localObject2).putStringArrayList("menu_item_list", (ArrayList)localObject1);
      this.rEM.o(3002, (Bundle)localObject2);
    }
    catch (JSONException localJSONException)
    {
      w.w("MicroMsg.MsgHandler", "JSONException : %s", new Object[] { localJSONException.getMessage() });
      a(parami, "showMenuItems:param is empty", null);
      GMTrace.o(12191667322880L, 90835);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "RemoteException : %s", new Object[] { localRemoteException.getMessage() });
        a(parami, "showMenuItems:param is empty", null);
      }
    }
    a(parami, "showMenuItems:ok", null);
    GMTrace.o(12191667322880L, 90835);
    return true;
  }
  
  public final boolean bk(i parami)
  {
    GMTrace.i(12192069976064L, 90838);
    try
    {
      this.rEM.o(3003, null);
      a(parami, "hideAllNonBaseMenuItem:ok", null);
      GMTrace.o(12192069976064L, 90838);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "RemoteException : %s", new Object[] { localRemoteException.getMessage() });
        a(parami, "hideAllNonBaseMenuItem:param is empty", null);
      }
    }
  }
  
  public final boolean bl(i parami)
  {
    GMTrace.i(12192204193792L, 90839);
    try
    {
      this.rEM.o(3004, null);
      a(parami, "showAllNonBaseMenuItem:ok", null);
      GMTrace.o(12192204193792L, 90839);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "RemoteException : %s", new Object[] { localRemoteException.getMessage() });
        a(parami, "showAllNonBaseMenuItem:param is empty", null);
      }
    }
  }
  
  public final boolean bm(i parami)
  {
    GMTrace.i(12192338411520L, 90840);
    Object localObject = (String)parami.nSp.get("jsApiList");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      a(parami, "checkJsApi:param is empty", null);
      GMTrace.o(12192338411520L, 90840);
      return true;
    }
    for (;;)
    {
      try
      {
        JSONObject localJSONObject = new JSONObject();
        localObject = new JSONArray((String)localObject);
        if (((JSONArray)localObject).length() == 0)
        {
          a(parami, "checkJsApi:param is empty", null);
          GMTrace.o(12192338411520L, 90840);
          return true;
        }
        int i = 0;
        if (i < ((JSONArray)localObject).length())
        {
          String str = ((JSONArray)localObject).getString(i);
          if (com.tencent.mm.protocal.c.Qc(str) == null)
          {
            if (c.kj.tJu == null)
            {
              HashSet localHashSet = new HashSet();
              c.kj.tJu = localHashSet;
              localHashSet.add("menu:share:QZone");
              c.kj.tJu.add("onImageDownloadProgress");
              c.kj.tJu.add("onVoiceUploadProgress");
              c.kj.tJu.add("onVoiceDownloadProgress");
              c.kj.tJu.add("onVoiceRecordEnd");
              c.kj.tJu.add("onVoicePlayBegin");
              c.kj.tJu.add("onVoicePlayEnd");
              c.kj.tJu.add("onLocalImageUploadProgress");
              c.kj.tJu.add("wxdownload:state_change");
              c.kj.tJu.add("wxdownload:progress_change");
              c.kj.tJu.add("hdOnDeviceStateChanged");
              c.kj.tJu.add("activity:state_change");
              c.kj.tJu.add("onWXDeviceBluetoothStateChange");
              c.kj.tJu.add("onWXDeviceLanStateChange");
              c.kj.tJu.add("onWXDeviceBindStateChange");
              c.kj.tJu.add("onReceiveDataFromWXDevice");
              c.kj.tJu.add("onScanWXDeviceResult");
              c.kj.tJu.add("onWXDeviceStateChange");
              c.kj.tJu.add("onGetKeyboardHeight");
              c.kj.tJu.add("onGetSmiley");
              c.kj.tJu.add("onAddShortcutStatus");
              c.kj.tJu.add("onMediaFileUploadProgess");
              c.kj.tJu.add("onGetA8KeyUrl");
              c.kj.tJu.add("onPageStateChange");
              c.kj.tJu.add("onGetMsgProofItems");
              c.kj.tJu.add("onNavigationBarRightButtonClick");
              c.kj.tJu.add("onBackgroundAudioStateChange");
              c.kj.tJu.add("onNetWorkChange");
              c.kj.tJu.add("onCustomGameMenuClicked");
            }
            if (!c.kj.tJu.contains(str)) {
              break label620;
            }
            break label615;
            localJSONObject.put(str, bool);
            i += 1;
          }
        }
        else
        {
          localObject = new HashMap();
          ((HashMap)localObject).put("checkResult", localJSONObject.toString());
          a(parami, "checkJsApi:ok", (Map)localObject);
          GMTrace.o(12192338411520L, 90840);
          return true;
        }
      }
      catch (JSONException localJSONException)
      {
        w.w("MicroMsg.MsgHandler", "JSONException : %s", new Object[] { localJSONException.getMessage() });
        a(parami, "checkJsApi:param is empty", null);
        GMTrace.o(12192338411520L, 90840);
        return true;
      }
      label615:
      boolean bool = true;
      continue;
      label620:
      bool = false;
    }
  }
  
  public final boolean bn(i parami)
  {
    GMTrace.i(16073780887552L, 119759);
    final Object localObject = parami.nSp.get("type");
    if (localObject == null) {}
    final String str2;
    for (localObject = "0";; localObject = localObject.toString())
    {
      w.i("[MicroMsg.FreeWifi.MsgHandler]", "connect to freewifi, type is : %s", new Object[] { localObject });
      str2 = (String)parami.nSp.get("src_username");
      if ((((String)localObject).equals("0")) || (((String)localObject).equals("1")) || (((String)localObject).equals("2"))) {
        break;
      }
      a(parami, "connectToFreeWifi:failed_invaildParam", null);
      GMTrace.o(16073780887552L, 119759);
      return true;
    }
    final String str1 = (String)parami.nSp.get("apKey");
    w.i("[MicroMsg.FreeWifi.MsgHandler]", "connect to freewifi, ap key is : %s", new Object[] { str1 });
    if (com.tencent.mm.sdk.platformtools.bg.nm(str1)) {
      str1 = "";
    }
    for (;;)
    {
      if ((((String)localObject).equals("0")) && (com.tencent.mm.sdk.platformtools.bg.nm(str1)))
      {
        a(parami, "connectToFreeWifi:failed_invaildParam", null);
        GMTrace.o(16073780887552L, 119759);
        return true;
      }
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(14383711256576L, 107167);
          Intent localIntent = new Intent();
          localIntent.putExtra("free_wifi_jsapi_param_type", localObject);
          localIntent.putExtra("free_wifi_ap_key", str1);
          localIntent.putExtra("free_wifi_jsapi_param_username", str2);
          localIntent.putExtra("free_wifi_sessionkey", this.rUn);
          localIntent.putExtra("free_wifi_source", 4);
          localIntent.addFlags(67108864);
          if ((!com.tencent.mm.sdk.platformtools.bg.nm(localObject)) && (localObject.equalsIgnoreCase("2")) && (!com.tencent.mm.sdk.platformtools.bg.nm(str1)))
          {
            Uri localUri = Uri.parse(str1);
            String str1 = localUri.getHost();
            String str2 = localUri.getQuery();
            if ((!com.tencent.mm.sdk.platformtools.bg.nm(str1)) && ("connectToFreeWifi".equals(str1)) && (!com.tencent.mm.sdk.platformtools.bg.nm(str2)) && (str2.startsWith("apKey=")))
            {
              str1 = localUri.getQueryParameter("apKey");
              w.i("[MicroMsg.FreeWifi.MsgHandler]", "apKey value = %s", new Object[] { str1 });
              str2 = localUri.getQueryParameter("ticket");
              if ((!com.tencent.mm.sdk.platformtools.bg.nm(str1)) && (str1.length() < 1024))
              {
                localIntent.putExtra("free_wifi_schema_uri", localUri.toString());
                localIntent.putExtra("free_wifi_ap_key", str1);
                localIntent.putExtra("free_wifi_source", 5);
                localIntent.putExtra("free_wifi_threeone_startup_type", 4);
                if (!com.tencent.mm.sdk.platformtools.bg.nm(str2)) {
                  localIntent.putExtra("free_wifi_schema_ticket", str2);
                }
              }
            }
          }
          com.tencent.mm.bj.d.b(g.this.context, "freewifi", ".ui.FreeWifiEntryUI", localIntent);
          GMTrace.o(14383711256576L, 107167);
        }
      });
      a(parami, "connectToFreeWifi:ok", null);
      GMTrace.o(16073780887552L, 119759);
      return true;
    }
  }
  
  public final boolean bo(i parami)
  {
    GMTrace.i(12192472629248L, 90841);
    for (;;)
    {
      try
      {
        str = (String)parami.nSp.get("userName");
      }
      catch (Exception parami)
      {
        String str;
        int i;
        w.w("MicroMsg.MsgHandler", "setFreeWifiOwner, Exception: %s", new Object[] { parami.getMessage() });
        continue;
      }
      try
      {
        i = ((Integer)parami.nSp.get("type")).intValue();
        a(parami, "setFreeWifiOwner:ok", null);
        parami = new Intent();
        parami.putExtra("wifi_owner_name", str);
        parami.putExtra("wifi_owner_type", i);
        com.tencent.mm.bj.d.a(this.context, "freewifi", ".ui.FreeWifiOwnerUI", parami, false);
        GMTrace.o(12192472629248L, 90841);
        return false;
      }
      catch (Exception localException)
      {
        i = 0;
      }
    }
  }
  
  public final boolean bp(final i parami)
  {
    GMTrace.i(12192606846976L, 90842);
    final Object localObject1 = (String)parami.nSp.get("appId");
    final String str = (String)parami.nSp.get("localId");
    Object localObject2 = parami.nSp.get("isShowProgressTips");
    if (localObject2 != null) {}
    final boolean bool;
    for (;;)
    {
      try
      {
        int i = com.tencent.mm.sdk.platformtools.bg.getInt(localObject2.toString(), 0);
        if (i == 1)
        {
          bool = true;
          w.i("MicroMsg.MsgHandler", "isShowProgressTips(%s)", new Object[] { Boolean.valueOf(bool) });
          k.a(parami.rUT, false, null, (String)localObject1);
          if ((!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) && (!com.tencent.mm.sdk.platformtools.bg.nm(str))) {
            break;
          }
          w.i("MicroMsg.MsgHandler", "The localId(%s) is null or appId(%s) is null.", new Object[] { str, localObject1 });
          a(parami, "translateVoice:fail_missing arguments", null);
          GMTrace.o(12192606846976L, 90842);
          return true;
        }
        bool = false;
        continue;
        bool = true;
      }
      catch (Exception localException)
      {
        w.w("MicroMsg.MsgHandler", "Exception has occured : %s", new Object[] { localException.getMessage() });
      }
    }
    localObject1 = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(str);
    if (localObject1 != null) {
      com.tencent.mm.sdk.platformtools.af.t(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18147310567424L, 135208);
          if (bool)
          {
            localObject = g.this;
            Context localContext = g.this.context;
            g.this.context.getString(R.l.cUG);
            ((g)localObject).htG = com.tencent.mm.ui.base.h.a(localContext, g.this.context.getString(R.l.elN), true, new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymous2DialogInterface)
              {
                GMTrace.i(19428284563456L, 144752);
                paramAnonymous2DialogInterface = new ff();
                paramAnonymous2DialogInterface.eHw.eHz = 1;
                com.tencent.mm.sdk.b.a.vgX.m(paramAnonymous2DialogInterface);
                g.this.a(g.75.this.rTq, "translateVoice:fail", null);
                GMTrace.o(19428284563456L, 144752);
              }
            });
          }
          final Object localObject = new ff();
          ((ff)localObject).eHw.eHy = str;
          ((ff)localObject).eHw.euR = localObject1.euR;
          ((ff)localObject).eHw.eHz = 0;
          ((ff)localObject).eHw.eHA = new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19435263885312L, 144804);
              if (localObject.eHx.eFp)
              {
                if (g.this.htG != null)
                {
                  g.this.htG.dismiss();
                  g.this.htG = null;
                }
                if (com.tencent.mm.sdk.platformtools.bg.nm(localObject.eHx.content))
                {
                  g.this.a(g.75.this.rTq, "translateVoice:fail", null);
                  GMTrace.o(19435263885312L, 144804);
                  return;
                }
                HashMap localHashMap = new HashMap();
                localHashMap.put("translateResult", localObject.eHx.content);
                g.this.a(g.75.this.rTq, "translateVoice:ok", localHashMap);
              }
              GMTrace.o(19435263885312L, 144804);
            }
          };
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          GMTrace.o(18147310567424L, 135208);
        }
      });
    }
    for (;;)
    {
      GMTrace.o(12192606846976L, 90842);
      return true;
      a(parami, "translateVoice:fail_arguments error", null);
    }
  }
  
  public final boolean br(i parami)
  {
    GMTrace.i(12192875282432L, 90844);
    if (!com.tencent.mm.plugin.webview.stub.a.dt(this.context))
    {
      w.w("MicroMsg.MsgHandler", "Tencent QQ hasn't installed at all.");
      a(parami, "shareQQ:fail", null);
      GMTrace.o(12192875282432L, 90844);
      return true;
    }
    String str1 = (String)parami.nSp.get("img_url");
    String str2 = (String)parami.nSp.get("title");
    String str3 = (String)parami.nSp.get("desc");
    String str4 = this.context.getResources().getString(R.l.app_name);
    Object localObject3 = (String)parami.nSp.get("link");
    Object localObject1 = localObject3;
    Object localObject2;
    try
    {
      if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject3)) {
        localObject1 = this.rEM.Zi();
      }
      localObject3 = ak.zA((String)localObject1);
      if ((com.tencent.mm.sdk.platformtools.bg.nm((String)localObject3)) || (com.tencent.mm.sdk.platformtools.bg.nm(str2)) || (com.tencent.mm.sdk.platformtools.bg.nm(str3)))
      {
        w.w("MicroMsg.MsgHandler", "url(%s) or title(%s) or description(%s) is null or nil.", new Object[] { localObject3, str2, str3 });
        a(parami, "shareQQ:fail", null);
        GMTrace.o(12192875282432L, 90844);
        return true;
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "Get current url fail. exception : %s", new Object[] { localRemoteException.getMessage() });
        localObject2 = localObject3;
      }
      localObject2 = new HashMap();
      ((Map)localObject2).put("image_url", com.tencent.mm.pluginsdk.ui.tools.s.PK(str1));
      ((Map)localObject2).put("title", com.tencent.mm.pluginsdk.ui.tools.s.PK(str2));
      ((Map)localObject2).put("description", com.tencent.mm.pluginsdk.ui.tools.s.PK(str3));
      ((Map)localObject2).put("url", com.tencent.mm.pluginsdk.ui.tools.s.PK((String)localObject3));
      ((Map)localObject2).put("app_name", com.tencent.mm.pluginsdk.ui.tools.s.PK(str4));
      ((Map)localObject2).put("req_type", com.tencent.mm.pluginsdk.ui.tools.s.PK("1"));
      if (parami.rUU.equalsIgnoreCase("shareQZone")) {
        ((Map)localObject2).put("cflag", com.tencent.mm.pluginsdk.ui.tools.s.PK("1"));
      }
      localObject3 = new StringBuilder();
      ((StringBuilder)localObject3).append("mqqapi://share/to_fri?file_type=news&share_id=1103188687");
      ((StringBuilder)localObject3).append("&");
      ((StringBuilder)localObject3).append(com.tencent.mm.pluginsdk.ui.tools.s.af((Map)localObject2));
      w.d("MicroMsg.MsgHandler", "Uri : %s", new Object[] { ((StringBuilder)localObject3).toString() });
      localObject2 = new Intent("android.intent.action.VIEW", Uri.parse(((StringBuilder)localObject3).toString()));
      ((Intent)localObject2).putExtra("pkg_name", "com.tencent.mm");
      ((Intent)localObject2).getStringExtra("pkg_name");
      ((Intent)localObject2).setFlags(268435456);
      if (!com.tencent.mm.sdk.platformtools.bg.j(this.context, (Intent)localObject2)) {
        break label549;
      }
    }
    if ((this.context instanceof Activity))
    {
      ((Activity)this.context).startActivityForResult((Intent)localObject2, 44);
      a(parami, parami.rUU + ":ok", null);
    }
    for (;;)
    {
      GMTrace.o(12192875282432L, 90844);
      return true;
      label549:
      a(parami, parami.rUU + ":fail", null);
    }
  }
  
  public final boolean bs(i parami)
  {
    GMTrace.i(12193009500160L, 90845);
    Object localObject3 = (String)parami.nSp.get("desc");
    String str = (String)parami.nSp.get("img_url");
    Object localObject4 = (String)parami.nSp.get("link");
    Object localObject1 = localObject4;
    Object localObject2;
    try
    {
      if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject4)) {
        localObject1 = this.rEM.Zi();
      }
      localObject4 = ak.zA((String)localObject1);
      if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject4))
      {
        w.e("MicroMsg.MsgHandler", "link is null or nil.");
        a(parami, "shareWeiboApp:fail", null);
        GMTrace.o(12193009500160L, 90845);
        return true;
      }
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "Get current url fail. exception : %s", new Object[] { localRemoteException.getMessage() });
        localObject2 = localObject4;
      }
      localObject2 = localObject3;
      if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject3))
      {
        localObject2 = (String)parami.nSp.get("title");
        localObject2 = (String)localObject2 + " " + (String)localObject4;
      }
      localObject3 = new HashMap();
      ((Map)localObject3).put("type", Integer.valueOf(0));
      ((Map)localObject3).put("openLBS", Integer.valueOf(0));
      ((Map)localObject3).put("content", com.tencent.mm.pluginsdk.ui.tools.s.PJ((String)localObject2));
      ((Map)localObject3).put("url", com.tencent.mm.pluginsdk.ui.tools.s.PJ(str));
      ((Map)localObject3).put("thumbnailurl", com.tencent.mm.pluginsdk.ui.tools.s.PJ(str));
      localObject2 = new Intent("android.intent.action.VIEW", Uri.parse("weibo://t.qq.com/proxy/write"));
      localObject4 = new StringBuilder();
      ((StringBuilder)localObject4).append("TencentWeibo://Edit?from=weixin&");
      ((StringBuilder)localObject4).append(com.tencent.mm.pluginsdk.ui.tools.s.af((Map)localObject3));
      w.i("MicroMsg.MsgHandler", "Uri : %s", new Object[] { ((StringBuilder)localObject4).toString() });
      ((Intent)localObject2).putExtra("microblog.intent.extra.ACTION", ((StringBuilder)localObject4).toString());
      ((Intent)localObject2).setFlags(268435456);
      if (!com.tencent.mm.sdk.platformtools.bg.j(this.context, (Intent)localObject2)) {
        break label407;
      }
    }
    this.context.startActivity((Intent)localObject2);
    a(parami, "shareWeiboApp:ok", null);
    for (;;)
    {
      GMTrace.o(12193009500160L, 90845);
      return true;
      label407:
      a(parami, "shareWeiboApp:fail", null);
    }
  }
  
  public final boolean bt(i parami)
  {
    GMTrace.i(12193143717888L, 90846);
    String str = (String)parami.nSp.get("sessionId");
    Object localObject1 = (String)parami.nSp.get("sessionFrom");
    if (com.tencent.mm.sdk.platformtools.bg.nm(str))
    {
      a(parami, "startTempSession:fail_missing arguments", null);
      GMTrace.o(12193143717888L, 90846);
      return true;
    }
    if (localObject1 != null) {}
    for (;;)
    {
      try
      {
        localObject3 = URLEncoder.encode((String)localObject1, "UTF-8");
        localObject1 = localObject3;
      }
      catch (UnsupportedEncodingException localUnsupportedEncodingException)
      {
        Object localObject3;
        int j;
        continue;
        if (!(localUnsupportedEncodingException instanceof String)) {
          continue;
        }
        try
        {
          i = com.tencent.mm.sdk.platformtools.bg.getInt((String)localUnsupportedEncodingException, 0);
        }
        catch (NumberFormatException localNumberFormatException)
        {
          i = 0;
        }
        continue;
        localNumberFormatException.putExtra("translate_link_scene", 4);
        continue;
        int i = 0;
        continue;
      }
      localObject3 = parami.nSp.get("showType");
      if (localObject3 != null)
      {
        if ((localObject3 instanceof Integer))
        {
          i = ((Integer)localObject3).intValue();
          j = com.tencent.mm.sdk.platformtools.bg.getInt(com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("scene")), 0);
        }
        try
        {
          localObject1 = String.format("weixin://dl/business/tempsession/?username=%s&appid=%s&sessionFrom=%s&showtype=%s&scene=%s", new Object[] { str, this.rSL.Ms(this.rEM.Zi()), com.tencent.mm.sdk.platformtools.bg.nl((String)localObject1), Integer.valueOf(i), Integer.valueOf(j) });
          localObject3 = new Intent("android.intent.action.VIEW");
          ((Intent)localObject3).addCategory("android.intent.category.BROWSABLE");
          ((Intent)localObject3).setData(Uri.parse((String)localObject1));
          if (j == 0) {
            continue;
          }
          ((Intent)localObject3).putExtra("translate_link_scene", j);
          this.context.startActivity((Intent)localObject3);
          a(parami, "startTempSession:ok", null);
        }
        catch (Exception localException)
        {
          w.printErrStackTrace("MicroMsg.MsgHandler", localException, "", new Object[0]);
          a(parami, "startTempSession:fail_exception", null);
          continue;
        }
        GMTrace.o(12193143717888L, 90846);
        return true;
      }
      Object localObject2 = null;
    }
  }
  
  public final boolean bu(i parami)
  {
    GMTrace.i(16074049323008L, 119761);
    if ((this.context instanceof MMActivity))
    {
      String str = (String)parami.nSp.get("key");
      int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("procint"), 0);
      int j = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("dataint"), 0);
      parami = new Intent();
      parami.putExtra("encryptKey", str);
      parami.putExtra("procInterval", i);
      parami.putExtra("dataInterval", j);
      parami.putExtra("exdevice_airkiss_open_type", 1);
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.b(this.context, "exdevice", ".ui.ExdeviceConnectWifiUI", parami, 19);
    }
    for (;;)
    {
      GMTrace.o(16074049323008L, 119761);
      return true;
      a(parami, "configWXDeviceWiFi:fail", null);
    }
  }
  
  public final boolean bv(i parami)
  {
    GMTrace.i(12193277935616L, 90847);
    try
    {
      String str1 = (String)parami.nSp.get("userName");
      String str2 = (String)parami.nSp.get("nickName");
      if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
      {
        a(parami, "setPageOwner:missing_arguments", null);
        GMTrace.o(12193277935616L, 90847);
        return false;
      }
      this.rEM.ei(str1, str2);
      a(parami, "setPageOwner:ok", null);
    }
    catch (Exception parami)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "setPageOwner, Exception: %s", new Object[] { parami.getMessage() });
      }
    }
    GMTrace.o(12193277935616L, 90847);
    return false;
  }
  
  public final boolean bw(final i parami)
  {
    GMTrace.i(12193412153344L, 90848);
    try
    {
      String str1 = (String)parami.nSp.get("appId");
      String str2 = (String)parami.nSp.get("signature");
      k.a(parami.rUT, false, null, str1);
      if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
      {
        a(parami, "get_wechat_verify_ticket:fail ticket", null);
        GMTrace.o(12193412153344L, 90848);
        return false;
      }
      parami = new com.tencent.mm.ad.e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(19433250619392L, 144789);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.e("MicroMsg.MsgHandler", "doGetWechatVerifyTicket, errType = " + paramAnonymousInt1 + ", errCode = " + paramAnonymousInt2);
            g.this.a(parami, "get_wechat_verify_ticket:fail ticket", null);
          }
          for (;;)
          {
            com.tencent.mm.y.at.wS().b(1097, this);
            GMTrace.o(19433250619392L, 144789);
            return;
            paramAnonymousString = (com.tencent.mm.plugin.webview.model.g)paramAnonymousk;
            paramAnonymousk = new HashMap();
            paramAnonymousk.put("ticket", ((wj)paramAnonymousString.kzP.gtD.gtK).eEU);
            g.this.a(parami, "get_wechat_verify_ticket:ok ticket", paramAnonymousk);
          }
        }
      };
      com.tencent.mm.y.at.wS().a(1097, parami);
      parami = new com.tencent.mm.plugin.webview.model.g(str1, str2);
      com.tencent.mm.y.at.wS().a(parami, 0);
    }
    catch (Exception parami)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "getWechatVerifyTicket, Exception: %s", new Object[] { parami.getMessage() });
      }
    }
    GMTrace.o(12193412153344L, 90848);
    return false;
  }
  
  public final boolean bx(i parami)
  {
    GMTrace.i(16074183540736L, 119762);
    w.i("MicroMsg.MsgHandler", "doScanCover");
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    Intent localIntent = new Intent();
    localIntent.putExtra("BaseScanUI_select_scan_mode", 2);
    if ((!com.tencent.mm.p.a.aQ(this.context)) && (!com.tencent.mm.p.a.aP(this.context)))
    {
      com.tencent.mm.bj.d.a(this.context, "scanner", ".ui.SingleTopScanUI", localIntent, false);
      a(parami, "sacnCover:ok", null);
    }
    for (;;)
    {
      GMTrace.o(16074183540736L, 119762);
      return true;
      w.i("MicroMsg.MsgHandler", "VoipOutOfPackageUtil.checkCameraUsingAndShowToast fail");
      a(parami, "scanCover:fail", null);
    }
  }
  
  public final boolean by(i parami)
  {
    GMTrace.i(16074317758464L, 119763);
    w.i("MicroMsg.MsgHandler", "doGetRecevieBizHongBaoRequest");
    k.a(parami.rUT, false, null, (String)parami.nSp.get("appId"));
    if ((this.context instanceof MMActivity))
    {
      parami = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
      Intent localIntent = new Intent();
      localIntent.putExtra("key_way", 3);
      localIntent.putExtra("appId", parami.appId);
      localIntent.putExtra("timeStamp", parami.timeStamp);
      localIntent.putExtra("nonceStr", parami.nonceStr);
      localIntent.putExtra("packageExt", parami.packageExt);
      localIntent.putExtra("signtype", parami.signType);
      localIntent.putExtra("paySignature", parami.ePJ);
      localIntent.putExtra("url", parami.url);
      ((MMActivity)this.context).vKC = this;
      com.tencent.mm.bj.d.b(this.context, "luckymoney", ".ui.LuckyMoneyBusiReceiveUI", localIntent, 22);
    }
    GMTrace.o(16074317758464L, 119763);
    return true;
  }
  
  public final boolean bz(i parami)
  {
    GMTrace.i(16074451976192L, 119764);
    w.d("MicroMsg.MsgHandler", "doOpenMyDeviceProfile");
    if (this.context != null)
    {
      String str1 = (String)parami.nSp.get("deviceType");
      if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
      {
        w.e("MicroMsg.MsgHandler", "deviceType is null");
        a(parami, "openMyDeviceProfile:fail_no deviceType", null);
        GMTrace.o(16074451976192L, 119764);
        return true;
      }
      String str2 = (String)parami.nSp.get("deviceId");
      if (com.tencent.mm.sdk.platformtools.bg.nm(str2))
      {
        w.e("MicroMsg.MsgHandler", "deviceId is null");
        a(parami, "openMyDeviceProfile:fail_no deviceId", null);
        GMTrace.o(16074451976192L, 119764);
        return true;
      }
      Intent localIntent = new Intent();
      if (!(this.context instanceof Activity)) {
        localIntent.addFlags(268435456);
      }
      localIntent.putExtra("device_type", str1);
      localIntent.putExtra("device_id", str2);
      com.tencent.mm.bj.d.b(this.context, "exdevice", ".ui.ExdeviceDeviceProfileUI", localIntent);
      a(parami, "openMyDeviceProfile:ok", null);
    }
    for (;;)
    {
      GMTrace.o(16074451976192L, 119764);
      return true;
      w.e("MicroMsg.MsgHandler", "context is null");
      a(parami, "openMyDeviceProfile:fail", null);
    }
  }
  
  public final void c(final i parami, String paramString1, final String paramString2, int paramInt1, int paramInt2, int paramInt3, final String paramString3, boolean paramBoolean)
  {
    GMTrace.i(12190593581056L, 90827);
    final c.b local59 = new c.b()
    {
      public final void b(boolean paramAnonymousBoolean, String paramAnonymousString1, String paramAnonymousString2, String paramAnonymousString3)
      {
        GMTrace.i(19423318507520L, 144715);
        w.i("MicroMsg.MsgHandler", paramString3 + ", on cdn finish,  is success : %s, mediaId : %s, local id is : %s, mediaUrl : %s", new Object[] { Boolean.valueOf(paramAnonymousBoolean), paramAnonymousString2, paramAnonymousString1, paramAnonymousString3 });
        if ((com.tencent.mm.sdk.platformtools.bg.nm(paramAnonymousString1)) || (!paramAnonymousString1.equals(paramString2)))
        {
          GMTrace.o(19423318507520L, 144715);
          return;
        }
        g.this.rTf.remove(paramString2);
        com.tencent.mm.plugin.webview.modeltools.f.bCV().a(this);
        if (g.this.htG != null)
        {
          g.this.htG.dismiss();
          g.this.htG = null;
        }
        g.this.bFD();
        if (!paramAnonymousBoolean)
        {
          g.this.a(parami, paramString3 + ":fail", null);
          GMTrace.o(19423318507520L, 144715);
          return;
        }
        paramAnonymousString1 = new HashMap();
        paramAnonymousString1.put("serverId", paramAnonymousString2);
        paramAnonymousString1.put("mediaUrl", paramAnonymousString3);
        g.this.a(parami, paramString3 + ":ok", paramAnonymousString1);
        GMTrace.o(19423318507520L, 144715);
      }
    };
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCV().a(paramString1, paramString2, paramInt1, paramInt2, paramInt3, local59);
    w.i("MicroMsg.MsgHandler", paramString3 + ", add cdn upload task result : %b", new Object[] { Boolean.valueOf(bool) });
    if (!bool)
    {
      a(parami, paramString3 + ":fail", null);
      GMTrace.o(12190593581056L, 90827);
      return;
    }
    paramString1 = new b();
    paramString1.rSz = parami;
    paramString1.rUM = local59;
    this.rTf.put(paramString2, paramString1);
    paramString1 = new Bundle();
    paramString1.putString("close_window_confirm_dialog_switch", "true");
    paramString1.putString("close_window_confirm_dialog_title_cn", this.context.getString(R.l.ekj));
    paramString1.putString("close_window_confirm_dialog_title_eng", this.context.getString(R.l.ekj));
    paramString1.putString("close_window_confirm_dialog_ok_cn", this.context.getString(R.l.ekg));
    paramString1.putString("close_window_confirm_dialog_ok_eng", this.context.getString(R.l.ekg));
    paramString1.putString("close_window_confirm_dialog_cancel_cn", this.context.getString(R.l.ekh));
    paramString1.putString("close_window_confirm_dialog_cancel_eng", this.context.getString(R.l.ekh));
    try
    {
      this.rEM.m(13, paramString1);
      if (paramBoolean)
      {
        paramString1 = this.context;
        this.context.getString(R.l.cUG);
        this.htG = com.tencent.mm.ui.base.h.a(paramString1, this.context.getString(R.l.elO), true, new DialogInterface.OnCancelListener()
        {
          public final void onCancel(DialogInterface paramAnonymousDialogInterface)
          {
            GMTrace.i(19451906883584L, 144928);
            com.tencent.mm.plugin.webview.modeltools.f.bCV().a(local59);
            com.tencent.mm.plugin.webview.modeltools.f.bCV();
            com.tencent.mm.plugin.webview.model.ac.oK(paramString2);
            g.this.bFD();
            g.this.a(parami, paramString3 + ":cancel", null);
            GMTrace.o(19451906883584L, 144928);
          }
        });
        this.htG.setOnKeyListener(new DialogInterface.OnKeyListener()
        {
          public final boolean onKey(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt, KeyEvent paramAnonymousKeyEvent)
          {
            GMTrace.i(19423855378432L, 144719);
            if ((paramAnonymousInt == 4) && (paramAnonymousKeyEvent.getAction() == 1))
            {
              com.tencent.mm.ui.base.h.a(g.this.context, true, g.this.context.getString(R.l.ekj), "", g.this.context.getString(R.l.ekg), g.this.context.getString(R.l.ekh), new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(19435666538496L, 144807);
                  g.this.htG.cancel();
                  GMTrace.o(19435666538496L, 144807);
                }
              }, new DialogInterface.OnClickListener()
              {
                public final void onClick(DialogInterface paramAnonymous2DialogInterface, int paramAnonymous2Int)
                {
                  GMTrace.i(19428150345728L, 144751);
                  GMTrace.o(19428150345728L, 144751);
                }
              });
              GMTrace.o(19423855378432L, 144719);
              return true;
            }
            GMTrace.o(19423855378432L, 144719);
            return false;
          }
        });
        GMTrace.o(12190593581056L, 90827);
        return;
      }
    }
    catch (Exception paramString1)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "doSetCloseWindowConfirmDialogInfo invoke callback failed : %s", new Object[] { paramString1.getMessage() });
      }
      if ((this.context instanceof Activity))
      {
        ((Activity)this.context).finish();
        this.rEM = this.rSI;
      }
      GMTrace.o(12190593581056L, 90827);
    }
  }
  
  public final boolean c(i parami)
  {
    GMTrace.i(16065996259328L, 119701);
    w.d("MicroMsg.MsgHandler", "doOpenLuckyMoneyDetailView");
    String str = (String)parami.nSp.get("sendId");
    int i = Integer.parseInt((String)parami.nSp.get("hbKind"));
    Intent localIntent;
    if (!com.tencent.mm.sdk.platformtools.bg.nm(str))
    {
      w.i("MicroMsg.MsgHandler", "sendId: %s, hbKind: %s", new Object[] { str, Integer.valueOf(i) });
      localIntent = new Intent();
      localIntent.putExtra("key_sendid", str);
      localIntent.putExtra("key_jump_from", 4);
      if (i == 2)
      {
        com.tencent.mm.bj.d.b(this.context, "luckymoney", ".ui.LuckyMoneyBusiDetailUI", localIntent);
        a(parami, "openLuckyMoneyDetailView:ok", null);
      }
    }
    for (;;)
    {
      GMTrace.o(16065996259328L, 119701);
      return true;
      com.tencent.mm.bj.d.b(this.context, "luckymoney", ".ui.LuckyMoneyDetailUI", localIntent);
      break;
      a(parami, "openLuckyMoneyDetailView:fail", null);
    }
  }
  
  public final boolean c(i parami, JsapiPermissionWrapper paramJsapiPermissionWrapper)
  {
    GMTrace.i(12183614259200L, 90775);
    a(parami, paramJsapiPermissionWrapper.eS(88));
    this.eLU = h(parami);
    if (this.eLU == null) {
      w.e("MicroMsg.MsgHandler", "doTimeline fail, appmsg is null");
    }
    String str2 = (String)parami.nSp.get("link");
    if ((str2 == null) || (str2.length() == 0))
    {
      w.e("MicroMsg.MsgHandler", "doTimeline fail, link is null");
      a(parami, "share_timeline:fail", null);
      GMTrace.o(12183614259200L, 90775);
      return true;
    }
    paramJsapiPermissionWrapper = (String)parami.nSp.get("desc");
    if (paramJsapiPermissionWrapper != null) {
      truncate(paramJsapiPermissionWrapper);
    }
    w.i("MicroMsg.MsgHandler", "doTimeline, img_url = " + (String)parami.nSp.get("img_url") + ", title = " + (String)parami.nSp.get("title") + ", desc = " + (String)parami.nSp.get("desc"));
    int j = 1;
    paramJsapiPermissionWrapper = "";
    int i = 0;
    if (this.rSC != null)
    {
      this.rSC.setClassLoader(getClass().getClassLoader());
      j = this.rSC.getInt("snsWebSource", 1);
      paramJsapiPermissionWrapper = this.rSC.getString("jsapi_args_appid");
      i = com.tencent.mm.sdk.platformtools.bg.getInt(this.rSC.getString("urlAttribute"), 0);
      this.rSC.remove("urlAttribute");
    }
    if (com.tencent.mm.sdk.platformtools.bg.nm(paramJsapiPermissionWrapper))
    {
      paramJsapiPermissionWrapper = (String)parami.nSp.get("appid");
      for (;;)
      {
        k.a(parami.rUT, Mz("shareTimeline"), str2, paramJsapiPermissionWrapper);
        Object localObject1 = (String)parami.nSp.get("img_width");
        String str6 = (String)parami.nSp.get("img_height");
        Object localObject2 = (String)parami.nSp.get("link");
        String str1 = ak.zA((String)localObject2);
        w.i("MicroMsg.MsgHandler", "doTimeline, rawUrl:[%s], shareUrl:[%s]", new Object[] { localObject2, str1 });
        localObject2 = (String)parami.nSp.get("type");
        parami.nSp.get("desc");
        String str3 = (String)parami.nSp.get("title");
        String str4 = (String)parami.nSp.get("img_url");
        String str5 = (String)parami.nSp.get("src_username");
        parami = (String)parami.nSp.get("src_displayname");
        try
        {
          k = Integer.valueOf((String)localObject1).intValue();
        }
        catch (Exception localException1)
        {
          try
          {
            int k;
            Integer.valueOf(str6);
            for (;;)
            {
              w.i("MicroMsg.MsgHandler", "doTimeline, init intent");
              localObject1 = new Intent();
              ((Intent)localObject1).putExtra("Ksnsupload_width", k);
              ((Intent)localObject1).putExtra("Ksnsupload_height", k);
              ((Intent)localObject1).putExtra("Ksnsupload_link", str1);
              ((Intent)localObject1).putExtra("Ksnsupload_title", str3);
              ((Intent)localObject1).putExtra("Ksnsupload_imgurl", str4);
              ((Intent)localObject1).putExtra("Ksnsupload_contentattribute", i);
              if (com.tencent.mm.y.s.fD(str5))
              {
                ((Intent)localObject1).putExtra("src_username", str5);
                ((Intent)localObject1).putExtra("src_displayname", parami);
              }
              ((Intent)localObject1).putExtra("Ksnsupload_source", j);
              ((Intent)localObject1).putExtra("Ksnsupload_type", 1);
              if ((!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2)) && (((String)localObject2).equals("music"))) {
                ((Intent)localObject1).putExtra("ksnsis_music", true);
              }
              if ((!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2)) && (((String)localObject2).equals("video"))) {
                ((Intent)localObject1).putExtra("ksnsis_video", true);
              }
              if ((paramJsapiPermissionWrapper != null) && (paramJsapiPermissionWrapper.length() > 0)) {
                ((Intent)localObject1).putExtra("Ksnsupload_appid", paramJsapiPermissionWrapper);
              }
              boolean bool;
              if (this.rSC == null)
              {
                bool = true;
                w.i("MicroMsg.MsgHandler", "doTimeline, init intent, jsapiArgs == null ? %b", new Object[] { Boolean.valueOf(bool) });
                parami = null;
                if (this.rSC != null)
                {
                  parami = this.rSC.getString("K_sns_thumb_url");
                  str4 = this.rSC.getString("K_sns_raw_url");
                  localObject2 = com.tencent.mm.sdk.platformtools.bg.aq(this.rSC.getString("KSnsStrId"), "");
                  str3 = com.tencent.mm.sdk.platformtools.bg.aq(this.rSC.getString("KSnsLocalId"), "");
                  paramJsapiPermissionWrapper = this.rSC.getString("key_snsad_statextstr");
                  ((Intent)localObject1).putExtra("key_snsad_statextstr", paramJsapiPermissionWrapper);
                  w.i("MicroMsg.MsgHandler", "currentUrl %s contentUrl %s thumbUrl %s", new Object[] { str2, str4, parami });
                  if ((str4 != null) && (str2 != null) && (str4.equals(str2))) {
                    ((Intent)localObject1).putExtra("KlinkThumb_url", parami);
                  }
                  ((Intent)localObject1).putExtra("KSnsStrId", (String)localObject2);
                  ((Intent)localObject1).putExtra("KSnsLocalId", str3);
                  parami = this.rSC.getParcelable("KSnsAdTag");
                  w.i("MicroMsg.MsgHandler", "doTimeline, snsAdTag : %s", new Object[] { parami });
                  if ((parami != null) && ((parami instanceof SnsAdClick))) {
                    ((Intent)localObject1).putExtra("KsnsAdTag", (SnsAdClick)parami);
                  }
                  parami = paramJsapiPermissionWrapper;
                  if (localObject2 != null)
                  {
                    parami = paramJsapiPermissionWrapper;
                    if (this.rSC.getBoolean("KFromTimeline", false))
                    {
                      parami = new pn();
                      parami.eUn.eUg = ((String)localObject2);
                      parami.eUn.eEM = str3;
                      com.tencent.mm.sdk.b.a.vgX.m(parami);
                      parami = paramJsapiPermissionWrapper;
                    }
                  }
                }
              }
              for (;;)
              {
                try
                {
                  ((Intent)localObject1).putExtra("ShareUrlOriginal", this.rEM.bDg());
                  paramJsapiPermissionWrapper = this.rEM.d(18, null);
                  if (paramJsapiPermissionWrapper != null) {
                    continue;
                  }
                  paramJsapiPermissionWrapper = "";
                  ((Intent)localObject1).putExtra("KPublisherId", paramJsapiPermissionWrapper);
                  paramJsapiPermissionWrapper = this.rEM.Zi();
                  ((Intent)localObject1).putExtra("ShareUrlOpen", paramJsapiPermissionWrapper);
                  ((Intent)localObject1).putExtra("JsAppId", this.rSL.Ms(paramJsapiPermissionWrapper));
                }
                catch (RemoteException paramJsapiPermissionWrapper)
                {
                  w.printErrStackTrace("MicroMsg.MsgHandler", paramJsapiPermissionWrapper, "", new Object[0]);
                  continue;
                }
                w.i("MicroMsg.MsgHandler", "doTimeline, start activity");
                if ((this.context instanceof MMActivity)) {
                  ((Intent)localObject1).putExtra("need_result", true);
                }
                try
                {
                  paramJsapiPermissionWrapper = this.rEM.d(18, null);
                  if (paramJsapiPermissionWrapper != null)
                  {
                    str2 = com.tencent.mm.y.u.gy(com.tencent.mm.sdk.platformtools.bg.nl(paramJsapiPermissionWrapper.getString("KPublisherId")));
                    localObject2 = com.tencent.mm.y.u.Av().p(str2, true);
                    ((u.b)localObject2).o("sendAppMsgScene", Integer.valueOf(2));
                    ((u.b)localObject2).o("preChatName", paramJsapiPermissionWrapper.getString("preChatName"));
                    ((u.b)localObject2).o("preMsgIndex", Integer.valueOf(paramJsapiPermissionWrapper.getInt("preMsgIndex")));
                    ((u.b)localObject2).o("prePublishId", paramJsapiPermissionWrapper.getString("prePublishId"));
                    ((u.b)localObject2).o("preUsername", paramJsapiPermissionWrapper.getString("preUsername"));
                    ((u.b)localObject2).o("url", str1);
                    ((u.b)localObject2).o("getA8KeyScene", Integer.valueOf(paramJsapiPermissionWrapper.getInt("getA8KeyScene")));
                    ((u.b)localObject2).o("referUrl", paramJsapiPermissionWrapper.getString("referUrl"));
                    if (!com.tencent.mm.sdk.platformtools.bg.nm(parami)) {
                      ((u.b)localObject2).o("adExtStr", parami);
                    }
                    ((Intent)localObject1).putExtra("reportSessionId", str2);
                  }
                }
                catch (RemoteException parami)
                {
                  w.e("MicroMsg.MsgHandler", "try to attach report args error, %s", new Object[] { parami });
                  continue;
                }
                ((MMActivity)this.context).vKC = this;
                com.tencent.mm.bj.d.a(this.context, "sns", ".ui.En_c4f742e5", (Intent)localObject1, 24, false);
                GMTrace.o(12183614259200L, 90775);
                return true;
                bool = false;
                break;
                paramJsapiPermissionWrapper = com.tencent.mm.sdk.platformtools.bg.nl(paramJsapiPermissionWrapper.getString("KPublisherId"));
              }
              localException1 = localException1;
              k = -1;
            }
          }
          catch (Exception localException2)
          {
            for (;;) {}
          }
        }
      }
    }
  }
  
  public final boolean c(i parami, boolean paramBoolean)
  {
    GMTrace.i(16077136330752L, 119784);
    String str1 = (String)parami.nSp.get("designerId");
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("designerUin"), 0);
    String str2 = (String)parami.nSp.get("tagId");
    String str3 = (String)parami.nSp.get("tagDesc");
    String str4 = (String)parami.nSp.get("keyword");
    int j = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("tid"), 0);
    String str5 = com.tencent.mm.sdk.platformtools.bg.aq((String)parami.nSp.get("title"), "");
    String str6 = com.tencent.mm.sdk.platformtools.bg.aq((String)parami.nSp.get("desc"), "");
    String str7 = com.tencent.mm.sdk.platformtools.bg.aq((String)parami.nSp.get("iconUrl"), "");
    String str8 = com.tencent.mm.sdk.platformtools.bg.aq((String)parami.nSp.get("secondUrl"), "");
    int k = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("pageType"), 0);
    long l = com.tencent.mm.sdk.platformtools.bg.getLong((String)parami.nSp.get("searchID"), 0L);
    w.d("MicroMsg.MsgHandler", "cpan emoji openDesignerEmojiView:%d", new Object[] { Long.valueOf(l) });
    Intent localIntent = new Intent();
    localIntent.putExtra("uin", i);
    localIntent.putExtra("headurl", str8);
    localIntent.putExtra("set_iconURL", str7);
    localIntent.putExtra("set_desc", str6);
    localIntent.putExtra("pageType", k);
    localIntent.putExtra("set_title", str5);
    localIntent.putExtra("set_id", j);
    w.i("MicroMsg.MsgHandler", "openDesignerEmojiView event: designerID:%s tagID:%s tagDesc:%s keyword:%s", new Object[] { str1, str2, str3, str4 });
    if (!com.tencent.mm.sdk.platformtools.bg.nm(str4))
    {
      localIntent.putExtra("keyword", str4);
      localIntent.putExtra("searchID", l);
      com.tencent.mm.bj.d.b(this.context, "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", localIntent);
      a(parami, "openDesignerEmojiView:ok" + str4, null);
      if (paramBoolean) {
        com.tencent.mm.plugin.report.service.g.ork.i(13055, new Object[] { Integer.valueOf(2), "", "", "", Integer.valueOf(com.tencent.mm.aj.a.GL()), Long.valueOf(l) });
      }
      GMTrace.o(16077136330752L, 119784);
      return true;
    }
    if (!com.tencent.mm.sdk.platformtools.bg.nm(str1))
    {
      localIntent.putExtra("id", str1);
      localIntent.putExtra("searchID", l);
      com.tencent.mm.bj.d.b(this.context, "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", localIntent);
      a(parami, "openDesignerEmojiView:ok" + str1, null);
      GMTrace.o(16077136330752L, 119784);
      return true;
    }
    if (!com.tencent.mm.sdk.platformtools.bg.nm(str2))
    {
      localIntent.putExtra("tag_id", str2);
      localIntent.putExtra("tag_desc", str3);
      com.tencent.mm.bj.d.b(this.context, "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", localIntent);
      a(parami, "openDesignerEmojiView:ok" + str2, null);
      GMTrace.o(16077136330752L, 119784);
      return true;
    }
    com.tencent.mm.bj.d.b(this.context, "emoji", ".ui.v2.EmojiStoreV2SingleProductUI", localIntent);
    a(parami, "openDesignerEmojiView:ok", null);
    GMTrace.o(16077136330752L, 119784);
    return true;
  }
  
  public final boolean cA(i parami)
  {
    GMTrace.i(12198109773824L, 90883);
    a(parami, "uploadIdCardSuccess:ok", null);
    w.i("MicroMsg.MsgHandler", "uploadIdCardSuccess");
    parami = new sz();
    parami.eYt.result = -1;
    com.tencent.mm.sdk.b.a.vgX.m(parami);
    GMTrace.o(12198109773824L, 90883);
    return true;
  }
  
  public final boolean cB(i parami)
  {
    GMTrace.i(12198243991552L, 90884);
    w.i("MicroMsg.MsgHandler", "getGameCommInfo call");
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("cmd"), 0);
    Object localObject = (String)parami.nSp.get("param");
    gl localgl = new gl();
    localgl.eJz.nJ = i;
    localgl.eJz.eJB = ((String)localObject);
    localgl.eJz.context = this.context;
    com.tencent.mm.sdk.b.a.vgX.m(localgl);
    localObject = new HashMap();
    ((Map)localObject).put("gameRegionName", localgl.eJA.result);
    a(parami, "getGameCommInfo:ok", (Map)localObject);
    GMTrace.o(12198243991552L, 90884);
    return true;
  }
  
  public final boolean cC(final i parami)
  {
    GMTrace.i(12198512427008L, 90886);
    com.tencent.mm.ui.tools.l locall = new com.tencent.mm.ui.tools.l(this.context);
    locall.b(null, new View.OnCreateContextMenuListener()new p.d
    {
      public final void onCreateContextMenu(ContextMenu paramAnonymousContextMenu, View paramAnonymousView, ContextMenu.ContextMenuInfo paramAnonymousContextMenuInfo)
      {
        GMTrace.i(19427076603904L, 144743);
        paramAnonymousContextMenu.add(0, 1, 0, g.this.context.getString(R.l.dVb));
        paramAnonymousContextMenu.add(0, 2, 1, g.this.context.getString(R.l.dUW));
        GMTrace.o(19427076603904L, 144743);
      }
    }, new p.d()
    {
      public final void c(MenuItem paramAnonymousMenuItem, int paramAnonymousInt)
      {
        GMTrace.i(19433653272576L, 144792);
        switch (paramAnonymousMenuItem.getItemId())
        {
        }
        for (;;)
        {
          GMTrace.o(19433653272576L, 144792);
          return;
          paramAnonymousMenuItem = g.this;
          Object localObject = parami;
          if (paramAnonymousMenuItem.context == null)
          {
            paramAnonymousMenuItem.a((i)localObject, "chooseIdCard:fail", null);
            GMTrace.o(19433653272576L, 144792);
            return;
          }
          g.108 local108 = new g.108(paramAnonymousMenuItem, (i)localObject);
          if (!paramAnonymousMenuItem.rSO.a("identity_pay_auth", paramAnonymousMenuItem.context, local108)) {
            paramAnonymousMenuItem.a((i)localObject, "chooseIdCard:fail", null);
          }
          GMTrace.o(19433653272576L, 144792);
          return;
          paramAnonymousMenuItem = g.this;
          localObject = parami;
          w.i("MicroMsg.MsgHandler", "real scene = %d", new Object[] { Integer.valueOf(3) });
          boolean bool = com.tencent.mm.pluginsdk.h.a.a((Activity)paramAnonymousMenuItem.context, "android.permission.CAMERA", 113, "", "");
          w.d("MicroMsg.MsgHandler", " checkPermission checkcamera[%b]", new Object[] { Boolean.valueOf(bool) });
          if (!bool)
          {
            paramAnonymousMenuItem.a((i)localObject, "chooseIdCard:fail", null);
            GMTrace.o(19433653272576L, 144792);
            return;
          }
          localObject = new Intent();
          ((Intent)localObject).putExtra("key_pick_local_pic_capture", 3);
          ((Intent)localObject).putExtra("key_pick_local_pic_query_source_type", 8);
          ((Intent)localObject).putExtra("query_media_type", 1);
          ((Intent)localObject).putExtra("key_pick_local_pic_count", 1);
          w.i("MicroMsg.MsgHandler", "doChooseImageIdCard: realScene: %d, querySourceType: %d", new Object[] { Integer.valueOf(3), Integer.valueOf(8) });
          if ((paramAnonymousMenuItem.context instanceof MMActivity))
          {
            ((MMActivity)paramAnonymousMenuItem.context).vKC = paramAnonymousMenuItem;
            com.tencent.mm.bj.d.a(paramAnonymousMenuItem.context, "webview", ".ui.tools.OpenFileChooserUI", (Intent)localObject, 43, false);
          }
        }
      }
    });
    locall.e(new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(19422244765696L, 144707);
        g.this.a(parami, "chooseIdCard:cancel", null);
        GMTrace.o(19422244765696L, 144707);
      }
    });
    locall.bpI();
    GMTrace.o(12198512427008L, 90886);
    return true;
  }
  
  public final boolean cD(final i parami)
  {
    GMTrace.i(12198646644736L, 90887);
    int i;
    String str1;
    if (this.rSC != null)
    {
      i = this.rSC.getInt("key_download_restrict", 0);
      str1 = this.rSC.getString("key_function_id", "");
      if (!com.tencent.mm.sdk.platformtools.bg.nm(str1)) {
        com.tencent.mm.plugin.report.service.g.ork.i(14596, new Object[] { str1, Integer.valueOf(i), Integer.valueOf(1) });
      }
      if (i == 1)
      {
        w.e("MicroMsg.MsgHandler", "not allow to launch application");
        a(parami, "launchApplication:fail", null);
        GMTrace.o(12198646644736L, 90887);
        return true;
      }
    }
    long l = com.tencent.mm.sdk.platformtools.bg.Pu() - this.rSP;
    w.i("MicroMsg.MsgHandler", "launchTimeInterval = %d", new Object[] { Long.valueOf(l) });
    if ((l < 2L) && (this.rSP > 0L)) {}
    final String str3;
    final String str4;
    final String str5;
    final String str6;
    Object localObject1;
    String str2;
    final Bundle localBundle;
    try
    {
      str1 = URLEncoder.encode(this.rEM.Zi(), "UTF-8");
      com.tencent.mm.plugin.report.service.g.ork.i(13983, new Object[] { Integer.valueOf(5), str1, "" });
      str3 = (String)parami.nSp.get("appID");
      str4 = (String)parami.nSp.get("schemeUrl");
      str5 = (String)parami.nSp.get("parameter");
      i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("alertType"), 0);
      k.a(parami.rUT, false, null, str3);
      str6 = (String)parami.nSp.get("extInfo");
      w.i("MicroMsg.MsgHandler", "doLaunchApplication, appid : %s, scheme : %s, extinfo:[%s], parameter : %s", new Object[] { str3, str4, str6, str5 });
      if ((com.tencent.mm.sdk.platformtools.bg.nm(str3)) && (com.tencent.mm.sdk.platformtools.bg.nm(str4)))
      {
        w.e("MicroMsg.MsgHandler", "appid and scheme is null or nil");
        a(parami, "launchApplication:fail", null);
        GMTrace.o(12198646644736L, 90887);
        return true;
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "report launchApplication failed");
      }
      localObject1 = parami.nSp.get("__jsapi_fw_ext_info");
      str2 = null;
      if ((localObject1 instanceof Bundle)) {
        str2 = ((Bundle)localObject1).getString("__jsapi_fw_ext_info_key_current_url");
      }
      localObject1 = this.rSL.Ms(str2);
      localBundle = new Bundle();
      if (com.tencent.mm.sdk.platformtools.bg.nm(str2)) {}
    }
    try
    {
      localBundle.putString("current_page_url", URLEncoder.encode(str2, "UTF-8"));
      localBundle.putString("current_page_appid", (String)localObject1);
      Object localObject2 = new com.tencent.mm.ad.b.a();
      ((com.tencent.mm.ad.b.a)localObject2).gtF = new aiz();
      ((com.tencent.mm.ad.b.a)localObject2).gtG = new aja();
      ((com.tencent.mm.ad.b.a)localObject2).uri = "/cgi-bin/mmbiz-bin/checklaunchapp";
      ((com.tencent.mm.ad.b.a)localObject2).gtE = 1125;
      localObject2 = ((com.tencent.mm.ad.b.a)localObject2).DA();
      aiz localaiz = (aiz)((com.tencent.mm.ad.b)localObject2).gtC.gtK;
      localaiz.eSd = ((String)localObject1);
      localaiz.uyg = str3;
      localaiz.scene = Ya();
      localaiz.url = str2;
      localaiz.uyh = str4;
      localaiz.jWv = i;
      w.i("MicroMsg.MsgHandler", "run cgi to check(appId : %s, toAppId : %s, scene : %s, url : %s, schemeUrl : %s, alertType : %s)", new Object[] { localObject1, str3, Integer.valueOf(localaiz.scene), localaiz.url, localaiz.uyh, Integer.valueOf(localaiz.jWv) });
      com.tencent.mm.ad.u.a((com.tencent.mm.ad.b)localObject2, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(19419023540224L, 144683);
          w.d("MicroMsg.MsgHandler", "on RunCgi callback errType:%d errCode:%d msg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            g.this.a(parami, "launchApplication:fail_check fail", null);
            GMTrace.o(19419023540224L, 144683);
            return 0;
          }
          paramAnonymousk = (aja)paramAnonymousb.gtD.gtK;
          switch (paramAnonymousk.eGy)
          {
          case 1: 
          default: 
            g.this.a(parami, "launchApplication:fail_check fail", null);
            GMTrace.o(19419023540224L, 144683);
            return 0;
          case 2: 
            g.this.a(parami, "launchApplication:fail_check fail forbidden scene", null);
            GMTrace.o(19419023540224L, 144683);
            return 0;
          }
          paramAnonymousb = new g.d(new g.d.a()
          {
            public final void D(boolean paramAnonymous2Boolean1, boolean paramAnonymous2Boolean2)
            {
              GMTrace.i(19426271297536L, 144737);
              w.i("MicroMsg.MsgHandler", "onLaunchAppCallback(launchRet : %s, launchSuccess : %s)", new Object[] { Boolean.valueOf(paramAnonymous2Boolean1), Boolean.valueOf(paramAnonymous2Boolean2) });
              if (paramAnonymous2Boolean1)
              {
                g.this.a(g.109.this.rTq, "launchApplication:ok", null);
                GMTrace.o(19426271297536L, 144737);
                return;
              }
              g.this.a(g.109.this.rTq, "launchApplication:fail", null);
              GMTrace.o(19426271297536L, 144737);
            }
          });
          if (!com.tencent.mm.sdk.platformtools.bg.nm(str4))
          {
            localObject = new Intent("android.intent.action.VIEW", Uri.parse(str4));
            ((Intent)localObject).addFlags(268435456);
            paramAnonymousString = com.tencent.mm.sdk.platformtools.bg.y(g.this.context, (Intent)localObject);
            if ((paramAnonymousString != null) && (!paramAnonymousString.isEmpty()))
            {
              if ((TextUtils.isEmpty(((Intent)localObject).getPackage())) && (paramAnonymousString.size() == 1)) {}
              for (paramAnonymousString = com.tencent.mm.pluginsdk.model.app.g.b((ResolveInfo)paramAnonymousString.get(0)); !com.tencent.mm.sdk.platformtools.bg.nl(com.tencent.mm.sdk.platformtools.ab.getPackageName()).equals(paramAnonymousString); paramAnonymousString = ((Intent)localObject).getPackage())
              {
                paramAnonymousb.jG(com.tencent.mm.pluginsdk.model.app.g.a(g.this.context, (Intent)localObject, null, paramAnonymousk.uyi, paramAnonymousb, localBundle));
                GMTrace.o(19419023540224L, 144683);
                return 0;
              }
            }
          }
          paramAnonymousString = new WXAppExtendObject();
          paramAnonymousString.extInfo = str6;
          paramAnonymousString = new WXMediaMessage(paramAnonymousString);
          paramAnonymousString.sdkVer = 620822528;
          paramAnonymousString.messageExt = str6;
          Object localObject = new im();
          ((im)localObject).eLS.eLU = paramAnonymousString;
          ((im)localObject).eLS.appId = str3;
          ((im)localObject).eLS.showType = paramAnonymousk.uyi;
          ((im)localObject).eLS.context = g.this.context;
          ((im)localObject).eLS.eDm = localBundle;
          ((im)localObject).eLS.eLV = paramAnonymousb;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          boolean bool = ((im)localObject).eLT.eLW;
          if (!bool)
          {
            paramAnonymousString = str3 + "://" + str5;
            paramAnonymousk = new Intent("android.intent.action.VIEW", Uri.parse(paramAnonymousString));
            w.i("MicroMsg.MsgHandler", "launchApplication by opensdk failed, try to launch by scheme(%s).", new Object[] { paramAnonymousString });
            paramAnonymousk.addFlags(268435456);
            paramAnonymousString = com.tencent.mm.sdk.platformtools.bg.y(g.this.context, paramAnonymousk);
            if ((paramAnonymousString != null) && (!paramAnonymousString.isEmpty())) {
              if ((TextUtils.isEmpty(paramAnonymousk.getPackage())) && (paramAnonymousString.size() == 1))
              {
                paramAnonymousString = com.tencent.mm.pluginsdk.model.app.g.b((ResolveInfo)paramAnonymousString.get(0));
                if (com.tencent.mm.sdk.platformtools.bg.nl(com.tencent.mm.sdk.platformtools.ab.getPackageName()).equals(paramAnonymousString)) {
                  break label693;
                }
                paramAnonymousb.guO = false;
                paramAnonymousb.rUN = false;
                paramAnonymousb.rUO = false;
                paramAnonymousb.eLW = false;
                bool = com.tencent.mm.pluginsdk.model.app.g.a(g.this.context, paramAnonymousk, null, paramAnonymousb, localBundle);
              }
            }
          }
          label693:
          for (;;)
          {
            paramAnonymousb.jG(bool);
            GMTrace.o(19419023540224L, 144683);
            return 0;
            paramAnonymousString = paramAnonymousk.getPackage();
            break;
          }
        }
      });
      GMTrace.o(12198646644736L, 90887);
      return true;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;) {}
    }
  }
  
  public final boolean cE(final i parami)
  {
    GMTrace.i(16078344290304L, 119793);
    w.i("MicroMsg.MsgHandler", "doLoginOrAuthorize!");
    parami = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19448819875840L, 144905);
        if (parami.rUU.equals("login"))
        {
          g.this.a(parami, g.rTk);
          GMTrace.o(19448819875840L, 144905);
          return;
        }
        if (parami.rUU.equals("authorize")) {
          g.this.b(parami, g.rTk);
        }
        GMTrace.o(19448819875840L, 144905);
      }
    };
    if (!rTj)
    {
      rTj = true;
      parami.run();
    }
    for (;;)
    {
      GMTrace.o(16078344290304L, 119793);
      return true;
      rTi.add(parami);
      w.i("MicroMsg.MsgHandler", "add to authJsApiQueue!");
    }
  }
  
  public final void cF(i parami)
  {
    GMTrace.i(12199317733376L, 90892);
    parami = i.ac(parami.nSp);
    try
    {
      this.rEM.bDi();
      this.rEM.Q(parami);
      GMTrace.o(12199317733376L, 90892);
      return;
    }
    catch (RemoteException parami)
    {
      w.w("MicroMsg.MsgHandler", "SendServiceAppMsg doCloseWindow, ex = " + parami.getMessage());
      GMTrace.o(12199317733376L, 90892);
    }
  }
  
  public final boolean cH(i parami)
  {
    GMTrace.i(16078612725760L, 119795);
    this.kNw = false;
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCT().S(parami.nSp);
    GMTrace.o(16078612725760L, 119795);
    return bool;
  }
  
  public final boolean cI(i parami)
  {
    GMTrace.i(19440632594432L, 144844);
    this.kNw = false;
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCT().T(parami.nSp);
    GMTrace.o(19440632594432L, 144844);
    return bool;
  }
  
  public final boolean cJ(i parami)
  {
    GMTrace.i(20447533989888L, 152346);
    this.kNw = false;
    if ("1".equals(parami.nSp.get("isDeleteAll")))
    {
      com.tencent.mm.plugin.webview.modeltools.f.bCT();
      ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).deleteSOSHistory();
    }
    for (;;)
    {
      GMTrace.o(20447533989888L, 152346);
      return false;
      com.tencent.mm.plugin.webview.modeltools.f.bCT();
      parami = (String)parami.nSp.get("query");
      ((com.tencent.mm.plugin.fts.a.l)com.tencent.mm.kernel.h.j(com.tencent.mm.plugin.fts.a.l.class)).deleteSOSHistory(parami);
    }
  }
  
  public final boolean cK(i parami)
  {
    GMTrace.i(16078746943488L, 119796);
    this.kNw = false;
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCU().M(parami.nSp);
    GMTrace.o(16078746943488L, 119796);
    return bool;
  }
  
  public final boolean cL(i parami)
  {
    GMTrace.i(16078881161216L, 119797);
    this.kNw = false;
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCS().O(parami.nSp);
    GMTrace.o(16078881161216L, 119797);
    return bool;
  }
  
  public final boolean cM(i parami)
  {
    GMTrace.i(16079015378944L, 119798);
    this.kNw = false;
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCS().P(parami.nSp);
    GMTrace.o(16079015378944L, 119798);
    return bool;
  }
  
  public final boolean cN(i parami)
  {
    GMTrace.i(16079149596672L, 119799);
    this.kNw = false;
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCS().Q(parami.nSp);
    GMTrace.o(16079149596672L, 119799);
    return bool;
  }
  
  public final boolean cO(i parami)
  {
    GMTrace.i(12200659910656L, 90902);
    HashMap localHashMap = new HashMap();
    com.tencent.mm.plugin.webview.modeltools.f.bCT();
    com.tencent.mm.plugin.webview.fts.e.b(parami.nSp, localHashMap);
    a(parami, "getSearchDisplayName:ok", localHashMap);
    GMTrace.o(12200659910656L, 90902);
    return true;
  }
  
  public final boolean cP(i parami)
  {
    GMTrace.i(16079283814400L, 119800);
    this.kNw = false;
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCT().a(parami.nSp, this, "");
    GMTrace.o(16079283814400L, 119800);
    return bool;
  }
  
  public final boolean cQ(i parami)
  {
    GMTrace.i(16079418032128L, 119801);
    this.kNw = false;
    Object localObject = com.tencent.mm.plugin.webview.modeltools.f.bCT();
    Map localMap = parami.nSp;
    boolean bool = com.tencent.mm.plugin.webview.fts.f.q(localMap, "hasResult");
    parami = com.tencent.mm.plugin.webview.fts.f.o(localMap, "query");
    int i = com.tencent.mm.plugin.webview.fts.f.c(localMap, "type", 0);
    int j = com.tencent.mm.plugin.webview.fts.f.c(localMap, "scene", 0);
    w.d("MicroMsg.FTS.FTSWebViewLogic", "searchDataHashResult %b %s %d", new Object[] { Boolean.valueOf(bool), parami, Integer.valueOf(i) });
    localObject = ((com.tencent.mm.plugin.webview.fts.e)localObject).rCn;
    if ((((e.e)localObject).scene == j) && (((e.e)localObject).eQb != null) && (((e.e)localObject).eQb.equals(parami)) && (((e.e)localObject).lzX == i)) {
      ((e.e)localObject).eBn = bool;
    }
    for (;;)
    {
      GMTrace.o(16079418032128L, 119801);
      return false;
      w.w("MicroMsg.FTS.FTSWebViewLogic", "setHahResultNotSame: %s VS %s | %d VS %d | %d VS %d", new Object[] { ((e.e)localObject).eQb, parami, Integer.valueOf(((e.e)localObject).lzX), Integer.valueOf(i), Integer.valueOf(((e.e)localObject).scene), Integer.valueOf(j) });
    }
  }
  
  public final boolean cR(i parami)
  {
    GMTrace.i(16079552249856L, 119802);
    this.kNw = false;
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCU().N(parami.nSp);
    GMTrace.o(16079552249856L, 119802);
    return bool;
  }
  
  public final boolean cS(i parami)
  {
    GMTrace.i(16079686467584L, 119803);
    this.kNw = false;
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCT().R(parami.nSp);
    GMTrace.o(16079686467584L, 119803);
    return bool;
  }
  
  public final boolean cT(i parami)
  {
    boolean bool2 = true;
    GMTrace.i(16079820685312L, 119804);
    this.kNw = false;
    com.tencent.mm.plugin.webview.modeltools.f.bCT();
    Map localMap = parami.nSp;
    w.i("MicroMsg.FTS.FTSWebViewLogic", "openEmotionPage %s", new Object[] { localMap });
    int i = com.tencent.mm.plugin.webview.fts.f.c(localMap, "type", 0);
    int j = com.tencent.mm.plugin.webview.fts.f.c(localMap, "scene", 0);
    String str1 = com.tencent.mm.plugin.webview.fts.f.o(localMap, "searchId");
    String str2 = com.tencent.mm.plugin.webview.fts.f.o(localMap, "activityId");
    parami = "";
    Intent localIntent = new Intent();
    localIntent.setFlags(268435456);
    localIntent.putExtra("extra_scence", j);
    localIntent.putExtra("extra_type", i);
    localIntent.putExtra("searchID", str1);
    localIntent.putExtra("docID", com.tencent.mm.plugin.webview.fts.f.o(localMap, "docID"));
    localIntent.putExtra("activityId", str2);
    switch (i)
    {
    default: 
    case 1: 
    case 2: 
    case 3: 
      for (;;)
      {
        if (!com.tencent.mm.sdk.platformtools.bg.nm(parami)) {
          com.tencent.mm.bj.d.b(com.tencent.mm.sdk.platformtools.ab.getContext(), "emoji", parami, localIntent);
        }
        GMTrace.o(16079820685312L, 119804);
        return false;
        localIntent.putExtra("extra_id", com.tencent.mm.plugin.webview.fts.f.o(localMap, "productID"));
        localIntent.putExtra("preceding_scence", 18);
        localIntent.putExtra("download_entrance_scene", 27);
        localIntent.putExtra("searchID", com.tencent.mm.sdk.platformtools.bg.getLong(str1, 0L));
        parami = ".ui.EmojiStoreDetailUI";
        continue;
        localIntent.putExtra("extra_emoji_name", com.tencent.mm.plugin.webview.fts.f.o(localMap, "express"));
        localIntent.putExtra("extra_md5", com.tencent.mm.plugin.webview.fts.f.o(localMap, "md5"));
        localIntent.putExtra("extra_aeskey", com.tencent.mm.plugin.webview.fts.f.o(localMap, "aesKey"));
        localIntent.putExtra("extra_encrypt_url", com.tencent.mm.plugin.webview.fts.f.o(localMap, "encryptUrl"));
        localIntent.putExtra("extra_thumb_url", com.tencent.mm.plugin.webview.fts.f.o(localMap, "thumb"));
        localIntent.putExtra("id", com.tencent.mm.plugin.webview.fts.f.o(localMap, "designerId"));
        localIntent.putExtra("extra_product_id", com.tencent.mm.plugin.webview.fts.f.o(localMap, "productID"));
        localIntent.putExtra("productUrl", com.tencent.mm.plugin.webview.fts.f.o(localMap, "productUrl"));
        localIntent.putExtra("extra_product_name", com.tencent.mm.plugin.webview.fts.f.o(localMap, "productName"));
        localIntent.putExtra("weapp_user_name", com.tencent.mm.plugin.webview.fts.f.o(localMap, "weappUserName"));
        localIntent.putExtra("weapp_version", com.tencent.mm.plugin.webview.fts.f.c(localMap, "weappVersion", 0));
        localIntent.putExtra("source_type", com.tencent.mm.plugin.webview.fts.f.c(localMap, "sourceType", 0));
        parami = ".ui.fts.FTSEmojiDetailPageUI";
        continue;
        localIntent.putExtra("extra_emoji_name", com.tencent.mm.plugin.webview.fts.f.o(localMap, "express"));
        localIntent.putExtra("extra_md5", com.tencent.mm.plugin.webview.fts.f.o(localMap, "md5"));
        localIntent.putExtra("extra_aeskey", com.tencent.mm.plugin.webview.fts.f.o(localMap, "aesKey"));
        localIntent.putExtra("extra_encrypt_url", com.tencent.mm.plugin.webview.fts.f.o(localMap, "encryptUrl"));
        localIntent.putExtra("extra_thumb_url", com.tencent.mm.plugin.webview.fts.f.o(localMap, "thumb"));
        localIntent.putExtra("id", com.tencent.mm.plugin.webview.fts.f.o(localMap, "designerId"));
        localIntent.putExtra("name", com.tencent.mm.plugin.webview.fts.f.o(localMap, "designerName"));
        localIntent.putExtra("headurl", com.tencent.mm.plugin.webview.fts.f.o(localMap, "designerThumb"));
        localIntent.putExtra("weapp_user_name", com.tencent.mm.plugin.webview.fts.f.o(localMap, "weappUserName"));
        localIntent.putExtra("weapp_version", com.tencent.mm.plugin.webview.fts.f.c(localMap, "weappVersion", 0));
        localIntent.putExtra("source_type", com.tencent.mm.plugin.webview.fts.f.c(localMap, "sourceType", 0));
        parami = ".ui.fts.FTSEmojiDetailPageUI";
      }
    }
    localIntent.putExtra("extra_emoji_name", com.tencent.mm.plugin.webview.fts.f.o(localMap, "express"));
    localIntent.putExtra("extra_encrypt_url", com.tencent.mm.plugin.webview.fts.f.o(localMap, "encryptUrl"));
    localIntent.putExtra("extra_thumb_url", com.tencent.mm.plugin.webview.fts.f.o(localMap, "thumb"));
    localIntent.putExtra("extra_article_name", com.tencent.mm.plugin.webview.fts.f.o(localMap, "sourceTitle"));
    localIntent.putExtra("extra_article_url", com.tencent.mm.plugin.webview.fts.f.o(localMap, "articleSource"));
    if (com.tencent.mm.plugin.webview.fts.f.c(localMap, "disableAddSticker", 0) > 0)
    {
      bool1 = true;
      label796:
      localIntent.putExtra("disableAddSticker", bool1);
      if (com.tencent.mm.plugin.webview.fts.f.c(localMap, "needSavePhotosAlbum", 0) <= 0) {
        break label900;
      }
    }
    label900:
    for (boolean bool1 = bool2;; bool1 = false)
    {
      localIntent.putExtra("needSavePhotosAlbum", bool1);
      localIntent.putExtra("weapp_user_name", com.tencent.mm.plugin.webview.fts.f.o(localMap, "weappUserName"));
      localIntent.putExtra("weapp_version", com.tencent.mm.plugin.webview.fts.f.c(localMap, "weappVersion", 0));
      localIntent.putExtra("source_type", com.tencent.mm.plugin.webview.fts.f.c(localMap, "sourceType", 0));
      parami = ".ui.fts.FTSEmojiDetailPageUI";
      break;
      bool1 = false;
      break label796;
    }
  }
  
  public final boolean cU(i parami)
  {
    GMTrace.i(16079954903040L, 119805);
    this.kNw = false;
    com.tencent.mm.plugin.webview.modeltools.f.bCT();
    boolean bool = com.tencent.mm.plugin.webview.fts.e.X(parami.nSp);
    GMTrace.o(16079954903040L, 119805);
    return bool;
  }
  
  public final boolean cV(i parami)
  {
    GMTrace.i(16080089120768L, 119806);
    this.kNw = false;
    parami = (String)parami.nSp.get("brandUsername");
    Intent localIntent = com.tencent.mm.az.e.Kv();
    localIntent.putExtra("ftsneedkeyboard", true);
    localIntent.putExtra("ftsbizscene", 19);
    localIntent.putExtra("ftsType", 2);
    Map localMap = com.tencent.mm.az.e.a(19, true, 2);
    localMap.put("userName", parami);
    localIntent.putExtra("rawUrl", com.tencent.mm.az.e.n(localMap));
    localIntent.putExtra("key_load_js_without_delay", true);
    localIntent.putExtra("ftsbizusername", parami);
    com.tencent.mm.bj.d.b(com.tencent.mm.sdk.platformtools.ab.getContext(), "webview", ".ui.tools.fts.FTSSearchTabWebViewUI", localIntent);
    GMTrace.o(16080089120768L, 119806);
    return false;
  }
  
  public final boolean cW(i parami)
  {
    GMTrace.i(19440766812160L, 144845);
    this.kNw = false;
    try
    {
      if ((this.rEM != null) && (parami.nSp != null) && (parami.nSp.containsKey("view")))
      {
        Bundle localBundle = new Bundle();
        localBundle.putString("fts_key_data", (String)parami.nSp.get("view"));
        this.rEM.m(138, localBundle);
      }
      GMTrace.o(19440766812160L, 144845);
      return false;
    }
    catch (Exception parami)
    {
      for (;;) {}
    }
  }
  
  public final boolean cX(i parami)
  {
    GMTrace.i(19440901029888L, 144846);
    this.kNw = false;
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCT().a(parami.nSp, this);
    GMTrace.o(19440901029888L, 144846);
    return bool;
  }
  
  public final boolean cY(i parami)
  {
    GMTrace.i(19441035247616L, 144847);
    this.kNw = false;
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCT().Y(parami.nSp);
    GMTrace.o(19441035247616L, 144847);
    return bool;
  }
  
  public final boolean cZ(i parami)
  {
    GMTrace.i(19441169465344L, 144848);
    this.kNw = false;
    int i = com.tencent.mm.sdk.platformtools.bg.Sy((String)parami.nSp.get("x"));
    int j = com.tencent.mm.sdk.platformtools.bg.Sy((String)parami.nSp.get("y"));
    String str = (String)parami.nSp.get("eventId");
    Bundle localBundle = new Bundle();
    localBundle.putString("widgetId", (String)parami.nSp.get("widgetId"));
    localBundle.putInt("x", i);
    localBundle.putInt("y", j);
    localBundle.putString("eventId", str);
    try
    {
      if (this.rEM != null) {
        this.rEM.m(100002, localBundle);
      }
      a(parami, "tapSearchWAWidgetView:ok", null);
      GMTrace.o(19441169465344L, 144848);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "doTapSearchWAWidgetView exception" + localRemoteException.getMessage());
      }
    }
  }
  
  public final boolean ca(final i parami)
  {
    GMTrace.i(12195828072448L, 90866);
    String str3 = (String)parami.nSp.get("chatId");
    String str4 = (String)parami.nSp.get("chatType");
    try
    {
      String str1 = this.rEM.Zi();
      str1 = com.tencent.mm.sdk.platformtools.bg.nl(this.rSL.Ms(str1));
      if ((com.tencent.mm.sdk.platformtools.bg.nm(str3)) || (com.tencent.mm.sdk.platformtools.bg.nm(str4)) || (com.tencent.mm.sdk.platformtools.bg.nm(str1)))
      {
        a(parami, "enterEnterpriseChat:fail_params error", null);
        GMTrace.o(12195828072448L, 90866);
        return true;
      }
    }
    catch (RemoteException localRemoteException)
    {
      String str2;
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localRemoteException.getMessage() });
        str2 = null;
      }
      com.tencent.mm.af.x.FM();
      parami = new com.tencent.mm.af.a.m(str2, str3, str4, new com.tencent.mm.af.n()
      {
        public final void a(int paramAnonymousInt, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(19452712189952L, 144934);
          if (paramAnonymousInt != 0)
          {
            g.this.a(parami, "enterEnterpriseChat:fail", null);
            GMTrace.o(19452712189952L, 144934);
            return;
          }
          Object localObject = ((com.tencent.mm.af.a.m)paramAnonymousk).FZ();
          String str = "enterEnterpriseChat:fail";
          if (paramAnonymousInt < 0)
          {
            paramAnonymousk = str;
            if (localObject != null)
            {
              paramAnonymousk = str;
              if (((oe)localObject).tWa != null)
              {
                paramAnonymousk = str;
                if (com.tencent.mm.sdk.platformtools.bg.nm(((oe)localObject).tWa.eGz)) {
                  paramAnonymousk = "enterEnterpriseChat:fail_" + ((oe)localObject).tWa.eGz;
                }
              }
            }
            g.this.a(parami, paramAnonymousk, null);
            GMTrace.o(19452712189952L, 144934);
            return;
          }
          str = ((oe)localObject).tVU;
          paramAnonymousk = ((com.tencent.mm.af.a.m)paramAnonymousk).gyM;
          if (paramAnonymousk == null)
          {
            g.this.a(parami, "enterEnterpriseChat:fail", null);
            GMTrace.o(19452712189952L, 144934);
            return;
          }
          paramAnonymousk = com.tencent.mm.af.x.FI().jd(paramAnonymousk);
          if ((paramAnonymousk != null) && (!com.tencent.mm.sdk.platformtools.bg.nm(str)))
          {
            localObject = new Intent();
            ((Intent)localObject).putExtra("Chat_User", str);
            ((Intent)localObject).putExtra("key_biz_chat_id", paramAnonymousk.field_bizChatLocalId);
            ((Intent)localObject).putExtra("finish_direct", true);
            ((Intent)localObject).putExtra("key_need_send_video", false);
            ((Intent)localObject).putExtra("key_is_biz_chat", true);
            com.tencent.mm.bj.d.a(g.this.context, ".ui.chatting.En_5b8fbb1e", (Intent)localObject);
            g.this.a(parami, "enterEnterpriseChat:ok", null);
            GMTrace.o(19452712189952L, 144934);
            return;
          }
          g.this.a(parami, "enterEnterpriseChat:fail", null);
          GMTrace.o(19452712189952L, 144934);
        }
      });
      com.tencent.mm.kernel.h.xx().fYr.a(parami, 0);
      GMTrace.o(12195828072448L, 90866);
    }
    return true;
  }
  
  public final boolean cb(final i parami)
  {
    GMTrace.i(12195962290176L, 90867);
    try
    {
      String str = this.rEM.Zi();
      str = com.tencent.mm.sdk.platformtools.bg.nl(this.rSL.Ms(str));
      if (com.tencent.mm.sdk.platformtools.bg.nm(str))
      {
        a(parami, "getEnterpriseChat:fail", null);
        GMTrace.o(12195962290176L, 90867);
        return true;
      }
      Object localObject1 = new Bundle();
      ((Bundle)localObject1).putString("enterprise_action", "enterprise_get_context_bizchat");
      Object localObject2 = this.rEM.d(71, (Bundle)localObject1);
      localObject1 = ((Bundle)localObject2).getString("enterprise_context_biz");
      localObject2 = com.tencent.mm.af.a.e.aj(((Bundle)localObject2).getLong("enterprise_context_bizchatid", -1L));
      if ((com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) || (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2)))
      {
        a(parami, "getEnterpriseChat:fail_not in enterprise chat", null);
        GMTrace.o(12195962290176L, 90867);
        return true;
      }
      com.tencent.mm.ad.e local81 = new com.tencent.mm.ad.e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(18147981656064L, 135213);
          com.tencent.mm.af.s.a(this);
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            paramAnonymousString = "getEnterpriseChat:fail";
            paramAnonymousInt1 = -1;
            paramAnonymousk = null;
          }
          for (;;)
          {
            if (paramAnonymousInt1 != 0)
            {
              g.this.a(parami, paramAnonymousString, null);
              GMTrace.o(18147981656064L, 135213);
              return;
              paramAnonymousString = (com.tencent.mm.af.s)paramAnonymousk;
              if ((paramAnonymousString.fUa != null) && (paramAnonymousString.fUa.gtD.gtK != null)) {}
              for (paramAnonymousString = (xt)paramAnonymousString.fUa.gtD.gtK;; paramAnonymousString = null)
              {
                if ((paramAnonymousString != null) && (paramAnonymousString.tWa != null)) {
                  break label125;
                }
                str = "getEnterpriseChat:fail";
                paramAnonymousk = paramAnonymousString;
                paramAnonymousInt1 = -1;
                paramAnonymousString = str;
                break;
              }
              label125:
              paramAnonymousInt1 = paramAnonymousString.tWa.ret;
              if ((paramAnonymousString.tWa.eGz != null) && (paramAnonymousString.tWa.eGz.length() > 0))
              {
                str = "getEnterpriseChat:fail_" + paramAnonymousString.tWa.eGz;
                paramAnonymousk = paramAnonymousString;
                paramAnonymousString = str;
              }
            }
            else
            {
              paramAnonymousString = new HashMap();
              paramAnonymousString.put("result", paramAnonymousk.result);
              g.this.a(parami, "getEnterpriseChat:ok", paramAnonymousString);
              GMTrace.o(18147981656064L, 135213);
              return;
            }
            String str = "getEnterpriseChat:fail";
            paramAnonymousk = paramAnonymousString;
            paramAnonymousString = str;
          }
        }
      };
      com.tencent.mm.kernel.h.xx().fYr.a(1285, local81);
      if (!com.tencent.mm.af.s.j(str, (String)localObject1, (String)localObject2))
      {
        com.tencent.mm.af.s.a(local81);
        a(parami, "getEnterpriseChat:fail", null);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        a(parami, "getEnterpriseChat:fail", null);
      }
    }
    GMTrace.o(12195962290176L, 90867);
    return true;
  }
  
  public final boolean cc(final i parami)
  {
    GMTrace.i(12196096507904L, 90868);
    try
    {
      final Object localObject1 = this.rEM.Zi();
      String str = com.tencent.mm.sdk.platformtools.bg.nl(this.rSL.Ms((String)localObject1));
      if (com.tencent.mm.sdk.platformtools.bg.nm(str)) {
        a(parami, "openEnterpriseContact:fail", null);
      }
      localObject1 = new com.tencent.mm.plugin.webview.model.i(str, (String)localObject1, parami.nSp);
      com.tencent.mm.y.at.wS().a(1393, new com.tencent.mm.ad.e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
        {
          int i = -1;
          GMTrace.i(19452175319040L, 144930);
          if ((g.this.htG != null) && (g.this.htG.isShowing()))
          {
            g.this.htG.dismiss();
            g.this.htG = null;
          }
          com.tencent.mm.y.at.wS().b(1393, this);
          String str = "openEnterpriseContact:fail";
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            paramAnonymousk = null;
            paramAnonymousInt1 = i;
            paramAnonymousString = str;
          }
          while (paramAnonymousInt1 != 0)
          {
            g.this.a(parami, paramAnonymousString, null);
            GMTrace.o(19452175319040L, 144930);
            return;
            xr localxr = ((com.tencent.mm.plugin.webview.model.i)paramAnonymousk).bCd();
            paramAnonymousString = str;
            paramAnonymousk = localxr;
            paramAnonymousInt1 = i;
            if (localxr != null)
            {
              paramAnonymousString = str;
              paramAnonymousk = localxr;
              paramAnonymousInt1 = i;
              if (localxr.tWa != null)
              {
                paramAnonymousInt2 = localxr.tWa.ret;
                paramAnonymousString = str;
                paramAnonymousk = localxr;
                paramAnonymousInt1 = paramAnonymousInt2;
                if (localxr.tWa.eGz != null)
                {
                  paramAnonymousString = str;
                  paramAnonymousk = localxr;
                  paramAnonymousInt1 = paramAnonymousInt2;
                  if (localxr.tWa.eGz.length() > 0)
                  {
                    paramAnonymousString = localxr.tWa.eGz;
                    paramAnonymousk = localxr;
                    paramAnonymousInt1 = paramAnonymousInt2;
                  }
                }
              }
            }
          }
          paramAnonymousString = paramAnonymousk.ubQ;
          paramAnonymousk = new Intent();
          paramAnonymousk.putExtra("rawUrl", paramAnonymousString);
          paramAnonymousk.putExtra("useJs", true);
          ((MMActivity)g.this.context).vKC = jdField_this;
          com.tencent.mm.bj.d.b(g.this.context, "webview", ".ui.tools.WebViewUI", paramAnonymousk, 31);
          GMTrace.o(19452175319040L, 144930);
        }
      });
      com.tencent.mm.y.at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
      parami = this.context;
      this.context.getString(R.l.cUG);
      this.htG = com.tencent.mm.ui.base.h.a(parami, this.context.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(19450698924032L, 144919);
          com.tencent.mm.y.at.wS().c(localObject1);
          GMTrace.o(19450698924032L, 144919);
        }
      });
      GMTrace.o(12196096507904L, 90868);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localRemoteException.getMessage() });
        Object localObject2 = null;
      }
    }
  }
  
  public final boolean cd(final i parami)
  {
    GMTrace.i(16925258153984L, 126103);
    try
    {
      final Object localObject1 = this.rEM.Zi();
      Object localObject3 = com.tencent.mm.sdk.platformtools.bg.nl(this.rSL.Ms((String)localObject1));
      if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject3)) {
        a(parami, "selectEnterpriseContact:fail", null);
      }
      parami.nSp.put("groupId", "");
      parami.nSp.put("timestamp", "");
      parami.nSp.put("nonceStr", "");
      parami.nSp.put("signature", "");
      JSONObject localJSONObject = new JSONObject();
      try
      {
        Object localObject4 = new JSONArray((String)parami.nSp.get("type"));
        localJSONObject.put("fromDepartmentId", Integer.parseInt((String)parami.nSp.get("fromDepartmentId")));
        localJSONObject.put("mode", (String)parami.nSp.get("mode"));
        localJSONObject.put("type", localObject4);
        localObject4 = (String)parami.nSp.get("selectedDepartmentIds");
        if (localObject4 != null) {
          localJSONObject.put("selectedDepartmentIds", new JSONArray((String)localObject4));
        }
        localObject4 = (String)parami.nSp.get("selectedUserIds");
        if (localObject4 != null) {
          localJSONObject.put("selectedUserIds", new JSONArray((String)localObject4));
        }
        parami.nSp.put("params", localJSONObject);
      }
      catch (NumberFormatException localNumberFormatException)
      {
        Object localObject2;
        for (;;) {}
      }
      catch (JSONException localJSONException)
      {
        for (;;) {}
      }
      localObject1 = new com.tencent.mm.plugin.webview.model.i((String)localObject3, (String)localObject1, parami.nSp);
      parami = new com.tencent.mm.ad.e()
      {
        public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
        {
          int i = -1;
          GMTrace.i(19446135521280L, 144885);
          if ((g.this.htG != null) && (g.this.htG.isShowing()))
          {
            g.this.htG.dismiss();
            g.this.htG = null;
          }
          com.tencent.mm.y.at.wS().b(1393, this);
          String str = "selectEnterpriseContact:fail";
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            paramAnonymousk = null;
            paramAnonymousInt1 = i;
            paramAnonymousString = str;
          }
          while (paramAnonymousInt1 != 0)
          {
            g.this.a(parami, paramAnonymousString, null);
            GMTrace.o(19446135521280L, 144885);
            return;
            xr localxr = ((com.tencent.mm.plugin.webview.model.i)paramAnonymousk).bCd();
            paramAnonymousString = str;
            paramAnonymousk = localxr;
            paramAnonymousInt1 = i;
            if (localxr != null)
            {
              paramAnonymousString = str;
              paramAnonymousk = localxr;
              paramAnonymousInt1 = i;
              if (localxr.tWa != null)
              {
                paramAnonymousInt2 = localxr.tWa.ret;
                paramAnonymousString = str;
                paramAnonymousk = localxr;
                paramAnonymousInt1 = paramAnonymousInt2;
                if (localxr.tWa.eGz != null)
                {
                  paramAnonymousString = str;
                  paramAnonymousk = localxr;
                  paramAnonymousInt1 = paramAnonymousInt2;
                  if (localxr.tWa.eGz.length() > 0)
                  {
                    paramAnonymousString = localxr.tWa.eGz;
                    paramAnonymousk = localxr;
                    paramAnonymousInt1 = paramAnonymousInt2;
                  }
                }
              }
            }
          }
          paramAnonymousString = paramAnonymousk.ubQ;
          paramAnonymousk = new Intent();
          paramAnonymousk.putExtra("rawUrl", paramAnonymousString);
          paramAnonymousk.putExtra("useJs", true);
          ((MMActivity)g.this.context).vKC = jdField_this;
          com.tencent.mm.bj.d.b(g.this.context, "webview", ".ui.tools.WebViewUI", paramAnonymousk, 53);
          GMTrace.o(19446135521280L, 144885);
        }
      };
      com.tencent.mm.y.at.wS().a(1393, parami);
      com.tencent.mm.y.at.wS().a((com.tencent.mm.ad.k)localObject1, 0);
      localObject3 = this.context;
      this.context.getString(R.l.cUG);
      this.htG = com.tencent.mm.ui.base.h.a((Context)localObject3, this.context.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
      {
        public final void onCancel(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(19436874498048L, 144816);
          com.tencent.mm.y.at.wS().c(localObject1);
          com.tencent.mm.y.at.wS().b(1393, parami);
          GMTrace.o(19436874498048L, 144816);
        }
      });
      GMTrace.o(16925258153984L, 126103);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "exception in get currentUrl %s", new Object[] { localRemoteException.getMessage() });
        localObject2 = null;
      }
    }
  }
  
  public final boolean ce(final i parami)
  {
    GMTrace.i(12196230725632L, 90869);
    if (this.rEM == null)
    {
      a(parami, "sendEnterpriseChat:fail", null);
      GMTrace.o(12196230725632L, 90869);
      return true;
    }
    final String str2;
    final long l;
    final Object localObject2;
    String str3;
    String str4;
    try
    {
      Object localObject1 = new Bundle();
      ((Bundle)localObject1).putString("enterprise_action", "enterprise_get_context_bizchat");
      localObject1 = this.rEM.d(71, (Bundle)localObject1);
      str2 = ((Bundle)localObject1).getString("enterprise_context_biz");
      l = ((Bundle)localObject1).getLong("enterprise_context_bizchatid", -1L);
      if ((com.tencent.mm.sdk.platformtools.bg.nm(str2)) || (l < 0L))
      {
        a(parami, "sendEnterpriseChat:fail_not in enterprise chat", null);
        GMTrace.o(12196230725632L, 90869);
        return true;
      }
      localObject1 = (String)parami.nSp.get("type");
      if ("text".equals(localObject1))
      {
        boolean bool = a(parami, str2, l);
        GMTrace.o(12196230725632L, 90869);
        return bool;
      }
      if (!"link".equals(localObject1)) {
        break label614;
      }
      localObject2 = new JSONObject((String)parami.nSp.get("data"));
      localObject1 = ((JSONObject)localObject2).optString("link");
      str3 = ((JSONObject)localObject2).optString("title");
      str4 = ((JSONObject)localObject2).optString("desc");
      localObject2 = ((JSONObject)localObject2).optString("imgUrl");
      if ((com.tencent.mm.sdk.platformtools.bg.nm(str3)) && (com.tencent.mm.sdk.platformtools.bg.nm(str4)))
      {
        a(parami, "sendEnterpriseChat:fail_params error", null);
        GMTrace.o(12196230725632L, 90869);
        return true;
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MsgHandler", "clear webview cache fail : %s", new Object[] { localException.getMessage() });
      a(parami, "sendEnterpriseChat:fail", null);
      GMTrace.o(12196230725632L, 90869);
      return true;
    }
    if (com.tencent.mm.sdk.platformtools.bg.nm(localException))
    {
      a(parami, "sendEnterpriseChat:fail_params error", null);
      GMTrace.o(12196230725632L, 90869);
      return true;
    }
    Object localObject3 = new WXWebpageObject();
    ((WXWebpageObject)localObject3).webpageUrl = localException;
    this.eLU = new WXMediaMessage();
    this.eLU.mediaObject = ((WXMediaMessage.IMediaObject)localObject3);
    this.eLU.title = str3;
    this.eLU.description = str4;
    final String str1 = (String)parami.nSp.get("appid");
    if ((this.rSC != null) && (TextUtils.isEmpty(str1))) {
      str1 = this.rSC.getString("jsapi_args_appid");
    }
    for (;;)
    {
      localObject3 = com.tencent.mm.pluginsdk.model.app.g.aP(str1, true);
      if ((this.context == null) || (this.context.getResources() == null))
      {
        w.e("MicroMsg.MsgHandler", "showSendAppMsgDialog fail, context or context.getResources() is null");
        a(parami, "sendEnterpriseChat:fail", null);
        GMTrace.o(12196230725632L, 90869);
        return true;
      }
      if (!(this.context instanceof Activity))
      {
        w.e("MicroMsg.MsgHandler", "showsSendAppMsgDialog fail, context is not activity");
        a(parami, "sendEnterpriseChat:fail", null);
        GMTrace.o(12196230725632L, 90869);
        return true;
      }
      com.tencent.mm.pluginsdk.ui.applet.e.a(((MMActivity)this.context).vKB, str3, (String)localObject2, str4, null, true, this.context.getResources().getString(R.l.cUs), new o.a()
      {
        public final void a(boolean paramAnonymousBoolean, final String paramAnonymousString, int paramAnonymousInt)
        {
          GMTrace.i(19434995449856L, 144802);
          if (paramAnonymousBoolean)
          {
            if (com.tencent.mm.sdk.platformtools.bg.nm(localObject2))
            {
              com.tencent.mm.af.a.c localc = com.tencent.mm.af.x.FI().t(l);
              synchronized (com.tencent.mm.af.a.e.gyk)
              {
                String str = com.tencent.mm.af.a.e.Br();
                com.tencent.mm.af.a.e.d(localc);
                g.this.a(str1, str2, parami, localObject2, null, null, paramAnonymousString, null);
                com.tencent.mm.af.a.e.jk(str);
                g.this.a(this.rTq, "sendEnterpriseChat:ok", null);
                if (g.this.context != null) {
                  com.tencent.mm.ui.base.h.bm(g.this.context, g.this.context.getResources().getString(R.l.cUy));
                }
                GMTrace.o(19434995449856L, 144802);
                return;
              }
            }
            com.tencent.mm.ao.n.IY().a(localObject2, new com.tencent.mm.ao.b.c()
            {
              public final void n(Bitmap arg1)
              {
                GMTrace.i(19447880351744L, 144898);
                if (g.this.moR != null) {
                  g.this.moR.dismiss();
                }
                com.tencent.mm.af.a.c localc = com.tencent.mm.af.x.FI().t(g.87.this.rTF);
                synchronized (com.tencent.mm.af.a.e.gyk)
                {
                  String str = com.tencent.mm.af.a.e.Br();
                  com.tencent.mm.af.a.e.d(localc);
                  g.this.a(g.87.this.rTz, g.87.this.eud, g.87.this.etX, g.87.this.gHU, null, null, paramAnonymousString, null);
                  com.tencent.mm.af.a.e.jk(str);
                  g.this.a(g.87.this.rTq, "sendEnterpriseChat:ok", null);
                  if (g.this.context != null) {
                    com.tencent.mm.ui.base.h.bm(g.this.context, g.this.context.getResources().getString(R.l.cUy));
                  }
                  GMTrace.o(19447880351744L, 144898);
                  return;
                }
              }
            });
            GMTrace.o(19434995449856L, 144802);
            return;
          }
          g.this.a(this.rTq, "sendEnterpriseChat:cancel", null);
          GMTrace.o(19434995449856L, 144802);
        }
      });
      GMTrace.o(12196230725632L, 90869);
      return true;
      label614:
      a(parami, "sendEnterpriseChat:fail_params error", null);
      GMTrace.o(12196230725632L, 90869);
      return true;
    }
  }
  
  public final boolean cf(i parami)
  {
    GMTrace.i(12196499161088L, 90871);
    w.i("MicroMsg.MsgHandler", "start doChangePayActivityView");
    an localan = new an();
    Object localObject1 = (String)parami.nSp.get("showInfo");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
    {
      w.e("MicroMsg.MsgHandler", "changePayActivityView eroor, parse showinfo to jsonarray error");
      a(parami, "changePayActivityView:fail", null);
      GMTrace.o(12196499161088L, 90871);
      return false;
    }
    for (;;)
    {
      try
      {
        Object localObject2 = new JSONObject((String)localObject1);
        localan.eBF.eBH = ((JSONObject)localObject2).getString("buttonTitle");
        Object localObject3 = ((JSONObject)localObject2).getString("isButtonEnable");
        localObject1 = ((JSONObject)localObject2).getString("isButtonHidden");
        localObject2 = ((JSONObject)localObject2).getString("isActivityViewHidden");
        w.i("MicroMsg.MsgHandler", "isButtonEnable:" + (String)localObject3 + " isButtonHidden:" + (String)localObject1 + " isActivityViewHidden:" + (String)localObject2);
        an.a locala = localan.eBF;
        if (com.tencent.mm.sdk.platformtools.bg.getInt((String)localObject3, 0) > 0)
        {
          bool = true;
          locala.eBI = bool;
          localObject3 = localan.eBF;
          if (com.tencent.mm.sdk.platformtools.bg.getInt((String)localObject1, 0) > 0)
          {
            bool = true;
            ((an.a)localObject3).eBJ = bool;
            localObject1 = localan.eBF;
            if (com.tencent.mm.sdk.platformtools.bg.getInt((String)localObject2, 0) <= 0) {
              continue;
            }
            bool = true;
            ((an.a)localObject1).eBK = bool;
            com.tencent.mm.sdk.b.a.vgX.m(localan);
            if (!localan.eBG.eAO) {
              break label343;
            }
            w.i("MicroMsg.MsgHandler", "changePayActivityView:ok");
            a(parami, "changePayActivityView:ok", null);
            GMTrace.o(12196499161088L, 90871);
            return true;
          }
        }
        else
        {
          bool = false;
          continue;
        }
        boolean bool = false;
        continue;
        bool = false;
        continue;
        w.i("MicroMsg.MsgHandler", "changePayActivityView:fail");
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MsgHandler", "changePayActivityView eroor, parse showinfo to jsonarray error");
        a(parami, "changePayActivityView:fail", null);
        GMTrace.o(12196499161088L, 90871);
        return false;
      }
      label343:
      a(parami, "changePayActivityView:fail", null);
    }
  }
  
  public final boolean cg(i parami)
  {
    GMTrace.i(12196633378816L, 90872);
    Object localObject = (String)parami.nSp.get("idKeyDataInfo");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      w.e("MicroMsg.MsgHandler", "idkey data is null");
      a(parami, "reportIDKey:fail_invaild_parms", null);
      GMTrace.o(12196633378816L, 90872);
      return false;
    }
    try
    {
      localObject = new JSONArray((String)localObject);
      ArrayList localArrayList = new ArrayList();
      int i = 0;
      while (i < ((JSONArray)localObject).length())
      {
        JSONObject localJSONObject = ((JSONArray)localObject).optJSONObject(i);
        IDKey localIDKey = new IDKey();
        localIDKey.SetID(com.tencent.mm.sdk.platformtools.bg.getInt(localJSONObject.optString("id"), 0));
        localIDKey.SetKey(com.tencent.mm.sdk.platformtools.bg.getInt(localJSONObject.optString("key"), 0));
        localIDKey.SetValue(com.tencent.mm.sdk.platformtools.bg.getInt(localJSONObject.optString("value"), 0));
        localArrayList.add(localIDKey);
        i += 1;
      }
      if (localArrayList.size() > 0)
      {
        com.tencent.mm.plugin.report.service.g.ork.b(localArrayList, true);
        a(parami, "reportIDKey:ok", null);
        GMTrace.o(12196633378816L, 90872);
        return false;
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MsgHandler", "parse json array faild : %s", new Object[] { localException.getMessage() });
      a(parami, "reportIDKey:fail", null);
      GMTrace.o(12196633378816L, 90872);
    }
    return false;
  }
  
  public final boolean ch(final i parami)
  {
    GMTrace.i(16076196806656L, 119777);
    String str1 = (String)parami.nSp.get("username");
    if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
    {
      w.e("MicroMsg.MsgHandler", "user name is null or nil");
      a(parami, "add_contact:fail", null);
      GMTrace.o(16076196806656L, 119777);
      return false;
    }
    String str2 = (String)parami.nSp.get("scene");
    String str3 = (String)parami.nSp.get("profileReportInfo");
    w.i("MicroMsg.MsgHandler", "get scene = %s", new Object[] { str2 });
    int i = com.tencent.mm.sdk.platformtools.bg.getInt(str2, 91);
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void qg(int paramAnonymousInt)
      {
        GMTrace.i(19429760958464L, 144763);
        switch (paramAnonymousInt)
        {
        default: 
          g.this.a(parami, "quickly_add_contact:fail", null);
          GMTrace.o(19429760958464L, 144763);
          return;
        case -2: 
          g.this.a(parami, "quickly_add_contact:added", null);
          GMTrace.o(19429760958464L, 144763);
          return;
        case 0: 
          g.this.a(parami, "quickly_add_contact:cancel", null);
          GMTrace.o(19429760958464L, 144763);
          return;
        case -1: 
          g.this.a(parami, "quickly_add_contact:fail", null);
          GMTrace.o(19429760958464L, 144763);
          return;
        }
        g.this.a(parami, "quickly_add_contact:ok", null);
        GMTrace.o(19429760958464L, 144763);
      }
    }
    {
      public final void run()
      {
        GMTrace.i(14371229007872L, 107074);
        this.rUx.show();
        GMTrace.o(14371229007872L, 107074);
      }
    });
    GMTrace.o(16076196806656L, 119777);
    return true;
  }
  
  public final boolean ci(i parami)
  {
    GMTrace.i(16076331024384L, 119778);
    Object localObject = (String)parami.nSp.get("url");
    String str = (String)parami.nSp.get("open_game_webview");
    w.i("MicroMsg.MsgHandler", "open url with extra webview, url = %s", new Object[] { localObject });
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      w.e("MicroMsg.MsgHandler", "url is null or nil");
      a(parami, "openUrlWithExtraWebview:fail_invalid_url", null);
      GMTrace.o(16076331024384L, 119778);
      return true;
    }
    final Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", (String)localObject);
    localIntent.putExtra("convertActivityFromTranslucent", false);
    if (com.tencent.mm.sdk.platformtools.bg.nl(str).equals("1"))
    {
      localObject = new kg();
      ((kg)localObject).eOy.type = 0;
      ((kg)localObject).eOy.context = this.context;
      ((kg)localObject).eOy.intent = localIntent;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
    }
    for (;;)
    {
      a(parami, "openUrlWithExtraWebview:ok", null);
      GMTrace.o(16076331024384L, 119778);
      return true;
      com.tencent.mm.plugin.webview.ui.tools.d.a(localIntent.getExtras(), "webview", ".ui.tools.WebViewUI", this.rEM, new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18133217705984L, 135103);
          com.tencent.mm.bj.d.b(g.this.context, "webview", ".ui.tools.WebViewUI", localIntent);
          GMTrace.o(18133217705984L, 135103);
        }
      });
    }
  }
  
  public final boolean cj(i parami)
  {
    GMTrace.i(12196767596544L, 90873);
    Object localObject = (String)parami.nSp.get("url");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      w.e("MicroMsg.MsgHandler", "url is null or nil");
      a(parami, "openCunstonWebview:fail_invalid_url", null);
      GMTrace.o(12196767596544L, 90873);
      return true;
    }
    String str1 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("orientation"));
    if (!com.tencent.mm.sdk.platformtools.bg.nm(str1)) {
      if (!str1.equals("horizontal")) {}
    }
    label793:
    for (int i = 0;; i = -1)
    {
      if (com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("fullscreen")).equals("true")) {}
      for (boolean bool2 = true;; bool2 = false)
      {
        str1 = (String)parami.nSp.get("top_url");
        String str2 = (String)parami.nSp.get("top_title");
        boolean bool1 = false;
        try
        {
          if (this.rEM != null) {
            bool1 = this.rEM.d(81, new Bundle()).getBoolean("from_shortcut", false);
          }
          bool3 = bool1;
          j = 0;
          if (com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("finish_recent_webview")).equals("1")) {
            j = 1;
          }
          bool4 = false;
          if (com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("disable_swipe_back")).equals("1")) {
            bool4 = true;
          }
          str4 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("username"));
          str5 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("open_game_webview"));
          bool1 = false;
        }
        catch (Exception localException1)
        {
          try
          {
            boolean bool3;
            int j;
            boolean bool4;
            String str4;
            if (this.rEM != null) {
              bool1 = this.rEM.d(86, new Bundle()).getBoolean("is_from_keep_top");
            }
            String str3 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("gameAppid"));
            localIntent = new Intent();
            localIntent.putExtra("rawUrl", (String)localObject);
            localIntent.putExtra("screen_orientation", i);
            localIntent.putExtra("show_full_screen", bool2);
            localIntent.putExtra("disable_swipe_back", bool4);
            localIntent.putExtra("from_shortcut", bool3);
            localIntent.putExtra("shortcut_user_name", str4);
            if ((!com.tencent.mm.sdk.platformtools.bg.nm(str1)) && (!com.tencent.mm.sdk.platformtools.bg.nm(str2)))
            {
              localIntent.putExtra("keep_top_scene", 2);
              localIntent.putExtra("custom_keep_top_url", str1);
              localIntent.putExtra("custom_keep_top_title", str2);
            }
            localIntent.putExtra("is_from_keep_top", bool1);
            localIntent.putExtra("game_hv_menu_appid", str3);
            if (bool3)
            {
              com.tencent.mm.bj.d.b(this.context, "webview", ".ui.tools.game.H5GameWebViewUI", localIntent);
              if ((j != 0) && (!bool3)) {
                com.tencent.mm.sdk.platformtools.af.i(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(19445598650368L, 144881);
                    try
                    {
                      g.this.A(new i());
                      GMTrace.o(19445598650368L, 144881);
                      return;
                    }
                    catch (Exception localException)
                    {
                      w.i("MicroMsg.MsgHandler", "openCunstomWebview, close window exception : %s", new Object[] { localException.getMessage() });
                      GMTrace.o(19445598650368L, 144881);
                    }
                  }
                }, 200L);
              }
              localObject = new gl();
              ((gl)localObject).eJz.nJ = 2;
              ((gl)localObject).eJz.eJB = str3;
              com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
              a(parami, "openCunstonWebview:ok", null);
              GMTrace.o(12196767596544L, 90873);
              return true;
              if (str1.equals("vertical"))
              {
                i = 1;
                break;
              }
              if (!str1.equals("sensor")) {
                break label793;
              }
              i = 4;
              break;
              localException1 = localException1;
              w.e("MicroMsg.MsgHandler", "doOpenCustomWebview, get from shortcut exception : %s", new Object[] { localException1.getMessage() });
              bool3 = false;
            }
          }
          catch (Exception localException2)
          {
            for (;;)
            {
              String str5;
              Intent localIntent;
              w.e("MicroMsg.MsgHandler", "doOpenCustomWebview, get from keep top exception : %s", new Object[] { localException2.getMessage() });
              bool1 = false;
              continue;
              if (com.tencent.mm.sdk.platformtools.bg.nl(str5).equals("1"))
              {
                localObject = new kg();
                ((kg)localObject).eOy.type = 0;
                ((kg)localObject).eOy.context = this.context;
                ((kg)localObject).eOy.intent = localIntent;
                com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
              }
              else
              {
                com.tencent.mm.bj.d.b(this.context, "webview", ".ui.tools.WebViewUI", localIntent);
              }
            }
          }
        }
      }
    }
  }
  
  public final boolean ck(i parami)
  {
    GMTrace.i(14386127175680L, 107185);
    Object localObject = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("orientation"));
    int j = -1;
    int i = j;
    if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      if (!((String)localObject).equals("horizontal")) {
        break label114;
      }
      i = 0;
    }
    try
    {
      if (this.rEM != null)
      {
        localObject = new Bundle();
        ((Bundle)localObject).putInt("screen_orientation", i);
        this.rEM.d(1009, (Bundle)localObject);
        a(parami, "setScreenOrientation:ok", null);
      }
      for (;;)
      {
        GMTrace.o(14386127175680L, 107185);
        return true;
        label114:
        if (((String)localObject).equals("vertical"))
        {
          i = 1;
          break;
        }
        if (((String)localObject).equals("sensor"))
        {
          i = 4;
          break;
        }
        if (((String)localObject).equals("horizontal_unforced"))
        {
          i = 1001;
          break;
        }
        i = j;
        if (!((String)localObject).equals("vertical_unforced")) {
          break;
        }
        i = 1002;
        break;
        a(parami, "setScreenOrientation:fail", null);
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "doSetScreenOrientation exception, " + localException.getMessage());
        a(parami, "setScreenOrientation:fail", null);
      }
    }
  }
  
  public final boolean cl(final i parami)
  {
    GMTrace.i(16076465242112L, 119779);
    final Object localObject = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("base64DataString"));
    final String str1 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("thumbUrl"));
    final String str2 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("url"));
    final String str3 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("activityId"));
    if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) {
      com.tencent.mm.y.at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(15125801074688L, 112696);
          w.i("MicroMsg.MsgHandler", "doAddToEmoticon use base64DataString");
          int i = localObject.indexOf(";base64,");
          Object localObject = "";
          if (i != -1) {
            localObject = localObject.substring(i + 8, localObject.length());
          }
          try
          {
            localObject = Base64.decode((String)localObject, 0);
            if (com.tencent.mm.sdk.platformtools.bg.bq((byte[])localObject))
            {
              g.this.a(parami, "addToEmoticon:fail", null);
              GMTrace.o(15125801074688L, 112696);
              return;
            }
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.MsgHandler", "doAddToEmoticon error:" + localException.getMessage());
            g.this.a(parami, "addToEmoticon:fail_" + localException.getMessage(), null);
            GMTrace.o(15125801074688L, 112696);
            return;
          }
          String str1 = com.tencent.mm.a.g.n(localException);
          com.tencent.mm.y.at.AR();
          String str2 = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", str1);
          if ((!com.tencent.mm.a.e.aZ(str2)) || (!com.tencent.mm.a.g.bg(str2).equalsIgnoreCase(str1))) {
            com.tencent.mm.a.e.b(str2, localException, localException.length);
          }
          g.this.ab(str1, str1, str3);
          GMTrace.o(15125801074688L, 112696);
        }
      });
    }
    for (;;)
    {
      GMTrace.o(16076465242112L, 119779);
      return true;
      if (com.tencent.mm.sdk.platformtools.bg.nm(str2)) {
        break;
      }
      w.i("MicroMsg.MsgHandler", "doAddToEmoticon use url:%s", new Object[] { str2 });
      localObject = new File(this.context.getCacheDir(), com.tencent.mm.a.g.n(str2.getBytes()));
      if (((File)localObject).exists())
      {
        com.tencent.mm.y.at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(18133486141440L, 135105);
            String str1 = com.tencent.mm.a.g.h(localObject);
            com.tencent.mm.y.at.AR();
            String str2 = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", str1);
            if (!FileOp.aZ(str2)) {
              FileOp.o(localObject.getAbsolutePath(), str2);
            }
            g.this.ab(str1, str1, str3);
            GMTrace.o(18133486141440L, 135105);
          }
        });
      }
      else
      {
        com.tencent.mm.ao.a.a.c.a locala = new com.tencent.mm.ao.a.a.c.a();
        locala.gKC = true;
        locala.gKE = ((File)localObject).getAbsolutePath();
        locala.gLe = new Object[] { ((File)localObject).getAbsolutePath() };
        localObject = locala.Jn();
        com.tencent.mm.plugin.emoji.model.h.aqJ().a(str2, null, (com.tencent.mm.ao.a.a.c)localObject, new com.tencent.mm.ao.a.c.i()
        {
          public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
          {
            GMTrace.i(18150531792896L, 135232);
            w.i("MicroMsg.MsgHandler", "imageLoaderListener onImageLoadComplete %s", new Object[] { paramAnonymousString });
            if ((paramAnonymousBitmap != null) && (paramAnonymousVarArgs != null) && (paramAnonymousVarArgs.length > 0))
            {
              if ((paramAnonymousVarArgs[0] != null) && ((paramAnonymousVarArgs[0] instanceof String)))
              {
                if (paramAnonymousString.equals(str2))
                {
                  paramAnonymousString = new File(paramAnonymousVarArgs[0].toString());
                  if (paramAnonymousString.exists())
                  {
                    paramAnonymousBitmap = com.tencent.mm.a.g.h(paramAnonymousString);
                    com.tencent.mm.y.at.AR();
                    paramAnonymousVarArgs = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", paramAnonymousBitmap);
                    FileOp.o(paramAnonymousString.getAbsolutePath(), paramAnonymousVarArgs);
                    g.this.ab(paramAnonymousBitmap, str1, str3);
                    GMTrace.o(18150531792896L, 135232);
                    return;
                  }
                  g.this.a(parami, "addToEmoticon:fail", null);
                  GMTrace.o(18150531792896L, 135232);
                  return;
                }
                g.this.a(parami, "addToEmoticon:fail", null);
                GMTrace.o(18150531792896L, 135232);
                return;
              }
              g.this.a(parami, "addToEmoticon:fail", null);
              GMTrace.o(18150531792896L, 135232);
              return;
            }
            g.this.a(parami, "addToEmoticon:fail", null);
            GMTrace.o(18150531792896L, 135232);
          }
        });
      }
    }
    w.e("MicroMsg.MsgHandler", "doAddToEmoticon base64DataString is null and url is null");
    a(parami, "addToEmoticon:fail_base64DataString_and_url_is_null", null);
    GMTrace.o(16076465242112L, 119779);
    return false;
  }
  
  public final boolean cm(final i parami)
  {
    GMTrace.i(16076733677568L, 119781);
    final Object localObject = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("base64DataString"));
    final String str1 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("url"));
    final String str2 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("activityId"));
    if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) {
      com.tencent.mm.y.at.xB().A(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(18140062810112L, 135154);
          w.i("MicroMsg.MsgHandler", "doShareEmoticon use base64DataString");
          int i = localObject.indexOf(";base64,");
          Object localObject = "";
          if (i != -1) {
            localObject = localObject.substring(i + 8, localObject.length());
          }
          try
          {
            localObject = Base64.decode((String)localObject, 0);
            if (com.tencent.mm.sdk.platformtools.bg.bq((byte[])localObject))
            {
              g.this.a(parami, "shareEmoticon:fail", null);
              GMTrace.o(18140062810112L, 135154);
              return;
            }
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.MsgHandler", "doShareEmoticon error:" + localException.getMessage());
            g.this.a(parami, "shareEmoticon:fail_" + localException.getMessage(), null);
            GMTrace.o(18140062810112L, 135154);
            return;
          }
          String str1 = com.tencent.mm.a.g.n(localException);
          if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
          {
            g.this.a(parami, "shareEmoticon:fail empty buffer", null);
            GMTrace.o(18140062810112L, 135154);
            return;
          }
          com.tencent.mm.y.at.AR();
          String str2 = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", str1);
          if ((!com.tencent.mm.a.e.aZ(str2)) || (!com.tencent.mm.a.g.bg(str2).equalsIgnoreCase(str1))) {
            com.tencent.mm.a.e.b(str2, localException, localException.length);
          }
          g.this.eq(str1, str2);
          GMTrace.o(18140062810112L, 135154);
        }
      });
    }
    for (;;)
    {
      GMTrace.o(16076733677568L, 119781);
      return true;
      if (com.tencent.mm.sdk.platformtools.bg.nm(str1)) {
        break;
      }
      w.i("MicroMsg.MsgHandler", "doShareEmoticon use url:%s", new Object[] { str1 });
      localObject = new File(this.context.getCacheDir(), com.tencent.mm.a.g.n(str1.getBytes()));
      if (((File)localObject).exists())
      {
        com.tencent.mm.y.at.xB().A(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(19448283004928L, 144901);
            String str1 = com.tencent.mm.a.g.h(localObject);
            com.tencent.mm.y.at.AR();
            String str2 = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", str1);
            if (!FileOp.aZ(str2)) {
              FileOp.o(localObject.getAbsolutePath(), str2);
            }
            g.this.eq(str1, str2);
            GMTrace.o(19448283004928L, 144901);
          }
        });
      }
      else
      {
        com.tencent.mm.ao.a.a.c.a locala = new com.tencent.mm.ao.a.a.c.a();
        locala.gKC = true;
        locala.gKE = ((File)localObject).getAbsolutePath();
        locala.gLe = new Object[] { ((File)localObject).getAbsolutePath() };
        localObject = locala.Jn();
        com.tencent.mm.plugin.emoji.model.h.aqJ().a(str1, null, (com.tencent.mm.ao.a.a.c)localObject, new com.tencent.mm.ao.a.c.i()
        {
          public final void a(String paramAnonymousString, Bitmap paramAnonymousBitmap, Object... paramAnonymousVarArgs)
          {
            GMTrace.i(19430834700288L, 144771);
            w.i("MicroMsg.MsgHandler", "imageLoaderListener onImageLoadComplete %s", new Object[] { paramAnonymousString });
            if ((paramAnonymousBitmap != null) && (paramAnonymousVarArgs != null) && (paramAnonymousVarArgs.length > 0))
            {
              if ((paramAnonymousVarArgs[0] != null) && ((paramAnonymousVarArgs[0] instanceof String)))
              {
                if (paramAnonymousString.equals(str1))
                {
                  paramAnonymousString = new File(paramAnonymousVarArgs[0].toString());
                  if (paramAnonymousString.exists())
                  {
                    paramAnonymousBitmap = com.tencent.mm.a.g.h(paramAnonymousString);
                    com.tencent.mm.y.at.AR();
                    paramAnonymousVarArgs = EmojiLogic.G(com.tencent.mm.y.c.zb(), "", paramAnonymousBitmap);
                    FileOp.o(paramAnonymousString.getAbsolutePath(), paramAnonymousVarArgs);
                    g.this.eq(paramAnonymousBitmap, str2);
                    GMTrace.o(19430834700288L, 144771);
                    return;
                  }
                  g.this.a(parami, "shareEmoticon:fail", null);
                  GMTrace.o(19430834700288L, 144771);
                  return;
                }
                g.this.a(parami, "shareEmoticon:fail", null);
                GMTrace.o(19430834700288L, 144771);
                return;
              }
              g.this.a(parami, "shareEmoticon:fail", null);
              GMTrace.o(19430834700288L, 144771);
              return;
            }
            g.this.a(parami, "shareEmoticon:fail", null);
            GMTrace.o(19430834700288L, 144771);
          }
        });
      }
    }
    w.e("MicroMsg.MsgHandler", "doShareEmoticon base64DataString is null and url is null");
    a(parami, "shareEmoticon:fail_base64DataString_and_url_is_null", null);
    GMTrace.o(16076733677568L, 119781);
    return false;
  }
  
  public final boolean cn(i parami)
  {
    GMTrace.i(16077002113024L, 119783);
    String str1 = (String)parami.nSp.get("consumedCardId");
    String str2 = (String)parami.nSp.get("consumedCode");
    w.i("MicroMsg.MsgHandler", "doConsumedShareCard consumedCardId is " + str1);
    if ((com.tencent.mm.sdk.platformtools.bg.nm(str1)) || (com.tencent.mm.sdk.platformtools.bg.nm(str2)))
    {
      w.w("MicroMsg.MsgHandler", "doConsumedShareCard failed, illegal params (id : %s, code : %s)", new Object[] { str1, str2 });
      a(parami, "consumedShareCard:fail", null);
      GMTrace.o(16077002113024L, 119783);
      return false;
    }
    parami = new Intent();
    parami.putExtra("key_from_scene", 1);
    parami.putExtra("key_consumed_card_id", str1);
    parami.putExtra("key_consumed_Code", str2);
    ((MMActivity)this.context).vKC = this;
    com.tencent.mm.bj.d.b(this.context, "card", ".sharecard.ui.CardConsumeSuccessUI", parami, 29);
    GMTrace.o(16077002113024L, 119783);
    return true;
  }
  
  public final boolean co(i parami)
  {
    GMTrace.i(12196901814272L, 90874);
    w.i("MicroMsg.MsgHandler", "setNavigationBarColor");
    boolean bool = "1".equals((String)parami.nSp.get("actionCode"));
    Bundle localBundle = new Bundle();
    if (bool) {
      localBundle.putBoolean("set_navigation_bar_color_reset", true);
    }
    try
    {
      for (;;)
      {
        this.rEM.d(53, localBundle);
        a(parami, "setNavigationBarColor:ok", null);
        GMTrace.o(12196901814272L, 90874);
        return true;
        for (;;)
        {
          int i;
          try
          {
            i = Color.parseColor((String)parami.nSp.get("color"));
            j = i | 0xFF000000;
          }
          catch (Exception localException2)
          {
            float f;
            int k;
            w.e("MicroMsg.MsgHandler", localException2.getMessage());
            localBundle.putBoolean("set_navigation_bar_color_reset", true);
            int j = -1;
            continue;
          }
          try
          {
            f = com.tencent.mm.sdk.platformtools.bg.getFloat((String)parami.nSp.get("alpha"), 1.0F);
            k = (int)(f * 255.0F);
            if (k >= 0)
            {
              i = k;
              if (k <= 255) {}
            }
            else
            {
              i = 255;
            }
          }
          catch (Exception localException3)
          {
            w.e("MicroMsg.MsgHandler", localException3.getMessage());
            i = -1;
          }
        }
        localBundle.putInt("set_navigation_bar_color_color", j);
        localBundle.putInt("set_navigation_bar_color_alpha", i);
      }
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", localException1.getMessage());
        a(parami, "setNavigationBarColor:fail", null);
      }
    }
  }
  
  public final boolean cp(i parami)
  {
    GMTrace.i(16077404766208L, 119786);
    w.i("MicroMsg.MsgHandler", "openEmoticonTopicList");
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("tid"), 0);
    String str1 = (String)parami.nSp.get("title");
    String str2 = (String)parami.nSp.get("desc");
    String str3 = (String)parami.nSp.get("iconUrl");
    String str4 = (String)parami.nSp.get("secondUrl");
    Intent localIntent = new Intent();
    localIntent.putExtra("topic_id", i);
    localIntent.putExtra("topic_name", str1);
    localIntent.putExtra("topic_desc", str2);
    localIntent.putExtra("topic_icon_url", str3);
    localIntent.putExtra("topic_ad_url", str4);
    localIntent.putExtra("extra_scence", 12);
    com.tencent.mm.bj.d.b(this.context, "emoji", ".ui.EmojiStoreTopicUI", localIntent);
    a(parami, "openEmoticonTopicList", null);
    GMTrace.o(16077404766208L, 119786);
    return true;
  }
  
  public final boolean cq(i parami)
  {
    GMTrace.i(16077538983936L, 119787);
    w.i("MicroMsg.MsgHandler", "openEmotionDetailView");
    String str = (String)parami.nSp.get("ProductId");
    long l = com.tencent.mm.sdk.platformtools.bg.getLong((String)parami.nSp.get("searchID"), 0L);
    w.d("MicroMsg.MsgHandler", "cpan emoji openEmotionDetailView:%d", new Object[] { Long.valueOf(l) });
    if (com.tencent.mm.sdk.platformtools.bg.nm(str))
    {
      w.w("MicroMsg.MsgHandler", "openEmotionDetailView failed product id is null.");
      a(parami, "openEmotionDetailView", null);
      GMTrace.o(16077538983936L, 119787);
      return false;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("extra_id", str);
    localIntent.putExtra("preceding_scence", 12);
    localIntent.putExtra("download_entrance_scene", 12);
    localIntent.putExtra("searchID", l);
    if (!this.rSM)
    {
      com.tencent.mm.bj.d.b(this.context, "emoji", ".ui.EmojiStoreDetailUI", localIntent);
      this.rSM = true;
    }
    for (;;)
    {
      a(parami, "openEmotionDetailView", null);
      com.tencent.mm.plugin.report.service.g.ork.i(13055, new Object[] { Integer.valueOf(0), str, "", "", Integer.valueOf(com.tencent.mm.aj.a.GL()), Long.valueOf(l) });
      GMTrace.o(16077538983936L, 119787);
      return true;
      w.i("MicroMsg.MsgHandler", "had start emoji stroe detail ui.");
    }
  }
  
  public final boolean cr(i parami)
  {
    GMTrace.i(16077673201664L, 119788);
    this.kNw = false;
    com.tencent.mm.plugin.webview.modeltools.f.bCR();
    Object localObject2 = parami.nSp;
    Object localObject1 = com.tencent.mm.aj.a.GJ();
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
    {
      w.e("MicroMsg.emoji.EmojiStoreWebViewLogic", "load emojiStore Template Path error");
      GMTrace.o(16077673201664L, 119788);
      return false;
    }
    int i = com.tencent.mm.plugin.webview.b.a.p((Map)localObject2, "type");
    String str = com.tencent.mm.plugin.webview.b.a.o((Map)localObject2, "pageName");
    parami = com.tencent.mm.plugin.webview.b.a.o((Map)localObject2, "keyword");
    int j = com.tencent.mm.plugin.webview.b.a.p((Map)localObject2, "scene");
    localObject2 = new Intent();
    ((Intent)localObject2).putExtra("hardcode_jspermission", JsapiPermissionWrapper.tJP);
    ((Intent)localObject2).putExtra("hardcode_general_ctrl", GeneralControlWrapper.tJM);
    ((Intent)localObject2).putExtra("neverGetA8Key", true);
    ((Intent)localObject2).putExtra("rawUrl", "file://" + (String)localObject1 + "/" + str + "?type=" + i + "&keyword=" + parami + "&scene=" + j + "&lang=" + com.tencent.mm.sdk.platformtools.v.eq(com.tencent.mm.sdk.platformtools.ab.getContext()) + "&clientType=1&version=" + com.tencent.mm.aj.a.GL());
    ((Intent)localObject2).putExtra("keyword", parami);
    ((Intent)localObject2).putExtra("type", i);
    ((Intent)localObject2).putExtra("sence", j);
    com.tencent.mm.bj.d.b(com.tencent.mm.sdk.platformtools.ab.getContext(), "webview", ".ui.tools.emojistore.EmojiStoreSearchWebViewUI", (Intent)localObject2);
    com.tencent.mm.plugin.report.service.g.ork.i(13055, new Object[] { Integer.valueOf(1), "", "", Integer.valueOf(i), Integer.valueOf(com.tencent.mm.aj.a.GL()), Long.valueOf(0L) });
    localObject1 = new lr();
    ((lr)localObject1).eQa.type = i;
    ((lr)localObject1).eQa.eQb = parami;
    ((lr)localObject1).eQa.eQc = "";
    com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
    GMTrace.o(16077673201664L, 119788);
    return true;
  }
  
  public final boolean cs(i parami)
  {
    GMTrace.i(16077807419392L, 119789);
    this.kNw = false;
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCR().L(parami.nSp);
    GMTrace.o(16077807419392L, 119789);
    return bool;
  }
  
  public final boolean ct(i parami)
  {
    GMTrace.i(16077941637120L, 119790);
    this.kNw = false;
    com.tencent.mm.plugin.webview.modeltools.f.bCR();
    parami = com.tencent.mm.plugin.webview.b.a.o(parami.nSp, "urlString");
    Intent localIntent = new Intent();
    localIntent.putExtra("rawUrl", parami);
    com.tencent.mm.bj.d.b(com.tencent.mm.sdk.platformtools.ab.getContext(), "webview", ".ui.tools.WebViewUI", localIntent);
    GMTrace.o(16077941637120L, 119790);
    return false;
  }
  
  public final void cu(String paramString, int paramInt)
  {
    GMTrace.i(12201465217024L, 90908);
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_sns_id", paramString);
    localBundle.putInt("fts_key_status", paramInt);
    try
    {
      if (this.rEM != null) {
        this.rEM.m(125, localBundle);
      }
      GMTrace.o(12201465217024L, 90908);
      return;
    }
    catch (RemoteException paramString)
    {
      w.w("MicroMsg.MsgHandler", "onMusicStatusChanged exception" + paramString.getMessage());
      GMTrace.o(12201465217024L, 90908);
    }
  }
  
  public final boolean cu(i parami)
  {
    GMTrace.i(16078075854848L, 119791);
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("selectMode"), 0);
    w.i("MicroMsg.MsgHandler", "doSelectSingleContact selectedMode:%d", new Object[] { Integer.valueOf(i) });
    parami = new Intent();
    if (i == 1)
    {
      parami.putExtra("Select_Conv_Type", 263);
      parami.putExtra("jsapi_select_mode", 1);
    }
    for (;;)
    {
      parami.putExtra("select_is_ret", true);
      parami.putExtra("Select_block_List", com.tencent.mm.y.q.zE());
      parami.putExtra("scene_from", 4);
      if ((this.context instanceof MMActivity)) {
        com.tencent.mm.bj.d.a((MMActivity)this.context, ".ui.transmit.SelectConversationUI", parami, 30, this);
      }
      GMTrace.o(16078075854848L, 119791);
      return true;
      parami.putExtra("Select_Conv_Type", 259);
    }
  }
  
  public final boolean cv(final i parami)
  {
    GMTrace.i(12197304467456L, 90877);
    w.i("MicroMsg.MsgHandler", "doSendAppMsgToSpecifiedContact");
    String str = (String)parami.nSp.get("openid");
    if (com.tencent.mm.sdk.platformtools.bg.nm(str))
    {
      w.e("MicroMsg.MsgHandler", "doSendAppMsgToSpecifiedContact openid is null");
      a(parami, "sendAppMessageToSpecifiedContact:fail", null);
      GMTrace.o(12197304467456L, 90877);
      return true;
    }
    final Object localObject2 = (String)parami.nSp.get("appId");
    final Object localObject1 = localObject2;
    if (this.rSC != null)
    {
      localObject1 = localObject2;
      if (TextUtils.isEmpty((CharSequence)localObject2)) {
        localObject1 = this.rSC.getString("jsapi_args_appid");
      }
    }
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
    {
      w.e("MicroMsg.MsgHandler", "doSendAppMsgToSpecifiedContact appid is null");
      a(parami, "sendAppMessageToSpecifiedContact:fail", null);
      GMTrace.o(12197304467456L, 90877);
      return true;
    }
    this.eLU = h(parami);
    localObject2 = new com.tencent.mm.plugin.webview.model.v((String)localObject1, str);
    com.tencent.mm.y.at.wS().a(1142, new com.tencent.mm.ad.e()
    {
      public final void a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(19421305241600L, 144700);
        if ((g.this.htG != null) && (g.this.htG.isShowing()))
        {
          g.this.htG.dismiss();
          g.this.htG = null;
        }
        String str1;
        String str2;
        String str3;
        String str4;
        g localg;
        String str5;
        if ((paramAnonymousInt1 == 0) && (paramAnonymousInt2 == 0))
        {
          paramAnonymousString = (com.tencent.mm.plugin.webview.model.v)paramAnonymousk;
          if (paramAnonymousString.fUa == null)
          {
            paramAnonymousString = null;
            if (paramAnonymousString == null) {
              break label425;
            }
            paramAnonymousString = paramAnonymousString.username;
            if (com.tencent.mm.sdk.platformtools.bg.nm(paramAnonymousString)) {
              break label415;
            }
            if ((g.this.context instanceof MMActivity))
            {
              paramAnonymousk = (String)parami.nSp.get("img_url");
              str1 = (String)parami.nSp.get("desc");
              str2 = (String)parami.nSp.get("src_username");
              str3 = (String)parami.nSp.get("src_displayname");
              str4 = (String)parami.nSp.get("title");
              localg = g.this;
              str5 = localObject1;
              if ((localg.context != null) && (localg.context.getResources() != null)) {
                break label301;
              }
              w.e("MicroMsg.MsgHandler", "showSendAppMsgDialog fail, context or context.getResources() is null");
              paramAnonymousString = null;
              label236:
              if (paramAnonymousString != null) {
                break label406;
              }
              w.e("MicroMsg.MsgHandler", "sendAppMessageToSpecifiedContact fail, cannot show dialog");
              g.this.a(parami, "sendAppMessageToSpecifiedContact:fail", null);
            }
          }
        }
        for (;;)
        {
          g.this.a(parami, "sendAppMessageToSpecifiedContact:fail", null);
          GMTrace.o(19421305241600L, 144700);
          return;
          paramAnonymousString = (bjo)paramAnonymousString.fUa.gtD.gtK;
          break;
          label301:
          if (!(localg.context instanceof Activity))
          {
            w.e("MicroMsg.MsgHandler", "showsSendAppMsgDialog fail, context is not activity");
            paramAnonymousString = null;
            break label236;
          }
          String str6 = localg.bFy();
          com.tencent.mm.pluginsdk.model.app.f localf = com.tencent.mm.pluginsdk.model.app.g.aP(str5, true);
          paramAnonymousString = com.tencent.mm.pluginsdk.ui.applet.e.a(((MMActivity)localg.context).vKB, str4, paramAnonymousk, str1, null, true, localg.context.getResources().getString(R.l.cUs), new g.102(localg, localf, str5, paramAnonymousString, paramAnonymousk, str2, str3, str6, true, "sendAppMessageToSpecifiedContact:ok", "sendAppMessageToSpecifiedContact:fail"));
          break label236;
          label406:
          GMTrace.o(19421305241600L, 144700);
          return;
          label415:
          w.e("MicroMsg.MsgHandler", "doSendAppMsgToSpecifiedContact request userName is null");
          continue;
          label425:
          w.e("MicroMsg.MsgHandler", "TransIdResponse response is null");
          continue;
          w.e("MicroMsg.MsgHandler", "doSendAppMsgToSpecifiedContact request error is null");
        }
      }
    });
    com.tencent.mm.y.at.wS().a((com.tencent.mm.ad.k)localObject2, 0);
    parami = this.context;
    this.context.getString(R.l.cUG);
    this.htG = com.tencent.mm.ui.base.h.a(parami, this.context.getString(R.l.cUV), true, new DialogInterface.OnCancelListener()
    {
      public final void onCancel(DialogInterface paramAnonymousDialogInterface)
      {
        GMTrace.i(19447611916288L, 144896);
        com.tencent.mm.y.at.wS().c(localObject2);
        GMTrace.o(19447611916288L, 144896);
      }
    });
    GMTrace.o(12197304467456L, 90877);
    return true;
  }
  
  public final boolean cw(i parami)
  {
    GMTrace.i(12197572902912L, 90879);
    w.i("MicroMsg.MsgHandler", "doWCPayRealnameVerify call");
    com.tencent.mm.pluginsdk.wallet.f localf = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
    localIntent = new Intent();
    parami = null;
    try
    {
      String str = this.rEM.Zi();
      parami = str;
    }
    catch (RemoteException localRemoteException)
    {
      try
      {
        localIntent.putExtra("url", this.rEM.Zi());
        localIntent.setFlags(536870912);
        localIntent.putExtra("realname_scene", 1);
        ((MMActivity)this.context).vKC = this;
        com.tencent.mm.bj.d.b(this.context, "wallet_core", ".id_verify.WalletRealNameProcessProxyUI", localIntent, 34);
        GMTrace.o(12197572902912L, 90879);
        return true;
        localRemoteException = localRemoteException;
        w.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
      }
      catch (RemoteException parami)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.MsgHandler", parami, "", new Object[0]);
        }
      }
    }
    if (!com.tencent.mm.sdk.platformtools.bg.nm(parami))
    {
      localIntent.putExtra("appId", this.rSL.Ms(parami));
      localIntent.putExtra("timeStamp", localf.timeStamp);
      localIntent.putExtra("nonceStr", localf.nonceStr);
      localIntent.putExtra("packageExt", localf.packageExt);
      localIntent.putExtra("signtype", localf.signType);
      localIntent.putExtra("paySignature", localf.ePJ);
    }
  }
  
  public final boolean cx(i parami)
  {
    GMTrace.i(12197841338368L, 90881);
    final Object localObject = (String)parami.nSp.get("clearCookie");
    w.i("MicroMsg.MsgHandler", "clearflag = %s", new Object[] { localObject });
    if ((!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) && (((String)localObject).equalsIgnoreCase("true"))) {}
    for (boolean bool = true;; bool = false)
    {
      localObject = (String)parami.nSp.get("url");
      if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
      {
        localObject = com.tencent.mm.plugin.webview.modelcache.p.Lt((String)localObject);
        if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) {
          break label181;
        }
      }
      for (localObject = null;; localObject = ((Uri)localObject).getHost() + ":" + ((Uri)localObject).getPort())
      {
        if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) {
          q.a.rGn.xB().A(new Runnable()
          {
            public final void run()
            {
              Object localObject1 = null;
              GMTrace.i(19446538174464L, 144888);
              Object localObject2 = q.a.rGn;
              localObject2 = localObject;
              Object localObject3;
              if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2))
              {
                localObject3 = com.tencent.mm.plugin.webview.modelcache.k.bCJ();
                if (!((com.tencent.mm.plugin.webview.modelcache.k)localObject3).rFD)
                {
                  if (com.tencent.mm.sdk.platformtools.bg.cc((List)localObject1)) {
                    break label293;
                  }
                  localObject1 = ((List)localObject1).iterator();
                }
              }
              label56:
              label293:
              label340:
              label343:
              for (;;)
              {
                Object localObject4;
                if (((Iterator)localObject1).hasNext())
                {
                  localObject4 = (com.tencent.mm.plugin.webview.modelcache.f)((Iterator)localObject1).next();
                  localObject3 = com.tencent.mm.plugin.webview.modelcache.a.Ls(((com.tencent.mm.plugin.webview.modelcache.f)localObject4).field_appId);
                  if (localObject3 == null) {
                    continue;
                  }
                  localObject4 = ((com.tencent.mm.plugin.webview.modelcache.f)localObject4).field_localPath;
                  if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject4)) {
                    continue;
                  }
                  if (!((String)localObject4).startsWith(((com.tencent.mm.plugin.webview.modelcache.a)localObject3).path)) {
                    break label340;
                  }
                }
                for (long l = FileOp.kX((String)localObject4);; l = 0L)
                {
                  if ((!FileOp.deleteFile((String)localObject4)) || (!((String)localObject4).startsWith(((com.tencent.mm.plugin.webview.modelcache.a)localObject3).path))) {
                    break label343;
                  }
                  localObject4 = ((com.tencent.mm.plugin.webview.modelcache.a)localObject3).rFz;
                  localObject3 = ((com.tencent.mm.plugin.webview.modelcache.a)localObject3).appId;
                  if (!((a.b)localObject4).rFD) {
                    break label56;
                  }
                  com.tencent.mm.plugin.webview.modelcache.a.a locala = new com.tencent.mm.plugin.webview.modelcache.a.a();
                  locala.field_appId = ((String)localObject3);
                  if (!((a.b)localObject4).b(locala, new String[0])) {
                    break label56;
                  }
                  locala.field_occupation = Math.max(0L, locala.field_occupation - l);
                  ((a.b)localObject4).c(locala, new String[0]);
                  break label56;
                  if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2)) {
                    break;
                  }
                  localObject1 = ((com.tencent.mm.plugin.webview.modelcache.k)localObject3).l(String.format("select * from %s where %s=? ", new Object[] { "WebViewResourceCache", "domain" }), new String[] { localObject2 });
                  break;
                  localObject1 = com.tencent.mm.plugin.webview.modelcache.k.bCJ();
                  if ((!((com.tencent.mm.plugin.webview.modelcache.k)localObject1).rFD) || (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2))) {}
                  for (;;)
                  {
                    WebViewCacheDownloadHelper.bCM();
                    GMTrace.o(19446538174464L, 144888);
                    return;
                    localObject3 = new com.tencent.mm.plugin.webview.modelcache.f();
                    ((com.tencent.mm.plugin.webview.modelcache.f)localObject3).field_domain = ((String)localObject2);
                    ((com.tencent.mm.plugin.webview.modelcache.k)localObject1).a((com.tencent.mm.sdk.e.c)localObject3, new String[] { "domain" });
                  }
                }
              }
            }
          });
        }
        if (this.rEM == null) {
          break;
        }
        localObject = new Bundle();
        ((Bundle)localObject).putBoolean("clear_webview_cache_clear_cookie", bool);
        try
        {
          this.rEM.d(6001, (Bundle)localObject);
          a(parami, "clearWebviewCache:ok", null);
          GMTrace.o(12197841338368L, 90881);
          return true;
        }
        catch (Exception localException)
        {
          label181:
          w.e("MicroMsg.MsgHandler", "clear webview cache fail : %s", new Object[] { localException.getMessage() });
          a(parami, "clearWebviewCache:fail", null);
          GMTrace.o(12197841338368L, 90881);
          return true;
        }
        localObject = Uri.parse((String)localObject);
      }
      a(parami, "clearWebviewCache:fail", null);
      GMTrace.o(12197841338368L, 90881);
      return true;
    }
  }
  
  public final boolean cy(i parami)
  {
    GMTrace.i(16078210072576L, 119792);
    com.tencent.mm.pluginsdk.wallet.f localf = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
    Intent localIntent = new Intent();
    String str = (String)parami.nSp.get("appId");
    Object localObject = str;
    if (this.rSC != null)
    {
      parami = str;
      if (TextUtils.isEmpty(str)) {
        parami = this.rSC.getString("jsapi_args_appid");
      }
      localObject = parami;
      if (TextUtils.isEmpty(parami)) {
        localObject = this.rSL.Ms(Zi());
      }
    }
    localIntent.putExtra("appId", (String)localObject);
    localIntent.putExtra("timeStamp", localf.timeStamp);
    localIntent.putExtra("nonceStr", localf.nonceStr);
    localIntent.putExtra("packageExt", localf.packageExt);
    localIntent.putExtra("signtype", localf.signType);
    localIntent.putExtra("paySignature", localf.ePJ);
    localIntent.putExtra("url", Zi());
    ((MMActivity)this.context).vKC = this;
    com.tencent.mm.bj.d.a(this.context, "wallet", ".bind.ui.WalletUnbindBankCardProxyUI", localIntent, 39, false);
    GMTrace.o(16078210072576L, 119792);
    return true;
  }
  
  public final boolean cz(i parami)
  {
    GMTrace.i(12197975556096L, 90882);
    w.i("MicroMsg.MsgHandler", "doIdCardRealnameVerify call");
    com.tencent.mm.pluginsdk.wallet.f localf = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
    localIntent = new Intent();
    parami = null;
    try
    {
      String str = this.rEM.Zi();
      parami = str;
    }
    catch (RemoteException localRemoteException)
    {
      try
      {
        localIntent.putExtra("url", this.rEM.Zi());
        localIntent.putExtra("real_name_verify_mode", 2);
        localIntent.setFlags(536870912);
        localIntent.putExtra("realname_scene", 1);
        ((MMActivity)this.context).vKC = this;
        com.tencent.mm.bj.d.b(this.context, "wallet_core", ".id_verify.WalletRealNameProcessProxyUI", localIntent, 41);
        GMTrace.o(12197975556096L, 90882);
        return true;
        localRemoteException = localRemoteException;
        w.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
      }
      catch (RemoteException parami)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.MsgHandler", parami, "", new Object[0]);
        }
      }
    }
    if (!com.tencent.mm.sdk.platformtools.bg.nm(parami))
    {
      localIntent.putExtra("appId", this.rSL.Ms(parami));
      localIntent.putExtra("timeStamp", localf.timeStamp);
      localIntent.putExtra("nonceStr", localf.nonceStr);
      localIntent.putExtra("packageExt", localf.packageExt);
      localIntent.putExtra("signtype", localf.signType);
      localIntent.putExtra("paySignature", localf.ePJ);
    }
  }
  
  public final void d(int paramInt1, String paramString, int paramInt2)
  {
    GMTrace.i(12201733652480L, 90910);
    Bundle localBundle = new Bundle();
    localBundle.putInt("fts_key_teach_request_type", paramInt1);
    localBundle.putString("fts_key_json_data", paramString);
    localBundle.putInt("fts_key_is_cache_data", paramInt2);
    try
    {
      if (this.rEM != null) {
        this.rEM.m(121, localBundle);
      }
      GMTrace.o(12201733652480L, 90910);
      return;
    }
    catch (RemoteException paramString)
    {
      w.w("MicroMsg.MsgHandler", "onTeachSearchDataReady exception" + paramString.getMessage());
      GMTrace.o(12201733652480L, 90910);
    }
  }
  
  public final boolean d(final i parami)
  {
    GMTrace.i(12181869428736L, 90762);
    w.d("MicroMsg.MsgHandler", "doShowDatePicker");
    SimpleDateFormat localSimpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
    try
    {
      Object localObject1 = (String)parami.nSp.get("current");
      if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
      {
        localObject1 = localSimpleDateFormat.format(Long.valueOf(System.currentTimeMillis()));
        localObject2 = (String)parami.nSp.get("range");
        if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2))
        {
          localObject2 = new JSONObject((String)localObject2);
          str1 = ((JSONObject)localObject2).optString("start", "2013-01-01");
          localObject2 = ((JSONObject)localObject2).optString("end", (String)localObject1);
          String str2 = (String)parami.nSp.get("fields");
          if (com.tencent.mm.sdk.platformtools.bg.nm(str2))
          {
            str2 = "month";
            Calendar localCalendar = Calendar.getInstance();
            localCalendar.setTime(localSimpleDateFormat.parse((String)localObject1));
            if ((this.context == null) || (!(this.context instanceof Activity)))
            {
              w.e("MicroMsg.MsgHandler", "context error!");
              GMTrace.o(12181869428736L, 90762);
              return false;
            }
            localObject1 = new com.tencent.mm.ui.widget.g(this.context, new DatePickerDialog.OnDateSetListener()
            {
              public final void onDateSet(DatePicker paramAnonymousDatePicker, int paramAnonymousInt1, int paramAnonymousInt2, int paramAnonymousInt3)
              {
                GMTrace.i(12244414889984L, 91228);
                w.i("MicroMsg.MsgHandler", "date set: %d, %d, %d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2 + 1), Integer.valueOf(paramAnonymousInt3) });
                paramAnonymousDatePicker = new HashMap();
                paramAnonymousDatePicker.put("selectTime", String.format("%d-%d-%d", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2 + 1), Integer.valueOf(paramAnonymousInt3) }));
                g.this.a(parami, "showDatePickerView:ok", paramAnonymousDatePicker);
                GMTrace.o(12244414889984L, 91228);
              }
            }, localCalendar.get(1), localCalendar.get(2), localCalendar.get(5), localSimpleDateFormat.parse(str1).getTime(), str2);
            ((com.tencent.mm.ui.widget.g)localObject1).setOnCancelListener(new DialogInterface.OnCancelListener()
            {
              public final void onCancel(DialogInterface paramAnonymousDialogInterface)
              {
                GMTrace.i(12148046561280L, 90510);
                w.i("MicroMsg.MsgHandler", "cancel date set");
                g.this.a(parami, "showDatePickerView:cancel", null);
                GMTrace.o(12148046561280L, 90510);
              }
            });
            if (!com.tencent.mm.sdk.platformtools.bg.nm(str1))
            {
              w.d("MicroMsg.MsgHandler", "min date: %s", new Object[] { str1 });
              ((com.tencent.mm.ui.widget.g)localObject1).getDatePicker().setMinDate(localSimpleDateFormat.parse(str1).getTime());
            }
            if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2))
            {
              w.d("MicroMsg.MsgHandler", "max date: %s", new Object[] { localObject2 });
              ((com.tencent.mm.ui.widget.g)localObject1).getDatePicker().setMaxDate(localSimpleDateFormat.parse((String)localObject2).getTime());
            }
            ((com.tencent.mm.ui.widget.g)localObject1).show();
            GMTrace.o(12181869428736L, 90762);
            return true;
          }
        }
      }
    }
    catch (ParseException parami)
    {
      for (;;) {}
    }
    catch (JSONException parami)
    {
      for (;;)
      {
        continue;
        continue;
        Object localObject2 = null;
        String str1 = null;
      }
    }
  }
  
  public final boolean d(final i parami, final JsapiPermissionWrapper paramJsapiPermissionWrapper)
  {
    GMTrace.i(18149055397888L, 135221);
    String str1 = (String)parami.nSp.get("appid");
    String str2 = (String)parami.nSp.get("extInfo");
    if (!am.isNetworkConnected(this.context))
    {
      Toast.makeText(this.context, this.context.getString(R.l.dzS), 0).show();
      a(parami, "add_download_task_straight:fail_network_not_connected", null);
      w.i("MicroMsg.MsgHandler", "doAddDownloadTaskStraight fail, network not ready");
      r(str1, com.tencent.mm.plugin.downloader.model.d.keW, str2);
      GMTrace.o(18149055397888L, 135221);
      return true;
    }
    if (am.isWifi(this.context)) {
      ae(parami);
    }
    for (;;)
    {
      GMTrace.o(18149055397888L, 135221);
      return true;
      com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.ejO), this.context.getString(R.l.ejP), this.context.getString(R.l.ejJ), this.context.getString(R.l.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19452443754496L, 144932);
          g.this.ae(parami);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(19452443754496L, 144932);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19438485110784L, 144828);
          paramAnonymousDialogInterface.dismiss();
          g.this.a(parami, "add_download_task_straight:fail_network_not_wifi", null);
          GMTrace.o(19438485110784L, 144828);
        }
      }, R.e.aPp);
    }
  }
  
  public final boolean d(i parami, boolean paramBoolean)
  {
    GMTrace.i(16077270548480L, 119785);
    w.i("MicroMsg.MsgHandler", "openDesignerProfile");
    String str = (String)parami.nSp.get("designerId");
    long l = com.tencent.mm.sdk.platformtools.bg.getLong((String)parami.nSp.get("searchID"), 0L);
    w.d("MicroMsg.MsgHandler", "cpan emoji openDesignerProfile:%d", new Object[] { Long.valueOf(l) });
    if (com.tencent.mm.sdk.platformtools.bg.nm(str))
    {
      w.w("MicroMsg.MsgHandler", "openDesignerProfile failed designer id is null.");
      a(parami, "openDesignerProfile", null);
      GMTrace.o(16077270548480L, 119785);
      return false;
    }
    Intent localIntent = new Intent();
    localIntent.putExtra("id", str);
    localIntent.putExtra("extra_scence", 12);
    localIntent.putExtra("searchID", l);
    com.tencent.mm.bj.d.b(this.context, "emoji", ".ui.v2.EmojiStoreV2DesignerUI", localIntent);
    a(parami, "openDesignerProfile", null);
    if (paramBoolean) {
      com.tencent.mm.plugin.report.service.g.ork.i(13055, new Object[] { Integer.valueOf(3), "", str, "", Integer.valueOf(com.tencent.mm.aj.a.GL()), Long.valueOf(l) });
    }
    GMTrace.o(16077270548480L, 119785);
    return true;
  }
  
  public final boolean dA(i parami)
  {
    GMTrace.i(12203075829760L, 90920);
    try
    {
      this.rEM.d(36, Bundle.EMPTY);
      a(parami, "stopPullDownRefresh:ok", null);
      GMTrace.o(12203075829760L, 90920);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.i("MicroMsg.MsgHandler", "doStopPullDownRefresh, exception = %s", new Object[] { localException });
        a(parami, "stopPullDownRefresh:fail", null);
      }
    }
  }
  
  public final boolean dB(i parami)
  {
    GMTrace.i(12203344265216L, 90922);
    this.kNw = false;
    String str = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("placeholder"));
    int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("maxLength"), 0);
    try
    {
      Bundle localBundle = new Bundle(2);
      localBundle.putString("show_kb_placeholder", str);
      localBundle.putInt("show_kb_max_length", i);
      this.rEM.d(37, localBundle);
      this.rTo = parami;
      GMTrace.o(12203344265216L, 90922);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.i("MicroMsg.MsgHandler", "doShowKeyBoard, exception = %s", new Object[] { localException });
        a(this.rEM, parami, "showKeyboard:fail", null, true, true);
      }
    }
  }
  
  public final boolean dC(i parami)
  {
    GMTrace.i(12203478482944L, 90923);
    this.kNw = false;
    for (;;)
    {
      try
      {
        Bundle localBundle = new Bundle();
        localBundle = this.rEM.d(79, localBundle);
        HashMap localHashMap = new HashMap();
        int i = localBundle.getInt("height", 0);
        if (i <= 0) {
          continue;
        }
        localHashMap.put("height", Integer.valueOf(com.tencent.mm.br.a.Y(com.tencent.mm.sdk.platformtools.ab.getContext(), i)));
        a(this.rEM, parami, "showSmileyPanel:ok", localHashMap, true, true);
      }
      catch (Exception localException)
      {
        w.i("MicroMsg.MsgHandler", "doShowSmileyPanel, exception = %s", new Object[] { localException });
        a(this.rEM, parami, "showSmileyPanel:fail", null, true, true);
        continue;
      }
      GMTrace.o(12203478482944L, 90923);
      return true;
      a(this.rEM, parami, "showSmileyPanel:fail", null, true, true);
    }
  }
  
  public final boolean dD(i parami)
  {
    GMTrace.i(12203612700672L, 90924);
    Object localObject = (String)parami.nSp.get("place");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      a(parami, "disableBounceScroll:fail", null);
      GMTrace.o(12203612700672L, 90924);
      return true;
    }
    try
    {
      JSONArray localJSONArray = new JSONArray((String)localObject);
      int i = 0;
      int j = 0;
      while (i < localJSONArray.length())
      {
        boolean bool = "top".equalsIgnoreCase(localJSONArray.getString(i));
        if (bool) {
          j = 1;
        }
        i += 1;
      }
      if (j != 0) {
        break label170;
      }
    }
    catch (JSONException localJSONException)
    {
      w.i("MicroMsg.MsgHandler", "doDisableBounceScroll, invalid json array, string = %s", new Object[] { localObject });
      a(parami, "disableBounceScroll:fail", null);
      GMTrace.o(12203612700672L, 90924);
      return true;
    }
    a(parami, "disableBounceScroll:ok", null);
    GMTrace.o(12203612700672L, 90924);
    return true;
    try
    {
      label170:
      localObject = new Bundle(1);
      ((Bundle)localObject).putInt("webview_disable_bounce_scroll_top", 1);
      this.rEM.d(38, (Bundle)localObject);
      a(parami, "disableBounceScroll:ok", null);
      GMTrace.o(12203612700672L, 90924);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.i("MicroMsg.MsgHandler", "doDisableBounceScroll, exception = %s", new Object[] { localException });
        a(parami, "disableBounceScroll:fail", null);
      }
    }
  }
  
  public final boolean dE(i parami)
  {
    GMTrace.i(12203746918400L, 90925);
    try
    {
      this.rEM.d(39, new Bundle(0));
      a(parami, "clearBounceBackground:ok", null);
      GMTrace.o(12203746918400L, 90925);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "doClearBounceBackground, exception = %s", new Object[] { localException });
        a(parami, "clearBounceBackground:fail", null);
      }
    }
  }
  
  public final boolean dF(i parami)
  {
    GMTrace.i(12203881136128L, 90926);
    Bundle localBundle = new Bundle();
    localBundle.putString("key_set_bounce_background_color", (String)parami.nSp.get("backgroundColor"));
    try
    {
      this.rEM.d(72, localBundle);
      a(parami, "setBounceBackground:ok", null);
      GMTrace.o(12203881136128L, 90926);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "setBounceBackground, exception = %s", new Object[] { localException });
        a(parami, "setBounceBackground:fail", null);
      }
    }
  }
  
  public final boolean dG(i parami)
  {
    GMTrace.i(12204015353856L, 90927);
    int i = com.tencent.mm.sdk.platformtools.bg.getInt(com.tencent.mm.sdk.platformtools.bg.bG(parami.nSp.get("id")), 0);
    if (i <= 0)
    {
      a(parami, "realtimeReport:fail", null);
      GMTrace.o(12204015353856L, 90927);
      return true;
    }
    String str = com.tencent.mm.sdk.platformtools.bg.bG(parami.nSp.get("value"));
    int j = com.tencent.mm.sdk.platformtools.bg.getInt(com.tencent.mm.sdk.platformtools.bg.bG(parami.nSp.get("type")), 0);
    com.tencent.mm.plugin.webview.model.e locale = com.tencent.mm.plugin.webview.model.e.a.rEh;
    if (!com.tencent.mm.y.at.AU())
    {
      w.i("MicroMsg.WebView.JsLogHelper", "kvStat(), acc not ready, skip");
      i = 0;
      label112:
      if (i == 0) {
        break label414;
      }
      a(parami, "realtimeReport:ok", null);
    }
    for (;;)
    {
      GMTrace.o(12204015353856L, 90927);
      return true;
      Object localObject1 = com.tencent.mm.plugin.webview.modeltools.f.bCY();
      Object localObject2 = (Long)((com.tencent.mm.plugin.webview.model.d)localObject1).rDZ.get(Integer.valueOf(i));
      long l1;
      if (localObject2 != null) {
        l1 = ((Long)localObject2).longValue();
      }
      for (;;)
      {
        l2 = l1;
        if (l1 == 0L) {
          break label349;
        }
        l2 = l1;
        if (l1 >= com.tencent.mm.sdk.platformtools.bg.Pu()) {
          break label349;
        }
        localObject1 = ((com.tencent.mm.plugin.webview.model.d)localObject1).rDZ;
        localObject2 = Integer.valueOf(i);
        if (localObject2 != null) {
          break;
        }
        throw new NullPointerException("key == null");
        localObject2 = ((com.tencent.mm.plugin.webview.model.d)localObject1).goN.a(String.format("select %s from %s where %s=?", new Object[] { "liftTime", "JsLogBlockList", "logId" }), new String[] { String.valueOf(i) }, 2);
        if (localObject2 == null)
        {
          l1 = 0L;
        }
        else if (((Cursor)localObject2).moveToFirst())
        {
          l1 = ((Cursor)localObject2).getLong(0);
          ((Cursor)localObject2).close();
        }
        else
        {
          ((Cursor)localObject2).close();
          l1 = 0L;
        }
      }
      if (((com.tencent.mm.sdk.platformtools.at)localObject1).get(localObject2) != null) {
        ((com.tencent.mm.sdk.platformtools.at)localObject1).s(localObject2, null);
      }
      long l2 = 0L;
      label349:
      if ((l2 != 0L) && (l2 >= com.tencent.mm.sdk.platformtools.bg.Pu())) {
        break;
      }
      localObject1 = new aks();
      ((aks)localObject1).uzM = i;
      ((aks)localObject1).uzN = com.tencent.mm.bm.b.Qb(str);
      ((aks)localObject1).uzV = j;
      locale.rEe.add(localObject1);
      i = 1;
      break label112;
      label414:
      a(parami, "realtimeReport:fail", null);
    }
  }
  
  public final boolean dH(i parami)
  {
    GMTrace.i(12204149571584L, 90928);
    String str1 = (String)parami.nSp.get("latitude");
    String str2 = (String)parami.nSp.get("longitude");
    final String str3 = (String)parami.nSp.get("destinationName");
    if ((com.tencent.mm.sdk.platformtools.bg.nm(str1)) || (com.tencent.mm.sdk.platformtools.bg.nm(str2)))
    {
      a(parami, "openMapNavigateMenu:fail", null);
      GMTrace.o(12204149571584L, 90928);
      return true;
    }
    for (;;)
    {
      try
      {
        final double d1 = Double.parseDouble(str1);
        double d2 = Double.parseDouble(str2);
        final int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("preferMap"), com.tencent.mm.pluginsdk.model.a.a.tmB.code);
        if ((this.context != null) && ((this.context instanceof Activity)) && (!((Activity)this.context).isFinishing()))
        {
          com.tencent.mm.sdk.platformtools.af.t(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(19423586942976L, 144717);
              Object localObject;
              Context localContext;
              int i;
              double d1;
              double d2;
              String str;
              int j;
              j.d local1;
              if ((g.this.context != null) && ((g.this.context instanceof Activity)) && (!((Activity)g.this.context).isFinishing()))
              {
                localObject = g.this.rSN;
                localContext = g.this.context;
                i = i;
                d1 = d1;
                d2 = str3;
                str = this.rTJ;
                j = this.rTK;
                local1 = new j.d()
                {
                  private void aD(int paramAnonymous2Int, String paramAnonymous2String)
                  {
                    GMTrace.i(19419694628864L, 144688);
                    g.c localc = g.this.yl(paramAnonymous2Int);
                    if ((localc != null) && (localc.rSz != null) && (localc.rEM != null)) {
                      g.this.a(g.this.rEM, g.this.rSz, "openMapNavigateMenu:" + com.tencent.mm.sdk.platformtools.bg.aq(paramAnonymous2String, "fail"));
                    }
                    GMTrace.o(19419694628864L, 144688);
                  }
                  
                  public final void nM(int paramAnonymous2Int)
                  {
                    GMTrace.i(19419426193408L, 144686);
                    aD(paramAnonymous2Int, "fail");
                    GMTrace.o(19419426193408L, 144686);
                  }
                  
                  public final void sT(int paramAnonymous2Int)
                  {
                    GMTrace.i(19419560411136L, 144687);
                    aD(paramAnonymous2Int, "ok");
                    GMTrace.o(19419560411136L, 144687);
                  }
                  
                  public final void yn(int paramAnonymous2Int)
                  {
                    GMTrace.i(19419291975680L, 144685);
                    aD(paramAnonymous2Int, "cancel");
                    GMTrace.o(19419291975680L, 144685);
                  }
                  
                  public final void yo(int paramAnonymous2Int)
                  {
                    GMTrace.i(19419828846592L, 144689);
                    g.this.ym(paramAnonymous2Int);
                    GMTrace.o(19419828846592L, 144689);
                  }
                };
                if ((localContext == null) || (!(localContext instanceof MMActivity)) || (((MMActivity)localContext).isFinishing())) {
                  i = 0;
                }
              }
              for (;;)
              {
                if (i == 0)
                {
                  localObject = g.this.yl(this.rTK);
                  if ((((g.c)localObject).rEM != null) && (((g.c)localObject).rSz != null)) {
                    g.this.a(((g.c)localObject).rEM, ((g.c)localObject).rSz, "openMapNavigateMenu:fail");
                  }
                }
                GMTrace.o(19423586942976L, 144717);
                return;
                ((j)localObject).rFK = j;
                ((j)localObject).rUV = true;
                ((j)localObject).rUW = i;
                ((j)localObject).rUY = new j.e(d1, d2);
                ((j)localObject).rUZ = str;
                ((j)localObject).eDN = new WeakReference(localContext);
                ((j)localObject).rVa = local1;
                ((j)localObject).gxh = null;
                if (((j)localObject).gxh == null) {
                  ((j)localObject).bFP();
                }
                for (;;)
                {
                  i = 1;
                  break;
                  ((j)localObject).rVd = new j.2((j)localObject);
                  if (((j)localObject).mCj != null)
                  {
                    ((j)localObject).rVc = new j.3((j)localObject);
                    ((j)localObject).mCj.a(((j)localObject).rUY.latitude, ((j)localObject).rUY.longitude, ((j)localObject).rVc);
                  }
                  com.tencent.mm.sdk.platformtools.af.t(new j.4((j)localObject));
                  ((j)localObject).gxh.b(((j)localObject).rVd);
                  com.tencent.mm.sdk.platformtools.af.i(((j)localObject).rVe, 4000L);
                }
                i = 0;
              }
            }
          });
          GMTrace.o(12204149571584L, 90928);
          return true;
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MsgHandler", "doOpenMapNavigateMenu, parse double, exception = %s");
        a(parami, "openMapNavigateMenu:fail", null);
        GMTrace.o(12204149571584L, 90928);
        return true;
      }
      a(parami, "openMapNavigateMenu:fail", null);
    }
  }
  
  public final void dI(int paramInt1, int paramInt2)
  {
    GMTrace.i(12199049297920L, 90890);
    String str8 = "";
    String str7 = " ";
    Bundle localBundle = null;
    String str3 = str7;
    String str5 = str8;
    String str6;
    String str2;
    try
    {
      if (this.rEM != null)
      {
        str3 = str7;
        str5 = str8;
        localBundle = this.rEM.d(77, null);
      }
      String str1 = str7;
      str6 = str8;
      if (localBundle != null)
      {
        str3 = str7;
        str5 = str8;
        str8 = localBundle.getString("KUrl");
        str3 = str7;
        str5 = str8;
        if (TextUtils.isEmpty(str8))
        {
          str3 = str7;
          str5 = str8;
          w.e("MicroMsg.MsgHandler", "url is empty");
          GMTrace.o(12199049297920L, 90890);
          return;
        }
        str3 = str7;
        str5 = str8;
        str7 = com.tencent.mm.sdk.platformtools.bg.nl(localBundle.getString("KSessionId"));
        str3 = str7;
        str5 = str8;
        w.i("MicroMsg.MsgHandler", "sessionId %s", new Object[] { str7 });
        str3 = str7;
        str5 = str8;
        str1 = str7;
        str6 = str8;
        if (!localBundle.getBoolean("KReportPage", false))
        {
          str3 = str7;
          str5 = str8;
          w.i("MicroMsg.MsgHandler", "not enable report page event control bytes");
          GMTrace.o(12199049297920L, 90890);
          return;
        }
      }
    }
    catch (Exception localException)
    {
      w.e("MicroMsg.MsgHandler", "get sessionId error, %s", new Object[] { localException });
      str6 = str5;
      str2 = str3;
      str5 = pi(str6);
      if (TextUtils.isEmpty(str5))
      {
        w.i("MicroMsg.MsgHandler", "appId is null or empty");
        GMTrace.o(12199049297920L, 90890);
        return;
      }
      w.i("MicroMsg.MsgHandler", "appId %s", new Object[] { str5 });
      int i = this.eLU.mediaObject.type();
      w.i("MicroMsg.MsgHandler", "type %d", new Object[] { Integer.valueOf(i) });
      if (i != 5) {
        break label484;
      }
    }
    long l = com.tencent.mm.sdk.platformtools.bg.Pu();
    w.d("MicroMsg.MsgHandler", "report(%s), clickTimestamp : %d, appID : %s, url : %s, sessionId : %s, actionType : %d, flag : %d", new Object[] { Integer.valueOf(13377), Long.valueOf(l), str5, str6, str2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
    try
    {
      str3 = URLEncoder.encode(com.tencent.mm.sdk.platformtools.bg.nl(str6), "UTF-8");
      com.tencent.mm.plugin.report.service.g.ork.i(13377, new Object[] { Long.valueOf(l), str5, str3, str2, Integer.valueOf(paramInt1), Integer.valueOf(paramInt2) });
      label484:
      GMTrace.o(12199049297920L, 90890);
      return;
    }
    catch (UnsupportedEncodingException localUnsupportedEncodingException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MsgHandler", localUnsupportedEncodingException, "", new Object[0]);
        String str4 = "";
      }
    }
  }
  
  public final boolean dI(i parami)
  {
    GMTrace.i(12204552224768L, 90931);
    String str2 = (String)parami.nSp.get("operationType");
    String str1 = (String)parami.nSp.get("dataUrl");
    k.a(parami.rUT, false, null, "");
    if ((com.tencent.mm.sdk.platformtools.bg.nm(str2)) || (com.tencent.mm.sdk.platformtools.bg.nm(str1)))
    {
      a(parami, "operateMusicPlayer:fail", null);
      GMTrace.o(12204552224768L, 90931);
      return true;
    }
    String str3;
    String str4;
    String str5;
    String str6;
    String str7;
    if (str2.equalsIgnoreCase("play"))
    {
      str2 = (String)parami.nSp.get("title");
      str3 = (String)parami.nSp.get("singer");
      str4 = (String)parami.nSp.get("epname");
      str5 = (String)parami.nSp.get("coverImgUrl");
      str6 = (String)parami.nSp.get("lowbandUrl");
      str7 = (String)parami.nSp.get("webUrl");
      parami.nSp.get("lyric");
      w.i("MicroMsg.MsgHandler", "title : %s, singer : %s, epName : %s, coverImgUrl : %s, dataUrl : %s, lowbandUrl : %s, webUrl : %s, appid : %s", new Object[] { str2, str3, str4, str5, str1, str6, str7, "" });
      if ((com.tencent.mm.sdk.platformtools.bg.nm(str2)) || (com.tencent.mm.sdk.platformtools.bg.nm(str3)) || (com.tencent.mm.sdk.platformtools.bg.nm(str4)) || (com.tencent.mm.sdk.platformtools.bg.nm(str5)) || (com.tencent.mm.sdk.platformtools.bg.nm(str6)) || (com.tencent.mm.sdk.platformtools.bg.nm(str1)) || (com.tencent.mm.sdk.platformtools.bg.nm(str7))) {
        a(parami, "operateMusicPlayer:fail", null);
      }
    }
    for (;;)
    {
      GMTrace.o(12204552224768L, 90931);
      return true;
      com.tencent.mm.at.b.JO();
      com.tencent.mm.at.a.a locala = (com.tencent.mm.at.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.at.a.a.class);
      String str8 = str1.hashCode();
      String str9 = com.tencent.mm.compatible.util.e.ghz;
      StringBuilder localStringBuilder = new StringBuilder();
      com.tencent.mm.y.at.AR();
      com.tencent.mm.at.b.b(locala.a(7, str5, str2, str3, str7, str6, str1, str8, str9, com.tencent.mm.y.c.yU() + str5.hashCode(), str4, ""));
      a(parami, "operateMusicPlayer:ok", null);
      continue;
      int i;
      if (str2.equalsIgnoreCase("resume"))
      {
        if ((com.tencent.mm.at.c.kD(str1)) && (com.tencent.mm.at.b.JR()) && (!com.tencent.mm.at.b.JQ())) {
          com.tencent.mm.at.b.sp();
        }
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label523;
          }
          a(parami, "operateMusicPlayer:ok", null);
          break;
        }
        label523:
        a(parami, "operateMusicPlayer:fail", null);
      }
      else if (str2.equalsIgnoreCase("pause"))
      {
        if ((com.tencent.mm.at.c.kD(str1)) && (com.tencent.mm.at.b.JQ())) {
          com.tencent.mm.at.b.so();
        }
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label589;
          }
          com.tencent.mm.at.b.JP();
          a(parami, "operateMusicPlayer:ok", null);
          break;
        }
        label589:
        a(parami, "operateMusicPlayer:fail", null);
      }
      else if (str2.equalsIgnoreCase("seek"))
      {
        i = com.tencent.mm.sdk.platformtools.bg.getInt(com.tencent.mm.sdk.platformtools.bg.bG(parami.nSp.get("position")), -1);
        if (com.tencent.mm.at.c.kD(str1)) {}
        for (boolean bool = com.tencent.mm.at.b.gG(i * 1000);; bool = false)
        {
          if (!bool) {
            break label670;
          }
          a(parami, "operateMusicPlayer:ok", null);
          break;
        }
        label670:
        a(parami, "operateMusicPlayer:fail", null);
      }
      else if (str2.equalsIgnoreCase("stop"))
      {
        if ((com.tencent.mm.at.c.kD(str1)) && (com.tencent.mm.at.b.JR())) {
          com.tencent.mm.at.b.JO();
        }
        for (i = 1;; i = 0)
        {
          if (i == 0) {
            break label733;
          }
          a(parami, "operateMusicPlayer:ok", null);
          break;
        }
        label733:
        a(parami, "operateMusicPlayer:fail", null);
      }
      else
      {
        a(parami, "operateMusicPlayer:fail", null);
      }
    }
  }
  
  public final boolean dJ(i parami)
  {
    GMTrace.i(12204686442496L, 90932);
    Object localObject1 = (String)parami.nSp.get("dataUrl");
    Object localObject2 = (String)parami.nSp.get("appId");
    k.a(parami.rUT, false, null, (String)localObject2);
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
    {
      a(parami, "getMusicPlayerState:fail_dataUrl_null", null);
      GMTrace.o(12204686442496L, 90932);
      return true;
    }
    w.i("MicroMsg.MsgHandler", "dataUrl : %s, appid : %s", new Object[] { localObject1, localObject2 });
    localObject2 = com.tencent.mm.at.b.JS();
    int j;
    if ((localObject2 != null) && (((apv)localObject2).uFw.equals(localObject1)))
    {
      localObject1 = com.tencent.mm.at.b.JT();
      if (localObject1 == null) {
        break label313;
      }
      j = ((com.tencent.mm.at.d)localObject1).kE;
    }
    for (int i = ((com.tencent.mm.at.d)localObject1).jP;; i = 0)
    {
      if ((localObject1 == null) || (j < 0) || (i < 0))
      {
        a(parami, "getMusicPlayerState:fail", null);
        GMTrace.o(12204686442496L, 90932);
        return true;
      }
      j /= 1000;
      i /= 1000;
      int k = ((com.tencent.mm.at.d)localObject1).mStatus;
      int m = ((com.tencent.mm.at.d)localObject1).gOP;
      localObject1 = new HashMap();
      ((Map)localObject1).put("duration", Integer.valueOf(j));
      ((Map)localObject1).put("currentPosition", Integer.valueOf(i));
      ((Map)localObject1).put("status", Integer.valueOf(k));
      ((Map)localObject1).put("downloadPercent", Integer.valueOf(m));
      a(parami, "getMusicPlayerState:ok", (Map)localObject1);
      for (;;)
      {
        GMTrace.o(12204686442496L, 90932);
        return true;
        a(parami, "getMusicPlayerState:failed_dataUrl_diff", null);
      }
      label313:
      j = -1;
    }
  }
  
  public final boolean dK(i parami)
  {
    GMTrace.i(12204820660224L, 90933);
    Object localObject1 = (String)parami.nSp.get("localId");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
    {
      a(parami, "getLocalImgData:fail_invaild_localid", null);
      GMTrace.o(12204820660224L, 90933);
      return true;
    }
    localObject1 = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk((String)localObject1);
    if ((localObject1 != null) && (((WebViewJSSDKFileItem)localObject1).idL != null))
    {
      localObject1 = MMBitmapFactory.decodeFile(((WebViewJSSDKFileItem)localObject1).idL);
      int i;
      if (localObject1 != null)
      {
        i = 1;
        if (((Bitmap)localObject1).isRecycled()) {
          break label231;
        }
      }
      label231:
      for (int j = 1;; j = 0)
      {
        if ((i & j) == 0) {
          break label236;
        }
        Object localObject2 = new ByteArrayOutputStream();
        ((Bitmap)localObject1).compress(Bitmap.CompressFormat.JPEG, 100, (OutputStream)localObject2);
        Object localObject3 = ((ByteArrayOutputStream)localObject2).toByteArray();
        localObject2 = Base64.encodeToString((byte[])localObject3, 0);
        w.i("MicroMsg.MsgHandler", "rawData lenght = %d, base64 lenght = %d", new Object[] { Integer.valueOf(localObject3.length), Integer.valueOf(((String)localObject2).length()) });
        localObject3 = new HashMap();
        ((HashMap)localObject3).put("localData", localObject2);
        a(parami, "getLocalImgData:ok", (Map)localObject3);
        ((Bitmap)localObject1).recycle();
        GMTrace.o(12204820660224L, 90933);
        return true;
        i = 0;
        break;
      }
    }
    label236:
    a(parami, "getLocalImgData:fail", null);
    GMTrace.o(12204820660224L, 90933);
    return true;
  }
  
  public final boolean dL(i parami)
  {
    int i = 0;
    GMTrace.i(12204954877952L, 90934);
    this.kNw = false;
    Object localObject1 = new Bundle();
    try
    {
      int j = com.tencent.mm.sdk.platformtools.bg.getInt(parami.nSp.get("scene").toString().trim(), 0);
      ((Bundle)localObject1).putInt("scene", j);
      w.i("MicroMsg.MsgHandler", "doExposePreparation scene:%d", new Object[] { Integer.valueOf(j) });
      if (-1 == ((Bundle)localObject1).getInt("scene"))
      {
        a(parami, "doExposePreparation fail:unknown scene", null);
        GMTrace.o(12204954877952L, 90934);
        return true;
      }
      localObject2 = this.rEM.d(73, (Bundle)localObject1);
      localObject1 = new HashMap();
      if (!((Bundle)localObject2).isEmpty()) {
        switch (j)
        {
        case 33: 
          a(parami, "doExposePreparation fail:unknown scene", null);
          GMTrace.o(12204954877952L, 90934);
          return true;
          ((HashMap)localObject1).put("newMsgId", ((Bundle)localObject2).getString("newMsgId"));
        case 1: 
        case 2: 
        case 3: 
        case 4: 
        case 5: 
        case 6: 
        case 7: 
        case 35: 
        case 36: 
        case 37: 
        case 38: 
        case 39: 
        case 45: 
        case 34: 
          for (;;)
          {
            ((HashMap)localObject1).put("username", ((Bundle)localObject2).getString("username"));
            localJSONArray = new JSONArray();
            localObject2 = ((Bundle)localObject2).getStringArrayList("content");
            if (localObject2 == null) {
              break;
            }
            j = ((ArrayList)localObject2).size();
            while (i < j)
            {
              localJSONArray.put(((ArrayList)localObject2).get(i));
              i += 1;
            }
            ((HashMap)localObject1).put("webviewImg", ((Bundle)localObject2).getString("webviewImg"));
            ((HashMap)localObject1).put("webviewHtml", ((Bundle)localObject2).getString("webviewHtml"));
            ((HashMap)localObject1).put("content", ((Bundle)localObject2).getString("content"));
            w.i("MicroMsg.MsgHandler", "content = " + ((Bundle)localObject2).getString("content"));
          }
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        Object localObject2;
        JSONArray localJSONArray;
        w.w("MicroMsg.MsgHandler", "doExposePreparation exception " + localException.getMessage());
        a(parami, "doExposePreparation fail", null);
        continue;
        localException.put("newMsgId", ((Bundle)localObject2).getString("newMsgId"));
        localException.put("msgType", Integer.valueOf(((Bundle)localObject2).getInt("msgType")));
        continue;
        if (localException.get("content") == null) {
          localException.put("content", localJSONArray.toString());
        }
        a(parami, "doExposePreparation ok", localException);
        continue;
        a(parami, "doExposePreparation fail", null);
      }
    }
  }
  
  public final boolean dM(i parami)
  {
    GMTrace.i(12205089095680L, 90935);
    try
    {
      Object localObject = parami.nSp.get("type").toString();
      if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
      {
        if (((String)localObject).equals("send"))
        {
          localObject = new Intent();
          ((Intent)localObject).putExtra("key_type", 1);
          com.tencent.mm.bj.d.b(this.context, "luckymoney", ".ui.LuckyMoneyMyRecordUI", (Intent)localObject);
          a(parami, "openLuckyMoneyHistory:ok", null);
        }
        for (;;)
        {
          GMTrace.o(12205089095680L, 90935);
          return true;
          if (((String)localObject).equals("receive"))
          {
            localObject = new Intent();
            ((Intent)localObject).putExtra("key_type", 2);
            com.tencent.mm.bj.d.b(this.context, "luckymoney", ".ui.LuckyMoneyMyRecordUI", (Intent)localObject);
            a(parami, "openLuckyMoneyHistory:ok", null);
          }
        }
      }
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "doOpenLuckyMoneyHistory error %s", new Object[] { localException });
        a(parami, "openLuckyMoneyHistory:fail", null);
        continue;
        a(parami, "openLuckyMoneyHistory:fail", null);
      }
    }
  }
  
  public final boolean dN(i parami)
  {
    GMTrace.i(16081431298048L, 119816);
    this.kNw = false;
    parami = parami.nSp.get("chat_username").toString();
    Intent localIntent = new Intent();
    localIntent.putExtra("Chat_User", parami);
    localIntent.putExtra("finish_direct", true);
    localIntent.putExtra("expose_edit_mode", true);
    localIntent.setFlags(536870912);
    if ((this.context instanceof MMActivity)) {
      com.tencent.mm.bj.d.a((MMActivity)this.context, ".ui.chatting.En_5b8fbb1e", localIntent, 40, this);
    }
    GMTrace.o(16081431298048L, 119816);
    return true;
  }
  
  public final boolean dO(i parami)
  {
    GMTrace.i(12205223313408L, 90936);
    this.kNw = false;
    Object localObject = parami.nSp.get("scene").toString().trim();
    if (((String)localObject).equals("expose")) {
      if (parami.nSp.get("userData") == null) {}
    }
    for (;;)
    {
      try
      {
        localObject = (JSONObject)new JSONTokener(parami.nSp.get("userData").toString()).nextValue();
        Intent localIntent = new Intent();
        localIntent.putExtra("sns_permission_userName", ((JSONObject)localObject).get("userName").toString());
        localIntent.putExtra("sns_permission_anim", true);
        localIntent.putExtra("sns_permission_block_scene", 1);
        localIntent.setFlags(536870912);
        com.tencent.mm.bj.d.b(this.context, "sns", ".ui.SnsPermissionUI", localIntent);
        a(parami, "openSecurityView ok", null);
        GMTrace.o(12205223313408L, 90936);
        return true;
      }
      catch (JSONException localJSONException)
      {
        w.w("MicroMsg.MsgHandler", "openSecurityView error, userData not in json");
        a(parami, "openSecurityView error,userData not in json", null);
        continue;
      }
      a(parami, "openSecurityView fail, no userData", null);
      continue;
      a(parami, "openSecurityView fail, scene error : " + localJSONException, null);
    }
  }
  
  public final boolean dP(i parami)
  {
    GMTrace.i(12205357531136L, 90937);
    String str2 = pi(Zi());
    String str1 = com.tencent.mm.compatible.d.p.sZ();
    Object localObject = com.tencent.mm.compatible.d.p.ta();
    if ((!com.tencent.mm.sdk.platformtools.bg.nm(str1)) && (!com.tencent.mm.sdk.platformtools.bg.nm(str2)) && (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)))
    {
      str1 = aa.RP(aa.RP(str2 + str1));
      str2 = aa.RP(aa.RP(str2 + (String)localObject));
      localObject = new HashMap();
      ((Map)localObject).put("deviceid", str1);
      ((Map)localObject).put("newDeviceId", str2);
      a(parami, "getOpenDeviceId:ok", (Map)localObject);
    }
    for (;;)
    {
      GMTrace.o(12205357531136L, 90937);
      return true;
      a(parami, "getOpenDeviceId:fail", null);
    }
  }
  
  public final boolean dQ(i parami)
  {
    GMTrace.i(12205491748864L, 90938);
    for (;;)
    {
      try
      {
        Object localObject1 = this.rEM.d(90000, null);
        if (localObject1 != null)
        {
          String[] arrayOfString = ((Bundle)localObject1).getStringArray("webview_get_route_url_list");
          int j = ((Bundle)localObject1).getInt("webview_get_route_url_geta8key_scene");
          if (j != 7) {
            break label307;
          }
          localObject1 = ((Bundle)localObject1).getString("geta8key_username");
          if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) {
            break label307;
          }
          localObject1 = com.tencent.mm.af.f.iK((String)localObject1);
          if (localObject1 == null) {
            break label307;
          }
          localObject1 = ((com.tencent.mm.af.d)localObject1).field_appId;
          if (arrayOfString == null) {
            break label313;
          }
          i = arrayOfString.length;
          w.i("MicroMsg.MsgHandler", "routeUrl length = %d, scene = %d, appid = %s", new Object[] { Integer.valueOf(i), Integer.valueOf(j), localObject1 });
          if ((arrayOfString != null) && (arrayOfString.length > 0))
          {
            HashMap localHashMap = new HashMap();
            JSONArray localJSONArray = new JSONArray();
            int k = arrayOfString.length;
            i = 0;
            if (i < k)
            {
              localJSONArray.put(arrayOfString[i]);
              i += 1;
              continue;
            }
            localHashMap.put("urls", localJSONArray.toString());
            localHashMap.put("scene", Integer.valueOf(j));
            if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1)) {
              localHashMap.put("appid", localObject1);
            }
            a(parami, "getRouteUrl:ok", localHashMap);
            GMTrace.o(12205491748864L, 90938);
            return true;
          }
        }
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MsgHandler", "get routeurl failed ; %s", new Object[] { localException.getMessage() });
        a(parami, "getRouteUrl:fail", null);
        GMTrace.o(12205491748864L, 90938);
        return true;
      }
      label307:
      Object localObject2 = null;
      continue;
      label313:
      int i = -1;
    }
  }
  
  public final boolean dR(i parami)
  {
    GMTrace.i(15129290735616L, 112722);
    w.i("MicroMsg.MsgHandler", "doGetBackgroundAudioState()");
    if (!dU(parami))
    {
      w.e("MicroMsg.MsgHandler", "no permission to do get state");
      a(parami, "getBackgroundAudioState:fail", null);
      GMTrace.o(15129290735616L, 112722);
      return true;
    }
    apv localapv = com.tencent.mm.at.b.JS();
    Object localObject;
    int j;
    if (localapv != null)
    {
      localObject = com.tencent.mm.at.b.JT();
      if (localObject == null) {
        break label450;
      }
      j = ((com.tencent.mm.at.d)localObject).kE;
    }
    for (int i = ((com.tencent.mm.at.d)localObject).jP;; i = 0)
    {
      if ((localObject == null) || (j < 0) || (i < 0))
      {
        w.e("MicroMsg.MsgHandler", "return parameter is invalid");
        a(parami, "getBackgroundAudioState:fail", null);
        GMTrace.o(15129290735616L, 112722);
        return true;
      }
      com.tencent.mm.sdk.b.a.vgX.b(this.rTp);
      j /= 1000;
      int k = i / 1000;
      int m = ((com.tencent.mm.at.d)localObject).mStatus;
      i = ((com.tencent.mm.at.d)localObject).gOP;
      if (j > 0) {}
      for (i = i * j / 100;; i = 0)
      {
        localObject = new HashMap();
        ((Map)localObject).put("duration", Integer.valueOf(j));
        ((Map)localObject).put("currentTime", Integer.valueOf(k));
        if (m == 1)
        {
          j = 0;
          ((Map)localObject).put("paused", Integer.valueOf(j));
          ((Map)localObject).put("src", localapv.uFw);
          ((Map)localObject).put("buffered", Integer.valueOf(i));
          ((Map)localObject).put("title", localapv.uFs);
          ((Map)localObject).put("epname", localapv.uFu);
          ((Map)localObject).put("singer", localapv.uFt);
          ((Map)localObject).put("coverImgUrl", localapv.uFv);
          ((Map)localObject).put("isLive", Integer.valueOf(0));
          ((Map)localObject).put("startTime", Integer.valueOf(localapv.grQ / 1000));
          ((Map)localObject).put("srcId", localapv.gOO);
          w.i("MicroMsg.MsgHandler", "getBackgroundAudioState ok");
          a(parami, "getBackgroundAudioState:ok", (Map)localObject);
        }
        for (;;)
        {
          GMTrace.o(15129290735616L, 112722);
          return true;
          j = 1;
          break;
          w.e("MicroMsg.MsgHandler", "currentWrapper is null");
          a(parami, "getBackgroundAudioState:fail", null);
        }
      }
      label450:
      j = -1;
    }
  }
  
  public final boolean dS(i parami)
  {
    GMTrace.i(15129424953344L, 112723);
    w.i("MicroMsg.MsgHandler", "doSetBackgroundAudioState()");
    com.tencent.mm.sdk.b.a.vgX.b(this.rTp);
    String str1 = (String)parami.nSp.get("appId");
    Object localObject2 = str1;
    if (this.rSC != null)
    {
      localObject1 = str1;
      if (TextUtils.isEmpty(str1)) {
        localObject1 = this.rSC.getString("jsapi_args_appid");
      }
      localObject2 = localObject1;
      if (!TextUtils.isEmpty((CharSequence)localObject1)) {}
    }
    for (Object localObject1 = this.rSL.Ms(Zi());; localObject1 = localObject2)
    {
      w.i("MicroMsg.MsgHandler", "appId:%s", new Object[] { localObject1 });
      k.a(parami.rUT, false, null, (String)localObject1);
      localObject2 = (String)parami.nSp.get("url");
      if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2)) {}
      for (localObject2 = com.tencent.mm.plugin.webview.modelcache.p.Lv((String)localObject2);; localObject2 = null)
      {
        String str3 = (String)parami.nSp.get("src");
        String str4 = (String)parami.nSp.get("lowbandSrc");
        String str5 = (String)parami.nSp.get("title");
        String str6 = (String)parami.nSp.get("epname");
        String str7 = (String)parami.nSp.get("singer");
        str1 = (String)parami.nSp.get("coverImgUrl");
        String str8 = (String)parami.nSp.get("webUrl");
        int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("startTime"), 0);
        String str2 = (String)parami.nSp.get("srcId");
        if (str1 == null) {
          str1 = "";
        }
        for (;;)
        {
          w.i("MicroMsg.MsgHandler", "src : %s, title : %s, singer : %s, coverImgUrl : %s, webUrl : %s, isLive : %b, startTime:%d", new Object[] { str3, str5, str7, str1, str8, Boolean.valueOf(Boolean.parseBoolean((String)parami.nSp.get("isLive"))), Integer.valueOf(i) });
          if ((com.tencent.mm.sdk.platformtools.bg.nm(str3)) || (com.tencent.mm.sdk.platformtools.bg.nm(str5)))
          {
            w.e("MicroMsg.MsgHandler", "setBackgroundAudioState fail, src or title is null");
            a(parami, "setBackgroundAudioState:fail", null);
          }
          for (;;)
          {
            GMTrace.o(15129424953344L, 112723);
            return true;
            com.tencent.mm.at.a.a locala = (com.tencent.mm.at.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.at.a.a.class);
            String str9 = str3.hashCode();
            String str10 = com.tencent.mm.compatible.util.e.ghz;
            StringBuilder localStringBuilder = new StringBuilder();
            com.tencent.mm.y.at.AR();
            localObject1 = locala.a(10, str1, str5, str7, str8, str4, str3, str9, str10, com.tencent.mm.y.c.yU() + str1.hashCode(), str6, (String)localObject1);
            ((apv)localObject1).uFK = ((String)localObject2);
            ((apv)localObject1).grQ = (i * 1000);
            ((apv)localObject1).gOO = str2;
            com.tencent.mm.at.b.b((apv)localObject1);
            w.i("MicroMsg.MsgHandler", "setBackgroundAudioState ok");
            a(parami, "setBackgroundAudioState:ok", null);
          }
        }
      }
    }
  }
  
  public final boolean dT(i parami)
  {
    GMTrace.i(15129559171072L, 112724);
    String str3 = (String)parami.nSp.get("operationType");
    w.i("MicroMsg.MsgHandler", "doOperateBackgroundAudio(), optype:%s", new Object[] { str3 });
    String str2 = (String)parami.nSp.get("appId");
    Object localObject = str2;
    if (this.rSC != null)
    {
      String str1 = str2;
      if (TextUtils.isEmpty(str2)) {
        str1 = this.rSC.getString("jsapi_args_appid");
      }
      localObject = str1;
      if (TextUtils.isEmpty(str1)) {
        localObject = this.rSL.Ms(Zi());
      }
    }
    k.a(parami.rUT, false, null, (String)localObject);
    if (!dU(parami))
    {
      w.e("MicroMsg.MsgHandler", "doOperateBackgroundAudio getMusicPermission is false");
      a(parami, "operateBackgroundAudio:fail", null);
      GMTrace.o(15129559171072L, 112724);
      return true;
    }
    if (com.tencent.mm.sdk.platformtools.bg.nm(str3))
    {
      w.e("MicroMsg.MsgHandler", "doOperateBackgroundAudio optype is empty");
      a(parami, "operateBackgroundAudio:fail", null);
      GMTrace.o(15129559171072L, 112724);
      return true;
    }
    com.tencent.mm.sdk.b.a.vgX.b(this.rTp);
    if (str3.equalsIgnoreCase("play")) {
      if (com.tencent.mm.at.c.JU()) {
        a(parami, "operateBackgroundAudio:ok", null);
      }
    }
    for (;;)
    {
      GMTrace.o(15129559171072L, 112724);
      return true;
      w.e("MicroMsg.MsgHandler", "operateBackgroundAudio play fail");
      a(parami, "operateBackgroundAudio:fail", null);
      continue;
      if (str3.equalsIgnoreCase("resume"))
      {
        if (com.tencent.mm.at.c.JU())
        {
          a(parami, "operateBackgroundAudio:ok", null);
        }
        else
        {
          w.e("MicroMsg.MsgHandler", "operateBackgroundAudio resume fail");
          a(parami, "operateBackgroundAudio:fail", null);
        }
      }
      else if (str3.equalsIgnoreCase("pause"))
      {
        if (com.tencent.mm.at.c.JV())
        {
          com.tencent.mm.at.b.JP();
          a(parami, "operateBackgroundAudio:ok", null);
        }
        else
        {
          w.e("MicroMsg.MsgHandler", "operateBackgroundAudio pause fail");
          a(parami, "operateBackgroundAudio:fail", null);
        }
      }
      else if (str3.equalsIgnoreCase("seek"))
      {
        int i = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("currentTime"), -1);
        w.i("MicroMsg.MsgHandler", "currentTime:%d", new Object[] { Integer.valueOf(i) });
        if (i < 0)
        {
          w.e("MicroMsg.MsgHandler", "currentTime is invalid!");
          a(parami, "operateBackgroundAudio:fail", null);
        }
        else if (com.tencent.mm.at.b.gG(i * 1000))
        {
          a(parami, "operateBackgroundAudio:ok", null);
        }
        else
        {
          w.e("MicroMsg.MsgHandler", "operateBackgroundAudio seek fail");
          a(parami, "operateBackgroundAudio:fail", null);
        }
      }
      else if (str3.equalsIgnoreCase("stop"))
      {
        if (com.tencent.mm.at.c.JW())
        {
          a(parami, "operateBackgroundAudio:ok", null);
        }
        else
        {
          w.e("MicroMsg.MsgHandler", "operateBackgroundAudio stop fail");
          a(parami, "operateBackgroundAudio:fail", null);
        }
      }
      else
      {
        w.e("MicroMsg.MsgHandler", "operateBackgroundAudio fail, invalid opeType");
        a(parami, "operateBackgroundAudio:fail", null);
      }
    }
  }
  
  public final boolean dV(i parami)
  {
    GMTrace.i(19441706336256L, 144852);
    String str1 = as.gnb.B("login_user_name", "");
    String str2 = (String)parami.nSp.get("request_ticket");
    if (!com.tencent.mm.sdk.platformtools.bg.nm(str2))
    {
      parami = new Intent();
      parami.putExtra("Kusername", str1);
      parami.putExtra("Kvertify_key", str2);
      if ((this.context instanceof MMActivity))
      {
        ((MMActivity)this.context).vKC = this;
        com.tencent.mm.bj.d.b(this.context, "voiceprint", ".ui.VoiceLoginUI", parami, 57);
      }
    }
    for (;;)
    {
      GMTrace.o(19441706336256L, 144852);
      return true;
      w.e("MicroMsg.MsgHandler", "requestVoiceLoginVerify, ticket is null");
      a(parami, "requestVoiceLoginVerify:ticket is null", null);
    }
  }
  
  public final boolean dW(i parami)
  {
    GMTrace.i(19441840553984L, 144853);
    localHashMap = new HashMap();
    for (;;)
    {
      try
      {
        A(parami);
        localObject = (String)parami.nSp.get("next_step");
        w.i("MicroMsg.MsgHandler", "next_step: %s", new Object[] { localObject });
        if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
        {
          if (!"auth_again".equals(localObject)) {
            continue;
          }
          if ((this.context != null) && ((this.context instanceof MMActivity)))
          {
            localObject = new Intent();
            if (((MMActivity)this.context).getIntent().hasExtra("VoiceLoginAuthPwd")) {
              ((Intent)localObject).putExtra("VoiceLoginAuthPwd", ((MMActivity)this.context).getIntent().getStringExtra("VoiceLoginAuthPwd"));
            }
            ((MMActivity)this.context).setResult(-1);
          }
        }
      }
      catch (Exception localException)
      {
        Object localObject;
        w.w("MicroMsg.MsgHandler", "doCloseWindow, ex = " + localException.getMessage());
        localHashMap.put("err_code", Integer.valueOf(1));
        localHashMap.put("err_msg", "fail");
        a(parami, "close window and next:fail", localHashMap);
        continue;
        if ((!"go_reg_from_login".equals(localException)) || (this.context == null) || (!(this.context instanceof MMActivity))) {
          continue;
        }
        ((MMActivity)this.context).setResult(-1);
        continue;
      }
      localHashMap.put("err_code", Integer.valueOf(0));
      localHashMap.put("err_msg", "ok");
      a(parami, "close window and next:ok", localHashMap);
      GMTrace.o(19441840553984L, 144853);
      return true;
      if (!"get_reg_verify_code".equals(localObject)) {
        continue;
      }
      if ((this.context != null) && ((this.context instanceof MMActivity))) {
        ((MMActivity)this.context).setResult(-1);
      }
    }
  }
  
  public final boolean dX(i parami)
  {
    GMTrace.i(19441974771712L, 144854);
    String str = (String)parami.nSp.get("username");
    if (com.tencent.mm.sdk.platformtools.bg.nm(str))
    {
      a(parami, "open_biz_chat:param_err", null);
      GMTrace.o(19441974771712L, 144854);
      return true;
    }
    com.tencent.mm.y.at.AR();
    Object localObject = com.tencent.mm.y.c.yK().TE(str);
    if ((localObject == null) || (!((com.tencent.mm.storage.x)localObject).bSA()))
    {
      a(parami, "open_biz_chat:not biz username", null);
      GMTrace.o(19441974771712L, 144854);
      return true;
    }
    if (!com.tencent.mm.l.a.eE(((com.tencent.mm.g.b.af)localObject).field_type))
    {
      a(parami, "open_biz_chat:unfollow", null);
      GMTrace.o(19441974771712L, 144854);
      return true;
    }
    localObject = new Intent();
    ((Intent)localObject).putExtra("Chat_User", str);
    ((Intent)localObject).putExtra("finish_direct", true);
    com.tencent.mm.bj.d.a(this.context, ".ui.chatting.En_5b8fbb1e", (Intent)localObject);
    a(parami, "open_biz_chat:ok", null);
    GMTrace.o(19441974771712L, 144854);
    return true;
  }
  
  public final boolean dY(i parami)
  {
    GMTrace.i(19442108989440L, 144855);
    Object localObject1 = (String)parami.nSp.get("url");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
    {
      w.i("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView, url is null");
      a(parami, "openGameUrlWithExtraWebView:fail", null);
      GMTrace.o(19442108989440L, 144855);
      return true;
    }
    Object localObject2 = (String)parami.nSp.get("statusBarColor");
    if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2)) {}
    for (;;)
    {
      try
      {
        i = Color.parseColor((String)localObject2);
        String str = (String)parami.nSp.get("statusBarStyle");
        localObject2 = new Intent();
        ((Intent)localObject2).putExtra("rawUrl", (String)localObject1);
        ((Intent)localObject2).putExtra("customize_status_bar_color", i);
        ((Intent)localObject2).putExtra("status_bar_style", str);
        localObject1 = new kg();
        ((kg)localObject1).eOy.type = 0;
        ((kg)localObject1).eOy.context = this.context;
        ((kg)localObject1).eOy.intent = ((Intent)localObject2);
        com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
        a(parami, "openGameUrlWithExtraWebView:ok", null);
        GMTrace.o(19442108989440L, 144855);
        return true;
      }
      catch (IllegalArgumentException localIllegalArgumentException)
      {
        w.e("MicroMsg.MsgHandler", "doOpenGameUrlWithExtraWebView: " + localIllegalArgumentException.getMessage());
        a(parami, "openGameUrlWithExtraWebView:fail_invalid_color", null);
        GMTrace.o(19442108989440L, 144855);
        return true;
      }
      int i = 0;
    }
  }
  
  public final boolean dZ(i parami)
  {
    GMTrace.i(19442243207168L, 144856);
    String str1 = pi(Zi());
    if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
    {
      w.i("MicroMsg.MsgHandler", "appId is null");
      a(parami, "setGameData:fail_appid_null", null);
      GMTrace.o(19442243207168L, 144856);
      return true;
    }
    String str2 = (String)parami.nSp.get("key");
    String str3 = (String)parami.nSp.get("value");
    String str4 = (String)parami.nSp.get("weight");
    String str5 = (String)parami.nSp.get("expireTime");
    boolean bool = com.tencent.mm.sdk.platformtools.bg.getBoolean((String)parami.nSp.get("autoClean"), true);
    if ((com.tencent.mm.sdk.platformtools.bg.nm(str2)) || (com.tencent.mm.sdk.platformtools.bg.nm(str3)))
    {
      w.i("MicroMsg.MsgHandler", "key or value is null");
      a(parami, "setGameData:fail_null_key", null);
      GMTrace.o(19442243207168L, 144856);
      return true;
    }
    if (com.tencent.mm.plugin.webview.c.b.bFZ().a(str1, str2, str3, str4, str5, bool)) {
      a(parami, "setGameData:ok", null);
    }
    for (;;)
    {
      GMTrace.o(19442243207168L, 144856);
      return true;
      a(parami, "setGameData:fail_exceed_size", null);
    }
  }
  
  public final boolean da(i parami)
  {
    GMTrace.i(18937450332160L, 141095);
    this.kNw = false;
    Bundle localBundle = new Bundle();
    localBundle.putString("widgetId", (String)parami.nSp.get("widgetId"));
    try
    {
      if (this.rEM != null) {
        this.rEM.m(100001, localBundle);
      }
      a(parami, "openSearchWAWidgetLogView:ok", null);
      GMTrace.o(18937450332160L, 141095);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "doOpenSearchWAWidgetLogView exception" + localRemoteException.getMessage());
      }
    }
  }
  
  public final boolean db(i parami)
  {
    GMTrace.i(17824114278400L, 132800);
    this.kNw = false;
    this.rTm += 1;
    String str = (String)parami.nSp.get("appid") + "_" + this.rTm;
    Object localObject = new JSONObject(parami.nSp);
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_json_data", ((JSONObject)localObject).toString());
    localBundle.putString("fts_key_widget_view_cache_key", str);
    try
    {
      if (this.rEM != null) {
        this.rEM.m(60, localBundle);
      }
      localObject = new HashMap();
      ((HashMap)localObject).put("widgetId", str);
      a(parami, "insertSearchWAWidgetView:ok", (Map)localObject);
      GMTrace.o(17824114278400L, 132800);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + localRemoteException.getMessage());
      }
    }
  }
  
  public final boolean dc(i parami)
  {
    GMTrace.i(20447668207616L, 152347);
    this.kNw = false;
    int i = this.rTn;
    this.rTn = (i + 1);
    Object localObject = i.ac(parami.nSp);
    if (!((Bundle)localObject).containsKey("playerId")) {
      ((Bundle)localObject).putString("playerId", String.valueOf(i));
    }
    for (;;)
    {
      w.i("MicroMsg.MsgHandler", "inserting video player id %d, params %s", new Object[] { Integer.valueOf(i), parami.nSp });
      try
      {
        if (this.rEM != null) {
          this.rEM.m(200000, (Bundle)localObject);
        }
        localObject = new HashMap();
        ((HashMap)localObject).put("playerId", Integer.valueOf(i));
        a(parami, "insertVideoPlayer:ok", (Map)localObject);
        GMTrace.o(20447668207616L, 152347);
        return true;
        i = com.tencent.mm.sdk.platformtools.bg.Sy(((Bundle)localObject).getString("playerId"));
      }
      catch (RemoteException localRemoteException)
      {
        for (;;)
        {
          w.w("MicroMsg.MsgHandler", "doInsertVideoPlayer exception" + localRemoteException.getMessage());
        }
      }
    }
  }
  
  public final boolean dd(i parami)
  {
    GMTrace.i(20447802425344L, 152348);
    this.kNw = false;
    Bundle localBundle = i.ac(parami.nSp);
    w.i("MicroMsg.MsgHandler", "update video player  params %s", new Object[] { parami.nSp });
    try
    {
      if (this.rEM != null) {
        this.rEM.m(200001, localBundle);
      }
      a(parami, "updateVideoPlayer:ok", null);
      GMTrace.o(20447802425344L, 152348);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "doInsertVideoPlayer exception" + localRemoteException.getMessage());
      }
    }
  }
  
  public final boolean de(i parami)
  {
    GMTrace.i(20447936643072L, 152349);
    this.kNw = false;
    Bundle localBundle = i.ac(parami.nSp);
    w.i("MicroMsg.MsgHandler", "remove video player   params %s", new Object[] { parami.nSp });
    try
    {
      if (this.rEM != null) {
        this.rEM.m(200002, localBundle);
      }
      a(parami, "removeVideoPlayer:ok", null);
      GMTrace.o(20447936643072L, 152349);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "doRemoveVideoPlayer exception" + localRemoteException.getMessage());
      }
    }
  }
  
  public final boolean df(i parami)
  {
    GMTrace.i(20448070860800L, 152350);
    this.kNw = false;
    Bundle localBundle = i.ac(parami.nSp);
    w.i("MicroMsg.MsgHandler", "operate video player  params %s", new Object[] { parami.nSp });
    try
    {
      if (this.rEM != null) {
        this.rEM.m(200003, localBundle);
      }
      a(parami, "operateVideoPlayer:ok", null);
      GMTrace.o(20448070860800L, 152350);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "doOperateVideoPlayer exception" + localRemoteException.getMessage());
      }
    }
  }
  
  public final boolean dg(i parami)
  {
    GMTrace.i(17824248496128L, 132801);
    this.kNw = false;
    Object localObject = new JSONObject(parami.nSp);
    String str = (String)parami.nSp.get("widgetId");
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_json_data", ((JSONObject)localObject).toString());
    localBundle.putString("fts_key_widget_view_cache_key", str);
    try
    {
      if (this.rEM != null) {
        this.rEM.m(61, localBundle);
      }
      localObject = new HashMap();
      ((HashMap)localObject).put("widgetId", str);
      a(parami, "removeSearchWAWidgetView:ok", (Map)localObject);
      GMTrace.o(17824248496128L, 132801);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + localRemoteException.getMessage());
      }
    }
  }
  
  public final boolean dh(i parami)
  {
    GMTrace.i(17824382713856L, 132802);
    this.kNw = false;
    Object localObject = new JSONObject(parami.nSp);
    String str = (String)parami.nSp.get("widgetId");
    Bundle localBundle = new Bundle();
    localBundle.putString("fts_key_json_data", ((JSONObject)localObject).toString());
    localBundle.putString("fts_key_widget_view_cache_key", str);
    try
    {
      if (this.rEM != null) {
        this.rEM.m(62, localBundle);
      }
      localObject = new HashMap();
      ((HashMap)localObject).put("widgetId", str);
      a(parami, "updateSearchWAWidgetView:ok", (Map)localObject);
      GMTrace.o(17824382713856L, 132802);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.w("MicroMsg.MsgHandler", "onSearchDataReady exception" + localRemoteException.getMessage());
      }
    }
  }
  
  public final boolean di(i parami)
  {
    GMTrace.i(12200794128384L, 90903);
    this.kNw = false;
    qi localqi = new qi();
    localqi.eUY.context = this.context;
    localqi.eUY.userName = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "userName");
    localqi.eUY.appId = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "appId");
    localqi.eUY.eVa = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "relativeURL");
    localqi.eUY.eVc = com.tencent.mm.plugin.webview.fts.f.c(parami.nSp, "appVersion", 0);
    localqi.eUY.scene = com.tencent.mm.plugin.webview.fts.f.c(parami.nSp, "scene", 1018);
    localqi.eUY.eAv = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "sceneNote");
    if (com.tencent.mm.sdk.platformtools.bg.nm(localqi.eUY.eAv)) {
      localqi.eUY.eAv = com.tencent.mm.compatible.util.p.encode(com.tencent.mm.sdk.platformtools.bg.nl(Zi()));
    }
    localqi.eUY.eIP = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "downloadURL");
    localqi.eUY.eVb = com.tencent.mm.plugin.webview.fts.f.c(parami.nSp, "openType", 0);
    localqi.eUY.eVd = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "checkSumMd5");
    localqi.eUY.eVf = false;
    com.tencent.mm.sdk.b.a.vgX.m(localqi);
    if (localqi.eUZ.eVk) {
      a(parami, "openWeApp:ok", null);
    }
    for (;;)
    {
      GMTrace.o(12200794128384L, 90903);
      return true;
      a(parami, "openWeApp:fail:" + com.tencent.mm.sdk.platformtools.bg.nl(localqi.eUZ.eVl), null);
    }
  }
  
  public final boolean dj(i parami)
  {
    GMTrace.i(12200928346112L, 90904);
    this.kNw = false;
    w.i("MicroMsg.MsgHandler", "doOpenWeAppPage %s", new Object[] { parami.nSp });
    Object localObject1 = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "userName");
    Object localObject2 = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "relativeURL");
    int j = com.tencent.mm.plugin.webview.fts.f.c(parami.nSp, "appVersion", 0);
    final Object localObject3 = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "searchId");
    String str1 = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "docId");
    int k = com.tencent.mm.plugin.webview.fts.f.c(parami.nSp, "position", 1);
    int m = com.tencent.mm.plugin.webview.fts.f.c(parami.nSp, "scene", 1000);
    int i = com.tencent.mm.plugin.webview.fts.f.c(parami.nSp, "debugMode", 0);
    if (com.tencent.mm.plugin.webview.modeltools.f.bCU().gRA != null) {
      i = 1;
    }
    AppBrandStatObject localAppBrandStatObject = new AppBrandStatObject();
    if (m == 201) {
      localAppBrandStatObject.scene = 1006;
    }
    for (;;)
    {
      String str2 = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "statSessionId");
      String str3 = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "statKeywordId");
      String str4 = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "subScene");
      localAppBrandStatObject.eAv = (str2 + ":" + str3 + ":" + (String)localObject3 + ":" + str1 + ":" + k + ":" + str4);
      ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(this.context, (String)localObject1, null, i, j, (String)localObject2, localAppBrandStatObject);
      localObject1 = new com.tencent.mm.ad.b.a();
      ((com.tencent.mm.ad.b.a)localObject1).gtF = new bqz();
      ((com.tencent.mm.ad.b.a)localObject1).gtG = new bra();
      ((com.tencent.mm.ad.b.a)localObject1).uri = "/cgi-bin/mmux-bin/weappsearchadclick";
      ((com.tencent.mm.ad.b.a)localObject1).gtE = 1873;
      localObject1 = ((com.tencent.mm.ad.b.a)localObject1).DA();
      localObject2 = (bqz)((com.tencent.mm.ad.b)localObject1).gtC.gtK;
      ((bqz)localObject2).vaK = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "statSessionId");
      ((bqz)localObject2).vaL = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "statKeywordId");
      ((bqz)localObject2).uBW = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "searchId");
      ((bqz)localObject2).uMU = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "docId");
      ((bqz)localObject2).vaM = com.tencent.mm.plugin.webview.fts.f.c(parami.nSp, "position", 1);
      ((bqz)localObject2).nFA = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "userName");
      ((bqz)localObject2).vaN = com.tencent.mm.plugin.webview.fts.f.c(parami.nSp, "appVersion", 0);
      ((bqz)localObject2).vaO = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "adBuffer");
      ((bqz)localObject2).tOG = m;
      ((bqz)localObject2).vaP = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "clickExtInfo");
      localObject3 = new com.tencent.mm.modelsns.d();
      ((com.tencent.mm.modelsns.d)localObject3).q("20StatSessionId", ((bqz)localObject2).vaK + ",");
      ((com.tencent.mm.modelsns.d)localObject3).q("21KeywordId", ((bqz)localObject2).vaL + ",");
      ((com.tencent.mm.modelsns.d)localObject3).q("22SearchId", ((bqz)localObject2).uBW + ",");
      ((com.tencent.mm.modelsns.d)localObject3).q("23DocId", ((bqz)localObject2).uMU + ",");
      ((com.tencent.mm.modelsns.d)localObject3).q("24Pos", ((bqz)localObject2).vaM + ",");
      ((com.tencent.mm.modelsns.d)localObject3).q("25AppUserName", ((bqz)localObject2).nFA + ",");
      ((com.tencent.mm.modelsns.d)localObject3).q("26AppVersion", ((bqz)localObject2).vaN + ",");
      ((com.tencent.mm.modelsns.d)localObject3).q("27AdBuffer", ((bqz)localObject2).vaO + ",");
      ((com.tencent.mm.modelsns.d)localObject3).q("28AdClickBuffer", ((bqz)localObject2).vaP + ",");
      ((com.tencent.mm.modelsns.d)localObject3).q("29scene", m + ",");
      w.i("MicroMsg.MsgHandler", "doClickReportScene oreh" + ((com.tencent.mm.modelsns.d)localObject3).LT());
      com.tencent.mm.ad.u.a((com.tencent.mm.ad.b)localObject1, new u.a()
      {
        public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, com.tencent.mm.ad.k paramAnonymousk)
        {
          GMTrace.i(19445061779456L, 144877);
          w.d("MicroMsg.MsgHandler", "onGYNetEnd oreh errType:%d errCode:%d msg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
          if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0))
          {
            w.i("MicroMsg.MsgHandler", "report oreh logbuffer(13927)");
            com.tencent.mm.plugin.report.service.g.ork.i(13927, new Object[] { localObject3 });
            com.tencent.mm.plugin.report.service.g.ork.a(457L, 0L, 1L, false);
          }
          GMTrace.o(19445061779456L, 144877);
          return 0;
        }
      });
      a(parami, "openWeAppPage:ok", null);
      GMTrace.o(12200928346112L, 90904);
      return true;
      if (m == 3) {
        localAppBrandStatObject.scene = 1005;
      } else if (m == 16) {
        localAppBrandStatObject.scene = 1042;
      } else if (m == 20) {
        localAppBrandStatObject.scene = 1053;
      } else {
        localAppBrandStatObject.scene = 1000;
      }
    }
  }
  
  public final boolean dk(i parami)
  {
    GMTrace.i(12201062563840L, 90905);
    int i = com.tencent.mm.plugin.webview.fts.f.c(parami.nSp, "logId", 0);
    Object localObject = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "logString");
    w.i("MicroMsg.MsgHandler", "doSearchRailtime oreh id:%d, value:%s, params:%s", new Object[] { Integer.valueOf(i), localObject, parami.nSp });
    aks localaks = new aks();
    localaks.uzM = i;
    localaks.uzU = ((int)(System.currentTimeMillis() / 1000L));
    localaks.jhc = 1;
    localaks.uzN = new com.tencent.mm.bm.b(((String)localObject).getBytes());
    localObject = new com.tencent.mm.ad.b.a();
    ((com.tencent.mm.ad.b.a)localObject).gtF = new com.tencent.mm.protocal.c.bg();
    ((com.tencent.mm.ad.b.a)localObject).gtG = new bh();
    ((com.tencent.mm.ad.b.a)localObject).uri = "/cgi-bin/mmux-bin/adlog";
    ((com.tencent.mm.ad.b.a)localObject).gtE = 1802;
    localObject = ((com.tencent.mm.ad.b.a)localObject).DA();
    com.tencent.mm.protocal.c.bg localbg = (com.tencent.mm.protocal.c.bg)((com.tencent.mm.ad.b)localObject).gtC.gtK;
    akr localakr = new akr();
    localakr.tWD = com.tencent.mm.protocal.d.tJw;
    localakr.tWE = com.tencent.mm.protocal.d.tJv;
    localakr.tWF = com.tencent.mm.protocal.d.tJy;
    localakr.tWG = com.tencent.mm.protocal.d.tJz;
    localakr.tWH = com.tencent.mm.sdk.platformtools.v.bPK();
    localakr.uzT = ((int)(System.currentTimeMillis() / 1000L));
    localbg.tPA = localakr;
    localbg.tPB.add(localaks);
    com.tencent.mm.ad.u.a((com.tencent.mm.ad.b)localObject, new u.a()
    {
      public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, com.tencent.mm.ad.k paramAnonymousk)
      {
        GMTrace.i(19427747692544L, 144748);
        w.d("MicroMsg.MsgHandler", "onGYNetEnd oreh errType:%d errCode:%d msg:%s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
        if ((paramAnonymousInt1 != 0) || (paramAnonymousInt2 != 0)) {
          com.tencent.mm.plugin.report.service.g.ork.a(457L, 1L, 1L, false);
        }
        GMTrace.o(19427747692544L, 144748);
        return 0;
      }
    });
    a(parami, "reportWeAppSearchRealtime:ok", null);
    GMTrace.o(12201062563840L, 90905);
    return true;
  }
  
  public final boolean dl(i parami)
  {
    GMTrace.i(16080223338496L, 119807);
    this.kNw = false;
    Object localObject = com.tencent.mm.plugin.webview.modeltools.f.bCT();
    Map localMap = parami.nSp;
    w.i("MicroMsg.FTS.FTSWebViewLogic", "setSnsObjectDescList");
    parami = com.tencent.mm.plugin.webview.fts.f.o(localMap, "data");
    boolean bool = com.tencent.mm.plugin.webview.fts.f.q(localMap, "append");
    localObject = new com.tencent.mm.plugin.webview.fts.e.a((com.tencent.mm.plugin.webview.fts.e)localObject);
    ((com.tencent.mm.plugin.webview.fts.e.a)localObject).data = parami;
    ((com.tencent.mm.plugin.webview.fts.e.a)localObject).rCy = bool;
    com.tencent.mm.sdk.f.e.post((Runnable)localObject, "append_music_list_task");
    GMTrace.o(16080223338496L, 119807);
    return false;
  }
  
  public final boolean dm(i parami)
  {
    GMTrace.i(16080357556224L, 119808);
    this.kNw = false;
    com.tencent.mm.plugin.webview.fts.e locale = com.tencent.mm.plugin.webview.modeltools.f.bCT();
    parami = parami.nSp;
    w.i("MicroMsg.FTS.FTSWebViewLogic", "clickSnsMusicPlayButton %s", new Object[] { parami.toString() });
    boolean bool1 = com.tencent.mm.plugin.webview.fts.f.q(parami, "isLoop");
    boolean bool2 = com.tencent.mm.plugin.webview.fts.f.q(parami, "needStartMusicUI");
    Object localObject1 = com.tencent.mm.plugin.webview.fts.f.o(parami, "snsid");
    int i = com.tencent.mm.sdk.platformtools.bg.m(parami.get("webview_instance_id"), -1);
    Object localObject2;
    if (com.tencent.mm.at.b.JQ())
    {
      localObject2 = com.tencent.mm.at.b.JS();
      if ((((apv)localObject2).uFq == 9) && (((apv)localObject2).ucY.equals(localObject1)))
      {
        com.tencent.mm.at.b.JO();
        if (!bool2)
        {
          GMTrace.o(16080357556224L, 119808);
          return false;
        }
      }
    }
    if ((bool2) && (locale.rCo != null))
    {
      localObject1 = locale.rCo;
      localObject2 = new jm();
      ((jm)localObject2).eNj.action = 5;
      ((jm)localObject2).eNj.eIB = ((List)localObject1);
      ((jm)localObject2).eNj.eNn = true;
      com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject2);
    }
    parami = com.tencent.mm.plugin.webview.fts.f.o(parami, "objectXmlDesc");
    parami = ((com.tencent.mm.plugin.sns.b.m)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.sns.b.m.class)).lz(parami);
    localObject1 = (com.tencent.mm.at.a.a)com.tencent.mm.kernel.h.h(com.tencent.mm.at.a.a.class);
    com.tencent.mm.y.at.AR();
    parami = ((com.tencent.mm.at.a.a)localObject1).a(com.tencent.mm.y.c.zo(), parami, 9);
    parami.uFI = bool1;
    com.tencent.mm.at.b.a(parami);
    if (bool2)
    {
      parami = new Intent();
      parami.putExtra("key_scene", 4);
      parami.setFlags(268435456);
      com.tencent.mm.bj.d.b(com.tencent.mm.sdk.platformtools.ab.getContext(), "music", ".ui.MusicMainUI", parami);
    }
    locale.rCg.add(Integer.valueOf(i));
    GMTrace.o(16080357556224L, 119808);
    return false;
  }
  
  public final boolean dn(i parami)
  {
    GMTrace.i(16080491773952L, 119809);
    this.kNw = false;
    com.tencent.mm.plugin.webview.modeltools.f.bCT();
    parami = parami.nSp;
    w.i("MicroMsg.FTS.FTSWebViewLogic", "reportSearchStatistics: %s", new Object[] { parami.toString() });
    com.tencent.mm.az.k.o(com.tencent.mm.plugin.webview.fts.f.c(parami, "logId", 0), com.tencent.mm.plugin.webview.fts.f.o(parami, "logString"));
    GMTrace.o(16080491773952L, 119809);
    return false;
  }
  
  public final boolean jdMethod_do(i parami)
  {
    GMTrace.i(16080625991680L, 119810);
    this.kNw = false;
    boolean bool = com.tencent.mm.plugin.webview.modeltools.f.bCT().U(parami.nSp);
    GMTrace.o(16080625991680L, 119810);
    return bool;
  }
  
  public final boolean dp(i parami)
  {
    GMTrace.i(19441303683072L, 144849);
    Object localObject = (String)parami.nSp.get("name");
    String str = (String)parami.nSp.get("arg");
    try
    {
      JSONObject localJSONObject = new JSONObject();
      localJSONObject.put("name", localObject);
      localObject = str;
      if (com.tencent.mm.sdk.platformtools.bg.nm(str)) {
        localObject = "{}";
      }
      localJSONObject.put("arg", new JSONObject((String)localObject));
      localObject = new Bundle();
      ((Bundle)localObject).putString("info", localJSONObject.toString());
      this.rEM.d(139, (Bundle)localObject);
      a(parami, "invokeMiniProgramAPI:ok", null);
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "doInvokeMiniProgramApi: %s", new Object[] { localException });
        a(parami, "invokeMiniProgramAPI:fail", null);
      }
    }
    GMTrace.o(19441303683072L, 144849);
    return true;
  }
  
  public final boolean dq(i parami)
  {
    boolean bool2 = false;
    GMTrace.i(12201867870208L, 90911);
    int i = com.tencent.mm.sdk.platformtools.bg.getInt(com.tencent.mm.sdk.platformtools.bg.bG(parami.nSp.get("id")), 0);
    if (i <= 0)
    {
      a(parami, "kvReport:fail", null);
      GMTrace.o(12201867870208L, 90911);
      return true;
    }
    String str = com.tencent.mm.sdk.platformtools.bg.bG(parami.nSp.get("value"));
    if (com.tencent.mm.sdk.platformtools.bg.getInt(com.tencent.mm.sdk.platformtools.bg.bG(parami.nSp.get("is_important")), 0) > 0) {}
    for (boolean bool1 = true;; bool1 = false)
    {
      if (com.tencent.mm.sdk.platformtools.bg.getInt(com.tencent.mm.sdk.platformtools.bg.bG(parami.nSp.get("is_report_now")), 0) > 0) {
        bool2 = true;
      }
      com.tencent.mm.plugin.report.service.g.ork.a(i, str, bool2, bool1);
      a(parami, "kvReport:ok", null);
      GMTrace.o(12201867870208L, 90911);
      return true;
    }
  }
  
  public final boolean dr(i parami)
  {
    GMTrace.i(16925392371712L, 126104);
    Object localObject = (String)parami.nSp.get("miniProgramAppId");
    if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) {}
    for (int i = ((com.tencent.mm.plugin.appbrand.k.a)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.a.class)).oi((String)localObject);; i = 0)
    {
      localObject = new HashMap(1);
      ((HashMap)localObject).put("reportId", Integer.valueOf(i));
      a(parami, "reportMiniProgramPageData:ok", (Map)localObject);
      GMTrace.o(16925392371712L, 126104);
      return true;
    }
  }
  
  public final boolean ds(i parami)
  {
    int j = 0;
    GMTrace.i(15626298982400L, 116425);
    String str3 = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "targetAppId");
    String str4 = Zi();
    String str2 = pi(str4);
    String str1 = str2;
    if (com.tencent.mm.sdk.platformtools.bg.nm(str2)) {
      str1 = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "referrerAppId");
    }
    if (com.tencent.mm.sdk.platformtools.bg.nm(str3)) {
      a(parami, "launchMiniProgram:fail_invalid_targetAppId", null);
    }
    for (;;)
    {
      GMTrace.o(15626298982400L, 116425);
      return true;
      if (!com.tencent.mm.sdk.platformtools.bg.nm(str1)) {
        break;
      }
      a(parami, "launchMiniProgram:fail_invalid_referrerAppId", null);
    }
    str2 = com.tencent.mm.sdk.platformtools.bg.nl(com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "envVersion"));
    int i = -1;
    switch (str2.hashCode())
    {
    default: 
      switch (i)
      {
      default: 
        label156:
        i = j;
      }
      break;
    }
    for (;;)
    {
      str2 = com.tencent.mm.plugin.webview.fts.f.o(parami.nSp, "path");
      ((com.tencent.mm.plugin.appbrand.k.c)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.c.class)).a(this.context, str4, str1, str3, i, str2);
      a(parami, "launchMiniProgram:ok", null);
      break;
      if (!str2.equals("develop")) {
        break label156;
      }
      i = 0;
      break label156;
      if (!str2.equals("trial")) {
        break label156;
      }
      i = 1;
      break label156;
      i = 1;
      continue;
      i = 2;
    }
  }
  
  public final boolean dt(i parami)
  {
    GMTrace.i(12202136305664L, 90913);
    String str = (String)parami.nSp.get("username");
    if (!com.tencent.mm.sdk.platformtools.bg.nm(str)) {
      ((com.tencent.mm.plugin.appbrand.k.b)com.tencent.mm.kernel.h.h(com.tencent.mm.plugin.appbrand.k.b.class)).po(str);
    }
    a(parami, "forceUpdateWxaAttr:ok", null);
    GMTrace.o(12202136305664L, 90913);
    return true;
  }
  
  public final boolean du(i parami)
  {
    GMTrace.i(12202270523392L, 90914);
    Bundle localBundle = new Bundle(2);
    localBundle.putString("set_page_title_text", (String)parami.nSp.get("title"));
    localBundle.putString("set_page_title_color", (String)parami.nSp.get("color"));
    try
    {
      this.rEM.d(43, localBundle);
      a(parami, "setPageTitle:ok", null);
      GMTrace.o(12202270523392L, 90914);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "doSetPageTitle, exception = %s", new Object[] { localException });
        a(parami, "setPageTitle:fail", null);
      }
    }
  }
  
  @Deprecated
  public final boolean dv(i parami)
  {
    GMTrace.i(12202404741120L, 90915);
    String str = (String)parami.nSp.get("color");
    if (com.tencent.mm.sdk.platformtools.bg.nm(str))
    {
      w.i("MicroMsg.MsgHandler", "doSetStatusBarStyle, color is null or nill");
      a(parami, "setStatusBarStyle:fail", null);
      GMTrace.o(12202404741120L, 90915);
      return true;
    }
    if (str.equalsIgnoreCase("black")) {}
    label180:
    for (int i = 48;; i = -1)
    {
      if (-1 != i) {}
      for (;;)
      {
        try
        {
          this.rEM.d(i, Bundle.EMPTY);
          a(parami, "setStatusBarStyle:ok", null);
          GMTrace.o(12202404741120L, 90915);
          return true;
          if (!str.equalsIgnoreCase("white")) {
            break label180;
          }
          i = 49;
        }
        catch (Exception localException)
        {
          w.e("MicroMsg.MsgHandler", "doSetStatusBarStyle, exception = %s", new Object[] { localException });
          a(parami, "setStatusBarStyle:fail", null);
          continue;
        }
        w.i("MicroMsg.MsgHandler", "doSetStatusBarStyle, color is neither black or white");
        a(parami, "setStatusBarStyle:fail", null);
      }
    }
  }
  
  public final boolean dw(i parami)
  {
    GMTrace.i(12202538958848L, 90916);
    try
    {
      this.rEM.d(45, Bundle.EMPTY);
      a(parami, "enableFullScreen:ok", null);
      GMTrace.o(12202538958848L, 90916);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "doEnableFullScreen, exception = %s", new Object[] { localException });
        a(parami, "enableFullScreen:fail", null);
      }
    }
  }
  
  public final boolean dx(i parami)
  {
    GMTrace.i(12202673176576L, 90917);
    String str2 = (String)parami.nSp.get("left");
    String str1 = (String)parami.nSp.get("right");
    if ((com.tencent.mm.sdk.platformtools.bg.nm(str2)) && (com.tencent.mm.sdk.platformtools.bg.nm(str1)))
    {
      a(parami, "setNavigationBarButtons:fail", null);
      GMTrace.o(12202673176576L, 90917);
      return true;
    }
    Bundle localBundle = new Bundle();
    try
    {
      str2 = new JSONObject(str2).optString("color", "");
      if (!com.tencent.mm.sdk.platformtools.bg.nm(str2)) {
        localBundle.putString("set_navigation_bar_buttons_left_text_color", str2);
      }
      try
      {
        Object localObject = new JSONObject(str1);
        boolean bool = ((JSONObject)localObject).optBoolean("hidden", false);
        str1 = ((JSONObject)localObject).optString("text", "");
        str2 = com.tencent.mm.sdk.platformtools.bg.nl(com.tencent.mm.pluginsdk.ui.tools.s.PL(((JSONObject)localObject).optString("iconData", "")));
        localObject = ((JSONObject)localObject).optString("color", "");
        if (bool) {
          break label268;
        }
        localBundle.putString("set_navigation_bar_buttons_text", str1);
        localBundle.putString("set_navigation_bar_buttons_icon_data", str2);
        localBundle.putString("set_navigation_bar_buttons_text_color", (String)localObject);
      }
      catch (Exception localException2)
      {
        for (;;)
        {
          w.printErrStackTrace("MicroMsg.MsgHandler", localException2, "setNavigationBarButtons opt right ", new Object[0]);
        }
      }
      if (localBundle.size() < 0)
      {
        a(parami, "setNavigationBarButtons:fail_invalid_params", null);
        GMTrace.o(12202673176576L, 90917);
        return true;
      }
    }
    catch (Exception localException3)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MsgHandler", localException3, "setNavigationBarButtons opt left ", new Object[0]);
        continue;
        label268:
        localBundle.putBoolean("set_navigation_bar_buttons_hide_right_button", true);
      }
    }
    try
    {
      this.rEM.d(44, localBundle);
      a(parami, "setNavigationBarButtons:ok", null);
      GMTrace.o(12202673176576L, 90917);
      return true;
    }
    catch (Exception localException1)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MsgHandler", localException1, " setNavigationBarButtons invoke ", new Object[0]);
        a(parami, "setNavigationBarButtons:fail_invoke", null);
      }
    }
  }
  
  public final boolean dy(i parami)
  {
    GMTrace.i(12202807394304L, 90918);
    try
    {
      this.rEM.d(34, Bundle.EMPTY);
      a(parami, "enablePullDownRefresh:ok", null);
      GMTrace.o(12202807394304L, 90918);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.i("MicroMsg.MsgHandler", "doEnablePullDownRefresh, exception = %s", new Object[] { localException });
        a(parami, "enablePullDownRefresh:fail", null);
      }
    }
  }
  
  public final boolean dz(i parami)
  {
    GMTrace.i(12202941612032L, 90919);
    try
    {
      this.rEM.d(35, Bundle.EMPTY);
      a(parami, "startPullDownRefresh:ok", null);
      GMTrace.o(12202941612032L, 90919);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.i("MicroMsg.MsgHandler", "doStartPullDownRefresh, exception = %s", new Object[] { localException });
        a(parami, "startPullDownRefresh:fail", null);
      }
    }
  }
  
  public final void e(i parami, boolean paramBoolean)
  {
    GMTrace.i(12200123039744L, 90898);
    if (parami == null)
    {
      w.e("MicroMsg.MsgHandler", "msg is null when report.");
      GMTrace.o(12200123039744L, 90898);
      return;
    }
    String str = parami.rUU;
    Object localObject5 = parami.rUT;
    ((Map)localObject5).put("isSuccess", Boolean.valueOf(paramBoolean));
    Object localObject4 = this.rEM;
    if (com.tencent.mm.sdk.platformtools.bg.nm(str))
    {
      w.e("MicroMsg.WebViewSecurityUtil", "function name is null or nil.");
      GMTrace.o(12200123039744L, 90898);
      return;
    }
    int i;
    Object localObject3;
    Object localObject1;
    if (localObject4 == null)
    {
      i = 1;
      localObject3 = "";
      localObject1 = "";
      if (i == 0) {
        break label592;
      }
      parami = "";
      break label740;
    }
    for (;;)
    {
      Object localObject2;
      label129:
      label140:
      boolean bool;
      int k;
      int j;
      if (i != 0)
      {
        localObject2 = "";
        localObject4 = parami;
        localObject3 = localObject1;
        localObject1 = localObject2;
        if (localObject5 == null) {
          break label717;
        }
        bool = com.tencent.mm.sdk.platformtools.bg.b((Boolean)((Map)localObject5).get("fromMenu"));
        parami = com.tencent.mm.sdk.platformtools.bg.nl((String)((Map)localObject5).get("keyParam"));
        localObject2 = com.tencent.mm.sdk.platformtools.bg.aq((String)((Map)localObject5).get("appId"), "");
        paramBoolean = com.tencent.mm.sdk.platformtools.bg.b((Boolean)((Map)localObject5).get("isSuccess"));
        k = com.tencent.mm.sdk.platformtools.bg.e((Integer)((Map)localObject5).get("permissionValue"));
        j = com.tencent.mm.sdk.platformtools.bg.e((Integer)((Map)localObject5).get("baseErrorCode"));
        i = com.tencent.mm.sdk.platformtools.bg.e((Integer)((Map)localObject5).get("jsapiErrorCode"));
        label271:
        localObject5 = new StringBuilder();
        ((StringBuilder)localObject5).append(URLEncoder.encode(com.tencent.mm.sdk.platformtools.bg.nl((String)localObject4)));
        ((StringBuilder)localObject5).append(",");
        ((StringBuilder)localObject5).append(URLEncoder.encode(com.tencent.mm.sdk.platformtools.bg.nl((String)localObject3)));
        ((StringBuilder)localObject5).append(",");
        if (localObject1 != null) {
          break label692;
        }
        localObject1 = "";
        label336:
        ((StringBuilder)localObject5).append((String)localObject1);
        ((StringBuilder)localObject5).append(",");
        if (str != null) {
          break label695;
        }
        localObject1 = "";
        label363:
        ((StringBuilder)localObject5).append((String)localObject1);
        ((StringBuilder)localObject5).append(",");
        if (!bool) {
          break label702;
        }
        localObject1 = "1";
        label390:
        ((StringBuilder)localObject5).append((String)localObject1);
        ((StringBuilder)localObject5).append(",");
        localObject1 = parami;
        if (parami == null) {
          localObject1 = "";
        }
        ((StringBuilder)localObject5).append((String)localObject1);
        ((StringBuilder)localObject5).append(",");
        ((StringBuilder)localObject5).append((String)localObject2);
        ((StringBuilder)localObject5).append(",");
        if (!paramBoolean) {
          break label710;
        }
        parami = "1";
        label461:
        ((StringBuilder)localObject5).append(parami);
        ((StringBuilder)localObject5).append(",");
        ((StringBuilder)localObject5).append(k);
        if (!paramBoolean)
        {
          ((StringBuilder)localObject5).append(",");
          ((StringBuilder)localObject5).append(0);
          ((StringBuilder)localObject5).append(",");
          ((StringBuilder)localObject5).append(j);
          ((StringBuilder)localObject5).append(",");
          ((StringBuilder)localObject5).append(i);
        }
        parami = ((StringBuilder)localObject5).toString();
        w.d("MicroMsg.WebViewSecurityUtil", "report: " + parami);
        com.tencent.mm.plugin.report.service.g.ork.A(10417, parami);
        GMTrace.o(12200123039744L, 90898);
        return;
        i = 0;
        break;
        label592:
        localObject2 = localObject1;
      }
      label692:
      label695:
      label702:
      label710:
      label717:
      label740:
      do
      {
        try
        {
          parami = ((com.tencent.mm.plugin.webview.stub.e)localObject4).bDg();
        }
        catch (Exception parami)
        {
          w.w("MicroMsg.WebViewSecurityUtil", "report, ex = " + parami.getMessage());
          localObject4 = localObject3;
          localObject1 = "";
          localObject3 = localObject2;
        }
        localObject2 = localObject1;
        localObject3 = parami;
        localObject1 = ((com.tencent.mm.plugin.webview.stub.e)localObject4).Zi();
        break;
        localObject2 = localObject1;
        localObject3 = parami;
        localObject4 = ((com.tencent.mm.plugin.webview.stub.e)localObject4).bDh();
        localObject2 = localObject4;
        break label129;
        break label140;
        break label336;
        localObject1 = str;
        break label363;
        localObject1 = "0";
        break label390;
        parami = "0";
        break label461;
        i = 0;
        j = 0;
        k = 0;
        paramBoolean = false;
        localObject2 = "";
        parami = null;
        bool = false;
        break label271;
      } while (i == 0);
      localObject1 = "";
    }
  }
  
  /* Error */
  public final boolean e(i parami)
  {
    // Byte code:
    //   0: ldc2_w 10545
    //   3: ldc_w 10547
    //   6: invokestatic 401	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_0
    //   10: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   13: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   16: ldc_w 959
    //   19: invokeinterface 860 2 0
    //   24: checkcast 413	java/lang/String
    //   27: astore 5
    //   29: aload_0
    //   30: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   33: getfield 2050	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:rUT	Ljava/util/Map;
    //   36: aload_0
    //   37: ldc_w 7803
    //   40: invokespecial 2286	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:Mz	(Ljava/lang/String;)Z
    //   43: aload 5
    //   45: aconst_null
    //   46: invokestatic 2055	com/tencent/mm/plugin/webview/ui/tools/jsapi/k:a	(Ljava/util/Map;ZLjava/lang/String;Ljava/lang/String;)V
    //   49: aload 5
    //   51: ifnull +11 -> 62
    //   54: aload 5
    //   56: invokevirtual 1767	java/lang/String:length	()I
    //   59: ifne +35 -> 94
    //   62: ldc_w 614
    //   65: ldc_w 10549
    //   68: invokestatic 1196	com/tencent/mm/sdk/platformtools/w:e	(Ljava/lang/String;Ljava/lang/String;)V
    //   71: aload_0
    //   72: aload_0
    //   73: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   76: ldc_w 10551
    //   79: aconst_null
    //   80: invokevirtual 686	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   83: ldc2_w 10545
    //   86: ldc_w 10547
    //   89: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   92: iconst_1
    //   93: ireturn
    //   94: aload_0
    //   95: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   98: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   101: ldc_w 1049
    //   104: invokeinterface 860 2 0
    //   109: checkcast 413	java/lang/String
    //   112: invokestatic 7791	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:truncate	(Ljava/lang/String;)Ljava/lang/String;
    //   115: pop
    //   116: ldc_w 614
    //   119: new 616	java/lang/StringBuilder
    //   122: dup
    //   123: ldc_w 10553
    //   126: invokespecial 620	java/lang/StringBuilder:<init>	(Ljava/lang/String;)V
    //   129: aload_0
    //   130: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   133: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   136: ldc_w 1043
    //   139: invokeinterface 860 2 0
    //   144: checkcast 413	java/lang/String
    //   147: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: ldc_w 7795
    //   153: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   156: aload_0
    //   157: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   160: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   163: ldc_w 1052
    //   166: invokeinterface 860 2 0
    //   171: checkcast 413	java/lang/String
    //   174: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   177: ldc_w 7797
    //   180: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   183: aload_0
    //   184: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   187: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   190: ldc_w 1049
    //   193: invokeinterface 860 2 0
    //   198: checkcast 413	java/lang/String
    //   201: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   204: invokevirtual 628	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   207: invokestatic 633	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;)V
    //   210: aload_0
    //   211: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   214: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   217: ldc_w 7805
    //   220: invokeinterface 860 2 0
    //   225: checkcast 413	java/lang/String
    //   228: astore 9
    //   230: aload_0
    //   231: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   234: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   237: ldc_w 7807
    //   240: invokeinterface 860 2 0
    //   245: checkcast 413	java/lang/String
    //   248: astore 10
    //   250: aload_0
    //   251: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   254: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   257: ldc_w 959
    //   260: invokeinterface 860 2 0
    //   265: checkcast 413	java/lang/String
    //   268: astore 6
    //   270: aload 6
    //   272: invokestatic 1041	com/tencent/mm/plugin/webview/model/ak:zA	(Ljava/lang/String;)Ljava/lang/String;
    //   275: astore 5
    //   277: ldc_w 614
    //   280: ldc_w 10555
    //   283: iconst_2
    //   284: anewarray 4	java/lang/Object
    //   287: dup
    //   288: iconst_0
    //   289: aload 6
    //   291: aastore
    //   292: dup
    //   293: iconst_1
    //   294: aload 5
    //   296: aastore
    //   297: invokestatic 735	com/tencent/mm/sdk/platformtools/w:i	(Ljava/lang/String;Ljava/lang/String;[Ljava/lang/Object;)V
    //   300: aload_0
    //   301: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   304: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   307: ldc_w 2499
    //   310: invokeinterface 860 2 0
    //   315: checkcast 413	java/lang/String
    //   318: astore 6
    //   320: aload_0
    //   321: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   324: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   327: ldc_w 1049
    //   330: invokeinterface 860 2 0
    //   335: pop
    //   336: aload_0
    //   337: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   340: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   343: ldc_w 1052
    //   346: invokeinterface 860 2 0
    //   351: checkcast 413	java/lang/String
    //   354: astore 7
    //   356: aload_0
    //   357: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   360: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   363: ldc_w 1043
    //   366: invokeinterface 860 2 0
    //   371: checkcast 413	java/lang/String
    //   374: astore 8
    //   376: aload 9
    //   378: invokestatic 7812	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   381: invokevirtual 1082	java/lang/Integer:intValue	()I
    //   384: istore 4
    //   386: aload 10
    //   388: invokestatic 7812	java/lang/Integer:valueOf	(Ljava/lang/String;)Ljava/lang/Integer;
    //   391: pop
    //   392: new 1067	android/content/Intent
    //   395: dup
    //   396: invokespecial 1325	android/content/Intent:<init>	()V
    //   399: astore 9
    //   401: aload 9
    //   403: ldc_w 7816
    //   406: iload 4
    //   408: invokevirtual 1071	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   411: pop
    //   412: aload 9
    //   414: ldc_w 7818
    //   417: iload 4
    //   419: invokevirtual 1071	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   422: pop
    //   423: aload 9
    //   425: ldc_w 7820
    //   428: aload 5
    //   430: invokevirtual 1108	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   433: pop
    //   434: aload 9
    //   436: ldc_w 7822
    //   439: aload 7
    //   441: invokevirtual 1108	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   444: pop
    //   445: aload 9
    //   447: ldc_w 7824
    //   450: aload 8
    //   452: invokevirtual 1108	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   455: pop
    //   456: aload 9
    //   458: ldc_w 7833
    //   461: iconst_1
    //   462: invokevirtual 1071	android/content/Intent:putExtra	(Ljava/lang/String;I)Landroid/content/Intent;
    //   465: pop
    //   466: aload 6
    //   468: invokestatic 869	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   471: ifne +24 -> 495
    //   474: aload 6
    //   476: ldc_w 7835
    //   479: invokevirtual 1016	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   482: ifeq +13 -> 495
    //   485: aload 9
    //   487: ldc_w 7837
    //   490: iconst_1
    //   491: invokevirtual 2157	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   494: pop
    //   495: aload 6
    //   497: invokestatic 869	com/tencent/mm/sdk/platformtools/bg:nm	(Ljava/lang/String;)Z
    //   500: ifne +24 -> 524
    //   503: aload 6
    //   505: ldc_w 7839
    //   508: invokevirtual 1016	java/lang/String:equals	(Ljava/lang/Object;)Z
    //   511: ifeq +13 -> 524
    //   514: aload 9
    //   516: ldc_w 7841
    //   519: iconst_1
    //   520: invokevirtual 2157	android/content/Intent:putExtra	(Ljava/lang/String;Z)Landroid/content/Intent;
    //   523: pop
    //   524: aload_0
    //   525: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   528: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   531: ldc_w 10557
    //   534: invokeinterface 860 2 0
    //   539: checkcast 413	java/lang/String
    //   542: astore 5
    //   544: aload_0
    //   545: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   548: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   551: ldc_w 10559
    //   554: invokeinterface 860 2 0
    //   559: checkcast 413	java/lang/String
    //   562: astore 6
    //   564: aload_0
    //   565: getfield 1086	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rSz	Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;
    //   568: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   571: ldc_w 10561
    //   574: invokeinterface 860 2 0
    //   579: checkcast 413	java/lang/String
    //   582: astore 7
    //   584: aload_1
    //   585: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   588: ldc_w 9360
    //   591: invokeinterface 860 2 0
    //   596: checkcast 413	java/lang/String
    //   599: fconst_0
    //   600: invokestatic 8823	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   603: fstore_2
    //   604: aload_1
    //   605: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   608: ldc_w 9362
    //   611: invokeinterface 860 2 0
    //   616: checkcast 413	java/lang/String
    //   619: fconst_0
    //   620: invokestatic 8823	com/tencent/mm/sdk/platformtools/bg:getFloat	(Ljava/lang/String;F)F
    //   623: fstore_3
    //   624: aload 9
    //   626: ldc_w 10563
    //   629: aload 5
    //   631: invokevirtual 1108	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   634: pop
    //   635: aload 9
    //   637: ldc_w 10565
    //   640: aload 6
    //   642: invokevirtual 1108	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   645: pop
    //   646: aload 9
    //   648: ldc_w 10567
    //   651: aload 7
    //   653: invokevirtual 1108	android/content/Intent:putExtra	(Ljava/lang/String;Ljava/lang/String;)Landroid/content/Intent;
    //   656: pop
    //   657: aload 9
    //   659: ldc_w 10569
    //   662: fload_2
    //   663: invokevirtual 10572	android/content/Intent:putExtra	(Ljava/lang/String;F)Landroid/content/Intent;
    //   666: pop
    //   667: aload 9
    //   669: ldc_w 10574
    //   672: fload_3
    //   673: invokevirtual 10572	android/content/Intent:putExtra	(Ljava/lang/String;F)Landroid/content/Intent;
    //   676: pop
    //   677: aload_0
    //   678: getfield 753	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:context	Landroid/content/Context;
    //   681: ldc_w 3747
    //   684: ldc_w 7895
    //   687: aload 9
    //   689: invokestatic 1101	com/tencent/mm/bj/d:b	(Landroid/content/Context;Ljava/lang/String;Ljava/lang/String;Landroid/content/Intent;)V
    //   692: aload_0
    //   693: iconst_0
    //   694: putfield 475	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:kNw	Z
    //   697: ldc2_w 10545
    //   700: ldc_w 10547
    //   703: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   706: iconst_0
    //   707: ireturn
    //   708: astore_1
    //   709: ldc2_w 10545
    //   712: ldc_w 10547
    //   715: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   718: iconst_1
    //   719: ireturn
    //   720: astore 9
    //   722: iconst_m1
    //   723: istore 4
    //   725: goto -333 -> 392
    //   728: astore 9
    //   730: goto -338 -> 392
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	733	0	this	g
    //   0	733	1	parami	i
    //   603	60	2	f1	float
    //   623	50	3	f2	float
    //   384	340	4	i	int
    //   27	603	5	str1	String
    //   268	373	6	str2	String
    //   354	298	7	str3	String
    //   374	77	8	str4	String
    //   228	460	9	localObject	Object
    //   720	1	9	localException1	Exception
    //   728	1	9	localException2	Exception
    //   248	139	10	str5	String
    // Exception table:
    //   from	to	target	type
    //   9	49	708	java/lang/Exception
    //   54	62	708	java/lang/Exception
    //   62	83	708	java/lang/Exception
    //   94	376	708	java/lang/Exception
    //   392	495	708	java/lang/Exception
    //   495	524	708	java/lang/Exception
    //   524	697	708	java/lang/Exception
    //   376	386	720	java/lang/Exception
    //   386	392	728	java/lang/Exception
  }
  
  public final boolean e(final i parami, final JsapiPermissionWrapper paramJsapiPermissionWrapper)
  {
    GMTrace.i(18149189615616L, 135222);
    String str1 = (String)parami.nSp.get("appid");
    String str2 = (String)parami.nSp.get("extInfo");
    if (!am.isNetworkConnected(this.context))
    {
      Toast.makeText(this.context, this.context.getString(R.l.dzS), 0).show();
      a(parami, "doResumeDownloadTask:fail_network_not_connected", null);
      w.i("MicroMsg.MsgHandler", "doResumeDownloadTask fail, network not ready");
      r(str1, com.tencent.mm.plugin.downloader.model.d.keW, str2);
      GMTrace.o(18149189615616L, 135222);
      return true;
    }
    if (am.isWifi(this.context)) {
      ai(parami);
    }
    for (;;)
    {
      GMTrace.o(18149189615616L, 135222);
      return true;
      com.tencent.mm.ui.base.h.a(this.context, this.context.getString(R.l.ejO), this.context.getString(R.l.ejP), this.context.getString(R.l.ejJ), this.context.getString(R.l.cSk), false, new DialogInterface.OnClickListener()new DialogInterface.OnClickListener
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19449088311296L, 144907);
          g.this.ai(parami);
          paramAnonymousDialogInterface.dismiss();
          GMTrace.o(19449088311296L, 144907);
        }
      }, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19431103135744L, 144773);
          paramAnonymousDialogInterface.dismiss();
          g.this.a(parami, "doResumeDownloadTask:fail_network_not_wifi", null);
          GMTrace.o(19431103135744L, 144773);
        }
      }, R.e.aPp);
    }
  }
  
  public final boolean ea(i parami)
  {
    GMTrace.i(19442377424896L, 144857);
    Object localObject1 = pi(Zi());
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject1))
    {
      w.i("MicroMsg.MsgHandler", "appId is null");
      a(parami, "getGameData:fail", null);
      GMTrace.o(19442377424896L, 144857);
      return true;
    }
    Object localObject2 = (String)parami.nSp.get("key");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2))
    {
      w.i("MicroMsg.MsgHandler", "key is null");
      a(parami, "getGameData:fail", null);
      GMTrace.o(19442377424896L, 144857);
      return true;
    }
    localObject1 = com.tencent.mm.plugin.webview.c.b.bFZ().er((String)localObject1, (String)localObject2);
    if (!com.tencent.mm.sdk.platformtools.bg.nm(((com.tencent.mm.plugin.webview.c.a)localObject1).field_value))
    {
      localObject2 = new HashMap();
      ((Map)localObject2).put("value", ((com.tencent.mm.plugin.webview.c.a)localObject1).field_value);
      ((Map)localObject2).put("weight", ((com.tencent.mm.plugin.webview.c.a)localObject1).field_weight);
      ((Map)localObject2).put("expireTime", Long.valueOf(((com.tencent.mm.plugin.webview.c.a)localObject1).field_expireTime - System.currentTimeMillis() / 1000L));
      a(parami, "getGameData:ok", (Map)localObject2);
    }
    for (;;)
    {
      GMTrace.o(19442377424896L, 144857);
      return true;
      a(parami, "getGameData:ok", null);
    }
  }
  
  public final boolean eb(i parami)
  {
    GMTrace.i(19442511642624L, 144858);
    String str = pi(Zi());
    if (com.tencent.mm.sdk.platformtools.bg.nm(str))
    {
      w.i("MicroMsg.MsgHandler", "appId is null");
      a(parami, "clearData:fail", null);
      GMTrace.o(19442511642624L, 144858);
      return true;
    }
    Object localObject = (String)parami.nSp.get("keys");
    boolean bool = com.tencent.mm.sdk.platformtools.bg.getBoolean((String)parami.nSp.get("clearAllData"), false);
    if (!com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) {}
    for (;;)
    {
      try
      {
        localObject = new JSONArray((String)localObject);
        com.tencent.mm.plugin.webview.c.b.bFZ().b(str, (JSONArray)localObject);
        a(parami, "clearGameData:ok", null);
        GMTrace.o(19442511642624L, 144858);
        return true;
      }
      catch (Exception localException)
      {
        w.e("MicroMsg.MsgHandler", "doClearData: " + localException.getMessage());
        a(parami, "clearGameData:fail", null);
        continue;
      }
      if (bool)
      {
        com.tencent.mm.plugin.webview.c.b.bFZ().MF(localException);
        a(parami, "clearGameData:ok", null);
      }
      else
      {
        w.i("MicroMsg.MsgHandler", "key is null");
        a(parami, "clearGameData:fail", null);
      }
    }
  }
  
  public final void eq(final String paramString1, final String paramString2)
  {
    GMTrace.i(18149458051072L, 135224);
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19424392249344L, 144723);
        Intent localIntent = new Intent();
        localIntent.putExtra("scene_from", 4);
        localIntent.putExtra("Select_Conv_Type", 3);
        localIntent.putExtra("select_is_ret", true);
        localIntent.putExtra("mutil_select_is_ret", true);
        localIntent.putExtra("Retr_Msg_Type", 5);
        localIntent.putExtra("Retr_Msg_thumb_path", paramString1);
        localIntent.putExtra("emoji_activity_id", paramString2);
        localIntent.putExtra("MMActivity.OverrideEnterAnimation", R.a.aLs);
        if ((g.this.context instanceof MMActivity)) {
          com.tencent.mm.bj.d.a((MMActivity)g.this.context, ".ui.transmit.SelectConversationUI", localIntent, 52, g.this);
        }
        GMTrace.o(19424392249344L, 144723);
      }
    });
    GMTrace.o(18149458051072L, 135224);
  }
  
  public final boolean f(i parami)
  {
    int i = 0;
    GMTrace.i(12182137864192L, 90764);
    try
    {
      f1 = com.tencent.mm.sdk.platformtools.bg.getFloat((String)parami.nSp.get("latitude"), 0.0F);
      f2 = com.tencent.mm.sdk.platformtools.bg.getFloat((String)parami.nSp.get("longitude"), 0.0F);
      str1 = sy((String)parami.nSp.get("name"));
      str2 = sy((String)parami.nSp.get("address"));
      str3 = sy((String)parami.nSp.get("infoUrl"));
    }
    catch (Exception parami)
    {
      for (;;)
      {
        float f1;
        float f2;
        String str1;
        String str2;
        String str3;
        int j;
        label137:
        a(this.rSz, "open_location:invalid_coordinate", null);
      }
    }
    try
    {
      j = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("scale"), 0);
      i = j;
    }
    catch (Exception parami)
    {
      break label137;
    }
    parami = new Intent();
    if (com.tencent.mm.sdk.platformtools.bg.getInt((String)this.rSz.nSp.get("webview_scene"), 0) == 25)
    {
      parami.putExtra("map_view_type", 9);
      parami.putExtra("kPoi_url", str3);
    }
    for (;;)
    {
      parami.putExtra("kwebmap_slat", f1);
      parami.putExtra("kwebmap_lng", f2);
      if (i > 0) {
        parami.putExtra("kwebmap_scale", i);
      }
      parami.putExtra("kPoiName", str1);
      parami.putExtra("Kwebmap_locaion", str2);
      com.tencent.mm.bj.d.b(this.context, "location", ".ui.RedirectUI", parami);
      a(this.rSz, "open_location:ok", null);
      GMTrace.o(12182137864192L, 90764);
      return true;
      parami.putExtra("map_view_type", 7);
    }
  }
  
  public final boolean f(final i parami, final JsapiPermissionWrapper paramJsapiPermissionWrapper)
  {
    GMTrace.i(12186969702400L, 90800);
    String str1 = (String)parami.nSp.get("verifyAppId");
    String str2 = (String)parami.nSp.get("verifySignature");
    String str3 = (String)parami.nSp.get("verifyNonceStr");
    String str4 = (String)parami.nSp.get("verifyTimestamp");
    String str5 = (String)parami.nSp.get("verifySignType");
    Object localObject1 = (String)parami.nSp.get("verifyJsApiList");
    w.i("MicroMsg.MsgHandler", "doPreVerifyJSAPI, appid : %s, %s, %s, %s, %s", new Object[] { str1, str2, str3, str4, str5 });
    k.a(parami.rUT, false, null, str1);
    LinkedList localLinkedList = new LinkedList();
    for (;;)
    {
      int i;
      String str6;
      try
      {
        localObject1 = new JSONArray((String)localObject1);
        w.i("MicroMsg.MsgHandler", "doPreVerifyJSAPI jsItem length %s", new Object[] { Integer.valueOf(((JSONArray)localObject1).length()) });
        if (((JSONArray)localObject1).length() == 0)
        {
          a(parami, "checkJsApi:param is empty", null);
          GMTrace.o(12186969702400L, 90800);
          return true;
        }
        i = 0;
        if (i < ((JSONArray)localObject1).length())
        {
          localObject2 = ((JSONArray)localObject1).getString(i);
          if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject2)) {
            break label543;
          }
          localLinkedList.add(localObject2);
          break label543;
        }
        str6 = this.rEM.Zi();
        j = 0;
        localObject1 = "";
        i = j;
      }
      catch (Exception paramJsapiPermissionWrapper)
      {
        Object localObject2;
        int j;
        w.w("MicroMsg.MsgHandler", "exception occur " + paramJsapiPermissionWrapper.getMessage());
        a(parami, "pre_verify_jsapi:fail", null);
        GMTrace.o(12186969702400L, 90800);
        return true;
      }
      try
      {
        localObject2 = this.rEM.d(140, null);
        i = j;
        j = ((Bundle)localObject2).getInt("key_webview_preverify_info_scene", 0);
        i = j;
        localObject2 = ((Bundle)localObject2).getString("key_webview_preverify_info_source_appid", "");
        localObject1 = localObject2;
        i = j;
      }
      catch (Exception localException)
      {
        w.e("TAG", "doPreVerifyJSAPI: %s", new Object[] { localException });
        continue;
        com.tencent.mm.y.at.wS().a(1093, localException);
        parami = new com.tencent.mm.plugin.webview.model.m(parami, str6, str1, localLinkedList, str4, str3, str2, str5, i, (String)localObject1, localException.rEk);
        com.tencent.mm.y.at.wS().a(parami, 0);
        continue;
      }
      localObject2 = this.rSL;
      parami = new c.c()
      {
        public final void a(c.a.a paramAnonymousa, String paramAnonymousString, LinkedList<bnd> paramAnonymousLinkedList, int paramAnonymousInt1, int paramAnonymousInt2)
        {
          GMTrace.i(19432445313024L, 144783);
          if ((paramAnonymousa == c.a.a.rRM) && (paramJsapiPermissionWrapper.tJT != null))
          {
            g.this.rSP = com.tencent.mm.sdk.platformtools.bg.Pu();
            paramAnonymousInt2 = 0;
            paramAnonymousInt1 = paramAnonymousInt2;
            if (paramAnonymousLinkedList != null)
            {
              paramAnonymousInt1 = paramAnonymousInt2;
              if (paramAnonymousLinkedList.size() > 0)
              {
                paramAnonymousa = paramAnonymousLinkedList.iterator();
                paramAnonymousInt1 = 0;
                while (paramAnonymousa.hasNext())
                {
                  paramAnonymousString = (bnd)paramAnonymousa.next();
                  paramAnonymousLinkedList = com.tencent.mm.protocal.c.Qc(com.tencent.mm.sdk.platformtools.bg.nl(paramAnonymousString.uxW));
                  if (paramAnonymousLinkedList != null)
                  {
                    if (paramJsapiPermissionWrapper.zN(paramAnonymousLinkedList.bNV()) == paramAnonymousString.state) {
                      break label433;
                    }
                    paramJsapiPermissionWrapper.a(paramAnonymousLinkedList.bNV(), (byte)paramAnonymousString.state);
                    paramAnonymousInt1 = 1;
                  }
                }
              }
            }
          }
          label433:
          for (;;)
          {
            break;
            if ((paramAnonymousInt1 != 0) && (g.this.rEM != null))
            {
              paramAnonymousa = new Bundle();
              paramAnonymousa.putByteArray("jsapi_control_bytes", paramJsapiPermissionWrapper.tJT);
            }
            for (;;)
            {
              try
              {
                if (paramJsapiPermissionWrapper.tJT != null) {
                  continue;
                }
                paramAnonymousInt1 = 0;
                w.i("MicroMsg.MsgHandler", "doPreVerifyJSAPI update controlBytes, %d, jsPerm = %s", new Object[] { Integer.valueOf(paramAnonymousInt1), paramJsapiPermissionWrapper });
                g.this.rEM.m(1006, paramAnonymousa);
              }
              catch (Exception paramAnonymousa)
              {
                w.e("MicroMsg.MsgHandler", "doPreVerifyJSAPI remote ex, %s", new Object[] { paramAnonymousa.getMessage() });
                continue;
              }
              g.this.a(parami, "pre_verify_jsapi:ok", null);
              GMTrace.o(19432445313024L, 144783);
              return;
              paramAnonymousInt1 = paramJsapiPermissionWrapper.tJT.length;
            }
            if (g.this.rEM != null)
            {
              paramAnonymousa = new Bundle();
              paramAnonymousa.putByteArray("jsapi_control_bytes", paramJsapiPermissionWrapper.tJT);
            }
            try
            {
              w.e("MicroMsg.MsgHandler", "doPreVerifyJSAPI fail, update controlBytes with default permission");
              g.this.rEM.m(1006, paramAnonymousa);
              if (com.tencent.mm.sdk.platformtools.bg.nm(paramAnonymousString))
              {
                g.this.a(parami, "pre_verify_jsapi:fail", null);
                GMTrace.o(19432445313024L, 144783);
                return;
              }
            }
            catch (Exception paramAnonymousa)
            {
              for (;;)
              {
                w.e("MicroMsg.MsgHandler", "doPreVerifyJSAPI remote ex, %s", new Object[] { paramAnonymousa.getMessage() });
              }
              g.this.a(parami, "pre_verify_jsapi:fail_" + paramAnonymousString, null);
              GMTrace.o(19432445313024L, 144783);
              return;
            }
          }
        }
        
        public final boolean bFm()
        {
          GMTrace.i(19432579530752L, 144784);
          boolean bool = this.rRR;
          GMTrace.o(19432579530752L, 144784);
          return bool;
        }
      };
      if ((com.tencent.mm.sdk.platformtools.bg.nm(str1)) || (localLinkedList.size() <= 0))
      {
        w.e("MicroMsg.webview.JSVerifyHelper", "handlePreVerify wrong args, %s", new Object[] { str1 });
        parami.a(c.a.a.rRN, null, null, 0, 0);
        GMTrace.o(12186969702400L, 90800);
        return true;
      }
      label543:
      i += 1;
    }
  }
  
  public final boolean g(i parami)
  {
    GMTrace.i(12182406299648L, 90766);
    try
    {
      parami = (String)parami.nSp.get("bid");
      Intent localIntent = new Intent();
      localIntent.putExtra("sns_bid", parami);
      com.tencent.mm.bj.d.b(this.context, "sns", ".ui.ClassifyTimeLineUI", localIntent);
      a(this.rSz, "open_timeline_checkin_list:ok", null);
      GMTrace.o(12182406299648L, 90766);
      return true;
    }
    catch (Exception parami)
    {
      for (;;) {}
    }
  }
  
  public final boolean i(i parami)
  {
    GMTrace.i(18148652744704L, 135218);
    this.kNw = false;
    Object localObject = (String)parami.nSp.get("phoneNumber");
    w.d("MicroMsg.MsgHandler", "jsapi makePhoneCall num %s", new Object[] { localObject });
    if (!TextUtils.isEmpty((CharSequence)localObject))
    {
      localObject = new Intent("android.intent.action.DIAL", Uri.parse("tel:" + (String)localObject));
      ((Intent)localObject).addFlags(268435456);
      if (com.tencent.mm.sdk.platformtools.bg.j(this.context, (Intent)localObject)) {
        this.context.startActivity((Intent)localObject);
      }
      a(parami, "makePhoneCall:succ", null);
    }
    for (;;)
    {
      GMTrace.o(18148652744704L, 135218);
      return true;
      a(parami, "makePhoneCall:fail", null);
    }
  }
  
  public final boolean j(i parami)
  {
    GMTrace.i(16924989718528L, 126101);
    this.kNw = false;
    parami = (String)parami.nSp.get("selected_user_name");
    Intent localIntent = new Intent();
    localIntent.putExtra("list_type", 15);
    localIntent.putExtra("already_select_contact", parami);
    localIntent.putExtra("titile", this.context.getString(R.l.cRp));
    localIntent.putExtra("list_attr", com.tencent.mm.ui.contact.s.q(new int[] { 16384, 1, 4, 1048576 }));
    if ((this.context instanceof MMActivity)) {
      com.tencent.mm.bj.d.a((MMActivity)this.context, ".ui.contact.SelectContactUI", localIntent, 54, this);
    }
    GMTrace.o(16924989718528L, 126101);
    return true;
  }
  
  public final boolean k(i parami)
  {
    int i = 0;
    GMTrace.i(19439827288064L, 144838);
    this.kNw = false;
    Object localObject1 = parami.nSp.get("list").toString();
    parami = new LinkedList();
    for (;;)
    {
      try
      {
        localObject1 = new JSONArray((String)localObject1);
        if (i < ((JSONArray)localObject1).length())
        {
          Object localObject3 = ((JSONArray)localObject1).optJSONObject(i);
          if (localObject3 == null) {
            break label277;
          }
          aqx localaqx = new aqx();
          localaqx.uHe = ((JSONObject)localObject3).optInt("cmdId");
          localObject3 = ((JSONObject)localObject3).optString("cmdBuffer");
          if (!TextUtils.isEmpty((CharSequence)localObject3))
          {
            localaqx.uHf = new com.tencent.mm.bm.b(((String)localObject3).getBytes());
            parami.add(localaqx);
          }
          else
          {
            w.e("MicroMsg.MsgHandler", "doUxSearchOpLog cmdId " + localaqx.uHe + " , cmdBuffer is empty");
          }
        }
      }
      catch (JSONException localJSONException)
      {
        w.e("MicroMsg.MsgHandler", com.tencent.mm.sdk.platformtools.bg.f(localJSONException));
        if (!parami.isEmpty())
        {
          Object localObject2 = new com.tencent.mm.ad.b.a();
          ((com.tencent.mm.ad.b.a)localObject2).gtF = new bqx();
          ((com.tencent.mm.ad.b.a)localObject2).gtG = new bqy();
          ((com.tencent.mm.ad.b.a)localObject2).uri = "/cgi-bin/mmux-bin/wxaapp/wxaapp_opsearch";
          ((com.tencent.mm.ad.b.a)localObject2).gtE = 1865;
          localObject2 = ((com.tencent.mm.ad.b.a)localObject2).DA();
          ((bqx)((com.tencent.mm.ad.b)localObject2).gtC.gtK).vaJ = parami;
          com.tencent.mm.ad.u.a((com.tencent.mm.ad.b)localObject2, new u.a()
          {
            public final int a(int paramAnonymousInt1, int paramAnonymousInt2, String paramAnonymousString, com.tencent.mm.ad.b paramAnonymousb, com.tencent.mm.ad.k paramAnonymousk)
            {
              GMTrace.i(19453249060864L, 144938);
              w.i("MicroMsg.MsgHandler", "doUxSearchOpLog rsp errType %d,errCode %d,errMsg %s", new Object[] { Integer.valueOf(paramAnonymousInt1), Integer.valueOf(paramAnonymousInt2), paramAnonymousString });
              GMTrace.o(19453249060864L, 144938);
              return 0;
            }
          });
        }
        GMTrace.o(19439827288064L, 144838);
        return true;
      }
      label277:
      i += 1;
    }
  }
  
  public final boolean l(i parami)
  {
    GMTrace.i(19439961505792L, 144839);
    this.kNw = false;
    Bundle localBundle;
    if (parami.nSp.containsKey("actionSheetId"))
    {
      int i = com.tencent.mm.sdk.platformtools.bg.Sy((String)parami.nSp.get("actionSheetId"));
      localBundle = new Bundle();
      localBundle.putInt("actionSheetId", i);
    }
    try
    {
      this.rEM.m(134, localBundle);
      a(parami, "", null);
      GMTrace.o(19439961505792L, 144839);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
      }
    }
  }
  
  public final boolean m(i parami)
  {
    GMTrace.i(19440095723520L, 144840);
    this.kNw = false;
    Bundle localBundle = new Bundle();
    if (parami.nSp.containsKey("title")) {
      localBundle.putString("title", (String)parami.nSp.get("title"));
    }
    if (parami.nSp.containsKey("desc")) {
      localBundle.putString("desc", (String)parami.nSp.get("desc"));
    }
    if (parami.nSp.containsKey("items")) {
      localBundle.putString("items", (String)parami.nSp.get("items"));
    }
    try
    {
      this.rEM.m(133, localBundle);
      HashMap localHashMap = new HashMap();
      localHashMap.put("actionSheetId", Integer.valueOf(localBundle.getInt("actionSheetId")));
      a(parami, parami.rUU + ":ok", localHashMap);
      GMTrace.o(19440095723520L, 144840);
      return true;
    }
    catch (RemoteException localRemoteException)
    {
      for (;;)
      {
        w.printErrStackTrace("MicroMsg.MsgHandler", localRemoteException, "", new Object[0]);
      }
    }
  }
  
  public final boolean n(i parami)
  {
    GMTrace.i(18148786962432L, 135219);
    com.tencent.mm.pluginsdk.wallet.f localf = new com.tencent.mm.pluginsdk.wallet.f(parami.nSp);
    Intent localIntent = new Intent();
    localIntent.putExtra("appId", com.tencent.mm.sdk.platformtools.bg.aq((String)parami.nSp.get("appid"), ""));
    localIntent.putExtra("timeStamp", localf.timeStamp);
    localIntent.putExtra("nonceStr", localf.nonceStr);
    localIntent.putExtra("packageExt", localf.packageExt);
    localIntent.putExtra("signtype", localf.signType);
    localIntent.putExtra("paySignature", localf.ePJ);
    localIntent.putExtra("url", localf.url);
    localIntent.putExtra("reset_pwd_token", localf.tIN);
    ((MMActivity)this.context).vKC = this;
    com.tencent.mm.bj.d.b(this.context, "wallet", ".pwd.ui.WalletResetPwdAdapterUI", localIntent, 55);
    GMTrace.o(18148786962432L, 135219);
    return true;
  }
  
  public final boolean o(i parami)
  {
    GMTrace.i(16066130477056L, 119702);
    String str = (String)parami.nSp.get("username");
    My((String)parami.nSp.get("scene"));
    boolean bool = MB(str);
    GMTrace.o(16066130477056L, 119702);
    return bool;
  }
  
  public final boolean p(final i parami)
  {
    GMTrace.i(12183480041472L, 90774);
    if (!com.tencent.mm.y.q.Al())
    {
      w.e("MicroMsg.MsgHandler", "doWeibo fail, qq not binded");
      localObject1 = com.tencent.mm.ui.base.h.a(this.context, R.l.ell, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19430566264832L, 144769);
          com.tencent.mm.plugin.webview.a.a.hnH.h(new Intent(), g.this.context);
          GMTrace.o(19430566264832L, 144769);
        }
      }, null);
      ((com.tencent.mm.ui.base.i)localObject1).setCancelable(false);
      ((com.tencent.mm.ui.base.i)localObject1).setOnDismissListener(new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(19443585384448L, 144866);
          g.this.a(parami, "share_weibo:not_bind_qq", null);
          GMTrace.o(19443585384448L, 144866);
        }
      });
      GMTrace.o(12183480041472L, 90774);
      return true;
    }
    com.tencent.mm.y.at.AR();
    Object localObject1 = com.tencent.mm.y.c.yS().CB("@t.qq.com");
    if ((localObject1 == null) || (com.tencent.mm.sdk.platformtools.bg.nl(((ay)localObject1).name).length() == 0))
    {
      localObject1 = com.tencent.mm.ui.base.h.a(this.context, R.l.elj, R.l.cUG, new DialogInterface.OnClickListener()
      {
        public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
        {
          GMTrace.i(19449356746752L, 144909);
          GMTrace.o(19449356746752L, 144909);
        }
      });
      ((com.tencent.mm.ui.base.i)localObject1).setCancelable(false);
      ((com.tencent.mm.ui.base.i)localObject1).setOnDismissListener(new DialogInterface.OnDismissListener()
      {
        public final void onDismiss(DialogInterface paramAnonymousDialogInterface)
        {
          GMTrace.i(19418084016128L, 144676);
          g.this.a(parami, "share_weibo:no_weibo", null);
          GMTrace.o(19418084016128L, 144676);
        }
      });
      GMTrace.o(12183480041472L, 90774);
      return true;
    }
    localObject1 = com.tencent.mm.sdk.platformtools.bg.aq((String)parami.nSp.get("type"), "40");
    if ((localObject1 != null) && (((String)localObject1).length() > 0)) {}
    for (;;)
    {
      try
      {
        i = com.tencent.mm.sdk.platformtools.bg.getInt((String)localObject1, 40);
        if ((i != 11) && (i != 20))
        {
          i = 40;
          localObject2 = (String)parami.nSp.get("content");
          str = (String)parami.nSp.get("url");
          if (localObject2 != null)
          {
            localObject1 = localObject2;
            if (((String)localObject2).trim().length() != 0) {}
          }
          else
          {
            localObject1 = "";
          }
          if ((str == null) || (str.length() == 0))
          {
            w.e("MicroMsg.MsgHandler", "doWeibo fail, invalid argument, content = " + (String)localObject1 + ", url = " + str);
            a(parami, "share_weibo:fail_-2", null);
            GMTrace.o(12183480041472L, 90774);
            return true;
          }
        }
      }
      catch (Exception localException)
      {
        String str;
        i = 40;
        continue;
        k.a(parami.rUT, Mz("shareWeibo"), null, null);
        parami = ak.zA(str);
        Object localObject2 = new Intent(this.context, ShareToQQWeiboUI.class);
        ((Intent)localObject2).putExtra("type", i);
        ((Intent)localObject2).putExtra("shortUrl", parami);
        ((Intent)localObject2).putExtra("content", localException);
        if ((this.context instanceof MMActivity)) {
          ((MMActivity)this.context).a(this, (Intent)localObject2, 2);
        }
        GMTrace.o(12183480041472L, 90774);
        return true;
      }
      continue;
      int i = 40;
    }
  }
  
  public final String pi(String paramString)
  {
    GMTrace.i(12181198340096L, 90757);
    if (this.rSL == null)
    {
      w.i("MicroMsg.MsgHandler", "getCachedAppId, jsVerifyHelper is null, return null");
      GMTrace.o(12181198340096L, 90757);
      return null;
    }
    paramString = this.rSL.Ms(paramString);
    GMTrace.o(12181198340096L, 90757);
    return paramString;
  }
  
  /* Error */
  public final boolean q(i parami)
  {
    // Byte code:
    //   0: ldc2_w 10886
    //   3: ldc_w 10888
    //   6: invokestatic 401	com/tencent/gmtrace/GMTrace:i	(JI)V
    //   9: aload_1
    //   10: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   13: ldc_w 10890
    //   16: invokeinterface 860 2 0
    //   21: checkcast 413	java/lang/String
    //   24: astore 8
    //   26: new 616	java/lang/StringBuilder
    //   29: dup
    //   30: invokespecial 681	java/lang/StringBuilder:<init>	()V
    //   33: aload 8
    //   35: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   38: ldc_w 2340
    //   41: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   44: invokevirtual 628	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   47: astore 7
    //   49: invokestatic 3346	com/tencent/mm/y/q:zE	()Ljava/lang/String;
    //   52: astore 9
    //   54: aload_0
    //   55: getfield 648	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rEM	Lcom/tencent/mm/plugin/webview/stub/e;
    //   58: bipush 18
    //   60: aconst_null
    //   61: invokeinterface 653 3 0
    //   66: astore 13
    //   68: aload 7
    //   70: astore 6
    //   72: aload 13
    //   74: ifnull +443 -> 517
    //   77: aload 13
    //   79: ldc_w 4115
    //   82: invokevirtual 791	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   85: astore 12
    //   87: aload 13
    //   89: ldc_w 4111
    //   92: invokevirtual 791	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   95: astore 10
    //   97: aload 13
    //   99: ldc_w 4117
    //   102: invokevirtual 791	android/os/Bundle:getString	(Ljava/lang/String;)Ljava/lang/String;
    //   105: astore 11
    //   107: aload 13
    //   109: ldc_w 4119
    //   112: invokevirtual 604	android/os/Bundle:getInt	(Ljava/lang/String;)I
    //   115: istore_2
    //   116: new 616	java/lang/StringBuilder
    //   119: dup
    //   120: invokespecial 681	java/lang/StringBuilder:<init>	()V
    //   123: aload 7
    //   125: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   128: aload 12
    //   130: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   133: ldc_w 2340
    //   136: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   139: aload 10
    //   141: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   144: ldc_w 2340
    //   147: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   150: aload 11
    //   152: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   155: ldc_w 2340
    //   158: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   161: iload_2
    //   162: invokevirtual 1440	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   165: ldc_w 2340
    //   168: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   171: invokevirtual 628	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   174: astore 7
    //   176: aload 12
    //   178: ifnull +292 -> 470
    //   181: aload 7
    //   183: astore 6
    //   185: aload 12
    //   187: ldc_w 10892
    //   190: invokevirtual 1057	java/lang/String:startsWith	(Ljava/lang/String;)Z
    //   193: ifeq +277 -> 470
    //   196: aload 7
    //   198: astore 6
    //   200: aload 12
    //   202: iconst_4
    //   203: invokevirtual 985	java/lang/String:substring	(I)Ljava/lang/String;
    //   206: invokestatic 10895	java/lang/Long:parseLong	(Ljava/lang/String;)J
    //   209: lstore 4
    //   211: aload 7
    //   213: astore 6
    //   215: invokestatic 2297	com/tencent/mm/y/at:AR	()Lcom/tencent/mm/y/c;
    //   218: pop
    //   219: aload 7
    //   221: astore 6
    //   223: invokestatic 10899	com/tencent/mm/y/c:yM	()Lcom/tencent/mm/plugin/messenger/foundation/a/a/c;
    //   226: aload 10
    //   228: lload 4
    //   230: invokeinterface 10904 4 0
    //   235: astore 12
    //   237: aload 7
    //   239: astore 6
    //   241: aload 11
    //   243: aload 10
    //   245: invokestatic 10909	com/tencent/mm/y/t:H	(Ljava/lang/String;Ljava/lang/String;)I
    //   248: istore_2
    //   249: aload 7
    //   251: astore 6
    //   253: aload 12
    //   255: getfield 10914	com/tencent/mm/g/b/ce:field_talker	Ljava/lang/String;
    //   258: invokestatic 10919	com/tencent/mm/y/m:fk	(Ljava/lang/String;)I
    //   261: istore_3
    //   262: aload 7
    //   264: astore 6
    //   266: new 616	java/lang/StringBuilder
    //   269: dup
    //   270: invokespecial 681	java/lang/StringBuilder:<init>	()V
    //   273: aload 7
    //   275: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   278: aload 12
    //   280: getfield 10920	com/tencent/mm/g/b/ce:field_type	I
    //   283: invokevirtual 1440	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   286: ldc_w 2340
    //   289: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   292: iload_3
    //   293: invokevirtual 1440	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   296: ldc_w 2340
    //   299: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   302: iload_2
    //   303: invokevirtual 1440	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   306: ldc_w 2340
    //   309: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   312: invokestatic 10925	com/tencent/mm/plugin/webview/model/aj:bCs	()I
    //   315: invokevirtual 1440	java/lang/StringBuilder:append	(I)Ljava/lang/StringBuilder;
    //   318: ldc_w 2340
    //   321: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   324: invokevirtual 628	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   327: astore 7
    //   329: aload 7
    //   331: astore 6
    //   333: new 616	java/lang/StringBuilder
    //   336: dup
    //   337: invokespecial 681	java/lang/StringBuilder:<init>	()V
    //   340: aload 7
    //   342: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   345: aload 9
    //   347: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   350: invokevirtual 628	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   353: astore 7
    //   355: aload 7
    //   357: astore 6
    //   359: ldc_w 10927
    //   362: invokestatic 4192	com/tencent/mm/kernel/h:h	(Ljava/lang/Class;)Lcom/tencent/mm/kernel/c/a;
    //   365: checkcast 10927	com/tencent/mm/plugin/sns/b/a
    //   368: aload 6
    //   370: invokestatic 5760	com/tencent/mm/sdk/platformtools/bg:Pu	()J
    //   373: l2i
    //   374: invokeinterface 10929 3 0
    //   379: aload_1
    //   380: getfield 852	com/tencent/mm/plugin/webview/ui/tools/jsapi/i:nSp	Ljava/util/Map;
    //   383: ldc_w 10931
    //   386: invokeinterface 860 2 0
    //   391: checkcast 413	java/lang/String
    //   394: ldc_w 3691
    //   397: invokestatic 1372	com/tencent/mm/sdk/platformtools/bg:aq	(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/String;
    //   400: invokestatic 7766	java/lang/Integer:parseInt	(Ljava/lang/String;)I
    //   403: ifeq +47 -> 450
    //   406: new 580	android/os/Bundle
    //   409: dup
    //   410: invokespecial 581	android/os/Bundle:<init>	()V
    //   413: astore 6
    //   415: aload 6
    //   417: ldc_w 10933
    //   420: aload 8
    //   422: invokevirtual 1634	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   425: aload 6
    //   427: ldc_w 3532
    //   430: aload 9
    //   432: invokevirtual 1634	android/os/Bundle:putString	(Ljava/lang/String;Ljava/lang/String;)V
    //   435: aload_0
    //   436: getfield 648	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:rEM	Lcom/tencent/mm/plugin/webview/stub/e;
    //   439: ldc_w 10934
    //   442: aload 6
    //   444: invokeinterface 653 3 0
    //   449: pop
    //   450: aload_0
    //   451: aload_1
    //   452: ldc_w 10936
    //   455: aconst_null
    //   456: invokevirtual 686	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   459: ldc2_w 10886
    //   462: ldc_w 10888
    //   465: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   468: iconst_1
    //   469: ireturn
    //   470: aload 7
    //   472: astore 6
    //   474: new 616	java/lang/StringBuilder
    //   477: dup
    //   478: invokespecial 681	java/lang/StringBuilder:<init>	()V
    //   481: aload 7
    //   483: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   486: ldc_w 10938
    //   489: invokevirtual 624	java/lang/StringBuilder:append	(Ljava/lang/String;)Ljava/lang/StringBuilder;
    //   492: invokevirtual 628	java/lang/StringBuilder:toString	()Ljava/lang/String;
    //   495: astore 7
    //   497: goto -168 -> 329
    //   500: astore 7
    //   502: ldc_w 614
    //   505: aload 7
    //   507: ldc_w 727
    //   510: iconst_0
    //   511: anewarray 4	java/lang/Object
    //   514: invokestatic 1617	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   517: goto -158 -> 359
    //   520: astore 6
    //   522: ldc_w 614
    //   525: aload 6
    //   527: ldc_w 727
    //   530: iconst_0
    //   531: anewarray 4	java/lang/Object
    //   534: invokestatic 1617	com/tencent/mm/sdk/platformtools/w:printErrStackTrace	(Ljava/lang/String;Ljava/lang/Throwable;Ljava/lang/String;[Ljava/lang/Object;)V
    //   537: aload_0
    //   538: aload_1
    //   539: ldc_w 10940
    //   542: aconst_null
    //   543: invokevirtual 686	com/tencent/mm/plugin/webview/ui/tools/jsapi/g:a	(Lcom/tencent/mm/plugin/webview/ui/tools/jsapi/i;Ljava/lang/String;Ljava/util/Map;)V
    //   546: ldc2_w 10886
    //   549: ldc_w 10888
    //   552: invokestatic 457	com/tencent/gmtrace/GMTrace:o	(JI)V
    //   555: iconst_1
    //   556: ireturn
    //   557: astore 6
    //   559: goto -109 -> 450
    // Local variable table:
    //   start	length	slot	name	signature
    //   0	562	0	this	g
    //   0	562	1	parami	i
    //   115	188	2	i	int
    //   261	32	3	j	int
    //   209	20	4	l	long
    //   70	403	6	localObject1	Object
    //   520	6	6	localRemoteException1	RemoteException
    //   557	1	6	localRemoteException2	RemoteException
    //   47	449	7	str1	String
    //   500	6	7	localException	Exception
    //   24	397	8	str2	String
    //   52	379	9	str3	String
    //   95	149	10	str4	String
    //   105	137	11	str5	String
    //   85	194	12	localObject2	Object
    //   66	42	13	localBundle	Bundle
    // Exception table:
    //   from	to	target	type
    //   185	196	500	java/lang/Exception
    //   200	211	500	java/lang/Exception
    //   215	219	500	java/lang/Exception
    //   223	237	500	java/lang/Exception
    //   241	249	500	java/lang/Exception
    //   253	262	500	java/lang/Exception
    //   266	329	500	java/lang/Exception
    //   333	355	500	java/lang/Exception
    //   474	497	500	java/lang/Exception
    //   54	68	520	android/os/RemoteException
    //   77	176	520	android/os/RemoteException
    //   185	196	520	android/os/RemoteException
    //   200	211	520	android/os/RemoteException
    //   215	219	520	android/os/RemoteException
    //   223	237	520	android/os/RemoteException
    //   241	249	520	android/os/RemoteException
    //   253	262	520	android/os/RemoteException
    //   266	329	520	android/os/RemoteException
    //   333	355	520	android/os/RemoteException
    //   474	497	520	android/os/RemoteException
    //   502	517	520	android/os/RemoteException
    //   435	450	557	android/os/RemoteException
  }
  
  public final boolean r(i parami)
  {
    GMTrace.i(16066264694784L, 119703);
    w.i("MicroMsg.MsgHandler", "doGoVideoPlayerUI");
    String str1 = (String)parami.nSp.get("streamingUrl");
    int i = (int)com.tencent.mm.sdk.platformtools.bg.getDouble((String)parami.nSp.get("streamingVideoTime"), 0.0D);
    String str2 = (String)parami.nSp.get("btnTitle");
    String str3 = (String)parami.nSp.get("jumpUrl");
    String str4 = (String)parami.nSp.get("shareTitle");
    String str5 = (String)parami.nSp.get("shareThumbUrl");
    int j = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("shareBtnHidden"), 0);
    String str6 = (String)parami.nSp.get("reportArgs");
    int k = com.tencent.mm.sdk.platformtools.bg.getInt((String)parami.nSp.get("needReportData"), 0);
    Intent localIntent = new Intent();
    localIntent.putExtra("IsAd", true);
    localIntent.putExtra("KStremVideoUrl", str1);
    localIntent.putExtra("StreamWording", str2);
    localIntent.putExtra("StremWebUrl", str3);
    localIntent.putExtra("KThumUrl", str5);
    localIntent.putExtra("KMediaId", "fakeid_" + str5.hashCode());
    localIntent.putExtra("KMediaVideoTime", i);
    localIntent.putExtra("KMediaTitle", str4);
    localIntent.putExtra("ShareBtnHidden", j);
    localIntent.putExtra("ReportArgs", str6);
    localIntent.putExtra("NeedReportData", k);
    com.tencent.mm.bj.d.b(this.context, "sns", ".ui.VideoAdPlayerUI", localIntent);
    a(parami, "playStreamingVideo:ok", null);
    GMTrace.o(16066264694784L, 119703);
    return true;
  }
  
  public final boolean s(i parami)
  {
    GMTrace.i(12183882694656L, 90777);
    for (;;)
    {
      try
      {
        if (this.rEM != null)
        {
          localObject = this.rEM.d(87, null);
          if (localObject != null)
          {
            if (!com.tencent.mm.sdk.platformtools.bg.nl(((Bundle)localObject).getString("result")).equals("not_return")) {
              continue;
            }
            a(parami, "getWePkgAuthResult:fail_auth_result_not_return", null);
          }
        }
      }
      catch (Exception localException)
      {
        String str;
        int i;
        w.e("MicroMsg.MsgHandler", "doGetWePkgAuthResult exception, " + localException.getMessage());
        a(parami, "getWePkgAuthResult:fail", null);
        continue;
        Object localObject = new HashMap();
        ((HashMap)localObject).put("full_url", localException);
        ((HashMap)localObject).put("set_cookie", Integer.valueOf(i));
        a(parami, "getWePkgAuthResult:ok", (Map)localObject);
        continue;
      }
      GMTrace.o(12183882694656L, 90777);
      return true;
      str = ((Bundle)localObject).getString("full_url");
      i = ((Bundle)localObject).getInt("set_cookie");
      if (!com.tencent.mm.sdk.platformtools.bg.nm(str)) {
        continue;
      }
      a(parami, "getWePkgAuthResult:fail_full_url_empty", null);
    }
  }
  
  public final boolean t(final i parami)
  {
    GMTrace.i(16066398912512L, 119704);
    w.i("MicroMsg.MsgHandler", "getLocalWePkgInfo call");
    com.tencent.mm.sdk.platformtools.af.t(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(19454322802688L, 144946);
        com.tencent.mm.plugin.webview.wepkg.model.g.a(new com.tencent.mm.plugin.webview.wepkg.model.g.a()
        {
          public final void A(JSONObject paramAnonymous2JSONObject)
          {
            GMTrace.i(19426539732992L, 144739);
            HashMap localHashMap = new HashMap();
            localHashMap.put("wepkg_info", paramAnonymous2JSONObject);
            g.this.a(g.22.this.rTq, "getLocalWePkgInfo:ok", localHashMap);
            GMTrace.o(19426539732992L, 144739);
          }
        });
        GMTrace.o(19454322802688L, 144946);
      }
    });
    GMTrace.o(16066398912512L, 119704);
    return true;
  }
  
  public final boolean u(i parami)
  {
    boolean bool2 = false;
    GMTrace.i(16066533130240L, 119705);
    Object localObject = (String)parami.nSp.get("url");
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject))
    {
      w.e("MicroMsg.MsgHandler", "url is null or nil");
      a(parami, "openGameWebView:fail_invalid_url", null);
      GMTrace.o(16066533130240L, 119705);
      return true;
    }
    String str = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("orientation"));
    int i;
    if (!com.tencent.mm.sdk.platformtools.bg.nm(str)) {
      if (str.equals("horizontal")) {
        i = 0;
      }
    }
    for (;;)
    {
      if (com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("fullscreen")).equals("true")) {}
      for (boolean bool1 = true;; bool1 = false)
      {
        if (com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("disable_swipe_back")).equals("1")) {
          bool2 = true;
        }
        str = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("gameAppid"));
        Intent localIntent = new Intent();
        localIntent.putExtra("rawUrl", (String)localObject);
        localIntent.putExtra("geta8key_scene", 32);
        localIntent.putExtra("KPublisherId", "game_webview");
        localIntent.putExtra("screen_orientation", i);
        localIntent.putExtra("show_full_screen", bool1);
        localIntent.putExtra("disable_swipe_back", bool2);
        localIntent.putExtra("game_hv_menu_appid", str);
        if (com.tencent.xweb.x5.sdk.d.getTbsVersion(this.context) >= 43114) {
          com.tencent.mm.bj.d.b(this.context, "game", ".gamewebview.ui.GameWebViewUI", localIntent);
        }
        for (;;)
        {
          localObject = new gl();
          ((gl)localObject).eJz.nJ = 2;
          ((gl)localObject).eJz.eJB = str;
          com.tencent.mm.sdk.b.a.vgX.m((com.tencent.mm.sdk.b.b)localObject);
          a(parami, "openGameWebView:ok", null);
          GMTrace.o(16066533130240L, 119705);
          return true;
          if (str.equals("vertical"))
          {
            i = 1;
            break;
          }
          if (!str.equals("sensor")) {
            break label411;
          }
          i = 4;
          break;
          com.tencent.mm.bj.d.b(this.context, "webview", ".ui.tools.game.GameWebViewUI", localIntent);
        }
      }
      label411:
      i = -1;
    }
  }
  
  public final boolean v(i parami)
  {
    GMTrace.i(19440229941248L, 144841);
    String str1 = (String)parami.nSp.get("reportId");
    boolean bool1 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("reportInstantly")).equals("1");
    boolean bool2 = com.tencent.mm.sdk.platformtools.bg.nl((String)parami.nSp.get("reportTimeBegin")).equals("1");
    String str2 = (String)parami.nSp.get("reportFormatData");
    String str3 = (String)parami.nSp.get("reportTabsFormatData");
    if (com.tencent.mm.sdk.platformtools.bg.nm(str1))
    {
      w.e("MicroMsg.MsgHandler", "reportId is null or nil");
      a(parami, "reportGamePageTime:fail_invalid_reportId", null);
      GMTrace.o(19440229941248L, 144841);
      return true;
    }
    if ((com.tencent.mm.sdk.platformtools.bg.nm(str2)) && (com.tencent.mm.sdk.platformtools.bg.nm(str3)))
    {
      w.e("MicroMsg.MsgHandler", "reportFormatData && reportTabsFormatData is null or nil");
      a(parami, "reportGamePageTime:fail_invalid_reportFormatData_reportTabsFormatData", null);
      GMTrace.o(19440229941248L, 144841);
      return true;
    }
    w.i("MicroMsg.MsgHandler", "reportGamePageTime, reportId:%s, reportInstantly:%b, reportTimeBegin:%b, reportFormatData:(%s), reportTabsFormatData(%s)", new Object[] { str1, Boolean.valueOf(bool1), Boolean.valueOf(bool2), str2, str3 });
    Bundle localBundle = new Bundle();
    localBundle.putString("game_page_report_id", str1);
    localBundle.putBoolean("game_page_report_instantly", bool1);
    localBundle.putBoolean("game_page_report_time_begin", bool2);
    localBundle.putString("game_page_report_format_data", str2);
    localBundle.putString("game_page_report_tabs_format_data", str3);
    try
    {
      this.rEM.d(95, localBundle);
      a(parami, "reportGamePageTime:ok", null);
      GMTrace.o(19440229941248L, 144841);
      return true;
    }
    catch (Exception localException)
    {
      for (;;)
      {
        w.e("MicroMsg.MsgHandler", "reportGamePageTime, exception = %s", new Object[] { localException });
        a(parami, "reportGamePageTime:fail", null);
      }
    }
  }
  
  public final boolean w(final i parami)
  {
    GMTrace.i(16066667347968L, 119706);
    String str1 = (String)parami.nSp.get("webtype");
    String str2 = (String)parami.nSp.get("username");
    String str3 = (String)parami.nSp.get("scene");
    String str4 = (String)parami.nSp.get("profileReportInfo");
    if ((str1 == null) || (str1.length() == 0) || (str2 == null) || (str2.length() == 0))
    {
      w.e("MicroMsg.MsgHandler", "doAddContact fail, invalid arguments, webType = " + str1 + ", username = " + str2);
      a(parami, "add_contact:fail", null);
      GMTrace.o(16066667347968L, 119706);
      return true;
    }
    My(str3);
    int i = com.tencent.mm.sdk.platformtools.bg.getInt(str1, -1);
    if (i == -1)
    {
      w.e("MicroMsg.MsgHandler", "doAddContact fail, parseInt fail, str = " + str1);
      a(parami, "add_contact:fail", null);
      GMTrace.o(16066667347968L, 119706);
      return true;
    }
    k.a(parami.rUT, false, str2, null);
    switch (i)
    {
    default: 
      w.e("MicroMsg.MsgHandler", "unknown addScene = " + i);
      a(parami, "add_contact:fail", null);
      GMTrace.o(16066667347968L, 119706);
      return true;
    }
    if (this.rSC == null) {}
    for (i = 33;; i = this.rSC.getInt("Contact_Scene", 33))
    {
      new com.tencent.mm.pluginsdk.ui.applet.b(this.context, str2, i, new com.tencent.mm.pluginsdk.ui.applet.l()
      {
        public final void qg(int paramAnonymousInt)
        {
          GMTrace.i(19420768370688L, 144696);
          switch (paramAnonymousInt)
          {
          default: 
            g.this.a(parami, "add_contact:fail", null);
            GMTrace.o(19420768370688L, 144696);
            return;
          case -2: 
            g.this.a(parami, "add_contact:added", null);
            GMTrace.o(19420768370688L, 144696);
            return;
          case 0: 
            g.this.a(parami, "add_contact:cancel", null);
            GMTrace.o(19420768370688L, 144696);
            return;
          case -1: 
            g.this.a(parami, "add_contact:fail", null);
            GMTrace.o(19420768370688L, 144696);
            return;
          }
          g.this.a(parami, "add_contact:ok", null);
          GMTrace.o(19420768370688L, 144696);
        }
      }, str4).show();
      GMTrace.o(16066667347968L, 119706);
      return true;
    }
  }
  
  public final void x(int paramInt, String paramString1, String paramString2)
  {
    GMTrace.i(12194754330624L, 90858);
    Object localObject = yl(paramInt);
    if (localObject == null)
    {
      w.i("MicroMsg.MsgHandler", "onWebViewCacheCallback, get null MsgWrapperBin, may be the webview called cache api has been closed.");
      GMTrace.o(12194754330624L, 90858);
      return;
    }
    localObject = ((c)localObject).rSz;
    ym(paramInt);
    if (!com.tencent.mm.sdk.platformtools.bg.nl(paramString2).equalsIgnoreCase("ok"))
    {
      paramInt = com.tencent.mm.plugin.webview.modelcache.p.a((i)localObject);
      if (-1 != paramInt) {
        com.tencent.mm.plugin.webview.modelcache.m.xA(paramInt);
      }
    }
    if (this.rEM != null) {
      a(this.rEM, (i)localObject, String.format("%s:%s", new Object[] { paramString1, paramString2 }), null, false, true);
    }
    GMTrace.o(12194754330624L, 90858);
  }
  
  public final boolean x(i parami)
  {
    GMTrace.i(12184151130112L, 90779);
    Object localObject = (String)parami.nSp.get("current");
    String[] arrayOfString1 = (String[])parami.nSp.get("urls");
    parami = new ArrayList();
    if ((arrayOfString1 == null) || (arrayOfString1.length == 0))
    {
      w.e("MicroMsg.MsgHandler", "doImgPreview fail, urls is null");
      this.kNw = false;
      GMTrace.o(12184151130112L, 90779);
      return false;
    }
    w.d("MicroMsg.MsgHandler", "doImgPreview ok");
    int i = 0;
    if (i < arrayOfString1.length)
    {
      if ((com.tencent.mm.sdk.platformtools.bg.nm(arrayOfString1[i])) || (arrayOfString1[i].equalsIgnoreCase("null"))) {
        w.e("MicroMsg.MsgHandler", "null url, i = %d", new Object[] { Integer.valueOf(i) });
      }
      for (;;)
      {
        i += 1;
        break;
        if (com.tencent.mm.sdk.platformtools.bg.nl(arrayOfString1[i]).startsWith("weixin://resourceid/")) {
          arrayOfString1[i] = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk(arrayOfString1[i]).hOo;
        }
        parami.add(arrayOfString1[i]);
      }
    }
    String[] arrayOfString2 = (String[])parami.toArray(arrayOfString1);
    arrayOfString1 = (String[])parami.toArray(new String[parami.size()]);
    if (com.tencent.mm.sdk.platformtools.bg.nm((String)localObject)) {
      parami = arrayOfString2[0];
    }
    for (;;)
    {
      localObject = new Intent();
      ((Intent)localObject).putExtra("nowUrl", parami);
      ((Intent)localObject).putExtra("urlList", arrayOfString1);
      ((Intent)localObject).putExtra("type", 65281);
      ((Intent)localObject).putExtra("isFromWebView", true);
      ((Intent)localObject).putExtra("shouldShowScanQrCodeMenu", true);
      try
      {
        parami = this.rEM.d(90001, new Bundle());
        if (parami != null)
        {
          parami = parami.getString("cookie", null);
          if (!com.tencent.mm.sdk.platformtools.bg.nm(parami)) {
            ((Intent)localObject).putExtra("cookie", parami);
          }
        }
      }
      catch (Exception parami)
      {
        for (;;)
        {
          w.e("MicroMsg.MsgHandler", "getCookie fail : %s", new Object[] { parami.getMessage() });
        }
      }
      if ((this.context instanceof Service)) {
        ((Intent)localObject).addFlags(268435456);
      }
      parami = new Bundle();
      parami.putInt("stat_scene", 4);
      parami.putString("stat_url", Zi());
      ((Intent)localObject).putExtra("_stat_obj", parami);
      com.tencent.mm.plugin.webview.a.a.hnH.t((Intent)localObject, this.context);
      this.kNw = false;
      GMTrace.o(12184151130112L, 90779);
      return false;
      parami = (i)localObject;
      if (((String)localObject).startsWith("weixin://resourceid/")) {
        parami = com.tencent.mm.plugin.webview.modeltools.f.bCW().Lk((String)localObject).hOo;
      }
    }
  }
  
  public final boolean y(i parami)
  {
    GMTrace.i(16066801565696L, 119707);
    w.i("MicroMsg.MsgHandler", "jslog : " + parami.nSp.get("msg"));
    this.kNw = false;
    GMTrace.o(16066801565696L, 119707);
    return false;
  }
  
  public final c yl(int paramInt)
  {
    GMTrace.i(12200391475200L, 90900);
    c localc = (c)this.rTl.get(Integer.valueOf(paramInt));
    GMTrace.o(12200391475200L, 90900);
    return localc;
  }
  
  public final void ym(int paramInt)
  {
    GMTrace.i(12200525692928L, 90901);
    c localc = (c)this.rTl.remove(Integer.valueOf(paramInt));
    if (localc != null)
    {
      localc.rSz = null;
      localc.rEM = null;
    }
    GMTrace.o(12200525692928L, 90901);
  }
  
  public final boolean z(i parami)
  {
    GMTrace.i(16066935783424L, 119708);
    if (!am.isConnected(this.context))
    {
      w.i("MicroMsg.MsgHandler", "getNetworkType, not connected");
      a(parami, "network_type:fail", null);
      GMTrace.o(16066935783424L, 119708);
      return true;
    }
    int i = am.getNetType(this.context);
    w.i("MicroMsg.MsgHandler", "getNetworkType, type = " + i);
    HashMap localHashMap = new HashMap();
    if (am.is2G(this.context))
    {
      w.i("MicroMsg.MsgHandler", "getNetworkType, 2g");
      localHashMap.put("subtype", "2g");
      a(parami, "network_type:wwan", localHashMap);
      GMTrace.o(16066935783424L, 119708);
      return true;
    }
    if (am.is3G(this.context))
    {
      w.i("MicroMsg.MsgHandler", "getNetworkType, 3g");
      localHashMap.put("subtype", "3g");
      a(parami, "network_type:wwan", localHashMap);
      GMTrace.o(16066935783424L, 119708);
      return true;
    }
    if (am.is4G(this.context))
    {
      w.i("MicroMsg.MsgHandler", "getNetworkType, 4g");
      localHashMap.put("subtype", "4g");
      a(parami, "network_type:wwan", localHashMap);
      GMTrace.o(16066935783424L, 119708);
      return true;
    }
    if (am.isWifi(this.context))
    {
      w.i("MicroMsg.MsgHandler", "getNetworkType, wifi");
      a(parami, "network_type:wifi", null);
      GMTrace.o(16066935783424L, 119708);
      return true;
    }
    w.w("MicroMsg.MsgHandler", "getNetworkType, unknown");
    a(parami, "network_type:fail", null);
    GMTrace.o(16066935783424L, 119708);
    return true;
  }
  
  public static abstract interface a
  {
    public abstract void Wd();
  }
  
  private static final class b
  {
    public i rSz;
    public c.b rUM;
    
    public b()
    {
      GMTrace.i(12144825335808L, 90486);
      GMTrace.o(12144825335808L, 90486);
    }
  }
  
  private final class c
  {
    public com.tencent.mm.plugin.webview.stub.e rEM;
    public i rSz;
    
    public c(i parami, com.tencent.mm.plugin.webview.stub.e parame)
    {
      GMTrace.i(12175561195520L, 90715);
      this.rSz = parami;
      this.rEM = parame;
      GMTrace.o(12175561195520L, 90715);
    }
  }
  
  private static final class d
    implements com.tencent.mm.pluginsdk.model.app.g.c
  {
    volatile boolean eLW;
    volatile boolean guO;
    volatile boolean rUN;
    volatile boolean rUO;
    a rUP;
    
    d(a parama)
    {
      GMTrace.i(19005096067072L, 141599);
      this.rUP = parama;
      GMTrace.o(19005096067072L, 141599);
    }
    
    public final void eP(boolean paramBoolean)
    {
      GMTrace.i(19005230284800L, 141600);
      this.guO = true;
      this.rUN = paramBoolean;
      if ((this.rUO) && (this.rUP != null)) {
        this.rUP.D(this.eLW, paramBoolean);
      }
      GMTrace.o(19005230284800L, 141600);
    }
    
    final void jG(boolean paramBoolean)
    {
      GMTrace.i(19005364502528L, 141601);
      this.eLW = paramBoolean;
      this.rUO = true;
      if ((this.guO) && (this.rUP != null)) {
        this.rUP.D(paramBoolean, this.rUN);
      }
      GMTrace.o(19005364502528L, 141601);
    }
    
    static abstract interface a
    {
      public abstract void D(boolean paramBoolean1, boolean paramBoolean2);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\plugin\webview\ui\tools\jsapi\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */