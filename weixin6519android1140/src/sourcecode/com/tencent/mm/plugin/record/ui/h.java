package com.tencent.mm.plugin.record.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Looper;
import android.os.Message;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.ListView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.h;
import com.tencent.mm.ac.i;
import com.tencent.mm.plugin.record.ui.b.d;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.protocal.c.th;
import com.tencent.mm.protocal.c.ti;
import com.tencent.mm.protocal.c.tj;
import com.tencent.mm.sdk.platformtools.ae;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.y.q;
import com.tencent.mm.y.s;
import java.util.LinkedList;
import java.util.List;

public abstract class h
  extends BaseAdapter
{
  ListView Ev;
  protected Context context;
  private Runnable ldG;
  protected List<th> ohD;
  protected ae ohR;
  SparseArray<b> ohS;
  boolean ohT;
  private boolean ohU;
  protected a ohV;
  protected a ohW;
  private int padding;
  
  public h(Context paramContext, a parama)
  {
    GMTrace.i(7528406581248L, 56091);
    this.ohR = null;
    this.ohS = new SparseArray();
    this.ohT = false;
    this.ohU = false;
    this.padding = com.tencent.mm.br.a.fromDPToPix(this.context, 35);
    this.ohD = new LinkedList();
    this.ldG = new Runnable()
    {
      public final void run()
      {
        GMTrace.i(7554713255936L, 56287);
        w.d("MicroMsg.RecordMsgBaseAdapter", "refresh adapter");
        h.this.notifyDataSetChanged();
        GMTrace.o(7554713255936L, 56287);
      }
    };
    this.context = paramContext;
    this.ohR = new ae(Looper.getMainLooper())
    {
      public final void handleMessage(Message paramAnonymousMessage)
      {
        GMTrace.i(7530956718080L, 56110);
        if (paramAnonymousMessage.what == 1)
        {
          w.d("MicroMsg.RecordMsgBaseAdapter", "do play music");
          h.this.notifyDataSetChanged();
        }
        GMTrace.o(7530956718080L, 56110);
      }
    };
    this.ohW = parama;
    GMTrace.o(7528406581248L, 56091);
  }
  
  private static void Fy(String paramString)
  {
    GMTrace.i(7530017193984L, 56103);
    if (!s.fC(paramString))
    {
      com.tencent.mm.ac.h localh = new com.tencent.mm.ac.h();
      localh.username = paramString;
      com.tencent.mm.ac.n.Di().a(localh);
    }
    GMTrace.o(7530017193984L, 56103);
  }
  
  private static int l(th paramth)
  {
    GMTrace.i(7529211887616L, 56097);
    switch (paramth.aGU)
    {
    default: 
      GMTrace.o(7529211887616L, 56097);
      return 3;
    case 2: 
      GMTrace.o(7529211887616L, 56097);
      return 1;
    case 1: 
      GMTrace.o(7529211887616L, 56097);
      return 0;
    }
    GMTrace.o(7529211887616L, 56097);
    return 2;
  }
  
  private th tj(int paramInt)
  {
    GMTrace.i(7529614540800L, 56100);
    if (this.ohD == null)
    {
      GMTrace.o(7529614540800L, 56100);
      return null;
    }
    if ((paramInt < 0) || (paramInt >= this.ohD.size()))
    {
      GMTrace.o(7529614540800L, 56100);
      return null;
    }
    th localth = (th)this.ohD.get(paramInt);
    GMTrace.o(7529614540800L, 56100);
    return localth;
  }
  
  public abstract void a(a parama);
  
  public final void baW()
  {
    GMTrace.i(7528540798976L, 56092);
    this.ohS.put(0, new d(this.context));
    this.ohS.put(1, new com.tencent.mm.plugin.record.ui.b.a(this.ohW, this.Ev));
    this.ohS.put(2, new com.tencent.mm.plugin.record.ui.b.e());
    this.ohS.put(3, new com.tencent.mm.plugin.record.ui.b.b(this.ohW, this.ohR));
    this.ohS.put(4, new com.tencent.mm.plugin.record.ui.b.c(this.ohW));
    GMTrace.o(7528540798976L, 56092);
  }
  
  protected final void baX()
  {
    GMTrace.i(7530151411712L, 56104);
    this.ohR.post(this.ldG);
    GMTrace.o(7530151411712L, 56104);
  }
  
  public abstract void d(com.tencent.mm.plugin.record.ui.a.b paramb);
  
  public final void destroy()
  {
    GMTrace.i(7528943452160L, 56095);
    int i = 0;
    while (i < this.ohS.size())
    {
      b localb = (b)this.ohS.valueAt(i);
      if (localb != null) {
        localb.destroy();
      }
      i += 1;
    }
    if (this.ohW != null)
    {
      this.ohW.baO();
      this.ohW = null;
    }
    GMTrace.o(7528943452160L, 56095);
  }
  
  public int getCount()
  {
    GMTrace.i(7529480323072L, 56099);
    if (this.ohD == null)
    {
      GMTrace.o(7529480323072L, 56099);
      return 0;
    }
    int i = this.ohD.size();
    GMTrace.o(7529480323072L, 56099);
    return i;
  }
  
  public long getItemId(int paramInt)
  {
    GMTrace.i(7529748758528L, 56101);
    long l = paramInt;
    GMTrace.o(7529748758528L, 56101);
    return l;
  }
  
  public int getItemViewType(int paramInt)
  {
    GMTrace.i(7529077669888L, 56096);
    paramInt = l(tj(paramInt));
    GMTrace.o(7529077669888L, 56096);
    return paramInt;
  }
  
  public View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(7529882976256L, 56102);
    Object localObject1 = tj(paramInt);
    Object localObject2 = (b)this.ohS.get(l((th)localObject1));
    paramViewGroup = paramView;
    if (paramView == null) {
      paramViewGroup = ((b)localObject2).cZ(this.context);
    }
    Object localObject3;
    switch (((th)localObject1).aGU)
    {
    default: 
      paramView = new com.tencent.mm.plugin.record.ui.a.b();
      paramView.eIc = ((th)localObject1);
      d(paramView);
      ((b)localObject2).a(paramViewGroup, paramInt, paramView);
      localObject2 = (ImageView)paramViewGroup.findViewById(R.h.bXI);
      paramView = (TextView)paramViewGroup.findViewById(R.h.bXM);
      paramView.setText(com.tencent.mm.pluginsdk.ui.d.h.b(paramView.getContext(), ((th)localObject1).ukp, paramView.getTextSize()));
      paramView = (TextView)paramViewGroup.findViewById(R.h.bXL);
      w.d("MicroMsg.RecordMsgBaseAdapter", "datasrctime %s", new Object[] { ((th)localObject1).ukr });
      if (((th)localObject1).ukr != null)
      {
        if (this.ohT)
        {
          localObject3 = ((th)localObject1).ukr;
          paramView.setText(((String)localObject3).substring(((String)localObject3).indexOf("-") + 1));
        }
      }
      else
      {
        label225:
        if (paramInt != 0) {
          break label523;
        }
        if (((th)localObject1).ukn == null) {
          break label488;
        }
        paramView = ((th)localObject1).ukn.ukF;
        ((ImageView)localObject2).setVisibility(0);
        if (!paramView.ulc) {
          break label400;
        }
        Fy(paramView.ulb);
        if (!com.tencent.mm.af.a.e.je(paramView.ulb)) {
          break label388;
        }
        com.tencent.mm.ao.n.Jd().a(com.tencent.mm.af.a.e.jh(paramView.ulb), (ImageView)localObject2);
        label291:
        if (paramInt != getCount() - 1) {
          break label818;
        }
        paramViewGroup.findViewById(R.h.bXK).setVisibility(8);
      }
      break;
    }
    for (;;)
    {
      GMTrace.o(7529882976256L, 56102);
      return paramViewGroup;
      paramView = new com.tencent.mm.plugin.record.ui.a.a();
      break;
      paramView = new com.tencent.mm.plugin.record.ui.a.c();
      break;
      localObject3 = ((th)localObject1).ukr.split(" ");
      if (localObject3.length < 2)
      {
        paramView.setText(((th)localObject1).ukr);
        break label225;
      }
      paramView.setText(localObject3[1]);
      break label225;
      label388:
      a.b.a((ImageView)localObject2, paramView.ulb);
      break label291;
      label400:
      if ((paramView.ukX) && ((!q.zE().equals(paramView.eMI)) || (!paramView.eMI.equals(paramView.toUser))))
      {
        Fy(paramView.eMI);
        a.b.a((ImageView)localObject2, paramView.eMI);
        break label291;
      }
      ((ImageView)localObject2).setVisibility(8);
      paramViewGroup.setPadding(this.padding, paramViewGroup.getPaddingTop(), this.padding, paramViewGroup.getPaddingBottom());
      this.ohU = true;
      break label291;
      label488:
      ((ImageView)localObject2).setVisibility(8);
      paramViewGroup.setPadding(this.padding, paramViewGroup.getPaddingTop(), this.padding, paramViewGroup.getPaddingBottom());
      this.ohU = true;
      break label291;
      label523:
      if ((paramInt > 0) && (!this.ohU))
      {
        paramView = "";
        localObject3 = ((th)localObject1).ukn.ukF;
        if (tj(paramInt - 1).ukn.ukF.ulc) {
          paramView = tj(paramInt - 1).ukn.ukF.ulb;
        }
        for (;;)
        {
          ((ImageView)localObject2).setVisibility(0);
          if (!((th)localObject1).ukn.ukF.ulc) {
            break label719;
          }
          localObject1 = ((th)localObject1).ukn.ukF.ulb;
          if (paramView.equals(localObject1)) {
            break label710;
          }
          Fy((String)localObject1);
          if (!com.tencent.mm.af.a.e.je(((tj)localObject3).ulb)) {
            break label700;
          }
          com.tencent.mm.ao.n.Jd().a(com.tencent.mm.af.a.e.jh(((tj)localObject3).ulb), (ImageView)localObject2);
          break;
          if (tj(paramInt - 1).ukn.ukF.ukX) {
            paramView = tj(paramInt - 1).ukn.ukF.eMI;
          }
        }
        label700:
        a.b.a((ImageView)localObject2, (String)localObject1);
        break label291;
        label710:
        ((ImageView)localObject2).setVisibility(4);
        break label291;
        label719:
        if (((th)localObject1).ukn.ukF.ukX)
        {
          localObject1 = ((th)localObject1).ukn.ukF.eMI;
          if (!paramView.equals(localObject1))
          {
            Fy((String)localObject1);
            a.b.a((ImageView)localObject2, (String)localObject1);
            break label291;
          }
          ((ImageView)localObject2).setVisibility(4);
          break label291;
        }
        ((ImageView)localObject2).setVisibility(4);
        break label291;
      }
      ((ImageView)localObject2).setVisibility(8);
      paramViewGroup.setPadding(this.padding, paramViewGroup.getPaddingTop(), this.padding, paramViewGroup.getPaddingBottom());
      break label291;
      label818:
      paramViewGroup.findViewById(R.h.bXK).setVisibility(0);
    }
  }
  
  public int getViewTypeCount()
  {
    GMTrace.i(7529346105344L, 56098);
    GMTrace.o(7529346105344L, 56098);
    return 5;
  }
  
  public static abstract interface a
  {
    public abstract Bitmap a(b paramb);
    
    public abstract Bitmap a(c paramc);
    
    public abstract void a(a parama);
    
    public abstract void baO();
    
    public static final class a
    {
      public th eIc;
      public ImageView eId;
      public int eIe;
      public int height;
      public long ohY;
      public int width;
      
      public a()
      {
        GMTrace.i(7522366783488L, 56046);
        GMTrace.o(7522366783488L, 56046);
      }
    }
    
    public static final class b
    {
      public th eIc;
      public boolean eIf;
      public boolean eIg;
      public int maxWidth;
      public long ohY;
      
      public b()
      {
        GMTrace.i(7521695694848L, 56041);
        GMTrace.o(7521695694848L, 56041);
      }
    }
    
    public static final class c
    {
      public th eIc;
      public long ohY;
      
      public c()
      {
        GMTrace.i(7535385903104L, 56143);
        GMTrace.o(7535385903104L, 56143);
      }
    }
  }
  
  public static abstract interface b
  {
    public abstract void a(View paramView, int paramInt, com.tencent.mm.plugin.record.ui.a.b paramb);
    
    public abstract View cZ(Context paramContext);
    
    public abstract void destroy();
    
    public abstract void pause();
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes2-dex2jar.jar!\com\tencent\mm\plugin\record\ui\h.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */