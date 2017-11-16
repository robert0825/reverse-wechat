package com.tencent.mm.ui.contact;

import android.content.Context;
import android.database.Cursor;
import android.graphics.Bitmap;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.f;
import com.tencent.mm.R.g;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.R.l;
import com.tencent.mm.g.b.af;
import com.tencent.mm.platformtools.t;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.storage.ar;
import com.tencent.mm.storage.x;
import com.tencent.mm.ui.MMActivity;
import com.tencent.mm.ui.applet.b.a;
import com.tencent.mm.ui.applet.b.b;
import com.tencent.mm.ui.base.MMSlideDelView;
import com.tencent.mm.ui.base.MMSlideDelView.c;
import com.tencent.mm.ui.base.MMSlideDelView.d;
import com.tencent.mm.ui.base.MMSlideDelView.e;
import com.tencent.mm.ui.base.MMSlideDelView.f;
import com.tencent.mm.ui.base.MaskLayout;
import com.tencent.mm.ui.o;
import com.tencent.mm.y.at;
import com.tencent.mm.y.c;
import com.tencent.mm.y.r;
import com.tencent.mm.y.s;
import java.util.List;

public final class d
  extends o<x>
{
  protected MMActivity ezR;
  com.tencent.mm.ui.applet.b gCY;
  private b.b gCZ;
  protected List<String> iVA;
  protected MMSlideDelView.f jpQ;
  protected MMSlideDelView.c jpR;
  protected MMSlideDelView.d jpT;
  protected MMSlideDelView.e nuM;
  com.tencent.mm.pluginsdk.ui.d txr;
  protected String wPl;
  
  public d(Context paramContext, String paramString)
  {
    super(paramContext, new x());
    GMTrace.i(1830864027648L, 13641);
    this.wPl = null;
    this.iVA = null;
    this.jpT = MMSlideDelView.cah();
    this.gCY = null;
    this.gCZ = null;
    this.ezR = ((MMActivity)paramContext);
    this.wPl = paramString;
    this.gCY = new com.tencent.mm.ui.applet.b(new b.a()
    {
      public final Bitmap jP(String paramAnonymousString)
      {
        GMTrace.i(1813818376192L, 13514);
        paramAnonymousString = com.tencent.mm.ac.b.a(paramAnonymousString, false, -1);
        GMTrace.o(1813818376192L, 13514);
        return paramAnonymousString;
      }
    });
    GMTrace.o(1830864027648L, 13641);
  }
  
  private String X(x paramx)
  {
    GMTrace.i(1832071987200L, 13650);
    if (paramx.field_showHead == 31)
    {
      GMTrace.o(1832071987200L, 13650);
      return "";
    }
    if (paramx.field_showHead == 43)
    {
      paramx = this.ezR.getString(R.l.dTd);
      GMTrace.o(1832071987200L, 13650);
      return paramx;
    }
    char c = (char)paramx.field_showHead;
    GMTrace.o(1832071987200L, 13650);
    return String.valueOf(c);
  }
  
  private void a(a parama, int paramInt1, int paramInt2)
  {
    GMTrace.i(1831937769472L, 13649);
    x localx = (x)getItem(paramInt1 + 1);
    if ((localx == null) || ((localx.field_showHead != paramInt2) && (!t.nm(X(localx))))) {
      parama.wQT.setBackgroundResource(0);
    }
    GMTrace.o(1831937769472L, 13649);
  }
  
  public final void QF()
  {
    try
    {
      GMTrace.i(1831669334016L, 13647);
      at.AR();
      Cursor localCursor = c.yK().b(this.wPl, "", this.iVA);
      aJe();
      setCursor(localCursor);
      notifyDataSetChanged();
      GMTrace.o(1831669334016L, 13647);
      return;
    }
    finally
    {
      localObject = finally;
      throw ((Throwable)localObject);
    }
  }
  
  protected final void QG()
  {
    GMTrace.i(1831535116288L, 13646);
    QF();
    GMTrace.o(1831535116288L, 13646);
  }
  
  public final void a(MMSlideDelView.c paramc)
  {
    GMTrace.i(1831266680832L, 13644);
    this.jpR = paramc;
    GMTrace.o(1831266680832L, 13644);
  }
  
  public final void a(MMSlideDelView.e parame)
  {
    GMTrace.i(1831132463104L, 13643);
    this.nuM = parame;
    GMTrace.o(1831132463104L, 13643);
  }
  
  public final void a(MMSlideDelView.f paramf)
  {
    GMTrace.i(1830998245376L, 13642);
    this.jpQ = paramf;
    GMTrace.o(1830998245376L, 13642);
  }
  
  public final int getCount()
  {
    GMTrace.i(1831400898560L, 13645);
    int i = getCursor().getCount();
    GMTrace.o(1831400898560L, 13645);
    return i;
  }
  
  public final View getView(int paramInt, View paramView, ViewGroup paramViewGroup)
  {
    GMTrace.i(1831803551744L, 13648);
    if (this.gCZ == null) {
      this.gCZ = new b.b()
      {
        public final int Hk()
        {
          GMTrace.i(1749125431296L, 13032);
          int i = d.this.getCount();
          GMTrace.o(1749125431296L, 13032);
          return i;
        }
        
        public final String gc(int paramAnonymousInt)
        {
          GMTrace.i(1748991213568L, 13031);
          if ((paramAnonymousInt < 0) || (paramAnonymousInt >= d.this.getCount()))
          {
            w.e("MicroMsg.ChatroomContactAdapter", "pos is invalid");
            GMTrace.o(1748991213568L, 13031);
            return null;
          }
          Object localObject = (x)d.this.getItem(paramAnonymousInt);
          if (localObject == null)
          {
            GMTrace.o(1748991213568L, 13031);
            return null;
          }
          localObject = ((af)localObject).field_username;
          GMTrace.o(1748991213568L, 13031);
          return (String)localObject;
        }
      };
    }
    if (this.gCY != null) {
      this.gCY.a(paramInt, this.gCZ);
    }
    Object localObject1;
    if (paramView == null)
    {
      paramView = View.inflate(this.ezR, R.i.crJ, null);
      paramViewGroup = new a();
      paramViewGroup.mpk = ((TextView)paramView.findViewById(R.h.brF));
      paramViewGroup.jRj = ((MaskLayout)paramView.findViewById(R.h.brD));
      paramViewGroup.jtr = ((TextView)paramView.findViewById(R.h.brH));
      paramViewGroup.wQT = ((ViewGroup)paramView.findViewById(R.h.brG));
      localObject1 = paramViewGroup.wQT.getLayoutParams();
      ((ViewGroup.LayoutParams)localObject1).height = ((int)(com.tencent.mm.br.a.W(this.ezR, R.f.aPH) * com.tencent.mm.br.a.ec(this.ezR)));
      paramViewGroup.wQT.setLayoutParams((ViewGroup.LayoutParams)localObject1);
      paramView.setTag(paramViewGroup);
    }
    for (;;)
    {
      localObject1 = (x)getItem(paramInt - 1);
      int i;
      label195:
      Object localObject2;
      if (localObject1 == null)
      {
        i = -1;
        localObject1 = (x)getItem(paramInt);
        if (paramInt != 0) {
          break label466;
        }
        localObject2 = X((x)localObject1);
        if (!t.nm((String)localObject2)) {
          break label435;
        }
        w.w("MicroMsg.ChatroomContactAdapter", "get display show head return null, user[%s] pos[%d]", new Object[] { ((af)localObject1).field_username, Integer.valueOf(paramInt) });
        paramViewGroup.mpk.setVisibility(8);
        label262:
        if (getItem(paramInt + 1) == null) {
          paramViewGroup.wQT.setBackgroundResource(0);
        }
        label280:
        localObject2 = paramViewGroup.jtr;
        MMActivity localMMActivity = this.ezR;
        if (s.gm(((af)localObject1).field_username)) {
          break label639;
        }
        paramInt = R.e.aOq;
        ((TextView)localObject2).setTextColor(com.tencent.mm.br.a.U(localMMActivity, paramInt));
        localObject2 = (ImageView)paramViewGroup.jRj.view;
        a.b.a((ImageView)localObject2, ((af)localObject1).field_username);
        localObject2 = (com.tencent.mm.pluginsdk.ui.a)((ImageView)localObject2).getDrawable();
        if (this.txr != null) {
          this.txr.a((com.tencent.mm.pluginsdk.ui.d.a)localObject2);
        }
        paramViewGroup.jRj.caA();
      }
      try
      {
        paramViewGroup.jtr.setText(h.c(this.ezR, r.fs(((af)localObject1).field_username), (int)paramViewGroup.jtr.getTextSize()));
        GMTrace.o(1831803551744L, 13648);
        return paramView;
        paramViewGroup = (a)paramView.getTag();
        continue;
        i = ((af)localObject1).field_showHead;
        break label195;
        label435:
        paramViewGroup.mpk.setVisibility(0);
        paramViewGroup.mpk.setText((CharSequence)localObject2);
        paramViewGroup.mpk.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
        break label262;
        label466:
        if ((paramInt > 0) && (((af)localObject1).field_showHead != i))
        {
          localObject2 = X((x)localObject1);
          paramViewGroup.wQT.setBackgroundResource(R.g.aVO);
          if (t.nm((String)localObject2))
          {
            w.w("MicroMsg.ChatroomContactAdapter", "get display show head return null, user[%s] pos[%d]", new Object[] { ((af)localObject1).field_username, Integer.valueOf(paramInt) });
            paramViewGroup.mpk.setVisibility(8);
          }
          for (;;)
          {
            a(paramViewGroup, paramInt, i);
            break;
            paramViewGroup.mpk.setVisibility(0);
            paramViewGroup.mpk.setText((CharSequence)localObject2);
            if (((af)localObject1).field_showHead == 32)
            {
              paramViewGroup.mpk.setCompoundDrawablesWithIntrinsicBounds(R.g.aXS, 0, 0, 0);
              paramViewGroup.mpk.setCompoundDrawablePadding(2);
            }
            else
            {
              paramViewGroup.mpk.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
            }
          }
        }
        paramViewGroup.mpk.setVisibility(8);
        a(paramViewGroup, paramInt, i);
        break label280;
        label639:
        paramInt = R.e.aOr;
      }
      catch (Exception localException)
      {
        for (;;)
        {
          paramViewGroup.jtr.setText("");
        }
      }
    }
  }
  
  protected static final class a
  {
    public MaskLayout jRj;
    public TextView jtr;
    public TextView mpk;
    public ViewGroup wQT;
    
    public a()
    {
      GMTrace.i(1746441076736L, 13012);
      GMTrace.o(1746441076736L, 13012);
    }
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes-dex2jar.jar!\com\tencent\mm\ui\contact\d.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */