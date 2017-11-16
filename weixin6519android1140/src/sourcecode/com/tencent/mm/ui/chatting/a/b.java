package com.tencent.mm.ui.chatting.a;

import android.content.Context;
import android.content.res.Resources;
import android.support.v7.widget.RecyclerView.a;
import android.support.v7.widget.RecyclerView.t;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLongClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.tencent.gmtrace.GMTrace;
import com.tencent.mm.R.e;
import com.tencent.mm.R.h;
import com.tencent.mm.R.i;
import com.tencent.mm.az.e;
import com.tencent.mm.plugin.favorite.b.u;
import com.tencent.mm.pluginsdk.ui.a.b;
import com.tencent.mm.pluginsdk.ui.d.h;
import com.tencent.mm.sdk.platformtools.bg;
import com.tencent.mm.sdk.platformtools.w;
import com.tencent.mm.ui.gridviewheaders.a;
import java.util.Date;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public final class b
  extends RecyclerView.a
{
  public static e wIa;
  public static f wIb;
  public Context mContext;
  public String wIc;
  
  static
  {
    GMTrace.i(16443282292736L, 122512);
    wIb = null;
    GMTrace.o(16443282292736L, 122512);
  }
  
  public b(Context paramContext, f paramf)
  {
    GMTrace.i(16442476986368L, 122506);
    wIb = paramf;
    this.mContext = paramContext;
    GMTrace.o(16442476986368L, 122506);
  }
  
  private static long fd(long paramLong)
  {
    GMTrace.i(16443148075008L, 122511);
    Date localDate = new Date(paramLong);
    paramLong = a.chJ().a(localDate);
    GMTrace.o(16443148075008L, 122511);
    return paramLong;
  }
  
  public final RecyclerView.t a(ViewGroup paramViewGroup, int paramInt)
  {
    GMTrace.i(16442745421824L, 122508);
    if (paramInt == Integer.MAX_VALUE)
    {
      paramViewGroup = new d(LayoutInflater.from(paramViewGroup.getContext()).inflate(R.i.cye, paramViewGroup, false));
      GMTrace.o(16442745421824L, 122508);
      return paramViewGroup;
    }
    paramViewGroup = wIb.m(paramViewGroup);
    GMTrace.o(16442745421824L, 122508);
    return paramViewGroup;
  }
  
  public final void a(RecyclerView.t paramt, int paramInt)
  {
    GMTrace.i(16442879639552L, 122509);
    int i = getItemViewType(paramInt);
    b localb = wIb.CV(paramInt);
    Object localObject;
    if (i == Integer.MAX_VALUE)
    {
      localObject = wIb.CV(paramInt + 1);
      if ((paramInt == getItemCount() - 1) || (fd(((b)localObject).timestamp) != fd(localb.timestamp)))
      {
        ((d)paramt).hqj.setVisibility(8);
        GMTrace.o(16442879639552L, 122509);
        return;
      }
      ((d)paramt).hqj.setVisibility(0);
      paramt = ((d)paramt).hqj;
      localObject = new Date(localb.timestamp);
      paramt.setText(a.chJ().a((Date)localObject, this.mContext));
      GMTrace.o(16442879639552L, 122509);
      return;
    }
    a locala = (a)paramt;
    locala.lFh.setTag(Integer.valueOf(paramInt));
    if (i != 33) {
      a.b.n(locala.hqG, localb.username);
    }
    TextView localTextView = locala.jUm;
    Context localContext = this.mContext;
    if (bg.nm(this.wIc)) {
      if (bg.nm(localb.aDo)) {
        if (bg.nm(localb.iGn)) {
          localObject = localb.eCQ;
        }
      }
    }
    for (;;)
    {
      localTextView.setText(h.b(localContext, (CharSequence)localObject, locala.jUm.getTextSize()));
      locala.jRw.setText(u.d(this.mContext, localb.timestamp));
      locala.hqH.setText(localb.title);
      wIb.a((a)paramt, paramInt);
      if (!bg.nm(this.wIc))
      {
        a.d(locala.jUm, this.wIc);
        a.d(locala.hqH, this.wIc);
      }
      GMTrace.o(16442879639552L, 122509);
      return;
      localObject = localb.iGn;
      continue;
      localObject = localb.aDo;
      continue;
      if (bg.nm(localb.aDo))
      {
        if (!bg.nm(localb.iGn))
        {
          if ((!bg.nm(localb.eCQ)) && (localb.eCQ.contains(this.wIc))) {
            localObject = localb.iGn + "(" + localb.eCQ + ")";
          } else {
            localObject = localb.iGn;
          }
        }
        else {
          localObject = localb.eCQ;
        }
      }
      else if ((!bg.nm(localb.iGn)) && (localb.iGn.contains(this.wIc))) {
        localObject = localb.aDo + "(" + localb.iGn + ")";
      } else if ((!bg.nm(localb.eCQ)) && (localb.eCQ.contains(this.wIc))) {
        localObject = localb.aDo + "(" + localb.eCQ + ")";
      } else {
        localObject = localb.aDo;
      }
    }
  }
  
  public final int getItemCount()
  {
    GMTrace.i(16443013857280L, 122510);
    int i;
    if (wIb == null)
    {
      i = 0;
      if (wIb != null) {
        break label73;
      }
    }
    label73:
    for (boolean bool = true;; bool = false)
    {
      w.i("MicroMsg.MediaHistoryListAdapter", " null == mIDetail?%s getItemCount:%s", new Object[] { Boolean.valueOf(bool), Integer.valueOf(i) });
      GMTrace.o(16443013857280L, 122510);
      return i;
      i = wIb.getCount();
      break;
    }
  }
  
  public final int getItemViewType(int paramInt)
  {
    GMTrace.i(16442611204096L, 122507);
    paramInt = wIb.CV(paramInt).getType();
    GMTrace.o(16442611204096L, 122507);
    return paramInt;
  }
  
  public static class a
    extends RecyclerView.t
  {
    public ImageView hqG;
    public TextView hqH;
    public TextView jRw;
    public TextView jUm;
    public View lFh;
    
    public a(View paramView)
    {
      super();
      GMTrace.i(16445966647296L, 122532);
      this.lFh = paramView;
      this.hqG = ((ImageView)paramView.findViewById(R.h.byx));
      this.jUm = ((TextView)paramView.findViewById(R.h.bzh));
      this.jRw = ((TextView)paramView.findViewById(R.h.bzv));
      this.hqH = ((TextView)paramView.findViewById(R.h.bzw));
      this.hqH.setSingleLine(false);
      this.hqH.setMaxLines(2);
      paramView.setOnClickListener(new View.OnClickListener()
      {
        public final void onClick(View paramAnonymousView)
        {
          GMTrace.i(16446369300480L, 122535);
          if (b.wIa != null)
          {
            int i = ((Integer)paramAnonymousView.getTag()).intValue();
            paramAnonymousView = b.wIb.CV(i);
            b.wIa.a(i, paramAnonymousView);
          }
          GMTrace.o(16446369300480L, 122535);
        }
      });
      paramView.setOnLongClickListener(new View.OnLongClickListener()
      {
        public final boolean onLongClick(View paramAnonymousView)
        {
          GMTrace.i(16445832429568L, 122531);
          if (b.wIa != null)
          {
            int i = ((Integer)paramAnonymousView.getTag()).intValue();
            b.b localb = b.wIb.CV(i);
            b.wIa.a(paramAnonymousView, i, localb);
          }
          GMTrace.o(16445832429568L, 122531);
          return true;
        }
      });
      GMTrace.o(16445966647296L, 122532);
    }
    
    public static void d(TextView paramTextView, String paramString)
    {
      GMTrace.i(16446100865024L, 122533);
      if (!bg.nm(paramString))
      {
        paramTextView.getContext();
        paramTextView.setText(e.a(paramTextView.getText(), paramString));
      }
      GMTrace.o(16446100865024L, 122533);
    }
  }
  
  public static abstract class b
  {
    public String aDo;
    public String eCQ;
    public long eDr;
    public String iGn;
    public long timestamp;
    public String title;
    public int type;
    public String username;
    Pattern wIe;
    
    public b()
    {
      GMTrace.i(16444490252288L, 122521);
      this.wIe = Pattern.compile("[_a-zA-Z0-9]+");
      GMTrace.o(16444490252288L, 122521);
    }
    
    public b(long paramLong1, int paramInt, String paramString1, long paramLong2, String paramString2, String paramString3, String paramString4, String paramString5)
    {
      GMTrace.i(16444624470016L, 122522);
      this.wIe = Pattern.compile("[_a-zA-Z0-9]+");
      this.timestamp = paramLong1;
      this.type = paramInt;
      this.title = paramString1;
      this.eDr = paramLong2;
      this.username = paramString2;
      this.eCQ = paramString3;
      this.aDo = paramString4;
      this.iGn = paramString5;
      GMTrace.o(16444624470016L, 122522);
    }
    
    public static boolean Wo(String paramString)
    {
      GMTrace.i(16445161340928L, 122526);
      paramString = paramString.toCharArray();
      int i = 0;
      while (i < paramString.length)
      {
        if ((paramString[i] >= '一') && (paramString[i] <= 40891))
        {
          GMTrace.o(16445161340928L, 122526);
          return true;
        }
        i += 1;
      }
      GMTrace.o(16445161340928L, 122526);
      return false;
    }
    
    public boolean Wn(String paramString)
    {
      GMTrace.i(16444892905472L, 122524);
      if (!Wo(paramString))
      {
        if ((!bg.nm(this.title)) && (fo(paramString, this.title.toLowerCase())))
        {
          GMTrace.o(16444892905472L, 122524);
          return true;
        }
        if ((!bg.nm(this.eCQ)) && (fo(paramString, this.eCQ.toLowerCase())))
        {
          GMTrace.o(16444892905472L, 122524);
          return true;
        }
        if ((!bg.nm(this.iGn)) && (fo(paramString, this.iGn.toLowerCase())))
        {
          GMTrace.o(16444892905472L, 122524);
          return true;
        }
        if ((!bg.nm(this.aDo)) && (fo(paramString, this.aDo.toLowerCase())))
        {
          GMTrace.o(16444892905472L, 122524);
          return true;
        }
      }
      else
      {
        if ((!bg.nm(this.title)) && (this.title.toLowerCase().contains(paramString)))
        {
          GMTrace.o(16444892905472L, 122524);
          return true;
        }
        if ((!bg.nm(this.eCQ)) && (this.eCQ.toLowerCase().contains(paramString)))
        {
          GMTrace.o(16444892905472L, 122524);
          return true;
        }
        if ((!bg.nm(this.iGn)) && (this.iGn.toLowerCase().contains(paramString)))
        {
          GMTrace.o(16444892905472L, 122524);
          return true;
        }
        if ((!bg.nm(this.aDo)) && (this.aDo.toLowerCase().contains(paramString)))
        {
          GMTrace.o(16444892905472L, 122524);
          return true;
        }
      }
      GMTrace.o(16444892905472L, 122524);
      return false;
    }
    
    public boolean equals(Object paramObject)
    {
      GMTrace.i(16445295558656L, 122527);
      if ((paramObject != null) && ((paramObject instanceof b)))
      {
        if (this.eDr == ((b)paramObject).eDr)
        {
          GMTrace.o(16445295558656L, 122527);
          return true;
        }
        GMTrace.o(16445295558656L, 122527);
        return false;
      }
      boolean bool = super.equals(paramObject);
      GMTrace.o(16445295558656L, 122527);
      return bool;
    }
    
    public final boolean fo(String paramString1, String paramString2)
    {
      GMTrace.i(16445027123200L, 122525);
      boolean bool2;
      if (!bg.nm(paramString2))
      {
        paramString2 = this.wIe.matcher(paramString2);
        bool1 = false;
        do
        {
          if (!paramString2.find()) {
            break;
          }
          String str = paramString2.group();
          bool2 = str.startsWith(paramString1);
          w.i("MicroMsg.MediaHistoryListAdapter", "[isContains] search:%s group:%s", new Object[] { paramString1, str });
          bool1 = bool2;
        } while (!bool2);
      }
      for (boolean bool1 = bool2;; bool1 = false)
      {
        GMTrace.o(16445027123200L, 122525);
        return bool1;
      }
    }
    
    public int getType()
    {
      GMTrace.i(16444758687744L, 122523);
      int i = this.type;
      GMTrace.o(16444758687744L, 122523);
      return i;
    }
  }
  
  public static final class c
    extends b.b
  {
    public c(long paramLong)
    {
      GMTrace.i(16444087599104L, 122518);
      this.timestamp = paramLong;
      GMTrace.o(16444087599104L, 122518);
    }
    
    public final boolean Wn(String paramString)
    {
      GMTrace.i(16444221816832L, 122519);
      GMTrace.o(16444221816832L, 122519);
      return false;
    }
    
    public final int getType()
    {
      GMTrace.i(16444356034560L, 122520);
      GMTrace.o(16444356034560L, 122520);
      return Integer.MAX_VALUE;
    }
  }
  
  public final class d
    extends RecyclerView.t
  {
    TextView hqj;
    
    public d(View paramView)
    {
      super();
      GMTrace.i(16443953381376L, 122517);
      this.hqj = ((TextView)paramView.findViewById(R.h.bsV));
      this.hqj.setTextColor(b.this.mContext.getResources().getColor(R.e.aNG));
      paramView.findViewById(R.h.content).setBackgroundColor(b.this.mContext.getResources().getColor(R.e.aNF));
      GMTrace.o(16443953381376L, 122517);
    }
  }
  
  public static abstract interface e
  {
    public abstract void a(int paramInt, b.b paramb);
    
    public abstract void a(View paramView, int paramInt, b.b paramb);
  }
  
  public static abstract interface f
  {
    public abstract b.b CV(int paramInt);
    
    public abstract void a(b.a parama, int paramInt);
    
    public abstract int getCount();
    
    public abstract RecyclerView.t m(ViewGroup paramViewGroup);
  }
}


/* Location:              D:\tools\apktool\weixin6519android1140\jar\classes3-dex2jar.jar!\com\tencent\mm\ui\chatting\a\b.class
 * Java compiler version: 6 (50.0)
 * JD-Core Version:       0.7.1
 */