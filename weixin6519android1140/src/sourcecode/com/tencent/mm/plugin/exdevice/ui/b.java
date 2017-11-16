package com.tencent.mm.plugin.exdevice.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.ui.base.NoMeasuredTextView;
import com.tencent.mm.y.at;
import com.tencent.mm.y.q;
import com.tencent.mm.y.r;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public final class b
  extends BaseAdapter
{
  private String iAx;
  List<e> kIX;
  Map<String, String> kIY;
  String kIZ;
  d kJa;
  private String kJb;
  private boolean kJc;
  private e.a kJd;
  private View.OnClickListener kJe;
  private View.OnClickListener kJf;
  private View.OnClickListener kJg;
  private Context mContext;
  
  public b(Context paramContext, String paramString)
  {
    GMTrace.i(11048669151232L, 82319);
    this.kJc = false;
    this.kJd = new e.a();
    this.kJe = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11108127604736L, 82762);
        w.i("MicroMsg.ExdeviceRankAdapter", "hy: user clicked on the content");
        int i = ((Integer)paramAnonymousView.getTag()).intValue();
        paramAnonymousView = b.this.nj(i);
        b.a(b.this).xf(paramAnonymousView.kLW.field_username);
        GMTrace.o(11108127604736L, 82762);
      }
    };
    this.kJf = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(11062493577216L, 82422);
        b.a(b.this).xf(b.b(b.this));
        GMTrace.o(11062493577216L, 82422);
      }
    };
    this.kJg = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(10998203285504L, 81943);
        b.a(b.this).auW();
        GMTrace.o(10998203285504L, 81943);
      }
    };
    this.iAx = q.zE();
    this.mContext = paramContext;
    this.kJb = paramString;
    GMTrace.o(11048669151232L, 82319);
  }
  
  private List<e> a(ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.c> paramArrayList, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> paramArrayList1, boolean paramBoolean)
  {
    GMTrace.i(11049071804416L, 82322);
    Object localObject1 = new LinkedList(paramArrayList);
    paramArrayList = new ArrayList();
    Object localObject2 = e(this.iAx, paramArrayList1);
    Object localObject3;
    if (localObject2 != null)
    {
      localObject3 = this.kJd;
      ((e.a)localObject3).kLW = ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject2);
      ((e.a)localObject3).kLX = 3;
      if (!paramBoolean) {
        break label327;
      }
    }
    Object localObject4;
    label327:
    for (this.kJd.Zc = 2;; this.kJd.Zc = 1)
    {
      paramArrayList.add(this.kJd.ave());
      localObject2 = this.kJd;
      ((e.a)localObject2).Zc = 0;
      paramArrayList.add(((e.a)localObject2).ave());
      c((LinkedList)localObject1, this.iAx);
      localObject2 = new ArrayList();
      w.d("MicroMsg.ExdeviceRankAdapter", "ap: follow size %s, %s", new Object[] { Integer.valueOf(((LinkedList)localObject1).size()), ((LinkedList)localObject1).toString() });
      localObject3 = paramArrayList1.iterator();
      while (((Iterator)localObject3).hasNext())
      {
        localObject4 = (com.tencent.mm.plugin.exdevice.f.b.a.d)((Iterator)localObject3).next();
        e.a locala = this.kJd;
        locala.kLW = ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject4);
        locala.Zc = 1;
        locala.kLX = 4;
        ((ArrayList)localObject2).add(locala.ave());
        if ((((LinkedList)localObject1).size() > 0) && (d((LinkedList)localObject1, ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject4).field_username)))
        {
          locala = this.kJd;
          locala.kLW = ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject4);
          locala.Zc = 1;
          locala.kLX = 2;
          paramArrayList.add(locala.ave());
          c((LinkedList)localObject1, ((com.tencent.mm.plugin.exdevice.f.b.a.d)localObject4).field_username);
        }
      }
      localObject2 = this.kJd;
      ((e.a)localObject2).kLW = null;
      ((e.a)localObject2).kJb = this.kJb;
      ((e.a)localObject2).username = this.iAx;
      ((e.a)localObject2).kLX = 7;
      break;
    }
    if (((LinkedList)localObject1).size() > 0)
    {
      localObject1 = ((LinkedList)localObject1).iterator();
      while (((Iterator)localObject1).hasNext())
      {
        localObject3 = (com.tencent.mm.plugin.exdevice.f.b.a.c)((Iterator)localObject1).next();
        localObject4 = this.kJd;
        ((e.a)localObject4).username = ((com.tencent.mm.plugin.exdevice.f.b.a.c)localObject3).field_username;
        ((e.a)localObject4).kJb = this.kJb;
        ((e.a)localObject4).kLW = null;
        ((e.a)localObject4).Zc = 1;
        ((e.a)localObject4).kLX = 6;
        paramArrayList.add(((e.a)localObject4).ave());
      }
    }
    if (paramArrayList.size() > 2)
    {
      ((e)paramArrayList.get(paramArrayList.size() - 1)).kLX = (((e)paramArrayList.get(paramArrayList.size() - 1)).kLX | 0x2 | 0x1);
      localObject1 = this.kJd;
      ((e.a)localObject1).Zc = 0;
      ((e.a)localObject1).kLW = null;
      paramArrayList.add(((e.a)localObject1).ave());
    }
    if (((ArrayList)localObject2).size() > 1) {
      ((e)((ArrayList)localObject2).get(((ArrayList)localObject2).size() - 1)).kLX = 5;
    }
    paramArrayList.addAll((Collection)localObject2);
    w.d("MicroMsg.ExdeviceRankAdapter", "rank: %d %s", new Object[] { Integer.valueOf(paramArrayList1.size()), paramArrayList1.toString() });
    w.d("MicroMsg.ExdeviceRankAdapter", "all: %s %s", new Object[] { Integer.valueOf(paramArrayList.size()), paramArrayList.toString() });
    GMTrace.o(11049071804416L, 82322);
    return paramArrayList;
  }
  
  private static void c(LinkedList<com.tencent.mm.plugin.exdevice.f.b.a.c> paramLinkedList, String paramString)
  {
    GMTrace.i(11048803368960L, 82320);
    paramLinkedList = paramLinkedList.iterator();
    while (paramLinkedList.hasNext())
    {
      com.tencent.mm.plugin.exdevice.f.b.a.c localc = (com.tencent.mm.plugin.exdevice.f.b.a.c)paramLinkedList.next();
      if (localc.field_username.equalsIgnoreCase(paramString))
      {
        w.d("MicroMsg.ExdeviceRankAdapter", "username: %s remove", new Object[] { localc.toString() });
        paramLinkedList.remove();
      }
    }
    GMTrace.o(11048803368960L, 82320);
  }
  
  private static boolean d(LinkedList<com.tencent.mm.plugin.exdevice.f.b.a.c> paramLinkedList, String paramString)
  {
    GMTrace.i(11048937586688L, 82321);
    try
    {
      paramLinkedList = paramLinkedList.iterator();
      while (paramLinkedList.hasNext())
      {
        boolean bool = ((com.tencent.mm.plugin.exdevice.f.b.a.c)paramLinkedList.next()).field_username.equalsIgnoreCase(paramString);
        if (bool)
        {
          GMTrace.o(11048937586688L, 82321);
          return true;
        }
      }
      GMTrace.o(11048937586688L, 82321);
      return false;
    }
    catch (Exception paramLinkedList)
    {
      w.d("MicroMsg.ExdeviceRankAdapter", paramLinkedList.toString());
      GMTrace.o(11048937586688L, 82321);
    }
    return false;
  }
  
  public static com.tencent.mm.plugin.exdevice.f.b.a.d e(String paramString, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> paramArrayList)
  {
    GMTrace.i(11049340239872L, 82324);
    if (paramArrayList == null)
    {
      GMTrace.o(11049340239872L, 82324);
      return null;
    }
    paramArrayList = paramArrayList.iterator();
    while (paramArrayList.hasNext())
    {
      com.tencent.mm.plugin.exdevice.f.b.a.d locald = (com.tencent.mm.plugin.exdevice.f.b.a.d)paramArrayList.next();
      if (paramString.equalsIgnoreCase(locald.field_username))
      {
        GMTrace.o(11049340239872L, 82324);
        return locald;
      }
    }
    GMTrace.o(11049340239872L, 82324);
    return null;
  }
  
  public final List<e> b(ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.c> paramArrayList, ArrayList<com.tencent.mm.plugin.exdevice.f.b.a.d> paramArrayList1, boolean paramBoolean)
  {
    GMTrace.i(11049206022144L, 82323);
    Object localObject = paramArrayList;
    if (paramArrayList == null) {}
    try
    {
      localObject = new ArrayList();
      paramArrayList = paramArrayList1;
      if (paramArrayList1 == null) {
        paramArrayList = new ArrayList();
      }
      paramArrayList = a((ArrayList)localObject, paramArrayList, paramBoolean);
      GMTrace.o(11049206022144L, 82323);
      return paramArrayList;
    }
    catch (Exception paramArrayList)
    {
      w.w("MicroMsg.ExdeviceRankAdapter", "ap: rank exception,null info");
      paramArrayList = new ArrayList();
      GMTrace.o(11049206022144L, 82323);
    }
    return paramArrayList;
  }
  
  public final int getCount()
  {
    GMTrace.i(11049742893056L, 82327);
    if (this.kIX == null)
    {
      GMTrace.o(11049742893056L, 82327);
      return 0;
    }
    int i = this.kIX.size();
    GMTrace.o(11049742893056L, 82327);
    return i;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(11050011328512L, 82329);
    long l = paramInt;
    GMTrace.o(11050011328512L, 82329);
    return l;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(11050145546240L, 82330);
    paramInt = nj(paramInt).Zc;
    GMTrace.o(11050145546240L, 82330);
    return paramInt;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(11050279763968L, 82331);
    final com.tencent.mm.plugin.exdevice.f.b.a.d locald = nj(paramInt).kLW;
    Object localObject1 = nj(paramInt);
    int i = getItemViewType(paramInt);
    int j = ((e)localObject1).kLX;
    Object localObject2;
    if (paramView == null)
    {
      localObject1 = LayoutInflater.from(this.mContext);
      switch (i)
      {
      default: 
        localObject1 = null;
        paramViewGroup = paramView;
        paramView = (View)localObject1;
        localObject1 = paramView;
        localObject2 = paramViewGroup;
        if (paramView != null)
        {
          paramView.kJj = paramViewGroup.findViewById(R.h.brL);
          paramView.kJk = paramViewGroup.findViewById(R.h.bIF);
          paramView.kAo = ((TextView)paramViewGroup.findViewById(R.h.bxM));
          paramView.kJl = ((ImageView)paramViewGroup.findViewById(R.h.bxP));
          paramView.kJm = ((NoMeasuredTextView)paramViewGroup.findViewById(R.h.bxQ));
          paramView.kJo = ((TextView)paramViewGroup.findViewById(R.h.bxi));
          paramView.kJp = ((ExdeviceLikeView)paramViewGroup.findViewById(R.h.bxt));
          paramView.kJq = paramViewGroup.findViewById(R.h.buz);
          paramView.kJs = paramViewGroup.findViewById(R.h.bxS);
          paramView.kJr = paramViewGroup.findViewById(R.h.bxm);
          paramView.kJt = ((TextView)paramViewGroup.findViewById(R.h.ces));
          if (paramView.kJm != null)
          {
            paramView.kJm.J(this.mContext.getResources().getDimension(R.f.aPY));
            paramView.kJm.setTextColor(this.mContext.getResources().getColor(R.e.aNE));
            paramView.kJm.cag();
            paramView.kJm.whw = true;
          }
          paramViewGroup.setTag(paramView);
          localObject2 = paramViewGroup;
          localObject1 = paramView;
        }
        if ((locald != null) && (localObject1 != null)) {
          if (!this.iAx.equalsIgnoreCase(locald.field_username)) {
            break label572;
          }
        }
        break;
      }
    }
    label572:
    for (this.kJc = true;; this.kJc = false)
    {
      if (i != 2) {
        break label580;
      }
      ((b)localObject1).kAo.setText(String.valueOf(locald.field_ranknum));
      ((b)localObject1).kJo.setText(String.valueOf(locald.field_score));
      a.b.n(((b)localObject1).kJl, locald.field_username);
      ((b)localObject1).kJj.setOnClickListener(this.kJf);
      ((b)localObject1).kJt.setOnClickListener(this.kJg);
      GMTrace.o(11050279763968L, 82331);
      return (View)localObject2;
      paramViewGroup = ((LayoutInflater)localObject1).inflate(R.i.cwe, paramViewGroup, false);
      paramView = new a();
      paramView.hrj = paramViewGroup.findViewById(R.h.buz);
      paramViewGroup.setTag(paramView);
      paramView = null;
      break;
      paramViewGroup = ((LayoutInflater)localObject1).inflate(R.i.cwd, paramViewGroup, false);
      paramView = new b();
      paramView.kJn = ((TextView)paramViewGroup.findViewById(R.h.bxR));
      break;
      paramViewGroup = ((LayoutInflater)localObject1).inflate(R.i.cwf, paramViewGroup, false);
      paramView = new b();
      break;
      switch (i)
      {
      default: 
        localObject1 = null;
        localObject2 = paramView;
        break;
      case 1: 
      case 2: 
        localObject1 = (b)paramView.getTag();
        localObject2 = paramView;
        break;
      }
    }
    label580:
    if (((b)localObject1).kJn != null)
    {
      if ((j & 0x4) != 4)
      {
        ((b)localObject1).kJn.setVisibility(0);
        ((b)localObject1).kJn.setText(this.mContext.getResources().getString(R.l.drS, new Object[] { Integer.valueOf(locald.field_ranknum) }));
      }
    }
    else
    {
      label641:
      if (((j & 0x2) == 2) || (!locald.field_username.equalsIgnoreCase(this.kIZ)) || (this.iAx.equalsIgnoreCase(this.kIZ))) {
        break label1141;
      }
      ((b)localObject1).kJk.setBackgroundColor(this.mContext.getResources().getColor(R.e.aNB));
      label699:
      if ((j & 0x1) != 1) {
        break label1165;
      }
      ((b)localObject1).kJq.setVisibility(8);
      label717:
      if (locald.field_ranknum < 100) {
        break label1177;
      }
      ((b)localObject1).kAo.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(R.f.aQa));
      label750:
      if ((j & 0x2) != 2) {
        break label1203;
      }
      ((b)localObject1).kAo.setText("");
      label769:
      if (locald.field_score < 10000) {
        break label1232;
      }
      ((b)localObject1).kJo.setTextColor(this.mContext.getResources().getColor(R.e.aND));
      label801:
      ((b)localObject1).kJo.setText(String.valueOf(locald.field_score));
      a.b.n(((b)localObject1).kJl, locald.field_username);
      if (this.kJc) {
        break label1256;
      }
      at.AR();
      if ((com.tencent.mm.y.c.yK().TA(locald.field_username)) || (this.kIY == null) || (bg.nm((String)this.kIY.get(locald.field_username)))) {
        break label1256;
      }
      ((b)localObject1).kJm.setText(h.b(this.mContext, (CharSequence)this.kIY.get(locald.field_username), ((b)localObject1).kJm.fB.getTextSize()));
      label930:
      paramViewGroup = ((b)localObject1).kJp;
      i = locald.field_likecount;
      paramViewGroup.kHz = i;
      paramView = paramViewGroup.kHz;
      if (paramViewGroup.kHz >= 0) {
        break label1293;
      }
      w.w("MicroMsg.ExdeviceLikeView", "hy: like num is negative. set to 0");
      paramView = "0";
      label987:
      if (paramViewGroup.kHz > 0) {
        break label1317;
      }
      paramViewGroup.kHC.setVisibility(8);
      label1003:
      paramViewGroup.kHC.setText(paramView);
      if (!this.kJc) {
        break label1340;
      }
      if (locald.field_likecount == 0) {
        break label1328;
      }
      ((b)localObject1).kJp.ng(1);
      label1035:
      if ((locald.field_score <= 0) && (!this.kJc)) {
        break label1356;
      }
      ((b)localObject1).kJp.setClickable(true);
      ((b)localObject1).kJp.kHA = new ExdeviceLikeView.a()
      {
        public final boolean auH()
        {
          GMTrace.i(11085176373248L, 82591);
          if (b.a(b.this) != null)
          {
            boolean bool = b.a(b.this).xg(locald.field_username);
            GMTrace.o(11085176373248L, 82591);
            return bool;
          }
          GMTrace.o(11085176373248L, 82591);
          return true;
        }
        
        public final void hQ(int paramAnonymousInt)
        {
          GMTrace.i(11085042155520L, 82590);
          w.i("MicroMsg.ExdeviceRankAdapter", "hy: like view clicked.after statae: %d", new Object[] { Integer.valueOf(paramAnonymousInt) });
          if (b.a(b.this) != null) {
            b.a(b.this).aT(locald.field_username, paramAnonymousInt);
          }
          GMTrace.o(11085042155520L, 82590);
        }
      };
    }
    for (;;)
    {
      ((b)localObject1).kJr.setTag(Integer.valueOf(paramInt));
      ((b)localObject1).kJr.setOnClickListener(this.kJe);
      ((b)localObject1).kJs.setTag(Integer.valueOf(paramInt));
      ((b)localObject1).kJs.setOnClickListener(this.kJe);
      break;
      ((b)localObject1).kJn.setVisibility(8);
      break label641;
      label1141:
      ((b)localObject1).kJk.setBackgroundColor(this.mContext.getResources().getColor(R.e.aNA));
      break label699;
      label1165:
      ((b)localObject1).kJq.setVisibility(0);
      break label717;
      label1177:
      ((b)localObject1).kAo.setTextSize(0, this.mContext.getResources().getDimensionPixelSize(R.f.aPZ));
      break label750;
      label1203:
      ((b)localObject1).kAo.setText(locald.field_ranknum);
      break label769;
      label1232:
      ((b)localObject1).kJo.setTextColor(this.mContext.getResources().getColor(R.e.aNC));
      break label801;
      label1256:
      ((b)localObject1).kJm.setText(h.b(this.mContext, r.fs(locald.field_username), ((b)localObject1).kJm.fB.getTextSize()));
      break label930;
      label1293:
      if (i <= 999) {
        break label987;
      }
      w.d("MicroMsg.ExdeviceLikeView", "hy: like num exceeded the limit. put plus");
      paramView = "999+";
      break label987;
      label1317:
      paramViewGroup.kHC.setVisibility(0);
      break label1003;
      label1328:
      ((b)localObject1).kJp.ng(0);
      break label1035;
      label1340:
      ((b)localObject1).kJp.ng(locald.field_selfLikeState);
      break label1035;
      label1356:
      ((b)localObject1).kJp.setClickable(false);
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(11049474457600L, 82325);
    GMTrace.o(11049474457600L, 82325);
    return 3;
  }
  
  public final boolean isEnabled(int paramInt)
  {
    GMTrace.i(11049608675328L, 82326);
    GMTrace.o(11049608675328L, 82326);
    return false;
  }
  
  public final e nj(int paramInt)
  {
    GMTrace.i(11049877110784L, 82328);
    e locale = (e)this.kIX.get(paramInt);
    GMTrace.o(11049877110784L, 82328);
    return locale;
  }
  
  static final class a
  {
    public View hrj;
    
    a()
    {
      GMTrace.i(11032026152960L, 82195);
      GMTrace.o(11032026152960L, 82195);
    }
  }
  
  static final class b
  {
    public TextView kAo;
    public View kJj;
    public View kJk;
    public ImageView kJl;
    public NoMeasuredTextView kJm;
    public TextView kJn;
    public TextView kJo;
    public ExdeviceLikeView kJp;
    public View kJq;
    public View kJr;
    public View kJs;
    public TextView kJt;
    
    b()
    {
      GMTrace.i(11060882964480L, 82410);
      GMTrace.o(11060882964480L, 82410);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\plugin\exdevice\ui\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */