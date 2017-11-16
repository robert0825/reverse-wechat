package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.res.Resources;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.k;
import com.tencent.mm.plugin.game.d.b;
import com.tencent.mm.plugin.game.d.e;
import com.tencent.mm.plugin.game.d.e.a.a;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.protocal.c.ve;
import com.tencent.mm.protocal.c.vf;
import com.tencent.mm.sdk.platformtools.bg;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public final class r
  extends BaseAdapter
{
  Context context;
  boolean eBn;
  ArrayList<b> jST;
  int lNV;
  int lYV;
  boolean mbF;
  int mbG;
  int mbH;
  int mbI;
  int mbJ;
  private int mbK;
  boolean mbL;
  boolean mbM;
  private ArrayList<d> mbN;
  
  public r(Context paramContext)
  {
    GMTrace.i(12673508966400L, 94425);
    this.eBn = false;
    this.mbF = false;
    this.lYV = 0;
    this.mbG = 0;
    this.mbH = 0;
    this.mbI = 0;
    this.mbJ = 0;
    this.lNV = 0;
    this.mbL = false;
    this.mbM = false;
    this.context = paramContext;
    this.jST = null;
    this.mbK = paramContext.getResources().getColor(R.e.aNO);
    GMTrace.o(12673508966400L, 94425);
  }
  
  private void a(TextView paramTextView, String paramString)
  {
    GMTrace.i(12674448490496L, 94432);
    if (!bg.nm(paramString))
    {
      if (this.mbN == null) {
        this.mbN = new ArrayList();
      }
      for (;;)
      {
        paramString = new StringBuilder(paramString);
        localObject = new d();
        for (int i = paramString.indexOf("<em>"); i >= 0; i = paramString.indexOf("<em>"))
        {
          ((d)localObject).start = i;
          paramString.delete(i, i + 4);
          i = paramString.indexOf("</em>");
          if (i < 0) {
            break;
          }
          ((d)localObject).end = i;
          paramString.delete(i, i + 5);
          this.mbN.add(localObject);
        }
        this.mbN.clear();
      }
      paramString = new SpannableString(paramString.toString());
      Object localObject = this.mbN.iterator();
      while (((Iterator)localObject).hasNext())
      {
        d locald = (d)((Iterator)localObject).next();
        if (locald.start < locald.end) {
          paramString.setSpan(new ForegroundColorSpan(this.mbK), locald.start, locald.end, 33);
        }
      }
      paramTextView.setText(paramString);
      paramTextView.setVisibility(0);
      GMTrace.o(12674448490496L, 94432);
      return;
    }
    paramTextView.setVisibility(8);
    GMTrace.o(12674448490496L, 94432);
  }
  
  public final int getCount()
  {
    GMTrace.i(12673643184128L, 94426);
    if (this.jST == null)
    {
      GMTrace.o(12673643184128L, 94426);
      return 0;
    }
    int i = this.jST.size();
    GMTrace.o(12673643184128L, 94426);
    return i;
  }
  
  public final Object getItem(int paramInt)
  {
    GMTrace.i(12673777401856L, 94427);
    Object localObject = this.jST.get(paramInt);
    GMTrace.o(12673777401856L, 94427);
    return localObject;
  }
  
  public final long getItemId(int paramInt)
  {
    GMTrace.i(12673911619584L, 94428);
    long l = paramInt;
    GMTrace.o(12673911619584L, 94428);
    return l;
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(12674045837312L, 94429);
    paramInt = ((b)getItem(paramInt)).type;
    GMTrace.o(12674045837312L, 94429);
    return paramInt;
  }
  
  public final View getView(int paramInt, final View paramView, final ViewGroup paramViewGroup)
  {
    GMTrace.i(12674314272768L, 94431);
    b localb = (b)getItem(paramInt);
    Object localObject1;
    Object localObject2;
    if (paramView == null)
    {
      localObject1 = new a();
      paramView = this.context;
      switch (localb.type)
      {
      case 4: 
      default: 
        paramInt = 0;
        localObject2 = View.inflate(paramView, paramInt, null);
        ((a)localObject1).hqF = ((View)localObject2).findViewById(R.h.bEj);
        ((a)localObject1).mbR = ((ImageView)((View)localObject2).findViewById(R.h.bEm));
        ((a)localObject1).mbS = ((TextView)((View)localObject2).findViewById(R.h.bEn));
        ((a)localObject1).mbT = ((TextView)((View)localObject2).findViewById(R.h.bEi));
        ((a)localObject1).mbU = ((TextView)((View)localObject2).findViewById(R.h.bEk));
        ((a)localObject1).mbV = ((TextView)((View)localObject2).findViewById(R.h.bEo));
        ((a)localObject1).mbW = ((View)localObject2).findViewById(R.h.bEl);
        ((a)localObject1).mbX = ((TextView)((View)localObject2).findViewById(R.h.cfA));
        ((a)localObject1).mbY = ((TextView)((View)localObject2).findViewById(R.h.bsx));
        ((View)localObject2).setTag(localObject1);
        paramViewGroup = (ViewGroup)localObject1;
        paramView = (View)localObject2;
        if (((a)localObject1).mbS != null)
        {
          paramViewGroup = (ViewGroup)localObject1;
          paramView = (View)localObject2;
          if (((a)localObject1).mbU != null)
          {
            paramView = ((a)localObject1).mbS;
            paramViewGroup = ((a)localObject1).mbU;
            paramView.getViewTreeObserver().addOnGlobalLayoutListener(new ViewTreeObserver.OnGlobalLayoutListener()
            {
              public final void onGlobalLayout()
              {
                GMTrace.i(12701426253824L, 94633);
                if (paramView.getLineCount() > 1)
                {
                  paramView.setMaxLines(2);
                  paramViewGroup.setMaxLines(1);
                  GMTrace.o(12701426253824L, 94633);
                  return;
                }
                paramViewGroup.setMaxLines(2);
                GMTrace.o(12701426253824L, 94633);
              }
            });
            paramView = (View)localObject2;
            paramViewGroup = (ViewGroup)localObject1;
          }
        }
        label302:
        switch (localb.type)
        {
        case 4: 
        default: 
          label348:
          switch (localb.type)
          {
          }
          break;
        }
        break;
      }
    }
    for (;;)
    {
      GMTrace.o(12674314272768L, 94431);
      return paramView;
      paramInt = R.i.czp;
      break;
      paramInt = R.i.czw;
      break;
      paramInt = R.i.czv;
      break;
      paramInt = R.i.czr;
      break;
      paramInt = R.i.czs;
      break;
      paramInt = R.i.czu;
      break;
      paramViewGroup = (a)paramView.getTag();
      break label302;
      if (!bg.nm(localb.iconUrl))
      {
        localObject1 = new e.a.a();
        ((e.a.a)localObject1).gKA = false;
        ((e.a.a)localObject1).gKC = false;
        e.aGQ().a(paramViewGroup.mbR, localb.iconUrl, ((e.a.a)localObject1).aGR());
      }
      a(paramViewGroup.mbS, localb.name);
      a(paramViewGroup.mbT, localb.mbZ);
      a(paramViewGroup.mbU, localb.hLO);
      break label348;
      if (!bg.nm(localb.iconUrl))
      {
        localObject1 = new e.a.a();
        ((e.a.a)localObject1).gKA = false;
        ((e.a.a)localObject1).gKC = false;
        ((e.a.a)localObject1).meb = true;
        e.aGQ().a(paramViewGroup.mbR, localb.iconUrl, ((e.a.a)localObject1).aGR());
        paramViewGroup.mbR.setVisibility(0);
        label615:
        a(paramViewGroup.mbS, localb.name);
        a(paramViewGroup.mbU, localb.hLO);
        if (bg.nm(localb.goG)) {
          break label735;
        }
        paramViewGroup.mbX.setText(h.a(this.context, localb.goG));
        paramViewGroup.mbX.setVisibility(0);
      }
      for (;;)
      {
        if (localb.hcs <= 0L) {
          break label747;
        }
        paramViewGroup.mbY.setText(b.e(this.context, localb.hcs * 1000L));
        paramViewGroup.mbY.setVisibility(0);
        break;
        paramViewGroup.mbR.setVisibility(8);
        break label615;
        label735:
        paramViewGroup.mbX.setVisibility(8);
      }
      label747:
      paramViewGroup.mbY.setVisibility(8);
      break label348;
      if (!bg.nm(localb.iconUrl))
      {
        localObject1 = new e.a.a();
        ((e.a.a)localObject1).gKA = false;
        ((e.a.a)localObject1).gKC = false;
        e.aGQ().a(paramViewGroup.mbR, localb.iconUrl, ((e.a.a)localObject1).aGR());
      }
      a(paramViewGroup.mbS, localb.name);
      a(paramViewGroup.mbT, localb.mbZ);
      a(paramViewGroup.mbU, localb.hLO);
      localObject1 = paramViewGroup.mbV;
      localObject2 = localb.mcc;
      StringBuilder localStringBuilder = new StringBuilder();
      if (!bg.cc((List)localObject2))
      {
        int i = ((LinkedList)localObject2).size();
        paramInt = 0;
        while (paramInt < i - 1)
        {
          localStringBuilder.append((String)((LinkedList)localObject2).get(paramInt) + "\n");
          paramInt += 1;
        }
        localStringBuilder.append((String)((LinkedList)localObject2).get(i - 1));
        ((TextView)localObject1).setVisibility(0);
        ((TextView)localObject1).setText(localStringBuilder.toString());
        break label348;
      }
      ((TextView)localObject1).setVisibility(8);
      break label348;
      paramViewGroup.mbU.setText(localb.name);
      break label348;
      paramViewGroup.mbR.setImageResource(R.k.cOD);
      paramViewGroup.mbS.setText(localb.name);
      break label348;
      if (localb.mcg) {
        paramViewGroup.hqF.setBackgroundResource(R.g.aVP);
      }
      for (;;)
      {
        paramInt = this.context.getResources().getDimensionPixelSize(R.f.aQJ);
        paramViewGroup.hqF.setPadding(0, paramInt, 0, paramInt);
        break;
        paramViewGroup.hqF.setBackgroundResource(R.g.aVO);
      }
      if (localb.mcf) {
        paramViewGroup.mbW.setVisibility(8);
      } else {
        paramViewGroup.mbW.setVisibility(0);
      }
    }
  }
  
  public final int getViewTypeCount()
  {
    GMTrace.i(12674180055040L, 94430);
    GMTrace.o(12674180055040L, 94430);
    return 7;
  }
  
  private static final class a
  {
    public View hqF;
    ImageView mbR;
    TextView mbS;
    TextView mbT;
    TextView mbU;
    TextView mbV;
    View mbW;
    TextView mbX;
    TextView mbY;
    
    public a()
    {
      GMTrace.i(12733370073088L, 94871);
      GMTrace.o(12733370073088L, 94871);
    }
  }
  
  public static final class b
  {
    public int actionType;
    public String appId;
    public String eBj;
    public String goG;
    public String hLO;
    public long hcs;
    public String iconUrl;
    public String mbZ;
    public vf mca;
    public String mcb;
    public LinkedList<String> mcc;
    public int mcd;
    public int mce;
    public boolean mcf;
    public boolean mcg;
    public r.c mch;
    public String name;
    public int type;
    
    public b()
    {
      GMTrace.i(12719545647104L, 94768);
      this.mcf = false;
      this.mcg = false;
      GMTrace.o(12719545647104L, 94768);
    }
    
    public static b a(ve paramve)
    {
      GMTrace.i(17974706569216L, 133922);
      b localb = new b();
      localb.type = 2;
      localb.name = paramve.eBt;
      localb.hLO = paramve.lPj;
      localb.iconUrl = paramve.nFH;
      localb.mcb = paramve.une;
      localb.mcd = paramve.unz;
      localb.mce = paramve.unA;
      localb.appId = paramve.lQa;
      localb.goG = paramve.lRT;
      localb.hcs = paramve.bsx;
      localb.mch = new r.c(paramve.une, (byte)0);
      GMTrace.o(17974706569216L, 133922);
      return localb;
    }
    
    public static b ac(int paramInt, String paramString)
    {
      GMTrace.i(12719679864832L, 94769);
      b localb = new b();
      localb.type = paramInt;
      localb.name = paramString;
      localb.mch = new r.c();
      GMTrace.o(12719679864832L, 94769);
      return localb;
    }
  }
  
  public static final class c
  {
    public int actionType;
    String appId;
    int eSa;
    int mcd;
    int mce;
    String mci;
    String mcj;
    int position;
    int type;
    
    public c()
    {
      GMTrace.i(12745986539520L, 94965);
      GMTrace.o(12745986539520L, 94965);
    }
    
    public c(int paramInt1, int paramInt2, String paramString1, String paramString2)
    {
      GMTrace.i(12746389192704L, 94968);
      this.actionType = paramInt1;
      this.type = paramInt2;
      this.appId = paramString1;
      if (paramInt1 == 2) {
        this.mci = paramString2;
      }
      GMTrace.o(12746389192704L, 94968);
    }
    
    public c(String paramString)
    {
      GMTrace.i(12746120757248L, 94966);
      this.actionType = 2;
      this.mci = paramString;
      GMTrace.o(12746120757248L, 94966);
    }
    
    public c(String paramString, byte paramByte)
    {
      GMTrace.i(12746254974976L, 94967);
      this.actionType = 2;
      this.type = 3;
      this.mci = paramString;
      GMTrace.o(12746254974976L, 94967);
    }
  }
  
  private final class d
  {
    int end;
    int start;
    
    public d()
    {
      GMTrace.i(12767192940544L, 95123);
      this.start = -1;
      this.end = -1;
      GMTrace.o(12767192940544L, 95123);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\r.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */