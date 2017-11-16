package com.tencent.mm.plugin.game.ui;

import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.plugin.game.model.ai;
import com.tencent.mm.plugin.game.model.c;
import com.tencent.mm.plugin.game.model.m;
import com.tencent.mm.plugin.game.widget.TextProgressBar;
import com.tencent.mm.sdk.platformtools.af;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.at;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentHashMap;

abstract class l
  extends b<c>
{
  protected int lNQ;
  private a lUA;
  protected int lVF;
  protected int lWI;
  private com.tencent.mm.plugin.game.model.l.b lWM;
  protected e lWN;
  private DialogInterface.OnClickListener lXx;
  protected View.OnClickListener lXy;
  protected int lZA;
  protected boolean lZB;
  protected boolean lZC;
  protected boolean lZD;
  protected ConcurrentHashMap<String, m> lZE;
  protected SparseArray<View> lZF;
  protected Context mContext;
  
  public l(Context paramContext)
  {
    super(paramContext);
    GMTrace.i(12720619388928L, 94776);
    this.lZB = true;
    this.lZC = false;
    this.lZD = false;
    this.lWI = 14;
    this.lNQ = 0;
    this.lWM = new com.tencent.mm.plugin.game.model.l.b()
    {
      public final void g(int paramAnonymousInt, String paramAnonymousString, boolean paramAnonymousBoolean)
      {
        GMTrace.i(12696594415616L, 94597);
        if ((!paramAnonymousBoolean) || (l.this.lZE == null) || (paramAnonymousString == null))
        {
          GMTrace.o(12696594415616L, 94597);
          return;
        }
        Object localObject;
        try
        {
          localObject = l.this.lZE.values().iterator();
          while (((Iterator)localObject).hasNext())
          {
            m localm = (m)((Iterator)localObject).next();
            if ((localm != null) && (localm.lMw != null) && ((localm.lMw.field_appId.equals(paramAnonymousString)) || (localm.lMw.field_packageName.equals(paramAnonymousString))))
            {
              localm.cB(l.this.mContext);
              localm.aFo();
            }
          }
          paramAnonymousInt = 0;
        }
        catch (Exception paramAnonymousString)
        {
          w.e("MicroMsg.GameListAdapter", paramAnonymousString.getMessage());
          GMTrace.o(12696594415616L, 94597);
          return;
        }
        while (paramAnonymousInt < l.this.lOh.size())
        {
          localObject = (c)l.this.lOh.get(paramAnonymousInt);
          if ((((c)localObject).type == 0) && ((((c)localObject).field_appId.equals(paramAnonymousString)) || (((c)localObject).field_packageName.equals(paramAnonymousString))) && (l.a(l.this) != null))
          {
            l.a(l.this).oL(paramAnonymousInt);
            GMTrace.o(12696594415616L, 94597);
            return;
          }
          paramAnonymousInt += 1;
        }
        GMTrace.o(12696594415616L, 94597);
      }
    };
    this.lXy = new View.OnClickListener()
    {
      public final void onClick(View paramAnonymousView)
      {
        GMTrace.i(12766521851904L, 95118);
        if (!(paramAnonymousView.getTag() instanceof c))
        {
          w.e("MicroMsg.GameListAdapter", "No button tag retrived, ignore click");
          GMTrace.o(12766521851904L, 95118);
          return;
        }
        paramAnonymousView = (c)paramAnonymousView.getTag();
        if (!l.this.lZE.containsKey(paramAnonymousView.field_appId))
        {
          w.e("MicroMsg.GameListAdapter", "No DownloadInfo found");
          GMTrace.o(12766521851904L, 95118);
          return;
        }
        m localm = (m)l.this.lZE.get(paramAnonymousView.field_appId);
        localm.cB(l.this.mContext);
        l.this.lWN.lTQ = paramAnonymousView.lLN;
        l.this.lWN.lNQ = l.this.lNQ;
        l.this.lWN.a(paramAnonymousView, localm);
        GMTrace.o(12766521851904L, 95118);
      }
    };
    this.lXx = new DialogInterface.OnClickListener()
    {
      public final void onClick(DialogInterface paramAnonymousDialogInterface, int paramAnonymousInt)
      {
        GMTrace.i(12774843351040L, 95180);
        l.this.notifyDataSetChanged();
        GMTrace.o(12774843351040L, 95180);
      }
    };
    this.mContext = paramContext;
    this.lZE = new ConcurrentHashMap();
    com.tencent.mm.plugin.game.model.l.a(this.lWM);
    this.lZF = new SparseArray();
    this.lWN = new e(paramContext);
    this.lWN.lUg = this.lXx;
    GMTrace.o(12720619388928L, 94776);
  }
  
  public void P(final LinkedList<c> paramLinkedList)
  {
    GMTrace.i(12721156259840L, 94780);
    if (paramLinkedList == null)
    {
      GMTrace.o(12721156259840L, 94780);
      return;
    }
    at.xB().A(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12701828907008L, 94636);
        l.a(l.this, paramLinkedList);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12728001363968L, 94831);
            l.b(l.this, l.1.this.lZG);
            w.i("MicroMsg.GameListAdapter", "add size: %d", new Object[] { Integer.valueOf(l.1.this.lZG.size()) });
            GMTrace.o(12728001363968L, 94831);
          }
        });
        GMTrace.o(12701828907008L, 94636);
      }
    });
    GMTrace.o(12721156259840L, 94780);
  }
  
  public void Q(final LinkedList<c> paramLinkedList)
  {
    GMTrace.i(12721290477568L, 94781);
    if (paramLinkedList == null)
    {
      GMTrace.o(12721290477568L, 94781);
      return;
    }
    com.tencent.mm.sdk.f.e.post(new Runnable()
    {
      public final void run()
      {
        GMTrace.i(12673240530944L, 94423);
        l.a(l.this, paramLinkedList);
        af.t(new Runnable()
        {
          public final void run()
          {
            GMTrace.i(12659952975872L, 94324);
            l.c(l.this, l.2.this.lZG);
            w.i("MicroMsg.GameListAdapter", "set size: %d", new Object[] { Integer.valueOf(l.2.this.lZG.size()) });
            GMTrace.o(12659952975872L, 94324);
          }
        });
        GMTrace.o(12673240530944L, 94423);
      }
    }, "game_get_download_info");
    GMTrace.o(12721290477568L, 94781);
  }
  
  abstract void a(c paramc, b paramb);
  
  abstract void a(c paramc, b paramb, int paramInt);
  
  public void a(a parama)
  {
    GMTrace.i(12722230001664L, 94788);
    this.lUA = parama;
    GMTrace.o(12722230001664L, 94788);
  }
  
  public void b(SparseArray<View> paramSparseArray)
  {
    GMTrace.i(12722095783936L, 94787);
    if (paramSparseArray != null) {}
    for (this.lZF = paramSparseArray;; this.lZF = new SparseArray())
    {
      notifyDataSetChanged();
      GMTrace.o(12722095783936L, 94787);
      return;
    }
  }
  
  public void clear()
  {
    GMTrace.i(12722498437120L, 94790);
    super.clear();
    com.tencent.mm.plugin.game.model.l.b(this.lWM);
    GMTrace.o(12722498437120L, 94790);
  }
  
  public int getItemViewType(int paramInt)
  {
    GMTrace.i(12721424695296L, 94782);
    paramInt = ((c)getItem(paramInt)).type;
    GMTrace.o(12721424695296L, 94782);
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(12721693130752L, 94784);
    c localc = (c)getItem(paramInt);
    int i;
    View localView;
    if (paramView == null)
    {
      paramView = this.mContext;
      switch (localc.type)
      {
      default: 
        i = 0;
        localView = View.inflate(paramView, i, null);
        paramView = new b();
        paramView.lZL = ((ViewGroup)localView.findViewById(R.h.bLV));
        paramView.lZK = ((TextView)localView.findViewById(R.h.bEL));
        paramView.lTp = ((ImageView)localView.findViewById(R.h.bEd));
        paramView.lTq = ((TextView)localView.findViewById(R.h.bEK));
        paramView.lZM = ((TextView)localView.findViewById(R.h.bQI));
        paramView.lZN = ((TextView)localView.findViewById(R.h.bEf));
        paramView.lZO = ((TextView)localView.findViewById(R.h.bCQ));
        paramView.lZP = ((Button)localView.findViewById(R.h.bDT));
        paramView.lZQ = ((TextProgressBar)localView.findViewById(R.h.bDU));
        paramView.lZT = ((LinearLayout)localView.findViewById(R.h.bCD));
        paramView.lZR = ((GameListSocialView)localView.findViewById(R.h.bEX));
        paramView.lZS = ((ViewGroup)localView.findViewById(R.h.bsR));
        localView.setTag(paramView);
        paramViewGroup = paramView;
        label264:
        switch (localc.type)
        {
        }
        break;
      }
    }
    for (;;)
    {
      GMTrace.o(12721693130752L, 94784);
      return localView;
      i = this.lZA;
      break;
      i = R.i.bCD;
      break;
      paramViewGroup = (b)paramView.getTag();
      localView = paramView;
      break label264;
      a(localc, paramViewGroup, paramInt);
      if ((this.lVF == 2) && (!localc.lLO))
      {
        ai.a(this.mContext, 1004, localc.position, localc.field_appId, this.lNQ, localc.lLN);
        localc.lLO = true;
        continue;
        a(localc, paramViewGroup);
      }
    }
  }
  
  public int getViewTypeCount()
  {
    GMTrace.i(12721558913024L, 94783);
    GMTrace.o(12721558913024L, 94783);
    return 2;
  }
  
  public void oJ(int paramInt)
  {
    GMTrace.i(12720753606656L, 94777);
    this.lNQ = paramInt;
    GMTrace.o(12720753606656L, 94777);
  }
  
  public void oN(int paramInt)
  {
    GMTrace.i(12720887824384L, 94778);
    this.lVF = paramInt;
    GMTrace.o(12720887824384L, 94778);
  }
  
  public void refresh()
  {
    GMTrace.i(12721022042112L, 94779);
    notifyDataSetChanged();
    GMTrace.o(12721022042112L, 94779);
  }
  
  public void x(View paramView, int paramInt)
  {
    GMTrace.i(12722364219392L, 94789);
    paramView = (b)paramView.getTag();
    c localc = (c)this.lOh.get(paramInt);
    if (paramView != null)
    {
      this.lWN.a(paramView.lZQ, paramView.lZP, localc, (m)this.lZE.get(localc.field_appId));
      GMTrace.o(12722364219392L, 94789);
      return;
    }
    w.e("MicroMsg.GameListAdapter", "holder should not be null, %d", new Object[] { Integer.valueOf(paramInt) });
    GMTrace.o(12722364219392L, 94789);
  }
  
  public void zQ(String paramString)
  {
    GMTrace.i(12722901090304L, 94793);
    if (bg.nm(paramString))
    {
      GMTrace.o(12722901090304L, 94793);
      return;
    }
    if (!this.lZE.containsKey(paramString))
    {
      GMTrace.o(12722901090304L, 94793);
      return;
    }
    paramString = (m)this.lZE.get(paramString);
    if (paramString == null)
    {
      GMTrace.o(12722901090304L, 94793);
      return;
    }
    paramString.aFp();
    GMTrace.o(12722901090304L, 94793);
  }
  
  public void zR(String paramString)
  {
    GMTrace.i(12722766872576L, 94792);
    if (bg.nm(paramString))
    {
      GMTrace.o(12722766872576L, 94792);
      return;
    }
    if (!this.lZE.containsKey(paramString))
    {
      GMTrace.o(12722766872576L, 94792);
      return;
    }
    paramString = (m)this.lZE.get(paramString);
    if (paramString == null)
    {
      GMTrace.o(12722766872576L, 94792);
      return;
    }
    paramString.aFo();
    GMTrace.o(12722766872576L, 94792);
  }
  
  public void zS(String paramString)
  {
    GMTrace.i(12722632654848L, 94791);
    int i = 0;
    if (i < this.lOh.size()) {
      if (!((c)this.lOh.get(i)).field_appId.equals(paramString)) {}
    }
    for (paramString = (c)this.lOh.get(i);; paramString = null)
    {
      if (paramString != null) {
        break label81;
      }
      GMTrace.o(12722632654848L, 94791);
      return;
      i += 1;
      break;
    }
    label81:
    if (!this.lZE.containsKey(paramString.field_appId))
    {
      w.e("MicroMsg.GameListAdapter", "No DownloadInfo found");
      GMTrace.o(12722632654848L, 94791);
      return;
    }
    m localm = (m)this.lZE.get(paramString.field_appId);
    this.lWN.a(paramString, localm);
    GMTrace.o(12722632654848L, 94791);
  }
  
  public static abstract interface a
  {
    public abstract void oL(int paramInt);
  }
  
  protected static final class b
  {
    public ImageView lTp;
    public TextView lTq;
    public TextView lZK;
    public ViewGroup lZL;
    public TextView lZM;
    public TextView lZN;
    public TextView lZO;
    public Button lZP;
    public TextProgressBar lZQ;
    public GameListSocialView lZR;
    public ViewGroup lZS;
    public LinearLayout lZT;
    
    protected b()
    {
      GMTrace.i(12699278770176L, 94617);
      GMTrace.o(12699278770176L, 94617);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\game\ui\l.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */