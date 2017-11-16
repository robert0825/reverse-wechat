package com.tencent.mm.plugin.sns.ui;

import android.content.Context;
import android.view.ContextMenu;
import android.view.ContextMenu.ContextMenuInfo;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnCreateContextMenuListener;
import android.view.View.OnTouchListener;
import android.view.animation.Animation;
import android.view.animation.Animation.AnimationListener;
import android.view.animation.ScaleAnimation;
import android.widget.LinearLayout;
import android.widget.ListView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.g.a.jn;
import com.tencent.mm.g.a.qb;
import com.tencent.mm.g.a.qc;
import com.tencent.mm.g.a.qd;
import com.tencent.mm.plugin.sns.i.j;
import com.tencent.mm.plugin.sns.model.ao;
import com.tencent.mm.plugin.sns.model.ao.b;
import com.tencent.mm.plugin.sns.storage.m;
import com.tencent.mm.plugin.sns.storage.n;
import com.tencent.mm.plugin.sns.ui.a.a.c;
import com.tencent.mm.plugin.sns.ui.a.e;
import com.tencent.mm.plugin.sns.ui.a.e.a;
import com.tencent.mm.plugin.sns.ui.a.f;
import com.tencent.mm.plugin.sns.ui.a.f.a;
import com.tencent.mm.plugin.sns.ui.a.g;
import com.tencent.mm.plugin.sns.ui.widget.SnsCommentPreloadTextView;
import com.tencent.mm.protocal.c.anu;
import com.tencent.mm.protocal.c.anv;
import com.tencent.mm.protocal.c.biz;
import com.tencent.mm.protocal.c.cs;
import com.tencent.mm.protocal.c.oa;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.y.ak.b.a;
import com.tencent.mm.y.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Set;

public final class av
  implements y
{
  public MMActivity ezR;
  protected com.tencent.mm.sdk.platformtools.ae handler;
  private ListView hvF;
  com.tencent.mm.sdk.b.c ian;
  public com.tencent.mm.ui.tools.l jGV;
  public com.tencent.mm.ui.widget.h juL;
  protected HashMap<String, Integer> pPD;
  public View.OnTouchListener pSw;
  protected ScaleAnimation pYF;
  protected ScaleAnimation pYG;
  public ar pYM;
  private int pYP;
  public k pYR;
  public bg pYU;
  boolean pYh;
  com.tencent.mm.sdk.b.c pZf;
  com.tencent.mm.sdk.b.c pZg;
  com.tencent.mm.sdk.b.c pZh;
  public com.tencent.mm.plugin.sns.ui.b.b pxE;
  public j qgA;
  protected LinkedList<SnsCommentPreloadTextView> qgB;
  public HashMap<Integer, WeakReference<View>> qgC;
  public View qgD;
  public int qgE;
  int qgF;
  protected HashMap<Integer, View> qgG;
  public HashMap<String, String> qgH;
  private HashMap<Integer, com.tencent.mm.plugin.sns.ui.a.a> qgI;
  private HashMap<Integer, a.c> qgJ;
  public View.OnClickListener qgK;
  public View.OnClickListener qgL;
  public HashMap<String, Boolean> qgM;
  private c qgN;
  protected x qgz;
  protected int requestType;
  
  public av(MMActivity paramMMActivity, ListView paramListView, com.tencent.mm.plugin.sns.ui.b.b paramb, j paramj, int paramInt, final x paramx)
  {
    GMTrace.i(8574767988736L, 63887);
    this.qgB = new LinkedList();
    this.qgC = new HashMap();
    this.pYh = false;
    this.pYP = 0;
    this.qgE = -1;
    this.qgF = 0;
    this.pPD = new HashMap();
    this.qgG = new HashMap();
    this.requestType = 0;
    this.handler = new com.tencent.mm.sdk.platformtools.ae();
    this.qgH = new HashMap();
    this.pZg = new com.tencent.mm.sdk.b.c() {};
    this.pZf = new com.tencent.mm.sdk.b.c() {};
    this.pZh = new com.tencent.mm.sdk.b.c() {};
    this.qgI = new HashMap();
    this.qgI.put(Integer.valueOf(6), new f());
    this.qgI.put(Integer.valueOf(2), new e());
    this.qgI.put(Integer.valueOf(3), new e());
    this.qgI.put(Integer.valueOf(4), new e());
    this.qgI.put(Integer.valueOf(5), new e());
    this.qgI.put(Integer.valueOf(0), new com.tencent.mm.plugin.sns.ui.a.c());
    this.qgI.put(Integer.valueOf(1), new com.tencent.mm.plugin.sns.ui.a.d());
    this.qgI.put(Integer.valueOf(7), new com.tencent.mm.plugin.sns.ui.a.d());
    this.qgI.put(Integer.valueOf(8), new com.tencent.mm.plugin.sns.ui.a.d());
    this.qgI.put(Integer.valueOf(9), new g());
    this.qgI.put(Integer.valueOf(11), new com.tencent.mm.plugin.sns.ui.a.b());
    this.qgI.put(Integer.valueOf(10), new com.tencent.mm.plugin.sns.ui.a.d());
    this.qgJ = new HashMap();
    this.qgJ.put(Integer.valueOf(6), new f.a());
    this.qgJ.put(Integer.valueOf(2), new e.a());
    this.qgJ.put(Integer.valueOf(3), new e.a());
    this.qgJ.put(Integer.valueOf(4), new e.a());
    this.qgJ.put(Integer.valueOf(5), new e.a());
    this.qgJ.put(Integer.valueOf(0), new e.a());
    this.qgJ.put(Integer.valueOf(1), new e.a());
    this.qgJ.put(Integer.valueOf(7), new e.a());
    this.qgJ.put(Integer.valueOf(8), new e.a());
    this.qgJ.put(Integer.valueOf(9), new e.a());
    this.qgJ.put(Integer.valueOf(10), new e.a());
    this.qgK = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8751398518784L, 65203);
        w.i("MicroMsg.SnsTimeLineBaseAdapter", "showCommentBtn");
        com.tencent.mm.plugin.sns.abtest.a.bhx();
        if (!(paramAnonymousView.getTag() instanceof a.c))
        {
          w.e("MicroMsg.SnsTimeLineBaseAdapter", "showCommentBtn err1");
          GMTrace.o(8751398518784L, 65203);
          return;
        }
        a.c localc = (a.c)paramAnonymousView.getTag();
        if ((localc.qlX != null) && (localc.qlX.uUc.ueV == 21))
        {
          anv localanv = localc.pMp;
          if ((!q.zE().equals(localc.qlX.jhi)) && ((localanv == null) || (localanv.eYn == 0)))
          {
            com.tencent.mm.plugin.sns.lucky.ui.a.e(av.this.ezR, localc.qlx.vk(0));
            GMTrace.o(8751398518784L, 65203);
            return;
          }
        }
        if ((av.this.ezR instanceof u)) {
          ((u)av.this.ezR).cC(paramAnonymousView);
        }
        GMTrace.o(8751398518784L, 65203);
      }
    };
    this.qgL = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(8505511641088L, 63371);
        if (!(paramAnonymousView.getTag() instanceof a.c))
        {
          GMTrace.o(8505511641088L, 63371);
          return;
        }
        paramAnonymousView = (a.c)paramAnonymousView.getTag();
        if (paramAnonymousView == null)
        {
          GMTrace.o(8505511641088L, 63371);
          return;
        }
        if ((av.this.pPD.containsKey(paramAnonymousView.eEM)) && (((Integer)av.this.pPD.get(paramAnonymousView.eEM)).equals(Integer.valueOf(1))))
        {
          av.this.pPD.put(paramAnonymousView.eEM, Integer.valueOf(2));
          av.this.qgz.notifyDataSetChanged();
          GMTrace.o(8505511641088L, 63371);
          return;
        }
        av.this.pPD.put(paramAnonymousView.eEM, Integer.valueOf(1));
        if (paramAnonymousView.lFh.getTop() < 0)
        {
          av.this.pxE.c(paramAnonymousView.lFh, paramAnonymousView.position, paramAnonymousView.lFh.getTop(), paramAnonymousView.qla.bmS());
          GMTrace.o(8505511641088L, 63371);
          return;
        }
        av.this.qgz.notifyDataSetChanged();
        GMTrace.o(8505511641088L, 63371);
      }
    };
    this.pSw = com.tencent.mm.sdk.platformtools.bg.bQV();
    this.qgM = new HashMap();
    this.qgN = new c();
    this.ian = new com.tencent.mm.sdk.b.c() {};
    this.qgz = paramx;
    this.qgA = paramj;
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "SnsTimeLineAdapter 2");
    this.hvF = paramListView;
    com.tencent.mm.plugin.sns.model.ae.bja();
    this.ezR = paramMMActivity;
    this.pxE = paramb;
    this.jGV = new com.tencent.mm.ui.tools.l(paramMMActivity);
    this.juL = new com.tencent.mm.ui.widget.h(paramMMActivity);
    this.pYM = new ar(paramMMActivity, (byte)0);
    this.pYF = new ScaleAnimation(0.0F, 1.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
    this.pYF.setDuration(150L);
    this.pYG = new ScaleAnimation(1.0F, 0.0F, 1.0F, 1.0F, 1, 1.0F, 1, 0.0F);
    this.pYG.setDuration(150L);
    this.pYR = new k(paramMMActivity, 0, paramj.pOZ);
    this.requestType = 10;
    this.pYU = new bg(paramMMActivity, new bg.a()
    {
      public final void boE()
      {
        GMTrace.i(8710193676288L, 64896);
        paramx.notifyDataSetChanged();
        GMTrace.o(8710193676288L, 64896);
      }
    }, 0, paramj.pOZ);
    com.tencent.mm.sdk.b.a.vgX.b(this.ian);
    GMTrace.o(8574767988736L, 63887);
  }
  
  public static String Jp(String paramString)
  {
    GMTrace.i(8575573295104L, 63893);
    if (com.tencent.mm.sdk.platformtools.bg.nm(paramString))
    {
      GMTrace.o(8575573295104L, 63893);
      return paramString;
    }
    int i = paramString.indexOf("://");
    String str = paramString;
    if (i != -1) {
      str = paramString.substring(i + 3);
    }
    i = str.indexOf("/");
    paramString = str;
    if (i != -1) {
      paramString = str.substring(0, i);
    }
    GMTrace.o(8575573295104L, 63893);
    return paramString;
  }
  
  public static String Jq(String paramString)
  {
    GMTrace.i(8575975948288L, 63896);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "url:" + paramString);
    paramString = com.tencent.mm.plugin.sns.c.a.hnI.s(paramString, "timeline");
    GMTrace.o(8575975948288L, 63896);
    return paramString;
  }
  
  public static String a(biz parambiz, Context paramContext)
  {
    GMTrace.i(8575841730560L, 63895);
    parambiz = com.tencent.mm.plugin.sns.c.a.hnI.f(paramContext, parambiz.uUb.mmR, "timeline");
    GMTrace.o(8575841730560L, 63895);
    return parambiz;
  }
  
  protected static int d(biz parambiz)
  {
    GMTrace.i(8575439077376L, 63892);
    if (parambiz.uUc.ueV == 1)
    {
      int i = parambiz.uUc.ueW.size();
      if (i <= 1)
      {
        GMTrace.o(8575439077376L, 63892);
        return 2;
      }
      if (i <= 3)
      {
        GMTrace.o(8575439077376L, 63892);
        return 3;
      }
      if (i <= 6)
      {
        GMTrace.o(8575439077376L, 63892);
        return 4;
      }
      GMTrace.o(8575439077376L, 63892);
      return 5;
    }
    switch (parambiz.uUc.ueV)
    {
    case 3: 
    case 6: 
    case 9: 
    case 10: 
    case 11: 
    case 12: 
    case 13: 
    case 16: 
    case 17: 
    case 18: 
    case 19: 
    case 20: 
    default: 
      GMTrace.o(8575439077376L, 63892);
      return 1;
    case 4: 
      GMTrace.o(8575439077376L, 63892);
      return 0;
    case 5: 
      GMTrace.o(8575439077376L, 63892);
      return 1;
    case 2: 
      GMTrace.o(8575439077376L, 63892);
      return 6;
    case 1: 
    case 8: 
      GMTrace.o(8575439077376L, 63892);
      return 3;
    case 7: 
      GMTrace.o(8575439077376L, 63892);
      return 2;
    case 14: 
      GMTrace.o(8575439077376L, 63892);
      return 7;
    case 15: 
      if (parambiz.uUj == 1)
      {
        GMTrace.o(8575439077376L, 63892);
        return 1;
      }
      GMTrace.o(8575439077376L, 63892);
      return 9;
    }
    GMTrace.o(8575439077376L, 63892);
    return 11;
  }
  
  protected static String e(biz parambiz)
  {
    GMTrace.i(8575707512832L, 63894);
    parambiz = com.tencent.mm.plugin.sns.c.a.hnI.s(parambiz.uUc.lPM, "timeline");
    GMTrace.o(8575707512832L, 63894);
    return parambiz;
  }
  
  public final void Jj(String paramString)
  {
    GMTrace.i(16045326729216L, 119547);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "postDescTranslateStart, id: %s", new Object[] { paramString });
    Object localObject = com.tencent.mm.plugin.sns.model.ae.bjd().Ir(paramString);
    if (localObject != null)
    {
      localObject = ((m)localObject).blY();
      if ((this.pPD.containsKey(localObject)) && (((Integer)this.pPD.get(localObject)).equals(Integer.valueOf(1)))) {
        this.pPD.put(localObject, Integer.valueOf(2));
      }
      ao.bN(paramString, 2);
      notifyDataSetChanged();
    }
    GMTrace.o(16045326729216L, 119547);
  }
  
  public final void Jk(String paramString)
  {
    GMTrace.i(16045460946944L, 119548);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "postDescTranslateFinish, id: %s", new Object[] { paramString });
    ao.bN(paramString, 2);
    notifyDataSetChanged();
    GMTrace.o(16045460946944L, 119548);
  }
  
  public final void Jl(String paramString)
  {
    GMTrace.i(16045595164672L, 119549);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "unTranslatePostDesc, id: %s", new Object[] { paramString });
    ao.bO(paramString, 2);
    notifyDataSetChanged();
    GMTrace.o(16045595164672L, 119549);
  }
  
  public final void Jm(String paramString)
  {
    GMTrace.i(16045729382400L, 119550);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "commentTranslateStart, id: %s", new Object[] { paramString });
    ao.bN(paramString, 2);
    notifyDataSetChanged();
    GMTrace.o(16045729382400L, 119550);
  }
  
  public final void Jn(String paramString)
  {
    GMTrace.i(16045863600128L, 119551);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "commentTranslateFinish, id: %s", new Object[] { paramString });
    ao.bN(paramString, 2);
    notifyDataSetChanged();
    GMTrace.o(16045863600128L, 119551);
  }
  
  public final void Jo(String paramString)
  {
    GMTrace.i(16045997817856L, 119552);
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "unTranslateComment, id: %s", new Object[] { paramString });
    ao.bO(paramString, 2);
    notifyDataSetChanged();
    GMTrace.o(16045997817856L, 119552);
  }
  
  public final void a(SnsCommentPreloadTextView paramSnsCommentPreloadTextView)
  {
    GMTrace.i(8574231117824L, 63883);
    this.qgB.add(paramSnsCommentPreloadTextView);
    GMTrace.o(8574231117824L, 63883);
  }
  
  public final SnsCommentPreloadTextView bpA()
  {
    GMTrace.i(8574096900096L, 63882);
    if (this.qgB.size() == 0)
    {
      localSnsCommentPreloadTextView = new SnsCommentPreloadTextView(this.ezR);
      GMTrace.o(8574096900096L, 63882);
      return localSnsCommentPreloadTextView;
    }
    SnsCommentPreloadTextView localSnsCommentPreloadTextView = (SnsCommentPreloadTextView)this.qgB.removeFirst();
    GMTrace.o(8574096900096L, 63882);
    return localSnsCommentPreloadTextView;
  }
  
  public final boolean bpB()
  {
    GMTrace.i(8574365335552L, 63884);
    if (this.qgB != null) {
      this.qgB.clear();
    }
    if (this.qgJ != null) {
      this.qgJ.clear();
    }
    if (this.qgI != null) {
      this.qgI.clear();
    }
    com.tencent.mm.pluginsdk.ui.d.h.clearCache();
    com.tencent.mm.kiss.widget.textview.c.gaW.xN();
    GMTrace.o(8574365335552L, 63884);
    return true;
  }
  
  public final void bpC()
  {
    GMTrace.i(8574633771008L, 63886);
    this.qgz.bny();
    GMTrace.o(8574633771008L, 63886);
  }
  
  public final void bpD()
  {
    GMTrace.i(8574902206464L, 63888);
    int i = this.hvF.getFirstVisiblePosition() - this.hvF.getHeaderViewsCount();
    int j = this.hvF.getLastVisiblePosition() - this.hvF.getHeaderViewsCount();
    w.i("MicroMsg.SnsTimeLineBaseAdapter", "reConverItem start ~ end" + i + " " + j);
    int k = this.qgz.getCount();
    if ((i <= j) && (i < k))
    {
      m localm = vf(i);
      Object localObject = (View)this.qgG.get(Integer.valueOf(i));
      if ((localObject == null) || (localm == null) || (((View)localObject).getTag() == null)) {
        w.e("MicroMsg.SnsTimeLineBaseAdapter", " passe " + i);
      }
      for (;;)
      {
        i += 1;
        break;
        localObject = (a.c)((View)localObject).getTag();
        w.i("MicroMsg.SnsTimeLineBaseAdapter", "reConverItem " + i + " " + ((a.c)localObject).position);
        ((a.c)localObject).qma.a((a.c)localObject, i, localm);
      }
    }
    GMTrace.o(8574902206464L, 63888);
  }
  
  public final x bpE()
  {
    GMTrace.i(8575304859648L, 63891);
    x localx = this.qgz;
    GMTrace.o(8575304859648L, 63891);
    return localx;
  }
  
  public final void bpy()
  {
    GMTrace.i(8573828464640L, 63880);
    this.pPD.clear();
    GMTrace.o(8573828464640L, 63880);
  }
  
  public final u bpz()
  {
    GMTrace.i(8573962682368L, 63881);
    if ((this.ezR instanceof u))
    {
      u localu = (u)this.ezR;
      GMTrace.o(8573962682368L, 63881);
      return localu;
    }
    GMTrace.o(8573962682368L, 63881);
    return null;
  }
  
  public final void cD(View paramView)
  {
    GMTrace.i(8576244383744L, 63898);
    if (!(paramView.getTag() instanceof a.c))
    {
      GMTrace.o(8576244383744L, 63898);
      return;
    }
    w.d("MicroMsg.SnsTimeLineBaseAdapter", "close comment v");
    if ((this.qgD != null) && (this.qgD.getVisibility() == 0))
    {
      this.qgD.startAnimation(this.pYG);
      this.pYG.setAnimationListener(new Animation.AnimationListener()
      {
        public final void onAnimationEnd(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8689121492992L, 64739);
          if (av.this.qgD != null)
          {
            av.this.qgD.clearAnimation();
            av.this.qgD.setVisibility(8);
          }
          av.this.qgD = null;
          GMTrace.o(8689121492992L, 64739);
        }
        
        public final void onAnimationRepeat(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8688987275264L, 64738);
          GMTrace.o(8688987275264L, 64738);
        }
        
        public final void onAnimationStart(Animation paramAnonymousAnimation)
        {
          GMTrace.i(8688853057536L, 64737);
          GMTrace.o(8688853057536L, 64737);
        }
      });
    }
    GMTrace.o(8576244383744L, 63898);
  }
  
  public final View g(int paramInt, View paramView)
  {
    GMTrace.i(8575036424192L, 63889);
    Object localObject4 = this.qgz.vf(paramInt);
    biz localbiz = ((m)localObject4).blD();
    int i = d(localbiz);
    Object localObject1;
    Object localObject3;
    Object localObject2;
    if (paramView == null) {
      switch (i)
      {
      default: 
        paramView = new com.tencent.mm.plugin.sns.ui.a.d();
        localObject1 = new e.a();
        ((a.c)localObject1).qma = paramView;
        ((a.c)localObject1).qlX = localbiz;
        localObject3 = paramView.a(this.ezR, (a.c)localObject1, i, this, (m)localObject4);
        localObject2 = paramView;
        paramView = (View)localObject3;
      }
    }
    ArrayList localArrayList;
    for (;;)
    {
      ((com.tencent.mm.plugin.sns.ui.a.a)localObject2).ig(this.pYh);
      localObject3 = ((m)localObject4).blE();
      localArrayList = new ArrayList();
      if (ao.bjG().size() <= 0) {
        break label414;
      }
      Iterator localIterator = ao.bjG().keySet().iterator();
      while (localIterator.hasNext())
      {
        Object localObject5 = (String)localIterator.next();
        if (((String)localObject5).startsWith((String)localObject3))
        {
          localObject5 = (ao.b)ao.bjG().get(localObject5);
          if (ao.c((ao.b)localObject5)) {
            localArrayList.add(localObject5);
          }
        }
      }
      paramView = new f();
      break;
      paramView = new e();
      break;
      paramView = new e();
      break;
      paramView = new e();
      break;
      paramView = new e();
      break;
      paramView = new com.tencent.mm.plugin.sns.ui.a.c();
      break;
      paramView = new com.tencent.mm.plugin.sns.ui.a.d();
      break;
      paramView = new com.tencent.mm.plugin.sns.ui.a.d();
      break;
      paramView = new com.tencent.mm.plugin.sns.ui.a.d();
      break;
      paramView = new g();
      break;
      paramView = new com.tencent.mm.plugin.sns.ui.a.d();
      break;
      paramView = new com.tencent.mm.plugin.sns.ui.a.b();
      break;
      localObject1 = (a.c)paramView.getTag();
      localObject2 = ((a.c)localObject1).qma;
    }
    label414:
    ((com.tencent.mm.plugin.sns.ui.a.a)localObject2).qkT = localArrayList;
    ((com.tencent.mm.plugin.sns.ui.a.a)localObject2).a((a.c)localObject1, paramInt, (m)localObject4, localbiz, i, this);
    if (ao.bP(((m)localObject4).blE(), 2))
    {
      localObject2 = ao.HA(((m)localObject4).blE());
      if (((m)localObject4).field_snsId == 0L) {
        localObject2 = new ao.b();
      }
      if (((ao.b)localObject2).gpJ) {
        if (!((ao.b)localObject2).gsF)
        {
          localObject3 = ((ao.b)localObject2).result;
          localObject4 = ((ao.b)localObject2).gxw;
          if ((localObject1 != null) && (((a.c)localObject1).qld != null))
          {
            ((a.c)localObject1).qld.a((ao.b)localObject2, 1, (String)localObject3, (String)localObject4, ((ao.b)localObject2).pvS);
            ((a.c)localObject1).qld.setVisibility(0);
          }
        }
      }
    }
    for (;;)
    {
      this.qgG.put(Integer.valueOf(paramInt), paramView);
      GMTrace.o(8575036424192L, 63889);
      return paramView;
      com.tencent.mm.plugin.sns.ui.a.a.e((a.c)localObject1);
      ao.bO(((ao.b)localObject2).id, 2);
      continue;
      if ((localObject1 != null) && (((a.c)localObject1).qld != null))
      {
        ((a.c)localObject1).qld.vA(1);
        ((a.c)localObject1).qld.setVisibility(0);
        continue;
        com.tencent.mm.plugin.sns.ui.a.a.e((a.c)localObject1);
      }
    }
  }
  
  public final int getCount()
  {
    GMTrace.i(8576512819200L, 63900);
    int i = this.qgz.getCount();
    GMTrace.o(8576512819200L, 63900);
    return i;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(8575170641920L, 63890);
    paramInt = d(this.qgz.vf(paramInt).blD());
    GMTrace.o(8575170641920L, 63890);
    return paramInt;
  }
  
  public final void notifyDataSetChanged()
  {
    GMTrace.i(8574499553280L, 63885);
    this.qgz.notifyDataSetChanged();
    GMTrace.o(8574499553280L, 63885);
  }
  
  public final m vf(int paramInt)
  {
    GMTrace.i(8576378601472L, 63899);
    m localm = this.qgz.vf(paramInt);
    GMTrace.o(8576378601472L, 63899);
    return localm;
  }
  
  public final boolean vg(int paramInt)
  {
    GMTrace.i(8576647036928L, 63901);
    if ((paramInt < this.hvF.getFirstVisiblePosition() - 1) || (paramInt > this.hvF.getLastVisiblePosition() - 1))
    {
      GMTrace.o(8576647036928L, 63901);
      return false;
    }
    GMTrace.o(8576647036928L, 63901);
    return true;
  }
  
  public final void z(Runnable paramRunnable)
  {
    GMTrace.i(8576110166016L, 63897);
    this.qgz.bny();
    paramRunnable.run();
    GMTrace.o(8576110166016L, 63897);
  }
  
  public static abstract interface a
  {
    public abstract boolean bnj();
  }
  
  public static final class b
    implements ak.b.a
  {
    public int jP;
    public x qgQ;
    
    public b(x paramx, int paramInt)
    {
      GMTrace.i(8541884645376L, 63642);
      this.qgQ = null;
      this.qgQ = paramx;
      this.jP = paramInt;
      GMTrace.o(8541884645376L, 63642);
    }
    
    public final void r(String paramString, boolean paramBoolean)
    {
      GMTrace.i(8542018863104L, 63643);
      if (paramBoolean)
      {
        com.tencent.mm.kernel.h.xz();
        if (com.tencent.mm.kernel.h.xw().wL()) {
          com.tencent.mm.plugin.sns.model.ae.aDa().post(new Runnable()
          {
            public final void run()
            {
              GMTrace.i(8335994650624L, 62108);
              if (av.b.this.qgQ.bnz() != null) {
                ((aw)av.b.this.qgQ.bnz()).EA(av.b.this.jP);
              }
              av.b.this.qgQ.notifyDataSetChanged();
              GMTrace.o(8335994650624L, 62108);
            }
          });
        }
      }
      GMTrace.o(8542018863104L, 63643);
    }
  }
  
  static final class c
    implements View.OnCreateContextMenuListener
  {
    private String eHy;
    private biz pRY;
    private m pXt;
    private anu psm;
    private View targetView;
    private String url;
    
    c()
    {
      GMTrace.i(8349416423424L, 62208);
      GMTrace.o(8349416423424L, 62208);
    }
    
    public final void onCreateContextMenu(ContextMenu paramContextMenu, View paramView, ContextMenu.ContextMenuInfo paramContextMenuInfo)
    {
      GMTrace.i(8349550641152L, 62209);
      paramContextMenuInfo = paramView.getTag();
      if ((paramContextMenuInfo instanceof r))
      {
        paramContextMenuInfo = (r)paramContextMenuInfo;
        biz localbiz = paramContextMenuInfo.pRY;
        paramView.getContext();
        String str1 = localbiz.uUc.lPM;
        String str2 = localbiz.uUb.mmR;
        str1 = av.Jq(str1);
        if ((str1 == null) || (str1.length() == 0))
        {
          GMTrace.o(8349550641152L, 62209);
          return;
        }
        this.url = str1;
        this.eHy = paramContextMenuInfo.eEM;
        this.targetView = paramView;
        if (localbiz.uUc.ueW.size() > 0) {}
        for (paramContextMenuInfo = (anu)localbiz.uUc.ueW.get(0);; paramContextMenuInfo = null)
        {
          this.psm = paramContextMenuInfo;
          this.pXt = com.tencent.mm.plugin.sns.model.ae.bjd().Is(this.eHy);
          this.pRY = localbiz;
          if ((localbiz.uUc.ueV != 10) && (localbiz.uUc.ueV != 13)) {
            break;
          }
          GMTrace.o(8349550641152L, 62209);
          return;
        }
        if (com.tencent.mm.bj.d.LL("favorite")) {
          switch (localbiz.uUc.ueV)
          {
          default: 
            paramContextMenu.add(0, 3, 0, paramView.getContext().getString(i.j.dNH));
          }
        }
      }
      for (;;)
      {
        if ((this.pXt != null) && (!this.pXt.field_userName.equals(com.tencent.mm.plugin.sns.model.ae.biJ()))) {
          paramContextMenu.add(0, 8, 0, paramView.getContext().getString(i.j.dkg));
        }
        GMTrace.o(8349550641152L, 62209);
        return;
        paramContextMenu.add(0, 4, 0, paramView.getContext().getString(i.j.dNH));
        continue;
        paramContextMenu.add(0, 5, 0, paramView.getContext().getString(i.j.dNH));
        continue;
        paramContextMenu.add(0, 9, 0, paramView.getContext().getString(i.j.dNH));
      }
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\sns\ui\av.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */