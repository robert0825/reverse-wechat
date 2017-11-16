package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory.Options;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemLongClickListener;
import android.widget.AdapterView.OnItemSelectedListener;
import android.widget.BaseAdapter;
import android.widget.FrameLayout;
import android.widget.Gallery;
import android.widget.Gallery.LayoutParams;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.pk;
import com.tencent.mm.modelcontrol.c;
import com.tencent.mm.modelsfs.FileOp;
import com.tencent.mm.plugin.sns.data.i;
import com.tencent.mm.plugin.sns.i.e;
import com.tencent.mm.plugin.sns.i.f;
import com.tencent.mm.plugin.sns.i.g;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ai;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anw;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.b.a;
import com.tencent.mm.sdk.platformtools.BackwardSupportUtil.b;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.an;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.base.MMPageControlView;
import com.tencent.mm.ui.base.MultiTouchImageView;
import com.tencent.mm.ui.base.MultiTouchImageView.a;
import com.tencent.mm.ui.tools.MMGestureGallery;
import com.tencent.mm.ui.tools.MMGestureGallery.e;
import com.tencent.mm.ui.tools.MMGestureGallery.f;
import java.lang.ref.WeakReference;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SnsInfoFlip
  extends FlipView
{
  private static int giH;
  private static int giI;
  private Context context;
  List<com.tencent.mm.plugin.sns.g.b> gpU;
  private com.tencent.mm.sdk.platformtools.ae handler;
  boolean pYh;
  boolean pYj;
  boolean poX;
  an ppi;
  b qaS;
  Gallery qaT;
  private boolean qaU;
  HashMap<Integer, Integer> qaV;
  HashMap<Integer, Long> qaW;
  HashMap<Integer, Long> qaX;
  boolean qaY;
  boolean qaZ;
  boolean qba;
  boolean qbb;
  boolean qbc;
  private boolean qbd;
  private boolean qbe;
  private float qbf;
  MMPageControlView qbg;
  Runnable qbh;
  private String qbi;
  private int qbj;
  int qbk;
  private boolean qbl;
  long qbm;
  private HashSet<String> qbn;
  private Map<String, Boolean> qbo;
  private int qbp;
  private int qbq;
  private boolean qbr;
  c qbs;
  private HashMap<String, m> qbt;
  int qbu;
  HashSet<String> qbv;
  public int qbw;
  public int qbx;
  private HashMap<String, a> qby;
  private MultiTouchImageView.a qbz;
  public String username;
  
  static
  {
    GMTrace.i(8441892438016L, 62897);
    giI = 0;
    giH = 0;
    GMTrace.o(8441892438016L, 62897);
  }
  
  public SnsInfoFlip(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(8434242027520L, 62840);
    this.poX = false;
    this.qaU = true;
    this.qaV = new HashMap();
    this.qaW = new HashMap();
    this.qaX = new HashMap();
    this.ppi = an.vBh;
    this.qaY = false;
    this.qaZ = false;
    this.qba = false;
    this.qbb = false;
    this.qbc = false;
    this.qbd = true;
    this.qbe = true;
    this.qbf = 1.0F;
    this.qbh = null;
    this.handler = new com.tencent.mm.sdk.platformtools.ae();
    this.qbi = "";
    this.qbj = -1;
    this.qbk = -1;
    this.qbl = false;
    this.pYh = false;
    this.pYj = false;
    this.qbm = 0L;
    this.qbn = new HashSet();
    this.qbp = 0;
    this.qbq = 0;
    this.qbr = false;
    this.qbt = new HashMap();
    this.qbu = -1;
    this.qbv = new HashSet();
    this.qbw = 0;
    this.qbx = 0;
    this.qby = new HashMap();
    this.qbz = new MultiTouchImageView.a()
    {
      public final void bpc()
      {
        GMTrace.i(8466991153152L, 63084);
        if ((SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem() == null) || (SnsInfoFlip.d(SnsInfoFlip.this) == null))
        {
          GMTrace.o(8466991153152L, 63084);
          return;
        }
        int i = SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItemPosition();
        Object localObject = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem()).pyW;
        localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Is((String)localObject);
        if (localObject != null) {
          ax.d((m)localObject, i);
        }
        GMTrace.o(8466991153152L, 63084);
      }
      
      public final void bpd()
      {
        GMTrace.i(8467125370880L, 63085);
        if ((SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem() == null) || (SnsInfoFlip.d(SnsInfoFlip.this) == null))
        {
          GMTrace.o(8467125370880L, 63085);
          return;
        }
        int i = SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItemPosition();
        Object localObject = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem()).pyW;
        localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Is((String)localObject);
        if (localObject != null) {
          ax.e((m)localObject, i);
        }
        GMTrace.o(8467125370880L, 63085);
      }
    };
    init(paramContext);
    GMTrace.o(8434242027520L, 62840);
  }
  
  public SnsInfoFlip(Context paramContext, AttributeSet paramAttributeSet)
  {
    super(paramContext, paramAttributeSet);
    GMTrace.i(8434107809792L, 62839);
    this.poX = false;
    this.qaU = true;
    this.qaV = new HashMap();
    this.qaW = new HashMap();
    this.qaX = new HashMap();
    this.ppi = an.vBh;
    this.qaY = false;
    this.qaZ = false;
    this.qba = false;
    this.qbb = false;
    this.qbc = false;
    this.qbd = true;
    this.qbe = true;
    this.qbf = 1.0F;
    this.qbh = null;
    this.handler = new com.tencent.mm.sdk.platformtools.ae();
    this.qbi = "";
    this.qbj = -1;
    this.qbk = -1;
    this.qbl = false;
    this.pYh = false;
    this.pYj = false;
    this.qbm = 0L;
    this.qbn = new HashSet();
    this.qbp = 0;
    this.qbq = 0;
    this.qbr = false;
    this.qbt = new HashMap();
    this.qbu = -1;
    this.qbv = new HashSet();
    this.qbw = 0;
    this.qbx = 0;
    this.qby = new HashMap();
    this.qbz = new MultiTouchImageView.a()
    {
      public final void bpc()
      {
        GMTrace.i(8466991153152L, 63084);
        if ((SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem() == null) || (SnsInfoFlip.d(SnsInfoFlip.this) == null))
        {
          GMTrace.o(8466991153152L, 63084);
          return;
        }
        int i = SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItemPosition();
        Object localObject = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem()).pyW;
        localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Is((String)localObject);
        if (localObject != null) {
          ax.d((m)localObject, i);
        }
        GMTrace.o(8466991153152L, 63084);
      }
      
      public final void bpd()
      {
        GMTrace.i(8467125370880L, 63085);
        if ((SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem() == null) || (SnsInfoFlip.d(SnsInfoFlip.this) == null))
        {
          GMTrace.o(8467125370880L, 63085);
          return;
        }
        int i = SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItemPosition();
        Object localObject = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.g(SnsInfoFlip.this).getSelectedItem()).pyW;
        localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Is((String)localObject);
        if (localObject != null) {
          ax.e((m)localObject, i);
        }
        GMTrace.o(8467125370880L, 63085);
      }
    };
    init(paramContext);
    GMTrace.o(8434107809792L, 62839);
  }
  
  private void a(anu paramanu, int paramInt, String paramString)
  {
    long l2 = 0L;
    GMTrace.i(8435047333888L, 62846);
    Object localObject1;
    String str1;
    int i;
    float f2;
    float f1;
    if ((this.qaT == null) || (!(this.qaT instanceof MMGestureGallery)))
    {
      if (this.qbs != null) {
        this.qbs.vs(paramInt);
      }
      localObject1 = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramString);
      if (localObject1 != null) {
        ax.c((m)localObject1, paramInt);
      }
      if (this.qbj == -1) {
        this.qbj = paramInt;
      }
      this.qbk = 1;
      str1 = paramanu.mmR;
      if (bg.nm(paramString))
      {
        i = this.qaS.getCount();
        paramanu = paramInt + 1 + " / " + i;
        this.pSd.dR(paramanu, null);
        GMTrace.o(8435047333888L, 62846);
      }
    }
    else
    {
      if (paramanu.uCR == null) {
        break label1245;
      }
      f2 = paramanu.uCR.uDF;
      f1 = paramanu.uCR.uDE;
    }
    for (;;)
    {
      label239:
      float f3;
      if ((f2 <= 0.0F) || (f1 <= 0.0F)) {
        if (paramanu.mmR.startsWith("Locall_path"))
        {
          localObject1 = com.tencent.mm.plugin.sns.model.am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), paramanu.mmR) + i.m(paramanu);
          localObject1 = com.tencent.mm.sdk.platformtools.d.RB((String)localObject1);
          if (localObject1 == null) {
            break;
          }
          f1 = ((BitmapFactory.Options)localObject1).outHeight;
          f2 = ((BitmapFactory.Options)localObject1).outWidth;
          f3 = f1;
          f1 = f2;
        }
      }
      for (;;)
      {
        if ((f3 <= 0.0F) || (f1 <= 0.0F)) {
          break label1243;
        }
        localObject1 = (MMGestureGallery)this.qaT;
        if ((this.qbc) && (f1 * 1.0D > f3 * 2.0D))
        {
          w.d("MicroMsg.SnsInfoFlip", "set on fling true");
          ((MMGestureGallery)localObject1).wfO = true;
          break;
          localObject1 = com.tencent.mm.plugin.sns.model.am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), paramanu.mmR) + i.d(paramanu);
          break label239;
        }
        w.d("MicroMsg.SnsInfoFlip", "set on fling false");
        ((MMGestureGallery)localObject1).wfO = false;
        break;
        Object localObject2 = (m)this.qbt.get(paramString);
        localObject1 = localObject2;
        if (localObject2 == null)
        {
          localObject1 = com.tencent.mm.plugin.sns.model.ae.bjd().Is(paramString);
          this.qbt.put(paramString, localObject1);
        }
        if (localObject1 == null)
        {
          GMTrace.o(8435047333888L, 62846);
          return;
        }
        label573:
        long l1;
        if (paramanu.jib == 2)
        {
          if ((this.qaT instanceof MMGestureGallery)) {
            ((MMGestureGallery)this.qaT).xhI = false;
          }
          if (paramanu.jib != 6) {
            com.tencent.mm.plugin.sns.model.ae.aDa().post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8686705573888L, 64721);
                SnsInfoFlip.d(SnsInfoFlip.this).bpe();
                GMTrace.o(8686705573888L, 64721);
              }
            });
          }
          w.d("MicroMsg.SnsInfoFlip", "onItemSelected  " + paramInt + " localId " + paramString);
          if (this.qbu != paramInt)
          {
            if (!this.qaV.containsKey(Integer.valueOf(paramInt))) {
              break label1176;
            }
            i = ((Integer)this.qaV.get(Integer.valueOf(paramInt))).intValue();
            this.qaV.put(Integer.valueOf(paramInt), Integer.valueOf(i + 1));
            this.qaW.put(Integer.valueOf(paramInt), Long.valueOf(bg.Pw()));
            if (this.qbu >= 0)
            {
              if (!this.qaW.containsKey(Integer.valueOf(this.qbu))) {
                break label1182;
              }
              l1 = ((Long)this.qaW.get(Integer.valueOf(this.qbu))).longValue();
              label656:
              if (l1 > 0L)
              {
                this.qaW.put(Integer.valueOf(this.qbu), Long.valueOf(0L));
                if (this.qaX.containsKey(Integer.valueOf(this.qbu))) {
                  l2 = ((Long)this.qaX.get(Integer.valueOf(this.qbu))).longValue();
                }
                l1 = bg.aI(l1);
                l2 += l1;
                this.qaX.put(Integer.valueOf(this.qbu), Long.valueOf(l2));
                w.i("MicroMsg.SnsInfoFlip", "lastSelectPosition " + this.qbu + " curtime " + l2 + " passtime " + l1 / 1000.0D);
              }
            }
            if ((this.pYh) && (this.qaS != null))
            {
              paramanu = (com.tencent.mm.plugin.sns.g.b)this.qaS.getItem(this.qbu);
              if (paramanu != null)
              {
                paramanu = paramanu.eUs.mmR;
                w.d("MicroMsg.SnsInfoFlip", "recordMediaScollOver, bigPicId:%s", new Object[] { paramanu });
                if (this.qby.containsKey(paramanu))
                {
                  paramanu = (a)this.qby.get(paramanu);
                  paramanu.networkType = boZ();
                  if (paramanu.qbE == -1L) {
                    break label1188;
                  }
                  paramanu.qbC = 1;
                  paramanu.pwi = (paramanu.qbE - paramanu.qbD);
                  w.d("MicroMsg.SnsInfoFlip", "recordMediaScollOver, load success, costTime:%d", new Object[] { Long.valueOf(paramanu.pwi) });
                }
              }
            }
          }
        }
        for (;;)
        {
          this.qbu = paramInt;
          if (this.pSc != null) {
            this.pSc.IV(paramString);
          }
          i = ((m)localObject1).field_createTime;
          localObject2 = ((m)localObject1).blD();
          String str2 = az.k(this.context, i * 1000L);
          localObject1 = null;
          paramanu = (anu)localObject1;
          if (localObject2 != null)
          {
            paramanu = (anu)localObject1;
            if (((biz)localObject2).uUc != null)
            {
              paramanu = (anu)localObject1;
              if (((biz)localObject2).uUc.ueW.size() > 1)
              {
                i = ((biz)localObject2).uUc.ueW.size();
                paramanu = ((com.tencent.mm.plugin.sns.g.b)this.gpU.get(paramInt)).pyX + 1 + " / " + i;
                this.qbk = b(str1, (biz)localObject2);
              }
            }
          }
          this.pSd.dR(str2, paramanu);
          this.pSd.bU(paramString, paramInt);
          if (this.qaS != null) {
            this.qaS.vr(paramInt);
          }
          GMTrace.o(8435047333888L, 62846);
          return;
          if (!(this.qaT instanceof MMGestureGallery)) {
            break;
          }
          ((MMGestureGallery)this.qaT).xhI = true;
          break;
          label1176:
          i = 0;
          break label573;
          label1182:
          l1 = 0L;
          break label656;
          label1188:
          paramanu.qbC = 2;
          paramanu.qbE = System.currentTimeMillis();
          paramanu.pwi = (paramanu.qbE - paramanu.qbD);
          w.d("MicroMsg.SnsInfoFlip", "recordMediaScollOver, load failed, costTime:%d", new Object[] { Long.valueOf(paramanu.pwi) });
        }
        f3 = f2;
      }
      label1243:
      break;
      label1245:
      f1 = 0.0F;
      f2 = 0.0F;
    }
  }
  
  private static int b(String paramString, biz parambiz)
  {
    GMTrace.i(8434913116160L, 62845);
    parambiz = parambiz.uUc.ueW.iterator();
    int i = 0;
    while (parambiz.hasNext())
    {
      anu localanu = (anu)parambiz.next();
      int j = i + 1;
      i = j;
      if (paramString.equals(localanu.mmR))
      {
        GMTrace.o(8434913116160L, 62845);
        return j;
      }
    }
    GMTrace.o(8434913116160L, 62845);
    return 0;
  }
  
  private void boV()
  {
    GMTrace.i(8435584204800L, 62850);
    if ((this.qaT.getSelectedItem() == null) || (this.qaS == null))
    {
      GMTrace.o(8435584204800L, 62850);
      return;
    }
    int i = this.qaT.getSelectedItemPosition();
    if ((this.qaY) && (this.qaS.getCount() > 1))
    {
      this.qbg.setVisibility(0);
      this.qbg.uN(i);
    }
    anu localanu = ((com.tencent.mm.plugin.sns.g.b)this.qaT.getSelectedItem()).eUs;
    this.qbv.add(localanu.mmR);
    String str1 = ((com.tencent.mm.plugin.sns.g.b)this.qaT.getSelectedItem()).pyW;
    String str2 = localanu.mmR;
    if ((bg.nm(this.qbi)) || (!this.qbi.equals(str2))) {
      this.qbi = "";
    }
    a(localanu, i, str1);
    GMTrace.o(8435584204800L, 62850);
  }
  
  private static int boZ()
  {
    GMTrace.i(8437194817536L, 62862);
    Context localContext = com.tencent.mm.sdk.platformtools.ab.getContext();
    if (com.tencent.mm.sdk.platformtools.am.is2G(localContext))
    {
      GMTrace.o(8437194817536L, 62862);
      return 1;
    }
    if (com.tencent.mm.sdk.platformtools.am.is3G(localContext))
    {
      GMTrace.o(8437194817536L, 62862);
      return 2;
    }
    if (com.tencent.mm.sdk.platformtools.am.is4G(localContext))
    {
      GMTrace.o(8437194817536L, 62862);
      return 3;
    }
    if (com.tencent.mm.sdk.platformtools.am.isWifi(localContext))
    {
      GMTrace.o(8437194817536L, 62862);
      return 4;
    }
    GMTrace.o(8437194817536L, 62862);
    return 0;
  }
  
  private void init(final Context paramContext)
  {
    GMTrace.i(8434510462976L, 62842);
    this.qbm = System.currentTimeMillis();
    this.context = paramContext;
    View localView = inflate(paramContext, i.g.pfL, this);
    if (com.tencent.mm.ui.base.g.bZs()) {
      localView.findViewById(i.f.paH).setVisibility(0);
    }
    for (this.qaT = ((Gallery)localView.findViewById(i.f.paH));; this.qaT = ((Gallery)localView.findViewById(i.f.paI)))
    {
      if ((this.qaT instanceof MMGestureGallery))
      {
        this.qaT.setSpacing(50);
        ((MMGestureGallery)this.qaT).xhF = new MMGestureGallery.f()
        {
          public final void alM()
          {
            GMTrace.i(8703751225344L, 64848);
            if ((paramContext instanceof SnsBrowseUI))
            {
              ((SnsBrowseUI)paramContext).alL();
              GMTrace.o(8703751225344L, 64848);
              return;
            }
            if (SnsInfoFlip.a(SnsInfoFlip.this))
            {
              ((MMActivity)paramContext).finish();
              GMTrace.o(8703751225344L, 64848);
              return;
            }
            SnsInfoFlip.c(SnsInfoFlip.this).post(new Runnable()
            {
              public final void run()
              {
                GMTrace.i(8472494080000L, 63125);
                if ((SnsInfoFlip.this.pSd != null) && (SnsInfoFlip.b(SnsInfoFlip.this))) {
                  SnsInfoFlip.this.pSd.ahC();
                }
                GMTrace.o(8472494080000L, 63125);
              }
            });
            GMTrace.o(8703751225344L, 64848);
          }
        };
        ((MMGestureGallery)this.qaT).xhH = new MMGestureGallery.e()
        {
          public final void bpb()
          {
            GMTrace.i(8629394604032L, 64294);
            if (SnsInfoFlip.this.pSd != null) {
              SnsInfoFlip.this.pSd.bnw();
            }
            GMTrace.o(8629394604032L, 64294);
          }
        };
      }
      this.qbg = ((MMPageControlView)findViewById(i.f.peC));
      this.qbg.wdF = i.g.pgH;
      this.qbo = new HashMap();
      GMTrace.o(8434510462976L, 62842);
      return;
      localView.findViewById(i.f.paI).setVisibility(0);
    }
  }
  
  public final void a(List<com.tencent.mm.plugin.sns.g.b> paramList, String paramString, int paramInt, v paramv, t.a parama)
  {
    GMTrace.i(8435181551616L, 62847);
    com.tencent.mm.plugin.sns.model.ae.biY().a(this);
    this.gpU = paramList;
    boolean bool;
    if (this.gpU.size() > 1)
    {
      bool = true;
      this.qbl = bool;
      ai.Hv(paramString);
      this.pSc = paramv;
      this.pSd = parama;
      this.qaS = new b(this.context);
      this.qaT.setAdapter(this.qaS);
      if ((paramInt >= 0) && (paramInt < this.gpU.size()))
      {
        this.qaT.setSelection(paramInt);
        if (this.qbe)
        {
          this.qbe = false;
          paramList = ((com.tencent.mm.plugin.sns.g.b)this.gpU.get(paramInt)).eUs;
          if ((paramList == null) || (paramList.uCR == null) || (paramList.uCR.uDF <= 0.0F)) {
            break label374;
          }
        }
      }
    }
    label374:
    for (this.qbf = (paramList.uCR.uDE / paramList.uCR.uDF);; this.qbf = 1.0F)
    {
      this.qaT.setFadingEdgeLength(0);
      this.qaT.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener()
      {
        public final void onItemSelected(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
        {
          GMTrace.i(8695429726208L, 64786);
          if (SnsInfoFlip.d(SnsInfoFlip.this) != null)
          {
            if ((SnsInfoFlip.e(SnsInfoFlip.this)) && (SnsInfoFlip.d(SnsInfoFlip.this).getCount() > 1))
            {
              SnsInfoFlip.f(SnsInfoFlip.this).setVisibility(0);
              SnsInfoFlip.f(SnsInfoFlip.this).uN(paramAnonymousInt);
            }
            paramAnonymousAdapterView = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.d(SnsInfoFlip.this).getItem(paramAnonymousInt)).eUs;
            String str = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.d(SnsInfoFlip.this).getItem(paramAnonymousInt)).pyW;
            SnsInfoFlip.a(SnsInfoFlip.this, paramAnonymousAdapterView, paramAnonymousInt, str);
            if ((paramAnonymousView instanceof MultiTouchImageView)) {
              ((MultiTouchImageView)paramAnonymousView).caC();
            }
            if (((SnsInfoFlip.g(SnsInfoFlip.this) instanceof MMGestureGallery)) && ((SnsInfoFlip.h(SnsInfoFlip.this) instanceof SnsBrowseUI))) {
              ((SnsBrowseUI)SnsInfoFlip.h(SnsInfoFlip.this)).box();
            }
          }
          GMTrace.o(8695429726208L, 64786);
        }
        
        public final void onNothingSelected(AdapterView<?> paramAnonymousAdapterView)
        {
          GMTrace.i(8695563943936L, 64787);
          GMTrace.o(8695563943936L, 64787);
        }
      });
      if (this.qaU) {
        this.qaT.setOnItemLongClickListener(new AdapterView.OnItemLongClickListener()
        {
          public final boolean onItemLongClick(AdapterView<?> paramAnonymousAdapterView, View paramAnonymousView, int paramAnonymousInt, long paramAnonymousLong)
          {
            GMTrace.i(8705361838080L, 64860);
            if (!SnsInfoFlip.i(SnsInfoFlip.this))
            {
              GMTrace.o(8705361838080L, 64860);
              return true;
            }
            paramAnonymousAdapterView = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.d(SnsInfoFlip.this).getItem(paramAnonymousInt)).pyW;
            if (bg.nm(paramAnonymousAdapterView))
            {
              GMTrace.o(8705361838080L, 64860);
              return false;
            }
            paramAnonymousView = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.d(SnsInfoFlip.this).getItem(paramAnonymousInt)).eUs.mmR;
            String str = com.tencent.mm.plugin.sns.model.am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), paramAnonymousView) + i.l(((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.d(SnsInfoFlip.this).getItem(paramAnonymousInt)).eUs);
            SnsInfoFlip.this.e(str, paramAnonymousAdapterView, paramAnonymousView, true);
            GMTrace.o(8705361838080L, 64860);
            return true;
          }
        });
      }
      if ((this.qaY) && (this.qaS.getCount() > 1))
      {
        this.qbg.setVisibility(0);
        this.qbg.en(this.qaS.getCount(), paramInt);
      }
      if ((this.pYj) && (!bg.nm(((com.tencent.mm.plugin.sns.g.b)this.qaS.getItem(paramInt)).pyW)))
      {
        paramList = ((com.tencent.mm.plugin.sns.g.b)this.qaS.getItem(paramInt)).eUs.mmR;
        IS(com.tencent.mm.plugin.sns.model.am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), paramList) + i.l(((com.tencent.mm.plugin.sns.g.b)this.qaS.getItem(paramInt)).eUs));
      }
      GMTrace.o(8435181551616L, 62847);
      return;
      bool = false;
      break;
    }
  }
  
  public final void av(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8436926382080L, 62860);
    Object localObject;
    if (!paramBoolean)
    {
      localObject = ((com.tencent.mm.plugin.sns.g.b)this.qaT.getSelectedItem()).eUs;
      if ((localObject != null) && (((anu)localObject).mmR != null) && (((anu)localObject).mmR.equals(paramString)))
      {
        Toast.makeText(this.context, this.context.getString(i.j.piT), 0).show();
        this.qbi = paramString;
      }
    }
    this.qbx += 1;
    if (this.pYh)
    {
      w.d("MicroMsg.SnsInfoFlip", "recordLoadEnd, bigPicId:%s, suceess:%b", new Object[] { paramString, Boolean.valueOf(paramBoolean) });
      if ((paramBoolean) && (this.qby.containsKey(paramString)))
      {
        localObject = (a)this.qby.get(paramString);
        ((a)localObject).qbE = System.currentTimeMillis();
        ((a)localObject).networkType = boZ();
        w.d("MicroMsg.SnsInfoFlip", "recordLoadEnd, update map");
        this.qbo.put(paramString, Boolean.valueOf(true));
      }
    }
    if ((this.qaS != null) && ((com.tencent.mm.plugin.sns.g.b)this.qaT.getSelectedItem() != null))
    {
      localObject = ((com.tencent.mm.plugin.sns.g.b)this.qaT.getSelectedItem()).eUs;
      if ((localObject != null) && (((anu)localObject).mmR != null) && (((anu)localObject).mmR.equals(paramString)))
      {
        this.qaS.notifyDataSetChanged();
        if (this.pYj)
        {
          if (localObject == null)
          {
            GMTrace.o(8436926382080L, 62860);
            return;
          }
          paramString = com.tencent.mm.plugin.sns.model.am.dE(com.tencent.mm.plugin.sns.model.ae.getAccSnsPath(), ((anu)localObject).mmR);
          localObject = i.l((anu)localObject);
          if (FileOp.aZ(paramString + (String)localObject))
          {
            paramString = paramString + (String)localObject;
            localObject = new Intent();
            w.i("MicroMsg.FlipView", "edit image path:%s", new Object[] { paramString });
            ((Intent)localObject).putExtra("before_photo_edit", paramString);
            ((Intent)localObject).putExtra("from_scene", 293);
            ((Intent)localObject).putExtra("after_photo_edit", "");
            ((Intent)localObject).putExtra("Retr_Compress_Type", 0);
            ((Intent)localObject).putExtra("Retr_Msg_Type", 0);
            ((Intent)localObject).putExtra("Retr_FromMainTimeline", bnt());
            com.tencent.mm.bj.d.b(this.context, "photoedit", ".ui.MMNewPhotoEditUI", (Intent)localObject);
          }
        }
      }
    }
    GMTrace.o(8436926382080L, 62860);
  }
  
  public final void aw(String paramString, boolean paramBoolean)
  {
    GMTrace.i(8437060599808L, 62861);
    w.i("MicroMsg.SnsInfoFlip", "onSightFinish " + paramString + " " + paramBoolean);
    if (!paramBoolean)
    {
      anu localanu = ((com.tencent.mm.plugin.sns.g.b)this.qaT.getSelectedItem()).eUs;
      if ((localanu != null) && (localanu.mmR != null) && (localanu.mmR.equals(paramString)))
      {
        Toast.makeText(this.context, this.context.getString(i.j.piU), 0).show();
        this.qbi = paramString;
      }
    }
    if (this.qaS != null) {
      this.qaS.notifyDataSetChanged();
    }
    GMTrace.o(8437060599808L, 62861);
  }
  
  public final void awY()
  {
    GMTrace.i(8435718422528L, 62851);
    if (this.qaS != null)
    {
      w.d("MicroMsg.SnsInfoFlip", "onRefresh ");
      this.qaS.notifyDataSetChanged();
      boV();
    }
    GMTrace.o(8435718422528L, 62851);
  }
  
  public final long bns()
  {
    GMTrace.i(8435315769344L, 62848);
    Object localObject = (com.tencent.mm.plugin.sns.g.b)this.qaT.getSelectedItem();
    if (localObject == null) {
      localObject = "";
    }
    while (!bg.nm((String)localObject))
    {
      localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Is((String)localObject);
      if (localObject == null)
      {
        GMTrace.o(8435315769344L, 62848);
        return 0L;
        localObject = ((com.tencent.mm.plugin.sns.g.b)localObject).pyW;
      }
      else
      {
        long l = ((m)localObject).field_snsId;
        GMTrace.o(8435315769344L, 62848);
        return l;
      }
    }
    GMTrace.o(8435315769344L, 62848);
    return 0L;
  }
  
  public final boolean bnt()
  {
    GMTrace.i(8434376245248L, 62841);
    boolean bool = this.pYh;
    GMTrace.o(8434376245248L, 62841);
    return bool;
  }
  
  public final anu bnu()
  {
    GMTrace.i(8436657946624L, 62858);
    if (this.qaS != null)
    {
      int i = this.qaT.getSelectedItemPosition();
      if ((this.gpU != null) && (i < this.gpU.size()))
      {
        anu localanu = ((com.tencent.mm.plugin.sns.g.b)this.gpU.get(i)).eUs;
        GMTrace.o(8436657946624L, 62858);
        return localanu;
      }
    }
    GMTrace.o(8436657946624L, 62858);
    return null;
  }
  
  public final com.tencent.mm.plugin.sns.g.b boU()
  {
    GMTrace.i(8434778898432L, 62844);
    if (this.qaT == null)
    {
      GMTrace.o(8434778898432L, 62844);
      return null;
    }
    com.tencent.mm.plugin.sns.g.b localb = (com.tencent.mm.plugin.sns.g.b)this.qaT.getSelectedItem();
    GMTrace.o(8434778898432L, 62844);
    return localb;
  }
  
  public final void boW()
  {
    GMTrace.i(8436255293440L, 62855);
    w.i("MicroMsg.SnsInfoFlip", "sns info flip on detch.");
    if (this.qaS != null)
    {
      this.qaS.bpe();
      this.qaS.clear();
    }
    com.tencent.mm.plugin.sns.model.ae.biY().b(this);
    GMTrace.o(8436255293440L, 62855);
  }
  
  public final int boX()
  {
    GMTrace.i(8436389511168L, 62856);
    if (this.qaT == null)
    {
      GMTrace.o(8436389511168L, 62856);
      return -1;
    }
    int i = this.qaT.getSelectedItemPosition();
    this.gpU.remove(i);
    this.qaS.notifyDataSetChanged();
    boV();
    i = this.qaS.getCount();
    GMTrace.o(8436389511168L, 62856);
    return i;
  }
  
  public final int boY()
  {
    GMTrace.i(8436792164352L, 62859);
    Iterator localIterator = this.gpU.iterator();
    int k = 0;
    int j;
    for (int i = 0;; i = j)
    {
      j = i;
      if (localIterator.hasNext())
      {
        com.tencent.mm.plugin.sns.g.b localb = (com.tencent.mm.plugin.sns.g.b)localIterator.next();
        com.tencent.mm.plugin.sns.model.ae.bja();
        j = i;
        if (FileOp.aZ(com.tencent.mm.plugin.sns.model.g.B(localb.eUs))) {
          j = i + 1;
        }
        k += 1;
        if (k <= 9) {}
      }
      else
      {
        GMTrace.o(8436792164352L, 62859);
        return j;
      }
    }
  }
  
  public final void bpa()
  {
    GMTrace.i(8437329035264L, 62863);
    Iterator localIterator = this.qby.values().iterator();
    while (localIterator.hasNext())
    {
      a locala = (a)localIterator.next();
      if (locala.qbC != -1)
      {
        com.tencent.mm.plugin.report.service.g.ork.i(11601, new Object[] { Integer.valueOf(locala.pwj), Integer.valueOf(locala.qbC), Long.valueOf(locala.pwi), Integer.valueOf(locala.networkType) });
        w.d("MicroMsg.SnsInfoFlip", "report big pic load, picNum:%d, loadResult:%d, loadCostTime:%d, networkType:%d", new Object[] { Integer.valueOf(locala.pwj), Integer.valueOf(locala.qbC), Long.valueOf(locala.pwi), Integer.valueOf(locala.networkType) });
      }
      else if (locala.qbD != -1L)
      {
        if (locala.qbE != -1L) {
          locala.qbC = 1;
        }
        for (;;)
        {
          locala.pwi = (locala.qbE - locala.qbD);
          com.tencent.mm.plugin.report.service.g.ork.i(11601, new Object[] { Integer.valueOf(locala.pwj), Integer.valueOf(locala.qbC), Long.valueOf(locala.pwi), Integer.valueOf(locala.networkType) });
          w.d("MicroMsg.SnsInfoFlip", "report big pic load, picNum:%d, loadResult:%d, loadCostTime:%d, networkType:%d", new Object[] { Integer.valueOf(locala.pwj), Integer.valueOf(locala.qbC), Long.valueOf(locala.pwi), Integer.valueOf(locala.networkType) });
          break;
          locala.qbC = 2;
          locala.qbE = System.currentTimeMillis();
        }
      }
    }
    this.qby.clear();
    GMTrace.o(8437329035264L, 62863);
  }
  
  public final int getCount()
  {
    GMTrace.i(8436523728896L, 62857);
    if (this.qaS != null)
    {
      int i = this.qaS.getCount();
      GMTrace.o(8436523728896L, 62857);
      return i;
    }
    GMTrace.o(8436523728896L, 62857);
    return 0;
  }
  
  public final int getPosition()
  {
    GMTrace.i(8435449987072L, 62849);
    int i = this.qbk;
    GMTrace.o(8435449987072L, 62849);
    return i;
  }
  
  protected void onLayout(boolean paramBoolean, int paramInt1, int paramInt2, int paramInt3, int paramInt4)
  {
    GMTrace.i(8436121075712L, 62854);
    this.qbr = false;
    super.onLayout(paramBoolean, paramInt1, paramInt2, paramInt3, paramInt4);
    GMTrace.o(8436121075712L, 62854);
  }
  
  protected void onMeasure(int paramInt1, int paramInt2)
  {
    GMTrace.i(8435986857984L, 62853);
    this.qbr = true;
    super.onMeasure(paramInt1, paramInt2);
    GMTrace.o(8435986857984L, 62853);
  }
  
  protected final void onPause()
  {
    GMTrace.i(8435852640256L, 62852);
    super.onPause();
    if (this.qaS != null)
    {
      this.qaS.bpe();
      this.qaS.clear();
    }
    GMTrace.o(8435852640256L, 62852);
  }
  
  public final void vn(int paramInt)
  {
    GMTrace.i(8434644680704L, 62843);
    this.infoType = paramInt;
    GMTrace.o(8434644680704L, 62843);
  }
  
  final class a
  {
    int networkType;
    long pwi;
    int pwj;
    int qbC;
    long qbD;
    long qbE;
    String qbF;
    
    a()
    {
      GMTrace.i(8353845608448L, 62241);
      this.qbC = -1;
      this.qbD = -1L;
      this.qbE = -1L;
      this.pwi = -1L;
      GMTrace.o(8353845608448L, 62241);
    }
  }
  
  final class b
    extends BaseAdapter
  {
    private Context context;
    private String goY;
    private boolean kfD;
    private int pNX;
    private boolean qbG;
    Map<String, WeakReference<View>> qbH;
    private String qbI;
    
    public b(Context paramContext)
    {
      GMTrace.i(8739855794176L, 65117);
      this.pNX = 0;
      this.qbG = false;
      this.goY = "";
      this.kfD = true;
      this.qbH = new HashMap();
      this.context = paramContext;
      this.qbG = com.tencent.mm.ui.base.g.bZs();
      this.pNX = SnsInfoFlip.j(SnsInfoFlip.this).size();
      c.Gs();
      this.kfD = c.Gu();
      GMTrace.o(8739855794176L, 65117);
    }
    
    private void vq(int paramInt)
    {
      GMTrace.i(8740124229632L, 65119);
      anu localanu = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).eUs;
      an localan = an.a(SnsInfoFlip.k(SnsInfoFlip.this), ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).gGY);
      if (localanu.jib != 2)
      {
        GMTrace.o(8740124229632L, 65119);
        return;
      }
      com.tencent.mm.plugin.sns.model.ae.bja();
      boolean bool = com.tencent.mm.plugin.sns.model.g.a(localanu, localan);
      if ((SnsInfoFlip.l(SnsInfoFlip.this)) && (!bool)) {
        SnsInfoFlip.a(SnsInfoFlip.this, localanu.mmR);
      }
      GMTrace.o(8740124229632L, 65119);
    }
    
    public final void bpe()
    {
      GMTrace.i(8740929536000L, 65125);
      w.i("MicroMsg.SnsInfoFlip", "notify online sight stop %s", new Object[] { bg.bQW() });
      this.qbI = null;
      pk localpk = new pk();
      localpk.eUk.eHJ = 2;
      a.vgX.m(localpk);
      GMTrace.o(8740929536000L, 65125);
    }
    
    public final void clear()
    {
      GMTrace.i(8740661100544L, 65123);
      w.i("MicroMsg.SnsInfoFlip", "adapter clear.");
      this.qbH.clear();
      GMTrace.o(8740661100544L, 65123);
    }
    
    public final int getCount()
    {
      GMTrace.i(8739990011904L, 65118);
      if (SnsInfoFlip.j(SnsInfoFlip.this) == null)
      {
        GMTrace.o(8739990011904L, 65118);
        return 0;
      }
      int i = SnsInfoFlip.j(SnsInfoFlip.this).size();
      GMTrace.o(8739990011904L, 65118);
      return i;
    }
    
    public final Object getItem(int paramInt)
    {
      GMTrace.i(8741063753728L, 65126);
      if ((paramInt < SnsInfoFlip.j(SnsInfoFlip.this).size()) && (paramInt >= 0))
      {
        Object localObject = SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt);
        GMTrace.o(8741063753728L, 65126);
        return localObject;
      }
      GMTrace.o(8741063753728L, 65126);
      return null;
    }
    
    public final long getItemId(int paramInt)
    {
      GMTrace.i(8741197971456L, 65127);
      GMTrace.o(8741197971456L, 65127);
      return 0L;
    }
    
    public final int getItemViewType(int paramInt)
    {
      GMTrace.i(8740392665088L, 65121);
      if (((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).eUs.jib == 6)
      {
        GMTrace.o(8740392665088L, 65121);
        return 0;
      }
      GMTrace.o(8740392665088L, 65121);
      return 1;
    }
    
    public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
    {
      GMTrace.i(8740526882816L, 65122);
      boolean bool;
      if (((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).eUs.jib == 6)
      {
        if (paramView == null) {}
        for (bool = true;; bool = false)
        {
          w.d("MicroMsg.SnsInfoFlip", "fill view online sight %d convert view is null %b", new Object[] { Integer.valueOf(paramInt), Boolean.valueOf(bool) });
          paramViewGroup = (com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt);
          if (paramViewGroup != null) {
            break;
          }
          w.w("MicroMsg.SnsInfoFlip", "fill online sight view, but flip item is null.");
          GMTrace.o(8740526882816L, 65122);
          return paramView;
        }
        localObject1 = paramViewGroup.pyW;
        if (bg.nm((String)localObject1))
        {
          w.w("MicroMsg.SnsInfoFlip", "fill online sight view, but sns local id is null.");
          GMTrace.o(8740526882816L, 65122);
          return paramView;
        }
        paramView = (WeakReference)this.qbH.get(localObject1);
        if ((paramView != null) && (paramView.get() != null)) {
          paramView = (OnlineVideoView)paramView.get();
        }
        for (;;)
        {
          if (bg.eW((String)localObject1, this.qbI)) {
            vr(paramInt);
          }
          w.i("MicroMsg.SnsInfoFlip", "return online sight view %d parent id %s", new Object[] { Integer.valueOf(paramView.hashCode()), paramViewGroup.pyW });
          GMTrace.o(8740526882816L, 65122);
          return paramView;
          paramView = new OnlineVideoView(this.context);
          this.qbH.put(localObject1, new WeakReference(paramView));
        }
      }
      Object localObject2 = ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).eUs;
      w.d("MicroMsg.SnsInfoFlip", "gallery position " + paramInt + " " + this.pNX + " " + ((anu)localObject2).mmR);
      if ((paramInt != SnsInfoFlip.m(SnsInfoFlip.this)) && ((SnsInfoFlip.g(SnsInfoFlip.this) instanceof MMGestureGallery))) {
        ((MMGestureGallery)SnsInfoFlip.g(SnsInfoFlip.this)).xhI = false;
      }
      an localan;
      int i;
      label581:
      Object localObject3;
      if (paramView == null)
      {
        paramViewGroup = new SnsInfoFlip.d();
        paramView = View.inflate(this.context, i.g.pfI, null);
        paramViewGroup.qbJ = paramView.findViewById(i.f.pae);
        paramViewGroup.lYn = ((ProgressBar)paramView.findViewById(i.f.bUy));
        paramViewGroup.mCC = ((TextView)paramView.findViewById(i.f.pcZ));
        paramViewGroup.qbK = ((FrameLayout)paramView.findViewById(i.f.oZY));
        paramViewGroup.eKZ = ((ImageView)paramView.findViewById(i.f.image));
        paramView.setTag(paramViewGroup);
        paramViewGroup.position = paramInt;
        localan = an.a(SnsInfoFlip.k(SnsInfoFlip.this), ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).gGY);
        paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
        paramViewGroup.lYn.setVisibility(8);
        paramViewGroup.mCC.setVisibility(8);
        paramViewGroup.qbK.setVisibility(0);
        if ((bg.nm(SnsInfoFlip.n(SnsInfoFlip.this))) || (!SnsInfoFlip.n(SnsInfoFlip.this).equals(((anu)localObject2).mmR))) {
          break label1232;
        }
        i = 1;
        if ((!((anu)localObject2).mmR.startsWith("Locall_path")) || (bg.nm(((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).pyW))) {
          break label1478;
        }
        localObject3 = (m)SnsInfoFlip.o(SnsInfoFlip.this).get(((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).pyW);
        localObject1 = localObject3;
        if (localObject3 == null)
        {
          localObject1 = com.tencent.mm.plugin.sns.model.ae.bjd().Is(((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).pyW);
          SnsInfoFlip.o(SnsInfoFlip.this).put(((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).pyW, localObject1);
        }
        localObject1 = ((m)localObject1).blD();
        if (((biz)localObject1).uUc.ueW.size() <= ((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).pyX) {
          break label1478;
        }
      }
      label825:
      label1009:
      label1158:
      label1232:
      label1244:
      label1250:
      label1427:
      label1478:
      for (Object localObject1 = (anu)((biz)localObject1).uUc.ueW.get(((com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt)).pyX);; localObject1 = localObject2)
      {
        localObject2 = com.tencent.mm.plugin.sns.model.ae.bja();
        localObject3 = paramViewGroup.eKZ;
        int j = this.context.hashCode();
        if (i == 0)
        {
          bool = true;
          localObject2 = ((com.tencent.mm.plugin.sns.model.g)localObject2).a((anu)localObject1, (View)localObject3, j, bool, localan);
          if ((localObject2 == null) && (SnsInfoFlip.l(SnsInfoFlip.this))) {
            SnsInfoFlip.a(SnsInfoFlip.this, ((anu)localObject1).mmR);
          }
          localObject3 = paramViewGroup.eKZ.getLayoutParams();
          ((ViewGroup.LayoutParams)localObject3).width = -1;
          ((ViewGroup.LayoutParams)localObject3).height = -1;
          paramViewGroup.eKZ.setLayoutParams((ViewGroup.LayoutParams)localObject3);
          if ((localObject2 != null) || (((anu)localObject1).mmR == null) || (((anu)localObject1).mmR.startsWith("pre_temp_extend_pic"))) {
            break label1250;
          }
          ViewGroup.LayoutParams localLayoutParams = paramViewGroup.eKZ.getLayoutParams();
          BackwardSupportUtil.b.a(this.context, 160.0F);
          j = BackwardSupportUtil.b.a(this.context, 200.0F);
          BackwardSupportUtil.b.a(this.context, 44.0F);
          localObject2 = com.tencent.mm.plugin.sns.model.ae.bja();
          String str1 = i.ar(1, ((anu)localObject1).mmR);
          String str2 = ((anu)localObject1).mmR;
          localObject2 = ((com.tencent.mm.plugin.sns.model.g)localObject2).Hj(str1);
          if (!i.a((com.tencent.mm.memory.n)localObject2)) {
            break label1244;
          }
          if (localObject2 != null)
          {
            double d1 = ((com.tencent.mm.memory.n)localObject2).bitmap.getWidth();
            double d2 = ((com.tencent.mm.memory.n)localObject2).bitmap.getHeight();
            if ((d1 > 0.0D) && (d2 > 0.0D)) {
              Math.min(j / d1, j / d2);
            }
          }
          paramViewGroup.eKZ.setLayoutParams((ViewGroup.LayoutParams)localObject3);
          paramViewGroup.lYn.setVisibility(0);
          paramViewGroup.eKZ.setVisibility(0);
          com.tencent.mm.plugin.sns.model.ae.bja().cq(paramViewGroup.eKZ);
          com.tencent.mm.plugin.sns.model.ae.bja().c((anu)localObject1, paramViewGroup.eKZ, i.e.black, this.context.hashCode(), localan);
          SnsInfoFlip.vo(localLayoutParams.width);
          SnsInfoFlip.vp(localLayoutParams.height);
          if (i != 0) {
            paramViewGroup.lYn.setVisibility(8);
          }
        }
        for (;;)
        {
          if ((this.kfD) && (com.tencent.mm.network.ab.bv(this.context)))
          {
            if (paramInt - 1 >= 0) {
              vq(paramInt - 1);
            }
            if (paramInt + 1 < SnsInfoFlip.d(SnsInfoFlip.this).getCount()) {
              vq(paramInt + 1);
            }
          }
          do
          {
            GMTrace.o(8740526882816L, 65122);
            return paramView;
            paramViewGroup = (SnsInfoFlip.d)paramView.getTag();
            break;
            i = 0;
            break label581;
            bool = false;
            break label825;
            localObject2 = null;
            break label1009;
            if (!this.qbG) {
              break label1427;
            }
            paramViewGroup.lYn.setVisibility(8);
            if (localObject2 == null) {
              break label1158;
            }
          } while (SnsInfoFlip.p(SnsInfoFlip.this));
          w.i("MicroMsg.SnsInfoFlip", "update view ");
          paramView = new MultiTouchImageView(this.context, ((Bitmap)localObject2).getWidth(), ((Bitmap)localObject2).getHeight(), SnsInfoFlip.q(SnsInfoFlip.this));
          paramView.qbc = SnsInfoFlip.r(SnsInfoFlip.this);
          paramView.setLayoutParams(new Gallery.LayoutParams(-1, -1));
          com.tencent.mm.plugin.sns.model.ae.bja().c((anu)localObject1, paramView, this.context.hashCode(), localan);
          paramView.setImageBitmap((Bitmap)localObject2);
          w.d("MicroMsg.SnsInfoFlip", "dancy mediaId: %s, isbigImgLoaded: %s, view: %s", new Object[] { ((anu)localObject1).mmR, SnsInfoFlip.s(SnsInfoFlip.this).get(((anu)localObject1).mmR), Integer.valueOf(paramView.getId()) });
          GMTrace.o(8740526882816L, 65122);
          return paramView;
          paramViewGroup.lYn.setVisibility(8);
          com.tencent.mm.plugin.sns.model.ae.bja().c((anu)localObject1, paramViewGroup.eKZ, this.context.hashCode(), localan);
          paramViewGroup.eKZ.setImageBitmap((Bitmap)localObject2);
          paramViewGroup.eKZ.setVisibility(0);
        }
      }
    }
    
    public final int getViewTypeCount()
    {
      GMTrace.i(8740258447360L, 65120);
      GMTrace.o(8740258447360L, 65120);
      return 2;
    }
    
    public final void notifyDataSetChanged()
    {
      GMTrace.i(8741332189184L, 65128);
      this.pNX = SnsInfoFlip.j(SnsInfoFlip.this).size();
      w.d("MicroMsg.SnsInfoFlip", "items.size:" + SnsInfoFlip.j(SnsInfoFlip.this).size());
      SnsInfoFlip.this.invalidate();
      SnsInfoFlip.this.requestLayout();
      super.notifyDataSetChanged();
      if ((SnsInfoFlip.j(SnsInfoFlip.this).size() <= 0) && (SnsInfoFlip.t(SnsInfoFlip.this) != null)) {
        SnsInfoFlip.t(SnsInfoFlip.this).run();
      }
      GMTrace.o(8741332189184L, 65128);
    }
    
    public final void vr(int paramInt)
    {
      GMTrace.i(8740795318272L, 65124);
      Object localObject1 = (com.tencent.mm.plugin.sns.g.b)SnsInfoFlip.j(SnsInfoFlip.this).get(paramInt);
      if (localObject1 == null)
      {
        w.w("MicroMsg.SnsInfoFlip", "notify online sight play, but flip item is null.");
        GMTrace.o(8740795318272L, 65124);
        return;
      }
      String str = ((com.tencent.mm.plugin.sns.g.b)localObject1).pyW;
      if (bg.nm(str))
      {
        w.w("MicroMsg.SnsInfoFlip", "notify online sight play, but sns local id is null.");
        GMTrace.o(8740795318272L, 65124);
        return;
      }
      w.i("MicroMsg.SnsInfoFlip", "notify online sight play pos %s sns local id %s", new Object[] { Integer.valueOf(paramInt), str });
      Object localObject2 = (WeakReference)this.qbH.get(str);
      if (localObject2 == null)
      {
        w.w("MicroMsg.SnsInfoFlip", "notify online sight play, but view cache is null ");
        this.qbI = str;
        GMTrace.o(8740795318272L, 65124);
        return;
      }
      localObject2 = (OnlineVideoView)((WeakReference)localObject2).get();
      if (localObject2 == null)
      {
        w.w("MicroMsg.SnsInfoFlip", "online sight view is null, do nothing. snsLocalId %s", new Object[] { str });
        this.qbI = str;
        GMTrace.o(8740795318272L, 65124);
        return;
      }
      w.i("MicroMsg.SnsInfoFlip", "%d notify online sight play video %s", new Object[] { Integer.valueOf(localObject2.hashCode()), str });
      this.qbI = null;
      w.d("MicroMsg.OnlineVideoView", "%d register sns ui event", new Object[] { Integer.valueOf(localObject2.hashCode()) });
      a.vgX.b(((OnlineVideoView)localObject2).pUM);
      ((OnlineVideoView)localObject2).a(((com.tencent.mm.plugin.sns.g.b)localObject1).eUs, ((com.tencent.mm.plugin.sns.g.b)localObject1).pyW, ((com.tencent.mm.plugin.sns.g.b)localObject1).gGY);
      localObject1 = new pk();
      ((pk)localObject1).eUk.eHJ = 1;
      ((pk)localObject1).eUk.eHy = str;
      a.vgX.m((com.tencent.mm.sdk.b.b)localObject1);
      GMTrace.o(8740795318272L, 65124);
    }
  }
  
  public static abstract interface c
  {
    public abstract void vs(int paramInt);
  }
  
  static final class d
  {
    ImageView eKZ;
    ProgressBar lYn;
    TextView mCC;
    int position;
    View qbJ;
    FrameLayout qbK;
    String videoPath;
    
    d()
    {
      GMTrace.i(8554903764992L, 63739);
      this.videoPath = "";
      GMTrace.o(8554903764992L, 63739);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\SnsInfoFlip.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */