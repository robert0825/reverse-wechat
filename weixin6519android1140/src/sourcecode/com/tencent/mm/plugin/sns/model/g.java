package com.tencent.mm.plugin.sns.model;

import android.app.Activity;
import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.memory.n;
import com.tencent.mm.modelcontrol.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sight.decode.ui.SightPlayImageView;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.r;
import com.tencent.mm.plugin.sns.ui.TagImageView;
import com.tencent.mm.pointers.PInt;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.aul;
import com.tencent.mm.protocal.c.azp;
import com.tencent.mm.protocal.c.bfh;
import com.tencent.mm.protocal.c.bfp;
import com.tencent.mm.sdk.platformtools.ab;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.bh;
import com.tencent.mm.sdk.platformtools.d;
import com.tencent.mm.sdk.platformtools.k;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.widget.MMPinProgressBtn;
import com.tencent.mm.ui.widget.QDisFadeImageView;
import com.tencent.mm.ui.widget.QFadeImageView;
import com.tencent.mm.ui.widget.QImageView;
import com.tencent.mm.ui.widget.QImageView.a;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ConcurrentHashMap;

public final class g
  implements com.tencent.mm.plugin.sns.b.f
{
  public static int prA;
  Map<Integer, WeakReference<Object>> gHB;
  public boolean pqS;
  public long prd;
  public long pre;
  public com.tencent.mm.sdk.platformtools.y<String, n> prf;
  public ak<String, WeakReference<Bitmap>> prg;
  private Map<String, LinkedList<WeakReference<c>>> prh;
  private ConcurrentHashMap<Integer, String> pri;
  public LinkedList<b> prj;
  public boolean prk;
  public HashSet<c> prl;
  public HashMap<String, Integer> prm;
  private int prn;
  public com.tencent.mm.plugin.sns.ui.y pro;
  public long prp;
  public long prq;
  private int prr;
  private int prs;
  private HashMap<Long, Integer> prt;
  private HashMap<Integer, Boolean> pru;
  private HashMap<Integer, Boolean> prv;
  private int prw;
  private int prx;
  private HashMap<Long, Integer> pry;
  protected Set<String> prz;
  
  static
  {
    GMTrace.i(8141781598208L, 60661);
    prA = 0;
    GMTrace.o(8141781598208L, 60661);
  }
  
  public g()
  {
    GMTrace.i(8132252139520L, 60590);
    this.prd = 0L;
    this.pre = 0L;
    this.gHB = new HashMap();
    this.prh = new HashMap();
    this.pri = new ConcurrentHashMap();
    this.prj = new LinkedList();
    this.prk = false;
    this.prl = new HashSet();
    this.prm = new HashMap();
    this.prn = 4;
    this.pqS = true;
    this.prp = 0L;
    this.prq = 0L;
    this.prr = 0;
    this.prs = 0;
    this.prt = new HashMap();
    this.pru = new HashMap();
    this.prv = new HashMap();
    this.prw = 0;
    this.prx = 0;
    this.pry = new HashMap();
    this.prz = new HashSet();
    int i = ((ActivityManager)ab.getContext().getSystemService("activity")).getLargeMemoryClass();
    w.i("MicroMsg.LazyerImageLoader2", "BitmapPool %dMB", new Object[] { Integer.valueOf(i) });
    if (i > 256) {}
    for (i = 10485760;; i = 5242880)
    {
      this.prf = new com.tencent.mm.sdk.platformtools.y(i)
      {
        public final void trimToSize(int paramAnonymousInt)
        {
          GMTrace.i(8142855340032L, 60669);
          try
          {
            super.trimToSize(paramAnonymousInt);
            GMTrace.o(8142855340032L, 60669);
            return;
          }
          catch (Exception localException)
          {
            w.e("MicroMsg.LazyerImageLoader2", "trimToSize error: %s", new Object[] { localException.getMessage() });
            GMTrace.o(8142855340032L, 60669);
          }
        }
      };
      this.prg = new ak(this.prn, new ak.a()
      {
        public final boolean bp(Object paramAnonymousObject)
        {
          GMTrace.i(8142050033664L, 60663);
          String str = (String)paramAnonymousObject;
          paramAnonymousObject = g.this;
          int i;
          Object localObject;
          if ((((g)paramAnonymousObject).prl == null) || (((g)paramAnonymousObject).prl.size() == 0))
          {
            i = 1;
            if (i == 0) {
              break label531;
            }
            localObject = g.this.prg;
          }
          for (;;)
          {
            try
            {
              paramAnonymousObject = ((ak.b)((ak)localObject).pvr.get(str)).obj;
              if (!(paramAnonymousObject instanceof Bitmap)) {
                continue;
              }
              paramAnonymousObject = (Bitmap)paramAnonymousObject;
              if ((paramAnonymousObject != null) && (!((Bitmap)paramAnonymousObject).isRecycled()))
              {
                w.d("MicroMsg.SnsLRUMap", "remove key:" + str);
                ((Bitmap)paramAnonymousObject).recycle();
              }
            }
            catch (Exception paramAnonymousObject)
            {
              Iterator localIterator;
              g.c localc;
              w.printErrStackTrace("MicroMsg.SnsLRUMap", (Throwable)paramAnonymousObject, "", new Object[0]);
              w.e("MicroMsg.SnsLRUMap", "can not recycled forceRemove ");
              continue;
              boolean bool = false;
              continue;
            }
            i = ((ak)localObject).pvr.size();
            paramAnonymousObject = ((ak)localObject).pvr.remove(str);
            localObject = new StringBuilder("internalMap ").append(((ak)localObject).pvr.size()).append(" bfSize :").append(i).append(" o == null ");
            if (paramAnonymousObject != null)
            {
              bool = true;
              w.d("MicroMsg.SnsLRUMap", bool);
              w.i("MicroMsg.LazyerImageLoader2", "keys " + str + " deRef ok  Big:size:" + g.this.prg.pvr.size() + " listPaitSize:" + g.this.prl.size());
              GMTrace.o(8142050033664L, 60663);
              return true;
              localObject = ((g)paramAnonymousObject).gHB.keySet().iterator();
              if (((Iterator)localObject).hasNext())
              {
                i = ((Integer)((Iterator)localObject).next()).intValue();
                if (((WeakReference)((g)paramAnonymousObject).gHB.get(Integer.valueOf(i))).get() != null) {
                  continue;
                }
                localIterator = ((g)paramAnonymousObject).prl.iterator();
                if (!localIterator.hasNext()) {
                  continue;
                }
                localc = (g.c)localIterator.next();
                if (localc.code != i) {
                  continue;
                }
                ((g)paramAnonymousObject).prl.remove(localc);
                w.d("MicroMsg.LazyerImageLoader2", "remove code ok rCode: " + i);
                continue;
              }
              paramAnonymousObject = ((g)paramAnonymousObject).prl.iterator();
              if (((Iterator)paramAnonymousObject).hasNext())
              {
                localObject = (g.c)((Iterator)paramAnonymousObject).next();
                if ((str == null) || (!str.equals(((g.c)localObject).id))) {
                  continue;
                }
                i = 0;
                break;
              }
              i = 1;
              break;
              paramAnonymousObject = (WeakReference)((ak.b)((ak)localObject).pvr.get(str)).obj;
              if (paramAnonymousObject == null) {
                break label541;
              }
              paramAnonymousObject = (Bitmap)((WeakReference)paramAnonymousObject).get();
              continue;
            }
            label531:
            GMTrace.o(8142050033664L, 60663);
            return false;
            label541:
            paramAnonymousObject = null;
          }
        }
      });
      GMTrace.o(8132252139520L, 60590);
      return;
    }
  }
  
  public static String B(anu paramanu)
  {
    GMTrace.i(8138291937280L, 60635);
    if (paramanu == null)
    {
      GMTrace.o(8138291937280L, 60635);
      return null;
    }
    if (paramanu.mmR.startsWith("pre_temp_sns_pic")) {
      paramanu = ae.getAccSnsTmpPath() + paramanu.mmR;
    }
    for (;;)
    {
      GMTrace.o(8138291937280L, 60635);
      return paramanu;
      if (paramanu.mmR.startsWith("Locall_path")) {
        paramanu = am.dE(ae.getAccSnsPath(), paramanu.mmR) + com.tencent.mm.plugin.sns.data.i.m(paramanu);
      } else if (paramanu.mmR.startsWith("pre_temp_extend_pic")) {
        paramanu = paramanu.mmR.substring(19);
      } else {
        paramanu = am.dE(ae.getAccSnsPath(), paramanu.mmR) + com.tencent.mm.plugin.sns.data.i.d(paramanu);
      }
    }
  }
  
  private boolean D(View paramView, int paramInt)
  {
    GMTrace.i(8132654792704L, 60593);
    if (paramView.hashCode() == paramInt)
    {
      GMTrace.o(8132654792704L, 60593);
      return true;
    }
    if ((paramView instanceof ViewGroup))
    {
      paramView = (ViewGroup)paramView;
      int i = paramView.getChildCount();
      int j;
      do
      {
        j = i - 1;
        if (j < 0) {
          break;
        }
        i = j;
      } while (!D(paramView.getChildAt(j), paramInt));
      GMTrace.o(8132654792704L, 60593);
      return true;
    }
    GMTrace.o(8132654792704L, 60593);
    return false;
  }
  
  public static Bitmap a(String paramString1, String paramString2, String paramString3, boolean paramBoolean, an paraman)
  {
    GMTrace.i(8138023501824L, 60633);
    if ((!paramBoolean) && (bg.nm(paramString1)))
    {
      GMTrace.o(8138023501824L, 60633);
      return null;
    }
    anu localanu = com.tencent.mm.modelsns.e.a(paramString3, 2, paramString2, paramString2, 1, 1, "");
    com.tencent.mm.plugin.sns.data.i.ar(2, paramString3);
    if (paramString3.equals(""))
    {
      paramString1 = com.tencent.mm.plugin.sns.data.i.GU(paramString1);
      if (com.tencent.mm.plugin.sns.data.i.m(paramString1))
      {
        GMTrace.o(8138023501824L, 60633);
        return paramString1;
      }
      GMTrace.o(8138023501824L, 60633);
      return null;
    }
    if (com.tencent.mm.plugin.sns.data.i.m(null))
    {
      GMTrace.o(8138023501824L, 60633);
      return null;
    }
    Object localObject = com.tencent.mm.plugin.sns.data.i.l(localanu);
    localObject = com.tencent.mm.plugin.sns.data.i.GU(am.dE(ae.getAccSnsPath(), paramString3) + (String)localObject);
    paramString3 = (String)localObject;
    if (!com.tencent.mm.plugin.sns.data.i.m((Bitmap)localObject)) {
      paramString3 = com.tencent.mm.plugin.sns.data.i.GU(paramString1);
    }
    if ((paramString3 == null) && (paramBoolean) && (!bg.nm(paramString2))) {
      ae.biY().a(localanu, 3, null, paraman);
    }
    if (!com.tencent.mm.plugin.sns.data.i.m(paramString3))
    {
      GMTrace.o(8138023501824L, 60633);
      return null;
    }
    GMTrace.o(8138023501824L, 60633);
    return paramString3;
  }
  
  private void a(Object paramObject, String paramString, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8135204929536L, 60612);
    a(paramObject, paramString, true, paramInt1, paramInt2, -1, -1, paramInt3);
    GMTrace.o(8135204929536L, 60612);
  }
  
  private static void a(Object paramObject, String paramString, n paramn)
  {
    long l2 = 0L;
    GMTrace.i(8133996969984L, 60603);
    if (paramObject == null)
    {
      GMTrace.o(8133996969984L, 60603);
      return;
    }
    if (paramn != null) {
      w.i("MicroMsg.LazyerImageLoader2", "setImageDrawable %s %s %s", new Object[] { paramObject, paramString, paramn.yt() });
    }
    Object localObject;
    long l1;
    if ((paramObject instanceof QFadeImageView))
    {
      paramObject = (QFadeImageView)paramObject;
      localObject = ((QImageView)paramObject).mDrawable;
      l1 = l2;
      if (!bg.nm(((QFadeImageView)paramObject).amf))
      {
        l1 = l2;
        if (((QFadeImageView)paramObject).amf.equals(paramString)) {
          l1 = ((QFadeImageView)paramObject).lFs;
        }
      }
      if ((localObject == null) || (!(localObject instanceof ah))) {
        break label404;
      }
      l1 = ((ah)localObject).lFs;
    }
    label390:
    label404:
    for (;;)
    {
      paramn = new ah(paramString, paramn, l1);
      ((QFadeImageView)paramObject).lFs = paramn.lFs;
      ((QFadeImageView)paramObject).amf = paramString;
      ((QFadeImageView)paramObject).setImageDrawable(paramn);
      paramn.invalidateSelf();
      GMTrace.o(8133996969984L, 60603);
      return;
      if ((paramObject instanceof QDisFadeImageView))
      {
        paramObject = (QDisFadeImageView)paramObject;
        paramString = new com.tencent.mm.memory.a.a(paramString, paramn);
        ((QDisFadeImageView)paramObject).setImageDrawable(paramString);
        paramString.invalidateSelf();
        GMTrace.o(8133996969984L, 60603);
        return;
      }
      if ((paramObject instanceof ImageView))
      {
        localObject = (ImageView)paramObject;
        paramObject = ((ImageView)localObject).getDrawable();
        if ((paramObject != null) && ((paramObject instanceof ah))) {}
        for (paramObject = new ah(paramString, paramn, ((ah)paramObject).lFs);; paramObject = new ah(paramString, paramn, 0L))
        {
          ((ImageView)localObject).setImageDrawable((Drawable)paramObject);
          ((ah)paramObject).invalidateSelf();
          GMTrace.o(8133996969984L, 60603);
          return;
        }
      }
      if ((paramObject instanceof com.tencent.mm.plugin.sight.decode.a.a))
      {
        w.i("MicroMsg.LazyerImageLoader2", "update sight thumb " + paramString);
        if ((paramObject instanceof SightPlayImageView))
        {
          localObject = (SightPlayImageView)paramObject;
          paramObject = ((QImageView)localObject).mDrawable;
          if ((paramObject == null) || (!(paramObject instanceof ah))) {
            break label390;
          }
        }
      }
      for (paramObject = new ah(paramString, paramn, ((ah)paramObject).lFs);; paramObject = new ah(paramString, paramn, 0L))
      {
        ((SightPlayImageView)localObject).setImageDrawable((Drawable)paramObject);
        ((ah)paramObject).invalidateSelf();
        GMTrace.o(8133996969984L, 60603);
        return;
      }
    }
  }
  
  private void a(Object paramObject, String paramString, boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4, int paramInt5)
  {
    GMTrace.i(8135339147264L, 60613);
    if (paramObject == null)
    {
      GMTrace.o(8135339147264L, 60613);
      return;
    }
    int i = paramObject.hashCode();
    this.prl.remove(new c(null, i, 0, false));
    c localc = new c(paramString, i, paramInt2, paramBoolean);
    this.prl.add(localc);
    LinkedList localLinkedList = (LinkedList)this.prh.get(paramString);
    Object localObject = localLinkedList;
    if (localLinkedList == null)
    {
      localObject = new LinkedList();
      this.prh.put(paramString, localObject);
    }
    ((LinkedList)localObject).add(new WeakReference(localc));
    localObject = (String)((View)paramObject).getTag(2130706432);
    if (localObject != null)
    {
      localLinkedList = (LinkedList)this.prh.get(localObject);
      if (localLinkedList != null)
      {
        paramInt2 = 0;
        if (paramInt2 >= localLinkedList.size()) {
          break label505;
        }
        localc = (c)((WeakReference)localLinkedList.get(paramInt2)).get();
        if ((localc == null) || (localc.code != i)) {
          break label352;
        }
      }
    }
    for (;;)
    {
      if (paramInt2 != -1)
      {
        w.v("MicroMsg.LazyerImageLoader2", "updateImageViewToKey remove last pair %s", new Object[] { localObject });
        localLinkedList.remove(paramInt2);
      }
      ((View)paramObject).setTag(2130706432, paramString);
      localObject = new WeakReference(paramObject);
      this.gHB.put(Integer.valueOf(i), localObject);
      if (paramInt1 != -1)
      {
        if (!(paramObject instanceof QFadeImageView)) {
          break label361;
        }
        ((QFadeImageView)paramObject).setImageResource(paramInt1);
      }
      for (;;)
      {
        if ((paramInt5 == a.prL) && (((paramObject instanceof ImageView)) || ((paramObject instanceof QFadeImageView))))
        {
          k.bC((View)paramObject);
          GMTrace.o(8135339147264L, 60613);
          return;
          label352:
          paramInt2 += 1;
          break;
          label361:
          if ((paramObject instanceof ImageView))
          {
            ((ImageView)paramObject).setImageDrawable(com.tencent.mm.br.a.b(((ImageView)paramObject).getContext(), paramInt1));
          }
          else
          {
            localObject = (com.tencent.mm.plugin.sight.decode.a.a)paramObject;
            if (!this.pqS) {}
            for (paramBoolean = true;; paramBoolean = false)
            {
              ((com.tencent.mm.plugin.sight.decode.a.a)localObject).ar(null, paramBoolean);
              break;
            }
          }
        }
      }
      if ((paramString != null) && (paramString.startsWith("3")) && (((paramObject instanceof ImageView)) || ((paramObject instanceof QFadeImageView))))
      {
        k.i((View)paramObject, paramInt3, paramInt4);
        w.d("MicroMsg.LazyerImageLoader2", "try to setlayerType " + paramInt3 + " " + paramInt4);
      }
      GMTrace.o(8135339147264L, 60613);
      return;
      label505:
      paramInt2 = -1;
    }
  }
  
  private boolean a(final int paramInt, final anu paramanu, final an paraman)
  {
    GMTrace.i(8135741800448L, 60616);
    if (!this.pqS)
    {
      GMTrace.o(8135741800448L, 60616);
      return false;
    }
    ae.biQ().post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8092657909760L, 60295);
        if (!g.this.a(paramInt, paramanu))
        {
          com.tencent.mm.plugin.sns.data.e locale = new com.tencent.mm.plugin.sns.data.e(paramanu);
          locale.pph = paramInt;
          locale.mDZ = paramanu.mmR;
          ae.biY().a(paramanu, 1, locale, paraman);
        }
        GMTrace.o(8092657909760L, 60295);
      }
    });
    GMTrace.o(8135741800448L, 60616);
    return true;
  }
  
  public static boolean a(anu paramanu, an paraman)
  {
    GMTrace.i(8138157719552L, 60634);
    if ((paramanu == null) || (paramanu.mmR == null) || (paramanu.mmR.equals("")))
    {
      GMTrace.o(8138157719552L, 60634);
      return false;
    }
    if (paramanu.mmR.startsWith("Locall_path")) {}
    for (String str = am.dE(ae.getAccSnsPath(), paramanu.mmR) + com.tencent.mm.plugin.sns.data.i.m(paramanu); !FileOp.aZ(str); str = am.dE(ae.getAccSnsPath(), paramanu.mmR) + com.tencent.mm.plugin.sns.data.i.d(paramanu))
    {
      ae.biY().a(paramanu, 2, null, paraman);
      GMTrace.o(8138157719552L, 60634);
      return false;
    }
    GMTrace.o(8138157719552L, 60634);
    return true;
  }
  
  private static boolean bK(String paramString, int paramInt)
  {
    GMTrace.i(8136547106816L, 60622);
    paramString = bh.q(paramString, "SightDownloadControl");
    if ((paramString == null) || (paramString.isEmpty()))
    {
      GMTrace.o(8136547106816L, 60622);
      return true;
    }
    if (paramInt == 1)
    {
      if (bg.getInt((String)paramString.get(".SightDownloadControl.G3PlusAutoDownload"), 0) == 1)
      {
        GMTrace.o(8136547106816L, 60622);
        return true;
      }
      GMTrace.o(8136547106816L, 60622);
      return false;
    }
    if (bg.getInt((String)paramString.get(".SightDownloadControl.WifiAutoDownload"), 0) == 1)
    {
      GMTrace.o(8136547106816L, 60622);
      return true;
    }
    GMTrace.o(8136547106816L, 60622);
    return false;
  }
  
  private static void cr(View paramView)
  {
    GMTrace.i(8134936494080L, 60610);
    if ((paramView instanceof QImageView))
    {
      ((QImageView)paramView).a(QImageView.a.xsr);
      ((QImageView)paramView).setImageResource(i.e.oXB);
      GMTrace.o(8134936494080L, 60610);
      return;
    }
    if ((paramView instanceof ImageView))
    {
      ((ImageView)paramView).setImageResource(i.e.oXB);
      GMTrace.o(8134936494080L, 60610);
      return;
    }
    GMTrace.o(8134936494080L, 60610);
  }
  
  public static String r(anu paramanu)
  {
    GMTrace.i(8134131187712L, 60604);
    if ((paramanu == null) || (paramanu.mmR == null) || (paramanu.mmR.equals("")))
    {
      GMTrace.o(8134131187712L, 60604);
      return null;
    }
    String str = am.dE(ae.getAccSnsPath(), paramanu.mmR) + com.tencent.mm.plugin.sns.data.i.e(paramanu);
    if (!FileOp.aZ(str))
    {
      paramanu = paramanu.uCO;
      GMTrace.o(8134131187712L, 60604);
      return paramanu;
    }
    GMTrace.o(8134131187712L, 60604);
    return str;
  }
  
  public static String s(anu paramanu)
  {
    GMTrace.i(8134265405440L, 60605);
    if ((paramanu == null) || (paramanu.mmR == null) || (paramanu.mmR.equals("")))
    {
      GMTrace.o(8134265405440L, 60605);
      return null;
    }
    String str = am.dE(ae.getAccSnsPath(), paramanu.mmR) + com.tencent.mm.plugin.sns.data.i.d(paramanu);
    if (!FileOp.aZ(str))
    {
      paramanu = paramanu.lPM;
      GMTrace.o(8134265405440L, 60605);
      return paramanu;
    }
    GMTrace.o(8134265405440L, 60605);
    return str;
  }
  
  public static boolean t(anu paramanu)
  {
    GMTrace.i(8135876018176L, 60617);
    String str1 = am.dE(ae.getAccSnsPath(), paramanu.mmR);
    String str2 = com.tencent.mm.plugin.sns.data.i.j(paramanu);
    if (FileOp.aZ(str1 + str2))
    {
      GMTrace.o(8135876018176L, 60617);
      return true;
    }
    if ((FileOp.aZ(str1 + com.tencent.mm.plugin.sns.data.i.p(paramanu))) && (!bg.nm(paramanu.mmR)) && (paramanu.mmR.startsWith("Locall_path")))
    {
      GMTrace.o(8135876018176L, 60617);
      return true;
    }
    GMTrace.o(8135876018176L, 60617);
    return false;
  }
  
  public final boolean A(anu paramanu)
  {
    GMTrace.i(16639374393344L, 123973);
    if ((paramanu == null) || (paramanu.mmR == null) || (paramanu.mmR.equals("")))
    {
      GMTrace.o(16639374393344L, 123973);
      return false;
    }
    if (FileOp.aZ(am.dE(ae.getAccSnsPath(), paramanu.mmR) + com.tencent.mm.plugin.sns.data.i.f(paramanu)))
    {
      GMTrace.o(16639374393344L, 123973);
      return true;
    }
    if (FileOp.aZ(am.dE(ae.getAccSnsPath(), paramanu.mmR) + com.tencent.mm.plugin.sns.data.i.e(paramanu)))
    {
      GMTrace.o(16639374393344L, 123973);
      return true;
    }
    paramanu = com.tencent.mm.plugin.sns.data.i.ar(1, paramanu.mmR);
    boolean bool = com.tencent.mm.plugin.sns.data.i.a((n)this.prf.get(paramanu));
    GMTrace.o(16639374393344L, 123973);
    return bool;
  }
  
  public final n Hj(String paramString)
  {
    GMTrace.i(8133594316800L, 60600);
    n localn = (n)this.prf.get(paramString);
    if ((localn == null) || (localn.isRecycled()))
    {
      this.prf.remove(paramString);
      GMTrace.o(8133594316800L, 60600);
      return null;
    }
    GMTrace.o(8133594316800L, 60600);
    return localn;
  }
  
  public final void Hk(String paramString)
  {
    GMTrace.i(8137889284096L, 60632);
    b(paramString, null);
    GMTrace.o(8137889284096L, 60632);
  }
  
  public final void K(Activity paramActivity)
  {
    GMTrace.i(8132789010432L, 60594);
    w.d("MicroMsg.LazyerImageLoader2", "try to remove ImageView " + this.gHB.size());
    Object localObject1 = new LinkedList();
    Object localObject2 = this.prl.iterator();
    Object localObject3;
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (c)((Iterator)localObject2).next();
      if (D(paramActivity.getWindow().getDecorView(), ((c)localObject3).code)) {
        ((List)localObject1).add(Integer.valueOf(((c)localObject3).code));
      }
    }
    localObject2 = ((List)localObject1).iterator();
    int i;
    for (;;)
    {
      if (!((Iterator)localObject2).hasNext()) {
        break label214;
      }
      i = ((Integer)((Iterator)localObject2).next()).intValue();
      this.gHB.remove(Integer.valueOf(i));
      localObject3 = this.prl.iterator();
      if (((Iterator)localObject3).hasNext())
      {
        c localc = (c)((Iterator)localObject3).next();
        if (localc.code != i) {
          break;
        }
        this.prl.remove(localc);
      }
    }
    label214:
    ((List)localObject1).clear();
    localObject2 = this.prl.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      localObject3 = (c)((Iterator)localObject2).next();
      if (((c)localObject3).prO == paramActivity.hashCode()) {
        ((List)localObject1).add(Integer.valueOf(((c)localObject3).code));
      }
    }
    paramActivity = ((List)localObject1).iterator();
    for (;;)
    {
      if (!paramActivity.hasNext()) {
        break label374;
      }
      i = ((Integer)paramActivity.next()).intValue();
      this.gHB.remove(Integer.valueOf(i));
      localObject1 = this.prl.iterator();
      if (((Iterator)localObject1).hasNext())
      {
        localObject2 = (c)((Iterator)localObject1).next();
        if (((c)localObject2).code != i) {
          break;
        }
        this.prl.remove(localObject2);
      }
    }
    label374:
    this.prg.bjA();
    w.d("MicroMsg.LazyerImageLoader2", "after try to remove ImageView " + this.gHB.size());
    GMTrace.o(8132789010432L, 60594);
  }
  
  public final int a(m paramm, int[] paramArrayOfInt)
  {
    int j = 5;
    GMTrace.i(8136144453632L, 60619);
    Object localObject;
    PInt localPInt1;
    PInt localPInt2;
    if ((paramArrayOfInt != null) || (bg.aI(this.prp) > 60000L))
    {
      localObject = new PInt();
      localPInt1 = new PInt();
      localPInt2 = new PInt();
      c.Gs();
      if (!c.a((PInt)localObject, localPInt1, localPInt2)) {
        break label155;
      }
      this.prr = 5;
      if (paramArrayOfInt != null) {
        if (((PInt)localObject).value != 0) {
          break label164;
        }
      }
    }
    label155:
    label164:
    for (int i = 0;; i = 1)
    {
      paramArrayOfInt[0] = i;
      paramArrayOfInt[1] = localPInt1.value;
      paramArrayOfInt[2] = localPInt2.value;
      this.prs = ((PInt)localObject).value;
      this.prp = bg.Pw();
      if ((this.prs != 0) && (paramm != null)) {
        break label169;
      }
      i = this.prr;
      GMTrace.o(8136144453632L, 60619);
      return i;
      this.prr = 10;
      break;
    }
    label169:
    if (this.prt.containsKey(Long.valueOf(paramm.field_snsId)))
    {
      i = ((Integer)this.prt.get(Long.valueOf(paramm.field_snsId))).intValue();
      GMTrace.o(8136144453632L, 60619);
      return i;
    }
    paramArrayOfInt = new bfp();
    try
    {
      localObject = (bfh)new bfh().aD(paramm.field_attrBuf);
      if (((bfh)localObject).uRd == null)
      {
        i = this.prr;
        GMTrace.o(8136144453632L, 60619);
        return i;
      }
      paramArrayOfInt.aD(((bfh)localObject).uRd.uNP.tJp);
      if ((paramArrayOfInt.uRs == null) || (paramArrayOfInt.uRs.info == null))
      {
        i = this.prr;
        GMTrace.o(8136144453632L, 60619);
        return i;
      }
    }
    catch (Exception paramm)
    {
      w.printErrStackTrace("MicroMsg.LazyerImageLoader2", paramm, "", new Object[0]);
      i = this.prr;
      GMTrace.o(8136144453632L, 60619);
      return i;
    }
    paramArrayOfInt = paramArrayOfInt.uRs.info;
    i = paramArrayOfInt.hashCode();
    if (this.prs == 1)
    {
      if (!this.prv.containsKey(Integer.valueOf(i))) {
        this.prv.put(Integer.valueOf(i), Boolean.valueOf(bK(paramArrayOfInt, this.prs)));
      }
      if (((Boolean)this.prv.get(Integer.valueOf(i))).booleanValue()) {}
      for (i = 5;; i = 10)
      {
        w.i("MicroMsg.LazyerImageLoader2", "isAutoDownload(sight_autodownload) snsID:%d, result:%d", new Object[] { Long.valueOf(paramm.field_snsId), Integer.valueOf(i) });
        this.prt.put(Long.valueOf(paramm.field_snsId), Integer.valueOf(i));
        GMTrace.o(8136144453632L, 60619);
        return i;
      }
    }
    if (!this.pru.containsKey(Integer.valueOf(i))) {
      this.pru.put(Integer.valueOf(i), Boolean.valueOf(bK(paramArrayOfInt, this.prs)));
    }
    if (((Boolean)this.pru.get(Integer.valueOf(i))).booleanValue()) {}
    for (i = j;; i = 10) {
      break;
    }
  }
  
  public final Bitmap a(anu paramanu, View paramView, int paramInt, boolean paramBoolean, an paraman)
  {
    GMTrace.i(8138426155008L, 60636);
    if ((paramanu == null) || (paramanu.mmR == null) || (paramanu.mmR.equals("")))
    {
      GMTrace.o(8138426155008L, 60636);
      return null;
    }
    String str = com.tencent.mm.plugin.sns.data.i.ar(3, paramanu.mmR);
    Object localObject1 = B(paramanu);
    int j = -1;
    int k = -1;
    int i = j;
    try
    {
      localObject2 = d.RB((String)localObject1);
      i = j;
      j = ((BitmapFactory.Options)localObject2).outWidth;
      i = j;
      int m = ((BitmapFactory.Options)localObject2).outHeight;
      k = m;
      i = j;
    }
    catch (Exception localException)
    {
      Object localObject2;
      boolean bool;
      for (;;) {}
    }
    a(paramView, str, false, -1, paramInt, i, k, a.prK);
    paramView = ae.biY();
    localObject2 = paramanu.mmR;
    if (paramView.pqU.containsKey(com.tencent.mm.plugin.sns.data.i.as(2, (String)localObject2))) {}
    for (paramInt = 1; paramInt != 0; paramInt = 0)
    {
      GMTrace.o(8138426155008L, 60636);
      return null;
    }
    paramView = this.prg;
    localObject2 = (ak.b)paramView.pvr.get(str);
    if (localObject2 == null)
    {
      paramView = null;
      paramView = (WeakReference)paramView;
      localObject2 = new StringBuilder("getFromWeakReference ").append(str).append("  ");
      if (paramView != null) {
        break label302;
      }
      bool = true;
      label237:
      w.i("MicroMsg.LazyerImageLoader2", bool);
      if (paramView != null) {
        break label308;
      }
    }
    label302:
    label308:
    for (paramView = null;; paramView = (Bitmap)paramView.get())
    {
      if (!com.tencent.mm.plugin.sns.data.i.m(paramView)) {
        break label319;
      }
      GMTrace.o(8138426155008L, 60636);
      return paramView;
      ((ak.b)paramView.pvr.get(str)).bjB();
      paramView = ((ak.b)localObject2).obj;
      break;
      bool = false;
      break label237;
    }
    label319:
    if (paramanu.mmR.startsWith("pre_temp_extend_pic"))
    {
      paramView = r.IJ((String)localObject1);
      localObject1 = this.prg;
      localObject2 = new WeakReference(paramView);
      if ((ak.b)((ak)localObject1).pvr.get(str) != null) {
        break label432;
      }
      localObject2 = new ak.b((ak)localObject1, localObject2);
      ((ak)localObject1).pvr.put(str, localObject2);
      ((ak)localObject1).bjA();
    }
    for (;;)
    {
      if (!com.tencent.mm.plugin.sns.data.i.m(paramView)) {
        break label473;
      }
      GMTrace.o(8138426155008L, 60636);
      return paramView;
      paramView = com.tencent.mm.plugin.sns.data.i.GU((String)localObject1);
      break;
      label432:
      ((ak.b)((ak)localObject1).pvr.get(str)).bjB();
      ((ak.b)((ak)localObject1).pvr.get(str)).obj = localObject2;
    }
    label473:
    if (paramBoolean) {
      ae.biY().a(paramanu, 2, null, paraman);
    }
    GMTrace.o(8138426155008L, 60636);
    return null;
  }
  
  public final n a(anu paramanu, ImageView paramImageView, int paramInt, an paraman)
  {
    GMTrace.i(8138560372736L, 60637);
    if ((paramanu == null) || (paramanu.mmR == null) || (paramanu.mmR.equals("")))
    {
      GMTrace.o(8138560372736L, 60637);
      return null;
    }
    paramImageView.setDrawingCacheEnabled(false);
    String str = com.tencent.mm.plugin.sns.data.i.ar(0, paramanu.mmR);
    a(paramImageView, str, -1, paramInt);
    paramImageView = paramanu.mmR;
    paramImageView = Hj(str);
    if (!com.tencent.mm.plugin.sns.data.i.a(paramImageView))
    {
      a(0, paramanu, paraman);
      GMTrace.o(8138560372736L, 60637);
      return null;
    }
    GMTrace.o(8138560372736L, 60637);
    return paramImageView;
  }
  
  public final String a(anu paramanu)
  {
    GMTrace.i(8133191663616L, 60597);
    String str = am.dE(ae.getAccSnsPath(), paramanu.mmR);
    paramanu = com.tencent.mm.plugin.sns.data.i.e(paramanu);
    paramanu = str + paramanu;
    GMTrace.o(8133191663616L, 60597);
    return paramanu;
  }
  
  public final void a(anu paramanu, View paramView, int paramInt1, int paramInt2, int paramInt3, an paraman)
  {
    GMTrace.i(8133862752256L, 60602);
    if ((paramanu == null) || (paramanu.mmR == null) || (paramanu.mmR.equals("")))
    {
      GMTrace.o(8133862752256L, 60602);
      return;
    }
    paramView.setDrawingCacheEnabled(false);
    String str = com.tencent.mm.plugin.sns.data.i.ar(0, paramanu.mmR);
    a(paramView, str, paramInt1, paramInt2, paramInt3);
    Object localObject = paramanu.mmR;
    localObject = Hj(str);
    if (!com.tencent.mm.plugin.sns.data.i.a((n)localObject))
    {
      if (paramInt1 == -1) {
        cr(paramView);
      }
      if (this.prz.contains(str))
      {
        GMTrace.o(8133862752256L, 60602);
        return;
      }
      a(0, paramanu, paraman);
      GMTrace.o(8133862752256L, 60602);
      return;
    }
    a(paramView, str, (n)localObject);
    GMTrace.o(8133862752256L, 60602);
  }
  
  public final void a(anu paramanu, View paramView, int paramInt1, int paramInt2, an paraman)
  {
    GMTrace.i(8133460099072L, 60599);
    a(paramanu, paramView, -1, paramInt1, paramInt2, paraman);
    GMTrace.o(8133460099072L, 60599);
  }
  
  public final void a(anu paramanu, View paramView, int paramInt, an paraman)
  {
    GMTrace.i(8134399623168L, 60606);
    c(paramanu, paramView, -1, paramInt, paraman);
    GMTrace.o(8134399623168L, 60606);
  }
  
  public final void a(Object paramObject, String paramString, int paramInt1, int paramInt2)
  {
    GMTrace.i(8135070711808L, 60611);
    a(paramObject, paramString, true, paramInt1, paramInt2, -1, -1, a.prK);
    GMTrace.o(8135070711808L, 60611);
  }
  
  public final void a(List<anu> paramList, View paramView, int paramInt1, int paramInt2, a parama)
  {
    GMTrace.i(8138828808192L, 60639);
    a(paramList, paramView, paramInt1, paramInt2, parama, false);
    GMTrace.o(8138828808192L, 60639);
  }
  
  public final void a(final List<anu> paramList, View paramView, int paramInt1, int paramInt2, final a parama, boolean paramBoolean)
  {
    GMTrace.i(8138963025920L, 60640);
    if ((paramList == null) || (paramList.size() == 0))
    {
      GMTrace.o(8138963025920L, 60640);
      return;
    }
    if (paramList.size() == 1)
    {
      if (!paramBoolean)
      {
        b((anu)paramList.get(0), paramView, paramInt1, parama);
        GMTrace.o(8138963025920L, 60640);
        return;
      }
      paramList = (anu)paramList.get(0);
      paramInt2 = a.prL;
      if ((paramList == null) || (paramList.mmR == null) || (paramList.mmR.equals("")))
      {
        GMTrace.o(8138963025920L, 60640);
        return;
      }
      paramView.setDrawingCacheEnabled(false);
      str = com.tencent.mm.plugin.sns.data.i.ar(5, paramList.mmR);
      a(paramView, str, -1, paramInt1, paramInt2);
      localObject = paramList.mmR;
      localObject = Hj(str);
      if (!com.tencent.mm.plugin.sns.data.i.a((n)localObject))
      {
        cr(paramView);
        if (!this.prz.contains(str))
        {
          a(5, paramList, parama);
          GMTrace.o(8138963025920L, 60640);
        }
      }
      else
      {
        a(paramView, str, (n)localObject);
      }
      GMTrace.o(8138963025920L, 60640);
      return;
    }
    String str = com.tencent.mm.plugin.sns.data.i.ar(0, com.tencent.mm.plugin.sns.data.i.bs(paramList));
    a(paramView, str, true, -1, paramInt1, -1, -1, paramInt2);
    Object localObject = Hj(str);
    paramBoolean = com.tencent.mm.plugin.sns.data.i.a((n)localObject);
    w.v("MicroMsg.LazyerImageLoader2", "set Sns GridList " + paramBoolean);
    if (!paramBoolean)
    {
      cr(paramView);
      if (this.prz.contains(str))
      {
        GMTrace.o(8138963025920L, 60640);
        return;
      }
      new WeakReference(paramView);
      ae.biQ().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8110374649856L, 60427);
          long l = bg.Pw();
          final Object localObject = new com.tencent.mm.plugin.sns.data.e(paramList);
          ((com.tencent.mm.plugin.sns.data.e)localObject).mDZ = com.tencent.mm.plugin.sns.data.i.bs(paramList);
          ((com.tencent.mm.plugin.sns.data.e)localObject).pph = this.prC;
          int k = 0;
          int i = 1;
          anu localanu;
          b localb;
          String str;
          int j;
          if ((k < paramList.size()) && (k < 4))
          {
            localanu = (anu)paramList.get(k);
            localb = ae.biY();
            str = localanu.mmR;
            if (localb.pqU.containsKey(com.tencent.mm.plugin.sns.data.i.as(1, str)))
            {
              j = 1;
              label117:
              if (j == 0) {
                break label159;
              }
              i = 0;
            }
          }
          for (;;)
          {
            k += 1;
            break;
            if (localb.pqU.containsKey(com.tencent.mm.plugin.sns.data.i.as(5, str)))
            {
              j = 1;
              break label117;
            }
            j = 0;
            break label117;
            label159:
            if ((!FileOp.aZ(am.dE(ae.getAccSnsPath(), localanu.mmR) + com.tencent.mm.plugin.sns.data.i.e(localanu))) && (!FileOp.aZ(am.dE(ae.getAccSnsPath(), localanu.mmR) + com.tencent.mm.plugin.sns.data.i.l(localanu))) && (!FileOp.aZ(am.dE(ae.getAccSnsPath(), localanu.mmR) + com.tencent.mm.plugin.sns.data.i.m(localanu))))
            {
              ae.biY().a(localanu, 1, (com.tencent.mm.plugin.sns.data.e)localObject, parama);
              i = 0;
              continue;
              l = bg.aI(l);
              if (l > 100L) {
                w.i("MicroMsg.LazyerImageLoader2", "fileexist check2  endtime " + l + " " + Thread.currentThread().getName() + " " + com.tencent.mm.compatible.util.e.ghx + " " + ae.bjs() + " " + ((com.tencent.mm.plugin.sns.data.e)localObject).mDZ);
              }
              if (bg.aI(g.this.prd) > 60000L)
              {
                com.tencent.mm.plugin.report.service.g.ork.i(11696, new Object[] { Integer.valueOf(1), Long.valueOf(l), Integer.valueOf(0), Thread.currentThread().getName(), ae.bjs(), com.tencent.mm.compatible.util.e.ghx });
                g.this.prd = bg.Pw();
              }
              localObject = com.tencent.mm.plugin.sns.data.i.bs(paramList);
              if (i != 0) {
                ae.aDa().post(new Runnable()
                {
                  public final void run()
                  {
                    GMTrace.i(8107824513024L, 60408);
                    new i(com.tencent.mm.plugin.sns.data.i.ar(0, localObject), localObject, g.4.this.prF).m(new String[] { "" });
                    GMTrace.o(8107824513024L, 60408);
                  }
                });
              }
              GMTrace.o(8110374649856L, 60427);
              return;
            }
          }
        }
      });
      GMTrace.o(8138963025920L, 60640);
      return;
    }
    a(paramView, str, (n)localObject);
    GMTrace.o(8138963025920L, 60640);
  }
  
  public final boolean a(final int paramInt, final anu paramanu)
  {
    GMTrace.i(16041971286016L, 119522);
    if (!this.pqS)
    {
      GMTrace.o(16041971286016L, 119522);
      return false;
    }
    final String str2 = am.dE(ae.getAccSnsPath(), paramanu.mmR);
    final String str1;
    if (paramInt == 4) {
      str1 = com.tencent.mm.plugin.sns.data.i.g(paramanu);
    }
    String str3;
    for (;;)
    {
      str3 = com.tencent.mm.plugin.sns.data.i.e(paramanu);
      if (!com.tencent.mm.plugin.sns.model.a.b.HT(paramanu.mmR)) {
        break;
      }
      GMTrace.o(16041971286016L, 119522);
      return false;
      if (paramInt == 5) {
        str1 = com.tencent.mm.plugin.sns.data.i.h(paramanu);
      } else if (paramInt == 0) {
        str1 = com.tencent.mm.plugin.sns.data.i.f(paramanu);
      } else {
        str1 = com.tencent.mm.plugin.sns.data.i.e(paramanu);
      }
    }
    long l = bg.Pw();
    boolean bool2 = FileOp.aZ(str2 + str3);
    boolean bool1 = bool2;
    if (!bool2) {
      bool1 = FileOp.aZ(str2 + com.tencent.mm.plugin.sns.data.i.l(paramanu));
    }
    if (!bool1) {
      FileOp.aZ(str2 + com.tencent.mm.plugin.sns.data.i.m(paramanu));
    }
    l = bg.aI(l);
    if (l > 100L) {
      w.i("MicroMsg.LazyerImageLoader2", "fileexist check  endtime " + l + " " + Thread.currentThread().getName() + " " + com.tencent.mm.compatible.util.e.ghx + " " + ae.bjs() + " " + paramanu.mmR);
    }
    if (bg.aI(this.prd) > 60000L)
    {
      com.tencent.mm.plugin.report.service.g.ork.i(11696, new Object[] { Integer.valueOf(1), Long.valueOf(l), Integer.valueOf(0), Thread.currentThread().getName(), ae.bjs(), com.tencent.mm.compatible.util.e.ghx });
      this.prd = bg.Pw();
    }
    if ((FileOp.aZ(str2 + str3)) || (FileOp.aZ(str2 + com.tencent.mm.plugin.sns.data.i.l(paramanu))) || (FileOp.aZ(str2 + com.tencent.mm.plugin.sns.data.i.m(paramanu))))
    {
      ae.aDa().post(new Runnable()
      {
        public final void run()
        {
          GMTrace.i(8073598992384L, 60153);
          while (g.this.prj.size() >= 60)
          {
            localb = (g.b)g.this.prj.removeFirst();
            g.this.prz.remove(localb.amf);
          }
          w.i("MicroMsg.LazyerImageLoader2", "add loaderlist size:" + g.this.prj.size());
          g.b localb = new g.b(g.this, com.tencent.mm.plugin.sns.data.i.ar(paramInt, paramanu.mmR), str2 + str1, str2, paramanu, paramInt);
          if (!g.this.prf.ba(localb.amf)) {
            g.this.prj.add(localb);
          }
          for (;;)
          {
            g.this.bit();
            GMTrace.o(8073598992384L, 60153);
            return;
            g.this.prz.remove(localb.amf);
          }
        }
      });
      GMTrace.o(16041971286016L, 119522);
      return true;
    }
    GMTrace.o(16041971286016L, 119522);
    return false;
  }
  
  public final boolean a(m paramm, final anu paramanu, com.tencent.mm.plugin.sight.decode.a.a parama, int paramInt1, int paramInt2, final an paraman, boolean paramBoolean)
  {
    GMTrace.i(8134533840896L, 60607);
    if ((paramanu == null) || (paramanu.mmR == null) || (paramanu.mmR.equals("")))
    {
      GMTrace.o(8134533840896L, 60607);
      return false;
    }
    String str1 = com.tencent.mm.plugin.sns.data.i.ar(1, paramanu.mmR);
    a(parama, str1, -1, paramInt1);
    Object localObject = am.dE(ae.getAccSnsPath(), paramanu.mmR);
    String str2 = com.tencent.mm.plugin.sns.data.i.e(paramanu);
    if (!FileOp.aZ((String)localObject + str2))
    {
      localObject = new com.tencent.mm.plugin.sns.data.e(paramanu);
      ((com.tencent.mm.plugin.sns.data.e)localObject).pph = 1;
      ((com.tencent.mm.plugin.sns.data.e)localObject).mDZ = paramanu.mmR;
      ae.biY().a(paramanu, 1, (com.tencent.mm.plugin.sns.data.e)localObject, paraman);
    }
    localObject = "";
    if (paramBoolean)
    {
      if (u(paramanu)) {
        break label489;
      }
      localObject = am.dE(ae.getAccSnsPath(), paramanu.mmR);
      str2 = com.tencent.mm.plugin.sns.data.i.j(paramanu);
      if (FileOp.aZ((String)localObject + str2)) {
        localObject = (String)localObject + str2;
      }
    }
    else
    {
      w.i("MicroMsg.LazyerImageLoader2", "setsight %s sightPath %s isAd %b", new Object[] { str1, localObject, Boolean.valueOf(paramBoolean) });
      if ((bg.nm((String)localObject)) || (u(paramanu))) {
        break label514;
      }
      if (!((String)localObject).equals(parama.NE())) {
        parama.D(null);
      }
      if (this.pqS) {
        break label508;
      }
    }
    label489:
    label497:
    label508:
    for (paramBoolean = true;; paramBoolean = false)
    {
      parama.ar((String)localObject, paramBoolean);
      parama.lx(paramInt2);
      GMTrace.o(8134533840896L, 60607);
      return true;
      if ((FileOp.aZ((String)localObject + com.tencent.mm.plugin.sns.data.i.p(paramanu))) && (paramanu.mmR != null) && (paramanu.mmR.startsWith("Locall_path")))
      {
        localObject = (String)localObject + com.tencent.mm.plugin.sns.data.i.p(paramanu);
        break;
      }
      if (this.pqS)
      {
        w.i("MicroMsg.LazyerImageLoader2", "push sight loader " + paramanu.mmR + " url: " + paramanu.lPM);
        if (!paramBoolean) {
          break label497;
        }
        if (b(paramm, null) == 5) {
          ae.aDa().postDelayed(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8101113626624L, 60358);
              ae.biY().a(paramanu, 4, null, paraman);
              GMTrace.o(8101113626624L, 60358);
            }
          }, 0L);
        }
      }
      for (;;)
      {
        localObject = "";
        break;
        w.i("MicroMsg.LazyerImageLoader2", "do no auto download sns sight.");
      }
    }
    label514:
    w.i("MicroMsg.LazyerImageLoader2", "sightPath %s", new Object[] { localObject });
    if (!this.pqS)
    {
      paramBoolean = true;
      parama.ar(null, paramBoolean);
      paramm = paramanu.mmR;
      paramm = Hj(str1);
      paramBoolean = com.tencent.mm.plugin.sns.data.i.a(paramm);
      w.v("MicroMsg.LazyerImageLoader2", "setsight thumb  %s", new Object[] { Boolean.valueOf(paramBoolean) });
      if (paramBoolean) {
        break label714;
      }
      if ((!(parama instanceof ImageView)) && (!(parama instanceof QFadeImageView))) {
        break label645;
      }
      cr((View)parama);
    }
    for (;;)
    {
      if (this.prz.contains(str1))
      {
        GMTrace.o(8134533840896L, 60607);
        return false;
        paramBoolean = false;
        break;
        label645:
        if ((parama instanceof com.tencent.mm.plugin.sight.decode.a.a))
        {
          if (!this.pqS) {}
          for (paramBoolean = true;; paramBoolean = false)
          {
            parama.ar(null, paramBoolean);
            parama.lx(0);
            parama.D(null);
            break;
          }
        }
      }
    }
    a(1, paramanu, paraman);
    GMTrace.o(8134533840896L, 60607);
    return false;
    label714:
    a(parama, str1, paramm);
    GMTrace.o(8134533840896L, 60607);
    return true;
  }
  
  public final boolean a(String paramString, n paramn)
  {
    GMTrace.i(8137755066368L, 60631);
    if ((paramn != null) && (paramString != null)) {
      this.prf.put(paramString, paramn);
    }
    GMTrace.o(8137755066368L, 60631);
    return true;
  }
  
  public final boolean a(String paramString, n paramn, int paramInt)
  {
    GMTrace.i(8137620848640L, 60630);
    a(paramInt + "-" + paramString, paramn);
    GMTrace.o(8137620848640L, 60630);
    return true;
  }
  
  public final int b(m paramm, int[] paramArrayOfInt)
  {
    int j = 5;
    GMTrace.i(8136412889088L, 60621);
    Object localObject;
    PInt localPInt;
    if ((paramArrayOfInt != null) || (bg.aI(this.prq) > 60000L))
    {
      localObject = new PInt();
      localPInt = new PInt();
      c.Gs();
      if (!c.a((PInt)localObject, localPInt)) {
        break label136;
      }
      this.prw = 5;
      if (paramArrayOfInt != null) {
        if (((PInt)localObject).value != 0) {
          break label145;
        }
      }
    }
    label136:
    label145:
    for (int i = 0;; i = 1)
    {
      paramArrayOfInt[0] = i;
      paramArrayOfInt[1] = localPInt.value;
      this.prx = ((PInt)localObject).value;
      this.prq = bg.Pw();
      if ((this.prx != 0) && (paramm != null)) {
        break label150;
      }
      i = this.prw;
      GMTrace.o(8136412889088L, 60621);
      return i;
      this.prw = 10;
      break;
    }
    label150:
    if (this.pry.containsKey(Long.valueOf(paramm.field_snsId)))
    {
      i = ((Integer)this.pry.get(Long.valueOf(paramm.field_snsId))).intValue();
      GMTrace.o(8136412889088L, 60621);
      return i;
    }
    paramArrayOfInt = new bfp();
    try
    {
      localObject = (bfh)new bfh().aD(paramm.field_attrBuf);
      if (((bfh)localObject).uRd == null)
      {
        i = this.prw;
        GMTrace.o(8136412889088L, 60621);
        return i;
      }
      paramArrayOfInt.aD(((bfh)localObject).uRd.uNP.tJp);
      if ((paramArrayOfInt.uRs == null) || (paramArrayOfInt.uRs.info == null))
      {
        i = this.prr;
        GMTrace.o(8136412889088L, 60621);
        return i;
      }
    }
    catch (Exception paramm)
    {
      w.printErrStackTrace("MicroMsg.LazyerImageLoader2", paramm, "", new Object[0]);
      i = this.prw;
      GMTrace.o(8136412889088L, 60621);
      return i;
    }
    paramArrayOfInt = paramArrayOfInt.uRs.info;
    i = paramArrayOfInt.hashCode();
    if (this.prx == 1)
    {
      if (!this.prv.containsKey(Integer.valueOf(i))) {
        this.prv.put(Integer.valueOf(i), Boolean.valueOf(bK(paramArrayOfInt, this.prx)));
      }
      if (((Boolean)this.prv.get(Integer.valueOf(i))).booleanValue()) {}
      for (i = 5;; i = 10)
      {
        w.i("MicroMsg.LazyerImageLoader2", "isAutoAdDownload(sight_autodownload) snsID:%d, result:%d", new Object[] { Long.valueOf(paramm.field_snsId), Integer.valueOf(i) });
        this.pry.put(Long.valueOf(paramm.field_snsId), Integer.valueOf(i));
        GMTrace.o(8136412889088L, 60621);
        return i;
      }
    }
    if (!this.pru.containsKey(Integer.valueOf(i))) {
      this.pru.put(Integer.valueOf(i), Boolean.valueOf(bK(paramArrayOfInt, this.prx)));
    }
    if (((Boolean)this.pru.get(Integer.valueOf(i))).booleanValue()) {}
    for (i = j;; i = 10) {
      break;
    }
  }
  
  public final Bitmap b(anu paramanu)
  {
    GMTrace.i(8133057445888L, 60596);
    if ((paramanu.mmR == null) || (paramanu.mmR.equals("")))
    {
      GMTrace.o(8133057445888L, 60596);
      return null;
    }
    String str1 = com.tencent.mm.plugin.sns.data.i.ar(1, paramanu.mmR);
    Object localObject = paramanu.mmR;
    localObject = Hj(str1);
    if (com.tencent.mm.plugin.sns.data.i.a((n)localObject))
    {
      paramanu = ((n)localObject).yp();
      GMTrace.o(8133057445888L, 60596);
      return paramanu;
    }
    localObject = am.dE(ae.getAccSnsPath(), paramanu.mmR);
    String str2 = com.tencent.mm.plugin.sns.data.i.e(paramanu);
    localObject = (String)localObject + str2;
    if (FileOp.aZ((String)localObject))
    {
      if (paramanu.mmR.startsWith("pre_temp_extend_pic")) {}
      for (paramanu = n.i(r.IJ((String)localObject)); com.tencent.mm.plugin.sns.data.i.a(paramanu); paramanu = com.tencent.mm.plugin.sns.data.i.GV((String)localObject))
      {
        a(str1, paramanu);
        paramanu = paramanu.yp();
        GMTrace.o(8133057445888L, 60596);
        return paramanu;
      }
      GMTrace.o(8133057445888L, 60596);
      return null;
    }
    GMTrace.o(8133057445888L, 60596);
    return null;
  }
  
  public final void b(View paramView, int paramInt1, int paramInt2, int paramInt3)
  {
    GMTrace.i(8138694590464L, 60638);
    a(paramView, null, true, -1, paramInt3, -1, -1, a.prK);
    if (paramInt1 != -1) {
      paramView.setBackgroundResource(paramInt1);
    }
    if (paramInt2 != -1)
    {
      if ((paramView instanceof QFadeImageView))
      {
        ((QFadeImageView)paramView).setImageResource(paramInt2);
        GMTrace.o(8138694590464L, 60638);
        return;
      }
      if ((paramView instanceof ImageView))
      {
        ((ImageView)paramView).setImageDrawable(com.tencent.mm.br.a.b(paramView.getContext(), paramInt2));
        GMTrace.o(8138694590464L, 60638);
      }
    }
    else
    {
      if ((paramView instanceof QFadeImageView))
      {
        ((QFadeImageView)paramView).setImageResource(i.e.oXB);
        GMTrace.o(8138694590464L, 60638);
        return;
      }
      if ((paramView instanceof ImageView)) {
        ((ImageView)paramView).setImageResource(i.e.oXB);
      }
    }
    GMTrace.o(8138694590464L, 60638);
  }
  
  public final void b(anu paramanu, View paramView, int paramInt1, int paramInt2, an paraman)
  {
    GMTrace.i(8133728534528L, 60601);
    a(paramanu, paramView, paramInt1, paramInt2, a.prK, paraman);
    GMTrace.o(8133728534528L, 60601);
  }
  
  public final void b(anu paramanu, View paramView, int paramInt, an paraman)
  {
    GMTrace.i(8133325881344L, 60598);
    b(paramanu, paramView, -1, paramInt, paraman);
    GMTrace.o(8133325881344L, 60598);
  }
  
  protected final void b(String paramString, n paramn)
  {
    GMTrace.i(8139097243648L, 60641);
    n localn = paramn;
    if (!com.tencent.mm.plugin.sns.data.i.a(paramn))
    {
      localn = (n)this.prf.get(paramString);
      if (localn != null)
      {
        paramn = localn;
        if (!localn.isRecycled()) {}
      }
      else
      {
        this.prf.remove(paramString);
        paramn = null;
      }
      localn = paramn;
    }
    if (com.tencent.mm.plugin.sns.data.i.a(localn))
    {
      if ((this.prf != null) && (localn != null) && (paramString != null)) {
        this.prf.put(paramString, localn);
      }
      paramn = (LinkedList)this.prh.get(paramString);
      if (paramn != null)
      {
        paramn = paramn.iterator();
        while (paramn.hasNext())
        {
          Object localObject = (c)((WeakReference)paramn.next()).get();
          if ((localObject != null) && (((c)localObject).prP) && (paramString != null) && (paramString.equals(((c)localObject).id)))
          {
            int i = ((c)localObject).code;
            localObject = (WeakReference)this.gHB.get(Integer.valueOf(i));
            if (localObject != null)
            {
              localObject = ((WeakReference)localObject).get();
              if (localObject != null)
              {
                if ((localObject instanceof QFadeImageView))
                {
                  QFadeImageView localQFadeImageView = (QFadeImageView)localObject;
                  if ((this.pro != null) && ((localQFadeImageView instanceof TagImageView)))
                  {
                    i = ((TagImageView)localQFadeImageView).position;
                    if ((i != -1) && (!this.pro.vg(i))) {
                      continue;
                    }
                  }
                }
                if ((com.tencent.mm.plugin.sns.data.i.a(localn)) && (localObject != null))
                {
                  a(localObject, paramString, localn);
                }
                else
                {
                  boolean bool1;
                  if (localn == null)
                  {
                    bool1 = true;
                    label305:
                    if (localObject != null) {
                      break label361;
                    }
                  }
                  label361:
                  for (boolean bool2 = true;; bool2 = false)
                  {
                    w.d("MicroMsg.LazyerImageLoader2", "setRefImageView null bmNUll: %s ivNull: %s bimapavailable %s", new Object[] { Boolean.valueOf(bool1), Boolean.valueOf(bool2), Boolean.valueOf(com.tencent.mm.plugin.sns.data.i.a(localn)) });
                    break;
                    bool1 = false;
                    break label305;
                  }
                }
              }
            }
          }
        }
      }
    }
    GMTrace.o(8139097243648L, 60641);
  }
  
  public final void bhO()
  {
    GMTrace.i(8139231461376L, 60642);
    bis();
    this.prp = 0L;
    this.prq = 0L;
    this.prj.clear();
    this.prk = false;
    GMTrace.o(8139231461376L, 60642);
  }
  
  public final void bis()
  {
    GMTrace.i(8132386357248L, 60591);
    if (this.prf != null)
    {
      this.gHB.clear();
      this.prg.pvr.clear();
      StringBuffer localStringBuffer = new StringBuffer();
      localStringBuffer.append("mMemoryCache \n");
      localStringBuffer.append("putCount:" + this.prf.putCount() + ";");
      localStringBuffer.append("missCount:" + this.prf.missCount() + ";");
      localStringBuffer.append("hitCount:" + this.prf.hitCount() + ";");
      localStringBuffer.append("createCount:" + this.prf.createCount() + ";");
      localStringBuffer.append("evictionCount:" + this.prf.evictionCount() + ";");
      w.i("MicroMsg.LazyerImageLoader2", "report lurcache ");
      this.prf.trimToSize(-1);
    }
    this.prg.bjA();
    System.gc();
    GMTrace.o(8132386357248L, 60591);
  }
  
  public final boolean bit()
  {
    GMTrace.i(8135607582720L, 60615);
    if (this.prk)
    {
      w.i("MicroMsg.LazyerImageLoader2", "loaderlist size runing pass");
      GMTrace.o(8135607582720L, 60615);
      return false;
    }
    ae.aDa().postDelayed(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(8046889664512L, 59954);
        if (g.this.prk)
        {
          w.i("MicroMsg.LazyerImageLoader2", "loaderlist size runing pass");
          GMTrace.o(8046889664512L, 59954);
          return;
        }
        if (g.this.prj.size() > 0)
        {
          w.i("MicroMsg.LazyerImageLoader2", "tryStart loaderlist size:" + g.this.prj.size());
          ((g.b)g.this.prj.removeLast()).m(new String[] { "" });
        }
        GMTrace.o(8046889664512L, 59954);
      }
    }, 0L);
    GMTrace.o(8135607582720L, 60615);
    return true;
  }
  
  public final Bitmap c(anu paramanu, View paramView, int paramInt, an paraman)
  {
    GMTrace.i(8132520574976L, 60592);
    paramanu = a(paramanu, paramView, paramInt, true, paraman);
    GMTrace.o(8132520574976L, 60592);
    return paramanu;
  }
  
  public final boolean c(anu paramanu, View paramView, int paramInt1, int paramInt2, an paraman)
  {
    GMTrace.i(8134802276352L, 60609);
    if ((paramanu == null) || (paramanu.mmR == null) || (paramanu.mmR.equals("")))
    {
      GMTrace.o(8134802276352L, 60609);
      return false;
    }
    String str = com.tencent.mm.plugin.sns.data.i.ar(1, paramanu.mmR);
    a(paramView, str, paramInt1, paramInt2);
    Object localObject = paramanu.mmR;
    localObject = Hj(str);
    boolean bool = com.tencent.mm.plugin.sns.data.i.a((n)localObject);
    w.v("MicroMsg.LazyerImageLoader2", "set sns Thumb  " + bool + str);
    if (!bool)
    {
      if (paramInt1 == -1) {
        cr(paramView);
      }
      if (this.prz.contains(str))
      {
        GMTrace.o(8134802276352L, 60609);
        return true;
      }
      a(1, paramanu, paraman);
      GMTrace.o(8134802276352L, 60609);
      return false;
    }
    a(paramView, str, (n)localObject);
    GMTrace.o(8134802276352L, 60609);
    return true;
  }
  
  public final void cq(View paramView)
  {
    GMTrace.i(8132923228160L, 60595);
    if ((paramView instanceof ImageView))
    {
      ((ImageView)paramView).setImageBitmap(null);
      GMTrace.o(8132923228160L, 60595);
      return;
    }
    if ((paramView instanceof QImageView))
    {
      ((QImageView)paramView).setImageBitmap(null);
      GMTrace.o(8132923228160L, 60595);
      return;
    }
    GMTrace.o(8132923228160L, 60595);
  }
  
  public final boolean cs(View paramView)
  {
    GMTrace.i(8135473364992L, 60614);
    int i = paramView.hashCode();
    paramView = this.prl.iterator();
    while (paramView.hasNext())
    {
      c localc = (c)paramView.next();
      if (i == localc.code) {
        this.prl.remove(localc);
      }
    }
    this.gHB.remove(Integer.valueOf(i));
    GMTrace.o(8135473364992L, 60614);
    return true;
  }
  
  public final void d(anu paramanu, View paramView, int paramInt, an paraman)
  {
    GMTrace.i(8134668058624L, 60608);
    if ((paramanu == null) || (paramanu.mmR == null) || (paramanu.mmR.equals("")))
    {
      GMTrace.o(8134668058624L, 60608);
      return;
    }
    String str = com.tencent.mm.plugin.sns.data.i.ar(4, paramanu.mmR);
    a(paramView, str, -1, paramInt);
    Object localObject = paramanu.mmR;
    localObject = Hj(str);
    boolean bool = com.tencent.mm.plugin.sns.data.i.a((n)localObject);
    w.v("MicroMsg.LazyerImageLoader2", "set sns Thumb  " + bool);
    if (!bool)
    {
      cr(paramView);
      if (!this.prz.contains(str))
      {
        a(4, paramanu, paraman);
        GMTrace.o(8134668058624L, 60608);
      }
    }
    else
    {
      a(paramView, str, (n)localObject);
    }
    GMTrace.o(8134668058624L, 60608);
  }
  
  public final boolean dC(String paramString1, String paramString2)
  {
    GMTrace.i(8137486630912L, 60629);
    if ((this.prm.containsKey(paramString1)) && (3 == ((Integer)this.prm.get(paramString1)).intValue())) {
      this.prm.remove(paramString1);
    }
    String str = com.tencent.mm.plugin.sns.data.i.ar(1, paramString1);
    Iterator localIterator = ((LinkedList)this.prh.get(str)).iterator();
    while (localIterator.hasNext())
    {
      Object localObject = (c)((WeakReference)localIterator.next()).get();
      if ((localObject != null) && (((c)localObject).prP) && (str != null) && (str.equals(((c)localObject).id)))
      {
        int i = ((c)localObject).code;
        localObject = (WeakReference)this.gHB.get(Integer.valueOf(i));
        if (localObject != null)
        {
          localObject = ((WeakReference)localObject).get();
          if ((localObject != null) && ((localObject instanceof com.tencent.mm.plugin.sight.decode.a.a)))
          {
            w.i("MicroMsg.LazyerImageLoader2", "download fin set sight %s %s", new Object[] { paramString1, paramString2 });
            localObject = (com.tencent.mm.plugin.sight.decode.a.a)localObject;
            if ((((com.tencent.mm.plugin.sight.decode.a.a)localObject).bgl() instanceof com.tencent.mm.plugin.sns.ui.ak))
            {
              com.tencent.mm.plugin.sns.ui.ak localak = (com.tencent.mm.plugin.sns.ui.ak)((com.tencent.mm.plugin.sight.decode.a.a)localObject).bgl();
              boolean bool;
              if (localak != null)
              {
                if (FileOp.aZ(paramString2))
                {
                  if (!this.pqS) {}
                  for (bool = true;; bool = false)
                  {
                    ((com.tencent.mm.plugin.sight.decode.a.a)localObject).ar(paramString2, bool);
                    ((com.tencent.mm.plugin.sight.decode.a.a)localObject).lx(localak.position);
                    localak.pWE.setVisibility(8);
                    localak.pIr.setVisibility(8);
                    localak.pIu.setVisibility(8);
                    if ((!this.prm.containsKey(paramString1)) || (4 != ((Integer)this.prm.get(paramString1)).intValue())) {
                      break;
                    }
                    this.prm.remove(paramString1);
                    break;
                  }
                }
                this.prm.put(paramString1, Integer.valueOf(4));
                localak.pWE.setVisibility(8);
                localak.pIr.setImageResource(i.e.ban);
                localak.pIr.setVisibility(0);
              }
              else
              {
                if (!this.pqS) {}
                for (bool = true;; bool = false)
                {
                  ((com.tencent.mm.plugin.sight.decode.a.a)localObject).ar(paramString2, bool);
                  break;
                }
              }
            }
          }
        }
      }
    }
    GMTrace.o(8137486630912L, 60629);
    return true;
  }
  
  public final int k(m paramm)
  {
    GMTrace.i(8136010235904L, 60618);
    int i = a(paramm, null);
    GMTrace.o(8136010235904L, 60618);
    return i;
  }
  
  public final int l(m paramm)
  {
    GMTrace.i(15397591973888L, 114721);
    int i = b(paramm, null);
    GMTrace.o(15397591973888L, 114721);
    return i;
  }
  
  public final void pause()
  {
    GMTrace.i(8132117921792L, 60589);
    this.pqS = false;
    b localb = ae.biY();
    localb.pqS = false;
    Object localObject1 = new LinkedList();
    Object localObject2 = localb.fMv.iterator();
    while (((Iterator)localObject2).hasNext())
    {
      com.tencent.mm.plugin.sns.data.f localf = (com.tencent.mm.plugin.sns.data.f)((Iterator)localObject2).next();
      if (localf.requestType != 6)
      {
        localb.pqV.remove(localf.amf);
        ((LinkedList)localObject1).add(localf);
      }
    }
    localObject1 = ((LinkedList)localObject1).iterator();
    while (((Iterator)localObject1).hasNext())
    {
      localObject2 = (com.tencent.mm.plugin.sns.data.f)((Iterator)localObject1).next();
      localb.fMv.remove(localObject2);
    }
    GMTrace.o(8132117921792L, 60589);
  }
  
  public final void start()
  {
    GMTrace.i(8131983704064L, 60588);
    this.pqS = true;
    bit();
    b localb = ae.biY();
    localb.pqS = true;
    localb.qG();
    GMTrace.o(8131983704064L, 60588);
  }
  
  public final boolean u(anu paramanu)
  {
    GMTrace.i(8136681324544L, 60623);
    if (!this.prm.containsKey(paramanu.mmR))
    {
      GMTrace.o(8136681324544L, 60623);
      return false;
    }
    if (((Integer)this.prm.get(paramanu.mmR)).intValue() == 1)
    {
      GMTrace.o(8136681324544L, 60623);
      return true;
    }
    GMTrace.o(8136681324544L, 60623);
    return false;
  }
  
  public final boolean v(anu paramanu)
  {
    GMTrace.i(8136815542272L, 60624);
    if (!this.prm.containsKey(paramanu.mmR))
    {
      GMTrace.o(8136815542272L, 60624);
      return false;
    }
    if (((Integer)this.prm.get(paramanu.mmR)).intValue() == 2)
    {
      GMTrace.o(8136815542272L, 60624);
      return true;
    }
    GMTrace.o(8136815542272L, 60624);
    return false;
  }
  
  public final boolean w(anu paramanu)
  {
    GMTrace.i(8136949760000L, 60625);
    if (!this.prm.containsKey(paramanu.mmR))
    {
      GMTrace.o(8136949760000L, 60625);
      return false;
    }
    if (((Integer)this.prm.get(paramanu.mmR)).intValue() == 3)
    {
      GMTrace.o(8136949760000L, 60625);
      return true;
    }
    GMTrace.o(8136949760000L, 60625);
    return false;
  }
  
  public final void x(anu paramanu)
  {
    GMTrace.i(8137083977728L, 60626);
    this.prm.put(paramanu.mmR, Integer.valueOf(1));
    GMTrace.o(8137083977728L, 60626);
  }
  
  public final void y(anu paramanu)
  {
    GMTrace.i(8137218195456L, 60627);
    this.prm.put(paramanu.mmR, Integer.valueOf(2));
    GMTrace.o(8137218195456L, 60627);
  }
  
  public final void z(anu paramanu)
  {
    GMTrace.i(8137352413184L, 60628);
    this.prm.put(paramanu.mmR, Integer.valueOf(3));
    GMTrace.o(8137352413184L, 60628);
  }
  
  public static enum a
  {
    static
    {
      GMTrace.i(8121783156736L, 60512);
      prK = 1;
      prL = 2;
      prM = new int[] { prK, prL };
      GMTrace.o(8121783156736L, 60512);
    }
  }
  
  final class b
    extends h<String, Integer, Boolean>
  {
    String amf;
    private anu eUs;
    private n gif;
    private String haf;
    private String path;
    private int prN;
    
    public b(String paramString1, String paramString2, String paramString3, anu paramanu, int paramInt)
    {
      GMTrace.i(8061116743680L, 60060);
      this.amf = "";
      this.gif = null;
      this.prN = 0;
      g.this.prz.add(paramString1);
      this.amf = paramString1;
      this.path = paramString2;
      this.haf = paramString3;
      this.eUs = paramanu;
      this.prN = paramInt;
      g.prA += 1;
      w.d("MicroMsg.ImageLoader", "peddingCount %d ", new Object[] { Integer.valueOf(g.prA) });
      GMTrace.o(8061116743680L, 60060);
    }
    
    private void R(String paramString1, String paramString2, String paramString3)
    {
      GMTrace.i(8061250961408L, 60061);
      FileOp.aZ(this.haf + paramString3);
      if (!FileOp.aZ(this.haf + paramString1))
      {
        String str = paramString2;
        if (!FileOp.aZ(this.haf + paramString2)) {
          str = com.tencent.mm.plugin.sns.data.i.m(this.eUs);
        }
        boolean bool = r.a(this.haf, str, paramString1, ae.bjm());
        if (!bool)
        {
          w.i("MicroMsg.ImageLoader", "delete %s", new Object[] { str });
          FileOp.deleteFile(this.haf + str);
        }
        w.i("MicroMsg.ImageLoader", "createUserThumb %s -> %s, result:%b", new Object[] { this.haf + str, this.haf + paramString1, Boolean.valueOf(bool) });
      }
      r.b(this.haf, paramString1, paramString3, ae.bjl());
      GMTrace.o(8061250961408L, 60061);
    }
    
    public final com.tencent.mm.sdk.platformtools.ae biu()
    {
      GMTrace.i(8061385179136L, 60062);
      com.tencent.mm.sdk.platformtools.ae localae = ae.aCY();
      GMTrace.o(8061385179136L, 60062);
      return localae;
    }
  }
  
  static final class c
  {
    public int code;
    public String id;
    public int prO;
    public boolean prP;
    
    public c(String paramString, int paramInt1, int paramInt2, boolean paramBoolean)
    {
      GMTrace.i(8151176839168L, 60731);
      this.id = paramString;
      this.code = paramInt1;
      this.prO = paramInt2;
      this.prP = paramBoolean;
      GMTrace.o(8151176839168L, 60731);
    }
    
    public final boolean equals(Object paramObject)
    {
      GMTrace.i(8151445274624L, 60733);
      if ((paramObject != null) && (paramObject.hashCode() == this.code))
      {
        GMTrace.o(8151445274624L, 60733);
        return true;
      }
      GMTrace.o(8151445274624L, 60733);
      return false;
    }
    
    public final int hashCode()
    {
      GMTrace.i(8151311056896L, 60732);
      int i = this.code;
      GMTrace.o(8151311056896L, 60732);
      return i;
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\model\g.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */