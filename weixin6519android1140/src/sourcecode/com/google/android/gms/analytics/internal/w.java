package com.google.android.gms.analytics.internal;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.SharedPreferences;
import android.database.sqlite.SQLiteException;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Handler;
import android.text.TextUtils;
import android.util.Pair;
import com.google.android.gms.analytics.AnalyticsReceiver;
import com.google.android.gms.analytics.AnalyticsService;
import com.google.android.gms.analytics.CampaignTrackingReceiver;
import com.google.android.gms.analytics.CampaignTrackingService;
import com.google.android.gms.analytics.d;
import com.google.android.gms.c.ah.1;
import com.google.android.gms.c.ah.a;
import com.google.android.gms.c.ai;
import com.google.android.gms.c.ak;
import com.google.android.gms.c.v;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

final class w
  extends o
{
  private final u adD;
  private final h adE;
  private final g adF;
  private final t adG;
  private long adH;
  private final ae adI;
  private final ae adJ;
  private final j adK;
  private long adL;
  private boolean adM;
  private boolean mP;
  
  protected w(q paramq, r paramr)
  {
    super(paramq);
    com.google.android.gms.common.internal.w.aa(paramr);
    this.adH = Long.MIN_VALUE;
    this.adF = new g(paramq);
    this.adD = new u(paramq);
    this.adE = new h(paramq);
    this.adG = r.d(paramq);
    this.adK = new j(this.ack.acz);
    this.adI = new ae(paramq)
    {
      public final void run()
      {
        w localw = w.this;
        localw.b(new w.4(localw));
      }
    };
    this.adJ = new ae(paramq)
    {
      public final void run()
      {
        w.this.iV();
      }
    };
  }
  
  private boolean V(String paramString)
  {
    return this.ack.mContext.checkCallingOrSelfPermission(paramString) == 0;
  }
  
  private void a(s params, ak paramak)
  {
    com.google.android.gms.common.internal.w.aa(params);
    com.google.android.gms.common.internal.w.aa(paramak);
    Object localObject1 = new com.google.android.gms.analytics.c(this.ack);
    Object localObject2 = params.adj;
    com.google.android.gms.common.internal.w.af((String)localObject2);
    Object localObject3 = d.Z((String)localObject2);
    Object localObject4 = ((com.google.android.gms.analytics.c)localObject1).lB().listIterator();
    while (((ListIterator)localObject4).hasNext()) {
      if (((Uri)localObject3).equals(((ai)((ListIterator)localObject4).next()).jy())) {
        ((ListIterator)localObject4).remove();
      }
    }
    ((com.google.android.gms.analytics.c)localObject1).lB().add(new d(((com.google.android.gms.analytics.c)localObject1).aeb, (String)localObject2));
    ((com.google.android.gms.analytics.c)localObject1).afj = params.adk;
    localObject1 = ((com.google.android.gms.analytics.c)localObject1).jx();
    localObject2 = (com.google.android.gms.c.h)((com.google.android.gms.c.ae)localObject1).b(com.google.android.gms.c.h.class);
    ((com.google.android.gms.c.h)localObject2).atl = "data";
    ((com.google.android.gms.c.h)localObject2).atq = true;
    ((com.google.android.gms.c.ae)localObject1).b(paramak);
    localObject3 = (com.google.android.gms.c.g)((com.google.android.gms.c.ae)localObject1).b(com.google.android.gms.c.g.class);
    localObject4 = (com.google.android.gms.c.aj)((com.google.android.gms.c.ae)localObject1).b(com.google.android.gms.c.aj.class);
    Iterator localIterator = params.abX.entrySet().iterator();
    while (localIterator.hasNext())
    {
      Object localObject5 = (Map.Entry)localIterator.next();
      String str = (String)((Map.Entry)localObject5).getKey();
      localObject5 = (String)((Map.Entry)localObject5).getValue();
      if ("an".equals(str))
      {
        ((com.google.android.gms.c.aj)localObject4).abS = ((String)localObject5);
      }
      else if ("av".equals(str))
      {
        ((com.google.android.gms.c.aj)localObject4).abT = ((String)localObject5);
      }
      else if ("aid".equals(str))
      {
        ((com.google.android.gms.c.aj)localObject4).avt = ((String)localObject5);
      }
      else if ("aiid".equals(str))
      {
        ((com.google.android.gms.c.aj)localObject4).avu = ((String)localObject5);
      }
      else if ("uid".equals(str))
      {
        ((com.google.android.gms.c.h)localObject2).atm = ((String)localObject5);
      }
      else
      {
        str = com.google.android.gms.c.g.aq(str);
        ((com.google.android.gms.c.g)localObject3).abX.put(str, localObject5);
      }
    }
    b("Sending installation campaign to", params.adj, paramak);
    ((com.google.android.gms.c.ae)localObject1).auZ = iA().ie();
    params = ((com.google.android.gms.c.ae)localObject1).auW.avh;
    if (((com.google.android.gms.c.ae)localObject1).avd) {
      throw new IllegalStateException("Measurement prototype can't be submitted");
    }
    if (((com.google.android.gms.c.ae)localObject1).auX) {
      throw new IllegalStateException("Measurement can only be submitted once");
    }
    paramak = ((com.google.android.gms.c.ae)localObject1).lz();
    paramak.ava = paramak.acz.elapsedRealtime();
    if (paramak.auZ != 0L) {}
    for (paramak.auY = paramak.auZ;; paramak.auY = paramak.acz.currentTimeMillis())
    {
      paramak.auX = true;
      params.avn.execute(new ah.1(params, paramak));
      return;
    }
  }
  
  private long iQ()
  {
    com.google.android.gms.c.ah.iK();
    iC();
    try
    {
      long l = this.adD.iQ();
      return l;
    }
    catch (SQLiteException localSQLiteException)
    {
      f("Failed to get min/max hit times from local store", localSQLiteException);
    }
    return 0L;
  }
  
  private void iW()
  {
    if (this.adM) {}
    do
    {
      long l;
      do
      {
        do
        {
          return;
        } while ((!ac.ji()) || (this.adG.isConnected()));
        l = ((Long)aj.afc.get()).longValue();
      } while (!this.adK.i(l));
      this.adK.start();
      N("Connecting to service");
    } while (!this.adG.connect());
    N("Connected to service");
    this.adK.acA = 0L;
    onServiceConnected();
  }
  
  private boolean iX()
  {
    int j = 1;
    com.google.android.gms.c.ah.iK();
    iC();
    N("Dispatching a batch of local hits");
    int i;
    if ((!this.adG.isConnected()) && (!com.google.android.gms.common.internal.f.akn))
    {
      i = 1;
      if (this.adE.ic()) {
        break label66;
      }
    }
    for (;;)
    {
      if ((i == 0) || (j == 0)) {
        break label71;
      }
      N("No network or service available. Will retry later");
      return false;
      i = 0;
      break;
      label66:
      j = 0;
    }
    label71:
    long l3 = Math.max(ac.jm(), ac.jn());
    ArrayList localArrayList = new ArrayList();
    long l1 = 0L;
    try
    {
      for (;;)
      {
        this.adD.beginTransaction();
        localArrayList.clear();
        try
        {
          localList = this.adD.k(l3);
          if (localList.isEmpty())
          {
            N("Store is empty, nothing to dispatch");
            ja();
            try
            {
              this.adD.setTransactionSuccessful();
              this.adD.endTransaction();
              return false;
            }
            catch (SQLiteException localSQLiteException1)
            {
              f("Failed to commit local dispatch transaction", localSQLiteException1);
              ja();
              return false;
            }
          }
          c("Hits loaded from store. count", Integer.valueOf(localList.size()));
          localObject2 = localList.iterator();
          for (;;)
          {
            if (((Iterator)localObject2).hasNext()) {
              if (((c)((Iterator)localObject2).next()).abZ == l1)
              {
                d("Database contains successfully uploaded hit", Long.valueOf(l1), Integer.valueOf(localList.size()));
                ja();
                try
                {
                  this.adD.setTransactionSuccessful();
                  this.adD.endTransaction();
                  return false;
                }
                catch (SQLiteException localSQLiteException2)
                {
                  f("Failed to commit local dispatch transaction", localSQLiteException2);
                  ja();
                  return false;
                }
              }
            }
          }
        }
        catch (SQLiteException localSQLiteException3)
        {
          List localList;
          Object localObject2;
          e("Failed to read hits from persisted store", localSQLiteException3);
          ja();
          try
          {
            this.adD.setTransactionSuccessful();
            this.adD.endTransaction();
            return false;
          }
          catch (SQLiteException localSQLiteException4)
          {
            f("Failed to commit local dispatch transaction", localSQLiteException4);
            ja();
            return false;
          }
          long l2 = l1;
          if (this.adG.isConnected())
          {
            l2 = l1;
            if (!com.google.android.gms.common.internal.f.akn)
            {
              N("Service connected, sending hits to the service");
              for (;;)
              {
                l2 = l1;
                if (!localList.isEmpty())
                {
                  localObject2 = (c)localList.get(0);
                  l2 = l1;
                  if (this.adG.d((c)localObject2))
                  {
                    l1 = Math.max(l1, ((c)localObject2).abZ);
                    localList.remove(localObject2);
                    d("Hit sent do device AnalyticsService for delivery", localObject2);
                    try
                    {
                      this.adD.l(((c)localObject2).abZ);
                      localSQLiteException4.add(Long.valueOf(((c)localObject2).abZ));
                    }
                    catch (SQLiteException localSQLiteException5)
                    {
                      f("Failed to remove hit that was send for delivery", localSQLiteException5);
                      ja();
                      try
                      {
                        this.adD.setTransactionSuccessful();
                        this.adD.endTransaction();
                        return false;
                      }
                      catch (SQLiteException localSQLiteException6)
                      {
                        f("Failed to commit local dispatch transaction", localSQLiteException6);
                        ja();
                        return false;
                      }
                    }
                  }
                }
              }
            }
          }
          l1 = l2;
          if (this.adE.ic())
          {
            localObject2 = this.adE.j(localList);
            Iterator localIterator = ((List)localObject2).iterator();
            for (l1 = l2; localIterator.hasNext(); l1 = Math.max(l1, ((Long)localIterator.next()).longValue())) {}
            localList.removeAll((Collection)localObject2);
          }
          try
          {
            this.adD.l((List)localObject2);
            localSQLiteException6.addAll((Collection)localObject2);
            boolean bool = localSQLiteException6.isEmpty();
            if (bool) {
              try
              {
                this.adD.setTransactionSuccessful();
                this.adD.endTransaction();
                return false;
              }
              catch (SQLiteException localSQLiteException7)
              {
                f("Failed to commit local dispatch transaction", localSQLiteException7);
                ja();
                return false;
              }
            }
          }
          catch (SQLiteException localSQLiteException8)
          {
            f("Failed to remove successfully uploaded hits", localSQLiteException8);
            ja();
            try
            {
              this.adD.setTransactionSuccessful();
              this.adD.endTransaction();
              return false;
            }
            catch (SQLiteException localSQLiteException9)
            {
              f("Failed to commit local dispatch transaction", localSQLiteException9);
              ja();
              return false;
            }
            try
            {
              this.adD.setTransactionSuccessful();
              this.adD.endTransaction();
            }
            catch (SQLiteException localSQLiteException10)
            {
              f("Failed to commit local dispatch transaction", localSQLiteException10);
              ja();
              return false;
            }
          }
        }
      }
      return false;
    }
    finally
    {
      try
      {
        this.adD.setTransactionSuccessful();
        this.adD.endTransaction();
        throw ((Throwable)localObject1);
      }
      catch (SQLiteException localSQLiteException11)
      {
        f("Failed to commit local dispatch transaction", localSQLiteException11);
        ja();
      }
    }
  }
  
  private void iZ()
  {
    ag localag = iz();
    if (!localag.ael) {}
    long l;
    do
    {
      do
      {
        return;
      } while (localag.aem);
      l = iQ();
    } while ((l == 0L) || (Math.abs(this.ack.acz.currentTimeMillis() - l) > ((Long)aj.aeB.get()).longValue()));
    c("Dispatch alarm scheduled (ms)", Long.valueOf(ac.jl()));
    localag.jv();
  }
  
  private void ja()
  {
    if (this.adI.jt()) {
      N("All hits dispatched or no network/service. Going to power save mode");
    }
    this.adI.cancel();
    ag localag = iz();
    if (localag.aem) {
      localag.cancel();
    }
  }
  
  private long jb()
  {
    long l;
    if (this.adH != Long.MIN_VALUE) {
      l = this.adH;
    }
    do
    {
      return l;
      l = ((Long)aj.aew.get()).longValue();
    } while (!this.ack.iI().ir());
    return this.ack.iI().is() * 1000L;
  }
  
  private void jc()
  {
    iC();
    q.iK();
    this.adM = true;
    this.adG.disconnect();
    iY();
  }
  
  public final void W(String paramString)
  {
    com.google.android.gms.common.internal.w.af(paramString);
    q.iK();
    iy();
    ak localak = k.a(this.ack.iE(), paramString);
    if (localak == null) {
      e("Parsing failed. Ignoring invalid campaign data", paramString);
    }
    for (;;)
    {
      return;
      String str = iA().ii();
      if (paramString.equals(str))
      {
        Q("Ignoring duplicate install campaign");
        return;
      }
      if (!TextUtils.isEmpty(str))
      {
        d("Ignoring multiple install campaigns. original, new", str, paramString);
        return;
      }
      iA().J(paramString);
      if (iA().jdMethod_if().i(ac.js()))
      {
        e("Campaign received too late, ignoring", localak);
        return;
      }
      d("Received installation campaign", localak);
      paramString = this.adD.iR().iterator();
      while (paramString.hasNext()) {
        a((s)paramString.next(), localak);
      }
    }
  }
  
  public final void b(ah paramah)
  {
    long l2 = this.adL;
    com.google.android.gms.c.ah.iK();
    iC();
    long l1 = -1L;
    long l3 = iA().ig();
    if (l3 != 0L) {
      l1 = Math.abs(this.ack.acz.currentTimeMillis() - l3);
    }
    d("Dispatching local hits. Elapsed time since last dispatch (ms)", Long.valueOf(l1));
    if (!com.google.android.gms.common.internal.f.akn) {
      iW();
    }
    try
    {
      iX();
      iA().ih();
      iY();
      if (paramah != null) {
        paramah.hP();
      }
      if (this.adL != l2)
      {
        Object localObject = this.adF;
        if (Build.VERSION.SDK_INT > 10)
        {
          localObject = ((g)localObject).ack.mContext;
          Intent localIntent = new Intent("com.google.analytics.RADIO_POWERED");
          localIntent.addCategory(((Context)localObject).getPackageName());
          localIntent.putExtra(g.acj, true);
          ((Context)localObject).sendOrderedBroadcast(localIntent, null);
        }
      }
      return;
    }
    catch (Throwable localThrowable)
    {
      do
      {
        f("Local dispatch failed", localThrowable);
        iA().ih();
        iY();
      } while (paramah == null);
      paramah.hP();
    }
  }
  
  public final void c(c paramc)
  {
    com.google.android.gms.common.internal.w.aa(paramc);
    com.google.android.gms.c.ah.iK();
    iC();
    if (this.adM) {
      O("Hit delivery not possible. Missing network permissions. See http://goo.gl/8Rd3yj for instructions");
    }
    Object localObject2;
    while (!TextUtils.isEmpty(paramc.c("_m", "")))
    {
      localObject2 = paramc;
      iW();
      if (!this.adG.d((c)localObject2)) {
        break label364;
      }
      O("Hit sent to the device AnalyticsService for delivery");
      return;
      c("Delivering hit", paramc);
    }
    Object localObject1 = iA().acw;
    long l = ((i.a)localObject1).ik();
    if (l == 0L)
    {
      l = 0L;
      label103:
      if (l >= ((i.a)localObject1).acx) {
        break label258;
      }
      localObject1 = null;
    }
    for (;;)
    {
      localObject2 = paramc;
      if (localObject1 == null) {
        break;
      }
      localObject2 = (Long)((Pair)localObject1).second;
      localObject1 = (String)((Pair)localObject1).first;
      localObject1 = localObject2 + ":" + (String)localObject1;
      localObject2 = new HashMap(paramc.abX);
      ((Map)localObject2).put("_m", localObject1);
      localObject2 = new c(this, (Map)localObject2, paramc.aca, paramc.acc, paramc.abZ, paramc.acb, paramc.abY);
      break;
      l = Math.abs(l - ((i.a)localObject1).acy.ack.acz.currentTimeMillis());
      break label103;
      label258:
      if (l > ((i.a)localObject1).acx * 2L)
      {
        ((i.a)localObject1).ij();
        localObject1 = null;
      }
      else
      {
        localObject2 = ((i.a)localObject1).acy.act.getString(((i.a)localObject1).in(), null);
        l = ((i.a)localObject1).acy.act.getLong(((i.a)localObject1).im(), 0L);
        ((i.a)localObject1).ij();
        if ((localObject2 == null) || (l <= 0L)) {
          localObject1 = null;
        } else {
          localObject1 = new Pair(localObject2, Long.valueOf(l));
        }
      }
    }
    label364:
    if (com.google.android.gms.common.internal.f.akn)
    {
      this.ack.iE().a((c)localObject2, "Service unavailable on package side");
      return;
    }
    try
    {
      this.adD.e((c)localObject2);
      iY();
      return;
    }
    catch (SQLiteException paramc)
    {
      f("Delivery failed to save hit to a database", paramc);
      this.ack.iE().a((c)localObject2, "deliver: failed to insert hit to database");
    }
  }
  
  protected final void c(s params)
  {
    q.iK();
    d("Sending first hit to property", params.adj);
    if (iA().jdMethod_if().i(ac.js())) {}
    do
    {
      return;
      localObject = iA().ii();
    } while (TextUtils.isEmpty((CharSequence)localObject));
    Object localObject = k.a(this.ack.iE(), (String)localObject);
    d("Found relevant installation campaign", localObject);
    a(params, (ak)localObject);
  }
  
  public final long d(s params)
  {
    com.google.android.gms.common.internal.w.aa(params);
    iC();
    q.iK();
    try
    {
      this.adD.beginTransaction();
      this.adD.b(params.adh, params.adi);
      long l = this.adD.a(params.adh, params.adi, params.adj);
      params.adl = (1L + l);
      this.adD.b(params);
      this.adD.setTransactionSuccessful();
      try
      {
        this.adD.endTransaction();
        return l;
      }
      catch (SQLiteException params)
      {
        f("Failed to end transaction", params);
        return l;
      }
      try
      {
        this.adD.endTransaction();
        throw params;
      }
      catch (SQLiteException localSQLiteException)
      {
        for (;;)
        {
          f("Failed to end transaction", localSQLiteException);
        }
      }
    }
    catch (SQLiteException params)
    {
      params = params;
      f("Failed to update Analytics property", params);
      try
      {
        this.adD.endTransaction();
        return -1L;
      }
      catch (SQLiteException params)
      {
        for (;;)
        {
          f("Failed to end transaction", params);
        }
      }
    }
    finally {}
  }
  
  protected final void hS()
  {
    this.adD.iD();
    this.adE.iD();
    this.adG.iD();
  }
  
  protected final void iU()
  {
    iC();
    iA().ie();
    if (!V("android.permission.ACCESS_NETWORK_STATE"))
    {
      R("Missing required android.permission.ACCESS_NETWORK_STATE. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      jc();
    }
    if (!V("android.permission.INTERNET"))
    {
      R("Missing required android.permission.INTERNET. Google Analytics disabled. See http://goo.gl/8Rd3yj for instructions");
      jc();
    }
    if (AnalyticsService.u(this.ack.mContext)) {
      N("AnalyticsService registered in the app manifest and enabled");
    }
    for (;;)
    {
      if ((!this.adM) && (!com.google.android.gms.common.internal.f.akn) && (!this.adD.isEmpty())) {
        iW();
      }
      iY();
      return;
      if (com.google.android.gms.common.internal.f.akn) {
        R("Device AnalyticsService not registered! Hits will not be delivered reliably.");
      } else {
        Q("AnalyticsService not registered in the app manifest. Hits might not be delivered reliably. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
  }
  
  public final void iV()
  {
    try
    {
      this.adD.iP();
      iY();
      this.adJ.m(86400000L);
      return;
    }
    catch (SQLiteException localSQLiteException)
    {
      for (;;)
      {
        e("Failed to delete stale hits", localSQLiteException);
      }
    }
  }
  
  public final void iY()
  {
    long l3 = 0L;
    q.iK();
    iC();
    if ((!this.adM) && ((!com.google.android.gms.common.internal.f.akn) || (this.ack.acS.jh())) && (jb() > 0L)) {}
    for (int i = 1; i == 0; i = 0)
    {
      this.adF.unregister();
      ja();
      return;
    }
    if (this.adD.isEmpty())
    {
      this.adF.unregister();
      ja();
      return;
    }
    Object localObject;
    boolean bool;
    label257:
    long l1;
    if (!((Boolean)aj.aeX.get()).booleanValue())
    {
      localObject = this.adF;
      ((g)localObject).ib();
      if (!((g)localObject).acl)
      {
        Context localContext = ((g)localObject).ack.mContext;
        localContext.registerReceiver((BroadcastReceiver)localObject, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
        IntentFilter localIntentFilter = new IntentFilter("com.google.analytics.RADIO_POWERED");
        localIntentFilter.addCategory(localContext.getPackageName());
        localContext.registerReceiver((BroadcastReceiver)localObject, localIntentFilter);
        ((g)localObject).acm = ((g)localObject).ic();
        ((g)localObject).ack.iE().c("Registering connectivity change receiver. Network connected", Boolean.valueOf(((g)localObject).acm));
        ((g)localObject).acl = true;
      }
      localObject = this.adF;
      if (!((g)localObject).acl) {
        ((g)localObject).ack.iE().Q("Connectivity unknown. Receiver not registered");
      }
      bool = ((g)localObject).acm;
      if (!bool) {
        break label537;
      }
      iZ();
      l2 = jb();
      l1 = iA().ig();
      if (l1 == 0L) {
        break label406;
      }
      l1 = l2 - Math.abs(this.ack.acz.currentTimeMillis() - l1);
      if (l1 <= 0L) {
        break label394;
      }
      label313:
      c("Dispatch scheduled (ms)", Long.valueOf(l1));
      if (!this.adI.jt()) {
        break label528;
      }
      localObject = this.adI;
      if (((ae)localObject).aei != 0L) {
        break label418;
      }
    }
    label394:
    label406:
    label418:
    for (long l2 = 0L;; l2 = Math.abs(((ae)localObject).ack.acz.currentTimeMillis() - ((ae)localObject).aei))
    {
      l1 = Math.max(1L, l1 + l2);
      localObject = this.adI;
      if (!((ae)localObject).jt()) {
        break;
      }
      if (l1 >= 0L) {
        break label445;
      }
      ((ae)localObject).cancel();
      return;
      bool = true;
      break label257;
      l1 = Math.min(ac.jk(), l2);
      break label313;
      l1 = Math.min(ac.jk(), l2);
      break label313;
    }
    label445:
    l1 -= Math.abs(((ae)localObject).ack.acz.currentTimeMillis() - ((ae)localObject).aei);
    if (l1 < 0L) {
      l1 = l3;
    }
    for (;;)
    {
      ((ae)localObject).getHandler().removeCallbacks(((ae)localObject).aeh);
      if (((ae)localObject).getHandler().postDelayed(((ae)localObject).aeh, l1)) {
        break;
      }
      ((ae)localObject).ack.iE().f("Failed to adjust delayed post. time", Long.valueOf(l1));
      return;
      label528:
      this.adI.m(l1);
      return;
      label537:
      ja();
      iZ();
      return;
    }
  }
  
  public final void iw()
  {
    com.google.android.gms.c.ah.iK();
    iC();
    N("Service disconnected");
  }
  
  final void ix()
  {
    q.iK();
    this.adL = this.ack.acz.currentTimeMillis();
  }
  
  protected final void onServiceConnected()
  {
    
    if (!com.google.android.gms.common.internal.f.akn)
    {
      com.google.android.gms.c.ah.iK();
      iC();
      iy();
      if (!ac.ji()) {
        Q("Service client disabled. Can't dispatch local hits to device AnalyticsService");
      }
      if (this.adG.isConnected()) {
        break label50;
      }
      N("Service not connected");
    }
    label50:
    while (this.adD.isEmpty()) {
      return;
    }
    N("Dispatching local hits to device AnalyticsService");
    for (;;)
    {
      try
      {
        List localList = this.adD.k(ac.jm());
        if (!localList.isEmpty()) {
          break label126;
        }
        iY();
        return;
      }
      catch (SQLiteException localSQLiteException1)
      {
        f("Failed to read hits from store", localSQLiteException1);
        ja();
        return;
      }
      label107:
      Object localObject;
      localSQLiteException1.remove(localObject);
      try
      {
        this.adD.l(((c)localObject).abZ);
        label126:
        if (!localSQLiteException1.isEmpty())
        {
          localObject = (c)localSQLiteException1.get(0);
          if (this.adG.d((c)localObject)) {
            break label107;
          }
          iY();
          return;
        }
      }
      catch (SQLiteException localSQLiteException2)
      {
        f("Failed to remove hit that was send for delivery", localSQLiteException2);
        ja();
      }
    }
  }
  
  final void start()
  {
    iC();
    boolean bool;
    Context localContext;
    if (!this.mP)
    {
      bool = true;
      com.google.android.gms.common.internal.w.b(bool, "Analytics backend already started");
      this.mP = true;
      if (!com.google.android.gms.common.internal.f.akn)
      {
        localContext = this.ack.mContext;
        if (AnalyticsReceiver.t(localContext)) {
          break label91;
        }
        Q("AnalyticsReceiver is not registered or is disabled. Register the receiver for reliable dispatching on non-Google Play devices. See http://goo.gl/8Rd3yj for instructions.");
        label53:
        if (CampaignTrackingReceiver.t(localContext)) {
          break label108;
        }
        Q("CampaignTrackingReceiver is not registered, not exported or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
    for (;;)
    {
      this.ack.iF().c(new Runnable()
      {
        public final void run()
        {
          w.this.iU();
        }
      });
      return;
      bool = false;
      break;
      label91:
      if (AnalyticsService.u(localContext)) {
        break label53;
      }
      R("AnalyticsService is not registered or is disabled. Analytics service at risk of not starting. See http://goo.gl/8Rd3yj for instructions.");
      break label53;
      label108:
      if (!CampaignTrackingService.u(localContext)) {
        Q("CampaignTrackingService is not registered or is disabled. Installation campaign tracking is not possible. See http://goo.gl/8Rd3yj for instructions.");
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\google\android\gms\analytics\internal\w.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */